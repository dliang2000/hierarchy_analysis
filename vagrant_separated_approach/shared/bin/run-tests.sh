#!/bin/bash

if [[ -z $1 ]] || [[ $(basename $1) != "projects.json" ]]; then
  echo Usage: $0 ../shared/projects.json [benchmark]
  exit 1
fi

if [ "benchmarks" != $(basename $(pwd)) ]; then
  echo "Must run from 'benchmarks' directory (inside the VM)!"
  exit 1
fi

if [[ ! -z "$2" ]]; then
  TARGET=$2
fi

mkdir output

INPUT=$1
for c in $(jq '.[] | select(.build == "gradlew").versions[].dir' < "$INPUT"); do
  cc=$(sed -e 's/^"//' -e 's/"$//' <<<"$c")
  if [ -d $cc ]; then
     if [ -z $TARGET ] || [[ $cc == $TARGET* ]]; then
       ( cd $cc; ./gradlew test >& ../$(basename $(pwd))-test-output; echo $? > ../$(basename $(pwd))-test-result.out )
     fi
  fi
done

for c in $(jq '.[] | select(.build == "mvn").versions[].dir' < "$INPUT"); do
  cc=$(sed -e 's/^"//' -e 's/"$//' <<<"$c")
  if [ -d $cc ]; then
     if [ -z $TARGET ] || [[ $cc == $TARGET* ]]; then
       ( cd $cc; ./mvn test >& ../$(basename $(pwd))-test-output; echo $? > ../$(basename $(pwd))-test-result.out )
     fi
  fi
done

