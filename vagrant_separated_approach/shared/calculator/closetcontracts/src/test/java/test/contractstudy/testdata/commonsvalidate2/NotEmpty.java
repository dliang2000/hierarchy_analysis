package test.contractstudy.testdata.commonsvalidate2;

import static org.apache.commons.lang.Validate.*;
import java.util.ArrayList;

public class NotEmpty {
	public static void foo(int i) {
		notEmpty(new ArrayList(10),"list should not be empty");
	}
}
