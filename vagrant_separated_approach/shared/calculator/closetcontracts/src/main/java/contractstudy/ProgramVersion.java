package contractstudy;

import org.apache.log4j.Logger;
import semverstudy.commons.Logging;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A pair consisting of a program and a version.
 * @author jens dietrich, premek brada
 */
public class ProgramVersion implements Comparable<ProgramVersion>{
	private String name = null;
	private String version = null;
	private File file = null;
	private ProgramVersion nextVersion = null;
    private ProgramVersion previousVersion = null;

	private static Map<String,ProgramVersion> registry = new HashMap<>();

	static Logger LOGGER = Logging.getLogger(ProgramVersion.class);

	public ProgramVersion(final String name, final String version, final File file) {
		this.name = name;
		this.version = version;
		this.file = file;
	}

	public static ProgramVersion getOrCreate(final String name, final String version) {
		String key = name+"-"+version;
		return registry.computeIfAbsent(key, k -> new ProgramVersion(name,version, null));
	}
	
	/**
	 * Creates the programname-version pair from the path to the given (artefact) file, 
	 * assuming that the file is placed in a folder named <programname>.
	 * @param f
	 * @return
	 */
	public static ProgramVersion getOrCreateFromFile(File f) {
        String contextName = f.getName().substring(0, f.getName().lastIndexOf('.'));
        String programName = f.getParentFile().getName();
        String version = contextName.replaceFirst(programName+"-", "");
        ProgramVersion pv = ProgramVersion.getOrCreate(programName,version);
        pv.withFile(f);
        return pv;
	}

	public ProgramVersion withFile(final File file) {
		this.file = file;
		return this;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ProgramVersion getNextVersion() {
		return nextVersion;
	}
	public void setNextVersion(ProgramVersion nextVersion) {
		this.nextVersion = nextVersion;
	}
    public ProgramVersion getPreviousVersion() {
        return previousVersion;
    }
    public void setPreviousVersion(ProgramVersion previousVersion) {
        this.previousVersion = previousVersion;
    }

	public File getFile() {
		return file;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgramVersion other = (ProgramVersion) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return name + "-" + version;
	}

	/**
	 * Version patterns: current -> successor
	 *
	 * * regular:  angular-1.4.1 -> angular-1.4.2
	 * * numeric:  angular-1.2.9 -> angular-1.2.16
	 * * dropped micro:  easymock-2.5 -> easymock-2.5.1
	 * * alphanumeric component:  jetty-6.1H.4 , guava-r09 (-> guava-10.0.x) , scalatest_2.10-2.0.M5b , scalatest_2.10-1.9.2-SNAP2 , cglib-2.1_2
	 * * status in last segment:  jetty-6.0.0beta2 , android-1.5_r3 , asm-5.0_ALPHA
	 * * status as build:  jetty-6.1.12.rc2 , jline-3.0.0.M1 , javassist-3.12.0.SP1 , scalatest_2.10-2.0.M8 , elasticsearch-0.19.0.RC1
	 * * datetime:  json-20070829 -> json-20080701
	 * * multi-level:  scalatest_2.11-2.1.3 -> scalatest_2.11-2.1.4
	 *
	 * Assumptions / rules:
	 *
	 * * version segment starts after last "-" in artefact identifier
	 * * version starts with numeric field, "api" in "slf4j-api" is not a version identifier
	 * * dropped micro means zero: "easymock-2.5" == "easymock-2.5.0"
	 * * status may (not) be separated: "jetty-6.1.26RC0" == "jetty-6.1.26rc0" == "jetty-6.1.26.rc0"
	 * * status id order: "alpha" < "beta" | "pre" | "m" < "rc" < no-status | "ga" | "final" < "sp" | "sec"
	 *
	 * Troublemakers: put on a blacklist (generated into a file) those which will not fit patterns based on the assumptions/rules above
	 *
	 * * variant designators:  postgresql-9.4.1207 <-> postgresql-9.4.1207.jre6 <-> postgresql-9.4.1207.jre7 , jetty-6.1.x <-> jetty-6.1H.x
	 *   => "jre" and "1H" mean "go to blacklist" unconditionally
	 *   (jetty "H" variants contain code with rejected patches, i.e. things which probably are not available anyway)
	 * * several successors: e.g. javassist "-3.12.x" line:
	 *     time-dimension: 12.0.GA < 12.1.GA < 12.0.SP1
	 *     succ-dimension: 12.0.GA predecessor to both "12.0.SP1" and "12.1.GA"
	 *   => "sp", "sec" accepted after discussion, lattice/acyclic graph is OK for pairwise comparison
	 * * jetty, scalatest-2.10 -- highly diverse and disordered use of version identifiers
	 *   => put on blacklist those which don't fit a pattern
	 * * guava -- until version 9 pattern "guava-r09" then "guava-10.0"
	 *   => put on blacklist if don't fit a pattern
	 *
	 */
	@Override
	public int compareTo(ProgramVersion pv) {
		int diff = this.getName().compareTo(pv.getName());
		if (diff==0) {
				diff = this.getSanitizedVersion().compareTo(pv.getSanitizedVersion());
			}
		return diff;
	}


	/**
	 * Cleans up version string, so it can be used for comparison using simple string.compareTo(). For date/time-stamp, do nothing,
	 * for other formats, try to convert to semantic version (major.minor.micro.qualifier) and return as string.  If conversion fails,
	 * returns the version string untouched, and hopes for the best with the caller...
	 *
	 * Examples of conversions:
	 * * 1.2.127 			-> 001.002.127.7zz
	 * * 2.9 				-> 002.009.000.7zz
	 * * netty-3.6.6.Final 	-> 003.006.006.7final
	 * * 7.0.0.pre4 		-> 007.000.000.3pre4
	 * * jetty-6.1.12rc1 	-> 006.001.012.5rc1
	 * * 9.4.1209.jre7 		-> ***fail*** (denotes variant)
	 *
	 * 1. Replace "_" and "-" with "." , convert to lowercase.
	 * 2. Convert to "M.m.u[.q]" format, or else reject. Set "m" and "u" to zero, "q" to empty if not specified.
	 * 3. Convert to string, with M,m,u 3-digit with leading zeroes and allowed qualifiers modified to induce ordering by status.
	 */
	public String getSanitizedVersion() {

		// which qualifiers we allow -- only those which denote revision ordering; all other ones (denoting variants/semantics) are blacklisted
		final String[] ALLOWED_QUALIFIERS = { "snap", "alpha", "beta", "pre", "m", "rc", "cr", "ga", "final", "release", "sec", "sp"} ;
		// this will provide ordering to the status-denoting qualifiers, based on analysis above
		final String[] REPLACE_QUALIFIERS = { "0snap", "1alpha", "3beta", "3pre", "3m", "5rc", "5cr", "7ga", "7final", "7release", "9sec", "9sp" };
		// replace "null" qualifier with this, so that final version comes after status-denoting "9*" ones
		final String   DEFAULT_FINAL_QUALIFIER = "7zz";
		final Pattern  VERS_TIMESTAMP = Pattern.compile("[1-2][0-9]{7}");
		// based on svn.terracotta.org/svn/tc/dso/tags/2.5.0/code/base/common/.../MavenToOSGi.java via google "java regexp for osgi version string"
		final Pattern  VERS_SEMVER     = Pattern.compile("^(\\d+)(?:\\.(\\d+)(?:\\.(\\d+))?)?(?:\\.(.*))?$");
		// for cases when qualifier is a date-stamp
		final Pattern  QUAL_DATE      = Pattern.compile("(v[1-2][0-9]{7})");
		// for cases when status is not separated: "jetty-6.1.26RC0" etc
		final Pattern  QUAL_MERGED     = Pattern.compile("(\\d+)(\\D[^\\.]*)");
		// cases like android-2.1_r1 where qualifier is actually a micro part
		final Pattern  QUAL_MICRO		= Pattern.compile("r?(\\d+)");
		// cases like jaxb-impl:2.2.7-b57 and jersey-json-1.4-ea01 where qualifier is (probably) beta version two-digit number
		final Pattern  QUAL_BETAnn		= Pattern.compile("(b|ea)(\\d\\d)");
		
		String versionString = this.getVersion();
		
		// trivial cases
		if (versionString == null)
			return this.getVersion();
		if ("".equals(versionString))
			return this.getVersion();

		// timestamp
		Matcher m = VERS_TIMESTAMP.matcher(versionString);
		if (m.matches())
			return this.getVersion();

		// normalize maven-vs-osgi qualifiers
		versionString = versionString.replace('_', '.').replace('-', '.').toLowerCase();

		// sanitize semver; code modified from stolen from svn.terracotta.org/svn/tc/dso/tags/2.5.0/code/base/common/.../MavenToOSGi.java
		m = VERS_SEMVER.matcher(versionString);
		if (m.matches()) {
			// process correct maven (M.m.u-q) or OSGi (M.m.u.q) version

			int major = 0;
			int minor = 0;
			int micro = 0;
			String qualifier = null;

			// Grab the capturing groups from the pattern, only first is required, others may be null, 0=whole match, so ignored
			String majorStr = m.group(1);
			String minorStr = m.group(2);
			String microStr = m.group(3);
			qualifier = m.group(4);

			// sanitize the qualifier
			if (qualifier != null) {
				boolean ok = false;
				for (int i = 0; i<ALLOWED_QUALIFIERS.length; ++i) {
					String prefix = ALLOWED_QUALIFIERS[i];
					if (qualifier.startsWith(prefix)) {
						String replacement = REPLACE_QUALIFIERS[i];
						qualifier = qualifier.replaceFirst(prefix, replacement);
						ok = true;
						break;
					}
				}
				// try cases of troublemaker qualifiers, like 6.1.26RC0
				if (!ok) {
					m = QUAL_DATE.matcher(qualifier);
					if (m.matches()) {
						qualifier = m.group(1);
						ok = true;
					}
				}
				if (!ok) {
					m = QUAL_MERGED.matcher(qualifier);
					if (m.matches()) {
						microStr = m.group(1);
						qualifier = m.group(2);
						ok = true;
					}
				}
				if (!ok) {
					m = QUAL_MICRO.matcher(qualifier);
					if (m.matches()) {
						microStr = m.group(1);
						qualifier = null;
						ok = true;
					}
				}
				if (!ok) {
					m = QUAL_BETAnn.matcher(qualifier);
					if (m.matches()) {
						qualifier = "3beta"+m.group(2);	// constant: see ALLOWED_QUALIFIERS above
						ok = true;
					}
				}
				if (!ok)
					return null;
			}

			try {
				major = Integer.parseInt(majorStr);
				if (minorStr != null) {
					minor = Integer.parseInt(minorStr);
				}
				if (microStr != null) {
					micro = Integer.parseInt(microStr);
				}
			}
			catch (NumberFormatException nfe) {
				LOGGER.error("error parsing number from version string " + versionString);
				return null;
			}

			// turn semver into sanitized form suitable for lexicographical ordering
			return String.format("%03d.%03d.%03d.%s", major, minor, micro, (qualifier != null) ? qualifier : DEFAULT_FINAL_QUALIFIER);
		}

		// getVersion() did not match any tolerated forms, complain.
		return null;

	}
}
