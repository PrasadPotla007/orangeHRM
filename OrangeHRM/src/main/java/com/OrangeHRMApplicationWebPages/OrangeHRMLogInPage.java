package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.log;
import com.aventstack.extentreports.model.Log;

public class OrangeHRMLogInPage  extends BaseTest{
	
	public OrangeHRMLogInPage()
	{
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="logInPanelHeading")
	WebElement logInPageLogInPanel;

	@FindBy(id="txtUsername")
	WebElement userName;

	@FindBy(id="txtPassword")
	WebElement password;

	@FindBy(id="btnLogin")
	WebElement logInPageLogInButton;

	@FindBy(xpath = "//*[@id=\"divLogo\"]/img")
	WebElement logInPageLogo;

	public void validatingLogInPageText()
	{
	String actual_LogInPageLogInPanelText=logInPageLogInPanel.getText();
	log.info("The Actual LogInPage LogIn Panel Text is:- "+actual_LogInPageLogInPanelText);

	String expected_LogInPageLogInPanelText="LOGIN Panel";
	log.info("The Expected LogInPage LogIn Panel Text is:- "+expected_LogInPageLogInPanelText);

	Assert.assertEquals(actual_LogInPageLogInPanelText,
	expected_LogInPageLogInPanelText, "Failed To Navigate to OrangeHRM Application LogIn Page");
	log.info("Failed To Navigate to OrangeHRM Application LogIn Page - LogIn Page Text Validation Failed");

	}

	public void validatingLogIn(String userNameTestData, String passwordTestData)
	{
	userName.sendKeys(userNameTestData);
	password.sendKeys(passwordTestData);
	logInPageLogInButton.click();
	log.info("Validating LogIn Functionality");
	}

	public void validatingLogInPageLogo()
	{
	boolean flag=logInPageLogo.isDisplayed();
	log.info("Validating ORHM Application LogIn Page Logo");

	Assert.assertTrue(flag, "OrangeHRM Application LogIn Page does not Contains OrangeHRM Logo - FAIL");
	log.info("OrangeHRM Application LogIn Page does not Contains OrangeHRM Logo - FAIL");
	}


}
