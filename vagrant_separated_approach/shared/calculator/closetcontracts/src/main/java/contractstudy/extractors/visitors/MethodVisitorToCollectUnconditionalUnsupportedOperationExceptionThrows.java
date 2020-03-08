package contractstudy.extractors.visitors;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.ThrowStmt;
import contractstudy.ContractElement;
import contractstudy.ConstraintType;
import contractstudy.ExtractionListener;
import contractstudy.ProgramVersion;

/**
 * Visitor for method nodes in the AST, used to extract unconditional throws of
 * UnsupportedOperationException.
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public class MethodVisitorToCollectUnconditionalUnsupportedOperationExceptionThrows extends AbstractMethodVisitor {

	public MethodVisitorToCollectUnconditionalUnsupportedOperationExceptionThrows(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName) {
		super(consumer, programName, version, cuName);
	}

	@Override
	public void visit(ThrowStmt n, Object arg) {

        ObjectCreationExpr objCreationNode = (ObjectCreationExpr) n.getExpr();
        StringBuffer b = new StringBuffer();
        if (objCreationNode.getArgs()!=null) {
            for (Expression expr:objCreationNode.getArgs()) {
                if (b.length()>0) b.append(',');
                b.append(expr.toString());
            }
        }
        String additionalInfo = b.toString();

        String excTypeName = objCreationNode.getType().getName();

		
		if (excTypeName.endsWith(UnsupportedOperationException.class.getSimpleName()) && n.getExpr() instanceof ObjectCreationExpr && (n.getParentNode() instanceof IfStmt || (n.getParentNode() instanceof BlockStmt && n.getParentNode().getParentNode() instanceof MethodDeclaration))) {
            ContractElement p = initConstraint();
            p.setProgramVersion(ProgramVersion.getOrCreate(programName,this.version));
            p.setCuName(this.cuName);
            p.setCondition(null);
            p.setKind(ConstraintType.UCREUnsupportedOperationException);
            p.setLineNo(n.getBeginLine());
            p.setAdditionalInfo(additionalInfo);
            consumer.constraintFound(p);
		}
		super.visit(n, arg);
	}

}
