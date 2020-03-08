package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class NotNull {
	public static void foo(int i) {
		notEmpty("foo","string should not be null");
	}
}
