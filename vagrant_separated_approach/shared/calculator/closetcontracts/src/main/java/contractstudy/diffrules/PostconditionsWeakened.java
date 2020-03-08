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
 * Check whether a postcondition was removed.
 * This corresponds to "weakening guarantees" and usually constitutes a contract violation
 * in the context of method overriding or evolution.
 * @author jens dietrich
 */
public class PostconditionsWeakened implements DiffRule {

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {
        constraints1 = filter(constraints1,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);
        constraints2 = filter(constraints2,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);

        // if preconditions are the sane, it is handled by an earlier rule
        if (constraints1.size() > 0 && constraints1.size()>=constraints2.size()) {
            // check containment, be lax - do not check whether additionalInfo field matches
            // complexity is terrible, but lists will be very small
            boolean allFound = true;
            for (ContractElement c2:constraints2) {
                boolean found = false;
                for (ContractElement c1:constraints1) {
                    found = found || unchanged(c1,c2,true) || constraintWeakened(c1, c2);
                }
                allFound = allFound && found;
            }
            if (allFound) {
                return DiffResult.POSTCONDITION_REMOVED;
            }
        }
        return DiffResult.CANNOT_BE_CLASSIFIED;
    }
}
