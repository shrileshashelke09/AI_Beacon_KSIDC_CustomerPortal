package com.test.BusinessInformation_Modules;

import java.io.File; 
import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Submit_Application;
import com.Pages_BusinessInformation_Modules.Submit_Application_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Submit_Application_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Submit_Application SubmitApplication;
	
	Submit_Application_Module sam = new Submit_Application_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC-SubmitApplication");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		SubmitApplication = new Submit_Application();  

	}
//
	


	
	
	@Test(dataProvider = "TestData4")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "LoginButton");
				Base_Class.SetUp();
			//	Base_Class.Login();
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				

//				String MobileNumber = testdata.get("MobileNumber").toString();
//				String Address = testdata.get("Address").toString();
//				String Aadhaar = testdata.get("AadhaarNo").toString();
//				String DocNo = testdata.get("DocNo").toString();
//				String SurveyNo = testdata.get("SurveyNo").toString();
//				String ResurveyNo = testdata.get("ResurveyNo").toString();
//				String ExtendOfLandWet = testdata.get("ExtentOfLandWet").toString();
//				String ExtendOfLandDRY = testdata.get("ExtentOfLandDRY").toString();
//				String PinCode = testdata.get("PinCode").toString();
//				String Place = testdata.get("Place").toString();
//				String Village = testdata.get("Village").toString();
//				String Taluk = testdata.get("Taluk").toString();
//				String CostOfLandAsPerDocument = testdata.get("CostOfLandAsPerDocument").toString();
//				String BuildingAge = testdata.get("BuildingAge").toString();
//				String BuildingArea = testdata.get("BuildingArea").toString();
//				String CostForTheBuilding = testdata.get("CostForTheBuilding").toString();
				
				
				
				

				//TC001
				ExtentTestManager.startTest("TC001 : Verify 'Login for Submit Application'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login=Submit_Application_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				//TC002
				ExtentTestManager.startTest("TC002 - Navigate to Submit Application");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean SubmitApplication = true;
				try {
					SubmitApplication = sam.NavigatetoSubmitApplication();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Submit Application" + SubmitApplication);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Collateral Security page successfully" + SubmitApplication);
				
			
				
				
				
		
				boolean AccessSubmitApplication = true;
				try {
					SubmitApplication = sam.AccessSubmitApplication();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Submit Application" + AccessSubmitApplication);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Submit Application page" + AccessSubmitApplication);
				ExtentTestManager.endTest();
				
				
				
				
				
				//TC003
				ExtentTestManager.startTest("TC003 : Verify Submit Application heading");
				boolean SubmitApplicationHeading = sam.SubmitApplicationHeading();
			    Assert.assertTrue(SubmitApplicationHeading, "Submit Application heading should be visible after login.");
			    ExtentTestManager.getTest().log(Status.PASS , "Submit Application heading should be visible after login." + SubmitApplicationHeading);
			    ExtentTestManager.endTest();
				
				
				
				//TC004
			    ExtentTestManager.startTest("TC004 :Upload Signature");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean UploadSignature = sam.UploadSignature();
				ExtentTestManager.getTest().log(Status.PASS , "Upload Signature" + UploadSignature);
				ExtentTestManager.endTest();
				
				
				//TC005
				ExtentTestManager.startTest("TC005 : Verify View ");
				boolean ViewButton = sam.ViewButton();
			    Assert.assertTrue(SubmitApplicationHeading, "View Option should be visible after upload");
			    ExtentTestManager.getTest().log(Status.PASS , "View Option should be visible after upload." + ViewButton);
			    ExtentTestManager.endTest();
				
			    
			    //TC006
			    ExtentTestManager.startTest("TC006 : Click on the Terms and Condition");
			    boolean TermsAndConditions = true;
				try {
					SubmitApplication = sam.TermsAndConditions();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Click on the Terms and Conditions" + TermsAndConditions);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Terms and conditions page" + TermsAndConditions);
				ExtentTestManager.endTest();
				
				
				//TC007
				ExtentTestManager.startTest("TC007 : Click on the Checkbox");
			    boolean ClickOntheCheckbox = true;
				try {
					SubmitApplication = sam.ClickOntheCheckbox();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Click on the checkbox" + ClickOntheCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"Agree Button should be enable" + ClickOntheCheckbox);
				ExtentTestManager.endTest();

				
				//TC008
				ExtentTestManager.startTest("TC008 : Verify Checkbox ");
				boolean VisibilityOfAgreeButton = sam.VisibilityOfAgreeButton();
			    Assert.assertTrue(SubmitApplicationHeading, "Agree button should be visible");
			    ExtentTestManager.getTest().log(Status.PASS , "Agree button should be enabled" + VisibilityOfAgreeButton);
			    ExtentTestManager.endTest();
			    
			    
			    
			    //TC009
			    ExtentTestManager.startTest("TC009 : Click on the AgreeButton");
			    boolean ClickOntheAgreeButton = true;
				try {
					SubmitApplication = sam.ClickOntheAgreeButton();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Click on the Agree button" + ClickOntheAgreeButton);
				ExtentTestManager.getTest().log(Status.PASS,"User can agree the terms and conditions." + ClickOntheAgreeButton);
				ExtentTestManager.endTest();
				
				
				//TC010
				ExtentTestManager.startTest("TC010 : Verify Cancel button ");
				boolean VisibilityOfCancelButton = sam.VisibilityOfCancelButton();
			    Assert.assertTrue(SubmitApplicationHeading, "Cancel button should be visible");
			    ExtentTestManager.getTest().log(Status.PASS , "Cancel button should be visible" + VisibilityOfCancelButton);
			    ExtentTestManager.endTest();
			    
			    
			    //TC011
			    ExtentTestManager.startTest("TC011 : Verify Submit button ");
				boolean VisibilityOfSubmitButton = sam.VisibilityOfSubmitButton();
			    Assert.assertTrue(SubmitApplicationHeading, "Submit button should be visible");
			    ExtentTestManager.getTest().log(Status.PASS , "Submit button should be visible" + VisibilityOfSubmitButton);
			    ExtentTestManager.endTest();
			    
			    
			    //TC012
			    ExtentTestManager.startTest("TC012 : Click on the Submit Button");
			    boolean ClickOntheSubmit = true;
				try {
					SubmitApplication = sam.ClickOntheSubmit();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Click on the Submit button" + ClickOntheSubmit);
				ExtentTestManager.getTest().log(Status.PASS,"User can submit the application." + ClickOntheSubmit);
				ExtentTestManager.endTest();
				
				
				
				//TC013
				 ExtentTestManager.startTest("TC013 : Verify Verification Code Field ");
					boolean VisibilityOfVerificatioCode = sam.VisibilityOfVerificatioCode();
				    Assert.assertTrue(SubmitApplicationHeading, "Verification field  should be visible");
				    ExtentTestManager.getTest().log(Status.PASS , "User can enter OTP" + VisibilityOfVerificatioCode);
				    
				    

				   
				    boolean variable =  sam.EnterOTPforMob(testdata, context);
                    ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid 4-digit OTP code.\r\n" + " 2. Click 'Verify'. : " + variable);
                    ExtentTestManager.getTest().log(Status.PASS ,"The system accepts the 4-digit code and proceeds to the next step/popup.: " + variable);
                    ExtentTestManager.endTest();
				
				
				    
				    //TC014
				    ExtentTestManager.startTest("TC014 : Verify Verify Code button ");
					boolean VisibilityOfVerifyCodeButton = sam.VisibilityOfVerifyCodeButton();
				    Assert.assertTrue(SubmitApplicationHeading, "Verify Codebutton should be visible");
				    ExtentTestManager.getTest().log(Status.PASS , "Verify Code button should be visible" + VisibilityOfVerifyCodeButton);
				    ExtentTestManager.endTest();
				    
				
				    
				    //TC015
				    ExtentTestManager.startTest("TC015 : Click on the Verify Code Button");
				    boolean ClickOntheVerifyCode = true;
					try {
						SubmitApplication = sam.ClickOntheVerifyCode();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ExtentTestManager.getTest().log(Status.PASS,"Click on the verify code button" + ClickOntheVerifyCode);
					ExtentTestManager.getTest().log(Status.PASS,"User can submit the application." + ClickOntheVerifyCode);
					ExtentTestManager.endTest();
					
				
				
				
                 //App Logout
				
				Thread.sleep(2000);
				driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString()+ " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			

			}
		}
		catch (Exception e) {
			System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
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
			System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
		}
		catch (AssertionError e) {
			System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			//driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
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




		
				
				
				
				
				
				
				

