package contractstudy.scripts;

import semverstudy.commons.Logging;
import contractstudy.ProgramVersion;
import contractstudy.scripts.engine.ArtefactFactory;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.Map;

/**
 * Script used to analyse how contractual constraints are used by
 * different versions of the same program.
 * Only extract data if first version investigated uses a significant number of contracts.
 * @author jens dietrich
 */
public class AnalyseContractUsageAcrossVersionsTopContractUsers extends AnalyseContractUsageAcrossVersions{

    static Logger LOGGER = Logging.getLogger(AnalyseContractUsageAcrossVersionsTopContractUsers.class);

    public boolean include(ProgramVersion firstProgramVersion, ProgramVersion lastProgramVersion,Map<ProgramVersion,Map<String,Integer>> metrics,int constraintsInFirstVersions,int constraintsInLastVersions) {
        return constraintsInFirstVersions>=100;
    }

    public File getOutputFile() {
        return ArtefactFactory.RESULTS_CONTRACTS_ACROSS_VERSIONS_TOP_CONTRACT_USERS;
    }

    public static void main (String[] args) throws Exception {
        new AnalyseContractUsageAcrossVersionsTopContractUsers().run();
    }

}
