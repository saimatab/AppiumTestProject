package au.com.miracletek.tests;
import org.testng.Assert;
import java.util.Calendar;
import java.io.FileWriter;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.html5.*;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.DataFormatter;
import java.lang.Object;
import java.net.URL;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import java.util.Properties;
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
import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.remote.DesiredCapabilities;
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
import au.com.miracletek.pages.Mytasks;
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
	Mytasks mytask;

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
			appCodePage= new AppCodePage(manager.getDriver(), config.getPlatform());
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			drafts=new DraftsPage(manager.getDriver(), config.getPlatform());
			tapToLogin=new TapToLoginPage(manager.getDriver(), config.getPlatform());
			loginPage= new LoginPage(manager.getDriver(), config.getPlatform());
			catPage=new CategoryPage(manager.getDriver(), config.getPlatform());
			formList=new 	FormListPageBlankApp(manager.getDriver(), config.getPlatform());
			form1=new AutomationTestForm(manager.getDriver(), config.getPlatform());
			form2=new AutomationTestForm2(manager.getDriver(), config.getPlatform());
			form3=new AutomationTestForm3(manager.getDriver(), config.getPlatform());
			form4=new AutomationTestForm4(manager.getDriver(), config.getPlatform());
			form5=new AutomationTestForm5(manager.getDriver(), config.getPlatform());
			form6=new AutomationTestForm6(manager.getDriver(), config.getPlatform());
			sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());;
			subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			settings=new SettingsPage(manager.getDriver(), config.getPlatform());;
			advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
			notify  =new 	NotificationsPage(manager.getDriver(), config.getPlatform());
			mytask=new  Mytasks(manager.getDriver(), config.getPlatform());


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

			extlogger = extent.startTest("Test started Enter app code and login to app and Go to category ");
			
			log1.debug("DEBBGUG" );

			log.info("***********************************************************************************************************************************Entered Username......");
			/* String scrFolder = "C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\ScreenShots\\"
			              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
			                      Calendar.getInstance().getTime()).toString();*/
			File file4 = new File("app.xml");
			FileInputStream fileInput = new FileInputStream(file4);
			Properties properties = new Properties();
			properties.loadFromXML(fileInput);
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
			Thread.sleep(5000);
			appCodePage.enterAppCodeAndProceed(appcode);
			Thread.sleep(8000);
			loginPage.Login1(username,password);
			Thread.sleep(5000);
			form1.waitForVisibilityOf(By.xpath("//android.widget.TextView[@text='test']"));
			catPage.selectCategoryListView("test",config);
			Thread.sleep(2000);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test01");

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



	@Test(enabled = false)
	public void Test02() {
		try {
			extlogger = extent.startTest("Test 02 started-Form submission  with Label, Textbox, Segment");
			log1.debug("DEBBGUG" );
			log.info("***********************************************************************************************************************************Entered Username......");
			formList.selectForm("auto",config);//  Label , TextBox,  Segmented 
			Thread.sleep(3000);
			form1.fillForm(config);
			form1.submit();
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test02");


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



	@Test(enabled = false)
	public void Test03(){

		try{
			extlogger = extent.startTest("Test 03 started-Form submission  with camera");
			Thread.sleep(2000);
			formList.selectForm("camera",config);//  camera
			Thread.sleep(3000);
			form2.fillForm(config);
			form2.scrollToText("Label");
			form2.submit();

			extlogger.log(LogStatus.PASS, "Test Case Passed is Test03");


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


	@Test(enabled = false)
	public void Test04(){

		try{
			extlogger = extent.startTest("Test 04 started-Form submission  with gallary ");
			log.info("***********************************************************************************************************************************Entered Username......");
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
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test04");  
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


	@Test(enabled = false)
	public void Test05(){

		try{
			extlogger = extent.startTest("Test 05 started-Form submission  with signature ");
			Thread.sleep(2000);
			formList.selectForm("sig",config);//signature
			Thread.sleep(2000);
			form4.clickSign();
			form4.signature(config);
			Thread.sleep(7000);
			form4.save(config);
			form4.submit();
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test05");  
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



	@Test(enabled = false)
	public void Test06(){

		try{
			extlogger = extent.startTest("Test 06 started-Form submission  with datetimepicker,fileuploader,auto complete ");

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
			//  formList.selectForm("dtimeupAuto",config);
			form5.clickslider(config);
			Thread.sleep(3000);
			form5.clickswitch(config,"switch1","0");
			Thread.sleep(3000);
			form5.submit();   
            Thread.sleep(2000);
			formList.selectForm("reppager",config);
			form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","0","switch1");
			Thread.sleep(3000);
			form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","1","switch1");
			form6.clickTab(config, "Tab1");
			form6.clicktextbox(config, "textbox1");
			form6.clickTab(config, "Tab");
			form6.submit();
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test06");  


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


	@Test(enabled = false)
	public void Test07(){

		try{
			extlogger = extent.startTest("Test 07 started-Form save draft icon ");
			Thread.sleep(2000);    
			formList.selectForm("auto",config);   // check save draft icon  on  form level 
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.fillForm(config);
			form1.saveDraft();
			form1.navigateUp(config);
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test07");  


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

	@Test(enabled = false)
	public void Test08(){

		try{
			extlogger = extent.startTest("Test 08 started sync allforms ");
			shell.clickSync(config);   // sync all forms 
			Thread.sleep(3000);
			sync.syncForms("1", config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test08");  


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

	@Test(enabled = false)
	public void Test09(){

		try{
			extlogger = extent.startTest("Test 09 started  open pending submitted forms  ");
			WebDriverWait wait4 = new WebDriverWait(manager.getDriver(), 300);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.LinearLayout[@index='1']//following-sibling::*/*[@content-desc='buttonPendingId']")));
			Thread.sleep(3000);
			sync.openPendingSubmittedForms("1", config);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Submitted']")));
			subQueue.clickonsubmittedTab(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test09");  


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


	@Test(enabled = false)
	public void Test10(){

		try{
			extlogger = extent.startTest("Test 09 started open detail info page rep_pager form  ");

			subQueue.opensubmittedDetailInfoPage("1",config);
			Thread.sleep(3000); 
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test10");  


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


	@Test(enabled = false)
	public void Test11(){

		try{
			extlogger = extent.startTest("Test 11 started open view submitted rep_pager form and take snapshot   ");
			subQueue.ViewsubmittedForms("1",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test11");  


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

	@Test(enabled = false)
	public void Test12(){

		try{
			extlogger = extent.startTest("Test 12  started open view submitted datetime form and take snapshot   ");

			subQueue.ViewsubmittedForms("2",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test12");  


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

	@Test(enabled = false)
	public void Test13(){

		try{
			extlogger = extent.startTest("Test 13 started open view submitted datetime form and take snapshot   ");

			subQueue.ViewsubmittedForms("2",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test13");  


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


	@Test(enabled = false)
	public void Test14(){

		try{
			extlogger = extent.startTest("Test 14 started open view submitted signature form and take snapshot   ");

			subQueue.ViewsubmittedForms("3",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test14");  


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

	@Test(enabled = false)
	public void Test15(){

		try{
			extlogger = extent.startTest("Test 15 started open view submitted gallary form and take snapshot   ");

			subQueue.ViewsubmittedForms("4",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test15");  


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

	@Test(enabled = false)
	public void Test16(){

		try{
			extlogger = extent.startTest("Test 16 started open view submitted camera form and take snapshot   ");
			subQueue.ViewsubmittedForms("5",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test16");  


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


	@Test(enabled = false)
	public void Test17(){

		try{
			extlogger = extent.startTest("Test 17 started open view submitted label ,segment control form and take snapshot    ");
			subQueue.ViewsubmittedForms("6",config);
			Thread.sleep(3000);
			form1.takescreenshotAndroid();
			form1.navigateUp(config);
			Thread.sleep(3000);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test17");  


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

	@Test(enabled = false)
	public void Test18(){

		try{
			extlogger = extent.startTest("Test 18 edit rep pager form  started  ");
			subQueue.editSubmittedForm("1",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test18");  

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


	@Test(enabled = false)
	public void Test19(){

		try{
			extlogger = extent.startTest("Test 19 edit date time form started   ");
			subQueue.editSubmittedForm("2",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test19 ");  


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

	@Test(enabled = false)
	public void Test20(){

		try{
			extlogger = extent.startTest("Test 20 edit signature form   started ");
			subQueue.editSubmittedForm("3",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test20");  


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


	@Test(enabled = false)
	public void Test21(){

		try{
			extlogger = extent.startTest("Test 21 edit gallary  form started   ");
			subQueue.editSubmittedForm("4",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test21");  


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



	@Test(enabled = false)
	public void Test22(){

		try{
			extlogger = extent.startTest("Test 22 edit camera  form  started  ");
			subQueue.editSubmittedForm("5",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test22");  


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

	@Test(enabled = false)
	public void Test23(){

		try{
			extlogger = extent.startTest("Test 23 edit label textbox  form ans save as draft started  ");
			subQueue.editSubmittedForm("6",config);
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test23");  


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


	@Test(enabled = false)
	public void Test24(){

		try{
			extlogger = extent.startTest("Test 24 delete rep page form started  ");
			subQueue.removeSubmittedForm("1",config);
			subQueue.popup1("Yes"); 	
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test24");  


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

	@Test(enabled = false)
	public void Test25(){

		try{
			extlogger = extent.startTest("Test 25 remove all submitted forms started  ");

			WebDriverWait wait4 = new WebDriverWait(manager.getDriver(), 300);
			subQueue.removeAllSubmittedForm("1",config);
			wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Yes']")));
			subQueue.popup("Yes"); 	
			Thread.sleep(3000);
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test25");  


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


	@Test(enabled = false)
	public void Test26(){

		try{
			extlogger = extent.startTest("Test 25 sync role started  ");
			Thread.sleep(3000);
			sync.syncRole("3",config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test25");  


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


	@Test(enabled = false)
	public void Test27(){

		try{
			extlogger = extent.startTest("Test 27 sync user started  ");
			Thread.sleep(3000);
			sync.syncUser("4",config);
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test27");  


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


	@Test(enabled = false)
	public void Test28(){

		try{
			extlogger = extent.startTest("Test 28  started got to draft and edit and submit a form  ");
			shell.clickDrafts(config);  //drafts 
			drafts.Edit("1",config);
			form1.submit(); 
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test28");  


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

	@Test(enabled = false)
	public void Test29(){

		try{
			extlogger = extent.startTest("Test 29  started got to draft and edit another form and submit a form  ");
			Thread.sleep(3000);
			drafts.Edit("2",config);
			form3.submit(); 
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test29");  


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

	@Test(enabled = false)
	public void Test30(){

		try{
			extlogger = extent.startTest("Test 29  started got to draft and edit and save draft from draft icon  ");
			Thread.sleep(3000);
			drafts.Edit("3",config);// eidt and save draft
			form1.saveDraft();
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test30");  
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


	@Test(enabled = false)
	public void Test31(){

		try{
			extlogger = extent.startTest("Test 31  started remove a form from draft  ");
			Thread.sleep(3000);
			drafts.Remove("3",config); //remove
			subQueue.popup1("Yes"); 
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test31");  


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


	@Test(enabled = false)
	public void Test32(){

		try{
			extlogger = extent.startTest("Test 32 started click advance settings/ update page   ");

			Thread.sleep(2000);
			shell.clickSettings(config);
			Thread.sleep(3000);
			settings.clickAdvanced();   
			advSettings.SelectPageToUpdateAndroid("2",config);
			advSettings.updateSelectedPage();
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test32");  
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

	@Test(enabled = false)
	public void Test33(){

		try{
			extlogger = extent.startTest("Test 33 started click advance settings/ update meta data    ");
			Thread.sleep(3000);
			advSettings.updateMetaData();
			Thread.sleep(4000);
			form1.navigateUp(config);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test33");  


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


	@Test(enabled = false)
	public void Test34(){

		try{
			extlogger = extent.startTest("Test 34 started click update app   ");
			settings.updateApp();
			settings.clickProceedAndroid();
			Thread.sleep(5000);
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test34");  


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

	@Test(enabled = false)
	public void Test35(){

		try{
			extlogger = extent.startTest("Test 35 started offline relogin   ");
			Thread.sleep(5000);
			AndroidDriver<MobileElement>   d=((AndroidDriver<MobileElement>)manager.getDriver());
			d.setConnection(Connection.AIRPLANE);
			//offline login 
			settings.Logout();
			settings.sureLogout(config);
			//	AndroidDriver  d=((AndroidDriver<MobileElement>)manager.getDriver());
			//	d.setConnection(Connection.NONE);
			Thread.sleep(5000);

			loginPage.Login1("abc","abc");
			AndroidDriver  d1=((AndroidDriver<MobileElement>)manager.getDriver());
			d1.setConnection(Connection.ALL);
			Thread.sleep(3000);

			log.debug("DEBBGUG" );						
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test35");  


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


	@Test(enabled = false)
	public void Test36(){

		try{
			extlogger = extent.startTest("Test 36 database verification  ");

			dm=new DatabaseDriver();
			ResultSet rs11 =dm.db("bgc_qa", "BGC!@#123", "select *  from auto ORDER BY id DESC LIMIT 1;");
			ResultSet rs21 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.camera ORDER BY id DESC LIMIT 1;");
			ResultSet rs21a =dm.db("bgc_qa", "BGC!@#123", "select ID  from bgc_qa.camera ORDER BY id DESC LIMIT 1;");
			ResultSet rs21b =dm.db("bgc_qa", "BGC!@#123", "SELECT imagepicker1 FROM bgc_qa.camera  ORDER BY id DESC LIMIT 1;");
			ResultSet rs31 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.gallary ORDER BY id DESC LIMIT 1;");
			ResultSet rs31a =dm.db("bgc_qa", "BGC!@#123", "select ID  from bgc_qa.gallary ORDER BY id DESC LIMIT 1;");
			ResultSet rs31b =dm.db("bgc_qa", "BGC!@#123", "SELECT imagepicker1 FROM bgc_qa.gallary  ORDER BY id DESC LIMIT 1;");
			ResultSet rs41 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.testsig ORDER BY id DESC LIMIT 1;");
			ResultSet rs41a =dm.db("bgc_qa", "BGC!@#123", "select ID  from bgc_qa.testsig ORDER BY id DESC LIMIT 1;");
			ResultSet rs41b =dm.db("bgc_qa", "BGC!@#123", "SELECT signature1 FROM bgc_qa.testsig  ORDER BY id DESC LIMIT 1;");
			ResultSet rs61 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.upload_datetime_autocom ORDER BY id DESC LIMIT 1;");
			ResultSet rs61a =dm.db("bgc_qa", "BGC!@#123", "select ID,datepicker1,timepicker1,datetimepicker1,autocomplete1,switch1,slider1  from bgc_qa.upload_datetime_autocom ORDER BY id DESC LIMIT 1;");
			ResultSet rs61b =dm.db("bgc_qa", "BGC!@#123", "SELECT uploader1 FROM bgc_qa.upload_datetime_autocom  ORDER BY id DESC LIMIT 1;");
			ResultSet rs7 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.reppager  ORDER BY id DESC LIMIT 1;");
			ResultSet rs8 =dm.db("bgc_qa", "BGC!@#123", "select *  from bgc_qa.reppager_repeater1  ORDER BY id DESC LIMIT 1;");
			ex1=new ExcelDriver1();
			ex1.saveQueryResultToExcel(rs11,rs21,rs21a,rs21b,rs31,rs31a,rs31b,rs41,rs41a,rs41b,rs61,rs61a,rs61b,rs7,rs8, "SAMPLE.xlsx","auto","SAMPLE.xlsx", "auto_input.xlsx",0,2,5 );
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test36");  
			String actualValue =form1.findElementByXpath("//android.widget.TextView[@text='dd']").getText();
			s_assert.assertEquals(actualValue, "dd");

		

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

	@Test(enabled = false)
	public void Test37(){

		try{
			extlogger = extent.startTest("Test 37 started searching functionality   ");
			shell.clickSearch(config);
			form1.waitForVisibilityOf(By.xpath("//android.widget.EditText[@text='Search']")).sendKeys("re");;
			form6.findElementByXpath("//android.widget.TextView[@text='" + Constants.repager+ "']").click();
			form6.navigateUp(config);
			form6.findElementByXpath("//android.widget.Button[@index='0']").click();
			MobileElement btn_category=form6.findElementByXpath("//android.widget.TextView[@text='test']");
			btn_category.click();
			form6.waitForVisibilityOf(By.xpath("//android.widget.EditText[@text='Search']")).sendKeys("re");

			form6.findElementByXpath("//android.widget.TextView[@text='" + Constants.repager+ "']").click();
			form6.navigateUp(config);			

			form6.navigateUp(config);									    
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test37");  

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

	@Test(enabled = true)
	public void Test38(){

		try{
			extlogger = extent.startTest("Test 38 started creating  My task and Push notification creation from studio   ");
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\stabassum\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
			  System.setProperty("phantomjs.binary.path","C:\\Users\\stabassum\\Documents\\GitHub\\aa\\phantomjs-2.1.1-windows-x86-workaround_issue_394\\phantomjs.exe");
				
			WebDriver driver3 ;
			//URL url = new URL("http://192.168.9.149:5556/wd/hub");
			//http://192.168.9.149:5556/wd/hub
			DesiredCapabilities capabilities= DesiredCapabilities.firefox();
			/*capabilities.setBrowserName("firefox");
			capabilities.setPlatform(Platform.ANY);
			capabilities.setCapability("marionette", true);*/
			
			capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\stabassum\\Documents\\GitHub\\aa\\phantomjs.exe");
			capabilities.setBrowserName("phantomjs");
			capabilities.setPlatform(Platform.ANY);
				
			//driver3 = new RemoteWebDriver(url,
					//capabilities);
			
			
			 driver3 = new PhantomJSDriver(capabilities);
			
	 			URL url = new URL("http://192.168.9.149:5557/wd/hub");
				driver3 = new RemoteWebDriver(url,
						capabilities);
			
			
			
			
			
			driver3.manage().window().maximize();
			driver3.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver3.get("https://admin.miracletek.co/admin/1.1/");
			driver3.findElement(By.id("Email")).click();
			driver3.findElement(By.id("Email")).clear();
			driver3.findElement(By.id("Email")).sendKeys("saima.tabassum+11@miracletek.com.au");
			driver3.findElement(By.id("Password")).clear();
			driver3.findElement(By.id("Password")).sendKeys("Goodluck1@");
			driver3.findElement(By.cssSelector("button.btn.btn-primary")).click();
			Thread.sleep(8000);
		    driver3.findElement(By.xpath("//div[@id='sidebar']/div[2]/div/ul/li/a/i")).click();
		    driver3.findElement(By.linkText("Automation")).click();
			/* String appiumlog1= System.getProperty("user.dir")+"\\simpbulk.csv";

						    //driver3.findElement(By.id("templateFile")).clear();
						    driver3.findElement(By.id("templateFile")).sendKeys(appiumlog1);
						    Thread.sleep(8000);
						    driver3.findElement(By.xpath("(//button[@type='button'])[3]")).click();
						    Thread.sleep(8000);*/
			Thread.sleep(8000);
			driver3.findElement(By.xpath(".//*[@id='item_Tasks']/span")).click();
			Thread.sleep(8000);
			driver3.findElement(By.id("createNewButton")).click();
			Thread.sleep(8000);
			//  driver3.findElement(By.id("taskName")).clear();
			driver3.findElement(By.id("taskName")).sendKeys("simple1");
			Thread.sleep(4000);
			driver3.findElement(By.cssSelector("input.tt-input")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("input.tt-input[autocomplete=off]")).sendKeys("a");
			Thread.sleep(3000);
			driver3.findElement(By.xpath(".//*[@id='pageEditView']/div[2]/form/div[2]/div/span/div/div/div")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("SimpleTaskRadio")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("taskDescription")).clear();
			Thread.sleep(3000);
			driver3.findElement(By.id("taskDescription")).sendKeys("simple1");
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("div.form-footer > button.btn.btn-primary")).click();
			Thread.sleep(8000);
			driver3.findElement(By.id("createNewButton")).click();
			Thread.sleep(8000);
			driver3.findElement(By.id("taskName")).sendKeys("simple2");
			Thread.sleep(4000);
			driver3.findElement(By.cssSelector("input.tt-input")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("input.tt-input[autocomplete=off]")).sendKeys("a");
			Thread.sleep(3000);
			driver3.findElement(By.xpath(".//*[@id='pageEditView']/div[2]/form/div[2]/div/span/div/div/div")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("SimpleTaskRadio")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("taskDescription")).clear();
			Thread.sleep(3000);
			driver3.findElement(By.id("taskDescription")).sendKeys("simple2");
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("div.form-footer > button.btn.btn-primary")).click();
			Thread.sleep(8000);
			driver3.findElement(By.id("createNewButton")).click();
			Thread.sleep(4000);
			driver3.findElement(By.id("taskName")).sendKeys("form");
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("input.tt-input[autocomplete=off]")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("input.tt-input[autocomplete=off]")).sendKeys("a");
			Thread.sleep(3000);
			driver3.findElement(By.xpath(".//*[@id='pageEditView']/div[2]/form/div[2]/div/span/div/div/div")).click();
			Thread.sleep(3000);
			//driver3.findElement(By.id("FormSelectionRadio")).click();
		    driver3.findElement(By.id("attachForm")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("span.select2-arrow")).click();
			Thread.sleep(3000);
			new Select(driver3.findElement(By.id("formSelectionInput"))).selectByVisibleText("auto");
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("div.form-footer > button.btn.btn-primary")).click();	
			Thread.sleep(8000);

						       /*driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.cssSelector("a.btn.uploadCSV > #text")).click();
    driver.findElement(By.id("bulkTaskFile")).clear();
    driver.findElement(By.id("bulkTaskFile")).sendKeys("C:\\Users\\stabassum\\Desktop\\\\simpbulk.csv");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Back")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    driver.findElement(By.cssSelector("a.btn.uploadCSV > #text")).click();
    driver.findElement(By.id("bulkTaskFile")).clear();
    driver.findElement(By.id("bulkTaskFile")).sendKeys("C:\\Users\\stabassum\\Desktop\\formbulk.csv");
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Back")).click();  Thread.sleep(8000);*/

			driver3.findElement(By.id("item_Notifications")).click();
			Thread.sleep(3000);
			driver3.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("notificationTitle")).clear();
			Thread.sleep(3000);
			driver3.findElement(By.id("notificationTitle")).sendKeys("push");

			Thread.sleep(3000);
			driver3.findElement(By.id("notificationBody")).clear();
			Thread.sleep(3000);
			driver3.findElement(By.id("notificationBody")).sendKeys("push");
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("div.form-group > button.btn.btn-primary")).click();
			Thread.sleep(8000);

			driver3.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			Thread.sleep(3000);
			driver3.findElement(By.id("notificationTitle")).clear();
			Thread.sleep(5000);
			driver3.findElement(By.id("notificationTitle")).sendKeys("pushlater");
			Thread.sleep(3000);
			driver3.findElement(By.id("notificationBody")).clear();	    Thread.sleep(3000);
			driver3.findElement(By.id("notificationBody")).sendKeys("pushlater");
			Thread.sleep(3000);
			driver3.findElement(By.id("sendTypeLater")).click();
			Thread.sleep(3000);
			driver3.findElement(By.xpath(".//*[@id='sendDateTime']/div/span")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("span.glyphicon.glyphicon-time")).click();
			Thread.sleep(3000);
			driver3.findElement(By.xpath("//div[@id='sendDateTime']/div/ul/li[3]/div/div/table/tbody/tr/td[3]/a/span")).click();
			driver3.findElement(By.xpath("//div[@id='sendDateTime']/div/ul/li[3]/div/div/table/tbody/tr/td[3]/a/span")).click();
			driver3.findElement(By.xpath("//div[@id='sendDateTime']/div/ul/li[3]/div/div/table/tbody/tr/td[3]/a/span")).click();
			driver3.findElement(By.xpath("//div[@id='sendDateTime']/div/ul/li[3]/div/div/table/tbody/tr/td[3]/a/span")).click();
			driver3.findElement(By.cssSelector("span.glyphicon.glyphicon-remove")).click();
			Thread.sleep(3000);
			driver3.findElement(By.cssSelector("div.form-group > button.btn.btn-primary")).click();
			Thread.sleep(8000);
			driver3.close();
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test38");  


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

	@Test(enabled = true)
	public void Test39(){

		try{
			extlogger = extent.startTest("Test 39 started  mytasks form submission  functionality   ");

			shell.clickmyTasks(config);
			mytask.openTask("3", config);
			Thread.sleep(5000); 
			mytask.Completetasks(config);
			Thread.sleep(5000); 
			mytask.openTask("1", config);
			Thread.sleep(5000); 
			mytask.CompleteFormtasks(config);
			Thread.sleep(5000); 
			mytask.openTask("1", config);
			Thread.sleep(5000);
			MobileElement comptasks =mytask.findElementByXpath("//android.widget.Button[@text='Complete Task']");  
			comptasks.click();
			Thread.sleep(5000); 
			mytask.showCompletedTasks(config);
			Thread.sleep(5000); 
			mytask.Refresh(config);
			mytask.clearCompletedtasks( config);
			mytask.searchTasks(config);		
			mytask.navigateUp(config);						    
			extlogger.log(LogStatus.PASS, "Test Case Passed is Test40");  


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

	@Test(enabled = true)
	public void Test41(){

		try{
			extlogger = extent.startTest("Test 41 started  notification functionality   ");
			Thread.sleep(5000);
            shell.clickNotifications(config);
			Thread.sleep(5000);
			//form1.navigateUp(config);
			notify.Remove( config,"push");
			Thread.sleep(5000);
			notify.popup("Yes");
			Thread.sleep(5000); 
			notify.navigateToTasks(config,"A task (simple2) has been assigned to you.");
			mytask.Completetasks(config);
			notify.navigateUp(config);

			notify.RemoveAll(config);
			Thread.sleep(5000);
			notify.popup("Yes");
			Thread.sleep(5000); 	


			extlogger.log(LogStatus.PASS, "Test Case Passed is Test39");  
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
