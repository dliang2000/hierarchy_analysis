package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class InclusiveBetween {
	public static void foo(int i) {
		inclusiveBetween(1,i,3,"some message");
	}
}
