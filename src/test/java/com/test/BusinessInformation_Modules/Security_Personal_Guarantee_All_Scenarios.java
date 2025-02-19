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
import com.Pages_BusinessInformation_Modules.Security_Corporate_Guarantee_Module;
import com.Pages_BusinessInformation_Modules.Security_MISC_Fixed_Assets_Module;
import com.Pages_BusinessInformation_Modules.Security_Personal_Guarantee_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Personal_Guarantee_All_Scenarios extends Base_Class{

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Security_Personal_Guarantee_Module SecPersonalGuarantee;
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Personal_Guarantee");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		SecPersonalGuarantee = new Security_Personal_Guarantee_Module();
		
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
				boolean Login = SecPersonalGuarantee.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button: " + Login);
				Log.info("Login successfully :" + Login);
				
				// TC002
				ExtentTestManager.startTest("TC002 : Verify page is on Security Stage");
				boolean TC002_result = SecPersonalGuarantee.VerifySecurityStageAccess();
				ExtentTestManager.getTest().log(Status.PASS, "Verify user is on Securtiy Stage page: " + TC002_result);
				Log.info("Security stage page verified successfully :" + TC002_result);
				

				// TC003
				ExtentTestManager.startTest("TC003 : Open Corporate Guarantee details Component");
				boolean TC003_result = SecPersonalGuarantee.OpenPersonalGuaranteeComponent();
				ExtentTestManager.getTest().log(Status.PASS, "verify Personal Guarantee details Component is opened: " + TC003_result);
				Log.info("Personal Guarantee details page is verified successfully :" + TC003_result);
				
				// TC004
				ExtentTestManager.startTest("TC004 : Open Add Details Page");
				boolean TC004_result = SecPersonalGuarantee.OpenAddDetailsPage();
				ExtentTestManager.getTest().log(Status.PASS, "Add Details Page is opened: " + TC004_result);
				Log.info("Verify Add Details Page page is opened. :" + TC004_result);
				
				// TC005
				ExtentTestManager.startTest("TC005 : Select Entrepreneur's Name from Entity Name Dropdown");
				boolean TC005_result = SecPersonalGuarantee.SelectEntrepreneurfromDropdown();
				ExtentTestManager.getTest().log(Status.PASS, "Verify The selected name is displayed in the dropdown: " + TC005_result);
				Log.info("Verify The selected name is displayed in the dropdown: " + TC005_result);
				
				// TC006
				ExtentTestManager.startTest("TC006 : Verify Age Field is Disabled");
				boolean TC006_result = SecPersonalGuarantee.VerifyAgeFieldisDisabled();
				ExtentTestManager.getTest().log(Status.PASS, "Age field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable.: " + TC006_result);
				Log.info("Age field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable. :" + TC006_result);
				
				// TC007
				ExtentTestManager.startTest("TC007 : Verify Share Field is Disabled");
				boolean TC007_result = SecPersonalGuarantee.VerifyShareFieldisDisabled();
				ExtentTestManager.getTest().log(Status.PASS, "Share field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable.: " + TC007_result);
				Log.info("Share field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable. :" + TC007_result);
				
				// TC008
				ExtentTestManager.startTest("TC008 : Verify Net Worth Field is Disabled");
				boolean TC008_result = SecPersonalGuarantee.VerifyNetWorthFieldisDisabled();
				ExtentTestManager.getTest().log(Status.PASS, "Net Worth field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable.: " + TC008_result);
				Log.info("Net Worth field is pre-filled, reflects the Entrepreneur's age, is disabled, and not editable. :" + TC008_result);
				
				// TC009
				ExtentTestManager.startTest("TC009 : Save and Verify Entity in Grid");
				boolean TC009_result = SecPersonalGuarantee.SaveandVerifyEntityinGrid();
				ExtentTestManager.getTest().log(Status.PASS, "verify Entity is saved and listed in the grid.: " + TC009_result);
				Log.info("Verify Entity is saved and listed in the grid:" + TC009_result);
				
				// TC010
				ExtentTestManager.startTest("TC010 : Navigate to Collateral Security");
				boolean TC010_result = SecPersonalGuarantee.NavigatetoCollateralSecurity();
				ExtentTestManager.getTest().log(Status.PASS, "verify Page Navigates to Collateral Security.: " + TC010_result);
				Log.info("Verify Page Navigates to Collateral Security. :" + TC010_result);
				
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
