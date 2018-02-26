package au.com.miracletek.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

public class Demo {
	
	
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
	
	@BeforeSuite     
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
		"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {

		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)));
		appiumService.start();
		config = new DriverConfig(platform, platform_name, platform_version, device_name, app_path, app_package,
				app_activity, ud_id, bundle_id, ip_address, port);
	}

	@AfterSuite
	public void closeAppiumServer() {
		appiumService.stop();
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
		  
		        appCodePage.enterAppCodeAndProceed("automation");
		    	Thread.sleep(5000);
		    	//form.waitForVisibilityOf(By.id(Constants.userName));
				loginPage.Login1("abc","abc");
				Thread.sleep(5000);
				form.waitForVisibilityOf(By.xpath("//android.widget.TextView[@text='test']"));
			    catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
		        formList.selectForm("auto",config);
		        Thread.sleep(3000);
		     	form.takescreenshot1();
	            form.fillForm(config);
	        	form.saveDraft();
	        
				form.navigateUp(config);
				form.navigateUp(config);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	//------------------Drafts - Edit form and Submit--------------------

	@Test(enabled = true)
	public void Test02() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			shell.clickDrafts(config);
		 	form.takescreenshot1();
			drafts.Edit("1",config);
			form.submit();
			form.navigateUp(config);
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Pending List - Form Status Info Page--------------------

	@Test(enabled = true)
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
	
	@Test(enabled = true)
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
	
	@Test(enabled = true)
	public void Test05() {
		try {
			
		
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
	
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    subQueue.clickonsubmittedTab();
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
	
	@Test(enabled = true)
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
	
	@Test(enabled = true)
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
	        subQueue.clickonsubmittedTab();
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
	
	@Test(enabled = true)
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
	
	@Test(enabled = true)
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
	
	@Test(enabled = true)
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
		     subQueue.clickonsubmittedTab();  
		     Thread.sleep(3000);
		     subQueue.opensubmittedDetailInfoPage("2", config);     
	       	 form.navigateUp(config);
   
		     Thread.sleep(3000);    
	        
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	//----------------Test settings  -------------------
	@Test(enabled = true)
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
