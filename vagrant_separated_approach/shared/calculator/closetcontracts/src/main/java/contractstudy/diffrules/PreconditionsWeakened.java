package contractstudy.diffrules;

import contractstudy.ContractElement;
import contractstudy.ConstraintClassification;
import contractstudy.DiffResult;
import contractstudy.DiffRule;

import java.util.List;

import static contractstudy.diffrules.Utils.constraintWeakened;
import static contractstudy.diffrules.Utils.filter;
import static contractstudy.diffrules.Utils.unchanged;

/**
 * Check whether a precondition was removed.
 * This is usually considered as compatible / uncritical in the context of subtyping and evolution.
 * @author jens dietrich
 */
public class PreconditionsWeakened implements DiffRule {

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {
        constraints1 = filter(constraints1,c -> c.getClassification()==ConstraintClassification.PRECONDITION);
        constraints2 = filter(constraints2,c -> c.getClassification()==ConstraintClassification.PRECONDITION);

        if (constraints1.size()>constraints2.size()) {
            // check containment, be lax - do not check whether additionalInfo field matches
            // complexity is terrible, but lists will be very small
            boolean allFound = true;
            for (ContractElement c2:constraints2) {
                boolean found = false;
                for (ContractElement c1:constraints1) {
                    // added last clause to capture data as suggested by reviewer #26B
                    found = found || unchanged(c1,c2,true) || constraintWeakened(c1, c2);
                }
                allFound = allFound && found;
            }
            if (allFound) {
                return DiffResult.PRECONDITION_REMOVED;
            }
        }
        return DiffResult.CANNOT_BE_CLASSIFIED;
    }
}
