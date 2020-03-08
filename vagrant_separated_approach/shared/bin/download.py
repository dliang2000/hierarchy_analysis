# experimental unused python code for running on json
import json

with open('projects.json') as f:
    benchmarks = json.load(f)
    for b in benchmarks:
        for v in b["versions"]:
            print (v["source"])
