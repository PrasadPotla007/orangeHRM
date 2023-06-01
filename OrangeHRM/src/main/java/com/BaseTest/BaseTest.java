package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utility.log;

public class BaseTest {
	
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		//System.out.println(" ******* Chrome Browser Launched Successfully ***");
		
		 log.info(" ******* Chrome Browser Launched Successfully ***");
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get(applicationUrlAddress);
		
		//System.out.println(" Successfully navigated to OrangeHRM Application LogIn Page");
		
		}
	
	@Test
	public void ffg()
	{
		System.out.println("asdffg");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		//System.out.println("*** Chrome browser with Application Closed Successfully  *** ");
		
		log.info("*** Chrome browser with Application Closed Successfully  *** ");
	}
	
}


