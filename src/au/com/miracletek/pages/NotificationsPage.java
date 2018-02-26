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
	MobileElement removeall;

	public NotificationsPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void navigateTosubmittedformListPage(String linearLayoutIndex,DriverConfig config) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

			
			// nned to generate xpth 
	     	 if (platformName.contentEquals("Android"))
			info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			 
			//new  info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[last()]");
	     	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
	     		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
	     			 
			
		info.click();



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void RemoveAll(String linearLayoutIndex,DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		 		
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
				 
			  removeall.click();
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Remove(String linearLayoutIndex,DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
	  	 if (platformName.contentEquals("Android"))
			 	
			// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
		 remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
		 
	        
	   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
	     	
			//new  remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
		 
			remove.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
