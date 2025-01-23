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
import com.Pages_BusinessInformation_Modules.Project_Cost_Verification_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Project_Cost_Verification_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Project_Cost_Verification_Module Project_Cost_Verification_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Project_Cost_Verification");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Project_Cost_Verification_Module = new Project_Cost_Verification_Module();

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

					String WorkingCapitalMargin = testdata.get("WorkingCapitalMargin").toString();
					String WorkingCapitalAmt = testdata.get("WorkingCapitalAmt").toString();
					String TechnologyOptimizationAndProductDevelopment = testdata.get("TechnologyOptimizationAndProductDevelopment").toString();
					String TestingAndCertification = testdata.get("TestingAndCertification").toString();
					String MarketingAndPromotionalExpenses = testdata.get("MarketingAndPromotionalExpenses").toString();
					String Others = testdata.get("Others").toString();
					String Specify = testdata.get("Specify").toString();
	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Document_Upload Module");
					Log.info("Button visible !");
					boolean Login = Project_Cost_Verification_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					
					//TC002
					ExtentTestManager.startTest("TC002 - Access ProjectCost");
					boolean AccessProjectCostPage = Project_Cost_Verification_Module.AccessProjectCostPage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on Project Cost component" + AccessProjectCostPage);
					ExtentTestManager.getTest().log(Status.PASS, "Project Cost Page is accessed" + AccessProjectCostPage);
	
					//TC003
					
					ExtentTestManager.startTest("TC003 - Validate Header");
					boolean validateHeader = Project_Cost_Verification_Module.validateHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Header" + validateHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Header shown correct" + validateHeader);
	
					//TC004
					
					ExtentTestManager.startTest("TC004 - Validate Plant And Machinery");
					boolean ValidatePlantAndMachinery = Project_Cost_Verification_Module.ValidatePlantAndMachinery();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidatePlantAndMachinery);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidatePlantAndMachinery);
	
					//TC005
					ExtentTestManager.startTest("TC005 - Validate Land");
					boolean ValidateLand = Project_Cost_Verification_Module.ValidateLand();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateLand);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateLand);
	
					//TC006
					ExtentTestManager.startTest("TC006 - Validate Land and Developement");
					boolean ValidateLandDevelopement = Project_Cost_Verification_Module.ValidateLandDevelopement();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateLandDevelopement);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateLandDevelopement);
	
					//TC007
					ExtentTestManager.startTest("TC007 - Validate Building");
					boolean ValidateBuilding = Project_Cost_Verification_Module.ValidateBuilding();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateBuilding);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateBuilding);
	
					//TC008
					ExtentTestManager.startTest("TC008 - Validate Utilities");
					boolean ValidateUtilities = Project_Cost_Verification_Module.ValidateUtilities();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateUtilities);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateUtilities);
	
					//TC009
					ExtentTestManager.startTest("TC009 - Validate Misc Fixed Assed");
					boolean ValidateMiscFixedAssed = Project_Cost_Verification_Module.ValidateMiscFixedAssed();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateMiscFixedAssed);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateMiscFixedAssed);
	
					//TC010
					ExtentTestManager.startTest("TC010 - Validate Vehicle");
					boolean ValidateVehicle = Project_Cost_Verification_Module.ValidateVehicle();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateVehicle);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateVehicle);
	
					//TC011
					ExtentTestManager.startTest("TC011 -  Validate Deposits");
					boolean ValidateDeposits = Project_Cost_Verification_Module.ValidateDeposits();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateDeposits);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateDeposits);
	
					//TC012
					ExtentTestManager.startTest("TC012 -  Validate Preliminary Expenses");
					boolean ValidatePreliminaryExpenses = Project_Cost_Verification_Module.ValidatePreliminaryExpenses();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidatePreliminaryExpenses);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidatePreliminaryExpenses);
	
					//TC013
					ExtentTestManager.startTest("TC013 - Validate Technical Know How Fees");
					boolean ValidateTechnicalKnowHowFees = Project_Cost_Verification_Module.ValidateTechnicalKnowHowFees();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateTechnicalKnowHowFees);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateTechnicalKnowHowFees);
	
					//TC014
					ExtentTestManager.startTest("TC014 - Validate Preoperative Expensese");
					boolean ValidatePreoperativeExpensese = Project_Cost_Verification_Module.ValidatePreoperativeExpenses();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidatePreoperativeExpensese);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidatePreoperativeExpensese);
	
					//TC015
					ExtentTestManager.startTest("TC015 - Validate Contingencies");
					boolean ValidateContingencies = Project_Cost_Verification_Module.ValidateContingencies();
					ExtentTestManager.getTest().log(Status.PASS, "1. Validate Autoloaded data" + ValidateContingencies);
					ExtentTestManager.getTest().log(Status.PASS, "Data shown correctly" + ValidateContingencies);
	
					//TC016
					ExtentTestManager.startTest(" TC016 - 'Working Capital Margin' Field - Numeric Input");
					boolean EnterWorkingCapitalMargin  = Project_Cost_Verification_Module.EnterWorkingCapitalMargin(WorkingCapitalMargin);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Working Capital Margin'." + EnterWorkingCapitalMargin);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterWorkingCapitalMargin);
					
					//TC017
					
					ExtentTestManager.startTest(" TC017 - 'Working Capital' Field - Numeric Input");
					boolean EnterWorkingCapitalAMt  = Project_Cost_Verification_Module.EnterWorkingCapital(WorkingCapitalAmt);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Working Capital'." + EnterWorkingCapitalAMt);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterWorkingCapitalAMt);
					
					//TC018
					ExtentTestManager.startTest(" TC018 - 'Technology Optimization & Product Development' Field - Numeric Input");
					boolean EnterTechnologyOptimizationAndProductDevelopment  = Project_Cost_Verification_Module.EnterTechnology(TechnologyOptimizationAndProductDevelopment);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Technology Optimization & Product Development'." + EnterTechnologyOptimizationAndProductDevelopment);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterTechnologyOptimizationAndProductDevelopment);
					
					//TC019
					
					ExtentTestManager.startTest(" TC019 - 'Testing & Certification' Field - Numeric Input");
					boolean EnterTestingAndCertification  = Project_Cost_Verification_Module.EnterTesting(TestingAndCertification);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Testing & Certification'." + EnterTestingAndCertification);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterTestingAndCertification);
					
					//TC020
					ExtentTestManager.startTest(" TC010 - 'Marketing & Promotional Expenses' Field - Numeric Input");
					boolean EnterMarketingExpense  = Project_Cost_Verification_Module.EnterMarketing(MarketingAndPromotionalExpenses);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Marketing & Promotional Expenses'." + EnterMarketingExpense);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterMarketingExpense);
					
					//TC021
					
					ExtentTestManager.startTest(" TC021 - 'Others' Field - Numeric Input");
					boolean EnterOthers  = Project_Cost_Verification_Module.EnterOthers(Others);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Others'." + EnterOthers);
					ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted, and other related fields are updated accordingly." + EnterOthers);
					
					//TC022
					
					ExtentTestManager.startTest("TC022 - Verify \"Specify\" Field Visibility");
					boolean VerifySpecify = Project_Cost_Verification_Module.ValidateSpecifyField();
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter any value in the 'Others' field " + VerifySpecify);
					ExtentTestManager.getTest().log(Status.PASS ,"'Specify' field becomes visible" + VerifySpecify);


					//TC023
					
					ExtentTestManager.startTest("TC023 - 'Specify' field- alphanumeric");
					boolean EnterSpecify = Project_Cost_Verification_Module.EnterSpecify(Specify);
					ExtentTestManager.getTest().log(Status.PASS , "1. Enter alphanumeric data in specify field " + EnterSpecify);
					ExtentTestManager.getTest().log(Status.PASS ,"Alphanumeric data accepted in specify field" + EnterSpecify);
					
					//TC024
					
					ExtentTestManager.startTest("TC024 - \"Save as Draft\" Button Functionality");
					boolean SaveAsDraft = Project_Cost_Verification_Module.ClickonSaveAsDraft();
					ExtentTestManager.getTest().log(Status.PASS , " Click on 'Save as Draft' button" + SaveAsDraft);
					ExtentTestManager.getTest().log(Status.PASS ,"Data is saved as draft; a success message is displayed" + SaveAsDraft);

					//TC025
					
					ExtentTestManager.startTest("TC025 - \"Save and Proceed\" Button Functionality");
					boolean SaveAndProceed = Project_Cost_Verification_Module.SaveandProceed();
					ExtentTestManager.getTest().log(Status.PASS , " Click on 'Save as Draft' button again" + SaveAndProceed);
					ExtentTestManager.getTest().log(Status.PASS ,"Data is saved as draft; a success message is displayed" + SaveAndProceed);
					
					//TC026
					
					ExtentTestManager.startTest("TC026 - verify that the disabled amount fields are displaying as '0.00' ,after user clicks 'save and proceed 'button and page was redirected to next component.y");
					boolean validateallValueturnsZero = Project_Cost_Verification_Module.validateallValueturnsZero();
					ExtentTestManager.getTest().log(Status.PASS , " 1.click on 'Save and proceed 'button." + validateallValueturnsZero);
					ExtentTestManager.getTest().log(Status.PASS ,"2.Return to project cost verification page." + validateallValueturnsZero);
					ExtentTestManager.getTest().log(Status.PASS , " 3.verify the disabled amount field values." + validateallValueturnsZero);
					ExtentTestManager.getTest().log(Status.PASS , " Disabled amount fields should be display as '0.00' after user clicks 'save and proceed ' button and return back to project cost verifcation screen." + validateallValueturnsZero);

					//TC027
					
					ExtentTestManager.startTest("TC027 - Redirection After \"Save and Proceed\"");
					boolean ClickonUpdateAndProceed = Project_Cost_Verification_Module.ClickonUpdateAndProceed();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Click on 'Save and Proceed' button" + ClickonUpdateAndProceed);
					ExtentTestManager.getTest().log(Status.PASS ,"User is redirected to the next component of the application" + ClickonUpdateAndProceed);
					
					
					
					
					
					
					
					
					
					
					
					
					
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



					
					
	



