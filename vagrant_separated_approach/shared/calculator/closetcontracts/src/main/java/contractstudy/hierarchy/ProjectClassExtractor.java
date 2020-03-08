package contractstudy.hierarchy;

import com.github.javaparser.ast.CompilationUnit;

/**
 * Extract information from single class.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class ProjectClassExtractor {

    /**
     * Read inheritance information of one  class.
     *
     * @param cu          class
     * @param classFinder parent classes finder.
     * @param cuName CU name
     * @throws Exception error
     */
    public ClassParents readInheritance(
            final CompilationUnit cu,
            final String cuName,
            final ClassFinder classFinder) throws Exception {

        InheritanceHierarchyVisitor visitor = new InheritanceHierarchyVisitor(cuName, classFinder);
        visitor.visit(cu, null);

        return visitor;
    }

    /**
     * Read single class.
     *
     * @param cu file.
     * @param cuName CU name
     * @return package and class
     * @throws Exception error
     */
    public ClassCoordinates readClass(
            final CompilationUnit cu,
            final String cuName) throws Exception {

        ClassDefinitionVisitor visitor = new ClassDefinitionVisitor(cuName);
        visitor.visit(cu, null);

        return visitor;
    }
}
