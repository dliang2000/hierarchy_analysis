package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class NotBlank {
	public static void foo(int i) {
		notBlank("foo","some message");
	}
}
