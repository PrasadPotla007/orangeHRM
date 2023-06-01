package com.Utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class log {
	
	 public static Logger Log=Logger.getLogger("log");

     

     public static void info(String massage) {

               

                PropertyConfigurator.configure("C:\\Users\\rockz\\eclipse-workspace\\OrangeHRM\\Log4j.properties");

               

                Log.info(massage);

     }

}
