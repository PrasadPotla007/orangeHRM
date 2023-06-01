package TSRTC;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {

		WebDriver driver;

		String	tsrtcApplicationURL = "https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(tsrtcApplicationURL);
		
		List<WebElement> tsrtclinkslocators=driver.findElements(By.tagName("a"));

		int tsrtclinksCount	=tsrtclinkslocators.size();
		
		System.out.println(tsrtclinksCount);
		
for (WebElement webElement : tsrtclinkslocators) {
	
	System.out.println("webLinks :----"+ webElement.getText());
}

	}

}
