package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Summary_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Summary_All_Scenarios extends Base_Class{

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Security_Summary_Module SecSummary;
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Security_Summary");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		SecSummary = new Security_Summary_Module();
		
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
						"Login button visibility " + com.BasePackage.Base_Class.Pagetitle);
				// Log.info("Button visible !");
				Thread.sleep(3000);

				// TC001
				ExtentTestManager.startTest("TC001 : Login for Security Stage module");
				Log.info("Button visible !");
				boolean Login = SecSummary.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button: " + Login);
				Log.info("Login successfully :" + Login);
				
				// TC002
				ExtentTestManager.startTest("TC002 : Navigate to Security Stage");
				boolean TC002_result = SecSummary.VerifySecurityStageAccess();
				ExtentTestManager.getTest().log(Status.PASS, "User is taken to the Security stage of the application. : " + TC002_result);
				Log.info("User is taken to the Security stage of the application. :" + TC002_result);

				// TC003
				ExtentTestManager.startTest("TC003 : Access Security Summary");
				boolean TC003_result = SecSummary.AccessSecuritySummary();
				ExtentTestManager.getTest().log(Status.PASS, "Security Summary Details page is opened. :" + TC003_result);
				Log.info("Security Summary Details page is opened. :" + TC003_result);
				
				// TC004
				ExtentTestManager.startTest("TC004 : Verify Data in 'Plant & Machinery' Field");
				boolean TC004_result = SecSummary.VerifyDatainPlantMachineryField();
				ExtentTestManager.getTest().log(Status.PASS, "'Plant & Machinery' field shows data. : " + TC004_result);
				Log.info("'Plant & Machinery' field shows data. :" + TC004_result);
				
				// TC005
				ExtentTestManager.startTest("TC005 : Verify Data in 'Land' Field");
				boolean TC005_result = SecSummary.VerifyDatainLandField();
				ExtentTestManager.getTest().log(Status.PASS, "'Land Development' field shows data.:" + TC005_result);
				Log.info("'Land Development' field shows data.: " + TC005_result);
				
				// TC006
				ExtentTestManager.startTest("TC006 : Verify Data in 'Land Development' Field");
				boolean TC006_result = SecSummary.VerifyDatainLandDevelopmentField();
				ExtentTestManager.getTest().log(Status.PASS, "'Land Development' field shows data.: " + TC006_result);
				Log.info("'Land Development' field shows data.:" + TC006_result);
				
				// TC007
				ExtentTestManager.startTest("TC007 : Verify Data in 'Utilities' Field");
				boolean TC007_result = SecSummary.VerifyDatainUtilitiesField();
				ExtentTestManager.getTest().log(Status.PASS, "Utilities' field shows data.: " + TC007_result);
				Log.info("'Utilities' field shows data.:" + TC007_result);
				
				// TC008
				ExtentTestManager.startTest("TC008 : Verify Data in 'Misc Fixed Assets' Field.");
				boolean TC008_result = SecSummary.VerifyDatainMiscFixedAssetsField();
				ExtentTestManager.getTest().log(Status.PASS, "'Misc Fixed Assets' field shows data.: " + TC008_result);
				Log.info("'Misc Fixed Assets' field shows data.:" + TC008_result);
				
				// TC009
				ExtentTestManager.startTest("TC009 : Verify Data in 'Vehicles' Field.");
				boolean TC009_result = SecSummary.VerifyDatainVehiclesField();
				ExtentTestManager.getTest().log(Status.PASS, "'Vehicles' field shows data.: " + TC009_result);
				Log.info("'Vehicles' field shows data.:" + TC009_result);
				
				// TC010
				ExtentTestManager.startTest("TC010 : Verify Data in 'Collateral Security' Field.");
				boolean TC010_result = SecSummary.VerifyDatainCollateralSecurityField();
				ExtentTestManager.getTest().log(Status.PASS, "'Collateral Security' field shows data.: " + TC010_result);
				Log.info("'Collateral Security' field shows data.:" + TC010_result);
				
				
				// TC011
				ExtentTestManager.startTest("TC011 : Verify Total Amount Display");
				boolean TC011_result = SecSummary.VerifyTotalAmountDisplay();
				ExtentTestManager.getTest().log(Status.PASS, "Total Amount is shown correctly on the page.: " + TC011_result);
				Log.info("Total Amount is shown correctly on the page. :" + TC011_result);
				
				// TC012
				ExtentTestManager.startTest("TC012 : Verify Personal Guarantee Percentage Display.");
				boolean TC012_result = SecSummary.VerifyPersonalGuaranteePercentageDisplay();
				ExtentTestManager.getTest().log(Status.PASS, "Personal Guarantee percentage is shown correctly.: " + TC012_result);
				Log.info("Personal Guarantee percentage is shown correctly.:" + TC012_result);
				
				// TC013
				ExtentTestManager.startTest("TC013 : Verify Corporate Guarantee Percentage Display.");
				boolean TC013_result = SecSummary.VerifyCorporateGuaranteePercentageDisplay();
				ExtentTestManager.getTest().log(Status.PASS, "Corporate Guarantee percentage is shown correctly.: " + TC013_result);
				Log.info("Corporate Guarantee percentage is shown correctly.:" + TC013_result);
		
				// TC014
				ExtentTestManager.startTest("TC014 : Continue to Document Upload.");
				boolean TC014_result = SecSummary.ContinuetoDocumentUpload();
				ExtentTestManager.getTest().log(Status.PASS, "Document Upload window is opened.: " + TC014_result);
				Log.info("Document Upload window is opened.:" + TC014_result);

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
