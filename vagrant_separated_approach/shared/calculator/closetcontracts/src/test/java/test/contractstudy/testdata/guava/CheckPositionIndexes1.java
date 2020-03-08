package test.contractstudy.testdata.guava;

// import all preconditions
import static com.google.common.base.Preconditions.*;

public class CheckPositionIndexes1 {
	public void foo(int i) {
		checkPositionIndexes(i,5,8);
	}
}
