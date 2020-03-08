package contractstudy.extractors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.Extractor;
import contractstudy.extractors.visitors.MethodVisitorToCollectSpringAssertInvocations;
import contractstudy.extractors.visitors.StaticImportCollector;

import java.io.InputStream;

/**
 * Extractor to find calls of the org.springframework.util.Assert API methods in source code.
 * @author jens dietrich
 */
public class SpringAssertExtractor implements Extractor<ContractElement>{
	
	@Override
	public void analyse(InputStream in,String programName,String version,String cuName,ExtractionListener<ContractElement> consumer) throws Exception {
    	try {
	    	CompilationUnit  cu = JavaParser.parse(in);
	    	StaticImportCollector staticCollector = new StaticImportCollector("org.springframework.util","org.springframework.util.Assert");
	    	staticCollector.visit(cu,null);
	    	
	    	new MethodVisitorToCollectSpringAssertInvocations(consumer,programName,version,cuName,staticCollector.getStaticImportState(),staticCollector.getStaticallyImportedMethodNames()).visit(cu, null);
    	}
    	catch (Exception t) {
    		consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
    	}
	}
	
}
