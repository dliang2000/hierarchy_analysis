package contractstudy.extractors.visitors;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.expr.MarkerAnnotationExpr;
import com.github.javaparser.ast.expr.NormalAnnotationExpr;
import com.github.javaparser.ast.expr.SingleMemberAnnotationExpr;
import contractstudy.*;
import contractstudy.ContractElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Generic visitor to collect annotations. Based on the visitor developed by Kamil for JSR303 extraction.
 * @author kamil jezek
 */
@SuppressWarnings("rawtypes")
public class VisitorToCollectAnnotations extends AbstractMethodVisitor {


    private StaticImportState importState = null;
    private Map<String, ConstraintType> map = new HashMap<>();

    public VisitorToCollectAnnotations(ExtractionListener<ContractElement> consumer, String programName, String version, String cuName, StaticImportState importState, Map<String, ConstraintType> map) {
        super(consumer, programName, version, cuName);

        this.importState = importState;
        this.map = map;
    }

    @Override
    public void visit(NormalAnnotationExpr n, Object arg) {
        String name = n.getName().getName();
        ConstraintType constraintType = map.get(name);
        if (constraintType != null && importState == StaticImportState.CLASS) {
            String condition = n.getPairs().toString();
            ConstraintedArtefact artefact = getConstraintArtefact(n);
            ContractElement p = create(ProgramVersion.getOrCreate(programName, version), cuName, constraintType, condition, n.getBeginLine(), artefact);
            consumer.constraintFound(p);
        }
        super.visit(n, arg);
    }

    @Override
    public void visit(SingleMemberAnnotationExpr n, Object arg) {
        String name = n.getName().getName();
        ConstraintType constraintType = map.get(name);
        if (constraintType==null) {
            // rule useful if nested annotations like JdkConstants.AdjustableOrientation are used
            // (example from org.intellij.lang.annotations)
            constraintType = map.get(name.replace('.','_'));
        }
        if (constraintType != null && importState == StaticImportState.CLASS) {
            String condition = n.getMemberValue().toStringWithoutComments();
            ConstraintedArtefact artefact = getConstraintArtefact(n);
            ContractElement p = create(ProgramVersion.getOrCreate(programName, version), cuName, constraintType, condition, n.getBeginLine(), artefact);
            consumer.constraintFound(p);
        }
        super.visit(n, arg);
    }

    @Override
    public void visit(MarkerAnnotationExpr n, Object arg) {

        String name = n.getName().getName();
        ConstraintType constraintType = map.get(name);
        if (constraintType != null && importState == StaticImportState.CLASS) {
            ConstraintedArtefact artefact = getConstraintArtefact(n);
            ContractElement p = create(ProgramVersion.getOrCreate(programName, version), cuName, constraintType, "", n.getBeginLine(), artefact);
            consumer.constraintFound(p);
        }
        super.visit(n, arg);
    }

    private ContractElement create(ProgramVersion programVersion, String cuName, ConstraintType constraintType, String condition, int beginLine, ConstraintedArtefact artefact) {
        ContractElement p = initConstraint();
        p.setProgramVersion(programVersion);
        p.setCuName(cuName);
        p.setCondition(condition);
        p.setKind(constraintType);
        p.setLineNo(beginLine);
        p.setAdditionalInfo(null);
        p.setConstraintedArtefact(artefact);
        return p;
    }

    private ConstraintedArtefact getConstraintArtefact(AnnotationExpr annotationNode) {
        Node node = annotationNode.getParentNode();
        if (node instanceof MethodDeclaration) {
            return ConstraintedArtefact.METHOD;
        }
        else if (node instanceof Parameter) {
            return ConstraintedArtefact.METHOD_PARAMETER;
        }
        else {
            return ConstraintedArtefact.CLASS;
        }
    }
}
