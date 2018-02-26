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

public class HSEMobilePlant2 extends BasePage{
	

	MobileElement btn_category ;
	MobileElement projCode;
	MobileElement projCode11;
	MobileElement date;
	MobileElement month;
	MobileElement day;
	MobileElement year;
	MobileElement peopleConsult;
	MobileElement  ok;
	MobileElement segment1;
	MobileElement segment2;
	MobileElement segment3;
	MobileElement segment4;
	MobileElement segment5;
	MobileElement segment6;
	MobileElement segment7;
	MobileElement segment8;
	MobileElement segment9;
	MobileElement segment10;
	MobileElement segment11;
	MobileElement segment12;
	MobileElement segment13;
	MobileElement segment14;
	MobileElement segment15;
	MobileElement segment16;
	MobileElement projEmail;
	MobileElement userEmail;
	MobileElement EmailcpyTo;
	MobileElement submit;
	MobileElement   savedraft;
	MobileElement shelldraft;
	MobileElement edit;
	MobileElement navup;
	MobileElement repoBy;
	MobileElement  projCode1;
	MobileElement  photo1;
	MobileElement  gallary;
	MobileElement  image;
	MobileElement  image1;
	MobileElement  anno;
	MobileElement  pc;
	MobileElement  cp;	MobileElement  sv;
	public HSEMobilePlant2 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void fillForm(DriverConfig config) {

		
		
		

		try {
			
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
			if(platformName.contentEquals("Android"))
			
           //projCode=findElementByXpath("//android.widget.EditText[@text='" + Constants.projCode + "']");
		  projCode=findElementByXpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[./parent::*[./parent::*[@content-desc='ProjectCode']]]]]");
				
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			
			projCode=findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[1]/UIAElement[20]/UIATextField[1]");
		
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
				
			projCode=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
				
		
				 
		//	projCode.clear();
			//projCode.sendKeys("tes");
		     
		     
		  	projCode.setValue("OneApp Test Project-TEST");
		   	
		  
		//	projCode11=findElementByXpath("//*[@text='OneApp Test Project - TEST']");
			//projCode11.click();
		
		   	Thread.sleep(3000);
		   	
	
			
	
          peopleConsult=findElementById(Constants.peopleConsult);
           peopleConsult.setValue("ps");
             
         MobileElement a=  findElementById("label44");
         a.click();
			

         
 
  


			
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
	
	

	
	public void saveDraft() {

		try {
		
			   savedraft=findElementById(Constants.saveDraft);
			   savedraft.click();
   
			
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
	
	
	
}
