package contractstudy.diffrules;

import contractstudy.ConstraintType;
import contractstudy.ContractElement;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Useful reusable utils.
 * @author jens dietrich
 */
public class Utils {

    private static Logger LOGGER = Logging.getLogger(Utils.class);

    public static NumberFormat NF = NumberFormat.getIntegerInstance(Locale.US);


    public static List<ContractElement> filter(List<ContractElement> contractElements, Predicate<ContractElement> condition) {
        return contractElements.stream().filter(condition).collect(Collectors.toList());
    }

    /**
     * Useful comparision to match contstraints from different sources. Ignores program, cu and additional info:
     * ignore program version to facilitate evolution studies
     * ignore cu to facilitate hierarchy (LSP) studies
     * ignore additional info (optional) as it is considered irrelvant)
     * @param o1
     * @param o2
     * @return
     */
    public static boolean unchanged(ContractElement o1, ContractElement o2, boolean ignoreAdditionalInfoField) {
        return  o1.getConstraintedArtefact()==o2.getConstraintedArtefact()
                && o1.getKind() == o2.getKind()
                && o1.getCondition().equals(o2.getCondition())
                && (ignoreAdditionalInfoField || o1.getAdditionalInfo().equals(o2.getAdditionalInfo()));
    };


    /**
     * Return true if condition in second constraint has been only extended.
     * The extension is checked by added logical condition.
     *
     * @param o1
     * @param o2
     * @param operator logical operator to check for
     * @return
     */
    public static boolean conditionExtended(ContractElement o1, ContractElement o2, String operator) {

        // remove all white chars.
        String cond1 = o1.getCondition().replaceAll("\\s", "");
        String cond2 = o2.getCondition().replaceAll("\\s", "");;

        // separate logical formula to components.
        String[] con1parts = cond1.split("\\|\\||&&");  //   || or &&
        String[] con2parts = cond2.split("\\|\\||&&");  //   || or &&

        List<String> con1List = new ArrayList<>(Arrays.asList(con1parts));
        List<String> con2List = new ArrayList<>(Arrays.asList(con2parts));

        // check that the first list is subset of second - i.e. second list is only extension of the first one
        con1List.removeAll(con2List);

        // check the remaining parts are connected to expectend logical operator
        con2List.removeAll(Arrays.asList(con1parts));
        boolean ok = con1List.isEmpty();
        for (String item : con2List) {
            // contains  ||x  or  x||
            // or        &&x  or  x&&
            ok &= (cond2.contains(operator + item) || cond2.contains(item + operator));
        }

        for (String first : new ArrayList<>(con1List)) {
            for (String second : con2List) {
                if (first.equals(second)) {
                    con1List.remove(first);
                }
            }
        }

        return ok
                && o1.getConstraintedArtefact() == o2.getConstraintedArtefact()
                && o1.getKind() == o2.getKind();
    }
    /**
     * Return true if condition in second constrains has been only extended.
     * The extension is checked by added logical condition.
     *
     * @param o1
     * @param o2
     * @return
     */
    public static boolean constraintStrengthened(ContractElement o1, ContractElement o2) {

        return conditionExtended(o1, o2, "&&") ;
    }

    /**
     * Return true if condition in second constrains has been only extended.
     * The extension is checked by added logical condition.
     *
     * @param o1
     * @param o2
     * @return
     */
    public static boolean constraintWeakened(ContractElement o1, ContractElement o2) {

        return conditionExtended(o1, o2, "||");
    }

    /**
     * Check getter refactor. It means a constraint is changed from "foo" to "getFoo()"
     * @param o1
     * @param o2
     * @return
     */
    public static boolean getterRefactor(ContractElement o1, ContractElement o2) {
        boolean r = false;

        if (o1.getCondition().contains("is") || o1.getCondition().contains("get")
                || o2.getCondition().contains("is") || o2.getCondition().contains("get")) {

            String cond1 = o1.getCondition()
                    .replaceAll("get", " ")
                    .replaceAll("is", " ")
                    .replaceAll("\\(\\)", " ");

            String cond2 = o2.getCondition()
                    .replaceAll("get", " ")
                    .replaceAll("is", " ")
                    .replaceAll("\\(\\)", " ");

            cond2 = WordUtils.uncapitalize(cond2).replaceAll("\\s", "");
            cond1 = WordUtils.uncapitalize(cond1).replaceAll("\\s", "");

            r =  cond1.equals(cond2);

        }

        return r;
    }


    /**
     * Return true if the input version cannot be sorted
     * due to crazy version coding.
     *
     * @param programVersion version.
     * @return true if cannot be sorted
     */
    public static boolean cannotSort(final ProgramVersion programVersion) {
        String version = programVersion.getSanitizedVersion();
        return version == null;
    }


    public static  Map<String, List<ProgramVersion>> getSortedProgramVersions () throws Exception {

        File versions = new File("data/version-order.txt");
        List<String> sortedVersions = FileUtils.readLines(versions,StandardCharsets.UTF_8);
        final Map<String,Integer> sorted = new HashMap<>();
        int c = 0;
        for (String v:sortedVersions) {
            if (!v.startsWith("#") && v.trim().length()>0) { // ecl comments
                sorted.put(v,c);
            }
            c = c+1;
        }

        File DATA_FOLDER = new File(Preferences.getDataFolder());
        // use tree sets, ProgramVersion is comparable
        Map<String, List<ProgramVersion>> programVersionsByProgram = new TreeMap<>();
        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER, new String[]{"zip"}, true);

        for (File f : zips) {
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            String programName = pv.getName();
            //if (!cannotSort(pv)) {
                programVersionsByProgram.compute(programName, (n, list) -> {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    list.add(pv);
                    return list;
                });
            //}
        }

        // sort lists
        for (List<ProgramVersion> list: programVersionsByProgram.values()) {
            Collections.sort(list, new Comparator<ProgramVersion>() {
                @Override
                public int compare(ProgramVersion o1, ProgramVersion o2) {
                    Integer i1 = sorted.get(o1.getName());
                    assert i1!=null;
                    Integer i2 = sorted.get(o2.getName());
                    assert i2!=null;
                    return sorted.get(i1.intValue()-i2.intValue());
                }
            });
        }


        return programVersionsByProgram;

    }

    public static boolean isNullable(ContractElement c) {
        ConstraintType type = c.getKind();
        return type == ConstraintType.JSR305Nullable ||
                type == ConstraintType.JSR305CheckForNull ||
                type == ConstraintType.JSR303Null ||
                type == ConstraintType.FindBugsNullable ||
                type == ConstraintType.JetBrainsNullable;
    }

}
