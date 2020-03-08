package test.contractstudy.testdata.springassert;

// static import only what is NOT needed
// contract should not be detected ! 
// we add a method with the same name and descriptor so that this compiles

public class DoesNotContain5 {
	public static void foo() {
        doesNotContain("pool","pooh","not good");
	}

	private static void doesNotContain(String s1,String s2,String s3) {}
}
