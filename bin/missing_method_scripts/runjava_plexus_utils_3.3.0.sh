#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/plexus-utils-plexus-utils-3.3.0-patched"
BENCHMARK="plexus_utils_3.3.0"
TARGET_PATH="target/classes"

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
  mvn compile
fi

echo java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat benchmark_class_path`:$JAR_PATH plexus_utils_3.3.0_missing_methods.csv $BENCHMARK
java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat benchmark_class_path`:$JAR_PATH plexus_utils_3.3.0_missing_methods.csv $BENCHMARK
