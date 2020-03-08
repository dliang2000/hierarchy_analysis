package contractstudy.scripts;

import semverstudy.commons.Logging;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.log4j.Logger;

/**
 * This is the main script that invokes all experiments.
 * <p>
 * So far, new experiments must be added in this script in right order, no automatic management is provided.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class RunAllExperiments {

    private static Logger LOGGER = Logging.getLogger(ComputeInheritanceHierarchy.class);

    private static final Experiment[] EXPERIMENTS = new Experiment[]{
            new CollectContracts(),
            new ComputeInheritanceHierarchy(),
            new AnalyseContractEvolution(),
            new AnalyseContractUsage(),
            new CollectDataSetStats(),
            new CollectInvocationViaSuper(),
            new CollectProgramVersionStats(),
            new AnalyseContractUsageAcrossVersions(),
            new AnalyseHierarchyContracts(),
    };

    /**
     * Invoke all experiment
     * @param args empty
     * @throws Exception error
     */
    public static void main(String[] args) throws Exception {

        for (Experiment experiment : EXPERIMENTS) {

            // check all prerequisites exist
            for (ExperimentArtefact artefact : experiment.requires()) {
                if (!artefact.exists()) {
                    throw new IllegalStateException("No artefact " + artefact.getName() + " found to proceed with " + experiment.provides().getName());
                }
            }

            // skip what has been already computed
            if (experiment.provides().exists()) {
                LOGGER.info("Skipping already performed experiment: " + experiment.provides().getName());
            } else {
                LOGGER.info("Invoking: " + experiment.provides().getName());
                experiment.invoke();
            }

        }
    }
}
