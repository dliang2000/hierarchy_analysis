package contractstudy.hierarchy;

import com.github.javaparser.ast.CompilationUnit;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;
import contractstudy.ProgramVersion;

/**
 * Simple data collector that at the and produces the class finder.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class ClassFinderCreator {

    /** key - simple class name, value - package */
    private Multimap<String, String> classPcgs = HashMultimap.create();

    /** value - full class name, key - class origin */
    private Multimap<String, ProgramVersion> classOrigin = HashMultimap.create();

    /** Key -class name, origin,  valu - CU*/
    private Table<ClassCoordinates, ProgramVersion, CompilationUnit> cus = HashBasedTable.create();

    /** Key -class name, origin,  valu - CU name*/
    private Table<String, ProgramVersion, String> cuNames = HashBasedTable.create();


    public ClassFinderCreator() {
    }

    public ClassFinderCreator(ClassFinderCreator globalCreator) {
        this.classOrigin = HashMultimap.create(globalCreator.classOrigin);
        this.classPcgs = HashMultimap.create(globalCreator.classPcgs);
        this.cus = HashBasedTable.create(globalCreator.cus);
        this.cuNames = HashBasedTable.create(globalCreator.cuNames);
    }

    public void add(
            final ProgramVersion programVersion,
            final ClassCoordinates classCoordinates,
            final CompilationUnit cu,
            final String cuName) {

        classPcgs.put(classCoordinates.getClassSimpleName(), classCoordinates.getPackageName());
        classOrigin.put(classCoordinates.getClassName(), programVersion);
        cus.put(classCoordinates, programVersion, cu);
        cuNames.put(classCoordinates.getClassName(), programVersion, cuName);
    }

    public ClassFinder toFinder() {
        return new SourceClassFinder(classPcgs, classOrigin, cuNames);
    }

    public Table<ClassCoordinates, ProgramVersion, CompilationUnit> getCus() {
        return cus;
    }

}
