package test.contractstudy.testdata.guava;

// import all preconditions
import static com.google.common.base.Preconditions.*;

public class CheckState2 {
	int field = 42;
	public void foo(int i) {
		checkState(this.field==42);
	}
}
