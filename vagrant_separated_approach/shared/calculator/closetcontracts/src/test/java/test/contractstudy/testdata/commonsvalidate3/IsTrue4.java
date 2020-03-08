package test.contractstudy.testdata.commonsvalidate3;

// static import only what is needed
import static org.apache.commons.lang3.Validate.isTrue;

public class IsTrue4 {
	public static void foo(int i) {
		isTrue(i<0,"Parameter must be >=0");
	}
}
