package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Plant_Machinary_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Plant_Machinary_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Security_Plant_Machinary_Module Security_Plant_Machinary_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Security_Plant_Machinery");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Security_Plant_Machinary_Module = new Security_Plant_Machinary_Module();

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

//					String ServiceType = testdata.get("ServiceType").toString();
//					String ServiceProvider = testdata.get("ServiceProvider").toString();
//					String FeeAmount = testdata.get("FeeAmount").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Security_Plant_Machinary_Module");
					Log.info("Button visible !");
					boolean Login = Security_Plant_Machinary_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Verify navigation to Security stage");
					boolean NavigatetoSecurity = Security_Plant_Machinary_Module.NavigatetoSecurity();
					ExtentTestManager.getTest().log(Status.PASS, "1. Complete document upload in Project Cost stage\r\n"
							+ "2. Click 'Continue'" + NavigatetoSecurity);
					ExtentTestManager.getTest().log(Status.PASS, "Security stage opens automatically" + NavigatetoSecurity);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify ability to click on 'Plant & Machinery'");
					boolean VerifyPlantAndMachineryComponent = Security_Plant_Machinary_Module.VerifyPlantAndMachineryComponent();
					ExtentTestManager.getTest().log(Status.PASS, "Locate 'Plant & Machinery'" + VerifyPlantAndMachineryComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Plant & Machinery Details' page opens" + VerifyPlantAndMachineryComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify opening of 'Plant & Machinery Details' page");
					boolean AccessPlantAndMachineryComponent = Security_Plant_Machinary_Module.AccessPlantAndMachineryComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Technical Know' component" + AccessPlantAndMachineryComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Technical Know' page opens successfully" + AccessPlantAndMachineryComponent);
					
					//TC005
											
					ExtentTestManager.startTest("TC005 : Verify page heading 'Plant & Machinery Details'");
					boolean VerifyPlantAndMachineryComponentHeader = Security_Plant_Machinary_Module.VerifyPlantAndMachineryComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the page heading" + VerifyPlantAndMachineryComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading is correctly displayed" + VerifyPlantAndMachineryComponentHeader);
							
					
					//TC006
										
					ExtentTestManager.startTest("TC006 : Verify display of informative message on 'Plant & Machinery Details' page");
					boolean VerifyInformativeMessage = Security_Plant_Machinary_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the page for any instructional message" + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Message is correctly displayed\r\n"
							+ "'To View a previous entry, click on the Plant & Machinery. '" + VerifyInformativeMessage);
					
					//TC007
				
					ExtentTestManager.startTest("TC007 - Verify display of stage name 'security'");
					boolean VerifyStageName = Security_Plant_Machinary_Module.VerifyStageName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the stage name label" + VerifyStageName);
					ExtentTestManager.getTest().log(Status.PASS, "Stage name is accurate and visible -'security'" + VerifyStageName);
	
					
					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify sub heading 'LIST OF PLANT & MACHINERY'");
					boolean VerifySubHeading = Security_Plant_Machinary_Module.VerifySubHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Identify the subheading in the grid" + VerifySubHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Subheading is correctly shown -  'LIST OF PLANT & MACHINERY'" + VerifySubHeading);
	

					//TC009
					ExtentTestManager.startTest("TC009 - Verify display of stage name 'security'");
					boolean VerifyAddedData = Security_Plant_Machinary_Module.VerifyAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the stage name label" + VerifyAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "Stage name is accurate and visible -'security'" + VerifyAddedData);
	
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify Total amount ");
					boolean VerifyTotalAmount = Security_Plant_Machinary_Module.VerifyTotalAmount();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the total amount displayed" + VerifyTotalAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Total is correct based on entered details" + VerifyTotalAmount);
	
					//TC011
					ExtentTestManager.startTest("TC011 - Verify Navigation to View Plant & Machinery Details ");
					boolean ClickAddedData = Security_Plant_Machinary_Module.ClickAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on a Plant & Machinery name under 'LIST OF PLANT & MACHINERY'." + ClickAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "'View Plant & Machinery Details' page is opened." + ClickAddedData);
	
					//TC012
					ExtentTestManager.startTest("TC012 - Verify 'Machinery Nature' Field");
					boolean validateMachineryNatureField = Security_Plant_Machinary_Module.validateMachineryNatureField();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Nature' field is filled with data." + validateMachineryNatureField);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Nature' field is filled." + validateMachineryNatureField);

					//TC013
					
					ExtentTestManager.startTest("TC013 - Verify 'Machinery Source' Field");
					boolean validateMachinerySourceField = Security_Plant_Machinary_Module.validateMachinerySourceField();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery source' field is filled with data." + validateMachinerySourceField);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery source' field is filled." + validateMachinerySourceField);

					//TC014
					
					ExtentTestManager.startTest("TC014 - Verify 'currency' Field");
					boolean validateCurrency = Security_Plant_Machinary_Module.validateCurrency();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'currency' field is filled with data." + validateCurrency);
					ExtentTestManager.getTest().log(Status.PASS, "'currencye' field is filled." + validateCurrency);

					//TC015
					ExtentTestManager.startTest("TC015 - Verify 'Exchange rate' Field");
					boolean validateExchangeRate = Security_Plant_Machinary_Module.validateExchangeRate();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Exchange rate' field is filled with data." + validateExchangeRate);
					ExtentTestManager.getTest().log(Status.PASS, "'Exchange rate' field is filled." + validateExchangeRate);

					//TC016
					
					ExtentTestManager.startTest("TC016 - Verify 'Machinery Name' Field");
					boolean validateMachineryName = Security_Plant_Machinary_Module.validateMachineryName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Name' field is filled with data." + validateMachineryName);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Name' field is filled." + validateMachineryName);

					//TC017
					
					ExtentTestManager.startTest("TC017 - Verify 'Machinery Manufacture Name' Field");
					boolean validateMachineryManufactureName = Security_Plant_Machinary_Module.validateMachineryManufactureName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Manufacture Name' field is filled with data." + validateMachineryManufactureName);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Manufacture Name' field is filled." + validateMachineryManufactureName);

					//TC018
				
					
					ExtentTestManager.startTest("TC018 - Verify 'Machinery Base Cost' Field");
					boolean validateMachineryBaseCost = Security_Plant_Machinary_Module.validateMachineryBaseCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Base Cost' field is filled with data." + validateMachineryBaseCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Base Cost' field is filled." + validateMachineryBaseCost);

					//TC019
					
					ExtentTestManager.startTest("TC019 - Verify 'Coversion Machinery Base Cost' Field");
					boolean validateCoversionMachineryBaseCost = Security_Plant_Machinary_Module.validateCoversionMachineryBaseCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Conversion Machinery Base Cost' field is filled with data." + validateCoversionMachineryBaseCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Conversion Machinery Base Cost' field is filled." + validateCoversionMachineryBaseCost);

					//TC020
					ExtentTestManager.startTest("TC020 - Verify 'Installation Cost' Field");
					boolean validateInstallationCost = Security_Plant_Machinary_Module.validateInstallationCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Installation Cost' field is filled with data." + validateInstallationCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Installation Cost' field is filled." + validateInstallationCost);

					//TC021
					ExtentTestManager.startTest("TC021 - Verify 'Transportation  Cost' Field");
					boolean validateTransportationCost = Security_Plant_Machinary_Module.validateTransportationCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Transportation  Cost' field is filled with data." + validateTransportationCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Transportation  Cost' field is filled." + validateTransportationCost);

					//TC022
					
					ExtentTestManager.startTest("TC022 - Verify 'CIF ' Field");
					boolean validateCIF = Security_Plant_Machinary_Module.validateCIF();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'CIF' field is filled with data." + validateCIF);
					ExtentTestManager.getTest().log(Status.PASS, "'CIF' field is filled." + validateCIF);

					//TC023
					
					ExtentTestManager.startTest("TC023 - Verify 'Machinery's Taxable Amount (?)' Field");
					boolean validateMachinerysTaxableAmount = Security_Plant_Machinary_Module.validateMachinerysTaxableAmount();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery's Taxable Amount (?)' field is filled with data." + validateMachinerysTaxableAmount);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery's Taxable Amount (?)' field is filled." + validateMachinerysTaxableAmount);

					//TC024
					
					ExtentTestManager.startTest("TC024 - Verify 'Machinery Count' Field");
					boolean validateMachineryCountt = Security_Plant_Machinary_Module.validateMachineryCountt();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Count' field is filled with data." + validateMachineryCountt);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Count' field is filled." + validateMachineryCountt);

					//TC025
					
					ExtentTestManager.startTest("TC025 -Verify 'Do You Want To Edit The Tax Rate?' Radio Button");
					boolean ValidateToggleQuestion = Security_Plant_Machinary_Module.ValidateToggleQuestion();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if either Yes or No is selected for the field 'Do You Want To Edit The Tax Rate?'." + ValidateToggleQuestion);
					ExtentTestManager.getTest().log(Status.PASS, "Either Yes or No is selected." + ValidateToggleQuestion);

    				//TC026
					ExtentTestManager.startTest("TC026 -Verify 'Machinery Tax Rate' Field");
					boolean validateAssetTaxRate = Security_Plant_Machinary_Module.validateAssetTaxRate();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Tax Rate' field is filled with data." + validateAssetTaxRate);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Tax Rate' field is filled." + validateAssetTaxRate);

					//TC027
					
					ExtentTestManager.startTest("TC027 -Verify 'Machinery Tax (?)' Field");
					boolean validateMachineryTax = Security_Plant_Machinary_Module.validateMachineryTax();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Tax (?)' field is filled with data." + validateMachineryTax);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Tax (?)' field is filled." + validateMachineryTax);

					//TC028
					
					ExtentTestManager.startTest("TC028 -Verify 'Machinery Landed Cost (?)' Field");
					boolean validateMachineryLandedCost = Security_Plant_Machinary_Module.validateMachineryLandedCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the 'Machinery Landed Cost (?)' field is filled with data." + validateMachineryLandedCost);
					ExtentTestManager.getTest().log(Status.PASS, "'Machinery Landed Cost (?)' field is filled." + validateMachineryLandedCost);

					//TC029
					
					ExtentTestManager.startTest("TC029 -Verify Cancel Button Closes Plant & Machinery Details Page");
					boolean CancleButton = Security_Plant_Machinary_Module.CancleButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the cancel button." + CancleButton);
					ExtentTestManager.getTest().log(Status.PASS, "'View Plant & Machinery Details' page is closed." + CancleButton);

					
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



					
					
	



