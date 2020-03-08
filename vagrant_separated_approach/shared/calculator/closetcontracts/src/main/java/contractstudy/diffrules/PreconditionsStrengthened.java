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
 * Check whether a precondition was added.
 * This corresponds to "strengthened expectations" and usually constitutes a contract violation
 * in the context of method overriding or evolution.
 * @author jens dietrich
 */
public class PreconditionsStrengthened implements DiffRule {

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {

        constraints1 = filter(constraints1,c -> c.getClassification()==ConstraintClassification.PRECONDITION);
        constraints2 = filter(constraints2,c -> c.getClassification()==ConstraintClassification.PRECONDITION);

        // if preconditions are the same, it is handled by a earlier rule
        if (constraints2.size() > 0 && constraints1.size() <= constraints2.size()) {
            // check containment, be lax - do not check whether additionalInfo field matches
            // complexity is terrible, but lists will be very small
            boolean allFound = true;
            for (ContractElement c1:constraints1) {
                boolean found = false;
                for (ContractElement c2:constraints2) {
                    found = found || unchanged(c1,c2,true) || constraintStrengthened(c1, c2);
                }
                allFound = allFound && found;
            }
            if (allFound) {
                return DiffResult.PRECONDITION_ADDED;
            }
        }
        return DiffResult.CANNOT_BE_CLASSIFIED;
    }

}
