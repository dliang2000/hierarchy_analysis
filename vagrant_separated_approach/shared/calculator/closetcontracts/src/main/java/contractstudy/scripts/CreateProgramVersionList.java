package contractstudy.scripts;

import semverstudy.commons.Logging;
import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;

/**
 * Script to create a simple text file consisting of all zips containing program versions.
 * The purpose of such a file is to manually edit the order of versions.
 * @author jens dietrich
 */
public class CreateProgramVersionList {

    static Logger LOGGER = Logging.getLogger(CreateProgramVersionList.class);

    public static void main (String[] args) throws Exception {
        File DATA_FOLDER = new File(Preferences.getDataFolder());
        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER, new String[]{"zip"}, true);
        File versions = new File(Preferences.getOutputFolder(),"version-order.txt");
        try (PrintWriter out = new PrintWriter(new FileWriter(versions))) {
            for (File zip : zips) {
                out.println(zip.getName().replace(".zip",""));
            }
        }
        LOGGER.info("Version list written to " + versions.getAbsolutePath());
    }
}
