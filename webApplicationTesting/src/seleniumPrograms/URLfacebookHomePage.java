package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLfacebookHomePage {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./resouresbrowser/chromedriver.exe ");
		driver=new ChromeDriver();
		String FacebookUrl="https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.get(FacebookUrl);
		System.out.println("Facebook Title is:" +driver.getTitle());
		System.out.println("Facebook Url is:" +driver.getCurrentUrl());
		
		String expectedFaceBookHomePageTitle="Facebook � log in or sign up";
		String actualFaceBookHomePageTitle="Facebook � log in or sign up";
		//String expectedFaceBookHomeUrlAddress="Facebook.com";
		//String actualFaceBookHomeUrlAddress="https://www.facebook.com/";
		
			
		if (actualFaceBookHomePageTitle.equals(expectedFaceBookHomePageTitle)) {
			
			System.out.println("True");
			
		} else {
			System.out.println("Flase");
			
		}
		
		
		String expectedFaceBookHomeUrlAddress="facebook.com";
		String actualFaceBookHomeUrlAddress="https://www.facebook.com/";        //"Facebook.com"
		
		if (actualFaceBookHomeUrlAddress.contains(expectedFaceBookHomeUrlAddress)) {
			
			System.out.println("True");
			
		} else {
			System.out.println("Flase");
			driver .quit();

		}

		}
		

}
