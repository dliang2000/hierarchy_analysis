package test.contractstudy;

import contractstudy.ContractElement;
import contractstudy.ConstraintCollector;
import contractstudy.ConstraintType;
import contractstudy.scripts.CollectContracts;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Tests for the CRE extractor.
 * @author Jens Dietrich
 */

public class TestUnconditionalUnsupportedOperationException {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/unsuppopexc");

	@Test
	public void testUnsuppOpExc1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"UnsuppOp.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(2,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("UnsuppOp.java",precondition.getCuName());
		assertEquals("foo1()",precondition.getMethodDeclaration());
		assertEquals("-",precondition.getCondition());
		assertEquals(ConstraintType.UCREUnsupportedOperationException,precondition.getKind());
		assertEquals("\"foo1 is not supported\"",precondition.getAdditionalInfo());
		assertEquals(6,precondition.getLineNo());
	}

    @Test
    public void testUnsuppOpExc2() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"UnsuppOp.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(2,preconditions.size());

        ContractElement precondition = preconditions.get(1);
        assertEquals("UnsuppOp.java",precondition.getCuName());
        assertEquals("foo2()",precondition.getMethodDeclaration());
        assertEquals("-",precondition.getCondition());
        assertEquals(ConstraintType.UCREUnsupportedOperationException,precondition.getKind());
        assertEquals("\"foo2 is not supported\"",precondition.getAdditionalInfo());
        assertEquals(11,precondition.getLineNo());
    }

}
