package contractstudy.hierarchy;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface ClassFinder {

    /**
     * Find a class.
     *
     * @param simpleClassName simple class name
     * @param packages package filter, in essence packages imported in a class
     * @return a file containing the class.
     */
    ClassAndVersion findClass(String simpleClassName, String[] packages);
}
