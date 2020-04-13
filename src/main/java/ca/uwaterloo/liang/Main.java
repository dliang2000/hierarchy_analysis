package ca.uwaterloo.liang;

import soot.*;
//import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.pointer.LocalMustNotAliasAnalysis;
import soot.options.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.*;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	private static String csv_arg;

	public static void main(String[] args) throws IOException {
		 Main.csv_arg = args[2];
		 PackManager.v().getPack("wjtp").add(
			     new Transform("wjtp.myTransform", CompletableTestTransformer.v()) {
			     });
		 
		 // list of maven dependent jars
		 
		 //String common_jar_path = "/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/";
		 //List<String> setting = new ArrayList<String>();
		 //setting.add(common_jar_path);
		 
		 
		// class_path for joda-time-2.10
		 //jars needed for joda-time:
/*		 String common_jar_path = "/home/daveroar/.m2/repository";
		 String joda_convert = common_jar_path + "/org/joda/joda-convert/1.2/joda-convert-1.2.jar";
		 String junit = common_jar_path + "/junit/junit/3.8.2/junit-3.8.2.jar";
		 String class_path = joda_convert + File.pathSeparator + junit + File.pathSeparator 
				 	+ File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				    + File.separator + "joda-time-2.10-original-nojqf" + File.separator + "target/classes/";*/
		 
		 
		 // class_path for commons-math-MATH_3_6_1
		 //String class_path = File.separator + "home" + File.separator + "daveroar" + File.separator + 
		//		    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
		//		    + File.separator + "Benchmarks" + File.separator + "commons-math-MATH_3_6_1" + File.separator + "target/classes/";
		 
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
		 Options.v().set_soot_classpath(args[1]);                                                                                  
		 Options.v().set_whole_program(true);                                                                                      
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
	    	//CHATransformer.v().transform();
	    	System.out.println(Scene.v().getSootClassPath());
	    	
	    	HashSet<Pair<SootClass, SootMethod>> missingMethodCoverageClassSet = new HashSet<Pair<SootClass, SootMethod>>();
	    	Map<SootClass, Integer> subclassCount = new HashMap<SootClass, Integer>();
	    	Map<SootClass, List<SootMethod>> classMethodsListMap = new HashMap<SootClass, List<SootMethod>>();
	    	Map<SootMethod, String> methodDescriptorMap = new HashMap<SootMethod, String>();
	    	
	    	// Completable candidates are stored as a hashmap with entries containing key of SootMethod 
	    	// and value of SootClass, which is the direct superclass of the class in
	    	// the missing_methods.csv file
	    	Map<String, SootClass> completable_candidates = new HashMap<String, SootClass>();
	  		
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
		  			
		  			if (methodname.startsWith("set") || methodname.startsWith("get"))
		  				continue;
		  			
		  			String params = ClassFile.parseMethodDesc_params(descriptor);
		  			
		  			if (params.length() == 0 || params == null)
		  				params = "void";
		  			String[] paramList = params.split(",");
		  			// System.out.println(paramList[0]);
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
		  					  			
		  			SootClass sc = Scene.v().loadClassAndSupport(classname);
		  			if (sc.isInterface() || sc.isAbstract())
		  				continue;
		  			
		  			sc.setApplicationClass();
		  			
		  			List<SootClass> l = hierarchy.getSuperclassesOf(sc);
		  			if (l.size() == 1) {
		  				// when the size of l is 1, it means the superclass of sc is java.lang.Object.
		  				continue;
		  			}
		  			SootClass superclass = l.get(0);
		  			if (subclassCount.containsKey(superclass)) {
		  				subclassCount.put(superclass, subclassCount.get(superclass) + 1);
 		  			} else {
 		  				subclassCount.put(superclass, 1);
		  			}
		  			
		  			SootMethod sootMethod = new SootMethod(methodname, parameterTypeList, returnType);
		  			// System.out.println("Method subsignature: " + sootMethod.getSubSignature());
	  				
		  			Pair<SootClass, SootMethod> pair = new Pair(sc, sootMethod);
		  			missingMethodCoverageClassSet.add(pair);
		  			
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
		  		
		  		boolean isCandidate = true;
		  		int missingMethodClassCounter = 0;
		  		
		  		for (Entry<SootClass, List<SootMethod>> entry : classMethodsListMap.entrySet()) {
		  			SootClass sootclass = entry.getKey();
		  			List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(sootclass);
		  			List<SootClass> concreteSootClassList = new ArrayList<SootClass>();
		  			List<SootClass> abstractSootClassList = new ArrayList<SootClass>();
		  			for (SootClass sc: sootClassList) {
		  				if(sc.isConcrete()) {
		  					concreteSootClassList.add(sc);
		  				} else if (sc.isAbstract()){
		  					abstractSootClassList.add(sc);
		  				}
		  			}
		  			if (concreteSootClassList.size() <= 1)
		  				continue;
		  			for (SootMethod sootmethod: entry.getValue()) {
		  				// Horizontal Completable Hierarchy Condition Requirement 1: there are multiple sibling classes
		  				if (!ifHaveMultipleDirectSubClasses(sootclass, hierarchy)) {
		  					isCandidate = false;
		  				}
		  				// Horizontal Completable Hierarchy Condition Requirement 2: 
		  				// All sibling classes have an implementation of the SootMethod in interest
		  				for (SootClass sc: concreteSootClassList) {
		  					if (!sc.declaresMethod(sootmethod.getName(), sootmethod.getParameterTypes(), sootmethod.getReturnType())) {
		  						isCandidate = false;
		  					}
		  					// Horizontal Completable Hierarchy Condition Requirement 3: 
			  				// Only one of the sibling classes does not have the SootMethod in interest tested
		  					Pair<SootClass, SootMethod> temp_pair = new Pair(sc, sootmethod);
		  					if (missingMethodCoverageClassSet.contains(temp_pair)) {
		  						//System.out.println("temp_pair exists.");
		  						missingMethodClassCounter++;
		  						//System.out.println("SootClass: " + sc.getName() + " SootMethod: " + sootmethod.getSubSignature());
		  					}
		  				}
		  				//System.out.println("missingMethodClassCounter: " + missingMethodClassCounter);
		  				if (isCandidate && !completable_candidates.containsKey(sootmethod.getSubSignature()) && (missingMethodClassCounter == 1) ) {
		  					completable_candidates.put(sootmethod.getSubSignature(), sootclass);
		  				}
		  				missingMethodClassCounter = 0;
		  				isCandidate = true;
		  			}
		  		} 
		  		System.out.println("Completable candidates size: " + completable_candidates.size());
		  		for (Entry<String, SootClass> entry: completable_candidates.entrySet()) {
					 System.out.println("Candidate class name: " + entry.getValue().getName() + ", method name: " + entry.getKey());
					 List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(entry.getValue());
			  		 for (SootClass sc: sootClassList) {
			  			 if(sc.isConcrete()) {
			  				System.out.println("Concrete direct subclass: " + sc.getName());
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
	
	private static boolean ifHaveMultipleDirectSubClasses(SootClass sc, Hierarchy h) {		
		List<SootClass> l = h.getDirectSubclassesOf(sc);
		//System.out.println("List size: " + l.size());
		
		if (l.size() > 1) {
			for (SootClass sootclass: l) {
				//System.out.println("Package name: " + sootclass.getPackageName());
				//System.out.println("Class name: " + sootclass.getName());
			}
		}
		return l.size() > 1;
	}
}
