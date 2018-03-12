package au.com.miracletek.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
public class CategoryPage extends BasePage{
	
	MobileElement refresh;
	MobileElement search;
	MobileElement 	form ;
	MobileElement btn_category;
	public CategoryPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void selectCategoryTileView(String Category,DriverConfig config) {

		try {
		
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
				 
				 switch(Category)
			        {
			
			            case "HSE":
			           	 if (platformName.contentEquals("Android"))
			            	//btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.HSECategory + "']");
			           	btn_category=findElementByXpath("//android.view.ViewGroup[@index='0' and @content-desc='btnLayoutId']");
			        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			            	
			           
			        		
			        		btn_category=findElementByXpath("//UIAElement[contains(@name,'HSE')]");
					       
			         				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			            	btn_category=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
						    
			           
			           
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
						
			                break;

			            case "PROJECTS":
			           
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.HSECategory + "']");
						//	 Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;

			            case "SUPERVISOR":
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.supervisorCategory + "']");
						//	 Assert.assertEquals(btn_category.isDisplayed(), true); 
							 btn_category.click();
			                break;
			            case "PLANT":
			              	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.plantCategory + "']");
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			            case "PRECAST":
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.precastCategory + "']");
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			                
			            case "HUMAN RESOURCES":
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.HRCategory + "']");
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			            case "LEARNING & DEVELOPMENT":
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.LDCategory + "']");
						//	 Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			                   
			            case "BUSINESS DEVELOPMENT":
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.BDCategory + "']");
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			            case "FEEDBACK1":
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.feedbackCategory + "']");
			    							// Assert.assertEquals(btn_category.isDisplayed(), true);
			    							 btn_category.click();
			                break;
			                 
			            case "OTHER APPS":
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.otherAppsCategory + "']");
							// Assert.assertEquals(btn_category.isDisplayed(), true);
							 btn_category.click();
			                break;
			                 
			            default:
			                System.out.println("do none");
			         } 
				 
				 
				 
				 
				 
				 
				 
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void selectCategoryListView(String Category,DriverConfig config) {
		

		try {
		
		
			String platformName = config.getPlatformName();
			String platformVersion=config.getPlatformVersion();
				 
				 switch(Category)
			        {
			
			            case "HSE":
			           	 if (platformName.contentEquals("Android"))
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.HSECategory + "']");
			        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"))
			            	
			        
			        		
			        		btn_category=findElementByXpath("//UIAElement[contains(@name,'HSE')]");
					       
			         				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			            	btn_category=findElementByXpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeStaticText[1]");
						    
			           
			       
								btn_category.click();
						
			                break;

			            case "test":
				           	 if (platformName.contentEquals("Android"))
				            	btn_category=findElementByXpath("//android.widget.TextView[@text='test']");
				         	
				         	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"))
				            	btn_category=findElementByXpath("//XCUIElementTypeStaticText[@name='test']");
							    
				           
									btn_category.click();
							
				                break;
			                
			                
			                
			            case "Projects":
			            	 if (platformName.contentEquals("Android"))
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.projCategory1 + "']");
					
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;

			            case "Supervisor":
			            	 if (platformName.contentEquals("Android"))
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.supervisorCategory1 + "']");
					
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			            case "Plant":
			            	 if (platformName.contentEquals("Android"))
			              	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.plantCategory1 + "']");
						
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			            case "Precast":
			            	 if (platformName.contentEquals("Android"))
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.precastCategory1 + "']");
				
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			                
			            case "Human Resources":
			            	 if (platformName.contentEquals("Android"))
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.HRCategory1 + "']");
					
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			            case "Learning & Development":
			            	 if (platformName.contentEquals("Android"))
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.LDCategory1 + "']");
					
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"))
			         					 btn_category.click();
			                break;
			                   
			            case "Business Development":
			            	 if (platformName.contentEquals("Android"))
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.BDCategory1 + "']");
						
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			            case "Feedback1":
			            	 if (platformName.contentEquals("Android"))
			             	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.feedbackCategory1 + "']");
			    					
			    					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));      				
						         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			        		 btn_category.click();
			                break;
			                 
			            case "Other Apps":
			            	 if (platformName.contentEquals("Android"))
			            	btn_category=findElementByXpath("//android.widget.TextView[@text='" + Constants.otherAppsCategory1 + "']");
					
					        	else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
				      				
			         				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("10.2"));
			         					 btn_category.click();
			                break;
			                 
			            default:
			                System.out.println("do none");
			         } 
				 
				 
				 
				 
				 
				 
				 
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public void RefreshviaIcon() {
		
		try {
			refresh = findElementById("refreshImageId");
			performTapAction(refresh);
		   
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
    public void searchForm (String formname,DriverConfig config){
    	
    	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
    	
    	try{
   	 if (platformName.contentEquals("Android"))
			search=findElementByXpath("//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.widget.EditText[@text='Search']");

		if (platformName.contentEquals("iOS") && platformVersion.contentEquals("9.3"));
			else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
		search.clear();
	//	projCode.sendKeys("OneApp Test Project-TE");
	     
	     
	  	search.setValue(formname);
	   	
    	}
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }


    /*public void selectForm (String formname,DriverConfig config){
    	
    	String platformName = config.getPlatformName();
		String platformVersion=config.getPlatformVersion();
    	
    	try{

   		 if (platformName.contentEquals("Android"))
 			//form=findElementByXpath("//android.widget.ListView[@index='0']/android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='" + formname+ "']");
     		
   	//	form=findElementByXpath("//android.widget.ListView[@index='0']/android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']");
 		
   		form=findElementByXpath("//android.widget.TextView[@text='" + Constants.DHIMobilePlant+ "']"); 
   		 

	  		
				else if (platformName.contentEquals("iOS") && platformVersion.contentEquals("11.2"));
   		form=findElementByXpath("//android.widget.TextView[@text='" + Constants.DHIMobilePlant+ "']"); 
  		 

  			
	            	
   		 form.click();
   		 
   		 //form.click();
   		 Thread.sleep(5000);
    	}
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }*/

    public boolean ElementDisplayed() {
	
	boolean a=ElementPresent();	return a;
}


}
