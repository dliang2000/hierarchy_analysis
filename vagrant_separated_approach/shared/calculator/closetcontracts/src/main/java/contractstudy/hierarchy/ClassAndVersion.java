package contractstudy.hierarchy;

import contractstudy.ProgramVersion;
import org.json.JSONObject;

import java.io.IOException;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class ClassAndVersion {

    private String className;
    private String cuName;
    private ProgramVersion programVersion;

    public ClassAndVersion(
            final ProgramVersion programVersion,
            final String className,
            final String cuName) {

        this.className = className;
        this.cuName = cuName;
        this.programVersion = programVersion;
    }


    public static ClassAndVersion create(
            final String programName,
            final String programVersion,
            final String className,
            final String cuName) {

        ProgramVersion v = ProgramVersion.getOrCreate(programName, programVersion);
        return new ClassAndVersion(v, className, cuName);
    }

    public String getClassName() {
        return className;
    }

    public ProgramVersion getProgramVersion() {
        return programVersion;
    }

    public String getCuName() {
        return cuName;
    }


    public String toJson() {
        JSONObject o = new JSONObject();
        o.put("className", className);
        o.put("cuName", cuName);
        o.put("programName", programVersion.getName());
        o.put("programVersion", programVersion.getVersion());

        return o.toString();
    }

    public static ClassAndVersion fromJson(String json) throws IOException {
        JSONObject o = new JSONObject(json);

        return create(
                o.getString("programName"),
                o.getString("programVersion"),
                o.getString("className"),
                o.getString("cuName")
        );
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassAndVersion)) return false;

        ClassAndVersion that = (ClassAndVersion) o;

        if (className != null ? !className.equals(that.className) : that.className != null) return false;
        if (cuName != null ? !cuName.equals(that.cuName) : that.cuName != null) return false;
        return programVersion != null ? programVersion.equals(that.programVersion) : that.programVersion == null;

    }

    @Override
    public int hashCode() {
        int result = className != null ? className.hashCode() : 0;
        result = 31 * result + (cuName != null ? cuName.hashCode() : 0);
        result = 31 * result + (programVersion != null ? programVersion.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "" + className +
                ", (" + cuName + ") " +
                ", v: " + programVersion;
    }


}
