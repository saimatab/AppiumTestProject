package au.com.miracletek.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
;

public class AutomationTestForm4 extends BasePage{
	

	MobileElement navup;

	MobileElement save;
	
	MobileElement submit;
	MobileElement sign;
	MobileElement savedraft;
	public AutomationTestForm4 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

public void signature(DriverConfig config) {

		
		
		

		try {
			
		
	sign();
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public void signatureIos(DriverConfig config) {

	
	
	

	try {
		
	
signIos();
	
		
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
					navup=findElementById("test");
					navup.click();
				}

			
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	public void save(DriverConfig config) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
		//	   navup=findElementById(Constants.navigateUp);
			Thread.sleep(3000);
	
				if(platformName.contentEquals("Android"))
				{
					  save=findElementByXpath("//android.widget.Button[@index='1']");
					   save.click();
		   
	
				}
				else
				{
					
					(new TouchAction(driver)).tap(105, 671).perform();

				
				}

			
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void submit() {

		try {
		
			  submit=findElementById("button2");
				 submit.click();
		   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickSign() {

		try {
			 
		
			   sign=findElementByXpath("//android.widget.LinearLayout[@content-desc='signature1']//android.widget.LinearLayout[@index='1']//android.widget.Button[@text='Sign']");
			   sign.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickSignIos() {

		try {
			 
		
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Sign");
			el1.click();

   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void saveDraft() {

		try {
			 
		
			   savedraft=findElementByXpath("//*[@content-desc='Save Draft']");
			   savedraft.click();
			   
			   
			 //XCUIElementTypeNavigationBar[@name="testsig"]/XCUIElementTypeButton[2]
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void saveDraftIos() {

		try {
			 
		
			   savedraft=findElementByXpath("//XCUIElementTypeNavigationBar[@name='testsig']/XCUIElementTypeButton[2]");
			   savedraft.click();
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
