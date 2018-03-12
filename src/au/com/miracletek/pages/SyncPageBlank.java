package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import au.com.miracletek.common.DriverFactory;
import au.com.miracletek.common.DriverManager;
import io.appium.java_client.MobileElement;


public class SyncPageBlank extends BasePage {
	MobileElement sync;
	MobileElement pending;


	public SyncPageBlank(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void syncForms(String linearLayoutIndex, DriverConfig config) {
	//	 DriverManager manager;
	// DriverConfig config;
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

		try {
              
			
			 if (platformName.contentEquals("Android"))
			  
				 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
			 
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
			 sync=findElementByXpath("//XCUIElementTypeButton[@name='buttonSyncId'][1]");
			 
		       sync.click();
			
			
			
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void syncRole(String linearLayoutIndex, DriverConfig config) {

		

		try {

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			 if (platformName.contentEquals("Android"))
		 
				 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
			 sync=findElementByXpath("(//XCUIElementTypeButton[@name='buttonSyncId'])[2]");
			 
			sync.click();

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void openPendingSubmittedForms(String linearLayoutIndex, DriverConfig config) {
		
		try {
			
			
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
		if (platformName.contentEquals("Android"))
	     // pending=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']"); 
		//new 
			pending=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonPendingId']");
		
	      
		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
		
		
	pending=findElementByXpath("(//XCUIElementTypeButton[@name='buttonPendingId'])[1]");
		  
	     
	     pending.click();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void syncUser(String linearLayoutIndex, DriverConfig config) {

		

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
		 if (platformName.contentEquals("Android"))
			
		  
			 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
	            
			
	         	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
		 sync=findElementByXpath("(//XCUIElementTypeButton[@name='buttonSyncId'])[3]");
		 
		 sync.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}