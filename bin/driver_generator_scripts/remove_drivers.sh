#!/bin/bash
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/JRefactoring/hierarchy-analysis/Benchmarks"

# remove Driver.java for commons-collections-4.3
cd $MACHINE_SPECIFIC_PATH
cd ./commons-collections-collections-4.3/src/test/java/org/apache/commons/collections4
rm -rf Driver.java

# remove Driver.java for commons-math-MATH_3_6_1
cd $MACHINE_SPECIFIC_PATH
cd ./commons-math-MATH_3_6_1/src/test/java/org/apache/commons/math3
rm -rf Driver.java

# remove Driver.java for java-classmate-classmate-1.5.1
cd $MACHINE_SPECIFIC_PATH
cd ./java-classmate-classmate-1.5.1-patched/src/test/java/com/fasterxml/classmate
rm -rf Driver.java

# remove Driver.java for jsoup-jsoup-1.10.1
cd $MACHINE_SPECIFIC_PATH
cd ./jsoup-jsoup-1.10.1-patched/src/test/java/org/jsoup
rm -rf Driver.java

# remove Driver.java for ph-commons-ph-commons-parent-pom-9.3.9/ph-commons
cd $MACHINE_SPECIFIC_PATH
cd ./ph-commons-ph-commons-parent-pom-9.3.9-patched/ph-commons/src/test/java/com/helger/commons
rm -rf Driver.java

# remove Driver.java for plexus-utils-plexus-utils-3.3.0
cd $MACHINE_SPECIFIC_PATH
cd ./plexus-utils-plexus-utils-3.3.0-patched/src/test/java/org/codehaus/plexus/util
rm -rf Driver.java
