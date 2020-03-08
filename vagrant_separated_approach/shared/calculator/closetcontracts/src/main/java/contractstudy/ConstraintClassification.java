package contractstudy;

/**
 * Classification into kind of constraint: precondition, postcondition etc.
 * @author jens dietrich
 */
public enum ConstraintClassification {
	PRECONDITION("pre-condition"),
    POSTCONDITION("post-condition"),
    INVARIANT("invariants"),
    ANY("not classified");

    private String name = null;

    ConstraintClassification(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
