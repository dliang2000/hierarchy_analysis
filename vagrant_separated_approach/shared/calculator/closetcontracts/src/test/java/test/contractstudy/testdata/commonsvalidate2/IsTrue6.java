package test.contractstudy.testdata.commonsvalidate2;

// don't import anything
// contract should not be detected ! 
// we add a method with the same name and descriptor so that this compiles

public class IsTrue6 {
	public static void foo(int i) {
		isTrue(i<0,"Parameter must be >=0");
	}

	private static void isTrue(boolean b, String string) {}
}
