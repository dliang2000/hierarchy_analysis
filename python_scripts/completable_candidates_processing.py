import os
import glob

for file in glob.glob("/home/daveroar/Graduation_Studies/ThesisWork/JRefactoring/hierarchy-analysis/bin/*.sh"):
    stream = os.popen(file)
    output = stream.read()
    print(output)
