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


public class SyncPage extends BasePage {
	MobileElement sync;
	MobileElement pending;


	public SyncPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void syncForms(String linearLayoutIndex, DriverConfig config) {
	//	 DriverManager manager;
	// DriverConfig config;
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

		try {
              
			
			 if (platformName.contentEquals("Android"))
				
		      // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
				//new  
				 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
			 
		       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
				
			  sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
			 
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		       
		       sync.click();
			
			
			
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void syncHRList(String linearLayoutIndex, DriverConfig config) {

		

		try {

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			 if (platformName.contentEquals("Android"))
				
		      // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
				//new  
				 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
				
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
					
					sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
		       	
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		       
			
			sync.click();

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void syncBusinessUnit(String linearLayoutIndex, DriverConfig config) {

		

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
		 if (platformName.contentEquals("Android"))
			
		    // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
			//new 
			 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
			 
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			
			
			sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
		       
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		       sync.click();;

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void syncIMRepresentative(String linearLayoutIndex, DriverConfig config) {

		

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
			 if (platformName.contentEquals("Android"))
			
		      // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
			  
				//new  
				 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
				
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2")) 
			  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		       
			
			sync.click();

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void syncADusers(String linearLayoutIndex, DriverConfig config) {

		

		try {		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		if (platformName.contentEquals("Android"))
			
		      // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
		//new  
			sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
		
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			
			   sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
		      
			   
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
				  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
			        sync.click();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void syncProjects(String linearLayoutIndex,DriverConfig config) {

		

		try {

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			if (platformName.contentEquals("Android"))
		     //  sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
			//new
				sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
			
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
		       
			   sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		       
			
			sync.click();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void syncLocations(String linearLayoutIndex, DriverConfig config) {

		

		try {

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
		 if (platformName.contentEquals("Android"))
		      // sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']"); 
			//new  
			 sync=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonSyncId']");
			
		       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
		       
			   sync=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
		       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			  sync=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
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
		
	      
		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
	     pending=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[2]");
		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
		
		
		pending=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[2]");
			    
	     
	     pending.click();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
