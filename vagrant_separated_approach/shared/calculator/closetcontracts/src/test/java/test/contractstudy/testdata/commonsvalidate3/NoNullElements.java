package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;
import java.util.ArrayList;

public class NoNullElements {
	public static void foo(int i) {
		noNullElements(new ArrayList(10),"list should not have nulls");
	}
}
