package contractstudy;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import contractstudy.diffrules.Utils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import semverstudy.commons.Logging;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static contractstudy.maven.CorpusUtils.listJsons;

/**
 * A diff extractor for evolution data.
 * @author jens dietrich
 */
public class EvolutionDiffExtractor implements DiffExtractor {

    static Logger LOGGER = Logging.getLogger(EvolutionDiffExtractor.class);
    private static File INPUT_STRUCTS_FOLDER = new File(Preferences.getOutputStructureFolder());
    private static File INPUT_CONTRACTS_FOLDER = new File(Preferences.getOutputContractsFolder());
    private static File RESULT_FOLDER = new File(Preferences.getResultsFolder());

    @Override
    public List<DiffRecord> extract() throws Exception {



        Set<ContractElement> removed = new HashSet<>();
        List<DiffRecord> results = new ArrayList<>();
        List<ContractElement> contractElements = new ArrayList<>();
        Collection<File> jsons = FileUtils.listFiles(INPUT_CONTRACTS_FOLDER,new String[]{"json"}, true);
        for (File json:jsons) {
            String data = FileUtils.readFileToString(json, StandardCharsets.UTF_8);
            JSONArray all = new JSONArray(data);
            all.forEach(e -> {
                ContractElement c = ContractElement.fromJSON((JSONObject)e);
                if (Utils.cannotSort(c.getProgramVersion())) {
                    removed.add(c);
                } else {
                    contractElements.add(c);
                }
            });
        }

        // sort !!
        Collections.sort(contractElements, new Comparator<ContractElement>(){
            @Override
            public int compare(ContractElement pc1, ContractElement pc2) {
                return pc1.getProgramVersion().compareTo(pc2.getProgramVersion());
            }});

        LOGGER.info(contractElements.size() + " constraints imported");

        // link versions
        // do not sort, reply on export to order records
        ProgramVersion pv = null;
        for (ContractElement pc: contractElements) {
            ProgramVersion pv2 = pc.getProgramVersion();
            if (pv==null) {
                pv=pv2;
            }
            if (!pv.getName().equals(pv2.getName())) {
                // new program
                pv=pv2;
            }
            else {
                if (!pv.getVersion().equals(pv2.getVersion())) {
                    // cross reference
                    pv.setNextVersion(pv2);
                    pv2.setPreviousVersion(pv); // double link !
                    LOGGER.info("Upgrade " + " detected: " + pv + " -> " + pv2);
                    pv=pv2;
                }
            }
        }

        // index constraints by method or class
        ListMultimap<String, ContractElement> constraintIndex = ArrayListMultimap.create();
        for (ContractElement pc: contractElements) {
            constraintIndex.put(getIndexKey(pc.getProgramVersion(),pc.getCuName(),pc.getMethodDeclaration()), pc);
        }

        Map<ProgramVersion,Multimap<String,String>> methodsByPVandCU = getMethodsByPVandCU();

        // build diff records
        Set<String> done = new HashSet<>();
        for (ContractElement pc: contractElements) {
            String key = getIndexKey(pc.getProgramVersion(),pc.getCuName(),pc.getMethodDeclaration());
            if (done.add(key)) {
                // control this in order to investigate each artefact only once
                pv = pc.getProgramVersion();
                ProgramVersion succPV = pv.getNextVersion();
                if (succPV!=null) {
                    String succKey = getIndexKey(succPV,pc.getCuName(),pc.getMethodDeclaration());
                    List<ContractElement> constraints1 = constraintIndex.get(key);
                    List<ContractElement> constraints2 = constraintIndex.get(succKey);
                    DiffRecord record = new DiffRecord(
                            constraints1,
                            pc.getProgramVersion(),
                            pc.getCuName(),
                            pc.getMethodDeclaration(),
                            constraints2,
                            succPV,
                            pc.getCuName(),
                            pc.getMethodDeclaration());
                    results.add(record);
                }

                // also look for match with the previous version
                // we only have to do this if the respective constraints are empty, otherwise we
                // would double-count, see issue #16 for a discussion
                ProgramVersion prevPV = pv.getPreviousVersion();
                if (prevPV!=null) {
                    Multimap<String,String> methodsByCU = methodsByPVandCU.get(prevPV);

                    // methodsByCU will be null in case the respective sources cannot be parsed
                    // this is an issue if for instance enum is used as an identifier in the program
                    boolean methodExists = methodsByCU!=null && methodsByCU.get(pc.getCuName()).contains(pc.getMethodDeclaration());
                    if (methodExists){
                        String prevKey = getIndexKey(prevPV, pc.getCuName(), pc.getMethodDeclaration());
                        List<ContractElement> constraints2 = constraintIndex.get(prevKey);
                        if (constraints2 == null || constraints2.isEmpty()) {
                            List<ContractElement> constraints1 = constraintIndex.get(key);
                            DiffRecord record = new DiffRecord(
                                    constraints2 == null ? Collections.EMPTY_LIST : constraints2,
                                    prevPV,
                                    pc.getCuName(),
                                    pc.getMethodDeclaration(),
                                    constraints1,
                                    pc.getProgramVersion(),
                                    pc.getCuName(),
                                    pc.getMethodDeclaration());
                            results.add(record);
                        }
                    }
                }
            }
        }

        LOGGER.info("Number of removed constraints (their program versions have unknown evolution position): " + removed.size());
        LOGGER.info("Number of used constraints: " + results.size());

        FileOutputStream errors = new FileOutputStream(new File(RESULT_FOLDER, "evolution.errors"));
        for (ContractElement record : removed) {
            errors.write((record.toString() + "\n").getBytes());
        }

        FileOutputStream ok = new FileOutputStream(new File(RESULT_FOLDER, "evolution.ok"));
        for (DiffRecord record : results) {
            ok.write((record.toString() + "\n").getBytes());
        }

        return results;
    }


    private static String getIndexKey(ProgramVersion pv,String cu,String methodDecl) {
        return pv.getName() + "-" + pv.getVersion() + '#' + cu + '/' + (methodDecl==null?"":methodDecl);
    }


    private Map<ProgramVersion,Multimap<String,String>> getMethodsByPVandCU() throws IOException {

        Map<ProgramVersion,Multimap<String,String>> methodsByPVandCU = new HashMap<>();

        for (File project : listProjects(INPUT_STRUCTS_FOLDER)) {
            for (File json : listJsons(project)) {

                String projectName = project.getName();
                String versionName = json.getName().substring(projectName.length() + 1, json.getName().lastIndexOf("-"));
                ProgramVersion pv = ProgramVersion.getOrCreate(projectName,versionName);

                Multimap<String,String> methodsByCU = methodsByPVandCU.compute(pv,(k,v)-> v==null? HashMultimap.create():v);

                JSONArray arr = new JSONArray(IOUtils.toString(new FileInputStream(json), Charset.forName("UTF-8")));
                for (Object anArr : arr) {
                    JSONObject o = (JSONObject) anArr;
                    String cuName = o.getString("cuName");
                    JSONArray mm = o.getJSONArray("methods");
                    for (Object next:mm) {
                        String method = next.toString();
                        methodsByCU.put(cuName,method);
                    }
                }
            }
        }
        return methodsByPVandCU;
    }

    public static File[] listProjects(File root) {
        return root.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
    }

}
