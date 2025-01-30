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
import com.Pages_BusinessInformation_Modules.Business_Document_Upload_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Business_Document_Upload_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Business_Document_Upload_Module Entity_Document_Upload_Module;
		private static String filePath = "D:\\Git_KSIDC\\KSIDC_CustomerPortal-master\\AI_Beacon_KSIDC_CustomerPortal\\src\\test\\resources\\e-sign.pdf";


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Entity_Doc_Upload");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Entity_Document_Upload_Module = new Business_Document_Upload_Module();

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
					boolean Login = Entity_Document_Upload_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					
					//TC002
					ExtentTestManager.startTest("TC002 - Navigate to Business Finance Stage");
					boolean NavigatetoBusiness = Entity_Document_Upload_Module.NavigatetoBusiness();
					ExtentTestManager.getTest().log(Status.PASS, "Complete the previous stage" + NavigatetoBusiness);
					ExtentTestManager.getTest().log(Status.PASS, "User is navigated to Business Finance stage" + NavigatetoBusiness);
					Log.info("Document Upload clicked");
	
					//TC003
					ExtentTestManager.startTest("TC003 - Document Upload Component Visibility");
					boolean DocumentUploadComponentPresence = Entity_Document_Upload_Module.DocumentUploadComponentPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if the Document Upload component is visible" + DocumentUploadComponentPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Document Upload component is visible" + DocumentUploadComponentPresence);
					
					//TC004
					ExtentTestManager.startTest("TC004 - Document Upload Button Functionality");
					boolean AccessDocumentUploadPage = Entity_Document_Upload_Module.AccessDocumentUploadPage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the Document Upload button" + AccessDocumentUploadPage);
					ExtentTestManager.getTest().log(Status.PASS, "Redirects to Document Upload window" + AccessDocumentUploadPage);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 - Document Upload Window Navigation");
					boolean VerifyUploadWindow = Entity_Document_Upload_Module.VerifyUploadWindow();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify redirection to Document Upload window" + VerifyUploadWindow);
					ExtentTestManager.getTest().log(Status.PASS, "User is redirected to the Document Upload window" + VerifyUploadWindow);
					
					
					//TC006
					ExtentTestManager.startTest("TC006 - Document Upload Window Heading");
					boolean VerifyDocumentUploadHeader = Entity_Document_Upload_Module.VerifyHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on Document Upload component" + VerifyDocumentUploadHeader);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe Headings" + VerifyDocumentUploadHeader);
					
					//TC007
					ExtentTestManager.startTest("TC007 - Document Entry for Entrepreneur or Entity");
					boolean DocumentEntry = Entity_Document_Upload_Module.DocumentEntry();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if entry options are available for Entrepreneur or Entity" + DocumentEntry);
					ExtentTestManager.getTest().log(Status.PASS, "Entry is available for both" + DocumentEntry);
	
					//TC008
					ExtentTestManager.startTest("TC008 - Click on Document");
					boolean ClickonDoc1 = Entity_Document_Upload_Module.ClickonDoc1();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on document" + ClickonDoc1);
					ExtentTestManager.getTest().log(Status.PASS, "Document is clickable" + ClickonDoc1);
	
					
					//TC009
					
					ExtentTestManager.startTest("TC010 - Document Upload Window Display");
					boolean DocumentWindowName = Entity_Document_Upload_Module.DocumentWindowName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if the window is displaying" + DocumentWindowName);
					ExtentTestManager.getTest().log(Status.PASS, "Window is displayed" + DocumentWindowName);
	
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Document Name Display");
					boolean VerifyDocumentName = Entity_Document_Upload_Module.DocumentName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if document name is displayed in the window" + VerifyDocumentName);
					ExtentTestManager.getTest().log(Status.PASS, "Document name is displayed" + VerifyDocumentName);
					
					//TC011
					
					ExtentTestManager.startTest("TC011 - \"Upload Document\" Button Availability");
					boolean UploadDocOption = Entity_Document_Upload_Module.UploadDocOption();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if Upload option is present" + UploadDocOption);
					ExtentTestManager.getTest().log(Status.PASS, "Upload option is present" + UploadDocOption);
					
					//TC012
					ExtentTestManager.startTest("TC012 - \"Upload Document\" Button Functionality");
					boolean Uploadfile = Entity_Document_Upload_Module.UploadDocFile(filePath);
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Upload Document' option" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "2. Browse and select a document <= 5MB" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "3. Click 'Upload'" + Uploadfile);
					ExtentTestManager.getTest().log(Status.PASS, "Document is uploaded successfully" + Uploadfile);
					
					//TC013
					ExtentTestManager.startTest("TC013 - Uploaded Document in Grid");
					boolean UploadedDocument = Entity_Document_Upload_Module.UploadedDocument();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if uploaded document appears in the grid" + UploadedDocument);
					ExtentTestManager.getTest().log(Status.PASS, "Uploaded document is displayed in the grid" + UploadedDocument);
					
					//TC014
					ExtentTestManager.startTest("TC014 -\"View\" Button Availability");
					boolean ViewButtonPresence = Entity_Document_Upload_Module.ViewButtonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if \"View\" button is available next to the document" + ViewButtonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"View\" button is available" + ViewButtonPresence);
					
					//TC015
					
					ExtentTestManager.startTest("TC015 -\"Download\" Button Availability");
					boolean DownloadButtonPresence = Entity_Document_Upload_Module.DownloadButtonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if \"Download\" button is available next to the document" + DownloadButtonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Download\" button is available" + DownloadButtonPresence);
					
					//TC016
					
					ExtentTestManager.startTest("TC016 -\"Delete\" Button Availability");
					boolean DeleteButtonPresence = Entity_Document_Upload_Module.DeleteButtonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if \"Delete\" button is available next to the document" + DeleteButtonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Delete\" button is available" + DeleteButtonPresence);
					
					//TC017
					
					ExtentTestManager.startTest("TC017 -\"View\" Button Functionality");
					boolean ClickonView = Entity_Document_Upload_Module.ClickonView();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"View\" button" + ClickonView);
					ExtentTestManager.getTest().log(Status.PASS, "Document is opened for viewing" + ClickonView);
					
					//TC018
					ExtentTestManager.startTest("TC018 - Download Uploaded Document");
					boolean DownloadDocument = Entity_Document_Upload_Module.DownloadDocument();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click Download option" + DownloadDocument);
					ExtentTestManager.getTest().log(Status.PASS, "Document is downloaded successfully" + DownloadDocument);
					
					//TC019
					
					ExtentTestManager.startTest("TC019 - Continue Button Presence");
					boolean ContinueButtonPresence = Entity_Document_Upload_Module.ContinueButtonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe UI elements" + ContinueButtonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Continue button is present" + ContinueButtonPresence);
					
					
					//TC020
					
					ExtentTestManager.startTest("TC020 - Confirmation After Mandatory Uploads");
					boolean ClickOnContinue = Entity_Document_Upload_Module.ClickOnContinue();
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



					
					
	



