package contractstudy.diffrules;

import contractstudy.ContractElement;
import contractstudy.ConstraintClassification;
import contractstudy.DiffResult;
import contractstudy.DiffRule;

import java.util.List;

import static contractstudy.diffrules.Utils.constraintStrengthened;
import static contractstudy.diffrules.Utils.filter;
import static contractstudy.diffrules.Utils.unchanged;

/**
 * Check whether a postcondition was added.
 * This is usually considered as compatible / uncritical in the context of subtyping and evolution.
 * @author jens dietrich
 */
public class PostconditionsStrengthened implements DiffRule {

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {

        constraints1 = filter(constraints1,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);
        constraints2 = filter(constraints2,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);

        if (constraints1.size()<constraints2.size()) {
            // check containment, be lax - do not check whether additionalInfo field matches
            // complexity is terrible, but lists will be very small
            boolean allFound = true;
            for (ContractElement c1:constraints1) {
                boolean found = false;
                for (ContractElement c2:constraints2) {
                    // added last clause to capture data as suggested by reviewer #26B
                    found = found || unchanged(c1,c2,true) || constraintStrengthened(c1, c2);
                }
                allFound = allFound && found;
            }
            if (allFound) {
                return DiffResult.POSTCONDITION_ADDED;
            }
        }
        return DiffResult.CANNOT_BE_CLASSIFIED;
    }
}
