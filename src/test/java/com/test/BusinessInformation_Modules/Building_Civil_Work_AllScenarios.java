package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Building_Civil_Work_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Building_Civil_Work_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Building_Civil_Work_Module Building_Civil_Work_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Building_CivilWork");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Building_Civil_Work_Module = new Building_Civil_Work_Module();

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

					String BuildingAge = testdata.get("BuildingAge").toString();
					String BuildingArea = testdata.get("BuildingArea").toString();
					String CostForTheBuilding = testdata.get("CostForTheBuilding").toString();
					String ArchitectOrEngineersName = testdata.get("ArchitectOrEngineersName").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Building_Civil_Work_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Building_Civil_Work_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Land' Presence");
					boolean VerifyBuilding_Civil_WorkComponent = Building_Civil_Work_Module.VerifyBuilding_Civil_WorkComponen();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Land' component is visible on the page" + VerifyBuilding_Civil_WorkComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' component is present" + VerifyBuilding_Civil_WorkComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Land' Component Page Opens");
					boolean AccessBuilding_Civil_WorkComponent = Building_Civil_Work_Module.AccessBuilding_Civil_WorkComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Land' component" + AccessBuilding_Civil_WorkComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' page opens successfully" + AccessBuilding_Civil_WorkComponent);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Land Details'");
					boolean VerifyBuilding_Civil_WorkHeader = Building_Civil_Work_Module.VerifyBuilding_Civil_WorkHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyBuilding_Civil_WorkHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Land Details' is present" + VerifyBuilding_Civil_WorkHeader);
					
		
					
					//TC006
					
					
					ExtentTestManager.startTest("TC006 : Verify specific text availability");
					boolean VerifyMainText = Building_Civil_Work_Module.VerifyMainText();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyMainText);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyMainText);
					
					//TC007
					ExtentTestManager.startTest("TC007 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Building_Civil_Work_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify Navigation to 'Land Development' on Skipping");
					boolean ClickSkipforNowPresence = Building_Civil_Work_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Land Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Building_Civil_Work_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Building_Civil_Work_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Land\" window." + ClickAddDetailsbutton);
	
					//TC011
					
					ExtentTestManager.startTest("TC011 - \"Building Type\" field visibility and selection");
					boolean SelectBuildingType = Building_Civil_Work_Module.SelectBuildingType();
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure \"Building Type\" field is visible." + SelectBuildingType);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select \"Commercial\"." + SelectBuildingType);
					ExtentTestManager.getTest().log(Status.PASS, "Field is visible and selection is possible." + SelectBuildingType);

					//TC012
					
					ExtentTestManager.startTest("TC012 - \"Existing/Proposed\" field visibility and selection");
					boolean SelectExistingProposed = Building_Civil_Work_Module.SelectExistingProposed();
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure \"Existing/Proposed\" field is visible." + SelectExistingProposed);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select \"Existing\"." + SelectExistingProposed);
					ExtentTestManager.getTest().log(Status.PASS, "Field is visible and selection is possible." + SelectExistingProposed);

					//TC013
					
					ExtentTestManager.startTest("TC013 - \"Land Doc No\" field visibility and selection");
					boolean SelectLandDocNo = Building_Civil_Work_Module.SelectLandDocNo();
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure \"Land Doc No\" field is visible." + SelectLandDocNo);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select a land doc number." + SelectLandDocNo);
					ExtentTestManager.getTest().log(Status.PASS, "Field is visible and selection is possible." + SelectLandDocNo);

					//TC014
					
					ExtentTestManager.startTest("TC014 - \"Building Age\" field numeric input");
					boolean EnterBuildingAge = Building_Civil_Work_Module.BuildingAge(BuildingAge);
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure \"Building Age\" field is visible." + EnterBuildingAge);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric value." + EnterBuildingAge);
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted." + EnterBuildingAge);

					//TC015
					
					ExtentTestManager.startTest("TC015 - \"Building Area\" field numeric input");
					boolean EnterBuildingArea = Building_Civil_Work_Module.EnterBuildingArea(BuildingArea);
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure \"Building Area\" field is visible." + EnterBuildingArea);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric value." + EnterBuildingArea);
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted." + EnterBuildingArea);

					//TC016
					
					ExtentTestManager.startTest("TC016 - \"Cost Of Building Including GST\" field numeric inputt");
					boolean EnterCostForTheBuilding = Building_Civil_Work_Module.EnterCostForTheBuilding(CostForTheBuilding);
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure  field is visible." + EnterCostForTheBuilding);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric value." + EnterCostForTheBuilding);
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted." + EnterCostForTheBuilding);

					//TC017
					
					ExtentTestManager.startTest("TC017 - \"Architect/Engineers Name\" field alphanumeric input");
					boolean EnterArchitectOrEngineersName = Building_Civil_Work_Module.EnterArchitectOrEngineersName(ArchitectOrEngineersName);
					ExtentTestManager.getTest().log(Status.PASS, "1. Ensure  field is visible." + EnterArchitectOrEngineersName);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric value." + EnterArchitectOrEngineersName);
					ExtentTestManager.getTest().log(Status.PASS, " data is accepted." + EnterArchitectOrEngineersName);

					//TC018
					
					ExtentTestManager.startTest("TC018 :Verify Window Heading'");
    				boolean CancelButtonPresence = Building_Civil_Work_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC019
    				ExtentTestManager.startTest("TC019 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Building_Civil_Work_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC020
    				
    				ExtentTestManager.startTest("TC020 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Building_Civil_Work_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
					//TC021
    				
    				ExtentTestManager.startTest("TC021 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Building_Civil_Work_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC022
    				
    				ExtentTestManager.startTest("TC022 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Building_Civil_Work_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

    				//TC023
    				ExtentTestManager.startTest("TC023 :Verify Data Display in Main Window");
    				boolean DatainGrid = Building_Civil_Work_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc024
    				
    				ExtentTestManager.startTest("TC024 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Building_Civil_Work_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC025
    				
    				ExtentTestManager.startTest("TC025 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Building_Civil_Work_Module.clicktocontinue();
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



					
					
	



