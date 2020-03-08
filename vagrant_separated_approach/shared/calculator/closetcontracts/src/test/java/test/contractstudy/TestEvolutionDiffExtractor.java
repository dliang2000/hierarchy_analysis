package test.contractstudy;

import contractstudy.DiffRecord;
import contractstudy.EvolutionDiffExtractor;
import contractstudy.Preferences;
import contractstudy.scripts.CollectContracts;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Tests for @see EvolutionDiffExtractor.
 * @author jens dietrich
 */
public class TestEvolutionDiffExtractor {

    private static String defaultOutputFolder = null;
    private static String defaultDataFolder = null;

    @BeforeClass
    public static void setTestingEnvironment() throws Exception {
        defaultOutputFolder = Preferences.getOutputFolder();
        defaultDataFolder = Preferences.getDataFolder();
        Preferences.setSinglePref("output","src/test/resources/evolutiontests/out");
        Preferences.setSinglePref("data","src/test/resources/evolutiontests/data");

        CollectContracts.main(new String[]{});
    }

    @AfterClass
    public static void resetTestingEnvironment() {
        Preferences.setSinglePref("output",defaultOutputFolder);
        Preferences.setSinglePref("data",defaultDataFolder);
    }

//    @Test      // TODO causing NPE
    public void testDiffRecords() throws Exception {
        List<DiffRecord> diffRecords = new EvolutionDiffExtractor().extract();


        // print for easier debugging
        int counter = 1;
        for (DiffRecord diff:diffRecords) {
            System.out.println("Diff record " + (counter++));
            System.out.println("\t programversion1: " + diff.getProgramVersion1());
            System.out.println("\t compil. unit1: " + diff.getCu1());
            System.out.println("\t method1: " + diff.getMethodDecl1());
            System.out.println("\t constraints1: " + diff.getConstraints1());
            System.out.println("\t ----------------");
            System.out.println("\t programversion2: " + diff.getProgramVersion1());
            System.out.println("\t compil. unit2: " + diff.getCu2());
            System.out.println("\t method2: " + diff.getMethodDecl2());
            System.out.println("\t constraints2: " + diff.getConstraints2());
            System.out.println();
        }

        assertEquals(3,diffRecords.size());

        // detailed check
        DiffRecord diff1 = diffRecords.get(0);
        assertEquals("OneToOne.java",diff1.getCu1());
        assertEquals(1,diff1.getConstraints1().size());
        assertEquals(1,diff1.getConstraints2().size());

        DiffRecord diff2 = diffRecords.get(1);
        assertEquals("OneToZero.java",diff2.getCu1());
        assertEquals(1,diff2.getConstraints1().size());
        assertEquals(0,diff2.getConstraints2().size());

        DiffRecord diff3 = diffRecords.get(2);
        assertEquals("ZeroToOne.java",diff3.getCu1());
        assertEquals(0,diff3.getConstraints1().size());
        assertEquals(1,diff3.getConstraints2().size());
    }
}
