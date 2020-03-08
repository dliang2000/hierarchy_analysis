package contractstudy;

import java.io.InputStream;

/**
 * Interface for services to extract constraints from source code.
 * TODO: could extend interface for hybrid source / bytecode analysis.
 * @author jens dietrich
 */
public interface Extractor<T extends ContractElement> {
	/**
	 * Analyse source code read from source, and callback the consumer if constraints are found.
	 * @param in stream to read source code
	 * @param programName name of the program analysed
	 * @version version version of the program analysed
	 * @param cuName name of the compilation unit
	 * @param consumer result consumer
	 * @throws Exception
	 */
	void analyse (InputStream in,String programName,String version,String cuName,ExtractionListener<T> consumer) throws Exception ;
}
