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
import soot.jimple.AssignStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.Stmt;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.ReachableMethods;

public class MockAnalyzer {
    
    private static final String EasyMock_library = "org.easymock.EasyMock";
    private static final String Mockito_library = "org.mockito.Mockito";
    private static final String PowerMock_library = "org.powermock.api.mockito.PowerMockito";
    
    // EasyMock createMock function
    private static final String EasyMock_methodname = "createMock";
    //private static final String EasyMock_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    // Mockito mock function
    private static final String Mockito_methodname = "mock";
    //private static final String Mockito_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    // PowerMock mock function
    private static final String PowerMock_methodname = "mock";
    // private static final String PowerMock_descriptor = "(Ljava/lang/Class;)Ljava/lang/Object;";
    
    private static final Type classType = Scene.v().getType("java.lang.Class");
    private static final Type returnType = Scene.v().getType("java.lang.Object");
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    public static boolean isMock(Scene scene, CallGraph cg, Unit u) {
        List<Type> paramList = new ArrayList<Type>();
        paramList.add(classType);
        
        List<String> mockLibraries = new ArrayList<String>();
        mockLibraries.add(EasyMock_library);
        mockLibraries.add(Mockito_library);
        mockLibraries.add(PowerMock_library);
        
        if (determineMockLibrary(scene, mockLibraries) == null) {
            // Scene could not find any mocking libraries, so return false
            return false;
        }
        
        String str_mock = determineMockLibrary(scene, mockLibraries);
        //logger.debug("The mocking library in the benchmark: " + str_mock);
        
        List<MethodOrMethodContext> sootMethodList = new ArrayList<MethodOrMethodContext>();
        
        MethodOrMethodContext method = determineSootMethod(scene, str_mock, paramList, returnType);
        
        sootMethodList.add(method);
        
        //logger.debug("Mock method: " + ((SootMethod) method).getSubSignature());
        
        if (isWrapperMock(cg, u, sootMethodList)) {
            return true;
        } else if (isImmediateMock(u)) {
            return true;
        }       
        return false;
    }
    
    private static SootMethod determineSootMethod(Scene scene, String str_mock, List<Type> paramList, Type returnType) {
        SootMethod sm = null;
        switch (str_mock) {
            case EasyMock_library:
                sm = new SootMethod(EasyMock_methodname, paramList, returnType);
                SootClass sc1 = scene.getSootClassUnsafe(str_mock);
                sm.setDeclaringClass(sc1);
                sm.setDeclared(true);
                break;
            case Mockito_library:
                sm = new SootMethod(Mockito_methodname, paramList, returnType);
                SootClass sc2 = scene.getSootClassUnsafe(str_mock);
                sm.setDeclaringClass(sc2);
                sm.setDeclared(true);
                break;
            case PowerMock_library:
                sm = new SootMethod(PowerMock_methodname, paramList, returnType);
                SootClass sc3 = scene.getSootClassUnsafe(str_mock);
                sm.setDeclaringClass(sc3);
                sm.setDeclared(true);
                break;
            default:
                break;
        }
        return sm;
    }
    
    private static String determineMockLibrary(Scene scene, List<String> mockLibraries) {
        for (String mock: mockLibraries) {
            if (scene.containsClass(mock)) {
                //logger.debug("The mocking library in the benchmark: " + mock);
                return mock;
            }
        }
        return null;
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
                // System.out.println(((SootMethod) method).getSignature());
                if (reachableMethods.contains(method)) {
                    System.out.println("The object is a mock created through a wrapper.");
                    System.out.println("The mocking library: " + ((SootMethod) method).getDeclaringClass().toString());
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
}
