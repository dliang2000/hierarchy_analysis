package contractstudy;

import com.google.common.base.Preconditions;
import org.json.JSONObject;

/**
 * Represents a contract element.
 * @author jens dietrich
 */
public  class ContractElement {
	
	static final String MISSING_INFO = "-"; // useful for serializing
	
	private ProgramVersion programVersion = null; 
	private String cuName = MISSING_INFO; // src file
	private int lineNo = -1;
	private String methodDeclaration = MISSING_INFO;
	private boolean methodAbstract = false;
	private ConstraintType kind = null;
	private String condition = MISSING_INFO;
	private String additionalInfo = MISSING_INFO;  // additional info, e.g. from exception message parameters
    private ConstraintedArtefact constraintedArtefact = ConstraintedArtefact.METHOD;

    public ConstraintedArtefact getConstraintedArtefact() {
        return constraintedArtefact;
    }

    public void setConstraintedArtefact(ConstraintedArtefact constraintedArtefact) {
        this.constraintedArtefact = constraintedArtefact;
    }

    public ConstraintType getKind() {
		return kind;
	}
	public void setKind(ConstraintType kind) {
		this.kind = kind;
	}
	public int getLineNo() {
		return lineNo;
	}
	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}
	public ProgramVersion getProgramVersion() {
		return programVersion;
	}
	public void setProgramVersion(ProgramVersion programVersion) {
		Preconditions.checkArgument(programVersion!=null);
		this.programVersion = programVersion;
	}
	public String getCuName() {
		return cuName;
	}
	public void setCuName(String cuName) {
		Preconditions.checkArgument(cuName!=null);
		this.cuName = cuName;
	}

	public boolean isMethodAbstract() {
		return methodAbstract;
	}

	public void setMethodAbstract(boolean methodAbstract) {
		this.methodAbstract = methodAbstract;
	}

	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition==null?MISSING_INFO:condition;
	}
	public String getMethodDeclaration() {
		return methodDeclaration;
	}
	public void setMethodDeclaration(String methodDeclaration) {
		this.methodDeclaration = methodDeclaration==null?MISSING_INFO:methodDeclaration;
	}
	public String getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo==null?MISSING_INFO:additionalInfo;
	}
	
	public static final char CSV_SEPARATOR = '\t';

	/**
	 * Export this object to a JSON Object.
	 * @return
	 */
	public JSONObject toJSON () {
		
		Preconditions.checkState(getProgramVersion().getName() != null);
		Preconditions.checkState(getProgramVersion().getVersion() != null);
		Preconditions.checkState(getLineNo() > -1);
		Preconditions.checkState(getCuName() != null);
		Preconditions.checkState(getMethodDeclaration() != null);
		Preconditions.checkState(getCondition() != null);
		Preconditions.checkState(getKind() != null);
		Preconditions.checkState(getAdditionalInfo() != null);
        Preconditions.checkState(getConstraintedArtefact()!=null);
		
		return new JSONObject()
			.put("name", getProgramVersion().getName())
			.put("version", getProgramVersion().getVersion())
			.put("cu", getCuName())
			.put("line", getLineNo())
			.put("method", getMethodDeclaration())
			.put("condition", getCondition())
			.put("type", getKind())
			.put("additional_info", getAdditionalInfo())
            .put("artefact_type",getConstraintedArtefact())
				.put("abstract_method", isMethodAbstract())
            ;
	}
	
	/**
	 * Export this object to a JSON Object.
	 * @return
	 */
	public static ContractElement fromJSON (JSONObject json) {
		ContractElement mc = new ContractElement();
		mc.setProgramVersion(ProgramVersion.getOrCreate(json.getString("name"),json.getString("version")));
		mc.setCuName(json.getString("cu"));
		mc.setLineNo(json.getInt("line"));
		mc.setMethodDeclaration(json.getString("method"));
		mc.setCondition(json.getString("condition"));
		mc.setAdditionalInfo(json.getString("additional_info"));
		mc.setKind(ConstraintType.valueOf(json.getString("type")));
        mc.setConstraintedArtefact(ConstraintedArtefact.valueOf(json.getString("artefact_type")));
		mc.setMethodAbstract(json.getBoolean("abstract_method"));
		return mc;
	}

	@Override
	public String toString() {
		return "Constraint Program Version " + programVersion + " CU  " + cuName  + " [kind=" + kind + ", condition=\"" + condition + "\""
				+ (additionalInfo==null?"":(", additionalInfo=" + additionalInfo)) + "]";
	}

    public ConstraintClassification getClassification () {
        return this.getKind().getClassification(this.getConstraintedArtefact());
    }

}
