package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Application_Summary_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Application_Summary_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Application_Summary_Module Application_Summary_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Security_Plant_Machinery");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Application_Summary_Module = new Application_Summary_Module();

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
					ExtentTestManager.startTest("TC001 : Verify login functionality with valid credentials");
					boolean Login = Application_Summary_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					ExtentTestManager.startTest("TC002 : Navigate to 'Submit Application and Application Summary' stage");
					boolean ApplicationSummaryPage = Application_Summary_Module.ApplicationSummaryPage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to 'Submit Application and Application Summary' menu option." + ApplicationSummaryPage);
					ExtentTestManager.getTest().log(Status.PASS, "'Application Summary' page is opened." + ApplicationSummaryPage);
					
					//TC003
					
					ExtentTestManager.startTest("TC003 : Navigate to 'Submit Application and Application Summary' stage");
					boolean BusinessInfoStage = Application_Summary_Module.BusinessInfoStage();
					ExtentTestManager.getTest().log(Status.PASS, "Verify 'Business Information' stage is selected" + BusinessInfoStage);
					ExtentTestManager.getTest().log(Status.PASS, "'Business Information' stage is selected at the top." + BusinessInfoStage);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Basic Information' page is in 'Go To Page' option");
					boolean BasicInfooption = Application_Summary_Module.BasicInfooption();
					ExtentTestManager.getTest().log(Status.PASS, "Verify the 'Basic Information' page name is selected." + BasicInfooption);
					ExtentTestManager.getTest().log(Status.PASS, "'Basic Information' page name is selected in 'Go To Page'." + BasicInfooption);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 : Open 'Basic Information' page");
					boolean BasicInfoPage = Application_Summary_Module.BasicInfoPage();
					ExtentTestManager.getTest().log(Status.PASS, " Navigate to 'Basic Information' page via the navigation link or drop-down." + BasicInfoPage);
					ExtentTestManager.getTest().log(Status.PASS, "'Basic Information' page is opened in the window." + BasicInfoPage);
				
					//TC006
					
					ExtentTestManager.startTest("TC006 : Verify 'Udyam No/Udyog Aadhaar' field is filled and disabled");
					boolean ValidateUdyamNO = Application_Summary_Module.ValidateUdyamNO();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateUdyamNO);
					ExtentTestManager.getTest().log(Status.PASS, "'Udyam No/Udyog Aadhaar' field is filled with data and is disabled." + ValidateUdyamNO);
				
					//TC007
					
					ExtentTestManager.startTest("TC007 : Verify 'Name Of Enterprise' field is filled and disabled");
					boolean ValidateNameofEnterprise = Application_Summary_Module.ValidateNameofEnterprise();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateNameofEnterprise);
					ExtentTestManager.getTest().log(Status.PASS, "'Name Of Enterprise' field is filled with data and is disabled." + ValidateNameofEnterprise);
				
					//TC008
					
					ExtentTestManager.startTest("TC008 : Verify 'Type Of Enterprise Organization' field is filled and disabled");
					boolean ValidateTypeOfInstitutionOrganizations = Application_Summary_Module.ValidateTypeOfInstitutionOrganizations();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateTypeOfInstitutionOrganizations);
					ExtentTestManager.getTest().log(Status.PASS, "'Type Of Enterprise Organization' field is filled with data and is disabled." + ValidateTypeOfInstitutionOrganizations);
				
					//TC009
					
					ExtentTestManager.startTest("TC009 : Verify 'Class Of Activity' field is filled and disabled");
					boolean ValidateClassofActivity = Application_Summary_Module.ValidateClassofActivity();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateClassofActivity);
					ExtentTestManager.getTest().log(Status.PASS, "'Class Of Activity' field is filled with data and is disabled." + ValidateClassofActivity);
				
					//TC010
					ExtentTestManager.startTest("TC010 : Verify 'Date Of Incorporation' field is filled and disabled");
					boolean ValidateDateOfIncorporation = Application_Summary_Module.ValidateDateOfIncorporation();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDateOfIncorporation);
					ExtentTestManager.getTest().log(Status.PASS, "'Date Of Incorporation' field is filled with data and is disabled." + ValidateDateOfIncorporation);
				
					//TC011
					
					ExtentTestManager.startTest("TC011 : Verify 'Date Of Udyam Registration' field is filled and disabled");
					boolean ValidateDateOfUdyamRegistration = Application_Summary_Module.ValidateDateOfUdyamRegistration();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDateOfUdyamRegistration);
					ExtentTestManager.getTest().log(Status.PASS, "'Date Of Udyam Registration' field is filled with data and is disabled." + ValidateDateOfUdyamRegistration);
				
					//TC012
					
					ExtentTestManager.startTest("TC012 : Verify 'Landline Number' field is filled and disabled");
					boolean ValidateLandLineNo = Application_Summary_Module.ValidateLandLineNo();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateLandLineNo);
					ExtentTestManager.getTest().log(Status.PASS, "'Landline Number' field is filled with data and is disabled." + ValidateLandLineNo);
				
					//TC013
					ExtentTestManager.startTest("TC013 : Verify 'Institution Email' field is filled and disabled");
					boolean ValidateEmailID = Application_Summary_Module.ValidateEmailID();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateEmailID);
					ExtentTestManager.getTest().log(Status.PASS, "'Institution Email' field is filled with data and is disabled." + ValidateEmailID);
				
					//TC014
					
					ExtentTestManager.startTest("TC014 : Verify 'Website' field is filled and disabled");
					boolean ValidateWebsite = Application_Summary_Module.ValidateWebsite();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateWebsite);
					ExtentTestManager.getTest().log(Status.PASS, "'Website' field is filled with data and is disabled." + ValidateWebsite);
				
					//TC015
					
					ExtentTestManager.startTest("TC015 : Verify 'Official Address Of Institution' field is filled and disabled");
					boolean ValidateAddress = Application_Summary_Module.ValidateAddress();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateAddress);
					ExtentTestManager.getTest().log(Status.PASS, "'Official Address Of Institution' field is filled with data and is disabled." + ValidateAddress);
				
					//TC016
					
					ExtentTestManager.startTest("TC016 : Verify 'Landmark' field is filled and disabled");
					boolean ValidateLandMark = Application_Summary_Module.ValidateLandMark();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateLandMark);
					ExtentTestManager.getTest().log(Status.PASS, "'Landmark' field is filled with data and is disabled." + ValidateLandMark);
				
					//TC017
					
					ExtentTestManager.startTest("TC017 : Verify 'Place' field is filled and disabled");
					boolean ValidatePlace = Application_Summary_Module.ValidatePlace();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidatePlace);
					ExtentTestManager.getTest().log(Status.PASS, "'Place' field is filled with data and is disabled." + ValidatePlace);
				
					//TC018
					
					ExtentTestManager.startTest("TC018 : Verify 'Pin' field is filled and disabled");
					boolean ValidatePin = Application_Summary_Module.ValidatePin();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidatePin);
					ExtentTestManager.getTest().log(Status.PASS, "'Pin' field is filled with data and is disabled." + ValidatePin);
				
					//TC019
					
					ExtentTestManager.startTest("TC019 : Verify 'Country' field is filled and disabled");
					boolean ValidateCountry = Application_Summary_Module.ValidateCountry();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateCountry);
					ExtentTestManager.getTest().log(Status.PASS, "'Country' field is filled with data and is disabled." + ValidateCountry);
				
					//TC020
					
					ExtentTestManager.startTest("TC020 : Verify 'State' field is filled and disabled");
					boolean ValidateState = Application_Summary_Module.ValidateState();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateState);
					ExtentTestManager.getTest().log(Status.PASS, "'State' field is filled with data and is disabled." + ValidateState);
				
					
					
					
					
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



					
					
	



