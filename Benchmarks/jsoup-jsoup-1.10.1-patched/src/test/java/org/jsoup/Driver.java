package org.jsoup;

public class Driver {
	public static void main(String[] argv) {
		org.jsoup.TextUtil class1 = new org.jsoup.TextUtil();
		org.jsoup.nodes.DocumentTypeTest class2 = new org.jsoup.nodes.DocumentTypeTest();
		class2.constructorValidationOkWithBlankName();
		class2.constructorValidationThrowsExceptionOnNulls();
		class2.constructorValidationOkWithBlankPublicAndSystemIds();
		class2.outerHtmlGeneration();
		org.jsoup.nodes.EntitiesTest class3 = new org.jsoup.nodes.EntitiesTest();
		class3.escape();
		class3.escapedSupplemtary();
		class3.unescapeMultiChars();
		class3.xhtml();
		class3.getByName();
		class3.escapeSupplementaryCharacter();
		class3.notMissingMultis();
		class3.notMissingSupplementals();
		class3.unescape();
		class3.strictUnescape();
		class3.caseSensitive();
		class3.quoteReplacements();
		class3.letterDigitEntities();
		class3.noSpuriousDecodes();
		class3.escapesGtInXmlAttributesButNotInHtml();
		org.jsoup.nodes.AttributeTest class4 = new org.jsoup.nodes.AttributeTest();
		class4.html();
		class4.testWithSupplementaryCharacterInAttributeKeyAndValue();
		org.jsoup.nodes.FormElementTest class5 = new org.jsoup.nodes.FormElementTest();
		class5.hasAssociatedControls();
		class5.createsFormData();
		class5.createsSubmitableConnection();
		class5.actionWithNoValue();
		class5.actionWithNoBaseUri();
		class5.formsAddedAfterParseAreFormElements();
		class5.controlsAddedAfterParseAreLinkedWithForms();
		class5.usesOnForCheckboxValueIfNoValueSet();
		class5.adoptedFormsRetainInputs();
		org.jsoup.nodes.ElementTest class6 = new org.jsoup.nodes.ElementTest();
		class6.getElementsByTagName();
		class6.getNamespacedElementsByTag();
		class6.testGetElementById();
		class6.testGetText();
		class6.testGetChildText();
		class6.testNormalisesText();
		class6.testKeepsPreText();
		class6.testKeepsPreTextInCode();
		class6.testBrHasSpace();
		class6.testGetSiblings();
		class6.testGetSiblingsWithDuplicateContent();
		class6.testGetParents();
		class6.testElementSiblingIndex();
		class6.testElementSiblingIndexSameContent();
		class6.testGetElementsWithClass();
		class6.testGetElementsWithAttribute();
		class6.testGetElementsWithAttributeDash();
		class6.testGetElementsWithAttributeValue();
		class6.testClassDomMethods();
		class6.testHasClassDomMethods();
		class6.testClassUpdates();
		class6.testOuterHtml();
		class6.testInnerHtml();
		class6.testFormatHtml();
		class6.testFormatOutline();
		class6.testSetIndent();
		class6.testNotPretty();
		class6.testEmptyElementFormatHtml();
		class6.testNoIndentOnScriptAndStyle();
		class6.testContainerOutput();
		class6.testSetText();
		class6.testAddNewElement();
		class6.testAddBooleanAttribute();
		class6.testAppendRowToTable();
		class6.testPrependRowToTable();
		class6.testPrependElement();
		class6.testAddNewText();
		class6.testPrependText();
		class6.testThrowsOnAddNullText();
		class6.testThrowsOnPrependNullText();
		class6.testAddNewHtml();
		class6.testPrependNewHtml();
		class6.testSetHtml();
		class6.testSetHtmlTitle();
		class6.testWrap();
		class6.before();
		class6.after();
		class6.testWrapWithRemainder();
		class6.testHasText();
		class6.dataset();
		class6.parentlessToString();
		class6.testClone();
		class6.testClonesClassnames();
		class6.testTagNameSet();
		class6.testHtmlContainsOuter();
		class6.testGetTextNodes();
		class6.testManipulateTextNodes();
		class6.testGetDataNodes();
		class6.elementIsNotASiblingOfItself();
		class6.testChildThrowsIndexOutOfBoundsOnMissing();
		class6.moveByAppend();
		class6.insertChildrenArgumentValidation();
		class6.insertChildrenAtPosition();
		class6.insertChildrenAsCopy();
		class6.testCssPath();
		class6.testClassNames();
		class6.testHashAndEqualsAndValue();
		class6.testRelativeUrls();
		class6.appendMustCorrectlyMoveChildrenInsideOneParentElement();
		class6.testHashcodeIsStableWithContentChanges();
		class6.testNamespacedElements();
		org.jsoup.nodes.NodeTest class7 = new org.jsoup.nodes.NodeTest();
		class7.handlesBaseUri();
		class7.setBaseUriIsRecursive();
		class7.handlesAbsPrefix();
		class7.handlesAbsOnImage();
		class7.handlesAbsPrefixOnHasAttr();
		class7.literalAbsPrefix();
		class7.handleAbsOnFileUris();
		class7.handleAbsOnLocalhostFileUris();
		class7.handlesAbsOnProtocolessAbsoluteUris();
		class7.absHandlesRelativeQuery();
		class7.absHandlesDotFromIndex();
		class7.testRemove();
		class7.testReplace();
		class7.ownerDocument();
		class7.before();
		class7.after();
		class7.unwrap();
		class7.unwrapNoChildren();
		class7.traverse();
		class7.orphanNodeReturnsNullForSiblingElements();
		class7.nodeIsNotASiblingOfItself();
		class7.childNodesCopy();
		class7.supportsClone();
		org.jsoup.nodes.DocumentTest class8 = new org.jsoup.nodes.DocumentTest();
		class8.setTextPreservesDocumentStructure();
		class8.testTitles();
		class8.testOutputEncoding();
		class8.testXhtmlReferences();
		class8.testNormalisesStructure();
		class8.testClone();
		class8.testClonesDeclarations();
		try {
			class8.testLocation();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		class8.testHtmlAndXmlSyntax();
		class8.htmlParseDefaultsToHtmlOutputSyntax();
		class8.testHtmlAppendable();
		class8.testOverflowClone();
		try {
			class8.DocumentsWithSameContentAreEqual();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class8.DocumentsWithSameContentAreVerifialbe();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class8.testMetaCharsetUpdateUtf8();
		class8.testMetaCharsetUpdateIso8859();
		class8.testMetaCharsetUpdateNoCharset();
		class8.testMetaCharsetUpdateDisabled();
		class8.testMetaCharsetUpdateDisabledNoChanges();
		class8.testMetaCharsetUpdateEnabledAfterCharsetChange();
		class8.testMetaCharsetUpdateCleanup();
		class8.testMetaCharsetUpdateXmlUtf8();
		class8.testMetaCharsetUpdateXmlIso8859();
		class8.testMetaCharsetUpdateXmlNoCharset();
		class8.testMetaCharsetUpdateXmlDisabled();
		class8.testMetaCharsetUpdateXmlDisabledNoChanges();
		class8.testMetaCharsetUpdatedDisabledPerDefault();
		try {
			class8.testShiftJisRoundtrip();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.jsoup.nodes.AttributesTest class9 = new org.jsoup.nodes.AttributesTest();
		class9.html();
		class9.testIteratorRemovable();
		class9.testIterator();
		class9.testIteratorEmpty();
		org.jsoup.nodes.TextNodeTest class10 = new org.jsoup.nodes.TextNodeTest();
		class10.testBlank();
		class10.testTextBean();
		class10.testSplitText();
		class10.testSplitAnEmbolden();
		class10.testWithSupplementaryCharacter();
		org.jsoup.integration.UrlConnectTest class11 = new org.jsoup.integration.UrlConnectTest();
		try {
			class11.fetchURl();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class11.fetchURIWithWihtespace();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class11.fetchBaidu();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		class11.exceptOnUnknownContentType();
		class11.exceptOnUnsupportedProtocol();
		try {
			class11.ignoresContentTypeIfSoConfigured();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class11.doesPost();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class11.sendsRequestBodyJsonWithData();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class11.sendsRequestBodyJsonWithoutData();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class11.sendsRequestBody();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class11.sendsRequestBodyWithUrlParams();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class11.doesGet();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		try {
			class11.doesPut();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		try {
			class11.followsTempRedirect();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		try {
			class11.followsNewTempRedirect();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class11.postRedirectsFetchWithGet();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		try {
			class11.followsRedirectToHttps();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		try {
			class11.followsRelativeRedirect();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		try {
			class11.followsRelativeDotRedirect();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		try {
			class11.followsRelativeDotRedirect2();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		try {
			class11.followsRedirectsWithWithespaces();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		try {
			class11.gracefullyHandleBrokenLocationRedirect();
		}
		catch (java.io.IOException err24) {
			err24.printStackTrace();
		}
		class11.throwsExceptionOnError();
		try {
			class11.ignoresExceptionIfSoConfigured();
		}
		catch (java.io.IOException err25) {
			err25.printStackTrace();
		}
		try {
			class11.ignores500tExceptionIfSoConfigured();
		}
		catch (java.io.IOException err26) {
			err26.printStackTrace();
		}
		try {
			class11.ignores500WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err27) {
			err27.printStackTrace();
		}
		try {
			class11.ignores200WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err28) {
			err28.printStackTrace();
		}
		try {
			class11.handles200WithNoContent();
		}
		catch (java.io.IOException err29) {
			err29.printStackTrace();
		}
		try {
			class11.doesntRedirectIfSoConfigured();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class11.redirectsResponseCookieToNextResponse();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		class11.maximumRedirects();
		try {
			class11.multiCookieSet();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class11.handlesDodgyCharset();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class11.maxBodySize();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class11.testUnsafeFail();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class11.testSNIFail();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class11.testSNIPass();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class11.testUnsafePass();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class11.shouldWorkForCharsetInExtraAttribute();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class11.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class11.shouldParseBrokenHtml5MetaCharsetTagCorrectly();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class11.shouldEmptyMetaCharsetCorrectly();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class11.shouldWorkForDuplicateCharsetInTag();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class11.baseHrefCorrectAfterHttpEquiv();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class11.postHtmlFile();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class11.postJpeg();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class11.handles201Created();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class11.fetchToW3c();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class11.fetchHandlesXml();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class11.fetchHandlesXmlAsHtmlWhenParserSet();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class11.combinesSameHeadersWithComma();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class11.sendHeadRequest();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class11.fetchViaHttpProxy();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		try {
			class11.fetchViaHttpProxySetByArgument();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class11.invalidProxyFails();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class11.proxyGetAndSet();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class11.throwsIfRequestBodyForGet();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class11.canSpecifyResponseCharset();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		org.jsoup.integration.ParseTest class12 = new org.jsoup.integration.ParseTest();
		try {
			class12.testSmhBizArticle();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class12.testNewsHomepage();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class12.testGoogleSearchIpod();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class12.testBinary();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class12.testYahooJp();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		try {
			class12.testBaidu();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class12.testBaiduVariant();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		try {
			class12.testHtml5Charset();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		try {
			class12.testBrokenHtml5CharsetWithASingleDoubleQuote();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class12.testNytArticle();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class12.testYahooArticle();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		org.jsoup.integration.Benchmark class13 = new org.jsoup.integration.Benchmark();
		org.jsoup.safety.CleanerTest class14 = new org.jsoup.safety.CleanerTest();
		class14.simpleBehaviourTest();
		class14.simpleBehaviourTest2();
		class14.basicBehaviourTest();
		class14.basicWithImagesTest();
		class14.testRelaxed();
		class14.testRemoveTags();
		class14.testRemoveAttributes();
		class14.testRemoveEnforcedAttributes();
		class14.testRemoveProtocols();
		class14.testDropComments();
		class14.testDropXmlProc();
		class14.testDropScript();
		class14.testDropImageScript();
		class14.testCleanJavascriptHref();
		class14.testCleanAnchorProtocol();
		class14.testDropsUnknownTags();
		class14.testHandlesEmptyAttributes();
		class14.testIsValid();
		class14.resolvesRelativeLinks();
		class14.preservesRelativeLinksIfConfigured();
		class14.dropsUnresolvableRelativeLinks();
		class14.handlesCustomProtocols();
		class14.handlesAllPseudoTag();
		class14.addsTagOnAttributesIfNotSet();
		class14.supplyOutputSettings();
		class14.handlesFramesets();
		class14.cleansInternationalText();
		class14.testScriptTagInWhiteList();
		org.jsoup.select.SelectorTest class15 = new org.jsoup.select.SelectorTest();
		class15.testByTag();
		class15.testById();
		class15.testByClass();
		class15.testByAttribute();
		class15.testNamespacedTag();
		class15.testWildcardNamespacedTag();
		class15.testByAttributeStarting();
		class15.testByAttributeRegex();
		class15.testByAttributeRegexCharacterClass();
		class15.testByAttributeRegexCombined();
		class15.testCombinedWithContains();
		class15.testAllElements();
		class15.testAllWithClass();
		class15.testGroupOr();
		class15.testGroupOrAttribute();
		class15.descendant();
		class15.and();
		class15.deeperDescendant();
		class15.parentChildElement();
		class15.parentWithClassChild();
		class15.parentChildStar();
		class15.multiChildDescent();
		class15.caseInsensitive();
		class15.adjacentSiblings();
		class15.adjacentSiblingsWithId();
		class15.notAdjacent();
		class15.mixCombinator();
		class15.mixCombinatorGroup();
		class15.generalSiblings();
		class15.testCharactersInIdAndClass();
		class15.testSupportsLeadingCombinator();
		class15.testPseudoLessThan();
		class15.testPseudoGreaterThan();
		class15.testPseudoEquals();
		class15.testPseudoBetween();
		class15.testPseudoCombined();
		class15.testPseudoHas();
		class15.testNestedHas();
		class15.testPseudoContains();
		class15.testPsuedoContainsWithParentheses();
		class15.containsOwn();
		class15.testMatches();
		class15.matchesOwn();
		class15.testRelaxedTags();
		class15.notParas();
		class15.notAll();
		class15.notClass();
		class15.handlesCommasInSelector();
		class15.selectSupplementaryCharacter();
		class15.selectClassWithSpace();
		class15.selectSameElements();
		class15.attributeWithBrackets();
		org.jsoup.select.ElementsTest class16 = new org.jsoup.select.ElementsTest();
		class16.filter();
		class16.attributes();
		class16.hasAttr();
		class16.hasAbsAttr();
		class16.attr();
		class16.absAttr();
		class16.classes();
		class16.text();
		class16.hasText();
		class16.html();
		class16.outerHtml();
		class16.setHtml();
		class16.val();
		class16.before();
		class16.after();
		class16.wrap();
		class16.wrapDiv();
		class16.unwrap();
		class16.unwrapP();
		class16.unwrapKeepsSpace();
		class16.empty();
		class16.remove();
		class16.eq();
		class16.is();
		class16.parents();
		class16.not();
		class16.tagNameSet();
		class16.traverse();
		class16.forms();
		class16.classWithHyphen();
		org.jsoup.select.CssTest class17 = new org.jsoup.select.CssTest();
		class17.firstChild();
		class17.lastChild();
		class17.nthChild_simple();
		class17.nthOfType_unknownTag();
		class17.nthLastChild_simple();
		class17.nthOfType_simple();
		class17.nthLastOfType_simple();
		class17.nthChild_advanced();
		class17.nthOfType_advanced();
		class17.nthLastChild_advanced();
		class17.nthLastOfType_advanced();
		class17.firstOfType();
		class17.lastOfType();
		class17.empty();
		class17.onlyChild();
		class17.onlyOfType();
		class17.root();
		org.jsoup.select.QueryParserTest class18 = new org.jsoup.select.QueryParserTest();
		class18.testOrGetsCorrectPrecedence();
		class18.testParsesMultiCorrectly();
		org.jsoup.helper.HttpConnectionTest class19 = new org.jsoup.helper.HttpConnectionTest();
		try {
			class19.throwsExceptionOnParseWithoutExecute();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class19.throwsExceptionOnBodyWithoutExecute();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class19.throwsExceptionOnBodyAsBytesWithoutExecute();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		class19.caseInsensitiveHeaders();
		class19.headers();
		class19.sameHeadersCombineWithComma();
		class19.ignoresEmptySetCookies();
		class19.ignoresEmptyCookieNameAndVals();
		try {
			class19.connectWithUrl();
		}
		catch (java.net.MalformedURLException err73) {
			err73.printStackTrace();
		}
		class19.throwsOnMalformedUrl();
		class19.userAgent();
		class19.timeout();
		class19.referrer();
		class19.method();
		class19.throwsOnOdddData();
		class19.data();
		class19.cookie();
		class19.inputStream();
		class19.requestBody();
		org.jsoup.helper.StringUtilTest class20 = new org.jsoup.helper.StringUtilTest();
		class20.join();
		class20.padding();
		class20.isBlank();
		class20.isNumeric();
		class20.isWhitespace();
		class20.normaliseWhiteSpace();
		class20.normaliseWhiteSpaceHandlesHighSurrogates();
		class20.resolvesRelativeUrls();
		org.jsoup.helper.W3CDomTest class21 = new org.jsoup.helper.W3CDomTest();
		class21.simpleConversion();
		try {
			class21.convertsGoogle();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class21.namespacePreservation();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		class21.handlesInvalidAttributeNames();
		org.jsoup.helper.DataUtilTest class22 = new org.jsoup.helper.DataUtilTest();
		class22.testCharset();
		class22.testQuotedCharset();
		class22.discardsSpuriousByteOrderMark();
		class22.discardsSpuriousByteOrderMarkWhenNoCharsetSet();
		class22.shouldNotThrowExceptionOnEmptyCharset();
		class22.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		class22.shouldCorrectCharsetForDuplicateCharsetString();
		class22.shouldReturnNullForIllegalCharsetNames();
		class22.generatesMimeBoundaries();
		class22.wrongMetaCharsetFallback();
		try {
			class22.supportsBOMinFiles();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		org.jsoup.parser.ParserSettingsTest class23 = new org.jsoup.parser.ParserSettingsTest();
		class23.caseSupport();
		org.jsoup.parser.CharacterReaderTest class24 = new org.jsoup.parser.CharacterReaderTest();
		class24.consume();
		class24.unconsume();
		class24.mark();
		class24.consumeToEnd();
		class24.nextIndexOfChar();
		class24.nextIndexOfString();
		class24.nextIndexOfUnmatched();
		class24.consumeToChar();
		class24.consumeToString();
		class24.advance();
		class24.consumeToAny();
		class24.consumeLetterSequence();
		class24.consumeLetterThenDigitSequence();
		class24.matches();
		class24.matchesIgnoreCase();
		class24.containsIgnoreCase();
		class24.matchesAny();
		class24.cachesStrings();
		class24.rangeEquals();
		org.jsoup.parser.HtmlParserTest class25 = new org.jsoup.parser.HtmlParserTest();
		class25.parsesSimpleDocument();
		class25.parsesRoughAttributes();
		class25.parsesQuiteRoughAttributes();
		class25.parsesComments();
		class25.parsesUnterminatedComments();
		class25.dropsUnterminatedTag();
		class25.dropsUnterminatedAttribute();
		class25.parsesUnterminatedTextarea();
		class25.parsesUnterminatedOption();
		class25.testSpaceAfterTag();
		class25.createsDocumentStructure();
		class25.createsStructureFromBodySnippet();
		class25.handlesEscapedData();
		class25.handlesDataOnlyTags();
		class25.handlesTextAfterData();
		class25.handlesTextArea();
		class25.preservesSpaceInTextArea();
		class25.preservesSpaceInScript();
		class25.doesNotCreateImplicitLists();
		class25.discardsNakedTds();
		class25.handlesNestedImplicitTable();
		class25.handlesWhatWgExpensesTableExample();
		class25.handlesTbodyTable();
		class25.handlesImplicitCaptionClose();
		class25.noTableDirectInTable();
		class25.ignoresDupeEndTrTag();
		class25.handlesBaseTags();
		class25.handlesProtocolRelativeUrl();
		class25.handlesCdata();
		class25.handlesUnclosedCdataAtEOF();
		class25.handlesInvalidStartTags();
		class25.handlesUnknownTags();
		class25.handlesUnknownInlineTags();
		class25.parsesBodyFragment();
		class25.handlesUnknownNamespaceTags();
		class25.handlesKnownEmptyBlocks();
		class25.handlesSolidusAtAttributeEnd();
		class25.handlesMultiClosingBody();
		class25.handlesUnclosedDefinitionLists();
		class25.handlesBlocksInDefinitions();
		class25.handlesFrames();
		class25.ignoresContentAfterFrameset();
		class25.handlesJavadocFont();
		class25.handlesBaseWithoutHref();
		class25.normalisesDocument();
		class25.normalisesEmptyDocument();
		class25.normalisesHeadlessBody();
		class25.normalisedBodyAfterContent();
		class25.findsCharsetInMalformedMeta();
		class25.testHgroup();
		class25.testRelaxedTags();
		class25.testHeaderContents();
		class25.testSpanContents();
		class25.testNoImagesInNoScriptInHead();
		class25.testAFlowContents();
		class25.testFontFlowContents();
		class25.handlesMisnestedTagsBI();
		class25.handlesMisnestedTagsBP();
		class25.handlesUnexpectedMarkupInTables();
		class25.handlesUnclosedFormattingElements();
		class25.handlesUnclosedAnchors();
		class25.reconstructFormattingElements();
		class25.reconstructFormattingElementsInTable();
		class25.commentBeforeHtml();
		class25.emptyTdTag();
		class25.handlesSolidusInA();
		class25.handlesSpanInTbody();
		class25.handlesUnclosedTitleAtEof();
		class25.handlesUnclosedTitle();
		class25.handlesUnclosedScriptAtEof();
		class25.handlesUnclosedRawtextAtEof();
		class25.noImplicitFormForTextAreas();
		class25.handlesEscapedScript();
		class25.handles0CharacterAsText();
		class25.handlesNullInData();
		class25.handlesNullInComments();
		class25.handlesNewlinesAndWhitespaceInTag();
		class25.handlesWhitespaceInoDocType();
		class25.tracksErrorsWhenRequested();
		class25.tracksLimitedErrorsWhenRequested();
		class25.noErrorsByDefault();
		class25.handlesCommentsInTable();
		class25.handlesQuotesInCommentsInScripts();
		class25.handleNullContextInParseFragment();
		class25.doesNotFindShortestMatchingEntity();
		class25.relaxedBaseEntityMatchAndStrictExtendedMatch();
		class25.handlesXmlDeclarationAsBogusComment();
		class25.handlesTagsInTextarea();
		class25.createsFormElements();
		class25.associatedFormControlsWithDisjointForms();
		class25.handlesInputInTable();
		class25.convertsImageToImg();
		class25.handlesInvalidDoctypes();
		class25.handlesManyChildren();
		try {
			class25.testInvalidTableContents();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		class25.testNormalisesIsIndex();
		class25.testReinsertionModeForThCelss();
		class25.testUsingSingleQuotesInQueries();
		class25.testSupportsNonAsciiTags();
		class25.testSupportsPartiallyNonAsciiTags();
		class25.testFragment();
		class25.testHtmlLowerCase();
		class25.canPreserveTagCase();
		class25.canPreserveAttributeCase();
		class25.canPreserveBothCase();
		org.jsoup.parser.XmlTreeBuilderTest class26 = new org.jsoup.parser.XmlTreeBuilderTest();
		class26.testSimpleXmlParse();
		class26.testPopToClose();
		class26.testCommentAndDocType();
		class26.testSupplyParserToJsoupClass();
		try {
			class26.testSupplyParserToConnection();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class26.testSupplyParserToDataStream();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		catch (java.net.URISyntaxException err80) {
			err80.printStackTrace();
		}
		class26.testDoesNotForceSelfClosingKnownTags();
		class26.handlesXmlDeclarationAsDeclaration();
		class26.xmlFragment();
		class26.xmlParseDefaultsToHtmlOutputSyntax();
		class26.testDoesHandleEOFInTag();
		try {
			class26.testDetectCharsetEncodingDeclaration();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		catch (java.net.URISyntaxException err82) {
			err82.printStackTrace();
		}
		class26.testParseDeclarationAttributes();
		class26.caseSensitiveDeclaration();
		class26.testCreatesValidProlog();
		class26.preservesCaseByDefault();
		class26.canNormalizeCase();
		org.jsoup.parser.TagTest class27 = new org.jsoup.parser.TagTest();
		class27.isCaseSensitive();
		class27.canBeInsensitive();
		class27.trims();
		class27.equality();
		class27.divSemantics();
		class27.pSemantics();
		class27.imgSemantics();
		class27.defaultSemantics();
		class27.valueOfChecksNotNull();
		class27.valueOfChecksNotEmpty();
		org.jsoup.parser.TokenQueueTest class28 = new org.jsoup.parser.TokenQueueTest();
		class28.chompBalanced();
		class28.chompEscapedBalanced();
		class28.chompBalancedMatchesAsMuchAsPossible();
		class28.unescape();
		class28.chompToIgnoreCase();
		class28.addFirst();
		org.jsoup.parser.AttributeParseTest class29 = new org.jsoup.parser.AttributeParseTest();
		class29.parsesRoughAttributeString();
		class29.handlesNewLinesAndReturns();
		class29.parsesEmptyString();
		class29.canStartWithEq();
		class29.strictAttributeUnescapes();
		class29.moreAttributeUnescapes();
		class29.parsesBooleanAttributes();
		class29.dropsSlashFromAttributeName();
	}
}