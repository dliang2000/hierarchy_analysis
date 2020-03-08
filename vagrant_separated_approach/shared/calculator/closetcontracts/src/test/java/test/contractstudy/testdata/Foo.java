package test.contractstudy.testdata;

public class Foo {
	public void foo(int i) {
		if (i==42) throw new IllegalArgumentException("i must be magic");
	}
}
