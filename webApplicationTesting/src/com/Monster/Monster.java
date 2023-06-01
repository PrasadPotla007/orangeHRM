package com.Monster;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster {
	public static void main(String[] args) {

		WebDriver driver;
		String webApplication="https://my.monsterindia.com/sponsered_popup.html";
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(webApplication);
		

		By currentLocationLocator=By.className("border_grey1");
	  WebElement currentLocation=driver.findElement(currentLocationLocator);
	 By currentLocationDropdownLocator= By.tagName("option");
	 List<WebElement > currentLocationDropdown=currentLocation.findElements(currentLocationDropdownLocator);
	 int currentLocationDropdownCount =currentLocationDropdown.size();
	 System.out.println("the current Location Dropdowns Count is:"+currentLocationDropdownCount);
	  
	  for(int dropDownsIndex=0;dropDownsIndex<currentLocationDropdownCount;dropDownsIndex++ ) {
		  String cityNames=currentLocationDropdown.get(dropDownsIndex).getText();
	    System.out.println(dropDownsIndex+"-"+cityNames);
	  
	  }
	  driver.quit();
	}
}


