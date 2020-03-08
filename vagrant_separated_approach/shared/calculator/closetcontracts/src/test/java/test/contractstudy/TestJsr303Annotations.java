package test.contractstudy;

import contractstudy.*;
import contractstudy.scripts.CollectContracts;
import org.junit.Test;
import test.contractstudy.testdata.jsr303.Jsr303ConstructorParamAnnotation;
import test.contractstudy.testdata.jsr303.Jsr303MethodParamAnnotation;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class TestJsr303Annotations {

    private static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/jsr303/");

    @Test
    public void testAnnotationsDetected() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "Jsr303TestData.java"), collector);

        ContractElement min = firstByKind(collector.getContractElements(), ConstraintType.JSR303Min);

        assertNotNull("Precondition 'Min' does not exist", min);
        assertEquals("[value = 30]", min.getCondition());

        ContractElement max = firstByKind(collector.getContractElements(), ConstraintType.JSR303Max);
        assertNotNull("Precondition 'Max' does not exist", max);
        assertEquals("100", max.getCondition());
    }



    @Test
    public void testJsr303WildImportTestData() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "Jsr303WildImportTestData.java"), collector);

        ContractElement min = firstByKind(collector.getContractElements(), ConstraintType.JSR303Min);

        assertNotNull("Precondition 'Min' does not exist", min);
        assertEquals("[value = 30]", min.getCondition());

        ContractElement max = firstByKind(collector.getContractElements(), ConstraintType.JSR303Max);
        assertNotNull("Precondition 'Max' does not exist", max);
        assertEquals("100", max.getCondition());
    }

    @Test
    public void testNonJsr() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "NonJsr303TestData.java"), collector);

        assertEquals("No annotations should be found. ", 0, collector.getContractElements().size());

    }


    @Test
    public void testJsr303MethodParameterAnnotation() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, Jsr303MethodParamAnnotation.class.getSimpleName() + ".java"), collector);

        ContractElement min = firstByKind(collector.getContractElements(), ConstraintType.JSR303Min);

        assertNotNull("Precondition 'Min' does not exist", min);
        assertEquals("20", min.getCondition());

        ContractElement max = firstByKind(collector.getContractElements(), ConstraintType.JSR303Max);
        assertNotNull("Precondition 'Max' does not exist", max);
        assertEquals("10", max.getCondition());

        assertEquals("method(Integer)", max.getMethodDeclaration());
        assertEquals("method(Integer)", min.getMethodDeclaration());
    }

    @Test
    public void testJsr303ConstructorParameterAnnotation() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, Jsr303ConstructorParamAnnotation.class.getSimpleName() + ".java"), collector);

        ContractElement min = firstByKind(collector.getContractElements(), ConstraintType.JSR303Min);

        assertNotNull("Precondition 'Min' does not exist", min);
        assertEquals("20", min.getCondition());

        ContractElement max = firstByKind(collector.getContractElements(), ConstraintType.JSR303Max);
        assertNotNull("Precondition 'Max' does not exist", max);
        assertEquals("10", max.getCondition());

        assertEquals("Jsr303ConstructorParamAnnotation(Integer)", max.getMethodDeclaration());
        assertEquals("Jsr303ConstructorParamAnnotation(Integer)", min.getMethodDeclaration());
    }

    /**
     * Get first precondition with matching its kind.
     * @param kind  name
     * @param preconditions preconditions to search in
     * @return precondition or null
     */
    public static ContractElement firstByKind(
            final List<ContractElement> preconditions,
            final ConstraintType kind) {

        ContractElement p = null;

        for (ContractElement precondition : preconditions) {
            // not precise finding, but ok for tests
            if (precondition.getKind().equals(kind)) {
                p = precondition;
                break;
            }
        }

        return p;
    }

    @Test
    public void testJsr303TargetInvariant() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "TargetArtefacts.java"), collector);
        ContractElement contractElement = firstByKind(collector.getContractElements(), ConstraintType.JSR303Size);
        assertEquals(ConstraintedArtefact.CLASS, contractElement.getConstraintedArtefact());
    }

    @Test
    public void testJsr303TargetPrecondition() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "TargetArtefacts.java"), collector);
        ContractElement contractElement = firstByKind(collector.getContractElements(), ConstraintType.JSR303Min);
        assertEquals(ConstraintedArtefact.METHOD_PARAMETER, contractElement.getConstraintedArtefact());
    }

    @Test
    public void testJsr303TargetPostcondition() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "TargetArtefacts.java"), collector);
        ContractElement contractElement = firstByKind(collector.getContractElements(), ConstraintType.JSR303Max);
        assertEquals(ConstraintedArtefact.METHOD, contractElement.getConstraintedArtefact());
    }

}
