package contractstudy;

import org.apache.log4j.Logger;
import semverstudy.commons.Logging;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Project specific preferences backed by preferences.properties. 
 * Note that this file is in .hgignore to allow project specific settings.
 * @author jens dietrich
 */
public class Preferences {
	static Logger LOGGER = Logging.getLogger(Preferences.class);
	public static final Properties prefs = new Properties();
	public static final String PREF_FILE = "preferences.properties";
	static {
		LOGGER.warn("Reading user preferences from " + PREF_FILE);
		try (FileInputStream in = new FileInputStream(PREF_FILE)) {
			prefs.load(in);
		}
		catch (Exception x) {
			LOGGER.warn("Cannot access property file " + PREF_FILE);
			LOGGER.warn("Create this as a standard property file with lines key=value, note that this is in .hgignore");
		}
	}

    // public so that it can be used to load special prefs for testing
    public static void loadPrefs(Properties p) {
        LOGGER.warn("Overriding preferences, this should only be used for testing !");
        prefs.clear();
        prefs.putAll(p);
    }

    // override a single key
    public static void setSinglePref(String key,String value) {
        LOGGER.warn("Overriding preferences, this should only be used for testing !");
        prefs.put(key,value);
    }

	private static String getStringPref(String key, String defaultValue) {
		String value = prefs.getProperty(key);
		if (value==null) {
			LOGGER.warn("Cannout find value for key " + key + " in " + PREF_FILE + ", will use default value " + defaultValue);
			return defaultValue;
		}
		else {
			return value;
		}
	}
	
	private static int getIntPref(String key, int defaultValue) {
		String value = prefs.getProperty(key);
		if (value==null) {
			LOGGER.warn("Cannout find value for key " + key + " in " + PREF_FILE + ", will use default value " + defaultValue);
			return defaultValue;
		}
		else {
			return Integer.parseInt(value);
		}
	}

    private static boolean getBooleanPref(String key, boolean defaultValue) {
        String value = prefs.getProperty(key);
        if (value==null) {
            LOGGER.warn("Cannout find value for key " + key + " in " + PREF_FILE + ", will use default value " + defaultValue);
            return defaultValue;
        }
        else {
            return Boolean.parseBoolean(value);
        }
    }
	
	public static String getOutputFolder() {
		return getStringPref("output","out");
	}

    public static String getOutputContractsFolder() {
        return getOutputFolder()+"/contracts";
    }

    public static String getOutputStructureFolder() {
        return getOutputFolder()+"/struct";
    }
	
	public static String getDataFolder() {
		return getStringPref("data","data");
	}

    public static String getResultsFolder() {
        return getStringPref("results","results");
    }

	public static int getThreadCount() {
		return getIntPref("threads",Runtime.getRuntime().availableProcessors());
	}

    public static boolean includePrivateMethods() {
        return getBooleanPref("includeprivate",false);
    }

}
