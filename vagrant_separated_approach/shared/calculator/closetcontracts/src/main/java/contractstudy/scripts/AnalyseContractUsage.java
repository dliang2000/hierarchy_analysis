package contractstudy.scripts;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import contractstudy.*;
import contractstudy.ContractElement;
import contractstudy.diffrules.Utils;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import semverstudy.commons.Logging;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static contractstudy.diffrules.Utils.NF;

/**
 * Script used to analyse how contracts are used by programs.
 * This script counts the contracts elements.
 * @author jens dietrich
 */
public class AnalyseContractUsage implements Experiment {

    static Logger LOGGER = Logging.getLogger(AnalyseContractUsage.class);

    public static void main (String[] args) throws Exception {

        File INPUT_DATA_FOLDER = new File(Preferences.getOutputContractsFolder());
        File RESULTS_FOLDER = new File(Preferences.getResultsFolder());

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

        // use linked hashmaps to fix order of keys
        Map<ConstraintGroup,Integer> constraintsByGroup = new LinkedHashMap<>();
        Map<ConstraintClassification,Integer> constraintsByClassification = new LinkedHashMap<>();
        Map<String,Integer> constraintsByProgram = new HashMap<>();

        // LV .. latest version only
        Map<ConstraintGroup,Integer> constraintsByGroupLV = new LinkedHashMap<>();
        Map<ConstraintClassification,Integer> constraintsByClassificationLV = new LinkedHashMap<>();
        Map<String,Integer> constraintsByProgramLV = new HashMap<>();
        Map<ConstraintCategory,Map<String,Integer>> constraintsByProgramLVandCategory = new HashMap<>();

        Multimap<ConstraintGroup,String> programsUsingConstraintGroups = HashMultimap.create();
        Multimap<ConstraintClassification,String> programsUsingConstraintClassifications = HashMultimap.create();

        // set keys to fix order
        constraintsByGroup.put(ConstraintGroup.ASSERTION,0);

        constraintsByGroup.put(ConstraintGroup.CONDITIONAL_RUNTIME_EXCEPTION,0);
        constraintsByGroup.put(ConstraintGroup.UNCONDITIONAL_RUNTIME_EXCEPTION,0);

        constraintsByGroup.put(ConstraintGroup.CAPI_GUAVA,0);
        constraintsByGroup.put(ConstraintGroup.CAPI_SPRING_ASSERT,0);
        constraintsByGroup.put(ConstraintGroup.CAPI_COMMONS_VALIDATE,0);

        constraintsByGroup.put(ConstraintGroup.ANNO_JSR303,0);
        constraintsByGroup.put(ConstraintGroup.ANNO_JSR305,0);

        constraintsByProgramLVandCategory.put(ConstraintCategory.API,new HashMap<>());
        constraintsByProgramLVandCategory.put(ConstraintCategory.ANNOTATION,new HashMap<>());
        constraintsByProgramLVandCategory.put(ConstraintCategory.ASSERTION,new HashMap<>());
        constraintsByProgramLVandCategory.put(ConstraintCategory.RUNTIME_EXCEPTION,new HashMap<>());

        constraintsByGroupLV.putAll(constraintsByGroup);

        constraintsByClassification.put(ConstraintClassification.PRECONDITION,0);
        constraintsByClassification.put(ConstraintClassification.POSTCONDITION,0);
        constraintsByClassification.put(ConstraintClassification.INVARIANT,0);
        constraintsByClassification.put(ConstraintClassification.ANY,0);

        constraintsByClassificationLV.putAll(constraintsByClassification);

        // extract latest versions for cross-referencing
        Pair<Map<String,ProgramVersion>,Map<String,ProgramVersion>> firstAndLatestVersions = FindFirstAndLastProgramVersions.find();
        Collection<ProgramVersion> latestVersions = firstAndLatestVersions.getRight().values();

        for (ContractElement c: contractElements) {
            ConstraintType type = c.getKind();
            ConstraintGroup group = type.getGroup();
            ConstraintClassification classification= c.getClassification();
            String program = c.getProgramVersion().getName();

            constraintsByGroup.compute(group,(g,i) -> i==null?1:i+1);
            constraintsByClassification.compute(classification,(g,i) -> i==null?1:i+1);
            constraintsByProgram.compute(program,(g,i) -> i==null?1:i+1);

            if (latestVersions.contains(c.getProgramVersion())) {
                constraintsByGroupLV.compute(group,(g,i) -> i==null?1:i+1);
                constraintsByClassificationLV.compute(classification,(g,i) -> i==null?1:i+1);
                constraintsByProgramLV.compute(program,(g,i) -> i==null?1:i+1);
                Map<String,Integer> data = constraintsByProgramLVandCategory.get(c.getKind().getGroup().getCategory());
                data.compute(program,(g,i) -> i==null?1:i+1);
            }

            programsUsingConstraintGroups.put(group,program);
            programsUsingConstraintClassifications.put(classification,program);
        }

        Collection<String> topProgramsUsingContracts = constraintsByProgram.keySet()
                .stream()
                .sorted((s1,s2)->constraintsByProgram.get(s2)-constraintsByProgram.get(s1))
                .limit(10)
                .collect(Collectors.toList());

        Collection<String> topProgramsUsingContractsInLV = constraintsByProgramLV.keySet()
                .stream()
                .sorted((s1,s2)->constraintsByProgramLV.get(s2)-constraintsByProgramLV.get(s1))
                .limit(10)
                .collect(Collectors.toList());

        // compute ginis
        double gini4AllConstraints = computeGini(constraintsByProgramLV);
        double gini4Assertions = computeGini(constraintsByProgramLVandCategory.get(ConstraintCategory.ASSERTION));
        double gini4APIs = computeGini(constraintsByProgramLVandCategory.get(ConstraintCategory.API));
        double gini4RTExc = computeGini(constraintsByProgramLVandCategory.get(ConstraintCategory.RUNTIME_EXCEPTION));
        double gini4Annotations = computeGini(constraintsByProgramLVandCategory.get(ConstraintCategory.ANNOTATION));

        // console output
        LOGGER.info("Finished contract usage analysis");

        LOGGER.info("\tGINI for distribution of contracts amongst latest version is " + gini4AllConstraints);
        LOGGER.info("\tGINI assertions only " + gini4Assertions);
        LOGGER.info("\tGINI annotations only " + gini4Annotations);
        LOGGER.info("\tGINI apis only " + gini4APIs);
        LOGGER.info("\tGINI rt exceptions only " + gini4RTExc);

        LOGGER.info("Contract groups used (name,count):");
        for (Map.Entry<ConstraintGroup,Integer> entry:constraintsByGroup.entrySet()) {
            LOGGER.info("\t" + entry.getKey() + " : " + entry.getValue());
        }
        LOGGER.info("Contract groups used [in latest versions only!] (name,count):");
        for (Map.Entry<ConstraintGroup,Integer> entry:constraintsByGroupLV.entrySet()) {
            LOGGER.info("\t" + entry.getKey() + " : " + entry.getValue());
        }
        LOGGER.info("Contract classifications used (name,count):");
        for (Map.Entry<ConstraintClassification,Integer> entry:constraintsByClassification.entrySet()) {
            LOGGER.info("\t" + entry.getKey() + " : " + entry.getValue());
        }
        LOGGER.info("Contract classifications used [in latest versions only!] (name,count):");
        for (Map.Entry<ConstraintClassification,Integer> entry:constraintsByClassificationLV.entrySet()) {
            LOGGER.info("\t" + entry.getKey() + " : " + entry.getValue());
        }
        LOGGER.info("Top usage by program (name,count):");
        for (String program:topProgramsUsingContracts) {
            LOGGER.info("\t" + program + " : " + constraintsByProgram.get(program));
        }

        LOGGER.info("Top usage by program [in latest versions only!] (name,count):");
        for (String program:topProgramsUsingContractsInLV) {
            LOGGER.info("\t" + program + " : " + constraintsByProgramLV.get(program));
        }


        LOGGER.info("Rendering output to latex");
        File latex = new File(RESULTS_FOLDER,"contractsbytype.tex");
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.println("% TABLE GENERATED BY " + AnalyseContractUsage.class.getName());
            out.println("% TIMESTAMP:   " + new Date());
            out.println("\\begin{table}[]");
            out.println("\\centering");
            out.println("\\caption{Contract elements by type}");
            out.println("\\label{tab:contractsbytype}");
            out.println("\\begin{tabular}{|p{5cm}|p{3cm}|r|r|r|} \\hline");
            out.println("   type & category & \\parbox{1.2cm}{contracts\\ (all ver.)}  & \\parbox{1.2cm}{contracts\\ (latest)} & pro\\-grams \\\\ \\hline");
            for (Map.Entry<ConstraintGroup,Integer> entry:constraintsByGroup.entrySet()) {
                out.print("\t");
                out.print(entry.getKey().getShortName() + " &  ");
                out.print(entry.getKey().getCategory().getName() + " &  ");
                out.print(NF.format(entry.getValue()) + " &  ");
                out.print(NF.format(constraintsByGroupLV.get(entry.getKey())) + " &  ");
                out.println(NF.format(programsUsingConstraintGroups.get(entry.getKey()).size()) + " \\\\ ");
            }
            out.println("\\hline");
            out.println("\\end{tabular}");
            out.println("\\end{table}");
        }

        latex = new File(RESULTS_FOLDER,"contractsbyclassification.tex");
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.println("% TABLE GENERATED BY " + AnalyseContractUsage.class.getName());
            out.println("% TIMESTAMP:   " + new Date());
            out.println("\\begin{table}[]");
            out.println("\\centering");
            out.println("\\caption{Contracts by classification}");
            out.println("\\label{tab:contractsbyclassification}");
            out.println("\\begin{tabular}{|p{2.1cm}|r|r|r|} \\hline");
            out.println("   classification & \\parbox{1.2cm}{contracts\\ (all ver.)} & \\parbox{1.2cm}{contracts\\ (latest)} & programs \\\\ \\hline");
            for (Map.Entry<ConstraintClassification,Integer> entry:constraintsByClassification.entrySet()) {
                out.print("\t");
                out.print(entry.getKey().getName() + " &  ");
                out.println(NF.format(entry.getValue()) + " & ");
                out.println(NF.format(constraintsByClassificationLV.get(entry.getKey())) + " & ");
                out.println(NF.format(programsUsingConstraintClassifications.get(entry.getKey()).size()) + " \\\\ ");
            }
            out.println("\\hline");
            out.println("\\end{tabular}");
            out.println("\\end{table}");
        }

        latex = new File(RESULTS_FOLDER,"gini.tex");
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.print(Math.round(gini4AllConstraints*100.0)/100.0);
        }

        exportGini(gini4AllConstraints,RESULTS_FOLDER,"gini.tex");
        exportGini(gini4Annotations,RESULTS_FOLDER,"gini-annotations.tex");
        exportGini(gini4Assertions,RESULTS_FOLDER,"gini-assertions.tex");
        exportGini(gini4APIs,RESULTS_FOLDER,"gini-apis.tex");
        exportGini(gini4RTExc,RESULTS_FOLDER,"gini-runtimeexceptions.tex");

        // finally, output some details on categories found in programs, can be used to get some data
        // to justify ginis

        latex = new File(RESULTS_FOLDER,"topusers-lvonly.tex");
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.println("% TABLE GENERATED BY " + CollectDataSetStats.class.getName());
            out.println("% TIMESTAMP:   " + new Date());
            out.println("\\begin{table}[]");
            out.println("\\centering");
            out.println("\\caption{Top programs using contracts (latest versions only)}");
            out.println("\\label{tab:topusers}");
            out.println("\\begin{tabular}{|p{2.0cm}|p{6.0cm}|} \\hline");
            out.println("   category & programs \\\\ \\hline");
            for (ConstraintCategory category : ConstraintCategory.values()) {
                Map<String, Integer> counts = constraintsByProgramLVandCategory.get(category);
                List<Integer> counts2 = new ArrayList<>();
                List<Map.Entry<String, Integer>> entries = counts.entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 0)
                        .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                        .collect(Collectors.toList());
                String s1 = "values:";
                for (Map.Entry<String, Integer> e : entries) {
                    s1 = s1 + " " + e.getValue();
                }
                String s2 = "progr.:";
                for (Map.Entry<String, Integer> e : entries) {
                    s2 = s2 + " " + e.getKey();
                }
                LOGGER.info("Distribution of constraints of category " + category + ":");
                LOGGER.info("\t" + s1);
                LOGGER.info("\t" + s2);

                // append latex output
                List<Map.Entry<String, Integer>> topEntries = entries
                        .stream()
                        .limit(5)
                        .collect(Collectors.toList());
                out.print(category.getName() + " & ");
                String s = "";
                for (Map.Entry<String, Integer> e : topEntries) {
                    // out.print(category.getName());
                    if (s.length() > 0) s = s + ", ";
                    s = s + e.getKey() + " (" + Utils.NF.format(e.getValue()) + ")";
                }
                out.println(s + " \\\\ ");
            }
            out.println("\\hline");
            out.println("\\end{tabular}");
            out.println("\\end{table}");
        }
        LOGGER.info("Top user data written to " + latex.getAbsolutePath());

    }

    private static void exportGini (double value,File folder,String fileName) throws Exception {
        File latex = new File(folder,fileName);
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.print(Math.round(value*100.0)/100.0);
        }
        LOGGER.info("Gini value written to " + latex.getAbsolutePath());
    }

    private static double computeGini (Map<String,Integer> constraintsByProgramLVs) {
        Integer[] vals = constraintsByProgramLVs
                .values()
                .stream()
                .sorted()
                .toArray(Integer[]::new);

        return jct.util.Gini.compute(vals,true);
    }

    @Override
    public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
        AnalyseContractUsage.main(new String[] {});
    }

    @Override
    public ExperimentArtefact[] requires() {
        return new ExperimentArtefact[] {
                ArtefactFactory.contracts()
        };
    }

    @Override
    public ExperimentArtefact provides() {
        return ArtefactFactory.contractsUsage();
    }
}
