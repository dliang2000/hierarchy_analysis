# All sibling classes have implementations for the method of interest.

## joda-time-2.10.5:

java -cp /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/hierarchy-analysis/target/classes ca.uwaterloo.liang.Main /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/target/classes target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/mvn_dependencies/joda-convert-1.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/mvn_dependencies/junit-3.8.2.jar joda_time_2.10.5_missing_methods.csv
Soot started on Sat May 02 21:16:20 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/mvn_dependencies/joda-convert-1.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/joda-time-2.10.5-patched/mvn_dependencies/junit-3.8.2.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 14
Candidate class name: org.joda.time.DurationField, method name: int compareTo(org.joda.time.DurationField)
Concrete direct subclass: org.joda.time.field.UnsupportedDurationField
Concrete direct subclass: org.joda.time.field.MillisDurationField
Concrete direct subclass: org.joda.time.field.DelegatedDurationField

Candidate class name: org.joda.time.DateTimeField, method name: int[] add(org.joda.time.ReadablePartial,int,int[],int)
Concrete direct subclass: org.joda.time.field.UnsupportedDateTimeField
Concrete direct subclass: org.joda.time.field.DelegatedDateTimeField

Candidate class name: org.joda.time.chrono.AssembledChronology, method name: org.joda.time.Chronology withZone(org.joda.time.DateTimeZone)
Concrete direct subclass: org.joda.time.chrono.ISOChronology
Concrete direct subclass: org.joda.time.chrono.ZonedChronology
Concrete direct subclass: org.joda.time.chrono.GJChronology
Concrete direct subclass: org.joda.time.chrono.BuddhistChronology
Concrete direct subclass: org.joda.time.chrono.LimitChronology
Concrete direct subclass: org.joda.time.chrono.LenientChronology
Concrete direct subclass: org.joda.time.chrono.StrictChronology

Candidate class name: org.joda.time.DateTimeField, method name: long roundHalfCeiling(long)
Concrete direct subclass: org.joda.time.field.UnsupportedDateTimeField
Concrete direct subclass: org.joda.time.field.DelegatedDateTimeField

Candidate class name: org.joda.time.DateTimeZone, method name: long nextTransition(long)
Concrete direct subclass: org.joda.time.tz.FixedDateTimeZone
Concrete direct subclass: org.joda.time.UTCDateTimeZone
Concrete direct subclass: org.joda.time.tz.DateTimeZoneBuilder$DSTZone
Concrete direct subclass: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone
Concrete direct subclass: org.joda.time.tz.CachedDateTimeZone

Candidate class name: org.joda.time.DateTimeZone, method name: long previousTransition(long)
Concrete direct subclass: org.joda.time.tz.FixedDateTimeZone
Concrete direct subclass: org.joda.time.UTCDateTimeZone
Concrete direct subclass: org.joda.time.tz.DateTimeZoneBuilder$DSTZone
Concrete direct subclass: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone
Concrete direct subclass: org.joda.time.tz.CachedDateTimeZone

Candidate class name: org.joda.time.DateTimeField, method name: int[] addWrapField(org.joda.time.ReadablePartial,int,int[],int)
Concrete direct subclass: org.joda.time.field.UnsupportedDateTimeField
Concrete direct subclass: org.joda.time.field.DelegatedDateTimeField

Candidate class name: org.joda.time.DateTimeField, method name: int[] addWrapPartial(org.joda.time.ReadablePartial,int,int[],int)
Concrete direct subclass: org.joda.time.field.UnsupportedDateTimeField
Concrete direct subclass: org.joda.time.field.DelegatedDateTimeField

Candidate class name: org.joda.time.field.DecoratedDateTimeField, method name: long remainder(long)
Concrete direct subclass: org.joda.time.chrono.ISOYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.RemainderDateTimeField
Concrete direct subclass: org.joda.time.field.DividedDateTimeField
Concrete direct subclass: org.joda.time.field.ZeroIsMaxDateTimeField
Concrete direct subclass: org.joda.time.chrono.GJYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.OffsetDateTimeField
Concrete direct subclass: org.joda.time.chrono.LimitChronology$LimitDateTimeField

Candidate class name: org.joda.time.DurationField, method name: long add(long,long)
Concrete direct subclass: org.joda.time.field.UnsupportedDurationField
Concrete direct subclass: org.joda.time.field.MillisDurationField
Concrete direct subclass: org.joda.time.field.DelegatedDurationField

Candidate class name: org.joda.time.DurationField, method name: long add(long,int)
Concrete direct subclass: org.joda.time.field.UnsupportedDurationField
Concrete direct subclass: org.joda.time.field.MillisDurationField
Concrete direct subclass: org.joda.time.field.DelegatedDurationField

Candidate class name: org.joda.time.field.DecoratedDateTimeField, method name: long roundFloor(long)
Concrete direct subclass: org.joda.time.chrono.ISOYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.RemainderDateTimeField
Concrete direct subclass: org.joda.time.field.DividedDateTimeField
Concrete direct subclass: org.joda.time.field.ZeroIsMaxDateTimeField
Concrete direct subclass: org.joda.time.chrono.GJYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.OffsetDateTimeField
Concrete direct subclass: org.joda.time.chrono.LimitChronology$LimitDateTimeField

Candidate class name: org.joda.time.field.BaseDateTimeField, method name: long roundCeiling(long)
Concrete direct subclass: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField
Concrete direct subclass: org.joda.time.chrono.GJEraDateTimeField
Concrete direct subclass: org.joda.time.chrono.GJChronology$CutoverField
Concrete direct subclass: org.joda.time.chrono.BasicSingleEraDateTimeField

Candidate class name: org.joda.time.field.DecoratedDateTimeField, method name: long addWrapField(long,int)
Concrete direct subclass: org.joda.time.chrono.ISOYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.RemainderDateTimeField
Concrete direct subclass: org.joda.time.field.DividedDateTimeField
Concrete direct subclass: org.joda.time.field.ZeroIsMaxDateTimeField
Concrete direct subclass: org.joda.time.chrono.GJYearOfEraDateTimeField
Concrete direct subclass: org.joda.time.field.OffsetDateTimeField
Concrete direct subclass: org.joda.time.chrono.LimitChronology$LimitDateTimeField

Soot finished on Sat May 02 21:16:42 EDT 2020
Soot has run for 0 min. 21 sec.


## jsoup-jsoup-1.10.1:

java -cp /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/hierarchy-analysis/target/classes ca.uwaterloo.liang.Main /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/target/classes target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/gson-2.7.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/junit-4.12.jar jsoup_jsoup_1.10.1_missing_methods.csv
Soot started on Sat May 02 21:17:15 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/gson-2.7.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched/mvn_dependencies/junit-4.12.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 0
Soot finished on Sat May 02 21:17:36 EDT 2020
Soot has run for 0 min. 21 sec.


## javacc-7.0.5:

java -cp /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/hierarchy-analysis/target/classes ca.uwaterloo.liang.Main /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/javacc-7.0.5-patched/target/classes target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/javacc-7.0.5-patched/mvn_dependencies/junit-3.8.1.jar javacc_7.0.5_missing_methods.csv
Soot started on Sat May 02 21:26:02 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/javacc-7.0.5-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/javacc-7.0.5-patched/mvn_dependencies/junit-3.8.1.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 9
Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void productionStart(org.javacc.parser.NormalProduction)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void nonTerminalEnd(org.javacc.parser.NonTerminal)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void reEnd(org.javacc.parser.RegularExpression)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void productionEnd(org.javacc.parser.NormalProduction)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void expansionStart(org.javacc.parser.Expansion,boolean)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void nonTerminalStart(org.javacc.parser.NonTerminal)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void reStart(org.javacc.parser.RegularExpression)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void expansionEnd(org.javacc.parser.Expansion,boolean)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Candidate class name: org.javacc.jjdoc.TextGenerator, method name: void handleTokenProduction(org.javacc.parser.TokenProduction)
Concrete direct subclass: org.javacc.jjdoc.HTMLGenerator
Concrete direct subclass: org.javacc.jjdoc.XTextGenerator

Soot finished on Sat May 02 21:26:29 EDT 2020
Soot has run for 0 min. 26 sec.


## commons_collections-collections-4.3:

Soot started on Sat May 02 21:27:34 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-collections-collections-4.3/target/classes:target/classes:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 3
Candidate class name: org.apache.commons.collections4.bag.AbstractBagDecorator, method name: boolean addAll(java.util.Collection)
Concrete direct subclass: org.apache.commons.collections4.bag.UnmodifiableBag
Concrete direct subclass: org.apache.commons.collections4.bag.CollectionBag

Candidate class name: org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator, method name: boolean putAll(java.util.Map)
Concrete direct subclass: org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap
Concrete direct subclass: org.apache.commons.collections4.multimap.TransformedMultiValuedMap

Candidate class name: org.apache.commons.collections4.multimap.AbstractMultiValuedMapDecorator, method name: boolean putAll(org.apache.commons.collections4.MultiValuedMap)
Concrete direct subclass: org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap
Concrete direct subclass: org.apache.commons.collections4.multimap.TransformedMultiValuedMap

Soot finished on Sat May 02 21:28:03 EDT 2020
Soot has run for 0 min. 28 sec.


## commons-math-3.6.1:

Soot started on Sat May 02 21:28:47 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-math-MATH_3_6_1/target/classes:target/classes:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 3
Candidate class name: org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver, method name: org.apache.commons.math3.linear.RealVector solveInPlace(org.apache.commons.math3.linear.RealLinearOperator,org.apache.commons.math3.linear.RealLinearOperator,org.apache.commons.math3.linear.RealVector,org.apache.commons.math3.linear.RealVector)
Concrete direct subclass: org.apache.commons.math3.linear.SymmLQ
Concrete direct subclass: org.apache.commons.math3.linear.ConjugateGradient

Candidate class name: org.apache.commons.math3.linear.AbstractRealMatrix, method name: void addToEntry(int,int,double)
Concrete direct subclass: org.apache.commons.math3.linear.OpenMapRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.Array2DRowRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.BlockRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.DiagonalMatrix

Candidate class name: org.apache.commons.math3.linear.AbstractRealMatrix, method name: void multiplyEntry(int,int,double)
Concrete direct subclass: org.apache.commons.math3.linear.OpenMapRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.Array2DRowRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.BlockRealMatrix
Concrete direct subclass: org.apache.commons.math3.linear.DiagonalMatrix

Soot finished on Sat May 02 21:29:33 EDT 2020
Soot has run for 0 min. 45 sec.


## gson-gson-2.8.5:

java -cp /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/hierarchy-analysis/target/classes ca.uwaterloo.liang.Main /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/gson-gson-parent-2.8.5-patched/gson/target/classes target/classes gson_2.8.5_missing_methods.csv
Soot started on Sat May 02 21:30:51 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/gson-gson-parent-2.8.5-patched/gson/target/classes:target/classes:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 0
Soot finished on Sat May 02 21:31:14 EDT 2020
Soot has run for 0 min. 22 sec.

## commons-lang3-3.9-src:

java -cp /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/soot_jar/sootclasses-trunk-jar-with-dependencies.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/hierarchy-analysis/target/classes ca.uwaterloo.liang.Main /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/target/classes target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/apiguardian-api-1.0.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/commons-math3-3.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/easymock-4.0.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/hamcrest-2.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jmh-core-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jmh-generator-annprocess-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jopt-simple-4.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-api-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-engine-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-params-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-pioneer-0.3.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-platform-commons-1.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-platform-engine-1.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/objenesis-3.0.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/opentest4j-1.1.1.jar commons_lang3_3.9_src_missing_methods.csv
Soot started on Sat May 02 21:31:50 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/apiguardian-api-1.0.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/commons-math3-3.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/easymock-4.0.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/hamcrest-2.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jmh-core-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jmh-generator-annprocess-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/jopt-simple-4.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-api-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-engine-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-jupiter-params-5.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-pioneer-0.3.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-platform-commons-1.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/junit-platform-engine-1.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/objenesis-3.0.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/commons-lang3-3.9-src-patched/mvn_dependencies/opentest4j-1.1.1.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 0
Soot finished on Sat May 02 21:32:12 EDT 2020
Soot has run for 0 min. 22 sec.


## plexus-utils-3.3.0:

Soot started on Sat May 02 21:33:25 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/classworlds-1.1-alpha-2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/commons-cli-1.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/commons-math3-3.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/doxia-sink-api-1.0-alpha-4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/jmh-core-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/jmh-generator-annprocess-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/jopt-simple-4.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/jsch-0.1.23.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-artifact-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-artifact-manager-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-core-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-error-diagnostics-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-model-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-monitor-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-plugin-api-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-plugin-descriptor-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-plugin-parameter-documenter-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-plugin-registry-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-plugin-testing-harness-1.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-profile-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-project-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-reporting-api-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-repository-metadata-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/maven-settings-2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/plexus-archiver-1.0-alpha-7.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/plexus-container-default-1.0-alpha-8.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/plexus-interactivity-api-1.0-alpha-4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/plexus-utils-1.4.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/wagon-file-1.0-alpha-5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/wagon-http-lightweight-1.0-alpha-5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/wagon-provider-api-1.0-alpha-5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched/mvn_dependencies/wagon-ssh-1.0-alpha-5.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 0
Soot finished on Sat May 02 21:33:47 EDT 2020
Soot has run for 0 min. 21 sec.


## ph-commons-9.3.9-ph-commons:

Soot started on Sat May 02 21:34:21 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/target/classes:ph-commons/target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/mvn_dependencies/jsr305-3.0.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/mvn_dependencies/slf4j-api-1.7.29.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/mvn_dependencies/slf4j-simple-1.7.29.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 7
Candidate class name: java.io.Writer, method name: void write(int)
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingStringWriter
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingBufferedWriter
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingCharArrayWriter

Candidate class name: java.io.Reader, method name: int read(char[],int,int)
Concrete direct subclass: jdk.internal.util.xml.impl.ReaderUTF16
Concrete direct subclass: jdk.internal.util.xml.impl.ReaderUTF8
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingBufferedReader
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingStringReader

Candidate class name: java.io.InputStream, method name: long skip(long)
Concrete direct subclass: com.helger.commons.io.stream.ByteBufferInputStream
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingByteArrayInputStream
Concrete direct subclass: com.helger.commons.io.stream.ByteBuffersInputStream

Candidate class name: java.io.InputStream, method name: int read(byte[],int,int)
Concrete direct subclass: com.helger.commons.io.stream.ByteBufferInputStream
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingByteArrayInputStream
Concrete direct subclass: com.helger.commons.io.stream.ByteBuffersInputStream

Candidate class name: java.io.OutputStream, method name: void write(byte[],int,int)
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingByteArrayOutputStream
Concrete direct subclass: com.helger.commons.io.stream.ByteBufferOutputStream
Concrete direct subclass: com.helger.commons.io.stream.NullOutputStream

Candidate class name: java.io.InputStream, method name: void mark(int)
Concrete direct subclass: com.helger.commons.io.stream.ByteBufferInputStream
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingByteArrayInputStream
Concrete direct subclass: com.helger.commons.io.stream.ByteBuffersInputStream

Candidate class name: java.io.Writer, method name: void write(char[],int,int)
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingStringWriter
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingBufferedWriter
Concrete direct subclass: com.helger.commons.io.stream.NonBlockingCharArrayWriter

[Thread-6] ERROR heros.solver.CountingThreadPoolExecutor - Worker thread execution failed: Failed to convert <com.helger.commons.text.display.IDisplayTextProvider: java.util.Comparator getComparatorCollating(java.util.Locale,java.util.Locale)>
java.lang.RuntimeException: Failed to convert <com.helger.commons.text.display.IDisplayTextProvider: java.util.Comparator getComparatorCollating(java.util.Locale,java.util.Locale)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Trying to create virtual invoke expression for interface type (com.helger.commons.text.display.IDisplayTextProvider in file null). Use JInterfaceInvokeExpr instead!
	at soot.jimple.internal.JVirtualInvokeExpr.<init>(JVirtualInvokeExpr.java:49)
	at soot.jimple.Jimple.newVirtualInvokeExpr(Jimple.java:469)
	at soot.LambdaMetaFactory$ThunkMethodSource.\_invokeImplMethod(LambdaMetaFactory.java:699)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:646)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more
java.lang.RuntimeException: Failed to convert <com.helger.commons.text.display.IDisplayTextProvider: java.util.Comparator getComparatorCollating(java.util.Locale,java.util.Locale)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Trying to create virtual invoke expression for interface type (com.helger.commons.text.display.IDisplayTextProvider in file null). Use JInterfaceInvokeExpr instead!
	at soot.jimple.internal.JVirtualInvokeExpr.<init>(JVirtualInvokeExpr.java:49)
	at soot.jimple.Jimple.newVirtualInvokeExpr(Jimple.java:469)
	at soot.LambdaMetaFactory$ThunkMethodSource.\_invokeImplMethod(LambdaMetaFactory.java:699)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:646)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more
Exception in thread "Thread-6" java.lang.RuntimeException: Failed to convert <com.helger.commons.text.display.IDisplayTextProvider: java.util.Comparator getComparatorCollating(java.util.Locale,java.util.Locale)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Trying to create virtual invoke expression for interface type (com.helger.commons.text.display.IDisplayTextProvider in file null). Use JInterfaceInvokeExpr instead!
	at soot.jimple.internal.JVirtualInvokeExpr.<init>(JVirtualInvokeExpr.java:49)
	at soot.jimple.Jimple.newVirtualInvokeExpr(Jimple.java:469)
	at soot.LambdaMetaFactory$ThunkMethodSource.\_invokeImplMethod(LambdaMetaFactory.java:699)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:646)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more


## soot-4.0.0

Soot started on Sat May 02 21:36:35 EDT 2020
 /home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/android-4.1.1.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/ant-1.10.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/ant-launcher-1.10.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/asm-7.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/asm-analysis-7.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/asm-commons-7.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/asm-tree-7.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/asm-util-7.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/axml-2.0.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/byte-buddy-1.10.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/byte-buddy-agent-1.10.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/commons-codec-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/commons-io-2.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/commons-logging-1.1.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/dexlib2-2.2.7.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/FastInfoset-1.2.15.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/functionaljava-4.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/guava-18.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/hamcrest-all-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/heros-1.2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/httpclient-4.0.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/httpcore-4.0.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/istack-commons-runtime-3.0.7.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/jasmin-3.0.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/java_cup-0.9.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/javassist-3.18.2-GA.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/javax.activation-api-1.2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/javax.annotation-api-1.3.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/jaxb-api-2.4.0-b180725.0427.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/jaxb-runtime-2.4.0-b180830.0438.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/json-20080701.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/jsr305-1.3.9.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/mockito-core-3.2.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/objenesis-2.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/opengl-api-gl1.1-android-2.1_r1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/polyglot-2006.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-api-mockito2-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-api-support-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-core-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-module-junit4-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-module-junit4-common-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/powermock-reflect-2.0.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/slf4j-api-1.7.5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/slf4j-simple-1.7.5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/stax-ex-1.8.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/txw2-2.4.0-b180830.0438.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/xmlParserAPIs-2.6.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/xmlpull-1.1.3.4d_b4_min.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/soot-4.0.0-patched/mvn_dependencies/xpp3-1.1.4c.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 31
Candidate class name: java.io.FilterWriter, method name: void write(int)
Concrete direct subclass: soot.util.EscapedWriter
Concrete direct subclass: polyglot.util.UnicodeWriter

Candidate class name: soot.jimple.toolkits.pointer.nativemethods.NativeMethodClass, method name: void simulateMethod(soot.SootMethod,soot.jimple.toolkits.pointer.representations.ReferenceVariable,soot.jimple.toolkits.pointer.representations.ReferenceVariable,soot.jimple.toolkits.pointer.representations.ReferenceVariable[])
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilTimeZoneNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangRuntimeNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangReflectConstructorNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangFloatNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangClassLoaderNativeLibraryNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangClassNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangReflectArrayNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.SunMiscSignalNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangPackageNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangShutdownNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoObjectInputStreamNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoFileOutputStreamNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangStrictMathNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangSystemNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangDoubleNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaNetInetAddressImplNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangSecurityManagerNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilZipZipEntryNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangThrowableNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaSecurityAccessControllerNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangObjectNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangReflectFieldNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangClassLoaderNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoFileSystemNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangReflectMethodNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangStringNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilZipZipFileNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilResourceBundleNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilZipCRC32Native
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.SunMiscUnsafeNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoObjectOutputStreamNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilZipInflaterNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaUtilJarJarFileNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.SunMiscSignalHandlerNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangThreadNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaLangReflectProxyNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaNetInetAddressNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoObjectStreamClassNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoFileDescriptorNative
Concrete direct subclass: soot.jimple.toolkits.pointer.nativemethods.JavaIoFileInputStreamNative

Candidate class name: soot.toolkits.scalar.AbstractFlowSet, method name: void union(soot.toolkits.scalar.FlowSet,soot.toolkits.scalar.FlowSet)
Concrete direct subclass: soot.toolkits.scalar.ArraySparseSet
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.DavaFlowSet
Concrete direct subclass: soot.jimple.toolkits.scalar.ToppedSet

Candidate class name: soot.shimple.AbstractShimpleValueSwitch, method name: void casePhiExpr(soot.shimple.PhiExpr)
Concrete direct subclass: soot.jimple.spark.builder.MethodNodeFactory
Concrete direct subclass: soot.shimple.toolkits.graph.ValueGraph$1

Candidate class name: polyglot.visit.PrettyPrinter, method name: void print(polyglot.ast.Node,polyglot.ast.Node,polyglot.util.CodeWriter)
Concrete direct subclass: soot.toolkits.astmetrics.metricPrettyPrinter
Concrete direct subclass: polyglot.visit.Translator

Candidate class name: org.objectweb.asm.FieldVisitor, method name: void visitAttribute(org.objectweb.asm.Attribute)
Concrete direct subclass: soot.asm.FieldBuilder
Concrete direct subclass: org.objectweb.asm.util.TraceFieldVisitor
Concrete direct subclass: org.objectweb.asm.FieldWriter

Candidate class name: soot.jimple.parser.analysis.DepthFirstAdapter, method name: void outAQuotedNonvoidType(soot.jimple.parser.node.AQuotedNonvoidType)
Concrete direct subclass: soot.jimple.parser.Walker
Concrete direct subclass: soot.jimple.parser.CstPoolExtractor$CstPoolExtractorWalker

Candidate class name: soot.jimple.internal.AbstractJimpleIntLongBinopExpr, method name: void apply(soot.util.Switch)
Concrete direct subclass: soot.jimple.internal.JXorExpr
Concrete direct subclass: soot.jimple.internal.JShlExpr
Concrete direct subclass: soot.jimple.internal.JShrExpr
Concrete direct subclass: soot.jimple.internal.JOrExpr
Concrete direct subclass: soot.jimple.internal.JUshrExpr
Concrete direct subclass: soot.jimple.internal.JAndExpr

Candidate class name: soot.toolkits.scalar.AbstractFlowSet, method name: void copy(soot.toolkits.scalar.FlowSet)
Concrete direct subclass: soot.toolkits.scalar.ArraySparseSet
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.DavaFlowSet
Concrete direct subclass: soot.jimple.toolkits.scalar.ToppedSet

Candidate class name: soot.dava.toolkits.base.AST.structuredAnalysis.StructuredAnalysis, method name: soot.dava.toolkits.base.AST.structuredAnalysis.DavaFlowSet cloneFlowSet(soot.dava.toolkits.base.AST.structuredAnalysis.DavaFlowSet)
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.ReachingCopies
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.MustMayInitialize
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.CP
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.UnreachableCodeFinder
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.ReachingDefs

Candidate class name: polyglot.ext.jl.ast.Expr_c, method name: java.util.List acceptCFG(polyglot.visit.CFGBuilder,java.util.List)
Concrete direct subclass: soot.javaToJimple.jj.ast.JjComma_c
Concrete direct subclass: soot.javaToJimple.jj.ast.JjAccessField_c
Concrete direct subclass: polyglot.ext.jl.ast.Field_c
Concrete direct subclass: polyglot.ext.jl.ast.Unary_c
Concrete direct subclass: polyglot.ext.jl.ast.Cast_c
Concrete direct subclass: polyglot.ext.jl.ast.Instanceof_c
Concrete direct subclass: polyglot.ext.jl.ast.Binary_c
Concrete direct subclass: polyglot.ext.jl.ast.ArrayAccess_c
Concrete direct subclass: polyglot.ext.jl.ast.Call_c
Concrete direct subclass: polyglot.ext.jl.ast.Conditional_c
Concrete direct subclass: polyglot.ext.jl.ast.New_c
Concrete direct subclass: polyglot.ext.jl.ast.NewArray_c
Concrete direct subclass: polyglot.ext.jl.ast.Special_c
Concrete direct subclass: polyglot.ext.jl.ast.Local_c
Concrete direct subclass: polyglot.ext.jl.ast.AmbExpr_c
Concrete direct subclass: polyglot.ext.jl.ast.ArrayInit_c

Candidate class name: soot.util.PriorityQueue, method name: boolean contains(int)        (CHECK)
Concrete direct subclass: soot.util.LargePriorityQueue
Concrete direct subclass: soot.util.MediumPriorityQueue
Concrete direct subclass: soot.util.SmallPriorityQueue

Candidate class name: soot.jimple.parser.analysis.DepthFirstAdapter, method name: void outAFullIdentNonvoidType(soot.jimple.parser.node.AFullIdentNonvoidType)
Concrete direct subclass: soot.jimple.parser.Walker
Concrete direct subclass: soot.jimple.parser.CstPoolExtractor$CstPoolExtractorWalker

Candidate class name: soot.dexpler.instructions.DexlibAbstractInstruction, method name: void jimplify(soot.dexpler.DexBody)
Concrete direct subclass: soot.dexpler.instructions.MoveExceptionInstruction
Concrete direct subclass: soot.dexpler.instructions.ConstStringInstruction
Concrete direct subclass: soot.dexpler.instructions.NopInstruction
Concrete direct subclass: soot.dexpler.instructions.MonitorExitInstruction
Concrete direct subclass: soot.dexpler.instructions.MoveResultInstruction
Concrete direct subclass: soot.dexpler.instructions.ConstInstruction
Concrete direct subclass: soot.dexpler.instructions.MonitorEnterInstruction
Concrete direct subclass: soot.dexpler.instructions.ConstClassInstruction
Concrete direct subclass: soot.dexpler.instructions.ArrayLengthInstruction
Concrete direct subclass: soot.dexpler.instructions.NewArrayInstruction
Concrete direct subclass: soot.dexpler.instructions.CheckCastInstruction
Concrete direct subclass: soot.dexpler.instructions.AgetInstruction
Concrete direct subclass: soot.dexpler.instructions.MoveInstruction
Concrete direct subclass: soot.dexpler.instructions.ReturnVoidInstruction
Concrete direct subclass: soot.dexpler.instructions.ReturnInstruction
Concrete direct subclass: soot.dexpler.instructions.InstanceOfInstruction
Concrete direct subclass: soot.dexpler.instructions.ThrowInstruction
Concrete direct subclass: soot.dexpler.instructions.NewInstanceInstruction

Candidate class name: soot.dava.toolkits.base.AST.structuredAnalysis.DavaFlowSet, method name: void intersection(soot.toolkits.scalar.FlowSet,soot.toolkits.scalar.FlowSet)
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.CPFlowSet
Concrete direct subclass: soot.dava.toolkits.base.AST.structuredAnalysis.UnreachableCodeFinder$UnreachableCodeFlowSet

Candidate class name: soot.AbstractValueBox, method name: boolean canContainValue(soot.Value)
Concrete direct subclass: soot.baf.internal.BafLocalBox
Concrete direct subclass: soot.jimple.internal.IdentityRefBox
Concrete direct subclass: soot.jimple.internal.JimpleLocalBox
Concrete direct subclass: soot.jimple.internal.VariableBox
Concrete direct subclass: soot.jimple.internal.ConditionExprBox
Concrete direct subclass: soot.jimple.internal.RValueBox
Concrete direct subclass: soot.jimple.internal.InvokeExprBox
Concrete direct subclass: soot.jimple.internal.ImmediateBox
Concrete direct subclass: soot.grimp.internal.GRValueBox
Concrete direct subclass: soot.grimp.internal.ExprBox
Concrete direct subclass: soot.toolkits.scalar.ValueUnitPair
Concrete direct subclass: soot.dava.internal.javaRep.DArrayInitValueBox

Candidate class name: soot.util.PriorityQueue, method name: int nextSetBit(int)       (CHECK)
Concrete direct subclass: soot.util.LargePriorityQueue
Concrete direct subclass: soot.util.MediumPriorityQueue
Concrete direct subclass: soot.util.SmallPriorityQueue

Candidate class name: soot.jimple.ArithmeticConstant, method name: soot.jimple.NumericConstant lessThan(soot.jimple.NumericConstant)
Concrete direct subclass: soot.jimple.IntConstant
Concrete direct subclass: soot.jimple.LongConstant

Candidate class name: soot.BodyPack, method name: void internalApply(soot.Body)
Concrete direct subclass: soot.JimpleBodyPack
Concrete direct subclass: soot.JavaToJimpleBodyPack

Candidate class name: soot.jimple.spark.sets.PointsToSetInternal, method name: boolean add(soot.jimple.spark.pag.Node)
Concrete direct subclass: soot.jimple.spark.sets.EmptyPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.HashPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.DoublePointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SortedArraySet
Concrete direct subclass: soot.jimple.spark.sets.HybridPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SharedListSet
Concrete direct subclass: soot.jimple.spark.sets.SharedHybridSet
Concrete direct subclass: soot.jimple.spark.sets.BitPointsToSet

Candidate class name: soot.jimple.spark.sets.PointsToSetInternal, method name: boolean contains(soot.jimple.spark.pag.Node)
Concrete direct subclass: soot.jimple.spark.sets.EmptyPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.HashPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.DoublePointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SortedArraySet
Concrete direct subclass: soot.jimple.spark.sets.HybridPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SharedListSet
Concrete direct subclass: soot.jimple.spark.sets.SharedHybridSet
Concrete direct subclass: soot.jimple.spark.sets.BitPointsToSet

Candidate class name: soot.shimple.AbstractShimpleValueSwitch, method name: void caseNewMultiArrayExpr(soot.jimple.NewMultiArrayExpr)
Concrete direct subclass: soot.jimple.spark.builder.MethodNodeFactory
Concrete direct subclass: soot.shimple.toolkits.graph.ValueGraph$1

Candidate class name: soot.util.PriorityQueue, method name: boolean add(int)       (CHECK)
Concrete direct subclass: soot.util.LargePriorityQueue
Concrete direct subclass: soot.util.MediumPriorityQueue
Concrete direct subclass: soot.util.SmallPriorityQueue

Candidate class name: soot.jimple.spark.sets.PointsToSetInternal, method name: boolean forall(soot.jimple.spark.sets.P2SetVisitor)
Concrete direct subclass: soot.jimple.spark.sets.EmptyPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.HashPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.DoublePointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SortedArraySet
Concrete direct subclass: soot.jimple.spark.sets.HybridPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SharedListSet
Concrete direct subclass: soot.jimple.spark.sets.SharedHybridSet
Concrete direct subclass: soot.jimple.spark.sets.BitPointsToSet

Candidate class name: soot.ClassSource, method name: soot.javaToJimple.IInitialResolver$Dependencies resolve(soot.SootClass)
Concrete direct subclass: soot.CoffiClassSource
Concrete direct subclass: soot.asm.AsmClassSource
Concrete direct subclass: soot.DexClassSource
Concrete direct subclass: soot.JimpleClassSource
Concrete direct subclass: soot.JavaClassSource

Candidate class name: soot.jimple.parser.analysis.DepthFirstAdapter, method name: void outAIdentNonvoidType(soot.jimple.parser.node.AIdentNonvoidType)
Concrete direct subclass: soot.jimple.parser.Walker
Concrete direct subclass: soot.jimple.parser.CstPoolExtractor$CstPoolExtractorWalker

Candidate class name: soot.BodyPack, method name: void applyPhaseOptions(soot.jimple.JimpleBody,java.util.Map)
Concrete direct subclass: soot.JimpleBodyPack
Concrete direct subclass: soot.JavaToJimpleBodyPack

Candidate class name: soot.jimple.spark.sets.PointsToSetInternal, method name: boolean addAll(soot.jimple.spark.sets.PointsToSetInternal,soot.jimple.spark.sets.PointsToSetInternal)
Concrete direct subclass: soot.jimple.spark.sets.EmptyPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.HashPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.DoublePointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SortedArraySet
Concrete direct subclass: soot.jimple.spark.sets.HybridPointsToSet
Concrete direct subclass: soot.jimple.spark.sets.SharedListSet
Concrete direct subclass: soot.jimple.spark.sets.SharedHybridSet
Concrete direct subclass: soot.jimple.spark.sets.BitPointsToSet

Candidate class name: soot.toolkits.exceptions.AbstractThrowAnalysis, method name: soot.toolkits.exceptions.ThrowableSet mightThrowImplicitly(soot.jimple.ThrowStmt)
Concrete direct subclass: soot.toolkits.exceptions.PedanticThrowAnalysis
Concrete direct subclass: soot.toolkits.exceptions.UnitThrowAnalysis

Candidate class name: soot.util.PriorityQueue, method name: boolean remove(int)           (CHECK)
Concrete direct subclass: soot.util.LargePriorityQueue
Concrete direct subclass: soot.util.MediumPriorityQueue
Concrete direct subclass: soot.util.SmallPriorityQueue

Candidate class name: soot.shimple.AbstractShimpleValueSwitch, method name: void caseVirtualInvokeExpr(soot.jimple.VirtualInvokeExpr)
Concrete direct subclass: soot.jimple.spark.builder.MethodNodeFactory
Concrete direct subclass: soot.shimple.toolkits.graph.ValueGraph$1

Soot finished on Sat May 02 21:47:47 EDT 2020
Soot has run for 11 min. 12 sec.


## jgrapht-1.3.1-core:

Soot started on Sat May 02 21:48:35 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/commons-io-2.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/commons-math3-3.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/hamcrest-library-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/jheaps-0.10.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/jmh-core-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/jmh-generator-annprocess-1.21.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/jopt-simple-4.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/junit-toolbox-2.4.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/mockito-core-1.9.5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/jgrapht-jgrapht-1.3.1-patched/jgrapht-core/mvn_dependencies/objenesis-1.0.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 1
Candidate class name: org.jgrapht.graph.AbstractBaseGraph, method name: org.jgrapht.graph.builder.GraphBuilder createBuilder(java.util.function.Supplier)
Concrete direct subclass: org.jgrapht.graph.Pseudograph
Concrete direct subclass: org.jgrapht.graph.Multigraph
Concrete direct subclass: org.jgrapht.graph.SimpleGraph
Concrete direct subclass: org.jgrapht.graph.SimpleDirectedGraph
Concrete direct subclass: org.jgrapht.graph.DirectedPseudograph
Concrete direct subclass: org.jgrapht.graph.DefaultUndirectedGraph
Concrete direct subclass: org.jgrapht.graph.DefaultDirectedGraph
Concrete direct subclass: org.jgrapht.graph.DirectedMultigraph
Concrete direct subclass: org.jgrapht.graph.DirectedAcyclicGraph

[Thread-5] ERROR heros.solver.CountingThreadPoolExecutor - Worker thread execution failed: Failed to convert <org.jgrapht.alg.cycle.ChordalityInspector: boolean isPerfectEliminationOrder(java.util.List,boolean)>
java.lang.RuntimeException: Failed to convert <org.jgrapht.alg.cycle.ChordalityInspector: boolean isPerfectEliminationOrder(java.util.List,boolean)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Unhandled Type of Local variable to Generate - Not Implemented
	at soot.javaToJimple.LocalGenerator.generateLocal(LocalGenerator.java:141)
	at soot.LambdaMetaFactory$ThunkMethodSource.unbox(LambdaMetaFactory.java:574)
	at soot.LambdaMetaFactory$ThunkMethodSource.adapt(LambdaMetaFactory.java:529)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:663)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more
Exception in thread "Thread-5" java.lang.RuntimeException: Failed to convert <org.jgrapht.alg.cycle.ChordalityInspector: boolean isPerfectEliminationOrder(java.util.List,boolean)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Unhandled Type of Local variable to Generate - Not Implemented
	at soot.javaToJimple.LocalGenerator.generateLocal(LocalGenerator.java:141)
	at soot.LambdaMetaFactory$ThunkMethodSource.unbox(LambdaMetaFactory.java:574)
	at soot.LambdaMetaFactory$ThunkMethodSource.adapt(LambdaMetaFactory.java:529)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:663)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more
java.lang.RuntimeException: Failed to convert <org.jgrapht.alg.cycle.ChordalityInspector: boolean isPerfectEliminationOrder(java.util.List,boolean)>
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2040)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.PackManager$1.run(PackManager.java:1279)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
Caused by: java.lang.RuntimeException: Unhandled Type of Local variable to Generate - Not Implemented
	at soot.javaToJimple.LocalGenerator.generateLocal(LocalGenerator.java:141)
	at soot.LambdaMetaFactory$ThunkMethodSource.unbox(LambdaMetaFactory.java:574)
	at soot.LambdaMetaFactory$ThunkMethodSource.adapt(LambdaMetaFactory.java:529)
	at soot.LambdaMetaFactory$ThunkMethodSource.invokeImplMethod(LambdaMetaFactory.java:663)
	at soot.LambdaMetaFactory$ThunkMethodSource.getInvokeBody(LambdaMetaFactory.java:483)
	at soot.LambdaMetaFactory$ThunkMethodSource.getBody(LambdaMetaFactory.java:334)
	at soot.SootMethod.retrieveActiveBody(SootMethod.java:402)
	at soot.LambdaMetaFactory.makeLambdaHelper(LambdaMetaFactory.java:239)
	at soot.asm.AsmMethodSource.convertInvokeDynamicInsn(AsmMethodSource.java:1420)
	at soot.asm.AsmMethodSource.convert(AsmMethodSource.java:1791)
	at soot.asm.AsmMethodSource.getBody(AsmMethodSource.java:2038)
	... 5 more


## velocity-engine-2.1-core:

Soot started on Sat May 02 21:49:33 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/commons-io-2.6.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/commons-lang3-3.8.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/hsqldb-2.3.5.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/slf4j-api-1.7.26.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/velocity-engine-2.1-patched/velocity-engine-core/mvn_dependencies/slf4j-simple-1.7.26.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 3
Candidate class name: org.apache.velocity.runtime.resource.loader.ResourceLoader, method name: boolean isSourceModified(org.apache.velocity.runtime.resource.Resource)
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.FileResourceLoader
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.StringResourceLoader
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.JarResourceLoader
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.DataSourceResourceLoader
Concrete direct subclass: org.apache.velocity.runtime.resource.loader.URLResourceLoader

Candidate class name: org.apache.velocity.runtime.directive.Directive, method name: boolean render(org.apache.velocity.context.InternalContextAdapter,java.io.Writer,org.apache.velocity.runtime.parser.node.Node)
Concrete direct subclass: org.apache.velocity.runtime.directive.Foreach
Concrete direct subclass: org.apache.velocity.runtime.directive.RuntimeMacro
Concrete direct subclass: org.apache.velocity.runtime.directive.VelocimacroProxy
Concrete direct subclass: org.apache.velocity.runtime.directive.Break
Concrete direct subclass: org.apache.velocity.runtime.directive.Macro
Concrete direct subclass: org.apache.velocity.runtime.directive.Evaluate
Concrete direct subclass: org.apache.velocity.runtime.directive.Stop

Candidate class name: java.io.Writer, method name: void write(char[],int,int)
Concrete direct subclass: org.apache.velocity.util.StringBuilderWriter
Concrete direct subclass: org.apache.commons.lang3.text.StrBuilder$StrBuilderWriter
Concrete direct subclass: org.apache.velocity.io.VelocityWriter

Soot finished on Sat May 02 21:49:59 EDT 2020
Soot has run for 0 min. 26 sec.


## java-classmate-1.5.1:

Soot started on Sun May 10 22:43:36 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/java-classmate-classmate-1.5.1-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/java-classmate-classmate-1.5.1-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/java-classmate-classmate-1.5.1-patched/mvn_dependencies/junit-4.12.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 0
Soot finished on Sun May 10 22:43:56 EDT 2020
Soot has run for 0 min. 20 sec.


## woodstox-core-6.2.0:

Soot started on Sun May 10 22:44:42 EDT 2020
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/target/classes:target/classes::/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/hamcrest-core-1.3.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/isorelax-20090621.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/junit-4.12.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/msv-core-2013.6.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/org.osgi.core-1.4.0.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/relaxngDatatype-20020414.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/stax2-api-4.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/Benchmarks/woodstox-woodstox-core-6.2.0-patched/mvn_dependencies/xsdlib-2013.6.1.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar
File Found: true
Completable candidates size: 7
Candidate class name: com.ctc.wstx.io.BaseReader, method name: int read(char[],int,int)
Concrete direct subclass: com.ctc.wstx.io.AsciiReader
Concrete direct subclass: com.ctc.wstx.io.UTF8Reader
Concrete direct subclass: com.ctc.wstx.io.UTF32Reader
Concrete direct subclass: com.ctc.wstx.io.ISOLatinReader

Candidate class name: com.ctc.wstx.sw.EncodingXmlWriter, method name: int writeCDataContent(char[],int,int)
Concrete direct subclass: com.ctc.wstx.sw.AsciiXmlWriter
Concrete direct subclass: com.ctc.wstx.sw.ISOLatin1XmlWriter

Candidate class name: com.ctc.wstx.io.BaseInputSource, method name: boolean readMore(com.ctc.wstx.io.WstxInputData,int)
Concrete direct subclass: com.ctc.wstx.io.ReaderSource
Concrete direct subclass: com.ctc.wstx.io.CharArraySource

Candidate class name: com.ctc.wstx.dtd.DTDAttribute, method name: void validateDefault(com.ctc.wstx.sr.InputProblemReporter,boolean)
Concrete direct subclass: com.ctc.wstx.dtd.DTDNmTokensAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDCdataAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDEnumAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDIdAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDIdRefsAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDEntitiesAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDIdRefAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDNotationAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDEntityAttr
Concrete direct subclass: com.ctc.wstx.dtd.DTDNmTokenAttr

Candidate class name: com.ctc.wstx.util.BaseNsContext, method name: void outputNamespaceDeclarations(java.io.Writer)
Concrete direct subclass: com.ctc.wstx.sr.CompactNsContext
Concrete direct subclass: com.ctc.wstx.util.EmptyNamespaceContext
Concrete direct subclass: com.ctc.wstx.evt.MergedNsContext

Candidate class name: com.ctc.wstx.evt.BaseStartElement, method name: void outputNsAndAttr(javax.xml.stream.XMLStreamWriter)
Concrete direct subclass: com.ctc.wstx.evt.CompactStartElement
Concrete direct subclass: com.ctc.wstx.evt.SimpleStartElement

Candidate class name: com.ctc.wstx.ent.ExtEntity, method name: com.ctc.wstx.io.WstxInputSource expand(com.ctc.wstx.io.WstxInputSource,javax.xml.stream.XMLResolver,com.ctc.wstx.api.ReaderConfig,int)
Concrete direct subclass: com.ctc.wstx.ent.UnparsedExtEntity
Concrete direct subclass: com.ctc.wstx.ent.ParsedExtEntity

Soot finished on Sun May 10 22:45:05 EDT 2020
Soot has run for 0 min. 22 sec.
