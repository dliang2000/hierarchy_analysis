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


public class TestConditionalRuntimeExceptions {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/cre");

	@Test
	public void testFlat1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"Flat.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(2,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("Flat.java",precondition.getCuName());
		assertEquals("foo1(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CREIllegalArgumentException,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(5,precondition.getLineNo());
	}
	
	@Test
	public void testFlat2() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"Flat.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(2,preconditions.size());
		
		ContractElement precondition = preconditions.get(1);
		assertEquals("Flat.java",precondition.getCuName());
		assertEquals("foo2(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CREIllegalArgumentException,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(11,precondition.getLineNo());
	}

    @Test
    public void testDeep1() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"Deep.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(1,preconditions.size());

        ContractElement precondition = preconditions.get(0);
        assertEquals("Deep.java",precondition.getCuName());
        assertEquals("foo1(int)",precondition.getMethodDeclaration());
        assertEquals("i > 0 && i != 42",precondition.getCondition());
        assertEquals(ConstraintType.CREIllegalArgumentException,precondition.getKind());
        assertEquals("\"This is not the answer!\"",precondition.getAdditionalInfo());
        assertEquals(8,precondition.getLineNo());
    }

}
