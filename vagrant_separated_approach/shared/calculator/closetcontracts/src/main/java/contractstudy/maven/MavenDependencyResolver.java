package contractstudy.maven;

import org.apache.maven.model.Repository;
import org.apache.maven.repository.internal.MavenRepositorySystemUtils;
import org.eclipse.aether.DefaultRepositorySystemSession;
import org.eclipse.aether.RepositorySystem;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.collection.CollectRequest;
import org.eclipse.aether.connector.basic.BasicRepositoryConnectorFactory;
import org.eclipse.aether.graph.Dependency;
import org.eclipse.aether.graph.DependencyNode;
import org.eclipse.aether.impl.DefaultServiceLocator;
import org.eclipse.aether.repository.LocalRepository;
import org.eclipse.aether.repository.RemoteRepository;
import org.eclipse.aether.resolution.DependencyRequest;
import org.eclipse.aether.spi.connector.RepositoryConnectorFactory;
import org.eclipse.aether.spi.connector.transport.TransporterFactory;
import org.eclipse.aether.transport.file.FileTransporterFactory;
import org.eclipse.aether.transport.http.HttpTransporterFactory;
import org.eclipse.aether.util.graph.visitor.PreorderNodeListGenerator;

import java.util.List;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenDependencyResolver {

    private RepositorySystem repoSystem = newRepositorySystem();
    private RepositorySystemSession session = newSession(repoSystem);

    public List<Artifact> resolveDependencies(
            final Artifact artifact,
            final List<Repository> extraRepos) throws Exception {

        Dependency dependency = new Dependency(artifact, "compile");
        RemoteRepository central = new RemoteRepository.Builder(
                "central", "default", "http://repo1.maven.org/maven2/" )
                .build();

        CollectRequest collectRequest = new CollectRequest();
        collectRequest.setRoot(dependency);
        collectRequest.addRepository(central);

        for (Repository repo : extraRepos) {
            RemoteRepository extraRepo = new RemoteRepository.Builder(
                    repo.getId(), repo.getName(), repo.getUrl()).build();

            collectRequest.addRepository(extraRepo);
        }

        DependencyNode node = repoSystem.collectDependencies(session, collectRequest).getRoot();

        DependencyRequest dependencyRequest = new DependencyRequest();
        dependencyRequest.setRoot(node);

        // this also downloads all JAR files.
//        repoSystem.resolveDependencies(session, dependencyRequest);

        PreorderNodeListGenerator nlg = new PreorderNodeListGenerator();
        node.accept(nlg);

        return nlg.getArtifacts(true);
    }

    private static RepositorySystem newRepositorySystem() {

        DefaultServiceLocator locator = MavenRepositorySystemUtils.newServiceLocator();

        locator.addService(RepositoryConnectorFactory.class, BasicRepositoryConnectorFactory.class);
        locator.addService(TransporterFactory.class, FileTransporterFactory.class);
        locator.addService(TransporterFactory.class, HttpTransporterFactory.class);

        return locator.getService(RepositorySystem.class);
    }

    private static RepositorySystemSession newSession(RepositorySystem system) {
        DefaultRepositorySystemSession session = MavenRepositorySystemUtils.newSession();

        LocalRepository localRepo = new LocalRepository(MavenResolveTransitiveClosure.MVN_REPO);
        session.setLocalRepositoryManager(system.newLocalRepositoryManager(session, localRepo));

        return session;
    }
}
