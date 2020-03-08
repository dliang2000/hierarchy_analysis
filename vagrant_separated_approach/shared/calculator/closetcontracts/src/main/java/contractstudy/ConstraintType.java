package contractstudy;

import java.util.function.Function;
import static contractstudy.ConstraintClassifiers.*;

/**
 * Represents types of constraints found in Java classes.
 * constraint type > contstraint group > constraint category
 * example: ConstraintTypeJSR303Null > ConstraintGroup.ANNO_JSR30 > ConstraintCategory.ANNOTATION
 * @author jens dietrich
 */
public enum ConstraintType {

	
	CREIllegalArgumentException(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
    CREIllegalStateException(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
    CRENullpointerException(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
    CREUnsupportedOperationException(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
    CREIndexOutOfBoundsException(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
    UCREUnsupportedOperationException(ConstraintGroup.UNCONDITIONAL_RUNTIME_EXCEPTION,_PRECONDITION, TVL.MAYBE),
	
	GuavaPreconditionCheckArgument(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.MAYBE),
	GuavaPreconditionCheckState(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.MAYBE),
	GuavaPreconditionElementIndex(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.NO),
	GuavaPreconditionPositionIndex(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.NO),
	GuavaPreconditionNotNull(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.NO),
	GuavaPreconditionPositionIndexes(ConstraintGroup.CAPI_GUAVA,_PRECONDITION, TVL.MAYBE),
	
	// combine types for lang2 and lang3 APIs
	CommonsLangIsTrue(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.MAYBE),
	CommonsLangNoNullElements(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.YES),
	CommonsLangNotEmpty(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLangNotNull(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	
	// commons lang2 only
	CommonsLang2AllElementsOfType(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.YES),
	
	// commons lang3 only
	CommonsLang3ExclusiveBetween(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3InclusiveBetween(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3IsAssignableFrom(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3IsInstanceOf(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3MatchesPattern(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3NotBlank(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.YES),
	CommonsLang3ValidIndex(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.NO),
	CommonsLang3ValidState(ConstraintGroup.CAPI_COMMONS_VALIDATE,_PRECONDITION, TVL.MAYBE),

    // spring assert
    SpringAssertDoesNotContain(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertHasLength(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertHasText(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertNotEmpty(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertNoNullElements(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.YES),
    SpringIsInstanceOf(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringIsAssignable(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertState(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.MAYBE),
    SpringAssertIsNull(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),
    SpringAssertIsTrue(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.MAYBE),
    SpringAssertNotNull(ConstraintGroup.CAPI_SPRING_ASSERT,_PRECONDITION, TVL.NO),

    JavaAssert(ConstraintGroup.ASSERTION,_UNKNOWN, TVL.MAYBE),

    // JSR303 annotations
    JSR303Null(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303NotNull(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303AssertTrue(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303AssertFalse(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Min(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Max(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303DecimalMin(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303DecimalMax(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Size(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Digits(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Past(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Future(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),
    JSR303Pattern(ConstraintGroup.ANNO_JSR303,_STANDARD_ANNOTATION, TVL.NO),

    // FindBugs annotations
    FindBugsCheckForNull(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO),
    FindBugsNonNull(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO),
    FindBugsNullable(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO),
    FindBugsPossiblyNull(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO),
    FindBugsUnknownNullness(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO),
    FindBugsCreatesObligation(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review
    FindBugsDischargesObligation(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review
    FindBugsCleanupObligation(ConstraintGroup.ANNO_FINDBUGS,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review

    // JSR305
    JSR305CheckForNull(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305CheckForSigned(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305MatchesPattern(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Nonnegative(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Nonnull(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Nullable(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305OverridingMethodsMustInvokeSuper(ConstraintGroup.ANNO_JSR305,_POSTCONDITION, TVL.NO),
    JSR305ParametersAreNonnullByDefault(ConstraintGroup.ANNO_JSR305,_PRECONDITION, TVL.NO),
    JSR305ParametersAreNullableByDefault(ConstraintGroup.ANNO_JSR305,_PRECONDITION, TVL.NO),
    JSR305RegEx(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Signed(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Syntax(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Tainted(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305Untainted(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305WillClose(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review
    JSR305WillCloseWhenClosed(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review
    JSR305WillNotClose(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review

    // JSR305 Concurrent
    JSR305CONCURRENTGuardedBy(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305CONCURRENTImmutable(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305CONCURRENTNotThreadSafe(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),
    JSR305CONCURRENTThreadSafe(ConstraintGroup.ANNO_JSR305,_STANDARD_ANNOTATION, TVL.NO),

    // JetBrains and IntelliJ
    JetBrainsContract(ConstraintGroup.ANNO_JetBrains,_UNKNOWN, TVL.MAYBE), // uses DSL
    // skipped NI and NonNIs - only used for code generation / IDE tooling for i18n
    JetBrainsNotNull(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    JetBrainsNullable(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    JetBrainsPropertyKey(ConstraintGroup.ANNO_JetBrains,_PRECONDITION, TVL.NO),
    JetBrainsTestOnly(ConstraintGroup.ANNO_JetBrains,_PRECONDITION, TVL.NO),
    IntellijFlow(ConstraintGroup.ANNO_JetBrains,_PRECONDITION, TVL.NO),
    IntellijIdentifier(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO), // TODO Jens: needs further discussion, please review
    IntellijJdkConstants_AdjustableOrientation(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_BoxLayoutAxis(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_CalendarMonth(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_CursorType(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_FlowLayoutAlignment(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_FontStyle(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_HorizontalAlignment(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_InputEventMask(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_ListSelectionMode(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_PatternFlags(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_TabLayoutPolicy(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_TabPlacement(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_TitledBorderJustification(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_TitledBorderTitlePosition(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_Language(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_MagicConstant(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_Pattern(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_PrintFormat(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_RegExp(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),
    IntellijJdkConstants_Subst(ConstraintGroup.ANNO_JetBrains,_STANDARD_ANNOTATION, TVL.NO),

    // Lombok annotations
    Lombok_NonNull(ConstraintGroup.ANNO_Lombok,_STANDARD_ANNOTATION, TVL.NO);
    // other lombok annotations are only used as instructions to generate code


    private ConstraintGroup group = null;
	private Function<ConstraintedArtefact,ConstraintClassification> classifier = null;

    // whether checking a constraint requires a check for all elements of a collection
    // or array, including checks on all characters of a string
    private TVL isQuantifying = TVL.MAYBE;
	
	ConstraintType(ConstraintGroup group,Function<ConstraintedArtefact,ConstraintClassification> classifier) {
		this.group = group;
		this.classifier = classifier;
	}

    ConstraintType(ConstraintGroup group, Function<ConstraintedArtefact,ConstraintClassification> classifier, TVL isQuantifying) {
        this.group = group;
        this.classifier = classifier;
        this.isQuantifying = isQuantifying;
    }
	
	public ConstraintGroup getGroup() {
		return group;
	}
	public ConstraintClassification getClassification(ConstraintedArtefact artefact) {
		return classifier.apply(artefact);
	}

    public TVL isQuantifying() {
        return isQuantifying;
    }

}
