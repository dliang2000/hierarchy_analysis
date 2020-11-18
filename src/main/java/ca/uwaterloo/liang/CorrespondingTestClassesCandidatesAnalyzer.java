package ca.uwaterloo.liang;

import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.callgraph.CallGraph;
import soot.jimple.toolkits.callgraph.CallGraphBuilder;
import soot.jimple.toolkits.callgraph.Edge;
import soot.options.Options;
import soot.tagkit.AnnotationTag;

import soot.*;

import soot.options.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class CorrespondingTestClassesCandidatesAnalyzer {
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
        CorrespondingTestClassesCandidatesAnalyzer.benchmark = args[4];
        CorrespondingTestClassesCandidatesAnalyzer.output_path = args[5];
        CorrespondingTestClassesCandidatesAnalyzer.csv_arg = args[6];
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
            
            HashMap<Pair<SootClass, String>, Integer> missingMethodCoverageClassMap = new HashMap<Pair<SootClass, String>, Integer>();
            Map<SootClass, Integer> nonExcludedSubclassCount = new HashMap<SootClass, Integer>();
            Map<SootClass, List<SootMethod>> classMethodsListMap = new HashMap<SootClass, List<SootMethod>>();
            
            // Completable candidates are stored as a hashmap with entries containing key of SootMethod 
            // and value of SootClass, which is the direct superclass of the class in
            // the missing_methods.csv file
            Map<SootMethod, SootClass> completableCandidates = new HashMap<SootMethod, SootClass>();
            Map<SootMethod, SootClass> partialCompletableCandidates = new HashMap<SootMethod, SootClass>();
            
            // Stores the list of completable candidates' identifications
            Set<String> candidatesIdentificationSet = new HashSet<String>();
            
            Map<Pair<SootClass, SootMethod>, String> identificationMap = new HashMap<Pair<SootClass, SootMethod>, String>();
            
            List<SootMethod> CompletableCandidateMethods = new ArrayList<SootMethod>();
            List<SootMethod> PartialCompletableCandidateMethods = new ArrayList<SootMethod>();
            
            String classname = null;
            String methodname = null;
            String descriptor = null;
            
            // Read in the classes with missed methods coverage
            String csv_file = csv_arg;
            ClassLoader classLoader = new CorrespondingTestClassesCandidatesAnalyzer().getClass().getClassLoader();
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
                    
                    SootClass sc = Scene.v().loadClassAndSupport(classname);
                    // Skip the sootclass if it is an interface, an abstract class, 
                    // or if it belongs to one of the excluded packages
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
                    if (l.size() == 1) {
                        // when the size of l is 1, it means the superclass of sc is java.lang.Object.
                        continue;
                    }
                    SootClass superclass = l.get(0);
                    if (nonExcludedSubclassCount.containsKey(superclass)) {
                        nonExcludedSubclassCount.put(superclass, nonExcludedSubclassCount.get(superclass) + 1);
                    } else {
                        nonExcludedSubclassCount.put(superclass, 1);
                    }
                    
                    SootMethod sootMethod = new SootMethod(methodname, parameterTypeList, returnType);
                    String methodSubsignature = sootMethod.getSubSignature();
                    // System.out.println("Method subsignature: " + sootMethod.getSubSignature());
                    
                    Pair<SootClass, String> pair = new Pair<SootClass, String>(superclass, methodSubsignature);
                    if (missingMethodCoverageClassMap.containsKey(pair)) {
                        missingMethodCoverageClassMap.put(pair, missingMethodCoverageClassMap.get(pair) + 1);
                    } else {
                        missingMethodCoverageClassMap.put(pair, 1);
                    }
                    
                    // update classMethodsListMap
                    if (classMethodsListMap.containsKey(superclass)) {
                        List<SootMethod> sootMethodList = classMethodsListMap.get(superclass);
                        sootMethodList.add(sootMethod);
                        classMethodsListMap.put(superclass, sootMethodList);
                    } else {
                        List<SootMethod> sootMethodList = new ArrayList<SootMethod>();
                        sootMethodList.add(sootMethod);
                        classMethodsListMap.put(superclass, sootMethodList);
                    }
                }
                
                for (Entry<SootClass, List<SootMethod>> entry : classMethodsListMap.entrySet()) {
                    // get Superclass
                    SootClass sootclass = entry.getKey();
                    List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(sootclass);
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
                        if (!ifHaveMultipleDirectSubClasses(sootclass, hierarchy)) {
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
                            Pair<SootClass, String> temp_pair = new Pair<SootClass, String>(sootclass, sootmethod.getSubSignature());
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
                            String candidate_identification = generateIdentification(benchmark, sootclass, sootmethod);
                            if (!candidatesIdentificationSet.contains(candidate_identification)) {
                                candidatesIdentificationSet.add(candidate_identification);
                                if (isCandidate) {
                                    identificationMap.put(new Pair<SootClass, SootMethod>(sootclass, sootmethod), candidate_identification);
                                    completableCandidates.put(sootmethod, sootclass);
                                    CompletableCandidateMethods.add(sootmethod);
                                } else {
                                    identificationMap.put(new Pair<SootClass, SootMethod>(sootclass, sootmethod), candidate_identification);
                                    partialCompletableCandidates.put(sootmethod, sootclass);
                                    PartialCompletableCandidateMethods.add(sootmethod);
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
                
                List<String[]> CCLinesToAdd = new ArrayList<>();
                CCLinesToAdd.add(new String[] {"Class", "Method Name", "Test Case Invoked the Method"});
                
                List<String[]> PCCLinesToAdd = new ArrayList<>();
                PCCLinesToAdd.add(new String[] {"Class", "Method Name", "Test Case Invoked the Method"});
                
                while (classIt.hasNext()) {
                    SootClass appClass = (SootClass) classIt.next();
                    //System.out.println("SootClass Visited: " + appClass.toString());
                    if (!appClass.isConcrete())
                        continue;
                    Iterator<SootMethod> mIt = appClass.getMethods().iterator();
                    while (mIt.hasNext()) {
                        SootMethod sootmethod = (SootMethod) mIt.next();
                        if (sootmethod.isAbstract() || sootmethod.isNative() || sootmethod.isConstructor()
                                || sootmethod.isStaticInitializer())
                            continue;
                        if (CompletableCandidateMethods.contains(sootmethod)) {
                            Iterator<Edge> it = cg.edgesInto(sootmethod);
                            while (it.hasNext()) {
                                Edge e = (Edge) it.next();
                                SootMethod srcMethod = e.src();
                                if (isTestCase(srcMethod)) {
                                    System.out.println("CC - Test Case " + srcMethod.getSubSignature() + " called this method " + sootmethod.getSubSignature());
                                    CCLinesToAdd.add(new String[] { appClass.getName(), sootmethod.getSubSignature(), srcMethod.getSubSignature()});
                                }
                            }
                        }
                        if (PartialCompletableCandidateMethods.contains(sootmethod)) {
                            Iterator<Edge> it = cg.edgesInto(sootmethod);
                            while (it.hasNext()) {
                                Edge e = (Edge) it.next();
                                SootMethod srcMethod = e.src();
                                if (isTestCase(srcMethod)) {
                                    System.out.println("PCC - Test Case " + srcMethod.getSubSignature() + " called this method " + sootmethod.getSubSignature());
                                    PCCLinesToAdd.add(new String[] { appClass.getName(), sootmethod.getSubSignature(), srcMethod.getSubSignature()});
                                }
                            }
                        }
                    }
                }
                
                File csvCCOutputFile = new File(output_path + "/CSV_Files/" + benchmark + "_CC_methods_invoked_by_test.csv");
                try (PrintWriter pw = new PrintWriter(csvCCOutputFile)) {
                    CCLinesToAdd.stream().map(this::convertToCSV).forEach(pw::println);
                }
                
                File csvPCCOutputFile = new File(output_path + "/CSV_Files/" + benchmark + "_PCC_methods_invoked_by_test.csv");
                try (PrintWriter pw = new PrintWriter(csvPCCOutputFile)) {
                    PCCLinesToAdd.stream().map(this::convertToCSV).forEach(pw::println);
                }
             } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             }
         }
         public String convertToCSV(String[] data) {
             return Stream.of(data).collect(Collectors.joining("\t"));
         }
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
    
    private static boolean isTestCase(SootMethod sm) {
        // JUnit 3
        if (sm.getName().startsWith("test") && sm.getParameterCount() == 0 && sm.getReturnType().toString() == "void") {
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
