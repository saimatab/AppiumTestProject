package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class SettingsPage extends BasePage {
	MobileElement logout;
	MobileElement log;
	MobileElement updateApp;
	MobileElement switchApp;
	MobileElement advance;
	MobileElement proceed;
	MobileElement cancel;
	public SettingsPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void Logout() {

		try {

			 
		     //String a2="Application Advanced Settings";
		    //	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+a2+"\").instance(0))");

			logout= findElementById(Constants.logout);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
			logout.click();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void updateApp() {

		try {

			 
		    // String a2="Log Out";
		    //	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+a2+"\").instance(0))");

			updateApp= findElementById(Constants.updateAppbtn);
		updateApp.click();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void switchApp() {

		try {

			 
		 //    String a2="Log Out";
		    //	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+a2+"\").instance(0))");

			switchApp= findElementById(Constants.switchbtn);
			
			switchApp.click();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickAdvanced() {

		try {

			 
		    // String a2="Log Out";
		    //	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+a2+"\").instance(0))");

			//advance= findElementById(Constants.advancedbtn);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
			
			//advance=findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAElement[3]/UIAButton[1]");
			
			
			advance=findElementById(Constants.advancedbtn);
			
			advance.click();
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	public void clickOK() {

		try {
			proceed= findElementById("OK");
			proceed.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void clickProceedIos() {

		try {
			proceed= findElementById("Proceed");
			proceed.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickProceedAndroid() {

		try {
			proceed= findElementByXpath("//android.widget.Button[@text='" + Constants.proceedAndroid + "']");
			proceed.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickCancelAndroid() {

		try {
			cancel= findElementByXpath("//android.widget.Button[@text='" + Constants.cancel + "']");
			cancel.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void clickCancelIos() {

		try {
			cancel= findElementById("Cancel");
			cancel.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void deviceBack() {

		try {
			clickBackButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void deviceHome() {

		try {
			clickHomeButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void deviceappswtich() {

		try {
			clickappswitch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void sureLogout(DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if (platformName.contentEquals("Android")){
			   log=findElementByXpath("//android.widget.Button[@text='Log out']");
			   log.click();}
			else{
				
				   log=findElementById("Log out");
				   log.click();
			}
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void sureCancel(DriverConfig config) {

		try {
			 
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if (platformName.contentEquals("Android")){
			   log=findElementByXpath("//android.widget.Button[@text='Cancel']");
			   log.click();}
			else{
				
				   log=findElementById("Cancel");
				   log.click();}	
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
