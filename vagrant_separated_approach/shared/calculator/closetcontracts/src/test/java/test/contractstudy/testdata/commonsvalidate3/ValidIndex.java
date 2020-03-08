package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class ValidIndex {
	public static void foo(int i) {
		validIndex(new String[]{},42,"some message");
	}
}
