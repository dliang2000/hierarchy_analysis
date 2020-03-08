package semverstudy.commons;

import java.net.URL;
import java.util.Arrays;
import java.util.Objects;

/**
 * Spec of a project to be analysed -- note that this structure is auto-mapped to the specs written in json.
 * @author jens dietrich
 */
public class Project {

    private String name = null;
    private URL url = null;
    private URL releases = null;
    private ArchiveType type = null;
    private ProjectVersion[] versions = null;
    private String build = null;

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URL getReleases() {
        return releases;
    }

    public void setReleases(URL releases) {
        this.releases = releases;
    }

    public ArchiveType getType() {
        return type;
    }

    public void setType(ArchiveType type) {
        this.type = type;
    }

    public ProjectVersion[] getVersions() {
        return versions;
    }

    public void setVersions(ProjectVersion[] versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) &&
                Objects.equals(url, project.url) &&
                Objects.equals(releases, project.releases) &&
                type == project.type &&
                Arrays.equals(versions, project.versions) &&
                Objects.equals(build, project.build);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(name, url, releases, type, build);
        result = 31 * result + Arrays.hashCode(versions);
        return result;
    }
}
