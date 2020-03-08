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
 * Tests for the commons lang v2 extractor.
 * @author Jens Dietrich
 */ 

public class TestCommonsValidate2 {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/commonsvalidate2/");

	@Test
	public void testIsTrue1() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue1.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("IsTrue1.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangIsTrue,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}

	@Test
	public void testIsTrue2() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue2.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("IsTrue2.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangIsTrue,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testIsTrue3() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue3.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("IsTrue3.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangIsTrue,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testIsTrue4() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue4.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("IsTrue4.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("i < 0",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangIsTrue,precondition.getKind());
		assertEquals("\"Parameter must be >=0\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testIsTrue5() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue5.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(0,preconditions.size());
	}
	
	@Test
	public void testIsTrue6() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"IsTrue6.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(0,preconditions.size());
	}
	
	@Test
	public void testNoNullElements() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"NoNullElements.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("NoNullElements.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("new ArrayList(10)",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangNoNullElements,precondition.getKind());
		assertEquals("\"list should not have nulls\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testNotEmpty() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"NotEmpty.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("NotEmpty.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("new ArrayList(10)",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangNotEmpty,precondition.getKind());
		assertEquals("\"list should not be empty\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
	
	@Test
	public void testNotNull() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"NotNull.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("NotNull.java",precondition.getCuName());
		assertEquals("foo(int)",precondition.getMethodDeclaration());
		assertEquals("\"foo\"",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLangNotEmpty,precondition.getKind());
		assertEquals("\"string should not be null\"",precondition.getAdditionalInfo());
		assertEquals(7,precondition.getLineNo());
	}
	
	@Test
	public void testAllElementsOfType() throws Exception {
		ConstraintCollector collector = new ConstraintCollector();
		CollectContracts.analyse(new File(TEST_DATA_FOLDER,"AllElementsOfType.java"),collector);
		List<ContractElement> preconditions = collector.getContractElements();
		assertEquals(1,preconditions.size());
		
		ContractElement precondition = preconditions.get(0);
		assertEquals("AllElementsOfType.java",precondition.getCuName());
		assertEquals("foo(List)",precondition.getMethodDeclaration());
		assertEquals("all of list instanceOf String.class",precondition.getCondition());
		assertEquals(ConstraintType.CommonsLang2AllElementsOfType,precondition.getKind());
		assertEquals("\"all elements in list must be strings\"",precondition.getAdditionalInfo());
		assertEquals(8,precondition.getLineNo());
	}
}
