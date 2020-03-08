import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.revapi.*;
import org.revapi.java.JavaApiAnalyzer;
import org.revapi.simple.FileArchive;

import semverstudy.commons.Downloader;
import semverstudy.commons.Project;
import semverstudy.commons.ProjectParser;
import semverstudy.commons.ProjectVersion;

public class Main {

	public static void main(String[] args) throws Exception {
		// Read project spec file
		File projectSpecs = new File(args[0]);
        Project[] projects = ProjectParser.parseProjects(projectSpecs);
        //
		for (Project project : projects) {
			ProjectVersion[] versions = project.getVersions();
			File previousVersionBinary = null;
			for (int i = 0; i < versions.length; ++i) {
				ProjectVersion version = versions[i];
				if(version.getBinary() == null || version.getBinary().equals("")) {
					break;
				}
				File currentVersionBinary = Downloader.download(version.getBinary());
				if(previousVersionBinary != null) {
					analyse(previousVersionBinary,currentVersionBinary);
				}
				previousVersionBinary = currentVersionBinary;
			}
		}
	}

	public static void analyse(File oldFile, File newFile) {
		Archive oldjar = new FileArchive(oldFile);
		Archive newjar = new FileArchive(newFile);
		API oldAPI = API.of(oldjar).build();
		API newAPI = API.of(newjar).build();
		// NOTE: its frustrating to do it like this, but I don't see any other way with
		// this API.
		Reporter.errorCount = 0;
		Revapi revapi = Revapi.builder().withAnalyzers(JavaApiAnalyzer.class).withReporters(Reporter.class).build();

		AnalysisContext.Builder builder = AnalysisContext.builder()
		    .withOldAPI(oldAPI)
		    .withNewAPI(newAPI);

		AnalysisResult result = revapi.analyze(builder.build());
		System.out.println("BEFORE: " + oldFile);
		System.out.println(" AFTER: " + newFile);
		System.out.println(" DELTA: " + Reporter.errorCount);
	}

	public static class Reporter implements org.revapi.Reporter {
		private static int errorCount;

		public int getErrorCount() {
			return errorCount;
		}

		@Override
		public void close() throws Exception {
		}

		@Override
		public String getExtensionId() {
			return "reporter";
		}

		@Override
		public Reader getJSONSchema() {
			return null;
		}

		@Override
		public void initialize(AnalysisContext analysisContext) {
		}

		@Override
		public void report(Report report) {
			List<Difference> differences = report.getDifferences();
			for(Difference d : differences) {
				DifferenceSeverity binary = d.classification.get(CompatibilityType.BINARY);
				DifferenceSeverity source = d.classification.get(CompatibilityType.SOURCE);
				DifferenceSeverity semantic = d.classification.get(CompatibilityType.SEMANTIC);
				DifferenceSeverity other = d.classification.get(CompatibilityType.OTHER);
				DifferenceSeverity lub = merge(binary,source,semantic,other);
				// Only consider breaking or potentially breaking changes
				if(lub == DifferenceSeverity.BREAKING || lub == DifferenceSeverity.POTENTIALLY_BREAKING) {
					errorCount++;
//					System.out.println("NAME: " + d.name);
//					System.out.println("DESCRIPTION: " + d.description);
				}
			}
		}

		private DifferenceSeverity merge(DifferenceSeverity... items) {
			for(DifferenceSeverity d : items) {
				if(d == DifferenceSeverity.BREAKING) {
					return d;
				}
			}
			for(DifferenceSeverity d : items) {
				if(d == DifferenceSeverity.POTENTIALLY_BREAKING) {
					return d;
				}
			}
			// Ignore others
			return DifferenceSeverity.NON_BREAKING;
		}
	}
}

