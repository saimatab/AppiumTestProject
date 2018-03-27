package au.com.miracletek.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.*;
import org.openqa.selenium.logging.*;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import au.com.miracletek.forms.AutomationTestForm6;
import au.com.miracletek.pages.AdvancedSettingsPage;
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
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import reports.JyperionListener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import org.apache.log4j.Logger;
import org.apache.log4j.extras.*;

@Listeners(JyperionListener.class)

public class Demo6 {
	
	private static Logger log = Logger.getLogger("UserDefined");
	
	  
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
	AutomationTestForm6  form;
	Mytasks mytask;
	SyncPageBlank  sync;
	SubmissionQueuePage  subQueue;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
	NotificationsPage  notify;
	//pagerview repeater , switch
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
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)).withLogFile(new  File("C:\\Users\\stabassum\\workspace\\AppiumTest\\src\\appiumServer_logs_"+dtime+".log")));
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
		BasePage bp=new 	BasePage();
		try
		{
		bp.sendPDFReportByGMail("saimatab2016@gmail.com", "Singapore3@", "saimatab2016@gmail.com", "PDF Report", "");
		manager.stopDriver();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	/*  1) Enter Code and Login 
	    2) Select Category and form
	    3) Camera 
	    4) Gallery 
	    5) Annotation

	
	    */
	//------------------pager view repeater-------------------

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
		    form=new AutomationTestForm6(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    mytask=new  Mytasks(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		    notify=new NotificationsPage(manager.getDriver(), config.getPlatform());
		        appCodePage.enterAppCodeAndProceed("automation");
		    	Thread.sleep(5000);
		    	//form.waitForVisibilityOf(By.id(Constants.userName));
				loginPage.Login1("abc","abc");
				Thread.sleep(5000);
			//form.waitForVisibilityOf(By.xpath("//android.widget.TextView[@text='test']"));
				Thread.sleep(5000);
		/////////////////////notifcaiton
				
				shell.clickNotifications(config);
				
			notify.Remove("2", config);
			notify.popup("Yes");
				   Thread.sleep(5000); 
				notify.RemoveAll(config);
				notify.popup("Yes");
				   Thread.sleep(5000); 
			
	
				   
				
				/////////////////////mytasks 
				
				/*shell.clickmyTasks(config);
				
				mytask.openTask("2", config);
				   Thread.sleep(5000); 
				mytask.Completetasks(config);
				   Thread.sleep(5000); 
				mytask.openTask("1", config);
				   Thread.sleep(5000); 
				mytask.CompleteFormtasks(config);
				   Thread.sleep(5000); 
			
	
				   Thread.sleep(5000); 
				   mytask.showCompletedTasks(config);
				   

				   Thread.sleep(5000); 
                mytask.Refresh(config);
                
   
                mytask.clearCompletedtasks( config);
                mytask.searchTasks(config);*/
		
        		
				

		        //////////////////////////******************************search**********************************************////////
				/*shell.clickSearch(config);
				form.waitForVisibilityOf(By.xpath("//android.widget.EditText[@text='Search']")).sendKeys("re");;
			        form.findElementByXpath("//android.widget.TextView[@text='" + Constants.repager+ "']").click();
			        form.navigateUp(config);
			        form.findElementByXpath("//android.widget.Button[@index='0']").click();
			     	MobileElement btn_category=form.findElementByXpath("//android.widget.TextView[@text='test']");
				btn_category.click();
					form.waitForVisibilityOf(By.xpath("//android.widget.EditText[@text='Search']")).sendKeys("re");
					
				    form.findElementByXpath("//android.widget.TextView[@text='" + Constants.repager+ "']").click();
			        form.navigateUp(config);*/
			        
			        
			        
			        
			        
			        //////////////////////////******************************search**********************************************////////
			        
			        //////////////////////******************************pager repeater **********************************************
			        
			        
		/*  catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
			  	
		   formList.selectForm("reppager",config);
	
		        form.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","0","switch1");
		        Thread.sleep(3000);
		    	
		        form.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","1","switch1");
		        form.clickTab(config, "Tab1");
              form.clicktextbox(config, "textbox1");
              form.clickTab(config, "Tab");
		         form.submit();*/
		        
		         
		         
				 /*formList.selectForm("scroll",config);
					form.findElementById("picker3").click();
				  //  form.findElementByXpath("//android.widget.NumberPicker[@index='0']").sendKeys("mango");
				    form.findElementByXpath("//android.widget.NumberPicker[@index='0']").setValue("mango");
			     form.scrollAND("mango");*/
			

			//	form.ok();
				  	
			////////////////scrolling 	  	
				   
			        Thread.sleep(3000);
		          
		      ///        form.scrollAND("Label");
		      //        form.scrollAND("Label");
		      //        form.scrollAND("Label");
		    
			
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
