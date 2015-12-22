package com.espire.hybrid.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static File file;
	

	// This method is to set the File_Path and to open the Excel file, Pass
	// Excel Path and Sheetname as Arguments to this method

	public static void setExcelFile(String File_Path, String SheetName)
			throws Exception {
		try {
			// Open the Excel file
			
			FileInputStream ExcelFile = new FileInputStream( new File(File_Path));
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			throw (e);
		}
	}

	public static String getCelldata(int Row_Num, int Col_Num) {
		try {
			Cell = ExcelWSheet.getRow(Row_Num).getCell(Col_Num);
			String Cell_Data = Cell.getStringCellValue();
			return Cell_Data;
		} catch (Exception e) {
			return "";
		}
	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters

	public static void setCelldata(String Result, String File_Path , int Row_Num, int Col_Num) throws Exception {
		try {
			
			Workbook wb = WorkbookFactory.create(new FileInputStream(new File(File_Path)));
			
			//FileInputStream file = new FileInputStream(new File(File_Path));

	      ExcelWBook = new XSSFWorkbook(file);
	      ExcelWSheet = ExcelWBook.getSheetAt(0);
		        
		        
			XSSFCell Cell=null;
			Row = ExcelWSheet.getRow(Row_Num);
			// Row = ExcelWSheet.createRow(Row_Num);
		//	Cell = Row.getCell(Col_Num, Row.CREATE_NULL_AS_BLANK);
			if (Cell == null) {
				//Cell = Row.createCell(Col_Num);
				Cell = ExcelWSheet.getRow(Row_Num).createCell(Col_Num);
				
			} 
				Cell.setCellValue(Result);
		//	file.close();
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(new File(File_Path));
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}
}
