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
public class MethodVisitorToCollectGuavaPreconditionsInvocations extends MethodVisitorToCollectInvocations {
	
	public MethodVisitorToCollectGuavaPreconditionsInvocations(
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
		p.setMethodDeclaration(this.methodDeclaration);
		p.setLineNo(callExpr.getBeginLine());
		
		if (args.size()>0 && checkImports(name,scope,"Preconditions","com.google.common.base.Preconditions")) {
			if (name.equals("checkArgument")) {
				p.setKind(ConstraintType.GuavaPreconditionCheckArgument);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("checkState")) {
				p.setKind(ConstraintType.GuavaPreconditionCheckState);
				p.setCondition(args.get(0).toString());
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("checkElementIndex")) {
				p.setKind(ConstraintType.GuavaPreconditionElementIndex);
				p.setCondition("0<="+args.get(0)+"<"+args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("checkNotNull")) {
				p.setKind(ConstraintType.GuavaPreconditionNotNull);
				p.setCondition(args.get(0)+"!=null");
				p.setAdditionalInfo(encodeMessageArgs(args,1));
				consumer.constraintFound(p);
			}
			else if (name.equals("checkPositionIndex")) {
				p.setKind(ConstraintType.GuavaPreconditionPositionIndex);
				p.setCondition("0<="+args.get(0)+"<"+args.get(1));
				p.setAdditionalInfo(encodeMessageArgs(args,2));
				consumer.constraintFound(p);
			}
			else if (name.equals("checkPositionIndexes")) {
				p.setKind(ConstraintType.GuavaPreconditionPositionIndexes);
				p.setCondition("0<="+args.get(0)+"<="+args.get(1)+"<="+args.get(2));
				p.setAdditionalInfo(""); // there is no additional message arg
				consumer.constraintFound(p);
			}
		}	
		super.visit(callExpr, arg);
	}

}
