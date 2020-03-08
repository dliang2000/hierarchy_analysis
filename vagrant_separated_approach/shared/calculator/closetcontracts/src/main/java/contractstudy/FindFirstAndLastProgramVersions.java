package contractstudy;

import com.google.common.collect.Sets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import semverstudy.commons.Logging;

import java.io.File;
import java.util.*;

/**
 * Utility to find the first version of each program in the data set.
 * @author jens dietrich
 */
public class FindFirstAndLastProgramVersions {

    static Logger LOGGER = Logging.getLogger(FindFirstAndLastProgramVersions.class);

    public static Pair<Map<String,ProgramVersion>,Map<String,ProgramVersion>> find() throws Exception {

        File DATA_FOLDER = new File(Preferences.getDataFolder());
        // use tree sets, ProgramVersion is comparable
        Map<String, TreeSet<ProgramVersion>> programVersionsByProgram = new TreeMap<>();
        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER, new String[]{"zip"}, true);

        // objects for debug only start with __
        Set<String> __programs = new HashSet<>();

        for (File f : zips) {
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            String programName = pv.getName();
            __programs.add(programName);
            if (canBeSorted(pv)) {
                programVersionsByProgram.compute(programName, (n, list) -> {
                    if (list == null) {
                        list = new TreeSet<>();
                    }
                    list.add(pv);
                    return list;
                });
            }
        }

        Set<String> __diff = Sets.difference(programVersionsByProgram.keySet(),__programs);
        LOGGER.warn(__diff);

        Map<String,ProgramVersion> firstVersions = new TreeMap<>();
        Map<String,ProgramVersion> lastVersions = new TreeMap<>();

        programVersionsByProgram
                .keySet()
                .stream()
                .map(n -> programVersionsByProgram.get(n))
                .filter(list -> !list.isEmpty())
                .map(list -> list.first())
                .forEach(pv -> firstVersions.put(pv.getName(),pv));

        programVersionsByProgram
                .keySet()
                .stream()
                .map(n -> programVersionsByProgram.get(n))
                .filter(list -> !list.isEmpty())
                .map(list -> list.last())
                .forEach(pv -> lastVersions.put(pv.getName(),pv));

        Pair<Map<String,ProgramVersion>,Map<String,ProgramVersion>> result = new ImmutablePair(firstVersions,lastVersions);

        int EXAMPLES_TO_PRINT = 10;
        LOGGER.info("Extracted first and last versions");
        LOGGER.info("\tFirst versions extracted: " + result.getLeft().size());
        Iterator<Map.Entry<String,ProgramVersion>> iter = result.getLeft().entrySet().iterator();
        for (int i=0;i<EXAMPLES_TO_PRINT;i++) {
            if (iter.hasNext()) {
                Map.Entry<String,ProgramVersion> next = iter.next();
                LOGGER.info("\t" + next.getKey() + " = " + next.getValue());
            }
        }
        if (iter.hasNext()) LOGGER.info("\t..");
        LOGGER.info("\tLast versions extracted: " + result.getRight().size());
        iter = result.getRight().entrySet().iterator();
        for (int i=0;i<EXAMPLES_TO_PRINT;i++) {
            if (iter.hasNext()) {
                Map.Entry<String,ProgramVersion> next = iter.next();
                LOGGER.info("\t" + next.getKey() + " = " + next.getValue());
            }
        }
        if (iter.hasNext()) LOGGER.info("\t..");

        return result;
    }

    // main for testing
    public static void main (String[] args) throws Exception {
        find();
    }


    private static boolean canBeSorted(ProgramVersion pv) {
        // use blacklist API to exclude versions with version numbers that don't fit into versioning scheme
        try {
            return !contractstudy.diffrules.Utils.cannotSort(pv);
        }
        catch (Exception x) {
            // TODO: this should not be necessary
            return false;
        }
    }
}
