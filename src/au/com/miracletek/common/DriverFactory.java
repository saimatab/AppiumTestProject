package au.com.miracletek.common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactory {

	public static RemoteWebDriver getWebDriver(DriverConfig config) throws Exception {

		File app = new File(config.getAppPath());
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//
		switch (config.platform) {

		case Constants.PLATFORM_ANDROID:
			capabilities.setCapability("deviceName", config.getDeviceName());
	
	
			capabilities.setCapability("platformVersion", config.getPlatformVersion());
			capabilities.setCapability("platformName", config.getPlatformName());
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage", config.getAppPackage());
			capabilities.setCapability("appActivity", config.getAppActivity());
			capabilities.setCapability("newCommandTimeout", 3000);
			//capabilities.setCapability("noReset", true);
			AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<AndroidElement>(new URL(config.getAppiumServerUrl()), capabilities);
			androidDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			return androidDriver;
			
		case Constants.PLATFORM_IOS:
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, config.getPlatformName());
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, config.getPlatformVersion());
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, config.getDeviceName());
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.UDID, config.getUDId());
             if(config.getPlatformVersion().contentEquals("11.2"))
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			//capabilities.setCapability("noReset", true);
			//capabilities.setCapability("fullReset", false);
			capabilities.setCapability("xcodeOrgId", "8X6MKF8VCN");
			capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		//	capabilities.setCapability("bundleid", config.getBundleId());
			//
			capabilities.setCapability("bundleid", config.getBundleId());
			
			//capabilities.setCapability("xcodesigningId", config.getxcodesignId());
			
			//capabilities.setCapability("xcodeorgId", config.getxcodeorgId());
			
			
			IOSDriver<IOSElement> iOSDriver = new IOSDriver<IOSElement>(new URL(config.getAppiumServerUrl()), capabilities);
			iOSDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			return iOSDriver;
			
		default:
			throw new Exception("Unable to create Driver");

		}
	}

}
