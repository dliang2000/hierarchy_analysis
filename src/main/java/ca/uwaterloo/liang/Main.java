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
				+ File.separator + "commons-math-MATH_3_6_1" + File.separator + "src/main/classes/sootOutput/";
		System.out.println(class_path);
		Options.v().set_prepend_classpath(true);
		Options.v().set_soot_classpath(class_path);
		//Scene.v().loadClassAndSupport("java.lang.Object");
		
		List<SootClass> to_investigate = new ArrayList<SootClass>();
		
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
		}
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
