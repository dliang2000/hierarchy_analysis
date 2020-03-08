package semverstudy.commons;

import com.google.common.base.Preconditions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;

/**
 * Some common filters for project file system traversals, based on conventions like the mvn standard project layout.
 * @author jens dietrich
 */
public class ProjectTraversalFilters {

    public static final Predicate<Path> IS_PROGRAM_SOURCE = f -> {
        String name = f.toString();
        return !Files.isDirectory(f) && name.contains("src/main/java/") && name.endsWith(".java");
    };

    public static final Predicate<Path> IS_TEST_SOURCE = f -> {
        String name = f.toString();
        return !Files.isDirectory(f) && name.contains("src/test/java/") && name.endsWith(".java");
    };

    public static final String getProgramCUName(Path file) {
        Preconditions.checkArgument(file.toString().contains("src/main/java/"));
        Preconditions.checkArgument(file.toString().endsWith("java"));
        String p = file.toString();
        int idx = p.lastIndexOf("src/main/java/");
        p = p.substring(idx+"src/main/java/".length());
        // idx = p.lastIndexOf(".java");
        // p = p.substring(0,idx);
        return p;
    }

}
