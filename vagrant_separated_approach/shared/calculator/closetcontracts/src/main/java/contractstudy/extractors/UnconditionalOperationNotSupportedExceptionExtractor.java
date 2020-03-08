package contractstudy.extractors;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.Extractor;
import contractstudy.extractors.visitors.MethodVisitorToCollectUnconditionalUnsupportedOperationExceptionThrows;

import java.io.InputStream;

/**
 * Extractor to find simple patterns "if (<condition>) throw new <SomeException>" in source code. 
 * @author jens dietrich
 */
public class UnconditionalOperationNotSupportedExceptionExtractor implements Extractor<ContractElement>{
	
	@Override
	public void analyse(InputStream in,String programName,String version,String cuName,ExtractionListener<ContractElement> consumer) throws Exception {
    	try {
	    	CompilationUnit  cu = JavaParser.parse(in);
	    	new MethodVisitorToCollectUnconditionalUnsupportedOperationExceptionThrows(consumer,programName,version,cuName).visit(cu, null);
    	}
    	catch (Exception t) {
    		consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
    	}
	}
}
