package contractstudy.scripts.engine;

import contractstudy.Preferences;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import static org.apache.commons.io.FileUtils.listFiles;

/**
 * Util class to produce artefacts.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class ArtefactFactory {

    public static final File INPUT_DIR = new File(Preferences.getDataFolder());
    public static final Collection<File> INPUT_ZIP_FILES = listFiles(INPUT_DIR, new String[] {"zip"}, true);
    public static final Collection<File> INPUT_DEPS_FILES = listFiles(INPUT_DIR, new String[] {"json"}, true);

    public static final File OUTPUT_DIR = new File(Preferences.getOutputFolder());
    public static final File OUTPUT_DIR_CONTRACTS = new File(Preferences.getOutputContractsFolder());
    public static final File OUTPUT_DIR_STRUCT = new File(Preferences.getOutputStructureFolder());
    public static final File SUPER_CALLSITE = new File(OUTPUT_DIR, "supercallsites.csv");

    public static final Collection<File> CONTRACT_FILES = new ArrayList<>();
    public static final Collection<File> STRUCT_FILES = new ArrayList<>();

    public static final File RESULTS_DIR = new File(Preferences.getResultsFolder());

    public static final File RESULTS_EVOLUTION = new File(RESULTS_DIR, "evolution.tex");
    public static final File RESULTS_HIERARCHY = new File(RESULTS_DIR, "hierarchy.tex");
    public static final File RESULTS_PROGRAM_VERSION_STATS = new File(RESULTS_DIR, "programversion_stats.csv");
    public static final File RESULTS_DATASET_STAT = new File(RESULTS_DIR, "dataset.tex");
    public static final File RESULTS_CONTRACTS_ACROSS_VERSIONS = new File(RESULTS_DIR, "contraints_across_versions.csv");
    public static final File RESULTS_CONTRACTS_ACROSS_VERSIONS_TOP_CONTRACT_USERS = new File(RESULTS_DIR, "contraints_across_versions_top_contract_users.csv");
    public static final File RESULTS_CONTRACTS_USAGE = new File(RESULTS_DIR, "gini.tex");

    static {
        if (OUTPUT_DIR_CONTRACTS.exists()) {
            CONTRACT_FILES .addAll(FileUtils.listFiles(OUTPUT_DIR_CONTRACTS, new String[] {"json"}, true));
        }

        if (OUTPUT_DIR_STRUCT.exists()) {
            STRUCT_FILES.addAll(FileUtils.listFiles(OUTPUT_DIR_STRUCT, new String[] {"json"}, true));
        }
    }

    /**
     *
     * @return contracts in Json format.
     */
    public static ExperimentArtefact contracts() {
        return new FileScanArtefact(OUTPUT_DIR_CONTRACTS, CONTRACT_FILES);
    }

    /**
     *
     * @return class structures (methods, super types) in Json format
     */
    public static ExperimentArtefact classStructure() {
        return new FileScanArtefact(OUTPUT_DIR_STRUCT, STRUCT_FILES);
    }


    /**
     *
     * @return CSV table with information of super calls.
     */
    public static ExperimentArtefact superCalls() {
        return new FileScanArtefact(SUPER_CALLSITE);
    }

    /**
     *
     * @return input ZIP files with source code
     */
    public static ExperimentArtefact inputSrcZipFiles() {
        return new FileScanArtefact(INPUT_DIR, INPUT_ZIP_FILES);
    }


    /**
     *
     * @return input Json files with artefact dependencies
     */
    public static ExperimentArtefact inputDepFiles() {
        return new FileScanArtefact(INPUT_DIR, INPUT_DEPS_FILES);
    }

    /**
     *
     * @return TeX table with constrain evolution
     */
    public static ExperimentArtefact contractsEvolutionTable() {
        return new FileScanArtefact(RESULTS_EVOLUTION);
    }

    /**
     *
     * @return Tex table with contracts diff in hierarchy
     */
    public static ExperimentArtefact contractsHierarchyTable() {
        return new FileScanArtefact(RESULTS_HIERARCHY);
    }

    /**
     *
     * @return TeX table with dataset statistics
     */
    public static ExperimentArtefact datasetStatistics() {
        return new FileScanArtefact(RESULTS_DATASET_STAT);
    }

    /**
     *
     * @return CSV table with program version statistics.
     */
    public static ExperimentArtefact programVersionStatistics() {
        return new FileScanArtefact(RESULTS_PROGRAM_VERSION_STATS);
    }

    /**
     *
     * @return CSV table with program contracts usage among versions
     */
    public static ExperimentArtefact contractsUsageAcrossVersions() {
        return new FileScanArtefact(RESULTS_CONTRACTS_ACROSS_VERSIONS);
    }

    /**
     *
     * @return CSV table with program contracts usage among versions
     */
    public static ExperimentArtefact contractsUsageAcrossVersionsTopContractUsers() {
        return new FileScanArtefact(RESULTS_CONTRACTS_ACROSS_VERSIONS_TOP_CONTRACT_USERS);
    }

    /**
     *
     * @return several tables about contracts usage
     */
    public static ExperimentArtefact contractsUsage() {
        return new FileScanArtefact(RESULTS_CONTRACTS_USAGE);
    }


    
}
