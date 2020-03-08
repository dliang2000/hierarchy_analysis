package test.contractstudy;

import com.google.common.io.Files;
import contractstudy.scripts.ScreenForConstraintsByCommentPattern;
import org.junit.Test;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


/**
 * Tests for the guava extractor.
 * @author Jens Dietrich
 */

public class TestCommentAnnotations {

	public static final File TEST_DATA_FOLDER = new File("src/test/java/test/contractstudy/testdata/commentannotations/");

	private boolean containsSomePattern(String className) throws Exception {
		String src = Files.toString(new File(TEST_DATA_FOLDER,className+".java"), StandardCharsets.UTF_8);
        boolean success = false;
        for (Pattern pattern: ScreenForConstraintsByCommentPattern.PATTERNS) {
            success = success || pattern.matcher(src).find();
        }
        return success;
    }

    @Test
    public void testSingleLineJMLComment1() throws Exception {
        assertTrue(containsSomePattern("SingleLineJMLComment1"));
    }

    @Test
    public void testSingleLineJMLComment2() throws Exception {
        assertTrue(containsSomePattern("SingleLineJMLComment2"));
    }

    @Test
    public void testMultiLineJMLComment() throws Exception {
        assertTrue(containsSomePattern("MultiLineJMLComment"));
    }

    @Test
    public void testIContractPre() throws Exception {
        assertTrue(containsSomePattern("IContractPre"));
    }

    @Test
    public void testIContractPost() throws Exception {
        assertTrue(containsSomePattern("IContractPost"));
    }

    @Test
    public void testIContractInv() throws Exception {
        assertTrue(containsSomePattern("IContractInv"));
    }

    @Test
    public void testJassEnsure() throws Exception {
        assertTrue(containsSomePattern("JassEnsure"));
    }

    @Test
    public void testJassRequire() throws Exception {
        assertTrue(containsSomePattern("JassRequire"));
    }

    @Test
    public void testJassInvariant() throws Exception {
        assertTrue(containsSomePattern("JassInvariant"));
    }

    @Test
    public void testNoSpecialMarkup() throws Exception {
        assertFalse(containsSomePattern("NoSpecialMarkup"));
    }
	
}
