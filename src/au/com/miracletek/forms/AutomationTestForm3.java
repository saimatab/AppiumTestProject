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
import io.appium.java_client.ios.IOSDriver;
;

public class AutomationTestForm3 extends BasePage{
	


	MobileElement   gallary;
	MobileElement capPhoto;
	MobileElement done;
	MobileElement navup;
	MobileElement submit;
	MobileElement savedraft;
	public AutomationTestForm3 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

public void fillForm(DriverConfig config) {

		
		
		

		try {
			
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
			if(platformName.contentEquals("Android"))
			
		     gallary=waitForVisibilityOf(By.id("gallery_button2"));
			 gallary.click();
			  
			 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@index='0' and ./following-sibling::*[@text='Camera']]")).click();
			// ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.RelativeLayout[@index='1']")).click(); nexus 5
			 
			// ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.RelativeLayout[@index='3']")).click();//nexus 6
			 
			// ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.LinearLayout[@index='0']")).click();///motog
			 
			
	        //    ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Photo taken on Sep 23, 2016 10:18:52 AM']")).click();
	
			 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();//nexus 5
				
			// ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.view.ViewGroup[@index='2']")).click();//nexus 6
			 //((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.view.View[@index='2']")).click();//motog
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public void fillForm1(DriverConfig config) {

	
	
	

	try {
		
	
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		
		
	     gallary=waitForVisibilityOf(By.id("gallery_button2"));
		 gallary.click();
		  
		
		 (new TouchAction(((IOSDriver<MobileElement>)driver))).tap(49, 116).perform();
		 (new TouchAction(((IOSDriver<MobileElement>)driver))).tap(50, 273).perform();
		 (new TouchAction(((IOSDriver<MobileElement>)driver))).tap(53, 123).perform();
		 acessCameraOk();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public void annotation1(DriverConfig config) {

	
	
	

	try {
		
	
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		

		findElementById("annotate_button3").click();
             
			findElementById("Pick Color").click();
			(new TouchAction(driver)).tap(392, 697).perform();
			(new TouchAction(driver)).tap(386, 151).perform();
			(new TouchAction(driver)).tap(372, 45).perform();
			
			//findElementById("Save").click();
			(new TouchAction(driver)).tap(123, 687).perform();
			
            /*((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/color_picker_view']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/new_color_panel']")).click();
            Dimension size = ((AndroidDriver<MobileElement>)driver).manage ()
            	    .window ()
            	    .getSize ();
            	int startX = size.getWidth () / 2;
            	int startY = size.getHeight () / 2;
            	int endX = 0;
            	int endY = (int) (startY * -1 * 0.75);
            	TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action.press (startX, startY)
            	    .moveTo (endX, endY)
            	    .release ()
            	    .perform ();
            	
            	
            	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Save']")).click();
	*/
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public void annotation(DriverConfig config) {

	
	
	

	try {
		
	
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		
		if(platformName.contentEquals("Android"))
		
             
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Annotate']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Pick Color']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/color_picker_view']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/new_color_panel']")).click();
            Dimension size = ((AndroidDriver<MobileElement>)driver).manage ()
            	    .window ()
            	    .getSize ();
            	int startX = size.getWidth () / 2;
            	int startY = size.getHeight () / 2;
            	int endX = 0;
            	int endY = (int) (startY * -1 * 0.75);
            	TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action.press (startX, startY)
            	    .moveTo (endX, endY)
            	    .release ()
            	    .perform ();
            	
            	
            	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Save']")).click();
	
		
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
			 
		

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
