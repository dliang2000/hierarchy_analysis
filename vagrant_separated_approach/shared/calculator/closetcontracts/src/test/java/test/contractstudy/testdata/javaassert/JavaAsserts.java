package test.contractstudy.testdata.javaassert;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class JavaAsserts {

    public static void assertMessage(int a) {
        assert a != 0 : "should not be zero";
    }

    public static void assertNoMessage(int a) {
        assert a == 0;
    }

}
