package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Vehicle_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Vehicle_Details_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Vehicle_Details_Module Vehicle_Details_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Vehicle");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Vehicle_Details_Module = new Vehicle_Details_Module();

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

					String VehicleModel = testdata.get("VehicleModel").toString();
					String VehicleColour = testdata.get("VehicleColour").toString();
					String ExShowRoomPrice = testdata.get("ExShowRoomPrice").toString();
					String OnRoadPrice = testdata.get("OnRoadPrice").toString();
					String VehicleNumber = testdata.get("VehicleNumber").toString();
					String EngineNumber = testdata.get("EngineNumber").toString();
					String ChaseNumber = testdata.get("ChaseNumber").toString();
					String RegistrationDate = testdata.get("RegistrationDate").toString();
					String InsuranceAmount = testdata.get("InsuranceAmount").toString();
					String RoadTax = testdata.get("RoadTax").toString();
					String RegistrationAndOtherCharges = testdata.get("RegistrationAndOtherCharges").toString();
					String DealerDiscount = testdata.get("DealerDiscount").toString();
					String DownPayment = testdata.get("DownPayment").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Vehicle_Details_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Vehicle_Details_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Vehicle' Presence");
					boolean VerifyVehicleDetailsComponent = Vehicle_Details_Module.VerifyVehicleDetailsComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Vehicle' component is visible on the page" + VerifyVehicleDetailsComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Vehicle' component is present" + VerifyVehicleDetailsComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Vehicle' Component Page Opens");
					boolean AccessVehicleDetailsComponent = Vehicle_Details_Module.AccessVehicleDetailsComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Vehicle' component" + AccessVehicleDetailsComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Vehicle' page opens successfully" + AccessVehicleDetailsComponent);
					
					//TC005
							
					ExtentTestManager.startTest("TC005 : **Verify Navigation to \"Vehicle Details\" Window**");
					boolean WindowAccess = Vehicle_Details_Module.WindowAccess();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + WindowAccess);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Vehicle' is present" + WindowAccess);
				
					//TC006
					
					ExtentTestManager.startTest("TC006 : Verify Correct Heading 'Vehicle Details'");
					boolean VerifyVehiclesComponentHeader = Vehicle_Details_Module.VerifyVehiclesComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyVehiclesComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Vehicle' is present" + VerifyVehiclesComponentHeader);
							
					
					//TC008
					
					
					ExtentTestManager.startTest("TC008 : Verify specific text availability");
					boolean VerifyStageHeading = Vehicle_Details_Module.VerifyStageHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyStageHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyStageHeading);
					
					//TC009
					
					ExtentTestManager.startTest("TC009 : Informative Message on Utilities Page");
					boolean VerifyInformativeMessage = Vehicle_Details_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyInformativeMessage);
					
					//TC010
					ExtentTestManager.startTest("TC010 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Vehicle_Details_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC011
					
					ExtentTestManager.startTest("TC011 - Verify Navigation to 'Utilities Development' on Skipping");
					boolean ClickSkipforNowPresence = Vehicle_Details_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Utilities Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC012
					
					ExtentTestManager.startTest("TC012 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Vehicle_Details_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC013
					
					ExtentTestManager.startTest("TC013 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Vehicle_Details_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Utilities\" window." + ClickAddDetailsbutton);
	
					//TC012
					
					ExtentTestManager.startTest("TC012 - Verify Field Types for Utility Type");
					boolean SelectVehicleCategory = Vehicle_Details_Module.SelectVehicleCategory();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Vehicle Category\" dropdown" + SelectVehicleCategory);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectVehicleCategory);

					//TC013
					
					ExtentTestManager.startTest("TC013 - Vehicle Manufacture Field - Dropdown Selection");
					boolean SelectVehicleManufacture = Vehicle_Details_Module.SelectVehicleManufacture();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Vehicle Manufacture\" dropdown" + SelectVehicleManufacture);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectVehicleManufacture);
				
					//TC014
					
					ExtentTestManager.startTest("TC014 - Vehicle Model Field - AlphaNumeric Input");
					boolean EnterVehicleModel = Vehicle_Details_Module.EnterVehicleModel(VehicleModel);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in \"Vehicle Model\" field" + EnterVehicleModel);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterVehicleModel);
				
					//TC015
					
					ExtentTestManager.startTest("TC015 - Vehicle Colour Field - AlphaNumeric Input");
					boolean EnterVehicleColour = Vehicle_Details_Module.EnterVehicleColour(VehicleColour);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in \"Vehicle coloue\" field" + EnterVehicleColour);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterVehicleColour);
				
					//TC016
					
					ExtentTestManager.startTest("TC016 - Ex-Show Room Price Field - Numeric Input");
					boolean EnterSowroomPrice = Vehicle_Details_Module.EnterSowroomPrice(ExShowRoomPrice);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Ex-Show Room Price\" field" + EnterSowroomPrice);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterSowroomPrice);
				
					//TC017
					
					ExtentTestManager.startTest("TC017 - Registration Field - Dropdown Selection");
					boolean SelectRegistration = Vehicle_Details_Module.SelectRegistration();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Registration\" dropdown" + SelectRegistration);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectRegistration);
				
					//TC018
					
					ExtentTestManager.startTest("TC018 - On-Road Price Field - Numeric Input");
					boolean EnterOnroadPrice = Vehicle_Details_Module.EnterOnroadPrice(OnRoadPrice);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"On-Road Price\" field" + EnterOnroadPrice);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterOnroadPrice);
				
					//TC019
					
					ExtentTestManager.startTest("TC019 - Vehicle Number Field - AlphaNumeric Input");
					boolean EnterVehicleNumber = Vehicle_Details_Module.EnterVehicleNumber(VehicleNumber);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in \"Vehicle Number\" field" + EnterVehicleNumber);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterVehicleNumber);
				
					//TC020
					
					ExtentTestManager.startTest("TC020 - Engine Number Field - AlphaNumeric Input");
					boolean EnterEngineNumber = Vehicle_Details_Module.EnterEngineNumber(EngineNumber);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in \"Engine Number\" field" + EnterEngineNumber);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterEngineNumber);
				
					//TC021
					
					ExtentTestManager.startTest("TC021 - Chase Number Field - AlphaNumeric Input");
					boolean EnterChaseNumber = Vehicle_Details_Module.EnterChaseNumber(ChaseNumber);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in \"Chase Number\" field" + EnterChaseNumber);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterChaseNumber);
				
					//TC022
					
					ExtentTestManager.startTest("TC022 - Registration Date Field - Date Format Validation");
					boolean EnterRegistrationDate = Vehicle_Details_Module.EnterRegistrationDate(RegistrationDate);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter date value in \"Registration Date\" field" + EnterRegistrationDate);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted in date format" + EnterRegistrationDate);
				
					//TC023
					
					ExtentTestManager.startTest("TC023 - Insurance Provider Field - Dropdown Selection");
					boolean SelectInsuranceProvider = Vehicle_Details_Module.SelectInsuranceProvider();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Insurance Provider\" dropdown" + SelectInsuranceProvider);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectInsuranceProvider);
				
					//TC024
					
					ExtentTestManager.startTest("TC024 - Insurance Amount Field - Numeric Input");
					boolean EnterInsuranceAmount = Vehicle_Details_Module.EnterInsuranceAmount(InsuranceAmount);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Insurance Amount\" field" + EnterInsuranceAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterInsuranceAmount);
				
					//TC025
					
					ExtentTestManager.startTest("TC025 - Road Tax Field - Numeric Input");
					boolean EnterRoadTax = Vehicle_Details_Module.EnterRoadTax(RoadTax);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Road Tax Amount\" field" + EnterRoadTax);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterRoadTax);
				
					//TC026
					
					ExtentTestManager.startTest("TC026 - Registration And Other Charges Field - Numeric Input");
					boolean EnterRegAndOtherTax = Vehicle_Details_Module.EnterRegAndOtherTax(RegistrationAndOtherCharges);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Registration And Other Charges Amount\" field" + EnterRegAndOtherTax);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterRegAndOtherTax);
				
					//TC027
					
					ExtentTestManager.startTest("TC027 - Dealer Discount Field - Numeric Input");
					boolean EnterDealerDiscount = Vehicle_Details_Module.EnterDealerDiscount(DealerDiscount);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Dealer Discount\" field" + EnterDealerDiscount);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterDealerDiscount);
				
					//TC028
					
					ExtentTestManager.startTest("TC028 - Down Payment Field - Numeric Input");
					boolean EnterDownPayment = Vehicle_Details_Module.EnterDownPayment(DownPayment);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Down Payment\" field" + EnterDownPayment);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterDownPayment);
				
					//TC029
					
					ExtentTestManager.startTest("TC029 :Verify Window Heading'");
    				boolean CancelButtonPresence = Vehicle_Details_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC030
    				ExtentTestManager.startTest("TC030 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Vehicle_Details_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC031
    				
    				ExtentTestManager.startTest("TC031 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Vehicle_Details_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
					//TC032
    				
    				ExtentTestManager.startTest("TC032 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Vehicle_Details_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC033
    				
    				ExtentTestManager.startTest("TC033 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Vehicle_Details_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

    				//TC034
    				ExtentTestManager.startTest("TC034 :Verify Data Display in Main Window");
    				boolean DatainGrid = Vehicle_Details_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc035
    				
    				ExtentTestManager.startTest("TC035 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Vehicle_Details_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC036
    				
    				ExtentTestManager.startTest("TC036 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Vehicle_Details_Module.clicktocontinue();
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



					
					
	



