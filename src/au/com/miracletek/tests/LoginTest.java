package au.com.miracletek.tests;

import java.io.File;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import au.com.miracletek.common.DriverManager;
import au.com.miracletek.pages.AppCodePage;
import au.com.miracletek.pages.LoginPage;
import au.com.miracletek.pages.TapToLoginPage;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class LoginTest {
	private DriverManager manager;
	private DriverConfig config;
	private AppiumDriverLocalService appiumService;

	@BeforeSuite
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
			"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {

		appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)));
		appiumService.start();
		config = new DriverConfig(platform, platform_name, platform_version, device_name, app_path, app_package,
				app_activity, ud_id, bundle_id, ip_address, port);
	}

	@AfterSuite
	public void closeAppiumServer() {
		appiumService.stop();
	}

	@BeforeTest
	public void setupDriver() {
		manager = DriverManager.getInstance();
		try {
			manager.startDriver(config);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterTest
	public void stopDriver() {
		manager.stopDriver();
	}

	@Test
	public void Login() {
		try {
			
			AppCodePage appCodePage = new AppCodePage(manager.getDriver(), config.getPlatform());
			appCodePage.enterAppCodeAndProceed("georgiou-oneapp");
			TapToLoginPage tapToLogin = new TapToLoginPage(manager.getDriver(), config.getPlatform());
			tapToLogin.tapToLogin();
			LoginPage loginPage = new LoginPage(manager.getDriver(), config.getPlatform());
			loginPage.Login("MIRACLETEK\\stabassum","Sorrento2017");
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
