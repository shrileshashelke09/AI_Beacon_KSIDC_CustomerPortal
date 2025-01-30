package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.ProjectCost_Document_Upload_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class ProjectCost_Document_Upload_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		ProjectCost_Document_Upload_Module ProjectCost_Document_Upload_Module;
		private static String filePath = "D:\\Git_KSIDC\\KSIDC_CustomerPortal-master\\AI_Beacon_KSIDC_CustomerPortal\\src\\test\\resources\\e-sign.pdf";


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Entity_Doc_Upload");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			ProjectCost_Document_Upload_Module = new ProjectCost_Document_Upload_Module();

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
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = ProjectCost_Document_Upload_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					
					//TC002
					ExtentTestManager.startTest("TC002 - Navigate to Business Finance Stage");
					boolean NavigatetoBusiness = ProjectCost_Document_Upload_Module.NavigatetoBusiness();
					ExtentTestManager.getTest().log(Status.PASS, "Complete the previous stage" + NavigatetoBusiness);
					ExtentTestManager.getTest().log(Status.PASS, "User is navigated to Business Finance stage" + NavigatetoBusiness);
					Log.info("Document Upload clicked");
	
					//TC003
										
					ExtentTestManager.startTest("TC003 - Verify Stage Name Visibility");
					boolean VerifyStageHeading = ProjectCost_Document_Upload_Module.VerifyStageHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the stage name on the page." + VerifyStageHeading);
					ExtentTestManager.getTest().log(Status.PASS, "The stage name 'Project Cost and Means of finance Finalization' is displayed on the page." + VerifyStageHeading);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 - Document Upload Window Heading");
					boolean VerifyDocumentUploadHeader = ProjectCost_Document_Upload_Module.VerifyHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on Document Upload component" + VerifyDocumentUploadHeader);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe Headings" + VerifyDocumentUploadHeader);
					
					
					//TC005
					ExtentTestManager.startTest("TC005 - Open Document Information Session");
					boolean ClickonDoc1 = ProjectCost_Document_Upload_Module.ClickonDoc1();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on document" + ClickonDoc1);
					ExtentTestManager.getTest().log(Status.PASS, "Document is clickable" + ClickonDoc1);
	
						
					//TC006
					
					ExtentTestManager.startTest("TC006 - Open Document Information Session");
					boolean DocumentInfo = ProjectCost_Document_Upload_Module.DocumentInfo();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on document" + DocumentInfo);
					ExtentTestManager.getTest().log(Status.PASS, "Document is clickable" + DocumentInfo);
	
					//TC007
					
					ExtentTestManager.startTest("TC007 - \"Upload Document\" Button Availability");
					boolean UploadDocOption = ProjectCost_Document_Upload_Module.UploadDocOption();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if Upload option is present" + UploadDocOption);
					ExtentTestManager.getTest().log(Status.PASS, "Upload option is present" + UploadDocOption);
					
					//TC008
					ExtentTestManager.startTest("TC008 - \"Upload Document\" Button Functionality");
					boolean Uploadfile = ProjectCost_Document_Upload_Module.UploadDocFile(filePath);
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Upload Document' option" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "2. Browse and select a document <= 5MB" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "3. Click 'Upload'" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "Document is uploaded successfully" + Uploadfile);
									
					//TC008
					
					ExtentTestManager.startTest("TC009 - Confirmation After Mandatory Uploads");
					boolean ClickOnContinue = ProjectCost_Document_Upload_Module.ClickOnContinue();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click Continue" + ClickOnContinue);
					ExtentTestManager.getTest().log(Status.PASS, "Confirmation message appears" + ClickOnContinue);
					
					
					
					
					
					
					
					
					
					
					
					
					
					
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



					
					
	



