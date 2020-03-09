#!/bin/bash
#under msp everything should be identical on all computers
SHARED_SPECIFIC_PATH='/vagrant/shared'
BENCHMARK_SPECIFIC_PATH="/home/vagrant"

SOOT_JAR="$SHARED_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$SHARED_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_CLASS_PATH="$SHARED_SPECIFIC_PATH/benchmark_class_path/joda_time_2.10.5_class_path"

BENCHMARK_PATH="$BENCHMARK_SPECIFIC_PATH/benchmarks/joda-time-2.10.5"
CSV_PATH="$BENCHMARK_SPECIFIC_PATH/benchmarks/csv/joda_time_2.10.5_missing_methods.csv"
TARGET_PATH="target/classes"
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
  # mvn clean compile
fi

echo java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat $BENCHMARK_CLASS_PATH`:$JAR_PATH $CSV_PATH
java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $BENCHMARK_PATH/$TARGET_PATH $jars`cat $BENCHMARK_CLASS_PATH`:$JAR_PATH $CSV_PATH
