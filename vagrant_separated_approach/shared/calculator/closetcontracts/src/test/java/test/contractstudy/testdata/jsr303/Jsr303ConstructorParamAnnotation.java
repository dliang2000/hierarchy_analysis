package test.contractstudy.testdata.jsr303;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class Jsr303ConstructorParamAnnotation {

    @Min(20)
    public Jsr303ConstructorParamAnnotation(@Max(10) Integer a) {
    }
}
