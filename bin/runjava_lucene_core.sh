#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"

SOOT_JAR="$MACHINE_SPECIFIC_PATH/soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
JAVA_PATH="$MACHINE_SPECIFIC_PATH/hierarchy-analysis/target/classes"
CC_CLASS="ca.uwaterloo.liang.Main"
BENCHMARK_PATH="$MACHINE_SPECIFIC_PATH/Benchmarks/lucene-solr"
SUB_PROJECT_PATH="$BENCHMARK_PATH/lucene"
TARGET_PATH="build/core/classes/java"

# LIB="$SUB_PROJECT_PATH/core/lib"
#
# # add all the jar files needed for set_soot_classpath
# for jar in $LIB/*; do
#   JAR_PATH=$JAR_PATH:$jar
# done
# echo $JAR_PATH
#
cd $BENCHMARK_PATH

# touch is_maven in the benchmark directory to indicate that a benchmark is mvn
if [ -a is_ant ]; then
  echo "it is an ant project"
  # rm -rf ~/.ivy2/cache
  # ant ivy-bootstrap
  ant compile
fi

java -cp $SOOT_JAR:$JAVA_PATH $CC_CLASS $SUB_PROJECT_PATH/$TARGET_PATH `cat benchmark_class_path` lucene_core_missing_methods.csv
