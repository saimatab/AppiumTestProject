package au.com.miracletek.pages;

import java.text.Normalizer.Form;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;

public class Mytasks extends BasePage {
	MobileElement edit;
	MobileElement remove;
	MobileElement info;
	MobileElement removeall;
	MobileElement  refresh;
	MobileElement navup;
	MobileElement  switch1;
	MobileElement  comptasks;
	MobileElement  submit;
	MobileElement  showcompTask;
	public Mytasks(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}
//
	public void openTask(String linearLayoutIndex,DriverConfig config) {

		try {	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();

			
			// nned to generate xpth 
	     	 if (platformName.contentEquals("Android"))
	    		info =findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']");
			//new  info=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[last()]");
	     	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
	     		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
	     			 
			
		info.click();



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void searchTasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		  	 {
		 		
			
		  		findElementByXpath("//android.widget.EditText[@text='Search']").sendKeys("new");
		  		
		  		
		  		//openTask("1",config);
	}
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clearCompletedtasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		  	 {
		 		
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		  removeall =findElementByXpath("//android.widget.Button[@text='Clear Completed Tasks']");  
			  removeall.click();}
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void Completetasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		  	 {
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		 comptasks =findElementByXpath("//android.widget.Button[@text='Complete Task']");  
		  	comptasks.click();}
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void Approvetasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		  	 {
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		 comptasks =findElementByXpath("//android.widget.Button[@text='Approve']");  
		  	comptasks.click();}
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void Rejecttasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		  	 {
			 // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		 comptasks =findElementByXpath("//android.widget.Button[@text='Reject']");  
		  	comptasks.click();}
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void CompleteFormtasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
		  	 if (platformName.contentEquals("Android"))
		 		
		  	 { // removeall=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
			  //new removeall=findElementByXpath("//*[@content-desc='btnRemoveAllId']");
		  		showcompTask =findElementByXpath("//android.widget.Button[@text='auto']");  
		  		showcompTask.click();
		  	submit();
		  	
		  	
		  	 
		  	 }
		   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
		     	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void navigateUp(DriverConfig config) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
		//	   navup=findElementById(Constants.navigateUp);
			Thread.sleep(3000);
	
				if(platformName.contentEquals("Android"))
				{
			  navup=findElementById(Constants.navigateUp);
			navup.click();
				}
				else
				{
					navup=findElementById("Back");
					navup.click();
				}

			
			  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void Refresh(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
	  	 if (platformName.contentEquals("Android"))
			 	
			// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
	  		  refresh =findElementByXpath("//android.widget.Button[@text='Refresh']");  
	        
	   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
	     	
			//new  remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
		 
	   	  refresh.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void submit() {

		try {
		
		     submit=findElementById(Constants.submit);
		 submit.click();
   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void showCompletedTasks(DriverConfig config) {

		try {String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
	  	 if (platformName.contentEquals("Android"))
			 	
			// remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']");
	  	 clickRepeaterSelectSwitch(config);
	        
	   	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
	     	
			//new  remove=findElementByXpath("//android.widget.LinearLayout[@index='" +linearLayoutIndex+"']" + "//following-sibling::*/*[@content-desc='buttonRemoveId']");
		 
	   	  refresh.click();


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void clickRepeaterSelectSwitch(DriverConfig config) {

		try {
		

			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
			if(platformName.contentEquals("Android"))
			{
				
				

		 switch1=findElementByXpath("//android.widget.Switch[@index='0']");
			
		  
		 switch1.click();
		
			}
			else
			{
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
