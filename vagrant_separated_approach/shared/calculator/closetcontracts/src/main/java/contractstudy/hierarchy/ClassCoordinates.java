package contractstudy.hierarchy;

import java.util.Set;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface ClassCoordinates {

    String getPackageName();

    String getClassSimpleName();

    String getClassName();

    String getCuName();

    /**
     *
     * @return inner classes
     */
    Set<ClassCoordinates> getInnerClasses();

    /**
     * Return methods for this class, excluding inner classes.
     * @return methods.
     */
    Set<String> getMethods();

}
