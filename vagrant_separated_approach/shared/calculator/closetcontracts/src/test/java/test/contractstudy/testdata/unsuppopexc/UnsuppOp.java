package test.contractstudy.testdata.unsuppopexc;

public class UnsuppOp {

    public void foo1() {
        throw new UnsupportedOperationException("foo1 is not supported");
    }

    public void foo2() {
        // some comment here
        throw new UnsupportedOperationException("foo2 is not supported");
    }

    // should not be detected!
    public void foo3() {
        throw new IllegalStateException("foo3 is not supported");
    }
}
