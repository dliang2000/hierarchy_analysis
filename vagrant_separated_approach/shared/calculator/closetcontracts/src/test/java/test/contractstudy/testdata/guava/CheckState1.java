package test.contractstudy.testdata.guava;

// import all preconditions
import static com.google.common.base.Preconditions.*;

public class CheckState1 {
	int field = 42;
	public void foo(int i) {
		checkState(this.field==42,"Field value must be 42");
	}
}
