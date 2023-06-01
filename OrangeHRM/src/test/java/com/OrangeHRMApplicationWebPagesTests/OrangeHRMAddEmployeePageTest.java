package com.OrangeHRMApplicationWebPagesTests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationWebPages.OrangeHRMAddEmployeePage;
import com.OrangeHRMApplicationWebPages.OrangeHRMHomePage;
import com.OrangeHRMApplicationWebPages.OrangeHRMLogInPage;
import com.Utility.log;


public class OrangeHRMAddEmployeePageTest extends OrangeHRMLogInPage {
	
	OrangeHRMLogInPageTest logInPage;
	OrangeHRMHomePage homePage;
	OrangeHRMAddEmployeePage addEmployee;


	@Test(priority=1,description="Validating AddEmployeeText")
	public void validatingAddEmployeeHeaderTextTest() throws IOException
	{
	logInPage=new OrangeHRMLogInPageTest();
	logInPage.validatingLogInTest();

	homePage=new OrangeHRMHomePage();
	homePage.validatingHomePagePIMText();

	addEmployee=new OrangeHRMAddEmployeePage();
	addEmployee.validatingAddEmployeeHeaderText();

	log.info(" Validating AddEmployee Header Text Successfull - Naviagated to AddEmployee Page");

	}


}
