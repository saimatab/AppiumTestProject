package au.com.miracletek.common;

public class DriverConfig {
	String platform;
	String platform_name;
	String platform_version;
	String device_name;
	String app_path;
    String appcode;
    String username;
    String password;
    String Toemail;
	// android variables
	String app_package;
	String app_activity;
	
	// iOS variables
	String ud_id;
	String bundle_id;
	String automator2;
	String appium_server_url;
	String xcodeorgId;
//
	String xcodesignId;
	public DriverConfig(String platform, String platform_name, String platform_version, String device_name, String app_path,
			String app_package, String app_activity, String ud_id, String bundle_id, String ip_address, int port) {
		this.platform = platform;
		this.platform_name = platform_name;
		this.platform_version = platform_version;
		this.device_name = device_name;
		this.app_path = app_path;

		// android variables
		this.app_package = app_package;
		this.app_activity = app_activity;
		
		// iOS variables
		this.ud_id = ud_id;
		this.bundle_id = bundle_id;
		
		this.appium_server_url = "http://" + ip_address + ":" + port + "/wd/hub";
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getAppiumServerUrl() {
		return appium_server_url;
	}

	public void setAppiumServerUrl(String appium_server_url) {
		this.appium_server_url = appium_server_url;
	}

	public String getPlatformName() {
		return platform_name;
	}

	public void setPlatformName(String platform_name) {
		this.platform_name = platform_name;
	}

	public String getPlatformVersion() {
		return platform_version;
	}

	public void setPlatformVersion(String platform_version) {
		this.platform_version = platform_version;
	}

	public String getDeviceName() {
		return device_name;
	}

	public void setDeviceName(String device_name) {
		this.device_name = device_name;
	}

	public String getAppPackage() {
		return app_package;
	}

	public void setAppPackage(String app_package) {
		this.app_package = app_package;
	}

	public String getAppActivity() {
		return app_activity;
	}

	public void setAppActivity(String app_activity) {
		this.app_activity = app_activity;
	}

	public String getAppPath() {
		return app_path;
	}

	public void setAppPath(String app_path) {
		this.app_path = app_path;
	}
	
	public String getUDId() {
		return ud_id;
	}

	public void setUDId(String ud_id) {
		this.ud_id = ud_id;
	}
	
	public String getBundleId() {
		return bundle_id;
	}

	public void setBundleId(String bundle_id) {
		this.bundle_id = bundle_id;
	}
	
	public String getxcodeorgId() {
		return xcodeorgId;
	}


	public String getxcodesignId() {
		return xcodesignId;
	}

	public void setxcodsignId(String xcodesignId) {
		this.xcodesignId = xcodesignId;
	}
	
	public void setxcodeorgId(String xcodeorgId) {
		this.xcodeorgId = xcodeorgId;
	}
	
	
	public String getUiAutomator2() {
		return automator2;
	}

	
	public String getappcode() {
		return appcode;
	}

	public void setappcode(String appcode) {
		this.appcode = appcode;
	}
	
	
	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}
	
	
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
	
	
	public String getToemail() {
		return Toemail;
	}

	public void setToemail(String Toemail) {
		this.Toemail = Toemail;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setUiAutomator2(String auto2) {
		this.automator2 = auto2;
	}
}
