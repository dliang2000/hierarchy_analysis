package contractstudy.maven;

import contractstudy.scripts.CollectContracts;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static contractstudy.maven.CorpusUtils.listProjects;

/**
 * This class downloads all dependencies for the maven projects stored in the "mvn-data" directory
 *
 * From: http://wiki.eclipse.org/Aether/Resolving_Dependencies
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenResolveTransitiveClosure {

    private static Logger LOGGER = Logging.getLogger(CollectContracts.class);

    public static String MVN_REPO = "mvn-repo";

    /** Maven deps resolver. */
    private static MavenDependencyResolver resolver = new MavenDependencyResolver();

    public static void main(String[] args) throws Exception {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(Preferences.getThreadCount());

        File[] projects = listProjects(CorpusUtils.MVN_DATA);

        for (File project : projects) {
            File[] poms = listPoms(project);

            for (File pom : poms) {

                Runnable task = new Runnable() {
                    @Override
                    public void run() {
                        try {
                            MavenProjectVersion projectVersion = resolveDependencies(pom);
                            String nameOnly = pom.getName().substring(0, pom.getName().lastIndexOf('.'));
                            File jsonFile = new File(project, nameOnly + "-deps.json");
                            IOUtils.write(projectVersion.toJson(), new FileOutputStream(jsonFile), "utf-8");
                        } catch (Exception e) {
                            LOGGER.warn("Problem to resolve dependencies for: " + pom.getName() + " " + e.getMessage());
                        }
                    }
                };

                executor.submit(task);
            }
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.DAYS);
        long endTime = System.currentTimeMillis();

        LOGGER.info("Done!");
        LOGGER.info("\ttime: " + (endTime-startTime) + " ms");
        LOGGER.info("\tthreads used: " + Preferences.getThreadCount());

    }

    /**
     * Download dependencies for the POM file.
     * @param pom the pom file
     * @return maven project with dependencies. Not only POM dependencies, but the whole transitive closure!
     * @throws Exception error
     */
    private static MavenProjectVersion resolveDependencies(File pom) throws Exception {
        Model model = parsePom(pom);
        Artifact pomArtefact = toArtifact(model);

        List<Artifact> artifacts = resolver.resolveDependencies(pomArtefact, model.getRepositories());

        MavenProjectVersion project = new MavenProjectVersion(
                pomArtefact.getGroupId(),
                pomArtefact.getArtifactId(),
                pomArtefact.getVersion(),
                true);

        project.setDependencies(artifacts);

        return project;
    }

    private static Artifact toArtifact(Model model) {
        String groupId = model.getGroupId();
        String version = model.getVersion();

        // if not group set, inherit from parent
        if (groupId == null && model.getParent() != null) {
            groupId = model.getParent().getGroupId();
        }

        if (version == null && model.getParent() != null) {
            version = model.getParent().getVersion();
        }


        return new DefaultArtifact(groupId + ":"
                + model.getArtifactId() + ":"
                + version);

    }

    /**
     * Parse pom file
     * @param pomFile pom file
     * @return artifact
     * @throws IOException error
     * @throws XmlPullParserException error
     */
    public static Model parsePom(final File pomFile) throws IOException, XmlPullParserException {
        MavenXpp3Reader reader = new MavenXpp3Reader();

        try (FileReader r = new FileReader(pomFile)) {
            return reader.read(r);
        }
    }

    /**
     * List POM files of a project.
     * @param project project
     * @return pom files
     */
    public static File[] listPoms(final File project) {

        return project.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".pom");
            }
        });
    }
}
