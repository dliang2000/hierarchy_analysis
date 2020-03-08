package contractstudy.scripts.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Default artefact that is based on files, i.e. check existence of an artefact
 * by existence of files.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class FileScanArtefact implements ExperimentArtefact {

    private File root;
    private Collection<File> files;

    public FileScanArtefact(File root) {
        this(root, new ArrayList<>());
    }

    /**
     *
     * @param root root folder with artefact results
     * @param files additional files in the root to check for, may be empty
     */
    public FileScanArtefact(final File root, final Collection<File> files) {
        this.root = root;
        this.files = files;
    }

    @Override
    public boolean exists() {
        boolean exists = root.exists();

        for (File f : files) {
            exists &= f.exists();
        }

        return exists;
    }

    @Override
    public String getName() {
        return root.getPath();
    }
}
