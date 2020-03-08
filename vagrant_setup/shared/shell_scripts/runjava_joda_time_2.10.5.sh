#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="/home/vagrant"

SOOT_JAR="$MACHINE_SPECIFIC_PATH/shared/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/shared/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/benchmarks/joda-time-2.10.5"
TARGET_PATH="target/classes"
CSV_PATH="$MACHINE_SPECIFIC_PATH/benchmarks/csv/joda_time_2.10_missing_methods.csv"
BENCHMARK_CLASS_PATH="$MACHINE_SPECIFIC_PATH/shared/benchmark_class_path/joda_time_2.10.5_class_path"
MVN_DEPENDENCY_PATH="$BENCHMARK_PATH/target/mvn_dependencies"

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

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat $BENCHMARK_CLASS_PATH`:$JAR_PATH $CSV_PATH
