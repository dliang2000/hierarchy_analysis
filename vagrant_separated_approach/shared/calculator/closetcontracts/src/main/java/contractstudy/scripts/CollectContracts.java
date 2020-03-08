package contractstudy.scripts;

import contractstudy.ContractElement;
import contractstudy.ConstraintCollector;
import contractstudy.ExtractionListener;
import contractstudy.Extractor;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import contractstudy.extractors.CommonsValidate2Extractor;
import contractstudy.extractors.CommonsValidate3Extractor;
import contractstudy.extractors.ConditionalRuntimeExceptionExtractor;
import contractstudy.extractors.FindBugsAnnotationExtractor;
import contractstudy.extractors.GuavaPreconditionsExtractor;
import contractstudy.extractors.IntellijExtractor;
import contractstudy.extractors.JSR303Extractor;
import contractstudy.extractors.JSR305ConcurrentExtractor;
import contractstudy.extractors.JSR305Extractor;
import contractstudy.extractors.JavaAssertExtractor;
import contractstudy.extractors.JetBrainsExtractor;
import contractstudy.extractors.SpringAssertExtractor;
import contractstudy.extractors.UnconditionalOperationNotSupportedExceptionExtractor;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Collect contracts from Java source code.
 * Uses multiple threads, the number of threads is set as a constant.
 * This produces intermediate JSON files used by other scripts.
 * @author jens dietrich
 */
public class CollectContracts implements Experiment{

	static Logger LOGGER = Logging.getLogger(CollectContracts.class);

	@SuppressWarnings("rawtypes")
	static Extractor[] EXTRACTORS = {
		new JSR303Extractor(),
        new JSR305Extractor(),
        new JSR305ConcurrentExtractor(),
        new FindBugsAnnotationExtractor(),
        new JetBrainsExtractor(),
        new IntellijExtractor(),
        // new LombokExtractor(),   at designtime (pre-compilation) lombok annotations are translated into CRE s !
		new JavaAssertExtractor(),
		new ConditionalRuntimeExceptionExtractor(),
        new UnconditionalOperationNotSupportedExceptionExtractor(),
		new GuavaPreconditionsExtractor(),
		new CommonsValidate2Extractor(),
		new CommonsValidate3Extractor(),
        new SpringAssertExtractor()
	};

	public static void main(String[] args) throws Exception {

        File DATA_FOLDER = new File(Preferences.getDataFolder());
        File OUTPUT_FOLDER = new File(Preferences.getOutputContractsFolder());
        int THREAD_COUNT = Preferences.getThreadCount();

		Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
		int total = zips.size();
		
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
		FileUtils.forceMkdir(OUTPUT_FOLDER);
		AtomicInteger progressCounter = new AtomicInteger(0);
		AtomicInteger constraintCounter = new AtomicInteger(0);
		AtomicInteger parsedCUCounter = new AtomicInteger(0);
		AtomicInteger parserFailedCUCounter = new AtomicInteger(0);
		AtomicInteger parsedProgramVersionCounter = new AtomicInteger(0);
		
		long startTime = System.currentTimeMillis();
		
		for (File zip:zips) {
			parsedProgramVersionCounter.incrementAndGet();
			ProgramVersion v = ProgramVersion.getOrCreateFromFile(zip);
			String programName = v.getName();
			String version = v.getVersion();
			
			Runnable task = new Runnable() {
				@Override
				public void run() {
		            try {
		            	ConstraintCollector consumer = new ConstraintCollector() {
							@Override
							public void extractionExceptionEncountered(String message, Throwable x) {
								super.extractionExceptionEncountered(message, x);
								parserFailedCUCounter.incrementAndGet();
							}           		
		            	};
		                findContractElements(new ZipFile(zip),consumer,programName,version,parsedCUCounter);
		                LOGGER.info("Processed " + progressCounter.incrementAndGet() + "/" + total + ": " + zip.getAbsolutePath() + " -- " +
		                		"\t" + consumer.getContractElements().size() + " contracts found");
		                constraintCounter.addAndGet(consumer.getContractElements().size());
		        		// output
		                File OUT = new File(OUTPUT_FOLDER,programName + "-" + version + ".json");
		        		try (PrintWriter out = new PrintWriter(OUT)) {
		        			List<JSONObject> encodedObjects = new ArrayList<>();
		        			for (ContractElement pc:consumer.getContractElements()) {
		        				encodedObjects.add(pc.toJSON());
		        			}
		        			JSONArray array = new JSONArray(encodedObjects);
		        			out.print(array);
		        		}
		            } catch (Exception e) {
		                // log errors and continue with next files
		                LOGGER.warn("Cannot parse file: " + zip, e);
		            }
				}
				
			};
			executor.submit(task);
		}
		executor.shutdown();
		executor.awaitTermination(1,TimeUnit.DAYS);
		long endTime = System.currentTimeMillis();
		
		LOGGER.info("Done!");
		LOGGER.info("\ttime: " + (endTime-startTime) + " ms");
		LOGGER.info("\tchecked CUs: " + parsedCUCounter.intValue());
		LOGGER.info("\tCUs where parsing failed: " + parserFailedCUCounter.intValue());
		LOGGER.info("\tprogram versions checked: " + parsedProgramVersionCounter.intValue());
		LOGGER.info("\tcontracts found: " + constraintCounter.intValue());
		LOGGER.info("\tthreads used: " + THREAD_COUNT);
	}

	@SuppressWarnings("unchecked")
	private static void findContractElements(ZipFile zip, ExtractionListener<ContractElement> consumer, String programName, String version, AtomicInteger parsedCUCounter) throws Exception {
		// LOGGER.info("Analysing " + zip.getName());
		Enumeration<? extends ZipEntry> en = zip.entries();
		while (en.hasMoreElements()) {
			ZipEntry e = en.nextElement();
			String name = e.getName();
			if (name.endsWith(".java")) {
				parsedCUCounter.incrementAndGet();
				for (Extractor<ContractElement> extractor:EXTRACTORS) {
					try (InputStream in = zip.getInputStream(e)) {
						LOGGER.trace("Analysing " + zip.getName() +" # " + e.getName() + " with extractor " + extractor);
						extractor.analyse(in, programName, version, e.getName(), consumer);
					}
				}
			}
		}
	}
	
    // for testing
	@SuppressWarnings("unchecked")
	public static void analyse (File sourceFile,ExtractionListener<ContractElement> consumer) throws Exception {
		for (Extractor<ContractElement> extractor:EXTRACTORS) {
			try (InputStream in = new FileInputStream(sourceFile)) {
				extractor.analyse(in, "test","<no version>",sourceFile.getName(), consumer);
			}
		}
        
	}

	@Override
	public void invoke() throws Exception {
		if (provides().exists()) {
			LOGGER.info("Skipping already performed experiment: " + provides().getName());

			return;
		}
		CollectContracts.main(new String[] {});
	}

	@Override
	public ExperimentArtefact[] requires() {
		return new ExperimentArtefact[] {
				ArtefactFactory.inputSrcZipFiles()
		};
	}

	@Override
	public ExperimentArtefact provides() {
		return ArtefactFactory.contracts();
	}
}
