package au.com.miracletek.tests;

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
import au.com.miracletek.forms.HSEMobilePlant2;
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
import au.com.miracletek.pages.TapToLoginPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SmokeTests {
	private DriverManager manager;
	private DriverConfig config;
	private AppiumDriverLocalService appiumService;
	AppCodePage appCodePage;
	ShellPage shell;
	DraftsPage   drafts;
	TapToLoginPage tapToLogin;
	LoginPage loginPage;
	CategoryPage catPage;
	FormListPage formList;
	HSEMobilePlant2  form;
	SyncPage  sync;
	SubmissionQueuePage  subQueue;
	NotificationsPage  notify;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
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
	//------------------Forms - Save form as draft with Project Name and other Mandatory Fields--------------------( test 01-20 )

	@Test(enabled = true)
	public void Test01() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());

			drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			appCodePage = new AppCodePage(manager.getDriver(), config.getPlatform());
			appCodePage.enterAppCodeAndProceed("georgiou-oneapp");
			tapToLogin = new TapToLoginPage(manager.getDriver(), config.getPlatform());
			tapToLogin.tapToLogin();
			loginPage = new LoginPage(manager.getDriver(), config.getPlatform());
			loginPage.Login("MIRACLETEK\\stabassum","Sorrento2017");
			Thread.sleep(4000);
		     form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
			
			catPage=new CategoryPage(manager.getDriver(), config.getPlatform());
			catPage.selectCategoryListView(Constants.HSECategory,config);
	        formList=new FormListPage(manager.getDriver(), config.getPlatform());
		    formList.selectForm(Constants.DHIMobilePlant,config);
		
			form.fillForm(config);
			
		    form.scrollToText("DMS Save Location - 08 HSE > 04 Inspection and Testing");
			
			form.saveDraft();
			form.navigateUp(config);
			form.navigateUp(config);
			System.out.println("passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//------------------Drafts - Edit form and Submit--------------------

	@Test(enabled = true)
	public void Test02() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			shell.clickDrafts(config);
			drafts.Edit("1",config);
		
			   form.scrollToText("Project Email");
			form.submit();
			form.navigateUp(config);
			System.out.println("passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Pending List - Form Status Info Page--------------------

	@Test(enabled = true)
	public void Test03() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			
		    shell.clickSync(config);
	        Thread.sleep(3000);
	    	System.out.println("*************************TEST 09 START ********************************************");
		    sync.openPendingSubmittedForms("1",config);
		    Thread.sleep(3000); 
		    subQueue.openPendingDetailInfoPage("1",config);
		    Thread.sleep(3000);
			form.navigateUp(config);
			System.out.println("*************************TEST 09 stop ********************************************");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Pending List - Form Submission--------------------
	
	@Test(enabled = true)
	public void Test04() {
	
	try{
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			System.out.println("*************************TEST 10 START ********************************************");
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		
		    subQueue.submitPendingForm("1",config);
		    Thread.sleep(6000);
			System.out.println("*************************TEST 10 STOP ********************************************");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------------Sync - Submitted Form List - Form Status Info Page---------------
	
	@Test(enabled = true)
	public void Test05() {
		try {
			
			System.out.println("*************************TEST 11 start ********************************************");

			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			System.out.println("*************************TEST 11 START ********************************************");
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    subQueue.clickonsubmittedTab(config);
		    subQueue.opensubmittedDetailInfoPage("1",config);
		 
			form.navigateUp(config);

	
			
			System.out.println("TEST 11 EXECUTED");
			System.out.println("*************************TEST 11 STOP ********************************************");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//-----------------Sync - Submitted Form List - Save Submitted form as Draft and Submit-------------------
	
	@Test(enabled = true)
	public void Test06() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			System.out.println("*************************TEST 12 START ********************************************");
		    subQueue.editSubmittedForm("1",config);
		    
			   form.scrollToText("SUBMIT");
			form.saveDraft();
			form.navigateUp(config);
			form.navigateUp(config);
			form.navigateUp(config);
			shell.clickDrafts(config);
			drafts.Edit("1",config);
			   form.scrollToText("SUBMIT");
			form.submit();
			form.navigateUp(config);
			System.out.println("*************************TEST 13 stop  ********************************************");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//----------------Sync - Submitted Form List - Remove  submitted Forms------------------------------
	
	@Test(enabled = true)
	public void Test07() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			System.out.println("*************************TEST 13 START ********************************************");
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
			form.navigateUp(config);
			System.out.println("*************************TEST 13 STOP ********************************************");
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//----------------Sync -  Forms------------------------------
	
	@Test(enabled = true)
	public void Test08() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			System.out.println("*************************TEST 14 START ********************************************");
		    shell.clickSync(config);
		    Thread.sleep(3000);
		    sync.syncForms("1",config);
			System.out.println("TEST 14");
	        
			System.out.println("*************************TEST 14 stop  ********************************************");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//----------------Sync - HR list-----------------------
	
	@Test(enabled = true)
	public void Test09() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		
		    Thread.sleep(3000);
		    sync.syncHRList("2",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------- -Sync - BU------------------------------
	
	@Test(enabled = true)
	public void Test10() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncBusinessUnit("3",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//-----------------Sync - IM representative-------------------
	
	@Test(enabled = true)
	public void Test11() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncIMRepresentative("4",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//---------------Sync - Ad users--------------------------
	
	@Test(enabled = true)
	public void Test12() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncADusers("5",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//----------------Sync - projects--------------------
	
	@Test(enabled = true)
	public void Test13() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
		    sync.syncProjects("6",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//------------------Sync - locations---------------------
	
	@Test(enabled = true)
	public void Test14() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		   
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    Thread.sleep(3000);
			form.scrollToText("Locations");
			   Thread.sleep(3000);
		    sync.syncLocations("5",config);
	      
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	
	
	
	
	
	
	// *******************Settings (15-18 cases)*****************************************************************************

	// --------Settings - Advanced - Update Selected Pages/Forms---------- 
	
	@Test(enabled = false)
	public void Test15() {
			try {
			
				form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
			    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			   
			    notify=new  NotificationsPage(manager.getDriver(), config.getPlatform());
				 settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
				 advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
			     subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
			    
			 	shell=new ShellPage(manager.getDriver(), config.getPlatform());

			
				appCodePage = new AppCodePage(manager.getDriver(), config.getPlatform());
				appCodePage.enterAppCodeAndProceed("georgiou-oneapp");
				tapToLogin = new TapToLoginPage(manager.getDriver(), config.getPlatform());
				tapToLogin.tapToLogin();
				loginPage = new LoginPage(manager.getDriver(), config.getPlatform());
				loginPage.Login("MIRACLETEK\\stabassum","Sorrento2017");
				Thread.sleep(4000);
			     shell.clickSettings(config);
             form.scrollToText("Application Advanced Settings");
			       settings.clickAdvanced(); 
			       //Thread.sleep(9000);	
			       
			 	advSettings.SelectPageToUpdateAndroid("2",config);
			 	advSettings.updateSelectedPage();
			       Thread.sleep(3000);
			       form.navigateUp(config);
		        
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	// --------Settings -Update Meta Data -------------------------	
	
	@Test(enabled = false)
	public void Test16() {
			try {
				shell=new ShellPage(manager.getDriver(), config.getPlatform());
				form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
			    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
			    notify=new  NotificationsPage(manager.getDriver(), config.getPlatform());
				 settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
				 advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
			     subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
				
			     settings.clickAdvanced();
				    advSettings.updateMetaData();
				    Thread.sleep(40000);
				
				    form.navigateUp(config);
			    	 
		        
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	
	// --------Settings -Update App-------------------------	
	
	@Test(enabled = false)
	public void Test17() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());

		    notify=new  NotificationsPage(manager.getDriver(), config.getPlatform());
			 settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
			 advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
		     subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    	System.out.println("*************************SETTINGS TEST START  ********************************************");
		    


			       settings.updateApp();
			       settings.clickProceedAndroid();
				    Thread.sleep(40000);
		   //     
		    	System.out.println("*************************SETTINGS TEST STOP ********************************************");
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	// --------Settings -switch App-------------------------
	
	@Test(enabled = false)
	public void Test18() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			form=new HSEMobilePlant2(manager.getDriver(), config.getPlatform());
		    drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPage(manager.getDriver(), config.getPlatform());
		    notify=new  NotificationsPage(manager.getDriver(), config.getPlatform());
			 settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
			 advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
		     subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		   



				settings.switchApp();
				
			
			settings.clickOK();
		        Thread.sleep(12000);	 
	        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
