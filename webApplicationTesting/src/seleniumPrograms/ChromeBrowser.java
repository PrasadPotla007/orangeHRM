package seleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		
		ChromeDriver chromeDriver=new ChromeDriver();
	}

}


