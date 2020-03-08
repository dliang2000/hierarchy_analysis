package contractstudy;

import java.util.List;
/**
 * Abstract interface to extract diff data.
 * @author jens dietrich
 */
public interface DiffExtractor {

    /**
     * Extracts diff data. Each element of the list produced is a pair consisting of basically
     * two constraint sets (or rather lists, as the order matters) associated with
     * the "same" artefact in different contexts.
     * E.g. constraints attached to different versions of the same method,
     * or constraint attached to a method and another method overriding it.
     * The order matters - for evolution, the order should be <old,new>,
     * for overriding, the order should be <super,sub>.
     * The intention is that experiments will check whether the second constraint set
     * is compatible w.r.t. the first one , and this is not symmetric !
     *
     * Note that there are no parameters, scripts will access the data sets (constraints extracted
     * via @see CollectConstraint) using settings in @see Preferences.
     * @return
     */
    List<DiffRecord> extract() throws Exception;
}

