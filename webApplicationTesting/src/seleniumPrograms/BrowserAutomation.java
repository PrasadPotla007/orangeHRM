package seleniumPrograms;

import java.sql.DriverManager;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowserAutomation {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./resouresbrowser/chromedriver.exe ");
		//ChromeDriver chromeDriver = new ChromeDriver();
		
		
	  System.setProperty("webdriver.edge.driver","./resouresbrowser/msedgedriver.exe");
	  EdgeDriver edgeDriver = new EdgeDriver();
	  
	  
	}

}


