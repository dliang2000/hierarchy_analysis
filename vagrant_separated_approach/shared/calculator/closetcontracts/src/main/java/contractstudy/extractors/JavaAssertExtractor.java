package contractstudy.extractors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.Extractor;
import contractstudy.extractors.visitors.JavaAssertVisitor;

import java.io.InputStream;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class JavaAssertExtractor implements Extractor<ContractElement> {

    @Override
    public void analyse(
            final InputStream in,
            final String programName,
            final String version,
            final String cuName,
            final ExtractionListener<ContractElement> consumer) throws Exception {

                try {
                    CompilationUnit cu = JavaParser.parse(in);
                    new JavaAssertVisitor(programName, version, cuName, consumer).visit(cu, null);
                } catch (Error | Exception e) {
                	consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,e);
                }

    }

}
