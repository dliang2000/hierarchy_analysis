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
 * Tests for the guava extractor.
 * @author Jens Dietrich
 */

public class TestGuavaPreconditions {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/guava/");

	@Test
	public void testCheckArgument1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckArgument1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckArgument,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}

	@Test
	public void testCheckArgument2() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument2.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckArgument2.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckArgument,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckArgument3() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument3.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckArgument3.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckArgument,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckArgument4() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument4.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckArgument4.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckArgument,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckArgument5() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument5.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(0,preconditions.size());
	}
	
	@Test
	public void testCheckArgument6() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckArgument6.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(0,preconditions.size());
	}
	
	@Test
	public void testCheckState1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckState1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckState1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("this.field == 42",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckState,precondition.getKind());
		assertEquals("\"Field value must be 42\"",precondition.getAdditionalInfo());
		assertEquals(9,precondition.getLineNo());
	}
	
	@Test
	public void testCheckState2() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckState2.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckState2.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("this.field == 42",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionCheckState,precondition.getKind());
		assertEquals("",precondition.getAdditionalInfo());
		assertEquals(9,precondition.getLineNo());
	}
	
	@Test
	public void testCheckElementIndex1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckElementIndex1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckElementIndex1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("0<=i<5",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionElementIndex,precondition.getKind());
		assertEquals("\"must fit into an array of size 5\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckPositionIndex1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckPositionIndex1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckPositionIndex1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("0<=i<5",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionPositionIndex,precondition.getKind());
		assertEquals("\"must fit into an array of size 5\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckNotNull1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckNotNull1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckNotNull1.java",precondition.getCuName());
		assertEquals("foo(Object)",precondition.getMethodDeclaration());
		assertEquals("obj!=null",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionNotNull,precondition.getKind());
		assertEquals("\"the argument should not be null\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testCheckPositionIndexes1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"CheckPositionIndexes1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("CheckPositionIndexes1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("0<=i<=5<=8",precondition.getCondition());
		assertEquals(ConstraintType.GuavaPreconditionPositionIndexes,precondition.getKind());
		assertEquals("",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
}
