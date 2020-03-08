package contractstudy.extractors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.Extractor;
import contractstudy.extractors.visitors.MethodVisitorToCollectCommons3ValidateInvocations;
import contractstudy.extractors.visitors.StaticImportCollector;

import java.io.InputStream;

/**
 * Extractor for the commons validate API v3.
 * @author jens dietrich
 */
public class CommonsValidate3Extractor implements Extractor<ContractElement>{
	
	@Override
	public void analyse(InputStream in,String programName,String version,String cuName,ExtractionListener<ContractElement> consumer) throws Exception {
    	try {
	    	CompilationUnit  cu = JavaParser.parse(in);
	    	StaticImportCollector staticCollector = new StaticImportCollector("org.apache.commons.lang3","org.apache.commons.lang3.Validate");
	    	staticCollector.visit(cu,null);
	    	new MethodVisitorToCollectCommons3ValidateInvocations(consumer,programName,version,cuName,staticCollector.getStaticImportState(),staticCollector.getStaticallyImportedMethodNames()).visit(cu, null);
    	}
    	catch (Exception t) {
    		consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
    	}
	}
	
}
