package au.com.miracletek.tests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;
import reports.JyperionListener;
import static org.apache.commons.io.comparator.LastModifiedFileComparator.LASTMODIFIED_REVERSE;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import au.com.miracletek.common.DriverManager;
import au.com.miracletek.forms.AutomationTestForm;
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
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import reports.JyperionListener;
@Listeners(JyperionListener.class)
public class DemoIos {
	private static Logger log = Logger.getLogger("testlogger");
	ExtentReports extent;
    public static String fileName;
	SoftAssert  s_assert = new SoftAssert();
	ExtentTest extlogger;
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
	AutomationTestForm  form;
	SyncPageBlank  sync;
	SubmissionQueuePage  subQueue;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
	NotificationsPage  notify;
	Logger log1 = Logger.getLogger("devpinoyLogger");
	   
	static Map extentTestMap = new HashMap();
	@BeforeSuite     
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
		"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {

		
		
		//String nodepath =System.getenv("APPIUM_NODE_PATH");
		
		//System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +nodepath);
		 
	//	String jspath =System.getenv("APPIUM_JS_PATH");
		
	//	System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +jspath);

		 SimpleDateFormat  df = new SimpleDateFormat("dd MMM yyyy HH_mm_ss");
		 String dtime =df.format(new Date());
	

		 String appiumlog= "Logs/Appium/appiumServer_logs_" +dtime+".log";
		 System.out.println("appiumlogLOGAPPIUMLOGappiumlogLOGAPPIUMLOGappiumlogLOGAPPIUMLOG" +appiumlog);
		
			/*appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
					.usingPort(port).usingDriverExecutable(new File("/usr/local/bin/node.exe"))
					.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withLogFile(new  File(appiumlog)));
			appiumService.start();*/
		
		
			appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
					.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
					.withAppiumJS(new File(Constants.APPIUM_JS_PATH)).withLogFile(new  File(appiumlog)));
			appiumService.start();
		
		
		
		
		
		
		
		
		/*appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)));
		appiumService.start();*/
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
		 String testout= System.getProperty("user.home")+"/test-output";
			
			
		
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
			
		
		bp.sendPDFReportByGMailIos("saimatab2016@gmail.com", "Singapore3@", toemail, "PDF Report", "",files[0].getName());
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
			
			
			extent = new ExtentReports ("STMExtentReport.html", true);
		extent
	                .addSystemInfo("Host Name", "Saima Tabassum")
	                .addSystemInfo("Environment", "Zon -Automation Testing")
	                .addSystemInfo("User Name", "Saima");
        extent.loadConfig(new File("extent-config.xml"));
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	@AfterTest
	public void stopDriver() {
		manager.stopDriver();
		
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
	//------------------Forms - Save form as draft with Project Name and other Mandatory Fields--------------------( test 01-10)

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
		    form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
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
					      
					      
					      
					 	 String scshot= "ScreenShots/";
							
					 	   String scrFolder = scshot
						              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
						                      Calendar.getInstance().getTime()).toString();
					      new File(scrFolder).mkdir();
					      System.setProperty("scr.folder", scrFolder);
					      System.out.println("SCR FOLDER ^^^^^^^^^^#################" +scrFolder);
					      File file = new File("app.xml");
							FileInputStream fileInput = new FileInputStream(file);
							Properties properties = new Properties();
							properties.loadFromXML(fileInput);
							fileInput.close();

		    

							String appcode = properties.getProperty("appcode");
							
							String username = properties.getProperty("username");
							
							String password = properties.getProperty("password");
							
		    
		    
		    
		    
		    form.findElementById("Allow").click();

		    
		    
		        appCodePage.enterAppCodeAndProceed(appcode);
		    	Thread.sleep(5000);
		
		    	//form.waitForVisibilityOf(By.id(Constants.userName));
				loginPage.Login1(username,password);
				Thread.sleep(5000);
			Thread.sleep(5000);
				form.waitForVisibilityOf(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
			    catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
		        formList.selectForm("auto",config);
				    form.findElementById("Allow").click();
			  Thread.sleep(3000);
		     	form.takeSnapShotIos();
				/*Thread.sleep(5000);
				form.waitForVisibilityOf(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
			    catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
		        formList.selectForm("auto",config);
		        Thread.sleep(3000);
		     	form.takeSnapShotIos();
	            form.fillForm(config);
	            form.saveDraftIos();
	            
		        
				form.findElementById("test").click();
				form.navigateUp(config);*/
		 
	     
		  	/*shell.clickDrafts(config);
		  	drafts.Edit("1", config);
		  	form.findElementById("Drafts").click();
		  	drafts.Remove("1", config);
		  	sync.openPendingSubmittedForms("1", config);
		  	 Thread.sleep(3000); 
			    subQueue.openPendingDetailInfoPage("1",config);
			  
				subQueue.submitPendingForm("1",config);
			    Thread.sleep(6000);
		  	
		  	subQueue.clickonsubmittedTab(config);
		    //subQueue.opensubmittedDetailInfoPage("1",config);
			 
			
				  subQueue.ViewsubmittedForms("1",config);
				    Thread.sleep(3000);
					form.findElementById("Submission Queue").click();
					   subQueue.editSubmittedForm("1",config);
					   form.findElementById("Submission Queue").click();
						   subQueue.removeSubmittedForm("1",config);
					        subQueue.popup1Ios("Yes");
					        Thread.sleep(3000);
							
							   form.findElementById("Sync").click();*/
				
				
				   
				 log.debug("DEBBGUG" );	 log.debug("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );
			    
			    
			    
			    
			    
			    
				extlogger.log(LogStatus.PASS, "Test Cases");
			  
			  
			  
	//notificaiton , my tasks , pull to refresh , search ,scrol ,  offline user login , logging , screenshot , report running , try catch assertion if possible 	  
			  
			  
			  //searhc , my tasks ,  offline user logging
			  
			  
			  
			  




String actualValue =form.findElementByXpath("//android.widget.TextView[@text='dd']").getText();
s_assert.assertEquals(actualValue, "dd");
//Assert.assertTrue(true);
//To generate the log when the test case is passed
extlogger.log(LogStatus.PASS, "Test Case Passed is Test01");
extent.endTest(extlogger);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	//------------------Drafts - Edit form and Submit--------------------

	@Test(enabled = false)
	public void Test02() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			shell.clickDrafts(config);
		 	form.takeSnapShotIos();
			drafts.Edit("1",config);
			form.submit();
			form.navigateUp(config);
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Pending List - Form Status Info Page--------------------

	@Test(enabled = false)
	public void Test03() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			
		    shell.clickSync(config);
	        Thread.sleep(3000);
	
		    sync.openPendingSubmittedForms("1",config);
		    Thread.sleep(3000); 
		    subQueue.openPendingDetailInfoPage("1",config);
		    Thread.sleep(3000);
			form.navigateUp(config);

			

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//------------------Sync - Pending List - Form Submission--------------------
	
	@Test(enabled = false)
	public void Test04() {
	
	try{
		form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    subQueue.submitPendingForm("1",config);
		    Thread.sleep(6000);
	
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Submitted Form List - Form Status Info Page---------------
	
	@Test(enabled = false)
	public void Test05() {
		try {
			
		
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
	
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    subQueue.clickonsubmittedTab(config);
		    subQueue.opensubmittedDetailInfoPage("1",config);
		 
			form.navigateUp(config);

			  subQueue.ViewsubmittedForms("1",config);
			    Thread.sleep(3000);
				form.navigateUp(config);


		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	//-----------------Sync - Submitted Form List - Save Submitted form as Draft and Submit-------------------
	
	@Test(enabled = false)
	public void Test06() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());

		    subQueue.editSubmittedForm("1",config);
		    
			
			form.saveDraft();
			form.navigateUp(config);
			form.navigateUp(config);
			form.navigateUp(config);
			shell.clickDrafts(config);
			drafts.Edit("1",config);
			form.submit();
			form.navigateUp(config);
		
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//----------------Sync - Submitted Form List - Remove  submitted Forms------------------------------
	
	@Test(enabled = false)
	public void Test07() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new 	SyncPageBlank(manager.getDriver(), config.getPlatform());
	          subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    
		    shell.clickSync(config);
	       Thread.sleep(3000);
		    sync.openPendingSubmittedForms("1",config);
	        subQueue.clickonsubmittedTab(config);
	        Thread.sleep(3000);
	        subQueue.removeSubmittedForm("1",config);
	        subQueue.popup1("Yes");
	        Thread.sleep(3000);
			form.navigateUp(config);
			//form.navigateUp(config);
	
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//----------------Sync -  Forms------------------------------
	
	@Test(enabled = false)
	public void Test08() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new 	SyncPageBlank(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		//shell.clickSync(config);
		    Thread.sleep(3000);
		    sync.syncForms("1",config);

	        

		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	//---------------Sync -  Role--------------------------
	
	@Test(enabled = false)
	public void Test09() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new 	SyncPageBlank(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncRole("2",config);
	      
	        
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	//----------------Sync -User -------------------
	
	@Test(enabled = false)
	public void Test10() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  	SyncPageBlank(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncUser("3",config);
		    
		    Thread.sleep(5000);
	      
	        
		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}
	
	//----------------Test with multiple forms -------------------
	@Test(enabled = false)
	public void Test12() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  	SyncPageBlank(manager.getDriver(), config.getPlatform());
	
             subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			 form.navigateUp(config);
		     Thread.sleep(2000);
             catPage.selectCategoryListView("test",config);
		  	 Thread.sleep(2000);
	         formList.selectForm("auto",config);
	         Thread.sleep(3000);
             form.fillForm(config);
             form.submit();
			 form.navigateUp(config);
			 Thread.sleep(2000);
		     catPage.selectCategoryListView("test",config);
			 formList.selectForm("auto",config);
		     Thread.sleep(3000);
	         form.fillForm(config);
	         form.submit();
		     form.navigateUp(config);
             shell.clickSync(config);
             sync.openPendingSubmittedForms("1", config);
             Thread.sleep(4000);
             subQueue.openPendingDetailInfoPage("2", config);
             form.navigateUp(config);
       	     subQueue.submitPendingForm("2", config);   
		     Thread.sleep(4000);
		     subQueue.submitPendingForm("1", config);   
			 Thread.sleep(4000);     
		     subQueue.clickonsubmittedTab(config);  
		     Thread.sleep(3000);
		     subQueue.opensubmittedDetailInfoPage("2", config);     
	       	 form.navigateUp(config);
   
		     Thread.sleep(3000);    
	        
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//----------------Test settings  -------------------
	@Test(enabled = false)
	public void Test11() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  	SyncPageBlank(manager.getDriver(), config.getPlatform());
		    settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
			 advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
			  notify=new  NotificationsPage(manager.getDriver(), config.getPlatform());
			 form.navigateUp(config);
		     Thread.sleep(2000);
		    shell.clickSettings(config);

		    settings.clickAdvanced();   
		 	advSettings.SelectPageToUpdateAndroid("2",config);
		 	advSettings.updateSelectedPage();
		    Thread.sleep(3000);
		    advSettings.updateMetaData();
			Thread.sleep(4000);
			
		    form.navigateUp(config);
			settings.updateApp();
			settings.clickProceedAndroid();
		    Thread.sleep(5000);
		       
		    settings.deviceBack();
		    Thread.sleep(5000);
		   	 //shell.clickNotifications(config);
			 //notify.Remove("1", config);
			 
	        
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	

}
