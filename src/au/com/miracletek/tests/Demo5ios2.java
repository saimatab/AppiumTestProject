package au.com.miracletek.tests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;

import static org.apache.commons.io.comparator.LastModifiedFileComparator.LASTMODIFIED_REVERSE;

import java.io.*;
import org.openqa.selenium.logging.*;
import java.util.*;
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
import au.com.miracletek.forms.AutomationTestForm5;
import au.com.miracletek.pages.AdvancedSettingsPage;
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

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import reports.JyperionListener;

import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.extras.*;

@Listeners(JyperionListener.class)

public class Demo5ios2 {
	//datetimepicker , switch ,slider,uploader, autocomplete

	  //fg';
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
	AutomationTestForm5  formb;
	private static Logger log = Logger.getLogger("testlogger");
	ExtentReports extent;

	SoftAssert  s_assert = new SoftAssert();
	ExtentTest extlogger;
	SyncPageBlank  sync;
	SubmissionQueuePage  subQueue;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
	NotificationsPage  notify;
	//fghgfhg
	@BeforeSuite     
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
		"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {
		 SimpleDateFormat  df = new SimpleDateFormat("dd MMM yyyy HH_mm_ss");
		 String dtime =df.format(new Date());
		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)).withLogFile(new  File("//Users//miracletek//Documents//GitHub//AppiumTestProject//appiumServer_logs_"+dtime+".log")));
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
		 String testout= System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/test-output";
			
			
		
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
       		   
    
		
		
		
		
		bp.sendPDFReportByGMailIos("saimatab2016@gmail.com", "Singapore3@", config.getToemail(), "PDF Report", "",files[0].getName());
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void stopDriver() {
		//BasePage bp=new 	BasePage();
	///	bp.sendPDFReportByGMailIos("saimatab2016@gmail.com", "Singapore3@", "saimatab2016@gmail.com", "PDF Report", "");
		manager.stopDriver();
		
	}
	
	
	/*  1) Enter Code and Login 
	    2) Select Category and form
	    3) Camera 
	    4) Gallery 
	    5) Annotation

	
	    */
	//------------------date time pciker , file uplloader , auto compelte ------------------

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
		    formb=new AutomationTestForm5(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		 
		       appCodePage.enterAppCodeAndProceed("automation");
		    	Thread.sleep(5000);
		    	//form.waitForVisibilityOf(By.id(Constants.userName));
				loginPage.Login1("abc","abc");
		    	
		    
			formb.waitForVisibilityOf(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
				
			    catPage.selectCategoryListView("test",config);
			  	//Thread.sleep(2000);
			  	
			  	
			  	//formb.controlcenter1();
			  	
		      formList.selectForm("dtimeupAuto",config);
		      formb.takescreenshot1();
		        //formb.controlcenterIOs();
		        //form.findElementById("picker2").click();
		       // formb.uploader(config,"Photos","1","Camera","Photo taken on Sep 23, 2016 10:18:52 AM");//file uploader
 			    
		        
		        Thread.sleep(3000);
		        //form.pickerwheelIos();
		        //form.scrollToTextIos("label2");
             formb.clickDatePicker(config, "datepicker1");
	
			    formb.Date(config,"April","08","2019");
			    Thread.sleep(3000);
				formb.doneios();
			      Thread.sleep(3000);
			        formb.clickTimePicker(config, "timepicker1");
			 
			        formb.Time(config,"1","01","PM");
					formb.doneios();
				    Thread.sleep(3000);
				
				
			
			    formb.dateTime("datetimepicker1",config,"April","08","2019","4","54","PM");
			 
		
			    formb.autoComplete(config,"autocomplete1");
		        //Thread.sleep(6000);
		        
		     formb.clickslider(config);
		        
		        
		   formb.clickswitch(config,"swSelectedId","2");
		        
		        
		        
				formb.clickDateTimePickerTime(config, "datetimepicker1");
			        Thread.sleep(3000);
			    formb.Time(config,"1","01","PM");
				formb.doneios();
			 
			    Thread.sleep(3000);
	      
	      
		         formb.fileUploaderios("Photos","1","Camera","Photo taken on Sep 23, 2016 10:18:52 AM");//file uploader
		         			    Thread.sleep(3000);
		             formb.autoComplete(config,"autocomplete1");
		        Thread.sleep(6000);
		        
		        formb.clickslider(config);
		        formb.clickswitch(config,"swSelectedId","2");
		         formb.submit();
		        
		    
			
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
