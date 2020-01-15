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
	public static void main(String[] args) throws IOException {
		 PackManager.v().getPack("wjtp").add(
			     new Transform("wjtp.myTransform", CompletableTestTransformer.v()) {
			     });
		 String class_path = File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				    + File.separator + "commons-math-MATH_3_6_1" + File.separator + "src/main/java/classes/";
		 
		 Options.v().set_prepend_classpath(true);
		 Options.v().set_whole_program(true);
		 Options.v().set_verbose(true);
		 Options.v().set_soot_classpath(class_path);
		 soot.Main.main(args);
	}
	
	public static class CompletableTestTransformer extends SceneTransformer {
		private final static CompletableTestTransformer instance = new CompletableTestTransformer();
	    private CompletableTestTransformer() {}
		public static CompletableTestTransformer v() { return instance; }
	    @Override
	    protected void internalTransform(String phaseName, Map options) {
	    	// after process the entire directory, get the active hierarchy, with all the classes loaded onto scene. 
	    	
	    	Hierarchy hierarchy = Scene.v().getActiveHierarchy();
	    	//CHATransformer.v().transform();
	    	System.out.println(Scene.v().getSootClassPath());
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
	  		String csv_file = "commons_MATH_3_6_1_missing_methods.csv";
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
		  			
		  			// System.out.println("Classname:" + classname);
		  			// System.out.println("Methodname:" + methodname);
		  			
		  			// System.out.println(ClassFile.parseMethodDesc_return(descriptor));
		  			Type returnType;
		  			if (Scene.v().getTypeUnsafe(ClassFile.parseMethodDesc_return(descriptor), false) == null) {
		  				returnType = VoidType.v();
		  			} else {
		  				returnType = Scene.v().getType(ClassFile.parseMethodDesc_return(descriptor));
		  			}
		  					  			
		  			SootClass sc = Scene.v().loadClassAndSupport(classname);
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
		  			System.out.println("Method subsignature: " + sootMethod.getSubSignature());
	  				
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
		  			SootClass sootclass = entry.getKey();
		  			List<SootClass> sootClassList = hierarchy.getDirectSubclassesOf(sootclass);
		  			boolean isCandidate = true;
		  			for (SootMethod sootmethod: entry.getValue()) {
		  				if (!ifHaveMultipleDirectSubClasses(sootclass, hierarchy)) {
		  					isCandidate = false;
		  				}
		  				for (SootClass sc: sootClassList) {
		  					if (!sc.declaresMethod(sootmethod.getName(), sootmethod.getParameterTypes(), sootmethod.getReturnType())) {
		  						isCandidate = false;
		  					}
		  				}
		  				if (isCandidate && !completable_candidates.containsKey(sootmethod.getName())) {
		  					completable_candidates.put(sootmethod.getName(), sootclass);
		  				}
		  				isCandidate = true;
		  			}
		  		} 
		  		System.out.println("Completable candidates size: " + completable_candidates.size());
		  		for (Entry<String, SootClass> entry: completable_candidates.entrySet()) {
					 System.out.println("Candidate class name: " + entry.getValue().getName() + ", method name: " + entry.getKey());
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
