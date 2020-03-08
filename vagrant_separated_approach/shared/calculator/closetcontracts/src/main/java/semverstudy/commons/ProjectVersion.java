package semverstudy.commons;

import java.net.URL;
import java.util.Objects;

/**
 * Spec of a project version to be analysed -- note that this structure is auto-mapped to the specs written in json.
 * @author jens dietrich
 */
public class ProjectVersion {

    private String version = null;
    private URL source = null;
    private URL binary = null;
    private String dir = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public URL getSource() {
        return source;
    }

    public void setSource(URL source) {
        this.source = source;
    }

    public URL getBinary() {
        return binary;
    }

    public void setBinary(URL binary) {
        this.binary = binary;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
			return true;
		}
        if (o == null || getClass() != o.getClass()) {
			return false;
		}
        ProjectVersion that = (ProjectVersion) o;
        return Objects.equals(version, that.version) &&
                Objects.equals(source, that.source) &&
                Objects.equals(dir, that.dir);
    }
    @Override
    public int hashCode() {
        return Objects.hash(version, source, dir);
    }
}
