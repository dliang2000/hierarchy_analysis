package test.contractstudy;

import contractstudy.ContractElement;
import contractstudy.scripts.CollectContracts;
import contractstudy.ConstraintType;
import contractstudy.ConstraintCollector;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * Tests for the guava extractor.
 * @author Jens Dietrich
 */

public class TestSpringAssert {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/springassert/");

	@Test
	public void testDoesNotContain1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("DoesNotContain1.java",precondition.getCuName());
		assertEquals("foo()",precondition.getMethodDeclaration());
		assertEquals("!\"pool\".contains(\"pooh\")",precondition.getCondition());
		assertEquals(ConstraintType.SpringAssertDoesNotContain,precondition.getKind());
		assertEquals("\"not good\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}

    @Test
    public void testDoesNotContain2() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain2.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(1,preconditions.size());

        ContractElement precondition = preconditions.get(0);
        assertEquals("DoesNotContain2.java",precondition.getCuName());
        assertEquals("foo()",precondition.getMethodDeclaration());
        assertEquals("!\"pool\".contains(\"pooh\")",precondition.getCondition());
        assertEquals(ConstraintType.SpringAssertDoesNotContain,precondition.getKind());
        assertEquals("\"not good\"",precondition.getAdditionalInfo());
        assertEquals(9,precondition.getLineNo());
    }

    @Test
    public void testDoesNotContain3() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain3.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(1,preconditions.size());

        ContractElement precondition = preconditions.get(0);
        assertEquals("DoesNotContain3.java",precondition.getCuName());
        assertEquals("foo()",precondition.getMethodDeclaration());
        assertEquals("!\"pool\".contains(\"pooh\")",precondition.getCondition());
        assertEquals(ConstraintType.SpringAssertDoesNotContain,precondition.getKind());
        assertEquals("\"not good\"",precondition.getAdditionalInfo());
        assertEquals(9,precondition.getLineNo());
    }

    @Test
    public void testDoesNotContain4() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain4.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(1,preconditions.size());

        ContractElement precondition = preconditions.get(0);
        assertEquals("DoesNotContain4.java",precondition.getCuName());
        assertEquals("foo()",precondition.getMethodDeclaration());
        assertEquals("!\"pool\".contains(\"pooh\")",precondition.getCondition());
        assertEquals(ConstraintType.SpringAssertDoesNotContain,precondition.getKind());
        assertEquals("\"not good\"",precondition.getAdditionalInfo());
        assertEquals(8,precondition.getLineNo());
    }

    @Test
    public void testDoesNotContain5() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain5.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(0,preconditions.size());
    }

    @Test
    public void testDoesNotContain6() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER,"DoesNotContain6.java"),collector);
        List<ContractElement> preconditions = collector.getContractElements();
        assertEquals(0,preconditions.size());
    }
	
}
