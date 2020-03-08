package test.contractstudy.testdata.guava;

// import class
import com.google.common.base.Preconditions;

public class CheckArgument1 {
	public static void foo(int i) {
		Preconditions.checkArgument(i<0,"Parameter must be >=0");
	}
}
