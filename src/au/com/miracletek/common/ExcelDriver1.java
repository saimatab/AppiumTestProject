package au.com.miracletek.common;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;

import java.io.IOException;
import  java.sql.Connection;	
import  java.sql.Statement;		
import  java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import  java.sql.DriverManager;		
import  java.sql.SQLException;	
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import java.lang.Object;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import java.io.File;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.sql.*;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.*;
import  java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Map;
import java.io.File;
import java.io.FileWriter;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.ss.usermodel.RichTextString;
public class ExcelDriver1 {
	
	
	public void saveQueryResultToExcel(ResultSet rs, String fileName,String sheetName,String filea, String fileb,int sheetId ,int rowvar, int colvar)throws Exception{
	
	    File file1 = new File(filea);
	    File file2 = new File(fileb);
					//FileOutputStream fileOut = new FileOutputStream(file1);
		///XSSFWorkbook xlsWorkbook = new XSSFWorkbook();
		
					org.apache.poi.ss.usermodel.Workbook xlsWorkbook =null;
					
				   // FileInputStream inputStream = new FileInputStream(file1);
					
					String fileExtensionName = fileName.substring(fileName.indexOf("."));

			        //Check condition if the file is xlsx file

			        if(fileExtensionName.equals(".xlsx")){

			        //If it is xlsx file then create object of XSSFWorkbook class

			        	xlsWorkbook = new XSSFWorkbook();
			        	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%");
			        }

			        //Check condition if the file is xls file

			        else if(fileExtensionName.equals(".xls")){

			            //If it is xls file then create object of XSSFWorkbook class

			        	xlsWorkbook = new HSSFWorkbook();
			         	System.out.println("%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%");
			        }
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
		
//XSSFSheet xlsSheet = xlsWorkbook.createSheet(sheetName);


org.apache.poi.ss.usermodel.Sheet xlsSheet = xlsWorkbook.createSheet(sheetName);

short rowIndex = 0;
List<String> resultSetArray=new ArrayList<>();

// Get the list of column names and store them as the first
// row of the spreadsheet.
ResultSetMetaData colInfo = rs.getMetaData();
List<String> colNames = new ArrayList();
Row titleRow = xlsSheet.createRow(rowIndex++);

for (int i = 1; i <= colInfo.getColumnCount(); i++) {
  colNames.add(colInfo.getColumnName(i));
  titleRow.createCell((short) (i-1)).setCellValue(
    new XSSFRichTextString(colInfo.getColumnName(i)));
  xlsSheet.setColumnWidth((short) (i-1), (short) 4000);
}

// Save all the data from the database table rows
while (rs.next()) {
        StringBuilder sb = new StringBuilder();
  Row dataRow = xlsSheet.createRow(rowIndex++);
  short colIndex = 0;
  for (String colName : colNames) {
    dataRow.createCell(colIndex++).setCellValue(
      new XSSFRichTextString(rs.getString(colName)));
       sb.append(String.format(String.valueOf(rs.getString(colName))) + " ");

  }
       //resultSetArray.add(sb.toString());
}

// Write to disk
FileOutputStream fileOut = new FileOutputStream("SAMPLE.xlsx");
xlsWorkbook.write(fileOut);
	fileOut.close();	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	//CompareResults(file1, file2 ,rowvar, colvar,filea, sheetId);
	
	
		
	}
	
	  /* File csvOutputFile = new File("auto1_output.csv")	;
	  FileWriter fileWriter = new FileWriter(csvOutputFile, false);
  for(String mapping : resultSetArray) {
      fileWriter.write(mapping + "\n");
   }fileWriter.close();*/
	
	public void CompareResults( File filea, File fileb ,int rownum, int colnum,String filename,int sheetId)throws InvalidFormatException, IOException {
		
		
		 Workbook workbook = WorkbookFactory.create(new File("auto_output1.xlsx"));
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@1");
		 Workbook workbook1 = WorkbookFactory.create(new File("auto_input.xlsx"));
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");
		
		  Sheet sheet1 = workbook.getSheetAt(sheetId);
		  Sheet sheet2 =workbook1.getSheetAt(sheetId);
				  
				  
				  
DataFormatter df = new DataFormatter();
	// fileInputStream1 = new FileInputStream(filea);
//FileInputStream fileInputStream2 = new FileInputStream(fileb);
		//XSSFWorkbook workbook1= new XSSFWorkbook(fileInputStream1);
	//XSSFWorkbook	  workbook2 = new XSSFWorkbook(fileInputStream2);
	
	
	
	
	
   //XSSFSheet sheet1 = workbook1.getSheetAt(sheetId);
//XSSFSheet sheet2 = workbook2.getSheetAt(sheetId);
		//int totalNoOfRows1 = sheet1.getRows();
int firstRow1=sheet1.getFirstRowNum();
			
                          
    int lastRow1 = sheet1.getLastRowNum();
	
		Row r4 = sheet1.getRow(firstRow1);
		
		  short firstCell1 = r4.getFirstCellNum();
	
                    short lastCell1 = r4.getLastCellNum();
			 
	for (int row = 0; row < rownum; row++) {

		for (int col = 0; col < colnum; col++) {
			//System.out.print(sh1eet1.getCell(col, row).getContents() + "\t");
		Row r1 = sheet1.getRow(row);
			              Cell cA1 = r1.getCell(col);
		Row r2 = sheet2.getRow(row);
		           Cell cA2 = r2.getCell(col);
			
			  
			
			 if (df.formatCellValue(cA1).equals(df.formatCellValue(cA2))){
       CellStyle style = workbook1.createCellStyle();
				   style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    style.setFillPattern(CellStyle.SOLID_FOREGROUND);

		
  cA1.setCellStyle(style);
			
				    
		 	  	 
			 }
else{

     CellStyle style1 = workbook1.createCellStyle();

     style1.setFillForegroundColor(IndexedColors.RED.getIndex());
    style1.setFillPattern(CellStyle.SOLID_FOREGROUND);
     
	 	  
			
  cA1.setCellStyle(style1);
   
		 	  	 
	
}
			 
		}
	}
			
		workbook1.write(new FileOutputStream("auto_output1.xlsx"));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@3");
		
 //fileInputStream1.close();
	//.close(); 


		
		
		
	}
	
}
