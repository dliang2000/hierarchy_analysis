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
 * Visitor for method nodes in the AST.
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public abstract class MethodVisitorToCollectCommonsValidateInvocations extends MethodVisitorToCollectInvocations {
	
	public MethodVisitorToCollectCommonsValidateInvocations(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName,
			StaticImportState importState,
			Collection<String> staticallyImportedMethodNames
			) {
		super(consumer, programName, version, cuName, importState, staticallyImportedMethodNames);

	}
	// look for patterns supported by both lang2 and lang3	
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
			if (name.equals("isTrue")) {
				p.setKind(ConstraintType.CommonsLangIsTrue);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("noNullElements")) {
				p.setKind(ConstraintType.CommonsLangNoNullElements);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("notEmpty")) {
				p.setKind(ConstraintType.CommonsLangNotEmpty);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("notNull")) {
				p.setKind(ConstraintType.CommonsLangNotNull);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
		}
	
		super.visit(callExpr, arg);
	}

	protected abstract boolean checkImports(String methodName,String scope) ;
	
    
}
