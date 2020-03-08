package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;

public class ExclusiveBetween {
	public static void foo(int i) {
		exclusiveBetween(1,i,3,"some message");
	}
}
