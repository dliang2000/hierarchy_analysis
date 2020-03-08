package contractstudy.extractors.visitors;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import contractstudy.ConstraintType;
import contractstudy.ExtractionListener;
import contractstudy.ContractElement;
import contractstudy.ProgramVersion;

import java.util.Collection;
import java.util.List;

import static contractstudy.extractors.visitors.Utils.encodeMessageArgs;

/**
 * Visitor for method nodes in the AST. Used to extract API calls to 
 * org.apache.commons.lang.Validate.
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public class MethodVisitorToCollectCommons2ValidateInvocations extends MethodVisitorToCollectCommonsValidateInvocations {
	
	public MethodVisitorToCollectCommons2ValidateInvocations(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName,
			StaticImportState importState,
			Collection<String> staticallyImportedMethodNames
			) {
		super(consumer, programName, version, cuName, importState, staticallyImportedMethodNames);

	}
	// look for patterns only supported by lang2	
	@Override
	public void visit(MethodCallExpr callExpr, Object arg) {
		String name = callExpr.getName();
		Expression expr = callExpr.getScope();
		String scope = expr==null?null:expr.toString();
		List<Expression> args = callExpr.getArgs();
		ContractElement p = initConstraint();
		p.setProgramVersion(ProgramVersion.getOrCreate(programName,this.version));
		p.setCuName(this.cuName);
		p.setMethodDeclaration(this.methodDeclaration);
		p.setLineNo(callExpr.getBeginLine());
		
		if (args.size()>0 && checkImports(name,scope)) {
			if (name.equals("allElementsOfType")) {
				p.setKind(ConstraintType.CommonsLang2AllElementsOfType);
				p.setCondition("all of " + args.get(0).toString() + " instanceOf " + args.get(1).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
		}
	
		super.visit(callExpr, arg);
	}

	protected boolean checkImports(String methodName,String scope) {
		return checkImports(methodName,scope,"Validate","org.apache.commons.lang.Validate");
	}
	
    
}
