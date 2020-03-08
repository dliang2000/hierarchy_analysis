package contractstudy;

/**
 * Datastructure to represent the result of running diff.
 * @author jens dietrich
 */
public enum DiffResult {
    UNCHANGED,
    MINOR_CHANGE, // probably compatible
    POSTCONDITION_ADDED,
    POSTCONDITION_REMOVED,
    PRECONDITION_ADDED,
    PRECONDITION_REMOVED,
    OTHER_INCOMPATBIBLE_CHANGE,
    CANNOT_BE_CLASSIFIED // must be analysed manually
}
