package contractstudy.scripts.engine;

/**
 * Artefact of an experiment. Each experiment produces exactly one artefact.
 *
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public interface ExperimentArtefact {

    /**
     * Return true if an artefact already exists
     * @return true if axists
     */
    boolean exists();

    /**
     * String name of the result to track down errors
     * @return
     */
    String getName();

}
