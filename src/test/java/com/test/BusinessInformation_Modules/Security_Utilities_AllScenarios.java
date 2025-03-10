package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Utilities_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Utilities_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Security_Utilities_Module Security_Utilities_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Utilities");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Security_Utilities_Module = new Security_Utilities_Module();

}
		@Test(dataProvider = "TestData4")
		public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

			try {

				if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
					// TC_BAC_Login_Positive case
					ExtentTestManager.startTest(testdata.get("TestScenario").toString());
					Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
					context.setAttribute("fileName", "LoginButton");
					Base_Class.SetUp();

					ExtentTestManager.getTest().log(Status.PASS,
							"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
					// Log.info("Button visible !");
					Thread.sleep(3000);


	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Security_Utilities_Module");
					Log.info("Button visible !");
					boolean Login = Security_Utilities_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 :Verify User on Security Stage");
					boolean AccessSecurity = Security_Utilities_Module.AccessSecurity();
					ExtentTestManager.getTest().log(Status.PASS, "Navigate to the 'Security' section." + AccessSecurity);
					ExtentTestManager.getTest().log(Status.PASS, "User is successfully navigated to the 'Security' section." + AccessSecurity);
					
					//TC003
					ExtentTestManager.startTest("TC003 :Open Utilities Component");
					boolean VerifyUtilitiesComponent = Security_Utilities_Module.VerifyUtilitiesComponent();
					ExtentTestManager.getTest().log(Status.PASS, "Navigate to the 'Security' section." + VerifyUtilitiesComponent);
					ExtentTestManager.getTest().log(Status.PASS, "User is successfully navigated to the 'Security' section." + VerifyUtilitiesComponent);
					
					//TC003
				
					ExtentTestManager.startTest("TC003 - Open Utilities Component");
					boolean VerifyAddedData = Security_Utilities_Module.VerifyAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Utilities' component." + VerifyAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "'Utilities' page is opened." + VerifyAddedData);
	
				
					//TC004
					ExtentTestManager.startTest("TC004 - Click on Listed Land Development");
					boolean ClickAddedData = Security_Utilities_Module.ClickAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on a listed Land Development from the grid" + ClickAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "'View Land Development Details 'window is opened " + ClickAddedData);
	
					//TC005
					ExtentTestManager.startTest("TC005 - Verify Utilities Loaded in Grid");
					boolean validateUtilityType = Security_Utilities_Module.validateUtilityType();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for 'Utilities' loaded in the grid." + validateUtilityType);
					ExtentTestManager.getTest().log(Status.PASS, "'Utilities' list is present and clickable." + validateUtilityType);
	
					//TC006
					
					ExtentTestManager.startTest("TC006 - Click Utilities in Grid");
					boolean validateGSTCost = Security_Utilities_Module.validateGSTCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Estimated Cost Including GST' field is populated with data for the selected item" + validateGSTCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Estimated Cost Including GST' field is filled with relevant data" + validateGSTCost);
						
					//TC007
					ExtentTestManager.startTest("TC007 -Verify Cancel Button Closes Plant & Machinery Details Page");
					boolean CancleButton = Security_Utilities_Module.CancleButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the cancel button." + CancleButton);
					ExtentTestManager.getTest().log(Status.PASS, "'View Plant & Machinery Details' page is closed." + CancleButton);

					//TC008
					
					ExtentTestManager.startTest("TC008 -Continue Button Functionality");
					boolean ContinueButton = Security_Utilities_Module.ContinueButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the Continue button" + ContinueButton);
					ExtentTestManager.getTest().log(Status.PASS, "The page navigates to 'Building and Civil Works' component" + ContinueButton);

					
					//App Logout

					Thread.sleep(2000);
					driver.quit();
					ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
					Log.info("Logout is done");

					// EndTest
					System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
					ExtentTestManager.endTest();
					ExtentManager.getInstance().flush();
					Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

				}

			} catch (Exception e) {
				System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
							testdata.get("TestScenario").toString());
					ExtentTestManager.getTest().fail(e.getMessage(),
							MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				} catch (Exception e1) {
					System.out.println("File not found " + e1);
				}
				ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

				// Logout
				context.setAttribute("fileName", "Logout");
				driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
			} catch (AssertionError e) {
				System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
							testdata.get("TestScenario").toString());
					ExtentTestManager.getTest().fail(e.getMessage(),
							MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				} catch (Exception e1) {
					System.out.println("File not found " + e1);
				}
				ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

				// Logout
				context.setAttribute("fileName", "Logout");
				// driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
			}

		}

		@DataProvider(name = "TestData4")
		public static Object[][] gettestdate() throws IOException {

			Object[][] objectarry = null;
			java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

			objectarry = new Object[completedata.size()][1];

			for (int i = 0; i < completedata.size(); i++) {
				objectarry[i][0] = completedata.get(i);
			}
			return objectarry;
		}

	}



					
					
	



