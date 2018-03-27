package au.com.miracletek.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;


import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
;

public class AutomationTestForm6 extends BasePage{
	
	MobileElement slide;
	MobileElement switch1;

	MobileElement   Tab1;
	MobileElement add;
	MobileElement done;
	MobileElement navup;
	MobileElement submit;
	MobileElement savedraft;
	MobileElement text;
	
	public AutomationTestForm6 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void clicktextbox(DriverConfig config, String textboxid) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
				  text=findElementById(textboxid);
				  text.setValue("test");
			}
			else
			{
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void clickTab(DriverConfig config, String Tabid) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
		  Tab1=findElementByXpath("//android.widget.TextView[@text='" +Tabid+"']");
		  Tab1.click();
		
			}
			else
			{
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void ok() {

		try {
			 
		
			   savedraft=findElementByXpath("//*[@text='OK']");
			   savedraft.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void clickRepeaterSelectSwitch(DriverConfig config, String pagerid, String repeaterid, String cellindex,String switchid) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
				
				

				  add=findElementById("add_button2");
					 add.click();
					// android.widget.Switch[@content-desc='" +switchid+"']
			   
				
		//  Tab1=findElementByXpath("//android.widget.LinearLayout[@content-desc='pagerview1']//following::*/*[@content-desc='switch1']");
					 ////following::android.view.ViewGroup[@index='0']//following::*/*[@content-desc='switch1']
		  Tab1=findElementByXpath("//android.widget.LinearLayout[@content-desc='" +pagerid+"']//following::*/*[@content-desc='" +repeaterid+"']//android.view.ViewGroup[@index='" +cellindex+"']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='0']//android.view.ViewGroup[@index='0']//android.widget.Switch[@content-desc='" +switchid+"']");
			
		  
		  Tab1.click();
		
			}
			else
			{
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	




	public void navigateUp(DriverConfig config) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
		//	   navup=findElementById(Constants.navigateUp);
			Thread.sleep(3000);
	
				if(platformName.contentEquals("Android"))
				{
			  navup=findElementById(Constants.navigateUp);
			navup.click();
				}
				else
				{
					
					
				}

			
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	
	
	public void submit() {

		try {
		
			  submit=findElementById("button3");
				 submit.click();
		   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void saveDraft() {

		try {
			 
		
			   savedraft=findElementByXpath("//*[@content-desc='Save Draft']");
			   savedraft.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	


	
}
