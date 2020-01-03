package ca.uwaterloo.liang;

import soot.*;
import soot.options.*;
import soot.util.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		String class_path = File.separator + "home" + File.separator + "daveroar" + File.separator + 
				"Graduation_Studies" + File.separator + "ThesisWork" + File.separator + "OpenSourceProjects"
				+ File.separator + "commons-math-MATH_3_6_1" + File.separator + "src/main/java/";
		System.out.println(class_path);
		//Options.v().set_prepend_classpath(true);
		//Options.v().set_soot_classpath(class_path);
		//Scene.v().loadClassAndSupport("java.lang.Object");
        
		String command1 = "cd ~/Graduation_Studies/ThesisWork/OpenSourceProjects/commons-math-MATH_3_6_1/src/main/java";
//		final String dir = System.getProperty("user.dir");
//        System.out.println("current dir = " + dir);
		String command2 = "shopt -s globstar";
		String command3 = "mkdir classes";
		String command4 = "javac **/*.java -d \\classes";
		String command5 = "cd classes";
		String command6 = "java -cp /home/daveroar/Graduation_Studies/ThesisWork/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:.:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar soot.Main -cp . -pp -process-dir .";
		
		String command = command1 + " && " + command2 + " && " + command3 + " && " + command4 + " && " + command5 + " && " + command6; 
		//Runtime rt = Runtime.getRuntime();
		
		executeCommand(command);
		
		//Scene.v().loadNecessaryClasses();
		
		/*List<SootClass> to_investigate = new ArrayList<SootClass>();
		
		String classname = null;
		
		String csv_file = "commons_MATH_3_6_1_missing_methods.csv";
		ClassLoader classLoader = new Main().getClass().getClassLoader();
		File file = new File(classLoader.getResource(csv_file).getFile());
        
        System.out.println("File Found : " + file.exists());
        
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = reader.readLine()) != null){
			classname = line;
			SootClass sc = Scene.v().loadClassAndSupport(classname);
			
			//List<SootClass> list = Scene.v().getClasses(1);
			Hierarchy hierarchy = Scene.v().getActiveHierarchy();
			
	        //sc.setApplicationClass();
			System.out.println(classname);
			SootClass superclass = findDirectSuperClass(sc, hierarchy);
			
//			if (ifHaveMultipleDirectSubClasses(superclass, hierarchy)) {
//				to_investigate.add(superclass);
//			}
		}*/
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

	private static SootClass findDirectSuperClass(SootClass sc, Hierarchy h) {
		// Hierarchy hierarchy = Scene.v().getActiveHierarchy();
		
		List<SootClass> l = h.getSuperclassesOf(sc);
		
		//List<SootClass> l = h.getDirectSubclassesOf(sc);
		System.out.println("List size: " + l.size());
		
		SootClass sootclass = l.get(0);
		System.out.println("Package name: " + sootclass.getPackageName());
		System.out.println("Class name: " + sootclass.getName());
		
		return sootclass;
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
