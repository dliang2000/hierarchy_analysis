#!/bin/bash

if [ "benchmarks" != $(basename $(pwd)) ]; then
  echo "Must run from 'benchmarks' directory (inside the VM)!"
  exit 1
fi

if [[ -z $1 ]] || [[ $(basename $1) != "projects.json" ]]; then
  echo Usage: $0 ../shared/projects.json [benchmark]
  exit 1
fi

SQUERY=".[].versions[].source"
PQUERY=".[].versions[].patch"
if [[ ! -z "$2" ]]; then
  TARGET=$2
  # TODO (probably never): parse TARGET into benchmark-version and select on that
  SQUERY=".[] | select(.name == \"$TARGET\").versions[].source"
  PQUERY=".[] | select(.name == \"$TARGET\").versions[].patch"
fi

INPUT=$1
for c in $(jq "$SQUERY" < "$INPUT"); do
  cc=$(sed -e 's/^"//' -e 's/"$//' <<<"$c")
  /usr/bin/wget -nc $cc
  fn="${cc##*/}"
  if [[ $fn == *.tar.gz ]] || [[ $fn == *.tgz ]]; then
      tar xzf $fn
  fi
  if [[ $fn == *.zip ]]; then
      unzip -o $fn
  fi
done

for p in $(jq "$PQUERY" < "$INPUT"); do
  pp=$(sed -e 's/^"//' -e 's/"$//' <<<"$p")
  if [[ $pp != "null" ]]; then
    patch -p 0 < $pp
  fi
done
