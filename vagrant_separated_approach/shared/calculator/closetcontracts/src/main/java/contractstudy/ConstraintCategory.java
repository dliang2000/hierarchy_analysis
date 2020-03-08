package contractstudy;

/**
 * Highest level of grouping.
 * The grouping is as follows:
 * constraint type > contstraint group > constraint category
 * example: ConstraintTypeJSR303Null > ConstraintGroup.ANNO_JSR30 > ConstraintCategory.ANNOTATION
 * @author jens dietrich
 */
public enum ConstraintCategory {

    ASSERTION("assertion"),
    RUNTIME_EXCEPTION("runtime exception"),
    API("api"),
    ANNOTATION("annotation");

    private String name = null;

    ConstraintCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
