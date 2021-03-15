package ca.uwaterloo.liang;

import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.Type;
import soot.Unit;
import soot.VoidType;
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.Edge;
import soot.jimple.toolkits.callgraph.ReachableMethods;

public class MockAnalyzer {
    
    private static final String EasyMock_library = "org.easymock.EasyMock";
    private static final String Mockito_library = "org.mockito.Mockito";
    private static final String PowerMock_library = "org.powermock.api.mockito.PowerMockito";
    
    // EasyMock createMock function
    private static final String EasyMock_methodname = "org.easymock.EasyMock createMock";
    private static final String EasyMock_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    // Mockito mock function
    private static final String Mockito_methodname = "org.mockito.Mockito mock";
    private static final String Mockito_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    // PowerMock mock function
    private static final String PowerMock_methodname = "org.powermock.api.mockito.PowerMockito mock";
    private static final String PowerMock_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    public static boolean isMock(Scene scene, CallGraph cg, Unit u) {
        List<MethodOrMethodContext> sootMethodList = new ArrayList<MethodOrMethodContext>();
        
        // The sootMethod for EasyMock, Mockito, and PowerMock function to create mock object
        MethodOrMethodContext easyMockMethod = new SootMethod(EasyMock_methodname, paramTypeList(scene, EasyMock_descriptor), returnType(scene, EasyMock_descriptor));
        MethodOrMethodContext mockitoMethod = new SootMethod(Mockito_methodname, paramTypeList(scene, Mockito_descriptor), returnType(scene, Mockito_descriptor));
        MethodOrMethodContext powerMockMethod = new SootMethod(PowerMock_methodname, paramTypeList(scene, PowerMock_descriptor), returnType(scene, PowerMock_descriptor));
        
        sootMethodList.add(easyMockMethod);
        sootMethodList.add(mockitoMethod);
        sootMethodList.add(powerMockMethod);
        
        logger.debug("easyMockMethod: " + ((SootMethod) easyMockMethod).getSubSignature());
        
        if (isWrapperMock(cg, u, sootMethodList)) {
            return true;
        } else if (isImmediateMock(u)) {
            return true;
        }       
        return false;
    }
    
    /**
     * 
     * @param cg
     * @param u
     * @return boolean
     * 
     * The function determines whether the unit is a mock object created via a wrapper.
     * 
     * Example: <T> T createMock(final Class<?> name) function defined 
     *          in org.apache.commons.collections4.MockTestCase 
     */
    private static boolean isWrapperMock(CallGraph cg, Unit u, List<MethodOrMethodContext> sootMethodList) {
        Stmt s = (Stmt) u;
        if (isAssignStmtWithInvokeExpr(s)) {
            SootMethod sootMethod = s.getInvokeExpr().getMethod();
            List<MethodOrMethodContext> callbacks = new ArrayList<>();
            callbacks.add(sootMethod);
            ReachableMethods reachableMethods = new ReachableMethods(cg, callbacks.iterator());
            reachableMethods.update();
            for (MethodOrMethodContext method: sootMethodList) {
                logger.debug(((SootMethod) method).getSignature());
                if (reachableMethods.contains(method)) {
                    logger.debug("The object is a mock created through a wrapper.");
                    return true;
                }
            }
        }
        return false;
     }
    
    /**
     * 
     * @param u
     * @return
     * 
     * The function determines whether the unit is an immediate mock object. 
     */
    private static boolean isImmediateMock(Unit u) {
        Stmt s = (Stmt) u;
            
        if (isAssignStmtWithInvokeExpr(s)) {
            logger.debug(s.getInvokeExpr().getMethod().getSignature());
            String declaringClassName = s.getInvokeExpr().getMethod().getDeclaringClass().toString();
            if (isMockLibrary(declaringClassName)) {
                logger.debug("The object is an immediate mock.");
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

    /** 
     * 
     * @param descriptor
     * @return
     * 
     * The function determines the parameterTypes list necessary for the SootMethod
     */
    private static List<Type> paramTypeList(Scene scene, String descriptor) {
        String params = ClassFile.parseMethodDesc_params(descriptor);
        logger.debug(params);
        if (params.length() == 0 || params == null)
            params = "void";
        String[] paramList = params.split(",");

        List<Type> parameterTypeList = new ArrayList<Type>(); 
                            
        for (String p: paramList) {
            Type t = scene.getType(p);
            parameterTypeList.add(t);
        }
        return parameterTypeList;
    }
    
    /**
     * 
     * @param descriptor
     * @return
     * 
     * The function determines the returnType necessary for the SootMethod
     */
    private static Type returnType(Scene scene, String descriptor) {
        Type returnType  = scene.getType(ClassFile.parseMethodDesc_return(descriptor));
        return returnType;
    }
}
