package contractstudy.hierarchy;

import java.util.Set;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface InheritanceResolved {

    /**
     * Notify that an inheritance has been resolved.
     *
     * @param subClass subclass
     * @param parents parents.
     */
    void notify(ClassParents parents);

    /**
     * Notify a class encountered.
     * @param classCoordinates class.
     */
    void notify(ClassCoordinates classCoordinates);
}
