package test.contractstudy.testdata.guava;

// import all preconditions
import static com.google.common.base.Preconditions.*;

public class CheckNotNull1 {
	public void foo(Object obj) {
		checkNotNull(obj,"the argument should not be null");
	}
}
