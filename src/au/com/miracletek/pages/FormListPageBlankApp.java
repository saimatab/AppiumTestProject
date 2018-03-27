package au.com.miracletek.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.ios.IOSDriver;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.Dimension;
public class FormListPageBlankApp extends BasePage{
	

	MobileElement form;

	public FormListPageBlankApp (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void selectForm(String formName,DriverConfig config) {

		try {
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();

		
				 
				 switch(formName)
			        {
			            case "auto":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.Auto+ "']");
			            	 }
			            	 
			        		
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='AUTO']");
				            	
			            	 
			            	 
			            	 form.click();
			                break;
			                
			                
			                
			            case "camera":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.cam+ "']");
			            	 }
			        		
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
						    
			         		form=findElementByXpath("//XCUIElementTypeStaticText[@label='CAMERA']");
			            	 
			            	 
			            	 form.click();
			                break; 
			                
			            case "gallery":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.gal+ "']");
			            	 }
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='GALLARY']");
						    form.click();
			                break;  
			                
			                
			                
			            case "sig":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.sig1+ "']");
			            	 }
			        		
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='TESTSIG']");
								   
			            	 
			            	 
			            	 form.click();
			                break;  
			                
			                
			                
			            case "dtimeupAuto":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.DatTimeUploadAuto+ "']");
			            	 }
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
			    		
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='UPLOAD_DATETIME_AUTOCOM']");
								    
			            	 
						    form.click();
			                break;     
			                
			                
			            case "reppager":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.repager+ "']");
			            	 }
			        		
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
						    
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='REPPAGER']");
								   
			            	 
			            	 form.click();
			                break;     
			                  
			            case "scroll":
			            	 if (platformName.contentEquals("Android"))
			            	 {
			            		 Thread.sleep(3000);
			    			form=findElementByXpath("//android.widget.TextView[@text='" + Constants.scroll+ "']");
			            	 }
			        		
			            		else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
						    
			            		form=findElementByXpath("//XCUIElementTypeStaticText[@label='SCROLL']");
								   
			            	 
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
