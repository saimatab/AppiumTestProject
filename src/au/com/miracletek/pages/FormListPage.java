package au.com.miracletek.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.ios.IOSDriver;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.Dimension;
public class FormListPage extends BasePage{
	

	MobileElement form;

	public FormListPage (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void selectForm(String formName,DriverConfig config) {

		try {
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();

		
				 
				 switch(formName)
			        {
			            case "DHI - MOBILE PLANT":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.DHIMobilePlant+ "']");
			            	 }
			        		
			    			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			     			form=findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIATableView[1]/UIATableCell[9]/UIAStaticText[3]");
			    				
			    				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			     			  form=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[3]");
			     			    
			     		
			     			
			     			//form=findElementByXpath("//UIAApplication[1]/UIAWindow[1]/UIAElement[1]/UIATableView[1]/UIATableCell[@name='DHI - MOBILE PLANT']");
					
						form.click();
			                break;
			                 
			            default:
			                System.out.println("do none");
			         } 
				 
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

}
