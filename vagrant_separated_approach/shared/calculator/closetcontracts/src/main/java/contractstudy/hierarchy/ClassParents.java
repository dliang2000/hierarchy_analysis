package contractstudy.hierarchy;

import java.util.Set;

/**
 * Interface to get parents of a class.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface ClassParents extends ClassCoordinates {

    /**
     * Return parents for class names.
     * @param className class name, may be an inner class
     * @return parents - a set of class and origins (original location).
     */
    Set<ClassAndVersion> getParents(String className);

}
