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
public class MethodVisitorToCollectSpringAssertInvocations extends MethodVisitorToCollectInvocations {

	public MethodVisitorToCollectSpringAssertInvocations(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName,
			StaticImportState importState,
			Collection<String> staticallyImportedMethodNames
			) {
		super(consumer, programName, version, cuName, importState, staticallyImportedMethodNames);
	}

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
		
		if (args.size()>0 && checkImports(name,scope,"Assert","org.springframework.util.Assert")) {
			if (name.equals("doesNotContain")) {
				p.setKind(ConstraintType.SpringAssertDoesNotContain);
				p.setCondition("!" + args.get(0)+".contains(" + args.get(1) + ")");
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
            else if (name.equals("hasLength")) {
                p.setKind(ConstraintType.SpringAssertHasLength);
                p.setCondition(args.get(0)+"!=null && " + args.get(0)+".length()>0");
                p.setAdditionalInfo(encodeMessageArgs(args,1));
                consumer.constraintFound(p);
            }
            else if (name.equals("hasText")) {
                p.setKind(ConstraintType.SpringAssertHasText);
                p.setCondition(args.get(0)+".length()>0 && contains some none-whitespaces");
                p.setAdditionalInfo(encodeMessageArgs(args,1));
                consumer.constraintFound(p);
            }
			else if (name.equals("notEmpty")) {
				p.setKind(ConstraintType.SpringAssertNotEmpty);
				p.setCondition(args.get(0) + ".size>0");
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("noNullElements")) {
				p.setKind(ConstraintType.SpringAssertNoNullElements);
				p.setCondition(args.get(0)+" does not contain nulls");
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
            else if (name.equals("isNull")) {
                p.setKind(ConstraintType.SpringAssertIsNull);
                p.setCondition(args.get(0)+" == null");
                p.setAdditionalInfo(encodeMessageArgs(args,1));
                consumer.constraintFound(p);
            }
            else if (name.equals("notNull")) {
                p.setKind(ConstraintType.SpringAssertNotNull);
                p.setCondition(args.get(0)+" != null");
                p.setAdditionalInfo(encodeMessageArgs(args,1));
                consumer.constraintFound(p);
            }
			else if (name.equals("isInstanceOf")) {
				p.setKind(ConstraintType.SpringIsInstanceOf);
				p.setCondition(args.get(1)+" instanceOf " + args.get(0));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("isAssignable")) {
				p.setKind(ConstraintType.SpringIsAssignable);
				p.setCondition("0<="+args.get(0)+"<"+args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("state")) {
				p.setKind(ConstraintType.SpringAssertState);
				p.setCondition(args.get(0).toString());
                p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
            else if (name.equals("isTrue")) {
                p.setKind(ConstraintType.SpringAssertIsTrue);
                p.setCondition(args.get(0).toString());
                p.setAdditionalInfo(encodeMessageArgs(args,1));
                consumer.constraintFound(p);
            }
		}	
		super.visit(callExpr, arg);
	}

}
