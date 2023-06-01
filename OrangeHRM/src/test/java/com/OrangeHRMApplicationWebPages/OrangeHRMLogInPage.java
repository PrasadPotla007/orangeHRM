package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.log;
import com.aventstack.extentreports.model.Log;

public class OrangeHRMLogInPage extends BaseTest{
	
	// id="logInPanelHeading"
	
		// WebElement logInPageLogInPanel=driver.findElement(By.id("logInPanelHeading"));
		
		// An Object Repository Class - will be updated with identification of elements on the
		 //   WebPage and Operations done on the WebElements
			
		public OrangeHRMLogInPage() // it is a constructor - the class name is similar to
		                                        // Method name(its called as constructor)   
		{
			PageFactory.initElements(driver, this);
		}
			
		@FindBy(id="logInPanelHeading")
		WebElement logInPageLogInPanel;
		
		@FindBy(id="txtUsername")
		WebElement userName;
		
		@FindBy(name="txtPassword")
		WebElement password;
		
		@FindBy(name="Submit")
		WebElement logInPageLogInButton;
		
		@FindBy(xpath="//*[@id=\"divLogo\"]/img")
		WebElement logInPageLogo;
			
		public void validatingLogInPageText()
		{
			String actual_LogInPageLogInPanelText=logInPageLogInPanel.getText();
			log.info("The actual LogIn page Text is :- "+actual_LogInPageLogInPanelText);
			
			String expected_LogInPageLogInPanelText="LOGIN Panel";
			log.info("The expected LogIn Page Text is :-"+expected_LogInPageLogInPanelText);
					
		Assert.assertEquals(actual_LogInPageLogInPanelText, expected_LogInPageLogInPanelText,
					"Failed to navigate to OrangeHRM Application LogIn Page");
		
	//Log.info("Failed to navigate to OHRM Application LogInPage-LogInPage Text validation Failed");
					
		}
		
		public void validatingLogIn(String userNameTestData,String passwordTestData)
		{
			userName.sendKeys(userNameTestData);
			password.sendKeys(passwordTestData);
			logInPageLogInButton.click();
			log.info("Validating LogIn Functionality");
		}
		
		public void validatingLogInPageLogo()
		{
			boolean flag=logInPageLogo.isDisplayed();
			log.info("Validating OHRM Application LogInPage Logo");
			
		Assert.assertTrue(flag,
				"OrangeHRM Application LogIN Page does not contains OrangeHRMLogo - FAIL");
		log.info("OrangeHRM Application LogIN Page does not contains OrangeHRMLogo - FAIL");
		}
	}



