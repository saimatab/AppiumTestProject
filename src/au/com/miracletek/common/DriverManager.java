package au.com.miracletek.common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class DriverManager {
	
	private AppiumDriver<MobileElement> driver;
	private static DriverManager instance;
	
	private DriverManager(){}
	
	public static synchronized DriverManager getInstance() {
		if(instance == null) {
			instance = new DriverManager();
		}
		return instance;
	}
	
	public AppiumDriver<MobileElement> getDriver() throws Exception {
		if(driver != null) {
			return driver;
		} else {
			throw new Exception("Please initialize driver");
		}
	}
	
	public void startDriver(DriverConfig config) throws Exception {
		if(driver == null || driver.getSessionId() == null) {
			driver = (AppiumDriver<MobileElement>) DriverFactory.getWebDriver(config);
		}
	}
	
	public void stopDriver() {
		if(driver != null) {
			driver.quit();
		}
	}
	
}
