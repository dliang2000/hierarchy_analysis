package contractstudy.extractors;

/**
 * Extractor for JSR305 annotations
 * @author jens dietrich
 */
public class JSR305ConcurrentExtractor extends AbstractAnnotationExtractor{

    public JSR305ConcurrentExtractor() {
        super("JSR305CONCURRENT","javax.annotation.concurrent");
    }
}
