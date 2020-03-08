package contractstudy.diffrules;

import contractstudy.*;

import java.util.List;

import static contractstudy.diffrules.Utils.filter;
import static contractstudy.diffrules.Utils.unchanged;

/**
 * Special rule where a nullable annotation is removed.
 * This is seen as a minor, uncritical change.
 * @author jens dietrich
 */
public class NullablePostconditionsRemoved implements DiffRule {

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {
        constraints1 = filter(constraints1,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);
        constraints2 = filter(constraints2,c -> c.getClassification()==ConstraintClassification.POSTCONDITION);

        if (constraints1.size()>constraints2.size()) {
            // check containment, by lax - do not check whether additionalInfo field matches
            // complexity is terrible, but lists will be very small
            boolean allFound = true;
            for (ContractElement c2:constraints2) {
                boolean found = false;
                for (ContractElement c1:constraints1) {
                    found = found || unchanged(c1,c2,true);
                }
                allFound = allFound && found;
            }
            if (allFound) {
                boolean diffOnlyContainsNullables = true;
                // now check whether the diff set are all nullables
                for (ContractElement c1:constraints1) {
                    boolean found = false;
                    for (ContractElement c2:constraints2) {
                        found = found || unchanged(c1,c2,true);
                    }
                    if (!found) {
                        diffOnlyContainsNullables = diffOnlyContainsNullables && isNullable(c1);
                    }
                }

                if (diffOnlyContainsNullables) return DiffResult.MINOR_CHANGE;
            }
        }
        return DiffResult.CANNOT_BE_CLASSIFIED;
    }

    private boolean isNullable(ContractElement c) {
        ConstraintType type = c.getKind();
        return  type == ConstraintType.JSR305Nullable ||
                type == ConstraintType.JSR305CheckForNull ||
                type == ConstraintType.JSR303Null ||
                type == ConstraintType.FindBugsNullable ||
                type == ConstraintType.JetBrainsNullable ;
    }
}
