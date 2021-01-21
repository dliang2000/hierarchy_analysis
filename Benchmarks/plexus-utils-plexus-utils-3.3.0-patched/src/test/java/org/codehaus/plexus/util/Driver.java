package org.codehaus.plexus.util;

public class Driver {
	public static void main(String[] argv) {
		org.codehaus.plexus.util.CollectionUtilsTest class1 = new org.codehaus.plexus.util.CollectionUtilsTest();
		class1.testMergeMaps();
		class1.testMergeMapArray();
		class1.testMavenPropertiesLoading();
		class1.testIteratorToListWithAPopulatedList();
		class1.testIteratorToListWithAEmptyList();
		org.codehaus.plexus.util.SweeperPoolTest class2 = new org.codehaus.plexus.util.SweeperPoolTest();
		class2.testMaxSize();
		class2.testSweepAndTrim1();
		org.codehaus.plexus.util.MatchPatternsTest class3 = new org.codehaus.plexus.util.MatchPatternsTest();
		try {
			class3.testMatches();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		org.codehaus.plexus.util.DirectoryScannerTest class4 = new org.codehaus.plexus.util.DirectoryScannerTest();
		try {
			class4.testCrossPlatformIncludesString();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		catch (java.net.URISyntaxException err3) {
			err3.printStackTrace();
		}
		try {
			class4.testCrossPlatformExcludesString();
		}
		catch (java.io.IOException err4) {
			err4.printStackTrace();
		}
		catch (java.net.URISyntaxException err5) {
			err5.printStackTrace();
		}
		try {
			class4.testGeneral();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class4.testIncludesExcludesWithWhiteSpaces();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		class4.testFollowSymlinksFalse();
		class4.testFollowSymlinks();
		try {
			class4.testDirectoriesWithHyphens();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class4.testAntExcludesOverrideIncludes();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class4.testAntExcludesOverrideIncludesWithExplicitAntPrefix();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class4.testRegexIncludeWithExcludedPrefixDirs();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class4.testRegexExcludeWithNegativeLookahead();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class4.testRegexWithSlashInsideCharacterClass();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class4.testDoNotScanUnnecesaryDirectories();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		try {
			class4.testIsSymbolicLink();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		try {
			class4.testIsParentSymbolicLink();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		org.codehaus.plexus.util.LineOrientedInterpolatingReaderTest class5 = new org.codehaus.plexus.util.LineOrientedInterpolatingReaderTest();
		try {
			class5.testShouldInterpolateExpressionAtEndOfDataWithInvalidEndToken();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class5.testDefaultInterpolationWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class5.testDefaultInterpolationWithEscapedExpression();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		try {
			class5.testDefaultInterpolationWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err20) {
			err20.printStackTrace();
		}
		try {
			class5.testInterpolationWithSpecifiedBoundaryTokens();
		}
		catch (java.lang.Exception err21) {
			err21.printStackTrace();
		}
		try {
			class5.testInterpolationWithSpecifiedBoundaryTokensWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err22) {
			err22.printStackTrace();
		}
		try {
			class5.testInterpolationWithSpecifiedBoundaryTokensWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		org.codehaus.plexus.util.StringInputStreamTest class6 = new org.codehaus.plexus.util.StringInputStreamTest();
		class6.testFoo();
		org.codehaus.plexus.util.MatchPatternTest class7 = new org.codehaus.plexus.util.MatchPatternTest();
		try {
			class7.testMatchPath();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		class7.testMatchPatternStart();
		org.codehaus.plexus.util.SelectorUtilsTest class8 = new org.codehaus.plexus.util.SelectorUtilsTest();
		class8.testMatchPath_DefaultFileSeparator();
		class8.testMatchPath_UnixFileSeparator();
		class8.testMatchPath_WindowsFileSeparator();
		org.codehaus.plexus.util.ReflectionUtilsTest class9 = new org.codehaus.plexus.util.ReflectionUtilsTest();
		try {
			class9.testSimpleVariableAccess();
		}
		catch (java.lang.IllegalAccessException err25) {
			err25.printStackTrace();
		}
		try {
			class9.testComplexVariableAccess();
		}
		catch (java.lang.IllegalAccessException err26) {
			err26.printStackTrace();
		}
		try {
			class9.testSuperClassVariableAccess();
		}
		catch (java.lang.IllegalAccessException err27) {
			err27.printStackTrace();
		}
		try {
			class9.testSettingVariableValue();
		}
		catch (java.lang.IllegalAccessException err28) {
			err28.printStackTrace();
		}
		org.codehaus.plexus.util.IOUtilTest class10 = new org.codehaus.plexus.util.IOUtilTest();
		try {
			class10.testInputStreamToOutputStream();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class10.testInputStreamToWriter();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class10.testInputStreamToString();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class10.testReaderToOutputStream();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class10.testReaderToWriter();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class10.testReaderToString();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class10.testStringToOutputStream();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class10.testStringToWriter();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class10.testInputStreamToByteArray();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class10.testStringToByteArray();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class10.testByteArrayToWriter();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class10.testByteArrayToString();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class10.testByteArrayToOutputStream();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		try {
			class10.testCloseInputStream();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class10.testCloseOutputStream();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class10.testCloseReader();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		try {
			class10.testCloseWriter();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		org.codehaus.plexus.util.introspection.ReflectionValueExtractorTest class11 = new org.codehaus.plexus.util.introspection.ReflectionValueExtractorTest();
		try {
			class11.testValueExtraction();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		try {
			class11.testValueExtractorWithAInvalidExpression();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class11.testMappedDottedKey();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		try {
			class11.testIndexedMapped();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class11.testMappedIndexed();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class11.testMappedMissingDot();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class11.testIndexedMissingDot();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class11.testDotDot();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class11.testBadIndexedSyntax();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class11.testBadMappedSyntax();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class11.testIllegalIndexedType();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class11.testIllegalMappedType();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class11.testTrimRootToken();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class11.testArtifactMap();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class11.testRootPropertyRegression();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		org.codehaus.plexus.util.StringUtilsTest class12 = new org.codehaus.plexus.util.StringUtilsTest();
		class12.testIsEmpty();
		class12.testIsNotEmpty();
		class12.testIsBlank();
		class12.testIsNotBlank();
		class12.testCapitalizeFirstLetter();
		class12.testCapitalizeFirstLetterTurkish();
		class12.testLowerCaseFirstLetter();
		class12.testLowerCaseFirstLetterTurkish();
		class12.testRemoveAndHump();
		class12.testRemoveAndHumpTurkish();
		class12.testQuote_EscapeEmbeddedSingleQuotes();
		class12.testQuote_EscapeEmbeddedSingleQuotesWithPattern();
		class12.testQuote_EscapeEmbeddedDoubleQuotesAndSpaces();
		class12.testQuote_DontQuoteIfUnneeded();
		class12.testQuote_WrapWithSingleQuotes();
		class12.testQuote_PreserveExistingQuotes();
		class12.testQuote_WrapExistingQuotesWhenForceIsTrue();
		class12.testQuote_ShortVersion_SingleQuotesPreserved();
		class12.testSplit();
		try {
			class12.testRemoveDuplicateWhitespace();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class12.testUnifyLineSeparators();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		org.codehaus.plexus.util.cli.EnhancedStringTokenizerTest class13 = new org.codehaus.plexus.util.cli.EnhancedStringTokenizerTest();
		class13.test1();
		class13.test2();
		class13.test3();
		class13.testMultipleDelim();
		class13.testEmptyString();
		class13.testSimpleString();
		org.codehaus.plexus.util.cli.CommandLineUtilsTest class14 = new org.codehaus.plexus.util.cli.CommandLineUtilsTest();
		class14.testQuoteArguments();
		try {
			class14.testGetSystemEnvVarsCaseInsensitive();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		try {
			class14.testGetSystemEnvVarsWindows();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class14.testTranslateCommandline();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		org.codehaus.plexus.util.cli.shell.BourneShellTest class15 = new org.codehaus.plexus.util.cli.shell.BourneShellTest();
		class15.testQuoteWorkingDirectoryAndExecutable();
		class15.testQuoteWorkingDirectoryAndExecutable_WDPathWithSingleQuotes();
		class15.testQuoteWorkingDirectoryAndExecutable_WDPathWithSingleQuotes_BackslashFileSep();
		class15.testPreserveSingleQuotesOnArgument();
		class15.testAddSingleQuotesOnArgumentWithSpaces();
		class15.testEscapeSingleQuotesOnArgument();
		class15.testArgumentsWithsemicolon();
		try {
			class15.testBourneShellQuotingCharacters();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		org.codehaus.plexus.util.cli.StreamPumperTest class16 = new org.codehaus.plexus.util.cli.StreamPumperTest();
		class16.testPumping();
		class16.testPumpingWithPrintWriter();
		class16.testPumperReadsInputStreamUntilEndEvenIfConsumerFails();
		class16.testEnabled();
		class16.testDisabled();
		org.codehaus.plexus.util.cli.DefaultConsumerTest class17 = new org.codehaus.plexus.util.cli.DefaultConsumerTest();
		try {
			class17.testConsumeLine();
		}
		catch (java.lang.Exception err67) {
			err67.printStackTrace();
		}
		org.codehaus.plexus.util.cli.CommandlineTest class18 = new org.codehaus.plexus.util.cli.CommandlineTest();
		class18.testCommandlineWithoutCommandInConstructor();
		class18.testCommandlineWithCommandInConstructor();
		try {
			class18.testExecuteBinaryOnPath();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		try {
			class18.testExecute();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		class18.testSetLine();
		class18.testCreateCommandInReverseOrder();
		class18.testSetFile();
		try {
			class18.testGetShellCommandLineWindows();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class18.testGetShellCommandLineWindowsWithSeveralQuotes();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class18.testGetShellCommandLineBash();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class18.testGetShellCommandLineBash_WithWorkingDirectory();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class18.testGetShellCommandLineBash_WithSingleQuotedArg();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		try {
			class18.testGetShellCommandLineNonWindows();
		}
		catch (java.lang.Exception err75) {
			err75.printStackTrace();
		}
		try {
			class18.testEnvironment();
		}
		catch (java.lang.Exception err76) {
			err76.printStackTrace();
		}
		try {
			class18.testEnvironmentWitOverrideSystemEnvironment();
		}
		catch (java.lang.Exception err77) {
			err77.printStackTrace();
		}
		try {
			class18.testQuotedPathWithSingleApostrophe();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class18.testPathWithShellExpansionStrings();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class18.testQuotedPathWithQuotationMark();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class18.testQuotedPathWithQuotationMarkAndApostrophe();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		try {
			class18.testOnlyQuotedPath();
		}
		catch (java.lang.Exception err82) {
			err82.printStackTrace();
		}
		try {
			class18.testDollarSignInArgumentPath();
		}
		catch (java.lang.Exception err83) {
			err83.printStackTrace();
		}
		try {
			class18.testTimeOutException();
		}
		catch (java.lang.Exception err84) {
			err84.printStackTrace();
		}
		org.codehaus.plexus.util.InterpolationFilterReaderTest class19 = new org.codehaus.plexus.util.InterpolationFilterReaderTest();
		try {
			class19.testShouldNotInterpolateExpressionAtEndOfDataWithInvalidEndToken();
		}
		catch (java.lang.Exception err85) {
			err85.printStackTrace();
		}
		try {
			class19.testShouldNotInterpolateExpressionWithMissingEndToken();
		}
		catch (java.lang.Exception err86) {
			err86.printStackTrace();
		}
		try {
			class19.testShouldNotInterpolateWithMalformedStartToken();
		}
		catch (java.lang.Exception err87) {
			err87.printStackTrace();
		}
		try {
			class19.testShouldNotInterpolateWithMalformedEndToken();
		}
		catch (java.lang.Exception err88) {
			err88.printStackTrace();
		}
		try {
			class19.testInterpolationWithMulticharDelimiters();
		}
		catch (java.lang.Exception err89) {
			err89.printStackTrace();
		}
		try {
			class19.testDefaultInterpolationWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err90) {
			err90.printStackTrace();
		}
		try {
			class19.testDefaultInterpolationWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err91) {
			err91.printStackTrace();
		}
		try {
			class19.testInterpolationWithSpecifiedBoundaryTokens();
		}
		catch (java.lang.Exception err92) {
			err92.printStackTrace();
		}
		try {
			class19.testInterpolationWithSpecifiedBoundaryTokensWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err93) {
			err93.printStackTrace();
		}
		try {
			class19.testInterpolationWithSpecifiedBoundaryTokensWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err94) {
			err94.printStackTrace();
		}
		try {
			class19.testInterpolationWithSpecifiedBoundaryTokensAndAdditionalTokenCharacter();
		}
		catch (java.lang.Exception err95) {
			err95.printStackTrace();
		}
		org.codehaus.plexus.util.PerfTest class20 = new org.codehaus.plexus.util.PerfTest();
		class20.testSubString();
		class20.testResDir();
		org.codehaus.plexus.util.dag.TopologicalSorterTest class21 = new org.codehaus.plexus.util.dag.TopologicalSorterTest();
		try {
			class21.testDfs();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err96) {
			err96.printStackTrace();
		}
		org.codehaus.plexus.util.dag.CycleDetectedExceptionTest class22 = new org.codehaus.plexus.util.dag.CycleDetectedExceptionTest();
		class22.testException();
		org.codehaus.plexus.util.dag.CycleDetectorTest class23 = new org.codehaus.plexus.util.dag.CycleDetectorTest();
		class23.testCycyleDetection();
		org.codehaus.plexus.util.dag.VertexTest class24 = new org.codehaus.plexus.util.dag.VertexTest();
		class24.testVertex();
		org.codehaus.plexus.util.dag.DAGTest class25 = new org.codehaus.plexus.util.dag.DAGTest();
		try {
			class25.testDAG();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err97) {
			err97.printStackTrace();
		}
		try {
			class25.testGetPredecessors();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err98) {
			err98.printStackTrace();
		}
		org.codehaus.plexus.util.OsTest class26 = new org.codehaus.plexus.util.OsTest();
		class26.testUndefinedFamily();
		class26.testOs();
		class26.testValidList();
		org.codehaus.plexus.util.xml.XmlUtilTest class27 = new org.codehaus.plexus.util.xml.XmlUtilTest();
		try {
			class27.testPrettyFormatInputStreamOutputStream();
		}
		catch (java.lang.Exception err99) {
			err99.printStackTrace();
		}
		try {
			class27.testPrettyFormatReaderWriter();
		}
		catch (java.lang.Exception err100) {
			err100.printStackTrace();
		}
		try {
			class27.testPrettyFormatString();
		}
		catch (java.lang.Exception err101) {
			err101.printStackTrace();
		}
		try {
			class27.testPrettyFormatReaderWriter2();
		}
		catch (java.lang.Exception err102) {
			err102.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomPerfTest class28 = new org.codehaus.plexus.util.xml.Xpp3DomPerfTest();
		org.codehaus.plexus.util.xml.XmlStreamReaderTest class29 = new org.codehaus.plexus.util.xml.XmlStreamReaderTest();
		try {
			class29.testNoXmlHeader();
		}
		catch (java.io.IOException err103) {
			err103.printStackTrace();
		}
		try {
			class29.testDefaultEncoding();
		}
		catch (java.io.IOException err104) {
			err104.printStackTrace();
		}
		try {
			class29.testUTF8Encoding();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
		try {
			class29.testUTF16Encoding();
		}
		catch (java.io.IOException err106) {
			err106.printStackTrace();
		}
		try {
			class29.testUTF16BEEncoding();
		}
		catch (java.io.IOException err107) {
			err107.printStackTrace();
		}
		try {
			class29.testUTF16LEEncoding();
		}
		catch (java.io.IOException err108) {
			err108.printStackTrace();
		}
		try {
			class29.testLatin1Encoding();
		}
		catch (java.io.IOException err109) {
			err109.printStackTrace();
		}
		try {
			class29.testLatin7Encoding();
		}
		catch (java.io.IOException err110) {
			err110.printStackTrace();
		}
		try {
			class29.testLatin15Encoding();
		}
		catch (java.io.IOException err111) {
			err111.printStackTrace();
		}
		try {
			class29.testEUC_JPEncoding();
		}
		catch (java.io.IOException err112) {
			err112.printStackTrace();
		}
		try {
			class29.testEBCDICEncoding();
		}
		catch (java.io.IOException err113) {
			err113.printStackTrace();
		}
		try {
			class29.testInappropriateEncoding();
		}
		catch (java.io.IOException err114) {
			err114.printStackTrace();
		}
		try {
			class29.testEncodingAttribute();
		}
		catch (java.io.IOException err115) {
			err115.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomWriterTest class30 = new org.codehaus.plexus.util.xml.Xpp3DomWriterTest();
		class30.testWriter();
		class30.testWriterNoEscape();
		org.codehaus.plexus.util.xml.XmlStreamWriterTest class31 = new org.codehaus.plexus.util.xml.XmlStreamWriterTest();
		try {
			class31.testNoXmlHeader();
		}
		catch (java.io.IOException err116) {
			err116.printStackTrace();
		}
		try {
			class31.testEmpty();
		}
		catch (java.io.IOException err117) {
			err117.printStackTrace();
		}
		try {
			class31.testDefaultEncoding();
		}
		catch (java.io.IOException err118) {
			err118.printStackTrace();
		}
		try {
			class31.testUTF8Encoding();
		}
		catch (java.io.IOException err119) {
			err119.printStackTrace();
		}
		try {
			class31.testUTF16Encoding();
		}
		catch (java.io.IOException err120) {
			err120.printStackTrace();
		}
		try {
			class31.testUTF16BEEncoding();
		}
		catch (java.io.IOException err121) {
			err121.printStackTrace();
		}
		try {
			class31.testUTF16LEEncoding();
		}
		catch (java.io.IOException err122) {
			err122.printStackTrace();
		}
		try {
			class31.testLatin1Encoding();
		}
		catch (java.io.IOException err123) {
			err123.printStackTrace();
		}
		try {
			class31.testLatin7Encoding();
		}
		catch (java.io.IOException err124) {
			err124.printStackTrace();
		}
		try {
			class31.testLatin15Encoding();
		}
		catch (java.io.IOException err125) {
			err125.printStackTrace();
		}
		try {
			class31.testEUC_JPEncoding();
		}
		catch (java.io.IOException err126) {
			err126.printStackTrace();
		}
		try {
			class31.testEBCDICEncoding();
		}
		catch (java.io.IOException err127) {
			err127.printStackTrace();
		}
		org.codehaus.plexus.util.xml.pull.MXParserTest class32 = new org.codehaus.plexus.util.xml.pull.MXParserTest();
		try {
			class32.testHexadecimalEntities();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class32.testDecimalEntities();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class32.testPredefinedEntities();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class32.testEntityReplacementMap();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err131) {
			err131.printStackTrace();
		}
		catch (java.io.IOException err132) {
			err132.printStackTrace();
		}
		try {
			class32.testCustomEntities();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class32.testUnicodeEntities();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		try {
			class32.testInvalidCharacterReferenceHexa();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		try {
			class32.testValidCharacterReferenceHexa();
		}
		catch (java.lang.Exception err136) {
			err136.printStackTrace();
		}
		try {
			class32.testInvalidCharacterReferenceDecimal();
		}
		catch (java.lang.Exception err137) {
			err137.printStackTrace();
		}
		try {
			class32.testValidCharacterReferenceDecimal();
		}
		catch (java.lang.Exception err138) {
			err138.printStackTrace();
		}
		try {
			class32.testProcessingInstruction();
		}
		catch (java.lang.Exception err139) {
			err139.printStackTrace();
		}
		try {
			class32.testProcessingInstructionsContainingXml();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		try {
			class32.testSubsequentProcessingInstructionShort();
		}
		catch (java.lang.Exception err141) {
			err141.printStackTrace();
		}
		try {
			class32.testSubsequentProcessingInstructionMoreThan8k();
		}
		catch (java.lang.Exception err142) {
			err142.printStackTrace();
		}
		try {
			class32.testMalformedProcessingInstructionAfterTag();
		}
		catch (java.lang.Exception err143) {
			err143.printStackTrace();
		}
		try {
			class32.testMalformedProcessingInstructionBeforeTag();
		}
		catch (java.lang.Exception err144) {
			err144.printStackTrace();
		}
		try {
			class32.testMalformedProcessingInstructionSpaceBeforeName();
		}
		catch (java.lang.Exception err145) {
			err145.printStackTrace();
		}
		try {
			class32.testMalformedProcessingInstructionNoClosingQuestionMark();
		}
		catch (java.lang.Exception err146) {
			err146.printStackTrace();
		}
		try {
			class32.testSubsequentMalformedProcessingInstructionNoClosingQuestionMark();
		}
		catch (java.lang.Exception err147) {
			err147.printStackTrace();
		}
		try {
			class32.testMalformedXMLRootElement();
		}
		catch (java.lang.Exception err148) {
			err148.printStackTrace();
		}
		try {
			class32.testMalformedXMLRootElement2();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class32.testMalformedXMLRootElement3();
		}
		catch (java.lang.Exception err150) {
			err150.printStackTrace();
		}
		try {
			class32.testMalformedXMLRootElement4();
		}
		catch (java.lang.Exception err151) {
			err151.printStackTrace();
		}
		try {
			class32.testMalformedXMLRootElement5();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest class33 = new org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest();
		class33.testDefaultPrettyPrintXMLWriter();
		class33.testPrettyPrintXMLWriterWithGivenLineSeparator();
		class33.testPrettyPrintXMLWriterWithGivenLineIndenter();
		class33.testEscapeXmlAttribute();
		class33.testendElementAlreadyClosed();
		try {
			class33.testIssue51DetectJava7ConcatenationBug();
		}
		catch (java.io.IOException err153) {
			err153.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomBuilderTest class34 = new org.codehaus.plexus.util.xml.Xpp3DomBuilderTest();
		try {
			class34.testBuildFromReader();
		}
		catch (java.lang.Exception err154) {
			err154.printStackTrace();
		}
		try {
			class34.testBuildTrimming();
		}
		catch (java.lang.Exception err155) {
			err155.printStackTrace();
		}
		try {
			class34.testBuildFromXpp3Dom();
		}
		catch (java.lang.Exception err156) {
			err156.printStackTrace();
		}
		class34.testUnclosedXml();
		try {
			class34.testEscapingInContent();
		}
		catch (java.io.IOException err157) {
			err157.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err158) {
			err158.printStackTrace();
		}
		try {
			class34.testEscapingInAttributes();
		}
		catch (java.io.IOException err159) {
			err159.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err160) {
			err160.printStackTrace();
		}
		try {
			class34.testInputLocationTracking();
		}
		catch (java.io.IOException err161) {
			err161.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err162) {
			err162.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomTest class35 = new org.codehaus.plexus.util.xml.Xpp3DomTest();
		class35.testShouldPerformAppendAtFirstSubElementLevel();
		class35.testShouldOverrideAppendAndDeepMerge();
		class35.testShouldPerformSelfOverrideAtTopLevel();
		class35.testShouldMergeValuesAtTopLevelByDefault();
		class35.testShouldMergeValuesAtTopLevel();
		class35.testNullAttributeNameOrValue();
		class35.testEquals();
		try {
			class35.testEqualsIsNullSafe();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err163) {
			err163.printStackTrace();
		}
		catch (java.io.IOException err164) {
			err164.printStackTrace();
		}
		try {
			class35.testShouldOverwritePluginConfigurationSubItemsByDefault();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err165) {
			err165.printStackTrace();
		}
		catch (java.io.IOException err166) {
			err166.printStackTrace();
		}
		try {
			class35.testShouldMergePluginConfigurationSubItemsWithMergeAttributeSet();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err167) {
			err167.printStackTrace();
		}
		catch (java.io.IOException err168) {
			err168.printStackTrace();
		}
		try {
			class35.testShouldNotChangeUponMergeWithItselfWhenFirstOrLastSubItemIsEmpty();
		}
		catch (java.lang.Exception err169) {
			err169.printStackTrace();
		}
		try {
			class35.testShouldCopyRecessiveChildrenNotPresentInTarget();
		}
		catch (java.lang.Exception err170) {
			err170.printStackTrace();
		}
		try {
			class35.testDupeChildren();
		}
		catch (java.io.IOException err171) {
			err171.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err172) {
			err172.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomUtilsTest class36 = new org.codehaus.plexus.util.xml.Xpp3DomUtilsTest();
		try {
			class36.testCombineId();
		}
		catch (java.lang.Exception err173) {
			err173.printStackTrace();
		}
		org.codehaus.plexus.util.xml.XmlWriterUtilTest class37 = new org.codehaus.plexus.util.xml.XmlWriterUtilTest();
		try {
			class37.testWriteLineBreakXMLWriter();
		}
		catch (java.lang.Exception err174) {
			err174.printStackTrace();
		}
		try {
			class37.testWriteLineBreakXMLWriterInt();
		}
		catch (java.lang.Exception err175) {
			err175.printStackTrace();
		}
		try {
			class37.testWriteLineBreakXMLWriterIntInt();
		}
		catch (java.lang.Exception err176) {
			err176.printStackTrace();
		}
		try {
			class37.testWriteLineBreakXMLWriterIntIntInt();
		}
		catch (java.lang.Exception err177) {
			err177.printStackTrace();
		}
		try {
			class37.testWriteCommentLineBreakXMLWriter();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		try {
			class37.testWriteCommentLineBreakXMLWriterInt();
		}
		catch (java.lang.Exception err179) {
			err179.printStackTrace();
		}
		try {
			class37.testWriteCommentXMLWriterString();
		}
		catch (java.lang.Exception err180) {
			err180.printStackTrace();
		}
		try {
			class37.testWriteCommentXMLWriterStringInt();
		}
		catch (java.lang.Exception err181) {
			err181.printStackTrace();
		}
		try {
			class37.testWriteCommentXMLWriterStringIntInt();
		}
		catch (java.lang.Exception err182) {
			err182.printStackTrace();
		}
		try {
			class37.testWriteCommentXMLWriterStringIntIntInt();
		}
		catch (java.lang.Exception err183) {
			err183.printStackTrace();
		}
		try {
			class37.testWriteCommentTextXMLWriterStringInt();
		}
		catch (java.lang.Exception err184) {
			err184.printStackTrace();
		}
		try {
			class37.testWriteCommentTextXMLWriterStringIntInt();
		}
		catch (java.lang.Exception err185) {
			err185.printStackTrace();
		}
		try {
			class37.testWriteCommentTextXMLWriterStringIntIntInt();
		}
		catch (java.lang.Exception err186) {
			err186.printStackTrace();
		}
		try {
			class37.testWriteCommentNull();
		}
		catch (java.lang.Exception err187) {
			err187.printStackTrace();
		}
		try {
			class37.testWriteCommentShort();
		}
		catch (java.lang.Exception err188) {
			err188.printStackTrace();
		}
		try {
			class37.testWriteCommentLong();
		}
		catch (java.lang.Exception err189) {
			err189.printStackTrace();
		}
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B3 class38 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B3();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B3 class39 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B3();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B1 class40 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B1();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType class41 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType class42 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B2 class43 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B2();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_benchmarkMerge_jmhTest class44 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_benchmarkMerge_jmhTest();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_benchmarkClone_jmhTest class45 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_benchmarkClone_jmhTest();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B1 class46 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B1();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B2 class47 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B2();
		org.codehaus.plexus.util.PathToolTest class48 = new org.codehaus.plexus.util.PathToolTest();
		try {
			class48.testGetRelativePath();
		}
		catch (java.lang.Exception err190) {
			err190.printStackTrace();
		}
		try {
			class48.testGetDirectoryComponent();
		}
		catch (java.lang.Exception err191) {
			err191.printStackTrace();
		}
		try {
			class48.testCalculateLink();
		}
		catch (java.lang.Exception err192) {
			err192.printStackTrace();
		}
		try {
			class48.testGetRelativeWebPath();
		}
		catch (java.lang.Exception err193) {
			err193.printStackTrace();
		}
		try {
			class48.testGetRelativeFilePath();
		}
		catch (java.lang.Exception err194) {
			err194.printStackTrace();
		}
		org.codehaus.plexus.util.DirectoryWalkerTest class49 = new org.codehaus.plexus.util.DirectoryWalkerTest();
		class49.testDirectoryWalk();
		org.codehaus.plexus.util.reflection.ReflectorTest class50 = new org.codehaus.plexus.util.reflection.ReflectorTest();
		try {
			class50.testObjectPropertyFromName();
		}
		catch (java.lang.Exception err195) {
			err195.printStackTrace();
		}
		try {
			class50.testObjectPropertyFromBean();
		}
		catch (java.lang.Exception err196) {
			err196.printStackTrace();
		}
		try {
			class50.testObjectPropertyFromField();
		}
		catch (java.lang.Exception err197) {
			err197.printStackTrace();
		}
	}
}