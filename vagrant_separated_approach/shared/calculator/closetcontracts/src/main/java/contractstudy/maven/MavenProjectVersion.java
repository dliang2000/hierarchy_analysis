package contractstudy.maven;

import org.eclipse.aether.artifact.Artifact;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class MavenProjectVersion {

    private String groupId;
    private String artefactId;
    private String version;
    private boolean sourcesAvailable;

    /** Resolved dependencies - i.e. transitive closure, not only POM listed dependencies. */
    private List<Artifact> dependencies = new ArrayList<>();

    public MavenProjectVersion(
            final String groupId,
            final String artefactId,
            final String version,
            final boolean sourcesAvailable) {

        this.groupId = groupId;
        this.artefactId = artefactId;
        this.version = version;
        this.sourcesAvailable = sourcesAvailable;
    }

    public MavenProjectVersion(
            final String groupId,
            final String artefactId,
            final String version) {

        this(groupId, artefactId, version, true);
    }

    public MavenProjectVersion newVersion(String version, boolean sourcesAvailable) {
        return new MavenProjectVersion(groupId, artefactId, version, sourcesAvailable);
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtefactId() {
        return artefactId;
    }

    public String getVersion() {
        return version;
    }

    public boolean isSourcesAvailable() {
        return sourcesAvailable;
    }

    public List<Artifact> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Artifact> dependencies) {
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "groupId=" + groupId + '\'' +
                ", artefactId='" + artefactId + '\'' +
                ", version='" + version + '\'';
    }

    public String toJson() {
        JSONObject p = new JSONObject();
        p.put("groupId", groupId);
        p.put("artifactId", artefactId);
        p.put("version", version);

        JSONArray a = new JSONArray();
        for (Artifact d : dependencies) {
            JSONObject o  = new JSONObject();
            o.put("groupId", d.getGroupId());
            o.put("artifactId", d.getArtifactId());
            o.put("version", d.getVersion());

            a.put(o);
        }

        p.put("deps", a);

        return p.toString();
    }
}
