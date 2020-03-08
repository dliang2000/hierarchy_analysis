package semverstudy.closetcontracts;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import contractstudy.*;
import contractstudy.diffrules.*;
import contractstudy.extractors.*;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import semverstudy.commons.*;
import semverstudy.commons.Downloader;
import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Compatibility analysis for project versions, as defined in the jspn spec.
 * @author jens dietrich
 */
public class CompatibilityAnalysis {

    public static final Extractor[] EXTRACTORS = {
            new JSR303Extractor(),
            new JSR305Extractor(),
            new JSR305ConcurrentExtractor(),
            new FindBugsAnnotationExtractor(),
            new JetBrainsExtractor(),
            new IntellijExtractor(),
            new JavaAssertExtractor(),
            new ConditionalRuntimeExceptionExtractor(),
            new UnconditionalOperationNotSupportedExceptionExtractor(),
            new GuavaPreconditionsExtractor(),
            new CommonsValidate2Extractor(),
            new CommonsValidate3Extractor(),
            new SpringAssertExtractor()
    };

    public static final Logger LOGGER = Logging.getLogger("closetcontract-analysis");

    public static void main (String[] args) throws Exception {

        Preconditions.checkArgument(args.length == 2, "two argument is required - the json file describing projects to be analysed and the output file (in this order)");
        File projectSpecs = new File(args[0]);
        Preconditions.checkArgument(projectSpecs.exists(), "file containing project specs does not exist: " + projectSpecs.getAbsolutePath());

        Project[] projects = ProjectParser.parseProjects(projectSpecs);
        LOGGER.info("" + projects.length + " projects found");

        File output = new File(args[1]);
        List<String> records = new ArrayList<>();

        ResultListener reporter = new ResultListener() {
            @Override
            public void resultFound(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, String issue, String detail) {
                LOGGER.info("Incompatible change for in project " + project.getName());
                LOGGER.info("\tversion 1: " + projectVersion1.getVersion());
                LOGGER.info("\tversion 2: " + projectVersion2.getVersion());
                LOGGER.info("\tlocation: " + location);
                LOGGER.info("\tviolation: " + issue);
                LOGGER.info("\tdetail: " + detail);

                records.add(""+project.getName()+"-"+projectVersion1.getVersion()+","+project.getName()+"-"+projectVersion2.getVersion()+","+issue+",+1");
            }
        };
        analyse(projects, reporter);

        FileUtils.writeLines(output,records);
        LOGGER.info("Results written to " + output.getAbsolutePath());
    }

    // public to make this testable
    public static void analyse(Project[] projects, ResultListener reporter) throws Exception {

        int total = (int)Stream.of(projects).flatMap(p -> Stream.of(p.getVersions())).count();
        AtomicInteger progressCounter = new AtomicInteger(0);
        long startTime = System.currentTimeMillis();
        for (Project project:projects) {
            LOGGER.info("Analysing project " + project.getName());
            AtomicInteger constraintCounter = new AtomicInteger(0);
            AtomicInteger parsedCUCounter = new AtomicInteger(0);
            AtomicInteger parserFailedCUCounter = new AtomicInteger(0);
            AtomicInteger parsedProgramVersionCounter = new AtomicInteger(0);
            List<ContractElement> contractsOfPreviousVersion = null;
            ProjectVersion previousVersion = null;
            // NOTE: VERSIONS ARE PROCESSED AND DIFFED IN THE ORDER AS DEFINED IN THE JSON FILE
            for (ProjectVersion projectVersion : project.getVersions()) {
                parsedProgramVersionCounter.incrementAndGet();
                LOGGER.info("Analysing project version " + project.getName() + " - "+ projectVersion.getVersion());
                File projectVersionFolder = Downloader.download(projectVersion.getSource());
                ConstraintCollector collector = new ConstraintCollector() {
                    @Override
                    public void extractionExceptionEncountered(String message, Throwable x) {
                        super.extractionExceptionEncountered(message, x);
                        parserFailedCUCounter.incrementAndGet();
                    }
                };
                findContractElementsinProject(projectVersionFolder, collector, project.getName(), "foo-version", parsedCUCounter);
                System.out.println("Processed " + progressCounter.incrementAndGet() + "/" + total + ": " + projectVersionFolder.getAbsolutePath() + " -- " + collector.getContractElements().size() + " contracts found");
                constraintCounter.addAndGet(collector.getContractElements().size());

                List<ContractElement> contracts = collector.getContractElements();
                if (contractsOfPreviousVersion!=null) {
                    diffAndReport(project,previousVersion,projectVersion,contractsOfPreviousVersion,contracts,reporter);
                }
                previousVersion = projectVersion;
                contractsOfPreviousVersion = contracts;
            }
        }

        long endTime = System.currentTimeMillis();

        LOGGER.info("Analysis finished");
        LOGGER.info("\ttime: " + (endTime-startTime) + " ms");
        //        LOGGER.info("\tchecked CUs: " + parsedCUCounter.intValue());
        //        LOGGER.info("\tCUs where parsing failed: " + parserFailedCUCounter.intValue());
        //        LOGGER.info("\tprogram versions checked: " + parsedProgramVersionCounter.intValue());
        //        LOGGER.info("\tcontracts found: " + constraintCounter.intValue());
    }

    private static void diffAndReport(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, List<ContractElement> contracts1, List<ContractElement> contracts2,ResultListener reporter) {

        // index contracts, keys are combinations of cu name, method name and signature
        Multimap<String, ContractElement> indexedContracts1 = indexContracts(contracts1);
        Multimap<String, ContractElement> indexedContracts2 = indexContracts(contracts2);

        Set<String> locations = Sets.union(indexedContracts1.keySet(),indexedContracts2.keySet());
        for (String location:locations) {
            Collection<ContractElement> contractsAtLocation1 = indexedContracts1.get(location);
            if (contractsAtLocation1==null) contractsAtLocation1 = Collections.EMPTY_SET;
            Collection<ContractElement> contractsAtLocation2 = indexedContracts2.get(location);
            if (contractsAtLocation2==null) contractsAtLocation2 = Collections.EMPTY_SET;

            // apply rules
            checkForRemovedPostconditions(project,projectVersion1,projectVersion2,location,contractsAtLocation1,contractsAtLocation2,reporter);
            checkForAddedPreconditions(project,projectVersion1,projectVersion2,location,contractsAtLocation1,contractsAtLocation2,reporter);
        }
    }

    private static void checkForRemovedPostconditions(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, Collection<ContractElement> contractsAtLocation1, Collection<ContractElement> contractsAtLocation2,ResultListener reporter) {
        Collection<ContractElement> postConditions1 = contractsAtLocation1.stream().filter(ce -> ce.getClassification()==ConstraintClassification.POSTCONDITION).collect(Collectors.toSet());
        Collection<ContractElement> postConditions2 = contractsAtLocation2.stream().filter(ce -> ce.getClassification()==ConstraintClassification.POSTCONDITION).collect(Collectors.toSet());

        for (ContractElement pc1:postConditions1) {
            boolean match = postConditions2.stream().anyMatch(pc2 -> Utils.unchanged(pc1,pc2,true));
            if (!match) {
                reporter.resultFound(project,projectVersion1,projectVersion2,location,"closetcontracts-postcondition-removed",pc1.toString());
            }
        }
    }

    private static void checkForAddedPreconditions(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, Collection<ContractElement> contractsAtLocation1, Collection<ContractElement> contractsAtLocation2,ResultListener reporter) {
        Collection<ContractElement> preConditions1 = contractsAtLocation1.stream().filter(ce -> ce.getClassification()==ConstraintClassification.PRECONDITION).collect(Collectors.toSet());
        Collection<ContractElement> preConditions2 = contractsAtLocation2.stream().filter(ce -> ce.getClassification()==ConstraintClassification.PRECONDITION).collect(Collectors.toSet());

        for (ContractElement pc2:preConditions2) {
            boolean match = preConditions1.stream().anyMatch(pc1 -> Utils.unchanged(pc1,pc2,true));
            if (!match) {
                reporter.resultFound(project,projectVersion1,projectVersion2,location,"closetcontracts-precondition-added",pc2.toString());
            }
        }
    }

    private static void reportChange(Project project, ProjectVersion projectVersion1, ProjectVersion projectVersion2, String location, String violationType, String detail,ResultListener reporter) {

        System.out.println("Incompatible change for in project " + project);
        System.out.println("\tversion 1: " + projectVersion1.getVersion());
        System.out.println("\tversion 2: " + projectVersion2.getVersion());
        System.out.println("\tlocation: " + location);
        System.out.println("\tviolation: " + violationType);
        System.out.println("\tdetail: " + detail);
    }

    private static Multimap<String, ContractElement> indexContracts(List<ContractElement> contracts) {
        Multimap<String, ContractElement> indexedContracts = HashMultimap.create();
        for (ContractElement contractElement:contracts) {
            String key = contractElement.getCuName();
            if (contractElement.getConstraintedArtefact()==ConstraintedArtefact.METHOD || contractElement.getConstraintedArtefact()==ConstraintedArtefact.METHOD_PARAMETER) {
                key = key + "::" + contractElement.getMethodDeclaration();
            }
            indexedContracts.put(key,contractElement);
        }
        return indexedContracts;
    }


    @SuppressWarnings("unchecked")
    private static void findContractElementsinProject(File project, ExtractionListener<ContractElement> consumer, String programName, String version, AtomicInteger parsedCUCounter) throws Exception {

        FileVisitor<Path> visitor = new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (ProjectTraversalFilters.IS_PROGRAM_SOURCE.test(file)) {
                    findContractElementInSrcFile(file,consumer, programName, version, parsedCUCounter);
                }
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                return FileVisitResult.CONTINUE;
            }
        };

        Files.walkFileTree(project.toPath(), visitor);
    }

    private static void findContractElementInSrcFile(Path javaSrc, ExtractionListener<ContractElement> consumer, String programName, String version, AtomicInteger parsedCUCounter) {

        String cuName = ProjectTraversalFilters.getProgramCUName(javaSrc);
        for (Extractor<ContractElement> extractor:EXTRACTORS) {
            try (FileInputStream in = new FileInputStream(javaSrc.toFile())) {
                extractor.analyse(in, programName, version, cuName, consumer);
            }
            catch (Exception x) {
                x.printStackTrace();
            }
        }
    }

}
