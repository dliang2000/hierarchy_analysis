package contractstudy.diffrules;

import contractstudy.ContractElement;
import contractstudy.DiffResult;
import contractstudy.DiffRule;

import java.util.List;

import static contractstudy.diffrules.Utils.getterRefactor;

/**
 * Check whether two constraint sets (actually lists) are the same.
 * @author jens dietrich
 */
public class SameConstraints implements DiffRule {
    private boolean sameAs(ContractElement o1, ContractElement o2) {
            return
                    o1.getConstraintedArtefact()==o2.getConstraintedArtefact()
                    && o1.getKind() == o2.getKind()
                    && (o1.getCondition().replaceAll("\\s", "").equals(o2.getCondition().replaceAll("\\s", ""))
                            || getterRefactor(o1, o2)
                            || getterRefactor(o2, o1)
                    )
                    && o1.getAdditionalInfo().equals(o2.getAdditionalInfo());
    };

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {
        if (constraints1.size()!=constraints2.size()) return DiffResult.CANNOT_BE_CLASSIFIED;

        // compare
        for (int i=0;i<constraints1.size();i++) {
            ContractElement c1 = constraints1.get(i);
            ContractElement c2 = constraints2.get(i);
            if (!sameAs(c1,c2)) return DiffResult.CANNOT_BE_CLASSIFIED;
        }
        return DiffResult.UNCHANGED;
    }
}
