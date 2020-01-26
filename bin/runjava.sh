# CLASSPATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects/commons-math-MATH_3_6_1/src/main/java"
# cd $CLASSPATH
# shopt -s globstar
# mkdir classes
# javac **/*.java -d \classes

#!/bin/bash
#under msp everything should be identical on all computers
MACHINE_SPECIFIC_PATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects"

SOOT_JAR="soot_jar/sootclasses-trunk-jar-with-dependencies.jar"
CC_PATH="hierarchy-analysis/src/main/java/ca/uwaterloo/liang/Main.java"
BENCHMARK_PATH="Benchmarks/commons-math-MATH_3_6_1"
TARGET_PATH="target/classes/"

cd $MACHINE_SPECIFIC_PATH/$BENCHMARK_PATH
# touch is_maven in the benchmark directory
if [-x is_maven ]; then
  mvn compile
fi



java -cp $SOOT_JAR:$CC_PATH $MACHINE_SPECIFIC_PATH/$BENCHMARK_PATH/$TARGET_PATH
