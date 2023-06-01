package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	public WebDriver driver;
	public void launchBrowser() {
	
	
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard"; // variable saved with url Address

	System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
	driver = new ChromeDriver();

	// Maximizing the Browser
	driver.manage().window().maximize();

	driver.get(applicationUrlAddress);
	}
}
