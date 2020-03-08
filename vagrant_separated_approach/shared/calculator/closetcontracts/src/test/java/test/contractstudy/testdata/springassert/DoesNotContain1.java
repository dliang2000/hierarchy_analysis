package test.contractstudy.testdata.springassert;

// import class
import org.springframework.util.Assert;

public class DoesNotContain1 {
	public static void foo() {
		Assert.doesNotContain("pool","pooh","not good");
	}
}
