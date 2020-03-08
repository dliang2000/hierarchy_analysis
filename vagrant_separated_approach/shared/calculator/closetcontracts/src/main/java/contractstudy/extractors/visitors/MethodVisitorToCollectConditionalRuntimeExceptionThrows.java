package contractstudy.extractors.visitors;

import com.github.javaparser.ast.expr.Expression;
import com.github.javaparser.ast.expr.ObjectCreationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.ThrowStmt;
import contractstudy.ConstraintType;
import contractstudy.ExtractionListener;
import contractstudy.ContractElement;
import contractstudy.ProgramVersion;

/**
 * Visitor for method nodes in the AST.
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public class MethodVisitorToCollectConditionalRuntimeExceptionThrows extends AbstractMethodVisitor {
	
	public MethodVisitorToCollectConditionalRuntimeExceptionThrows(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName) {
		super(consumer, programName, version, cuName);
	}

	
	@Override
	public void visit(ThrowStmt n, Object arg) {
				
		// look for the following pattern: 
		// if (<condition>) throw new <exception>(<args>);
		
		if (n.getExpr() instanceof ObjectCreationExpr && (n.getParentNode() instanceof IfStmt || (n.getParentNode() instanceof BlockStmt && n.getParentNode().getParentNode() instanceof IfStmt))) {
			
			IfStmt condNode = n.getParentNode() instanceof BlockStmt?(IfStmt)n.getParentNode().getParentNode():(IfStmt)n.getParentNode();
			String condition = extractCondition(condNode);
			
			ObjectCreationExpr objCreationNode = (ObjectCreationExpr) n.getExpr();
			String excTypeName = objCreationNode.getType().getName();
			ConstraintType kind = getPreconditionTypeForExceptionName(excTypeName);
			
			if (kind!=null) {
				StringBuffer b = new StringBuffer();
				if (objCreationNode.getArgs()!=null) {
					for (Expression expr:objCreationNode.getArgs()) {
						if (b.length()>0) b.append(',');
						b.append(expr.toString());
					}
				}
				String additionalInfo = b.toString();
				
				ContractElement p = initConstraint();
				
				p.setProgramVersion(ProgramVersion.getOrCreate(programName,this.version));
				p.setCuName(this.cuName);
				p.setMethodDeclaration(this.methodDeclaration);
				p.setCondition(condition);
				p.setKind(kind);
				p.setLineNo(n.getBeginLine());
				p.setAdditionalInfo(additionalInfo);
				
				consumer.constraintFound(p);
			}
		}
		super.visit(n, arg);
	}

    private String extractCondition(IfStmt condNode) {
        String cond = condNode.getCondition().toStringWithoutComments();

        // if the parent is another conditional, prepend this
        if (condNode.getParentNode()!=null
                && condNode.getParentNode() instanceof BlockStmt
                && condNode.getParentNode().getParentNode() instanceof IfStmt) {
            String pcond = extractCondition(((IfStmt) condNode.getParentNode().getParentNode()));
            cond = pcond + " && " + cond;
        }

        return cond;
    }

    private static ConstraintType getPreconditionTypeForExceptionName(String excName) {
		// note that this can yield false results of classes with this name are imported from packages other than java.lang !
		if (excName.endsWith(IllegalArgumentException.class.getSimpleName())) return ConstraintType.CREIllegalArgumentException;
		else if (excName.endsWith(IllegalStateException.class.getSimpleName())) return ConstraintType.CREIllegalStateException;
		else if (excName.endsWith(NullPointerException.class.getSimpleName())) return ConstraintType.CRENullpointerException;
		else if (excName.endsWith(IndexOutOfBoundsException.class.getSimpleName())) return ConstraintType.CREIndexOutOfBoundsException;
		else if (excName.endsWith(UnsupportedOperationException.class.getTypeName())) return ConstraintType.CREUnsupportedOperationException;
		else return null;  // could be standard exception - do not report ! 
	}
    
}
