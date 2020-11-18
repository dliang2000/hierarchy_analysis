package org.jsoup;

public class Driver {
	public static void main(String[] argv) {
		org.jsoup.nodes.DocumentTypeTest class1 = new org.jsoup.nodes.DocumentTypeTest();
		class1.constructorValidationOkWithBlankName();
		class1.constructorValidationThrowsExceptionOnNulls();
		class1.constructorValidationOkWithBlankPublicAndSystemIds();
		class1.outerHtmlGeneration();
		org.jsoup.nodes.EntitiesTest class2 = new org.jsoup.nodes.EntitiesTest();
		class2.escape();
		class2.escapedSupplemtary();
		class2.unescapeMultiChars();
		class2.xhtml();
		class2.getByName();
		class2.escapeSupplementaryCharacter();
		class2.notMissingMultis();
		class2.notMissingSupplementals();
		class2.unescape();
		class2.strictUnescape();
		class2.caseSensitive();
		class2.quoteReplacements();
		class2.letterDigitEntities();
		class2.noSpuriousDecodes();
		class2.escapesGtInXmlAttributesButNotInHtml();
		org.jsoup.nodes.AttributeTest class3 = new org.jsoup.nodes.AttributeTest();
		class3.html();
		class3.testWithSupplementaryCharacterInAttributeKeyAndValue();
		org.jsoup.nodes.FormElementTest class4 = new org.jsoup.nodes.FormElementTest();
		class4.hasAssociatedControls();
		class4.createsFormData();
		class4.createsSubmitableConnection();
		class4.actionWithNoValue();
		class4.actionWithNoBaseUri();
		class4.formsAddedAfterParseAreFormElements();
		class4.controlsAddedAfterParseAreLinkedWithForms();
		class4.usesOnForCheckboxValueIfNoValueSet();
		class4.adoptedFormsRetainInputs();
		org.jsoup.nodes.ElementTest class5 = new org.jsoup.nodes.ElementTest();
		class5.getElementsByTagName();
		class5.getNamespacedElementsByTag();
		class5.testGetElementById();
		class5.testGetText();
		class5.testGetChildText();
		class5.testNormalisesText();
		class5.testKeepsPreText();
		class5.testKeepsPreTextInCode();
		class5.testBrHasSpace();
		class5.testGetSiblings();
		class5.testGetSiblingsWithDuplicateContent();
		class5.testGetParents();
		class5.testElementSiblingIndex();
		class5.testElementSiblingIndexSameContent();
		class5.testGetElementsWithClass();
		class5.testGetElementsWithAttribute();
		class5.testGetElementsWithAttributeDash();
		class5.testGetElementsWithAttributeValue();
		class5.testClassDomMethods();
		class5.testHasClassDomMethods();
		class5.testClassUpdates();
		class5.testOuterHtml();
		class5.testInnerHtml();
		class5.testFormatHtml();
		class5.testFormatOutline();
		class5.testSetIndent();
		class5.testNotPretty();
		class5.testEmptyElementFormatHtml();
		class5.testNoIndentOnScriptAndStyle();
		class5.testContainerOutput();
		class5.testSetText();
		class5.testAddNewElement();
		class5.testAddBooleanAttribute();
		class5.testAppendRowToTable();
		class5.testPrependRowToTable();
		class5.testPrependElement();
		class5.testAddNewText();
		class5.testPrependText();
		class5.testThrowsOnAddNullText();
		class5.testThrowsOnPrependNullText();
		class5.testAddNewHtml();
		class5.testPrependNewHtml();
		class5.testSetHtml();
		class5.testSetHtmlTitle();
		class5.testWrap();
		class5.before();
		class5.after();
		class5.testWrapWithRemainder();
		class5.testHasText();
		class5.dataset();
		class5.parentlessToString();
		class5.testClone();
		class5.testClonesClassnames();
		class5.testTagNameSet();
		class5.testHtmlContainsOuter();
		class5.testGetTextNodes();
		class5.testManipulateTextNodes();
		class5.testGetDataNodes();
		class5.elementIsNotASiblingOfItself();
		class5.testChildThrowsIndexOutOfBoundsOnMissing();
		class5.moveByAppend();
		class5.insertChildrenArgumentValidation();
		class5.insertChildrenAtPosition();
		class5.insertChildrenAsCopy();
		class5.testCssPath();
		class5.testClassNames();
		class5.testHashAndEqualsAndValue();
		class5.testRelativeUrls();
		class5.appendMustCorrectlyMoveChildrenInsideOneParentElement();
		class5.testHashcodeIsStableWithContentChanges();
		class5.testNamespacedElements();
		org.jsoup.nodes.NodeTest class6 = new org.jsoup.nodes.NodeTest();
		class6.handlesBaseUri();
		class6.setBaseUriIsRecursive();
		class6.handlesAbsPrefix();
		class6.handlesAbsOnImage();
		class6.handlesAbsPrefixOnHasAttr();
		class6.literalAbsPrefix();
		class6.handleAbsOnFileUris();
		class6.handleAbsOnLocalhostFileUris();
		class6.handlesAbsOnProtocolessAbsoluteUris();
		class6.absHandlesRelativeQuery();
		class6.absHandlesDotFromIndex();
		class6.testRemove();
		class6.testReplace();
		class6.ownerDocument();
		class6.before();
		class6.after();
		class6.unwrap();
		class6.unwrapNoChildren();
		class6.traverse();
		class6.orphanNodeReturnsNullForSiblingElements();
		class6.nodeIsNotASiblingOfItself();
		class6.childNodesCopy();
		class6.supportsClone();
		org.jsoup.nodes.DocumentTest class7 = new org.jsoup.nodes.DocumentTest();
		class7.setTextPreservesDocumentStructure();
		class7.testTitles();
		class7.testOutputEncoding();
		class7.testXhtmlReferences();
		class7.testNormalisesStructure();
		class7.testClone();
		class7.testClonesDeclarations();
		try {
			class7.testLocation();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		class7.testHtmlAndXmlSyntax();
		class7.htmlParseDefaultsToHtmlOutputSyntax();
		class7.testHtmlAppendable();
		class7.testOverflowClone();
		try {
			class7.DocumentsWithSameContentAreEqual();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class7.DocumentsWithSameContentAreVerifialbe();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class7.testMetaCharsetUpdateUtf8();
		class7.testMetaCharsetUpdateIso8859();
		class7.testMetaCharsetUpdateNoCharset();
		class7.testMetaCharsetUpdateDisabled();
		class7.testMetaCharsetUpdateDisabledNoChanges();
		class7.testMetaCharsetUpdateEnabledAfterCharsetChange();
		class7.testMetaCharsetUpdateCleanup();
		class7.testMetaCharsetUpdateXmlUtf8();
		class7.testMetaCharsetUpdateXmlIso8859();
		class7.testMetaCharsetUpdateXmlNoCharset();
		class7.testMetaCharsetUpdateXmlDisabled();
		class7.testMetaCharsetUpdateXmlDisabledNoChanges();
		class7.testMetaCharsetUpdatedDisabledPerDefault();
		try {
			class7.testShiftJisRoundtrip();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.jsoup.nodes.AttributesTest class8 = new org.jsoup.nodes.AttributesTest();
		class8.html();
		class8.testIteratorRemovable();
		class8.testIterator();
		class8.testIteratorEmpty();
		org.jsoup.nodes.TextNodeTest class9 = new org.jsoup.nodes.TextNodeTest();
		class9.testBlank();
		class9.testTextBean();
		class9.testSplitText();
		class9.testSplitAnEmbolden();
		class9.testWithSupplementaryCharacter();
		org.jsoup.integration.UrlConnectTest class10 = new org.jsoup.integration.UrlConnectTest();
		try {
			class10.fetchURl();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class10.fetchURIWithWihtespace();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class10.fetchBaidu();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		class10.exceptOnUnknownContentType();
		class10.exceptOnUnsupportedProtocol();
		try {
			class10.ignoresContentTypeIfSoConfigured();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class10.doesPost();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class10.sendsRequestBodyJsonWithData();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class10.sendsRequestBodyJsonWithoutData();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class10.sendsRequestBody();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class10.sendsRequestBodyWithUrlParams();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class10.doesGet();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		try {
			class10.doesPut();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		try {
			class10.followsTempRedirect();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		try {
			class10.followsNewTempRedirect();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class10.postRedirectsFetchWithGet();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		try {
			class10.followsRedirectToHttps();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		try {
			class10.followsRelativeRedirect();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		try {
			class10.followsRelativeDotRedirect();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		try {
			class10.followsRelativeDotRedirect2();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		try {
			class10.followsRedirectsWithWithespaces();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		try {
			class10.gracefullyHandleBrokenLocationRedirect();
		}
		catch (java.io.IOException err24) {
			err24.printStackTrace();
		}
		class10.throwsExceptionOnError();
		try {
			class10.ignoresExceptionIfSoConfigured();
		}
		catch (java.io.IOException err25) {
			err25.printStackTrace();
		}
		try {
			class10.ignores500tExceptionIfSoConfigured();
		}
		catch (java.io.IOException err26) {
			err26.printStackTrace();
		}
		try {
			class10.ignores500WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err27) {
			err27.printStackTrace();
		}
		try {
			class10.ignores200WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err28) {
			err28.printStackTrace();
		}
		try {
			class10.handles200WithNoContent();
		}
		catch (java.io.IOException err29) {
			err29.printStackTrace();
		}
		try {
			class10.doesntRedirectIfSoConfigured();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class10.redirectsResponseCookieToNextResponse();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		class10.maximumRedirects();
		try {
			class10.multiCookieSet();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class10.handlesDodgyCharset();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class10.maxBodySize();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class10.testUnsafeFail();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class10.testSNIFail();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class10.testSNIPass();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class10.testUnsafePass();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class10.shouldWorkForCharsetInExtraAttribute();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class10.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class10.shouldParseBrokenHtml5MetaCharsetTagCorrectly();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class10.shouldEmptyMetaCharsetCorrectly();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class10.shouldWorkForDuplicateCharsetInTag();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class10.baseHrefCorrectAfterHttpEquiv();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class10.postHtmlFile();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class10.postJpeg();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class10.handles201Created();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class10.fetchToW3c();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class10.fetchHandlesXml();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class10.fetchHandlesXmlAsHtmlWhenParserSet();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class10.combinesSameHeadersWithComma();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class10.sendHeadRequest();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class10.fetchViaHttpProxy();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		try {
			class10.fetchViaHttpProxySetByArgument();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class10.invalidProxyFails();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class10.proxyGetAndSet();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class10.throwsIfRequestBodyForGet();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class10.canSpecifyResponseCharset();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		org.jsoup.integration.ParseTest class11 = new org.jsoup.integration.ParseTest();
		try {
			class11.testSmhBizArticle();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class11.testNewsHomepage();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class11.testGoogleSearchIpod();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class11.testBinary();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class11.testYahooJp();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		try {
			class11.testBaidu();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class11.testBaiduVariant();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		try {
			class11.testHtml5Charset();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		try {
			class11.testBrokenHtml5CharsetWithASingleDoubleQuote();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class11.testNytArticle();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class11.testYahooArticle();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		org.jsoup.safety.CleanerTest class12 = new org.jsoup.safety.CleanerTest();
		class12.simpleBehaviourTest();
		class12.simpleBehaviourTest2();
		class12.basicBehaviourTest();
		class12.basicWithImagesTest();
		class12.testRelaxed();
		class12.testRemoveTags();
		class12.testRemoveAttributes();
		class12.testRemoveEnforcedAttributes();
		class12.testRemoveProtocols();
		class12.testDropComments();
		class12.testDropXmlProc();
		class12.testDropScript();
		class12.testDropImageScript();
		class12.testCleanJavascriptHref();
		class12.testCleanAnchorProtocol();
		class12.testDropsUnknownTags();
		class12.testHandlesEmptyAttributes();
		class12.testIsValid();
		class12.resolvesRelativeLinks();
		class12.preservesRelativeLinksIfConfigured();
		class12.dropsUnresolvableRelativeLinks();
		class12.handlesCustomProtocols();
		class12.handlesAllPseudoTag();
		class12.addsTagOnAttributesIfNotSet();
		class12.supplyOutputSettings();
		class12.handlesFramesets();
		class12.cleansInternationalText();
		class12.testScriptTagInWhiteList();
		org.jsoup.select.SelectorTest class13 = new org.jsoup.select.SelectorTest();
		class13.testByTag();
		class13.testById();
		class13.testByClass();
		class13.testByAttribute();
		class13.testNamespacedTag();
		class13.testWildcardNamespacedTag();
		class13.testByAttributeStarting();
		class13.testByAttributeRegex();
		class13.testByAttributeRegexCharacterClass();
		class13.testByAttributeRegexCombined();
		class13.testCombinedWithContains();
		class13.testAllElements();
		class13.testAllWithClass();
		class13.testGroupOr();
		class13.testGroupOrAttribute();
		class13.descendant();
		class13.and();
		class13.deeperDescendant();
		class13.parentChildElement();
		class13.parentWithClassChild();
		class13.parentChildStar();
		class13.multiChildDescent();
		class13.caseInsensitive();
		class13.adjacentSiblings();
		class13.adjacentSiblingsWithId();
		class13.notAdjacent();
		class13.mixCombinator();
		class13.mixCombinatorGroup();
		class13.generalSiblings();
		class13.testCharactersInIdAndClass();
		class13.testSupportsLeadingCombinator();
		class13.testPseudoLessThan();
		class13.testPseudoGreaterThan();
		class13.testPseudoEquals();
		class13.testPseudoBetween();
		class13.testPseudoCombined();
		class13.testPseudoHas();
		class13.testNestedHas();
		class13.testPseudoContains();
		class13.testPsuedoContainsWithParentheses();
		class13.containsOwn();
		class13.testMatches();
		class13.matchesOwn();
		class13.testRelaxedTags();
		class13.notParas();
		class13.notAll();
		class13.notClass();
		class13.handlesCommasInSelector();
		class13.selectSupplementaryCharacter();
		class13.selectClassWithSpace();
		class13.selectSameElements();
		class13.attributeWithBrackets();
		org.jsoup.select.ElementsTest class14 = new org.jsoup.select.ElementsTest();
		class14.filter();
		class14.attributes();
		class14.hasAttr();
		class14.hasAbsAttr();
		class14.attr();
		class14.absAttr();
		class14.classes();
		class14.text();
		class14.hasText();
		class14.html();
		class14.outerHtml();
		class14.setHtml();
		class14.val();
		class14.before();
		class14.after();
		class14.wrap();
		class14.wrapDiv();
		class14.unwrap();
		class14.unwrapP();
		class14.unwrapKeepsSpace();
		class14.empty();
		class14.remove();
		class14.eq();
		class14.is();
		class14.parents();
		class14.not();
		class14.tagNameSet();
		class14.traverse();
		class14.forms();
		class14.classWithHyphen();
		org.jsoup.select.CssTest class15 = new org.jsoup.select.CssTest();
		class15.firstChild();
		class15.lastChild();
		class15.nthChild_simple();
		class15.nthOfType_unknownTag();
		class15.nthLastChild_simple();
		class15.nthOfType_simple();
		class15.nthLastOfType_simple();
		class15.nthChild_advanced();
		class15.nthOfType_advanced();
		class15.nthLastChild_advanced();
		class15.nthLastOfType_advanced();
		class15.firstOfType();
		class15.lastOfType();
		class15.empty();
		class15.onlyChild();
		class15.onlyOfType();
		class15.root();
		org.jsoup.select.QueryParserTest class16 = new org.jsoup.select.QueryParserTest();
		class16.testOrGetsCorrectPrecedence();
		class16.testParsesMultiCorrectly();
		org.jsoup.helper.HttpConnectionTest class17 = new org.jsoup.helper.HttpConnectionTest();
		try {
			class17.throwsExceptionOnParseWithoutExecute();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class17.throwsExceptionOnBodyWithoutExecute();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class17.throwsExceptionOnBodyAsBytesWithoutExecute();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		class17.caseInsensitiveHeaders();
		class17.headers();
		class17.sameHeadersCombineWithComma();
		class17.ignoresEmptySetCookies();
		class17.ignoresEmptyCookieNameAndVals();
		try {
			class17.connectWithUrl();
		}
		catch (java.net.MalformedURLException err73) {
			err73.printStackTrace();
		}
		class17.throwsOnMalformedUrl();
		class17.userAgent();
		class17.timeout();
		class17.referrer();
		class17.method();
		class17.throwsOnOdddData();
		class17.data();
		class17.cookie();
		class17.inputStream();
		class17.requestBody();
		org.jsoup.helper.StringUtilTest class18 = new org.jsoup.helper.StringUtilTest();
		class18.join();
		class18.padding();
		class18.isBlank();
		class18.isNumeric();
		class18.isWhitespace();
		class18.normaliseWhiteSpace();
		class18.normaliseWhiteSpaceHandlesHighSurrogates();
		class18.resolvesRelativeUrls();
		org.jsoup.helper.W3CDomTest class19 = new org.jsoup.helper.W3CDomTest();
		class19.simpleConversion();
		try {
			class19.convertsGoogle();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class19.namespacePreservation();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		class19.handlesInvalidAttributeNames();
		org.jsoup.helper.DataUtilTest class20 = new org.jsoup.helper.DataUtilTest();
		class20.testCharset();
		class20.testQuotedCharset();
		class20.discardsSpuriousByteOrderMark();
		class20.discardsSpuriousByteOrderMarkWhenNoCharsetSet();
		class20.shouldNotThrowExceptionOnEmptyCharset();
		class20.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		class20.shouldCorrectCharsetForDuplicateCharsetString();
		class20.shouldReturnNullForIllegalCharsetNames();
		class20.generatesMimeBoundaries();
		class20.wrongMetaCharsetFallback();
		try {
			class20.supportsBOMinFiles();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		org.jsoup.parser.ParserSettingsTest class21 = new org.jsoup.parser.ParserSettingsTest();
		class21.caseSupport();
		org.jsoup.parser.CharacterReaderTest class22 = new org.jsoup.parser.CharacterReaderTest();
		class22.consume();
		class22.unconsume();
		class22.mark();
		class22.consumeToEnd();
		class22.nextIndexOfChar();
		class22.nextIndexOfString();
		class22.nextIndexOfUnmatched();
		class22.consumeToChar();
		class22.consumeToString();
		class22.advance();
		class22.consumeToAny();
		class22.consumeLetterSequence();
		class22.consumeLetterThenDigitSequence();
		class22.matches();
		class22.matchesIgnoreCase();
		class22.containsIgnoreCase();
		class22.matchesAny();
		class22.cachesStrings();
		class22.rangeEquals();
		org.jsoup.parser.HtmlParserTest class23 = new org.jsoup.parser.HtmlParserTest();
		class23.parsesSimpleDocument();
		class23.parsesRoughAttributes();
		class23.parsesQuiteRoughAttributes();
		class23.parsesComments();
		class23.parsesUnterminatedComments();
		class23.dropsUnterminatedTag();
		class23.dropsUnterminatedAttribute();
		class23.parsesUnterminatedTextarea();
		class23.parsesUnterminatedOption();
		class23.testSpaceAfterTag();
		class23.createsDocumentStructure();
		class23.createsStructureFromBodySnippet();
		class23.handlesEscapedData();
		class23.handlesDataOnlyTags();
		class23.handlesTextAfterData();
		class23.handlesTextArea();
		class23.preservesSpaceInTextArea();
		class23.preservesSpaceInScript();
		class23.doesNotCreateImplicitLists();
		class23.discardsNakedTds();
		class23.handlesNestedImplicitTable();
		class23.handlesWhatWgExpensesTableExample();
		class23.handlesTbodyTable();
		class23.handlesImplicitCaptionClose();
		class23.noTableDirectInTable();
		class23.ignoresDupeEndTrTag();
		class23.handlesBaseTags();
		class23.handlesProtocolRelativeUrl();
		class23.handlesCdata();
		class23.handlesUnclosedCdataAtEOF();
		class23.handlesInvalidStartTags();
		class23.handlesUnknownTags();
		class23.handlesUnknownInlineTags();
		class23.parsesBodyFragment();
		class23.handlesUnknownNamespaceTags();
		class23.handlesKnownEmptyBlocks();
		class23.handlesSolidusAtAttributeEnd();
		class23.handlesMultiClosingBody();
		class23.handlesUnclosedDefinitionLists();
		class23.handlesBlocksInDefinitions();
		class23.handlesFrames();
		class23.ignoresContentAfterFrameset();
		class23.handlesJavadocFont();
		class23.handlesBaseWithoutHref();
		class23.normalisesDocument();
		class23.normalisesEmptyDocument();
		class23.normalisesHeadlessBody();
		class23.normalisedBodyAfterContent();
		class23.findsCharsetInMalformedMeta();
		class23.testHgroup();
		class23.testRelaxedTags();
		class23.testHeaderContents();
		class23.testSpanContents();
		class23.testNoImagesInNoScriptInHead();
		class23.testAFlowContents();
		class23.testFontFlowContents();
		class23.handlesMisnestedTagsBI();
		class23.handlesMisnestedTagsBP();
		class23.handlesUnexpectedMarkupInTables();
		class23.handlesUnclosedFormattingElements();
		class23.handlesUnclosedAnchors();
		class23.reconstructFormattingElements();
		class23.reconstructFormattingElementsInTable();
		class23.commentBeforeHtml();
		class23.emptyTdTag();
		class23.handlesSolidusInA();
		class23.handlesSpanInTbody();
		class23.handlesUnclosedTitleAtEof();
		class23.handlesUnclosedTitle();
		class23.handlesUnclosedScriptAtEof();
		class23.handlesUnclosedRawtextAtEof();
		class23.noImplicitFormForTextAreas();
		class23.handlesEscapedScript();
		class23.handles0CharacterAsText();
		class23.handlesNullInData();
		class23.handlesNullInComments();
		class23.handlesNewlinesAndWhitespaceInTag();
		class23.handlesWhitespaceInoDocType();
		class23.tracksErrorsWhenRequested();
		class23.tracksLimitedErrorsWhenRequested();
		class23.noErrorsByDefault();
		class23.handlesCommentsInTable();
		class23.handlesQuotesInCommentsInScripts();
		class23.handleNullContextInParseFragment();
		class23.doesNotFindShortestMatchingEntity();
		class23.relaxedBaseEntityMatchAndStrictExtendedMatch();
		class23.handlesXmlDeclarationAsBogusComment();
		class23.handlesTagsInTextarea();
		class23.createsFormElements();
		class23.associatedFormControlsWithDisjointForms();
		class23.handlesInputInTable();
		class23.convertsImageToImg();
		class23.handlesInvalidDoctypes();
		class23.handlesManyChildren();
		try {
			class23.testInvalidTableContents();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		class23.testNormalisesIsIndex();
		class23.testReinsertionModeForThCelss();
		class23.testUsingSingleQuotesInQueries();
		class23.testSupportsNonAsciiTags();
		class23.testSupportsPartiallyNonAsciiTags();
		class23.testFragment();
		class23.testHtmlLowerCase();
		class23.canPreserveTagCase();
		class23.canPreserveAttributeCase();
		class23.canPreserveBothCase();
		org.jsoup.parser.XmlTreeBuilderTest class24 = new org.jsoup.parser.XmlTreeBuilderTest();
		class24.testSimpleXmlParse();
		class24.testPopToClose();
		class24.testCommentAndDocType();
		class24.testSupplyParserToJsoupClass();
		try {
			class24.testSupplyParserToConnection();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class24.testSupplyParserToDataStream();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		catch (java.net.URISyntaxException err80) {
			err80.printStackTrace();
		}
		class24.testDoesNotForceSelfClosingKnownTags();
		class24.handlesXmlDeclarationAsDeclaration();
		class24.xmlFragment();
		class24.xmlParseDefaultsToHtmlOutputSyntax();
		class24.testDoesHandleEOFInTag();
		try {
			class24.testDetectCharsetEncodingDeclaration();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		catch (java.net.URISyntaxException err82) {
			err82.printStackTrace();
		}
		class24.testParseDeclarationAttributes();
		class24.caseSensitiveDeclaration();
		class24.testCreatesValidProlog();
		class24.preservesCaseByDefault();
		class24.canNormalizeCase();
		org.jsoup.parser.TagTest class25 = new org.jsoup.parser.TagTest();
		class25.isCaseSensitive();
		class25.canBeInsensitive();
		class25.trims();
		class25.equality();
		class25.divSemantics();
		class25.pSemantics();
		class25.imgSemantics();
		class25.defaultSemantics();
		class25.valueOfChecksNotNull();
		class25.valueOfChecksNotEmpty();
		org.jsoup.parser.TokenQueueTest class26 = new org.jsoup.parser.TokenQueueTest();
		class26.chompBalanced();
		class26.chompEscapedBalanced();
		class26.chompBalancedMatchesAsMuchAsPossible();
		class26.unescape();
		class26.chompToIgnoreCase();
		class26.addFirst();
		org.jsoup.parser.AttributeParseTest class27 = new org.jsoup.parser.AttributeParseTest();
		class27.parsesRoughAttributeString();
		class27.handlesNewLinesAndReturns();
		class27.parsesEmptyString();
		class27.canStartWithEq();
		class27.strictAttributeUnescapes();
		class27.moreAttributeUnescapes();
		class27.parsesBooleanAttributes();
		class27.dropsSlashFromAttributeName();
	}
}