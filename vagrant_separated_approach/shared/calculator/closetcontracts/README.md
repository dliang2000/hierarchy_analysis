#Closet Contract Compatibility Analysis

This folder contains compatibility analysis between adjacent versions of projects using the Maven standard layout, using the AST-based analysis to extract contracts in code as discussed in [Dietrich, Jens, David J. Pearce, Kamil Jezek, and Premek Brada. "Contracts in the wild: A study of java programs" In Proc. ECOOP 2017](https://drops.dagstuhl.de/opus/volltexte/2017/7259/pdf/LIPIcs-ECOOP-2017-9.pdf). 
The project can be built with Maven (`mvn package`), and to collect all project dependencies, run `mvn dependency:copy-dependencies`. Then run:

`java -cp target/classes:target/dependencies/* semverstudy.closetcontracts.CompatibilityAnalysis <project-specs> <output>`  with java 8 or better.
 
The two parameters are (1) `<project-specs>` the location of the json file containing the specs of the projects and project versions to be analysed and (2) `<output>` -- the name of the csv file to which results are written.

