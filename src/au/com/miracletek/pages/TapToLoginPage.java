package au.com.miracletek.pages;
import org.openqa.selenium.remote.RemoteWebDriver;


import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import io.appium.java_client.MobileElement;


public class TapToLoginPage extends BasePage{
	

	MobileElement btn_taptologin;

	public TapToLoginPage (RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void tapToLogin() {

		try {
			   //test1();
			btn_taptologin = findElementById(Constants.taptoLoginButtonId);


			//Assert.assertEquals(btn_taptologin.isDisplayed(), true);
			btn_taptologin.click();

		  
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
