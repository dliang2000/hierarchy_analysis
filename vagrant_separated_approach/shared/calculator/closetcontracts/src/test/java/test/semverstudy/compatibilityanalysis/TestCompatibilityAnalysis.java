package test.semverstudy.compatibilityanalysis;

import semverstudy.closetcontracts.CompatibilityAnalysis;
import semverstudy.closetcontracts.ResultListener;
import semverstudy.commons.Project;
import org.junit.*;
import semverstudy.commons.ProjectVersion;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.junit.Assert.assertTrue;

/**
 * Test the compatibility analysis
 * @author jens dietrich
 */
public class TestCompatibilityAnalysis {

    private Project project = null;

    @Before
    public void setup() throws Exception {
        project = new Project();
        project.setName("test");
        project.setBuild(null);
        project.setReleases(null);
        project.setUrl(null);

        ClassLoader classLoader = getClass().getClassLoader();

        ProjectVersion v1 = new ProjectVersion();
        v1.setVersion("1.0.0");
        URL url1 = classLoader.getResource("test/semverstudy/compatibilityanalysis/v1.zip");
        assert url1!=null;
        v1.setSource(url1);

        ProjectVersion v2 = new ProjectVersion();
        v2.setVersion("2.0.0");
        URL url2 = classLoader.getResource("test/semverstudy/compatibilityanalysis/v2.zip");
        assert url2!=null;
        v2.setSource(url2);

        project.setVersions(new ProjectVersion[]{v1,v2});

    }

    @After
    public void after() throws Exception {
        project = null;
    }

    @Test
    public void testRemovedPostCondition() throws Exception {
        AtomicBoolean success = new AtomicBoolean(false);
        ResultListener reporter = new ResultListener() {
            @Override
            public void resultFound(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, String violationType, String detail) {
                if (
                    location.equals("com.foo/ClassDroppingPostCondition.java::foo(int)")
                    && projectVersion1.getVersion().equals("1.0.0")
                    && projectVersion2.getVersion().equals("2.0.0")
                    && violationType.equals("closetcontracts-postcondition-removed")
                ) {
                    success.set(true);
                }
            }
        };
        CompatibilityAnalysis.analyse(new Project[]{this.project},reporter);
        assertTrue(success.get());
    }

    @Test
    public void testAddedPreCondition() throws Exception {
        AtomicBoolean success = new AtomicBoolean(false);
        ResultListener reporter = new ResultListener() {
            @Override
            public void resultFound(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, String violationType, String detail) {
                if (
                        location.equals("com.foo/ClassIntroducingPreCondition.java::foo(int)")
                                && projectVersion1.getVersion().equals("1.0.0")
                                && projectVersion2.getVersion().equals("2.0.0")
                                && violationType.equals("closetcontracts-precondition-added")
                ) {
                    success.set(true);
                }
            }
        };
        CompatibilityAnalysis.analyse(new Project[]{this.project},reporter);
        assertTrue(success.get());
    }
}
