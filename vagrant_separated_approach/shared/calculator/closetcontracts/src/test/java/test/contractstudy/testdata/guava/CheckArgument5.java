package test.contractstudy.testdata.guava;

// static import only what is NOT needed
// contract should not be detected ! 
// we add a method with the same name and descriptor so that this compiles
import static com.google.common.base.Preconditions.checkNotNull;

public class CheckArgument5 {
	public static void foo(int i) {
		checkArgument(i<0,"Parameter must be >=0");
	}

	private static void checkArgument(boolean b, String string) {}
}
