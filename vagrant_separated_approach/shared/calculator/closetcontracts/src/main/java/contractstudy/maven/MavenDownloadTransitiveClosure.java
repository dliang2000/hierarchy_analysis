package contractstudy.maven;

import contractstudy.scripts.CollectContracts;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static contractstudy.maven.CorpusUtils.listJsons;
import static contractstudy.maven.CorpusUtils.listProjects;
import static contractstudy.maven.CorpusUtils.parseDeps;

/**
 * Download data for transitive closure.
 * The dependencies must be resolved before.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenDownloadTransitiveClosure {

    private static Logger LOGGER = Logging.getLogger(CollectContracts.class);

    public static final String MVN_DEPS_DIR = "mvn-dependencies";

    private static MavenDownloader downloader = new MavenDownloader(new File(MVN_DEPS_DIR));

    public static void main(String[] args) throws IOException, InterruptedException {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(Preferences.getThreadCount());

        int[] failed = new int[] {0};
        int[] downloaded = new int[] {0};

        for (File project : listProjects(CorpusUtils.MVN_DATA)) {
            for (File version : listJsons(project)) {
                List<MavenProjectVersion> deps =  parseDeps(version);

                for (MavenProjectVersion dep : deps) {
                    Runnable task = new Runnable() {
                        @Override
                        public void run() {
                            try {
                                downloader.downloadVersion(dep);
                                downloaded[0] += 1;
                            } catch (Exception e) {
                                failed[0] += 1;
                                LOGGER.warn("Cannot download " + dep + ": " + e.getMessage());
                            }
                        }
                    };
                    executor.submit(task);
                }
            }
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.DAYS);
        long endTime = System.currentTimeMillis();

        LOGGER.info("Done!");
        LOGGER.info("\ttime: " + (endTime-startTime) + " ms");
        LOGGER.info("\tdownloaded dependencies: " + downloaded[0]);
        LOGGER.info("\tfailed dependencies: " + failed[0]);
        LOGGER.info("\tthreads used: " + Preferences.getThreadCount());

    }

}
