package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Misc_Fixed_Asset_Module;
import com.Pages_BusinessInformation_Modules.Security_MISC_Fixed_Assets_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_MISC_Fixed_Assets_AllScenarios extends Base_Class{

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Misc_Fixed_Asset_Module Misc_Fixed_Asset_Module;
	Security_MISC_Fixed_Assets_Module SecMiscFixedAssetModule;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Misc_Fixed_Asset");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Misc_Fixed_Asset_Module = new Misc_Fixed_Asset_Module();
		SecMiscFixedAssetModule = new Security_MISC_Fixed_Assets_Module();

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
				ExtentTestManager.startTest("TC001 : Login for Security Stage module");
				Log.info("Button visible !");
				boolean Login = SecMiscFixedAssetModule.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
				Log.info("Login successfully :" + Login);
				
				// TC002
				ExtentTestManager.startTest("TC002 : Verify page is on Security Stage");
				boolean secStage = SecMiscFixedAssetModule.VerifySecurityStageAccess();
				ExtentTestManager.getTest().log(Status.PASS, "Verify user is on Securtiy Stage page" + secStage);
				Log.info("Security stage page verified successfully :" + secStage);
				

				// TC003
				ExtentTestManager.startTest("TC003 : Open 'Misc Fixed Asset Details' Component");
				boolean openMiscFixAsset = SecMiscFixedAssetModule.OpenMiscFixedAssetDetails();
				ExtentTestManager.getTest().log(Status.PASS, "verify 'Misc Fixed Asset Details' Component is opened" + openMiscFixAsset);
				Log.info("Misc Fixed Asset Details page is verified successfully :" + openMiscFixAsset);
				
				// TC004
				ExtentTestManager.startTest("TC004 : Click on 'MISC FIXED ASSETS' in Grid");
				boolean ClickOnMiscFixAsset = SecMiscFixedAssetModule.ClickOnMiscFixedAssetsGrid();
				ExtentTestManager.getTest().log(Status.PASS, "verify 'Misc Fixed Asset' Component is clicked" + ClickOnMiscFixAsset);
				Log.info("Verify View Misc Fixed Asset Details' page is opened. :" + ClickOnMiscFixAsset);
				
				// TC005
				ExtentTestManager.startTest("TC005 : Verify 'Misc Fixed Asset' Field");
				boolean MiscFixedAssetField = SecMiscFixedAssetModule.VerifyMiscFixedAssetField();
				ExtentTestManager.getTest().log(Status.PASS, "Verify 'Misc Fixed Asset' Field is visible and disabled" + MiscFixedAssetField);
				Log.info("Verify Field is loaded with data and is disabled. :" + MiscFixedAssetField);
				
				// TC006
				ExtentTestManager.startTest("TC006 : Verify 'Cost For Misc Fixed Including GST' Field");
				boolean MiscFixedIncludingGSTField = SecMiscFixedAssetModule.VerifyCostForMiscFixedIncludingGSTField();
				ExtentTestManager.getTest().log(Status.PASS, "Verify 'Cost For Misc Fixed Including GST' Field is visible and disabled" + MiscFixedIncludingGSTField);
				Log.info("Verify 'Cost For Misc Fixed Including GST' Field is loaded with data and is disabled. :" + MiscFixedIncludingGSTField);
				
				// TC007
				ExtentTestManager.startTest("TC007 : Cancel and Close 'View Misc Fixed Asset Details' Page");
				boolean CancelandCloseViewMiscFixedAssetDetailsPage = SecMiscFixedAssetModule.CancelandCloseViewMiscFixedAssetDetailsPage();
				ExtentTestManager.getTest().log(Status.PASS, "verify Misc Fixed Asset Details' page is closed." + CancelandCloseViewMiscFixedAssetDetailsPage);
				Log.info("'View Misc Fixed Asset Details' page is closed. :" + CancelandCloseViewMiscFixedAssetDetailsPage);
				
				// TC008
				ExtentTestManager.startTest("TC008 : click on Continue to Next Component Vehicles");
				boolean ContinuetoNextComponentVehicles = SecMiscFixedAssetModule.ContinuetoNextComponentVehicles();
				ExtentTestManager.getTest().log(Status.PASS, "verify Page navigates to the next component Vehicles." + ContinuetoNextComponentVehicles);
				Log.info("Verify Page navigates to the next component Vehicles. :" + ContinuetoNextComponentVehicles);
				
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
