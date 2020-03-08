package contractstudy.maven;

import contractstudy.Downloader;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

/**
 * Downloader of maven projects.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenDownloader {

    private File root;

    /**
     * URL to the search API.
     */
    private static final String MAVEN_SEARCH_API = "http://search.maven.org/solrsearch/select"; //?q=g:\"com.google.inject\"+AND+a:\"guice\"&core=gav&rows=20&wt=json"

    private static final String MAVEN_DOWNLOAD_API = "http://search.maven.org/remotecontent"; // ?filepath=com/google/inject/guice/4.1.0/guice-4.1.0-sources.jar";


    /**
     * Downloader that supports redirect.
     */
    private static Downloader downloader = new Downloader();


    public MavenDownloader(final File root) {
        this.root = root;
    }


    /**
     * Download all versions of a maven project
     *
     * @param project project
     * @return project versions
     */
    public List<MavenProjectVersion> downloadProject(final MavenProjectVersion project) throws IOException {

        List<MavenProjectVersion> versions = findVersions(project);
        downloadVersions(versions);

        return versions;
    }

    /**
     * Download all versions.
     *
     * @param versions versions
     */
    public void downloadVersions(final List<MavenProjectVersion> versions) throws IOException {

        FileUtils.forceMkdir(root);

        for (MavenProjectVersion version : versions) {

            if (version.isSourcesAvailable()) {
                downloadVersion(version);
            }
        }
    }

    public void downloadVersion(final MavenProjectVersion version) throws IOException {
        String groupPath = version.getGroupId().replace('.', '/');

        File dir = new File(root, version.getArtefactId());
        FileUtils.forceMkdir(dir);

        // download JAR file with sources
        String path = groupPath + "/" + version.getArtefactId() + "/" + version.getVersion() + "/" + version.getArtefactId() + "-" + version.getVersion() + "-sources.jar";
        File outputFile = new File(dir, version.getArtefactId() + "-" + version.getVersion() + ".zip");
        // e.g   "filepath=com/google/inject/guice/4.1.0/guice-4.1.0-sources.jar";
        downloader.download(new URL(MAVEN_DOWNLOAD_API + "?filepath=" + path), outputFile);

        // download POM file
        String pomPath = groupPath + "/" + version.getArtefactId() + "/" + version.getVersion() + "/" + version.getArtefactId() + "-" + version.getVersion() + ".pom";
        File outPomFile = new File(dir, version.getArtefactId() + "-" + version.getVersion() + ".pom");
        downloader.download(new URL(MAVEN_DOWNLOAD_API + "?filepath=" + pomPath), outPomFile);
    }


    /**
     * Read all available versions for a project
     *
     * @param project a project
     * @return all versions
     */
    public static List<MavenProjectVersion> findVersions(final MavenProjectVersion project) throws IOException {
        List<MavenProjectVersion> versions = new LinkedList<>();

        final int pageSize = 10;  // API returns values in 10-item pages
        int start = 0;

        while (true) {
            String query = "q=g:\"" + project.getGroupId() + "\"+AND+a:\"" + project.getArtefactId() + "\"&core=gav&start=" + start;
            String link = MAVEN_SEARCH_API + "?" + query;

            JSONObject json = new JSONObject(IOUtils.toString(new URL(link), Charset.forName("UTF-8")));
            JSONObject response = json.getJSONObject("response");
            int size = response.getInt("numFound");
            JSONArray docs = response.getJSONArray("docs");

            if (start > size) {
                break;
            }

            for (int i = 0; i < docs.length(); i++) {
                JSONObject doc = docs.getJSONObject(i);
                String version = doc.getString("v"); //version
                boolean sources = doc.getJSONArray("ec").toString().contains("-sources.jar");
                versions.add(project.newVersion(version, sources));
            }

            start += pageSize;
        }

        return versions;
    }

}
