package au.com.miracletek.tests;
import org.testng.Assert;
import java.util.Calendar;
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
			extent = new ExtentReports (System.getProperty("user.dir") +"/STMExtentReport.html", true);
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
			      
			      
				      File file = new File("app.xml");
						FileInputStream fileInput = new FileInputStream(file);
						Properties properties = new Properties();
						properties.loadFromXML(fileInput);
						fileInput.close();

						
			//excel file 
			      File file1 = new File("DatabaseResults.xlsx");
			//String outputDirPath = System.getProperty("user.dir")+"\\DatabaseResults.xlsx";
			FileOutputStream fileOut = new FileOutputStream(file1);
			 FileInputStream inputStream = new FileInputStream(file1);
        //Workbook Workbookexcel =null;
			//Workbookexcel = new XSSFWorkbook(inputStream);
	
		ResultSet rs1 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto;");
			
                
         	   			String fileNameext="DatabaseResults.xlsx";
        
           		//Create Connection to DB		
     						
         int rowtest = 2;
			
			//Find the file extension by splitting  file name in substring and getting only extension name

        String fileExtensionName = fileNameext.substring(fileNameext.indexOf("."));

        //Check condition if the file is xlsx file

        if(fileExtensionName.equals(".xlsx")){

        //If it is xlsx file then create object of XSSFWorkbook class
XSSFWorkbook Workbookexcel = new XSSFWorkbook(inputStream);
			XSSFSheet personSheet = Workbookexcel.getSheet("auto");
		
				int rowCount = personSheet.getLastRowNum()-personSheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = personSheet.getRow(0);

    //Create a new row and append it at last of sheet

   
Row headerRow = personSheet.createRow(1);
Cell headercell0 = headerRow.createCell(0);
Cell headercell1 = headerRow.createCell(1);
Cell headercell2 = headerRow.createCell(2);
Cell headercell3 = headerRow.createCell(3);
Cell headercell4 = headerRow.createCell(4);			
         		// While Loop to iterate through all data and print results		
				while (rs1.next()){
			        		String a= rs1.getString(0);								        
                            String b= rs1.getString(1);
					String c= rs1.getString(2);								        
                            String d= rs1.getString(3);
String e= rs1.getString(4);								        
                          
					
					
					
				Row dataRow = personSheet.createRow(rowtest);

    Cell Cell1 = dataRow.createCell(0);
    Cell1.setCellValue(a);

    Cell Cell2 = dataRow.createCell(1);
   Cell2.setCellValue(b);
					
   Cell Cell3 = dataRow.createCell(2);
    Cell3.setCellValue(c);
					   Cell Cell4 = dataRow.createCell(3);
    Cell4.setCellValue(d);
					Cell Cell5 = dataRow.createCell(4);
    Cell5.setCellValue(e);
    rowtest = rowtest + 1;	
                            //System.out.println(myName+"  "+myAge);
					
					
				
					
					
					
                    }	
			 Workbookexcel.write(fileOut);
      			 	
			fileOut.close();

        }

        //Check condition if the file is xls file

        else if(fileExtensionName.equals(".xls")){

            //If it is xls file then create object of XSSFWorkbook class

    HSSFWorkbook      Workbookexcel = new HSSFWorkbook(inputStream);
  HSSFSheet personSheet = Workbookexcel.getSheet("auto");
		
				int rowCount = personSheet.getLastRowNum()-personSheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = personSheet.getRow(0);

    //Create a new row and append it at last of sheet

   
Row headerRow = personSheet.createRow(1);
Cell headercell0 = headerRow.createCell(0);
Cell headercell1 = headerRow.createCell(1);
Cell headercell2 = headerRow.createCell(2);
Cell headercell3 = headerRow.createCell(3);
Cell headercell4 = headerRow.createCell(4);			
         		// While Loop to iterate through all data and print results		
				while (rs1.next()){
			        		String a= rs1.getString(0);								        
                            String b= rs1.getString(1);
					String c= rs1.getString(2);								        
                            String d= rs1.getString(3);
String e= rs1.getString(4);								        
                          
					
					
					
				Row dataRow = personSheet.createRow(rowtest);

    Cell Cell1 = dataRow.createCell(0);
    Cell1.setCellValue(a);

    Cell Cell2 = dataRow.createCell(1);
   Cell2.setCellValue(b);
					
   Cell Cell3 = dataRow.createCell(2);
    Cell3.setCellValue(c);
					   Cell Cell4 = dataRow.createCell(3);
    Cell4.setCellValue(d);
					Cell Cell5 = dataRow.createCell(4);
    Cell5.setCellValue(e);
    rowtest = rowtest + 1;	
                            //System.out.println(myName+"  "+myAge);
					
		Workbookexcel.write(fileOut);
      			 	
			fileOut.close();			
				
					
					
					
                    }	
			 Workbookexcel.write(fileOut);
      			 	
			fileOut.close();
        }

        
			
			//Sheet personSheet = Workbookexcel.getSheet("auto");
			/*int rowCount = personSheet.getLastRowNum()-personSheet.getFirstRowNum();

    //Get the first row from the sheet

    Row row = personSheet.getRow(0);

    //Create a new row and append it at last of sheet

   
Row headerRow = personSheet.createRow(1);
Cell headercell0 = headerRow.createCell(0);
Cell headercell1 = headerRow.createCell(1);
Cell headercell2 = headerRow.createCell(2);
Cell headercell3 = headerRow.createCell(3);
Cell headercell4 = headerRow.createCell(4);			
         		// While Loop to iterate through all data and print results		
				while (rs1.next()){
			        		String a= rs1.getString(0);								        
                            String b= rs1.getString(1);
					String c= rs1.getString(2);								        
                            String d= rs1.getString(3);
String e= rs1.getString(4);								        
                          
					
					
					
				Row dataRow = personSheet.createRow(rowtest);

    Cell Cell1 = dataRow.createCell(0);
    Cell1.setCellValue(a);

    Cell Cell2 = dataRow.createCell(1);
   Cell2.setCellValue(b);
					
   Cell Cell3 = dataRow.createCell(2);
    Cell3.setCellValue(c);
					   Cell Cell4 = dataRow.createCell(3);
    Cell4.setCellValue(d);
					Cell Cell5 = dataRow.createCell(4);
    Cell5.setCellValue(e);
    rowtest = rowtest + 1;	
                            //System.out.println(myName+"  "+myAge);
					
					
				
					
					
					
                    }	
			 Workbookexcel.write(fileOut);
      			 	
			fileOut.close();*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
						String appcode = properties.getProperty("appcode");
						
						String username = properties.getProperty("username");
						
						String password = properties.getProperty("password");
						
						
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
				
			
				
				form1.waitForVisibilityOf(By.xpath("//android.widget.TextView[@text='test']"));
			    catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
			  	
			  	
			  	
			  	
		        formList.selectForm("auto",config);//  Label , TextBox,  Segmented 
		        Thread.sleep(3000);
	            form1.fillForm(config);
	            form1.submit();
	          
	          
	          
	            Thread.sleep(2000);
		        formList.selectForm("camera",config);//  camera
		        Thread.sleep(3000);
	            form2.fillForm(config);
	            form2.scrollToText("Label");
	    		form2.submit();
	          
	    	
	    	  	Thread.sleep(2000);
	    		  formList.selectForm("gallery",config);//gallary 
	  	        Thread.sleep(3000);
	  	     	form3.takescreenshot1();
	              form3.fillForm(config);
	          	Thread.sleep(5000);
	              form2.scrollToText("Label");
	          	Thread.sleep(5000);
	              form3.annotation(config);
	          	Thread.sleep(5000);
	          	   form2.scrollToText("Label");
	      		form3.submit();
	      		
	          
	     	  	Thread.sleep(2000);
	          
	          
	         
	          
	     	  
		        formList.selectForm("sig",config);//signature
		    	Thread.sleep(2000);
		        form4.clickSign();
		       form4.signature(config);
		     
		        Thread.sleep(7000);
		        form4.save(config);
		        form4.submit();
	      
		         	
		      //------------------date time pciker , file uplloader , auto compelte ------------------
		        
		        
		        
		        formList.selectForm("dtimeupAuto",config);
		        Thread.sleep(6000);
                 form5.clickDatePicker(config, "datepicker1");
	
			    form5.Date(config,"Apr","03","2018");
			    Thread.sleep(3000);
				form5.ok();
			      Thread.sleep(3000);
			        form5.clickTimePicker(config, "timepicker1");
			 
			        form5.Time(config,"3","22","PM");
					form5.ok();
				    Thread.sleep(3000);
				
				
				
				
				form5.clickDateTimePickerDate(config, "datetimepicker1");
			    Thread.sleep(3000);
			    form5.Date(config,"Jan","03","2018");
			    Thread.sleep(6000);
				form5.ok();
		//
				form5.clickDateTimePickerTime(config, "datetimepicker1");
			        Thread.sleep(3000);
			    form5.Time(config,"3","22","AM");
				form5.ok();
			 
			    Thread.sleep(3000);
	      
	      
		         form5.fileUploader("Photos","1","Camera","Photo taken on Sep 23, 2016 10:18:52 AM");//file uploader
		         			    Thread.sleep(3000);
		             form5.autoComplete(config,"autocomplete1");
		        Thread.sleep(6000);
		        
		        form5.clickslider(config);
		        form5.clickswitch(config,"switch1","0");
		         form5.submit();   
		        
		        // repeater pager
		        
		         Thread.sleep(2000);
				        formList.selectForm("reppager",config);
		        
		         formList.selectForm("reppager",config);
		        
		        
		        
		         form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","0","switch1");
			        Thread.sleep(3000);
			    	
			        form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","1","switch1");
			        form6.clickTab(config, "Tab1");
	              form6.clicktextbox(config, "textbox1");
	              form6.clickTab(config, "Tab");
			         form6.submit();
		         	
		         	
			         Thread.sleep(2000);    
		         	
			         formList.selectForm("auto",config);   // check save draft icon  on  form level 
				        Thread.sleep(3000);
				   	form1.takescreenshotAndroid();
			          form1.fillForm(config);
			        	form1.saveDraft();
			        
						form1.navigateUp(config);
				         	form1.navigateUp(config);
				         	
				         	
				         	shell.clickSync(config);   // sync all forms 
				         	Thread.sleep(3000);
				         	sync.syncForms("1", config);
					        
				         	
				      
				         	WebDriverWait wait = new WebDriverWait(manager.getDriver(), 300);
				         	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@index='1']//following-sibling::*/*[@content-desc='buttonPendingId']")));
				        	Thread.sleep(3000);
					        sync.openPendingSubmittedForms("1", config);
					    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Submitted']")));
							
					        
					        
			
					        subQueue.clickonsubmittedTab(config);

					        subQueue.opensubmittedDetailInfoPage("1",config);
						    Thread.sleep(3000); 
						
						    
						    form1.navigateUp(config);
						    
						    
						    
						    // view al submitted forms and take snapshot 
						    
						    subQueue.ViewsubmittedForms("1",config);
						    Thread.sleep(3000);
						
							form1.takescreenshotAndroid();
				         	
				         	form1.navigateUp(config);
				         	
						    subQueue.ViewsubmittedForms("2",config);
						    Thread.sleep(3000);
						
							form1.takescreenshotAndroid();
				         	
				         	form1.navigateUp(config);
				         	
							 subQueue.ViewsubmittedForms("3",config);
							    Thread.sleep(3000);
							
								form1.takescreenshotAndroid();
					         	
					         	form1.navigateUp(config);
				         	
					       	 subQueue.ViewsubmittedForms("4",config);
							    Thread.sleep(3000);
							
								form1.takescreenshotAndroid();
					         	
					         	form1.navigateUp(config);
					         	
					         	
					         	
						       	 subQueue.ViewsubmittedForms("5",config);
								    Thread.sleep(3000);
								
									form1.takescreenshotAndroid();
						         	
						         	form1.navigateUp(config);
						         	
						         	
						         	
							       	 subQueue.ViewsubmittedForms("6",config);
									    Thread.sleep(3000);
									
										form1.takescreenshotAndroid();
							         	
							         	form1.navigateUp(config);
							         	
							         	
							         	 Thread.sleep(3000);
					         	
					         	// Edit all forms and save form one by one in draft 
							         	
							         	
							         	
							         	 subQueue.editSubmittedForm("1",config);
							 		    
							     		
							 			form1.saveDraft();
							         	
							         	form1.navigateUp(config);
							         	
							 		   	 subQueue.editSubmittedForm("2",config);
								 		    
								     		
								 			form1.saveDraft();
							         	
								         	form1.navigateUp(config);
								         	
								 	    	
								 		   	 subQueue.editSubmittedForm("3",config);
									 		    
									     		
									 			form1.saveDraft();
								         	
									         	form1.navigateUp(config);
									         	
					         	
									         	
									 	    	
									 		   	 subQueue.editSubmittedForm("4",config);
										 		    
										     		
										 			form1.saveDraft();
					         	
					         	
										         	form1.navigateUp(config);
										         	
										         	
										 	    	
										 		   	 subQueue.editSubmittedForm("5",config);
											 		    
											     		
											 			form1.saveDraft();
					         	
											         	form1.navigateUp(config);
											         	
											         	
											 	    	
											 		   	 subQueue.editSubmittedForm("6",config);
												 		    
												     		
												 			form1.saveDraft();
					         	
												         	form1.navigateUp(config);
												         	
												         	
												      // delete  form from submitted forms 
												         	
												         	
												         	
												         	  subQueue.removeSubmittedForm("1",config);
												  	        subQueue.popup1("Yes"); 	
												  
															
												         	
												  	      subQueue.removeAllSubmittedForm("1",config);
												  	  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Yes']")));
											         	
												  	      
												  	        subQueue.popup("Yes"); 	
												         	
														    Thread.sleep(3000);
															
												         	

												         	form1.navigateUp(config);
												         	
												         	
												         	//perform syncing of all entiteis 
												         	 Thread.sleep(3000);
												 		    sync.syncRole("2",config);
												         	
												         	
												         	
												 		    Thread.sleep(3000);
														    sync.syncUser("3",config);
												         	
													    	form1.navigateUp(config);
												         	
															shell.clickDrafts(config);  //drafts 
												         	
															drafts.Edit("1",config);
															form1.submit(); 
															
													      	 Thread.sleep(3000);
															
															drafts.Edit("2",config);
															form3.submit(); 
															
															
												         	
														    Thread.sleep(3000);
															drafts.Edit("3",config);// eidt and save draft
															form1.saveDraft();
															form1.navigateUp(config);
												         	
														    Thread.sleep(3000);
															drafts.Remove("3",config); //remove
															  subQueue.popup1("Yes"); 
												         	form1.navigateUp(config);
												        	
												         	shell.clickSync(config);   // sync all forms 
													        Thread.sleep(3000);
												         	
												         	
												         	
													        sync.openPendingSubmittedForms("1",config);
														    Thread.sleep(3000); 
													
														    subQueue.openPendingDetailInfoPage("1",config);
														    Thread.sleep(3000);
												         	form1.navigateUp(config);
														    subQueue.submitPendingForm("2",config);
														    Thread.sleep(3000);
														    subQueue.RemovePendingForm("1", config);
															  subQueue.popup1("Yes"); 
															  
															  
															  //settings 
															  
															  
															  
															  
															  form1.navigateUp(config);
															  form1.navigateUp(config);
															     Thread.sleep(2000);
															   shell.clickSettings(config);
															    Thread.sleep(3000);
															    settings.clickAdvanced();   
															 	advSettings.SelectPageToUpdateAndroid("2",config);
															 	advSettings.updateSelectedPage();
															  
															    Thread.sleep(3000);
															    advSettings.updateMetaData();
															  
																Thread.sleep(4000);
																
															    form1.navigateUp(config);
																settings.updateApp();
																settings.clickProceedAndroid();
															
																
																		Thread.sleep(5000);
											
															    Thread.sleep(5000);
															  
				AndroidDriver<MobileElement>   d=((AndroidDriver<MobileElement>)manager.getDriver());
		    	d.setConnection(Connection.AIRPLANE);
		    										    //offline login 
															    
				shell.clickSettings(config);
																settings.Logout();
																settings.sureLogout(config);
															//	AndroidDriver  d=((AndroidDriver<MobileElement>)manager.getDriver());
														    //	d.setConnection(Connection.NONE);
														    	
														    	

															    Thread.sleep(5000);
														    	
																loginPage.Login1("abc","abc");
												AndroidDriver  d1=((AndroidDriver<MobileElement>)manager.getDriver());
															  	d1.setConnection(Connection.ALL);
															  	Thread.sleep(3000);
																
															    
															    
															    
															    
															    
																 log.debug("DEBBGUG" );	 log.debug("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );
															    
															    
															    
															    
															    
															    
																extlogger.log(LogStatus.PASS, "Test Cases");
															  
															  
															  
													//notificaiton , my tasks , pull to refresh , search ,scrol ,  offline user login , logging , screenshot , report running , try catch assertion if possible 	  
															  
															  
															  //searhc , my tasks ,  offline user logging
															  
															  
															  
															  
					         	
				         	
		         	
		
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
