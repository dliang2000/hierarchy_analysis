#!/usr/bin/python3

# inputs: proj, path_to_file, target (line number in version1); plus command-line arg ../shared/projects.json
# output: line number in version2

from difflib import SequenceMatcher
from os import path
import json
import sys

def retrieve_bases(projects_file, proj):
    with open(projects_file, 'r') as pf:
        for p in json.loads(pf.read()):
            if (p['name'] == proj):
                return (p['versions'][0]['dir'], p['versions'][1]['dir'])
    return None

def compute_matching_line(text1, text2, target):
    s = SequenceMatcher(lambda x: x in " \t", text1, text2)
    for m in s.get_matching_blocks():
        if (m.a <= target and target <= m.a + m.size):
            return m.b+target-m.a
    return None

def main(argv):
    projects_file = argv[1]

    proj = 'apache-commons-math'
    path_to_file = "src/main/java/org/apache/commons/math3/geometry/euclidean/twod/SubLine.java"
    target = 120

    (base1, base2) = retrieve_bases(projects_file, proj)

    with open(path.join(base1, path_to_file), 'r') as f1h:
        f1 = f1h.readlines()
    with open(path.join(base2, path_to_file), 'r') as f2h:
        f2 = f2h.readlines()

    matching_line = compute_matching_line(f1, f2, target)
    print ('matching line for {} is {}'.format(target, matching_line))

if __name__ == "__main__":
    main(sys.argv)
