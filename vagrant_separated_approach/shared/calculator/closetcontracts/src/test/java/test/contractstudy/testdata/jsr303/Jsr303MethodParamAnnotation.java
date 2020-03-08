package test.contractstudy.testdata.jsr303;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class Jsr303MethodParamAnnotation {

    @Min(20)
    public int method(@Max(10) Integer a) {
        return 10;
    }
}
