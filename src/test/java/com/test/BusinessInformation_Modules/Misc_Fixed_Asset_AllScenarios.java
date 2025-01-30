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
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Misc_Fixed_Asset_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Misc_Fixed_Asset_Module Misc_Fixed_Asset_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Misc_Fixed_Asset");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Misc_Fixed_Asset_Module = new Misc_Fixed_Asset_Module();

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

					String CostForUtilityIncludingGST = testdata.get("CostForUtilityIncludingGST").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Misc_Fixed_Asset_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Misc_Fixed_Asset_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Misc Fixed Asset' Presence");
					boolean VerifyMiscFixedAssetComponent = Misc_Fixed_Asset_Module.VerifyMiscFixedAssetComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Misc Fixed Asset' component is visible on the page" + VerifyMiscFixedAssetComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Misc Fixed Asset' component is present" + VerifyMiscFixedAssetComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Misc Fixed Asset' Component Page Opens");
					boolean AccessMiscFixedAssetComponent = Misc_Fixed_Asset_Module.AccessMiscFixedAssetComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Misc Fixed Asset' component" + AccessMiscFixedAssetComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Misc Fixed Asset' page opens successfully" + AccessMiscFixedAssetComponent);
					
					//TC005
							
					ExtentTestManager.startTest("TC005 : **Verify Navigation to \"Misc Fixed Asset Details\" Window**");
					boolean WindowAccess = Misc_Fixed_Asset_Module.WindowAccess();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + WindowAccess);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Misc Fixed Asset' is present" + WindowAccess);
				
					//TC006
					
					ExtentTestManager.startTest("TC006 : Verify specific text availability");
					boolean VerifyStageHeading = Misc_Fixed_Asset_Module.VerifyStageHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyStageHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyStageHeading);
					
											
					//TC007
					
					ExtentTestManager.startTest("TC007 : Verify Correct Heading 'Utilities Details'");
					boolean VerifyMiscFixedAssetComponentHeader = Misc_Fixed_Asset_Module.VerifyMiscFixedAssetComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyMiscFixedAssetComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Misc Fixed Asset' is present" + VerifyMiscFixedAssetComponentHeader);
					
					
					//TC008
					
					ExtentTestManager.startTest("TC008 : Informative Message on Utilities Page");
					boolean VerifyInformativeMessage = Misc_Fixed_Asset_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyInformativeMessage);
					
					//TC009
					ExtentTestManager.startTest("TC009 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Misc_Fixed_Asset_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify Navigation to 'Utilities Development' on Skipping");
					boolean ClickSkipforNowPresence = Misc_Fixed_Asset_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Utilities Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC011
					
					ExtentTestManager.startTest("TC011 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Misc_Fixed_Asset_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC012
					
					ExtentTestManager.startTest("TC012 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Misc_Fixed_Asset_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Utilities\" window." + ClickAddDetailsbutton);
	
					//TC013
					
					ExtentTestManager.startTest("TC013 - Verify Field Types for Utility Type");
					boolean SelectMiscFixedAsset = Misc_Fixed_Asset_Module.SelectMiscFixedAsset();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the Utility Type" + SelectMiscFixedAsset);
					ExtentTestManager.getTest().log(Status.PASS, "Select Option from Dropdown" + SelectMiscFixedAsset);
					ExtentTestManager.getTest().log(Status.PASS, "Selected option displayed" + SelectMiscFixedAsset);

					//TC014
					
					ExtentTestManager.startTest("TC014 - Verify Field for 'Cost For Utility Including GST (?)' Field");
					boolean EnterCost = Misc_Fixed_Asset_Module.EnterCost(CostForUtilityIncludingGST);
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify field presence" + EnterCost);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Numeric input" + EnterCost);
					ExtentTestManager.getTest().log(Status.PASS, "Only Numeric Value accepted" + EnterCost);
				
					
					//TC015
					
					ExtentTestManager.startTest("TC015 :Verify Window Heading'");
    				boolean CancelButtonPresence = Misc_Fixed_Asset_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC016
    				ExtentTestManager.startTest("TC016 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Misc_Fixed_Asset_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC017
    				
    				ExtentTestManager.startTest("TC017 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Misc_Fixed_Asset_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
					//TC018
    				
    				ExtentTestManager.startTest("TC018 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Misc_Fixed_Asset_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC019
    				
    				ExtentTestManager.startTest("TC019 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Misc_Fixed_Asset_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

    				//TC020
    				ExtentTestManager.startTest("TC020 :Verify Data Display in Main Window");
    				boolean DatainGrid = Misc_Fixed_Asset_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc021
    				
    				ExtentTestManager.startTest("TC021 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Misc_Fixed_Asset_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC022
    				
    				ExtentTestManager.startTest("TC022 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Misc_Fixed_Asset_Module.clicktocontinue();
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



					
					
	



