package com.fasterxml.classmate;

public class Driver {
	public static void main(String[] argv) {
		com.fasterxml.classmate.AnnotationInclusionTest class1 = new com.fasterxml.classmate.AnnotationInclusionTest();
		class1.testValues();
		com.fasterxml.classmate.TestSubtypeResolution class2 = new com.fasterxml.classmate.TestSubtypeResolution();
		class2.testMoreSpecificListType();
		class2.testMoreSpecificCollectionType();
		class2.testValidUntypedSubtype();
		class2.testValidIncompleteSubtype();
		class2.testValidGenericSubClass();
		class2.testValidGenericSubInterface();
		class2.testValidGenericSubInterfaceWithMap();
		class2.testValidNestedType();
		class2.testValidInnerType();
		class2.testInvalidSubClass();
		class2.testIncompatibleTypeParametersList();
		class2.testIncompatibleTypeParametersMap();
		com.fasterxml.classmate.util.ClassKeyTest class3 = new com.fasterxml.classmate.util.ClassKeyTest();
		class3.nullClass();
		class3.equals();
		class3.classKeyToString();
		class3.compareTo();
		com.fasterxml.classmate.util.MethodKeyTest class4 = new com.fasterxml.classmate.util.MethodKeyTest();
		class4.equals();
		class4.methodKeyToString();
		com.fasterxml.classmate.util.TestResolvedTypeCache class5 = new com.fasterxml.classmate.util.TestResolvedTypeCache();
		class5.testSimpleLRUCaching();
		class5.testSimpleConcurrentCaching();
		class5.testKeyEquals();
		com.fasterxml.classmate.AnnotationsTest class6 = new com.fasterxml.classmate.AnnotationsTest();
		try {
			class6.addAsDefault();
		}
		catch (java.lang.NoSuchMethodException err1) {
			err1.printStackTrace();
		}
		try {
			class6.size();
		}
		catch (java.lang.NoSuchMethodException err2) {
			err2.printStackTrace();
		}
		try {
			class6.annotationsToSize();
		}
		catch (java.lang.NoSuchMethodException err3) {
			err3.printStackTrace();
		}
		com.fasterxml.classmate.ResolvedTypeWithMembersTest class7 = new com.fasterxml.classmate.ResolvedTypeWithMembersTest();
		class7.size();
		class7.mainTypeAndOverrides();
		class7.resolveConstructors();
		class7.resolveMemberFields();
		class7.resolveStaticMethods();
		class7.resolveMemberMethods();
		try {
			class7.resolveConstructor();
		}
		catch (java.lang.NoSuchMethodException err4) {
			err4.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err5) {
			err5.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err6) {
			err6.printStackTrace();
		}
		try {
			class7.resolveField();
		}
		catch (java.lang.NoSuchMethodException err7) {
			err7.printStackTrace();
		}
		catch (java.lang.NoSuchFieldException err8) {
			err8.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err9) {
			err9.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err10) {
			err10.printStackTrace();
		}
		try {
			class7.resolveMethod();
		}
		catch (java.lang.NoSuchMethodException err11) {
			err11.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err12) {
			err12.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err13) {
			err13.printStackTrace();
		}
		com.fasterxml.classmate.TestTypeDescriptions class8 = new com.fasterxml.classmate.TestTypeDescriptions();
		class8.testSimpleTypes();
		class8.testPrimitiveTypes();
		class8.testGenericTypes();
		com.fasterxml.classmate.TestTypeResolver class9 = new com.fasterxml.classmate.TestTypeResolver();
		class9.testResolveWithEmptyTypeParameters();
		class9.testResolveGenericWithFailures();
		class9.testSimpleTypes();
		class9.testArrayTypes();
		class9.testGenericMap();
		class9.testParametricMap();
		class9.testIndirectGeneric();
		try {
			class9.testJdkType();
		}
		catch (java.lang.Exception err14) {
			err14.printStackTrace();
		}
		class9.testSimpleSelfRef();
		try {
			class9.testTypesFromMapField();
		}
		catch (java.lang.Exception err15) {
			err15.printStackTrace();
		}
		try {
			class9.testTypesFromListField();
		}
		catch (java.lang.Exception err16) {
			err16.printStackTrace();
		}
		class9.testResolvedTypeAsType();
		class9.testGenericParamMismatch();
		class9.testInvalidSubtype();
		class9.testResolveOfSelfReferencedType();
		class9.testWildcardType();
		class9.testUnknownJdkType();
		try {
			class9.testMissingSuperclass();
		}
		catch (java.lang.IllegalAccessException err17) {
			err17.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err18) {
			err18.printStackTrace();
		}
		try {
			class9.testTypesMatch();
		}
		catch (java.lang.IllegalAccessException err19) {
			err19.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err20) {
			err20.printStackTrace();
		}
		com.fasterxml.classmate.TestSelfRefMemberTypes class10 = new com.fasterxml.classmate.TestSelfRefMemberTypes();
		class10.testSelfReferencesSimple();
		class10.testSelfReferencesComplex();
		class10.testSelfReferencesVaryingDimensions();
		com.fasterxml.classmate.TestMemberGenericTypes class11 = new com.fasterxml.classmate.TestMemberGenericTypes();
		class11.testGenericWrappersForResolvedLeafType();
		class11.testGenericWrappersForIntermediate();
		class11.testGenericWrappersForBaseType();
		class11.testLocalGenerics();
		class11.testAliasingWithLocalType();
		class11.testTypesViaSubtype();
		class11.testLocalBoundedType();
		com.fasterxml.classmate.TestParameterAnnotations class12 = new com.fasterxml.classmate.TestParameterAnnotations();
		class12.testIncludesUninheritableAnnotationsDirectly();
		class12.testInheritsOnlyMarkedAnnotations();
		class12.testMixInAnnotations();
		class12.testConstructorParameterAnnotations();
		com.fasterxml.classmate.TestReadme class13 = new com.fasterxml.classmate.TestReadme();
		class13.resolvingClasses();
		class13.resolvingAllMembers();
		class13.resolvingParticularMembers();
		class13.testSomeClassSomeMethod();
		class13.testSomeSubclassSomeMethod();
		class13.testSomeSubclassSomeMethodWithInherited();
		class13.testSomeSubclassSomeMethodWithAllInherited();
		class13.testSomeOtherClassSomeMethodWithoutMixins();
		class13.testSomeOtherClassSomeMethodWithMixins();
		com.fasterxml.classmate.TestMemberResolver class14 = new com.fasterxml.classmate.TestMemberResolver();
		class14.testSimpleHierarchy();
		class14.testSimpleHierarchyWithMixins();
		class14.testMembersForSupertype();
		class14.testAggregationForSubtype();
		class14.testAggregationForSubtypeAndDummyMixin();
		class14.testIncludeObject();
		class14.testFilters();
		try {
			class14.testAddOverridesFromInterfaces();
		}
		catch (java.lang.IllegalAccessException err21) {
			err21.printStackTrace();
		}
		catch (java.lang.reflect.InvocationTargetException err22) {
			err22.printStackTrace();
		}
		try {
			class14.testGatherTypesWithInterfaces();
		}
		catch (java.lang.Exception err23) {
			err23.printStackTrace();
		}
		try {
			class14.testJavaLangObject30();
		}
		catch (java.lang.Exception err24) {
			err24.printStackTrace();
		}
		com.fasterxml.classmate.OddJDKTypesTest class15 = new com.fasterxml.classmate.OddJDKTypesTest();
		class15.testJDKMaps();
		com.fasterxml.classmate.types.ResolvedRecursiveTypeTest class16 = new com.fasterxml.classmate.types.ResolvedRecursiveTypeTest();
		class16.canCreateSubtypes();
		class16.setReference();
		class16.getImplementedInterfaces();
		class16.getArrayElementType();
		class16.isInterface();
		class16.isAbstract();
		class16.isArray();
		class16.isPrimitive();
		class16.getMemberFields();
		class16.getStaticFields();
		class16.getMemberMethods();
		class16.getStaticMethods();
		class16.getConstructors();
		class16.appendSignature();
		class16.appendErasedSignature();
		class16.appendFullDescription();
		com.fasterxml.classmate.types.ResolvedObjectTypeTest class17 = new com.fasterxml.classmate.types.ResolvedObjectTypeTest();
		class17.testConstructors();
		class17.testGetArrayElementType();
		class17.testGetStaticFields();
		class17.testGetConstructors();
		com.fasterxml.classmate.types.ResolvedInterfaceTypeTest class18 = new com.fasterxml.classmate.types.ResolvedInterfaceTypeTest();
		class18.getParentClass();
		class18.getImplementedInterfaces();
		class18.getArrayElementType();
		class18.isArray();
		class18.isPrimitive();
		class18.getStaticFields();
		class18.getMemberMethods();
		class18.appendFullDescription();
		com.fasterxml.classmate.types.ResolvedArrayTypeTest class19 = new com.fasterxml.classmate.types.ResolvedArrayTypeTest();
		class19.getArrayElementType();
		class19.canCreateSubtypes();
		class19.getParentClass();
		class19.getSelfReferencedType();
		class19.getImplementedInterfaces();
		class19.isAbstract();
		class19.isArray();
		class19.isPrimitive();
		class19.isInterface();
		class19.appendSignature();
		class19.appendErasedSignature();
		class19.appendBriefDescription();
		class19.appendFullDescription();
		com.fasterxml.classmate.types.TypePlaceHolderTest class20 = new com.fasterxml.classmate.types.TypePlaceHolderTest();
		class20.canCreateSubtypes();
		class20.getParentClass();
		class20.getSelfReferencedType();
		class20.getImplementedInterfaces();
		class20.getArrayElementType();
		class20.isInterface();
		class20.isAbstract();
		class20.isArray();
		class20.isPrimitive();
		class20.appendSignature();
		class20.appendErasedSignature();
		class20.appendBriefDescription();
		class20.appendFullDescription();
		com.fasterxml.classmate.types.ResolvedPrimitiveTypeTest class21 = new com.fasterxml.classmate.types.ResolvedPrimitiveTypeTest();
		class21.canCreateSubtypes();
		class21.getSelfReferencedType();
		class21.getParentClass();
		class21.getArrayElementType();
		class21.isInterface();
		class21.isAbstract();
		class21.isArray();
		class21.getImplementedInterfaces();
		class21.appendSignature();
		class21.appendErasedSignature();
		class21.appendFullDescription();
		class21.appendBriefDescription();
		com.fasterxml.classmate.StdConfigurationTest class22 = new com.fasterxml.classmate.StdConfigurationTest();
		class22.getInclusionForClass();
		class22.getInclusionForConstructor();
		class22.getInclusionForField();
		class22.getInclusionForMethod();
		com.fasterxml.classmate.TypeBindingsTest class23 = new com.fasterxml.classmate.TypeBindingsTest();
		try {
			class23.create();
		}
		catch (java.lang.NoSuchFieldException err25) {
			err25.printStackTrace();
		}
		catch (java.lang.IllegalAccessException err26) {
			err26.printStackTrace();
		}
		class23.isEmpty();
		class23.getBoundName();
		class23.getBoundType();
		class23.typeBindingsToString();
		class23.equals();
		com.fasterxml.classmate.members.HierarchicTypeTest class24 = new com.fasterxml.classmate.members.HierarchicTypeTest();
		class24.hierarchicTypeToString();
		class24.hierarchicTypeHashCode();
		class24.equals();
		com.fasterxml.classmate.members.ResolvedMethodTest class25 = new com.fasterxml.classmate.members.ResolvedMethodTest();
		class25.isAbstract();
		class25.isStrict();
		class25.isNative();
		class25.isSynchronized();
		class25.getReturnType();
		class25.getType();
		class25.getArgumentType();
		class25.equals();
		com.fasterxml.classmate.members.RawMemberTest class26 = new com.fasterxml.classmate.members.RawMemberTest();
		class26.testIsStatic();
		class26.testIsFinal();
		class26.testIsPrivate();
		class26.testIsProtected();
		class26.testIsPublic();
		class26.testRawMemberHashCode();
		class26.testGetModifiers();
		class26.testRawMemberToString();
		com.fasterxml.classmate.members.RawFieldTest class27 = new com.fasterxml.classmate.members.RawFieldTest();
		class27.init();
		class27.isTransient();
		class27.isVolatile();
		class27.equals();
		com.fasterxml.classmate.members.ResolvedMemberTest class28 = new com.fasterxml.classmate.members.ResolvedMemberTest();
		class28.isFinal();
		class28.isPrivate();
		class28.isProtected();
		class28.isPublic();
		try {
			class28.applyOverride();
		}
		catch (java.lang.NoSuchMethodException err27) {
			err27.printStackTrace();
		}
		try {
			class28.applyOverrides();
		}
		catch (java.lang.NoSuchMethodException err28) {
			err28.printStackTrace();
		}
		try {
			class28.applyDefault();
		}
		catch (java.lang.NoSuchMethodException err29) {
			err29.printStackTrace();
		}
		class28.isStatic();
		class28.resolvedMemberHashCode();
		class28.resolvedMemberToString();
		class28.getModifiers();
		try {
			class28.get();
		}
		catch (java.lang.NoSuchMethodException err30) {
			err30.printStackTrace();
		}
		com.fasterxml.classmate.members.GhostTypeParameterInFieldTest class29 = new com.fasterxml.classmate.members.GhostTypeParameterInFieldTest();
		class29.testGhostTypeParameterWithClass();
		class29.testGhostTypeParameterWithInterface();
		com.fasterxml.classmate.members.RawMethodTest class30 = new com.fasterxml.classmate.members.RawMethodTest();
		class30.init();
		class30.isAbstract();
		class30.isStrict();
		class30.isNative();
		class30.isSynchronized();
		class30.createKey();
		class30.equals();
		com.fasterxml.classmate.members.ResolvedConstructorTest class31 = new com.fasterxml.classmate.members.ResolvedConstructorTest();
		class31.init();
		class31.getRawMember();
		class31.getType();
		class31.getArgumentType();
		class31.resolvedConstructorHashCode();
		class31.equals();
		com.fasterxml.classmate.members.Issue28Test class32 = new com.fasterxml.classmate.members.Issue28Test();
		class32.testIssue28();
		com.fasterxml.classmate.members.RawConstructorTest class33 = new com.fasterxml.classmate.members.RawConstructorTest();
		class33.testCreateKey();
		class33.testEquals();
		class33.testRawConstructorHashCode();
		com.fasterxml.classmate.members.ResolvedFieldTest class34 = new com.fasterxml.classmate.members.ResolvedFieldTest();
		class34.isTransient();
		class34.isVolatile();
		class34.equals();
		com.fasterxml.classmate.ResolvedTypeTest class35 = new com.fasterxml.classmate.ResolvedTypeTest();
		class35.testCanCreateSubtype();
		class35.testtypeParametersFor();
		class35.testFindSupertype();
		class35.testIsConcrete();
		class35.testAccessors();
		class35.testIssue16();
	}
}