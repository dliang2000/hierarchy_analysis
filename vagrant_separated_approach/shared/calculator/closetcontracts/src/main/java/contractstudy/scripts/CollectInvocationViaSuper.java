package contractstudy.scripts;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.ModifierSet;
import com.github.javaparser.ast.expr.SuperExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import semverstudy.commons.Logging;
import contractstudy.Preferences;
import contractstudy.ProgramVersion;
import contractstudy.extractors.visitors.Utils;
import contractstudy.scripts.engine.ArtefactFactory;
import contractstudy.scripts.engine.Experiment;
import contractstudy.scripts.engine.ExperimentArtefact;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Analyse whether method invoke overridden methods via super.
 * Results will be written to a csv file.
 * @author jens dietrich
 */
public class CollectInvocationViaSuper implements Experiment {

    public static class SuperCallSite {
        ProgramVersion programVersion = null;
        String cu = null;
        String methodDecl = null;
        boolean isMethod = true; // constructor if false

        public SuperCallSite(ProgramVersion programVersion, String cu, String methodDecl,boolean isMethod) {
            this.programVersion = programVersion;
            this.cu = cu;
            this.methodDecl = methodDecl;
            this.isMethod = isMethod;
        }

        public static SuperCallSite fromCSV(String line) {
            String[] items = line.split("\t");
            ProgramVersion v = ProgramVersion.getOrCreate(items[0], items[1]);
            String cu = items[2];
            boolean isMethod = items[4].equals("method");
            String methodDec = items[3];

            return new SuperCallSite(v, cu, methodDec, isMethod);
        }

        public String getMethodDecl() {
            return methodDecl;
        }

        public String getCu() {
            return cu;
        }
    }

    static class MethodVisitor extends VoidVisitorAdapter<Object> {

        private List<SuperCallSite> superCallSites = null;
        private ProgramVersion programVersion = null;
        private String cuName = null;
        private String methodDeclaration = null;
        private boolean isMethod = true; // false = constructor
        private boolean includePrivateMethods = Preferences.includePrivateMethods();

        public MethodVisitor(
                List<SuperCallSite> superCallSites,
                ProgramVersion programVersion,
                String cuName
        ) {
            super();
            this.superCallSites = superCallSites;
            this.programVersion = programVersion;
            this.cuName = cuName;
        }

        // control the methods being visited
        @Override
        public void visit(MethodDeclaration methodDeclr, Object arg) {
            int modifiers = methodDeclr.getModifiers();
            if (includePrivateMethods || ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
                this.methodDeclaration = Utils.trimRetType(methodDeclr.getDeclarationAsString(false, false, false)); // flags: incl modifiers , incl throws
                this.isMethod = true;
                super.visit(methodDeclr, arg);
            }
        }

        @Override
        public void visit(ConstructorDeclaration constructorDeclr, Object arg) {
            int modifiers = constructorDeclr.getModifiers();
            if (includePrivateMethods || ModifierSet.isPublic(modifiers) || ModifierSet.isProtected(modifiers)) {
                this.methodDeclaration = constructorDeclr.getDeclarationAsString(false, false, false);
                this.isMethod = false;
                super.visit(constructorDeclr, arg);
            }
        }

        // this captures both methods (super.foo()) and constructors (super())
        @Override
        public void visit(SuperExpr n, Object arg) {
            SuperCallSite callsite = new SuperCallSite(programVersion,cuName,methodDeclaration,isMethod);
            superCallSites.add(callsite);
            super.visit(n, arg);
        }
    }

    private static Logger LOGGER = Logging.getLogger(CollectInvocationViaSuper.class);

    public static void main (String[] args) throws Exception {
        File DATA_FOLDER = new File(Preferences.getDataFolder());
        File OUTPUT_FOLDER = new File(Preferences.getOutputFolder());
        int THREAD_COUNT = Preferences.getThreadCount();
        FileUtils.forceMkdir(OUTPUT_FOLDER);
        File output = new File(Preferences.getOutputFolder(),"supercallsites.csv");

        Collection<File> zips = FileUtils.listFiles(DATA_FOLDER,new String[]{"zip"}, true);
        AtomicInteger counter = new AtomicInteger(0);
        List<SuperCallSite> superCallSites = Collections.synchronizedList(new ArrayList<>());

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        long startTime = System.currentTimeMillis();

        for (File f:zips) {
            ProgramVersion pv = ProgramVersion.getOrCreateFromFile(f);
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
                                        new MethodVisitor(superCallSites, pv, name).visit(cu, null);
                                    } catch (Exception t) {
                                        // consumer.extractionExceptionEncountered("Cannot parse " + programName + "-" + version + "/" + cuName,t);
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
        LOGGER.info("Analysis done, exporting results to  " + output.getAbsolutePath());
        LOGGER.info("\tSuper call sites found:  " + superCallSites.size());

        char SEP = '\t';
        try (PrintWriter out = new PrintWriter(new FileWriter(output))) {
            out.println("prg. name,prg. version,cu,kind");
            for (SuperCallSite scs:superCallSites) {
                out.print(scs.programVersion.getName());
                out.print(SEP);
                out.print(scs.programVersion.getVersion());
                out.print(SEP);
                out.print(scs.cu);
                out.print(SEP);
                out.print(scs.methodDecl);
                out.print(SEP);
                out.print(scs.isMethod?"method":"constructor");
                out.println();
            }
        }
        long endTime = System.currentTimeMillis();
        LOGGER.info("Done");
        LOGGER.info("\ttime: " + (endTime-startTime) + " ms");

    }


    @Override
    public void invoke() throws Exception {
        if (provides().exists()) {
            LOGGER.info("Skipping already performed experiment: " + provides().getName());

            return;
        }
        CollectInvocationViaSuper.main(new String[] {});
    }

    @Override
    public ExperimentArtefact[] requires() {
        return new ExperimentArtefact[] {
                ArtefactFactory.inputSrcZipFiles()
        };
    }

    @Override
    public ExperimentArtefact provides() {
        return ArtefactFactory.superCalls();
    }
}
