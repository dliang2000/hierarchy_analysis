#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork"

PACKAGE="com.helger.commons"
SOOT_JAR="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.DriverGenerator"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/OpenSourceProjects/Benchmarks/ph-commons-ph-commons-parent-pom-9.3.9-patched"
TARGET_TEST_PATH="ph-commons/target/test-classes"
DESTINATION="$BENCHMARK_PATH/ph-commons/src/test/java/com/helger/commons"
BENCHMARK="ph_commons_ph_commons_9.3.9"
OUTPUT_PATH="$MACHINE_SPECIFIC_PATH/analysis_output"

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/ph-commons/mvn_dependencies"

# add all the jar files needed for set_soot_classpath
for jar in $MVN_DEPENDENCY_PATH/*; do
  JAR_PATH=$JAR_PATH:$jar
done
echo $JAR_PATH

cd $BENCHMARK_PATH

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_maven ]; then
  echo "it is a maven project"
  mvn clean test
fi

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_TEST_PATH $jars`cat benchmark_class_path`:$JAR_PATH $PACKAGE $DESTINATION $BENCHMARK $OUTPUT_PATH
rm -rf "sootOutput/"
