package test.contractstudy.testdata.commonsvalidate2;

// import class
import org.apache.commons.lang.Validate;

public class IsTrue1 {
	public static void foo(int i) {
		Validate.isTrue(i<0,"Parameter must be >=0");
	}
}
