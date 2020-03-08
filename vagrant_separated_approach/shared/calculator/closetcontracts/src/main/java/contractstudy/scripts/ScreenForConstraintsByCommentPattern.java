package contractstudy.scripts;

import semverstudy.commons.Logging;
import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Screen for constraints that use older, comments-style annotations.
 * Do a simple text search instead of building a much more expensive full-fledged extractor.
 * The extractor will only be build if this script reveals that there are
 * constraints of this type in the dataset analysed.
 * @author jens dietrich
 */
public class ScreenForConstraintsByCommentPattern {

    static Logger LOGGER = Logging.getLogger(ScreenForConstraintsByCommentPattern.class);

    // expose fo runit testing !
	public static Pattern[] PATTERNS = {
        // JML style patterns
        Pattern.compile("//@.*"),
        Pattern.compile("/\\*@"),

        // icontract style patterns
        Pattern.compile("@pre"),
        Pattern.compile("@post"),
        Pattern.compile("@inv"),

        // jass style patterns
        Pattern.compile("/\\*\\*\\s*ensure"),
        Pattern.compile("/\\*\\*\\s*require"),
        Pattern.compile("/\\*\\*\\s*invariant"),
	};

	public static void main(String[] args) throws Exception {

        File DATA_FOLDER = new File(Preferences.getDataFolder());

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
		Set<String> foundPackages = new HashSet<>();
		
		// pattern -> programs (not versions) using it
		Map<Pattern,Set<String>> usage = new TreeMap<>();
		for (File f:zips) {
			String program = f.getParentFile().getName(); // no version number
			try (ZipFile zip = new ZipFile(f)) {
				Enumeration<? extends ZipEntry> en = zip.entries();
				Set<Pattern> foundPatternsInProject = new HashSet<>();
				while (en.hasMoreElements()) {
					ZipEntry e = en.nextElement();
					String name = e.getName();
					if (name.endsWith(".java")) {
						try (InputStream in = zip.getInputStream(e)) {
							String src = IOUtils.toString(in,StandardCharsets.UTF_8); 
							for (Pattern pattern:PATTERNS) {
								if (!foundPatternsInProject.contains(pattern) && pattern.matcher(src).matches()) {
									LOGGER.info("Pattern " + pattern.pattern() + " is used in " + f.getAbsolutePath());
									foundPatternsInProject.add(pattern);
								}
							}
						}
					}
				}
				for (Pattern pattern:foundPatternsInProject) {
					Set<String> programs = usage.get(pattern);
					if (programs==null) {
						programs = new TreeSet<>();
						usage.put(pattern, programs);
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
		for (Map.Entry<Pattern,Set<String>> e:usage.entrySet()) {
			LOGGER.info("\t" + e.getKey().pattern() + " is used by " + e.getValue().size() + " program(s) ");
		}
	}

}
