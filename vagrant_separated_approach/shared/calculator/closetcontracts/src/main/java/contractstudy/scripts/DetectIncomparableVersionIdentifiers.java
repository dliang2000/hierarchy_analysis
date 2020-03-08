/**
 * 
 */
package contractstudy.scripts;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.io.FileUtils;

import contractstudy.Preferences;
import contractstudy.ProgramVersion;

/**
 * Creates a blacklist of program versions (filenames) which cannot be reliably compared in evolution
 * study due to version qualifiers with unknown semantics.  
 * 
 * @see ProgramVersion.getSanitizedVersion() for "good" qualifiers.
 * 
 * @author premek brada
 *
 */
public class DetectIncomparableVersionIdentifiers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        File DATA_FOLDER = new File(Preferences.getDataFolder());

        AtomicInteger total = new AtomicInteger(0);
        AtomicInteger failed = new AtomicInteger(0);

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        String sv = null;
        
        Collection<ProgramVersion> incomparablePVs = new ArrayList<ProgramVersion>();
        Collection<ProgramVersion> failingPVs = new ArrayList<ProgramVersion>();
        Collection<ProgramVersion> goodGuys = new ArrayList<ProgramVersion>();

        for (File f:zips) {
        	ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
        	total.incrementAndGet();
        	try {
        		sv = pv.getSanitizedVersion();
        	}
        	catch (Exception e) {
        		failingPVs.add(pv);
        		failed.incrementAndGet();
        		sv = null;
        	}
        	if (sv == null) {
        		incomparablePVs.add(pv);
        		failed.incrementAndGet();
        	}
        	else {
        		goodGuys.add(pv);
        	}
        }
        
        System.out.println("*** Analyzed: " + total + ", failed: " + failed);

		System.out.println("*** Incomparable versions: ");
		if (incomparablePVs.size() == 0) {
			System.out.println("(none)");
		}
		else {
			for (ProgramVersion pv:incomparablePVs) {
				System.out.println(pv.getName() + ":" + pv.getVersion());
			}
		}

		System.out.println("*** Problem sanitizing versions: ");
		if (failingPVs.size() == 0) {
			System.out.println("(none)");
		}
		else {
			for (ProgramVersion pv:failingPVs) {
				System.out.println(pv.getName() + ":" + pv.getVersion());
			}
		}

		System.out.println("*** Sanitized, sorted: ");
		Collections.sort((List<ProgramVersion>) goodGuys);
		for (ProgramVersion pv:goodGuys) {
			System.out.println(pv.getName() + ":" + pv.getSanitizedVersion() + "          (for " + 
						pv.getName() + "-" + pv.getVersion() + ")");
		}
	}

}
