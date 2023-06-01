package com.ExcelOperations;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation {
	
	public static void main(String[] args) throws Exception  {
		FileInputStream excleTextDataFile = new FileInputStream("./Excel/Book1.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook(excleTextDataFile);
		XSSFSheet sheet = workBook.getSheet("sheet1");
		Row sheetOfCell=sheet.getRow(0);
		Cell rowOfCell=sheetOfCell.getCell(0);
		String testData=rowOfCell.getStringCellValue();
		System.out.println("the data in the row of a cell is:--"+testData);
		
	}

}


