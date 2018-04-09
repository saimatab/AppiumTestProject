package au.com.miracletek.common;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import java.io.FileOutputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;

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
	
	
	public void saveQueryResultToExcel(ResultSet rs,ResultSet rs1,ResultSet rs1a,ResultSet rs1b,ResultSet rs31, ResultSet rs31a,ResultSet rs31b,ResultSet rs41,ResultSet rs41a,ResultSet rs41b,ResultSet rs61,ResultSet rs61a,ResultSet rs61b,ResultSet rs7,ResultSet rs8,String fileName,String sheetName,String filea, String fileb,int sheetId ,int rowvar, int colvar)throws Exception{
	    Row dataRow4=null;
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

int t=0;
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

 xlsWorkbook=helper(xlsWorkbook,rs1,rs1a,rs1b,"camera");
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
 xlsWorkbook=helper(xlsWorkbook,rs31,rs31a,rs31b,"gallary");


	
 xlsWorkbook=helper(xlsWorkbook,rs41,rs41a,rs41b,"signature");
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 xlsWorkbook=helper(xlsWorkbook,rs61,rs61a,rs61b,"datetimeupload");



//////////////////////////////////////////////////


 xlsSheet = xlsWorkbook.createSheet("reppager");

short rowIndexa = 0;


// Get the list of column names and store them as the first
// row of the spreadsheet.
ResultSetMetaData colInfoa = rs7.getMetaData();

List<String> colNamesa = new ArrayList();
Row titleRowa = xlsSheet.createRow(rowIndexa++);

for (int i = 1; i <= colInfoa.getColumnCount(); i++) {
  colNamesa.add(colInfoa.getColumnName(i));
  titleRowa.createCell((short) (i-1)).setCellValue(
    new XSSFRichTextString(colInfoa.getColumnName(i)));
  xlsSheet.setColumnWidth((short) (i-1), (short) 4000);

}

// Save all the data from the database table rows
while (rs7.next()) {
       
  Row dataRowa = xlsSheet.createRow(rowIndexa++);
  short colIndexa = 0;
  for (String colNamea : colNamesa) {
    dataRowa.createCell(colIndexa++).setCellValue(
      new XSSFRichTextString(rs7.getString(colNamea)));

  

  }
       //resultSetArray.add(sb.toString());
}


	
	////////////////////////////
	
 xlsSheet = xlsWorkbook.createSheet("reppager_repeater");

short rowIndexb = 0;


// Get the list of column names and store them as the first
// row of the spreadsheet.
ResultSetMetaData colInfob = rs8.getMetaData();

List<String> colNamesb = new ArrayList();
Row titleRowb = xlsSheet.createRow(rowIndexb++);

for (int i = 1; i <= colInfob.getColumnCount(); i++) {
  colNamesb.add(colInfob.getColumnName(i));
  titleRowb.createCell((short) (i-1)).setCellValue(
    new XSSFRichTextString(colInfob.getColumnName(i)));
  xlsSheet.setColumnWidth((short) (i-1), (short) 4000);

}

// Save all the data from the database table rows
while (rs8.next()) {
       
  Row dataRowb = xlsSheet.createRow(rowIndexb++);
  short colIndexb = 0;
  for (String colNameb : colNamesb) {
    dataRowb.createCell(colIndexb++).setCellValue(
      new XSSFRichTextString(rs8.getString(colNameb)));

  

  }
       //resultSetArray.add(sb.toString());
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//Write to disk
	System.out.println("%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%NNNN");
FileOutputStream fileOut = new FileOutputStream("SAMPLE.xlsx");

xlsWorkbook.write(fileOut);
	fileOut.close();	
	

    File file1a = new File(filea);
    File file1b = new File("auto_input.xlsx");
    File file2b = new File("camera_input.xlsx");
    File file3b = new File("gallary_input.xlsx");
    File file4b = new File("signature_input.xlsx");
    File file5b = new File("upload_datetime_autocom_input.xlsx");
    File file6b = new File("reppager_input.xlsx");
    File file7b = new File("reppager_repeater1_input.xlsx");


	CompareResults(file1a, file1b ,2, 5,filea, 0);

	CompareResults(file1a, file2b ,2, 2,filea, 1);

	CompareResults(file1a, file3b ,2, 2,filea, 2);

	CompareResults(file1a, file4b ,2, 2,filea, 3);

	CompareResults(file1a, file5b,2 ,8,filea, 4);
	
	CompareResults(file1a, file6b ,2, 2,filea, 5);
	CompareResults(file1a, file7b ,2,3,filea, 6);
	
	
	
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}
	
	
	
	
	public org.apache.poi.ss.usermodel.Workbook  helper(org.apache.poi.ss.usermodel.Workbook wb1,ResultSet rs1, ResultSet rs2, ResultSet rs3, String sheetName)throws Exception{
		
	    Row dataRow4=null;
		org.apache.poi.ss.usermodel.Sheet xlsSheet = wb1.createSheet(sheetName);
			System.out.println("%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%PPPPP");
		short rowIndexa = 0;


		// Get the list of column names and store them as the first
		// row of the spreadsheet.
		ResultSetMetaData colInfoa = rs1.getMetaData();
		System.out.println("%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%PPPPPr");
		List<String> colNamesa = new ArrayList();
		Row titleRowa = xlsSheet.createRow(rowIndexa++);

		for (int i = 1; i <= colInfoa.getColumnCount(); i++) {
		  colNamesa.add(colInfoa.getColumnName(i));
		  titleRowa.createCell((short) (i-1)).setCellValue(
		    new XSSFRichTextString(colInfoa.getColumnName(i)));
		  xlsSheet.setColumnWidth((short) (i-1), (short) 4000);

		}

		


		ResultSetMetaData colInfo1b = rs2.getMetaData();

		  List<String> colNames1b = new ArrayList();


		  for (int i = 1; i <= colInfo1b.getColumnCount(); i++) {
		    colNames1b.add(colInfo1b.getColumnName(i));

		  }
		  while (rs2.next()) {
		  dataRow4 = xlsSheet.createRow(1);
		  short colIndexb = 0;
			  for (String colNameb : colNames1b) {
				  
				  
				  if(colNameb.contentEquals("camera")|| colNameb.contentEquals("gallary") || colNameb.contentEquals("signature1") ||  colNameb.contentEquals("uploader1")){
					  
					  break;
				  }
					  
					  
				  else{
				    dataRow4.createCell(colIndexb++).setCellValue(
				      new XSSFRichTextString(rs2.getString(colNameb)));}
				      
					
				  }
				       //resultSetArray.add(sb.toString());
			
		  }
			
			
		  ResultSetMetaData colInfo2c = rs3.getMetaData();

		  List<String> colNamesc = new ArrayList();

		  for (int i = 1; i <= colInfo2c.getColumnCount(); i++) {
			    colNamesc.add(colInfo2c.getColumnName(i));
			
			  }
		  
		  while (rs3.next()) {
			
			 
				  for (String colNamec : colNamesc) {
					  
					  if (rs3.wasNull()) {
					        System.out.println("was NULL");
					        
			
					      if (colNamec.contentEquals("uploader1"))
					    	  
					        {dataRow4.createCell(7).setCellValue("not exists");}
					      
					      else{
					    	     dataRow4.createCell(1).setCellValue("not exists");
					    	  
					      }
					        
					        
					      } else {
					        System.out.println("not NULL");
					        if(rs3.getString(colNamec) != null)
					        {

							      if (colNamec.contentEquals("uploader1"))
							    	  
							        {dataRow4.createCell(7).setCellValue("exists");}
							      
							      else
							    	     {dataRow4.createCell(1).setCellValue("exists");}
							    	  
							 }
					      
					        }
					      
					      }

				
					      
						
					  
					       //resultSetArray.add(sb.toString());
				
			  }
				
			 return wb1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	  /* File csvOutputFile = new File("auto1_output.csv")	;
	  FileWriter fileWriter = new FileWriter(csvOutputFile, false);
  for(String mapping : resultSetArray) {
      fileWriter.write(mapping + "\n");
   }fileWriter.close();*/
	
	public void CompareResults( File filea, File fileb ,int rownum, int colnum,String filename,int sheetId)throws InvalidFormatException, IOException {
		
		FileInputStream fileInputStream1 = new FileInputStream(filea);
		FileInputStream fileInputStream2 = new FileInputStream(fileb);
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream1);
		XSSFWorkbook workbook1=new XSSFWorkbook(fileInputStream2);
		
		
		//XSSFWorkbook workbook = WorkbookFactory.create(new File("SAMPLE.xlsx"));
		//	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@1");
		 //XSSFWorkbook workbook1 = WorkbookFactory.create(new File("auto_input.xlsx"));
			//System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2");

		  XSSFSheet sheet1 = workbook.getSheetAt(sheetId);

		  XSSFSheet sheet2 =workbook1.getSheetAt(0);
				  
				  
				  
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
	
		XSSFRow r4 = sheet1.getRow(firstRow1);
		
		  short firstCell1 = r4.getFirstCellNum();
	
                    short lastCell1 = r4.getLastCellNum();
			 
	for (int row = 0; row < rownum; row++) {

		for (int col = 0; col < colnum; col++) {
			//System.out.print(sh1eet1.getCell(col, row).getContents() + "\t");
		XSSFRow r1 = sheet1.getRow(row);
			              XSSFCell cA1 = r1.getCell(col);
		XSSFRow r2 = sheet2.getRow(row);
		          XSSFCell cA2 = r2.getCell(col);
			
			  
			
			 if (df.formatCellValue(cA1).equals(df.formatCellValue(cA2))){
       XSSFCellStyle style = workbook.createCellStyle();
				   style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);

		
  cA1.setCellStyle(style);
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@3");	
				    
		 	  	 
			 }
else{

	 XSSFCellStyle style1 = workbook.createCellStyle();
				   style1.setFillForegroundColor(IndexedColors.RED.getIndex());
 style1.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);;
     
			
  cA1.setCellStyle(style1);
   
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@4");	 	  	 
	
}
			 
		}
	}
			
		workbook.write(new FileOutputStream("SAMPLE1.xlsx"));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@5");
		
 //fileInputStream1.close();
	//.close(); 


		
		
		
	}
	
}
