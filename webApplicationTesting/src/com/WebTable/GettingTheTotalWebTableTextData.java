package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingTheTotalWebTableTextData {

	WebDriver driver;
	String URLAddress = "https://www.timeanddate.com/worldclock/";

	public void Setup() {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver.manage().window().maximize();
		driver.get(URLAddress);
	}

	public void teardown() {
		driver.quit();
	}

	public void GetTheTextoftheWebTable() {
		/// html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[35]/td[7]
		/// html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		/// html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[3]
		/// html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[5]

		for (int indexi = 1; indexi <= 36; indexi++) {
			By CitynamesLocator = By
					.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + indexi + "]/td[1]");
			WebElement Citynames = driver.findElement(CitynamesLocator);
			String Citynametext = Citynames.getText();
			System.out.println(indexi + "-" + Citynametext);
		}
		for (int index = 1; index <= 36; index++) {
			By CitynamesLocator = By
					.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + index + "]/td[3]");
			WebElement Citynames1 = driver.findElement(CitynamesLocator);
			String Citynametext1 = Citynames1.getText();
			System.out.print(index + "-" + Citynametext1);
		}
		for (int index = 1; index <= 36; index++) {
			By CitynamesLocator = By
					.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + index + "]/td[5]");
			WebElement Citynames2 = driver.findElement(CitynamesLocator);
			String Citynametext2 = Citynames2.getText();
			System.out.println(index + "-" + Citynametext2);
		}
		for (int index = 1; index <= 35; index++) {
			By Citynamescelllocator = By
					.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[" + index + "]/td[7]");
			WebElement Citynamescell = driver.findElement(Citynamescelllocator);
			String Citynamescelltext = Citynamescell.getText();
			System.out.println(index + "-" + Citynamescelltext);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		GettingTheTotalWebTableTextData Obj = new GettingTheTotalWebTableTextData();
		Obj.Setup();
		Thread.sleep(5000);
		Obj.GetTheTextoftheWebTable();
		Obj.teardown();
	}

}
