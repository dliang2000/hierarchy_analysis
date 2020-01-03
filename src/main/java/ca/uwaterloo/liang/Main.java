package ca.uwaterloo.liang;

import soot.*;
import soot.jimple.toolkits.pointer.LocalMustNotAliasAnalysis;
import soot.options.*;
import soot.toolkits.graph.ExceptionalUnitGraph;
import soot.util.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		 PackManager.v().getPack("jtp").add(
			     new Transform("jtp.myTransform", new BodyTransformer() {
			       protected void internalTransform(Body body, String phase, Map options) {
			         new LocalMustNotAliasAnalysis(new ExceptionalUnitGraph(body));
			       }
			     }));
		 String class_path = File.separator + "home" + File.separator + "daveroar" + File.separator + 
				    "Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				    + File.separator + "commons-math-MATH_3_6_1" + File.separator + "src/main/java/classes/";
		 
		 Options.v().set_prepend_classpath(true);
		 Options.v().set_verbose(true);
		 Options.v().set_soot_classpath(class_path);
		 soot.Main.main(args);
		 
		 // after process the entire directory, get the active hierarchy, with all the classes loaded onto scene. 
		 Hierarchy hierarchy = Scene.v().getActiveHierarchy();
		 
		 List<SootClass> completable_candidates = new ArrayList<SootClass>();
		 String classname = null;
		 
		 // Read in the classes with missed methods coverage
		 String csv_file = "commons_MATH_3_6_1_missing_methods.csv";
		 ClassLoader classLoader = new Main().getClass().getClassLoader();
		 File file = new File(classLoader.getResource(csv_file).getFile());
		 
		 System.out.println("File Found : " + file.exists());
		 
		 BufferedReader reader = new BufferedReader(new FileReader(file));
		 String line = null;
		 while((line = reader.readLine()) != null){
			 classname = line;
			 SootClass sc = Scene.v().loadClassAndSupport(classname);
			 System.out.println(classname);
			 
			 List<SootClass> l = hierarchy.getSuperclassesOf(sc);
			 if (l.size() == 1)
				 // when the size of l is 1, it means the superclass of sc is java.lang.Object.
				 continue;
			 SootClass superclass = l.get(0);
			 // System.out.println("Package name: " + superclass.getPackageName());
			 // System.out.println("Class name: " + superclass.getName());
		   
			 if (ifHaveMultipleDirectSubClasses(superclass, hierarchy)) {
				 completable_candidates.add(superclass);
			 }
		 }
		 
		 for (SootClass s: completable_candidates) {
			 System.out.println("Class name: " + s.getName());
		 }
	}
	
	public static String executeCommand(String command) {
	    String line;
	    String result = "";
	    try {
	    	ProcessBuilder builder;

	        builder = new ProcessBuilder("bash", "-c", command);
	        
	        builder.redirectErrorStream(true);
	        Process pr = builder.start();
	        // StringBuilder output = new StringBuilder();

			BufferedReader reader = new BufferedReader(
							new InputStreamReader(pr.getInputStream()));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				result += line + "\n";
			}
		} catch (IOException e) {
	        System.out.println("Exception = " + e.getMessage());
	    }
	    return result;
	}
	
	private static boolean ifHaveMultipleDirectSubClasses(SootClass sc, Hierarchy h) {
		// Hierarchy hierarchy = Scene.v().getActiveHierarchy();
		
		// List<SootClass> l = h.getSuperclassesOf(sc);
		
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
}
