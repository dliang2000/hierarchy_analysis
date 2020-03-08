package test.semverstudy.commons;

import org.junit.Test;
import semverstudy.commons.ArchiveType;
import semverstudy.commons.Project;
import semverstudy.commons.ProjectParser;
import java.io.File;
import java.net.URL;
import static org.junit.Assert.*;

/**
 * Test(s) for project specs json parser.
 * @author jens dietrich
 */
public class TestProjectParser {

    @Test
    public void test() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("test/semverstudy/commons/projects.json").getFile());
        assertTrue(file.exists());
        Project[] projects = ProjectParser.parseProjects(file);

        assertEquals(2,projects.length);

        // project 1
        Project project1 = projects[0];
        assertEquals("jsoup",project1.getName());
        assertEquals(new URL("https://jsoup.org/"),project1.getUrl());
        assertSame(ArchiveType.tgz,project1.getType());
        assertNull(project1.getReleases());
        assertEquals(2,project1.getVersions().length);
        assertEquals("1.9.2",project1.getVersions()[0].getVersion());
        assertEquals(new URL("https://github.com/jhy/jsoup/archive/jsoup-1.9.2.tar.gz"),project1.getVersions()[0].getSource());
        assertEquals("1.10.1",project1.getVersions()[1].getVersion());
        assertEquals(new URL("https://github.com/jhy/jsoup/archive/jsoup-1.10.1.tar.gz"),project1.getVersions()[1].getSource());

        // project 2
        Project project2 = projects[1];
        assertEquals("apache-commons-math",project2.getName());
        assertEquals(new URL("https://commons.apache.org/proper/commons-lang/"),project2.getUrl());
        assertSame(ArchiveType.tgz,project2.getType());
        assertEquals(new URL("http://archive.apache.org/dist/commons/math/source/"),project2.getReleases());
        assertEquals(2,project2.getVersions().length);
        assertEquals("3.2",project2.getVersions()[0].getVersion());
        assertEquals(new URL("http://archive.apache.org/dist/commons/math/source/commons-math3-3.2-src.tar.gz"),project2.getVersions()[0].getSource());
        assertEquals("3.3",project2.getVersions()[1].getVersion());
        assertEquals(new URL("http://archive.apache.org/dist/commons/math/source/commons-math3-3.3-src.tar.gz"),project2.getVersions()[1].getSource());
    }
}
