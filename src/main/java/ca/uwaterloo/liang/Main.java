package ca.uwaterloo.liang;

import soot.*;
//import soot.jimple.toolkits.callgraph.CHATransformer;
import soot.jimple.toolkits.pointer.LocalMustNotAliasAnalysis;
import soot.options.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.*;

import java.io.*;
import java.util.*;

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
	    	Map<SootClass, String> classParameterListMap = new HashMap<SootClass, String>();
	    	Map<SootClass, String> classReturnTypeMap = new HashMap<SootClass, String>();
	    	Set<SootClass> completable_candidates = new HashSet<SootClass>();
	  		String classname = null;
	  		 
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
		  			System.out.println(classname);
		  			SootClass sc = Scene.v().loadClassAndSupport(classname);
		  			sc.setApplicationClass();
		  			 
		  			List<SootClass> l = hierarchy.getSuperclassesOf(sc);
		  			if (l.size() == 1)
		  				// when the size of l is 1, it means the superclass of sc is java.lang.Object.
		  				continue;
		  			SootClass superclass = l.get(0);
		  			// System.out.println("Package name: " + superclass.getPackageName());
		  			// System.out.println("Class name: " + superclass.getName());
		  			if (subclassCount.containsKey(superclass)) {
		  				subclassCount.put(superclass, subclassCount.get(superclass) + 1);
 		  			} else {
 		  				subclassCount.put(superclass, 1);
		  			}
		  		}
		  		
		  		for (Map.Entry<SootClass, Integer> entry : subclassCount.entrySet()) {
		  			if (entry.getValue() == 1) {
		  				SootClass sootclass = entry.getKey();
		  				// sootclass.setApplicationClass();
		  				if (ifHaveMultipleDirectSubClasses(sootclass, hierarchy)) {
		  					List<SootClass> subclasses = retDirectSubClasses(sootclass, hierarchy);
		  					//completable_candidates.add(sootclass);
			  			}
		  			}
		  		} 
		  		System.out.println("Completable candidates size: " + completable_candidates.size());
		  		for (SootClass s: completable_candidates) {
					 System.out.println("Class name: " + s.getName());
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
		System.out.println("List size: " + l.size());
		
		if (l.size() > 1) {
			for (SootClass sootclass: l) {
				System.out.println("Package name: " + sootclass.getPackageName());
				System.out.println("Class name: " + sootclass.getName());
			}
		}
		return l.size() > 1;
	}
	
	private static List<SootClass> retDirectSubClasses(SootClass sc, Hierarchy h) {		
		List<SootClass> l = h.getDirectSubclassesOf(sc);
		System.out.println("List size: " + l.size());
		return l;
	}
}
