package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePage {
	
	public static void main(String[] args) {
		WebDriver driver;
		String applicationUrlAddress="http://google.com";
		System.setProperty("webdriver.chrome.driver","./resouresbrowser/chromedriver.exe") ;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrlAddress);
		String googleHomepagetitle = driver.getTitle();
		System.out.println("The Home Of The google Home Page is:"+googleHomepagetitle);
		driver.quit();
	}

}






