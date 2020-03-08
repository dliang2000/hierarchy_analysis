package contractstudy.scripts.engine;

/**
 * Interface representing one experiment run and its results.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface Experiment {

    /**
     * Run one experiment
     */
    void invoke() throws Exception;

    /**
     * list of artefacts used by the experiment
     * @return array, may be empty if no input data are requiret.
     */
    ExperimentArtefact[] requires();

    /**
     * Artefact provided by an experiment.
     * @return one artefact
     */
    ExperimentArtefact provides();
}
