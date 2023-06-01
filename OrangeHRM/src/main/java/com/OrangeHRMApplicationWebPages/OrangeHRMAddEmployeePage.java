package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.log;

public class OrangeHRMAddEmployeePage extends OrangeHRMLogInPage {
	
	public OrangeHRMAddEmployeePage()
	{
	PageFactory.initElements(driver, addEmployee);
	}

	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmployee;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/h1")
	WebElement addEmployeeHeader;


	public void validatingAddEmployeeHeaderText()
	{
	addEmployee.click();

	String actual_AddEmployeeHeaderText=addEmployeeHeader.getText();
	log.info("The Actual Text Of The AddEmployee Header Text is:- "+actual_AddEmployeeHeaderText);

	String expected_AddEmployeeHeaderText="Add Employee";
	log.info("The Expected Text Of The AddEmployee Header Text is:- "+expected_AddEmployeeHeaderText);

	Assert.assertEquals(actual_AddEmployeeHeaderText, expected_AddEmployeeHeaderText, "The Text Of The AddEmployee Header Text is Not Matched - FAIL");
	log.info("The Text Of The AddEmployee Header Text is Matched - PASS");

	}


	}


