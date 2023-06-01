package com.WebTable;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Jquaryui.JquaryLaunch;

public class WebTable {

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
		By CityNameLocator = By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");

		WebElement CityName = driver.findElement(CityNameLocator);

		String CityNameText = CityName.getText();

		System.out.println("The City Name is:" + CityNameText);

	}

	public static void main(String[] args) {

		WebTable webTable = new WebTable();

		webTable.applicationLaunch();
		
		//WebTable_getCityName_FirstRowOfFirstCellData cityName=new WebTable_GetCityName_FirstRowOfFirstCellData();
		

		webTable.applicationLaunch();

		webTable.getCityNameTest();
		webTable.tearDown();

	}
}
