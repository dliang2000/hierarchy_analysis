package contractstudy.scripts;

import semverstudy.commons.Logging;
import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.nio.charset.StandardCharsets;

/**
 * Screen for constraints (or rather constraint classes incl annotations).
 * Screen for constraints that use older, comments-style annotations.
 * Do a simple text search instead of building a much more expensive full-fledged extractor.
 * The extractor will only be build if this script reveals that there are
 * constraints of this type in the dataset analysed.
 * This will walk through a data set (zipped java sources) and simply look for references to package 
 * names for specific contract APIs incl annotations in source code. 
 * A summary of findings will be printed to the console. 
 * The package names are defined in a static field.  
 * @author jens dietrich
 */
public class ScreenForConstraintsByPackageName {

	static Logger LOGGER = Logging.getLogger(ScreenForConstraintsByPackageName.class);
	
	static String[] PACKAGES = {
		"javax.validation.constraints",
		"edu.umd.cs.findbugs.annotations",
		"javax.annotation", // JSR 205 !
        "javax.annotation.concurrent",
		"org.jetbrains.annotations",
        "org.intellij.lang.annotations",
		"lombok",
		"android.support.annotation",
		"org.eclipse.jdt.annotation",
		"net.sf.oval.constraint",  // http://oval.sourceforge.net/userguide.html#declaring-field-constraints 
		"org.valid4j", // http://www.valid4j.org/ .. API with static methods
		"com.google.java.contract", // https://github.com/nhatminhle/cofoja 
		"org.jmlspecs.annotation", // older versions of JML use comment-based annotations ! 
		"net.sourceforge.c4j", 
		"jass.modern", // http://csd.informatik.uni-oldenburg.de/~jass/doc/index.html  older versions use comment-based annotations ! 
		"org.checkerframework",
		"org.netbeans.api.annotations.common",
        "net.sf.chex4j",
        "org.javadbc.attributes"
	};

	public static void main(String[] args) throws Exception {
        File DATA_FOLDER = new File(Preferences.getDataFolder());

		Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
		Set<String> foundPackages = new HashSet<>();
		
		// package -> programs (not versions) using it
		Map<String,Set<String>> usage = new TreeMap<>();
		for (File f:zips) {
			String program = f.getParentFile().getName(); // no version number
			try (ZipFile zip = new ZipFile(f)) {
				Enumeration<? extends ZipEntry> en = zip.entries();
				Set<String> foundPackagesInProject = new HashSet<>();
				while (en.hasMoreElements()) {
					ZipEntry e = en.nextElement();
					String name = e.getName();
					if (name.endsWith(".java")) {
						try (InputStream in = zip.getInputStream(e)) {
							String src = IOUtils.toString(in,StandardCharsets.UTF_8); 
							for (String pck:PACKAGES) {
								if (!foundPackagesInProject.contains(pck) && src.contains(pck)) {
									LOGGER.info("Constraint system " + pck + " is used in " + f.getAbsolutePath() + " cu " + e.getName());
									foundPackagesInProject.add(pck);
								}
							}
						}
					}
				}
				for (String pck:foundPackagesInProject) {
					Set<String> programs = usage.get(pck);
					if (programs==null) {
						programs = new TreeSet<>();
						usage.put(pck, programs);
					}
					programs.add(program);
				}
			}
			catch (Exception x) {
				LOGGER.error("Cannot open " + f,x);
			}
			
			
		}
		
		LOGGER.info("Done!");
		LOGGER.info("\tpackages found: " + foundPackages.size() + " , details:");
		for (String pck:foundPackages) {
			LOGGER.info("\t" + pck);
		}
		
		LOGGER.info("STATS:");		
		for (Map.Entry<String,Set<String>> e:usage.entrySet()) {
			LOGGER.info("\t" + e.getKey() + " is used by " + e.getValue().size() + " program(s) ");
		}
	}

}
