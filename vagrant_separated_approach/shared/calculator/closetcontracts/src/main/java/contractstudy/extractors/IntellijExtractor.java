package contractstudy.extractors;

/**
 * Extractor for Intellij annotations
 * @author jens dietrich
 */
public class IntellijExtractor extends AbstractAnnotationExtractor{

    public IntellijExtractor() {
        super("Intellij","org.intellij.lang.annotations");
    }
}
