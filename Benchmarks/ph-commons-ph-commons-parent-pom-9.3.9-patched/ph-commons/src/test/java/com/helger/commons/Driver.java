package com.helger.commons;

public class Driver {
	public static void main(String[] argv) {
		com.helger.commons.timing.StopWatchTest class1 = new com.helger.commons.timing.StopWatchTest();
		class1.testAll();
		com.helger.commons.collection.map.SoftHashMapTest class2 = new com.helger.commons.collection.map.SoftHashMapTest();
		class2.testGarbageCollect();
		class2.testEntrySetToArray();
		com.helger.commons.collection.map.SoftLinkedHashMapTest class3 = new com.helger.commons.collection.map.SoftLinkedHashMapTest();
		class3.testBasic();
		class3.testEntrySetToArray();
		com.helger.commons.collection.map.LRUMapTest class4 = new com.helger.commons.collection.map.LRUMapTest();
		class4.testLRUCache();
		com.helger.commons.collection.map.LRUSetTest class5 = new com.helger.commons.collection.map.LRUSetTest();
		class5.testLRUCache();
		com.helger.commons.collection.map.MapEntryTest class6 = new com.helger.commons.collection.map.MapEntryTest();
		class6.testCtor();
		com.helger.commons.collection.map.LoggingLRUMapTest class7 = new com.helger.commons.collection.map.LoggingLRUMapTest();
		class7.testAll();
		com.helger.commons.collection.attr.AttributeContainerAnyTest class8 = new com.helger.commons.collection.attr.AttributeContainerAnyTest();
		class8.testInit();
		class8.testGetAndSetAttributeFlag();
		class8.testWithStringArray();
		class8.testCastAndConvert();
		com.helger.commons.collection.IteratorHelperTest class9 = new com.helger.commons.collection.IteratorHelperTest();
		class9.testIsEmpty_Enumeration();
		class9.testIsEmpty_Iterator();
		class9.testIsEmpty_IIterableIterator();
		class9.testGetSize_IterableIterator();
		class9.testGetSize_Iterator();
		class9.testGetEnumeratorFromIterator();
		class9.testGetReverseIterator();
		class9.testGetIterator_Iterable();
		class9.testGetIterator_Iterator();
		class9.testGetIterator_Array();
		class9.testGetIteratorFromEnumeration();
		com.helger.commons.collection.CollectionHelperTest class10 = new com.helger.commons.collection.CollectionHelperTest();
		class10.testGetDifference();
		class10.testGetIntersected();
		class10.testMakeUnmodifiable();
		class10.testMakeUnmodifiableNotNull();
		class10.testNewMap_Empty();
		class10.testNewMap_KeyValue();
		class10.testNewMap_Map();
		class10.testNewMap_MapArray();
		class10.testNewMap_Array();
		class10.testNewMap_ArrayArray();
		class10.testNewMap_CollectionCollection();
		class10.testNewSortedMap_Empty();
		class10.testNewSortedMap_KeyValue();
		class10.testNewSortedMap_Array();
		class10.testNewSortedMap_ArrayArray();
		class10.testNewSortedMap_CollectionCollection();
		class10.testNewOrderedMap_Empty();
		class10.testNewOrderedMap_KeyValue();
		class10.testNewOrderedMap_Array();
		class10.testNewOrderedMap_ArrayArray();
		class10.testNewOrderedMap_CollectionCollection();
		class10.testNewSet_Empty();
		class10.testNewSet_SingleValue();
		class10.testNewSet_Array();
		class10.testNewSetIterable();
		class10.testNewSetCollection();
		class10.testNewSetIIterableIterator();
		class10.testNewSetEnumeration();
		class10.testNewSetIterator();
		class10.testNewSortedSet_Empty();
		class10.testNewSortedSet_SingleValue();
		class10.testNewSortedSet_Array();
		class10.testNewSortedSetIterable();
		class10.testNewSortedSetCollection();
		class10.testNewSortedSetIIterableIterator();
		class10.testNewSortedSetEnumeration();
		class10.testNewSortedSetIterator();
		class10.testNewOrderedSetEmpty();
		class10.testNewOrderedSetSingleValue();
		class10.testNewOrderedSetArray();
		class10.testNewOrderedSetIterable();
		class10.testNewOrderedSetCollection();
		class10.testNewOrderedSetIIterableIterator();
		class10.testNewOrderedSetEnumeration();
		class10.testNewOrderedSetIterator();
		class10.testNewListPrefilled();
		class10.testNewListEmpty();
		class10.testNewListSingleValue();
		class10.testNewListArray();
		class10.testNewListIterator();
		class10.testNewListCollection();
		class10.testNewListIterable();
		class10.testNewListIIterableIterator();
		class10.testGetSortedIterator();
		class10.testGetSortedIterable();
		class10.testGetSortedIIterableIterator();
		class10.testGetSortedFromIteratorWithCompi();
		class10.testGetSortedIterableWithCompi();
		class10.testGetSortedArray();
		class10.testGetSortedArrayWithCompi();
		class10.testIsEmpty();
		class10.testIsEmptyCollection();
		class10.testSize();
		class10.testGetFilteredMap();
		class10.testGetSortedByKey();
		class10.testGetSortedByValue();
		class10.testGetReverseList();
		class10.testGetReverseInlineList();
		class10.testFirstAndLast();
		class10.testIsEmpty_Iterable();
		class10.testIsEmpty_Collection();
		class10.testIsEmpty_Map();
		class10.testGetSize_Collection();
		class10.testGetSize_Map();
		class10.testGetSize_Iterable();
		class10.testGetConcatenatedList_CollectionCollection();
		class10.testGetConcatenatedList_CollectionArray();
		class10.testGetConcatenatedList_ArrayCollection();
		class10.testGetConcatenatedSet_CollectionCollection();
		class10.testGetConcatenatedSet_CollectionArray();
		class10.testGetConcatenatedSet_ArrayCollection();
		class10.testGetConcatenatedInline();
		class10.testGetCombinedMap();
		class10.testNewObjectListFromArray();
		class10.testGetSubList();
		class10.testGetSafe();
		class10.testContainsNullElement();
		class10.testContainsOnly();
		class10.testNew();
		com.helger.commons.collection.iterate.ArrayIteratorTest class11 = new com.helger.commons.collection.iterate.ArrayIteratorTest();
		class11.testAll();
		class11.testStdMethods();
		com.helger.commons.collection.iterate.IterableIteratorTest class12 = new com.helger.commons.collection.iterate.IterableIteratorTest();
		class12.testBasic();
		com.helger.commons.collection.iterate.FilterIteratorTest class13 = new com.helger.commons.collection.iterate.FilterIteratorTest();
		class13.testConstructorIterator();
		class13.testConstructorIterable();
		class13.testIteration1();
		class13.testIteration2();
		class13.testIteration3();
		class13.testIteration4();
		class13.testIteration5();
		com.helger.commons.collection.iterate.MapperIteratorTest class14 = new com.helger.commons.collection.iterate.MapperIteratorTest();
		class14.testGetIteratorWithConversion();
		com.helger.commons.collection.iterate.EmptyEnumerationTest class15 = new com.helger.commons.collection.iterate.EmptyEnumerationTest();
		class15.testAll();
		com.helger.commons.collection.iterate.CombinedIteratorTest class16 = new com.helger.commons.collection.iterate.CombinedIteratorTest();
		class16.testAll();
		com.helger.commons.collection.iterate.EmptyIteratorTest class17 = new com.helger.commons.collection.iterate.EmptyIteratorTest();
		class17.testAll();
		com.helger.commons.collection.impl.CommonsEnumMapTest class18 = new com.helger.commons.collection.impl.CommonsEnumMapTest();
		class18.testBasic();
		class18.testCtor();
		com.helger.commons.collection.impl.CommonsCopyOnWriteArrayListTest class19 = new com.helger.commons.collection.impl.CommonsCopyOnWriteArrayListTest();
		class19.testBasic();
		class19.testCtor();
		com.helger.commons.collection.impl.CommonsCopyOnWriteArraySetTest class20 = new com.helger.commons.collection.impl.CommonsCopyOnWriteArraySetTest();
		class20.testBasic();
		class20.testCtor();
		com.helger.commons.collection.impl.CommonsConcurrentHashMapTest class21 = new com.helger.commons.collection.impl.CommonsConcurrentHashMapTest();
		class21.testBasic();
		class21.testCtor();
		class21.testGetSwappedKeyValues();
		com.helger.commons.collection.impl.CommonsWeakHashMapTest class22 = new com.helger.commons.collection.impl.CommonsWeakHashMapTest();
		class22.testBasic();
		class22.testCtor();
		class22.testGetSwappedKeyValues();
		com.helger.commons.collection.impl.CommonsTreeMapTest class23 = new com.helger.commons.collection.impl.CommonsTreeMapTest();
		class23.testBasic();
		class23.testCtor();
		com.helger.commons.collection.impl.CommonsLinkedHashSetTest class24 = new com.helger.commons.collection.impl.CommonsLinkedHashSetTest();
		class24.testBasic();
		class24.testCtor();
		com.helger.commons.collection.impl.CommonsArrayListTest class25 = new com.helger.commons.collection.impl.CommonsArrayListTest();
		class25.testBasic();
		class25.testCtor();
		class25.testForEachBreakable();
		class25.testFindIndex();
		com.helger.commons.collection.impl.CommonsHashMapTest class26 = new com.helger.commons.collection.impl.CommonsHashMapTest();
		class26.testBasic();
		class26.testCtor();
		class26.testGetSwappedKeyValues();
		com.helger.commons.collection.impl.CommonsLinkedListTest class27 = new com.helger.commons.collection.impl.CommonsLinkedListTest();
		class27.testBasic();
		class27.testCtor();
		com.helger.commons.collection.impl.CommonsVectorTest class28 = new com.helger.commons.collection.impl.CommonsVectorTest();
		class28.testBasic();
		class28.testCtor();
		com.helger.commons.collection.impl.CommonsLinkedHashMapTest class29 = new com.helger.commons.collection.impl.CommonsLinkedHashMapTest();
		class29.testBasic();
		class29.testCtor();
		com.helger.commons.collection.impl.CommonsHashSetTest class30 = new com.helger.commons.collection.impl.CommonsHashSetTest();
		class30.testBasic();
		class30.testCtor();
		com.helger.commons.collection.PrimitiveCollectionHelperTest class31 = new com.helger.commons.collection.PrimitiveCollectionHelperTest();
		class31.testNewBooleanContainer();
		class31.testNewByteContainer();
		class31.testNewCharContainer();
		class31.testNewDoubleContainer();
		class31.testNewFloatContainer();
		class31.testNewIntContainer();
		class31.testNewLongContainer();
		class31.testNewShortContainer();
		com.helger.commons.collection.NonBlockingStackTest class32 = new com.helger.commons.collection.NonBlockingStackTest();
		class32.testCtor();
		class32.testMethods();
		com.helger.commons.collection.StackHelperTest class33 = new com.helger.commons.collection.StackHelperTest();
		class33.testNewStackArray();
		class33.testNew();
		class33.testNewStackSingleValue();
		com.helger.commons.collection.ArrayHelperTest class34 = new com.helger.commons.collection.ArrayHelperTest();
		class34.testGetComponentClass();
		class34.testFirstElement();
		class34.testLastElement();
		class34.testIsEmpty();
		class34.testSize();
		class34.testContains();
		class34.testGetIndex();
		class34.testGetAllExcept();
		class34.testIsArray();
		class34.testArrayEquals();
		class34.testGetCopy();
		class34.testAsObjectArray();
		class34.testSafeGetElement();
		class34.testGetConcatenated();
		class34.testNewArrayEmpty();
		class34.testNewArrayFromCollection();
		class34.testNewArrayFromArray();
		class34.testNewArraySizeValue();
		class34.testGetAllExceptFirst();
		class34.testGetAllExceptLast();
		class34.testContainsNullElement();
		class34.testNewPrimitiveArray();
		class34.testNewArrayFromCollectionWithMapper();
		class34.testNewArrayFromArrayWithMapper();
		class34.testStartsWith();
		com.helger.commons.base64.Base64Test class35 = new com.helger.commons.base64.Base64Test();
		try {
			class35.testEncodeBytes();
		}
		catch (java.io.IOException err1) {
			err1.printStackTrace();
		}
		class35.testEncodeWithBreakLines();
		try {
			class35.testEncodeBytesGZIP();
		}
		catch (java.io.IOException err2) {
			err2.printStackTrace();
		}
		try {
			class35.testStreams_0_100();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class35.testStreams_100_2000();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class35.testStreams_2000_80000();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class35.testEncodeFileToFile();
		}
		catch (java.io.IOException err6) {
			err6.printStackTrace();
		}
		try {
			class35.testEncodeToFile();
		}
		catch (java.io.IOException err7) {
			err7.printStackTrace();
		}
		try {
			class35.testDecodeFileToFile();
		}
		catch (java.io.IOException err8) {
			err8.printStackTrace();
		}
		try {
			class35.testDecodeToFile();
		}
		catch (java.io.IOException err9) {
			err9.printStackTrace();
		}
		class35.testEncodeByteBuffer();
		class35.testEncodeCharBuffer();
		class35.testEncodeByteToByte();
		class35.testEncodeDecodeCharset();
		class35.testSafeDecode();
		com.helger.commons.error.level.EErrorLevelTest class36 = new com.helger.commons.error.level.EErrorLevelTest();
		class36.testBasic();
		class36.testCompare();
		class36.testIsError();
		class36.testGetMostSevere();
		com.helger.commons.error.SingleErrorTest class37 = new com.helger.commons.error.SingleErrorTest();
		class37.testEmpty();
		class37.testID();
		class37.testFieldName();
		class37.testLocation();
		class37.testText();
		class37.testLinkedException();
		class37.testAll();
		com.helger.commons.error.list.ErrorListTest class38 = new com.helger.commons.error.list.ErrorListTest();
		class38.testBasicGlobal();
		class38.testBasicField();
		class38.testSerialize();
		class38.testField();
		com.helger.commons.email.EmailAddressTest class39 = new com.helger.commons.email.EmailAddressTest();
		class39.testBasic();
		com.helger.commons.concurrent.ThreadHelperTest class40 = new com.helger.commons.concurrent.ThreadHelperTest();
		class40.testBasic();
		com.helger.commons.concurrent.collector.ConcurrentCollectorMultipleTest class41 = new com.helger.commons.concurrent.collector.ConcurrentCollectorMultipleTest();
		class41.testCtor();
		try {
			class41.testAny();
		}
		catch (java.lang.InterruptedException err10) {
			err10.printStackTrace();
		}
		com.helger.commons.concurrent.collector.ConcurrentCollectorSingleTest class42 = new com.helger.commons.concurrent.collector.ConcurrentCollectorSingleTest();
		class42.testCtor();
		try {
			class42.testAny();
		}
		catch (java.lang.InterruptedException err11) {
			err11.printStackTrace();
		}
		com.helger.commons.concurrent.BasicThreadFactoryTest class43 = new com.helger.commons.concurrent.BasicThreadFactoryTest();
		class43.testAll();
		com.helger.commons.concurrent.PromiseFuncTest class44 = new com.helger.commons.concurrent.PromiseFuncTest();
		try {
			class44.testCFRunAsync();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class44.testCFApplyAsync();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class44.testCFApplySync();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		com.helger.commons.concurrent.ExecutorServiceHelperTest class45 = new com.helger.commons.concurrent.ExecutorServiceHelperTest();
		class45.testAll();
		com.helger.commons.cache.MappedCacheTest class46 = new com.helger.commons.cache.MappedCacheTest();
		class46.testMaxSize();
		class46.testNoMaxSize();
		class46.testSameStoreKey();
		class46.testNullStoreKey();
		class46.testNullValueNotAllowed();
		class46.testNullValueAllowed();
		class46.testPrefilledCache();
		com.helger.commons.dimension.SizeDoubleTest class47 = new com.helger.commons.dimension.SizeDoubleTest();
		class47.testCtor();
		class47.testGetBestMatchingSize();
		class47.testGetScaled();
		com.helger.commons.dimension.SizeIntTest class48 = new com.helger.commons.dimension.SizeIntTest();
		class48.testCtor();
		class48.testGetBestMatchingSize();
		class48.testGetScaled();
		com.helger.commons.lang.BooleanHelperTest class49 = new com.helger.commons.lang.BooleanHelperTest();
		class49.testGetBooleanValue();
		com.helger.commons.lang.ServiceLoaderFuncTest class50 = new com.helger.commons.lang.ServiceLoaderFuncTest();
		class50.testLoadEmptyService();
		class50.testLoadNonExistingImplementation();
		class50.testLoadNonExistingImplementationWithSpecialCL();
		class50.testLoadCrappyServiceFile();
		class50.testLoadValid();
		com.helger.commons.lang.CloneHelperTest class51 = new com.helger.commons.lang.CloneHelperTest();
		try {
			class51.testGetClonedValue();
		}
		catch (java.lang.CloneNotSupportedException err15) {
			err15.printStackTrace();
		}
		com.helger.commons.lang.StackTraceHelperTest class52 = new com.helger.commons.lang.StackTraceHelperTest();
		class52.testAll();
		com.helger.commons.lang.GenericReflectionTest class53 = new com.helger.commons.lang.GenericReflectionTest();
		class53.testUncheckedCast();
		try {
			class53.testForName();
		}
		catch (java.lang.ClassNotFoundException err16) {
			err16.printStackTrace();
		}
		class53.testSafeForName();
		try {
			class53.testInvokeMethod();
		}
		catch (java.lang.NoSuchMethodException err17) {
			err17.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err18) {
			err18.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err19) {
			err19.printStackTrace();
		}
		try {
			class53.testInvokeStaticMethod();
		}
		catch (java.lang.NoSuchMethodException err20) {
			err20.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err21) {
			err21.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err23) {
			err23.printStackTrace();
		}
		try {
			class53.testNewInstance();
		}
		catch (java.lang.IllegalAccessException err24) {
			err24.printStackTrace();
		}
		catch (java.lang.NoSuchMethodException err25) {
			err25.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err26) {
			err26.printStackTrace();
		}
		catch (java.lang.InstantiationException err27) {
			err27.printStackTrace();
		}
		com.helger.commons.lang.ClassPathHelperTest class54 = new com.helger.commons.lang.ClassPathHelperTest();
		class54.testGetAllClassPathEntries();
		try {
			class54.testPrintClassPathEntries();
		}
		catch (java.io.UnsupportedEncodingException err28) {
			err28.printStackTrace();
		}
		com.helger.commons.lang.EnumHelperTest class55 = new com.helger.commons.lang.EnumHelperTest();
		class55.testGetEnumID();
		class55.testGetFromIDString();
		class55.testGetFromIDCaseInsensitiveString();
		class55.testGetFromIDInt();
		com.helger.commons.lang.proxy.LoggingInvocationHandlerTest class56 = new com.helger.commons.lang.proxy.LoggingInvocationHandlerTest();
		class56.testBasic();
		class56.testDefaultMethod();
		com.helger.commons.lang.ClassHierarchyCacheTest class57 = new com.helger.commons.lang.ClassHierarchyCacheTest();
		class57.testGetClassHierarchy();
		com.helger.commons.lang.ClassHelperTest class58 = new com.helger.commons.lang.ClassHelperTest();
		class58.testGetClassLoader();
		class58.testIsPublicClass();
		class58.testIsInstancableClass();
		class58.testIsPublic();
		class58.testIsInterface();
		class58.testIsAnnotation();
		class58.testIsEnum();
		class58.testIsAbstract();
		class58.testIsArray();
		class58.testPrimitivesAndWrappers();
		class58.testGetAllPrimtives();
		class58.testIsStringClass();
		class58.testIsCharacterClass();
		class58.testIsBooleanClass();
		class58.testIsFloatingPointClass();
		class58.testIsIntegerClass();
		class58.testGetClassLocalNameClassOfQ();
		class58.testGetClassPackageName();
		class58.testGetSafeClassName();
		class58.testGetDirectoryFromPackage();
		class58.testGetPathFromClass();
		class58.testGetClassFromPath();
		class58.testGetObjectAddress();
		com.helger.commons.lang.BitSetHelperTest class59 = new com.helger.commons.lang.BitSetHelperTest();
		class59.testByte();
		class59.testShort();
		class59.testInt();
		class59.testLong();
		com.helger.commons.lang.TimeValueTest class60 = new com.helger.commons.lang.TimeValueTest();
		class60.testAll();
		com.helger.commons.name.IDisplayNameProviderTest class61 = new com.helger.commons.name.IDisplayNameProviderTest();
		class61.testAll();
		com.helger.commons.name.INameProviderTest class62 = new com.helger.commons.name.INameProviderTest();
		class62.testAll();
		com.helger.commons.hashcode.HashCodeGeneratorTest class63 = new com.helger.commons.hashcode.HashCodeGeneratorTest();
		class63.testIllegalCtor();
		class63.testAppend();
		class63.testSpecialCases();
		try {
			class63.findIllegalValue();
		}
		catch (java.lang.InterruptedException err29) {
			err29.printStackTrace();
		}
		class63.testUniqueness();
		com.helger.commons.mime.MimeTypeDeterminatorTest class64 = new com.helger.commons.mime.MimeTypeDeterminatorTest();
		class64.testGetMIMEType();
		com.helger.commons.mime.MimeTypeParserTest class65 = new com.helger.commons.mime.MimeTypeParserTest();
		class65.testIsToken();
		class65.testCreateFromString();
		class65.testParseValid();
		class65.testParseValidURLEscape();
		class65.testParseInvalid();
		class65.testParseInvalidQuotedString();
		class65.testParseInvalidURLEscape();
		class65.testParseInvalidQuotedPrintable();
		com.helger.commons.mime.EMimeQuotingTest class66 = new com.helger.commons.mime.EMimeQuotingTest();
		class66.testAll();
		com.helger.commons.mime.EMimeContentTypeTest class67 = new com.helger.commons.mime.EMimeContentTypeTest();
		class67.testAll();
		com.helger.commons.mime.MimeTypeParameterTest class68 = new com.helger.commons.mime.MimeTypeParameterTest();
		class68.testBasic();
		com.helger.commons.mime.MimeTypeTest class69 = new com.helger.commons.mime.MimeTypeTest();
		class69.testCtor();
		class69.testParameters();
		class69.testSpecialCharsInParams();
		com.helger.commons.factory.FactoryNewInstanceTest class70 = new com.helger.commons.factory.FactoryNewInstanceTest();
		class70.testGetNewInstanceFactory();
		class70.testGetNewInstanceFactorySafe();
		class70.testEqualsAndHashCode();
		com.helger.commons.csv.IntegrationFuncTest class71 = new com.helger.commons.csv.IntegrationFuncTest();
		try {
			class71.testWriteRead();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		com.helger.commons.csv.CSVParserTest class72 = new com.helger.commons.csv.CSVParserTest();
		try {
			class72.testParseLine();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class72.parseSimpleString();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class72.parseSimpleQuotedString();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class72.parseSimpleQuotedStringWithSpaces();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class72.testParsedLineWithInternalQuota();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		try {
			class72.parseQuotedStringWithCommas();
		}
		catch (java.io.IOException err36) {
			err36.printStackTrace();
		}
		try {
			class72.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err37) {
			err37.printStackTrace();
		}
		try {
			class72.parseQuotedStringWithDefinedSeperatorAndQuote();
		}
		catch (java.io.IOException err38) {
			err38.printStackTrace();
		}
		try {
			class72.parseEmptyElements();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class72.parseMultiLinedQuoted();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class72.parseMultiLinedQuotedwithCarriageReturns();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class72.testADoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class72.testEscapedDoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class72.parseQuotedQuoteCharacters();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class72.parseMultipleQuotes();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class72.parseTrickyString();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class72.testAMultiLineInsideQuotes();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class72.testStrictQuoteSimple();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class72.testNotStrictQuoteSimple();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class72.testStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class72.testNotStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class72.testStrictQuoteWithGarbage();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class72.testCanIgnoreQuotations();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		class72.testFalseIgnoreQuotations();
		try {
			class72.testIssue3314579();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class72.testIssue2263439();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class72.testIssue2859181();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class72.testIssue2726363();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class72.anIOExceptionThrownifStringEndsInsideAQuotedString();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		try {
			class72.parseLineMultiAllowsQuotesAcrossMultipleLines();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class72.pendingIsClearedAfterCallToParseLine();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class72.returnPendingIfNullIsPassedIntoParseLineMulti();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class72.spacesAtEndOfQuotedStringDoNotCountIfStrictQuotesIsTrue();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class72.returnNullWhenNullPassedIn();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		class72.validateEscapeStringBeforeRealTest();
		class72.whichCharactersAreEscapable();
		try {
			class72.whitespaceBeforeEscape();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class72.testIssue2958242WithoutQuotes();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		class72.quoteAndEscapeCannotBeTheSame();
		class72.quoteAndEscapeCanBeTheSameIfNull();
		class72.separatorCharacterCannotBeNull();
		class72.separatorAndEscapeCannotBeTheSame();
		class72.separatorAndQuoteCannotBeTheSame();
		try {
			class72.parserHandlesNullInString();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		com.helger.commons.csv.CSVWriterTest class73 = new com.helger.commons.csv.CSVWriterTest();
		try {
			class73.correctlyParseNullString();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class73.correctlyParserNullObject();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class73.testParseLine();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		try {
			class73.testSpecialCharacters();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class73.parseLineWithBothEscapeAndQuoteChar();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class73.testParseLineWithNoEscapeChar();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		try {
			class73.parseLineWithNoEscapeCharAndQuotes();
		}
		catch (java.io.IOException err73) {
			err73.printStackTrace();
		}
		try {
			class73.testWriteAll();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class73.testWriteAllObjects();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		try {
			class73.testNoQuoteChars();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		try {
			class73.testNoQuoteCharsAndNoEscapeChars();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		try {
			class73.testIntelligentQuotes();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class73.testNullValues();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		try {
			class73.testStreamFlushing();
		}
		catch (java.io.IOException err80) {
			err80.printStackTrace();
		}
		try {
			class73.flushWillThrowIOException();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		class73.flushQuietlyWillNotThrowException();
		try {
			class73.testAlternateEscapeChar();
		}
		catch (java.io.IOException err82) {
			err82.printStackTrace();
		}
		try {
			class73.testNoQuotingNoEscaping();
		}
		catch (java.io.IOException err83) {
			err83.printStackTrace();
		}
		try {
			class73.testNestedQuotes();
		}
		catch (java.io.IOException err84) {
			err84.printStackTrace();
		}
		try {
			class73.testAlternateLineFeeds();
		}
		catch (java.io.IOException err85) {
			err85.printStackTrace();
		}
		try {
			class73.testAvoidFinalLineEnd();
		}
		catch (java.io.IOException err86) {
			err86.printStackTrace();
		}
		try {
			class73.testApplyQuotesToAll();
		}
		catch (java.io.IOException err87) {
			err87.printStackTrace();
		}
		com.helger.commons.csv.CSVReaderTest class74 = new com.helger.commons.csv.CSVReaderTest();
		try {
			class74.testParseLine();
		}
		catch (java.io.IOException err88) {
			err88.printStackTrace();
		}
		try {
			class74.readerCanHandleNullInString();
		}
		catch (java.io.IOException err89) {
			err89.printStackTrace();
		}
		try {
			class74.testParseLineStrictQuote();
		}
		catch (java.io.IOException err90) {
			err90.printStackTrace();
		}
		try {
			class74.testParseAll();
		}
		catch (java.io.IOException err91) {
			err91.printStackTrace();
		}
		try {
			class74.testOptionalConstructors();
		}
		catch (java.io.IOException err92) {
			err92.printStackTrace();
		}
		try {
			class74.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err93) {
			err93.printStackTrace();
		}
		try {
			class74.testSkippingLines();
		}
		catch (java.io.IOException err94) {
			err94.printStackTrace();
		}
		try {
			class74.testSkippingLinesWithDifferentEscape();
		}
		catch (java.io.IOException err95) {
			err95.printStackTrace();
		}
		try {
			class74.testNormalParsedLine();
		}
		catch (java.io.IOException err96) {
			err96.printStackTrace();
		}
		try {
			class74.testASingleQuoteAsDataElement();
		}
		catch (java.io.IOException err97) {
			err97.printStackTrace();
		}
		try {
			class74.testASingleQuoteAsDataElementWithEmptyField();
		}
		catch (java.io.IOException err98) {
			err98.printStackTrace();
		}
		try {
			class74.testSpacesAtEndOfString();
		}
		catch (java.io.IOException err99) {
			err99.printStackTrace();
		}
		try {
			class74.testEscapedQuote();
		}
		catch (java.io.IOException err100) {
			err100.printStackTrace();
		}
		try {
			class74.testEscapedEscape();
		}
		catch (java.io.IOException err101) {
			err101.printStackTrace();
		}
		try {
			class74.testSingleQuoteWhenDoubleQuoteIsQuoteChar();
		}
		catch (java.io.IOException err102) {
			err102.printStackTrace();
		}
		try {
			class74.testQuotedParsedLine();
		}
		catch (java.io.IOException err103) {
			err103.printStackTrace();
		}
		try {
			class74.bug106ParseLineWithCarriageReturnNewLineStrictQuotes();
		}
		catch (java.io.IOException err104) {
			err104.printStackTrace();
		}
		try {
			class74.testIssue2992134OutOfPlaceQuotes();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
		class74.quoteAndEscapeMustBeDifferent();
		class74.separatorAndEscapeMustBeDifferent();
		class74.separatorAndQuoteMustBeDifferent();
		try {
			class74.testIteratorFunctionality();
		}
		catch (java.io.IOException err106) {
			err106.printStackTrace();
		}
		try {
			class74.canCloseReader();
		}
		catch (java.io.IOException err107) {
			err107.printStackTrace();
		}
		try {
			class74.canCreateIteratorFromReader();
		}
		catch (java.io.IOException err108) {
			err108.printStackTrace();
		}
		try {
			class74.attemptToReadCloseStreamReturnsNull();
		}
		catch (java.io.IOException err109) {
			err109.printStackTrace();
		}
		try {
			class74.testIssue102();
		}
		catch (java.io.IOException err110) {
			err110.printStackTrace();
		}
		try {
			class74.issue108ReaderPlaysWellWithChannels();
		}
		catch (java.io.IOException err111) {
			err111.printStackTrace();
		}
		com.helger.commons.csv.UnicodeFuncTest class75 = new com.helger.commons.csv.UnicodeFuncTest();
		try {
			class75.canParseUnicode();
		}
		catch (java.io.IOException err112) {
			err112.printStackTrace();
		}
		try {
			class75.readerTest();
		}
		catch (java.io.IOException err113) {
			err113.printStackTrace();
		}
		class75.writerTest();
		try {
			class75.runUniCodeThroughCSVReader();
		}
		catch (java.io.IOException err114) {
			err114.printStackTrace();
		}
		try {
			class75.runUniCodeThroughCSVWriter();
		}
		catch (java.io.IOException err115) {
			err115.printStackTrace();
		}
		try {
			class75.runASCIIThroughCSVWriter();
		}
		catch (java.io.IOException err116) {
			err116.printStackTrace();
		}
		try {
			class75.writeThenReadAscii();
		}
		catch (java.io.IOException err117) {
			err117.printStackTrace();
		}
		try {
			class75.writeThenReadTwiceAscii();
		}
		catch (java.io.IOException err118) {
			err118.printStackTrace();
		}
		try {
			class75.writeThenReadTwiceUnicode();
		}
		catch (java.io.IOException err119) {
			err119.printStackTrace();
		}
		try {
			class75.writeThenReadTwiceMixedUnicode();
		}
		catch (java.io.IOException err120) {
			err120.printStackTrace();
		}
		com.helger.commons.csv.ICSVLineReaderTest class76 = new com.helger.commons.csv.ICSVLineReaderTest();
		try {
			class76.lineReaderWillKeepCR();
		}
		catch (java.io.IOException err121) {
			err121.printStackTrace();
		}
		try {
			class76.lineReaderWillRemoveCR();
		}
		catch (java.io.IOException err122) {
			err122.printStackTrace();
		}
		try {
			class76.lineReaderKeepingCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err123) {
			err123.printStackTrace();
		}
		try {
			class76.lineReaderNoCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err124) {
			err124.printStackTrace();
		}
		try {
			class76.lineReaderKeepingCRWillHandleEmptyString();
		}
		catch (java.io.IOException err125) {
			err125.printStackTrace();
		}
		try {
			class76.lineReaderNoCRWillHandleEmptyString();
		}
		catch (java.io.IOException err126) {
			err126.printStackTrace();
		}
		com.helger.commons.csv.CSVIteratorTest class77 = new com.helger.commons.csv.CSVIteratorTest();
		try {
			class77.removethrowsUnsupportedOperationException();
		}
		catch (java.io.IOException err127) {
			err127.printStackTrace();
		}
		try {
			class77.initialReadReturnsStrings();
		}
		catch (java.io.IOException err128) {
			err128.printStackTrace();
		}
		try {
			class77.hasNextWorks();
		}
		catch (java.io.IOException err129) {
			err129.printStackTrace();
		}
		com.helger.commons.log.LogMessageTest class78 = new com.helger.commons.log.LogMessageTest();
		class78.testAll();
		com.helger.commons.log.LogHelperTest class79 = new com.helger.commons.log.LogHelperTest();
		class79.testAll();
		com.helger.commons.log.InMemoryLoggerTest class80 = new com.helger.commons.log.InMemoryLoggerTest();
		class80.testAll();
		com.helger.commons.vendor.VendorInfoTest class81 = new com.helger.commons.vendor.VendorInfoTest();
		class81.testHeaderLines();
		class81.testInceptionYear();
		class81.testEmail();
		class81.testURL();
		com.helger.commons.text.util.PunycodeTest class82 = new com.helger.commons.text.util.PunycodeTest();
		class82.testPunycode();
		com.helger.commons.text.util.TextHelperTest class83 = new com.helger.commons.text.util.TextHelperTest();
		class83.testGetFormattedText();
		class83.testGetCopyWithLocales();
		class83.testCreateMultilingualTextFromMap();
		com.helger.commons.text.util.ABNFTest class84 = new com.helger.commons.text.util.ABNFTest();
		class84.testIsAlpha();
		class84.testIsBit();
		class84.testIsChar();
		class84.testIsCR();
		class84.testIsCtl();
		class84.testIsDigit();
		class84.testIsDQuote();
		class84.testIsHexDigit();
		class84.testIsHexDigitCaseInsensitive();
		class84.testIsHTab();
		class84.testIsLF();
		class84.testIsOctet();
		class84.testIsSP();
		class84.testIsVChar();
		class84.testIsWSP();
		com.helger.commons.text.ConstantHasTextWithArgsTest class85 = new com.helger.commons.text.ConstantHasTextWithArgsTest();
		class85.testAll();
		class85.testStandard();
		com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest class86 = new com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest();
		class86.testAll();
		com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest class87 = new com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest();
		class87.testAll();
		com.helger.commons.text.resourcebundle.ResourceBundleHelperTest class88 = new com.helger.commons.text.resourcebundle.ResourceBundleHelperTest();
		class88.testGetString();
		class88.testGetUtf8String();
		com.helger.commons.text.resourcebundle.ResourceBundleKeyTest class89 = new com.helger.commons.text.resourcebundle.ResourceBundleKeyTest();
		class89.testCtor();
		class89.testISO8859();
		class89.testUTF8();
		com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest class90 = new com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest();
		class90.testISO8859();
		com.helger.commons.text.ConstantHasTextTest class91 = new com.helger.commons.text.ConstantHasTextTest();
		class91.testAll();
		class91.testStandard();
		com.helger.commons.text.display.HasDisplayTextWithArgsTest class92 = new com.helger.commons.text.display.HasDisplayTextWithArgsTest();
		class92.testAll();
		com.helger.commons.text.display.IDisplayTextProviderTest class93 = new com.helger.commons.text.display.IDisplayTextProviderTest();
		class93.testAll();
		com.helger.commons.text.MultilingualTextTest class94 = new com.helger.commons.text.MultilingualTextTest();
		class94.testCtor();
		class94.testAddText();
		class94.testSetText();
		class94.testEquals();
		class94.testRemoveAll();
		class94.testAssignFrom();
		class94.testGetText();
		class94.testGetTextWithArgs();
		class94.testIsEmpty();
		class94.testQuotes();
		com.helger.commons.text.resolve.DefaultTextResolverTest class95 = new com.helger.commons.text.resolve.DefaultTextResolverTest();
		class95.testGetText();
		class95.testGetTextWithArgs();
		com.helger.commons.text.ReadOnlyMultilingualTextTest class96 = new com.helger.commons.text.ReadOnlyMultilingualTextTest();
		class96.testCtor();
		com.helger.commons.codec.IByteArrayCodecTest class97 = new com.helger.commons.codec.IByteArrayCodecTest();
		class97.testArbitraryCodecs();
		com.helger.commons.codec.RunLengthCodecTest class98 = new com.helger.commons.codec.RunLengthCodecTest();
		class98.testDecode();
		com.helger.commons.codec.ICharArrayCodecTest class99 = new com.helger.commons.codec.ICharArrayCodecTest();
		class99.testArbitraryCodecs();
		com.helger.commons.codec.GZIPCodecTest class100 = new com.helger.commons.codec.GZIPCodecTest();
		class100.testDecode();
		com.helger.commons.codec.ASCIIHexCodecTest class101 = new com.helger.commons.codec.ASCIIHexCodecTest();
		class101.testDecode();
		com.helger.commons.codec.RFC2616CodecTest class102 = new com.helger.commons.codec.RFC2616CodecTest();
		class102.testEncode();
		class102.testDecode();
		class102.testIsToken();
		com.helger.commons.codec.Base32CodecTest class103 = new com.helger.commons.codec.Base32CodecTest();
		class103.testGetEncodedLength();
		class103.testEncode();
		class103.testGetDecodedLength();
		class103.testDecode();
		com.helger.commons.codec.Base64CodecTest class104 = new com.helger.commons.codec.Base64CodecTest();
		class104.testGetEncodedLength();
		class104.testGetDecodedLength();
		com.helger.commons.codec.FlateCodecTest class105 = new com.helger.commons.codec.FlateCodecTest();
		class105.testDecode();
		com.helger.commons.codec.LZWCodecTest class106 = new com.helger.commons.codec.LZWCodecTest();
		class106.testDecode();
		class106.testEncode1();
		class106.testEncode2();
		class106.testArbitraryCodeLengthSwitches();
		class106.testArbitraryLargeBuffers();
		class106.testRandomArbitraryLargeBuffers();
		com.helger.commons.codec.ASCII85CodecTest class107 = new com.helger.commons.codec.ASCII85CodecTest();
		class107.testDecode();
		com.helger.commons.locale.country.ECountryNameTest class108 = new com.helger.commons.locale.country.ECountryNameTest();
		class108.testAll();
		com.helger.commons.locale.country.CountryCacheTest class109 = new com.helger.commons.locale.country.CountryCacheTest();
		class109.testGetCountryOfLocale();
		class109.testGetCountry();
		class109.testAddCountryNull();
		class109.testAddCountryEmpty();
		class109.testAddCountryIllegal();
		class109.testAddCountryInvalidCasing();
		class109.testAddCountry();
		class109.testContainsCountryByLocale();
		class109.testResetCache();
		class109.testContainsCountryByString();
		class109.testNoConcurrentModification();
		class109.testNoConcurrentModification2();
		class109.testResolve();
		com.helger.commons.locale.country.ECountryTest class110 = new com.helger.commons.locale.country.ECountryTest();
		class110.testAll();
		com.helger.commons.locale.country.ECountrySubNameTest class111 = new com.helger.commons.locale.country.ECountrySubNameTest();
		class111.testAll();
		com.helger.commons.locale.ELocaleNameTest class112 = new com.helger.commons.locale.ELocaleNameTest();
		class112.testAll();
		com.helger.commons.locale.LocaleFormatterTest class113 = new com.helger.commons.locale.LocaleFormatterTest();
		class113.testGetFormatted_Double();
		class113.testGetFormatted_Int();
		class113.testGetFormatted_Long();
		class113.testGetFormattedBigInteger();
		class113.testGetFormattedPercent();
		class113.testGetFormattedPercent_Scale();
		com.helger.commons.locale.LocaleHelperTest class114 = new com.helger.commons.locale.LocaleHelperTest();
		class114.testGetLocaleDisplayName();
		class114.testGetLocaleNativeDisplayName();
		class114.testGetAllLocaleDisplayNames();
		class114.testGetCalculatedLocaleListForResolving();
		class114.testGetLocaleFromString();
		class114.testGetLocaleToUseOrFallback();
		class114.testIsSpecialLocale();
		class114.testIsSpecialLocaleCode();
		class114.testGetValidLanguageCode();
		class114.testGetValidCountryCode();
		com.helger.commons.locale.language.LanguageCacheTest class115 = new com.helger.commons.locale.language.LanguageCacheTest();
		class115.testGetLanguageOfLocale();
		class115.testGetLanguage();
		class115.testAddLanguageNull();
		class115.testAddLanguageEmpty();
		class115.testAddLanguageIllegal();
		class115.testAddLanguageInvalidCasing();
		class115.testAddLanguage();
		class115.testContainsLanguageByLocale();
		class115.testResetCache();
		class115.testContainsLanguageByString();
		class115.testNoConcurrentModification();
		class115.testNoConcurrentModification2();
		com.helger.commons.locale.LocaleParserTest class116 = new com.helger.commons.locale.LocaleParserTest();
		class116.testParse();
		class116.testParseDouble();
		class116.testParseInt();
		class116.testParseLong();
		class116.testParseBigDecimal();
		com.helger.commons.locale.LocaleCacheTest class117 = new com.helger.commons.locale.LocaleCacheTest();
		class117.testGet();
		class117.testGetInvalid();
		class117.testGetAllLocales();
		class117.testGetAllLanguages();
		class117.testContainsLocale();
		class117.testResetCache();
		com.helger.commons.id.IHasLongIDTest class118 = new com.helger.commons.id.IHasLongIDTest();
		class118.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest class119 = new com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest();
		class119.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest class120 = new com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest();
		class120.testAll();
		com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest class121 = new com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest();
		class121.testAll();
		com.helger.commons.id.factory.FileIntIDFactoryTest class122 = new com.helger.commons.id.factory.FileIntIDFactoryTest();
		class122.testAll();
		com.helger.commons.id.factory.MemoryLongIDFactoryTest class123 = new com.helger.commons.id.factory.MemoryLongIDFactoryTest();
		class123.testAll();
		com.helger.commons.id.factory.MemoryIntIDFactoryTest class124 = new com.helger.commons.id.factory.MemoryIntIDFactoryTest();
		class124.testAll();
		com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest class125 = new com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest();
		class125.testAll();
		com.helger.commons.id.factory.FileLongIDFactoryTest class126 = new com.helger.commons.id.factory.FileLongIDFactoryTest();
		class126.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest class127 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest();
		class127.testAll();
		com.helger.commons.id.factory.GlobalIDFactoryTest class128 = new com.helger.commons.id.factory.GlobalIDFactoryTest();
		class128.testSet();
		class128.testGetNewID();
		class128.testNoFactories();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest class129 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest();
		class129.testAll();
		com.helger.commons.id.IIntIDProviderTest class130 = new com.helger.commons.id.IIntIDProviderTest();
		class130.testAll();
		com.helger.commons.id.IHasIntIDTest class131 = new com.helger.commons.id.IHasIntIDTest();
		class131.testAll();
		com.helger.commons.id.IIDProviderTest class132 = new com.helger.commons.id.IIDProviderTest();
		class132.testAll();
		com.helger.commons.id.ILongIDProviderTest class133 = new com.helger.commons.id.ILongIDProviderTest();
		class133.testAll();
		com.helger.commons.callback.CallbackListTest class134 = new com.helger.commons.callback.CallbackListTest();
		class134.testBasic();
		com.helger.commons.callback.exception.LoggingExceptionCallbackTest class135 = new com.helger.commons.callback.exception.LoggingExceptionCallbackTest();
		class135.testAll();
		com.helger.commons.random.VerySecureRandomTest class136 = new com.helger.commons.random.VerySecureRandomTest();
		class136.testRandomGen();
		com.helger.commons.datetime.PDTFormatPatternsTest class137 = new com.helger.commons.datetime.PDTFormatPatternsTest();
		class137.testGetPattern();
		com.helger.commons.datetime.PDTConfigTest class138 = new com.helger.commons.datetime.PDTConfigTest();
		class138.testTimeZones();
		com.helger.commons.datetime.PDTFactoryTest class139 = new com.helger.commons.datetime.PDTFactoryTest();
		class139.testCurrent();
		class139.testCreateLocalDate();
		com.helger.commons.datetime.PDTFromStringTest class140 = new com.helger.commons.datetime.PDTFromStringTest();
		class140.testFromString();
		class140.testDateTimeFromString();
		class140.testLocalDateFromString();
		class140.testDefaultToStringAndBack();
		com.helger.commons.datetime.PDTFormatterTest class141 = new com.helger.commons.datetime.PDTFormatterTest();
		class141.testGetDefaultFormatter();
		class141.testGetForPattern();
		class141.testGetDefault();
		class141.testLeadingZero();
		class141.testSpecialCases();
		class141.testPrintDateExplicit();
		class141.testPrintAndParseDate();
		com.helger.commons.datetime.PDTWebDateHelperTest class142 = new com.helger.commons.datetime.PDTWebDateHelperTest();
		class142.testRfc822();
		class142.testW3CTime();
		class142.testXSDDateTime();
		class142.testXSDLocalDate();
		class142.testXSDLocalDateTime();
		com.helger.commons.gfx.ImageDataManagerTest class143 = new com.helger.commons.gfx.ImageDataManagerTest();
		class143.testGetImageSize();
		com.helger.commons.equals.EqualsHelperTest class144 = new com.helger.commons.equals.EqualsHelperTest();
		class144.testEquals_Float();
		class144.testEquals_Double();
		try {
			class144.testEquals_URL();
		}
		catch (java.net.MalformedURLException err130) {
			err130.printStackTrace();
		}
		class144.testEquals_BigDecimal();
		class144.testEquals_PasswordAuthentication();
		try {
			class144.testNullSafeEquals();
		}
		catch (java.net.MalformedURLException err131) {
			err131.printStackTrace();
		}
		class144.testEqualsTypeSpecific();
		class144.testBasic();
		class144.testList();
		class144.testSet();
		class144.testMap();
		class144.testArray();
		class144.testArrayComplex();
		class144.testComplex();
		class144.testIterator();
		class144.testIterable();
		class144.testEnumeration();
		class144.testEqualsAsCollection();
		com.helger.commons.equals.EqualsImplementationRegistryTest class145 = new com.helger.commons.equals.EqualsImplementationRegistryTest();
		try {
			class145.testEquals();
		}
		catch (javax.xml.parsers.ParserConfigurationException err132) {
			err132.printStackTrace();
		}
		com.helger.commons.version.VersionRangeTest class146 = new com.helger.commons.version.VersionRangeTest();
		class146.testVersionRange();
		class146.testCtor1();
		class146.testCtor2();
		class146.testVersionMatches();
		class146.testGetAsString();
		class146.testGetAsStringPrintZeroElements();
		class146.testCompareTo();
		class146.testEquals();
		class146.testSerialization();
		com.helger.commons.version.VersionTest class147 = new com.helger.commons.version.VersionTest();
		class147.testVersionIntIntInt();
		class147.testVersionString();
		class147.testCompareTo();
		class147.testEqualsObject();
		class147.testGetAsString();
		class147.testGetAsStringBoolean();
		class147.testHashCode();
		class147.testCompare();
		class147.testSerialization();
		com.helger.commons.math.CombinationGeneratorTest class148 = new com.helger.commons.math.CombinationGeneratorTest();
		class148.testStringCombination();
		class148.testStringCombination2();
		class148.testCtor();
		com.helger.commons.math.RoundHelperTest class149 = new com.helger.commons.math.RoundHelperTest();
		class149.testDecimalType();
		class149.testGetRounded();
		class149.testGetRoundedUpFix();
		class149.testGetFormatted();
		class149.testGetRoundedEvenExp();
		class149.testGetFormattedFix();
		class149.testGetFormattedExp();
		com.helger.commons.math.FactorialHelperTest class150 = new com.helger.commons.math.FactorialHelperTest();
		class150.testSmall();
		class150.testGetAnyFactorialLinear();
		com.helger.commons.math.CombinationGeneratorFlexibleTest class151 = new com.helger.commons.math.CombinationGeneratorFlexibleTest();
		class151.testStringCombination();
		class151.testCtor();
		class151.testHugeDataSet();
		class151.testRedundancy();
		com.helger.commons.math.MathHelperTest class152 = new com.helger.commons.math.MathHelperTest();
		class152.testGetRoundedUp();
		class152.testGetDividedDouble();
		class152.testGetDividedBigDecimal();
		class152.testIntDivide();
		class152.testLongDivide();
		class152.testLongToInt();
		class152.testGetMaxInt();
		class152.testGetMaxLong();
		class152.testGetMaxFloat();
		class152.testGetMaxDouble();
		class152.testGetMinInt();
		class152.testGetMinLong();
		class152.testGetMinFloat();
		class152.testGetMinDouble();
		class152.testAbsInt();
		class152.testAbsLong();
		class152.testAbsFloat();
		class152.testAbsDouble();
		class152.testGetUnsignedInt();
		class152.testGetWithoutTrailingZeroes();
		class152.testGetFractionDigits();
		class152.testAddPercent();
		class152.testSubtractPercent();
		class152.testGetPercentValue();
		class152.testIsExactlyOneBitSetToOneInt();
		class152.testIsExactlyOneBitSetToOneLong();
		com.helger.commons.functional.IPredicateFuncTest class153 = new com.helger.commons.functional.IPredicateFuncTest();
		class153.testAll();
		class153.testNone();
		class153.testNotNull();
		class153.testIsNull();
		class153.testNegate();
		com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest class154 = new com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest();
		class154.testAll();
		com.helger.commons.statistics.util.StatisticsVisitorTest class155 = new com.helger.commons.statistics.util.StatisticsVisitorTest();
		class155.testWalkStatistics();
		com.helger.commons.statistics.StatisticsHandlerTimerTest class156 = new com.helger.commons.statistics.StatisticsHandlerTimerTest();
		class156.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest class157 = new com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest();
		class157.testAll();
		com.helger.commons.statistics.StatisticsHandlerCounterTest class158 = new com.helger.commons.statistics.StatisticsHandlerCounterTest();
		class158.testAll();
		com.helger.commons.statistics.StatisticsHandlerSizeTest class159 = new com.helger.commons.statistics.StatisticsHandlerSizeTest();
		class159.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest class160 = new com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest();
		class160.testAll();
		com.helger.commons.statistics.StatisticsHandlerCacheTest class161 = new com.helger.commons.statistics.StatisticsHandlerCacheTest();
		class161.testAll();
		com.helger.commons.statistics.StatisticsManagerTest class162 = new com.helger.commons.statistics.StatisticsManagerTest();
		class162.testCacheHandler();
		class162.testTimerHandler();
		class162.testKeyedTimerHandler();
		class162.testSizeHandler();
		class162.testKeyedSizeHandler();
		class162.testCounterHandler();
		class162.testKeyedCounterHandler();
		com.helger.commons.exception.mock.MockRuntimeExceptionTest class163 = new com.helger.commons.exception.mock.MockRuntimeExceptionTest();
		class163.testEmpty();
		class163.testWithMessage();
		class163.testWithException();
		class163.testWithExceptionAndMessage();
		com.helger.commons.exception.mock.MockExceptionTest class164 = new com.helger.commons.exception.mock.MockExceptionTest();
		try {
			class164.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockException err133) {
			err133.printStackTrace();
		}
		try {
			class164.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err134) {
			err134.printStackTrace();
		}
		try {
			class164.testWithException();
		}
		catch (com.helger.commons.exception.mock.MockException err135) {
			err135.printStackTrace();
		}
		try {
			class164.testWithExceptionAndMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err136) {
			err136.printStackTrace();
		}
		com.helger.commons.exception.mock.MockIOExceptionTest class165 = new com.helger.commons.exception.mock.MockIOExceptionTest();
		try {
			class165.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockIOException err137) {
			err137.printStackTrace();
		}
		try {
			class165.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockIOException err138) {
			err138.printStackTrace();
		}
		com.helger.commons.exception.InitializationExceptionTest class166 = new com.helger.commons.exception.InitializationExceptionTest();
		class166.testAll();
		com.helger.commons.hierarchy.IParentProviderFuncTest class167 = new com.helger.commons.hierarchy.IParentProviderFuncTest();
		class167.testParentProviderHasParent();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest class168 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest();
		class168.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest class169 = new com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest();
		class169.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest class170 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest();
		class170.testAll();
		com.helger.commons.hierarchy.IChildrenProviderTest class171 = new com.helger.commons.hierarchy.IChildrenProviderTest();
		class171.testAll();
		com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest class172 = new com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest();
		class172.testAll();
		com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest class173 = new com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest();
		class173.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingTest class174 = new com.helger.commons.hierarchy.ChildrenProviderSortingTest();
		class174.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest class175 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest();
		class175.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest class176 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest();
		class176.testAll();
		com.helger.commons.ValueEnforcerTest class177 = new com.helger.commons.ValueEnforcerTest();
		class177.testNotNull();
		class177.testNotEmpty1();
		class177.testNotEmpty2();
		class177.testNotEmpty3();
		class177.testNotEmpty4();
		class177.testNotEmpty5();
		class177.testNotEmpty6();
		class177.testNotEmpty7();
		class177.testNotEmpty8();
		class177.testNotEmpty9();
		com.helger.commons.thirdparty.ELicenseTest class178 = new com.helger.commons.thirdparty.ELicenseTest();
		class178.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest class179 = new com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest();
		class179.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleTest class180 = new com.helger.commons.thirdparty.ThirdPartyModuleTest();
		class180.testAll();
		class180.testStd();
		com.helger.commons.thirdparty.CustomLicenseTest class181 = new com.helger.commons.thirdparty.CustomLicenseTest();
		class181.testAll();
		com.helger.commons.http.HttpHeaderMapTest class182 = new com.helger.commons.http.HttpHeaderMapTest();
		class182.testEmpty();
		class182.testSimpleValue();
		class182.testMultipleSimpleValues();
		class182.testMultiValue();
		class182.testAddAllHeadersEmpty();
		class182.testAddAllHeadersPrefilled();
		class182.testAddAllHeadersPrefilledDifferentCasing();
		class182.testAddAllHeadersPrefilledSameName();
		class182.testSetAllHeadersEmpty();
		class182.testSetAllHeadersPrefilled();
		class182.testSetAllHeadersPrefilledSameName();
		class182.testGetUnifiedValues();
		com.helger.commons.typeconvert.TypeConverterExceptionTest class183 = new com.helger.commons.typeconvert.TypeConverterExceptionTest();
		class183.testAll();
		class183.testReason();
		com.helger.commons.typeconvert.IOTypeConverterRegistrarTest class184 = new com.helger.commons.typeconvert.IOTypeConverterRegistrarTest();
		try {
			class184.testConvert();
		}
		catch (java.io.IOException err139) {
			err139.printStackTrace();
		}
		com.helger.commons.typeconvert.TypeConverterTest class185 = new com.helger.commons.typeconvert.TypeConverterTest();
		try {
			class185.testConvertAllToAll();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		class185.testFromBoolean();
		class185.testFromNonNumericString();
		class185.testToString();
		class185.testLocale();
		class185.testArray();
		class185.testBigX();
		class185.testConvertToObject();
		class185.testNoConverterButAssignable();
		class185.testNoConverterNoConversion();
		class185.testBooleanArray();
		class185.testByteArray();
		class185.testCharArray();
		class185.testDoubleArray();
		class185.testFloatArray();
		class185.testIntArray();
		class185.testLongArray();
		class185.testShortArray();
		class185.testPrimitives();
		class185.testSpecials();
		com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest class186 = new com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest();
		class186.testConvert();
		com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest class187 = new com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest();
		class187.testDateTime();
		class187.testLocalDateTime();
		class187.testLocalDate();
		class187.testLocalTime();
		class187.testConvertIntoEachOther();
		com.helger.commons.wrapper.WrapperTest class188 = new com.helger.commons.wrapper.WrapperTest();
		class188.testWrapper();
		com.helger.commons.location.SimpleLocationTest class189 = new com.helger.commons.location.SimpleLocationTest();
		class189.testBasic();
		com.helger.commons.state.EInterruptTest class190 = new com.helger.commons.state.EInterruptTest();
		class190.testAll();
		com.helger.commons.state.ETriStateTest class191 = new com.helger.commons.state.ETriStateTest();
		class191.testAll();
		com.helger.commons.state.SuccessWithValueTest class192 = new com.helger.commons.state.SuccessWithValueTest();
		class192.testAll();
		com.helger.commons.state.EHandledTest class193 = new com.helger.commons.state.EHandledTest();
		class193.testAll();
		com.helger.commons.state.EValidityTest class194 = new com.helger.commons.state.EValidityTest();
		class194.testAll();
		com.helger.commons.state.EEnabledTest class195 = new com.helger.commons.state.EEnabledTest();
		class195.testAll();
		com.helger.commons.state.EContinueTest class196 = new com.helger.commons.state.EContinueTest();
		class196.testAll();
		com.helger.commons.state.ETopBottomTest class197 = new com.helger.commons.state.ETopBottomTest();
		class197.testAll();
		com.helger.commons.state.EMandatoryTest class198 = new com.helger.commons.state.EMandatoryTest();
		class198.testAll();
		com.helger.commons.state.ELeftRightTest class199 = new com.helger.commons.state.ELeftRightTest();
		class199.testAll();
		com.helger.commons.state.ESuccessTest class200 = new com.helger.commons.state.ESuccessTest();
		class200.testAll();
		com.helger.commons.state.EChangeTest class201 = new com.helger.commons.state.EChangeTest();
		class201.testAll();
		com.helger.commons.state.ChangeWithValueTest class202 = new com.helger.commons.state.ChangeWithValueTest();
		class202.testAll();
		com.helger.commons.string.util.RomanNumeralTest class203 = new com.helger.commons.string.util.RomanNumeralTest();
		class203.testBasic();
		class203.testAll();
		com.helger.commons.string.util.LevenshteinDistanceTest class204 = new com.helger.commons.string.util.LevenshteinDistanceTest();
		class204.testGetDistanceString();
		class204.testGetDistanceCharArray();
		class204.testCostsString();
		class204.testCostsCharArray();
		com.helger.commons.string.util.StringScannerTest class205 = new com.helger.commons.string.util.StringScannerTest();
		class205.testAll();
		com.helger.commons.string.StringHelperTest class206 = new com.helger.commons.string.StringHelperTest();
		class206.testHasTextAndHasNoText();
		class206.testLeadingZero();
		class206.testHexEncode();
		class206.testGetHexValue();
		class206.testGetHexChar();
		class206.testHexDecode();
		class206.testHexStringByte();
		class206.testHexStringLeadingZeroByte();
		class206.testHexStringLeadingZero2Byte();
		class206.testHexStringInt();
		class206.testHexStringLeadingZeroInt();
		class206.testHexStringLong();
		class206.testHexStringLeadingZeroLong();
		class206.testHexStringShort();
		class206.testHexStringLeadingZeroShort();
		class206.testGetLeadingWhitespaceCount();
		class206.testGetTrailingWhitespaceCount();
		class206.testGetLeadingCharCount();
		class206.testGetTrailingCharCount();
		class206.testImplodeIterable();
		class206.testImplodeArray();
		class206.testImplodeMap();
		class206.testGetImplodedNonEmptyIterable();
		class206.testGetImplodedNonEmptyArray();
		class206.testGetExplodedToList();
		class206.testGetExplodedToListWithMax();
		class206.testGetExplodedArray();
		class206.testExplodeToSet();
		class206.testExplodeToOrderedSet();
		class206.testGetRepeated();
		class206.testConcatenateOnDemand();
		class206.testStartsWithChar();
		class206.testStartsWithString();
		class206.testEndsWithChar();
		class206.testEndsWithString();
		class206.testGetIndexOfString();
		class206.testGetLastIndexOfString();
		class206.testGetIndexOfChar();
		class206.testGetLastIndexOfChar();
		class206.testContainsString();
		class206.testContainsChar();
		class206.testIndexOfIgnoreCaseString();
		class206.testContainsIgnoreCaseString();
		class206.testGetOccurrenceCountString();
		class206.testGetOccurrenceCountChar();
		class206.testGetOccurrenceCountIgnoreCaseString();
		class206.testGetOccurrenceCountIgnoreCaseChar();
		class206.testTrimLeadingWhitespaces();
		class206.testTrimTrailingWhitespaces();
		class206.testTrimEnd();
		class206.testTrimEndRepeatedlyString();
		class206.testTrimEndRepeatedlyChar();
		class206.testTrimEndInt();
		class206.testTrimStart();
		class206.testTrimStartRepeatedlyString();
		class206.testTrimStartRepeatedlyChar();
		class206.testTrimStartInt();
		class206.testTrim();
		class206.testGetFirstChar();
		class206.testGetLastChar();
		class206.testGetCharCount();
		class206.testGetLineCount();
		class206.testGetCharacterCountInt();
		class206.testGetCharacterCountLong();
		class206.testCutAfterLength();
		class206.testGetNotNullString();
		class206.testGetNotNullCharSeq();
		class206.testReplaceAllString();
		class206.testReplaceAllChar();
		class206.testReplaceAllSafe();
		class206.testReplaceAllRepeatedly();
		class206.testReplaceMultipleMap();
		class206.testReplaceMultipleCharArrays();
		try {
			class206.testReplaceMultipleTo();
		}
		catch (java.io.IOException err141) {
			err141.printStackTrace();
		}
		class206.testReplaceMultipleCharArrayToChar();
		class206.testRemoveAllChar();
		class206.testRemoveAllString();
		class206.testToString();
		class206.testMultiContains();
		class206.testGetWithoutLeadingChar();
		class206.testGetWithoutLeadingChars();
		class206.testGetWithoutTrailingChar();
		class206.testGetWithoutTrailingChars();
		class206.testGetUntilFirstExcl();
		class206.testGetUntilLastExcl();
		class206.testGetUntilFirstIncl();
		class206.testGetUntilLastIncl();
		class206.testGetFromFirstExcl();
		class206.testGetFromLastExcl();
		class206.testGetFromFirstIncl();
		class206.testGetFromLastIncl();
		class206.testGetWithoutWhiteSpaces();
		class206.testGetFirstTokenChar();
		class206.testGetFirstTokenString();
		class206.testGetLastTokenChar();
		class206.testGetLastTokenString();
		class206.testGetReverse();
		class206.testContainsAnyOnlyNoneString();
		class206.testContainsAnyOnlyNoneCharSequence();
		class206.testIsAllWhitespace();
		class206.testGetQuoted();
		class206.testAppendQuotedSB();
		try {
			class206.testAppendQuotedWriter();
		}
		catch (java.io.IOException err142) {
			err142.printStackTrace();
		}
		com.helger.commons.string.StringParserTest class207 = new com.helger.commons.string.StringParserTest();
		class207.testParseBool();
		class207.testParseBoolObj();
		class207.testParseBoolObjExact();
		class207.testParseByte();
		class207.testParseByteObj();
		class207.testParseInt();
		class207.testParseIntObj();
		class207.testParseLong();
		class207.testParseLongObj();
		class207.testParseDouble();
		class207.testParseDoubleObj();
		class207.testParseFloat();
		class207.testParseFloatObj();
		class207.testParseBigInteger();
		class207.testParseBigDecimal();
		class207.testIsInt();
		class207.testIsLong();
		class207.testIsUnsignedInt();
		class207.testIsUnsignedLong();
		class207.testIsDouble();
		class207.testParseUnsignedIntegerObj();
		com.helger.commons.string.ToStringGeneratorTest class208 = new com.helger.commons.string.ToStringGeneratorTest();
		class208.testSimple();
		class208.testCommon();
		class208.testCircularReference();
		com.helger.commons.pool.ObjectPoolTest class209 = new com.helger.commons.pool.ObjectPoolTest();
		try {
			class209.testSimple();
		}
		catch (java.lang.InterruptedException err143) {
			err143.printStackTrace();
		}
		com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest class210 = new com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest();
		class210.testAll();
		class210.testPrefix();
		class210.testSuffix();
		com.helger.commons.format.FormatableObjectTest class211 = new com.helger.commons.format.FormatableObjectTest();
		class211.testAll();
		class211.testImpl();
		com.helger.commons.supplementary.test.code.StringTrieFuncTest class212 = new com.helger.commons.supplementary.test.code.StringTrieFuncTest();
		com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect class213 = new com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull class214 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNullable class215 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNullable();
		com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest class216 = new com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest();
		class216.testPrivateAccessor();
		com.helger.commons.supplementary.test.java.AESCryptFuncTest class217 = new com.helger.commons.supplementary.test.java.AESCryptFuncTest();
		class217.testMe();
		com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest class218 = new com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest();
		class218.testListAllCountries();
		class218.testListAllSerbianCountries();
		com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest class219 = new com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest();
		class219.testListAllDigestProvider();
		com.helger.commons.supplementary.test.java.JavaCharsetFuncTest class220 = new com.helger.commons.supplementary.test.java.JavaCharsetFuncTest();
		class220.testAllCharsets();
		class220.testAllCharsetNamess();
		com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest class221 = new com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest();
		class221.testListPrinterTrays();
		com.helger.commons.supplementary.test.java.JavaExecOrderTest class222 = new com.helger.commons.supplementary.test.java.JavaExecOrderTest();
		class222.testV1();
		class222.testV2();
		class222.testV3();
		com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest class223 = new com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest();
		class223.testGetAllFonts();
		com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest class224 = new com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest();
		class224.testGetResourceThisProject();
		class224.testGetDirectoryThisProject();
		class224.testGetResourceLinkedProject();
		class224.testGetDirectoryLinkedProject_TrailingSlash();
		class224.testGetDirectoryLinkedProject_NoTrailingSlash();
		class224.testGetResourceRuntime();
		class224.testGetDirectoryRuntime();
		com.helger.commons.supplementary.test.java.JavaArrayFuncTest class225 = new com.helger.commons.supplementary.test.java.JavaArrayFuncTest();
		class225.testReflectionIntArray();
		com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest class226 = new com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest();
		class226.testAllCharsets();
		com.helger.commons.supplementary.test.java.JavaCollatorFuncTest class227 = new com.helger.commons.supplementary.test.java.JavaCollatorFuncTest();
		try {
			class227.testCollation();
		}
		catch (java.text.ParseException err144) {
			err144.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest class228 = new com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest();
		class228.testDivide();
		class228.testCompareEquals();
		com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest class229 = new com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest();
		class229.testDecimalFormat();
		class229.testCurrencyNoSymbol();
		class229.testNumberFormatVsToString();
		com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest class230 = new com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest();
		class230.testBitWise();
		class230.testBitWiseOr();
		com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest class231 = new com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest();
		class231.testBasicFormat();
		com.helger.commons.supplementary.test.java.JavaFileFuncTest class232 = new com.helger.commons.supplementary.test.java.JavaFileFuncTest();
		class232.testGetPath();
		com.helger.commons.supplementary.test.java.JavaCommonsFuncTest class233 = new com.helger.commons.supplementary.test.java.JavaCommonsFuncTest();
		class233.testAssignability();
		class233.testAutoboxing();
		class233.testParseBoolean();
		class233.testHexString();
		com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest class234 = new com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest();
		try {
			class234.testAccessRights();
		}
		catch (java.io.IOException err145) {
			err145.printStackTrace();
		}
		catch (java.lang.InterruptedException err146) {
			err146.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaURLFuncTest class235 = new com.helger.commons.supplementary.test.java.JavaURLFuncTest();
		try {
			class235.testURLParts();
		}
		catch (java.net.URISyntaxException err147) {
			err147.printStackTrace();
		}
		catch (java.net.MalformedURLException err148) {
			err148.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest class236 = new com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest();
		class236.testUNC();
		com.helger.commons.supplementary.test.java.FontKerningFuncTest class237 = new com.helger.commons.supplementary.test.java.FontKerningFuncTest();
		try {
			class237.testKerning();
		}
		catch (java.io.IOException err149) {
			err149.printStackTrace();
		}
		com.helger.commons.type.ObjectTypeTest class238 = new com.helger.commons.type.ObjectTypeTest();
		class238.testAll();
		com.helger.commons.type.TypedObjectTest class239 = new com.helger.commons.type.TypedObjectTest();
		class239.testAll();
		com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest class240 = new com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest();
		class240.testSimple();
		com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest class241 = new com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest();
		class241.testSimple();
		com.helger.commons.io.streamprovider.StringInputStreamProviderTest class242 = new com.helger.commons.io.streamprovider.StringInputStreamProviderTest();
		class242.testSimpleCharset();
		class242.testBOM();
		class242.testSerialization();
		com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest class243 = new com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest();
		class243.testSimple();
		com.helger.commons.io.file.IFileFilterFuncTest class244 = new com.helger.commons.io.file.IFileFilterFuncTest();
		class244.testGetFilterFileOnly();
		class244.testGetFilterDirectoryOnly();
		class244.testGetFilterDirectoryPublic();
		class244.testGetParentDirectoryPublic();
		class244.testGetFilterFilenameHidden();
		class244.testFilenameStartsWith();
		class244.testFilenameEndsWith();
		class244.testFilenameEqualsIgnoreCase();
		class244.testFilenameEquals();
		class244.testFilenameMatchAnyRegEx();
		class244.testFilenameMatchNoRegEx();
		com.helger.commons.io.file.EFileIOOperationTest class245 = new com.helger.commons.io.file.EFileIOOperationTest();
		class245.testAll();
		com.helger.commons.io.file.ERandomAccessFileModeTest class246 = new com.helger.commons.io.file.ERandomAccessFileModeTest();
		class246.testAll();
		com.helger.commons.io.file.SimpleFileIOTest class247 = new com.helger.commons.io.file.SimpleFileIOTest();
		class247.testReadFileBytes();
		class247.testReaFileLines();
		class247.testReadFileAsString();
		class247.testWriteFile();
		com.helger.commons.io.file.FileSystemIteratorTest class248 = new com.helger.commons.io.file.FileSystemIteratorTest();
		class248.testCtor();
		com.helger.commons.io.file.FileOperationsTest class249 = new com.helger.commons.io.file.FileOperationsTest();
		class249.testCreateDir();
		class249.testCreateDirIfNotExisting();
		class249.testCreateDirRecursive();
		class249.testCreateDirRecursiveIfNotExisting();
		class249.testRenameDir();
		class249.testRenameFile();
		class249.testCopyFile();
		class249.testCopyDir();
		class249.testDeleteDir();
		class249.testDeleteDirRecursive();
		class249.testDeleteFile();
		com.helger.commons.io.file.PathOperationsTest class250 = new com.helger.commons.io.file.PathOperationsTest();
		class250.testCreateDir();
		class250.testCreateDirIfNotExisting();
		class250.testCreateDirRecursive();
		class250.testCreateDirRecursiveIfNotExisting();
		class250.testRenameDir();
		class250.testRenameFile();
		class250.testCopyFile();
		class250.testCopyDir();
		class250.testDeleteDir();
		class250.testDeleteDirRecursive();
		class250.testDeleteFile();
		com.helger.commons.io.file.FilenameHelperTest class251 = new com.helger.commons.io.file.FilenameHelperTest();
		class251.testGetIndexOfExtension();
		class251.testGetWithoutExtension();
		class251.testGetBaseName();
		class251.testGetExtensionString();
		class251.testGetExtensionFile();
		class251.testGetIndexOfLastSeparator();
		class251.testGetWithoutPath();
		class251.testGetPath();
		class251.testIsValidFilename();
		class251.testIsValidFilenameWithPaths();
		class251.testGetAsValidFilename();
		class251.testGetAsValidASCIIFilename();
		class251.testIsPathSeparatorChar();
		class251.testStartsWithPathSeparatorChar();
		class251.testEndsWithPathSeparatorChar();
		class251.testContainsPathSeparatorChar();
		class251.testHasExtensionString();
		class251.testHasExtensionFile();
		class251.testIsSystemInternalDirectory_String();
		class251.testIsSystemInternalDirectory_File();
		class251.testGetCleanConcatenatedUrlPath();
		class251.testGetCleanPath_File();
		class251.testGetCleanPath_String();
		class251.testMatchPathsIgnoreSepType();
		class251.testGetPathUsingUnixSeparator();
		class251.testEnsurePathEndingWithoutSeparator();
		class251.testEnsurePathEndingWithSeparator();
		class251.testEnsurePathStartingWithSeparator();
		class251.testGetSecureFilename();
		class251.testGetRelativeToParentDirectory();
		class251.testGetAbsoluteWithEnsuredParentDirectory();
		class251.testGetAbsoluteWithEnsuredParentDirectoryAbsolute();
		com.helger.commons.io.file.FileSystemRecursiveIteratorTest class252 = new com.helger.commons.io.file.FileSystemRecursiveIteratorTest();
		class252.testCtor();
		com.helger.commons.io.file.FileHelperTest class253 = new com.helger.commons.io.file.FileHelperTest();
		class253.testExistsFile();
		class253.testExistsDir();
		class253.testEnsureParentDirectoryIsPresent();
		class253.testIsParentDirectory();
		class253.testGetFileSizeDisplay();
		class253.testGetSecureFile();
		class253.testGetInputStream();
		class253.testGetOutputStream();
		try {
			class253.testIsFileNewer();
		}
		catch (java.io.IOException err150) {
			err150.printStackTrace();
		}
		class253.testGetDirectoryObjectCount();
		class253.testSafeEquals();
		com.helger.commons.io.file.EFileIOErrorCodeTest class254 = new com.helger.commons.io.file.EFileIOErrorCodeTest();
		class254.testAll();
		com.helger.commons.io.file.FileOperationManagerTest class255 = new com.helger.commons.io.file.FileOperationManagerTest();
		class255.testCtor();
		class255.testCreateDir();
		class255.testCreateDirIfNotExisting();
		class255.testCreateDirRecursive();
		class255.testCreateDirRecursiveIfNotExisting();
		class255.testRenameDir();
		class255.testRenameFile();
		class255.testDeleteFile();
		class255.testDeleteFileIfExisting();
		class255.testDeleteDir();
		class255.testDeleteDirIfExisting();
		class255.testCopyDirRecursive();
		class255.testCopyFile();
		com.helger.commons.io.file.FileIOErrorTest class256 = new com.helger.commons.io.file.FileIOErrorTest();
		class256.testCtor1();
		class256.testCtor2();
		class256.testCtor3();
		class256.testCtor4();
		class256.testStdMethods();
		com.helger.commons.io.stream.NonClosingInputStreamTest class257 = new com.helger.commons.io.stream.NonClosingInputStreamTest();
		class257.testClosing();
		class257.testNonClosing();
		com.helger.commons.io.stream.WrappedWriterTest class258 = new com.helger.commons.io.stream.WrappedWriterTest();
		try {
			class258.testAll();
		}
		catch (java.io.IOException err151) {
			err151.printStackTrace();
		}
		com.helger.commons.io.stream.CountingInputStreamTest class259 = new com.helger.commons.io.stream.CountingInputStreamTest();
		try {
			class259.testAll();
		}
		catch (java.io.IOException err152) {
			err152.printStackTrace();
		}
		com.helger.commons.io.stream.BitInputStreamTest class260 = new com.helger.commons.io.stream.BitInputStreamTest();
		try {
			class260.testSemantics();
		}
		catch (java.io.IOException err153) {
			err153.printStackTrace();
		}
		try {
			class260.testReadBitLittleEndian();
		}
		catch (java.io.IOException err154) {
			err154.printStackTrace();
		}
		try {
			class260.testReadBitBigEndian();
		}
		catch (java.io.IOException err155) {
			err155.printStackTrace();
		}
		com.helger.commons.io.stream.WrappedOutputStreamTest class261 = new com.helger.commons.io.stream.WrappedOutputStreamTest();
		try {
			class261.testAll();
		}
		catch (java.io.IOException err156) {
			err156.printStackTrace();
		}
		com.helger.commons.io.stream.StringInputStreamTest class262 = new com.helger.commons.io.stream.StringInputStreamTest();
		class262.testAll();
		com.helger.commons.io.stream.WrappedInputStreamTest class263 = new com.helger.commons.io.stream.WrappedInputStreamTest();
		try {
			class263.testAll();
		}
		catch (java.io.IOException err157) {
			err157.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileInputStreamTest class264 = new com.helger.commons.io.stream.CountingFileInputStreamTest();
		try {
			class264.testAll();
		}
		catch (java.io.IOException err158) {
			err158.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingStringWriterTest class265 = new com.helger.commons.io.stream.NonBlockingStringWriterTest();
		try {
			class265.testAll();
		}
		catch (java.io.IOException err159) {
			err159.printStackTrace();
		}
		class265.testError();
		com.helger.commons.io.stream.NonClosingOutputStreamTest class266 = new com.helger.commons.io.stream.NonClosingOutputStreamTest();
		class266.testClosing();
		class266.testNonClosing();
		com.helger.commons.io.stream.WrappedReaderTest class267 = new com.helger.commons.io.stream.WrappedReaderTest();
		try {
			class267.testAll();
		}
		catch (java.io.IOException err160) {
			err160.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest class268 = new com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest();
		try {
			class268.testAll();
		}
		catch (java.io.IOException err161) {
			err161.printStackTrace();
		}
		com.helger.commons.io.stream.StreamHelperTest class269 = new com.helger.commons.io.stream.StreamHelperTest();
		class269.testIsKnownEOFException();
		class269.testClose();
		class269.testCloseWithoutFlush();
		class269.testFlush();
		class269.testCopyInputStreamToOutputStream();
		class269.testCopyInputStreamToOutputStreamWithLimit();
		class269.testGetAvailable();
		class269.testGetAllBytesCharset();
		class269.testReadLines();
		class269.testGetAllBytesAsString();
		class269.testCopyReaderToWriter();
		class269.testCopyReaderToWriterWithLimit();
		class269.testGetAllCharacters();
		class269.testWriteStream();
		class269.testCreateReader();
		class269.testCreateWriter();
		com.helger.commons.io.stream.BitOutputStreamTest class270 = new com.helger.commons.io.stream.BitOutputStreamTest();
		try {
			class270.testSemantics();
		}
		catch (java.io.IOException err162) {
			err162.printStackTrace();
		}
		try {
			class270.testWriteBitLittleEndian();
		}
		catch (java.io.IOException err163) {
			err163.printStackTrace();
		}
		try {
			class270.testWriteBitBigEndian();
		}
		catch (java.io.IOException err164) {
			err164.printStackTrace();
		}
		try {
			class270.testWriteManyLittleEndian();
		}
		catch (java.io.IOException err165) {
			err165.printStackTrace();
		}
		try {
			class270.testWriteManyBigEndian();
		}
		catch (java.io.IOException err166) {
			err166.printStackTrace();
		}
		try {
			class270.testReadWriteRandom();
		}
		catch (java.io.IOException err167) {
			err167.printStackTrace();
		}
		try {
			class270.testWriteManual();
		}
		catch (java.io.IOException err168) {
			err168.printStackTrace();
		}
		com.helger.commons.io.stream.CountingOutputStreamTest class271 = new com.helger.commons.io.stream.CountingOutputStreamTest();
		try {
			class271.testAll();
		}
		catch (java.io.IOException err169) {
			err169.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileOutputStreamTest class272 = new com.helger.commons.io.stream.CountingFileOutputStreamTest();
		try {
			class272.testAll();
		}
		catch (java.io.IOException err170) {
			err170.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest class273 = new com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest();
		try {
			class273.testAll();
		}
		catch (java.io.IOException err171) {
			err171.printStackTrace();
		}
		com.helger.commons.io.EAppendTest class274 = new com.helger.commons.io.EAppendTest();
		class274.testAll();
		com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest class275 = new com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest();
		class275.testAll();
		class275.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest class276 = new com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest();
		class276.testNoPrefix();
		class276.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.DefaultResourceProviderTest class277 = new com.helger.commons.io.resourceprovider.DefaultResourceProviderTest();
		class277.testNoPrefix();
		class277.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.URLResourceProviderTest class278 = new com.helger.commons.io.resourceprovider.URLResourceProviderTest();
		class278.testAll();
		class278.testEqualsAndHashcode();
		com.helger.commons.io.PathFuncTest class279 = new com.helger.commons.io.PathFuncTest();
		try {
			class279.testSimple();
		}
		catch (java.io.IOException err172) {
			err172.printStackTrace();
		}
		try {
			class279.testTraverse1();
		}
		catch (java.io.IOException err173) {
			err173.printStackTrace();
		}
		try {
			class279.testTraverse2();
		}
		catch (java.io.IOException err174) {
			err174.printStackTrace();
		}
		try {
			class279.testIterate1();
		}
		catch (java.io.IOException err175) {
			err175.printStackTrace();
		}
		com.helger.commons.io.provider.FileSystemByteStreamProviderTest class280 = new com.helger.commons.io.provider.FileSystemByteStreamProviderTest();
		class280.testAll();
		com.helger.commons.io.misc.SizeHelperTest class281 = new com.helger.commons.io.misc.SizeHelperTest();
		class281.testCtor();
		class281.testGetAsKB();
		class281.testGetAsMB();
		class281.testGetAsGB();
		class281.testGetAsTB();
		class281.testGetAsPB();
		class281.testGetAsMatching();
		class281.testOutOfBounds();
		com.helger.commons.io.resource.URLResourceTest class282 = new com.helger.commons.io.resource.URLResourceTest();
		try {
			class282.testCtor();
		}
		catch (java.net.MalformedURLException err176) {
			err176.printStackTrace();
		}
		try {
			class282.testAccess();
		}
		catch (java.io.IOException err177) {
			err177.printStackTrace();
		}
		try {
			class282.testSerialize();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		com.helger.commons.io.resource.ClassPathResourceTest class283 = new com.helger.commons.io.resource.ClassPathResourceTest();
		try {
			class283.testValidRoot();
		}
		catch (java.io.IOException err179) {
			err179.printStackTrace();
		}
		class283.testValidRootWithPrefixLong();
		class283.testValidRootWithPrefixShort();
		class283.testValidFolder();
		class283.testInvalid();
		class283.testDefault();
		class283.testFolder();
		com.helger.commons.io.resource.FileSystemResourceTest class284 = new com.helger.commons.io.resource.FileSystemResourceTest();
		class284.testCtor();
		class284.testUNC();
		class284.testAccess();
		class284.testWrite();
		class284.testSerialize();
		com.helger.commons.io.watchdir.WatchDirTest class285 = new com.helger.commons.io.watchdir.WatchDirTest();
		try {
			class285.testRecursive();
		}
		catch (java.io.IOException err180) {
			err180.printStackTrace();
		}
		try {
			class285.testNonRecursive();
		}
		catch (java.io.IOException err181) {
			err181.printStackTrace();
		}
		com.helger.commons.io.relative.FileRelativeIOTest class286 = new com.helger.commons.io.relative.FileRelativeIOTest();
		try {
			class286.testBasePath();
		}
		catch (java.io.IOException err182) {
			err182.printStackTrace();
		}
		com.helger.commons.io.relative.PathRelativeIOTest class287 = new com.helger.commons.io.relative.PathRelativeIOTest();
		class287.testFileBased();
		class287.testURLBased();
		com.helger.commons.io.resourceresolver.DefaultResourceResolverTest class288 = new com.helger.commons.io.resourceresolver.DefaultResourceResolverTest();
		try {
			class288.testBasic();
		}
		catch (java.io.IOException err183) {
			err183.printStackTrace();
		}
		com.helger.commons.CGlobalTest class289 = new com.helger.commons.CGlobalTest();
		class289.testConstants();
		class289.testDefaults();
		com.helger.commons.mutable.MutableLongTest class290 = new com.helger.commons.mutable.MutableLongTest();
		class290.testMutableLong();
		com.helger.commons.mutable.MutableFloatTest class291 = new com.helger.commons.mutable.MutableFloatTest();
		class291.testMutableFloat();
		com.helger.commons.mutable.MutableIntTest class292 = new com.helger.commons.mutable.MutableIntTest();
		class292.testMutableInt();
		com.helger.commons.mutable.MutableBooleanTest class293 = new com.helger.commons.mutable.MutableBooleanTest();
		class293.testMutableBoolean();
		class293.testTypeConversion();
		com.helger.commons.mutable.MutableDoubleTest class294 = new com.helger.commons.mutable.MutableDoubleTest();
		class294.testMutableDouble();
		com.helger.commons.mutable.MutableCharTest class295 = new com.helger.commons.mutable.MutableCharTest();
		class295.testMutableChar();
		com.helger.commons.mutable.MutableByteTest class296 = new com.helger.commons.mutable.MutableByteTest();
		class296.testMutableByte();
		com.helger.commons.mutable.MutableShortTest class297 = new com.helger.commons.mutable.MutableShortTest();
		class297.testMutableByte();
		com.helger.commons.system.CryptoPolicyTest class298 = new com.helger.commons.system.CryptoPolicyTest();
		class298.testIf();
		com.helger.commons.system.JavaVersionHelperTest class299 = new com.helger.commons.system.JavaVersionHelperTest();
		class299.testGetVersion();
		com.helger.commons.system.EProcessorArchitectureTest class300 = new com.helger.commons.system.EProcessorArchitectureTest();
		class300.testAll();
		com.helger.commons.system.EJavaVersionTest class301 = new com.helger.commons.system.EJavaVersionTest();
		class301.testBasic();
		class301.testIsOlderOrEqualsThan();
		class301.testIsNewerOrEqualsThan();
		com.helger.commons.system.SystemHelperTest class302 = new com.helger.commons.system.SystemHelperTest();
		class302.testAll();
		com.helger.commons.system.SystemPropertiesTest class303 = new com.helger.commons.system.SystemPropertiesTest();
		class303.testPrintAll();
		class303.testGetAll();
		class303.testRemove();
		class303.testGetAllJavaNetSystemProperties();
		com.helger.commons.system.ENewLineModeTest class304 = new com.helger.commons.system.ENewLineModeTest();
		class304.testAll();
		com.helger.commons.system.EJVMVendorTest class305 = new com.helger.commons.system.EJVMVendorTest();
		class305.testBasic();
		class305.testIsSun();
		class305.testIsOracle();
		com.helger.commons.system.EOperatingSystemTest class306 = new com.helger.commons.system.EOperatingSystemTest();
		class306.testAll();
		com.helger.commons.aggregate.IAggregatorTest class307 = new com.helger.commons.aggregate.IAggregatorTest();
		class307.testUseFirst();
		class307.testUseLast();
		class307.testGetStringCombinator();
		class307.testGetStringCombinatorWithSeparatorChar();
		class307.testGetStringCombinatorWithSeparatorString();
		class307.testGetStringCombinatorIgnoreNull();
		class307.testGetStringCombinatorWithSeparatorIgnoreEmptyChar();
		class307.testGetStringCombinatorWithSeparatorIgnoreEmptyString();
		com.helger.commons.url.URLParameterListTest class308 = new com.helger.commons.url.URLParameterListTest();
		class308.testBasic();
		com.helger.commons.url.URLParameterEncoderTest class309 = new com.helger.commons.url.URLParameterEncoderTest();
		class309.testEncode();
		com.helger.commons.url.SimpleURLTest class310 = new com.helger.commons.url.SimpleURLTest();
		class310.testGetAsStringWithoutEncodedParameters();
		class310.testGetAsStringWithEncodedParametersDefault();
		class310.testGetAsStringWithEncodedParametersISO88591();
		class310.testAsEncodedString();
		class310.testCtor();
		class310.testDataUrls();
		com.helger.commons.url.URLHelperTest class311 = new com.helger.commons.url.URLHelperTest();
		class311.testGetCleanURL();
		class311.testUrlEncodeDecode();
		class311.testGetURLData();
		class311.testGetInputStream();
		class311.testGetApplicationFormEncoded();
		class311.testIsClassPathURLExisting();
		class311.testGetAsURL();
		class311.testGetAsURI();
		class311.testGetAsFile();
		com.helger.commons.url.URLValidatorTest class312 = new com.helger.commons.url.URLValidatorTest();
		class312.testValid();
		com.helger.commons.url.EURLProtocolTest class313 = new com.helger.commons.url.EURLProtocolTest();
		class313.testBasic();
		com.helger.commons.url.URLParameterDecoderTest class314 = new com.helger.commons.url.URLParameterDecoderTest();
		class314.testDecode();
		com.helger.commons.url.URLProtocolRegistryTest class315 = new com.helger.commons.url.URLProtocolRegistryTest();
		class315.testDefaultsPresent();
		class315.testReinitialize();
		com.helger.commons.url.URLDataTest class316 = new com.helger.commons.url.URLDataTest();
		class316.testGetAsString();
		com.helger.commons.compare.ESortOrderTest class317 = new com.helger.commons.compare.ESortOrderTest();
		class317.testAll();
		com.helger.commons.compare.CompareHelperTest class318 = new com.helger.commons.compare.CompareHelperTest();
		class318.testNullSafeCompare();
		com.helger.commons.compare.IComparatorTest class319 = new com.helger.commons.compare.IComparatorTest();
		class319.testCollating();
		class319.testCollatingOrder();
		class319.testLocaleGerman();
		class319.testComparatorStringLongestFirst();
		com.helger.commons.compare.CollatorHelperTest class320 = new com.helger.commons.compare.CollatorHelperTest();
		class320.testGetCollatorSpaceBeforeDot();
		class320.testSort();
		com.helger.commons.charset.CharsetHelperTest class321 = new com.helger.commons.charset.CharsetHelperTest();
		class321.testCharsetFromName();
		class321.testGetAsBytesCharset();
		class321.testGetAsStringInOtherCharsetCharset();
		try {
			class321.testGreek();
		}
		catch (java.lang.Exception err184) {
			err184.printStackTrace();
		}
		class321.testJavaCompiledAsUTF8();
		class321.testGetUTF8ByteCount();
		class321.testGetUTF8ByteCountRandom();
		class321.testBasic();
		class321.testToUtf8();
		class321.testDiacriticOE();
		com.helger.commons.charset.EUnicodeBOMTest class322 = new com.helger.commons.charset.EUnicodeBOMTest();
		class322.testgetSizeInBytes();
		com.helger.commons.SPITest class323 = new com.helger.commons.SPITest();
		try {
			class323.testBasic();
		}
		catch (java.lang.Exception err185) {
			err185.printStackTrace();
		}
		com.helger.commons.regex.RegExPatternTest class324 = new com.helger.commons.regex.RegExPatternTest();
		class324.testCheckPatternConsistency();
		com.helger.commons.regex.RegExCacheTest class325 = new com.helger.commons.regex.RegExCacheTest();
		class325.testGetPattern();
		com.helger.commons.regex.RegExHelperTest class326 = new com.helger.commons.regex.RegExHelperTest();
		class326.testSplitNoLimit();
		class326.testSplitWithLimit();
		class326.testSplitToListNoLimit();
		class326.testSplitToListWithLimit();
		class326.testMakeIdentifier();
		class326.testGetMatcher();
		class326.testStringMatchesPattern();
		class326.testStringReplacePattern();
		class326.testIsValidPattern();
		class326.testGetAllMatchingGroupValues();
		com.helger.commons.debug.GlobalDebugTest class327 = new com.helger.commons.debug.GlobalDebugTest();
		class327.testInstance();
		class327.testStatic();
	}
}