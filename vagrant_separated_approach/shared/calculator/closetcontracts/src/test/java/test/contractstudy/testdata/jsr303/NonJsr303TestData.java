package test.contractstudy.testdata.jsr303;

import net.sf.oval.constraint.NotNull;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class NonJsr303TestData {

    // This is not JSR annotation (different package)
    @NotNull
    String notJSR;

}
