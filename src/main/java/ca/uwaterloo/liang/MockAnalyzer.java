package ca.uwaterloo.liang;

import java.io.*;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import soot.G;
import soot.MethodOrMethodContext;
import soot.PackManager;
import soot.Scene;
import soot.Singletons;
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
    
    private static final Logger logger = LoggerFactory.getLogger(PackManager.class);
    
    public static final String EasyMock_library = "org.easymock.EasyMock";
    public static final String Mockito_library = "org.mockito.Mockito";
    public static final String PowerMock_library = "org.powermock.api.mockito.PowerMockito";

    // EasyMock createMock function
    public static final String EasyMock_methodname = "createMock";
    
    // Mockito mock function
    public static final String Mockito_methodname = "mock";
    
    // PowerMock mock function
    public static final String PowerMock_methodname = "mock";
    
    public static final Type classType = Scene.v().getType("java.lang.Class");
    public static final Type returnType = Scene.v().getType("java.lang.Object");
    
    public MockAnalyzer(MockG.Global g) {
    }
    
    public static MockAnalyzer v() {
       return MockG.v().instance_MockAnalyzer();
    }
    
    public boolean isMock(Scene scene, CallGraph cg, Unit u, MethodOrMethodContext method) {
                
        List<MethodOrMethodContext> sootMethodList = new ArrayList<MethodOrMethodContext>();
        
        sootMethodList.add(method);
        
        if (isWrapperMock(cg, u, sootMethodList)) {
            return true;
        } else if (isImmediateMock(u)) {
            return true;
        }       
        return false;
    }
    
    public SootMethod retrieveMockCreationSootMethod(Scene scene, MockLibrary mockLibrary) {
        SootMethod sm = null;
        List<Type> paramList = new ArrayList<Type>();
        paramList.add(MockAnalyzer.classType);
        switch (mockLibrary) {
            case EASYMOCK:
                sm = new SootMethod(MockLibrary.EASYMOCK.method(), paramList, returnType);
                SootClass sc1 = scene.getSootClassUnsafe(MockLibrary.EASYMOCK.library());
                sm = sc1.getMethod(sm.getSubSignature());
                break;
            case MOCKITO:
                sm = new SootMethod(MockLibrary.MOCKITO.library(), paramList, returnType);
                SootClass sc2 = scene.getSootClassUnsafe(MockLibrary.MOCKITO.library());
                sm = sc2.getMethod(sm.getSubSignature());
                break;
            case POWERMOCK:
                sm = new SootMethod(MockLibrary.POWERMOCK.library(), paramList, returnType);
                SootClass sc3 = scene.getSootClassUnsafe(MockLibrary.POWERMOCK.library());
                sm = sc3.getMethod(sm.getSubSignature());
                break;
            default:
                break;
        }
        return sm;
    }
    
    public MockLibrary determineMockLibrary(Scene scene, List<MockLibrary> mockLibraries) {
        for (MockLibrary mock: mockLibraries) {
            if (scene.containsClass(mock.library())) {
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
                // logger.debug(((SootMethod) method).getSignature());
                if (reachableMethods.contains(method)) {
                    logger.debug("The object is a mock created through a wrapper.");
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
