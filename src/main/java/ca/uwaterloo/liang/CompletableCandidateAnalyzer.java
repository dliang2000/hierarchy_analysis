package ca.uwaterloo.liang;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import soot.jimple.AssignStmt;
import soot.jimple.DefinitionStmt;
import soot.jimple.InstanceInvokeExpr;
import soot.jimple.InvokeExpr;
import soot.jimple.InvokeStmt;
import soot.jimple.Stmt;
import soot.jimple.internal.JInvokeStmt;
import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.CallGraphBuilder;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.Options;
import soot.tagkit.AnnotationTag;
import soot.tagkit.Tag;
import soot.*;
import soot.options.*;
import soot.toolkits.graph.BriefUnitGraph;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.toolkits.scalar.LocalDefs;
import soot.toolkits.scalar.LocalUses;
import soot.toolkits.scalar.SimpleLocalDefs;
import soot.toolkits.scalar.SimpleLocalUses;
import soot.toolkits.scalar.UnitValueBoxPair;
import soot.util.*;

import java.io.*;
import java.util.*;

public class CompletableCandidateAnalyzer {
    //private static final String  = null;
    private static String benchmark;
    private static String output_path;
    private static String csv_arg;
    
    public static void main(String[] args) throws IOException {
        PackManager.v().getPack("wjtp").add(new Transform("wjtp.myTransform", CompletableTestTransformer.v()) {
        });
        Options.v().set_prepend_classpath(true);
        Options.v().set_verbose(true);
        Options.v().set_whole_program(true);
        List<String> pd = new ArrayList<>();
        pd.add("-main-class");
        pd.add(args[0]);
        pd.add("-process-dir");
        pd.add(args[1]);
        pd.add("-process-dir");
        pd.add(args[2]);
        Options.v().set_soot_classpath(args[3]);
        CompletableCandidateAnalyzer.benchmark = args[4];
        CompletableCandidateAnalyzer.output_path = args[5];
        CompletableCandidateAnalyzer.csv_arg = args[6];
        System.out.println("args[0]: " + args[0]);
        System.out.println("args[1]: " + args[1]);
        System.out.println("args[2]: " + args[2]);
        System.out.println("args[3]: " + args[3]);
        System.out.println("args[4]: " + args[4]);
        System.out.println("args[5]: " + args[5]);
        System.out.println("args[6]: " + args[6]);
        soot.Main.main(pd.toArray(new String[0]));
    }
    
    static class CompletableTestTransformer extends SceneTransformer {
        private final static CompletableTestTransformer instance = new CompletableTestTransformer();
        private CompletableTestTransformer() {
        }
        public static CompletableTestTransformer v() { 
            return instance; 
        }
        
        private boolean isDefinedOutsideTestClass(SootMethod m) {
            String ss = m.getSubSignature();
            SootClass sc = m.getDeclaringClass();
            // unfortunately, test classes are not annotated
            // we approximate by filtering out anything defined in java.*
            do {
                if (!sc.declaresMethod(ss))
                    break;
                if (sc.getJavaPackageName().startsWith("java")) {
                    return true;
                }
                sc = sc.getSuperclass();
            } while (sc != null);
            return false;
        }
        
        @Override
        protected void internalTransform(String phaseName, Map options) {
            // after process the entire directory, get the active hierarchy, with all the classes loaded onto scene.             
            Hierarchy hierarchy = Scene.v().getActiveHierarchy();
            
            // Each pair consists of SootClass - the superclass, and String - the missing method's subsignature
            // After running jacoco-plugin and collect the methods that are untested, the map of Pair and Integer will 
            // later be updated to check if 
            HashMap<Pair<SootClass, String>, Integer> missingMethodCoverageClassMap = new HashMap<Pair<SootClass, String>, Integer>();
            
            
            Map<SootClass, List<SootMethod>> superclassMethodsListMap = new HashMap<SootClass, List<SootMethod>>();
          
            //  Map<SootMethod, SootClass> sootMethodMissingClassMap = new HashMap<SootMethod, SootClass>();
            
            // Completable candidates are stored as a hashmap with entries containing key of SootMethod 
            // and value of SootClass, which is the direct superclass of the class in
            // the missing_methods.csv file
            Map<String, SootClass> completableCandidates = new HashMap<String, SootClass>();
            Map<String, SootClass> partialCompletableCandidates = new HashMap<String, SootClass>();
            
            // Stores the list of completable candidates' identifications
            Set<String> candidatesIdentificationSet = new HashSet<String>();
            
            Map<Pair<SootClass, SootMethod>, String> identificationMap = new HashMap<Pair<SootClass, SootMethod>, String>();
            
            // List<SootMethod> CompletableCandidateMethods = new ArrayList<SootMethod>();
            // List<SootMethod> PartialCompletableCandidateMethods = new ArrayList<SootMethod>();
            
            String classname = null, methodname = null, descriptor = null;
            
            // Read in the classes with missed methods coverage
            String csv_file = csv_arg;
            ClassLoader classLoader = new CompletableCandidateAnalyzer().getClass().getClassLoader();
            File file = new File(classLoader.getResource(csv_file).getFile());
             
            System.out.println("File Found: " + file.exists());
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(file));
                String line = null;
                line = reader.readLine();
                while((line = reader.readLine()) != null){
                    String[] data = line.split(",");
                    classname = data[1];
                    methodname = data[2];
                    descriptor = data[3];
                    
                    // Skip accessors and mutators
                    if (methodname.startsWith("set") || methodname.startsWith("get"))
                        continue;
                    
                    // Skip the sootclass if it is an interface, an abstract class, 
                    // or if it belongs to one of the excluded packages
                    SootClass sc = Scene.v().loadClassAndSupport(classname);
                    if (sc.isInterface() || sc.isAbstract() || Scene.v().isExcluded(sc))
                        continue;
                    
                    String params = ClassFile.parseMethodDesc_params(descriptor);
                    
                    if (params.length() == 0 || params == null)
                        params = "void";
                    String[] paramList = params.split(",");

                    List<Type> parameterTypeList = new ArrayList<Type>(); 
                                        
                    for (String p: paramList) {
                        Type t;
                        if (Scene.v().getTypeUnsafe(p, false) == null) {
                            t = VoidType.v();
                        } else {
                            t = Scene.v().getType(p);
                        }
                        parameterTypeList.add(t);
                    }
                    
                    Type returnType;
                    if (Scene.v().getTypeUnsafe(ClassFile.parseMethodDesc_return(descriptor), false) == null) {
                        returnType = VoidType.v();
                    } else {
                        returnType = Scene.v().getType(ClassFile.parseMethodDesc_return(descriptor));
                    }
                    
                    sc.setApplicationClass();
                    
                    List<SootClass> l = hierarchy.getSuperclassesOf(sc);
                    if (l.size() == 1)
                        // when the size of l is 1, it means the superclass of sc is java.lang.Object.
                        continue;
                    
                    SootClass superclass = l.get(0);
                    
                    SootMethod sootMethod = new SootMethod(methodname, parameterTypeList, returnType);
                    String methodSubsignature = sootMethod.getSubSignature();
                    
                    Pair<SootClass, String> pair = new Pair<SootClass, String>(superclass, methodSubsignature);
                    if (missingMethodCoverageClassMap.containsKey(pair)) {
                        missingMethodCoverageClassMap.put(pair, missingMethodCoverageClassMap.get(pair) + 1);
                    } else {
                        missingMethodCoverageClassMap.put(pair, 1);
                    }
                    
                    // update superclassMethodsListMap
                    if (superclassMethodsListMap.containsKey(superclass)) {
                        List<SootMethod> sootMethodList = superclassMethodsListMap.get(superclass);
                        sootMethodList.add(sootMethod);
                        superclassMethodsListMap.put(superclass, sootMethodList);
                       // sootMethodMissingClassMap.put(sootMethod, sc);
                    } else {
                        List<SootMethod> sootMethodList = new ArrayList<SootMethod>();
                        sootMethodList.add(sootMethod);
                        superclassMethodsListMap.put(superclass, sootMethodList);
                      // sootMethodMissingClassMap.put(sootMethod, sc);
                    }
                }
                
                for (Entry<SootClass, List<SootMethod>> entry : superclassMethodsListMap.entrySet()) {
                    // get Superclass
                    SootClass superclass = entry.getKey();
                    List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(superclass);
                    List<SootClass> concreteSootClassList = new ArrayList<SootClass>();
                    for (SootClass sc: sootClassList) {
                        if (Scene.v().isExcluded(sc))
                            continue;
                        if(sc.isConcrete()) {
                            concreteSootClassList.add(sc);
                        }
                    }
                    if (concreteSootClassList.size() <= 1)
                        continue;
                    
                    boolean isCandidate = true;
                    boolean isPartialCandidate = true;
                    int methodNotImplementedCounter = 0;
                    int missingMethodClassCounter = 0;
                    
                    for (SootMethod sootmethod: entry.getValue()) {
                        // Horizontal Completable Hierarchy Condition Requirement 1: there are multiple sibling classes
                        isCandidate = true;
                        isPartialCandidate = true;
                        methodNotImplementedCounter = 0;
                        missingMethodClassCounter = 0;
                        if (!ifHaveMultipleDirectSubClasses(superclass, hierarchy)) {
                            isCandidate = false;
                            isPartialCandidate = false;
                        }
                        // Horizontal Completable Hierarchy Condition Requirement 2: 
                        // All sibling classes have an implementation of the SootMethod in interest
                        for (SootClass sc: concreteSootClassList) {
                            if (!sc.declaresMethod(sootmethod.getName(), sootmethod.getParameterTypes(), sootmethod.getReturnType())) {
                                isCandidate = false;
                                methodNotImplementedCounter++;
                            }
                            // Horizontal Completable Hierarchy Condition Requirement 3: 
                            // At least one of the sibling classes have the SootMethod in interest tested
                            Pair<SootClass, String> temp_pair = new Pair<SootClass, String>(superclass, sootmethod.getSubSignature());
                            if (missingMethodCoverageClassMap.containsKey(temp_pair)) {
                                missingMethodClassCounter =  missingMethodCoverageClassMap.get(temp_pair);
                                if (missingMethodClassCounter >= concreteSootClassList.size()) {
                                    isCandidate = false;
                                    isPartialCandidate = false;
                                }
                            }
                        }
                        if (concreteSootClassList.size() - methodNotImplementedCounter < 2)
                            isPartialCandidate = false;
                        // Stores the right information when the sootclass and sootmethod together is a candidate or
                        // a partial candidate (where some of the subclasses implement the method)
                        if (isCandidate || isPartialCandidate) {
                            String candidate_identification = generateIdentification(benchmark, superclass, sootmethod);
                            if (!candidatesIdentificationSet.contains(candidate_identification)) {
                                candidatesIdentificationSet.add(candidate_identification);
                                String methodSubsignature = sootmethod.getSubSignature();
                                
                                if (isCandidate) {
                                    identificationMap.put(new Pair<SootClass, SootMethod>(superclass, sootmethod), candidate_identification);
                                    completableCandidates.put(methodSubsignature, superclass);
                                    // CompletableCandidateMethods.add(sootmethod);
                                } else {
                                    identificationMap.put(new Pair<SootClass, SootMethod>(superclass, sootmethod), candidate_identification);
                                    partialCompletableCandidates.put(methodSubsignature, superclass);
                                    // PartialCompletableCandidateMethods.add(sootmethod);
                                }
                            }
                        }
                    }
                }
                
                CallGraph cg;
                Iterator<SootClass> classIt = Scene.v().getApplicationClasses().iterator();

                if (Scene.v().hasCallGraph()) {
                    cg = Scene.v().getCallGraph();
                } else {
                    new CallGraphBuilder().build();
                    cg = Scene.v().getCallGraph();
                    Scene.v().releaseCallGraph();
                }
                
                List<String> CCLinesToAdd = new ArrayList<>();
                CCLinesToAdd.add(String.join("\t", "Class", "Method Name", "Testing Class", "Test Case Invoked the Method"));
                
                List<String> PCCLinesToAdd = new ArrayList<>();
                PCCLinesToAdd.add(String.join("\t", "Class", "Method Name", "Testing Class", "Test Case Invoked the Method"));
                
                while (classIt.hasNext()) {
                    SootClass appClass = (SootClass) classIt.next();
                    if (!appClass.isConcrete())
                        continue;
                    Iterator<SootMethod> mIt = appClass.getMethods().iterator();
                    while (mIt.hasNext()) {
                        SootMethod sootmethod = (SootMethod) mIt.next();
                        if (sootmethod.isAbstract() || sootmethod.isNative() || sootmethod.isConstructor()
                                || sootmethod.isStaticInitializer())
                            continue;
                        
                        String methodSubsignature = sootmethod.getSubSignature();
                        if (completableCandidates.containsKey(methodSubsignature)) {
                            Iterator<Edge> it = cg.edgesInto(sootmethod);
                            while (it.hasNext()) {
                                Edge e = (Edge) it.next();
                                SootMethod srcMethod = e.src();
                                
                                Body body = srcMethod.getActiveBody();
                                
                                Chain units = body.getUnits();
                                List<Unit> stmtList = new ArrayList<Unit>();
                                stmtList.addAll(units);
                                
                                LocalDefs mLocalDefs = LocalDefs.Factory.newLocalDefs(body);
                                LocalUses mLocalUses = LocalUses.Factory.newLocalUses(body, mLocalDefs);
                                
                                Iterator<Unit> stmtIt = stmtList.iterator();
                                Value val = null;
                                /* fold in NewExpr's with specialinvoke's */
                                while (stmtIt.hasNext()) {
                                  Stmt s = (Stmt) stmtIt.next();
                                  if (s instanceof InvokeStmt && String.valueOf(s).contains(methodSubsignature)) {
                                      ValueBox vb = ((InvokeStmt) s).getInvokeExprBox();
                                      InvokeExpr ie = ((InvokeStmt) s).getInvokeExpr();
                                                                            
                                      if (ie instanceof InstanceInvokeExpr) {
                                          val = ((InstanceInvokeExpr) ie).getBase();
                                          System.out.println("Basebox: " + val.getType().toString());
                                      }
                                  }

                                }
                                
                                stmtIt = stmtList.iterator();
                                
                                while (stmtIt.hasNext()) {
                                    Stmt s = (Stmt) stmtIt.next();
                                    if (s instanceof DefinitionStmt && ((DefinitionStmt) s).getLeftOp() == val) {
                                        System.out.println("RightOP: " + ((DefinitionStmt) s).getRightOp());
                                    }
                                }
                                /*for (ValueBox vb: srcMethod.getActiveBody().getUseBoxes()) {
                                    if (vb.getValue() instanceof InstanceInvokeExpr && String.valueOf(vb.getValue()).contains(methodSubsignature)) {
                                        // Source method ValueBox that is of type InstanceInvokeExpr and invoked the focal method in interest
                                        Value val = vb.getValue();
                                        System.out.println(String.valueOf(val));
                                        // Get the Base box, but need to reveal base box is created via createMock
                                        ValueBox bb = ((InstanceInvokeExpr) val).getBaseBox();
                                        val = bb.getValue();
                                        System.out.println(val.getType().toString());                                     
                                    }
                                }*/
                                
                                /*for (ValueBox vb: srcMethod.getActiveBody().getUseBoxes()) {
                                    System.out.println(String.valueOf(vb.getValue()));
                                }*/
                                //System.out.println("Source Unit: " + e.srcUnit().toString());
                                //System.out.println("Kind: " + e.kind());
                                
                                if (isTestCase(srcMethod)) {
                                    /*if (sootmethod.getSubSignature().contains("withZone")) {
                                        System.out.println("SootClass Visited: " + appClass.getName());
                                        System.out.println("SootMethod Visited: " + sootmethod.getSubSignature());
                                        System.out.println("Invoking Method: " + srcMethod.getSubSignature());
                                    }*/
                                    SootClass declaringClass = sootmethod.getDeclaringClass();
                                    // System.out.println("CC - Test Case " + srcMethod.getSubSignature() + " called this method " + sootmethod.getSubSignature());
                                    System.out.println(String.join("\t", declaringClass.getName(), sootmethod.getSubSignature(), srcMethod.getDeclaringClass().getName(), srcMethod.getSubSignature()));
                                    CCLinesToAdd.add(String.join("\t", declaringClass.getName(), sootmethod.getSubSignature(), srcMethod.getDeclaringClass().getName(), srcMethod.getSubSignature()));
                                }
                            }
                        }
                        if (partialCompletableCandidates.containsKey(methodSubsignature)) {
                            Iterator<Edge> it = cg.edgesInto(sootmethod);
                            while (it.hasNext()) {
                                Edge e = (Edge) it.next();
                                SootMethod srcMethod = e.src();
                                if (isTestCase(srcMethod)) {
                                    /*if (sootmethod.getSubSignature().contains("withZone")) {
                                        System.out.println("SootClass Visited: " + appClass.getName());
                                        System.out.println("SootMethod Visited: " + sootmethod.getSubSignature());
                                        System.out.println("Invoking Method: " + srcMethod.getSubSignature());
                                    }*/
                                    SootClass declaringClass = sootmethod.getDeclaringClass();
                                    //System.out.println("PCC - Test Case " + srcMethod.getSubSignature() + " called this method " + sootmethod.getSubSignature());
                                    System.out.println(String.join("\t", declaringClass.getName(), sootmethod.getSubSignature(), srcMethod.getDeclaringClass().getName(), srcMethod.getSubSignature()));
                                    PCCLinesToAdd.add(String.join("\t", declaringClass.getName(), sootmethod.getSubSignature(), srcMethod.getDeclaringClass().getName(), srcMethod.getSubSignature()));
                                    //PCCLinesToAdd.add(new String[] { appClass.getName(), sootmethod.getSubSignature(), srcMethod.getDeclaringClass().getName(), srcMethod.getSubSignature()});
                                }
                            }
                        }
                    }
                }
                
                File csvCCOutputFile = new File(output_path + "/CSV_Files/" + benchmark + "_CC_methods_invoked_by_test.csv");
                try (FileWriter fw = new FileWriter(csvCCOutputFile)) {
                    for (String s: CCLinesToAdd) {
                        String[] split = s.split("\t");
                        fw.write(Arrays.asList(split).stream().collect(Collectors.joining("\t")));
                        fw.write("\n");
                    }
                }
                
                File csvPCCOutputFile = new File(output_path + "/CSV_Files/" + benchmark + "_PCC_methods_invoked_by_test.csv");
                try (FileWriter fw = new FileWriter(csvPCCOutputFile)) {
                    for (String s: PCCLinesToAdd) {
                        String[] split = s.split("\t");
                        fw.write(Arrays.asList(split).stream().collect(Collectors.joining("\t")));
                        fw.write("\n");
                    }
                }
             } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             }
         }
//         public String convertToCSV(String[] data) {
//             return Stream.of(data).collect(Collectors.joining("\t"));
//         }
    }
    
    private static String generateIdentification(String benchmark, SootClass sc, SootMethod sm) {
        String className = sc.getShortJavaStyleName();
        String methodName = sm.getName();
        String lastThreeDigitHash = String.valueOf(lastThreeDigitsHash(sm.getSubSignature()));
        String result = benchmark + "_" + className + "_" + methodName + "_" + lastThreeDigitHash;
        
        return result;
    }
    
    private static int lastThreeDigitsHash(String str) {
        return Math.abs(str.hashCode() % 1000);
    }
    
    private static boolean ifHaveMultipleDirectSubClasses(SootClass sc, Hierarchy h) {      
        List<SootClass> l = h.getDirectSubclassesOf(sc);
        int count_nonExcluded = 0;
        if (l.size() > 1) {
            for (SootClass sootclass: l) {
                if (!Scene.v().isExcluded(sootclass))
                    count_nonExcluded++;
            }
        }
        return count_nonExcluded > 1;
    }
    
    /*private static boolean isMockInvokingMethod(List<ValueBox> boxes, String methodSubsignature) {
        for (ValueBox vb: boxes) {
            if (vb.getValue() instanceof InvokeExpr) {
                Value val = vb.getValue();
                if (val.contains(methodSubsignature))
            }
        }
        return true;
    }*/
    
    private static boolean isTestCase(SootMethod sm) {
        // JUnit 3
        if (sm.getName().toLowerCase().startsWith("test") && sm.getParameterCount() == 0 && sm.getReturnType().toString() == "void") {
            //System.out.println("Test case found: " + sm.getSubSignature());
            return true;
        }

        // JUnit 4+

        List<soot.tagkit.Tag> smTags = sm.getTags();
        soot.tagkit.VisibilityAnnotationTag tag = (soot.tagkit.VisibilityAnnotationTag) sm
                .getTag("VisibilityAnnotationTag");
        if (tag != null) {
            for (AnnotationTag annotation : tag.getAnnotations()) {
                if (annotation.getType().equals("Lorg/junit/Test;")) {
                    //System.out.println("Test case found: " + sm.getSignature());
                    return true;
                }
            }
        }
        return false;
    }
}

