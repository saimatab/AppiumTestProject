package au.com.miracletek.forms;

import java.util.Random;

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

public class AutomationTestForm extends BasePage{
	


	MobileElement text;
	MobileElement segment;
	MobileElement   savedraft;
	MobileElement navup;
	MobileElement submit;
	public AutomationTestForm (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void fillForm(DriverConfig config) {

		
		
		

		try {
			
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
			if(platformName.contentEquals("Android"))
			
			{
		 text=findElementById(Constants.text);
		 text.setValue("demo1");     
         MobileElement a=  findElementById("label1");
         a.click();
			
         findElementByXpath("//*[@text='Part2']").click();
			}
		 else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
		 {
			 
			 text=findElementById(Constants.text);
			 text.setValue("demo1");     
	         MobileElement a=  findElementById("label1");
	         a.click();
				
	         findElementByXpath("//XCUIElementTypeButton[@name='Part1']").click();
	       
			 
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
					navup=findElementById("Back");
					navup.click();
				}
			///XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeNavigationBar[1]/XCUIElementTypeButton[2]
			//navup=waitForVisibilityOf(By.id("Back"));
			
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	
	
	public void submit() {

		try {
		
		     submit=findElementById(Constants.submit);
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
	
	public void saveDraftIos() {

		try {
			 
		
			   savedraft=findElementByXpath("//XCUIElementTypeNavigationBar[@name='auto']/XCUIElementTypeButton[2]");
			   savedraft.click();
   
			   
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void takescreenshot1Ios() {

		try {
			 
			takeSnapShotIos() ;
	
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public void takescreenshotAndroid() {

		try {
			 
			takeSnapShotAndroid();
	
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
