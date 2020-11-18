package org.apache.commons.collections4;

public class Driver {
	public static void main(String[] argv) {
		org.apache.commons.collections4.ClosureUtilsTest class1 = new org.apache.commons.collections4.ClosureUtilsTest();
		class1.testExceptionClosure();
		class1.testNopClosure();
		class1.testInvokeClosure();
		class1.testForClosure();
		class1.testWhileClosure();
		class1.testDoWhileClosure();
		class1.testChainedClosure();
		class1.testIfClosure();
		class1.testSwitchClosure();
		class1.testSwitchMapClosure();
		class1.testTransformerClosure();
		class1.testSingletonPatternInSerialization();
		org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest class2 = new org.apache.commons.collections4.collection.PredicatedCollectionBuilderTest();
		class2.addPass();
		class2.addFail();
		class2.addAllPass();
		class2.createPredicatedCollectionWithNotNullPredicate();
		class2.createPredicatedCollectionWithPredicate();
		org.apache.commons.collections4.CollectionUtilsTest class3 = new org.apache.commons.collections4.CollectionUtilsTest();
		class3.getCardinalityMap();
		class3.cardinality();
		class3.cardinalityOfNull();
		class3.containsAll();
		class3.containsAnyInCollection();
		class3.containsAnyInArray();
		class3.union();
		class3.intersection();
		class3.disjunction();
		class3.testDisjunctionAsUnionMinusIntersection();
		class3.testDisjunctionAsSymmetricDifference();
		class3.testSubtract();
		class3.testSubtractWithPredicate();
		class3.testIsSubCollectionOfSelf();
		class3.testIsSubCollection();
		class3.testIsSubCollection2();
		class3.testIsEqualCollectionToSelf();
		class3.testIsEqualCollection();
		class3.testIsEqualCollectionReturnsFalse();
		class3.testIsEqualCollection2();
		class3.testIsEqualCollectionEquator();
		class3.testIsEqualCollectionNullEquator();
		class3.testIsProperSubCollection();
		class3.find();
		class3.forAllDoCollection();
		class3.forAllDoIterator();
		class3.forAllDoFailure();
		class3.forAllButLastDoCollection();
		class3.forAllButLastDoIterator();
		class3.getFromMap();
		try {
			class3.getFromList();
		}
		catch (java.lang.Exception err1) {
			err1.printStackTrace();
		}
		try {
			class3.getFromIterator();
		}
		catch (java.lang.Exception err2) {
			err2.printStackTrace();
		}
		try {
			class3.getFromEnumeration();
		}
		catch (java.lang.Exception err3) {
			err3.printStackTrace();
		}
		try {
			class3.getFromIterable();
		}
		catch (java.lang.Exception err4) {
			err4.printStackTrace();
		}
		try {
			class3.getFromObjectArray();
		}
		catch (java.lang.Exception err5) {
			err5.printStackTrace();
		}
		try {
			class3.getFromPrimitiveArray();
		}
		catch (java.lang.Exception err6) {
			err6.printStackTrace();
		}
		try {
			class3.getFromObject();
		}
		catch (java.lang.Exception err7) {
			err7.printStackTrace();
		}
		class3.testSize_List();
		class3.testSize_Map();
		class3.testSize_Array();
		class3.testSize_PrimitiveArray();
		class3.testSize_Enumeration();
		class3.testSize_Iterator();
		class3.testSize_Other();
		class3.testSizeIsEmpty_Null();
		class3.testSizeIsEmpty_List();
		class3.testSizeIsEmpty_Map();
		class3.testSizeIsEmpty_Array();
		class3.testSizeIsEmpty_PrimitiveArray();
		class3.testSizeIsEmpty_Enumeration();
		class3.testSizeIsEmpty_Iterator();
		class3.testSizeIsEmpty_Other();
		class3.testIsEmptyWithEmptyCollection();
		class3.testIsEmptyWithNonEmptyCollection();
		class3.testIsEmptyWithNull();
		class3.testIsNotEmptyWithEmptyCollection();
		class3.testIsNotEmptyWithNonEmptyCollection();
		class3.testIsNotEmptyWithNull();
		class3.filter();
		try {
			class3.filterNullParameters();
		}
		catch (java.lang.Exception err8) {
			err8.printStackTrace();
		}
		class3.filterInverse();
		try {
			class3.filterInverseNullParameters();
		}
		catch (java.lang.Exception err9) {
			err9.printStackTrace();
		}
		class3.countMatches();
		class3.exists();
		class3.select();
		class3.selectWithOutputCollections();
		class3.selectRejected();
		class3.collect();
		class3.transform1();
		class3.transform2();
		class3.addIgnoreNull();
		class3.predicatedCollection();
		class3.isFull();
		class3.isEmpty();
		class3.maxSize();
		class3.intersectionUsesMethodEquals();
		class3.testRetainAll();
		class3.testRemoveAll();
		class3.testTransformedCollection();
		class3.testTransformedCollection_2();
		class3.testSynchronizedCollection();
		class3.testUnmodifiableCollection();
		try {
			class3.emptyCollection();
		}
		catch (java.lang.Exception err10) {
			err10.printStackTrace();
		}
		class3.emptyIfNull();
		class3.addAllForIterable();
		class3.addAllForEnumeration();
		class3.addAllForElements();
		class3.getNegative();
		class3.getPositiveOutOfBounds();
		class3.get1();
		class3.get();
		class3.getIterator();
		class3.getEnumeration();
		class3.reverse();
		class3.extractSingleton();
		class3.collateException1();
		class3.collateException2();
		class3.testCollate();
		class3.testCollateIgnoreDuplicates();
		class3.testPermutationsWithNullCollection();
		class3.testPermutations();
		class3.testMatchesAll();
		class3.testRemoveAllWithEquator();
		class3.testRetainAllWithEquator();
		org.apache.commons.collections4.FactoryUtilsTest class4 = new org.apache.commons.collections4.FactoryUtilsTest();
		class4.testExceptionFactory();
		class4.testNullFactory();
		class4.testConstantFactoryNull();
		class4.testConstantFactoryConstant();
		class4.testPrototypeFactoryNull();
		try {
			class4.testPrototypeFactoryPublicCloneMethod();
		}
		catch (java.lang.Exception err11) {
			err11.printStackTrace();
		}
		try {
			class4.testPrototypeFactoryPublicCopyConstructor();
		}
		catch (java.lang.Exception err12) {
			err12.printStackTrace();
		}
		try {
			class4.testPrototypeFactoryPublicSerialization();
		}
		catch (java.lang.Exception err13) {
			err13.printStackTrace();
		}
		class4.testPrototypeFactoryPublicSerializationError();
		class4.testPrototypeFactoryPublicBad();
		class4.instantiateFactoryNull();
		class4.instantiateFactorySimple();
		class4.instantiateFactoryMismatch();
		class4.instantiateFactoryNoConstructor();
		class4.instantiateFactoryComplex();
		class4.testSingletonPatternInSerialization();
		org.apache.commons.collections4.EnumerationUtilsTest class5 = new org.apache.commons.collections4.EnumerationUtilsTest();
		class5.testToListWithStringTokenizer();
		class5.testToListWithHashtable();
		try {
			class5.getFromEnumeration();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		org.apache.commons.collections4.ListUtilsTest class6 = new org.apache.commons.collections4.ListUtilsTest();
		class6.testIntersectNonEmptyWithEmptyList();
		class6.testIntersectEmptyWithEmptyList();
		class6.testIntersectNonEmptySubset();
		class6.testIntersectListWithNoOverlapAndDifferentTypes();
		class6.testIntersectListWithSelf();
		class6.testIntersectionOrderInsensitivity();
		class6.testPredicatedList();
		class6.testLazyList();
		class6.testEmptyIfNull();
		class6.testDefaultIfNull();
		class6.testEquals();
		class6.testHashCode();
		class6.testRetainAll();
		class6.testRemoveAll();
		class6.testSubtract();
		class6.testSubtractNullElement();
		class6.testIndexOf();
		class6.testLongestCommonSubsequence();
		class6.testLongestCommonSubsequenceWithString();
		class6.testPartition();
		class6.testSelect();
		class6.testSelectRejected();
		org.apache.commons.collections4.PredicateUtilsTest class7 = new org.apache.commons.collections4.PredicateUtilsTest();
		class7.testExceptionPredicate();
		class7.testIsNotNullPredicate();
		class7.testIdentityPredicate();
		class7.testTruePredicate();
		class7.testFalsePredicate();
		class7.testNotPredicate();
		class7.testNotPredicateEx();
		class7.testAndPredicate();
		class7.testAndPredicateEx();
		class7.testAllPredicate();
		class7.testAllPredicateEx1();
		class7.testAllPredicateEx2();
		class7.testAllPredicateEx3();
		class7.testAllPredicateEx4();
		class7.testAllPredicateEx5();
		class7.testAllPredicateEx6();
		class7.testOrPredicate();
		class7.testOrPredicateEx();
		class7.testAnyPredicate();
		class7.testAnyPredicateEx1();
		class7.testAnyPredicateEx2();
		class7.testAnyPredicateEx3();
		class7.testAnyPredicateEx4();
		class7.testAnyPredicateEx5();
		class7.testAnyPredicateEx6();
		class7.testEitherPredicate();
		class7.testEitherPredicateEx();
		class7.testOnePredicate();
		class7.testOnePredicateEx1();
		class7.testOnePredicateEx2();
		class7.testOnePredicateEx3();
		class7.testOnePredicateEx4();
		class7.testOnePredicateEx5();
		class7.testOnePredicateEx6();
		class7.testNeitherPredicate();
		class7.testNeitherPredicateEx();
		class7.testNonePredicate();
		class7.testNonePredicateEx1();
		class7.testNonePredicateEx2();
		class7.testNonePredicateEx3();
		class7.testNonePredicateEx4();
		class7.testNonePredicateEx5();
		class7.testNonePredicateEx6();
		class7.testInstanceOfPredicate();
		class7.testUniquePredicate();
		class7.testAsPredicateTransformer();
		class7.testAsPredicateTransformerEx1();
		class7.testAsPredicateTransformerEx2();
		class7.testInvokerPredicate();
		class7.testInvokerPredicateEx1();
		class7.testInvokerPredicateEx2();
		class7.testInvokerPredicateEx3();
		class7.testInvokerPredicate2();
		class7.testInvokerPredicate2Ex1();
		class7.testInvokerPredicate2Ex2();
		class7.testInvokerPredicate2Ex3();
		class7.testNullIsExceptionPredicate();
		class7.testNullIsExceptionPredicateEx1();
		class7.testNullIsTruePredicate();
		class7.testNullIsTruePredicateEx1();
		class7.testNullIsFalsePredicate();
		class7.testNullIsFalsePredicateEx1();
		class7.testTransformedPredicate();
		class7.testSingletonPatternInSerialization();
		org.apache.commons.collections4.IterableUtilsTest class8 = new org.apache.commons.collections4.IterableUtilsTest();
		class8.forEach();
		class8.forEachFailure();
		class8.forEachButLast();
		class8.containsWithEquator();
		class8.frequency();
		class8.frequencyOfNull();
		class8.find();
		class8.indexOf();
		class8.countMatches();
		class8.matchesAny();
		class8.matchesAll();
		try {
			class8.getFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class8.firstFromIterableIndexOutOfBoundsException();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class8.partition();
		class8.partitionMultiplePredicates();
		class8.testToString();
		class8.testToStringDelimiter();
		class8.testToStringWithNullArguments();
		org.apache.commons.collections4.MultiSetUtilsTest class9 = new org.apache.commons.collections4.MultiSetUtilsTest();
		class9.testEmptyMultiSet();
		class9.testUnmodifiableMultiSet();
		class9.testSynchronizedMultiSet();
		class9.testPredicatedMultiSet();
		org.apache.commons.collections4.SetUtilsTest class10 = new org.apache.commons.collections4.SetUtilsTest();
		class10.difference();
		class10.disjunction();
		class10.intersection();
		class10.testEmptyIfNull();
		class10.testEquals();
		class10.testHashCode();
		class10.testHashSet();
		class10.testNewIdentityHashSet();
		class10.testpredicatedSet();
		class10.testUnmodifiableSet();
		class10.testUnmodifiableSetWrap();
		class10.union();
		org.apache.commons.collections4.sequence.SequencesComparatorTest class11 = new org.apache.commons.collections4.sequence.SequencesComparatorTest();
		class11.testLength();
		class11.testExecution();
		class11.testMinimal();
		class11.testShadok();
		org.apache.commons.collections4.FluentIterableTest class12 = new org.apache.commons.collections4.FluentIterableTest();
		class12.factoryMethodOf();
		class12.appendElements();
		class12.appendIterable();
		class12.collate();
		class12.collateWithComparator();
		class12.filter();
		class12.forEach();
		class12.limit();
		class12.reverse();
		class12.skip();
		class12.transform();
		class12.unique();
		class12.unmodifiable();
		class12.zip();
		class12.asEnumeration();
		class12.allMatch();
		class12.anyMatch();
		class12.isEmpty();
		class12.size();
		class12.eval();
		class12.contains();
		class12.copyInto();
		class12.iterator();
		class12.get();
		class12.toArray();
		class12.testToString();
		org.apache.commons.collections4.keyvalue.DefaultKeyValueTest class13 = new org.apache.commons.collections4.keyvalue.DefaultKeyValueTest();
		class13.testAccessorsAndMutators();
		class13.testSelfReferenceHandling();
		class13.testConstructors();
		class13.testEqualsAndHashCode();
		class13.testToString();
		class13.testToMapEntry();
		org.apache.commons.collections4.keyvalue.DefaultMapEntryTest class14 = new org.apache.commons.collections4.keyvalue.DefaultMapEntryTest();
		class14.testConstructors();
		class14.testSelfReferenceHandling();
		org.apache.commons.collections4.keyvalue.MultiKeyTest class15 = new org.apache.commons.collections4.keyvalue.MultiKeyTest();
		try {
			class15.testConstructors();
		}
		catch (java.lang.Exception err17) {
			err17.printStackTrace();
		}
		try {
			class15.testConstructorsByArray();
		}
		catch (java.lang.Exception err18) {
			err18.printStackTrace();
		}
		try {
			class15.testConstructorsByArrayNull();
		}
		catch (java.lang.Exception err19) {
			err19.printStackTrace();
		}
		class15.testSize();
		class15.testGetIndexed();
		class15.testGetKeysSimpleConstructor();
		class15.testGetKeysArrayConstructorCloned();
		class15.testGetKeysArrayConstructorNonCloned();
		class15.testHashCode();
		class15.testEquals();
		try {
			class15.testEqualsAfterSerialization();
		}
		catch (java.io.IOException err20) {
			err20.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err21) {
			err21.printStackTrace();
		}
		try {
			class15.testEqualsAfterSerializationOfDerivedClass();
		}
		catch (java.io.IOException err22) {
			err22.printStackTrace();
		}
		catch (java.lang.ClassNotFoundException err23) {
			err23.printStackTrace();
		}
		org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest class16 = new org.apache.commons.collections4.keyvalue.UnmodifiableMapEntryTest();
		class16.testConstructors();
		class16.testAccessorsAndMutators();
		class16.testSelfReferenceHandling();
		class16.testUnmodifiable();
		org.apache.commons.collections4.keyvalue.TiedMapEntryTest class17 = new org.apache.commons.collections4.keyvalue.TiedMapEntryTest();
		class17.testConstructors();
		class17.testSetValue();
		org.apache.commons.collections4.SplitMapUtilsTest class18 = new org.apache.commons.collections4.SplitMapUtilsTest();
		class18.testReadableMap();
		class18.testAlreadyReadableMap();
		class18.testWritableMap();
		class18.testAlreadyWritableMap();
		org.apache.commons.collections4.properties.SortedPropertiesTest class19 = new org.apache.commons.collections4.properties.SortedPropertiesTest();
		class19.testKeys();
		org.apache.commons.collections4.MultiMapUtilsTest class20 = new org.apache.commons.collections4.MultiMapUtilsTest();
		class20.testEmptyUnmodifiableMultiValuedMap();
		class20.testTypeSafeEmptyMultiValuedMap();
		class20.testEmptyIfNull();
		class20.testIsEmptyWithEmptyMap();
		class20.testIsEmptyWithNonEmptyMap();
		class20.testIsEmptyWithNull();
		class20.testGetCollection();
		class20.testGetValuesAsList();
		class20.testGetValuesAsSet();
		class20.testGetValuesAsBag();
		org.apache.commons.collections4.functors.EqualPredicateTest class21 = new org.apache.commons.collections4.functors.EqualPredicateTest();
		try {
			class21.testNullArgumentEqualsNullPredicate();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		try {
			class21.objectFactoryUsesEqualsForTest();
		}
		catch (java.lang.Exception err25) {
			err25.printStackTrace();
		}
		try {
			class21.testPredicateTypeCanBeSuperClassOfObject();
		}
		catch (java.lang.Exception err26) {
			err26.printStackTrace();
		}
		org.apache.commons.collections4.functors.ComparatorPredicateTest class22 = new org.apache.commons.collections4.functors.ComparatorPredicateTest();
		class22.compareEquals();
		class22.compareGreater();
		class22.compareLess();
		class22.compareGreaterOrEqual();
		class22.compareLessOrEqual();
		org.apache.commons.collections4.functors.CatchAndRethrowClosureTest class23 = new org.apache.commons.collections4.functors.CatchAndRethrowClosureTest();
		class23.testThrowingClosure();
		org.apache.commons.collections4.functors.AllPredicateTest class24 = new org.apache.commons.collections4.functors.AllPredicateTest();
		class24.emptyArrayToGetInstance();
		class24.emptyCollectionToGetInstance();
		class24.oneTruePredicate();
		class24.oneFalsePredicate();
		class24.allTrue();
		class24.trueAndFalseCombined();
		org.apache.commons.collections4.functors.NullPredicateTest class25 = new org.apache.commons.collections4.functors.NullPredicateTest();
		class25.testNullPredicate();
		try {
			class25.ensurePredicateCanBeTypedWithoutWarning();
		}
		catch (java.lang.Exception err27) {
			err27.printStackTrace();
		}
		org.apache.commons.collections4.QueueUtilsTest class26 = new org.apache.commons.collections4.QueueUtilsTest();
		class26.testSynchronizedQueue();
		class26.testUnmodifiableQueue();
		class26.testPredicatedQueue();
		class26.testTransformedQueue();
		class26.testEmptyQueue();
		org.apache.commons.collections4.iterators.LoopingIteratorTest class27 = new org.apache.commons.collections4.iterators.LoopingIteratorTest();
		try {
			class27.testConstructorEx();
		}
		catch (java.lang.Exception err28) {
			err28.printStackTrace();
		}
		try {
			class27.testLooping0();
		}
		catch (java.lang.Exception err29) {
			err29.printStackTrace();
		}
		try {
			class27.testLooping1();
		}
		catch (java.lang.Exception err30) {
			err30.printStackTrace();
		}
		try {
			class27.testLooping2();
		}
		catch (java.lang.Exception err31) {
			err31.printStackTrace();
		}
		try {
			class27.testLooping3();
		}
		catch (java.lang.Exception err32) {
			err32.printStackTrace();
		}
		try {
			class27.testRemoving1();
		}
		catch (java.lang.Exception err33) {
			err33.printStackTrace();
		}
		try {
			class27.testReset();
		}
		catch (java.lang.Exception err34) {
			err34.printStackTrace();
		}
		try {
			class27.testSize();
		}
		catch (java.lang.Exception err35) {
			err35.printStackTrace();
		}
		org.apache.commons.collections4.iterators.IteratorEnumerationTest class28 = new org.apache.commons.collections4.iterators.IteratorEnumerationTest();
		class28.testEnumeration();
		org.apache.commons.collections4.iterators.FilterListIteratorTest class29 = new org.apache.commons.collections4.iterators.FilterListIteratorTest();
		class29.testWalkLists();
		class29.testManual();
		class29.testTruePredicate();
		class29.testFalsePredicate();
		class29.testEvens();
		class29.testOdds();
		class29.testThrees();
		class29.testFours();
		class29.testNestedSixes();
		class29.testNestedSixes2();
		class29.testNestedSixes3();
		class29.testNextChangesPrevious();
		class29.testPreviousChangesNext();
		class29.testFailingHasNextBug();
		try {
			class29.testCollections360();
		}
		catch (java.lang.Throwable err36) {
			err36.printStackTrace();
		}
		org.apache.commons.collections4.iterators.LoopingListIteratorTest class30 = new org.apache.commons.collections4.iterators.LoopingListIteratorTest();
		try {
			class30.testConstructorEx();
		}
		catch (java.lang.Exception err37) {
			err37.printStackTrace();
		}
		try {
			class30.testLooping0();
		}
		catch (java.lang.Exception err38) {
			err38.printStackTrace();
		}
		try {
			class30.testLooping1();
		}
		catch (java.lang.Exception err39) {
			err39.printStackTrace();
		}
		try {
			class30.testLooping2();
		}
		catch (java.lang.Exception err40) {
			err40.printStackTrace();
		}
		class30.testJoggingNotOverBoundary();
		class30.testJoggingOverBoundary();
		class30.testRemovingElementsAndIteratingForward();
		class30.testRemovingElementsAndIteratingBackwards();
		class30.testReset();
		class30.testAdd();
		class30.testNextAndPreviousIndex();
		class30.testSet();
		org.apache.commons.collections4.list.Collections701Test class31 = new org.apache.commons.collections4.list.Collections701Test();
		class31.testArrayList();
		class31.testHashSet();
		class31.testSetUniqueList();
		org.apache.commons.collections4.ComparatorUtilsTest class32 = new org.apache.commons.collections4.ComparatorUtilsTest();
		class32.booleanComparator();
		class32.chainedComparator();
		class32.max();
		class32.min();
		class32.nullLowComparator();
		class32.nullHighComparator();
		org.apache.commons.collections4.TransformerUtilsTest class33 = new org.apache.commons.collections4.TransformerUtilsTest();
		class33.testExceptionTransformer();
		class33.testNullTransformer();
		class33.testNopTransformer();
		class33.testConstantTransformer();
		class33.testCloneTransformer();
		class33.testMapTransformer();
		class33.testExecutorTransformer();
		class33.testPredicateTransformer();
		class33.testFactoryTransformer();
		class33.testChainedTransformer();
		class33.testIfTransformer();
		class33.testSwitchTransformer();
		class33.testSwitchMapTransformer();
		class33.testInvokerTransformer();
		class33.testInvokerTransformer2();
		class33.testStringValueTransformer();
		class33.testInstantiateTransformerNull();
		class33.testSingletonPatternInSerialization();
		org.apache.commons.collections4.BagUtilsTest class34 = new org.apache.commons.collections4.BagUtilsTest();
		class34.testSynchronizedBag();
		class34.testUnmodifiableBag();
		class34.testPredicatedBag();
		class34.testTransformedBag();
		class34.testSynchronizedSortedBag();
		class34.testUnmodifiableSortedBag();
		class34.testPredicatedSortedBag();
		class34.testTransformedSortedBag();
		org.apache.commons.collections4.IteratorUtilsTest class35 = new org.apache.commons.collections4.IteratorUtilsTest();
		class35.testArrayIterator();
		class35.testArrayListIterator();
		class35.testAsIterable();
		class35.testAsIterableNull();
		class35.testAsMultipleIterable();
		class35.testAsMultipleIterableNull();
		class35.testCollatedIterator();
		class35.testEmptyIterator();
		class35.testEmptyListIterator();
		class35.testEmptyMapIterator();
		class35.testEmptyOrderedIterator();
		class35.testEmptyOrderedMapIterator();
		class35.testFind();
		try {
			class35.testFirstFromIterator();
		}
		catch (java.lang.Exception err41) {
			err41.printStackTrace();
		}
		class35.testForEach();
		class35.testForEachButLast();
		try {
			class35.testGetAtIndexFromIterator();
		}
		catch (java.lang.Exception err42) {
			err42.printStackTrace();
		}
		class35.testGetIterator();
		class35.testIndexOf();
		class35.testNodeIterator();
		class35.testNodeListIterator();
		class35.testToArray();
		class35.testToArray2();
		class35.testToList();
		class35.testToListIterator();
		class35.testToListIteratorNull();
		class35.testUnmodifiableIteratorImmutability();
		class35.testUnmodifiableIteratorIteration();
		class35.testUnmodifiableListIteratorImmutability();
		class35.testUnmodifiableListIteratorIteration();
		org.apache.commons.collections4.TrieUtilsTest class36 = new org.apache.commons.collections4.TrieUtilsTest();
		class36.testUnmodifiableTrie();
	}
}