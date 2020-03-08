package test.contractstudy;

import contractstudy.ContractElement;
import contractstudy.ConstraintCollector;
import contractstudy.ConstraintType;
import contractstudy.scripts.CollectContracts;
import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Tests for findbugs annotations.
 * @author jens dietrich
 */
public class TestJetBrainsAnnotations {

    private static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/jetbrains/");

    @Test
    public void testAnnotationsDetected() throws Exception {

        ConstraintCollector collector = new ConstraintCollector();
        CollectContracts.analyse(new File(TEST_DATA_FOLDER, "Test.java"), collector);

        List<ContractElement> contractElements = collector.getContractElements();
        assertEquals(1, contractElements.size());

        ContractElement contractElement = contractElements.get(0);
        assertSame(ConstraintType.JetBrainsNotNull, contractElement.getKind());
        assertEquals(10, contractElement.getLineNo());
    }

}
