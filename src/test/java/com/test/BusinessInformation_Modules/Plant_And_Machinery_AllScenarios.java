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
import com.Pages_BusinessInformation_Modules.Plant_And_Machinery_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Plant_And_Machinery_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Plant_And_Machinery_Module Plant_And_Machinery_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Plant_And_Machinery");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Plant_And_Machinery_Module = new Plant_And_Machinery_Module();

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

					String ExchangeRate = testdata.get("ExchangeRate").toString();
					String MachineryName = testdata.get("MachineryName").toString();
					String MachineryManufactureName = testdata.get("MachineryManufactureName").toString();
					String MachineryBaseCost = testdata.get("MachineryBaseCost").toString();
					String InstallationCost = testdata.get("InstallationCost").toString();
					String TransportationCost = testdata.get("TransportationCost").toString();
					String MachineryBCD = testdata.get("MachineryBCD").toString();
					String MachinerySWS = testdata.get("MachinerySWS").toString();
					String CIF = testdata.get("CIF").toString();
					String MachineryCount = testdata.get("MachineryCount").toString();
					String AssetTaxRate = testdata.get("AssetTaxRate").toString();

					

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Plant_And_Machinery_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					
					//TC002
					ExtentTestManager.startTest("TC002 - Navigate to \"Project cost details and means of finance\" Stage");
					boolean NavigatetoProjectCost = Plant_And_Machinery_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "Complete the Business Finance stage and Navigate to 'Project cost and Means of Finance'." + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User is navigated to the \"Project cost details and means of finance\" stage." + NavigatetoProjectCost);
	
					//TC003
					
					ExtentTestManager.startTest("TC003 - Verify \"Plant and Machinery\" Component Availability");
					boolean PlantAndMachineryComponent = Plant_And_Machinery_Module.PlantAndMachineryComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Plant and Machinery\" component on the page." + PlantAndMachineryComponent);
					ExtentTestManager.getTest().log(Status.PASS, "\"Plant and Machinery\" component is visible." + PlantAndMachineryComponent);
	
					//TC004
					
					ExtentTestManager.startTest("TC004 - Navigate to \"Plant & Machinery Details\" Window");
					boolean AccessPlantPage = Plant_And_Machinery_Module.AccessPlantPage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"Plant and Machinery\" component." + AccessPlantPage);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Plant & Machinery Details\" window." + AccessPlantPage);
	
					//TC005
					
					ExtentTestManager.startTest("TC005 - Verify Window Heading");
					boolean WindowHeading = Plant_And_Machinery_Module.WindowHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the heading of the window." + WindowHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Correct window heading is displayed." + WindowHeading);
	
					//TC006
					
					ExtentTestManager.startTest("TC006 - Verify Sentence Availability");
					boolean MainText = Plant_And_Machinery_Module.MainText();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the sentence \"Begin your journey! Click 'Add Details' to add the details of each one\"." + MainText);
					ExtentTestManager.getTest().log(Status.PASS, "The sentence is present in the window." + MainText);
	
					//TC007
					
					ExtentTestManager.startTest("TC007 - Verify \"Skip this for Now\" Button Availability");
					boolean SkipforNowPresence = Plant_And_Machinery_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC008
					
					ExtentTestManager.startTest("TC008 - Test \"Skip this for Now\" Button Functionality");
					boolean ClickSkipforNowPresence = Plant_And_Machinery_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "User is redirected to the next component." + ClickSkipforNowPresence);
	
					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Plant_And_Machinery_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Plant_And_Machinery_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Plant & Machinery Details\" window." + ClickAddDetailsbutton);
	
					//TC011
					
					ExtentTestManager.startTest("TC011 - \"Machinery Nature\" Field - Functionality");
					boolean SelectMachineryNature = Plant_And_Machinery_Module.SelectMachineryNature();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Nature\" field." + SelectMachineryNature);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select \"Auxiliary\" from dropdown." + SelectMachineryNature);
                    ExtentTestManager.getTest().log(Status.PASS, "\"Machinery Nature\" can be selected." + SelectMachineryNature);
	
					//TC012
                    
                    ExtentTestManager.startTest("TC012 - \"Machinery Source\" Field - Functionality");
					boolean SelectMachinerySource = Plant_And_Machinery_Module.SelectMachinerySource();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Source\" field." + SelectMachinerySource);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select \"Imported\" from dropdown." + SelectMachinerySource);
                    ExtentTestManager.getTest().log(Status.PASS, "\"Machinery Source\" can be selected." + SelectMachinerySource);
	
					//TC013
                    
                    ExtentTestManager.startTest("TC013 - \"Currency\" Field - Functionality");
					boolean SelectCurrency = Plant_And_Machinery_Module.SelectCurrency();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Currency\" field." + SelectCurrency);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select \"EUR\" from dropdown." + SelectCurrency);
                    ExtentTestManager.getTest().log(Status.PASS, "\"Currency\" can be selected." + SelectCurrency);
	
					//TC014
                    
                    
                    ExtentTestManager.startTest("TC014 - \"Exchange Rate\" Field - Functionality");
					boolean EnterExchangeRate = Plant_And_Machinery_Module.EnterExchangeRate(ExchangeRate);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Exchange Rate\" field." + EnterExchangeRate);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterExchangeRate);
                    ExtentTestManager.getTest().log(Status.PASS, "Numeric data accepted." + EnterExchangeRate);
	
					//TC015
                    
                    ExtentTestManager.startTest("TC015 - \"Machinery Name\" Field - Functionality");
					boolean EnterMachineryName = Plant_And_Machinery_Module.EnterMachineryName(MachineryName);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Namee\" field." + EnterMachineryName);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter alphanumeric data." + EnterMachineryName);
                    ExtentTestManager.getTest().log(Status.PASS, "alphanumeric data accepted." + EnterMachineryName);
	
					//TC016
                    
                    ExtentTestManager.startTest("TC016 - \"Machinery Name\" Field - Functionality");
					boolean EnterMachineryManufactureName = Plant_And_Machinery_Module.EnterMachineryManufactureName(MachineryManufactureName);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Manufacture Name\" field." + EnterMachineryManufactureName);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter alphanumeric data." + EnterMachineryManufactureName);
                    ExtentTestManager.getTest().log(Status.PASS, "alphanumeric data accepted." + EnterMachineryManufactureName);
	
                    //TC017
                    
                    ExtentTestManager.startTest("TC017 - \"Machinery Base Cost\" Field - Functionality");
					boolean EnterMachineryBaseCost = Plant_And_Machinery_Module.EnterMachineryBaseCost(MachineryBaseCost);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Base Cost\" field." + EnterMachineryBaseCost);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterMachineryBaseCost);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterMachineryBaseCost);
	
					//Tc018
                    
                    ExtentTestManager.startTest("TC018 - \"Machinery Base Cost\" Conversion");
					boolean ValidateMachineryBaseCostConversion = Plant_And_Machinery_Module.ValidateMachineryBaseCostConversion();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"Machinery Base Cost\" field." + ValidateMachineryBaseCostConversion);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateMachineryBaseCostConversion);
	
                    //TC019
                    ExtentTestManager.startTest("TC019 - \"Installation  Cost\" Field - Functionality");
					boolean EnterInstallationCost = Plant_And_Machinery_Module.EnterInstallationCost(InstallationCost);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Installation  Cost\" field." + EnterInstallationCost);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterInstallationCost);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterInstallationCost);
	
                    //TC020
                    
                    ExtentTestManager.startTest("TC020 - \"Installation Cost\" Conversion");
					boolean ValidateInstallationCostConversion = Plant_And_Machinery_Module.ValidateInstallationCostConversion();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"Installation Cost\" field." + ValidateInstallationCostConversion);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateInstallationCostConversion);
	
                    
                    //TC021
                    
                    ExtentTestManager.startTest("TC021 - \"Transportation   Cost\" Field - Functionality");
					boolean EnterTransportationCost = Plant_And_Machinery_Module.EnterTransportationCost(TransportationCost);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Transportation  Cost\" field." + EnterTransportationCost);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterTransportationCost);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterTransportationCost);
	
                    //TC022
                    
                    ExtentTestManager.startTest("TC022 - \"Transportation Cost\" Conversion");
					boolean ValidateTransportationCostConversion = Plant_And_Machinery_Module.ValidateTransportationCostConversion();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"Transportation Cost\" field." + ValidateTransportationCostConversion);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateTransportationCostConversion);
	
                    //TC023
                    ExtentTestManager.startTest("TC023 - \"Machinery BCD (Basic Customs Duty)\" Field - Functionality");
					boolean EnterMachineryBCD = Plant_And_Machinery_Module.EnterMachineryBCD(MachineryBCD);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery BCD (Basic Customs Duty)\" field." + EnterMachineryBCD);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterMachineryBCD);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterMachineryBCD);
	
                    //TC024
                    
                    ExtentTestManager.startTest("TC024 -\"Machinery BCD (Basic Customs Duty)\" Conversion");
					boolean ValidateMachineryBCD = Plant_And_Machinery_Module.ValidateMachineryBCD();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"Machinery BCD Cost\" field." + ValidateMachineryBCD);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateMachineryBCD);
	
                    //TC025
                    ExtentTestManager.startTest("TC025 \"Machinery SWS\" Field - Functionality");
					boolean EnterMachinerySWS = Plant_And_Machinery_Module.EnterMachinerySWS(MachinerySWS);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery SWS)\" field." + EnterMachinerySWS);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterMachinerySWS);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterMachinerySWS);
	
                    //TC026
                    
                    ExtentTestManager.startTest("TC026 -\"Machinery BCD (Basic Customs Duty)\" Conversion");
					boolean ValidateMachinerySWS = Plant_And_Machinery_Module.ValidateMachinerySWS();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"Machinery SWS Cost\" field." + ValidateMachinerySWS);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateMachinerySWS);
	
                    
                    //TC027
                    
                    ExtentTestManager.startTest("TC027 \"CIF\" Field - Functionality");
					boolean EnterCIFTest = Plant_And_Machinery_Module.EnterCIFTest(CIF);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"CIF\" field." + EnterCIFTest);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterCIFTest);
                    ExtentTestManager.getTest().log(Status.PASS, "numeric data accepted." + EnterCIFTest);
	
                    //TC028
                    
                    ExtentTestManager.startTest("TC028-\"CIF\" Conversion");
					boolean ValidateCIFTest = Plant_And_Machinery_Module.ValidateCIFTest();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the converted amount in the \"CIf Test\" field." + ValidateCIFTest);
                    ExtentTestManager.getTest().log(Status.PASS, "Converted amount value is displayed." + ValidateCIFTest);
	
                    //TC029
                    ExtentTestManager.startTest("TC029 -\"Machinery Taxable Amount\" Field - Auto-load");
					boolean ValidateMachinerysTaxableAmount = Plant_And_Machinery_Module.ValidateMachinerysTaxableAmount();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check \"Machinery Taxable Amount\" field." + ValidateMachinerysTaxableAmount);
                    ExtentTestManager.getTest().log(Status.PASS, "Data is auto-loaded." + ValidateMachinerysTaxableAmount);
	           
                    //TC030
                    
                    ExtentTestManager.startTest("TC030 \"Machinery Count\" Field - Functionality");
					boolean EnterMachineryCount = Plant_And_Machinery_Module.EnterMachineryCount(MachineryCount);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Count\" field." + EnterMachineryCount);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterMachineryCount);
                    ExtentTestManager.getTest().log(Status.PASS, "Numeric data accepted." + EnterMachineryCount);
	
					//TC031
                    
                    ExtentTestManager.startTest("TC031 -\"Do You Want To Edit The Tax Rate?\" Field - Functionality");
					boolean SelectYESintoggle = Plant_And_Machinery_Module.SelectYESintoggle();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check \"Do You Want To Edit The Tax Rate?\" field." + SelectYESintoggle);
                    ExtentTestManager.getTest().log(Status.PASS, "2. Select Yes from radio button." + SelectYESintoggle);
                    ExtentTestManager.getTest().log(Status.PASS, "Option can be selected." + SelectYESintoggle);

                    //TC032
                    ExtentTestManager.startTest("TC032 \"Machinery Tax Rate\" Field - Functionality");
					boolean EnterMachineryTaxrate = Plant_And_Machinery_Module.EnterMachineryTaxrate(AssetTaxRate);
					ExtentTestManager.getTest().log(Status.PASS, "1. Check the \"Machinery Tax Rate\" field." + EnterMachineryTaxrate);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter numeric data." + EnterMachineryTaxrate);
                    ExtentTestManager.getTest().log(Status.PASS, "Numeric data accepted." + EnterMachineryTaxrate);
	
                    //TC033
                    ExtentTestManager.startTest("TC033 -\"Machinery Tax\" Field - Auto-load");
					boolean ValidateMachinerysTaxRateAmount = Plant_And_Machinery_Module.ValidateMachinerysTaxRateAmount();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check \"Machinery Tax Rate Amount\" field." + ValidateMachinerysTaxRateAmount);
                    ExtentTestManager.getTest().log(Status.PASS, "Data is auto-loaded." + ValidateMachinerysTaxRateAmount);
	           
                    //TC034
                    
                    ExtentTestManager.startTest("TC034 -\"Machinery Landed Cost\" Field - Auto-load");
					boolean ValidateMachineryLandedCost = Plant_And_Machinery_Module.ValidateMachineryLandedCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check \"Machinery Landed cost Amount\" field." + ValidateMachineryLandedCost);
                    ExtentTestManager.getTest().log(Status.PASS, "Data is auto-loaded." + ValidateMachineryLandedCost);
	           
                    //TC035
                    ExtentTestManager.startTest("TC035 :Verify Window Heading'");
    				boolean CancelButtonPresence = Plant_And_Machinery_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC036
    				ExtentTestManager.startTest("TC036 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Plant_And_Machinery_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC037
    				
    				ExtentTestManager.startTest("TC037 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Plant_And_Machinery_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
    				//TC038
    				
    				ExtentTestManager.startTest("TC038:Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Plant_And_Machinery_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);

    				
    				//TC039
    				
    				ExtentTestManager.startTest("TC039:Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Plant_And_Machinery_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

    				//TC040
    				ExtentTestManager.startTest("TC040 :Verify Data Display in Main Window");
    				boolean DatainGrid = Plant_And_Machinery_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc041
    				
    				ExtentTestManager.startTest("TC041 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Plant_And_Machinery_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC042
    				
    				ExtentTestManager.startTest("TC042 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Plant_And_Machinery_Module.clicktocontinue();
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



					
					
	



