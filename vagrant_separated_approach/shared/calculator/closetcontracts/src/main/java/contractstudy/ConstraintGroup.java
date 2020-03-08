package contractstudy;

/**
 * Groups of constraints, usually grouping is by extractor.
 * constraint type > constraint group > constraint category
 * example: ConstraintTypeJSR303Null > ConstraintGroup.ANNO_JSR30 > ConstraintCategory.ANNOTATION
 * @author jens dietrich
 */
public enum ConstraintGroup {
	CONDITIONAL_RUNTIME_EXCEPTION("conditional runtime exception","cond. runtime exc.",ConstraintCategory.RUNTIME_EXCEPTION),
    UNCONDITIONAL_RUNTIME_EXCEPTION("unsupported operation exception","unsupp. op. exc.",ConstraintCategory.RUNTIME_EXCEPTION),
	ASSERTION("assertion","assert",ConstraintCategory.ASSERTION),
	
	CAPI_GUAVA("guava precondition API","guava precond.",ConstraintCategory.API),
	CAPI_COMMONS_VALIDATE("commons validate API","commons validate",ConstraintCategory.API),
    CAPI_SPRING_ASSERT("spring assert API","spring assert",ConstraintCategory.API),
	
	ANNO_JSR303("JSR303, JSR349","JSR303, JSR349",ConstraintCategory.ANNOTATION),
    ANNO_JSR305("JSR305","JSR305",ConstraintCategory.ANNOTATION),
    ANNO_FINDBUGS("FindBugs","findbugs",ConstraintCategory.ANNOTATION),
    ANNO_JetBrains("JetBrains","jetbrains",ConstraintCategory.ANNOTATION),
    ANNO_Lombok("Lombok","lombok",ConstraintCategory.ANNOTATION);

    private String name = null;
    private String shortName = null;
    private ConstraintCategory category = null;

    ConstraintGroup(String name,String shortName,ConstraintCategory category) {
        this.name = name;
        this.shortName = shortName;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public ConstraintCategory getCategory() {
        return category;
    }

    public String getShortName() {
        return shortName;
    }
}
