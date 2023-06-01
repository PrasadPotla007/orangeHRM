package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailApplicationTest {
	
	WebDriver driver;
	String ApplicationURlAddress="http://gmail.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ApplicationURlAddress);

		
	}
	/*
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	*/
	
	@Test
	public void logInTest()
	{
		/* <input type="email"  autocomplete="username" 
		 *  aria-label="Email or phone" data-initial-value="">
	 */
		
		// Relative Xpath - the expression of the xpath is created based on the 
		// available properties(attributes and there corresponding values)
		
		// aria-label="Email or phone" - property of Email Element
		
		// //tagname[@attribute='attributeValue']
		// //*[@attribute='attributeValue']
		
		// - means search on the complete WebPage
		// * - means search for all the tag's
		
		// Xpath expression creating based on Single Property
	// 	//input[@aria-label='Email or phone'] - xpath expression for Email Element
	//  //*[@aria-label='Email or phone'] - xpath expression for Email Element

		// Xpath expression creating based on Multiple Property
	// 2. //tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2' and ........]	
	// //*[@aria-label='Email or phone' and @autocomplete='username']	
		

		// By emailLocator=By.xpath("//input[@aria-label='Email or phone']");
		// By emailLocator=By.xpath("//*[@aria-label='Email or phone']");
		
		By emailLocator=By.xpath("//*[@aria-label='Email or phone' and @autocomplete='username']");
		
		WebElement email=driver.findElement(emailLocator);
		email.sendKeys("prasadpotla7@gmail.com");
		
		// Automating Next button
		// <span jsname="V67aGc" class="VfPpkd-vQzf8d">Next</span>
		
		// By nextButtonLocator=By.className("VfPpkd-vQzf8d");
		
		// //span[@class='VfPpkd-vQzf8d']
		// //span[@jsname='V67aGc']
		//By nextButtonLocator=By.xpath("//span[@class='VfPpkd-vQzf8d']");
		// By nextButtonLocator=By.xpath("//span[@jsname='V67aGc']");
		
		/*
		 
		 Xpath using text():
	1.//tagname[text()='textvalue']

		 */

		// Xpath expression creation based on text method
	 // //span[text()='Next']
		/*
		By nextButtonLocator=By.xpath("//span[text()='Next']");
		WebElement nextButton=driver.findElement(nextButtonLocator);
		nextButton.click();
		*/
	}
	

}



