package test.contractstudy.testdata.commonsvalidate3;

// static import only what is NOT needed
// contract should not be detected ! 
// we add a method with the same name and descriptor so that this compiles
import static org.apache.commons.lang3.Validate.notEmpty;

public class IsTrue5 {
	public static void foo(int i) {
		isTrue(i<0,"Parameter must be >=0");
	}

	private static void isTrue(boolean b, String string) {}
}
