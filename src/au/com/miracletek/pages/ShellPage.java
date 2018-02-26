package au.com.miracletek.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;


public class ShellPage extends BasePage {

	
	MobileElement sync;
	MobileElement draft;
	MobileElement 	notification;

	MobileElement settings;
	MobileElement search;
	public ShellPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void clickNotifications(DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			//notification = findElementById(Constants.notification);
			if(platformName.contentEquals("Android"))
			{notification = findElementById(Constants.notification);
			notification.click();
			}
			
			else{notification = findElementById(Constants.iosnotification);
			notification.click();
			}
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickDrafts(DriverConfig config) {

		try {
			//draft = findElementById(Constants.draft);
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			if(platformName.contentEquals("Android"))
			{
			draft = findElementById(Constants.draft);
			draft.click();
			}
			else
			{
			draft = findElementById(Constants.iosdraft);
			draft.click();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickSync(DriverConfig config) {

		try {
			//sync = findElementById(Constants.sync);
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
			sync = findElementById(Constants.sync);
			sync.click();
			}
			else
			{sync = findElementById(Constants.iossync);
			sync.click();}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickSettings(DriverConfig config) {

		try {
			//settings = findElementById(Constants.settings);
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
			settings = findElementById(Constants.settings);
			settings.click();
			}
			else
			{
				settings = findElementById(Constants.iossettings);
				settings.click();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickSearch(DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			//settings = findElementById(Constants.settings);
			if(platformName.contentEquals("Android"))
			{
			search= findElementById(Constants.search);
			search.click();
			}
			else
			{
				search= findElementById(Constants.search);
				search.click();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}