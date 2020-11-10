package AirlineSources;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	
	public static Logger getLog(Class c) {
		Logger log=Logger.getLogger(c);
		PropertyConfigurator.configure("src/test/java/AirlineSources/log4j.properties");
		
		return log;
	}

}
