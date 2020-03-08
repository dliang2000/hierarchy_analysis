package test.contractstudy.testdata.guava;

// static import only what is needed
import static com.google.common.base.Preconditions.checkArgument;

public class CheckArgument4 {
	public static void foo(int i) {
		checkArgument(i<0,"Parameter must be >=0");
	}
}
