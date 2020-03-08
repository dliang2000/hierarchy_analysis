package test.contractstudy.testdata.jsr303;

// import javax.validation.constraints.Min;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * Uses the same annotation is different places.
 * @author jens dietrich
 */
public class TargetArtefacts {

    @Size(min=1,max=40) int somestring;

    @Max(-42) public int negate (@Min(42) int i) {
        return -1;
    }

}
