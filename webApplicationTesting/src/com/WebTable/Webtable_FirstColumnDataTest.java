package com.WebTable;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_FirstColumnDataTest {

	WebDriver driver;
	String string = "https://www.timeanddate.com/worldclock/";

	public void applicationLaunch() {
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	public void tearDown() {
		driver.quit();
	}

	public void getCityNameTest() {

		for (int index = 1; index <= 36; index++) {

			By CityNameLocator = By
					.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + index + "]/td[1]");
			
			

			WebElement CityName = driver.findElement(CityNameLocator);

			String CityNameText = CityName.getText();

			System.out.println("index+_" + CityNameText);
		}

	}

	public static void main(String[] args) {

		Webtable_FirstColumnDataTest webTable = new Webtable_FirstColumnDataTest();

		webTable.applicationLaunch();


		webTable.getCityNameTest();
		webTable.tearDown();

	}
}
