package contractstudy.scripts;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import contractstudy.*;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import semverstudy.commons.Logging;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * Script used to analyse how contracts are used by programs.
 * This does not count the contract elements, but the programs using a certain class
 * of contracts.
 * @author jens dietrich
 */
public class AnalyseContractUsage2 implements Experiment {

    static Logger LOGGER = Logging.getLogger(AnalyseContractUsage2.class);

    public static void main (String[] args) throws Exception {

        // File INPUT_DATA_FOLDER = new File(Preferences.getOutputContractsFolder());
        File CONTRACT_FOLDER = new File(Preferences.getOutputContractsFolder());
        File DATA_FOLDER = new File(Preferences.getDataFolder());

        Preconditions.checkArgument(DATA_FOLDER.exists(),"Cannot find data in " + DATA_FOLDER.getAbsolutePath());

        List<ContractElement> contractElements = new ArrayList<>();
        Collection<File> jsons = FileUtils.listFiles(CONTRACT_FOLDER,new String[]{"json"}, true);
        for (File json:jsons) {
            String data = FileUtils.readFileToString(json, StandardCharsets.UTF_8);
            JSONArray all = new JSONArray(data);
            all.forEach(e -> {
                ContractElement c = ContractElement.fromJSON((JSONObject)e);
                contractElements.add(c);
            });
        }

        // read project names from raw data to diff
        // i.e., to find projects that do not use any contracts

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        Set<String> allPrograms = new HashSet<>();
        for (File f:zips) {
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            allPrograms.add(pv.getName());
        }

        // use linked hashmaps to fix order of keys
        Map<String,EnumSet<ConstraintGroup>> programsUsingGroups = new HashMap<>();

        for (ContractElement c: contractElements) {
            ConstraintType type = c.getKind();
            ConstraintGroup group = type.getGroup();
            String program = c.getProgramVersion().getName();
            EnumSet<ConstraintGroup> groups = programsUsingGroups.get(program);
            if (groups==null) {
                groups = EnumSet.of(group);
                programsUsingGroups.put(program,groups);
            }
            else {
                groups.add(group);
            }

        }

        // adhoc for DEBUG
        for (Map.Entry<String,EnumSet<ConstraintGroup>> e:programsUsingGroups.entrySet()) {
            if (e.getValue().contains(ConstraintGroup.ASSERTION)) {
                LOGGER.info("Contains assertions: " + e.getKey());
            }
        }

        Set<String> programsWithoutContracts = Sets.difference(allPrograms,programsUsingGroups.keySet());

        for (String p:programsWithoutContracts) {
            LOGGER.info("No contract found in: " + p);
        }

        int programWithContracts = programsUsingGroups.size();
        LOGGER.info("All programs: " + allPrograms.size());

        LOGGER.info("Programs without contracts " + programsWithoutContracts.size());

        LOGGER.info("Programs with contracts: " + programWithContracts);

        int contractCount1 = countBySize(programsUsingGroups,1);
        LOGGER.info("Programs with one type of contracts " + contractCount1);

        int contractCount2 = countBySize(programsUsingGroups,2);
        LOGGER.info("Programs with two types of contracts " + contractCount2);

        int contractCount3 = countBySize(programsUsingGroups,3);
        LOGGER.info("Programs with three types of contracts " + contractCount3);

        int contractCount4 = countBySize(programsUsingGroups,4);
        LOGGER.info("Programs with four types of contracts " + contractCount4);

        int contractCount5 = countBySize(programsUsingGroups,5);
        LOGGER.info("Programs with five types of contracts " + contractCount5);

        int contractCount6 = countBySize(programsUsingGroups,6);
        LOGGER.info("Programs with six types of contracts " + contractCount6);

        // sort and output
        Comparator<EnumSet<ConstraintGroup>> comparator = (s1,s2) -> s1.size()-s2.size();
        Map<EnumSet<ConstraintGroup>,Set<String>> combinations = new HashMap<>();

        for (Map.Entry<String,EnumSet<ConstraintGroup>> e:programsUsingGroups.entrySet()) {
            combinations.compute(e.getValue(),(k,v)->{
                if (v==null) {
                    v = new TreeSet<>();
                }
                v.add(e.getKey());
                return v;
            });
        }

        combinations.entrySet()
                .stream()
                .sorted((e1,e2)->e1.getKey().size()-e2.getKey().size())
                .forEach(e -> {
                    LOGGER.info("Number of programs found using contracts from " + e.getKey() + " is " + e.getValue().size());
                    LOGGER.info("\tincluding ");
                    // some examples
                    Iterator<String> programs = e.getValue().iterator();
                    if (programs.hasNext()) LOGGER.info("\t " + programs.next());
                    if (programs.hasNext()) LOGGER.info("\t " + programs.next());
                    if (programs.hasNext()) LOGGER.info("\t " + programs.next());
                });

    }

    private static int countBySize(Map<String,EnumSet<ConstraintGroup>> programsUsingGroups, int size) {
        int c = 0;
        for (String program:programsUsingGroups.keySet()) {
            if (size==programsUsingGroups.get(program).size()) {
                c=c+1;
            }
        }
        return c;
    }


    @Override
    public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
        AnalyseContractUsage2.main(new String[] {});
    }

    @Override
    public ExperimentArtefact[] requires() {
        return new ExperimentArtefact[] {
                ArtefactFactory.contracts()
        };
    }

    // at the moment, this pnly produces con
    @Override
    public ExperimentArtefact provides() {
        return null;
    }
}
