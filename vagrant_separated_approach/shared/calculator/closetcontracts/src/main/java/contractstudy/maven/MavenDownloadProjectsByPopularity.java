package contractstudy.maven;

import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.scripts.CollectContracts;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static contractstudy.maven.CorpusUtils.MVN_DATA;

/**
 * This script downloads Maven projects. It downloads the projects ordered by
 * popularity based on the web page: https://mvnrepository.com/popular
 *
 * Concrete artefacts are then downloaded from the Maven central repository.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenDownloadProjectsByPopularity {

    private static Logger LOGGER = Logging.getLogger(CollectContracts.class);

    /** Number of projects to download from maven. */
    private static final int NUMBER_OF_PROJECTS = 1000;

    /** Maximal number of pages allowed by mvnrepository.com */
    private static final int MAX_PAGES = 20;

    /** Web page containing projects by popularity. */
    private static final String MVN_POPULARITY_PAGE = "https://mvnrepository.com/popular";

    private static MavenDownloader mavenDownloader = new MavenDownloader(MVN_DATA);

    public static void main(String[] args) throws IOException, InterruptedException {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(Preferences.getThreadCount());

        int[] versions = new int[] {0};
        List<MavenProjectVersion>  projects = findByPopularity();
        for (MavenProjectVersion project : projects) {
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    try {
                        versions[0] += mavenDownloader.downloadProject(project).size();
                    } catch (IOException e) {
                        LOGGER.warn("Cannot download " + project + ": " + e.getMessage());
                    }
                }
            };

            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.DAYS);
        long endTime = System.currentTimeMillis();

        LOGGER.info("Done!");
        LOGGER.info("\ttime: " + (endTime-startTime) + " ms");
        LOGGER.info("\tprojects: " + projects.size());
        LOGGER.info("\tversions: " + versions[0]);
        LOGGER.info("\tthreads used: " + Preferences.getThreadCount());

    }

    /**
     * Find project sorted by popularity.
     * @return projects.
     * @throws IOException IO error
     */
    private static List<MavenProjectVersion> findByPopularity() throws IOException {
        int page = 1;
        boolean go = true;

        List<MavenProjectVersion>  projects = new LinkedList<>();
        while (go) {
            parsePopularPage(page++, projects);

            if (projects.size() >= NUMBER_OF_PROJECTS || page > MAX_PAGES) {
                go = false;
            }
        }

        return projects;
    }

    /**
     * Parse page with popular maven projects
     * @param page number of page
     * @param projects store projects into this array
     */
    private static void parsePopularPage(
            final int page,
            final List<MavenProjectVersion> projects) throws IOException {

        Document doc = Jsoup.connect(MVN_POPULARITY_PAGE + "?p=" + page).get();
        Elements htmlSubtitles = doc.select(".im-subtitle");

        for (Element htmlSubtitle : htmlSubtitles) {
            Elements htmlLinks = htmlSubtitle.select("a");
            String groupId = htmlLinks.get(0).html();
            String artifactId = htmlLinks.get(1).html();

            projects.add(new MavenProjectVersion(groupId, artifactId, "", false));
        }
    }
}
