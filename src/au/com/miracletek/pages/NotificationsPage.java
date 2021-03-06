package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;

public class NotificationsPage extends BasePage {
	MobileElement edit;
	MobileElement remove;
	MobileElement info;
	MobileElement navup;
	MobileElement removeall;
	MobileElement yes;
	MobileElement no;
	public NotificationsPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void navigateTosubmittedformListPage(String linearLayoutIndex,DriverConfig config) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

			
			// nned to generate xpth 
	     	 if (platformName.contentEquals("Android"))
			info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");//new  info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[last()]");
	     	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
	     		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
	     			 
			
		info.click();



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
	public void navigateToTasks(DriverConfig config,String text) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

			
			// nned to generate xpth 
	     	 if (platformName.contentEquals("Android"))
			//info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");//new  info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[last()]");
	     	
	     	 
	     	info=findElementByXpath("//*[@text='"+text+"']");
	     	 
	     	 
	     	 else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
	     	 {}
	     		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2")){}
	     			 
			
		info.click();



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void popup(String response) {

		try {
			
			if (response.equals("Yes"))
            {
			yes=findElementByXpath("//*[@text='Yes']");
			yes.click();
            }
          else
             {
         	no=findElementByXpath("//*[@text='No']");
             no.click();
             }		


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void RemoveAll(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		 		
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		  removeall=findElementById("btnRemoveAllId");
		
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		  	  removeall.click(); 	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Remove(DriverConfig config,String a) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
	  	 if (platformName.contentEquals("Android"))
	  	 {	
		// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']");
		// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='buttonRemoveId']");
		 
		 remove=findElementByXpath("//*[@content-desc='buttonRemoveId' and ./parent::*[./parent::*[./preceding-sibling::*[./*[./*[@text='" +a+"']]]]]]");

		 
		 
		 
		 
		 
		 
		 
		 
		 
	  	 }  
	   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
	   	{
			// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
	   	}
			remove.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
