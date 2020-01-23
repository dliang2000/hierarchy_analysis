#!/bin/bash
CLASSPATH="$HOME/Graduation_Studies/ThesisWork/OpenSourceProjects/commons-math-MATH_3_6_1/src/main/java"
cd $CLASSPATH
shopt -s globstar
mkdir classes
javac **/*.java -d \classes

java -cp ca.uwaterloo.liang.Main
