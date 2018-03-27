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
	MobileElement task;
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
			
			else{
				notification = findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[2");
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
			draft = findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[3]");
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
			{sync = findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[4]");
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
				settings = findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[5]");
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
				search= findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[6]");
				search.click();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clickmyTasks(DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			//settings = findElementById(Constants.settings);
			if(platformName.contentEquals("Android"))
			{
			task= findElementById(Constants.tasks);
			task.click();
			}
			else
			{
				search= findElementByXpath("//XCUIElementTypeNavigationBar[@name='Xamarin_Forms_Platform_iOS_NavigationRenderer_ParentingView']/XCUIElementTypeButton[6]");
				search.click();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}