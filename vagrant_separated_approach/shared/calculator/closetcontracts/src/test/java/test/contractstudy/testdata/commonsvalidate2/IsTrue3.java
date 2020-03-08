package test.contractstudy.testdata.commonsvalidate2;

// static import all
import static org.apache.commons.lang.Validate.*;

public class IsTrue3 {
	public static void foo(int i) {
		isTrue(i<0,"Parameter must be >=0");
	}
}
