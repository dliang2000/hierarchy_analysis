package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class IsAssignableFrom {
	public static void foo(int i) {
		isAssignableFrom(Object.class,String.class,"some message");
	}
}
