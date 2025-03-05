package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Building_Civil_Work_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Building_Civil_Work_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Security_Building_Civil_Work_Module Security_Building_Civil_Work_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Security_Plant_Machinery");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Security_Building_Civil_Work_Module = new Security_Building_Civil_Work_Module();

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
					ExtentTestManager.startTest("TC001 : Login for Security_Building_Civil_Work_Module");
					Log.info("Button visible !");
					boolean Login = Security_Building_Civil_Work_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Verify Security Stage Opens with 'Building & Civil Work Details'");
					boolean VerifyBuildingCivilWorkComponent = Security_Building_Civil_Work_Module.VerifyBuildingCivilWorkComponent();
					ExtentTestManager.getTest().log(Status.PASS, ". Click on 'Building & Civil Work Details'" + VerifyBuildingCivilWorkComponent);
					ExtentTestManager.getTest().log(Status.PASS, "The 'Building & Civil Work Details' page opens" + VerifyBuildingCivilWorkComponent);
					
					//TC003
					ExtentTestManager.startTest("TC003 - Verify Click on Grid Row Opens Details");
					boolean ClickAddedData = Security_Building_Civil_Work_Module.ClickAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "Click on a row in the grid" + ClickAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "'View Building & Civil Work Details' page opens" + ClickAddedData);
	
					//TC004
					ExtentTestManager.startTest("TC004 - Verify 'Building Type' Field is Loaded and Disabled");
					boolean validateBuildingType = Security_Building_Civil_Work_Module.validateBuildingType();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Building Type' field" +validateBuildingType);
					ExtentTestManager.getTest().log(Status.PASS, "'Building Type' field is loaded with data and is disabled" + validateBuildingType);
	
					//TC005
					
					ExtentTestManager.startTest("TC005 - Verify 'Existing/Proposed' Field is Loaded and Disabled");
					boolean validateExisting = Security_Building_Civil_Work_Module.validateExisting();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Existing/Proposed' field" + validateExisting);
					ExtentTestManager.getTest().log(Status.PASS, "'Existing/Proposed' field is loaded with data and is disabled" + validateExisting);
						
					//TC006
					
					ExtentTestManager.startTest("TC006 - Verify 'Land Doc No' Field is Loaded and Disabled");
					boolean validateLandDocNo = Security_Building_Civil_Work_Module.validateLandDocNo();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Land Doc No' field" + validateLandDocNo);
					ExtentTestManager.getTest().log(Status.PASS, "'Land Doc No' field is loaded with data and is disabled" + validateLandDocNo);
					
					//TC007
					ExtentTestManager.startTest("TC007 - Verify 'Building Age' Field is Loaded and Disabled");
					boolean validateBuildingAge = Security_Building_Civil_Work_Module.validateBuildingAge();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Building Age' field" + validateBuildingAge);
					ExtentTestManager.getTest().log(Status.PASS, "'Building Age' field is loaded with data and is disabled" + validateBuildingAge);
					
					//TC008
					ExtentTestManager.startTest("TC008 - Verify 'Building Area (In Sq ft)' Field is Loaded and Disabled");
					boolean validateBuildingArea = Security_Building_Civil_Work_Module.validateBuildingArea();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Building Area (In Sq ft)' field" + validateBuildingArea);
					ExtentTestManager.getTest().log(Status.PASS, "'Building Area (In Sq ft)' field is loaded with data and is disabled" + validateBuildingArea);
					
					//TC009
					ExtentTestManager.startTest("TC009 - Verify 'Cost of Building Including GST (?)' Field is Loaded and Disabled");
					boolean validateCost = Security_Building_Civil_Work_Module.validateCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Cost of Building Including GST (?)' field" + validateCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Cost of Building Including GST (?)' field is loaded with data and is disabled" + validateCost);
					
					//TC010
					ExtentTestManager.startTest("TC010 - Verify 'Architect/Engineers Name' Field is Loaded and Disabled");
					boolean validateName = Security_Building_Civil_Work_Module.validateName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the 'Architect/Engineers Name' field" + validateName);
					ExtentTestManager.getTest().log(Status.PASS, "'Architect/Engineers Name' field is loaded with data and is disabled" + validateName);
					
					//TC011
					ExtentTestManager.startTest("TC011 -Verify Cancel Button Closes Plant & Machinery Details Page");
					boolean CancleButton = Security_Building_Civil_Work_Module.CancleButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the cancel button." + CancleButton);
					ExtentTestManager.getTest().log(Status.PASS, "'View Plant & Machinery Details' page is closed." + CancleButton);

					//TC012
					
					ExtentTestManager.startTest("TC012 -Continue Button Functionality");
					boolean ContinueButton = Security_Building_Civil_Work_Module.ContinueButton();
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



					
					
	



