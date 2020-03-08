package test.contractstudy.testdata.guava;

// don't import anything
// contract should not be detected ! 
// we add a method with the same name and descriptor so that this compiles

public class CheckArgument6 {
	public static void foo(int i) {
		checkArgument(i<0,"Parameter must be >=0");
	}

	private static void checkArgument(boolean b, String string) {}
}
