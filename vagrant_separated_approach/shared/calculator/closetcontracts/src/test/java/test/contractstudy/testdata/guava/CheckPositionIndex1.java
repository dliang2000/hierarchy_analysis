package test.contractstudy.testdata.guava;

// import all preconditions
import static com.google.common.base.Preconditions.*;

public class CheckPositionIndex1 {
	public void foo(int i) {
		checkPositionIndex(i,5,"must fit into an array of size 5");
	}
}
