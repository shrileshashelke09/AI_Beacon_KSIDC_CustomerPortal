package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Technical_Know_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Technical_Know_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Technical_Know_Module Technical_Know_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Technical_Know");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Technical_Know_Module = new Technical_Know_Module();

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

					String ServiceType = testdata.get("ServiceType").toString();
					String ServiceProvider = testdata.get("ServiceProvider").toString();
					String FeeAmount = testdata.get("FeeAmount").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Technical_Know_Module");
					Log.info("Button visible !");
					boolean Login = Technical_Know_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Technical_Know_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Technical Know' Presence");
					boolean VerifyTechnicalKnowComponent = Technical_Know_Module.VerifyTechnicalKnowComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Technical Know' component is visible on the page" + VerifyTechnicalKnowComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Technical Knows' component is present" + VerifyTechnicalKnowComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Technical Know' Component Page Opens");
					boolean AccessTechnicalKnowComponent = Technical_Know_Module.AccessTechnicalKnowComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Technical Know' component" + AccessTechnicalKnowComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Technical Know' page opens successfully" + AccessTechnicalKnowComponent);
					
					//TC005
							
								
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Technical Know'");
					boolean VerifyTechnicalKnowComponentHeader = Technical_Know_Module.VerifyTechnicalKnowComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyTechnicalKnowComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Technical Know' is present" + VerifyTechnicalKnowComponentHeader);
							
					
					//TC006
										
					ExtentTestManager.startTest("TC006 : Text Availability Verification");
					boolean VerifyInformativeMessage = Technical_Know_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyInformativeMessage);
					
					//TC007
					ExtentTestManager.startTest("TC007 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Technical_Know_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify Navigation to 'Utilities Development' on Skipping");
					boolean ClickSkipforNowPresence = Technical_Know_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Utilities Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Technical_Know_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Technical_Know_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Utilities\" window." + ClickAddDetailsbutton);
	
					//TC011
					
					ExtentTestManager.startTest("TC011 - Verify Field Types for Service Type");
					boolean EnterServicetype = Technical_Know_Module.EnterServicetype(ServiceType);
					ExtentTestManager.getTest().log(Status.PASS, "Enter alphanumeric data into 'Service Type' field" + EnterServicetype);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + EnterServicetype);

					//TC012
					
					ExtentTestManager.startTest("TC012 - Service Provider Field Visibility and Data Entry");
					boolean EnterServiceProvider = Technical_Know_Module.EnterServiceProvider(ServiceProvider);
					ExtentTestManager.getTest().log(Status.PASS, "Enter alphanumeric data into 'Service Provider' field" + EnterServiceProvider);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterServiceProvider);
				
	
					//TC013
					
					ExtentTestManager.startTest("TC013 - Fee Amount Field Visibility and Data Entry");
					boolean EnterFeeAmount = Technical_Know_Module.EnterFeeAmount(FeeAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Enter numeric data into 'Fee Amount' field" + EnterFeeAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterFeeAmount);
				
					//TC014
					ExtentTestManager.startTest("TC014 :Verify Window Heading'");
    				boolean CancelButtonPresence = Technical_Know_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC015
    				ExtentTestManager.startTest("TC015 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Technical_Know_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC016
    				
    				ExtentTestManager.startTest("TC016 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Technical_Know_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
    				//TC017
    				ExtentTestManager.startTest("TC017 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Technical_Know_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC018
    				
    				ExtentTestManager.startTest("TC018 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Technical_Know_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

   		    		//TC019
    				ExtentTestManager.startTest("TC019 :Verify Data Display in Main Window");
    				boolean DatainGrid = Technical_Know_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc020
    				
    				ExtentTestManager.startTest("TC020 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Technical_Know_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC021
    				
    				ExtentTestManager.startTest("TC021 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Technical_Know_Module.clicktocontinue();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + clicktocontinue);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + clicktocontinue);
    			
    				
    				
    				
					
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



					
					
	



