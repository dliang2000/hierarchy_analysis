from xml.dom import minidom
import csv

xml_file = 'JACOCO_XML_REPORT'

xmldoc = minidom.parse(xml_file)

packagelist = xmldoc.getElementsByTagName('package')

untested_count = 0
tested_count = 0
to_store = []

for p in packagelist:
    classlist = p.getElementsByTagName('class')
    for cl in classlist:
        if "Test" in cl.attributes['name'].value:
            continue
        methodlist = cl.getElementsByTagName('method')
        for m in methodlist:
            counterlist = m.getElementsByTagName('counter')
            for counter in counterlist:
                if (counter.attributes['type'].value == 'METHOD') and (int(counter.attributes['missed'].value) > 0):
                    if "<init>" in m.attributes['name'].value:
                        continue
                    if "$" in cl.attributes['name'].value:
                        continue
                    untested_count = untested_count + 1
                    typelist = m.attributes['desc'].value.split(")")
                    parameterTypes = typelist[0].replace("(", "")
                    returnType = typelist[1]
                    temp_list = [p.attributes['name'].value.replace("/","."), cl.attributes['name'].value.replace("/","."), m.attributes['name'].value, m.attributes['desc'].value]
                    to_store.append(temp_list)
                    print(p.attributes['name'].value)
                    print(cl.attributes['name'].value)
                    print(m.attributes['name'].value)
                    print(m.attributes['desc'].value)
                elif (counter.attributes['type'].value == 'METHOD') and (int(counter.attributes['missed'].value) == 0):
                    if "<init>" in m.attributes['name'].value:
                        continue
                    if "$" in cl.attributes['name'].value:
                        continue
                    tested_count = tested_count + 1

print("Untested Methods: " + str(untested_count))
print("Tested Methods: " + str(tested_count))


with open('CSV_FILE', 'w', newline='') as outcsv:
    writer = csv.writer(outcsv, delimiter=',', quoting=csv.QUOTE_MINIMAL)
    writer.writerow(["Package", "Class", "Method Name", "Descriptor"])
    for obj in to_store:
        writer.writerow(obj)
