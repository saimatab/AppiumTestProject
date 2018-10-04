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
			 
			 

			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			
			submitpendingform=findElementByXpath("(//XCUIElementTypeButton[@name='buttonSubmitId'])");
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
		 
	       
	

		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			
			removependingform=findElementByXpath("(//XCUIElementTypeButton[@name'buttonRemoveId']");
		 
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
			 
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			
			//peninfo=findElementByXpath("/XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	
				peninfo=findElementByXpath("//XCUIElementTypeCell");
				//peninfo=findElementByXpath("XCUIElementTypeStaticText[@name='auto']");
					 
	
			peninfo.click();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void clickonsubmittedTab(DriverConfig config) {

		try {
			
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			
			
			
			 if (platformName.contentEquals("Android"))
			submitTab=findElementByXpath("//android.widget.TextView[@text='Sent']");
		  
			
			 else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
					
				 submitTab=findElementByXpath("//XCUIElementTypeButton[@name='Submitted']");
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
			 
		       
		
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			subinfo=findElementByXpath("//XCUIElementTypeCell");
		
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
			 
		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			editsubmittedform=findElementByXpath("//XCUIElementTypeButton[@name='buttonEditAsNewId']");
		    
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
		 
	       
		
			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			
			removesubmittedform=findElementByXpath("//XCUIElementTypeButton[@name='buttonRemoveId'][1]");
		    
			
			
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
		 

			
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			
				viewsubmittedform=findElementByXpath("(//XCUIElementTypeButton[@name='buttonViewFormId'])[1]");
		    
			
			
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
			 {
			removeall=findElementById("btnRemoveAllId");
			removeall.click();
			 }
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
					
			 {	removeall.click();}


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
	
	public void popup1Ios(String response) {

		try {
			
			
			if (response.equals("Yes"))
               {
			yes=findElementById("Remove");
			yes.click();
               }
             else
                {
            	no=findElementById("Cancel");
                no.click();
                }		


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void popupIos(String response) {

		try {
			
			
			if (response.equals("Yes"))
               {
			yes=findElementById("Yes");
			yes.click();
               }
             else
                {
            	no=findElementById("No");
                no.click();
                }		


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
