package contractstudy.extractors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import contractstudy.*;
import contractstudy.extractors.visitors.StaticImportCollector;
import contractstudy.extractors.visitors.StaticImportState;
import contractstudy.extractors.visitors.VisitorToCollectAnnotations;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Abstract annotation extractor based on Kamil's JSR303 extractor.
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class AbstractAnnotationExtractor implements Extractor<ContractElement>  {

    private Map<String, ConstraintType> constraintsByName = new HashMap<>();

    // the prefix for the respective constraint types as defined in ConstraintType
    private String constraintTypePrefix = null;

    // package where the annotations are defined
    private String annotationPackageName = null;


    public AbstractAnnotationExtractor(String constraintTypePrefix, String annotationPackageName) {
        this.constraintTypePrefix = constraintTypePrefix;
        this.annotationPackageName = annotationPackageName;

        for (ConstraintType p : ConstraintType.values()) {
            String name = p.name();
            if (name.startsWith(constraintTypePrefix)) {
                constraintsByName.put(name.substring(constraintTypePrefix.length(), name.length()), p);
            }
        }
    }

    @Override
    public void analyse(
            final InputStream in,
            final String programName,
            final String version,
            final String cuName,
            final ExtractionListener<ContractElement> consumer) throws Exception {

        try {
            CompilationUnit cu = JavaParser.parse(in);
            StaticImportCollector importsCollector = new StaticImportCollector(annotationPackageName, "");
            importsCollector.visit(cu, null);
            StaticImportState importState = importsCollector.getStaticImportState();
            VisitorToCollectAnnotations visitor = new VisitorToCollectAnnotations(consumer,programName,version,cuName,importState, constraintsByName);
            visitor.visit(cu, null);
        } catch (Error | Exception e) {
        	consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,e);
        }
    }


}
