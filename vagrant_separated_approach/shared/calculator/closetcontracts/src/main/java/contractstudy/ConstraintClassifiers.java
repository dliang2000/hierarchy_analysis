package contractstudy;

import java.util.function.Function;

/**
 * Some premade classifier functions used to compute constraint classifications.
 * This is usually static, but in particular for annotations depends on context.
 * @author jens dietrich
 */
public class ConstraintClassifiers {
    public static final Function<ConstraintedArtefact,ConstraintClassification> _PRECONDITION =
            artefact -> ConstraintClassification.PRECONDITION;

    public static final Function<ConstraintedArtefact,ConstraintClassification> _POSTCONDITION =
            artefact -> ConstraintClassification.POSTCONDITION;

    public static final Function<ConstraintedArtefact,ConstraintClassification> _UNKNOWN =
            artefact -> ConstraintClassification.ANY;

    // annotations like most JSR303 annotations are handled differently as their classification depends on
    // whether the method, a method parameter or something else is annotated
    // depending on this, this is a postcondition, precondition or unkown
    public static final Function<ConstraintedArtefact,ConstraintClassification> _STANDARD_ANNOTATION =
            artefact -> {
                switch (artefact) {
                    case METHOD:return ConstraintClassification.POSTCONDITION;
                    case METHOD_PARAMETER:return ConstraintClassification.PRECONDITION;
                    case CLASS:return ConstraintClassification.INVARIANT;
                }
                return ConstraintClassification.ANY;
            };

}

