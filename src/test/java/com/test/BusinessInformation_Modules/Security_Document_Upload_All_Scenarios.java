package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Document_Upload_Module;
import com.Pages_BusinessInformation_Modules.Security_Summary_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Document_Upload_All_Scenarios extends Base_Class{

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Security_Document_Upload_Module Sec_Doc_Upload;
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Document_Upload");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Sec_Doc_Upload = new Security_Document_Upload_Module();
		
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
				boolean Login = Sec_Doc_Upload.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password: " + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button: " + Login);
				Log.info("Login successfully :" + Login);
				
				// TC002
				ExtentTestManager.startTest("TC002 : Navigate to Security Stage");
				boolean TC002_result = Sec_Doc_Upload.VerifySecurityStageAccess();
				ExtentTestManager.getTest().log(Status.PASS, "User is taken to the Security stage of the application. : " + TC002_result);
				Log.info("User is taken to the Security stage of the application. :" + TC002_result);

				// TC003
				ExtentTestManager.startTest("TC003 : Access Upload Document Component");
				boolean TC003_result = Sec_Doc_Upload.UploadDocumentComponent();
				ExtentTestManager.getTest().log(Status.PASS, "Upload Document Component Details page is opened. :" + TC003_result);
				Log.info("Upload Document Component Details page is opened. :" + TC003_result);
				
				// TC004
				ExtentTestManager.startTest("TC004 : Verify Open Document under 'Plant and Machinery'");
				boolean TC004_result = Sec_Doc_Upload.OpenDocumentunderPlantandMachinery();
				ExtentTestManager.getTest().log(Status.PASS, "Document preview opens, displaying its contents. : " + TC004_result);
				Log.info("Document preview opens, displaying its contents. :" + TC004_result);
				
				// TC005
				ExtentTestManager.startTest("TC005 : Verify File Upload Pop-Up for 'Plant and Machinery'");
				boolean TC005_result = Sec_Doc_Upload.FileUploadPopUpforPlantandMachinery("/src/test/resources/sample.pdf");
				ExtentTestManager.getTest().log(Status.PASS, "File Upload pop-up window appears. :" + TC005_result);
				Log.info("File Upload pop-up window appears.: " + TC005_result);
				
				// TC006
				ExtentTestManager.startTest("TC006 : Verify Select and Open PDF Document for 'Plant and Machinery'");
				boolean TC006_result = Sec_Doc_Upload.SelectandOpenPDFDocumentforPlantandMachinery();
				ExtentTestManager.getTest().log(Status.PASS, "PDF document is uploaded successfully.: " + TC006_result);
				Log.info("PDF document is uploaded successfully.:" + TC006_result);
				
				// TC007
				ExtentTestManager.startTest("TC007 : Verify Open Document under 'Land'");
				boolean TC007_result = Sec_Doc_Upload.OpenDocumentunderLand();
				ExtentTestManager.getTest().log(Status.PASS, "Document preview opens, displaying its contents.: " + TC007_result);
				Log.info("Document preview opens, displaying its contents.:" + TC007_result);
				
				// TC008
				ExtentTestManager.startTest("TC008 : Verify File Upload Pop-Up for 'Land'");
				boolean TC008_result = Sec_Doc_Upload.FileUploadPopUpforLand("/src/test/resources/sample.pdf");
				ExtentTestManager.getTest().log(Status.PASS, "File Upload pop-up window opens.: " + TC008_result);
				Log.info("File Upload pop-up window opens.:" + TC008_result);
				
				// TC009
				ExtentTestManager.startTest("TC009 : Verify Select and Open PDF Document for 'Land'");
				boolean TC009_result = Sec_Doc_Upload.SelectandOpenPDFDocumentforLand();
				ExtentTestManager.getTest().log(Status.PASS, "PDF document is uploaded successfully.: " + TC009_result);
				Log.info("PDF document is uploaded successfully.:" + TC009_result);
				
				// TC010
				ExtentTestManager.startTest("TC010 : Verify Continue to 'Submit Application and Application Summary'");
				boolean TC010_result = Sec_Doc_Upload.ContinuetoSubmitApplicationandApplicationSummary();
				ExtentTestManager.getTest().log(Status.PASS, "User is navigated to 'Submit Application and Application Summary' stage.: " + TC010_result);
				Log.info("User is navigated to 'Submit Application and Application Summary' stage.:" + TC010_result);
				
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
