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
		com.helger.commons.lang.MockCloneNotSupported class54 = new com.helger.commons.lang.MockCloneNotSupported();
		com.helger.commons.lang.ClassPathHelperTest class55 = new com.helger.commons.lang.ClassPathHelperTest();
		class55.testGetAllClassPathEntries();
		try {
			class55.testPrintClassPathEntries();
		}
		catch (java.io.UnsupportedEncodingException err28) {
			err28.printStackTrace();
		}
		com.helger.commons.lang.EnumHelperTest class56 = new com.helger.commons.lang.EnumHelperTest();
		class56.testGetEnumID();
		class56.testGetFromIDString();
		class56.testGetFromIDCaseInsensitiveString();
		class56.testGetFromIDInt();
		com.helger.commons.lang.MockSPIClearableValid class57 = new com.helger.commons.lang.MockSPIClearableValid();
		com.helger.commons.lang.proxy.LoggingInvocationHandlerTest class58 = new com.helger.commons.lang.proxy.LoggingInvocationHandlerTest();
		class58.testBasic();
		class58.testDefaultMethod();
		com.helger.commons.lang.ClassHierarchyCacheTest class59 = new com.helger.commons.lang.ClassHierarchyCacheTest();
		class59.testGetClassHierarchy();
		com.helger.commons.lang.ClassHelperTest class60 = new com.helger.commons.lang.ClassHelperTest();
		class60.testGetClassLoader();
		class60.testIsPublicClass();
		class60.testIsInstancableClass();
		class60.testIsPublic();
		class60.testIsInterface();
		class60.testIsAnnotation();
		class60.testIsEnum();
		class60.testIsAbstract();
		class60.testIsArray();
		class60.testPrimitivesAndWrappers();
		class60.testGetAllPrimtives();
		class60.testIsStringClass();
		class60.testIsCharacterClass();
		class60.testIsBooleanClass();
		class60.testIsFloatingPointClass();
		class60.testIsIntegerClass();
		class60.testGetClassLocalNameClassOfQ();
		class60.testGetClassPackageName();
		class60.testGetSafeClassName();
		class60.testGetDirectoryFromPackage();
		class60.testGetPathFromClass();
		class60.testGetClassFromPath();
		class60.testGetObjectAddress();
		com.helger.commons.lang.BitSetHelperTest class61 = new com.helger.commons.lang.BitSetHelperTest();
		class61.testByte();
		class61.testShort();
		class61.testInt();
		class61.testLong();
		com.helger.commons.lang.TimeValueTest class62 = new com.helger.commons.lang.TimeValueTest();
		class62.testAll();
		com.helger.commons.lang.MockSPIClearableInvalid class63 = new com.helger.commons.lang.MockSPIClearableInvalid();
		com.helger.commons.name.IDisplayNameProviderTest class64 = new com.helger.commons.name.IDisplayNameProviderTest();
		class64.testAll();
		com.helger.commons.name.INameProviderTest class65 = new com.helger.commons.name.INameProviderTest();
		class65.testAll();
		com.helger.commons.hashcode.HashCodeGeneratorTest class66 = new com.helger.commons.hashcode.HashCodeGeneratorTest();
		class66.testIllegalCtor();
		class66.testAppend();
		class66.testSpecialCases();
		try {
			class66.findIllegalValue();
		}
		catch (java.lang.InterruptedException err29) {
			err29.printStackTrace();
		}
		class66.testUniqueness();
		com.helger.commons.mime.MimeTypeDeterminatorTest class67 = new com.helger.commons.mime.MimeTypeDeterminatorTest();
		class67.testGetMIMEType();
		com.helger.commons.mime.MimeTypeParserTest class68 = new com.helger.commons.mime.MimeTypeParserTest();
		class68.testIsToken();
		class68.testCreateFromString();
		class68.testParseValid();
		class68.testParseValidURLEscape();
		class68.testParseInvalid();
		class68.testParseInvalidQuotedString();
		class68.testParseInvalidURLEscape();
		class68.testParseInvalidQuotedPrintable();
		com.helger.commons.mime.EMimeQuotingTest class69 = new com.helger.commons.mime.EMimeQuotingTest();
		class69.testAll();
		com.helger.commons.mime.EMimeContentTypeTest class70 = new com.helger.commons.mime.EMimeContentTypeTest();
		class70.testAll();
		com.helger.commons.mime.MimeTypeParameterTest class71 = new com.helger.commons.mime.MimeTypeParameterTest();
		class71.testBasic();
		com.helger.commons.mime.MimeTypeTest class72 = new com.helger.commons.mime.MimeTypeTest();
		class72.testCtor();
		class72.testParameters();
		class72.testSpecialCharsInParams();
		com.helger.commons.factory.FactoryNewInstanceTest class73 = new com.helger.commons.factory.FactoryNewInstanceTest();
		class73.testGetNewInstanceFactory();
		class73.testGetNewInstanceFactorySafe();
		class73.testEqualsAndHashCode();
		com.helger.commons.csv.IntegrationFuncTest class74 = new com.helger.commons.csv.IntegrationFuncTest();
		try {
			class74.testWriteRead();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		com.helger.commons.csv.CSVParserTest class75 = new com.helger.commons.csv.CSVParserTest();
		try {
			class75.testParseLine();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class75.parseSimpleString();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class75.parseSimpleQuotedString();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class75.parseSimpleQuotedStringWithSpaces();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class75.testParsedLineWithInternalQuota();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		try {
			class75.parseQuotedStringWithCommas();
		}
		catch (java.io.IOException err36) {
			err36.printStackTrace();
		}
		try {
			class75.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err37) {
			err37.printStackTrace();
		}
		try {
			class75.parseQuotedStringWithDefinedSeperatorAndQuote();
		}
		catch (java.io.IOException err38) {
			err38.printStackTrace();
		}
		try {
			class75.parseEmptyElements();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class75.parseMultiLinedQuoted();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class75.parseMultiLinedQuotedwithCarriageReturns();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class75.testADoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class75.testEscapedDoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class75.parseQuotedQuoteCharacters();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class75.parseMultipleQuotes();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class75.parseTrickyString();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class75.testAMultiLineInsideQuotes();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class75.testStrictQuoteSimple();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class75.testNotStrictQuoteSimple();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class75.testStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class75.testNotStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class75.testStrictQuoteWithGarbage();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class75.testCanIgnoreQuotations();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		class75.testFalseIgnoreQuotations();
		try {
			class75.testIssue3314579();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class75.testIssue2263439();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class75.testIssue2859181();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class75.testIssue2726363();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class75.anIOExceptionThrownifStringEndsInsideAQuotedString();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		try {
			class75.parseLineMultiAllowsQuotesAcrossMultipleLines();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class75.pendingIsClearedAfterCallToParseLine();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class75.returnPendingIfNullIsPassedIntoParseLineMulti();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class75.spacesAtEndOfQuotedStringDoNotCountIfStrictQuotesIsTrue();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class75.returnNullWhenNullPassedIn();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		class75.validateEscapeStringBeforeRealTest();
		class75.whichCharactersAreEscapable();
		try {
			class75.whitespaceBeforeEscape();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class75.testIssue2958242WithoutQuotes();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		class75.quoteAndEscapeCannotBeTheSame();
		class75.quoteAndEscapeCanBeTheSameIfNull();
		class75.separatorCharacterCannotBeNull();
		class75.separatorAndEscapeCannotBeTheSame();
		class75.separatorAndQuoteCannotBeTheSame();
		try {
			class75.parserHandlesNullInString();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		com.helger.commons.csv.CSVWriterTest class76 = new com.helger.commons.csv.CSVWriterTest();
		try {
			class76.correctlyParseNullString();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class76.correctlyParserNullObject();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class76.testParseLine();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		try {
			class76.testSpecialCharacters();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class76.parseLineWithBothEscapeAndQuoteChar();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class76.testParseLineWithNoEscapeChar();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		try {
			class76.parseLineWithNoEscapeCharAndQuotes();
		}
		catch (java.io.IOException err73) {
			err73.printStackTrace();
		}
		try {
			class76.testWriteAll();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class76.testWriteAllObjects();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		try {
			class76.testNoQuoteChars();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		try {
			class76.testNoQuoteCharsAndNoEscapeChars();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		try {
			class76.testIntelligentQuotes();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class76.testNullValues();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		try {
			class76.testStreamFlushing();
		}
		catch (java.io.IOException err80) {
			err80.printStackTrace();
		}
		try {
			class76.flushWillThrowIOException();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		class76.flushQuietlyWillNotThrowException();
		try {
			class76.testAlternateEscapeChar();
		}
		catch (java.io.IOException err82) {
			err82.printStackTrace();
		}
		try {
			class76.testNoQuotingNoEscaping();
		}
		catch (java.io.IOException err83) {
			err83.printStackTrace();
		}
		try {
			class76.testNestedQuotes();
		}
		catch (java.io.IOException err84) {
			err84.printStackTrace();
		}
		try {
			class76.testAlternateLineFeeds();
		}
		catch (java.io.IOException err85) {
			err85.printStackTrace();
		}
		try {
			class76.testAvoidFinalLineEnd();
		}
		catch (java.io.IOException err86) {
			err86.printStackTrace();
		}
		try {
			class76.testApplyQuotesToAll();
		}
		catch (java.io.IOException err87) {
			err87.printStackTrace();
		}
		com.helger.commons.csv.CSVReaderTest class77 = new com.helger.commons.csv.CSVReaderTest();
		try {
			class77.testParseLine();
		}
		catch (java.io.IOException err88) {
			err88.printStackTrace();
		}
		try {
			class77.readerCanHandleNullInString();
		}
		catch (java.io.IOException err89) {
			err89.printStackTrace();
		}
		try {
			class77.testParseLineStrictQuote();
		}
		catch (java.io.IOException err90) {
			err90.printStackTrace();
		}
		try {
			class77.testParseAll();
		}
		catch (java.io.IOException err91) {
			err91.printStackTrace();
		}
		try {
			class77.testOptionalConstructors();
		}
		catch (java.io.IOException err92) {
			err92.printStackTrace();
		}
		try {
			class77.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err93) {
			err93.printStackTrace();
		}
		try {
			class77.testSkippingLines();
		}
		catch (java.io.IOException err94) {
			err94.printStackTrace();
		}
		try {
			class77.testSkippingLinesWithDifferentEscape();
		}
		catch (java.io.IOException err95) {
			err95.printStackTrace();
		}
		try {
			class77.testNormalParsedLine();
		}
		catch (java.io.IOException err96) {
			err96.printStackTrace();
		}
		try {
			class77.testASingleQuoteAsDataElement();
		}
		catch (java.io.IOException err97) {
			err97.printStackTrace();
		}
		try {
			class77.testASingleQuoteAsDataElementWithEmptyField();
		}
		catch (java.io.IOException err98) {
			err98.printStackTrace();
		}
		try {
			class77.testSpacesAtEndOfString();
		}
		catch (java.io.IOException err99) {
			err99.printStackTrace();
		}
		try {
			class77.testEscapedQuote();
		}
		catch (java.io.IOException err100) {
			err100.printStackTrace();
		}
		try {
			class77.testEscapedEscape();
		}
		catch (java.io.IOException err101) {
			err101.printStackTrace();
		}
		try {
			class77.testSingleQuoteWhenDoubleQuoteIsQuoteChar();
		}
		catch (java.io.IOException err102) {
			err102.printStackTrace();
		}
		try {
			class77.testQuotedParsedLine();
		}
		catch (java.io.IOException err103) {
			err103.printStackTrace();
		}
		try {
			class77.bug106ParseLineWithCarriageReturnNewLineStrictQuotes();
		}
		catch (java.io.IOException err104) {
			err104.printStackTrace();
		}
		try {
			class77.testIssue2992134OutOfPlaceQuotes();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
		class77.quoteAndEscapeMustBeDifferent();
		class77.separatorAndEscapeMustBeDifferent();
		class77.separatorAndQuoteMustBeDifferent();
		try {
			class77.testIteratorFunctionality();
		}
		catch (java.io.IOException err106) {
			err106.printStackTrace();
		}
		try {
			class77.canCloseReader();
		}
		catch (java.io.IOException err107) {
			err107.printStackTrace();
		}
		try {
			class77.canCreateIteratorFromReader();
		}
		catch (java.io.IOException err108) {
			err108.printStackTrace();
		}
		try {
			class77.attemptToReadCloseStreamReturnsNull();
		}
		catch (java.io.IOException err109) {
			err109.printStackTrace();
		}
		try {
			class77.testIssue102();
		}
		catch (java.io.IOException err110) {
			err110.printStackTrace();
		}
		try {
			class77.issue108ReaderPlaysWellWithChannels();
		}
		catch (java.io.IOException err111) {
			err111.printStackTrace();
		}
		com.helger.commons.csv.UnicodeFuncTest class78 = new com.helger.commons.csv.UnicodeFuncTest();
		try {
			class78.canParseUnicode();
		}
		catch (java.io.IOException err112) {
			err112.printStackTrace();
		}
		try {
			class78.readerTest();
		}
		catch (java.io.IOException err113) {
			err113.printStackTrace();
		}
		class78.writerTest();
		try {
			class78.runUniCodeThroughCSVReader();
		}
		catch (java.io.IOException err114) {
			err114.printStackTrace();
		}
		try {
			class78.runUniCodeThroughCSVWriter();
		}
		catch (java.io.IOException err115) {
			err115.printStackTrace();
		}
		try {
			class78.runASCIIThroughCSVWriter();
		}
		catch (java.io.IOException err116) {
			err116.printStackTrace();
		}
		try {
			class78.writeThenReadAscii();
		}
		catch (java.io.IOException err117) {
			err117.printStackTrace();
		}
		try {
			class78.writeThenReadTwiceAscii();
		}
		catch (java.io.IOException err118) {
			err118.printStackTrace();
		}
		try {
			class78.writeThenReadTwiceUnicode();
		}
		catch (java.io.IOException err119) {
			err119.printStackTrace();
		}
		try {
			class78.writeThenReadTwiceMixedUnicode();
		}
		catch (java.io.IOException err120) {
			err120.printStackTrace();
		}
		com.helger.commons.csv.ICSVLineReaderTest class79 = new com.helger.commons.csv.ICSVLineReaderTest();
		try {
			class79.lineReaderWillKeepCR();
		}
		catch (java.io.IOException err121) {
			err121.printStackTrace();
		}
		try {
			class79.lineReaderWillRemoveCR();
		}
		catch (java.io.IOException err122) {
			err122.printStackTrace();
		}
		try {
			class79.lineReaderKeepingCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err123) {
			err123.printStackTrace();
		}
		try {
			class79.lineReaderNoCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err124) {
			err124.printStackTrace();
		}
		try {
			class79.lineReaderKeepingCRWillHandleEmptyString();
		}
		catch (java.io.IOException err125) {
			err125.printStackTrace();
		}
		try {
			class79.lineReaderNoCRWillHandleEmptyString();
		}
		catch (java.io.IOException err126) {
			err126.printStackTrace();
		}
		com.helger.commons.csv.CSVIteratorTest class80 = new com.helger.commons.csv.CSVIteratorTest();
		try {
			class80.removethrowsUnsupportedOperationException();
		}
		catch (java.io.IOException err127) {
			err127.printStackTrace();
		}
		try {
			class80.initialReadReturnsStrings();
		}
		catch (java.io.IOException err128) {
			err128.printStackTrace();
		}
		try {
			class80.hasNextWorks();
		}
		catch (java.io.IOException err129) {
			err129.printStackTrace();
		}
		com.helger.commons.log.LogMessageTest class81 = new com.helger.commons.log.LogMessageTest();
		class81.testAll();
		com.helger.commons.log.LogHelperTest class82 = new com.helger.commons.log.LogHelperTest();
		class82.testAll();
		com.helger.commons.log.InMemoryLoggerTest class83 = new com.helger.commons.log.InMemoryLoggerTest();
		class83.testAll();
		com.helger.commons.vendor.VendorInfoTest class84 = new com.helger.commons.vendor.VendorInfoTest();
		class84.testHeaderLines();
		class84.testInceptionYear();
		class84.testEmail();
		class84.testURL();
		com.helger.commons.text.util.PunycodeTest class85 = new com.helger.commons.text.util.PunycodeTest();
		class85.testPunycode();
		com.helger.commons.text.util.TextHelperTest class86 = new com.helger.commons.text.util.TextHelperTest();
		class86.testGetFormattedText();
		class86.testGetCopyWithLocales();
		class86.testCreateMultilingualTextFromMap();
		com.helger.commons.text.util.ABNFTest class87 = new com.helger.commons.text.util.ABNFTest();
		class87.testIsAlpha();
		class87.testIsBit();
		class87.testIsChar();
		class87.testIsCR();
		class87.testIsCtl();
		class87.testIsDigit();
		class87.testIsDQuote();
		class87.testIsHexDigit();
		class87.testIsHexDigitCaseInsensitive();
		class87.testIsHTab();
		class87.testIsLF();
		class87.testIsOctet();
		class87.testIsSP();
		class87.testIsVChar();
		class87.testIsWSP();
		com.helger.commons.text.ConstantHasTextWithArgsTest class88 = new com.helger.commons.text.ConstantHasTextWithArgsTest();
		class88.testAll();
		class88.testStandard();
		com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest class89 = new com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest();
		class89.testAll();
		com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest class90 = new com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest();
		class90.testAll();
		com.helger.commons.text.resourcebundle.ResourceBundleHelperTest class91 = new com.helger.commons.text.resourcebundle.ResourceBundleHelperTest();
		class91.testGetString();
		class91.testGetUtf8String();
		com.helger.commons.text.resourcebundle.ResourceBundleKeyTest class92 = new com.helger.commons.text.resourcebundle.ResourceBundleKeyTest();
		class92.testCtor();
		class92.testISO8859();
		class92.testUTF8();
		com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest class93 = new com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest();
		class93.testISO8859();
		com.helger.commons.text.MockChangeCallback class94 = new com.helger.commons.text.MockChangeCallback();
		com.helger.commons.text.ConstantHasTextTest class95 = new com.helger.commons.text.ConstantHasTextTest();
		class95.testAll();
		class95.testStandard();
		com.helger.commons.text.display.HasDisplayTextWithArgsTest class96 = new com.helger.commons.text.display.HasDisplayTextWithArgsTest();
		class96.testAll();
		com.helger.commons.text.display.IDisplayTextProviderTest class97 = new com.helger.commons.text.display.IDisplayTextProviderTest();
		class97.testAll();
		com.helger.commons.text.MultilingualTextTest class98 = new com.helger.commons.text.MultilingualTextTest();
		class98.testCtor();
		class98.testAddText();
		class98.testSetText();
		class98.testEquals();
		class98.testRemoveAll();
		class98.testAssignFrom();
		class98.testGetText();
		class98.testGetTextWithArgs();
		class98.testIsEmpty();
		class98.testQuotes();
		com.helger.commons.text.resolve.DefaultTextResolverTest class99 = new com.helger.commons.text.resolve.DefaultTextResolverTest();
		class99.testGetText();
		class99.testGetTextWithArgs();
		com.helger.commons.text.ReadOnlyMultilingualTextTest class100 = new com.helger.commons.text.ReadOnlyMultilingualTextTest();
		class100.testCtor();
		com.helger.commons.codec.IByteArrayCodecTest class101 = new com.helger.commons.codec.IByteArrayCodecTest();
		class101.testArbitraryCodecs();
		com.helger.commons.codec.RunLengthCodecTest class102 = new com.helger.commons.codec.RunLengthCodecTest();
		class102.testDecode();
		com.helger.commons.codec.ICharArrayCodecTest class103 = new com.helger.commons.codec.ICharArrayCodecTest();
		class103.testArbitraryCodecs();
		com.helger.commons.codec.GZIPCodecTest class104 = new com.helger.commons.codec.GZIPCodecTest();
		class104.testDecode();
		com.helger.commons.codec.ASCIIHexCodecTest class105 = new com.helger.commons.codec.ASCIIHexCodecTest();
		class105.testDecode();
		com.helger.commons.codec.RFC2616CodecTest class106 = new com.helger.commons.codec.RFC2616CodecTest();
		class106.testEncode();
		class106.testDecode();
		class106.testIsToken();
		com.helger.commons.codec.Base32CodecTest class107 = new com.helger.commons.codec.Base32CodecTest();
		class107.testGetEncodedLength();
		class107.testEncode();
		class107.testGetDecodedLength();
		class107.testDecode();
		com.helger.commons.codec.Base64CodecTest class108 = new com.helger.commons.codec.Base64CodecTest();
		class108.testGetEncodedLength();
		class108.testGetDecodedLength();
		com.helger.commons.codec.FlateCodecTest class109 = new com.helger.commons.codec.FlateCodecTest();
		class109.testDecode();
		com.helger.commons.codec.LZWCodecTest class110 = new com.helger.commons.codec.LZWCodecTest();
		class110.testDecode();
		class110.testEncode1();
		class110.testEncode2();
		class110.testArbitraryCodeLengthSwitches();
		class110.testArbitraryLargeBuffers();
		class110.testRandomArbitraryLargeBuffers();
		com.helger.commons.codec.ASCII85CodecTest class111 = new com.helger.commons.codec.ASCII85CodecTest();
		class111.testDecode();
		com.helger.commons.locale.country.ECountryNameTest class112 = new com.helger.commons.locale.country.ECountryNameTest();
		class112.testAll();
		com.helger.commons.locale.country.CountryCacheTest class113 = new com.helger.commons.locale.country.CountryCacheTest();
		class113.testGetCountryOfLocale();
		class113.testGetCountry();
		class113.testAddCountryNull();
		class113.testAddCountryEmpty();
		class113.testAddCountryIllegal();
		class113.testAddCountryInvalidCasing();
		class113.testAddCountry();
		class113.testContainsCountryByLocale();
		class113.testResetCache();
		class113.testContainsCountryByString();
		class113.testNoConcurrentModification();
		class113.testNoConcurrentModification2();
		class113.testResolve();
		com.helger.commons.locale.country.ECountryTest class114 = new com.helger.commons.locale.country.ECountryTest();
		class114.testAll();
		com.helger.commons.locale.country.ECountrySubNameTest class115 = new com.helger.commons.locale.country.ECountrySubNameTest();
		class115.testAll();
		com.helger.commons.locale.ELocaleNameTest class116 = new com.helger.commons.locale.ELocaleNameTest();
		class116.testAll();
		com.helger.commons.locale.LocaleFormatterTest class117 = new com.helger.commons.locale.LocaleFormatterTest();
		class117.testGetFormatted_Double();
		class117.testGetFormatted_Int();
		class117.testGetFormatted_Long();
		class117.testGetFormattedBigInteger();
		class117.testGetFormattedPercent();
		class117.testGetFormattedPercent_Scale();
		com.helger.commons.locale.LocaleHelperTest class118 = new com.helger.commons.locale.LocaleHelperTest();
		class118.testGetLocaleDisplayName();
		class118.testGetLocaleNativeDisplayName();
		class118.testGetAllLocaleDisplayNames();
		class118.testGetCalculatedLocaleListForResolving();
		class118.testGetLocaleFromString();
		class118.testGetLocaleToUseOrFallback();
		class118.testIsSpecialLocale();
		class118.testIsSpecialLocaleCode();
		class118.testGetValidLanguageCode();
		class118.testGetValidCountryCode();
		com.helger.commons.locale.language.LanguageCacheTest class119 = new com.helger.commons.locale.language.LanguageCacheTest();
		class119.testGetLanguageOfLocale();
		class119.testGetLanguage();
		class119.testAddLanguageNull();
		class119.testAddLanguageEmpty();
		class119.testAddLanguageIllegal();
		class119.testAddLanguageInvalidCasing();
		class119.testAddLanguage();
		class119.testContainsLanguageByLocale();
		class119.testResetCache();
		class119.testContainsLanguageByString();
		class119.testNoConcurrentModification();
		class119.testNoConcurrentModification2();
		com.helger.commons.locale.LocaleParserTest class120 = new com.helger.commons.locale.LocaleParserTest();
		class120.testParse();
		class120.testParseDouble();
		class120.testParseInt();
		class120.testParseLong();
		class120.testParseBigDecimal();
		com.helger.commons.locale.LocaleCacheTest class121 = new com.helger.commons.locale.LocaleCacheTest();
		class121.testGet();
		class121.testGetInvalid();
		class121.testGetAllLocales();
		class121.testGetAllLanguages();
		class121.testContainsLocale();
		class121.testResetCache();
		com.helger.commons.id.IHasLongIDTest class122 = new com.helger.commons.id.IHasLongIDTest();
		class122.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest class123 = new com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest();
		class123.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest class124 = new com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest();
		class124.testAll();
		com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest class125 = new com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest();
		class125.testAll();
		com.helger.commons.id.factory.FileIntIDFactoryTest class126 = new com.helger.commons.id.factory.FileIntIDFactoryTest();
		class126.testAll();
		com.helger.commons.id.factory.MemoryLongIDFactoryTest class127 = new com.helger.commons.id.factory.MemoryLongIDFactoryTest();
		class127.testAll();
		com.helger.commons.id.factory.MemoryIntIDFactoryTest class128 = new com.helger.commons.id.factory.MemoryIntIDFactoryTest();
		class128.testAll();
		com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest class129 = new com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest();
		class129.testAll();
		com.helger.commons.id.factory.FileLongIDFactoryTest class130 = new com.helger.commons.id.factory.FileLongIDFactoryTest();
		class130.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest class131 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest();
		class131.testAll();
		com.helger.commons.id.factory.GlobalIDFactoryTest class132 = new com.helger.commons.id.factory.GlobalIDFactoryTest();
		class132.testSet();
		class132.testGetNewID();
		class132.testNoFactories();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest class133 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest();
		class133.testAll();
		com.helger.commons.id.IIntIDProviderTest class134 = new com.helger.commons.id.IIntIDProviderTest();
		class134.testAll();
		com.helger.commons.id.IHasIntIDTest class135 = new com.helger.commons.id.IHasIntIDTest();
		class135.testAll();
		com.helger.commons.id.IIDProviderTest class136 = new com.helger.commons.id.IIDProviderTest();
		class136.testAll();
		com.helger.commons.id.ILongIDProviderTest class137 = new com.helger.commons.id.ILongIDProviderTest();
		class137.testAll();
		com.helger.commons.callback.CallbackListTest class138 = new com.helger.commons.callback.CallbackListTest();
		class138.testBasic();
		com.helger.commons.callback.exception.LoggingExceptionCallbackTest class139 = new com.helger.commons.callback.exception.LoggingExceptionCallbackTest();
		class139.testAll();
		com.helger.commons.random.VerySecureRandomTest class140 = new com.helger.commons.random.VerySecureRandomTest();
		class140.testRandomGen();
		com.helger.commons.datetime.PDTFormatPatternsTest class141 = new com.helger.commons.datetime.PDTFormatPatternsTest();
		class141.testGetPattern();
		com.helger.commons.datetime.PDTConfigTest class142 = new com.helger.commons.datetime.PDTConfigTest();
		class142.testTimeZones();
		com.helger.commons.datetime.PDTFactoryTest class143 = new com.helger.commons.datetime.PDTFactoryTest();
		class143.testCurrent();
		class143.testCreateLocalDate();
		com.helger.commons.datetime.PDTFromStringTest class144 = new com.helger.commons.datetime.PDTFromStringTest();
		class144.testFromString();
		class144.testDateTimeFromString();
		class144.testLocalDateFromString();
		class144.testDefaultToStringAndBack();
		com.helger.commons.datetime.PDTFormatterTest class145 = new com.helger.commons.datetime.PDTFormatterTest();
		class145.testGetDefaultFormatter();
		class145.testGetForPattern();
		class145.testGetDefault();
		class145.testLeadingZero();
		class145.testSpecialCases();
		class145.testPrintDateExplicit();
		class145.testPrintAndParseDate();
		com.helger.commons.datetime.PDTWebDateHelperTest class146 = new com.helger.commons.datetime.PDTWebDateHelperTest();
		class146.testRfc822();
		class146.testW3CTime();
		class146.testXSDDateTime();
		class146.testXSDLocalDate();
		class146.testXSDLocalDateTime();
		com.helger.commons.gfx.ImageDataManagerTest class147 = new com.helger.commons.gfx.ImageDataManagerTest();
		class147.testGetImageSize();
		com.helger.commons.equals.EqualsHelperTest class148 = new com.helger.commons.equals.EqualsHelperTest();
		class148.testEquals_Float();
		class148.testEquals_Double();
		try {
			class148.testEquals_URL();
		}
		catch (java.net.MalformedURLException err130) {
			err130.printStackTrace();
		}
		class148.testEquals_BigDecimal();
		class148.testEquals_PasswordAuthentication();
		try {
			class148.testNullSafeEquals();
		}
		catch (java.net.MalformedURLException err131) {
			err131.printStackTrace();
		}
		class148.testEqualsTypeSpecific();
		class148.testBasic();
		class148.testList();
		class148.testSet();
		class148.testMap();
		class148.testArray();
		class148.testArrayComplex();
		class148.testComplex();
		class148.testIterator();
		class148.testIterable();
		class148.testEnumeration();
		class148.testEqualsAsCollection();
		com.helger.commons.equals.EqualsImplementationRegistryTest class149 = new com.helger.commons.equals.EqualsImplementationRegistryTest();
		try {
			class149.testEquals();
		}
		catch (javax.xml.parsers.ParserConfigurationException err132) {
			err132.printStackTrace();
		}
		com.helger.commons.version.VersionRangeTest class150 = new com.helger.commons.version.VersionRangeTest();
		class150.testVersionRange();
		class150.testCtor1();
		class150.testCtor2();
		class150.testVersionMatches();
		class150.testGetAsString();
		class150.testGetAsStringPrintZeroElements();
		class150.testCompareTo();
		class150.testEquals();
		class150.testSerialization();
		com.helger.commons.version.VersionTest class151 = new com.helger.commons.version.VersionTest();
		class151.testVersionIntIntInt();
		class151.testVersionString();
		class151.testCompareTo();
		class151.testEqualsObject();
		class151.testGetAsString();
		class151.testGetAsStringBoolean();
		class151.testHashCode();
		class151.testCompare();
		class151.testSerialization();
		com.helger.commons.math.CombinationGeneratorTest class152 = new com.helger.commons.math.CombinationGeneratorTest();
		class152.testStringCombination();
		class152.testStringCombination2();
		class152.testCtor();
		com.helger.commons.math.RoundHelperTest class153 = new com.helger.commons.math.RoundHelperTest();
		class153.testDecimalType();
		class153.testGetRounded();
		class153.testGetRoundedUpFix();
		class153.testGetFormatted();
		class153.testGetRoundedEvenExp();
		class153.testGetFormattedFix();
		class153.testGetFormattedExp();
		com.helger.commons.math.FactorialHelperTest class154 = new com.helger.commons.math.FactorialHelperTest();
		class154.testSmall();
		class154.testGetAnyFactorialLinear();
		com.helger.commons.math.CombinationGeneratorFlexibleTest class155 = new com.helger.commons.math.CombinationGeneratorFlexibleTest();
		class155.testStringCombination();
		class155.testCtor();
		class155.testHugeDataSet();
		class155.testRedundancy();
		com.helger.commons.math.MathHelperTest class156 = new com.helger.commons.math.MathHelperTest();
		class156.testGetRoundedUp();
		class156.testGetDividedDouble();
		class156.testGetDividedBigDecimal();
		class156.testIntDivide();
		class156.testLongDivide();
		class156.testLongToInt();
		class156.testGetMaxInt();
		class156.testGetMaxLong();
		class156.testGetMaxFloat();
		class156.testGetMaxDouble();
		class156.testGetMinInt();
		class156.testGetMinLong();
		class156.testGetMinFloat();
		class156.testGetMinDouble();
		class156.testAbsInt();
		class156.testAbsLong();
		class156.testAbsFloat();
		class156.testAbsDouble();
		class156.testGetUnsignedInt();
		class156.testGetWithoutTrailingZeroes();
		class156.testGetFractionDigits();
		class156.testAddPercent();
		class156.testSubtractPercent();
		class156.testGetPercentValue();
		class156.testIsExactlyOneBitSetToOneInt();
		class156.testIsExactlyOneBitSetToOneLong();
		com.helger.commons.functional.IPredicateFuncTest class157 = new com.helger.commons.functional.IPredicateFuncTest();
		class157.testAll();
		class157.testNone();
		class157.testNotNull();
		class157.testIsNull();
		class157.testNegate();
		com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest class158 = new com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest();
		class158.testAll();
		com.helger.commons.statistics.util.StatisticsVisitorTest class159 = new com.helger.commons.statistics.util.StatisticsVisitorTest();
		class159.testWalkStatistics();
		com.helger.commons.statistics.StatisticsHandlerTimerTest class160 = new com.helger.commons.statistics.StatisticsHandlerTimerTest();
		class160.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest class161 = new com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest();
		class161.testAll();
		com.helger.commons.statistics.StatisticsHandlerCounterTest class162 = new com.helger.commons.statistics.StatisticsHandlerCounterTest();
		class162.testAll();
		com.helger.commons.statistics.StatisticsHandlerSizeTest class163 = new com.helger.commons.statistics.StatisticsHandlerSizeTest();
		class163.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest class164 = new com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest();
		class164.testAll();
		com.helger.commons.statistics.StatisticsHandlerCacheTest class165 = new com.helger.commons.statistics.StatisticsHandlerCacheTest();
		class165.testAll();
		com.helger.commons.statistics.StatisticsManagerTest class166 = new com.helger.commons.statistics.StatisticsManagerTest();
		class166.testCacheHandler();
		class166.testTimerHandler();
		class166.testKeyedTimerHandler();
		class166.testSizeHandler();
		class166.testKeyedSizeHandler();
		class166.testCounterHandler();
		class166.testKeyedCounterHandler();
		com.helger.commons.exception.mock.MockRuntimeExceptionTest class167 = new com.helger.commons.exception.mock.MockRuntimeExceptionTest();
		class167.testEmpty();
		class167.testWithMessage();
		class167.testWithException();
		class167.testWithExceptionAndMessage();
		com.helger.commons.exception.mock.MockExceptionTest class168 = new com.helger.commons.exception.mock.MockExceptionTest();
		try {
			class168.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockException err133) {
			err133.printStackTrace();
		}
		try {
			class168.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err134) {
			err134.printStackTrace();
		}
		try {
			class168.testWithException();
		}
		catch (com.helger.commons.exception.mock.MockException err135) {
			err135.printStackTrace();
		}
		try {
			class168.testWithExceptionAndMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err136) {
			err136.printStackTrace();
		}
		com.helger.commons.exception.mock.MockIOExceptionTest class169 = new com.helger.commons.exception.mock.MockIOExceptionTest();
		try {
			class169.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockIOException err137) {
			err137.printStackTrace();
		}
		try {
			class169.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockIOException err138) {
			err138.printStackTrace();
		}
		com.helger.commons.exception.InitializationExceptionTest class170 = new com.helger.commons.exception.InitializationExceptionTest();
		class170.testAll();
		com.helger.commons.hierarchy.IParentProviderFuncTest class171 = new com.helger.commons.hierarchy.IParentProviderFuncTest();
		class171.testParentProviderHasParent();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest class172 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest();
		class172.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest class173 = new com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest();
		class173.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest class174 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest();
		class174.testAll();
		com.helger.commons.hierarchy.IChildrenProviderTest class175 = new com.helger.commons.hierarchy.IChildrenProviderTest();
		class175.testAll();
		com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest class176 = new com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest();
		class176.testAll();
		com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest class177 = new com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest();
		class177.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingTest class178 = new com.helger.commons.hierarchy.ChildrenProviderSortingTest();
		class178.testAll();
		com.helger.commons.hierarchy.MockChildrenProviderWithID class179 = new com.helger.commons.hierarchy.MockChildrenProviderWithID();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest class180 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest();
		class180.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest class181 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest();
		class181.testAll();
		com.helger.commons.ValueEnforcerTest class182 = new com.helger.commons.ValueEnforcerTest();
		class182.testNotNull();
		class182.testNotEmpty1();
		class182.testNotEmpty2();
		class182.testNotEmpty3();
		class182.testNotEmpty4();
		class182.testNotEmpty5();
		class182.testNotEmpty6();
		class182.testNotEmpty7();
		class182.testNotEmpty8();
		class182.testNotEmpty9();
		com.helger.commons.thirdparty.ELicenseTest class183 = new com.helger.commons.thirdparty.ELicenseTest();
		class183.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest class184 = new com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest();
		class184.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleTest class185 = new com.helger.commons.thirdparty.ThirdPartyModuleTest();
		class185.testAll();
		class185.testStd();
		com.helger.commons.thirdparty.CustomLicenseTest class186 = new com.helger.commons.thirdparty.CustomLicenseTest();
		class186.testAll();
		com.helger.commons.http.HttpHeaderMapTest class187 = new com.helger.commons.http.HttpHeaderMapTest();
		class187.testEmpty();
		class187.testSimpleValue();
		class187.testMultipleSimpleValues();
		class187.testMultiValue();
		class187.testAddAllHeadersEmpty();
		class187.testAddAllHeadersPrefilled();
		class187.testAddAllHeadersPrefilledDifferentCasing();
		class187.testAddAllHeadersPrefilledSameName();
		class187.testSetAllHeadersEmpty();
		class187.testSetAllHeadersPrefilled();
		class187.testSetAllHeadersPrefilledSameName();
		class187.testGetUnifiedValues();
		com.helger.commons.typeconvert.TypeConverterExceptionTest class188 = new com.helger.commons.typeconvert.TypeConverterExceptionTest();
		class188.testAll();
		class188.testReason();
		com.helger.commons.typeconvert.IOTypeConverterRegistrarTest class189 = new com.helger.commons.typeconvert.IOTypeConverterRegistrarTest();
		try {
			class189.testConvert();
		}
		catch (java.io.IOException err139) {
			err139.printStackTrace();
		}
		com.helger.commons.typeconvert.TypeConverterTest class190 = new com.helger.commons.typeconvert.TypeConverterTest();
		try {
			class190.testConvertAllToAll();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		class190.testFromBoolean();
		class190.testFromNonNumericString();
		class190.testToString();
		class190.testLocale();
		class190.testArray();
		class190.testBigX();
		class190.testConvertToObject();
		class190.testNoConverterButAssignable();
		class190.testNoConverterNoConversion();
		class190.testBooleanArray();
		class190.testByteArray();
		class190.testCharArray();
		class190.testDoubleArray();
		class190.testFloatArray();
		class190.testIntArray();
		class190.testLongArray();
		class190.testShortArray();
		class190.testPrimitives();
		class190.testSpecials();
		com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest class191 = new com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest();
		class191.testConvert();
		com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest class192 = new com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest();
		class192.testDateTime();
		class192.testLocalDateTime();
		class192.testLocalDate();
		class192.testLocalTime();
		class192.testConvertIntoEachOther();
		com.helger.commons.wrapper.WrapperTest class193 = new com.helger.commons.wrapper.WrapperTest();
		class193.testWrapper();
		com.helger.commons.location.SimpleLocationTest class194 = new com.helger.commons.location.SimpleLocationTest();
		class194.testBasic();
		com.helger.commons.state.EInterruptTest class195 = new com.helger.commons.state.EInterruptTest();
		class195.testAll();
		com.helger.commons.state.ETriStateTest class196 = new com.helger.commons.state.ETriStateTest();
		class196.testAll();
		com.helger.commons.state.SuccessWithValueTest class197 = new com.helger.commons.state.SuccessWithValueTest();
		class197.testAll();
		com.helger.commons.state.EHandledTest class198 = new com.helger.commons.state.EHandledTest();
		class198.testAll();
		com.helger.commons.state.EValidityTest class199 = new com.helger.commons.state.EValidityTest();
		class199.testAll();
		com.helger.commons.state.EEnabledTest class200 = new com.helger.commons.state.EEnabledTest();
		class200.testAll();
		com.helger.commons.state.EContinueTest class201 = new com.helger.commons.state.EContinueTest();
		class201.testAll();
		com.helger.commons.state.ETopBottomTest class202 = new com.helger.commons.state.ETopBottomTest();
		class202.testAll();
		com.helger.commons.state.EMandatoryTest class203 = new com.helger.commons.state.EMandatoryTest();
		class203.testAll();
		com.helger.commons.state.ELeftRightTest class204 = new com.helger.commons.state.ELeftRightTest();
		class204.testAll();
		com.helger.commons.state.ESuccessTest class205 = new com.helger.commons.state.ESuccessTest();
		class205.testAll();
		com.helger.commons.state.EChangeTest class206 = new com.helger.commons.state.EChangeTest();
		class206.testAll();
		com.helger.commons.state.ChangeWithValueTest class207 = new com.helger.commons.state.ChangeWithValueTest();
		class207.testAll();
		com.helger.commons.string.util.RomanNumeralTest class208 = new com.helger.commons.string.util.RomanNumeralTest();
		class208.testBasic();
		class208.testAll();
		com.helger.commons.string.util.LevenshteinDistanceTest class209 = new com.helger.commons.string.util.LevenshteinDistanceTest();
		class209.testGetDistanceString();
		class209.testGetDistanceCharArray();
		class209.testCostsString();
		class209.testCostsCharArray();
		com.helger.commons.string.util.StringScannerTest class210 = new com.helger.commons.string.util.StringScannerTest();
		class210.testAll();
		com.helger.commons.string.StringHelperTest class211 = new com.helger.commons.string.StringHelperTest();
		class211.testHasTextAndHasNoText();
		class211.testLeadingZero();
		class211.testHexEncode();
		class211.testGetHexValue();
		class211.testGetHexChar();
		class211.testHexDecode();
		class211.testHexStringByte();
		class211.testHexStringLeadingZeroByte();
		class211.testHexStringLeadingZero2Byte();
		class211.testHexStringInt();
		class211.testHexStringLeadingZeroInt();
		class211.testHexStringLong();
		class211.testHexStringLeadingZeroLong();
		class211.testHexStringShort();
		class211.testHexStringLeadingZeroShort();
		class211.testGetLeadingWhitespaceCount();
		class211.testGetTrailingWhitespaceCount();
		class211.testGetLeadingCharCount();
		class211.testGetTrailingCharCount();
		class211.testImplodeIterable();
		class211.testImplodeArray();
		class211.testImplodeMap();
		class211.testGetImplodedNonEmptyIterable();
		class211.testGetImplodedNonEmptyArray();
		class211.testGetExplodedToList();
		class211.testGetExplodedToListWithMax();
		class211.testGetExplodedArray();
		class211.testExplodeToSet();
		class211.testExplodeToOrderedSet();
		class211.testGetRepeated();
		class211.testConcatenateOnDemand();
		class211.testStartsWithChar();
		class211.testStartsWithString();
		class211.testEndsWithChar();
		class211.testEndsWithString();
		class211.testGetIndexOfString();
		class211.testGetLastIndexOfString();
		class211.testGetIndexOfChar();
		class211.testGetLastIndexOfChar();
		class211.testContainsString();
		class211.testContainsChar();
		class211.testIndexOfIgnoreCaseString();
		class211.testContainsIgnoreCaseString();
		class211.testGetOccurrenceCountString();
		class211.testGetOccurrenceCountChar();
		class211.testGetOccurrenceCountIgnoreCaseString();
		class211.testGetOccurrenceCountIgnoreCaseChar();
		class211.testTrimLeadingWhitespaces();
		class211.testTrimTrailingWhitespaces();
		class211.testTrimEnd();
		class211.testTrimEndRepeatedlyString();
		class211.testTrimEndRepeatedlyChar();
		class211.testTrimEndInt();
		class211.testTrimStart();
		class211.testTrimStartRepeatedlyString();
		class211.testTrimStartRepeatedlyChar();
		class211.testTrimStartInt();
		class211.testTrim();
		class211.testGetFirstChar();
		class211.testGetLastChar();
		class211.testGetCharCount();
		class211.testGetLineCount();
		class211.testGetCharacterCountInt();
		class211.testGetCharacterCountLong();
		class211.testCutAfterLength();
		class211.testGetNotNullString();
		class211.testGetNotNullCharSeq();
		class211.testReplaceAllString();
		class211.testReplaceAllChar();
		class211.testReplaceAllSafe();
		class211.testReplaceAllRepeatedly();
		class211.testReplaceMultipleMap();
		class211.testReplaceMultipleCharArrays();
		try {
			class211.testReplaceMultipleTo();
		}
		catch (java.io.IOException err141) {
			err141.printStackTrace();
		}
		class211.testReplaceMultipleCharArrayToChar();
		class211.testRemoveAllChar();
		class211.testRemoveAllString();
		class211.testToString();
		class211.testMultiContains();
		class211.testGetWithoutLeadingChar();
		class211.testGetWithoutLeadingChars();
		class211.testGetWithoutTrailingChar();
		class211.testGetWithoutTrailingChars();
		class211.testGetUntilFirstExcl();
		class211.testGetUntilLastExcl();
		class211.testGetUntilFirstIncl();
		class211.testGetUntilLastIncl();
		class211.testGetFromFirstExcl();
		class211.testGetFromLastExcl();
		class211.testGetFromFirstIncl();
		class211.testGetFromLastIncl();
		class211.testGetWithoutWhiteSpaces();
		class211.testGetFirstTokenChar();
		class211.testGetFirstTokenString();
		class211.testGetLastTokenChar();
		class211.testGetLastTokenString();
		class211.testGetReverse();
		class211.testContainsAnyOnlyNoneString();
		class211.testContainsAnyOnlyNoneCharSequence();
		class211.testIsAllWhitespace();
		class211.testGetQuoted();
		class211.testAppendQuotedSB();
		try {
			class211.testAppendQuotedWriter();
		}
		catch (java.io.IOException err142) {
			err142.printStackTrace();
		}
		com.helger.commons.string.StringParserTest class212 = new com.helger.commons.string.StringParserTest();
		class212.testParseBool();
		class212.testParseBoolObj();
		class212.testParseBoolObjExact();
		class212.testParseByte();
		class212.testParseByteObj();
		class212.testParseInt();
		class212.testParseIntObj();
		class212.testParseLong();
		class212.testParseLongObj();
		class212.testParseDouble();
		class212.testParseDoubleObj();
		class212.testParseFloat();
		class212.testParseFloatObj();
		class212.testParseBigInteger();
		class212.testParseBigDecimal();
		class212.testIsInt();
		class212.testIsLong();
		class212.testIsUnsignedInt();
		class212.testIsUnsignedLong();
		class212.testIsDouble();
		class212.testParseUnsignedIntegerObj();
		com.helger.commons.string.ToStringGeneratorTest class213 = new com.helger.commons.string.ToStringGeneratorTest();
		class213.testSimple();
		class213.testCommon();
		class213.testCircularReference();
		com.helger.commons.pool.ObjectPoolTest class214 = new com.helger.commons.pool.ObjectPoolTest();
		try {
			class214.testSimple();
		}
		catch (java.lang.InterruptedException err143) {
			err143.printStackTrace();
		}
		com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest class215 = new com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest();
		class215.testAll();
		class215.testPrefix();
		class215.testSuffix();
		com.helger.commons.format.FormatableObjectTest class216 = new com.helger.commons.format.FormatableObjectTest();
		class216.testAll();
		class216.testImpl();
		com.helger.commons.supplementary.test.code.StringTrieFuncTest class217 = new com.helger.commons.supplementary.test.code.StringTrieFuncTest();
		com.helger.commons.supplementary.test.code.MainDoubleToString class218 = new com.helger.commons.supplementary.test.code.MainDoubleToString();
		com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect class219 = new com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull class220 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNullable class221 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNullable();
		com.helger.commons.supplementary.test.deadlock.MainDeadLock class222 = new com.helger.commons.supplementary.test.deadlock.MainDeadLock();
		com.helger.commons.supplementary.test.deadlock.MainDeadLock2 class223 = new com.helger.commons.supplementary.test.deadlock.MainDeadLock2();
		com.helger.commons.supplementary.test.java.JavaThrowingLambda class224 = new com.helger.commons.supplementary.test.java.JavaThrowingLambda();
		com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest class225 = new com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest();
		class225.testPrivateAccessor();
		com.helger.commons.supplementary.test.java.AESCryptFuncTest class226 = new com.helger.commons.supplementary.test.java.AESCryptFuncTest();
		class226.testMe();
		com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest class227 = new com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest();
		class227.testListAllCountries();
		class227.testListAllSerbianCountries();
		com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest class228 = new com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest();
		class228.testListAllDigestProvider();
		com.helger.commons.supplementary.test.java.JavaCharsetFuncTest class229 = new com.helger.commons.supplementary.test.java.JavaCharsetFuncTest();
		class229.testAllCharsets();
		class229.testAllCharsetNamess();
		com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest class230 = new com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest();
		class230.testListPrinterTrays();
		com.helger.commons.supplementary.test.java.JavaExecOrderTest class231 = new com.helger.commons.supplementary.test.java.JavaExecOrderTest();
		class231.testV1();
		class231.testV2();
		class231.testV3();
		com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest class232 = new com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest();
		class232.testGetAllFonts();
		com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest class233 = new com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest();
		class233.testGetResourceThisProject();
		class233.testGetDirectoryThisProject();
		class233.testGetResourceLinkedProject();
		class233.testGetDirectoryLinkedProject_TrailingSlash();
		class233.testGetDirectoryLinkedProject_NoTrailingSlash();
		class233.testGetResourceRuntime();
		class233.testGetDirectoryRuntime();
		com.helger.commons.supplementary.test.java.JavaArrayFuncTest class234 = new com.helger.commons.supplementary.test.java.JavaArrayFuncTest();
		class234.testReflectionIntArray();
		com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest class235 = new com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest();
		class235.testAllCharsets();
		com.helger.commons.supplementary.test.java.JavaCollatorFuncTest class236 = new com.helger.commons.supplementary.test.java.JavaCollatorFuncTest();
		try {
			class236.testCollation();
		}
		catch (java.text.ParseException err144) {
			err144.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest class237 = new com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest();
		class237.testDivide();
		class237.testCompareEquals();
		com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest class238 = new com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest();
		class238.testDecimalFormat();
		class238.testCurrencyNoSymbol();
		class238.testNumberFormatVsToString();
		com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest class239 = new com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest();
		class239.testBitWise();
		class239.testBitWiseOr();
		com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest class240 = new com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest();
		class240.testBasicFormat();
		com.helger.commons.supplementary.test.java.JavaFileFuncTest class241 = new com.helger.commons.supplementary.test.java.JavaFileFuncTest();
		class241.testGetPath();
		com.helger.commons.supplementary.test.java.JavaCommonsFuncTest class242 = new com.helger.commons.supplementary.test.java.JavaCommonsFuncTest();
		class242.testAssignability();
		class242.testAutoboxing();
		class242.testParseBoolean();
		class242.testHexString();
		com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest class243 = new com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest();
		try {
			class243.testAccessRights();
		}
		catch (java.io.IOException err145) {
			err145.printStackTrace();
		}
		catch (java.lang.InterruptedException err146) {
			err146.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaURLFuncTest class244 = new com.helger.commons.supplementary.test.java.JavaURLFuncTest();
		try {
			class244.testURLParts();
		}
		catch (java.net.URISyntaxException err147) {
			err147.printStackTrace();
		}
		catch (java.net.MalformedURLException err148) {
			err148.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest class245 = new com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest();
		class245.testUNC();
		com.helger.commons.supplementary.test.java.FontKerningFuncTest class246 = new com.helger.commons.supplementary.test.java.FontKerningFuncTest();
		try {
			class246.testKerning();
		}
		catch (java.io.IOException err149) {
			err149.printStackTrace();
		}
		com.helger.commons.type.ObjectTypeTest class247 = new com.helger.commons.type.ObjectTypeTest();
		class247.testAll();
		com.helger.commons.type.TypedObjectTest class248 = new com.helger.commons.type.TypedObjectTest();
		class248.testAll();
		com.helger.commons.io.streamprovider.MockNullInputStreamProvider class249 = new com.helger.commons.io.streamprovider.MockNullInputStreamProvider();
		com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest class250 = new com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest();
		class250.testSimple();
		com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest class251 = new com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest();
		class251.testSimple();
		com.helger.commons.io.streamprovider.StringInputStreamProviderTest class252 = new com.helger.commons.io.streamprovider.StringInputStreamProviderTest();
		class252.testSimpleCharset();
		class252.testBOM();
		class252.testSerialization();
		com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest class253 = new com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest();
		class253.testSimple();
		com.helger.commons.io.file.IFileFilterFuncTest class254 = new com.helger.commons.io.file.IFileFilterFuncTest();
		class254.testGetFilterFileOnly();
		class254.testGetFilterDirectoryOnly();
		class254.testGetFilterDirectoryPublic();
		class254.testGetParentDirectoryPublic();
		class254.testGetFilterFilenameHidden();
		class254.testFilenameStartsWith();
		class254.testFilenameEndsWith();
		class254.testFilenameEqualsIgnoreCase();
		class254.testFilenameEquals();
		class254.testFilenameMatchAnyRegEx();
		class254.testFilenameMatchNoRegEx();
		com.helger.commons.io.file.EFileIOOperationTest class255 = new com.helger.commons.io.file.EFileIOOperationTest();
		class255.testAll();
		com.helger.commons.io.file.ERandomAccessFileModeTest class256 = new com.helger.commons.io.file.ERandomAccessFileModeTest();
		class256.testAll();
		com.helger.commons.io.file.SimpleFileIOTest class257 = new com.helger.commons.io.file.SimpleFileIOTest();
		class257.testReadFileBytes();
		class257.testReaFileLines();
		class257.testReadFileAsString();
		class257.testWriteFile();
		com.helger.commons.io.file.FileSystemIteratorTest class258 = new com.helger.commons.io.file.FileSystemIteratorTest();
		class258.testCtor();
		com.helger.commons.io.file.FileOperationsTest class259 = new com.helger.commons.io.file.FileOperationsTest();
		class259.testCreateDir();
		class259.testCreateDirIfNotExisting();
		class259.testCreateDirRecursive();
		class259.testCreateDirRecursiveIfNotExisting();
		class259.testRenameDir();
		class259.testRenameFile();
		class259.testCopyFile();
		class259.testCopyDir();
		class259.testDeleteDir();
		class259.testDeleteDirRecursive();
		class259.testDeleteFile();
		com.helger.commons.io.file.PathOperationsTest class260 = new com.helger.commons.io.file.PathOperationsTest();
		class260.testCreateDir();
		class260.testCreateDirIfNotExisting();
		class260.testCreateDirRecursive();
		class260.testCreateDirRecursiveIfNotExisting();
		class260.testRenameDir();
		class260.testRenameFile();
		class260.testCopyFile();
		class260.testCopyDir();
		class260.testDeleteDir();
		class260.testDeleteDirRecursive();
		class260.testDeleteFile();
		com.helger.commons.io.file.FilenameHelperTest class261 = new com.helger.commons.io.file.FilenameHelperTest();
		class261.testGetIndexOfExtension();
		class261.testGetWithoutExtension();
		class261.testGetBaseName();
		class261.testGetExtensionString();
		class261.testGetExtensionFile();
		class261.testGetIndexOfLastSeparator();
		class261.testGetWithoutPath();
		class261.testGetPath();
		class261.testIsValidFilename();
		class261.testIsValidFilenameWithPaths();
		class261.testGetAsValidFilename();
		class261.testGetAsValidASCIIFilename();
		class261.testIsPathSeparatorChar();
		class261.testStartsWithPathSeparatorChar();
		class261.testEndsWithPathSeparatorChar();
		class261.testContainsPathSeparatorChar();
		class261.testHasExtensionString();
		class261.testHasExtensionFile();
		class261.testIsSystemInternalDirectory_String();
		class261.testIsSystemInternalDirectory_File();
		class261.testGetCleanConcatenatedUrlPath();
		class261.testGetCleanPath_File();
		class261.testGetCleanPath_String();
		class261.testMatchPathsIgnoreSepType();
		class261.testGetPathUsingUnixSeparator();
		class261.testEnsurePathEndingWithoutSeparator();
		class261.testEnsurePathEndingWithSeparator();
		class261.testEnsurePathStartingWithSeparator();
		class261.testGetSecureFilename();
		class261.testGetRelativeToParentDirectory();
		class261.testGetAbsoluteWithEnsuredParentDirectory();
		class261.testGetAbsoluteWithEnsuredParentDirectoryAbsolute();
		com.helger.commons.io.file.FileSystemRecursiveIteratorTest class262 = new com.helger.commons.io.file.FileSystemRecursiveIteratorTest();
		class262.testCtor();
		com.helger.commons.io.file.FileHelperTest class263 = new com.helger.commons.io.file.FileHelperTest();
		class263.testExistsFile();
		class263.testExistsDir();
		class263.testEnsureParentDirectoryIsPresent();
		class263.testIsParentDirectory();
		class263.testGetFileSizeDisplay();
		class263.testGetSecureFile();
		class263.testGetInputStream();
		class263.testGetOutputStream();
		try {
			class263.testIsFileNewer();
		}
		catch (java.io.IOException err150) {
			err150.printStackTrace();
		}
		class263.testGetDirectoryObjectCount();
		class263.testSafeEquals();
		com.helger.commons.io.file.EFileIOErrorCodeTest class264 = new com.helger.commons.io.file.EFileIOErrorCodeTest();
		class264.testAll();
		com.helger.commons.io.file.FileOperationManagerTest class265 = new com.helger.commons.io.file.FileOperationManagerTest();
		class265.testCtor();
		class265.testCreateDir();
		class265.testCreateDirIfNotExisting();
		class265.testCreateDirRecursive();
		class265.testCreateDirRecursiveIfNotExisting();
		class265.testRenameDir();
		class265.testRenameFile();
		class265.testDeleteFile();
		class265.testDeleteFileIfExisting();
		class265.testDeleteDir();
		class265.testDeleteDirIfExisting();
		class265.testCopyDirRecursive();
		class265.testCopyFile();
		com.helger.commons.io.file.FileIOErrorTest class266 = new com.helger.commons.io.file.FileIOErrorTest();
		class266.testCtor1();
		class266.testCtor2();
		class266.testCtor3();
		class266.testCtor4();
		class266.testStdMethods();
		com.helger.commons.io.stream.MockCloseable class267 = new com.helger.commons.io.stream.MockCloseable();
		com.helger.commons.io.stream.NonClosingInputStreamTest class268 = new com.helger.commons.io.stream.NonClosingInputStreamTest();
		class268.testClosing();
		class268.testNonClosing();
		com.helger.commons.io.stream.WrappedWriterTest class269 = new com.helger.commons.io.stream.WrappedWriterTest();
		try {
			class269.testAll();
		}
		catch (java.io.IOException err151) {
			err151.printStackTrace();
		}
		com.helger.commons.io.stream.CountingInputStreamTest class270 = new com.helger.commons.io.stream.CountingInputStreamTest();
		try {
			class270.testAll();
		}
		catch (java.io.IOException err152) {
			err152.printStackTrace();
		}
		com.helger.commons.io.stream.BitInputStreamTest class271 = new com.helger.commons.io.stream.BitInputStreamTest();
		try {
			class271.testSemantics();
		}
		catch (java.io.IOException err153) {
			err153.printStackTrace();
		}
		try {
			class271.testReadBitLittleEndian();
		}
		catch (java.io.IOException err154) {
			err154.printStackTrace();
		}
		try {
			class271.testReadBitBigEndian();
		}
		catch (java.io.IOException err155) {
			err155.printStackTrace();
		}
		com.helger.commons.io.stream.MockCloseableWithState class272 = new com.helger.commons.io.stream.MockCloseableWithState();
		com.helger.commons.io.stream.WrappedOutputStreamTest class273 = new com.helger.commons.io.stream.WrappedOutputStreamTest();
		try {
			class273.testAll();
		}
		catch (java.io.IOException err156) {
			err156.printStackTrace();
		}
		com.helger.commons.io.stream.StringInputStreamTest class274 = new com.helger.commons.io.stream.StringInputStreamTest();
		class274.testAll();
		com.helger.commons.io.stream.WrappedInputStreamTest class275 = new com.helger.commons.io.stream.WrappedInputStreamTest();
		try {
			class275.testAll();
		}
		catch (java.io.IOException err157) {
			err157.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileInputStreamTest class276 = new com.helger.commons.io.stream.CountingFileInputStreamTest();
		try {
			class276.testAll();
		}
		catch (java.io.IOException err158) {
			err158.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingStringWriterTest class277 = new com.helger.commons.io.stream.NonBlockingStringWriterTest();
		try {
			class277.testAll();
		}
		catch (java.io.IOException err159) {
			err159.printStackTrace();
		}
		class277.testError();
		com.helger.commons.io.stream.MockThrowingCloseable class278 = new com.helger.commons.io.stream.MockThrowingCloseable();
		com.helger.commons.io.stream.NonClosingOutputStreamTest class279 = new com.helger.commons.io.stream.NonClosingOutputStreamTest();
		class279.testClosing();
		class279.testNonClosing();
		com.helger.commons.io.stream.MockThrowingFlushable class280 = new com.helger.commons.io.stream.MockThrowingFlushable();
		com.helger.commons.io.stream.WrappedReaderTest class281 = new com.helger.commons.io.stream.WrappedReaderTest();
		try {
			class281.testAll();
		}
		catch (java.io.IOException err160) {
			err160.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest class282 = new com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest();
		try {
			class282.testAll();
		}
		catch (java.io.IOException err161) {
			err161.printStackTrace();
		}
		com.helger.commons.io.stream.MockFlushable class283 = new com.helger.commons.io.stream.MockFlushable();
		com.helger.commons.io.stream.StreamHelperTest class284 = new com.helger.commons.io.stream.StreamHelperTest();
		class284.testIsKnownEOFException();
		class284.testClose();
		class284.testCloseWithoutFlush();
		class284.testFlush();
		class284.testCopyInputStreamToOutputStream();
		class284.testCopyInputStreamToOutputStreamWithLimit();
		class284.testGetAvailable();
		class284.testGetAllBytesCharset();
		class284.testReadLines();
		class284.testGetAllBytesAsString();
		class284.testCopyReaderToWriter();
		class284.testCopyReaderToWriterWithLimit();
		class284.testGetAllCharacters();
		class284.testWriteStream();
		class284.testCreateReader();
		class284.testCreateWriter();
		com.helger.commons.io.stream.BitOutputStreamTest class285 = new com.helger.commons.io.stream.BitOutputStreamTest();
		try {
			class285.testSemantics();
		}
		catch (java.io.IOException err162) {
			err162.printStackTrace();
		}
		try {
			class285.testWriteBitLittleEndian();
		}
		catch (java.io.IOException err163) {
			err163.printStackTrace();
		}
		try {
			class285.testWriteBitBigEndian();
		}
		catch (java.io.IOException err164) {
			err164.printStackTrace();
		}
		try {
			class285.testWriteManyLittleEndian();
		}
		catch (java.io.IOException err165) {
			err165.printStackTrace();
		}
		try {
			class285.testWriteManyBigEndian();
		}
		catch (java.io.IOException err166) {
			err166.printStackTrace();
		}
		try {
			class285.testReadWriteRandom();
		}
		catch (java.io.IOException err167) {
			err167.printStackTrace();
		}
		try {
			class285.testWriteManual();
		}
		catch (java.io.IOException err168) {
			err168.printStackTrace();
		}
		com.helger.commons.io.stream.CountingOutputStreamTest class286 = new com.helger.commons.io.stream.CountingOutputStreamTest();
		try {
			class286.testAll();
		}
		catch (java.io.IOException err169) {
			err169.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileOutputStreamTest class287 = new com.helger.commons.io.stream.CountingFileOutputStreamTest();
		try {
			class287.testAll();
		}
		catch (java.io.IOException err170) {
			err170.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest class288 = new com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest();
		try {
			class288.testAll();
		}
		catch (java.io.IOException err171) {
			err171.printStackTrace();
		}
		com.helger.commons.io.EAppendTest class289 = new com.helger.commons.io.EAppendTest();
		class289.testAll();
		com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest class290 = new com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest();
		class290.testAll();
		class290.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest class291 = new com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest();
		class291.testNoPrefix();
		class291.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.DefaultResourceProviderTest class292 = new com.helger.commons.io.resourceprovider.DefaultResourceProviderTest();
		class292.testNoPrefix();
		class292.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.URLResourceProviderTest class293 = new com.helger.commons.io.resourceprovider.URLResourceProviderTest();
		class293.testAll();
		class293.testEqualsAndHashcode();
		com.helger.commons.io.PathFuncTest class294 = new com.helger.commons.io.PathFuncTest();
		try {
			class294.testSimple();
		}
		catch (java.io.IOException err172) {
			err172.printStackTrace();
		}
		try {
			class294.testTraverse1();
		}
		catch (java.io.IOException err173) {
			err173.printStackTrace();
		}
		try {
			class294.testTraverse2();
		}
		catch (java.io.IOException err174) {
			err174.printStackTrace();
		}
		try {
			class294.testIterate1();
		}
		catch (java.io.IOException err175) {
			err175.printStackTrace();
		}
		com.helger.commons.io.provider.FileSystemByteStreamProviderTest class295 = new com.helger.commons.io.provider.FileSystemByteStreamProviderTest();
		class295.testAll();
		com.helger.commons.io.misc.SizeHelperTest class296 = new com.helger.commons.io.misc.SizeHelperTest();
		class296.testCtor();
		class296.testGetAsKB();
		class296.testGetAsMB();
		class296.testGetAsGB();
		class296.testGetAsTB();
		class296.testGetAsPB();
		class296.testGetAsMatching();
		class296.testOutOfBounds();
		com.helger.commons.io.resource.URLResourceTest class297 = new com.helger.commons.io.resource.URLResourceTest();
		try {
			class297.testCtor();
		}
		catch (java.net.MalformedURLException err176) {
			err176.printStackTrace();
		}
		try {
			class297.testAccess();
		}
		catch (java.io.IOException err177) {
			err177.printStackTrace();
		}
		try {
			class297.testSerialize();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		com.helger.commons.io.resource.ClassPathResourceTest class298 = new com.helger.commons.io.resource.ClassPathResourceTest();
		try {
			class298.testValidRoot();
		}
		catch (java.io.IOException err179) {
			err179.printStackTrace();
		}
		class298.testValidRootWithPrefixLong();
		class298.testValidRootWithPrefixShort();
		class298.testValidFolder();
		class298.testInvalid();
		class298.testDefault();
		class298.testFolder();
		com.helger.commons.io.resource.FileSystemResourceTest class299 = new com.helger.commons.io.resource.FileSystemResourceTest();
		class299.testCtor();
		class299.testUNC();
		class299.testAccess();
		class299.testWrite();
		class299.testSerialize();
		com.helger.commons.io.watchdir.WatchDirTest class300 = new com.helger.commons.io.watchdir.WatchDirTest();
		try {
			class300.testRecursive();
		}
		catch (java.io.IOException err180) {
			err180.printStackTrace();
		}
		try {
			class300.testNonRecursive();
		}
		catch (java.io.IOException err181) {
			err181.printStackTrace();
		}
		com.helger.commons.io.relative.FileRelativeIOTest class301 = new com.helger.commons.io.relative.FileRelativeIOTest();
		try {
			class301.testBasePath();
		}
		catch (java.io.IOException err182) {
			err182.printStackTrace();
		}
		com.helger.commons.io.relative.PathRelativeIOTest class302 = new com.helger.commons.io.relative.PathRelativeIOTest();
		class302.testFileBased();
		class302.testURLBased();
		com.helger.commons.io.resourceresolver.DefaultResourceResolverTest class303 = new com.helger.commons.io.resourceresolver.DefaultResourceResolverTest();
		try {
			class303.testBasic();
		}
		catch (java.io.IOException err183) {
			err183.printStackTrace();
		}
		com.helger.commons.CGlobalTest class304 = new com.helger.commons.CGlobalTest();
		class304.testConstants();
		class304.testDefaults();
		com.helger.commons.mutable.MutableLongTest class305 = new com.helger.commons.mutable.MutableLongTest();
		class305.testMutableLong();
		com.helger.commons.mutable.MutableFloatTest class306 = new com.helger.commons.mutable.MutableFloatTest();
		class306.testMutableFloat();
		com.helger.commons.mutable.MutableIntTest class307 = new com.helger.commons.mutable.MutableIntTest();
		class307.testMutableInt();
		com.helger.commons.mutable.MutableBooleanTest class308 = new com.helger.commons.mutable.MutableBooleanTest();
		class308.testMutableBoolean();
		class308.testTypeConversion();
		com.helger.commons.mutable.MutableDoubleTest class309 = new com.helger.commons.mutable.MutableDoubleTest();
		class309.testMutableDouble();
		com.helger.commons.mutable.MutableCharTest class310 = new com.helger.commons.mutable.MutableCharTest();
		class310.testMutableChar();
		com.helger.commons.mutable.MutableByteTest class311 = new com.helger.commons.mutable.MutableByteTest();
		class311.testMutableByte();
		com.helger.commons.mutable.MutableShortTest class312 = new com.helger.commons.mutable.MutableShortTest();
		class312.testMutableByte();
		com.helger.commons.system.CryptoPolicyTest class313 = new com.helger.commons.system.CryptoPolicyTest();
		class313.testIf();
		com.helger.commons.system.JavaVersionHelperTest class314 = new com.helger.commons.system.JavaVersionHelperTest();
		class314.testGetVersion();
		com.helger.commons.system.EProcessorArchitectureTest class315 = new com.helger.commons.system.EProcessorArchitectureTest();
		class315.testAll();
		com.helger.commons.system.EJavaVersionTest class316 = new com.helger.commons.system.EJavaVersionTest();
		class316.testBasic();
		class316.testIsOlderOrEqualsThan();
		class316.testIsNewerOrEqualsThan();
		com.helger.commons.system.SystemHelperTest class317 = new com.helger.commons.system.SystemHelperTest();
		class317.testAll();
		com.helger.commons.system.SystemPropertiesTest class318 = new com.helger.commons.system.SystemPropertiesTest();
		class318.testPrintAll();
		class318.testGetAll();
		class318.testRemove();
		class318.testGetAllJavaNetSystemProperties();
		com.helger.commons.system.ENewLineModeTest class319 = new com.helger.commons.system.ENewLineModeTest();
		class319.testAll();
		com.helger.commons.system.EJVMVendorTest class320 = new com.helger.commons.system.EJVMVendorTest();
		class320.testBasic();
		class320.testIsSun();
		class320.testIsOracle();
		com.helger.commons.system.EOperatingSystemTest class321 = new com.helger.commons.system.EOperatingSystemTest();
		class321.testAll();
		com.helger.commons.aggregate.IAggregatorTest class322 = new com.helger.commons.aggregate.IAggregatorTest();
		class322.testUseFirst();
		class322.testUseLast();
		class322.testGetStringCombinator();
		class322.testGetStringCombinatorWithSeparatorChar();
		class322.testGetStringCombinatorWithSeparatorString();
		class322.testGetStringCombinatorIgnoreNull();
		class322.testGetStringCombinatorWithSeparatorIgnoreEmptyChar();
		class322.testGetStringCombinatorWithSeparatorIgnoreEmptyString();
		com.helger.commons.url.URLParameterListTest class323 = new com.helger.commons.url.URLParameterListTest();
		class323.testBasic();
		com.helger.commons.url.URLParameterEncoderTest class324 = new com.helger.commons.url.URLParameterEncoderTest();
		class324.testEncode();
		com.helger.commons.url.SimpleURLTest class325 = new com.helger.commons.url.SimpleURLTest();
		class325.testGetAsStringWithoutEncodedParameters();
		class325.testGetAsStringWithEncodedParametersDefault();
		class325.testGetAsStringWithEncodedParametersISO88591();
		class325.testAsEncodedString();
		class325.testCtor();
		class325.testDataUrls();
		com.helger.commons.url.URLHelperTest class326 = new com.helger.commons.url.URLHelperTest();
		class326.testGetCleanURL();
		class326.testUrlEncodeDecode();
		class326.testGetURLData();
		class326.testGetInputStream();
		class326.testGetApplicationFormEncoded();
		class326.testIsClassPathURLExisting();
		class326.testGetAsURL();
		class326.testGetAsURI();
		class326.testGetAsFile();
		com.helger.commons.url.URLValidatorTest class327 = new com.helger.commons.url.URLValidatorTest();
		class327.testValid();
		com.helger.commons.url.EURLProtocolTest class328 = new com.helger.commons.url.EURLProtocolTest();
		class328.testBasic();
		com.helger.commons.url.URLParameterDecoderTest class329 = new com.helger.commons.url.URLParameterDecoderTest();
		class329.testDecode();
		com.helger.commons.url.URLProtocolRegistryTest class330 = new com.helger.commons.url.URLProtocolRegistryTest();
		class330.testDefaultsPresent();
		class330.testReinitialize();
		com.helger.commons.url.URLDataTest class331 = new com.helger.commons.url.URLDataTest();
		class331.testGetAsString();
		com.helger.commons.compare.ESortOrderTest class332 = new com.helger.commons.compare.ESortOrderTest();
		class332.testAll();
		com.helger.commons.compare.CompareHelperTest class333 = new com.helger.commons.compare.CompareHelperTest();
		class333.testNullSafeCompare();
		com.helger.commons.compare.IComparatorTest class334 = new com.helger.commons.compare.IComparatorTest();
		class334.testCollating();
		class334.testCollatingOrder();
		class334.testLocaleGerman();
		class334.testComparatorStringLongestFirst();
		com.helger.commons.compare.CollatorHelperTest class335 = new com.helger.commons.compare.CollatorHelperTest();
		class335.testGetCollatorSpaceBeforeDot();
		class335.testSort();
		com.helger.commons.charset.CharsetHelperTest class336 = new com.helger.commons.charset.CharsetHelperTest();
		class336.testCharsetFromName();
		class336.testGetAsBytesCharset();
		class336.testGetAsStringInOtherCharsetCharset();
		try {
			class336.testGreek();
		}
		catch (java.lang.Exception err184) {
			err184.printStackTrace();
		}
		class336.testJavaCompiledAsUTF8();
		class336.testGetUTF8ByteCount();
		class336.testGetUTF8ByteCountRandom();
		class336.testBasic();
		class336.testToUtf8();
		class336.testDiacriticOE();
		com.helger.commons.charset.EUnicodeBOMTest class337 = new com.helger.commons.charset.EUnicodeBOMTest();
		class337.testgetSizeInBytes();
		com.helger.commons.SPITest class338 = new com.helger.commons.SPITest();
		try {
			class338.testBasic();
		}
		catch (java.lang.Exception err185) {
			err185.printStackTrace();
		}
		com.helger.commons.regex.RegExPatternTest class339 = new com.helger.commons.regex.RegExPatternTest();
		class339.testCheckPatternConsistency();
		com.helger.commons.regex.RegExCacheTest class340 = new com.helger.commons.regex.RegExCacheTest();
		class340.testGetPattern();
		com.helger.commons.regex.RegExHelperTest class341 = new com.helger.commons.regex.RegExHelperTest();
		class341.testSplitNoLimit();
		class341.testSplitWithLimit();
		class341.testSplitToListNoLimit();
		class341.testSplitToListWithLimit();
		class341.testMakeIdentifier();
		class341.testGetMatcher();
		class341.testStringMatchesPattern();
		class341.testStringReplacePattern();
		class341.testIsValidPattern();
		class341.testGetAllMatchingGroupValues();
		com.helger.commons.debug.GlobalDebugTest class342 = new com.helger.commons.debug.GlobalDebugTest();
		class342.testInstance();
		class342.testStatic();
	}
}