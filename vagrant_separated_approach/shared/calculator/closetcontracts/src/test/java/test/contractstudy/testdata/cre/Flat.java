package test.contractstudy.testdata.cre;

public class Flat {
	public static void foo1(int i) {
		if (i<0) throw new IllegalArgumentException("Parameter must be >=0");
		System.out.println("foo1 called");
	}
	
	public static void foo2(int i) {
		if (i<0) {
			throw new IllegalArgumentException("Parameter must be >=0");
		}
		System.out.println("foo1 called");
	}
	
}
