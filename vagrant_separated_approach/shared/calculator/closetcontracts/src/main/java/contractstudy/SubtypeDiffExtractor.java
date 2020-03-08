package contractstudy;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import contractstudy.diffrules.Utils;
import contractstudy.hierarchy.ClassAndVersion;
import contractstudy.scripts.CollectInvocationViaSuper;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import semverstudy.commons.Logging;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static contractstudy.maven.CorpusUtils.listJsons;
import static contractstudy.maven.CorpusUtils.listProjects;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class SubtypeDiffExtractor implements DiffExtractor {

    // TODO abstract or util class not to repeat code

    private static Logger LOGGER = Logging.getLogger(SubtypeDiffExtractor.class);

    /**
     * We do not use class name, as it is not stored in the Constraint. Only CU is stored.
     */
    private static final String EMPTY_CLASS_NAME = "";

    /**
     * Removed because cannot be sorted.
     */
    private static final String REMOVED_SORT = "sort";
    /**
     * Removed because it is abstract method.
     */
    private static final String REMOVED_ABSTRACT = "abstract";
    /**
     * Removed because it calls super.
     */
    private static final String REMOVED_SUPER = "super";

    /**
     * Removed because it uses annotations.
     */
    private static final String REMOVED_ANNOTATIONS = "annotations";


    @Override
    public List<DiffRecord> extract() throws Exception {

        HashMultimap<ClassAndVersion, ClassAndVersion> inheritanceMap = HashMultimap.create();
        Map<ClassAndVersion, Set<String>> methodsMap = new HashMap<>();
        readInheritanceCSV(inheritanceMap, methodsMap);
        Set<CollectInvocationViaSuper.SuperCallSite> superCallSites = collectMethodsWithSuper();
        Set<String> superCallSitesDescs = new HashSet<>();
        superCallSites.forEach(i -> superCallSitesDescs.add(i.getCu() + "/" + i.getMethodDecl()));  // convert to strings

        Multimap<String, ContractElement> removed = ArrayListMultimap.create();

        List<DiffRecord> results = new ArrayList<>();
        List<ContractElement> contractElements = new ArrayList<>();
        int total = 0;
        int[] numberRemoved = new int[]{0};
        Collection<File> jsons = FileUtils.listFiles(new File(Preferences.getOutputContractsFolder()), new String[]{"json"}, false);
        for (File json : jsons) {
            String data = FileUtils.readFileToString(json, StandardCharsets.UTF_8);
            JSONArray all = new JSONArray(data);
            all.forEach(e -> {
                ContractElement c = ContractElement.fromJSON((JSONObject) e);
                if (!shouldExclude(c, removed, superCallSitesDescs)) {
                    contractElements.add(c);
                } else {
                    numberRemoved[0]++;
                }
            });
            total += all.length();
        }

        // sort !!
        Collections.sort(contractElements, new Comparator<ContractElement>() {
            @Override
            public int compare(ContractElement pc1, ContractElement pc2) {
                return pc1.getProgramVersion().toString().compareTo(pc2.getProgramVersion().toString());
            }
        });


        // index constraints by method or class
        ListMultimap<String, ContractElement> constraintIndex = ArrayListMultimap.create();
        for (ContractElement pc : contractElements) {
            constraintIndex.put(getIndexKey(pc.getProgramVersion(), pc.getCuName(), pc.getMethodDeclaration()), pc);
        }

        Set<String> processedIndexes = new HashSet<>();
        // build diff records
        Set<String> done = new HashSet<>();
        for (ContractElement pc : contractElements) {
            String key = getIndexKey(pc.getProgramVersion(), pc.getCuName(), pc.getMethodDeclaration());
            if (done.add(key)) {

                ClassAndVersion subClass = new ClassAndVersion(pc.getProgramVersion(), EMPTY_CLASS_NAME, pc.getCuName());
                Set<ClassAndVersion> parents = inheritanceMap.get(subClass);
                List<ContractElement> constraints2 = constraintIndex.get(key);

                if (notProcessed(constraints2, processedIndexes)) {
                    for (ClassAndVersion parent : parents) {
                        Set<String> methods = methodsMap.get(parent);

                        // create record only if the parent method exists (a method exists in respective CU
                        if (methods.contains(pc.getMethodDeclaration())) {
                            String parentKey = getIndexKey(parent.getProgramVersion(), parent.getCuName(), pc.getMethodDeclaration());
                            List<ContractElement> constraints1 = constraintIndex.get(parentKey);

                            DiffRecord record = new DiffRecord(
                                    constraints1,
                                    parent.getProgramVersion(),
                                    parent.getCuName(),
                                    pc.getMethodDeclaration(),
                                    constraints2,
                                    pc.getProgramVersion(),
                                    pc.getCuName(),
                                    pc.getMethodDeclaration());

                            results.add(record);
                        }
                    }
                }
            }

        }

        LOGGER.info("Number of total constraints: " + total);
        LOGGER.info("Number of used constraints: " + contractElements.size());
        LOGGER.info("Number of removed constrains: " + numberRemoved[0]);

        LOGGER.info("\tDetail: ");
        for (String key : removed.keySet()) {
            int value = removed.get(key).size();
            LOGGER.info("\t\t" + key + ": " + value + " (" + percent(total, value) + "%)");
        }

        return results;
    }

    /**
     * Return true if the input constraints have not been processed yet.
     * Index set is also updated.
     *
     * @param contractElements constraints to check
     * @param processedIndexes index of already processed, will be updated in this method
     * @return
     */
    private boolean notProcessed(List<ContractElement> contractElements, Set<String> processedIndexes) {
        boolean canProcess = false;

        for (ContractElement c : contractElements) {
            String index = getIndexSameConstrDifferentVersion(c);
            // check the index is not present
            canProcess |= !processedIndexes.contains(index);
            processedIndexes.add(index);
        }

        return canProcess;
    }


    private static String getIndexKey(ProgramVersion pv, String cu, String methodDecl) {
        return pv.getName() + "-" + pv.getVersion() + '#' + cu + '/' + (methodDecl == null ? "" : methodDecl);
    }

    /**
     * This creates index for the same constraints, which differ only in applied versions.
     * In other words, it captures if the same constraints is added again and again to different versions
     *
     * @return
     */
    private static String getIndexSameConstrDifferentVersion(final ContractElement pc) {
        ProgramVersion pv = pc.getProgramVersion();
        String cu = pc.getCuName();
        String methodDecl = pc.getMethodDeclaration();

        return pv.getName() + '#' + cu + '/' + (methodDecl == null ? "" : methodDecl) + " c:" + pc.getCondition() + "," + pc.getKind();
    }

    /**
     * Filter constraints
     *
     * @param contractElement     a constraint
     * @param removed        store removed here.
     * @param superCallSites super callsites.
     * @return true if the given constraint should be excluded
     */
    private boolean shouldExclude(
            final ContractElement contractElement,
            final Multimap<String, ContractElement> removed,
            final Set<String> superCallSites) {

        boolean r = false;

        if (Utils.cannotSort(contractElement.getProgramVersion())) {
            removed.put(REMOVED_SORT, contractElement);
            r = true;
        } else if (contractElement.isMethodAbstract()) {
            removed.put(REMOVED_ABSTRACT, contractElement);
            r = true;
        } else if (superCallSites.contains(contractElement.getCuName() + "/" + contractElement.getMethodDeclaration())) {
            removed.put(REMOVED_SUPER, contractElement);
            r = true;
        } else if (contractElement.getKind().getGroup().getCategory() == ConstraintCategory.ANNOTATION) {
            removed.put(REMOVED_ANNOTATIONS, contractElement);
            r = true; // Do not remove, only report  // TODO ask jens if should be removed.  It changes numbers widely
        }

        return r;
    }

    /**
     * This method goes through the input data files and fill-ins the input map
     * with information about what inherits what and which methods are available by a class.
     *
     * @param inheritanceMap key - sub class, value - parent class
     * @param methods        key a class, value methods including inherited ones.
     * @throws IOException error to load files
     */
    public static void readInheritanceCSV(
            final HashMultimap<ClassAndVersion, ClassAndVersion> inheritanceMap,
            final Map<ClassAndVersion, Set<String>> methods) throws IOException {


        for (File project : listProjects(new File(Preferences.getOutputStructureFolder()))) {
            for (File json : listJsons(project)) {

                String projectName = project.getName();
                // json is named  <xxx>-struct,json
                String versionName = json.getName().substring(projectName.length() + 1, json.getName().lastIndexOf("-"));

                JSONArray arr = new JSONArray(IOUtils.toString(new FileInputStream(json), Charset.forName("UTF-8")));
                for (Object anArr : arr) {
                    JSONObject o = (JSONObject) anArr;
                    ClassAndVersion subTypeTmp = ClassAndVersion.create(projectName, versionName, EMPTY_CLASS_NAME, o.getString("cuName"));

                    // collect methods
                    JSONArray mm = o.getJSONArray("methods");
                    Iterator<Object> itM = mm.iterator();
                    Set<String> meth = new HashSet<>();
                    while (itM.hasNext()) {
                        meth.add(itM.next().toString());
                    }
                    methods.put(subTypeTmp, meth);

                    // collect parents
                    JSONArray pp = o.getJSONArray("parents");
                    for (Object aPp : pp) {
                        JSONObject ppO = (JSONObject) aPp;
                        ClassAndVersion superType = ClassAndVersion.fromJson(ppO.toString());
                        ClassAndVersion superTypeTmp = new ClassAndVersion(superType.getProgramVersion(), EMPTY_CLASS_NAME, superType.getCuName());
                        inheritanceMap.put(subTypeTmp, superTypeTmp);
                    }

                }
            }
        }

        propagateInheritedMethods(inheritanceMap, methods);
    }

    /**
     * Extend the input map so that each key is enriched with methods inherited from super classes.
     *
     * @param inheritanceMap key - sub class, value - parent class
     * @param methods        key a class, value methods including inherited ones.
     */
    private static void propagateInheritedMethods(
            final HashMultimap<ClassAndVersion, ClassAndVersion> inheritanceMap,
            final Map<ClassAndVersion, Set<String>> methods) {

        for (ClassAndVersion key : methods.keySet()) {
            Set<String> currentMethods = methods.get(key);
            Set<ClassAndVersion> finished = new HashSet<>();
            propagateInheritedMethods(inheritanceMap, methods, key, currentMethods, finished);
        }
    }

    /**
     * Extend the input map so that each key is enriched with methods inherited from super classes.
     *
     * @param inheritanceMap key - sub class, value - parent class
     * @param methods        key a class, value methods including inherited ones.
     */
    private static void propagateInheritedMethods(
            final HashMultimap<ClassAndVersion, ClassAndVersion> inheritanceMap,
            final Map<ClassAndVersion, Set<String>> methods,
            final ClassAndVersion currentType,
            final Set<String> currentMethods,
            final Set<ClassAndVersion> finished) {

        // give all parents
        for (ClassAndVersion parent : inheritanceMap.get(currentType)) {

            // TODO - in some cases parent and current type are the same - do not know why right now
            // spotted e.g. for
            if (finished.contains(currentType)) {
                LOGGER.debug("The same type already processed, skipping" + currentType);
                continue;
            }
            finished.add(currentType);

            Set<String> parentMethods = methods.get(parent);
            // recurse up to parents.
            propagateInheritedMethods(inheritanceMap, methods, parent, parentMethods, finished);
            // extend the map with parents
            currentMethods.addAll(parentMethods);
        }
    }

    /**
     * Read all super callsites.
     *
     * @return callsites.
     * @throws IOException error
     */
    private Set<CollectInvocationViaSuper.SuperCallSite> collectMethodsWithSuper() throws IOException {

        Set<CollectInvocationViaSuper.SuperCallSite> callSites = new HashSet<>();

        File file = new File(Preferences.getOutputFolder(), "supercallsites.csv");
        LineIterator it = IOUtils.lineIterator(new FileInputStream(file), "utf-8");
        it.next(); // skip header
        while (it.hasNext()) {
            String line = it.next();
            callSites.add(CollectInvocationViaSuper.SuperCallSite.fromCSV(line));
        }

        return callSites;
    }

    private double percent(int total, int value) {
        return (double) value / total * 100;
    }


}
