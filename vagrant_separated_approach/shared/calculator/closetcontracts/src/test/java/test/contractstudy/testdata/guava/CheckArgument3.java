package test.contractstudy.testdata.guava;

// static import all
import static com.google.common.base.Preconditions.*;

public class CheckArgument3 {
	public static void foo(int i) {
		checkArgument(i<0,"Parameter must be >=0");
	}
}
