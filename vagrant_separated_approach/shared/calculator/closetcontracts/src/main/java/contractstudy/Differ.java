package contractstudy;

import contractstudy.diffrules.*;

import java.util.List;

/**
 * The basic class to diff two lists of constraints associates with two artefacts
 * (usually methods) to compare. This can be used in different contexts, in particular to
 * (1) compare the contracts of a method with the contracts of another version of this method
 * (2) compare the contracts of a method with the contracts of another method overriding it in order to check for violations of LSP
 * @author jens dietrich
 */
public class Differ {

    public static DiffRule[] RULES = {
            new SameConstraints(),
            new IgnoreOrderAndMessage(),
            new PreconditionsStrengthened(),
            new PreconditionsWeakened(),
            new NullablePostconditionsRemoved(),
            new PostconditionsStrengthened(),
            new PostconditionsWeakened()
    };

    /**
     * Compare two lists of constraints. We use lists as the order potenially matters.
     * Note that the method is not symmetric: the artefact associates with  constraints1 should be compatible
     * (substitutable by) the artefact associated with constraints2 !
     * @param constraints1
     * @param constraints2
     */
    public DiffResult compare (List<ContractElement> constraints1, List<ContractElement> constraints2) {
        DiffResult result = null;
        for (DiffRule rule:RULES) {
            result = rule.compare(constraints1,constraints2);
            assert result != null;
            if (result!=DiffResult.CANNOT_BE_CLASSIFIED) return result;
        }
        return result;
    }
}
