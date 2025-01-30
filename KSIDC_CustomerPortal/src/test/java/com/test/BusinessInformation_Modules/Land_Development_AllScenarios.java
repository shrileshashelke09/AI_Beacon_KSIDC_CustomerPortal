package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Land_Development_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Land_Development_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Land_Development_Module Land_Development_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Land_Development");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Land_Development_Module = new Land_Development_Module();

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

					String EstimatedCost = testdata.get("EstimatedCost").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Land_Development_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Land_Development_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Land' Presence");
					boolean VerifyLandComponen = Land_Development_Module.VerifyLand_DevelopmentComponen();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Land' component is visible on the page" + VerifyLandComponen);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' component is present" + VerifyLandComponen);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Land' Component Page Opens");
					boolean AccessLandComponent = Land_Development_Module.AccessLand_DevelopmentComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Land' component" + AccessLandComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' page opens successfully" + AccessLandComponent);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Land Details'");
					boolean VerifyLandHeader = Land_Development_Module.VerifyLand_DevelopmentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyLandHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Land Details' is present" + VerifyLandHeader);
					
			
					//TC006
					ExtentTestManager.startTest("TC006 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Land_Development_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC007
					
					ExtentTestManager.startTest("TC007 - Verify Navigation to 'Land Development' on Skipping");
					boolean ClickSkipforNowPresence = Land_Development_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Land Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Land_Development_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Land_Development_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Land\" window." + ClickAddDetailsbutton);
	
					//TC010
					
					ExtentTestManager.startTest("TC010 - \"Development Items\" Field - Dropdown Selection");
					boolean SelectDocumentItems = Land_Development_Module.SelectDocumentItems();
					ExtentTestManager.getTest().log(Status.PASS, " Click on the dropdown" + SelectDocumentItems);
					ExtentTestManager.getTest().log(Status.PASS, " Select an item" + SelectDocumentItems);
					ExtentTestManager.getTest().log(Status.PASS, " \"Development Items\" field displays dropdown, and item can be selected" + SelectDocumentItems);

					//TC011
					
					ExtentTestManager.startTest("TC011 - \"Estimated Cost Including GST\" Field - Numeric Input");
					boolean EnterGST = Land_Development_Module.EnterGST(EstimatedCost);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Estimated Cost Including GST\" field is visible" + EnterGST);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data into the field" + EnterGST);
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted in the \"Estimated Cost Including GST\" field" + EnterGST);

					//TC012
					
					 ExtentTestManager.startTest("TC012 :Verify Window Heading'");
	    				boolean CancelButtonPresence = Land_Development_Module.CancelButtonPresence();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
	    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
	    			
	    				//TC013
	    				ExtentTestManager.startTest("TC013 :Verify \"Save as Draft\" Button Presence'");
	    				boolean SaveAsDraftButtonPresence = Land_Development_Module.SaveAsDraftButtonPresence();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
	    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
	    			
	    				//TC014
	    				
	    				ExtentTestManager.startTest("TC014 :Verify \"Save and Proceed \" Button Presence'");
	    				boolean SaveAndProceedPresence = Land_Development_Module.SaveAndProceedButtonPresence();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
	    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
	    			
						//TC015
	    				
	    				ExtentTestManager.startTest("TC015 :Verify Save as Draft Functionality");
	    				boolean ClickSaveAsDraft = Land_Development_Module.ClickonSaveAsDraft();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
	    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
	    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


	    				//TC016
	    				
	    				ExtentTestManager.startTest("TC016 :Test \"Update and Proceed\" Button Functionality");
	    				boolean UpdateAndProceed = Land_Development_Module.UpdateAndProceed();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
	    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
	    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

	    				//TC017
	    				ExtentTestManager.startTest("TC017 :Verify Data Display in Main Window");
	    				boolean DatainGrid = Land_Development_Module.DatainGrid();
	    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
	    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
	    			
	    				//Tc018
	    				
	    				ExtentTestManager.startTest("TC018 :Verify \"Continue\" Button Availability");
	    				boolean ValidateContinuebutton = Land_Development_Module.ValidateContinuebutton();
	    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
	    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
	    			
	    				//TC019
	    				
	    				ExtentTestManager.startTest("TC019 :Test \"Continue\" Button Functionality");
	    				boolean clicktocontinue = Land_Development_Module.clicktocontinue();
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



					
					
	



