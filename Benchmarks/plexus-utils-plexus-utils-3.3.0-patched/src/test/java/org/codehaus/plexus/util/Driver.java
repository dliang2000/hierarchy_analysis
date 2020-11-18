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
		org.codehaus.plexus.util.introspection.ReflectionValueExtractorTest class9 = new org.codehaus.plexus.util.introspection.ReflectionValueExtractorTest();
		try {
			class9.testValueExtraction();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class9.testValueExtractorWithAInvalidExpression();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		try {
			class9.testMappedDottedKey();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		try {
			class9.testIndexedMapped();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class9.testMappedIndexed();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class9.testMappedMissingDot();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class9.testIndexedMissingDot();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class9.testDotDot();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class9.testBadIndexedSyntax();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class9.testBadMappedSyntax();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class9.testIllegalIndexedType();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class9.testIllegalMappedType();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class9.testTrimRootToken();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class9.testArtifactMap();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class9.testRootPropertyRegression();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		org.codehaus.plexus.util.StringUtilsTest class10 = new org.codehaus.plexus.util.StringUtilsTest();
		class10.testIsEmpty();
		class10.testIsNotEmpty();
		class10.testIsBlank();
		class10.testIsNotBlank();
		class10.testCapitalizeFirstLetter();
		class10.testCapitalizeFirstLetterTurkish();
		class10.testLowerCaseFirstLetter();
		class10.testLowerCaseFirstLetterTurkish();
		class10.testRemoveAndHump();
		class10.testRemoveAndHumpTurkish();
		class10.testQuote_EscapeEmbeddedSingleQuotes();
		class10.testQuote_EscapeEmbeddedSingleQuotesWithPattern();
		class10.testQuote_EscapeEmbeddedDoubleQuotesAndSpaces();
		class10.testQuote_DontQuoteIfUnneeded();
		class10.testQuote_WrapWithSingleQuotes();
		class10.testQuote_PreserveExistingQuotes();
		class10.testQuote_WrapExistingQuotesWhenForceIsTrue();
		class10.testQuote_ShortVersion_SingleQuotesPreserved();
		class10.testSplit();
		try {
			class10.testRemoveDuplicateWhitespace();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		try {
			class10.testUnifyLineSeparators();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		org.codehaus.plexus.util.cli.EnhancedStringTokenizerTest class11 = new org.codehaus.plexus.util.cli.EnhancedStringTokenizerTest();
		class11.test1();
		class11.test2();
		class11.test3();
		class11.testMultipleDelim();
		class11.testEmptyString();
		class11.testSimpleString();
		org.codehaus.plexus.util.cli.CommandLineUtilsTest class12 = new org.codehaus.plexus.util.cli.CommandLineUtilsTest();
		class12.testQuoteArguments();
		try {
			class12.testGetSystemEnvVarsCaseInsensitive();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		try {
			class12.testGetSystemEnvVarsWindows();
		}
		catch (java.lang.Exception err43) {
			err43.printStackTrace();
		}
		try {
			class12.testTranslateCommandline();
		}
		catch (java.lang.Exception err44) {
			err44.printStackTrace();
		}
		org.codehaus.plexus.util.cli.shell.BourneShellTest class13 = new org.codehaus.plexus.util.cli.shell.BourneShellTest();
		class13.testQuoteWorkingDirectoryAndExecutable();
		class13.testQuoteWorkingDirectoryAndExecutable_WDPathWithSingleQuotes();
		class13.testQuoteWorkingDirectoryAndExecutable_WDPathWithSingleQuotes_BackslashFileSep();
		class13.testPreserveSingleQuotesOnArgument();
		class13.testAddSingleQuotesOnArgumentWithSpaces();
		class13.testEscapeSingleQuotesOnArgument();
		class13.testArgumentsWithsemicolon();
		try {
			class13.testBourneShellQuotingCharacters();
		}
		catch (java.lang.Exception err45) {
			err45.printStackTrace();
		}
		org.codehaus.plexus.util.cli.StreamPumperTest class14 = new org.codehaus.plexus.util.cli.StreamPumperTest();
		class14.testPumping();
		class14.testPumpingWithPrintWriter();
		class14.testPumperReadsInputStreamUntilEndEvenIfConsumerFails();
		class14.testEnabled();
		class14.testDisabled();
		org.codehaus.plexus.util.cli.DefaultConsumerTest class15 = new org.codehaus.plexus.util.cli.DefaultConsumerTest();
		try {
			class15.testConsumeLine();
		}
		catch (java.lang.Exception err46) {
			err46.printStackTrace();
		}
		org.codehaus.plexus.util.cli.CommandlineTest class16 = new org.codehaus.plexus.util.cli.CommandlineTest();
		class16.testCommandlineWithoutCommandInConstructor();
		class16.testCommandlineWithCommandInConstructor();
		try {
			class16.testExecuteBinaryOnPath();
		}
		catch (java.lang.Exception err47) {
			err47.printStackTrace();
		}
		try {
			class16.testExecute();
		}
		catch (java.lang.Exception err48) {
			err48.printStackTrace();
		}
		class16.testSetLine();
		class16.testCreateCommandInReverseOrder();
		class16.testSetFile();
		try {
			class16.testGetShellCommandLineWindows();
		}
		catch (java.lang.Exception err49) {
			err49.printStackTrace();
		}
		try {
			class16.testGetShellCommandLineWindowsWithSeveralQuotes();
		}
		catch (java.lang.Exception err50) {
			err50.printStackTrace();
		}
		try {
			class16.testGetShellCommandLineBash();
		}
		catch (java.lang.Exception err51) {
			err51.printStackTrace();
		}
		try {
			class16.testGetShellCommandLineBash_WithWorkingDirectory();
		}
		catch (java.lang.Exception err52) {
			err52.printStackTrace();
		}
		try {
			class16.testGetShellCommandLineBash_WithSingleQuotedArg();
		}
		catch (java.lang.Exception err53) {
			err53.printStackTrace();
		}
		try {
			class16.testGetShellCommandLineNonWindows();
		}
		catch (java.lang.Exception err54) {
			err54.printStackTrace();
		}
		try {
			class16.testEnvironment();
		}
		catch (java.lang.Exception err55) {
			err55.printStackTrace();
		}
		try {
			class16.testEnvironmentWitOverrideSystemEnvironment();
		}
		catch (java.lang.Exception err56) {
			err56.printStackTrace();
		}
		try {
			class16.testQuotedPathWithSingleApostrophe();
		}
		catch (java.lang.Exception err57) {
			err57.printStackTrace();
		}
		try {
			class16.testPathWithShellExpansionStrings();
		}
		catch (java.lang.Exception err58) {
			err58.printStackTrace();
		}
		try {
			class16.testQuotedPathWithQuotationMark();
		}
		catch (java.lang.Exception err59) {
			err59.printStackTrace();
		}
		try {
			class16.testQuotedPathWithQuotationMarkAndApostrophe();
		}
		catch (java.lang.Exception err60) {
			err60.printStackTrace();
		}
		try {
			class16.testOnlyQuotedPath();
		}
		catch (java.lang.Exception err61) {
			err61.printStackTrace();
		}
		try {
			class16.testDollarSignInArgumentPath();
		}
		catch (java.lang.Exception err62) {
			err62.printStackTrace();
		}
		try {
			class16.testTimeOutException();
		}
		catch (java.lang.Exception err63) {
			err63.printStackTrace();
		}
		org.codehaus.plexus.util.InterpolationFilterReaderTest class17 = new org.codehaus.plexus.util.InterpolationFilterReaderTest();
		try {
			class17.testShouldNotInterpolateExpressionAtEndOfDataWithInvalidEndToken();
		}
		catch (java.lang.Exception err64) {
			err64.printStackTrace();
		}
		try {
			class17.testShouldNotInterpolateExpressionWithMissingEndToken();
		}
		catch (java.lang.Exception err65) {
			err65.printStackTrace();
		}
		try {
			class17.testShouldNotInterpolateWithMalformedStartToken();
		}
		catch (java.lang.Exception err66) {
			err66.printStackTrace();
		}
		try {
			class17.testShouldNotInterpolateWithMalformedEndToken();
		}
		catch (java.lang.Exception err67) {
			err67.printStackTrace();
		}
		try {
			class17.testInterpolationWithMulticharDelimiters();
		}
		catch (java.lang.Exception err68) {
			err68.printStackTrace();
		}
		try {
			class17.testDefaultInterpolationWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err69) {
			err69.printStackTrace();
		}
		try {
			class17.testDefaultInterpolationWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err70) {
			err70.printStackTrace();
		}
		try {
			class17.testInterpolationWithSpecifiedBoundaryTokens();
		}
		catch (java.lang.Exception err71) {
			err71.printStackTrace();
		}
		try {
			class17.testInterpolationWithSpecifiedBoundaryTokensWithNonInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err72) {
			err72.printStackTrace();
		}
		try {
			class17.testInterpolationWithSpecifiedBoundaryTokensWithInterpolatedValueAtEnd();
		}
		catch (java.lang.Exception err73) {
			err73.printStackTrace();
		}
		try {
			class17.testInterpolationWithSpecifiedBoundaryTokensAndAdditionalTokenCharacter();
		}
		catch (java.lang.Exception err74) {
			err74.printStackTrace();
		}
		org.codehaus.plexus.util.PerfTest class18 = new org.codehaus.plexus.util.PerfTest();
		class18.testSubString();
		class18.testResDir();
		org.codehaus.plexus.util.dag.TopologicalSorterTest class19 = new org.codehaus.plexus.util.dag.TopologicalSorterTest();
		try {
			class19.testDfs();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err75) {
			err75.printStackTrace();
		}
		org.codehaus.plexus.util.dag.CycleDetectedExceptionTest class20 = new org.codehaus.plexus.util.dag.CycleDetectedExceptionTest();
		class20.testException();
		org.codehaus.plexus.util.dag.CycleDetectorTest class21 = new org.codehaus.plexus.util.dag.CycleDetectorTest();
		class21.testCycyleDetection();
		org.codehaus.plexus.util.dag.VertexTest class22 = new org.codehaus.plexus.util.dag.VertexTest();
		class22.testVertex();
		org.codehaus.plexus.util.dag.DAGTest class23 = new org.codehaus.plexus.util.dag.DAGTest();
		try {
			class23.testDAG();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err76) {
			err76.printStackTrace();
		}
		try {
			class23.testGetPredecessors();
		}
		catch (org.codehaus.plexus.util.dag.CycleDetectedException err77) {
			err77.printStackTrace();
		}
		org.codehaus.plexus.util.OsTest class24 = new org.codehaus.plexus.util.OsTest();
		class24.testUndefinedFamily();
		class24.testOs();
		class24.testValidList();
		org.codehaus.plexus.util.xml.XmlUtilTest class25 = new org.codehaus.plexus.util.xml.XmlUtilTest();
		try {
			class25.testPrettyFormatInputStreamOutputStream();
		}
		catch (java.lang.Exception err78) {
			err78.printStackTrace();
		}
		try {
			class25.testPrettyFormatReaderWriter();
		}
		catch (java.lang.Exception err79) {
			err79.printStackTrace();
		}
		try {
			class25.testPrettyFormatString();
		}
		catch (java.lang.Exception err80) {
			err80.printStackTrace();
		}
		try {
			class25.testPrettyFormatReaderWriter2();
		}
		catch (java.lang.Exception err81) {
			err81.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomPerfTest class26 = new org.codehaus.plexus.util.xml.Xpp3DomPerfTest();
		org.codehaus.plexus.util.xml.XmlStreamReaderTest class27 = new org.codehaus.plexus.util.xml.XmlStreamReaderTest();
		try {
			class27.testNoXmlHeader();
		}
		catch (java.io.IOException err82) {
			err82.printStackTrace();
		}
		try {
			class27.testDefaultEncoding();
		}
		catch (java.io.IOException err83) {
			err83.printStackTrace();
		}
		try {
			class27.testUTF8Encoding();
		}
		catch (java.io.IOException err84) {
			err84.printStackTrace();
		}
		try {
			class27.testUTF16Encoding();
		}
		catch (java.io.IOException err85) {
			err85.printStackTrace();
		}
		try {
			class27.testUTF16BEEncoding();
		}
		catch (java.io.IOException err86) {
			err86.printStackTrace();
		}
		try {
			class27.testUTF16LEEncoding();
		}
		catch (java.io.IOException err87) {
			err87.printStackTrace();
		}
		try {
			class27.testLatin1Encoding();
		}
		catch (java.io.IOException err88) {
			err88.printStackTrace();
		}
		try {
			class27.testLatin7Encoding();
		}
		catch (java.io.IOException err89) {
			err89.printStackTrace();
		}
		try {
			class27.testLatin15Encoding();
		}
		catch (java.io.IOException err90) {
			err90.printStackTrace();
		}
		try {
			class27.testEUC_JPEncoding();
		}
		catch (java.io.IOException err91) {
			err91.printStackTrace();
		}
		try {
			class27.testEBCDICEncoding();
		}
		catch (java.io.IOException err92) {
			err92.printStackTrace();
		}
		try {
			class27.testInappropriateEncoding();
		}
		catch (java.io.IOException err93) {
			err93.printStackTrace();
		}
		try {
			class27.testEncodingAttribute();
		}
		catch (java.io.IOException err94) {
			err94.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomWriterTest class28 = new org.codehaus.plexus.util.xml.Xpp3DomWriterTest();
		class28.testWriter();
		class28.testWriterNoEscape();
		org.codehaus.plexus.util.xml.XmlStreamWriterTest class29 = new org.codehaus.plexus.util.xml.XmlStreamWriterTest();
		try {
			class29.testNoXmlHeader();
		}
		catch (java.io.IOException err95) {
			err95.printStackTrace();
		}
		try {
			class29.testEmpty();
		}
		catch (java.io.IOException err96) {
			err96.printStackTrace();
		}
		try {
			class29.testDefaultEncoding();
		}
		catch (java.io.IOException err97) {
			err97.printStackTrace();
		}
		try {
			class29.testUTF8Encoding();
		}
		catch (java.io.IOException err98) {
			err98.printStackTrace();
		}
		try {
			class29.testUTF16Encoding();
		}
		catch (java.io.IOException err99) {
			err99.printStackTrace();
		}
		try {
			class29.testUTF16BEEncoding();
		}
		catch (java.io.IOException err100) {
			err100.printStackTrace();
		}
		try {
			class29.testUTF16LEEncoding();
		}
		catch (java.io.IOException err101) {
			err101.printStackTrace();
		}
		try {
			class29.testLatin1Encoding();
		}
		catch (java.io.IOException err102) {
			err102.printStackTrace();
		}
		try {
			class29.testLatin7Encoding();
		}
		catch (java.io.IOException err103) {
			err103.printStackTrace();
		}
		try {
			class29.testLatin15Encoding();
		}
		catch (java.io.IOException err104) {
			err104.printStackTrace();
		}
		try {
			class29.testEUC_JPEncoding();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
		try {
			class29.testEBCDICEncoding();
		}
		catch (java.io.IOException err106) {
			err106.printStackTrace();
		}
		org.codehaus.plexus.util.xml.pull.MXParserTest class30 = new org.codehaus.plexus.util.xml.pull.MXParserTest();
		try {
			class30.testHexadecimalEntities();
		}
		catch (java.lang.Exception err107) {
			err107.printStackTrace();
		}
		try {
			class30.testDecimalEntities();
		}
		catch (java.lang.Exception err108) {
			err108.printStackTrace();
		}
		try {
			class30.testPredefinedEntities();
		}
		catch (java.lang.Exception err109) {
			err109.printStackTrace();
		}
		try {
			class30.testEntityReplacementMap();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err110) {
			err110.printStackTrace();
		}
		catch (java.io.IOException err111) {
			err111.printStackTrace();
		}
		try {
			class30.testCustomEntities();
		}
		catch (java.lang.Exception err112) {
			err112.printStackTrace();
		}
		try {
			class30.testUnicodeEntities();
		}
		catch (java.lang.Exception err113) {
			err113.printStackTrace();
		}
		try {
			class30.testInvalidCharacterReferenceHexa();
		}
		catch (java.lang.Exception err114) {
			err114.printStackTrace();
		}
		try {
			class30.testValidCharacterReferenceHexa();
		}
		catch (java.lang.Exception err115) {
			err115.printStackTrace();
		}
		try {
			class30.testInvalidCharacterReferenceDecimal();
		}
		catch (java.lang.Exception err116) {
			err116.printStackTrace();
		}
		try {
			class30.testValidCharacterReferenceDecimal();
		}
		catch (java.lang.Exception err117) {
			err117.printStackTrace();
		}
		try {
			class30.testProcessingInstruction();
		}
		catch (java.lang.Exception err118) {
			err118.printStackTrace();
		}
		try {
			class30.testProcessingInstructionsContainingXml();
		}
		catch (java.lang.Exception err119) {
			err119.printStackTrace();
		}
		try {
			class30.testSubsequentProcessingInstructionShort();
		}
		catch (java.lang.Exception err120) {
			err120.printStackTrace();
		}
		try {
			class30.testSubsequentProcessingInstructionMoreThan8k();
		}
		catch (java.lang.Exception err121) {
			err121.printStackTrace();
		}
		try {
			class30.testMalformedProcessingInstructionAfterTag();
		}
		catch (java.lang.Exception err122) {
			err122.printStackTrace();
		}
		try {
			class30.testMalformedProcessingInstructionBeforeTag();
		}
		catch (java.lang.Exception err123) {
			err123.printStackTrace();
		}
		try {
			class30.testMalformedProcessingInstructionSpaceBeforeName();
		}
		catch (java.lang.Exception err124) {
			err124.printStackTrace();
		}
		try {
			class30.testMalformedProcessingInstructionNoClosingQuestionMark();
		}
		catch (java.lang.Exception err125) {
			err125.printStackTrace();
		}
		try {
			class30.testSubsequentMalformedProcessingInstructionNoClosingQuestionMark();
		}
		catch (java.lang.Exception err126) {
			err126.printStackTrace();
		}
		try {
			class30.testMalformedXMLRootElement();
		}
		catch (java.lang.Exception err127) {
			err127.printStackTrace();
		}
		try {
			class30.testMalformedXMLRootElement2();
		}
		catch (java.lang.Exception err128) {
			err128.printStackTrace();
		}
		try {
			class30.testMalformedXMLRootElement3();
		}
		catch (java.lang.Exception err129) {
			err129.printStackTrace();
		}
		try {
			class30.testMalformedXMLRootElement4();
		}
		catch (java.lang.Exception err130) {
			err130.printStackTrace();
		}
		try {
			class30.testMalformedXMLRootElement5();
		}
		catch (java.lang.Exception err131) {
			err131.printStackTrace();
		}
		org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest class31 = new org.codehaus.plexus.util.xml.PrettyPrintXMLWriterTest();
		class31.testDefaultPrettyPrintXMLWriter();
		class31.testPrettyPrintXMLWriterWithGivenLineSeparator();
		class31.testPrettyPrintXMLWriterWithGivenLineIndenter();
		class31.testEscapeXmlAttribute();
		class31.testendElementAlreadyClosed();
		try {
			class31.testIssue51DetectJava7ConcatenationBug();
		}
		catch (java.io.IOException err132) {
			err132.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomBuilderTest class32 = new org.codehaus.plexus.util.xml.Xpp3DomBuilderTest();
		try {
			class32.testBuildFromReader();
		}
		catch (java.lang.Exception err133) {
			err133.printStackTrace();
		}
		try {
			class32.testBuildTrimming();
		}
		catch (java.lang.Exception err134) {
			err134.printStackTrace();
		}
		try {
			class32.testBuildFromXpp3Dom();
		}
		catch (java.lang.Exception err135) {
			err135.printStackTrace();
		}
		class32.testUnclosedXml();
		try {
			class32.testEscapingInContent();
		}
		catch (java.io.IOException err136) {
			err136.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err137) {
			err137.printStackTrace();
		}
		try {
			class32.testEscapingInAttributes();
		}
		catch (java.io.IOException err138) {
			err138.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err139) {
			err139.printStackTrace();
		}
		try {
			class32.testInputLocationTracking();
		}
		catch (java.io.IOException err140) {
			err140.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err141) {
			err141.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomTest class33 = new org.codehaus.plexus.util.xml.Xpp3DomTest();
		class33.testShouldPerformAppendAtFirstSubElementLevel();
		class33.testShouldOverrideAppendAndDeepMerge();
		class33.testShouldPerformSelfOverrideAtTopLevel();
		class33.testShouldMergeValuesAtTopLevelByDefault();
		class33.testShouldMergeValuesAtTopLevel();
		class33.testNullAttributeNameOrValue();
		class33.testEquals();
		try {
			class33.testEqualsIsNullSafe();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err142) {
			err142.printStackTrace();
		}
		catch (java.io.IOException err143) {
			err143.printStackTrace();
		}
		try {
			class33.testShouldOverwritePluginConfigurationSubItemsByDefault();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err144) {
			err144.printStackTrace();
		}
		catch (java.io.IOException err145) {
			err145.printStackTrace();
		}
		try {
			class33.testShouldMergePluginConfigurationSubItemsWithMergeAttributeSet();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err146) {
			err146.printStackTrace();
		}
		catch (java.io.IOException err147) {
			err147.printStackTrace();
		}
		try {
			class33.testShouldNotChangeUponMergeWithItselfWhenFirstOrLastSubItemIsEmpty();
		}
		catch (java.lang.Exception err148) {
			err148.printStackTrace();
		}
		try {
			class33.testShouldCopyRecessiveChildrenNotPresentInTarget();
		}
		catch (java.lang.Exception err149) {
			err149.printStackTrace();
		}
		try {
			class33.testDupeChildren();
		}
		catch (java.io.IOException err150) {
			err150.printStackTrace();
		}
		catch (org.codehaus.plexus.util.xml.pull.XmlPullParserException err151) {
			err151.printStackTrace();
		}
		org.codehaus.plexus.util.xml.Xpp3DomUtilsTest class34 = new org.codehaus.plexus.util.xml.Xpp3DomUtilsTest();
		try {
			class34.testCombineId();
		}
		catch (java.lang.Exception err152) {
			err152.printStackTrace();
		}
		org.codehaus.plexus.util.xml.XmlWriterUtilTest class35 = new org.codehaus.plexus.util.xml.XmlWriterUtilTest();
		try {
			class35.testWriteLineBreakXMLWriter();
		}
		catch (java.lang.Exception err153) {
			err153.printStackTrace();
		}
		try {
			class35.testWriteLineBreakXMLWriterInt();
		}
		catch (java.lang.Exception err154) {
			err154.printStackTrace();
		}
		try {
			class35.testWriteLineBreakXMLWriterIntInt();
		}
		catch (java.lang.Exception err155) {
			err155.printStackTrace();
		}
		try {
			class35.testWriteLineBreakXMLWriterIntIntInt();
		}
		catch (java.lang.Exception err156) {
			err156.printStackTrace();
		}
		try {
			class35.testWriteCommentLineBreakXMLWriter();
		}
		catch (java.lang.Exception err157) {
			err157.printStackTrace();
		}
		try {
			class35.testWriteCommentLineBreakXMLWriterInt();
		}
		catch (java.lang.Exception err158) {
			err158.printStackTrace();
		}
		try {
			class35.testWriteCommentXMLWriterString();
		}
		catch (java.lang.Exception err159) {
			err159.printStackTrace();
		}
		try {
			class35.testWriteCommentXMLWriterStringInt();
		}
		catch (java.lang.Exception err160) {
			err160.printStackTrace();
		}
		try {
			class35.testWriteCommentXMLWriterStringIntInt();
		}
		catch (java.lang.Exception err161) {
			err161.printStackTrace();
		}
		try {
			class35.testWriteCommentXMLWriterStringIntIntInt();
		}
		catch (java.lang.Exception err162) {
			err162.printStackTrace();
		}
		try {
			class35.testWriteCommentTextXMLWriterStringInt();
		}
		catch (java.lang.Exception err163) {
			err163.printStackTrace();
		}
		try {
			class35.testWriteCommentTextXMLWriterStringIntInt();
		}
		catch (java.lang.Exception err164) {
			err164.printStackTrace();
		}
		try {
			class35.testWriteCommentTextXMLWriterStringIntIntInt();
		}
		catch (java.lang.Exception err165) {
			err165.printStackTrace();
		}
		try {
			class35.testWriteCommentNull();
		}
		catch (java.lang.Exception err166) {
			err166.printStackTrace();
		}
		try {
			class35.testWriteCommentShort();
		}
		catch (java.lang.Exception err167) {
			err167.printStackTrace();
		}
		try {
			class35.testWriteCommentLong();
		}
		catch (java.lang.Exception err168) {
			err168.printStackTrace();
		}
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B3 class36 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B3();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B3 class37 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B3();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B1 class38 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B1();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType class39 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType class40 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B2 class41 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B2();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B1 class42 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_jmhType_B1();
		org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B2 class43 = new org.codehaus.plexus.util.xml.generated.Xpp3DomPerfTest_AdditionState_jmhType_B2();
		org.codehaus.plexus.util.PathToolTest class44 = new org.codehaus.plexus.util.PathToolTest();
		try {
			class44.testGetRelativePath();
		}
		catch (java.lang.Exception err169) {
			err169.printStackTrace();
		}
		try {
			class44.testGetDirectoryComponent();
		}
		catch (java.lang.Exception err170) {
			err170.printStackTrace();
		}
		try {
			class44.testCalculateLink();
		}
		catch (java.lang.Exception err171) {
			err171.printStackTrace();
		}
		try {
			class44.testGetRelativeWebPath();
		}
		catch (java.lang.Exception err172) {
			err172.printStackTrace();
		}
		try {
			class44.testGetRelativeFilePath();
		}
		catch (java.lang.Exception err173) {
			err173.printStackTrace();
		}
		org.codehaus.plexus.util.DirectoryWalkerTest class45 = new org.codehaus.plexus.util.DirectoryWalkerTest();
		class45.testDirectoryWalk();
		org.codehaus.plexus.util.reflection.ReflectorTest class46 = new org.codehaus.plexus.util.reflection.ReflectorTest();
		try {
			class46.testObjectPropertyFromName();
		}
		catch (java.lang.Exception err174) {
			err174.printStackTrace();
		}
		try {
			class46.testObjectPropertyFromBean();
		}
		catch (java.lang.Exception err175) {
			err175.printStackTrace();
		}
		try {
			class46.testObjectPropertyFromField();
		}
		catch (java.lang.Exception err176) {
			err176.printStackTrace();
		}
	}
}