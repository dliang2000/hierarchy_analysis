package contractstudy.scripts;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ModifierSet;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.google.common.base.Preconditions;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static contractstudy.diffrules.Utils.NF;


/**
 * Script used to collect some stats about the dataset being used.
 * @author jens dietrich
 */
public class CollectDataSetStats  implements Experiment {

    // data keys
    public static final String PUBLIC_METHODS = "public and protected methods";
    public static final String PUBLIC_CONSTRUCTORS = "public and protected constructors";
    public static final String COMPILATION_UNITS = "compilation units";
    public static final String COMPILATION_UNITS_PARSING_FAILED = "compilation units (parsing failed)";
    public static final String CLASSES = "classes";
    public static final String ALL_METHODS = "methods";
    public static final String ALL_CONSTRUCTORS = "constructors";
    public static final String PROGRAMS = "programs";
    public static final String VERSIONS = "versions";
    public static final String LOC = "lines of code";

    static class DataCollectionVisitor extends VoidVisitorAdapter<Object> {

        private Map<String,Integer> data = null;

        public DataCollectionVisitor(Map<String,Integer> data) {
            super();
            this.data = data;
        }

        // control the methods being visited
        @Override
        public void visit(MethodDeclaration methodDeclr, Object arg) {
            int modifiers = methodDeclr.getModifiers();
            if (ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
                data.compute(PUBLIC_METHODS,(k,v)->v==null?1:v+1);
            }
            data.compute(ALL_METHODS,(k,v)->v==null?1:v+1);
            super.visit(methodDeclr,arg);
        }

        @Override
        public void visit(ConstructorDeclaration constructorDeclr, Object arg) {
            int modifiers = constructorDeclr.getModifiers();
            if (ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
                data.compute(PUBLIC_CONSTRUCTORS,(k,v)->v==null?1:v+1);
            }
            data.compute(ALL_CONSTRUCTORS,(k,v)->v==null?1:v+1);
            super.visit(constructorDeclr,arg);
        }

        @Override
        public void visit(ClassOrInterfaceDeclaration n, Object arg) {
            super.visit(n, arg);
            data.compute(CLASSES,(k,v)->v==null?1:v+1);
        }
    }

    private static Logger LOGGER = Logging.getLogger(CollectDataSetStats.class);

    public static void main (String[] args) throws Exception {


        File DATA_FOLDER = new File(Preferences.getDataFolder());
        Preconditions.checkArgument(DATA_FOLDER.exists(),"Cannot find data in " + DATA_FOLDER.getAbsolutePath());

        int THREAD_COUNT = Preferences.getThreadCount();
        File RESULTS_FOLDER = new File(Preferences.getResultsFolder());

        Map<String,Integer> data = new ConcurrentHashMap<>();
        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        Set<String> seenPrograms = Collections.synchronizedSet(new HashSet<>());

        AtomicInteger counter = new AtomicInteger(0);

        List<String> errorCuNames = Collections.synchronizedList(new ArrayList<>());

        for (File f:zips) {

            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
            String programName = pv.getName();

            if (seenPrograms.add(programName)) {
                data.compute(PROGRAMS,(k,v)->v==null?1:v+1);
                // debug only !!
                System.out.println("Found new program " + programName);
            }
            data.compute(VERSIONS,(k,v)->v==null?1:v+1);

            Runnable task = new Runnable() {
                @Override
                public void run() {
                    try {
                        LOGGER.info("Analysing " + counter.incrementAndGet() + "/" + zips.size() + " - " + f.getName());
                        ZipFile zip = new ZipFile(f);
                        Enumeration<? extends ZipEntry> en = zip.entries();
                        while (en.hasMoreElements()) {
                            ZipEntry e = en.nextElement();
                            String name = e.getName();
                            if (name.endsWith(".java")) {
                                try (InputStream in = zip.getInputStream(e)) {
                                    try {
                                        CompilationUnit cu = JavaParser.parse(in);
                                        data.compute(COMPILATION_UNITS,(k,v)->v==null?1:v+1);
                                        int size = cu.getEnd().line - cu.getBegin().line;
                                        data.compute(LOC,(k,v)->v==null?size:v+size);
                                        new DataCollectionVisitor(data).visit(cu, null);
                                    } catch (Exception t) {
                                        // consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
                                        data.compute(COMPILATION_UNITS_PARSING_FAILED,(k,v)->v==null?1:v+1);
                                        errorCuNames.add(zip.getName() + ", " + name + ", Error: " + t.getMessage());
                                    }
                                }

                            }
                        }
                    }
                    catch (Exception e) {
                        // log errors and continue with next files
                        LOGGER.warn("Cannot parse file: " + f, e);
                    }
                }
            };
            executor.submit(task);
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.DAYS);

        // print stats
        LOGGER.info("Analysis finished, printing stats");
        LOGGER.info("Details written to " + RESULTS_FOLDER.getAbsolutePath());
        for (Map.Entry<String,Integer> entry:data.entrySet()) {
            LOGGER.info(""+ entry.getKey() + " : " + entry.getValue());
        }

        LOGGER.info("Rendering output to latex");
        File latex = new File(RESULTS_FOLDER,"dataset.tex");
        try (PrintStream out = new PrintStream(new FileOutputStream(latex))) {
            out.println("% TABLE GENERATED BY " + CollectDataSetStats.class.getName());
            out.println("% TIMESTAMP:   " + new Date());
            out.println("\\begin{table}[]");
            out.println("\\centering");
            out.println("\\caption{Data set metrics }");
            out.println("\\label{tab:data-metrics}");
            out.println("\\begin{tabular}{|l|l|} \\hline");
            out.println("   metric & value  \\\\ \\hline");
            out.println("   programs & " + NF.format(data.get(PROGRAMS)) + "  \\\\");
            out.println("   program versions & " + NF.format(data.get(VERSIONS)) + "  \\\\");
            out.println("   compilation units & " + NF.format(data.get(COMPILATION_UNITS)) + "  \\\\");
            out.println("   unparsable compilation units & " + NF.format(data.get(COMPILATION_UNITS_PARSING_FAILED)) + "  \\\\");
            out.println("   \\hline");
            out.println("   classes & " + NF.format(data.get(CLASSES)) + "  \\\\");
            out.println("   methods (all)& " + NF.format(data.get(ALL_METHODS)) + "  \\\\");
            out.println("   constructors (all)& " + NF.format(data.get(ALL_CONSTRUCTORS)) + "  \\\\");
            out.println("   methods (public and protected) & " + NF.format(data.get(PUBLIC_METHODS)) + "  \\\\");
            out.println("   constructors (public and protected) & " + NF.format(data.get(PUBLIC_CONSTRUCTORS)) + "  \\\\");
            out.println("   KLOC incl comments& " + NF.format(data.get(LOC)/1000) + "  \\\\ \\hline");

//            out.println("   public and protected methods & " + data.get(PUBLIC_METHODS) + "  \\\\");
//            out.println("   preconditions added & yes & " + stats.get(DiffResult.PRECONDITION_ADDED) + "  \\\\");
//            out.println("   postconditions removed & yes & " + stats.get(DiffResult.POSTCONDITION_REMOVED) + "  \\\\ \\hline");
//            out.println("   unclassified & ? & " + stats.get(DiffResult.CANNOT_BE_CLASSIFIED) + "  \\\\ \\hline");
            out.println("\\end{tabular}");
            out.println("\\end{table}");
        }
        LOGGER.info("Latex table with results created at " + latex.getAbsolutePath());

        File dataSetErrors = new File(RESULTS_FOLDER,"dataset.errors");
        Collections.sort(errorCuNames);
        IOUtils.writeLines(errorCuNames, "\n", new FileOutputStream(dataSetErrors), Charset.forName("utf-8"));
    }



    @Override
    public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
        CollectDataSetStats.main(new String[] {});
    }

    @Override
    public ExperimentArtefact[] requires() {
        return new ExperimentArtefact[] {
                ArtefactFactory.inputSrcZipFiles()
        };
    }

    @Override
    public ExperimentArtefact provides() {
        return ArtefactFactory.datasetStatistics();
    }

}
