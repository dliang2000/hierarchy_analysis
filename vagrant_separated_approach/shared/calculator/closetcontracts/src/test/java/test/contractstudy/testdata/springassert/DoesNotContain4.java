package test.contractstudy.testdata.springassert;

// static import only what is needed
import static org.springframework.util.Assert.doesNotContain;

public class DoesNotContain4 {
	public static void foo() {
        doesNotContain("pool","pooh","not good");
	}
}
