package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class ValidState {
	public static void foo(int i) {
		validState(i==42,"some message");
	}
}
