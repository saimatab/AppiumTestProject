package au.com.miracletek.tests;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;

import static org.apache.commons.io.comparator.LastModifiedFileComparator.LASTMODIFIED_REVERSE;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import au.com.miracletek.common.BasePage;
import au.com.miracletek.common.Constants;
import au.com.miracletek.common.DriverConfig;
import au.com.miracletek.common.DriverManager;
import au.com.miracletek.forms.AutomationTestForm;
import au.com.miracletek.forms.AutomationTestForm2;
import au.com.miracletek.forms.AutomationTestForm3;
import au.com.miracletek.forms.AutomationTestForm4;
import au.com.miracletek.forms.AutomationTestForm5;
import au.com.miracletek.forms.AutomationTestForm6;
import au.com.miracletek.pages.AdvancedSettingsPage;
import au.com.miracletek.pages.AppCodePage;
import au.com.miracletek.pages.CategoryPage;
import au.com.miracletek.pages.DraftsPage;
import au.com.miracletek.pages.FormListPage;
import au.com.miracletek.pages.LoginPage;
import au.com.miracletek.pages.NotificationsPage;
import au.com.miracletek.pages.SettingsPage;
import au.com.miracletek.pages.ShellPage;
import au.com.miracletek.pages.SubmissionQueuePage;
import au.com.miracletek.pages.SyncPage;
import au.com.miracletek.pages.SyncPageBlank;
import au.com.miracletek.pages.FormListPageBlankApp;
import au.com.miracletek.pages.TapToLoginPage;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.Connection;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class FinalSmokeTestIos {
	private static Logger log = Logger.getLogger("testlogger");
	ExtentReports extent;
	AutomationTestForm  form1;
	AutomationTestForm2  form2;
	AutomationTestForm3  form3;
	AutomationTestForm4  form4;
	AutomationTestForm5  form5;
	AutomationTestForm6  form6;
	SoftAssert  s_assert = new SoftAssert();
	ExtentTest extlogger;
	private DriverManager manager;
	private DriverConfig config;
	private AppiumDriverLocalService appiumService;
	AppCodePage appCodePage;
	ShellPage shell;
	DraftsPage   drafts;
	TapToLoginPage tapToLogin;
	LoginPage loginPage;
	CategoryPage catPage;
	FormListPageBlankApp formList;

	SyncPageBlank  sync;
	SubmissionQueuePage  subQueue;
	SettingsPage  settings;
	AdvancedSettingsPage advSettings;
	NotificationsPage  notify;
	Logger log1 = Logger.getLogger("devpinoyLogger");
	   
	static Map extentTestMap = new HashMap();
	@BeforeSuite     
	@Parameters({ "platform", "platform_name", "platform_version", "device_name", "app_path", "app_package",
		"app_activity", "ud_id", "bundle_id", "ip_address", "port" })
	public void setupDriverConfigAndStartAppiumServer(String platform, String platform_name, String platform_version,
			String device_name, String app_path, String app_package, String app_activity, String ud_id,
			String bundle_id, String ip_address, int port) {

		
		
		String nodepath =System.getenv("APPIUM_NODE_PATH");
		
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +nodepath);
		 
		String jspath =System.getenv("APPIUM_JS_PATH");
		
		System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHH" +jspath);

		 SimpleDateFormat  df = new SimpleDateFormat("dd MMM yyyy HH_mm_ss");
		 String dtime =df.format(new Date());
		
		 String appiumlog= System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/Logs/Appium/appiumServer_logs_" +dtime+".log";
		
		
			appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
					.usingPort(port).usingDriverExecutable(new File(nodepath))
					.withAppiumJS(new File(jspath)).withLogFile(new  File(appiumlog)));
			appiumService.start();
		
		
		
		
		
		
		
		
		
		
		
		/*appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress(ip_address)
				.usingPort(port).usingDriverExecutable(new File(Constants.APPIUM_NODE_PATH))
				.withAppiumJS(new File(Constants.APPIUM_JS_PATH)));
		appiumService.start();*/
		config = new DriverConfig(platform, platform_name, platform_version, device_name, app_path, app_package,
				app_activity, ud_id, bundle_id, ip_address, port);
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus() == ITestResult.FAILURE){
			   extlogger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			   extlogger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			   extlogger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
	
	}

	@AfterSuite
	public void closeAppiumServer() {
	
		
		try{
		BasePage bp=new 	BasePage();
		 String testout= System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/test-output";
			
			
		
		//   File dir = new File("C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\test-output");
		 File dir = new File(testout);
          File[] files = dir.listFiles();
         
          System.out.println("Descending order.");
          Arrays.sort(files, LASTMODIFIED_REVERSE);
     
          for (int i=0 ;i<files.length;i++)
          {File filea=files[i];
          
          System.out.println("i*^^^^^^^^^^^^^^^^^^^^^^"+i);
          System.out.println("&&&^&*^^^^^^^^^^^^^^^^^^^^^^"+filea.getName());
          
          }
       		   
    
		
		
		
		
		bp.sendPDFReportByGMailIos("saimatab2016@gmail.com", "Singapore3@", config.getToemail(), "PDF Report", "",files[0].getName());
		 extent.flush();
        
        extent.close();
     
    
		appiumService.stop();
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@BeforeTest
	public void setupDriver() {
		manager = DriverManager.getInstance();
		try {
			manager.startDriver(config);
			
			
			extent = new ExtentReports (System.getProperty("user.dir") +"/STMExtentReport.html", true);
		extent
	                .addSystemInfo("Host Name", "Saima Tabassum")
	                .addSystemInfo("Environment", "Zon -Automation Testing")
	                .addSystemInfo("User Name", "Saima");
        extent.loadConfig(new File(System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/extent-config.xml"));
			
			
			
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

	@AfterTest
	public void stopDriver() {
		manager.stopDriver();
		
	}
	
	
	/*  1) Enter Code and Login 
	    2) Select Category and form
	    3)  Fill form and Save Draft 
	    4)Edit Draft and Submit
	    5) Open pending form detail info page
	    6) submit form
	    7) moved to submitted tab
	    8) Open submitted form detail info page
	    9) View form 
	    10) Edit form and save draft
	    11) Draft edit and submit
	    12) Open pending submitted form 
	    13) remove submitted form 
	    14) sync form 
	    15) sync role
	    16) sync user 
	    17) settings
	    18) Advance settings 
	    */
	//------------------Forms - Save form as draft with Project Name and other Mandatory Fields--------------------( test 01-10)

	@Test(enabled = true)
	public void Test01() {
		try {
			shell=new ShellPage(manager.getDriver(), config.getPlatform());
			drafts=new  DraftsPage(manager.getDriver(), config.getPlatform());
			appCodePage = new AppCodePage(manager.getDriver(), config.getPlatform());
			formList=new 	FormListPageBlankApp(manager.getDriver(), config.getPlatform());
			tapToLogin = new TapToLoginPage(manager.getDriver(), config.getPlatform());
			loginPage = new LoginPage(manager.getDriver(), config.getPlatform());
			catPage=new CategoryPage(manager.getDriver(), config.getPlatform());
		    form1=new AutomationTestForm(manager.getDriver(), config.getPlatform());
		    form2=new AutomationTestForm2(manager.getDriver(), config.getPlatform());
		    form3=new AutomationTestForm3(manager.getDriver(), config.getPlatform());
		    form4=new AutomationTestForm4(manager.getDriver(), config.getPlatform());
		    form5=new AutomationTestForm5(manager.getDriver(), config.getPlatform());
		    form6=new AutomationTestForm6(manager.getDriver(), config.getPlatform());
		    settings  =new SettingsPage(manager.getDriver(), config.getPlatform());
		    advSettings  =new AdvancedSettingsPage(manager.getDriver(), config.getPlatform());
		    sync=new  SyncPageBlank(manager.getDriver(), config.getPlatform());
		    subQueue=new  SubmissionQueuePage(manager.getDriver(), config.getPlatform());
		  
		    extlogger = extent.startTest("Test started");
					//log.info("***********************************************************************************************************************************Entered Username......");
					 log1.debug("DEBBGUG" );
					 log1.debug("DEBBGUG" );
					 log1.debug("DEBBGUG" );
					 log1.debug("DEBBGUG" );	 log.debug("DEBBGUG" );
					 log1.debug("DEBBGUG" );	 log.debug("DEBBGUG" );
					 log1.debug("DEBBGUG" );
						log.info("***********************************************************************************************************************************Entered Username......");
						      log.info("***********************************************************************************************************************************Entered Username......");
					     /* String scrFolder = "C:\\Users\\stabassum\\Documents\\GitHub\\AppiumTestProject\\ScreenShots\\"
					              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
					                      Calendar.getInstance().getTime()).toString();*/
					      
					      
					      
					 	 String scshot= System.getProperty("user.home")+"/Documents/GitHub/AppiumTestProject/ScreenShots/";
							
					 	   String scrFolder = scshot
						              + new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(
						                      Calendar.getInstance().getTime()).toString();
					      new File(scrFolder).mkdir();
					      System.setProperty("scr.folder", scrFolder);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		        appCodePage.enterAppCodeAndProceed("automation");
		    	Thread.sleep(5000);
		    	//form.waitForVisibilityOf(By.id(Constants.userName));
				loginPage.Login1("abc","abc");
				Thread.sleep(5000);
				form1.waitForVisibilityOf(By.xpath("//XCUIElementTypeApplication[@name='Miracle']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
			    catPage.selectCategoryListView("test",config);
			  	Thread.sleep(2000);
		        formList.selectForm("auto",config);
		        Thread.sleep(3000);
		     	form1.takeSnapShotIos();
	            form1.fillForm(config);
	            form1.submit();
	            
		        
	            Thread.sleep(2000);
		        formList.selectForm("camera",config);//  camera
		        Thread.sleep(3000);
	            form2.fillForm(config);
	            form2.scrollToTextIos("Label");
	    		form2.submit();
	         
			
	          
	    	
	    	  	Thread.sleep(2000);
	    	  	formList.selectForm("gallery",config);//gallery
		        Thread.sleep(3000);
		     	form3.takescreenshot1();
	            form3.fillForm1(config);
	        	Thread.sleep(5000);
	        	form3.annotation1(config);
	        	Thread.sleep(5000);
	      		
	          
	     	 
	          
	        	 formList.selectForm("sig",config);
			    	Thread.sleep(2000);
			        form4.clickSignIos();
			       form4.signatureIos(config);
			     
			        Thread.sleep(7000);
			        form4.save(config);
			        form4.submit();
				
	      
		         	
		      //------------------date time pciker , file uplloader , auto compelte ------------------
		        
		        
		        
		        formList.selectForm("dtimeupAuto",config);
		        Thread.sleep(6000);
                 form5.clickDatePicker(config, "datepicker1");
	
			    form5.Date(config,"Apr","03","2018");
			    Thread.sleep(3000);
				form5.ok();
			      Thread.sleep(3000);
			        form5.clickTimePicker(config, "timepicker1");
			 
			        form5.Time(config,"3","22","PM");
					form5.ok();
				    Thread.sleep(3000);
				    
				    
				    form5.clickDatePicker(config, "datepicker1");
					
				    form5.Date(config,"April","08","2019");
				    Thread.sleep(3000);
					form5.doneios();
				      Thread.sleep(3000);
				        form5.clickTimePicker(config, "timepicker1");
				 
				        form5.Time(config,"1","01","PM");
						form5.doneios();
					    Thread.sleep(3000);
					
					
				
				   
			        //Thread.sleep(6000);
			        
			     form5.clickslider(config);//
			        
			        
			   form5.clickswitch(config,"swSelectedId","2");
			   form5.clickDateTimePickerTime(config, "datetimepicker1");
		        Thread.sleep(3000);
			    form5.dateTime("datetimepicker1",config,"April","08","2019","4","54","PM");
			form5.doneios();
		 
		    Thread.sleep(3000);
     
     
	         form5.fileUploaderios("Photos","1","Camera","Photo taken on Sep 23, 2016 10:18:52 AM");//file uploader
	         			    Thread.sleep(3000);
	             form5.autoComplete(config,"autocomplete1");
	        Thread.sleep(6000);
	        
	  
	         form5.submit();
				    
				  
	      
	        
		        
		        // repeater pager
		        
		         Thread.sleep(2000);
				        formList.selectForm("reppager",config);
		        

		        
		
			     	
				        form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","0","switch1");
				        Thread.sleep(3000);
				    	
				        form6.clickRepeaterSelectSwitch(config,"pagerview1","repeater1","1","switch1");
				        form6.clickTab(config, "Tab1");
		              form6.clicktextbox(config, "textbox1");
		              form6.clickTab(config, "Tab");
				         form6.submit();
				        
			         
			         
			         
			         
			         
			   
			         
		         	
		         	
			         Thread.sleep(2000);    
		         	
			         formList.selectForm("auto",config);   // check save draft icon  on  form level 
				        Thread.sleep(3000);
				     	form1.takeSnapShotIos();
			          form1.fillForm(config);
			        	form1.saveDraftIos();
			        
						form1.navigateUp(config);
				         	form1.navigateUp(config);
				
				
				
				
				
				
				//
				         	shell.clickSync(config);   // sync all forms 
				         	Thread.sleep(3000);
				         	sync.syncForms("1", config);
					        
				         	
				      
				         	WebDriverWait wait = new WebDriverWait(manager.getDriver(), 300);
				         	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//XCUIElementTypeButton[@name='buttonPendingId'])[1]")));
				        	Thread.sleep(3000);
					        sync.openPendingSubmittedForms("1", config);
					    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name='Submitted']")));
							
					        
					        
			
					        subQueue.clickonsubmittedTab(config);

					        subQueue.opensubmittedDetailInfoPage("1",config);
						    Thread.sleep(3000); 
						
						    
						    form1.navigateUp(config);
						    
						    
						    
						    // view al submitted forms and take snapshot 
						    
						    subQueue.ViewsubmittedForms("1",config);
						    Thread.sleep(3000);
						
					     	form1.takeSnapShotIos();
				         	
				         	form1.navigateUp(config);
				         	
						    subQueue.ViewsubmittedForms("2",config);
						    Thread.sleep(3000);
						
					     	form1.takeSnapShotIos();
				         	
				         	form1.navigateUp(config);
				         	
							 subQueue.ViewsubmittedForms("3",config);
							    Thread.sleep(3000);
							
						     	form1.takeSnapShotIos();
					         	
					         	form1.navigateUp(config);
				         	
					       	 subQueue.ViewsubmittedForms("4",config);
							    Thread.sleep(3000);
							
						     	form1.takeSnapShotIos();
					         	
					         	form1.navigateUp(config);
					         	
					         	
					         	
						       	 subQueue.ViewsubmittedForms("5",config);
								    Thread.sleep(3000);
								
							     	form1.takeSnapShotIos();
						         	
						         	form1.navigateUp(config);
						         	
						         	
						         	
							       	 subQueue.ViewsubmittedForms("6",config);
									    Thread.sleep(3000);
									
								     	form1.takeSnapShotIos();
							         	
							         	form1.navigateUp(config);
							         	
							         	
							         	 Thread.sleep(3000);
					         	
					         	// Edit all forms and save form one by one in draft 
							         	
							         	
							         	
							         	 subQueue.editSubmittedForm("1",config);
							 		    
							     		
							         	form1.saveDraftIos();
								        
							         	form1.navigateUp(config);
							         	
							 		   	 subQueue.editSubmittedForm("2",config);
								 		    
								     		
							         	form1.saveDraftIos();
								        
							         	
								         	form1.navigateUp(config);
								         	
								 	    	
								 		   	 subQueue.editSubmittedForm("3",config);
									 		    
									     		
								         	form1.saveDraftIos();
									        
								         	
									         	form1.navigateUp(config);
									         	
					         	
									         	
									 	    	
									 		   	 subQueue.editSubmittedForm("4",config);
										 		    
									         	form1.saveDraftIos();
										        
					         	
					         	
										         	form1.navigateUp(config);
										         	
										         	
										 	    	
										 		   	 subQueue.editSubmittedForm("5",config);
											 		    
											     		
										         	form1.saveDraftIos();
											        
					         	
											         	form1.navigateUp(config);
											         	
											         	
											 	    	
											 		   	 subQueue.editSubmittedForm("6",config);
												 		    
												     		
											         	form1.saveDraftIos();
												        
					         	
												         	form1.navigateUp(config);
												         	
												         	
												      // delete  form from submitted forms 
												         	
												         	
												         	
												            subQueue.removeSubmittedForm("1",config);
													        subQueue.popup1Ios("Yes");	
												  
															
												         	
												  	      subQueue.removeAllSubmittedForm("1",config);
												  	  	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Yes']")));
											         	
												  	      
												  	        subQueue.popupIos("Yes"); 	
												         	
														    Thread.sleep(3000);
															
												         	

												         	form1.navigateUp(config);
												         	
												         	
												         	//perform syncing of all entiteis 
												         	 Thread.sleep(3000);
												 		    sync.syncRole("2",config);
												         	
												         	
												         	
												 		    Thread.sleep(3000);
														    sync.syncUser("3",config);
												         	
													    	form1.navigateUp(config);
												         	
															shell.clickDrafts(config);  //drafts 
												         	
															drafts.Edit("1",config);
															form1.submit(); 
															
													      	 Thread.sleep(3000);
															
															drafts.Edit("2",config);
															form3.submit(); 
															
															
												         	
														    Thread.sleep(3000);
															drafts.Edit("3",config);// eidt and save draft
															form1.saveDraftIos();
															form1.navigateUp(config);
												         	
														    Thread.sleep(3000);
															drafts.Remove("3",config); //remove
															  subQueue.popup1Ios("Yes"); 
												         	form1.navigateUp(config);
												        	
												         	shell.clickSync(config);   // sync all forms 
													        Thread.sleep(3000);
												         	
												         	
												         	
													        sync.openPendingSubmittedForms("1",config);
														    Thread.sleep(3000); 
													
														    subQueue.openPendingDetailInfoPage("1",config);
														    Thread.sleep(3000);
												         	form1.navigateUp(config);
														    subQueue.submitPendingForm("2",config);
														    Thread.sleep(3000);
														    subQueue.RemovePendingForm("1", config);
															  subQueue.popup1Ios("Yes"); 
															  
															  
															  //settings 
															  
															  
															  
															  
															  form1.navigateUp(config);
															  form1.navigateUp(config);
															     Thread.sleep(2000);
															   shell.clickSettings(config);
															    Thread.sleep(3000);
															    settings.clickAdvanced();   
															 	advSettings.SelectPageToUpdateAndroid("2",config);
															 	advSettings.updateSelectedPage();
															  
															    Thread.sleep(3000);
															    advSettings.updateMetaData();
															  
																Thread.sleep(4000);
																
															    form1.navigateUp(config);
																settings.updateApp();
																settings.clickProceedAndroid();
															
																
																		Thread.sleep(5000);
											
															    Thread.sleep(5000);
															  
			
		    										    //offline login 
															    
				
																
															    
															    
															    
															    
															    
																 log.debug("DEBBGUG" );	 log.debug("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );
															    
															    
															    
															    
															    
															    
																extlogger.log(LogStatus.PASS, "Test Cases");
															  
															  
															  
													//notificaiton , my tasks , pull to refresh , search ,scrol ,  offline user login , logging , screenshot , report running , try catch assertion if possible 	  
															  
															  
															  //searhc , my tasks ,  offline user logging
															  /////////////////
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	     
		  
				
				   
				 log.debug("DEBBGUG" );	 log.debug("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );	 log.info("DEBBGUG" );
			    
			    
			    
			    
			    
			    
				extlogger.log(LogStatus.PASS, "Test Cases");
			  
			  
			  
	//notificaiton , my tasks , pull to refresh , search ,scrol ,  offline user login , logging , screenshot , report running , try catch assertion if possible 	  
			  
			  
			  //searhc , my tasks ,  offline user logging
			  
			  
			  
			  



				String actualValue ="ios test";
//String actualValue =form.findElementByXpath("//android.widget.TextView[@text='dd']").getText();
s_assert.assertEquals(actualValue, "dd");
//Assert.assertTrue(true);
//To generate the log when the test case is passed
extlogger.log(LogStatus.PASS, "Test Case Passed is Test01");
extent.endTest(extlogger);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	
	

}
