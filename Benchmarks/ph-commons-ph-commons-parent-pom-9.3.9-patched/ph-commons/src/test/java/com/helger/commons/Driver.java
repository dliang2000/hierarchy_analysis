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
		com.helger.commons.concurrent.collector.MockConcurrentCollectorSingle class42 = new com.helger.commons.concurrent.collector.MockConcurrentCollectorSingle();
		com.helger.commons.concurrent.collector.MockConcurrentCollectorMultiple class43 = new com.helger.commons.concurrent.collector.MockConcurrentCollectorMultiple();
		com.helger.commons.concurrent.collector.ConcurrentCollectorSingleTest class44 = new com.helger.commons.concurrent.collector.ConcurrentCollectorSingleTest();
		class44.testCtor();
		try {
			class44.testAny();
		}
		catch (java.lang.InterruptedException err11) {
			err11.printStackTrace();
		}
		com.helger.commons.concurrent.BasicThreadFactoryTest class45 = new com.helger.commons.concurrent.BasicThreadFactoryTest();
		class45.testAll();
		com.helger.commons.concurrent.PromiseFuncTest class46 = new com.helger.commons.concurrent.PromiseFuncTest();
		try {
			class46.testCFRunAsync();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class46.testCFApplyAsync();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		try {
			class46.testCFApplySync();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		com.helger.commons.concurrent.ExecutorServiceHelperTest class47 = new com.helger.commons.concurrent.ExecutorServiceHelperTest();
		class47.testAll();
		com.helger.commons.cache.MappedCacheTest class48 = new com.helger.commons.cache.MappedCacheTest();
		class48.testMaxSize();
		class48.testNoMaxSize();
		class48.testSameStoreKey();
		class48.testNullStoreKey();
		class48.testNullValueNotAllowed();
		class48.testNullValueAllowed();
		class48.testPrefilledCache();
		com.helger.commons.dimension.SizeDoubleTest class49 = new com.helger.commons.dimension.SizeDoubleTest();
		class49.testCtor();
		class49.testGetBestMatchingSize();
		class49.testGetScaled();
		com.helger.commons.dimension.SizeIntTest class50 = new com.helger.commons.dimension.SizeIntTest();
		class50.testCtor();
		class50.testGetBestMatchingSize();
		class50.testGetScaled();
		com.helger.commons.lang.BooleanHelperTest class51 = new com.helger.commons.lang.BooleanHelperTest();
		class51.testGetBooleanValue();
		com.helger.commons.lang.ServiceLoaderFuncTest class52 = new com.helger.commons.lang.ServiceLoaderFuncTest();
		class52.testLoadEmptyService();
		class52.testLoadNonExistingImplementation();
		class52.testLoadNonExistingImplementationWithSpecialCL();
		class52.testLoadCrappyServiceFile();
		class52.testLoadValid();
		com.helger.commons.lang.CloneHelperTest class53 = new com.helger.commons.lang.CloneHelperTest();
		try {
			class53.testGetClonedValue();
		}
		catch (java.lang.CloneNotSupportedException err15) {
			err15.printStackTrace();
		}
		com.helger.commons.lang.StackTraceHelperTest class54 = new com.helger.commons.lang.StackTraceHelperTest();
		class54.testAll();
		com.helger.commons.lang.GenericReflectionTest class55 = new com.helger.commons.lang.GenericReflectionTest();
		class55.testUncheckedCast();
		try {
			class55.testForName();
		}
		catch (java.lang.ClassNotFoundException err16) {
			err16.printStackTrace();
		}
		class55.testSafeForName();
		try {
			class55.testInvokeMethod();
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
			class55.testInvokeStaticMethod();
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
			class55.testNewInstance();
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
		com.helger.commons.lang.MockCloneNotSupported class56 = new com.helger.commons.lang.MockCloneNotSupported();
		com.helger.commons.lang.ClassPathHelperTest class57 = new com.helger.commons.lang.ClassPathHelperTest();
		class57.testGetAllClassPathEntries();
		try {
			class57.testPrintClassPathEntries();
		}
		catch (java.io.UnsupportedEncodingException err28) {
			err28.printStackTrace();
		}
		com.helger.commons.lang.EnumHelperTest class58 = new com.helger.commons.lang.EnumHelperTest();
		class58.testGetEnumID();
		class58.testGetFromIDString();
		class58.testGetFromIDCaseInsensitiveString();
		class58.testGetFromIDInt();
		com.helger.commons.lang.MockSPIClearableValid class59 = new com.helger.commons.lang.MockSPIClearableValid();
		com.helger.commons.lang.proxy.LoggingInvocationHandlerTest class60 = new com.helger.commons.lang.proxy.LoggingInvocationHandlerTest();
		class60.testBasic();
		class60.testDefaultMethod();
		com.helger.commons.lang.ClassHierarchyCacheTest class61 = new com.helger.commons.lang.ClassHierarchyCacheTest();
		class61.testGetClassHierarchy();
		com.helger.commons.lang.ClassHelperTest class62 = new com.helger.commons.lang.ClassHelperTest();
		class62.testGetClassLoader();
		class62.testIsPublicClass();
		class62.testIsInstancableClass();
		class62.testIsPublic();
		class62.testIsInterface();
		class62.testIsAnnotation();
		class62.testIsEnum();
		class62.testIsAbstract();
		class62.testIsArray();
		class62.testPrimitivesAndWrappers();
		class62.testGetAllPrimtives();
		class62.testIsStringClass();
		class62.testIsCharacterClass();
		class62.testIsBooleanClass();
		class62.testIsFloatingPointClass();
		class62.testIsIntegerClass();
		class62.testGetClassLocalNameClassOfQ();
		class62.testGetClassPackageName();
		class62.testGetSafeClassName();
		class62.testGetDirectoryFromPackage();
		class62.testGetPathFromClass();
		class62.testGetClassFromPath();
		class62.testGetObjectAddress();
		com.helger.commons.lang.BitSetHelperTest class63 = new com.helger.commons.lang.BitSetHelperTest();
		class63.testByte();
		class63.testShort();
		class63.testInt();
		class63.testLong();
		com.helger.commons.lang.TimeValueTest class64 = new com.helger.commons.lang.TimeValueTest();
		class64.testAll();
		com.helger.commons.lang.MockSPIClearableInvalid class65 = new com.helger.commons.lang.MockSPIClearableInvalid();
		com.helger.commons.name.IDisplayNameProviderTest class66 = new com.helger.commons.name.IDisplayNameProviderTest();
		class66.testAll();
		com.helger.commons.name.INameProviderTest class67 = new com.helger.commons.name.INameProviderTest();
		class67.testAll();
		com.helger.commons.hashcode.HashCodeGeneratorTest class68 = new com.helger.commons.hashcode.HashCodeGeneratorTest();
		class68.testIllegalCtor();
		class68.testAppend();
		class68.testSpecialCases();
		try {
			class68.findIllegalValue();
		}
		catch (java.lang.InterruptedException err29) {
			err29.printStackTrace();
		}
		class68.testUniqueness();
		com.helger.commons.mime.MimeTypeDeterminatorTest class69 = new com.helger.commons.mime.MimeTypeDeterminatorTest();
		class69.testGetMIMEType();
		com.helger.commons.mime.MimeTypeParserTest class70 = new com.helger.commons.mime.MimeTypeParserTest();
		class70.testIsToken();
		class70.testCreateFromString();
		class70.testParseValid();
		class70.testParseValidURLEscape();
		class70.testParseInvalid();
		class70.testParseInvalidQuotedString();
		class70.testParseInvalidURLEscape();
		class70.testParseInvalidQuotedPrintable();
		com.helger.commons.mime.EMimeQuotingTest class71 = new com.helger.commons.mime.EMimeQuotingTest();
		class71.testAll();
		com.helger.commons.mime.EMimeContentTypeTest class72 = new com.helger.commons.mime.EMimeContentTypeTest();
		class72.testAll();
		com.helger.commons.mime.MimeTypeParameterTest class73 = new com.helger.commons.mime.MimeTypeParameterTest();
		class73.testBasic();
		com.helger.commons.mime.MimeTypeTest class74 = new com.helger.commons.mime.MimeTypeTest();
		class74.testCtor();
		class74.testParameters();
		class74.testSpecialCharsInParams();
		com.helger.commons.factory.FactoryNewInstanceTest class75 = new com.helger.commons.factory.FactoryNewInstanceTest();
		class75.testGetNewInstanceFactory();
		class75.testGetNewInstanceFactorySafe();
		class75.testEqualsAndHashCode();
		com.helger.commons.csv.IntegrationFuncTest class76 = new com.helger.commons.csv.IntegrationFuncTest();
		try {
			class76.testWriteRead();
		}
		catch (java.io.IOException err30) {
			err30.printStackTrace();
		}
		com.helger.commons.csv.CSVParserTest class77 = new com.helger.commons.csv.CSVParserTest();
		try {
			class77.testParseLine();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class77.parseSimpleString();
		}
		catch (java.io.IOException err32) {
			err32.printStackTrace();
		}
		try {
			class77.parseSimpleQuotedString();
		}
		catch (java.io.IOException err33) {
			err33.printStackTrace();
		}
		try {
			class77.parseSimpleQuotedStringWithSpaces();
		}
		catch (java.io.IOException err34) {
			err34.printStackTrace();
		}
		try {
			class77.testParsedLineWithInternalQuota();
		}
		catch (java.io.IOException err35) {
			err35.printStackTrace();
		}
		try {
			class77.parseQuotedStringWithCommas();
		}
		catch (java.io.IOException err36) {
			err36.printStackTrace();
		}
		try {
			class77.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err37) {
			err37.printStackTrace();
		}
		try {
			class77.parseQuotedStringWithDefinedSeperatorAndQuote();
		}
		catch (java.io.IOException err38) {
			err38.printStackTrace();
		}
		try {
			class77.parseEmptyElements();
		}
		catch (java.io.IOException err39) {
			err39.printStackTrace();
		}
		try {
			class77.parseMultiLinedQuoted();
		}
		catch (java.io.IOException err40) {
			err40.printStackTrace();
		}
		try {
			class77.parseMultiLinedQuotedwithCarriageReturns();
		}
		catch (java.io.IOException err41) {
			err41.printStackTrace();
		}
		try {
			class77.testADoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err42) {
			err42.printStackTrace();
		}
		try {
			class77.testEscapedDoubleQuoteAsDataElement();
		}
		catch (java.io.IOException err43) {
			err43.printStackTrace();
		}
		try {
			class77.parseQuotedQuoteCharacters();
		}
		catch (java.io.IOException err44) {
			err44.printStackTrace();
		}
		try {
			class77.parseMultipleQuotes();
		}
		catch (java.io.IOException err45) {
			err45.printStackTrace();
		}
		try {
			class77.parseTrickyString();
		}
		catch (java.io.IOException err46) {
			err46.printStackTrace();
		}
		try {
			class77.testAMultiLineInsideQuotes();
		}
		catch (java.io.IOException err47) {
			err47.printStackTrace();
		}
		try {
			class77.testStrictQuoteSimple();
		}
		catch (java.io.IOException err48) {
			err48.printStackTrace();
		}
		try {
			class77.testNotStrictQuoteSimple();
		}
		catch (java.io.IOException err49) {
			err49.printStackTrace();
		}
		try {
			class77.testStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err50) {
			err50.printStackTrace();
		}
		try {
			class77.testNotStrictQuoteWithSpacesAndTabs();
		}
		catch (java.io.IOException err51) {
			err51.printStackTrace();
		}
		try {
			class77.testStrictQuoteWithGarbage();
		}
		catch (java.io.IOException err52) {
			err52.printStackTrace();
		}
		try {
			class77.testCanIgnoreQuotations();
		}
		catch (java.io.IOException err53) {
			err53.printStackTrace();
		}
		class77.testFalseIgnoreQuotations();
		try {
			class77.testIssue3314579();
		}
		catch (java.io.IOException err54) {
			err54.printStackTrace();
		}
		try {
			class77.testIssue2263439();
		}
		catch (java.io.IOException err55) {
			err55.printStackTrace();
		}
		try {
			class77.testIssue2859181();
		}
		catch (java.io.IOException err56) {
			err56.printStackTrace();
		}
		try {
			class77.testIssue2726363();
		}
		catch (java.io.IOException err57) {
			err57.printStackTrace();
		}
		try {
			class77.anIOExceptionThrownifStringEndsInsideAQuotedString();
		}
		catch (java.io.IOException err58) {
			err58.printStackTrace();
		}
		try {
			class77.parseLineMultiAllowsQuotesAcrossMultipleLines();
		}
		catch (java.io.IOException err59) {
			err59.printStackTrace();
		}
		try {
			class77.pendingIsClearedAfterCallToParseLine();
		}
		catch (java.io.IOException err60) {
			err60.printStackTrace();
		}
		try {
			class77.returnPendingIfNullIsPassedIntoParseLineMulti();
		}
		catch (java.io.IOException err61) {
			err61.printStackTrace();
		}
		try {
			class77.spacesAtEndOfQuotedStringDoNotCountIfStrictQuotesIsTrue();
		}
		catch (java.io.IOException err62) {
			err62.printStackTrace();
		}
		try {
			class77.returnNullWhenNullPassedIn();
		}
		catch (java.io.IOException err63) {
			err63.printStackTrace();
		}
		class77.validateEscapeStringBeforeRealTest();
		class77.whichCharactersAreEscapable();
		try {
			class77.whitespaceBeforeEscape();
		}
		catch (java.io.IOException err64) {
			err64.printStackTrace();
		}
		try {
			class77.testIssue2958242WithoutQuotes();
		}
		catch (java.io.IOException err65) {
			err65.printStackTrace();
		}
		class77.quoteAndEscapeCannotBeTheSame();
		class77.quoteAndEscapeCanBeTheSameIfNull();
		class77.separatorCharacterCannotBeNull();
		class77.separatorAndEscapeCannotBeTheSame();
		class77.separatorAndQuoteCannotBeTheSame();
		try {
			class77.parserHandlesNullInString();
		}
		catch (java.io.IOException err66) {
			err66.printStackTrace();
		}
		com.helger.commons.csv.CSVWriterTest class78 = new com.helger.commons.csv.CSVWriterTest();
		try {
			class78.correctlyParseNullString();
		}
		catch (java.io.IOException err67) {
			err67.printStackTrace();
		}
		try {
			class78.correctlyParserNullObject();
		}
		catch (java.io.IOException err68) {
			err68.printStackTrace();
		}
		try {
			class78.testParseLine();
		}
		catch (java.io.IOException err69) {
			err69.printStackTrace();
		}
		try {
			class78.testSpecialCharacters();
		}
		catch (java.io.IOException err70) {
			err70.printStackTrace();
		}
		try {
			class78.parseLineWithBothEscapeAndQuoteChar();
		}
		catch (java.io.IOException err71) {
			err71.printStackTrace();
		}
		try {
			class78.testParseLineWithNoEscapeChar();
		}
		catch (java.io.IOException err72) {
			err72.printStackTrace();
		}
		try {
			class78.parseLineWithNoEscapeCharAndQuotes();
		}
		catch (java.io.IOException err73) {
			err73.printStackTrace();
		}
		try {
			class78.testWriteAll();
		}
		catch (java.io.IOException err74) {
			err74.printStackTrace();
		}
		try {
			class78.testWriteAllObjects();
		}
		catch (java.io.IOException err75) {
			err75.printStackTrace();
		}
		try {
			class78.testNoQuoteChars();
		}
		catch (java.io.IOException err76) {
			err76.printStackTrace();
		}
		try {
			class78.testNoQuoteCharsAndNoEscapeChars();
		}
		catch (java.io.IOException err77) {
			err77.printStackTrace();
		}
		try {
			class78.testIntelligentQuotes();
		}
		catch (java.io.IOException err78) {
			err78.printStackTrace();
		}
		try {
			class78.testNullValues();
		}
		catch (java.io.IOException err79) {
			err79.printStackTrace();
		}
		try {
			class78.testStreamFlushing();
		}
		catch (java.io.IOException err80) {
			err80.printStackTrace();
		}
		try {
			class78.flushWillThrowIOException();
		}
		catch (java.io.IOException err81) {
			err81.printStackTrace();
		}
		class78.flushQuietlyWillNotThrowException();
		try {
			class78.testAlternateEscapeChar();
		}
		catch (java.io.IOException err82) {
			err82.printStackTrace();
		}
		try {
			class78.testNoQuotingNoEscaping();
		}
		catch (java.io.IOException err83) {
			err83.printStackTrace();
		}
		try {
			class78.testNestedQuotes();
		}
		catch (java.io.IOException err84) {
			err84.printStackTrace();
		}
		try {
			class78.testAlternateLineFeeds();
		}
		catch (java.io.IOException err85) {
			err85.printStackTrace();
		}
		try {
			class78.testAvoidFinalLineEnd();
		}
		catch (java.io.IOException err86) {
			err86.printStackTrace();
		}
		try {
			class78.testApplyQuotesToAll();
		}
		catch (java.io.IOException err87) {
			err87.printStackTrace();
		}
		com.helger.commons.csv.CSVReaderTest class79 = new com.helger.commons.csv.CSVReaderTest();
		try {
			class79.testParseLine();
		}
		catch (java.io.IOException err88) {
			err88.printStackTrace();
		}
		try {
			class79.readerCanHandleNullInString();
		}
		catch (java.io.IOException err89) {
			err89.printStackTrace();
		}
		try {
			class79.testParseLineStrictQuote();
		}
		catch (java.io.IOException err90) {
			err90.printStackTrace();
		}
		try {
			class79.testParseAll();
		}
		catch (java.io.IOException err91) {
			err91.printStackTrace();
		}
		try {
			class79.testOptionalConstructors();
		}
		catch (java.io.IOException err92) {
			err92.printStackTrace();
		}
		try {
			class79.parseQuotedStringWithDefinedSeperator();
		}
		catch (java.io.IOException err93) {
			err93.printStackTrace();
		}
		try {
			class79.testSkippingLines();
		}
		catch (java.io.IOException err94) {
			err94.printStackTrace();
		}
		try {
			class79.testSkippingLinesWithDifferentEscape();
		}
		catch (java.io.IOException err95) {
			err95.printStackTrace();
		}
		try {
			class79.testNormalParsedLine();
		}
		catch (java.io.IOException err96) {
			err96.printStackTrace();
		}
		try {
			class79.testASingleQuoteAsDataElement();
		}
		catch (java.io.IOException err97) {
			err97.printStackTrace();
		}
		try {
			class79.testASingleQuoteAsDataElementWithEmptyField();
		}
		catch (java.io.IOException err98) {
			err98.printStackTrace();
		}
		try {
			class79.testSpacesAtEndOfString();
		}
		catch (java.io.IOException err99) {
			err99.printStackTrace();
		}
		try {
			class79.testEscapedQuote();
		}
		catch (java.io.IOException err100) {
			err100.printStackTrace();
		}
		try {
			class79.testEscapedEscape();
		}
		catch (java.io.IOException err101) {
			err101.printStackTrace();
		}
		try {
			class79.testSingleQuoteWhenDoubleQuoteIsQuoteChar();
		}
		catch (java.io.IOException err102) {
			err102.printStackTrace();
		}
		try {
			class79.testQuotedParsedLine();
		}
		catch (java.io.IOException err103) {
			err103.printStackTrace();
		}
		try {
			class79.bug106ParseLineWithCarriageReturnNewLineStrictQuotes();
		}
		catch (java.io.IOException err104) {
			err104.printStackTrace();
		}
		try {
			class79.testIssue2992134OutOfPlaceQuotes();
		}
		catch (java.io.IOException err105) {
			err105.printStackTrace();
		}
		class79.quoteAndEscapeMustBeDifferent();
		class79.separatorAndEscapeMustBeDifferent();
		class79.separatorAndQuoteMustBeDifferent();
		try {
			class79.testIteratorFunctionality();
		}
		catch (java.io.IOException err106) {
			err106.printStackTrace();
		}
		try {
			class79.canCloseReader();
		}
		catch (java.io.IOException err107) {
			err107.printStackTrace();
		}
		try {
			class79.canCreateIteratorFromReader();
		}
		catch (java.io.IOException err108) {
			err108.printStackTrace();
		}
		try {
			class79.attemptToReadCloseStreamReturnsNull();
		}
		catch (java.io.IOException err109) {
			err109.printStackTrace();
		}
		try {
			class79.testIssue102();
		}
		catch (java.io.IOException err110) {
			err110.printStackTrace();
		}
		try {
			class79.issue108ReaderPlaysWellWithChannels();
		}
		catch (java.io.IOException err111) {
			err111.printStackTrace();
		}
		com.helger.commons.csv.UnicodeFuncTest class80 = new com.helger.commons.csv.UnicodeFuncTest();
		try {
			class80.canParseUnicode();
		}
		catch (java.io.IOException err112) {
			err112.printStackTrace();
		}
		try {
			class80.readerTest();
		}
		catch (java.io.IOException err113) {
			err113.printStackTrace();
		}
		class80.writerTest();
		try {
			class80.runUniCodeThroughCSVReader();
		}
		catch (java.io.IOException err114) {
			err114.printStackTrace();
		}
		try {
			class80.runUniCodeThroughCSVWriter();
		}
		catch (java.io.IOException err115) {
			err115.printStackTrace();
		}
		try {
			class80.runASCIIThroughCSVWriter();
		}
		catch (java.io.IOException err116) {
			err116.printStackTrace();
		}
		try {
			class80.writeThenReadAscii();
		}
		catch (java.io.IOException err117) {
			err117.printStackTrace();
		}
		try {
			class80.writeThenReadTwiceAscii();
		}
		catch (java.io.IOException err118) {
			err118.printStackTrace();
		}
		try {
			class80.writeThenReadTwiceUnicode();
		}
		catch (java.io.IOException err119) {
			err119.printStackTrace();
		}
		try {
			class80.writeThenReadTwiceMixedUnicode();
		}
		catch (java.io.IOException err120) {
			err120.printStackTrace();
		}
		com.helger.commons.csv.ICSVLineReaderTest class81 = new com.helger.commons.csv.ICSVLineReaderTest();
		try {
			class81.lineReaderWillKeepCR();
		}
		catch (java.io.IOException err121) {
			err121.printStackTrace();
		}
		try {
			class81.lineReaderWillRemoveCR();
		}
		catch (java.io.IOException err122) {
			err122.printStackTrace();
		}
		try {
			class81.lineReaderKeepingCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err123) {
			err123.printStackTrace();
		}
		try {
			class81.lineReaderNoCRWillHandleStringWithNoLinefeed();
		}
		catch (java.io.IOException err124) {
			err124.printStackTrace();
		}
		try {
			class81.lineReaderKeepingCRWillHandleEmptyString();
		}
		catch (java.io.IOException err125) {
			err125.printStackTrace();
		}
		try {
			class81.lineReaderNoCRWillHandleEmptyString();
		}
		catch (java.io.IOException err126) {
			err126.printStackTrace();
		}
		com.helger.commons.csv.CSVIteratorTest class82 = new com.helger.commons.csv.CSVIteratorTest();
		try {
			class82.removethrowsUnsupportedOperationException();
		}
		catch (java.io.IOException err127) {
			err127.printStackTrace();
		}
		try {
			class82.initialReadReturnsStrings();
		}
		catch (java.io.IOException err128) {
			err128.printStackTrace();
		}
		try {
			class82.hasNextWorks();
		}
		catch (java.io.IOException err129) {
			err129.printStackTrace();
		}
		com.helger.commons.log.LogMessageTest class83 = new com.helger.commons.log.LogMessageTest();
		class83.testAll();
		com.helger.commons.log.LogHelperTest class84 = new com.helger.commons.log.LogHelperTest();
		class84.testAll();
		com.helger.commons.log.InMemoryLoggerTest class85 = new com.helger.commons.log.InMemoryLoggerTest();
		class85.testAll();
		com.helger.commons.vendor.VendorInfoTest class86 = new com.helger.commons.vendor.VendorInfoTest();
		class86.testHeaderLines();
		class86.testInceptionYear();
		class86.testEmail();
		class86.testURL();
		com.helger.commons.text.util.PunycodeTest class87 = new com.helger.commons.text.util.PunycodeTest();
		class87.testPunycode();
		com.helger.commons.text.util.TextHelperTest class88 = new com.helger.commons.text.util.TextHelperTest();
		class88.testGetFormattedText();
		class88.testGetCopyWithLocales();
		class88.testCreateMultilingualTextFromMap();
		com.helger.commons.text.util.ABNFTest class89 = new com.helger.commons.text.util.ABNFTest();
		class89.testIsAlpha();
		class89.testIsBit();
		class89.testIsChar();
		class89.testIsCR();
		class89.testIsCtl();
		class89.testIsDigit();
		class89.testIsDQuote();
		class89.testIsHexDigit();
		class89.testIsHexDigitCaseInsensitive();
		class89.testIsHTab();
		class89.testIsLF();
		class89.testIsOctet();
		class89.testIsSP();
		class89.testIsVChar();
		class89.testIsWSP();
		com.helger.commons.text.ConstantHasTextWithArgsTest class90 = new com.helger.commons.text.ConstantHasTextWithArgsTest();
		class90.testAll();
		class90.testStandard();
		com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest class91 = new com.helger.commons.text.resourcebundle.Utf8ResourceBundleTest();
		class91.testAll();
		com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest class92 = new com.helger.commons.text.resourcebundle.Utf8PropertyResourceBundleTest();
		class92.testAll();
		com.helger.commons.text.resourcebundle.ResourceBundleHelperTest class93 = new com.helger.commons.text.resourcebundle.ResourceBundleHelperTest();
		class93.testGetString();
		class93.testGetUtf8String();
		com.helger.commons.text.resourcebundle.ResourceBundleKeyTest class94 = new com.helger.commons.text.resourcebundle.ResourceBundleKeyTest();
		class94.testCtor();
		class94.testISO8859();
		class94.testUTF8();
		com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest class95 = new com.helger.commons.text.resourcebundle.ResourceBundleTextProviderTest();
		class95.testISO8859();
		com.helger.commons.text.MockChangeCallback class96 = new com.helger.commons.text.MockChangeCallback();
		com.helger.commons.text.ConstantHasTextTest class97 = new com.helger.commons.text.ConstantHasTextTest();
		class97.testAll();
		class97.testStandard();
		com.helger.commons.text.display.HasDisplayTextWithArgsTest class98 = new com.helger.commons.text.display.HasDisplayTextWithArgsTest();
		class98.testAll();
		com.helger.commons.text.display.IDisplayTextProviderTest class99 = new com.helger.commons.text.display.IDisplayTextProviderTest();
		class99.testAll();
		com.helger.commons.text.MultilingualTextTest class100 = new com.helger.commons.text.MultilingualTextTest();
		class100.testCtor();
		class100.testAddText();
		class100.testSetText();
		class100.testEquals();
		class100.testRemoveAll();
		class100.testAssignFrom();
		class100.testGetText();
		class100.testGetTextWithArgs();
		class100.testIsEmpty();
		class100.testQuotes();
		com.helger.commons.text.resolve.DefaultTextResolverTest class101 = new com.helger.commons.text.resolve.DefaultTextResolverTest();
		class101.testGetText();
		class101.testGetTextWithArgs();
		com.helger.commons.text.ReadOnlyMultilingualTextTest class102 = new com.helger.commons.text.ReadOnlyMultilingualTextTest();
		class102.testCtor();
		com.helger.commons.codec.IByteArrayCodecTest class103 = new com.helger.commons.codec.IByteArrayCodecTest();
		class103.testArbitraryCodecs();
		com.helger.commons.codec.RunLengthCodecTest class104 = new com.helger.commons.codec.RunLengthCodecTest();
		class104.testDecode();
		com.helger.commons.codec.ICharArrayCodecTest class105 = new com.helger.commons.codec.ICharArrayCodecTest();
		class105.testArbitraryCodecs();
		com.helger.commons.codec.GZIPCodecTest class106 = new com.helger.commons.codec.GZIPCodecTest();
		class106.testDecode();
		com.helger.commons.codec.ASCIIHexCodecTest class107 = new com.helger.commons.codec.ASCIIHexCodecTest();
		class107.testDecode();
		com.helger.commons.codec.RFC2616CodecTest class108 = new com.helger.commons.codec.RFC2616CodecTest();
		class108.testEncode();
		class108.testDecode();
		class108.testIsToken();
		com.helger.commons.codec.Base32CodecTest class109 = new com.helger.commons.codec.Base32CodecTest();
		class109.testGetEncodedLength();
		class109.testEncode();
		class109.testGetDecodedLength();
		class109.testDecode();
		com.helger.commons.codec.Base64CodecTest class110 = new com.helger.commons.codec.Base64CodecTest();
		class110.testGetEncodedLength();
		class110.testGetDecodedLength();
		com.helger.commons.codec.FlateCodecTest class111 = new com.helger.commons.codec.FlateCodecTest();
		class111.testDecode();
		com.helger.commons.codec.LZWCodecTest class112 = new com.helger.commons.codec.LZWCodecTest();
		class112.testDecode();
		class112.testEncode1();
		class112.testEncode2();
		class112.testArbitraryCodeLengthSwitches();
		class112.testArbitraryLargeBuffers();
		class112.testRandomArbitraryLargeBuffers();
		com.helger.commons.codec.ASCII85CodecTest class113 = new com.helger.commons.codec.ASCII85CodecTest();
		class113.testDecode();
		com.helger.commons.locale.country.ECountryNameTest class114 = new com.helger.commons.locale.country.ECountryNameTest();
		class114.testAll();
		com.helger.commons.locale.country.CountryCacheTest class115 = new com.helger.commons.locale.country.CountryCacheTest();
		class115.testGetCountryOfLocale();
		class115.testGetCountry();
		class115.testAddCountryNull();
		class115.testAddCountryEmpty();
		class115.testAddCountryIllegal();
		class115.testAddCountryInvalidCasing();
		class115.testAddCountry();
		class115.testContainsCountryByLocale();
		class115.testResetCache();
		class115.testContainsCountryByString();
		class115.testNoConcurrentModification();
		class115.testNoConcurrentModification2();
		class115.testResolve();
		com.helger.commons.locale.country.ECountryTest class116 = new com.helger.commons.locale.country.ECountryTest();
		class116.testAll();
		com.helger.commons.locale.country.ECountrySubNameTest class117 = new com.helger.commons.locale.country.ECountrySubNameTest();
		class117.testAll();
		com.helger.commons.locale.ELocaleNameTest class118 = new com.helger.commons.locale.ELocaleNameTest();
		class118.testAll();
		com.helger.commons.locale.LocaleFormatterTest class119 = new com.helger.commons.locale.LocaleFormatterTest();
		class119.testGetFormatted_Double();
		class119.testGetFormatted_Int();
		class119.testGetFormatted_Long();
		class119.testGetFormattedBigInteger();
		class119.testGetFormattedPercent();
		class119.testGetFormattedPercent_Scale();
		com.helger.commons.locale.LocaleHelperTest class120 = new com.helger.commons.locale.LocaleHelperTest();
		class120.testGetLocaleDisplayName();
		class120.testGetLocaleNativeDisplayName();
		class120.testGetAllLocaleDisplayNames();
		class120.testGetCalculatedLocaleListForResolving();
		class120.testGetLocaleFromString();
		class120.testGetLocaleToUseOrFallback();
		class120.testIsSpecialLocale();
		class120.testIsSpecialLocaleCode();
		class120.testGetValidLanguageCode();
		class120.testGetValidCountryCode();
		com.helger.commons.locale.language.LanguageCacheTest class121 = new com.helger.commons.locale.language.LanguageCacheTest();
		class121.testGetLanguageOfLocale();
		class121.testGetLanguage();
		class121.testAddLanguageNull();
		class121.testAddLanguageEmpty();
		class121.testAddLanguageIllegal();
		class121.testAddLanguageInvalidCasing();
		class121.testAddLanguage();
		class121.testContainsLanguageByLocale();
		class121.testResetCache();
		class121.testContainsLanguageByString();
		class121.testNoConcurrentModification();
		class121.testNoConcurrentModification2();
		com.helger.commons.locale.LocaleParserTest class122 = new com.helger.commons.locale.LocaleParserTest();
		class122.testParse();
		class122.testParseDouble();
		class122.testParseInt();
		class122.testParseLong();
		class122.testParseBigDecimal();
		com.helger.commons.locale.LocaleCacheTest class123 = new com.helger.commons.locale.LocaleCacheTest();
		class123.testGet();
		class123.testGetInvalid();
		class123.testGetAllLocales();
		class123.testGetAllLanguages();
		class123.testContainsLocale();
		class123.testResetCache();
		com.helger.commons.id.IHasLongIDTest class124 = new com.helger.commons.id.IHasLongIDTest();
		class124.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest class125 = new com.helger.commons.id.factory.StringIDFromGlobalIntIDFactoryTest();
		class125.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest class126 = new com.helger.commons.id.factory.StringIDFromGlobalLongIDFactoryTest();
		class126.testAll();
		com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest class127 = new com.helger.commons.id.factory.MemoryStaticLongIDFactoryTest();
		class127.testAll();
		com.helger.commons.id.factory.FileIntIDFactoryTest class128 = new com.helger.commons.id.factory.FileIntIDFactoryTest();
		class128.testAll();
		com.helger.commons.id.factory.MemoryLongIDFactoryTest class129 = new com.helger.commons.id.factory.MemoryLongIDFactoryTest();
		class129.testAll();
		com.helger.commons.id.factory.MemoryIntIDFactoryTest class130 = new com.helger.commons.id.factory.MemoryIntIDFactoryTest();
		class130.testAll();
		com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest class131 = new com.helger.commons.id.factory.MemoryStaticIntIDFactoryTest();
		class131.testAll();
		com.helger.commons.id.factory.FileLongIDFactoryTest class132 = new com.helger.commons.id.factory.FileLongIDFactoryTest();
		class132.testAll();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest class133 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentIntIDFactoryTest();
		class133.testAll();
		com.helger.commons.id.factory.GlobalIDFactoryTest class134 = new com.helger.commons.id.factory.GlobalIDFactoryTest();
		class134.testSet();
		class134.testGetNewID();
		class134.testNoFactories();
		com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest class135 = new com.helger.commons.id.factory.StringIDFromGlobalPersistentLongIDFactoryTest();
		class135.testAll();
		com.helger.commons.id.IIntIDProviderTest class136 = new com.helger.commons.id.IIntIDProviderTest();
		class136.testAll();
		com.helger.commons.id.IHasIntIDTest class137 = new com.helger.commons.id.IHasIntIDTest();
		class137.testAll();
		com.helger.commons.id.IIDProviderTest class138 = new com.helger.commons.id.IIDProviderTest();
		class138.testAll();
		com.helger.commons.id.ILongIDProviderTest class139 = new com.helger.commons.id.ILongIDProviderTest();
		class139.testAll();
		com.helger.commons.callback.CallbackListTest class140 = new com.helger.commons.callback.CallbackListTest();
		class140.testBasic();
		com.helger.commons.callback.exception.LoggingExceptionCallbackTest class141 = new com.helger.commons.callback.exception.LoggingExceptionCallbackTest();
		class141.testAll();
		com.helger.commons.random.VerySecureRandomTest class142 = new com.helger.commons.random.VerySecureRandomTest();
		class142.testRandomGen();
		com.helger.commons.datetime.PDTFormatPatternsTest class143 = new com.helger.commons.datetime.PDTFormatPatternsTest();
		class143.testGetPattern();
		com.helger.commons.datetime.PDTConfigTest class144 = new com.helger.commons.datetime.PDTConfigTest();
		class144.testTimeZones();
		com.helger.commons.datetime.PDTFactoryTest class145 = new com.helger.commons.datetime.PDTFactoryTest();
		class145.testCurrent();
		class145.testCreateLocalDate();
		com.helger.commons.datetime.PDTFromStringTest class146 = new com.helger.commons.datetime.PDTFromStringTest();
		class146.testFromString();
		class146.testDateTimeFromString();
		class146.testLocalDateFromString();
		class146.testDefaultToStringAndBack();
		com.helger.commons.datetime.PDTFormatterTest class147 = new com.helger.commons.datetime.PDTFormatterTest();
		class147.testGetDefaultFormatter();
		class147.testGetForPattern();
		class147.testGetDefault();
		class147.testLeadingZero();
		class147.testSpecialCases();
		class147.testPrintDateExplicit();
		class147.testPrintAndParseDate();
		com.helger.commons.datetime.PDTWebDateHelperTest class148 = new com.helger.commons.datetime.PDTWebDateHelperTest();
		class148.testRfc822();
		class148.testW3CTime();
		class148.testXSDDateTime();
		class148.testXSDLocalDate();
		class148.testXSDLocalDateTime();
		com.helger.commons.gfx.ImageDataManagerTest class149 = new com.helger.commons.gfx.ImageDataManagerTest();
		class149.testGetImageSize();
		com.helger.commons.equals.EqualsHelperTest class150 = new com.helger.commons.equals.EqualsHelperTest();
		class150.testEquals_Float();
		class150.testEquals_Double();
		try {
			class150.testEquals_URL();
		}
		catch (java.net.MalformedURLException err130) {
			err130.printStackTrace();
		}
		class150.testEquals_BigDecimal();
		class150.testEquals_PasswordAuthentication();
		try {
			class150.testNullSafeEquals();
		}
		catch (java.net.MalformedURLException err131) {
			err131.printStackTrace();
		}
		class150.testEqualsTypeSpecific();
		class150.testBasic();
		class150.testList();
		class150.testSet();
		class150.testMap();
		class150.testArray();
		class150.testArrayComplex();
		class150.testComplex();
		class150.testIterator();
		class150.testIterable();
		class150.testEnumeration();
		class150.testEqualsAsCollection();
		com.helger.commons.equals.EqualsImplementationRegistryTest class151 = new com.helger.commons.equals.EqualsImplementationRegistryTest();
		try {
			class151.testEquals();
		}
		catch (javax.xml.parsers.ParserConfigurationException err132) {
			err132.printStackTrace();
		}
		com.helger.commons.version.VersionRangeTest class152 = new com.helger.commons.version.VersionRangeTest();
		class152.testVersionRange();
		class152.testCtor1();
		class152.testCtor2();
		class152.testVersionMatches();
		class152.testGetAsString();
		class152.testGetAsStringPrintZeroElements();
		class152.testCompareTo();
		class152.testEquals();
		class152.testSerialization();
		com.helger.commons.version.VersionTest class153 = new com.helger.commons.version.VersionTest();
		class153.testVersionIntIntInt();
		class153.testVersionString();
		class153.testCompareTo();
		class153.testEqualsObject();
		class153.testGetAsString();
		class153.testGetAsStringBoolean();
		class153.testHashCode();
		class153.testCompare();
		class153.testSerialization();
		com.helger.commons.math.CombinationGeneratorTest class154 = new com.helger.commons.math.CombinationGeneratorTest();
		class154.testStringCombination();
		class154.testStringCombination2();
		class154.testCtor();
		com.helger.commons.math.RoundHelperTest class155 = new com.helger.commons.math.RoundHelperTest();
		class155.testDecimalType();
		class155.testGetRounded();
		class155.testGetRoundedUpFix();
		class155.testGetFormatted();
		class155.testGetRoundedEvenExp();
		class155.testGetFormattedFix();
		class155.testGetFormattedExp();
		com.helger.commons.math.FactorialHelperTest class156 = new com.helger.commons.math.FactorialHelperTest();
		class156.testSmall();
		class156.testGetAnyFactorialLinear();
		com.helger.commons.math.CombinationGeneratorFlexibleTest class157 = new com.helger.commons.math.CombinationGeneratorFlexibleTest();
		class157.testStringCombination();
		class157.testCtor();
		class157.testHugeDataSet();
		class157.testRedundancy();
		com.helger.commons.math.MathHelperTest class158 = new com.helger.commons.math.MathHelperTest();
		class158.testGetRoundedUp();
		class158.testGetDividedDouble();
		class158.testGetDividedBigDecimal();
		class158.testIntDivide();
		class158.testLongDivide();
		class158.testLongToInt();
		class158.testGetMaxInt();
		class158.testGetMaxLong();
		class158.testGetMaxFloat();
		class158.testGetMaxDouble();
		class158.testGetMinInt();
		class158.testGetMinLong();
		class158.testGetMinFloat();
		class158.testGetMinDouble();
		class158.testAbsInt();
		class158.testAbsLong();
		class158.testAbsFloat();
		class158.testAbsDouble();
		class158.testGetUnsignedInt();
		class158.testGetWithoutTrailingZeroes();
		class158.testGetFractionDigits();
		class158.testAddPercent();
		class158.testSubtractPercent();
		class158.testGetPercentValue();
		class158.testIsExactlyOneBitSetToOneInt();
		class158.testIsExactlyOneBitSetToOneLong();
		com.helger.commons.functional.IPredicateFuncTest class159 = new com.helger.commons.functional.IPredicateFuncTest();
		class159.testAll();
		class159.testNone();
		class159.testNotNull();
		class159.testIsNull();
		class159.testNegate();
		com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest class160 = new com.helger.commons.statistics.StatisticsHandlerKeyedSizeTest();
		class160.testAll();
		com.helger.commons.statistics.util.StatisticsVisitorTest class161 = new com.helger.commons.statistics.util.StatisticsVisitorTest();
		class161.testWalkStatistics();
		com.helger.commons.statistics.StatisticsHandlerTimerTest class162 = new com.helger.commons.statistics.StatisticsHandlerTimerTest();
		class162.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest class163 = new com.helger.commons.statistics.StatisticsHandlerKeyedCounterTest();
		class163.testAll();
		com.helger.commons.statistics.StatisticsHandlerCounterTest class164 = new com.helger.commons.statistics.StatisticsHandlerCounterTest();
		class164.testAll();
		com.helger.commons.statistics.StatisticsHandlerSizeTest class165 = new com.helger.commons.statistics.StatisticsHandlerSizeTest();
		class165.testAll();
		com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest class166 = new com.helger.commons.statistics.StatisticsHandlerKeyedTimerTest();
		class166.testAll();
		com.helger.commons.statistics.StatisticsHandlerCacheTest class167 = new com.helger.commons.statistics.StatisticsHandlerCacheTest();
		class167.testAll();
		com.helger.commons.statistics.StatisticsManagerTest class168 = new com.helger.commons.statistics.StatisticsManagerTest();
		class168.testCacheHandler();
		class168.testTimerHandler();
		class168.testKeyedTimerHandler();
		class168.testSizeHandler();
		class168.testKeyedSizeHandler();
		class168.testCounterHandler();
		class168.testKeyedCounterHandler();
		com.helger.commons.exception.mock.MockRuntimeExceptionTest class169 = new com.helger.commons.exception.mock.MockRuntimeExceptionTest();
		class169.testEmpty();
		class169.testWithMessage();
		class169.testWithException();
		class169.testWithExceptionAndMessage();
		com.helger.commons.exception.mock.MockExceptionTest class170 = new com.helger.commons.exception.mock.MockExceptionTest();
		try {
			class170.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockException err133) {
			err133.printStackTrace();
		}
		try {
			class170.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err134) {
			err134.printStackTrace();
		}
		try {
			class170.testWithException();
		}
		catch (com.helger.commons.exception.mock.MockException err135) {
			err135.printStackTrace();
		}
		try {
			class170.testWithExceptionAndMessage();
		}
		catch (com.helger.commons.exception.mock.MockException err136) {
			err136.printStackTrace();
		}
		com.helger.commons.exception.mock.MockIOExceptionTest class171 = new com.helger.commons.exception.mock.MockIOExceptionTest();
		try {
			class171.testEmpty();
		}
		catch (com.helger.commons.exception.mock.MockIOException err137) {
			err137.printStackTrace();
		}
		try {
			class171.testWithMessage();
		}
		catch (com.helger.commons.exception.mock.MockIOException err138) {
			err138.printStackTrace();
		}
		com.helger.commons.exception.InitializationExceptionTest class172 = new com.helger.commons.exception.InitializationExceptionTest();
		class172.testAll();
		com.helger.commons.hierarchy.IParentProviderFuncTest class173 = new com.helger.commons.hierarchy.IParentProviderFuncTest();
		class173.testParentProviderHasParent();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest class174 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenWithIDTest();
		class174.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest class175 = new com.helger.commons.hierarchy.ChildrenProviderSortingWithIDTest();
		class175.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest class176 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenTest();
		class176.testAll();
		com.helger.commons.hierarchy.IChildrenProviderTest class177 = new com.helger.commons.hierarchy.IChildrenProviderTest();
		class177.testAll();
		com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest class178 = new com.helger.commons.hierarchy.visit.EHierarchyVisitorReturnTest();
		class178.testAll();
		com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest class179 = new com.helger.commons.hierarchy.visit.ChildrenProviderHierarchyVisitorTest();
		class179.testAll();
		com.helger.commons.hierarchy.ChildrenProviderSortingTest class180 = new com.helger.commons.hierarchy.ChildrenProviderSortingTest();
		class180.testAll();
		com.helger.commons.hierarchy.MockChildrenProviderWithID class181 = new com.helger.commons.hierarchy.MockChildrenProviderWithID();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest class182 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortedTest();
		class182.testAll();
		com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest class183 = new com.helger.commons.hierarchy.ChildrenProviderHasChildrenSortingTest();
		class183.testAll();
		com.helger.commons.ValueEnforcerTest class184 = new com.helger.commons.ValueEnforcerTest();
		class184.testNotNull();
		class184.testNotEmpty1();
		class184.testNotEmpty2();
		class184.testNotEmpty3();
		class184.testNotEmpty4();
		class184.testNotEmpty5();
		class184.testNotEmpty6();
		class184.testNotEmpty7();
		class184.testNotEmpty8();
		class184.testNotEmpty9();
		com.helger.commons.thirdparty.ELicenseTest class185 = new com.helger.commons.thirdparty.ELicenseTest();
		class185.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest class186 = new com.helger.commons.thirdparty.ThirdPartyModuleRegistryTest();
		class186.testAll();
		com.helger.commons.thirdparty.ThirdPartyModuleTest class187 = new com.helger.commons.thirdparty.ThirdPartyModuleTest();
		class187.testAll();
		class187.testStd();
		com.helger.commons.thirdparty.CustomLicenseTest class188 = new com.helger.commons.thirdparty.CustomLicenseTest();
		class188.testAll();
		com.helger.commons.http.HttpHeaderMapTest class189 = new com.helger.commons.http.HttpHeaderMapTest();
		class189.testEmpty();
		class189.testSimpleValue();
		class189.testMultipleSimpleValues();
		class189.testMultiValue();
		class189.testAddAllHeadersEmpty();
		class189.testAddAllHeadersPrefilled();
		class189.testAddAllHeadersPrefilledDifferentCasing();
		class189.testAddAllHeadersPrefilledSameName();
		class189.testSetAllHeadersEmpty();
		class189.testSetAllHeadersPrefilled();
		class189.testSetAllHeadersPrefilledSameName();
		class189.testGetUnifiedValues();
		com.helger.commons.typeconvert.TypeConverterExceptionTest class190 = new com.helger.commons.typeconvert.TypeConverterExceptionTest();
		class190.testAll();
		class190.testReason();
		com.helger.commons.typeconvert.IOTypeConverterRegistrarTest class191 = new com.helger.commons.typeconvert.IOTypeConverterRegistrarTest();
		try {
			class191.testConvert();
		}
		catch (java.io.IOException err139) {
			err139.printStackTrace();
		}
		com.helger.commons.typeconvert.TypeConverterTest class192 = new com.helger.commons.typeconvert.TypeConverterTest();
		try {
			class192.testConvertAllToAll();
		}
		catch (java.lang.Exception err140) {
			err140.printStackTrace();
		}
		class192.testFromBoolean();
		class192.testFromNonNumericString();
		class192.testToString();
		class192.testLocale();
		class192.testArray();
		class192.testBigX();
		class192.testConvertToObject();
		class192.testNoConverterButAssignable();
		class192.testNoConverterNoConversion();
		class192.testBooleanArray();
		class192.testByteArray();
		class192.testCharArray();
		class192.testDoubleArray();
		class192.testFloatArray();
		class192.testIntArray();
		class192.testLongArray();
		class192.testShortArray();
		class192.testPrimitives();
		class192.testSpecials();
		com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest class193 = new com.helger.commons.typeconvert.CharsetTypeConverterRegistrarTest();
		class193.testConvert();
		com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest class194 = new com.helger.commons.typeconvert.DateTimeTypeConverterRegistrarTest();
		class194.testDateTime();
		class194.testLocalDateTime();
		class194.testLocalDate();
		class194.testLocalTime();
		class194.testConvertIntoEachOther();
		com.helger.commons.wrapper.WrapperTest class195 = new com.helger.commons.wrapper.WrapperTest();
		class195.testWrapper();
		com.helger.commons.location.SimpleLocationTest class196 = new com.helger.commons.location.SimpleLocationTest();
		class196.testBasic();
		com.helger.commons.state.EInterruptTest class197 = new com.helger.commons.state.EInterruptTest();
		class197.testAll();
		com.helger.commons.state.ETriStateTest class198 = new com.helger.commons.state.ETriStateTest();
		class198.testAll();
		com.helger.commons.state.SuccessWithValueTest class199 = new com.helger.commons.state.SuccessWithValueTest();
		class199.testAll();
		com.helger.commons.state.EHandledTest class200 = new com.helger.commons.state.EHandledTest();
		class200.testAll();
		com.helger.commons.state.EValidityTest class201 = new com.helger.commons.state.EValidityTest();
		class201.testAll();
		com.helger.commons.state.EEnabledTest class202 = new com.helger.commons.state.EEnabledTest();
		class202.testAll();
		com.helger.commons.state.EContinueTest class203 = new com.helger.commons.state.EContinueTest();
		class203.testAll();
		com.helger.commons.state.ETopBottomTest class204 = new com.helger.commons.state.ETopBottomTest();
		class204.testAll();
		com.helger.commons.state.EMandatoryTest class205 = new com.helger.commons.state.EMandatoryTest();
		class205.testAll();
		com.helger.commons.state.ELeftRightTest class206 = new com.helger.commons.state.ELeftRightTest();
		class206.testAll();
		com.helger.commons.state.ESuccessTest class207 = new com.helger.commons.state.ESuccessTest();
		class207.testAll();
		com.helger.commons.state.EChangeTest class208 = new com.helger.commons.state.EChangeTest();
		class208.testAll();
		com.helger.commons.state.ChangeWithValueTest class209 = new com.helger.commons.state.ChangeWithValueTest();
		class209.testAll();
		com.helger.commons.string.util.RomanNumeralTest class210 = new com.helger.commons.string.util.RomanNumeralTest();
		class210.testBasic();
		class210.testAll();
		com.helger.commons.string.util.LevenshteinDistanceTest class211 = new com.helger.commons.string.util.LevenshteinDistanceTest();
		class211.testGetDistanceString();
		class211.testGetDistanceCharArray();
		class211.testCostsString();
		class211.testCostsCharArray();
		com.helger.commons.string.util.StringScannerTest class212 = new com.helger.commons.string.util.StringScannerTest();
		class212.testAll();
		com.helger.commons.string.StringHelperTest class213 = new com.helger.commons.string.StringHelperTest();
		class213.testHasTextAndHasNoText();
		class213.testLeadingZero();
		class213.testHexEncode();
		class213.testGetHexValue();
		class213.testGetHexChar();
		class213.testHexDecode();
		class213.testHexStringByte();
		class213.testHexStringLeadingZeroByte();
		class213.testHexStringLeadingZero2Byte();
		class213.testHexStringInt();
		class213.testHexStringLeadingZeroInt();
		class213.testHexStringLong();
		class213.testHexStringLeadingZeroLong();
		class213.testHexStringShort();
		class213.testHexStringLeadingZeroShort();
		class213.testGetLeadingWhitespaceCount();
		class213.testGetTrailingWhitespaceCount();
		class213.testGetLeadingCharCount();
		class213.testGetTrailingCharCount();
		class213.testImplodeIterable();
		class213.testImplodeArray();
		class213.testImplodeMap();
		class213.testGetImplodedNonEmptyIterable();
		class213.testGetImplodedNonEmptyArray();
		class213.testGetExplodedToList();
		class213.testGetExplodedToListWithMax();
		class213.testGetExplodedArray();
		class213.testExplodeToSet();
		class213.testExplodeToOrderedSet();
		class213.testGetRepeated();
		class213.testConcatenateOnDemand();
		class213.testStartsWithChar();
		class213.testStartsWithString();
		class213.testEndsWithChar();
		class213.testEndsWithString();
		class213.testGetIndexOfString();
		class213.testGetLastIndexOfString();
		class213.testGetIndexOfChar();
		class213.testGetLastIndexOfChar();
		class213.testContainsString();
		class213.testContainsChar();
		class213.testIndexOfIgnoreCaseString();
		class213.testContainsIgnoreCaseString();
		class213.testGetOccurrenceCountString();
		class213.testGetOccurrenceCountChar();
		class213.testGetOccurrenceCountIgnoreCaseString();
		class213.testGetOccurrenceCountIgnoreCaseChar();
		class213.testTrimLeadingWhitespaces();
		class213.testTrimTrailingWhitespaces();
		class213.testTrimEnd();
		class213.testTrimEndRepeatedlyString();
		class213.testTrimEndRepeatedlyChar();
		class213.testTrimEndInt();
		class213.testTrimStart();
		class213.testTrimStartRepeatedlyString();
		class213.testTrimStartRepeatedlyChar();
		class213.testTrimStartInt();
		class213.testTrim();
		class213.testGetFirstChar();
		class213.testGetLastChar();
		class213.testGetCharCount();
		class213.testGetLineCount();
		class213.testGetCharacterCountInt();
		class213.testGetCharacterCountLong();
		class213.testCutAfterLength();
		class213.testGetNotNullString();
		class213.testGetNotNullCharSeq();
		class213.testReplaceAllString();
		class213.testReplaceAllChar();
		class213.testReplaceAllSafe();
		class213.testReplaceAllRepeatedly();
		class213.testReplaceMultipleMap();
		class213.testReplaceMultipleCharArrays();
		try {
			class213.testReplaceMultipleTo();
		}
		catch (java.io.IOException err141) {
			err141.printStackTrace();
		}
		class213.testReplaceMultipleCharArrayToChar();
		class213.testRemoveAllChar();
		class213.testRemoveAllString();
		class213.testToString();
		class213.testMultiContains();
		class213.testGetWithoutLeadingChar();
		class213.testGetWithoutLeadingChars();
		class213.testGetWithoutTrailingChar();
		class213.testGetWithoutTrailingChars();
		class213.testGetUntilFirstExcl();
		class213.testGetUntilLastExcl();
		class213.testGetUntilFirstIncl();
		class213.testGetUntilLastIncl();
		class213.testGetFromFirstExcl();
		class213.testGetFromLastExcl();
		class213.testGetFromFirstIncl();
		class213.testGetFromLastIncl();
		class213.testGetWithoutWhiteSpaces();
		class213.testGetFirstTokenChar();
		class213.testGetFirstTokenString();
		class213.testGetLastTokenChar();
		class213.testGetLastTokenString();
		class213.testGetReverse();
		class213.testContainsAnyOnlyNoneString();
		class213.testContainsAnyOnlyNoneCharSequence();
		class213.testIsAllWhitespace();
		class213.testGetQuoted();
		class213.testAppendQuotedSB();
		try {
			class213.testAppendQuotedWriter();
		}
		catch (java.io.IOException err142) {
			err142.printStackTrace();
		}
		com.helger.commons.string.StringParserTest class214 = new com.helger.commons.string.StringParserTest();
		class214.testParseBool();
		class214.testParseBoolObj();
		class214.testParseBoolObjExact();
		class214.testParseByte();
		class214.testParseByteObj();
		class214.testParseInt();
		class214.testParseIntObj();
		class214.testParseLong();
		class214.testParseLongObj();
		class214.testParseDouble();
		class214.testParseDoubleObj();
		class214.testParseFloat();
		class214.testParseFloatObj();
		class214.testParseBigInteger();
		class214.testParseBigDecimal();
		class214.testIsInt();
		class214.testIsLong();
		class214.testIsUnsignedInt();
		class214.testIsUnsignedLong();
		class214.testIsDouble();
		class214.testParseUnsignedIntegerObj();
		com.helger.commons.string.ToStringGeneratorTest class215 = new com.helger.commons.string.ToStringGeneratorTest();
		class215.testSimple();
		class215.testCommon();
		class215.testCircularReference();
		com.helger.commons.pool.ObjectPoolTest class216 = new com.helger.commons.pool.ObjectPoolTest();
		try {
			class216.testSimple();
		}
		catch (java.lang.InterruptedException err143) {
			err143.printStackTrace();
		}
		com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest class217 = new com.helger.commons.format.FormatterStringSkipPrefixAndSuffixTest();
		class217.testAll();
		class217.testPrefix();
		class217.testSuffix();
		com.helger.commons.format.FormatableObjectTest class218 = new com.helger.commons.format.FormatableObjectTest();
		class218.testAll();
		class218.testImpl();
		com.helger.commons.supplementary.test.code.StringTrieFuncTest class219 = new com.helger.commons.supplementary.test.code.StringTrieFuncTest();
		com.helger.commons.supplementary.test.code.MainDoubleToString class220 = new com.helger.commons.supplementary.test.code.MainDoubleToString();
		com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect class221 = new com.helger.commons.supplementary.test.nullable.MockNullableTestCorrect();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull class222 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNonNull();
		com.helger.commons.supplementary.test.nullable.MockNullableTestNullable class223 = new com.helger.commons.supplementary.test.nullable.MockNullableTestNullable();
		com.helger.commons.supplementary.test.deadlock.MainDeadLock class224 = new com.helger.commons.supplementary.test.deadlock.MainDeadLock();
		com.helger.commons.supplementary.test.deadlock.MainDeadLock2 class225 = new com.helger.commons.supplementary.test.deadlock.MainDeadLock2();
		com.helger.commons.supplementary.test.java.JavaThrowingLambda class226 = new com.helger.commons.supplementary.test.java.JavaThrowingLambda();
		com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest class227 = new com.helger.commons.supplementary.test.java.JavaPrivateMethodFuncTest();
		class227.testPrivateAccessor();
		com.helger.commons.supplementary.test.java.AESCryptFuncTest class228 = new com.helger.commons.supplementary.test.java.AESCryptFuncTest();
		class228.testMe();
		com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest class229 = new com.helger.commons.supplementary.test.java.JavaListAllLocalesFuncTest();
		class229.testListAllCountries();
		class229.testListAllSerbianCountries();
		com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest class230 = new com.helger.commons.supplementary.test.java.JavaListDigestProviderFuncTest();
		class230.testListAllDigestProvider();
		com.helger.commons.supplementary.test.java.JavaCharsetFuncTest class231 = new com.helger.commons.supplementary.test.java.JavaCharsetFuncTest();
		class231.testAllCharsets();
		class231.testAllCharsetNamess();
		com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest class232 = new com.helger.commons.supplementary.test.java.JavaPrinterTrayFinderFuncTest();
		class232.testListPrinterTrays();
		com.helger.commons.supplementary.test.java.JavaExecOrderTest class233 = new com.helger.commons.supplementary.test.java.JavaExecOrderTest();
		class233.testV1();
		class233.testV2();
		class233.testV3();
		com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest class234 = new com.helger.commons.supplementary.test.java.JavaListAllFontsFuncTest();
		class234.testGetAllFonts();
		com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest class235 = new com.helger.commons.supplementary.test.java.JavaClassLoaderFuncTest();
		class235.testGetResourceThisProject();
		class235.testGetDirectoryThisProject();
		class235.testGetResourceLinkedProject();
		class235.testGetDirectoryLinkedProject_TrailingSlash();
		class235.testGetDirectoryLinkedProject_NoTrailingSlash();
		class235.testGetResourceRuntime();
		class235.testGetDirectoryRuntime();
		com.helger.commons.supplementary.test.java.JavaArrayFuncTest class236 = new com.helger.commons.supplementary.test.java.JavaArrayFuncTest();
		class236.testReflectionIntArray();
		com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest class237 = new com.helger.commons.supplementary.test.java.JavaCharToLowercaseFuncTest();
		class237.testAllCharsets();
		com.helger.commons.supplementary.test.java.JavaCollatorFuncTest class238 = new com.helger.commons.supplementary.test.java.JavaCollatorFuncTest();
		try {
			class238.testCollation();
		}
		catch (java.text.ParseException err144) {
			err144.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest class239 = new com.helger.commons.supplementary.test.java.JavaBigDecimalFuncTest();
		class239.testDivide();
		class239.testCompareEquals();
		com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest class240 = new com.helger.commons.supplementary.test.java.JavaDecimalFormatFuncTest();
		class240.testDecimalFormat();
		class240.testCurrencyNoSymbol();
		class240.testNumberFormatVsToString();
		com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest class241 = new com.helger.commons.supplementary.test.java.JavaBitOperationsFuncTest();
		class241.testBitWise();
		class241.testBitWiseOr();
		com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest class242 = new com.helger.commons.supplementary.test.java.JavaMessageFormatFuncTest();
		class242.testBasicFormat();
		com.helger.commons.supplementary.test.java.JavaFileFuncTest class243 = new com.helger.commons.supplementary.test.java.JavaFileFuncTest();
		class243.testGetPath();
		com.helger.commons.supplementary.test.java.JavaCommonsFuncTest class244 = new com.helger.commons.supplementary.test.java.JavaCommonsFuncTest();
		class244.testAssignability();
		class244.testAutoboxing();
		class244.testParseBoolean();
		class244.testHexString();
		com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest class245 = new com.helger.commons.supplementary.test.java.JavaFileAccessFuncTest();
		try {
			class245.testAccessRights();
		}
		catch (java.io.IOException err145) {
			err145.printStackTrace();
		}
		catch (java.lang.InterruptedException err146) {
			err146.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaURLFuncTest class246 = new com.helger.commons.supplementary.test.java.JavaURLFuncTest();
		try {
			class246.testURLParts();
		}
		catch (java.net.URISyntaxException err147) {
			err147.printStackTrace();
		}
		catch (java.net.MalformedURLException err148) {
			err148.printStackTrace();
		}
		com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest class247 = new com.helger.commons.supplementary.test.java.JavaFileUNCFuncTest();
		class247.testUNC();
		com.helger.commons.supplementary.test.java.FontKerningFuncTest class248 = new com.helger.commons.supplementary.test.java.FontKerningFuncTest();
		try {
			class248.testKerning();
		}
		catch (java.io.IOException err149) {
			err149.printStackTrace();
		}
		com.helger.commons.type.ObjectTypeTest class249 = new com.helger.commons.type.ObjectTypeTest();
		class249.testAll();
		com.helger.commons.type.TypedObjectTest class250 = new com.helger.commons.type.TypedObjectTest();
		class250.testAll();
		com.helger.commons.io.streamprovider.MockNullInputStreamProvider class251 = new com.helger.commons.io.streamprovider.MockNullInputStreamProvider();
		com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest class252 = new com.helger.commons.io.streamprovider.ByteArrayOutputStreamProviderTest();
		class252.testSimple();
		com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest class253 = new com.helger.commons.io.streamprovider.ByteBufferInputStreamProviderTest();
		class253.testSimple();
		com.helger.commons.io.streamprovider.StringInputStreamProviderTest class254 = new com.helger.commons.io.streamprovider.StringInputStreamProviderTest();
		class254.testSimpleCharset();
		class254.testBOM();
		class254.testSerialization();
		com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest class255 = new com.helger.commons.io.streamprovider.ByteArrayInputStreamProviderTest();
		class255.testSimple();
		com.helger.commons.io.file.IFileFilterFuncTest class256 = new com.helger.commons.io.file.IFileFilterFuncTest();
		class256.testGetFilterFileOnly();
		class256.testGetFilterDirectoryOnly();
		class256.testGetFilterDirectoryPublic();
		class256.testGetParentDirectoryPublic();
		class256.testGetFilterFilenameHidden();
		class256.testFilenameStartsWith();
		class256.testFilenameEndsWith();
		class256.testFilenameEqualsIgnoreCase();
		class256.testFilenameEquals();
		class256.testFilenameMatchAnyRegEx();
		class256.testFilenameMatchNoRegEx();
		com.helger.commons.io.file.EFileIOOperationTest class257 = new com.helger.commons.io.file.EFileIOOperationTest();
		class257.testAll();
		com.helger.commons.io.file.ERandomAccessFileModeTest class258 = new com.helger.commons.io.file.ERandomAccessFileModeTest();
		class258.testAll();
		com.helger.commons.io.file.SimpleFileIOTest class259 = new com.helger.commons.io.file.SimpleFileIOTest();
		class259.testReadFileBytes();
		class259.testReaFileLines();
		class259.testReadFileAsString();
		class259.testWriteFile();
		com.helger.commons.io.file.FileSystemIteratorTest class260 = new com.helger.commons.io.file.FileSystemIteratorTest();
		class260.testCtor();
		com.helger.commons.io.file.FileOperationsTest class261 = new com.helger.commons.io.file.FileOperationsTest();
		class261.testCreateDir();
		class261.testCreateDirIfNotExisting();
		class261.testCreateDirRecursive();
		class261.testCreateDirRecursiveIfNotExisting();
		class261.testRenameDir();
		class261.testRenameFile();
		class261.testCopyFile();
		class261.testCopyDir();
		class261.testDeleteDir();
		class261.testDeleteDirRecursive();
		class261.testDeleteFile();
		com.helger.commons.io.file.PathOperationsTest class262 = new com.helger.commons.io.file.PathOperationsTest();
		class262.testCreateDir();
		class262.testCreateDirIfNotExisting();
		class262.testCreateDirRecursive();
		class262.testCreateDirRecursiveIfNotExisting();
		class262.testRenameDir();
		class262.testRenameFile();
		class262.testCopyFile();
		class262.testCopyDir();
		class262.testDeleteDir();
		class262.testDeleteDirRecursive();
		class262.testDeleteFile();
		com.helger.commons.io.file.FilenameHelperTest class263 = new com.helger.commons.io.file.FilenameHelperTest();
		class263.testGetIndexOfExtension();
		class263.testGetWithoutExtension();
		class263.testGetBaseName();
		class263.testGetExtensionString();
		class263.testGetExtensionFile();
		class263.testGetIndexOfLastSeparator();
		class263.testGetWithoutPath();
		class263.testGetPath();
		class263.testIsValidFilename();
		class263.testIsValidFilenameWithPaths();
		class263.testGetAsValidFilename();
		class263.testGetAsValidASCIIFilename();
		class263.testIsPathSeparatorChar();
		class263.testStartsWithPathSeparatorChar();
		class263.testEndsWithPathSeparatorChar();
		class263.testContainsPathSeparatorChar();
		class263.testHasExtensionString();
		class263.testHasExtensionFile();
		class263.testIsSystemInternalDirectory_String();
		class263.testIsSystemInternalDirectory_File();
		class263.testGetCleanConcatenatedUrlPath();
		class263.testGetCleanPath_File();
		class263.testGetCleanPath_String();
		class263.testMatchPathsIgnoreSepType();
		class263.testGetPathUsingUnixSeparator();
		class263.testEnsurePathEndingWithoutSeparator();
		class263.testEnsurePathEndingWithSeparator();
		class263.testEnsurePathStartingWithSeparator();
		class263.testGetSecureFilename();
		class263.testGetRelativeToParentDirectory();
		class263.testGetAbsoluteWithEnsuredParentDirectory();
		class263.testGetAbsoluteWithEnsuredParentDirectoryAbsolute();
		com.helger.commons.io.file.FileSystemRecursiveIteratorTest class264 = new com.helger.commons.io.file.FileSystemRecursiveIteratorTest();
		class264.testCtor();
		com.helger.commons.io.file.FileHelperTest class265 = new com.helger.commons.io.file.FileHelperTest();
		class265.testExistsFile();
		class265.testExistsDir();
		class265.testEnsureParentDirectoryIsPresent();
		class265.testIsParentDirectory();
		class265.testGetFileSizeDisplay();
		class265.testGetSecureFile();
		class265.testGetInputStream();
		class265.testGetOutputStream();
		try {
			class265.testIsFileNewer();
		}
		catch (java.io.IOException err150) {
			err150.printStackTrace();
		}
		class265.testGetDirectoryObjectCount();
		class265.testSafeEquals();
		com.helger.commons.io.file.EFileIOErrorCodeTest class266 = new com.helger.commons.io.file.EFileIOErrorCodeTest();
		class266.testAll();
		com.helger.commons.io.file.FileOperationManagerTest class267 = new com.helger.commons.io.file.FileOperationManagerTest();
		class267.testCtor();
		class267.testCreateDir();
		class267.testCreateDirIfNotExisting();
		class267.testCreateDirRecursive();
		class267.testCreateDirRecursiveIfNotExisting();
		class267.testRenameDir();
		class267.testRenameFile();
		class267.testDeleteFile();
		class267.testDeleteFileIfExisting();
		class267.testDeleteDir();
		class267.testDeleteDirIfExisting();
		class267.testCopyDirRecursive();
		class267.testCopyFile();
		com.helger.commons.io.file.FileIOErrorTest class268 = new com.helger.commons.io.file.FileIOErrorTest();
		class268.testCtor1();
		class268.testCtor2();
		class268.testCtor3();
		class268.testCtor4();
		class268.testStdMethods();
		com.helger.commons.io.stream.MockCloseable class269 = new com.helger.commons.io.stream.MockCloseable();
		com.helger.commons.io.stream.NonClosingInputStreamTest class270 = new com.helger.commons.io.stream.NonClosingInputStreamTest();
		class270.testClosing();
		class270.testNonClosing();
		com.helger.commons.io.stream.WrappedWriterTest class271 = new com.helger.commons.io.stream.WrappedWriterTest();
		try {
			class271.testAll();
		}
		catch (java.io.IOException err151) {
			err151.printStackTrace();
		}
		com.helger.commons.io.stream.CountingInputStreamTest class272 = new com.helger.commons.io.stream.CountingInputStreamTest();
		try {
			class272.testAll();
		}
		catch (java.io.IOException err152) {
			err152.printStackTrace();
		}
		com.helger.commons.io.stream.BitInputStreamTest class273 = new com.helger.commons.io.stream.BitInputStreamTest();
		try {
			class273.testSemantics();
		}
		catch (java.io.IOException err153) {
			err153.printStackTrace();
		}
		try {
			class273.testReadBitLittleEndian();
		}
		catch (java.io.IOException err154) {
			err154.printStackTrace();
		}
		try {
			class273.testReadBitBigEndian();
		}
		catch (java.io.IOException err155) {
			err155.printStackTrace();
		}
		com.helger.commons.io.stream.MockCloseableWithState class274 = new com.helger.commons.io.stream.MockCloseableWithState();
		com.helger.commons.io.stream.WrappedOutputStreamTest class275 = new com.helger.commons.io.stream.WrappedOutputStreamTest();
		try {
			class275.testAll();
		}
		catch (java.io.IOException err156) {
			err156.printStackTrace();
		}
		com.helger.commons.io.stream.StringInputStreamTest class276 = new com.helger.commons.io.stream.StringInputStreamTest();
		class276.testAll();
		com.helger.commons.io.stream.WrappedInputStreamTest class277 = new com.helger.commons.io.stream.WrappedInputStreamTest();
		try {
			class277.testAll();
		}
		catch (java.io.IOException err157) {
			err157.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileInputStreamTest class278 = new com.helger.commons.io.stream.CountingFileInputStreamTest();
		try {
			class278.testAll();
		}
		catch (java.io.IOException err158) {
			err158.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingStringWriterTest class279 = new com.helger.commons.io.stream.NonBlockingStringWriterTest();
		try {
			class279.testAll();
		}
		catch (java.io.IOException err159) {
			err159.printStackTrace();
		}
		class279.testError();
		com.helger.commons.io.stream.MockThrowingCloseable class280 = new com.helger.commons.io.stream.MockThrowingCloseable();
		com.helger.commons.io.stream.NonClosingOutputStreamTest class281 = new com.helger.commons.io.stream.NonClosingOutputStreamTest();
		class281.testClosing();
		class281.testNonClosing();
		com.helger.commons.io.stream.MockThrowingFlushable class282 = new com.helger.commons.io.stream.MockThrowingFlushable();
		com.helger.commons.io.stream.WrappedReaderTest class283 = new com.helger.commons.io.stream.WrappedReaderTest();
		try {
			class283.testAll();
		}
		catch (java.io.IOException err160) {
			err160.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest class284 = new com.helger.commons.io.stream.NonBlockingByteArrayInputStreamTest();
		try {
			class284.testAll();
		}
		catch (java.io.IOException err161) {
			err161.printStackTrace();
		}
		com.helger.commons.io.stream.MockFlushable class285 = new com.helger.commons.io.stream.MockFlushable();
		com.helger.commons.io.stream.StreamHelperTest class286 = new com.helger.commons.io.stream.StreamHelperTest();
		class286.testIsKnownEOFException();
		class286.testClose();
		class286.testCloseWithoutFlush();
		class286.testFlush();
		class286.testCopyInputStreamToOutputStream();
		class286.testCopyInputStreamToOutputStreamWithLimit();
		class286.testGetAvailable();
		class286.testGetAllBytesCharset();
		class286.testReadLines();
		class286.testGetAllBytesAsString();
		class286.testCopyReaderToWriter();
		class286.testCopyReaderToWriterWithLimit();
		class286.testGetAllCharacters();
		class286.testWriteStream();
		class286.testCreateReader();
		class286.testCreateWriter();
		com.helger.commons.io.stream.BitOutputStreamTest class287 = new com.helger.commons.io.stream.BitOutputStreamTest();
		try {
			class287.testSemantics();
		}
		catch (java.io.IOException err162) {
			err162.printStackTrace();
		}
		try {
			class287.testWriteBitLittleEndian();
		}
		catch (java.io.IOException err163) {
			err163.printStackTrace();
		}
		try {
			class287.testWriteBitBigEndian();
		}
		catch (java.io.IOException err164) {
			err164.printStackTrace();
		}
		try {
			class287.testWriteManyLittleEndian();
		}
		catch (java.io.IOException err165) {
			err165.printStackTrace();
		}
		try {
			class287.testWriteManyBigEndian();
		}
		catch (java.io.IOException err166) {
			err166.printStackTrace();
		}
		try {
			class287.testReadWriteRandom();
		}
		catch (java.io.IOException err167) {
			err167.printStackTrace();
		}
		try {
			class287.testWriteManual();
		}
		catch (java.io.IOException err168) {
			err168.printStackTrace();
		}
		com.helger.commons.io.stream.CountingOutputStreamTest class288 = new com.helger.commons.io.stream.CountingOutputStreamTest();
		try {
			class288.testAll();
		}
		catch (java.io.IOException err169) {
			err169.printStackTrace();
		}
		com.helger.commons.io.stream.CountingFileOutputStreamTest class289 = new com.helger.commons.io.stream.CountingFileOutputStreamTest();
		try {
			class289.testAll();
		}
		catch (java.io.IOException err170) {
			err170.printStackTrace();
		}
		com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest class290 = new com.helger.commons.io.stream.NonBlockingByteArrayOutputStreamTest();
		try {
			class290.testAll();
		}
		catch (java.io.IOException err171) {
			err171.printStackTrace();
		}
		com.helger.commons.io.EAppendTest class291 = new com.helger.commons.io.EAppendTest();
		class291.testAll();
		com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest class292 = new com.helger.commons.io.resourceprovider.FileSystemResourceProviderTest();
		class292.testAll();
		class292.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest class293 = new com.helger.commons.io.resourceprovider.ClassPathResourceProviderTest();
		class293.testNoPrefix();
		class293.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.DefaultResourceProviderTest class294 = new com.helger.commons.io.resourceprovider.DefaultResourceProviderTest();
		class294.testNoPrefix();
		class294.testEqualsAndHashcode();
		com.helger.commons.io.resourceprovider.URLResourceProviderTest class295 = new com.helger.commons.io.resourceprovider.URLResourceProviderTest();
		class295.testAll();
		class295.testEqualsAndHashcode();
		com.helger.commons.io.PathFuncTest class296 = new com.helger.commons.io.PathFuncTest();
		try {
			class296.testSimple();
		}
		catch (java.io.IOException err172) {
			err172.printStackTrace();
		}
		try {
			class296.testTraverse1();
		}
		catch (java.io.IOException err173) {
			err173.printStackTrace();
		}
		try {
			class296.testTraverse2();
		}
		catch (java.io.IOException err174) {
			err174.printStackTrace();
		}
		try {
			class296.testIterate1();
		}
		catch (java.io.IOException err175) {
			err175.printStackTrace();
		}
		com.helger.commons.io.provider.FileSystemByteStreamProviderTest class297 = new com.helger.commons.io.provider.FileSystemByteStreamProviderTest();
		class297.testAll();
		com.helger.commons.io.misc.SizeHelperTest class298 = new com.helger.commons.io.misc.SizeHelperTest();
		class298.testCtor();
		class298.testGetAsKB();
		class298.testGetAsMB();
		class298.testGetAsGB();
		class298.testGetAsTB();
		class298.testGetAsPB();
		class298.testGetAsMatching();
		class298.testOutOfBounds();
		com.helger.commons.io.resource.URLResourceTest class299 = new com.helger.commons.io.resource.URLResourceTest();
		try {
			class299.testCtor();
		}
		catch (java.net.MalformedURLException err176) {
			err176.printStackTrace();
		}
		try {
			class299.testAccess();
		}
		catch (java.io.IOException err177) {
			err177.printStackTrace();
		}
		try {
			class299.testSerialize();
		}
		catch (java.lang.Exception err178) {
			err178.printStackTrace();
		}
		com.helger.commons.io.resource.ClassPathResourceTest class300 = new com.helger.commons.io.resource.ClassPathResourceTest();
		try {
			class300.testValidRoot();
		}
		catch (java.io.IOException err179) {
			err179.printStackTrace();
		}
		class300.testValidRootWithPrefixLong();
		class300.testValidRootWithPrefixShort();
		class300.testValidFolder();
		class300.testInvalid();
		class300.testDefault();
		class300.testFolder();
		com.helger.commons.io.resource.FileSystemResourceTest class301 = new com.helger.commons.io.resource.FileSystemResourceTest();
		class301.testCtor();
		class301.testUNC();
		class301.testAccess();
		class301.testWrite();
		class301.testSerialize();
		com.helger.commons.io.watchdir.WatchDirTest class302 = new com.helger.commons.io.watchdir.WatchDirTest();
		try {
			class302.testRecursive();
		}
		catch (java.io.IOException err180) {
			err180.printStackTrace();
		}
		try {
			class302.testNonRecursive();
		}
		catch (java.io.IOException err181) {
			err181.printStackTrace();
		}
		com.helger.commons.io.relative.FileRelativeIOTest class303 = new com.helger.commons.io.relative.FileRelativeIOTest();
		try {
			class303.testBasePath();
		}
		catch (java.io.IOException err182) {
			err182.printStackTrace();
		}
		com.helger.commons.io.relative.PathRelativeIOTest class304 = new com.helger.commons.io.relative.PathRelativeIOTest();
		class304.testFileBased();
		class304.testURLBased();
		com.helger.commons.io.resourceresolver.DefaultResourceResolverTest class305 = new com.helger.commons.io.resourceresolver.DefaultResourceResolverTest();
		try {
			class305.testBasic();
		}
		catch (java.io.IOException err183) {
			err183.printStackTrace();
		}
		com.helger.commons.CGlobalTest class306 = new com.helger.commons.CGlobalTest();
		class306.testConstants();
		class306.testDefaults();
		com.helger.commons.mutable.MutableLongTest class307 = new com.helger.commons.mutable.MutableLongTest();
		class307.testMutableLong();
		com.helger.commons.mutable.MutableFloatTest class308 = new com.helger.commons.mutable.MutableFloatTest();
		class308.testMutableFloat();
		com.helger.commons.mutable.MutableIntTest class309 = new com.helger.commons.mutable.MutableIntTest();
		class309.testMutableInt();
		com.helger.commons.mutable.MutableBooleanTest class310 = new com.helger.commons.mutable.MutableBooleanTest();
		class310.testMutableBoolean();
		class310.testTypeConversion();
		com.helger.commons.mutable.MutableDoubleTest class311 = new com.helger.commons.mutable.MutableDoubleTest();
		class311.testMutableDouble();
		com.helger.commons.mutable.MutableCharTest class312 = new com.helger.commons.mutable.MutableCharTest();
		class312.testMutableChar();
		com.helger.commons.mutable.MutableByteTest class313 = new com.helger.commons.mutable.MutableByteTest();
		class313.testMutableByte();
		com.helger.commons.mutable.MutableShortTest class314 = new com.helger.commons.mutable.MutableShortTest();
		class314.testMutableByte();
		com.helger.commons.system.CryptoPolicyTest class315 = new com.helger.commons.system.CryptoPolicyTest();
		class315.testIf();
		com.helger.commons.system.JavaVersionHelperTest class316 = new com.helger.commons.system.JavaVersionHelperTest();
		class316.testGetVersion();
		com.helger.commons.system.EProcessorArchitectureTest class317 = new com.helger.commons.system.EProcessorArchitectureTest();
		class317.testAll();
		com.helger.commons.system.EJavaVersionTest class318 = new com.helger.commons.system.EJavaVersionTest();
		class318.testBasic();
		class318.testIsOlderOrEqualsThan();
		class318.testIsNewerOrEqualsThan();
		com.helger.commons.system.SystemHelperTest class319 = new com.helger.commons.system.SystemHelperTest();
		class319.testAll();
		com.helger.commons.system.SystemPropertiesTest class320 = new com.helger.commons.system.SystemPropertiesTest();
		class320.testPrintAll();
		class320.testGetAll();
		class320.testRemove();
		class320.testGetAllJavaNetSystemProperties();
		com.helger.commons.system.ENewLineModeTest class321 = new com.helger.commons.system.ENewLineModeTest();
		class321.testAll();
		com.helger.commons.system.EJVMVendorTest class322 = new com.helger.commons.system.EJVMVendorTest();
		class322.testBasic();
		class322.testIsSun();
		class322.testIsOracle();
		com.helger.commons.system.EOperatingSystemTest class323 = new com.helger.commons.system.EOperatingSystemTest();
		class323.testAll();
		com.helger.commons.aggregate.IAggregatorTest class324 = new com.helger.commons.aggregate.IAggregatorTest();
		class324.testUseFirst();
		class324.testUseLast();
		class324.testGetStringCombinator();
		class324.testGetStringCombinatorWithSeparatorChar();
		class324.testGetStringCombinatorWithSeparatorString();
		class324.testGetStringCombinatorIgnoreNull();
		class324.testGetStringCombinatorWithSeparatorIgnoreEmptyChar();
		class324.testGetStringCombinatorWithSeparatorIgnoreEmptyString();
		com.helger.commons.url.URLParameterListTest class325 = new com.helger.commons.url.URLParameterListTest();
		class325.testBasic();
		com.helger.commons.url.URLParameterEncoderTest class326 = new com.helger.commons.url.URLParameterEncoderTest();
		class326.testEncode();
		com.helger.commons.url.SimpleURLTest class327 = new com.helger.commons.url.SimpleURLTest();
		class327.testGetAsStringWithoutEncodedParameters();
		class327.testGetAsStringWithEncodedParametersDefault();
		class327.testGetAsStringWithEncodedParametersISO88591();
		class327.testAsEncodedString();
		class327.testCtor();
		class327.testDataUrls();
		com.helger.commons.url.URLHelperTest class328 = new com.helger.commons.url.URLHelperTest();
		class328.testGetCleanURL();
		class328.testUrlEncodeDecode();
		class328.testGetURLData();
		class328.testGetInputStream();
		class328.testGetApplicationFormEncoded();
		class328.testIsClassPathURLExisting();
		class328.testGetAsURL();
		class328.testGetAsURI();
		class328.testGetAsFile();
		com.helger.commons.url.URLValidatorTest class329 = new com.helger.commons.url.URLValidatorTest();
		class329.testValid();
		com.helger.commons.url.EURLProtocolTest class330 = new com.helger.commons.url.EURLProtocolTest();
		class330.testBasic();
		com.helger.commons.url.URLParameterDecoderTest class331 = new com.helger.commons.url.URLParameterDecoderTest();
		class331.testDecode();
		com.helger.commons.url.URLProtocolRegistryTest class332 = new com.helger.commons.url.URLProtocolRegistryTest();
		class332.testDefaultsPresent();
		class332.testReinitialize();
		com.helger.commons.url.URLDataTest class333 = new com.helger.commons.url.URLDataTest();
		class333.testGetAsString();
		com.helger.commons.compare.ESortOrderTest class334 = new com.helger.commons.compare.ESortOrderTest();
		class334.testAll();
		com.helger.commons.compare.CompareHelperTest class335 = new com.helger.commons.compare.CompareHelperTest();
		class335.testNullSafeCompare();
		com.helger.commons.compare.IComparatorTest class336 = new com.helger.commons.compare.IComparatorTest();
		class336.testCollating();
		class336.testCollatingOrder();
		class336.testLocaleGerman();
		class336.testComparatorStringLongestFirst();
		com.helger.commons.compare.CollatorHelperTest class337 = new com.helger.commons.compare.CollatorHelperTest();
		class337.testGetCollatorSpaceBeforeDot();
		class337.testSort();
		com.helger.commons.charset.CharsetHelperTest class338 = new com.helger.commons.charset.CharsetHelperTest();
		class338.testCharsetFromName();
		class338.testGetAsBytesCharset();
		class338.testGetAsStringInOtherCharsetCharset();
		try {
			class338.testGreek();
		}
		catch (java.lang.Exception err184) {
			err184.printStackTrace();
		}
		class338.testJavaCompiledAsUTF8();
		class338.testGetUTF8ByteCount();
		class338.testGetUTF8ByteCountRandom();
		class338.testBasic();
		class338.testToUtf8();
		class338.testDiacriticOE();
		com.helger.commons.charset.EUnicodeBOMTest class339 = new com.helger.commons.charset.EUnicodeBOMTest();
		class339.testgetSizeInBytes();
		com.helger.commons.SPITest class340 = new com.helger.commons.SPITest();
		try {
			class340.testBasic();
		}
		catch (java.lang.Exception err185) {
			err185.printStackTrace();
		}
		com.helger.commons.regex.RegExPatternTest class341 = new com.helger.commons.regex.RegExPatternTest();
		class341.testCheckPatternConsistency();
		com.helger.commons.regex.RegExCacheTest class342 = new com.helger.commons.regex.RegExCacheTest();
		class342.testGetPattern();
		com.helger.commons.regex.RegExHelperTest class343 = new com.helger.commons.regex.RegExHelperTest();
		class343.testSplitNoLimit();
		class343.testSplitWithLimit();
		class343.testSplitToListNoLimit();
		class343.testSplitToListWithLimit();
		class343.testMakeIdentifier();
		class343.testGetMatcher();
		class343.testStringMatchesPattern();
		class343.testStringReplacePattern();
		class343.testIsValidPattern();
		class343.testGetAllMatchingGroupValues();
		com.helger.commons.debug.GlobalDebugTest class344 = new com.helger.commons.debug.GlobalDebugTest();
		class344.testInstance();
		class344.testStatic();
	}
}