package com.Jquaryui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JquaryLaunch {
	WebDriver driver ;
	String string = "https://jqueryui.com/droppable/";

	public void applicationLaunch() {
		System .setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
	}
	public void Droppable() {
	    By frameLocator=By.className("demo-frame");
	    WebElement Droppableelement=driver.findElement(frameLocator);
	driver.switchTo().frame(Droppableelement);
	By dragmetomyTargetLocator=By.id("draggable");
	WebElement dragmetomyTarget =driver.findElement(dragmetomyTargetLocator);
	
	By droppableLocator=By.id("droppable");
	WebElement droppable =driver.findElement(droppableLocator);
	
	Actions actions = new Actions(driver);
	actions.dragAndDrop(dragmetomyTarget, droppable).build().perform();
	}
	
	public static void main(String[] args) {
		JquaryLaunch jquaryLaunch = new JquaryLaunch();
		jquaryLaunch.applicationLaunch();
		jquaryLaunch.Droppable();
	}
}
