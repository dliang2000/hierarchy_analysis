package test.contractstudy;

import contractstudy.ContractElement;
import org.junit.Test;

import contractstudy.scripts.CollectContracts;
import contractstudy.ConstraintCollector;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class TestJavaAssert {

    private static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/javaassert/");

    @Test
    public void testAssertWithMessage() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "JavaAsserts.java"),collector);

        ContractElement p = firstByMethodName(collector.getContractElements(), "assertMessage");

        assertNotNull("assert precondition does not exist", p);
        assertEquals("a != 0", p.getCondition());
        assertEquals("\"should not be zero\"", p.getAdditionalInfo());
    }

    @Test
    public void testAssertNoMessage() throws Exception {
        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "JavaAsserts.java"), collector);

        ContractElement p = firstByMethodName(collector.getContractElements(), "assertNoMessage");

        assertNotNull("assert precondition does not exist", p);
        assertEquals("a == 0", p.getCondition());
        assertEquals("-",p.getAdditionalInfo());
    }

    /**
     * Get first precondition with matching name.
     * @param methodName method name
     * @param preconditions preconditions to search in
     * @return precondition or null
     */
    public static ContractElement firstByMethodName(
            final List<ContractElement> preconditions,
            final String methodName) {

        ContractElement p = null;

        for (ContractElement precondition : preconditions) {
            // not precise finding, but ok for tests
            if (precondition.getMethodDeclaration().contains(methodName)) {
                p = precondition;
                break;
            }
        }

        return p;
    }

}
