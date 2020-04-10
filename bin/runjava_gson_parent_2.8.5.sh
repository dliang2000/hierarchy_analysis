#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/gson-gson-parent-2.8.5-patched/gson"
TARGET_PATH="target/classes"

# MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/ph-commons/mvn_dependencies"

# add all the jar files needed for set_soot_classpath
# for jar in $MVN_DEPENDENCY_PATH/*; do
#   JAR_PATH=$JAR_PATH:$jar
# done
# echo $JAR_PATH

cd $BENCHMARK_PATH

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_maven ]; then
  echo "it is a maven project"
  mvn compile
fi

echo java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat benchmark_class_path` gson_2.8.5_missing_methods.csv
java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat benchmark_class_path` gson_2.8.5_missing_methods.csv
