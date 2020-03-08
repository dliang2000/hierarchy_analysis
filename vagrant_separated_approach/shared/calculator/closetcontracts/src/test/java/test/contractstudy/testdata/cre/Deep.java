package test.contractstudy.testdata.cre;

public class Deep {
    public void foo1(int i) {
        if (i>0) {
            System.out.println("could work!");
            if (i != 42) {
                throw new IllegalArgumentException("This is not the answer!");
            }
        }
    }
}
