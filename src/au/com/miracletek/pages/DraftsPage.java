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
	MobileElement yes;
	MobileElement no;

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
			 
		       
		
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
				edit=findElementByXpath("//XCUIElementTypeButton[@name='buttonEditId']");

			    
		      
		       
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
			 
		        
			
		 
				
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
				
				remove=findElementByXpath("//XCUIElementTypeTable[@name='listViewId']/XCUIElementTypeCell/XCUIElementTypeButton[@name='buttonRemoveId']");

			 //remove=findElementByXpath("//XCUIElementTypeButton[@name='buttonRemoveId']");     
		   remove.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void popup1(String response) {

		try {
			
			
			if (response.equals("Yes"))
               {
			yes=findElementByXpath("//*[@text='Remove']");
			yes.click();
               }
             else
                {
            	no=findElementByXpath("//*[@text='Cancel']");
                no.click();
                }		


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
				
			
		
			
			
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			info=findElementByXpath("//XCUIElementTypeCell");

			
			info.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
