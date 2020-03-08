package contractstudy.scripts;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.google.common.base.Preconditions;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.InputStream;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


/**
 * Script used to check the input data for program versions and programs that do not have source code,
 * or only files that cannot be parsed.
 * Findings are reported on the console. See also list in doc/notes
 * @author jens dietrich
 */
public class CheckForProgramVersionsWithoutSourceCode {

    private static Logger LOGGER = Logging.getLogger(CheckForProgramVersionsWithoutSourceCode.class);

    public static void main (String[] args) throws Exception {


        File DATA_FOLDER = new File(Preferences.getDataFolder());
        Preconditions.checkArgument(DATA_FOLDER.exists(),"Cannot find data in " + DATA_FOLDER.getAbsolutePath());
        int THREAD_COUNT = Preferences.getThreadCount();

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        AtomicInteger counter = new AtomicInteger(0);

        Set<ProgramVersion> programVersionsWithoutSourceCode = Collections.synchronizedSet(new HashSet<>());
        Set<ProgramVersion> programVersionsWithoutParsableSourceCode = Collections.synchronizedSet(new HashSet<>());
        Set<String> programsWithSourceCode = Collections.synchronizedSet(new HashSet<>());

        for (File f:zips) {
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    boolean sourceCodeFound = false;
                    boolean parsableSourceCodeFound = false;
                    try {
                        LOGGER.info("Analysing " + counter.incrementAndGet() + "/" + zips.size() + " - " + f.getName());
                        ZipFile zip = new ZipFile(f);
                        Enumeration<? extends ZipEntry> en = zip.entries();

                        while (!parsableSourceCodeFound && en.hasMoreElements()) {
                            ZipEntry e = en.nextElement();
                            String name = e.getName();
                            if (name.endsWith(".java")) {
                                sourceCodeFound = true;
                                programsWithSourceCode.add(pv.getName());
                                try (InputStream in = zip.getInputStream(e)) {
                                    try {
                                        CompilationUnit cu = JavaParser.parse(in);
                                        parsableSourceCodeFound = true;
                                    } catch (Exception t) {
                                        LOGGER.warn("Cannot parse cu " + pv + " / " + name);
                                    }
                                }
                                catch (Exception x) {}
                            }
                        }
                        if (!sourceCodeFound) programVersionsWithoutSourceCode.add(pv);
                        if (sourceCodeFound && !parsableSourceCodeFound) programVersionsWithoutParsableSourceCode.add(pv);
                    }
                    catch (Exception e) {
                        // log errors and continue with next files
                        LOGGER.warn("Cannot parse file: " + f, e);
                        e.printStackTrace();
                    }
                }
            };
            executor.submit(task);
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        Set<String> programsWithoutSources = new HashSet<>();
        // traverse files again to cross-ref programs with programs with sources
        for (File f:zips) {
            String contextName = f.getName().substring(0, f.getName().lastIndexOf('.'));
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            ProgramVersion v = ProgramVersion.getOrCreateFromFile(f);
            String programName = v.getName();
            String version = v.getVersion();

            if (!programsWithSourceCode.contains(pv.getName())) {
                programsWithoutSources.add(pv.getName());
            }
        }

        LOGGER.warn("Program versions without sourcecode - " + programVersionsWithoutSourceCode.size() + " found, details :");
        for (ProgramVersion pv:programVersionsWithoutSourceCode) {
            pv.getFile().delete();
            LOGGER.warn("\t"+pv);
        }

        LOGGER.warn("Program versions without parsable sourcecode - " + programVersionsWithoutParsableSourceCode.size() + " found, details :");
        for (ProgramVersion pv:programVersionsWithoutParsableSourceCode) {
            LOGGER.warn("\t"+pv);
        }

        LOGGER.warn("Programs without sourcecode - " + programsWithoutSources.size() + " found, details :");
        for (String p:programsWithoutSources) {
            LOGGER.warn("\t"+p);
        }

        LOGGER.info("Done");
    }

    private static int getCounter(Map<String,Integer> values,String key) {
        Integer v = values.get(key);
        return v==null?0:v;
    }
}
