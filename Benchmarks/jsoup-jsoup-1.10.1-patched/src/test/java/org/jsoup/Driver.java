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
		org.jsoup.nodes.BuildEntities class5 = new org.jsoup.nodes.BuildEntities();
		org.jsoup.nodes.FormElementTest class6 = new org.jsoup.nodes.FormElementTest();
		class6.hasAssociatedControls();
		class6.createsFormData();
		class6.createsSubmitableConnection();
		class6.actionWithNoValue();
		class6.actionWithNoBaseUri();
		class6.formsAddedAfterParseAreFormElements();
		class6.controlsAddedAfterParseAreLinkedWithForms();
		class6.usesOnForCheckboxValueIfNoValueSet();
		class6.adoptedFormsRetainInputs();
		org.jsoup.nodes.ElementTest class7 = new org.jsoup.nodes.ElementTest();
		class7.getElementsByTagName();
		class7.getNamespacedElementsByTag();
		class7.testGetElementById();
		class7.testGetText();
		class7.testGetChildText();
		class7.testNormalisesText();
		class7.testKeepsPreText();
		class7.testKeepsPreTextInCode();
		class7.testBrHasSpace();
		class7.testGetSiblings();
		class7.testGetSiblingsWithDuplicateContent();
		class7.testGetParents();
		class7.testElementSiblingIndex();
		class7.testElementSiblingIndexSameContent();
		class7.testGetElementsWithClass();
		class7.testGetElementsWithAttribute();
		class7.testGetElementsWithAttributeDash();
		class7.testGetElementsWithAttributeValue();
		class7.testClassDomMethods();
		class7.testHasClassDomMethods();
		class7.testClassUpdates();
		class7.testOuterHtml();
		class7.testInnerHtml();
		class7.testFormatHtml();
		class7.testFormatOutline();
		class7.testSetIndent();
		class7.testNotPretty();
		class7.testEmptyElementFormatHtml();
		class7.testNoIndentOnScriptAndStyle();
		class7.testContainerOutput();
		class7.testSetText();
		class7.testAddNewElement();
		class7.testAddBooleanAttribute();
		class7.testAppendRowToTable();
		class7.testPrependRowToTable();
		class7.testPrependElement();
		class7.testAddNewText();
		class7.testPrependText();
		class7.testThrowsOnAddNullText();
		class7.testThrowsOnPrependNullText();
		class7.testAddNewHtml();
		class7.testPrependNewHtml();
		class7.testSetHtml();
		class7.testSetHtmlTitle();
		class7.testWrap();
		class7.before();
		class7.after();
		class7.testWrapWithRemainder();
		class7.testHasText();
		class7.dataset();
		class7.parentlessToString();
		class7.testClone();
		class7.testClonesClassnames();
		class7.testTagNameSet();
		class7.testHtmlContainsOuter();
		class7.testGetTextNodes();
		class7.testManipulateTextNodes();
		class7.testGetDataNodes();
		class7.elementIsNotASiblingOfItself();
		class7.testChildThrowsIndexOutOfBoundsOnMissing();
		class7.moveByAppend();
		class7.insertChildrenArgumentValidation();
		class7.insertChildrenAtPosition();
		class7.insertChildrenAsCopy();
		class7.testCssPath();
		class7.testClassNames();
		class7.testHashAndEqualsAndValue();
		class7.testRelativeUrls();
		class7.appendMustCorrectlyMoveChildrenInsideOneParentElement();
		class7.testHashcodeIsStableWithContentChanges();
		class7.testNamespacedElements();
		org.jsoup.nodes.NodeTest class8 = new org.jsoup.nodes.NodeTest();
		class8.handlesBaseUri();
		class8.setBaseUriIsRecursive();
		class8.handlesAbsPrefix();
		class8.handlesAbsOnImage();
		class8.handlesAbsPrefixOnHasAttr();
		class8.literalAbsPrefix();
		class8.handleAbsOnFileUris();
		class8.handleAbsOnLocalhostFileUris();
		class8.handlesAbsOnProtocolessAbsoluteUris();
		class8.absHandlesRelativeQuery();
		class8.absHandlesDotFromIndex();
		class8.testRemove();
		class8.testReplace();
		class8.ownerDocument();
		class8.before();
		class8.after();
		class8.unwrap();
		class8.unwrapNoChildren();
		class8.traverse();
		class8.orphanNodeReturnsNullForSiblingElements();
		class8.nodeIsNotASiblingOfItself();
		class8.childNodesCopy();
		class8.supportsClone();
		org.jsoup.nodes.DocumentTest class9 = new org.jsoup.nodes.DocumentTest();
		class9.setTextPreservesDocumentStructure();
		class9.testTitles();
		class9.testOutputEncoding();
		class9.testXhtmlReferences();
		class9.testNormalisesStructure();
		class9.testClone();
		class9.testClonesDeclarations();
		try {
			class9.testLocation();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		class9.testHtmlAndXmlSyntax();
		class9.htmlParseDefaultsToHtmlOutputSyntax();
		class9.testHtmlAppendable();
		class9.testOverflowClone();
		try {
			class9.DocumentsWithSameContentAreEqual();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class9.DocumentsWithSameContentAreVerifialbe();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		class9.testMetaCharsetUpdateUtf8();
		class9.testMetaCharsetUpdateIso8859();
		class9.testMetaCharsetUpdateNoCharset();
		class9.testMetaCharsetUpdateDisabled();
		class9.testMetaCharsetUpdateDisabledNoChanges();
		class9.testMetaCharsetUpdateEnabledAfterCharsetChange();
		class9.testMetaCharsetUpdateCleanup();
		class9.testMetaCharsetUpdateXmlUtf8();
		class9.testMetaCharsetUpdateXmlIso8859();
		class9.testMetaCharsetUpdateXmlNoCharset();
		class9.testMetaCharsetUpdateXmlDisabled();
		class9.testMetaCharsetUpdateXmlDisabledNoChanges();
		class9.testMetaCharsetUpdatedDisabledPerDefault();
		try {
			class9.testShiftJisRoundtrip();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		org.jsoup.nodes.AttributesTest class10 = new org.jsoup.nodes.AttributesTest();
		class10.html();
		class10.testIteratorRemovable();
		class10.testIterator();
		class10.testIteratorEmpty();
		org.jsoup.nodes.TextNodeTest class11 = new org.jsoup.nodes.TextNodeTest();
		class11.testBlank();
		class11.testTextBean();
		class11.testSplitText();
		class11.testSplitAnEmbolden();
		class11.testWithSupplementaryCharacter();
		org.jsoup.integration.UrlConnectTest class12 = new org.jsoup.integration.UrlConnectTest();
		try {
			class12.fetchURl();
		}
		catch (java.io.IOException err5) {
			err5.printStackTrace();
		}
		try {
			class12.fetchURIWithWihtespace();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class12.fetchBaidu();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		class12.exceptOnUnknownContentType();
		class12.exceptOnUnsupportedProtocol();
		try {
			class12.ignoresContentTypeIfSoConfigured();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class12.doesPost();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		try {
			class12.sendsRequestBodyJsonWithData();
		}
		catch (java.io.IOException err10) {
			err10.printStackTrace();
		}
		try {
			class12.sendsRequestBodyJsonWithoutData();
		}
		catch (java.io.IOException err11) {
			err11.printStackTrace();
		}
		try {
			class12.sendsRequestBody();
		}
		catch (java.io.IOException err12) {
			err12.printStackTrace();
		}
		try {
			class12.sendsRequestBodyWithUrlParams();
		}
		catch (java.io.IOException err13) {
			err13.printStackTrace();
		}
		try {
			class12.doesGet();
		}
		catch (java.io.IOException err14) {
			err14.printStackTrace();
		}
		try {
			class12.doesPut();
		}
		catch (java.io.IOException err15) {
			err15.printStackTrace();
		}
		try {
			class12.followsTempRedirect();
		}
		catch (java.io.IOException err16) {
			err16.printStackTrace();
		}
		try {
			class12.followsNewTempRedirect();
		}
		catch (java.io.IOException err17) {
			err17.printStackTrace();
		}
		try {
			class12.postRedirectsFetchWithGet();
		}
		catch (java.io.IOException err18) {
			err18.printStackTrace();
		}
		try {
			class12.followsRedirectToHttps();
		}
		catch (java.io.IOException err19) {
			err19.printStackTrace();
		}
		try {
			class12.followsRelativeRedirect();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		try {
			class12.followsRelativeDotRedirect();
		}
		catch (java.io.IOException err21) {
			err21.printStackTrace();
		}
		try {
			class12.followsRelativeDotRedirect2();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		try {
			class12.followsRedirectsWithWithespaces();
		}
		catch (java.io.IOException err23) {
			err23.printStackTrace();
		}
		try {
			class12.gracefullyHandleBrokenLocationRedirect();
		}
		catch (java.io.IOException err24) {
			err24.printStackTrace();
		}
		class12.throwsExceptionOnError();
		try {
			class12.ignoresExceptionIfSoConfigured();
		}
		catch (java.io.IOException err25) {
			err25.printStackTrace();
		}
		try {
			class12.ignores500tExceptionIfSoConfigured();
		}
		catch (java.io.IOException err26) {
			err26.printStackTrace();
		}
		try {
			class12.ignores500WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err27) {
			err27.printStackTrace();
		}
		try {
			class12.ignores200WithNoContentExceptionIfSoConfigured();
		}
		catch (java.io.IOException err28) {
			err28.printStackTrace();
		}
		try {
			class12.handles200WithNoContent();
		}
		catch (java.io.IOException err29) {
			err29.printStackTrace();
		}
		try {
			class12.doesntRedirectIfSoConfigured();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		try {
			class12.redirectsResponseCookieToNextResponse();
		}
		catch (java.io.IOException err31) {
			err31.printStackTrace();
		}
		class12.maximumRedirects();
		try {
			class12.multiCookieSet();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class12.handlesDodgyCharset();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class12.maxBodySize();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class12.testUnsafeFail();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		try {
			class12.testSNIFail();
		}
		catch (java.lang.Exception err36) {
			err36.printStackTrace();
		}
		try {
			class12.testSNIPass();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class12.testUnsafePass();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class12.shouldWorkForCharsetInExtraAttribute();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class12.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class12.shouldParseBrokenHtml5MetaCharsetTagCorrectly();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class12.shouldEmptyMetaCharsetCorrectly();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class12.shouldWorkForDuplicateCharsetInTag();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class12.baseHrefCorrectAfterHttpEquiv();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class12.postHtmlFile();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class12.postJpeg();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class12.handles201Created();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class12.fetchToW3c();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class12.fetchHandlesXml();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class12.fetchHandlesXmlAsHtmlWhenParserSet();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class12.combinesSameHeadersWithComma();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class12.sendHeadRequest();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class12.fetchViaHttpProxy();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		try {
			class12.fetchViaHttpProxySetByArgument();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class12.invalidProxyFails();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class12.proxyGetAndSet();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class12.throwsIfRequestBodyForGet();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class12.canSpecifyResponseCharset();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		org.jsoup.integration.ParseTest class13 = new org.jsoup.integration.ParseTest();
		try {
			class13.testSmhBizArticle();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class13.testNewsHomepage();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class13.testGoogleSearchIpod();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class13.testBinary();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class13.testYahooJp();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		try {
			class13.testBaidu();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class13.testBaiduVariant();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		try {
			class13.testHtml5Charset();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		try {
			class13.testBrokenHtml5CharsetWithASingleDoubleQuote();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class13.testNytArticle();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class13.testYahooArticle();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		org.jsoup.integration.Benchmark class14 = new org.jsoup.integration.Benchmark();
		org.jsoup.safety.CleanerTest class15 = new org.jsoup.safety.CleanerTest();
		class15.simpleBehaviourTest();
		class15.simpleBehaviourTest2();
		class15.basicBehaviourTest();
		class15.basicWithImagesTest();
		class15.testRelaxed();
		class15.testRemoveTags();
		class15.testRemoveAttributes();
		class15.testRemoveEnforcedAttributes();
		class15.testRemoveProtocols();
		class15.testDropComments();
		class15.testDropXmlProc();
		class15.testDropScript();
		class15.testDropImageScript();
		class15.testCleanJavascriptHref();
		class15.testCleanAnchorProtocol();
		class15.testDropsUnknownTags();
		class15.testHandlesEmptyAttributes();
		class15.testIsValid();
		class15.resolvesRelativeLinks();
		class15.preservesRelativeLinksIfConfigured();
		class15.dropsUnresolvableRelativeLinks();
		class15.handlesCustomProtocols();
		class15.handlesAllPseudoTag();
		class15.addsTagOnAttributesIfNotSet();
		class15.supplyOutputSettings();
		class15.handlesFramesets();
		class15.cleansInternationalText();
		class15.testScriptTagInWhiteList();
		org.jsoup.select.SelectorTest class16 = new org.jsoup.select.SelectorTest();
		class16.testByTag();
		class16.testById();
		class16.testByClass();
		class16.testByAttribute();
		class16.testNamespacedTag();
		class16.testWildcardNamespacedTag();
		class16.testByAttributeStarting();
		class16.testByAttributeRegex();
		class16.testByAttributeRegexCharacterClass();
		class16.testByAttributeRegexCombined();
		class16.testCombinedWithContains();
		class16.testAllElements();
		class16.testAllWithClass();
		class16.testGroupOr();
		class16.testGroupOrAttribute();
		class16.descendant();
		class16.and();
		class16.deeperDescendant();
		class16.parentChildElement();
		class16.parentWithClassChild();
		class16.parentChildStar();
		class16.multiChildDescent();
		class16.caseInsensitive();
		class16.adjacentSiblings();
		class16.adjacentSiblingsWithId();
		class16.notAdjacent();
		class16.mixCombinator();
		class16.mixCombinatorGroup();
		class16.generalSiblings();
		class16.testCharactersInIdAndClass();
		class16.testSupportsLeadingCombinator();
		class16.testPseudoLessThan();
		class16.testPseudoGreaterThan();
		class16.testPseudoEquals();
		class16.testPseudoBetween();
		class16.testPseudoCombined();
		class16.testPseudoHas();
		class16.testNestedHas();
		class16.testPseudoContains();
		class16.testPsuedoContainsWithParentheses();
		class16.containsOwn();
		class16.testMatches();
		class16.matchesOwn();
		class16.testRelaxedTags();
		class16.notParas();
		class16.notAll();
		class16.notClass();
		class16.handlesCommasInSelector();
		class16.selectSupplementaryCharacter();
		class16.selectClassWithSpace();
		class16.selectSameElements();
		class16.attributeWithBrackets();
		org.jsoup.select.ElementsTest class17 = new org.jsoup.select.ElementsTest();
		class17.filter();
		class17.attributes();
		class17.hasAttr();
		class17.hasAbsAttr();
		class17.attr();
		class17.absAttr();
		class17.classes();
		class17.text();
		class17.hasText();
		class17.html();
		class17.outerHtml();
		class17.setHtml();
		class17.val();
		class17.before();
		class17.after();
		class17.wrap();
		class17.wrapDiv();
		class17.unwrap();
		class17.unwrapP();
		class17.unwrapKeepsSpace();
		class17.empty();
		class17.remove();
		class17.eq();
		class17.is();
		class17.parents();
		class17.not();
		class17.tagNameSet();
		class17.traverse();
		class17.forms();
		class17.classWithHyphen();
		org.jsoup.select.CssTest class18 = new org.jsoup.select.CssTest();
		class18.firstChild();
		class18.lastChild();
		class18.nthChild_simple();
		class18.nthOfType_unknownTag();
		class18.nthLastChild_simple();
		class18.nthOfType_simple();
		class18.nthLastOfType_simple();
		class18.nthChild_advanced();
		class18.nthOfType_advanced();
		class18.nthLastChild_advanced();
		class18.nthLastOfType_advanced();
		class18.firstOfType();
		class18.lastOfType();
		class18.empty();
		class18.onlyChild();
		class18.onlyOfType();
		class18.root();
		org.jsoup.select.QueryParserTest class19 = new org.jsoup.select.QueryParserTest();
		class19.testOrGetsCorrectPrecedence();
		class19.testParsesMultiCorrectly();
		org.jsoup.helper.HttpConnectionTest class20 = new org.jsoup.helper.HttpConnectionTest();
		try {
			class20.throwsExceptionOnParseWithoutExecute();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class20.throwsExceptionOnBodyWithoutExecute();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class20.throwsExceptionOnBodyAsBytesWithoutExecute();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		class20.caseInsensitiveHeaders();
		class20.headers();
		class20.sameHeadersCombineWithComma();
		class20.ignoresEmptySetCookies();
		class20.ignoresEmptyCookieNameAndVals();
		try {
			class20.connectWithUrl();
		}
		catch (java.net.MalformedURLException err73) {
			err73.printStackTrace();
		}
		class20.throwsOnMalformedUrl();
		class20.userAgent();
		class20.timeout();
		class20.referrer();
		class20.method();
		class20.throwsOnOdddData();
		class20.data();
		class20.cookie();
		class20.inputStream();
		class20.requestBody();
		org.jsoup.helper.StringUtilTest class21 = new org.jsoup.helper.StringUtilTest();
		class21.join();
		class21.padding();
		class21.isBlank();
		class21.isNumeric();
		class21.isWhitespace();
		class21.normaliseWhiteSpace();
		class21.normaliseWhiteSpaceHandlesHighSurrogates();
		class21.resolvesRelativeUrls();
		org.jsoup.helper.W3CDomTest class22 = new org.jsoup.helper.W3CDomTest();
		class22.simpleConversion();
		try {
			class22.convertsGoogle();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class22.namespacePreservation();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		class22.handlesInvalidAttributeNames();
		org.jsoup.helper.DataUtilTest class23 = new org.jsoup.helper.DataUtilTest();
		class23.testCharset();
		class23.testQuotedCharset();
		class23.discardsSpuriousByteOrderMark();
		class23.discardsSpuriousByteOrderMarkWhenNoCharsetSet();
		class23.shouldNotThrowExceptionOnEmptyCharset();
		class23.shouldSelectFirstCharsetOnWeirdMultileCharsetsInMetaTags();
		class23.shouldCorrectCharsetForDuplicateCharsetString();
		class23.shouldReturnNullForIllegalCharsetNames();
		class23.generatesMimeBoundaries();
		class23.wrongMetaCharsetFallback();
		try {
			class23.supportsBOMinFiles();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		org.jsoup.Driver class24 = new org.jsoup.Driver();
		org.jsoup.parser.ParserSettingsTest class25 = new org.jsoup.parser.ParserSettingsTest();
		class25.caseSupport();
		org.jsoup.parser.CharacterReaderTest class26 = new org.jsoup.parser.CharacterReaderTest();
		class26.consume();
		class26.unconsume();
		class26.mark();
		class26.consumeToEnd();
		class26.nextIndexOfChar();
		class26.nextIndexOfString();
		class26.nextIndexOfUnmatched();
		class26.consumeToChar();
		class26.consumeToString();
		class26.advance();
		class26.consumeToAny();
		class26.consumeLetterSequence();
		class26.consumeLetterThenDigitSequence();
		class26.matches();
		class26.matchesIgnoreCase();
		class26.containsIgnoreCase();
		class26.matchesAny();
		class26.cachesStrings();
		class26.rangeEquals();
		org.jsoup.parser.HtmlParserTest class27 = new org.jsoup.parser.HtmlParserTest();
		class27.parsesSimpleDocument();
		class27.parsesRoughAttributes();
		class27.parsesQuiteRoughAttributes();
		class27.parsesComments();
		class27.parsesUnterminatedComments();
		class27.dropsUnterminatedTag();
		class27.dropsUnterminatedAttribute();
		class27.parsesUnterminatedTextarea();
		class27.parsesUnterminatedOption();
		class27.testSpaceAfterTag();
		class27.createsDocumentStructure();
		class27.createsStructureFromBodySnippet();
		class27.handlesEscapedData();
		class27.handlesDataOnlyTags();
		class27.handlesTextAfterData();
		class27.handlesTextArea();
		class27.preservesSpaceInTextArea();
		class27.preservesSpaceInScript();
		class27.doesNotCreateImplicitLists();
		class27.discardsNakedTds();
		class27.handlesNestedImplicitTable();
		class27.handlesWhatWgExpensesTableExample();
		class27.handlesTbodyTable();
		class27.handlesImplicitCaptionClose();
		class27.noTableDirectInTable();
		class27.ignoresDupeEndTrTag();
		class27.handlesBaseTags();
		class27.handlesProtocolRelativeUrl();
		class27.handlesCdata();
		class27.handlesUnclosedCdataAtEOF();
		class27.handlesInvalidStartTags();
		class27.handlesUnknownTags();
		class27.handlesUnknownInlineTags();
		class27.parsesBodyFragment();
		class27.handlesUnknownNamespaceTags();
		class27.handlesKnownEmptyBlocks();
		class27.handlesSolidusAtAttributeEnd();
		class27.handlesMultiClosingBody();
		class27.handlesUnclosedDefinitionLists();
		class27.handlesBlocksInDefinitions();
		class27.handlesFrames();
		class27.ignoresContentAfterFrameset();
		class27.handlesJavadocFont();
		class27.handlesBaseWithoutHref();
		class27.normalisesDocument();
		class27.normalisesEmptyDocument();
		class27.normalisesHeadlessBody();
		class27.normalisedBodyAfterContent();
		class27.findsCharsetInMalformedMeta();
		class27.testHgroup();
		class27.testRelaxedTags();
		class27.testHeaderContents();
		class27.testSpanContents();
		class27.testNoImagesInNoScriptInHead();
		class27.testAFlowContents();
		class27.testFontFlowContents();
		class27.handlesMisnestedTagsBI();
		class27.handlesMisnestedTagsBP();
		class27.handlesUnexpectedMarkupInTables();
		class27.handlesUnclosedFormattingElements();
		class27.handlesUnclosedAnchors();
		class27.reconstructFormattingElements();
		class27.reconstructFormattingElementsInTable();
		class27.commentBeforeHtml();
		class27.emptyTdTag();
		class27.handlesSolidusInA();
		class27.handlesSpanInTbody();
		class27.handlesUnclosedTitleAtEof();
		class27.handlesUnclosedTitle();
		class27.handlesUnclosedScriptAtEof();
		class27.handlesUnclosedRawtextAtEof();
		class27.noImplicitFormForTextAreas();
		class27.handlesEscapedScript();
		class27.handles0CharacterAsText();
		class27.handlesNullInData();
		class27.handlesNullInComments();
		class27.handlesNewlinesAndWhitespaceInTag();
		class27.handlesWhitespaceInoDocType();
		class27.tracksErrorsWhenRequested();
		class27.tracksLimitedErrorsWhenRequested();
		class27.noErrorsByDefault();
		class27.handlesCommentsInTable();
		class27.handlesQuotesInCommentsInScripts();
		class27.handleNullContextInParseFragment();
		class27.doesNotFindShortestMatchingEntity();
		class27.relaxedBaseEntityMatchAndStrictExtendedMatch();
		class27.handlesXmlDeclarationAsBogusComment();
		class27.handlesTagsInTextarea();
		class27.createsFormElements();
		class27.associatedFormControlsWithDisjointForms();
		class27.handlesInputInTable();
		class27.convertsImageToImg();
		class27.handlesInvalidDoctypes();
		class27.handlesManyChildren();
		try {
			class27.testInvalidTableContents();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		class27.testNormalisesIsIndex();
		class27.testReinsertionModeForThCelss();
		class27.testUsingSingleQuotesInQueries();
		class27.testSupportsNonAsciiTags();
		class27.testSupportsPartiallyNonAsciiTags();
		class27.testFragment();
		class27.testHtmlLowerCase();
		class27.canPreserveTagCase();
		class27.canPreserveAttributeCase();
		class27.canPreserveBothCase();
		org.jsoup.parser.XmlTreeBuilderTest class28 = new org.jsoup.parser.XmlTreeBuilderTest();
		class28.testSimpleXmlParse();
		class28.testPopToClose();
		class28.testCommentAndDocType();
		class28.testSupplyParserToJsoupClass();
		try {
			class28.testSupplyParserToConnection();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class28.testSupplyParserToDataStream();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		catch (java.net.URISyntaxException err80) {
			err80.printStackTrace();
		}
		class28.testDoesNotForceSelfClosingKnownTags();
		class28.handlesXmlDeclarationAsDeclaration();
		class28.xmlFragment();
		class28.xmlParseDefaultsToHtmlOutputSyntax();
		class28.testDoesHandleEOFInTag();
		try {
			class28.testDetectCharsetEncodingDeclaration();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		catch (java.net.URISyntaxException err82) {
			err82.printStackTrace();
		}
		class28.testParseDeclarationAttributes();
		class28.caseSensitiveDeclaration();
		class28.testCreatesValidProlog();
		class28.preservesCaseByDefault();
		class28.canNormalizeCase();
		org.jsoup.parser.TagTest class29 = new org.jsoup.parser.TagTest();
		class29.isCaseSensitive();
		class29.canBeInsensitive();
		class29.trims();
		class29.equality();
		class29.divSemantics();
		class29.pSemantics();
		class29.imgSemantics();
		class29.defaultSemantics();
		class29.valueOfChecksNotNull();
		class29.valueOfChecksNotEmpty();
		org.jsoup.parser.TokenQueueTest class30 = new org.jsoup.parser.TokenQueueTest();
		class30.chompBalanced();
		class30.chompEscapedBalanced();
		class30.chompBalancedMatchesAsMuchAsPossible();
		class30.unescape();
		class30.chompToIgnoreCase();
		class30.addFirst();
		org.jsoup.parser.AttributeParseTest class31 = new org.jsoup.parser.AttributeParseTest();
		class31.parsesRoughAttributeString();
		class31.handlesNewLinesAndReturns();
		class31.parsesEmptyString();
		class31.canStartWithEq();
		class31.strictAttributeUnescapes();
		class31.moreAttributeUnescapes();
		class31.parsesBooleanAttributes();
		class31.dropsSlashFromAttributeName();
	}
}