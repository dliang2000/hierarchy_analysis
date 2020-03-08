package contractstudy;

/**
 * Types of artefacts to which constraints apply.
 * The classification is coarse, and is static for many contraint types
 * (e.g. CAPIs like guava are always constraints on methods).
 * The main use case is to extract this information for annotation-based approaches like
 * JSR303 or JSR305, because this can be used to infer whether an annotation represents
 * a precondition (if method parameter is annotated), a postcondition (if method - and therefore
 * the method return type is annotated) or an invariant (otherwise, if the field is annotated).
 * @author jens dietrich
 */
public enum ConstraintedArtefact {
    CLASS, // includes field
    METHOD, // should be uses as default
    METHOD_PARAMETER
}
