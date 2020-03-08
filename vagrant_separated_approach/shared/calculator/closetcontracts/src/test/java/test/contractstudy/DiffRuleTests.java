package test.contractstudy;

import contractstudy.ContractElement;
import contractstudy.DiffResult;
import contractstudy.DiffRule;
import contractstudy.diffrules.*;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
import test.contractstudy.testdata.diffrules.DiffTestData;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests for different diff rules.
 * @author jens dietrich
 */
public class DiffRuleTests {

    private void expected(DiffRule rule, Pair<List<ContractElement>, List<ContractElement>> toDiff, DiffResult oracle) {
        DiffResult result = rule.compare(toDiff.getLeft(), toDiff.getRight());
        assertEquals(oracle, result);
    }

    @Test public void testSameConstraints1() throws Exception {
        expected(new SameConstraints(), DiffTestData.unchanged1, DiffResult.UNCHANGED);
    }

    @Test public void testSameConstraints2() throws Exception {
        expected(new SameConstraints(), DiffTestData.unchanged2, DiffResult.UNCHANGED);
    }

    @Test public void testSameConstraints3() throws Exception {
        expected(new SameConstraints(), DiffTestData.onlyAdditionalInfoChanged, DiffResult.CANNOT_BE_CLASSIFIED);
    }

    @Test public void testSameConstraints4() throws Exception {
        expected(new SameConstraints(), DiffTestData.preconditionAdded1, DiffResult.CANNOT_BE_CLASSIFIED
        );
    }

    @Test public void testSameConstraints5() throws Exception {
        expected(new SameConstraints(), DiffTestData.preconditionAdded2, DiffResult.CANNOT_BE_CLASSIFIED
        );
    }

    @Test public void testSameConstraints6() throws Exception {
        expected(new SameConstraints(), DiffTestData.orderChanged, DiffResult.CANNOT_BE_CLASSIFIED
        );
    }

    @Test public void testSameConstraints7() throws Exception {
        expected(new SameConstraints(), DiffTestData.typeChanged, DiffResult.CANNOT_BE_CLASSIFIED
        );
    }

    @Test public void testSameConstraints8() throws Exception {
        expected(new SameConstraints(), DiffTestData.orderAndAdditionalInfoChanged, DiffResult.CANNOT_BE_CLASSIFIED);
    }


    @Test public void testIgnoreOrderAndAdditionalInfo1() throws Exception {
        expected(new IgnoreOrderAndMessage(), DiffTestData.orderAndAdditionalInfoChanged, DiffResult.MINOR_CHANGE);
    }

    @Test public void testIgnoreOrderAndAdditionalInfo2() throws Exception {
        expected(new IgnoreOrderAndMessage(), DiffTestData.typeChanged, DiffResult.CANNOT_BE_CLASSIFIED);
    }

    @Test public void testIgnoreOrderAndAdditionalInfo3() throws Exception {
        expected(new IgnoreOrderAndMessage(), DiffTestData.preconditionAdded1, DiffResult.CANNOT_BE_CLASSIFIED);
    }

    @Test public void testPreconditionAdded1() throws Exception {
        expected(new PreconditionsStrengthened(), DiffTestData.preconditionAdded1, DiffResult.PRECONDITION_ADDED);
    }

    @Test public void testPreconditionAdded2() throws Exception {
        expected(new PreconditionsStrengthened(), DiffTestData.preconditionAdded2, DiffResult.PRECONDITION_ADDED);
    }

    @Test public void testPreconditionAdded3() throws Exception {
        expected(new PreconditionsStrengthened(), DiffTestData.preconditionAddedAndAdditionalInfoChanged, DiffResult.PRECONDITION_ADDED);
    }

    @Test public void testPreconditionRemoved1() throws Exception {
        expected(new PreconditionsWeakened(), DiffTestData.preconditionRemoved1, DiffResult.PRECONDITION_REMOVED);
    }

    @Test public void testPreconditionRemoved2() throws Exception {
        expected(new PreconditionsWeakened(), DiffTestData.preconditionRemoved2, DiffResult.PRECONDITION_REMOVED);
    }

    @Test public void testPreconditionRemoved3() throws Exception {
        expected(new PreconditionsWeakened(), DiffTestData.preconditionRemovedAndAdditionalInfoChanged, DiffResult.PRECONDITION_REMOVED);
    }

    @Test public void testPostconditionRemoved1() throws Exception {
        expected(new PostconditionsWeakened(), DiffTestData.postconditionRemoved1, DiffResult.POSTCONDITION_REMOVED);
    }

    @Test public void testPostconditionRemoved2() throws Exception {
        expected(new PostconditionsWeakened(), DiffTestData.postconditionRemoved2, DiffResult.POSTCONDITION_REMOVED);
    }

    @Test public void testPostconditionRemoved3() throws Exception {
        expected(new PostconditionsWeakened(), DiffTestData.postconditionRemovedAndAdditionalInfoChanged, DiffResult.POSTCONDITION_REMOVED);
    }

    @Test public void testPostconditionAdded1() throws Exception {
        expected(new PostconditionsStrengthened(), DiffTestData.postconditionAdded1, DiffResult.POSTCONDITION_ADDED);
    }

    @Test public void testPostconditionAdded2() throws Exception {
        expected(new PostconditionsStrengthened(), DiffTestData.postconditionAdded2, DiffResult.POSTCONDITION_ADDED);
    }

    @Test public void testPostconditionAdded3() throws Exception {
        expected(new PostconditionsStrengthened(), DiffTestData.postconditionAddedAndAdditionalInfoChanged, DiffResult.POSTCONDITION_ADDED);
    }

    @Test public void testNullablePostconditionRemoved1() throws Exception {
        expected(new NullablePostconditionsRemoved(), DiffTestData.postconditionNullableRemoved1, DiffResult.MINOR_CHANGE);
    }

    @Test public void testNullablePostconditionRemoved2() throws Exception {
        expected(new NullablePostconditionsRemoved(), DiffTestData.postconditionNullableRemoved1, DiffResult.MINOR_CHANGE);
    }

}
