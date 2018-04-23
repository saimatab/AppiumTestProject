package au.com.miracletek.tests;
import org.testng.Assert;
import java.util.Calendar;
import java.io.FileWriter;import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
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
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
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

public class FinalSmokeTests2 {

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
			  System.setProperty("phantomjs.binary.path","C:\\Users\\stabassum\\Documents\\GitHub\\aa\\phantomjs-2.1.1-windows-x86-workaround_issue_394\\phantomjs.exe");
				
				//System.setProperty("webdriver.gecko.driver","C:\\Users\\stabassum\\Documents\\chromedriver_win32(2)\\geckodriver.exe");
				WebDriver driver3 ;
			
				 // To declare and initialize PhantomJSDriver
				
					
				DesiredCapabilities caps= DesiredCapabilities.phantomjs();
			
				 caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\Users\\stabassum\\Documents\\GitHub\\aa\\phantomjs.exe");
					caps.setBrowserName("phantomjs");
					caps.setPlatform(Platform.ANY);
					
					
					 driver3 = new PhantomJSDriver(caps);
					 /*
					   capabilities.setBrowserName("firefox");
					 					            capabilities.setPlatform(Platform.ANY);
					 					            capabilities.setCapability("marionette", true);
					 					            
					 					            
					 					            capabilities.setCapability("browserVersion", "54.0.1");
					 					            
					 					            capabilities.setCapability("platformVersion", "10.0");
					 					            */
					 					            
					 					            
					 					            
					 					            
					 				
					  //driver3 = new RemoteWebDriver(url,
					 			//	        		  capabilities);
					 		 
					 			URL url = new URL("http://192.168.9.149:5557/wd/hub");
					 			//http://192.168.9.149:5556/wd/hub
					 		
					 			driver3 = new RemoteWebDriver(url,
					 					caps);
					 		 
					 		 

					  driver3.manage().window().maximize();
					 							   
					 							   driver3.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
					 								//  driver4.manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
					 									//driver3.navigate().to("http://demo.guru99.com/V4/");
					 		
		
			driver3.get("https://zon.miracletek.co/admin/1.0/Account/Login");
			driver3.findElement(By.id("Email")).click();
			driver3.findElement(By.id("Email")).clear();
			driver3.findElement(By.id("Email")).sendKeys("saima.tabassum+11@miracletek.com.au");
			driver3.findElement(By.id("Password")).clear();
			driver3.findElement(By.id("Password")).sendKeys("Goodluck1@");
			driver3.findElement(By.cssSelector("button.btn.btn-primary")).click();
			Thread.sleep(8000);

			/* String appiumlog1= System.getProperty("user.dir")+"\\simpbulk.csv";

						    //driver3.findElement(By.id("templateFile")).clear();
						    driver3.findElement(By.id("templateFile")).sendKeys(appiumlog1);
						    Thread.sleep(8000);
						    driver3.findElement(By.xpath("(//button[@type='button'])[3]")).click();
						    Thread.sleep(8000);*/

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
			driver3.findElement(By.id("FormSelectionRadio")).click();
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
