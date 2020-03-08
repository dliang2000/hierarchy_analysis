package contractstudy;

import org.apache.log4j.Logger;
import semverstudy.commons.Logging;

import java.util.ArrayList;
import java.util.List;

/**
 * Collect constraints.
 * @author jens dietrich
 */
public class ConstraintCollector implements ExtractionListener<ContractElement> {
	static Logger LOGGER = Logging.getLogger(ConstraintCollector.class);
	private List<ContractElement> contractElements = new ArrayList<>();

	@Override
	public void constraintFound(ContractElement contractElement) {
		this.contractElements.add(contractElement);
	}

	public List<ContractElement> getContractElements() {
		return contractElements;
	}

	@Override
	public void extractionExceptionEncountered(String message, Throwable x) {
		LOGGER.debug(message, x);
        // x.printStackTrace();
	}
}
