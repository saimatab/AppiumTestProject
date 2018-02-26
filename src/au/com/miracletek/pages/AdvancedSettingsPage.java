package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.util.List;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;


public class AdvancedSettingsPage extends BasePage {
	MobileElement edit;
	MobileElement remove;
	MobileElement info;
	MobileElement updateMetaData;
	MobileElement updateselectPage;
	public AdvancedSettingsPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void updateMetaData() {

		try {
			
			
			
			
			updateMetaData= findElementById(Constants.updateMetaData);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
	updateMetaData.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void SelectPageToUpdate(String xpath) {

		try {

		      //  String xpath = "//UIAApplication[1]/UIAWindow[1]/UIAElement[6]/UIATableView[1]/UIATableCell[1]/UIASwitch[1]";
			
			
		     List <WebElement> ListByXpath = driver.findElements(By.xpath(xpath));

	            for ( int i=0; i <=ListByXpath.size() ; i ++) {

	        String Act =ListByXpath.get(i).getText();
	        
	                ListByXpath.get(i).click();


		} }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void SelectPageToUpdateIos(DriverConfig config ) {

		try {
 String  xpath="";
	String platformName = config.getPlatformName();
	String platformVersion=config.getPlatformVersion();

	            for ( int i=1; i <=1 ; i++) {
  
	  		if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
	    				
	  		  xpath = "//UIAApplication[1]/UIAWindow[1]/UIAElement[6]/UIATableView[1]/UIATableCell[" +i+ "]";
            	
	  		     	
	    			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
	    					
	            	
	            	
	            	xpath="//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[5]/XCUIElementTypeTable[1]/XCUIElementTypeCell[" +i+ "]";        	
	           
	    MobileElement  xpath1=findElementByXpath(xpath);
	            xpath1.click();
               
   
		} }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void SelectPageToUpdateAndroid(String linearLayoutIndex,DriverConfig config ) {

		try {
 String  xpath="";
	String platformName = config.getPlatformName();
	String platformVersion=config.getPlatformVersion();

	
	    MobileElement  xpath1=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='swSelectedId']");
	            xpath1.click();
               
   
		 }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void updateSelectedPage() {

		try {

			
			updateselectPage= findElementById(Constants.updateselPage);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
			updateselectPage.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
