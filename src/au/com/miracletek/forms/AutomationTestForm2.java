package au.com.miracletek.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.util.Random;

import org.apache.log4j.Logger;
public class AutomationTestForm2 extends BasePage{
	

	  static Logger log = Logger.getLogger(AutomationTestForm2.class.getName());

	MobileElement   camera;
	MobileElement capPhoto;
	MobileElement done;
	MobileElement navup;
	MobileElement submit;
	MobileElement savedraft;
	public AutomationTestForm2 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void fillForm(DriverConfig config) {

		
		
		

		try {
			
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			  log.info("Entered Username......");
			
			if(platformName.contentEquals("Android"))
			
		     camera=waitForVisibilityOf(By.id("camera_button1"));
			  camera.click();
			  
			  Thread.sleep(5000);
			  capPhoto=waitForVisibilityOf(By.id(Constants.capPhoto));
			     capPhoto.click();

				  Thread.sleep(5000);
			  done=waitForVisibilityOf(By.id(Constants.capPhotoDone));
			  done.click();

		
         
     


			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
public void fillForm1(DriverConfig config) {

		
		
		

		try {
			
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			  log.info("Entered Username......");
			
			
		     camera=waitForVisibilityOf(By.id("camera_button1"));
			  camera.click();
			  acessCameraOk();
			  Thread.sleep(5000);
			  capPhoto=waitForVisibilityOf(By.id("PhotoCapture"));
			     capPhoto.click();

				  Thread.sleep(5000);
			  done=waitForVisibilityOf(By.id("Use Photo"));
			  done.click();
			  acessCameraOk();
		
         
     


			
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
		
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	public void acessCameraOk() {

		try {
		
		     submit=findElementById("OK");
		 submit.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void submit() {

		try {
		
		     submit=findElementById("button5");
		 submit.click();
   
			
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
	public void saveDraft() {

		try {
			 
		
			   savedraft=findElementByXpath("//*[@content-desc='Save Draft']");
			   savedraft.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public void takescreenshot1() {

		try {
			 
		
			String file = System.getProperty("user.dir")+"\\"+"screenshot"+(new Random().nextInt())+".png";
			takeSnapShot1(file);
			
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
