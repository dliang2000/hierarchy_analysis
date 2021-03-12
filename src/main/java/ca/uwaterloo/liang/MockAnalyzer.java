package ca.uwaterloo.liang;

import java.io.*;
import java.util.*;

import soot.SootMethod;
import soot.Unit;
import soot.Value;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.util.*;

public class MockAnalyzer {
    
    public static final String EasyMock_library = "org.easymock.EasyMock";
    public static final String Mockito_library = "org.mockito.Mockito";
    public static final String PowerMock_library = "org.powermock.api.mockito";
    
    
    public static boolean isMock( CallGraph cg, Unit u) {
        if (isWrapperMock(cg, u)) {
            System.out.println("The object is a mock created through a wrapper.");
            return true;
        } else if (isImmediateMock(u)) {
            System.out.println("The object is an immediate mock.");
            return true;
        }       
        return false;
    }
    
    // This function checks if the unit is a mock created through a wrapper
    private static boolean isWrapperMock(CallGraph cg, Unit u) {
        Stmt s = (Stmt) u;
        if (isAssignStmtWithInvokeExpr(s)) {
            Iterator<Edge> iter_out = cg.edgesOutOf(s.getInvokeExpr().getMethod());
            while (iter_out.hasNext()) {
                Edge out = (Edge) iter_out.next();
                SootMethod tgtMethod = out.tgt();
                String declaringClassName = tgtMethod.getDeclaringClass().toString();
                if (isMockLibrary(declaringClassName)) {
                    System.out.println("The object is a mock created through a wrapper.");
                    return true;
                }
            }
        }
        return false;
    }
    
    // This function checks if the unit is an immediate mock.
    private static boolean isImmediateMock(Unit u) {
        Stmt s = (Stmt) u;
            
        if (isAssignStmtWithInvokeExpr(s)) {
            String declaringClassName = s.getInvokeExpr().getMethod().getDeclaringClass().toString();
            if (isMockLibrary(declaringClassName)) {
                System.out.println("The object is an immediate mock.");
                return true;
            }
        }
        return false;
    }
    
    private static boolean isAssignStmtWithInvokeExpr(Stmt s) {
        return (s instanceof AssignStmt && s.containsInvokeExpr() && s.getInvokeExpr() instanceof InstanceInvokeExpr);
    }
    
    private static boolean isMockLibrary(String declaringClassName) {
        return (declaringClassName.contains(EasyMock_library) || declaringClassName.contains(Mockito_library)
                                || declaringClassName.contains(PowerMock_library));
    }
}
