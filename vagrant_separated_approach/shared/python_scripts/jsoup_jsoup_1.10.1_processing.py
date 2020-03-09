from xml.dom import minidom
import csv

xml_file = '/home/vagrant/benchmarks/jsoup-jsoup-1.10.1/jsoup_jsoup_1.10.1_coverage.xml'

xmldoc = minidom.parse(xml_file)

packagelist = xmldoc.getElementsByTagName('package')
print(len(packagelist))

count = 0
to_store = []

for p in packagelist:
    classlist = p.getElementsByTagName('class')
    for cl in classlist:
        methodlist = cl.getElementsByTagName('method')
        for m in methodlist:
            counterlist = m.getElementsByTagName('counter')
            for counter in counterlist:
                if (counter.attributes['type'].value == 'METHOD') and (int(counter.attributes['missed'].value) > 0):
                    if "<init>" in m.attributes['name'].value:
                        continue
                    if "$" in cl.attributes['name'].value:
                        continue
                    count = count + 1
                    typelist = m.attributes['desc'].value.split(")")
                    parameterTypes = typelist[0].replace("(", "")
                    returnType = typelist[1]
                    temp_list = [p.attributes['name'].value.replace("/","."), cl.attributes['name'].value.replace("/","."), m.attributes['name'].value, m.attributes['desc'].value]
                    to_store.append(temp_list)
                    print(p.attributes['name'].value)
                    print(cl.attributes['name'].value)
                    print(m.attributes['name'].value)
                    print(m.attributes['desc'].value)

print(count)

with open('/home/vagrant/benchmarks/csv/jsoup_jsoup_1.10.1_missing_methods.csv', 'w', newline='') as outcsv:
    writer = csv.writer(outcsv, delimiter=',', quoting=csv.QUOTE_MINIMAL)
    writer.writerow(["Package", "Class", "Method Name", "Descriptor"])
    for obj in to_store:
        writer.writerow(obj)
