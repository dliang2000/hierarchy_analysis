package contractstudy.extractors.visitors;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.MethodCallExpr;
import contractstudy.ConstraintType;
import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.ProgramVersion;

import java.util.Collection;
import java.util.List;

import static contractstudy.extractors.visitors.Utils.encodeMessageArgs;

/**
 * Visitor for method nodes in the AST. Used to extract API calls to 
 * org.apache.commons.lang3.Validate.
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public class MethodVisitorToCollectCommons3ValidateInvocations extends MethodVisitorToCollectCommonsValidateInvocations {
	
	public MethodVisitorToCollectCommons3ValidateInvocations(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName,
			StaticImportState importState,
			Collection<String> staticallyImportedMethodNames
			) {
		super(consumer, programName, version, cuName, importState, staticallyImportedMethodNames);

	}
	// look for patterns common in COMMON in lang2 and lang3	
	@Override
	public void visit(MethodCallExpr callExpr, Object arg) {
		String name = callExpr.getName();
		Expression expr = callExpr.getScope();
		String scope = expr==null?null:expr.toString();
		List<Expression> args = callExpr.getArgs();
		ContractElement p = initConstraint();
		p.setProgramVersion(ProgramVersion.getOrCreate(programName,this.version));
		p.setCuName(this.cuName);
		p.setLineNo(callExpr.getBeginLine());
		
		if (args.size()>0 && checkImports(name,scope)) {
			if (name.equals("exclusiveBetween")) {
				p.setKind(ConstraintType.CommonsLang3ExclusiveBetween);
				p.setCondition(args.get(0) +" < " + args.get(2) + " < " + args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,3));
				consumer.constraintFound(p);
			}
			else if (name.equals("inclusiveBetween")) {
				p.setKind(ConstraintType.CommonsLang3InclusiveBetween);
				p.setCondition(args.get(0) +" <= " + args.get(2) + " <= " + args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,3));
				consumer.constraintFound(p);
			}
			else if (name.equals("isAssignableFrom")) {
				p.setKind(ConstraintType.CommonsLang3IsAssignableFrom);
				p.setCondition(args.get(1) +" subtypeOf " + args.get(0));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("matchesPattern")) {
				p.setKind(ConstraintType.CommonsLang3MatchesPattern);
				p.setCondition(args.get(0) +" matches " + args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("isInstanceOf")) {
				p.setKind(ConstraintType.CommonsLang3IsInstanceOf);
				p.setCondition(args.get(1) +" instanceof " + args.get(0));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("notBlank")) {
				p.setKind(ConstraintType.CommonsLang3NotBlank);
				p.setCondition(args.get(0) +" is not blank");
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("validIndex")) {
				p.setKind(ConstraintType.CommonsLang3ValidIndex);
				p.setCondition(args.get(1) +" is valid index in " + args.get(0));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("validState")) {
				p.setKind(ConstraintType.CommonsLang3ValidState);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
		}

		super.visit(callExpr, arg);
	}

	protected boolean checkImports(String methodName,String scope) {
		return checkImports(methodName,scope,"Validate","org.apache.commons.lang3.Validate");
	}
	
    
}
