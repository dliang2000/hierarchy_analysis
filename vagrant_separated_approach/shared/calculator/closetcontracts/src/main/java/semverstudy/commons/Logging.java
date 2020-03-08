package semverstudy.commons;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Logging system.
 * @author jens dietrich
 */
public class Logging {
	static {
		PropertyConfigurator.configure("log4j.properties");
	}
	
	public static Logger getLogger(String name) {
		return Logger.getLogger(name);	
	}
	
	public static Logger getLogger(Class<?> clazz) {
		return Logger.getLogger(clazz.getSimpleName());	
	}
	
}
