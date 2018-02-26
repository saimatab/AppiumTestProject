package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import io.appium.java_client.MobileElement;


public class AppCodePage extends BasePage {



	public AppCodePage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void enterAppCodeAndProceed(String code) {

		try {
			
			MobileElement et_appcode;
			MobileElement btn_proceed;
			et_appcode =findElementById("appEntryId");

			btn_proceed = findElementById("proceedButtonId");

			typeText(et_appcode, code);
			//typeText(et_appcode, "automation");
		MobileElement logo;
	logo=findElementById("logoImageId");
	logo.click();

			btn_proceed = waitForVisibilityOf(By.id("proceedButtonId"));
			btn_proceed.click(); 
			//Assert.assertEquals(true, btn_proceed.isDisplayed());
			//performTapAction(btn_proceed);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	


}