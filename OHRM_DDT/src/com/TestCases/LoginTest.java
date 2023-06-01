package com.TestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest {

	private By driver;

	@Test
	public void logInPageValidationTest() throws IOException {

		// Identifying the properties file
		FileInputStream propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");

		// creating an object for Properties Class

		Properties propertiesfileProperty = new Properties();
		// using the properties class Object - loading the properites file
		propertiesfileProperty.load(propertiesFile);

		By logInPageLogInPanleTextLocator = By
				.id(propertiesfileProperty.getProperty("orangeHRMApplicationLogInPageLogInPanelProperty"));
		//WebElement logInPageLogInPanel = driver.findElement( logInPageLogInPanleTextLocator);
	//	String actual_LogInPageLogInPanelText = logInPageLogInPanel.getText();
	//	System.out.println("LogInPage Text is " + actual_LogInPageLogInPanelText);

	}

}