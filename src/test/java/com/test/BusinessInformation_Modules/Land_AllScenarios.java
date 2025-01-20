package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Land_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Land_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Land_Module Land_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Land");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Land_Module = new Land_Module();

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

					String TitleHolder = testdata.get("TitleHolder").toString();
					String DocNo = testdata.get("DocNo").toString();
					String SurveyNo = testdata.get("SurveyNo").toString();
					String ResurveyNo = testdata.get("ResurveyNo").toString();
					String ExtendOfLandDRY = testdata.get("ExtendOfLandDRY").toString();
					String ExtendOfLand = testdata.get("ExtendOfLand").toString();
					String PinCode = testdata.get("PinCode").toString();
					String Place = testdata.get("Place").toString();
					String Village = testdata.get("Village").toString();
					String Taluk = testdata.get("Taluk").toString();
					String CostOfLandIncludingRegistration = testdata.get("CostOfLandIncludingRegistration").toString();
					String RegistrationAmount = testdata.get("RegistrationAmount").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Land_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Land_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Land' Presence");
					boolean VerifyLandComponen = Land_Module.VerifyLandComponen();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Land' component is visible on the page" + VerifyLandComponen);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' component is present" + VerifyLandComponen);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Land' Component Page Opens");
					boolean AccessLandComponent = Land_Module.AccessLandComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Land' component" + AccessLandComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Land' page opens successfully" + AccessLandComponent);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Land Details'");
					boolean VerifyLandHeader = Land_Module.VerifyLandHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyLandHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Land Details' is present" + VerifyLandHeader);
					
			
					//TC006
					ExtentTestManager.startTest("TC006 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Land_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC007
					
					ExtentTestManager.startTest("TC007 - Verify Navigation to 'Land Development' on Skipping");
					boolean ClickSkipforNowPresence = Land_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Land Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Land_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Land_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Land\" window." + ClickAddDetailsbutton);
	
					//TC010
					
					ExtentTestManager.startTest("TC010 - \"Title Holder\" Field data validtion");
					boolean EnterTitleHolder = Land_Module.EnterTitleHolder(TitleHolder);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter Alpha Numeric data" + EnterTitleHolder);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed; others prompt error" + EnterTitleHolder);
	
					//TC011
					
					ExtentTestManager.startTest("TC011 - \"Doc No\" Field - ECP Validations");
					boolean EnterEnterDocNo = Land_Module.EnterEnterDocNo(DocNo);
					ExtentTestManager.getTest().log(Status.PASS, "Enter valid inputs" + EnterEnterDocNo);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed;" + EnterEnterDocNo);
	
					//TC012
					ExtentTestManager.startTest("TC012 - \"Survey No\" Field - ECP Validations");
					boolean EnterSurveyNo = Land_Module.EnterSurveyNo(SurveyNo);
					ExtentTestManager.getTest().log(Status.PASS, "Enter valid inputs" + EnterSurveyNo);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed;" + EnterSurveyNo);
	
					//TC013
					
					ExtentTestManager.startTest("TC013 -\"Resurvey No\" Field - ECP Validations");
					boolean EnterResurveyNo = Land_Module.EnterResurveyNo(ResurveyNo);
					ExtentTestManager.getTest().log(Status.PASS, "Enter valid inputs" + EnterResurveyNo);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed;" + EnterResurveyNo);	
					
					//TC014
					
					ExtentTestManager.startTest("TC014 -\"Extent Of Land (DRY)\" Field - ECP Validations");
					boolean EnterExtendOfLandDRY = Land_Module.EnterExtendOfLandDRY(ExtendOfLandDRY);
					ExtentTestManager.getTest().log(Status.PASS, "Enter valid inputs" + EnterExtendOfLandDRY);
					ExtentTestManager.getTest().log(Status.PASS, "Only numeric input is allowed" + EnterExtendOfLandDRY);	
					
					//TC015
					
					ExtentTestManager.startTest("TC015 -\"Extent Of Land (Wet)\" Field - ECP Validations");
					boolean EnterExtendOfLand = Land_Module.EnterExtendOfLand(ExtendOfLand);
					ExtentTestManager.getTest().log(Status.PASS, "Enter valid inputs" + EnterExtendOfLand);
					ExtentTestManager.getTest().log(Status.PASS, "Only numeric input is allowed" + EnterExtendOfLand);	
					
					//TC016
					ExtentTestManager.startTest("TC016 -\"Unit\" Field Functionality");
					boolean SelectUnit = Land_Module.SelectUnit();
					ExtentTestManager.getTest().log(Status.PASS, "Select \"Acre\" from dropdown" + SelectUnit);
					ExtentTestManager.getTest().log(Status.PASS, "\"Acre\" can be selected from dropdown" + SelectUnit);	
					
					//TC017
					
					ExtentTestManager.startTest("TC017 -\"Pin Code\" Field - ECP Validations");
					boolean EnterPincode = Land_Module.EnterPincode(PinCode);
					ExtentTestManager.getTest().log(Status.PASS, "Check with 123456 numeric data" + EnterPincode);
					ExtentTestManager.getTest().log(Status.PASS, "Only numeric input is allowed" + EnterPincode);	
					
					//TC018
					
					ExtentTestManager.startTest("TC018 -\"State\" Field Verification");
					boolean ValidateState = Land_Module.ValidateState();
					ExtentTestManager.getTest().log(Status.PASS, "Check \"State\" field value" + ValidateState);
					ExtentTestManager.getTest().log(Status.PASS, "\"State\" field displays \"KERALA\"" + ValidateState);	
					
					//TC019
					
					ExtentTestManager.startTest("TC019 -\"District\" Field Verification");
					boolean ValidateDistrict = Land_Module.ValidateDistrict();
					ExtentTestManager.getTest().log(Status.PASS, "Check \"District\" field value" + ValidateDistrict);
					ExtentTestManager.getTest().log(Status.PASS, "\"District\" field displays \"KANNUR\"" + ValidateDistrict);	
					
					//TC020
					
					ExtentTestManager.startTest("TC020 -\"Post\" Field Verification");
					boolean ValidatePost = Land_Module.ValidatePost();
					ExtentTestManager.getTest().log(Status.PASS, "Check \"Post\" field value" + ValidatePost);
					ExtentTestManager.getTest().log(Status.PASS, "\"Post\" field displays \"test post\"" + ValidatePost);	
					
					//TC021
					
					ExtentTestManager.startTest("TC021 -\"City\" Field Functionality");
					boolean SelectCity = Land_Module.SelectCity();
					ExtentTestManager.getTest().log(Status.PASS, "Check \"City\" field value" + SelectCity);
					ExtentTestManager.getTest().log(Status.PASS, "\"City\" field displays \"payyanur\"" + SelectCity);	
					
					//TC022
					
					ExtentTestManager.startTest("TC022 -\"Pin Code\" Field - ECP Validations");
					boolean EnterPlace = Land_Module.EnterPlace(Place);
					ExtentTestManager.getTest().log(Status.PASS, "\"Place\" Field - ECP Validations" + EnterPlace);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed" + EnterPlace);	
					
					//TC023
					
					ExtentTestManager.startTest("TC023 -\"Village\" Field - ECP Validations");
					boolean EnterVillage = Land_Module.EnterVillage(Village);
					ExtentTestManager.getTest().log(Status.PASS, "\"Village\" Field - ECP Validations" + EnterVillage);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed" + EnterVillage);	
					
					//TC024
					
					ExtentTestManager.startTest("TC024 -\"Taluk\" Field - ECP Validations");
					boolean EnterTaluk = Land_Module.EnterTaluk(Taluk);
					ExtentTestManager.getTest().log(Status.PASS, "\"TALUK\" Field - ECP Validations" + EnterTaluk);
					ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric inputs allowed" + EnterTaluk);	
					
					//TC025
					
					ExtentTestManager.startTest("TC025 -\"Taluk\" Field - ECP Validations");
					boolean SelectPanchayat = Land_Module.SelectPanchayat();
					ExtentTestManager.getTest().log(Status.PASS, "\"Panchayat\" Field - ECP Validations" + SelectPanchayat);
					ExtentTestManager.getTest().log(Status.PASS, "\"kannur panchayath\" can be selected" + SelectPanchayat);	
					
					//TC026
					
					ExtentTestManager.startTest("TC026-\"Constituency\" Field Functionality");
					boolean SelectConstituency = Land_Module.SelectConstituency();
					ExtentTestManager.getTest().log(Status.PASS, "Select \"Azhikode\" from dropdow" + SelectConstituency);
					ExtentTestManager.getTest().log(Status.PASS, "\"Azhikode\" can be selected" + SelectConstituency);	
					
					//TC027
					
					ExtentTestManager.startTest("TC027 -\"Cost Of Land Excluding Registration\" Field - ECP Validations");
					boolean EnterCostOfLandIncludingRegistration = Land_Module.EnterCostOfLandIncludingRegistration(CostOfLandIncludingRegistration);
					ExtentTestManager.getTest().log(Status.PASS, "Check Numeric inputs" + EnterCostOfLandIncludingRegistration);
					ExtentTestManager.getTest().log(Status.PASS, "Only numeric inputs allowed" + EnterCostOfLandIncludingRegistration);	
					
					//TC028
					
					ExtentTestManager.startTest("TC028 -\"Registration And Stamp Duty\" Field - ECP Validations");
					boolean EnterRegistrationAmount = Land_Module.EnterRegistrationAmount(RegistrationAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Check Numeric inputs" + EnterRegistrationAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Only numeric inputs allowed" + EnterRegistrationAmount);	
					
					 //TC029
                    ExtentTestManager.startTest("TC029 :Verify Window Heading'");
    				boolean CancelButtonPresence = Land_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC030
    				ExtentTestManager.startTest("TC030 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Land_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC031
    				
    				ExtentTestManager.startTest("TC031 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Land_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
					//TC032
    				
    				ExtentTestManager.startTest("TC032 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Land_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC033
    				
    				ExtentTestManager.startTest("TC033 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Land_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

    				//TC034
    				ExtentTestManager.startTest("TC034 :Verify Data Display in Main Window");
    				boolean DatainGrid = Land_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc035
    				
    				ExtentTestManager.startTest("TC035 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Land_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC036
    				
    				ExtentTestManager.startTest("TC036 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Land_Module.clicktocontinue();
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



					
					
	



