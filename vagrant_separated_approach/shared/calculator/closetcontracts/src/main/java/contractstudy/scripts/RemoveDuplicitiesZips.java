package contractstudy.scripts;

import com.google.common.base.Preconditions;
import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;


/**
 * This script removes duplicated entries in ZIP files.
 *
 * The algorithm is simple, it copies entries from old ZIP to a new one, skipping already processed names.
 *
 * @author Kamil Jezek
 */
public class RemoveDuplicitiesZips {

    public static void main(String[] args) throws Exception {

        Set<File> files = getProblematicProjectVersions();

        for (File f : files) {

            File newFile = new File(f.getPath() + ".tmp");
            ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(newFile));

            ZipFile zip = new ZipFile(f);
            Set<String> entryNames = new HashSet<>();
            Enumeration<? extends ZipEntry> en = zip.entries();

            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                String name = e.getName();
                if (entryNames.add(name)) {   // copy entry only if not already copied !!
                    ZipEntry newEntry = new ZipEntry(e);
                    outputStream.putNextEntry(newEntry);
                    InputStream in = zip.getInputStream(e);
                    IOUtils.copy(in, outputStream);
                    in.close();
                }

                outputStream.closeEntry();
            }
            outputStream.close();

            if (!newFile.renameTo(f)) {
                throw new IOException("Cannot rename: " + newFile);
            }
        }

    }

    /**
     * Find program vestions with corupted zip files.
     *
     * @return
     */
    private static Set<File> getProblematicProjectVersions() throws IOException {

        Set<File> versions = new HashSet<>();

        File DATA_FOLDER = new File(Preferences.getDataFolder());
        Preconditions.checkArgument(DATA_FOLDER.exists(), "Cannot find data in " + DATA_FOLDER.getAbsolutePath());

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER, new String[]{"zip"}, true);
        int counter = 0;

        for (File f : zips) {

            // System.out.println("Analysing " + (++counter) + "/" + zips.size() + " - " + f.getName());
            ZipFile zip = new ZipFile(f);
            Set<String> entryNames = new HashSet<>();
            Enumeration<? extends ZipEntry> en = zip.entries();
            while (en.hasMoreElements()) {
                ZipEntry e = en.nextElement();
                String name = e.getName();
                if (name.endsWith(".java")) {
                    if (!entryNames.add(name)) {
                        versions.add(f);
                        System.out.println("File file duplicate entry found: " + f.getName());
                        System.out.println("\t\tduplicate entry: " + name);
                        counter = counter + 1;
                        break;
                    }
                }
            }
        }


        return versions;
    }

}
