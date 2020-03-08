package contractstudy.scripts;

import com.google.common.base.Preconditions;
import contractstudy.*;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import semverstudy.commons.Logging;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static contractstudy.scripts.CollectDataSetStats.*;

/**
 * Script used to analyse how contractual constraints are used by
 * different versions of the same program.
 * @author jens dietrich
 */
public class AnalyseContractUsageAcrossVersions implements Experiment{

    static Logger LOGGER = Logging.getLogger(AnalyseContractUsageAcrossVersions.class);

    public boolean include(ProgramVersion firstProgramVersion, ProgramVersion lastProgramVersion,Map<ProgramVersion,Map<String,Integer>> metrics,int constraintsInFirstVersions,int constraintsInLastVersions) {
        return true;
    }

    public File getOutputFile() {
        return ArtefactFactory.RESULTS_CONTRACTS_ACROSS_VERSIONS;
    }


    public static void main (String[] args) throws Exception {
        new AnalyseContractUsageAcrossVersions().run();
    }

    public void run () throws Exception {

        File INPUT_DATA_FOLDER = new File(Preferences.getOutputContractsFolder());
        File RESULTS_FOLDER = new File(Preferences.getResultsFolder());
        File METRICS_FILE = new File(RESULTS_FOLDER,"programversion_stats.csv");

        Preconditions.checkState(INPUT_DATA_FOLDER.exists(),"Data folder does not exist: " + INPUT_DATA_FOLDER);

        List<ContractElement> contractElements = new ArrayList<>();
        Collection<File> jsons = FileUtils.listFiles(INPUT_DATA_FOLDER,new String[]{"json"}, true);
        for (File json:jsons) {
            String data = FileUtils.readFileToString(json, StandardCharsets.UTF_8);
            JSONArray all = new JSONArray(data);
            all.forEach(e -> {
                ContractElement c = ContractElement.fromJSON((JSONObject)e);
                contractElements.add(c);
            });
        }
        Map<ProgramVersion,Integer> constraintsInFirstVersions = new HashMap<>();
        Map<ProgramVersion,Integer> constraintsInLastVersions = new HashMap<>();


        // extract latest versions for cross-referencing
        Pair<Map<String,ProgramVersion>,Map<String,ProgramVersion>> firstAndLatestVersions = FindFirstAndLastProgramVersions.find();
        Map<String,ProgramVersion> firstVersions = firstAndLatestVersions.getLeft();
        Map<String,ProgramVersion> lastVersions = firstAndLatestVersions.getRight();

        for (ContractElement c: contractElements) {
            if (firstVersions.values().contains(c.getProgramVersion())) {
                constraintsInFirstVersions.compute(c.getProgramVersion(),(p,v) -> v==null?1:v+1);
            }
            else if (lastVersions.values().contains(c.getProgramVersion())) {
                constraintsInLastVersions.compute(c.getProgramVersion(),(p,v) -> v==null?1:v+1);
            }
        }

        // import metrics for cross-referencing
        Map<ProgramVersion,Map<String,Integer>> metrics = readMetrics (METRICS_FILE);
//
//        // compute method counts for scaling
//        Map<ProgramVersion,Pair<Integer,Integer>> methodCounts = new HashMap<>();
//        for (ProgramVersion pv:constraintsInFirstVersions.keySet()) {
//            Pair<Integer,Integer> count = countMethods(pv);
//            methodCounts.put(pv,count);
//        }
//        for (ProgramVersion pv:constraintsInLastVersions.keySet()) {
//            Pair<Integer,Integer> count = countMethods(pv);
//            methodCounts.put(pv,count);
//        }


        // export to CSV to be readable in excel
        LOGGER.info("Finished contract usage across versions analysis");

        char SEP = '\t';
        File csv = getOutputFile();

        try (PrintStream out = new PrintStream(new FileOutputStream(csv))) {
            out.println("program"+SEP+"version1"+SEP+"methods1"+SEP+"constraints1"+SEP+"version2"+SEP+"methods2"+SEP+"constraints2");
            for (String program:firstAndLatestVersions.getLeft().keySet()) {
                ProgramVersion firstVersion = firstAndLatestVersions.getLeft().get(program);
                int methodCountInFirstVersion = metrics.get(firstVersion).get(ALL_METHODS);
                methodCountInFirstVersion = methodCountInFirstVersion + metrics.get(firstVersion).get(ALL_CONSTRUCTORS);
                Integer tmp = constraintsInFirstVersions.get(firstVersion);
                int constraintCountInFirstVersion = tmp==null?0:tmp;

                ProgramVersion lastVersion = firstAndLatestVersions.getRight().get(program);
                int methodCountInLastVersion = metrics.get(lastVersion).get(ALL_METHODS);
                methodCountInLastVersion = methodCountInLastVersion + metrics.get(lastVersion).get(ALL_CONSTRUCTORS);
                tmp = constraintsInLastVersions.get(lastVersion);
                int constraintCountInLastVersion = tmp==null?0:tmp;

                if (include(firstVersion,lastVersion,metrics,constraintCountInFirstVersion,constraintCountInLastVersion)) {

                    out.print(program);
                    out.print(SEP);
                    out.print(firstVersion.getVersion());
                    out.print(SEP);
                    out.print(methodCountInFirstVersion);
                    out.print(SEP);
                    out.print(constraintCountInFirstVersion);
                    out.print(SEP);

                    out.print(lastVersion.getVersion());
                    out.print(SEP);
                    out.print(methodCountInLastVersion);
                    out.print(SEP);
                    out.print(constraintCountInLastVersion);
                    out.println();
                }

            }
            out.println();
        }


        LOGGER.info("CSV file with results suitable for further analysis with excel & co created at " + csv.getAbsolutePath());

    }


    private static Map<ProgramVersion,Map<String,Integer>> readMetrics (File metrics) throws Exception {
        LOGGER.info("Reading metrics from " + metrics);
        Map<ProgramVersion,Map<String,Integer>> data = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(metrics))) {
            reader.readLine(); // skip first line with headers
            String line = null;
            while ((line = reader.readLine())!=null) {
                String[] tokens = line.split("\t");
                assert tokens.length == 9;
                Map<String,Integer> map = new HashMap<>();
                ProgramVersion pv = ProgramVersion.getOrCreate(tokens[0],tokens[1]);
                // loc,cus,classes,all methods, all constructors, pub. + prot. methods, pub. + prot. constr"
                map.put(LOC,Integer.parseInt(tokens[2]));
                map.put(COMPILATION_UNITS,Integer.parseInt(tokens[3]));
                map.put(CLASSES,Integer.parseInt(tokens[4]));
                map.put(ALL_METHODS,Integer.parseInt(tokens[5]));
                map.put(ALL_CONSTRUCTORS,Integer.parseInt(tokens[6]));
                map.put(PUBLIC_METHODS,Integer.parseInt(tokens[7]));
                map.put(PUBLIC_CONSTRUCTORS,Integer.parseInt(tokens[8]));
                data.put(pv,map);
            }
        }
        return data;
    }


    @Override
    public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
        AnalyseContractUsageAcrossVersions.main(new String[] {});
    }


    @Override
    public ExperimentArtefact[] requires() {
        return new ExperimentArtefact[] {
                ArtefactFactory.contracts(),
                ArtefactFactory.programVersionStatistics()
        };
    }

    @Override
    public ExperimentArtefact provides() {
        return ArtefactFactory.contractsUsageAcrossVersions();
    }
}
