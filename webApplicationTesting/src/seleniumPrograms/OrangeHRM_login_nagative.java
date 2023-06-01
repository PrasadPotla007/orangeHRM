package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
;

public class OrangeHRM_login_nagative {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver;

        String   orangeHRM_Application = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

        System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
        
        driver = new ChromeDriver();
        

        driver.manage().window().maximize();

        driver.get(orangeHRM_Application);



        //                        By userNameLocator=By.id("txtUsername");

        //                        WebElement userName=driver.findElement(userNameLocator);

        //                        userName.sendKeys("boya");

        //

        //                        By passwordNameLocator=By.className("txtPassword");

        //                        WebElement passwordName=driver.findElement(passwordNameLocator);

        //                        userName.sendKeys("ramesh");



        //                        driver.findElement(By.id("txtUsername")).sendKeys("ramesh");



        //                        driver.findElement(By.id("txtPassword")).sendKeys("mulodre");

        /*String userName = "ramesh";

        By usernameLocator = By.id("txtUsername");

        WebElement userNameElement = driver.findElement(usernameLocator);

        userNameElement.sendKeys(userName);



        String passwordName = "ram";

        By passwordLocator = By.id("txtPassword");

        WebElement passwordElement = driver.findElement(passwordLocator);

        passwordElement.sendKeys(passwordName);

        */





        String userName = "prasadp";

        String passwordName = "P7orange**";



        By usernameLocator = By.id("txtUsername");

        WebElement userNameElement = driver.findElement(usernameLocator);

        userNameElement.sendKeys(userName);





        By passwordLocator = By.id("txtPassword");

        WebElement passwordElement = driver.findElement(passwordLocator);

        passwordElement.sendKeys(passwordName);





        By loginButtonLocator=By.id("btnLogin");

        WebElement    loginButton=driver.findElement(loginButtonLocator);

        loginButton.click();







        By admiButtonLocator=By.linkText("Admin");

        WebElement    adminButton=driver.findElement(admiButtonLocator);

        Actions adminAction  = new Actions(driver);

        adminAction.moveToElement(adminButton).build().perform();

        //adminButton.click();

        By qualificationLocator=By.linkText("Qualifications");

        WebElement    qualificationEliment=driver.findElement(qualificationLocator);

        Actions elimentAction  = new Actions(driver);

        elimentAction.moveToElement(qualificationEliment).build().perform();

       

        By educationLocator=By.linkText("Education");

        WebElement educationEliment=driver.findElement(educationLocator);

        educationEliment.click();

       

        driver.navigate().back();

        driver.navigate().back();

        driver.navigate().back();

       

        //driver.quit();

        
        
        
	}}
        
              