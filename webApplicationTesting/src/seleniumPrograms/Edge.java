package seleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./resouresbrowser/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		//System.setProperty("webdriver.edge.driver", "./resouresbrowser/msedgedriver.exe");
		
		//EdgeDriver EdgeDriver = new EdgeDriver();	}

}
}


