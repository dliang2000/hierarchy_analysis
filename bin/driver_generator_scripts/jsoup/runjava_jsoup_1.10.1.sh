#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork"

PACKAGE="org.jsoup"
SOOT_JAR="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/OpenSourceProjects/Benchmarks/jsoup-jsoup-1.10.1-patched"
TARGET_PATH="target/classes"
TARGET_TEST_PATH="target/test-classes"
BENCHMARK="jsoup_1.10.1"
DRIVER_PATH="org.jsoup.Driver"
OUTPUT_PATH="$MACHINE_SPECIFIC_PATH/analysis_output"

MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/mvn_dependencies"

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

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $DRIVER_PATH $BENCHMARK_PATH/$TARGET_PATH $BENCHMARK_PATH/$TARGET_TEST_PATH $jars`cat benchmark_class_path`:$JAR_PATH $BENCHMARK $OUTPUT_PATH
rm -rf "sootOutput/"
