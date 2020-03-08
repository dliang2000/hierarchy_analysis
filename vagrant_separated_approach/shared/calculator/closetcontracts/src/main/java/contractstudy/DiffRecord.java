package contractstudy;

import java.util.List;

/**
 * Data structure to represent to constraint sets and some contextual data.
 * Note that the constraints have this contextual data (program version, compilation unit , ..)
 * as well, however, we cannot always infer this as we want to be able to investigate
 * cases where one constraint set is empty !
 * @author jens dietrich
 */
public class DiffRecord {
    private List<ContractElement> constraints1 = null;
    // contextual info
    private ProgramVersion programVersion1 = null;
    private String cu1 = null;
    private String methodDecl1 = null;
    private List<ContractElement> constraints2 = null;

    // contextual info
    private ProgramVersion programVersion2 = null;
    private String cu2 = null;
    private String methodDecl2 = null;

    public DiffRecord(List<ContractElement> constraints1, ProgramVersion programVersion1, String cu1, String methodDecl1, List<ContractElement> constraints2, ProgramVersion programVersion2, String cu2, String methodDecl2) {
        this.constraints1 = constraints1;
        this.programVersion1 = programVersion1;
        this.cu1 = cu1;
        this.methodDecl1 = methodDecl1;
        this.constraints2 = constraints2;
        this.programVersion2 = programVersion2;
        this.cu2 = cu2;
        this.methodDecl2 = methodDecl2;
    }


    public List<ContractElement> getConstraints1() {
        return constraints1;
    }

    public ProgramVersion getProgramVersion1() {
        return programVersion1;
    }

    public String getCu1() {
        return cu1;
    }

    public String getMethodDecl1() {
        return methodDecl1;
    }

    public List<ContractElement> getConstraints2() {
        return constraints2;
    }

    public ProgramVersion getProgramVersion2() {
        return programVersion2;
    }


    public String getCu2() {
        return cu2;
    }

    public String getMethodDecl2() {
        return methodDecl2;
    }

    @Override
    public String toString() {
        return "DiffRecord Program " + programVersion1 + " CU " + cu1 + "  {" +
                "" + constraints1.size() +
                ", " + constraints2.size() +
                '}';
    }
}
