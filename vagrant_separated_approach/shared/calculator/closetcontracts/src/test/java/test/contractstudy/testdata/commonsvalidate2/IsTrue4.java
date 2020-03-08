package test.contractstudy.testdata.commonsvalidate2;

// static import only what is needed
import static org.apache.commons.lang.Validate.isTrue;

public class IsTrue4 {
	public static void foo(int i) {
		isTrue(i<0,"Parameter must be >=0");
	}
}
