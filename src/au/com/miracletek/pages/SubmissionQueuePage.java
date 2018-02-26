package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;

public class SubmissionQueuePage extends BasePage {
	MobileElement submitpendingform;
	MobileElement removependingform;
	MobileElement editsubmittedform;
	MobileElement removesubmittedform;
	MobileElement peninfo;
	MobileElement subinfo;
	MobileElement submitTab;
	MobileElement yes;
	MobileElement no;
	MobileElement removeall;
	MobileElement viewsubmittedform;
	
	

	public SubmissionQueuePage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}


	public void submitPendingForm(String linearLayoutIndex,DriverConfig config) {

		try {
			
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			 if (platformName.contentEquals("Android"))
			//submitpendingform=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			
			//new
				 
			 submitpendingform =findElementByXpath("//android.widget.ListView[@index='0']//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='buttonSubmitId']");
			 
			 if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			
			
			
			submitpendingform=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");



			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			submitpendingform=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
			submitpendingform.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void RemovePendingForm(String linearLayoutIndex,DriverConfig config) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		 if (platformName.contentEquals("Android"))
			//removependingform=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
			
			
			 //new
			 removependingform =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='buttonRemoveId']");
		 
	       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
				
				removependingform=
						findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[2]");
				

		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			removependingform=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[2]");
			    removependingform.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void openPendingDetailInfoPage(String linearLayoutIndex,DriverConfig config) {

		try {
			
			
			
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
	//peninfo=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
				//new 
			 peninfo =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");
			 
			 else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
		peninfo=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell[1]");
		
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			peninfo=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]");
			
			peninfo.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void clickonsubmittedTab() {

		try {
			submitTab=findElementByXpath("//android.widget.TextView[@text='Submitted']");
		  submitTab.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void opensubmittedDetailInfoPage(String linearLayoutIndex,DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
			
		//subinfo=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
				
				//new  
				 subinfo =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");
			 
		       
		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
		subinfo=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell[1]");
		
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			subinfo=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]");
			
		
			 subinfo.click();
			
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void editSubmittedForm(String linearLayoutIndex,DriverConfig config) {

		try {
			
			
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			 if (platformName.contentEquals("Android"))
			//editsubmittedform=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell[1]");
				//new  
				 editsubmittedform =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='buttonEditAsNewId']");
			 
		       	
					
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			editsubmittedform=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[1]");
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			editsubmittedform=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[1]");
		    
			 editsubmittedform.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void removeSubmittedForm(String linearLayoutIndex,DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
		
			
		 if (platformName.contentEquals("Android"))
			//removesubmittedform=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
			//new  
		 removesubmittedform =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::*/*[@content-desc='buttonRemoveId']");
		 
	       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			removesubmittedform=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[2]");
			
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			removesubmittedform=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[2]");
		    
			
			
			removesubmittedform.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void ViewsubmittedForms(String linearLayoutIndex,DriverConfig config) {

		try {
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
		
			
		 if (platformName.contentEquals("Android")){
			 ///viewsubmittedform=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
			//new  
			 viewsubmittedform =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following::android.widget.Button[@content-desc='buttonViewFormId']");
		
		
		}
		 
	       
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
				viewsubmittedform=findElementByXpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[2]/UIATableView[1]/UIATableCell["+linearLayoutIndex+"]/UIAButton[2]");
			
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
				viewsubmittedform=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeTable[1]/XCUIElementTypeCell["+linearLayoutIndex+"]/XCUIElementTypeButton[2]");
		    
			
			
		 viewsubmittedform.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	
	
	public void removeAllSubmittedForm(String linearLayoutIndex,DriverConfig config) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
			 if (platformName.contentEquals("Android"))
			removeall=findElementById("btnRemoveAllAutomationId");
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
			
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
					
			removeall.click();


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
	
	public void popup1(String response) {

		try {
			
			
			if (response.equals("Yes"))
               {
			yes=findElementByXpath("//*[@text='Remove']");
			yes.click();
               }
             else
                {
            	no=findElementByXpath("//*[@text='Cancel']");
                no.click();
                }		


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
