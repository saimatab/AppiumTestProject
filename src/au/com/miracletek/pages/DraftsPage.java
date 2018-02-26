package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;


public class DraftsPage extends BasePage {
	MobileElement edit;
	MobileElement remove;
	MobileElement info;


	public DraftsPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void Edit(String linearLayoutIndex,DriverConfig config) {

		try {
			
			

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
			
		       //edit=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			//new
				 edit=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonEditId']");
			 
		       
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
		       
		       edit=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAElement[1]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
		 	
				
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
				edit=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");

			    
		      
		       
		       edit.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Remove(String linearLayoutIndex,DriverConfig config) {

		try {

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
		// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
			
				//new  
			 remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
			 
		        
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			  
		     remove=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAElement[1]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[2]");
			  
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
				
				remove=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[2]");

		      
		   remove.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void openDetailInfoPage(String linearLayoutIndex,DriverConfig config) {

		try {
			

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
			//info=findElementByXpath("//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
				//new 
//info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[last()]");
			 info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");
				
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
				info=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAElement[1]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]");
			  
			
			
			
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			info=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]");
			    
				
			
			info.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
