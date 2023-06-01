package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./resouresbrowser/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	    
	    driver.manage().window().maximize();
	   
	    driver.findElement(By.id("txtUsername")).sendKeys("prasadp");
	    
		driver.findElement(By.id("txtPassword")).sendKeys("P7orange**");
		
		driver.findElement(By.id("btnLogin")).click();
		

	}
}
        //<input name="txtUsername" id="txtUsername" type="text">
        //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
        //<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">


