package contractstudy.hierarchy;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import contractstudy.ProgramVersion;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Kamil Jezek [kamil.jezek@verifalabs.com]
 */
public class ProjectVersionHierarchyExtractor {

    private ProjectClassExtractor classExtractor = new ProjectClassExtractor();

    private ClassFinderCreator globalCreator = new ClassFinderCreator();

    public ProjectVersionHierarchyExtractor addGlobal(
            ProgramVersion projectVersion,
            final InheritanceResolved notifier) throws Exception {

        analyse(projectVersion, new ArrayList<>(), globalCreator, notifier);

        return this;
    }

    /**
     * Analyse hierarchy
     *
     * @param projectVersion project to analyse
     * @param dependencies   all dependencies
     * @param notifier       notifier about resolved inheritance.
     * @throws Exception error
     */
    public void analyse(
            final ProgramVersion projectVersion,
            final List<ProgramVersion> dependencies,
            final InheritanceResolved notifier) throws Exception {

        ClassFinderCreator creator = new ClassFinderCreator(globalCreator);
        analyse(projectVersion, dependencies, creator, notifier);
    }

    private void analyse(
            final ProgramVersion projectVersion,
            final List<ProgramVersion> dependencies,
            final ClassFinderCreator creator,
            final InheritanceResolved notifier) throws Exception {


        // fill-in classes map
        readClasses(projectVersion, creator, notifier);
        for (ProgramVersion programVersion : dependencies) {
            readClasses(programVersion, creator, notifier);
        }

        Set<String> parents = new HashSet<>();

        // resolve project file
        resolveInheritance(projectVersion, null, creator, notifier, parents);

        // recurse for upper inheritance in dependencies
        for (ProgramVersion programVersion : dependencies) {
            resolveInheritance(programVersion, parents, creator, notifier, parents);
        }
    }

    private void readClasses(
            final ProgramVersion programVersion,
            final ClassFinderCreator creator,
            final InheritanceResolved notifier) throws Exception {

        File file = programVersion.getFile();

        if (file.isDirectory()) {
            Collection<File> files = FileUtils.listFiles(file, new String[]{"java"}, true);
            for (File f : files) {
                try (InputStream in = new FileInputStream(f)) {
                    CompilationUnit cu = JavaParser.parse(in);
                    ClassCoordinates classCoordinates = classExtractor.readClass(cu, f.getName());
                    creator.add(programVersion, classCoordinates, cu, file.getName());
                    notifier.notify(classCoordinates);
                }
            }
        } else {
            try (ZipFile zip = new ZipFile(file);) {
                Enumeration<? extends ZipEntry> en = zip.entries();
                while (en.hasMoreElements()) {
                    ZipEntry e = en.nextElement();
                    String name = e.getName();
                    if (name.endsWith(".java")) {
                        try (InputStream in = zip.getInputStream(e)) {
                            CompilationUnit cu = JavaParser.parse(in);
                            ClassCoordinates classCoordinates = classExtractor.readClass(cu, name);
                            // coordinates are null for invalid classes (e.g. a .java class which does not contain java source-code)
                            if (classCoordinates.getClassSimpleName() != null) {
                                creator.add(programVersion, classCoordinates, cu, name);
                                notifier.notify(classCoordinates);
                            }
                        }
                    }
                }
            }
        }

    }

    private void resolveInheritance(
            final ProgramVersion programVersion,
            final Set<String> classNameFilter,
            final ClassFinderCreator creator,
            final InheritanceResolved notifier,
            final Set<String> allParents) throws Exception {

        ClassFinder classFinder = creator.toFinder();
        Map<ClassCoordinates, CompilationUnit> units = creator.getCus().column(programVersion);

        for (ClassCoordinates classCoordinates : units.keySet()) {
            String className = classCoordinates.getClassName();

            // filter only classes we are interested in
            if (classNameFilter == null || classNameFilter.contains(className)) {
                CompilationUnit cu = units.get(classCoordinates);
                ClassParents parents = classExtractor.readInheritance(cu, classCoordinates.getCuName(), classFinder);
                notifyParents(parents, notifier, allParents);
            }
        }

    }

    private void notifyParents(
            final ClassParents classParents,
            final InheritanceResolved notifier,
            final Set<String> allParents) {

        notifier.notify(classParents);

        String className = classParents.getClassName();
        Set<ClassAndVersion> parents = classParents.getParents(className);
        for (ClassAndVersion parent : parents) {
            allParents.add(parent.getClassName());
        }

        // structure of inner classes is flat for now
        for (ClassCoordinates innerClass : classParents.getInnerClasses()) {
            Set<ClassAndVersion> innerParents = classParents.getParents(innerClass.getClassName());
            for (ClassAndVersion parent : innerParents) {
                allParents.add(parent.getClassName());
            }
        }
    }

}
