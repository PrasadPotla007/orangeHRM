package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturingCompleWebTableDataTest {
	
	WebDriver driver;
	String string = "https://www.timeanddate.com/worldclock/";

	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./resouresbrowser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}
	
	
	public void capturing_AllData() throws Throwable
	{

	FileInputStream testDataFile = new FileInputStream("./Excel/Book1.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
	XSSFSheet testDataSsheet =workBook.getSheet("Sheet2");

	// First Row of First Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

	// Last Row if Last Cell Property
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

	String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";

	String xpathExpressionPart2="]/td[";

	String xpathExpressionPart3="]";

	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	Row newRow=testDataSsheet.createRow(rowIndex-1);
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	Cell newRowOfCell=newRow.createCell(rowOfCellIndex-1);

	// By tableRowOfCellLocator=By.xpath(xpathExpressionPart1+rowIndex+xpathExpressionPart2+rowOfCellIndex+xpathExpressionPart3);

	By tableRowOfCellLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");

	WebElement tableRowOfCell=driver.findElement(tableRowOfCellLocator);
	String data=tableRowOfCell.getText();
	newRowOfCell.setCellValue(data);
	System.out.print(data+"  ");

	}
	System.out.println();

	}
	FileOutputStream outPutFile = new FileOutputStream("./Excel/Book1.xlsx");
	workBook.write(outPutFile);



	}

	public static void main(String[] args) throws Throwable {

		capturingCompleWebTableDataTest tableData = new capturingCompleWebTableDataTest();
	tableData.setUp();
	tableData.capturing_AllData();
	//tableData.tearDown();


	}

	}




