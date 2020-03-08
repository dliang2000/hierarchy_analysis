package test.contractstudy.testdata.jsr303;

import javax.validation.constraints.*;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class Jsr303WildImportTestData {

    @Max(100)
    Integer max;

    @Min(value = 30)
    Integer min;

}
