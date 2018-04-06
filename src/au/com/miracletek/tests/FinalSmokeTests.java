package au.com.miracletek.tests;
import org.testng.Assert;
import java.util.Calendar;
import java.io.FileWriter;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;

import org.apache.poi.ss.usermodel.DataFormatter;
import java.lang.Object;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import java.util.*;
import java.sql.*;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;
import  java.sql.ResultSet;
import static org.apache.commons.io.comparator.LastModifiedFileComparator.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Map;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import au.com.miracletek.common.DriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;  
import au.com.miracletek.forms.AutomationTestForm;
import au.com.miracletek.forms.AutomationTestForm2;
import au.com.miracletek.forms.AutomationTestForm3;
import au.com.miracletek.forms.AutomationTestForm4;
import au.com.miracletek.forms.AutomationTestForm5;
import au.com.miracletek.forms.AutomationTestForm6;
import au.com.miracletek.pages.AdvancedSettingsPage;
import au.com.miracletek.common.DatabaseDriver;
import au.com.miracletek.common.ExcelDriver;
import au.com.miracletek.common.ExcelDriver1;
import au.com.miracletek.pages.AppCodePage;
import au.com.miracletek.pages.CategoryPage;
import au.com.miracletek.pages.DraftsPage;
import au.com.miracletek.pages.FormListPage;
import au.com.miracletek.pages.LoginPage;
import au.com.miracletek.pages.NotificationsPage;
import au.com.miracletek.pages.SettingsPage;
import au.com.miracletek.pages.ShellPage;
import au.com.miracletek.pages.SubmissionQueuePage;
import au.com.miracletek.pages.SyncPage;
import au.com.miracletek.pages.SyncPageBlank;
import au.com.miracletek.pages.FormListPageBlankApp;
import au.com.miracletek.pages.TapToLoginPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import reports.JyperionListener;
@Listeners(JyperionListener.class)

public class FinalSmokeTests {
	
//SoftAssert  
	
	SoftAssert  s_assert = new SoftAssert();
	ExtentReports extent;
	ExtentTest extlogger;
	public static String fileName;
	
	Logger log1 = Logger.getLogger("devpinoyLogger");
   
	
	private static Logger log = Logger.getLogger("testlogger");
	private DriverManager manager;
	private DriverConfig config;
	private AppiumDriverLocalService appiumService;
	AppCodePage appCodePage;
	ShellPage shell;
	DraftsPage   drafts;
	TapToLoginPage tapToLogin;
	LoginPage loginPage;
	CategoryPage catPage;
	FormListPageBlankApp formList;
	AutomationTestForm  form1;
	AutomationTestForm2  form2;
	AutomationTestForm3  form3;
	AutomationTestForm4  form4;
	AutomationTestForm5  form5;
	AutomationTestForm6  form6;
	DatabaseDriver dm;
	ExcelDriver ex;
	ExcelDriver1 ex1;
	SyncPageBlank  sync;
	SubmissionQueuePage  subQueue;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
	NotificationsPage  notify;
	static Map extentTestMap = new HashMap();
	@BeforeSuite     
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
		"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {
		 SimpleDateFormat  df = new SimpleDateFormat("dd MMM yyyy HH_mm_ss");
		 String dtime =df.format(new Date());
		 
		String nodepath =System.getenv("APPIUM_NODE_PATH");
		
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +nodepath);
		 
		String jspath =System.getenv("APPIUM_JS_PATH");
		
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +jspath);

		
	/*	appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(nodepath))
				.withAppiumJS(new File(jspath)).withLogFile(new  File("C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\Logs\\Appium\\appiumServer_logs_"+dtime+".log")));
			appiumService.start();*/
	 String appiumlog= System.getProperty("user.dir")+"\\Logs\\Appium\\appiumServer_logs_" +dtime+".log";
		
		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(nodepath))
				.withAppiumJS(new File(jspath)).withLogFile(new  File(appiumlog)));
		appiumService.start();
		
		
		config = new DriverConfig(platform, platform_name, platform_version, device_name, app_path, app_package,
				app_activity, ud_id, bundle_id, ip_address, port);
	}
	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			   extlogger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			   extlogger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			   extlogger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
	
	}

	@AfterSuite
	public void closeAppiumServer() {
		
		try{
		BasePage bp=new 	BasePage();
		 String testout= System.getProperty("user.dir")+"\\test-output";
			
			
		
		//   File dir = new File("C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\test-output");
		 File dir = new File(testout);
           File[] files = dir.listFiles();
          
           System.out.println("Descending order.");
           Arrays.sort(files, LASTMODIFIED_REVERSE);
      
           for (int i=0 ;i<files.length;i++)
           {File filea=files[i];
           
           System.out.println("i*^^^^^^^^^^^^^^^^^^^^^^"+i);
           System.out.println("&&&^&*^^^^^^^^^^^^^^^^^^^^^^"+filea.getName());
           
           }
        		   
     
		
		      File file = new File("app.xml");
				FileInputStream fileInput = new FileInputStream(file);
				Properties properties = new Properties();
				properties.loadFromXML(fileInput);
				fileInput.close();

				
		
				String toemail = properties.getProperty("toemail");
		
		
		bp.sendPDFReportByGMail1("saimatab2016@gmail.com", "Singapore3@", toemail, "PDF Report", "",files[0].getName());
		 extent.flush();
         
         extent.close();
      
     
		appiumService.stop();
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@BeforeTest
	public void setupDriver() {
		manager = DriverManager.getInstance();
		try {
			manager.startDriver(config);
			//extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
			extent = new ExtentReports ("STMExtentReport.html", true);
		extent
	                .addSystemInfo("Host Name", "Saima Tabassum")
	                .addSystemInfo("Environment", "Zon -Automation Testing")
	                .addSystemInfo("User Name", "Saima");
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
    	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void stopDriver() {
		
	
		try
		{
			 
              
           
		manager.stopDriver();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	/*  1) Enter Code and Login 
	    2) Select Category and form
	    3)  Fill form and Save Draft 
	    4)Edit Draft and Submit
	    5) Open pending form detail info page
	    6) submit form
	    7) moved to submitted tab
	    8) Open submitted form detail info page
	    9) View form 
	    10) Edit form and save draft
	    11) Draft edit and submit
	    12) Open pending submitted form 
	    13) remove submitted form 
	    14) sync form 
	    15) sync role
	    16) sync user 
	    17) settings
	    18) Advance settings 
	    */
	//------------------Forms - Submit Forms --------------------( test 01-10)

	@Test(enabled = true)
	public void Test01() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			appCodePage = new AppCodePage(manager.getDriver(), config.getPlatform());
			formList=new 	FormListPageBlankApp(manager.getDriver(), config.getPlatform());
			tapToLogin = new TapToLoginPage(manager.getDriver(), config.getPlatform());
			loginPage = new LoginPage(manager.getDriver(), config.getPlatform());
			catPage=new CategoryPage(manager.getDriver(), config.getPlatform());
		    form1=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    form2=new AutomationTestForm2(manager.getDriver(), config.getPlatform());
		    form3=new AutomationTestForm3(manager.getDriver(), config.getPlatform());
		    form4=new AutomationTestForm4(manager.getDriver(), config.getPlatform());
		    form5=new AutomationTestForm5(manager.getDriver(), config.getPlatform());
		    form6=new AutomationTestForm6(manager.getDriver(), config.getPlatform());
		    settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
		    advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    extlogger = extent.startTest("Test started");
			//log.info("***********************************************************************************************************************************Entered Username......");
			 log1.debug("DEBBGUG" );
			 log1.debug("DEBBGUG" );
			 log1.debug("DEBBGUG" );
			 log1.debug("DEBBGUG" );	 log.debug("DEBBGUG" );
			 log1.debug("DEBBGUG" );	 log.debug("DEBBGUG" );
			 log1.debug("DEBBGUG" );
				log.info("***********************************************************************************************************************************Entered Username......");
				      log.info("***********************************************************************************************************************************Entered Username......");
			     /* String scrFolder = "C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\ScreenShots\\"
			              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
			                      Calendar.getInstance().getTime()).toString();*/
			      
			      
				      File file4 = new File("app.xml");
						FileInputStream fileInput = new FileInputStream(file4);
						Properties properties = new Properties();
						properties.loadFromXML(fileInput);
					

			
		
       
	 dm=new DatabaseDriver();
		//ResultSet rs1 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto ORDER BY id DESC LIMIT 1;");
		//	ex=new ExcelDriver();
	//	ex.saveQueryResultToExcel(rs1, "auto_output.xls","auto","auto_output.xls", "auto_input.xls" );
         	
			
			
			
		
			
			
			
			
			
			
				      	ResultSet rs11 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto ORDER BY id DESC LIMIT 1;");
			 			ex1=new ExcelDriver1();
			 		ex1.saveQueryResultToExcel(rs11, "auto_output1.xlsx","auto","auto_output1.xlsx", "auto_input.xls",0,2,5 );
			
			
			
			
				
						String appcode = properties.getProperty("appcode");
				
						String username = properties.getProperty("username");
						
						String password = properties.getProperty("password");
							fileInput.close();
						
			 	 String scshot= System.getProperty("user.dir")+"\\ScreenShots\\";
			 	   String scrFolder = scshot
				              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
				                      Calendar.getInstance().getTime()).toString();
			      new File(scrFolder).mkdir();
			      System.setProperty("scr.folder", scrFolder);

		        appCodePage.enterAppCodeAndProceed(appcode);
			 
		    	Thread.sleep(5000);

				loginPage.Login1(username,password);
				Thread.sleep(5000);
				
			
		         	
			         //
			     	/*ResultSet rs1 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto ORDER BY id DESC LIMIT 1;");
			 			ex=new ExcelDriver();
			 		ex.saveQueryResultToExcel(rs1, "auto_output.xls","auto","auto_output.xls", "auto_input.xls",0,2,5 );
			         
			         
			 	  	ResultSet rs2 =dm.db("bgc_qa", "BGC!@#123", "select *  from camera ORDER BY id DESC LIMIT 1;");
		 			ex=new ExcelDriver();
		 		ex.saveQueryResultToExcel(rs2, "auto_output.xls","camera","auto_output.xls", "camera_input.xls",2,2,2 );
		         
		 	 	ResultSet rs3 =dm.db("bgc_qa", "BGC!@#123", "select *  from camera ORDER BY id DESC LIMIT 1;");
	 			ex=new ExcelDriver();
	 		ex.saveQueryResultToExcel(rs3, "auto_output.xls","gallary","auto_output.xls", "gallary_input.xls",2,2,2 );
			         
	 	     
	 	 	ResultSet rs4 =dm.db("bgc_qa", "BGC!@#123", "select *  from testsig  ORDER BY id DESC LIMIT 1;");
 			ex=new ExcelDriver();
 		ex.saveQueryResultToExcel(rs4, "auto_output.xls","signature","auto_output.xls", "signature_input.xls",3 ,2,2);
		         
		         
		
        
ResultSet rs6 =dm.db("bgc_qa", "BGC!@#123", "select *  from upload_datetime_autocom  ORDER BY id DESC LIMIT 1;");
	ex=new ExcelDriver();
ex.saveQueryResultToExcel(rs6, "auto_output.xls","upload_datetime_autocom","auto_output.xls", "upload_datetime_autocom_input.xls",4 ,2,8);
    
      
	           

ResultSet rs7 =dm.db("bgc_qa", "BGC!@#123", "select *  from reppager  ORDER BY id DESC LIMIT 1;");
ex=new ExcelDriver();
ex.saveQueryResultToExcel(rs7, "auto_output.xls","reppager","auto_output.xls", "reppager_input.xls",5,2,2 );


ResultSet rs8 =dm.db("bgc_qa", "BGC!@#123", "select *  from reppager_repeater1  ORDER BY id DESC LIMIT 1;");
ex=new ExcelDriver();
ex.saveQueryResultToExcel(rs8, "auto_output.xls","reppager_repeater1","auto_output.xls", "reppager_repeater1_input.xls",6,2,3 );*/


        
			      /*	ResultSet rs1 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto ORDER BY id DESC LIMIT 1;");
			 			ex1=new ExcelDriver1();
			 		ex1.saveQueryResultToExcel(rs1, "auto_output1.xlsx","auto","auto_output1.xlsx", "auto_input.xls",0,2,5 );
			         
			         
			 	  	ResultSet rs2 =dm.db("bgc_qa", "BGC!@#123", "select *  from camera ORDER BY id DESC LIMIT 1;");
		 			ex1=new ExcelDriver1();
		 		ex1.saveQueryResultToExcel(rs2, "auto_output1.xlsx","camera","auto_output1.xlsx", "camera_input.xls",2,2,2 );
		         
		 	 	ResultSet rs3 =dm.db("bgc_qa", "BGC!@#123", "select *  from camera ORDER BY id DESC LIMIT 1;");
	 			ex1=new ExcelDriver1();
	 		ex1.saveQueryResultToExcel(rs3, "auto_output1.xlsx","gallary","auto_output1.xlsx", "gallary_input.xls",2,2,2 );
			         
	 	     
	 	 	ResultSet rs4 =dm.db("bgc_qa", "BGC!@#123", "select *  from testsig  ORDER BY id DESC LIMIT 1;");
			ex1=new ExcelDriver1();
		ex1.saveQueryResultToExcel(rs4, "auto_output1.xlsx","signature","auto_output1.xlsx", "signature_input.xls",3 ,2,2);
		         
		         
		
     
ResultSet rs6 =dm.db("bgc_qa", "BGC!@#123", "select *  from upload_datetime_autocom  ORDER BY id DESC LIMIT 1;");
	ex1=new ExcelDriver1();
ex1.saveQueryResultToExcel(rs6, "auto_output1.xlsx","upload_datetime_autocom","auto_output1.xlsx", "upload_datetime_autocom_input.xls",4 ,2,8);
 
   
	           

ResultSet rs7 =dm.db("bgc_qa", "BGC!@#123", "select *  from reppager  ORDER BY id DESC LIMIT 1;");
ex1=new ExcelDriver1();
ex1.saveQueryResultToExcel(rs7, "auto_output1.xlsx","reppager","auto_output1.xlsx", "reppager_input.xls",5,2,2 );


ResultSet rs8 =dm.db("bgc_qa", "BGC!@#123", "select *  from reppager_repeater1  ORDER BY id DESC LIMIT 1;");
ex1=new ExcelDriver1();
ex1.saveQueryResultToExcel(rs8, "auto_output1.xlsx","reppager_repeater1","auto_output1.xlsx", "reppager_repeater1_input.xls",6,2,3 );*/

			         
			         
			         
			         
			         
			         
			         
			         
			         
		         																  
															  
															  
															  
					         	
				         	
		         	
		
		String actualValue =form1.findElementByXpath("//android.widget.TextView[@text='dd']").getText();
		        s_assert.assertEquals(actualValue, "dd");
				//Assert.assertTrue(true);
				//To generate the log when the test case is passed
				extlogger.log(LogStatus.PASS, "Test Case Passed is Test01");
				extent.endTest(extlogger);
			
		} catch (Exception e) {

			e.printStackTrace();
            log.error(e);

            StackTraceElement[] stack = e.getStackTrace();
            String exception = "";
            for (StackTraceElement s : stack) {
                exception = exception + s.toString() + "\n";
            }
            log.error(exception);
		}
	}
	
	
	
	

}
