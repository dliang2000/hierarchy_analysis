package contractstudy.hierarchy;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;
import semverstudy.commons.Logging;
import contractstudy.ProgramVersion;
import contractstudy.scripts.CollectContracts;
import org.apache.log4j.Logger;

import java.util.Collection;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class SourceClassFinder implements ClassFinder {

    private Logger LOGGER = Logging.getLogger(CollectContracts.class);

    /**
     * key - simple class name, value - package
     */
    private Multimap<String, String> classPcgs = HashMultimap.create();
    /**
     * key - class origin, value - full class name
     */
    private Multimap<String, ProgramVersion> classOrigin = HashMultimap.create();

    /**
     * CU cache  key - class name, program version,  value CU
     */
    Table<String, ProgramVersion, String> cuNames;

    public SourceClassFinder(
            final Multimap<String, String> classPcgs,
            final Multimap<String, ProgramVersion> classOrigin,
            final Table<String, ProgramVersion, String> cuNames) {

        this.classPcgs = classPcgs;
        this.classOrigin = classOrigin;
        this.cuNames = cuNames;
    }

    @Override
    public ClassAndVersion findClass(
            final String simpleClassName,
            final String[] imports) {

        // check that we have the parent class at all.
        Collection<String> pcgs = classPcgs.get(simpleClassName);

        ClassAndVersion r = null;
        if (!pcgs.isEmpty()) {

            // we have a class, let check packages.
            String fullClassName = checkImports(simpleClassName, pcgs, imports);
            if (fullClassName != null) {
                r = createClassAndOrigin(fullClassName);
            }
        }

        return r;
    }

    /**
     * Check if the import class name corresponds with imports
     *
     * @param simpleClassName simple class name
     * @param pcgs            packages where the class is
     * @param imports         possible imports
     * @return matched full class name
     */
    private String checkImports(
            final String simpleClassName,
            final Collection<String> pcgs,
            final String[] imports) {

        String r = null;
        for (String importPcg : imports) {
            for (String pcg : pcgs) {
                if (importPcg.endsWith(".*")) {
                    // widlcard
                    // e.g.  import java.util.*
                    if (importPcg.substring(0, importPcg.lastIndexOf('.')).equals(pcg)) {
                        r = getClassName(pcg, simpleClassName);
                        break;
                    }
                } else {
                    // direct class import.
                    // e.g   import java.util.List
                    String fullClassName = getClassName(pcg, simpleClassName);
                    if (importPcg.equals(fullClassName)) {
                        r = importPcg;
                        break;
                    }
                }
            }
        }

        return r;
    }

    public String getClassName(String packageName, String classSimpleName) {
        String name = classSimpleName;
        if (packageName != null) {
            name = packageName + '.' + classSimpleName;
        }

        return name;
    }

    private ClassAndVersion createClassAndOrigin(final String className) {
        Collection<ProgramVersion> programVersions = classOrigin.get(className);
//        if (files.size() > 1) {
//            LOGGER.warn("More than 1 file provide a class " + className + " files: " + files);
//        }

        ProgramVersion v = programVersions.toArray(new ProgramVersion[1])[0];
        String cuName = cuNames.column(v).get(className);

        return new ClassAndVersion(v, className, cuName);
    }
}
