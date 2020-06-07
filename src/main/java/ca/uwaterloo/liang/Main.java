package ca.uwaterloo.liang;

import soot.*;

import soot.options.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	private static String csv_arg;
	private static String benchmark;
	public static void main(String[] args) throws IOException {
		 Main.csv_arg = args[2];
		 Main.benchmark = args[3];
		 PackManager.v().getPack("wjtp").add(
			     new Transform("wjtp.myTransform", CompletableTestTransformer.v()) {
			     });
		 
		 // list of maven dependent jars
		 
		 //class path for guava/guava
		 //jars needed for google guava (to be removed if the resolving level issue could be resolved)
		 /*String failure_access = common_jar_path + "com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar";
		 String listenable_future = common_jar_path + "com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava"
			 		+ "/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar";
		 String jsr305 = common_jar_path + "com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar";
		 String check_qual = common_jar_path + "org/checkerframework/checker-qual/2.8.1/checker-qual-2.8.1.jar";
		 String error_prone = common_jar_path + "com/google/errorprone/error_prone_annotations/2.3.2/error_prone_annotations-2.3.2.jar";
		 String j2objc = common_jar_path + "com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar";
		 String animal_sniffer = common_jar_path + "org/codehaus/mojo/animal-sniffer-annotations/1.17/animal-sniffer-annotations-1.17.jar";
			 
		 String class_path = failure_access + File.pathSeparator + listenable_future + File.pathSeparator 
				 + jsr305 + File.pathSeparator + check_qual + File.pathSeparator  + error_prone + File.pathSeparator 
				 + j2objc + File.pathSeparator + animal_sniffer + File.pathSeparator + File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				    + File.separator + "guava" + File.separator + "guava/target/classes/";*/
		 
		 //class path for jfreechart
		 /*String common_jar_path = "/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/";
		 
		 String gnujaxp = common_jar_path + "gnujaxp.jar";
		 String iText = common_jar_path + "iText-2.1.1.jar";
		 String jcommon = common_jar_path + "jcommon-1.0.13.jar";
		 String junit = common_jar_path + "junit.jar";
		 String servlet = common_jar_path + "servlet.jar";
		 String swt = common_jar_path + "swt.jar";
		 String swt2d = common_jar_path + "swtgraphics2d.jar";
		 
		 String class_path = gnujaxp + File.pathSeparator + iText + File.pathSeparator + jcommon + File.pathSeparator 
				 	+ junit + File.pathSeparator + servlet + File.pathSeparator + swt + File.pathSeparator + swt2d 
				 	+ File.pathSeparator + File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				    + File.separator + "jfreechart" + File.separator + "src/org/classes/";*/
		 //setting.add(class_path);
		 
		 //class path for lucene-core:
		 String class_path = File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "git" + File.separator + "lucene-solr" + File.separator + "lucene" 
				 + File.separator + "core/src/java/classes/";
		 
		 Options.v().set_prepend_classpath(true);                                                                                 
		 Options.v().set_verbose(true);                                                                                            
		 List<String> pd = new ArrayList<>();                                                                                   
		 pd.add("-process-dir");                                                                                                  
		 pd.add(args[0]); 
		 //pd.add(args[1]); 
		 Options.v().set_soot_classpath(args[1]);
		 Options.v().set_whole_program(true);
		 // For benchmarks: findbug-3.0.1, fastjson-1.2.62, quartz-2.3.1
		 if (args[0].contains("findbugs") || args[0].contains("quartz") || args[0].contains("fastjson"))
		     Options.v().set_allow_phantom_refs(true); 
		 soot.Main.main(pd.toArray(new String[0]));
	}
	
	static class CompletableTestTransformer extends SceneTransformer {
		private final static CompletableTestTransformer instance = new CompletableTestTransformer();
	    private CompletableTestTransformer() {}
		public static CompletableTestTransformer v() { return instance; }
	    @Override
		protected void internalTransform(String phaseName, Map options) {
	    	// after process the entire directory, get the active hierarchy, with all the classes loaded onto scene. 
	    	Hierarchy hierarchy = Scene.v().getActiveHierarchy();
	    	// System.out.println(Scene.v().getSootClassPath());
	    	
	    	
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
	    	
	  		
	    	String classname = null;
	    	String methodname = null;
	    	String descriptor = null;
	    	
	  		// Read in the classes with missed methods coverage
	  		String csv_file = csv_arg;
	  		ClassLoader classLoader = new Main().getClass().getClassLoader();
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
		  			// List<SootClass> abstractSootClassList = new ArrayList<SootClass>();
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
		  				        } else {
		  				            identificationMap.put(new Pair<SootClass, SootMethod>(sootclass, sootmethod), candidate_identification);
		                            partialCompletableCandidates.put(sootmethod, sootclass);
		  				        }
		  				    }
		  				}
//		  				//System.out.println("missingMethodClassCounter: " + missingMethodClassCounter);
//		  				if (isCandidate && !completableCandidates.containsKey(sootmethod)) {
//		  				    String candidate_identification = generateIdentification(benchmark, sootclass, sootmethod);
//		  				    identificationMap.put(new Pair<SootClass, SootMethod>(sootclass, sootmethod), candidate_identification);
//		  				    candidatesIdentificationSet.add(candidate_identification);
//		  					completableCandidates.put(sootmethod, sootclass);
//		  				}
//		  				
//		  				//System.out.println("concreateSootClassList size: " + concreteSootClassList.size());
//		  				//System.out.println("Number of subclasses that did not implement the method " + methodNotImplementedCounter);
//		  				//System.out.println("concreateSootClassList size - methodNotImplementedCounter = " + (concreteSootClassList.size() - methodNotImplementedCounter));
//		  				if ((concreteSootClassList.size() - methodNotImplementedCounter >= 2) 
//		  				      && !partialCompletableCandidates.containsKey(sootmethod) 
//		  				      && !isCandidate && isPartialCandidate) {
//		  				    // System.out.println("Partial Completable candidate found: " + sootclass.getName() + ", sootMethod: " + sootmethod.getSubSignature());
//		  				    String candidate_identification = generateIdentification(benchmark, sootclass, sootmethod);
//		  				    identificationMap.put(new Pair<SootClass, SootMethod>(sootclass, sootmethod), candidate_identification);
//		  				  candidatesIdentificationSet.add(candidate_identification);
//		  				    partialCompletableCandidates.put(sootmethod, sootclass);
//		  				}
		  			}
		  		}
		  		
		  		if (candidatesIdentificationSet.size() > 0) {
		  		    System.out.println("Candidates Identifications Overview: ");
		  		    for (String id: candidatesIdentificationSet) {
		  		        System.out.println(id);
		  		    }
		  		    System.out.println();
		  		}
		  		
		  		System.out.println("Completable candidates size: " + completableCandidates.size());
		  		for (Entry<SootMethod, SootClass> entry: completableCandidates.entrySet()) {
		  		    SootClass sootClass = entry.getValue();
		  		    SootMethod sootMethod = entry.getKey();
		  		    Pair<SootClass, SootMethod> currPair = new Pair<SootClass, SootMethod>(sootClass, sootMethod);
		  		    String candidate_identification = identificationMap.get(currPair);
		  		    System.out.println("Candidate class name: " + sootClass.getName() + ", method subsignature: " + sootMethod.getSubSignature());
		  		    System.out.println("Candidate ID: " + candidate_identification);
					List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(sootClass);
			  		for (SootClass sc: sootClassList) {
			  		    if(sc.isConcrete() && !Scene.v().isExcluded(sc)) {
			  		        System.out.println("Concrete direct subclass: " + sc.getName());
			  			}
			  		}
			  		System.out.println();
				}
		  		
		  		System.out.println("Partial completable candidates size: " + partialCompletableCandidates.size());
                for (Entry<SootMethod, SootClass> entry: partialCompletableCandidates.entrySet()) {
                    SootClass sootClass = entry.getValue();
                    SootMethod sootMethod = entry.getKey();
                    Pair<SootClass, SootMethod> currPair = new Pair<SootClass, SootMethod>(sootClass, sootMethod);
                    String candidate_identification = identificationMap.get(currPair);
                    System.out.println("Candidate class name: " + sootClass.getName() + ", method subsignature: " + sootMethod.getSubSignature());
                    System.out.println("Candidate ID: " + candidate_identification);
                    List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(entry.getValue());
                    for (SootClass sc: sootClassList) {
                        if(sc.isConcrete() && !Scene.v().isExcluded(sc) && sc.declaresMethod(sootMethod.getName(), sootMethod.getParameterTypes(), sootMethod.getReturnType())) {
                           System.out.println("Concrete direct subclass that has method implemented: " + sc.getName());
                        }
                    }
                    System.out.println();
                }
	  		 } catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	  		 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	  		 }
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
}
