package au.com.miracletek.forms;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
;

public class AutomationTestForm5 extends BasePage{
	
	MobileElement slide;
	MobileElement switch1;

	MobileElement datepik;
	MobileElement timepik;
	MobileElement datetimepik;
	MobileElement done;
	MobileElement navup;
	MobileElement submit;
	MobileElement savedraft;
	MobileElement autocomp;
	MobileElement projCode11;
	public AutomationTestForm5 (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void clickslider(DriverConfig config) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
				slide=findElementByXpath("//*[@class='android.widget.SeekBar']");// slider
						
				slide.click();
			}
			else
			{
				slide=findElementByXpath("//XCUIElementTypeOther[@name='slider1']/XCUIElementTypeOther[2]/XCUIElementTypeSlider");// slider
				
				slide.setValue("0.4");
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void takescreenshot1() {

		try {
			 
			takeSnapShotIos() ;
	
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void controlcenter(){
		
		
		controlcenterIOs();
	}
	public void clickswitch(DriverConfig config, String switchId,String linearLayoutIndex) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
				switch1=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='swSelectedId']");
				switch1.click();
			}
			else
			{
            switch1=findElementById("switch1");// slider
				
				switch1.click();
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickDatePicker(DriverConfig config, String datePickId) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
		  datepik=findElementById(datePickId);
		  datepik.click();
			}
			else
			{
				 datepik=findElementById(datePickId);
				  datepik.click();
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickTimePicker(DriverConfig config, String timepikId) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
		  timepik=findElementById(timepikId);
		 timepik.click();
			}
			else
			{
				 timepik=findElementById(timepikId);
				 timepik.click();
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickDateTimePickerDate(DriverConfig config, String DatetimepikId) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
		  //datetimepik=findElementByXpath("//*[@content-desc='datetimepicker1']//android.view.ViewGroup[@index='0']//android.widget.EditText[@index='0']");
				
				 datetimepik=findElementByXpath("//*[@content-desc= '" + DatetimepikId + "']//android.view.ViewGroup[@index='0']//android.widget.EditText[@index='0']");
					
				
				
				
		  datetimepik.click();
			}
			else
			{
				 datetimepik=findElementByXpath("//XCUIElementTypeOther[@name='datetimepicker1']/XCUIElementTypeOther[1]");
					
					
					
					
				  datetimepik.click();
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void clickDateTimePickerTime(DriverConfig config, String DatetimepikId) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
		  //datetimepik=findElementByXpath("//*[@content-desc='datetimepicker1']//android.view.ViewGroup[@index='0']//android.widget.EditText[@index='0']");
				
				 datetimepik=findElementByXpath("//*[@content-desc= '" + DatetimepikId + "']//android.view.ViewGroup[@index='1']//android.widget.EditText[@index='0']");
					
				
				
				
		  datetimepik.click();
			}
			else
			{	 datetimepik=findElementByXpath("//XCUIElementTypeOther[@name='datetimepicker1']/XCUIElementTypeOther[2]");
			
			
			
			
  datetimepik.click();
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
public void Date(DriverConfig config,String Month,String Day,String Year) {

		
		
		

		try {
			
		
			if(platform.equals(Constants.PLATFORM_ANDROID))
	    	{
	    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Month);
	    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Day);
	    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Year);
	   		 
	    		 
	    		 
	    	} else {
	    		
	    		//((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).sendKeys(Month);
		    	//((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).sendKeys(Day);
		       // ((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).sendKeys(Year);
	    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).setValue("April");

	    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).setValue("8");
	    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).setValue("2019");
		    	
	    	
	    	} 
	    	
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
public void Time(DriverConfig config,String Hour,String Min,String Sec) {

	
	
	

	try {
		
	
	 	if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Hour);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Min);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Sec);
   		 
    		 
    		 
    	} else {
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).setValue("1");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).setValue("02");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).setValue("PM");
    	   		 
    	    		 
    	    		 
    	} 
    
    	
	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public void dateTime(String dtpickID,DriverConfig config,String Month,String Day,String Year,String Hour,String Min,String Sec) {

	
	
	

	try {
		
	//date 

		if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Month);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Day);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Year);
   		 
    		 
    		//XCUIElementTypeOther[@name='datetimepicker1']/XCUIElementTypeOther[2]
    	} else {
    		
    		clickDateTimePickerDate(config, dtpickID);
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).setValue("April");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).setValue("8");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).setValue("2019");
    		doneios();
    		
    		clickDateTimePickerTime(config, dtpickID);
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).setValue("1");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).setValue("02");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).setValue("PM");
    		doneios();
    			
    	} 
    
	
	// time/*
		/*
	 	if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Hour);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Min);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Sec);
   		 
    		 
    		 
    	} else {
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")).setValue("1");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[2]")).setValue("02");
    		((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]")).setValue("PM");
    	   		 
    	     
    	    		 
    	} */
    	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void uploader(DriverConfig config,String googleDriveFolderName, String  folderIndex, String folderName, String photoName) {

	
	
	

	try {
		
	
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		
		if(platformName.contentEquals("Android"))
		           
		            
		{        ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='browse_button1']")).click();
		            
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Show roots']")).click();
		            
		            Thread.sleep(3000);
		            //((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.LinearLayout[@index='7']")).click();
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.TextView[@text='" +googleDriveFolderName+"']")).click();
		            
		            
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@index='" +folderIndex+"' and android.widget.TextView[@text='" +folderName+"']]")).click();
		   
		           
		           // ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Photo taken on Sep 23, 2016 10:18:52 AM']")).click();
		   
		             ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='" +photoName+"']")).click();
		}
		else
		{
			
			
			findElementById("browse_button1").click();
			(new TouchAction((IOSDriver<MobileElement>)driver)).tap(310, 714).perform();
			
			(new TouchAction((IOSDriver<MobileElement>)driver)).tap(77, 273).perform();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
    		HashMap scrollObject = new HashMap();
    		scrollObject.put("direction", "down");

    		js.executeScript("mobile: scroll", scrollObject);
    		
    		
			Thread.sleep(3000);
			(new TouchAction(driver)).tap(220, 635).perform();
			//  (new TouchAction((IOSDriver<MobileElement>)driver)).tap(200, 362).perform();
			  //(new TouchAction(driver)).tap(185, 604).perform()
	/*
			//press browse
			(new TouchAction(driver)).tap(307, 712).perform()
			(new TouchAction(driver))
			  .press({x: 410, y: 215})
			  .moveTo({x: 1: y: 156})
			  .release()
			  .perform()
			  
			  //press driver
			   * 
			   * 
			   * 
			   * 
			   * (new TouchAction(driver)).tap(80, 277).perform()

			  do scroll''
			  
			  (new TouchAction(driver)).tap(200, 362).perform()
			  
			*/  

		}
		            
		    	
		    	
		   
		    	
		    
		    
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void autoComplete(DriverConfig config, String autocomp1) {

	
	
	

	try {
		
	
		String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		
		
		if(platformName.contentEquals("Android"))
		{
			autocomp= ((IOSDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='" +autocomp1+"']"));
		autocomp.sendKeys("b");
		
	
	     
	 
	  
		projCode11=findElementByXpath("//*[@text='Banana']");
		projCode11.click();
		}
		else
		{
			
			
			autocomp= findElementById("autocomplete1");
			autocomp.sendKeys("b");
			
		
		     
		 
		  
			projCode11=findElementByXpath("//XCUIElementTypeStaticText[@name='Banana']");
			projCode11.click();
			
			
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
					navup=findElementById("test");
					navup.click();
					
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
	public void ok() {

		try {
			 
		
			   savedraft=findElementByXpath("//*[@text='OK']");
			   savedraft.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void doneios() {

		try {
			 
		
			   savedraft=findElementById("Done");
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
