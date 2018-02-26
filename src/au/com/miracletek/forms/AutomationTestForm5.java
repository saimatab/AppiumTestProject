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
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
			{
				
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
	   		 
	    		 
	    		 
	    	} else if(platform.equals(Constants.PLATFORM_IOS)){
	    	
	    	} 
	    	else {
	    		throw new Exception("Platform undefined");
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
   		 
    		 
    		 
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    	
    	} 
    	else {
    		throw new Exception("Platform undefined");
    	}
	
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
public void dateTime(DriverConfig config,String Month,String Day,String Year,String Hour,String Min,String Sec) {

	
	
	

	try {
		
	//date 

		if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Month);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Day);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Year);
   		 
    		 
    		 
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    	
    	} 
    	else {
    		throw new Exception("Platform undefined");
    	}
	
	// time	
	 	if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Hour);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Min);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Sec);
   		 
    		 
    		 
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    	
    	} 
    	else {
    		throw new Exception("Platform undefined");
    	}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

public void uploader(DriverConfig config,String googleDriveFolderName, String  folderIndex, String folderName, String photoName) {

	
	
	

	try {
		
	
	
		           
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='browse_button1']")).click();
		            
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Show roots']")).click();
		            
		            Thread.sleep(3000);
		            //((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.LinearLayout[@index='7']")).click();
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.TextView[@text='" +googleDriveFolderName+"']")).click();
		            
		            
		            
		            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@index='" +folderIndex+"' and android.widget.TextView[@text='" +folderName+"']]")).click();
		   
		           
		           // ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Photo taken on Sep 23, 2016 10:18:52 AM']")).click();
		   
		             ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='" +photoName+"']")).click();
		            
		    	
		    	
		   
		    	
		    
		    
		
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
		
			autocomp= ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='" +autocomp1+"']"));
		autocomp.sendKeys("b");
		
	
	     
	 
	  
		projCode11=findElementByXpath("//*[@text='BananaBananaBanana']");
		projCode11.click();
		
		
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
