package contractstudy.scripts;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Script that counts the instantiation sites (constructor invocations) or selected screened
 * runtime exceptions.
 * Results are reported on the console.
 * @author jens dietrich
 */
public class CountRuntimeExceptionInstantiationSites implements Experiment{

	static Logger LOGGER = Logging.getLogger(CountRuntimeExceptionInstantiationSites.class);

    static class RTExceptionCounterVisitor extends VoidVisitorAdapter<Object> {

        private ProgramVersion programVersion = null;
        private String cuName = null;
        private int exceptionCounter = 0;

        public RTExceptionCounterVisitor(
                ProgramVersion programVersion,
                String cuName
        ) {
            super();
            this.programVersion = programVersion;
            this.cuName = cuName;
        }

        public int getExceptionCounter() {
            return exceptionCounter;
        }

        @Override
        public void visit(ObjectCreationExpr objCreationExpression, Object arg) {
            super.visit(objCreationExpression, arg);
            String excTypeName = objCreationExpression.getType().getName();
            if (excTypeName.endsWith(IllegalArgumentException.class.getSimpleName()) ||
                excTypeName.endsWith(IllegalStateException.class.getSimpleName()) ||
                excTypeName.endsWith(NullPointerException.class.getSimpleName()) ||
                excTypeName.endsWith(IndexOutOfBoundsException.class.getSimpleName()) ||
                excTypeName.endsWith(UnsupportedOperationException.class.getSimpleName())) {
                exceptionCounter = exceptionCounter+1;
            }

        }
    }


    public static void main(String[] args) throws Exception {

        File DATA_FOLDER = new File(Preferences.getDataFolder());
        int THREAD_COUNT = Preferences.getThreadCount();

		Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
		int total = zips.size();
		
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
		AtomicInteger progressCounter = new AtomicInteger(0);
		AtomicInteger counter = new AtomicInteger(0);
		AtomicInteger parsedProgramVersionCounter = new AtomicInteger(0);
		
		long startTime = System.currentTimeMillis();
		
		for (File f:zips) {
			parsedProgramVersionCounter.incrementAndGet();

			
			Runnable task = new Runnable() {
				@Override
				public void run() {
                    try {
                        LOGGER.info("Analysing " + progressCounter.incrementAndGet() + "/" + zips.size() + " - " + f.getName());
                        ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
                        ZipFile zip = new ZipFile(f);
                        Enumeration<? extends ZipEntry> en = zip.entries();
                        while (en.hasMoreElements()) {
                            ZipEntry e = en.nextElement();
                            String name = e.getName();
                            if (name.endsWith(".java")) {
                                try (InputStream in = zip.getInputStream(e)) {
                                    try {
                                        CompilationUnit cu = JavaParser.parse(in);
                                        RTExceptionCounterVisitor visitor = new RTExceptionCounterVisitor(pv, name);
                                        visitor.visit(cu, null);
                                        counter.addAndGet(visitor.getExceptionCounter());

                                    } catch (Exception t) {
                                        // consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
                                    }
                                } catch (Exception x) {
                                    LOGGER.error("Errro accessing zip file " + zip, x);
                                }

                            }
                        }
                    }
                    catch (Exception x) {
                        LOGGER.warn("Cannot parse file: " + f, x);
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
		LOGGER.info("\truntime exception instantiation sites found: " + counter.intValue());
		LOGGER.info("\tthreads used: " + THREAD_COUNT);
	}

	@Override
	public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
		CountRuntimeExceptionInstantiationSites.main(new String[] {});
	}

	@Override
	public ExperimentArtefact[] requires() {
		return new ExperimentArtefact[] {
				ArtefactFactory.inputSrcZipFiles()
		};
	}

	@Override
	public ExperimentArtefact provides() {
		return null;
	}
}
