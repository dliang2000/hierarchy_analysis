package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class IsInstanceOf {
	public static void foo(int i) {
		isInstanceOf(Object.class,"foo","some message");
	}
}
