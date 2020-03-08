package test.contractstudy.testdata.commonsvalidate3;

import static org.apache.commons.lang3.Validate.*;
import java.util.ArrayList;

public class NotEmpty {
	public static void foo(int i) {
		notEmpty(new ArrayList(10),"list should not be empty");
	}
}
