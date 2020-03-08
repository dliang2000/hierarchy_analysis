package test.contractstudy.testdata.commonsvalidate2;

import static org.apache.commons.lang.Validate.*;
import java.util.ArrayList;

public class NoNullElements {
	public static void foo(int i) {
		noNullElements(new ArrayList(10),"list should not have nulls");
	}
}
