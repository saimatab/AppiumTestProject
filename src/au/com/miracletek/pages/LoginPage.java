package au.com.miracletek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import io.appium.java_client.MobileElement;


public class LoginPage extends BasePage {
	MobileElement txtuserName;
	MobileElement txtpassword;
	MobileElement btnlogin;
	MobileElement actionBar;
	
	public LoginPage(RemoteWebDriver driver, String platform) throws Exception {
		super(driver, platform);
	}

	public void Login(String userName, String password) {

		try {

			txtuserName = waitForVisibilityOf(By.id(Constants.userName));
			//Assert.assertEquals(txtuserName.isDisplayed(), true);
			typeText(txtuserName, userName);
			driver.findElement(By.id("image1")).click();
			txtpassword = waitForVisibilityOf(By.id(Constants.password));
			//Assert.assertEquals(txtpassword.isDisplayed(), true);
			typeText(txtpassword, password);
			driver.findElement(By.id("image1")).click();
			// btnlogin=waitForVisibilityOf(By.id(Constants.loginBtn));
			// btnlogin=waitForVisibilityOf(By.id(Constants.loginBtn));
			btnlogin = findElementById(Constants.loginBtn);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
		btnlogin.click();
			// actionBar=findElementByXpath("//android.view.ViewGroup[@resource-id='"
			// + Constants.shellActioNbar + "']");
			// Assert.assertEquals(actionBar.isDisplayed(), true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Login1(String userName, String password) {

		try {

			txtuserName = waitForVisibilityOf(By.id(Constants.userName));
			//Assert.assertEquals(txtuserName.isDisplayed(), true);
			typeText(txtuserName, userName);
			driver.findElement(By.id("label1")).click();
			txtpassword = waitForVisibilityOf(By.id(Constants.password));
			//Assert.assertEquals(txtpassword.isDisplayed(), true);
			typeText(txtpassword, password);
			driver.findElement(By.id("label1")).click();
			// btnlogin=waitForVisibilityOf(By.id(Constants.loginBtn));
			// btnlogin=waitForVisibilityOf(By.id(Constants.loginBtn));
			btnlogin = findElementById(Constants.loginBtn);
			// Assert.assertEquals(btnlogin.isDisplayed(, true);
		btnlogin.click();
			// actionBar=findElementByXpath("//android.view.ViewGroup[@resource-id='"
			// + Constants.shellActioNbar + "']");
			// Assert.assertEquals(actionBar.isDisplayed(), true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
