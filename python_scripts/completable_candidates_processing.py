import os
import re
import glob
from subprocess import Popen, PIPE, STDOUT
import pandas as pd

list_of_benchmarks = []
file_list = glob.glob("/home/daveroar/Graduation_Studies/ThesisWork/JRefactoring/hierarchy-analysis/bin/*.sh")
filteredFiles = [f for f in file_list if not "runall.sh" in f]
# print(filteredFiles)
for file in filteredFiles:
    temp_list = []
    filename = os.path.basename(file).replace('runjava_', '').replace('.sh', '').replace('_', '-')
    temp_list.append(filename)

    stream = os.popen(file, 'r')
    for line in stream.readlines():
        # print(line)
        if "Completable candidates size:" in line:
            res = int(re.search(r'\d+', line).group())
            # print(res)
            temp_list.append(res)
        if "Partial completable candidates size:" in line:
            res = int(re.search(r'\d+', line).group())
            temp_list.append(res)
    list_of_benchmarks.append(temp_list)

df = pd.DataFrame(list_of_benchmarks, columns=['Benchmark', 'Number of Completable Candidates', 'Number of Partial Completable Candidates'])

with pd.option_context('display.max_rows', None, 'display.max_columns', None):  # more options can be specified also
    print(df)
