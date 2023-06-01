package com.MouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://amazon.in"; // variable saved with url Address
			
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver = new ChromeDriver();
			
		driver.get(applicationUrlAddress); // passing the variableName - instead of urlAddress
		
		// id="nav-link-accountList" - Hello SignIn element Property
		By helloSignInLocator=By.id("nav-link-accountList");
		WebElement helloSignIn=driver.findElement(helloSignInLocator);
		
		// Mouse Hover Operation should be performed on "Hello SignIn" Element
		Actions helloSingInAction = new Actions(driver);
		helloSingInAction.moveToElement(helloSignIn).build().perform();
		
			// Your Orders is a hidden element
		// Your Orders element Test
		// locator - linkText
		// selector - Your Orders
		
		By yourOrdersLocator=By.linkText("Your Orders");
		WebElement yourOrders=driver.findElement(yourOrdersLocator);
		yourOrders.click();
		
		
		

			
		}
}

	

	
	
		
		
		
		
		
		
		
		
		
	


