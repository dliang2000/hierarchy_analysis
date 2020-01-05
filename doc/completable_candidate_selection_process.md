## Current Process of Selecting the Candidates for Horizontal Completable Hierarchy Condition.

1. Run the coverage JUnit test for the benchmark project. 
**Steps**: Right click the benchmark in eclipse, then hover over "Coverage As", then click "JUnit Test".
 
2. After the coverage test is completed, export the results as a .csv file. 
**Steps**: -- Right click the benchmark in eclipse, select "Export". 
-- In the wizard, select "Run/Debug", choose "Coverage Session", and click "Next". 
-- Pick the session just ran, and then choose "CSV File" as format and choose the destination where you want the csv file to be stored.

3. Update the path in coverage\_test\_csv\_script.ipynb to where the exported csv file is located. 
Run coverage\_test\_csv\_script.ipynb. A new csv file containing only the classes with METHOD_MISSED > 0 is produced in this step.

4. Run the Main.java file with program arguments "-process-dir ." (A bash script will be included shortly). 
Currently, candidates are selected with the following process:
-- For class c with METHOD_MISSED > 0, find its direct superclass. The direct superclass is stored in a hashmap as the key, with the value updated.
-- Pick all the superclasses stored in the hashmap with value of 1, meaning the superclass only has one direct subclass that has missed method coverage.
-- Check if the superclass has more than one direct subclasses, if so, it is considered as a candidate.

Process to be added: Say method *m* is not tested for class *c*, check CallGraph to make sure *m* is declared in class *s*, which is class *c*'s direct superclass, and implemented in all of the direct subclasses of *s*