package contractstudy.extractors.visitors;

import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.PackageDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ModifierSet;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import contractstudy.ContractElement;
import contractstudy.ExtractionListener;
import contractstudy.Preferences;

/**
 * Abstract superclass for visitors for method nodes in the AST, used to collect invocations of API methods
 * @author jens dietrich
 */
@SuppressWarnings("rawtypes")
public abstract class AbstractMethodVisitor extends VoidVisitorAdapter<Object> {

	private String packageName;
	protected ExtractionListener<ContractElement> consumer = null;
	protected String programName = null;
	protected String version = null;
	protected String cuName = null;
	protected String methodDeclaration = null;
	private boolean isAbstractMethod = false;
	private boolean isInterface = false;
	private boolean isDefaultMethod = false;
    private boolean includePrivateMethods = Preferences.includePrivateMethods();

	public AbstractMethodVisitor(
			ExtractionListener<ContractElement> consumer,
			String programName,
			String version,
			String cuName
			) {
		super();
		this.consumer = consumer;
		this.programName = programName;
		this.version = version;
		this.cuName = cuName;
	}


	@Override
	public void visit(ClassOrInterfaceDeclaration n, Object arg) {

		this.isInterface = n.isInterface();

		super.visit(n, arg);
	}

	@Override
	public void visit(PackageDeclaration n, Object arg) {
		packageName = n.getPackageName();
		super.visit(n, arg);
	}


	// control the methods being visited
	@Override
	public void visit(MethodDeclaration methodDeclr, Object arg) {
		int modifiers = methodDeclr.getModifiers();
		isDefaultMethod = methodDeclr.isDefault();
		isAbstractMethod = ModifierSet.isAbstract(modifiers);
		if (includePrivateMethods || isInterface || ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
			this.methodDeclaration = Utils.trimRetType(methodDeclr.getDeclarationAsString(false, false, false)); // flags: incl modifiers , incl throws
			super.visit(methodDeclr, arg);
		}
	}
	
	@Override
	public void visit(ConstructorDeclaration constructorDeclr, Object arg) {
        int modifiers = constructorDeclr.getModifiers();
		isDefaultMethod = false;
		isAbstractMethod = false;
        if (includePrivateMethods || isInterface || ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
            this.methodDeclaration = constructorDeclr.getDeclarationAsString(false, false, false);
            super.visit(constructorDeclr, arg);
        }
	}


	protected boolean computeAbstractMethod() {
		return (isInterface && !isDefaultMethod) || isAbstractMethod;
	}

	protected ContractElement initConstraint() {
		ContractElement p = new ContractElement();
		p.setMethodAbstract(computeAbstractMethod());
		p.setMethodDeclaration(methodDeclaration);

		return p;
	}

	/**
	 * Find owner class of a node.
	 *
	 * @param node a node
	 * @return class owenr includding inner classes - e.g.  Foo.Inner.XY
	 */
	protected String findOwner(Node node) {
		Node parent = node;

		final String separator = ".";
		String owner = "";

		while (parent != null) {

			if (parent instanceof ClassOrInterfaceDeclaration) {
				String name = ((ClassOrInterfaceDeclaration) parent).getName();
				owner = name + separator + owner;
			}

            if (parent instanceof EnumDeclaration) {
                String name = ((EnumDeclaration) parent).getName();
                owner = name + separator + owner;
            }

			parent = parent.getParentNode();
		}

		if (owner.endsWith(".")) {
			owner = owner.substring(0,  owner.lastIndexOf(separator));
		}

		return packageName + "." + owner;
	}


	public String getCuName() {
		return cuName;
	}

	public String getPackageName() {
		return packageName;
	}
}
