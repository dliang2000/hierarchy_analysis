package contractstudy.scripts;

import com.google.common.base.Preconditions;
import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;


/**
 * Task to collect inconsistent zips. See issue #42 for motivation.
 * We look for zips with multiple versions of the same file inside,
 * there is a known case where this is caused by inconsistent meta data.
 * Findings are reported on the console.
 * @author jens dietrich
 */
public class CheckForInconsistentZips {

    public static void main (String[] args) throws Exception {


        File DATA_FOLDER = new File(Preferences.getDataFolder());
        Preconditions.checkArgument(DATA_FOLDER.exists(),"Cannot find data in " + DATA_FOLDER.getAbsolutePath());

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        int counter = 0;

        for (File f:zips) {

            try {
                // System.out.println("Analysing " + (++counter) + "/" + zips.size() + " - " + f.getName());
                ZipFile zip = new ZipFile(f);
                Set<String> entryNames = new HashSet<>();
                Enumeration<? extends ZipEntry> en = zip.entries();
                while (en.hasMoreElements()) {
                    ZipEntry e = en.nextElement();
                    String name = e.getName();
                    if (name.endsWith(".java")) {
                        if (!entryNames.add(name)) {
                            System.out.println("File file duplicate entry found: " + f.getName());
                            System.out.println("\t\tduplicate entry: " + name);
                            counter = counter+1;
                            break;
                        }
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Done, " + counter + " inconsistent zips found");
    }

}
