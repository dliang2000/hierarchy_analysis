package contractstudy.diffrules;

import contractstudy.ContractElement;
import contractstudy.DiffResult;
import contractstudy.DiffRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * If two constraint sets have the same elements only differing in the additional info field,
 * and perhaps permutated.
 * @author jens dietrich
 */
public class IgnoreOrderAndMessage implements DiffRule {
    Comparator<ContractElement> comparator = new Comparator<ContractElement>() {
        @Override
        public int compare(ContractElement o1, ContractElement o2) {
            // we assume that program version and cu is always the same
            // as we only compare constraints from the same set
//            Preconditions.checkArgument(o1.getProgramVersion().getName().equals(o2.getProgramVersion().getName()));
//            Preconditions.checkArgument(o1.getConstraintedArtefact().equals(o2.getConstraintedArtefact()));
//            Preconditions.checkArgument(o1.getCuName().equals(o2.getCuName()));
//            Preconditions.checkArgument((o1.getMethodDeclaration()==null && o2.getMethodDeclaration()==null) || o1.getMethodDeclaration().equals(o2.getMethodDeclaration()));
            int r = 0;
            r = o1.getKind().compareTo(o2.getKind());
            if (r!=0) return r;
            r = o1.getCondition().compareTo(o2.getCondition());
            if (r!=0) return r;

            return 0;
        }
    };

    @Override
    public DiffResult compare(List<ContractElement> constraints1, List<ContractElement> constraints2) {
        if (constraints1.size()!=constraints2.size()) return DiffResult.CANNOT_BE_CLASSIFIED;

        // normalise order
        List<ContractElement> sortedConstraints1 = new ArrayList<>(constraints1.size());
        sortedConstraints1.addAll(constraints1);
        Collections.sort(sortedConstraints1,comparator);
        List<ContractElement> sortedConstraints2 = new ArrayList<>(constraints2.size());
        sortedConstraints2.addAll(constraints2);
        Collections.sort(sortedConstraints2,comparator);

        // compare
        for (int i=0;i<sortedConstraints1.size();i++) {
            ContractElement c1 = sortedConstraints1.get(i);
            ContractElement c2 = sortedConstraints2.get(i);
            if (!c1.getKind().equals(c2.getKind())) return DiffResult.CANNOT_BE_CLASSIFIED;
            if (!c1.getCondition().equals(c2.getCondition())) return DiffResult.CANNOT_BE_CLASSIFIED;
        }

        return DiffResult.MINOR_CHANGE;
    }
}
