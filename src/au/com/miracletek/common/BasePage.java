package au.com.miracletek.common;
import io.appium.java_client.MultiTouchAction;
import java.io.File;
import org.openqa.selenium.support.ui.FluentWait;
import javax.activation.FileDataSource;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.mobile.NetworkConnection.ConnectionType;
import org.openqa.selenium.remote.*;
import java.text.SimpleDateFormat;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.TouchAction;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.collections.Lists;
import java.util.List;
import java.time.Duration;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.events.api.general.*;
import java.util.concurrent.TimeUnit;
import java.util.*;
import java.util.stream.*;
import au.com.miracletek.tests.Demo;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.activation.DataHandler;

import javax.activation.DataSource;

import javax.activation.FileDataSource;

import javax.mail.BodyPart;

import javax.mail.Message;
import reports.JyperionListener;
import javax.mail.MessagingException;

import javax.mail.Multipart;

import javax.mail.Session;

import javax.mail.Transport;

import javax.mail.internet.AddressException;

import javax.mail.internet.InternetAddress;

import javax.mail.internet.MimeBodyPart;

import javax.mail.internet.MimeMessage;

import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class BasePage {
	protected MobileDriver driver;
	protected String platform;
    MobileElement mob;
	int  start;
	int end;
	public  BasePage(){
		
	}
	protected BasePage(RemoteWebDriver driver, String platform) throws Exception {
		this.platform = platform;
		if(platform.equals(Constants.PLATFORM_ANDROID)) {
			this.driver = (AndroidDriver<AndroidElement>)driver; 
		} else if(platform.equals(Constants.PLATFORM_IOS)) {
			this.driver = (IOSDriver<IOSElement>)driver; 
		} else {
			throw new Exception("Platform name is unrecognized.");
		}
	}//
	
	public MobileElement waitForVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return (MobileElement)wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
	protected void waitForInVisibilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
       Boolean a=wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

    }
    protected MobileElement waitForClickabilityOf(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
     return (MobileElement)wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    protected void test() {
        WebDriverWait wait = new WebDriverWait(driver, 3000000);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnRemoveAllAutomationId")));
    
    }
    
    public void datePicker(String Month,String Day,String Year) throws Exception
    {
    	if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Month);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Day);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Year);
   		 
    		 
    		 
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    	
    	} 
    	else {
    		throw new Exception("Platform undefined");
    	}
    }
    
    
public void timePicker(String Hour,String Min,String Sec) throws Exception
    {
    	if(platform.equals(Constants.PLATFORM_ANDROID))
    	{
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']")).sendKeys(Hour);
    	((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys(Min);
    		 ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys(Sec);
   		 
    		 
    		 
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    	
    	} 
    	else {
    		throw new Exception("Platform undefined");
    	}
    }



public void pickerByText(String text) throws Exception
{
	if(platform.equals(Constants.PLATFORM_ANDROID))
	{
		MobileElement a= ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.NumberPicker[@index='0']"));

	a.sendKeys("f");
		 
	} else if(platform.equals(Constants.PLATFORM_IOS)){
	
	} 
	else {
		throw new Exception("Platform undefined");
	}
}



    public void typeText(MobileElement element, String text){
    	//element.sendKeys(text);
    	element.setValue(text);
    }
    

    public void swipePageUp(MobileElement element) {
    	//element.swipe(SwipeElementDirection.UP, 10, 10, 1000);
    }

    public MobileElement findElementByXpath(String xpath)throws Exception {

      //  WebDriverWait wait = new WebDriverWait(driver, 30);
      //  return (MobileElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        
       	if(platform.equals(Constants.PLATFORM_ANDROID)){
    		return ((AndroidDriver<MobileElement>)driver).findElement(By.xpath(xpath));
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    		return ((IOSDriver<MobileElement>)driver).findElement(By.xpath(xpath));
    	} else {
    		throw new Exception("Platform undefined");
    	}
    }
  
    
    public void controlcenterIOs(){
    	//not supported in  appium currently 
    	/*JavascriptExecutor js = (JavascriptExecutor) driver;
    	Map<String, Object> appName = new HashMap<>();
    	appName.put("name", "Settings");
    	driver.executeScript("mobile:application:open", appName);
    	driver.executeScript("mobile:application:close", appName);     
    	driver.executeScript("mobile:application:open", appName);
    	 
    	switchToContext(driver, "NATIVE_APP");
    	driver.findElementByXPath("//*[@value=\"Wi-Fi\"]").click();
    	 
    	switchToContext(driver, "NATIVE_APP");
    	WebElement switchOnOff = driver.findElementByXPath("//*[@label=\"Wi-Fi\" and @class=\"UIASwitch\"]");
    	switchOnOff.click();
    	sleep(2000);
    	switchOnOff.click();*/
    
    
    	NetworkConnection mobileDriver = (NetworkConnection) driver;
    	 if (mobileDriver.getNetworkConnection() != ConnectionType.AIRPLANE_MODE) {
    	   // enabling Airplane mode
    	   mobileDriver.setNetworkConnection(ConnectionType.AIRPLANE_MODE);
    	 }

    	
    	
    }
      
    public void gallary(){
    	try {
    		
           
            
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='button13']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@index='0' and ./following-sibling::*[@text='Camera']]")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Photo taken on Sep 23, 2016 10:18:52 AM']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Annotate']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@text='Pick Color']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/color_picker_view']")).click();
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@resource-id='co.miracletek.miracle.a:id/new_color_panel']")).click();
            Dimension size = ((AndroidDriver<MobileElement>)driver).manage ()
            	    .window ()
            	    .getSize ();
            	int startX = size.getWidth () / 2;
            	int startY = size.getHeight () / 2;
            	int endX = 0;
            	int endY = (int) (startY * -1 * 0.75);
            	TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action.press (startX, startY)
            	    .moveTo (endX, endY)
            	    .release ()
            	    .perform ();
    		
    	}
    	
    	
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public void fileUploader(String googleDriveFolderName, String  folderIndex, String folderName, String photoName){
    	try {
    		
           
            
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='browse_button1']")).click();
            
            
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Show roots']")).click();
            
            Thread.sleep(3000);
            //((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.LinearLayout[@index='7']")).click();
            
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.TextView[@text='" +googleDriveFolderName+"']")).click();
            
            
            
            ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@index='" +folderIndex+"' and android.widget.TextView[@text='" +folderName+"']]")).click();
   
           
           // ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='Photo taken on Sep 23, 2016 10:18:52 AM']")).click();
   
             ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//*[@content-desc='" +photoName+"']")).click();
            
    		
    	}
    	
    	
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
   
    public void fileUploaderios(String googleDriveFolderName, String  folderIndex, String folderName, String photoName){
    	try {
    		
           
			findElementById("browse_button1").click();
			Thread.sleep(3000);
			(new TouchAction(driver)).tap(211, 218).perform();
    		
    	}
    	
    	
    	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
    
	public void  signIos(){
		
		try {
		

            	
            	TouchAction action = new TouchAction ((IOSDriver<MobileElement>)driver);
            	
            	(new TouchAction((IOSDriver<MobileElement>)driver))
            	  .press(105, 393)
            	  .moveTo(150, -22)
            	  .release()
            	  .perform();
            	  
            	(new TouchAction((IOSDriver<MobileElement>)driver))
            	  .press(218,  234)
            	  .moveTo( -218, -234)
            	  .release()
            	  .perform();
            	  
            	(new TouchAction((IOSDriver<MobileElement>)driver))
            	  .press(255,  369)
            	  .moveTo(-37, -140)
            	  .release()
            	  .perform();
           
            	
       
            	
            	(new TouchAction((IOSDriver<MobileElement>)driver)).tap(117, 674).perform();
        	
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    

    
    
	public void  sign(){
		
		try {
		
	
        /*Dimension size = ((AndroidDriver<MobileElement>)driver).manage ()
        	    .window ()
        	    .getSize ();
        	int startX = size.getWidth () / 2;
        	int startY = size.getHeight () / 2;
        	int endX = 10;
        	int endY = (int) (startY * 1 * 0.75);
        	TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
        	action.press (startX, startY)
        	    .moveTo (endX, endY)
        	    .release ()
        	    .perform ();*/
        	//1776, 1880
        	Dimension size = ((AndroidDriver<MobileElement>)driver).manage ()
            	    .window ()
            	    .getSize ();
            	int startX = size.getWidth () / 2;
            	int startY = size.getHeight () / 2;
            	int endX = (int) (startX * 1 * 0.5);
            	int endY = (int) (startY * 1 * 0.5);
            	/*TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action.longPress (startX,startY)
            	    .moveTo (endX, endY)
            	    .release ();*/
            	    
            	/*TouchAction action1 = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action1.longPress (endX, endY)
            	    .moveTo (startX, endY)
            	    .release ();*/
            	
            	TouchAction action = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action.longPress (startX,startY)
            	    .moveTo (startX, endY)
            	    .release ();
            	TouchAction action1 = new TouchAction (((AndroidDriver<MobileElement>)driver));
            	action1.longPress (startX, endY)
            	    .moveTo (startX, startY)
            	    .release ();
        
                	new MultiTouchAction((AndroidDriver<MobileElement>)driver).add(action).add(action1).perform();
                	       
            	    
            	 	    
           
            	
       
            	
        
            /*	 MobileElement a=  ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.ImageView[@index='2']"));
            	   
                Actions builder = new Actions(driver);
                Action drawAction = builder.moveToElement(a, startX,  startY)  
                //signatureWebElement is the element that holds the signature element you have in the DOM
                          .click()
                          .moveByOffset( endX, endY)
                          .click()
                          .moveByOffset(startX, endY)
                          .doubleClick()
                        
                          .build();
                drawAction.perform();*/
        	//builder.moveToElement(AgreementSummaryPage.signatureTextArea,135,15) //start points x axis and y axis. .clickAndHold().moveByOffset(165,15). moveByOffset(185,15
        	
        	
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    
    
    
    
    
    public void scrollToText(String text) throws Exception{
    
    	((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
  
    }
    
    
    public void scrollToText1(String  test) {
    	for (int i=0; i <=2; i++)
    	{
    	Dimension dimensions = driver.manage().window().getSize();
    	Double screenHeightStart = dimensions.getHeight() * 0.5;
    	int scrollStart = screenHeightStart.intValue();
    	Double screenHeightEnd = dimensions.getHeight() * 0.6;
    	int scrollEnd = screenHeightEnd.intValue();
    	//((AndroidDriver<MobileElement>) driver).swipe(0,scrollStart,0,scrollEnd,3000);
    	}
    }
    
    
    
    


    

 
 public boolean ElementPresent() {
	//  driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	 
		//if(((AndroidDriver<MobileElement>)driver).findElement(By.id("refreshImageId")).isDisplayed()==true){
		//	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//	return true ;}
		//else 
		//return false;
	 
		try{
			return ((AndroidDriver<MobileElement>)driver).findElement(By.id("refreshImageId")).isDisplayed();
		}
        
        catch(Exception e){
        	return false;
      
        }
        
	 
 }
 public void refreshpullIos(String test) {
	    
 	
 
 		
 				
 	
 	/*(new TouchAction((IOSDriver<MobileElement>)driver))
 	  .press( 322, 160)
 	  .moveTo(-16, 408)
 	  .release()
 	  .perform();*/
 	  
 	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	HashMap scrollObject = new HashMap();
	scrollObject.put("direction", "down");

	js.executeScript("mobile: swipe", scrollObject);*/
    
 
 	}
 	
 public void swipeupIos(String test) {
	    
	 	
	 
		
		
	 	
	 	  
	 	JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap();
		scrollObject.put("direction", "up");

		js.executeScript("mobile: swipe", scrollObject);
	    //driver.performTouchAction(new TouchAction(drivere()).press(145, 567))
		//.moveTo(145, 100).release().perform();
		
	
	 
	 	}
 
 public boolean isElementFoundANDPICKER( String text1) {
   
   try
   {MobileElement text2=  ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.EditText[@index='0']"));
   String text23= text2.getText();
    System.out.println("isElementFound CHEC &&&&&&&&&&&HGG : true :"+text23 + "true");
    
    if(text23.contentEquals(text1))
    {
         System.out.println("isElementFound : true :"+text1 + "true");
         
         return true;    
         
    }
     
     
    else
    {
         System.out.println("isElementFound : false :"+text1);
      	

         int pressX = driver.manage().window().getSize().width / 2;
  	    // 4/5 of the screen as the bottom finger-press point
  	    int bottomY = driver.manage().window().getSize().height * 1/5;
  	    // just non zero point, as it didn't scroll to zero normally
  	    int topY = driver.manage().window().getSize().height / 8;
  	    TouchAction touchAction = new TouchAction(driver);
  	    touchAction.longPress(pressX, bottomY).moveTo(pressX, topY ).release().perform();

         

         return false;
     }

     
   }
   
   catch(Exception e){
	   return false;
   }
     
     
     
     
 }
 
 public void ANDPICK1(String test) {
	  
		

try{

	Dimension size = driver.manage().window().getSize();

	//int pressX = driver.manage().window().getSize().width / 2;
	    // 4/5 of the screen as the bottom finger-press point
	//    int bottomY = driver.manage().window().getSize().height * 4/5;
	    // just non zero point, as it didn't scroll to zero normally
	  //  int topY = driver.manage().window().getSize().height / 8;
	   // TouchAction touchAction = new TouchAction(driver);
	    //touchAction.longPress(400, 1111).moveTo(400, 500).release().perform();
     
     
		//((AndroidDriver<MobileElement>)driver).swipe(400, 1111, 400, 500, 327);
  
          	
}
catch(Exception e){
}
	
}
 public void ANDPICK(String test) {
	  
	
	 boolean done=false;
	 //SOlution 1:
	 //	Dimension  size = driver.manage().window().getSize();
	 	//((AndroidDriver<MobileElement>)driver).swipe(size.width - 10, size.height* 6 / 8, size.width - 10, size.height / 8, 500);
	 
	 //Solution 2findElementByXpath("//android.widget.TextView[@text='" + Constants.DHIMobilePlant+ "']");

try{
	 while(!done){
	
		
		 
		if(isElementFoundANDPICKER(test))
		{
			
			done=true;
		    
		}	
		else
			isElementFoundANDPICKER(test);
	 }
}
catch(Exception e){
}
	
}
 
 public boolean isElementFound( String text) {
     try{
      ((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.TextView[@text='"+text+"']"));
         System.out.println("isElementFound : true :"+text + "true");
     }catch(Exception e){
         System.out.println("isElementFound : false :"+text);
      	
         	 int pressX = driver.manage().window().getSize().width / 2;
         	    // 4/5 of the screen as the bottom finger-press point
         	    int bottomY = driver.manage().window().getSize().height * 4/5;
         	    // just non zero point, as it didn't scroll to zero normally
         	    int topY = driver.manage().window().getSize().height / 8;
         	    TouchAction touchAction = new TouchAction(driver);
         	    touchAction.longPress(pressX, bottomY).moveTo(pressX, topY ).release().perform();


         

         return false;
     }
     return true;
     
     
     
     
     
     
     
 }
 
 public void scrollAND(String test) {
  
	 boolean done=false;
	 //SOlution 1:
	 //	Dimension  size = driver.manage().window().getSize();
	 	//((AndroidDriver<MobileElement>)driver).swipe(size.width - 10, size.height* 6 / 8, size.width - 10, size.height / 8, 500);
	 
	 //Solution 2findElementByXpath("//android.widget.TextView[@text='" + Constants.DHIMobilePlant+ "']");
	 
		int pressX = driver.manage().window().getSize().width / 2;
 	    // 4/5 of the screen as the bottom finger-press point
 	    int bottomY = driver.manage().window().getSize().height * 1/5;
 	    // just non zero point, as it didn't scroll to zero normally
 	    int topY = driver.manage().window().getSize().height / 8;
 	    TouchAction touchAction = new TouchAction(driver);
 	    touchAction.longPress(pressX, bottomY).moveTo(pressX, topY ).release().perform();

try{
	/* while(!done){
	
		
		 
		if(isElementFound(test))
		{
			int pressX = driver.manage().window().getSize().width / 2;
     	    // 4/5 of the screen as the bottom finger-press point
     	    int bottomY = driver.manage().window().getSize().height * 1/5;
     	    // just non zero point, as it didn't scroll to zero normally
     	    int topY = driver.manage().window().getSize().height / 8;
     	    TouchAction touchAction = new TouchAction(driver);
     	    touchAction.longPress(pressX, bottomY).moveTo(pressX, topY ).release().perform();
			done=true;
		    
		}	
		else
			isElementFound(test);
	 }*/
}
catch(Exception e){
	
	
}


	 
	 	}
 public void scrollIos(String test) {
	    
	 
	 	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
 	HashMap scrollObject = new HashMap();
 	scrollObject.put("direction", "down");
 scrollObject.put("name",test);
 	js.executeScript("mobile: scroll", scrollObject);
     
	 	  
	 
	 	}
public void pickerwheelIos(){
	
	try{
		
		MobileElement  m=findElementByXpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel");
  
	
	 /*	JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap scrollObject = new HashMap();
		scrollObject.put("direction", "down");

		js.executeScript("mobile: scroll", scrollObject);*/
		
		//
		
	        Dimension size = m.getSize();

	      /*(new TouchAction(driver))
.press(m, 0, size.height / 2).waitAction(2000)
	                .moveTo(m, size.width / 2, size.height / 2).release()
	      .perform();*/
	
	
	   
	
	}
	
	catch(Exception e)
	{}
	
}
    
    public void scrollToTextIos(String test) {
    
    	
    	/*do {
    		
    					Dimension dimensions = driver.manage().window().getSize();
    					Double screenHeightStart = dimensions.getHeight() * 0.8;
    					int scrollStart = screenHeightStart.intValue();
    					Double screenHeightEnd = dimensions.getHeight() * 0.1;
    					int scrollEnd = screenHeightEnd.intValue();
    				
    		
    					
    				//	((IOSDriver<MobileElement>)driver).swipe(0, scrollStart, 0,scrollEnd, 3000);
    					
    					if(((IOSDriver<MobileElement>)driver).findElement(By.name(test)).isDisplayed()==true)
    					{
    					//MobileElement a=
    						//((IOSDriver<MobileElement>)driver).findElement(By.id(test));
    					
    				//	a.click();
    					break;
    					}
    				
    			} while (true);*/
    	//RemoteWebElement element = (RemoteWebElement)driver.findElementByClassName(â€œandroid.widget.ListViewâ€�);
    	//MobileElement n=(((IOSDriver<MobileElement>)driver).findElementByName(test));
    	//String widId = ((MobileElement) n).getId();
    	//n.tap(1, 1000);
    	//MobileElement  n1=(((IOSDriver<MobileElement>)driver).findElementByName(test));
    	try{
    		MobileElement  m=findElementByXpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel");
        //m.setValue("pine");
      // m.sendKeys("pine");
      
       //List<MobileElement>  m1=((IOSDriver<MobileElement>)driver).findElements(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel"));
       //m.setValue("pine");
      //m1.get(0).setValue("pine");
    	
    	 	JavascriptExecutor js = (JavascriptExecutor) driver;
    		HashMap scrollObject = new HashMap();
    		scrollObject.put("direction", "down");

    		js.executeScript("mobile: scroll", scrollObject);
    
    	}
    	
    	catch(Exception e)
    	{}
    }
    

    
    public void navigateBack() {
    	((AndroidDriver<MobileElement>) driver).navigate().back();
    }
    public void updatePageSource(){
    	((AndroidDriver<MobileElement>) driver).getPageSource();
    }
    
    public void swipePageDown(MobileElement element) {
    //	element.swipe(SwipeElementDirection.DOWN, 10, 10, 1000);
    }


    public void swipeLeftToRight(MobileElement element) {
    	//element.swipe(SwipeElementDirection.RIGHT, 10, 10, 1000);
    }

    public void swipeRightToLeft(MobileElement element) {
    //	element.swipe(SwipeElementDirection.LEFT,10, 10, 1000);
    }

    public void performTapAction(MobileElement element) {
    	//element.tap(1, 1000);
    }
    
    public MobileElement findElementById(String name) throws Exception{
    	if(platform.equals(Constants.PLATFORM_ANDROID)){
    		return ((AndroidDriver<MobileElement>)driver).findElement(By.id(name));
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    		return ((IOSDriver<MobileElement>)driver).findElement(By.name(name));
    	} else {
    		throw new Exception("Platform undefined");
    	}
    }

    public MobileElement findElementByName(String name) throws Exception{
    	if(platform.equals(Constants.PLATFORM_ANDROID)){
    		return ((AndroidDriver<MobileElement>)driver).findElement(By.name(name));
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    		return ((IOSDriver<MobileElement>)driver).findElement(By.name(name));
    	} else {
    		throw new Exception("Platform undefined");
    	}
    }
    public void findElementWithinElementByNameAndClick(MobileElement element ,String name) throws Exception{
    	if(platform.equals(Constants.PLATFORM_ANDROID)){
    		element.findElement(By.name(name)).click();
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    		element.findElement(By.name(name)).click();
    	} else {
    		throw new Exception("Platform undefined");
    	}
    }
    
    public void swipe (){
    	
    	//((AndroidDriver<MobileElement>)driver).swipe(560, 817, 588, 964, 327);
    	
    }
    
    public void hideKeyBoard() throws Exception{
    	if(platform.equals(Constants.PLATFORM_ANDROID)){
    		((AndroidDriver<MobileElement>)driver).hideKeyboard();
    	} else if(platform.equals(Constants.PLATFORM_IOS)){
    		((IOSDriver<MobileElement>)driver).hideKeyboard();
    	} else {
    		throw new Exception("Platform undefined");
    	}
    }
    
    public void takeSnapShotAndroid() throws Exception {
        String scrFolder = System.getProperty("scr.folder");
        System.out.println("SCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDER"+scrFolder );
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
        
        MobileElement  test=((AndroidDriver<MobileElement>)driver).findElement(By.xpath("//android.widget.TextView[@index='2']"));
        
      String text= test.getAttribute("text");

      String date= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
      String fileName=text+"_"+date;
      
      int count=1;
      
       // String date =  new SimpleDateFormat("yyyyMMddhhmmss'").format(new Date());
		//FileUtils.copyFile(scrFile, new File("/screenshots/automationTest-snapshot.jpg"));
    	//final FileUtils.copyFile(scrFile, new File("C:\\screenshots\\"+fileName+".jpg"));
  
FileUtils.copyFile(scrFile, new File(scrFolder   + "/" +fileName+".jpg"));
System.out.println("FINAL SCREEEN SHOT FOLDDER "+scrFolder   + "/" +fileName+".jpg" );
      
    }
public void takeSnapShotIos() throws Exception {
    String scrFolder = System.getProperty("scr.folder");
    System.out.println("SCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFOLDERSCRFIOSSOLDERSCRFOLDERSCRFOLDERSCRFOLDERIOS"+scrFolder );
    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
        
        MobileElement  test=((IOSDriver<MobileElement>)driver).findElement(By.xpath("//XCUIElementTypeNavigationBar//XCUIElementTypeOther"));
        
      String text= test.getAttribute("label");

      String date= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
      String fileName=text+"_"+date;
      
      int count=1;
      
      
    	//FileUtils.copyFile(scrFile, new File("//Users//miracletek//Documents//GitHub//AppiumTestProject//"+fileName+".jpg"));
      FileUtils.copyFile(scrFile, new File(scrFolder   + "/" +fileName+".jpg"));
      System.out.println("FINAL SCREEEN SHOT FOLDDER "+scrFolder   + "/" +fileName+".jpg" );


}
    
    public void clickBackButton(){
    	((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
	}
    public void clickHomeButton(){
    	((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.HOME);
	}
    public void clickappswitch(){
    	((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	}
    
    public void clickHomeButtonIos(){
    	//((IOSDriver) driver).runAppInBackground(5);
    	
    
	}
  
    public  void takeSnapShot1(String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)(AndroidDriver<MobileElement>)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

            

    }
    
    public void sendPDFReportByGMail1(String from, String pass, String to, String subject, String body,String file)throws Exception {

    	Properties props = System.getProperties();

    	String host = "smtp.gmail.com";

    	props.put("mail.smtp.starttls.enable", "true");

    	props.put("mail.smtp.host", host);

    	props.put("mail.smtp.user", from);

    	props.put("mail.smtp.password", pass);

    	props.put("mail.smtp.port", "587");

    	props.put("mail.smtp.auth", "true");

    	Session session = Session.getDefaultInstance(props);

    	MimeMessage message = new MimeMessage(session);

    	try {
    		//Thread.sleep(180000);

    	    //Set from address

    	message.setFrom(new InternetAddress(from));

    	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

    	//Set subject

    	message.setSubject(subject);

    	message.setText(body);

    	BodyPart objMessageBodyPart = new MimeBodyPart();
    	BodyPart objMessageBodyPart2 = new MimeBodyPart();
    	BodyPart objMessageBodyPart3 = new MimeBodyPart();
    	
    	objMessageBodyPart.setText("Please Find The Attached Report File!");

    	Multipart multipart = new MimeMultipart();

    

    

       String  var=Demo.fileName;
         // System.out.println("#######################################################"+var);
    
    	String filename1 = System.getProperty("user.dir")+"\\" +var+ ".pdf";

    	//Create data source to attach the file in mail

    	FileDataSource source = new FileDataSource(filename1);

    	objMessageBodyPart.setDataHandler(new DataHandler(source));

    	objMessageBodyPart.setFileName(filename1);

    	multipart.addBodyPart(objMessageBodyPart);
    	
    	////////////////////////////////
    	
    	objMessageBodyPart2.setText("Please Find The Attached Report File2!");

   

    

    	//
    	

   
         // System.out.println("#######################################################"+var);
    
    	String var1="STMExtentReport";
    	String filename2 = System.getProperty("user.dir")+"\\" +var1+ ".html";

    	//Create data source to attach the file in mail

    	FileDataSource source2 = new FileDataSource(filename2);

    	objMessageBodyPart2.setDataHandler(new DataHandler(source2));

    	objMessageBodyPart2.setFileName(filename2);

    	multipart.addBodyPart(objMessageBodyPart2);

    
    	
    	
    	
    	
    	
    	
    	

    	message.setContent(multipart);

    	Transport transport = session.getTransport("smtp");

    	transport.connect(host, from, pass);


    	transport.sendMessage(message, message.getAllRecipients());

    	transport.close();

    	}

    	catch (AddressException ae) {

    	ae.printStackTrace();

    	}

    	catch (MessagingException me) {

    	me.printStackTrace();

    	}
    	catch (Exception me1) {

        	me1.printStackTrace();

        	}
    	} 
    
   public void sendPDFReportByGMail (String from, String pass, String to, String subject, String body)throws Exception {

    	Properties props = System.getProperties();

    	String host = "smtp.gmail.com";

    	props.put("mail.smtp.starttls.enable", "true");

    	props.put("mail.smtp.host", host);

    	props.put("mail.smtp.user", from);

    	props.put("mail.smtp.password", pass);

    	props.put("mail.smtp.port", "587");

    	props.put("mail.smtp.auth", "true");

    	Session session = Session.getDefaultInstance(props);

    	MimeMessage message = new MimeMessage(session);

    	try {
    		//Thread.sleep(180000);

    	    //Set from address

    	message.setFrom(new InternetAddress(from));

    	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

    	//Set subject

    	message.setSubject(subject);

    	message.setText(body);

    	BodyPart objMessageBodyPart = new MimeBodyPart();

    	objMessageBodyPart.setText("Please Find The Attached Report File!");

    	Multipart multipart = new MimeMultipart();

    	multipart.addBodyPart(objMessageBodyPart);

    	objMessageBodyPart = new MimeBodyPart();

    	//Set path to the pdf report file
    //	JyperionListener j=new JyperionListener();
    	

       String  var=Demo.fileName;
         // System.out.println("#######################################################"+var);
    
    	String filename1 = System.getProperty("user.dir")+"\\" +var+ ".pdf";

    	//Create data source to attach the file in mail

    	DataSource source = new FileDataSource(filename1);

    	objMessageBodyPart.setDataHandler(new DataHandler(source));

    	objMessageBodyPart.setFileName(filename1);

    	multipart.addBodyPart(objMessageBodyPart);

    	message.setContent(multipart);

    	Transport transport = session.getTransport("smtp");

    	transport.connect(host, from, pass);


    	transport.sendMessage(message, message.getAllRecipients());

    	transport.close();

    	}

    	catch (AddressException ae) {

    	ae.printStackTrace();

    	}

    	catch (MessagingException me) {

    	me.printStackTrace();

    	}
    	catch (Exception me1) {

        	me1.printStackTrace();

        	}
    	}
   
   public void sendPDFReportByGMailIos  (String from, String pass, String to, String subject, String body,String file) throws Exception{

   /*	Properties props = System.getProperties();

   	String host = "smtp.gmail.com";

   	props.put("mail.smtp.starttls.enable", "true");

   	props.put("mail.smtp.host", host);

   	props.put("mail.smtp.user", from);

   	props.put("mail.smtp.password", pass);

   	props.put("mail.smtp.port", "587");

   	props.put("mail.smtp.auth", "true");

   	Session session = Session.getDefaultInstance(props);
  
   	MimeMessage message = new MimeMessage(session);

   	try {

   	    //Set from address

   	message.setFrom(new InternetAddress(from));

   	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

   	//Set subject

   	message.setSubject(subject);

   	message.setText(body);

   	BodyPart objMessageBodyPart = new MimeBodyPart();

   	objMessageBodyPart.setText("Please Find The Attached Report File!");

   	Multipart multipart = new MimeMultipart();

   	multipart.addBodyPart(objMessageBodyPart);

   	objMessageBodyPart = new MimeBodyPart();

   	//Set path to the pdf report file
   	
	JyperionListener j=new JyperionListener();
    
   	String filename = System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/" + Demo.fileName+ ".pdf";

   	//Create data source to attach the file in mail

   	DataSource source = new FileDataSource(filename);

   	objMessageBodyPart.setDataHandler(new DataHandler(source));

   	objMessageBodyPart.setFileName(filename);

   	multipart.addBodyPart(objMessageBodyPart);

   	message.setContent(multipart);

   	Transport transport = session.getTransport("smtp");

   	transport.connect(host, from, pass);

   	transport.sendMessage(message, message.getAllRecipients());

   	transport.close();

   	}

   	catch (AddressException ae) {

   	ae.printStackTrace();

   	}

   	catch (MessagingException me) {

   	me.printStackTrace();

   	}

   	}*/
   
   
   
   ////
   
   
   Properties props = System.getProperties();

	String host = "smtp.gmail.com";

	props.put("mail.smtp.starttls.enable", "true");

	props.put("mail.smtp.host", host);

	props.put("mail.smtp.user", from);

	props.put("mail.smtp.password", pass);

	props.put("mail.smtp.port", "587");

	props.put("mail.smtp.auth", "true");

	Session session = Session.getDefaultInstance(props);

	MimeMessage message = new MimeMessage(session);

	try {
		//Thread.sleep(180000);

	    //Set from address

	message.setFrom(new InternetAddress(from));

	message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	//Set subject

	message.setSubject(subject);

	message.setText(body);

	BodyPart objMessageBodyPart = new MimeBodyPart();
	BodyPart objMessageBodyPart2 = new MimeBodyPart();
	BodyPart objMessageBodyPart3 = new MimeBodyPart();
	
	objMessageBodyPart.setText("Please Find The Attached Report File!");

	Multipart multipart = new MimeMultipart();





  String  var=Demo.fileName;
    // System.out.println("#######################################################"+var);
	String filename1 = System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/" + Demo.fileName+ ".pdf";


	//Create data source to attach the file in mail

	FileDataSource source = new FileDataSource(filename1);

	objMessageBodyPart.setDataHandler(new DataHandler(source));

	objMessageBodyPart.setFileName(filename1);

	multipart.addBodyPart(objMessageBodyPart);
	
	////////////////////////////////
	
	objMessageBodyPart2.setText("Please Find The Attached Report File2!");





	//
	


    // System.out.println("#######################################################"+var);

	String var1="STMExtentReport";
	
 	String filename2 = System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/" + var1+ ".html";
	//Create data source to attach the file in mail

	FileDataSource source2 = new FileDataSource(filename2);

	objMessageBodyPart2.setDataHandler(new DataHandler(source2));

	objMessageBodyPart2.setFileName(filename2);

	multipart.addBodyPart(objMessageBodyPart2);


	
	
	
	
	
	
	

	message.setContent(multipart);

	Transport transport = session.getTransport("smtp");

	transport.connect(host, from, pass);


	transport.sendMessage(message, message.getAllRecipients());

	transport.close();

	}

	catch (AddressException ae) {

	ae.printStackTrace();

	}

	catch (MessagingException me) {

	me.printStackTrace();

	}
	catch (Exception me1) {

   	me1.printStackTrace();

   	}
   
   
   
   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
