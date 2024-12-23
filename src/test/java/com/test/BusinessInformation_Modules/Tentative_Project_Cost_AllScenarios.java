package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Tentative_project_cost_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;


public class Tentative_Project_Cost_AllScenarios extends Base_Class{

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Tentative_project_cost_Module Tentative_project_cost_Module;
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Tentative_Project_Cost");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Tentative_project_cost_Module = new Tentative_project_cost_Module();

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
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				
				String EmailAddress = testdata.get("EmailAddress").toString();
				String Password = testdata.get("Password").toString();
				String PlantMachinery = testdata.get("PlantMachinery").toString();
				String LandDevelopment = testdata.get("LandDevelopment").toString();
				String BuildingCivilWorks = testdata.get("BuildingCivilWorks").toString();
				String MiscFixedAssets = testdata.get("MiscFixedAssets").toString();
				String Land = testdata.get("Land").toString();
				String Utilities = testdata.get("Utilities").toString();
				String Deposits = testdata.get("Deposits").toString();
				String WorkingCapitalAmt = testdata.get("WorkingCapitalAmt").toString();
				String TechnicalKnowHowFees = testdata.get("TechnicalKnowHowFees").toString();
				String PreliminaryExpenses = testdata.get("PreliminaryExpenses").toString();
				String WorkingCapitalMargin = testdata.get("WorkingCapitalMargin").toString();
				String Vehicles = testdata.get("Vehicles").toString();
				String TechnologyOptimizationAndProductDevelopment = testdata.get("TechnologyOptimizationAndProductDevelopment").toString();
				String TestingAndCertification = testdata.get("TestingAndCertification").toString();
				String MarketingAndPromotionalExpenses = testdata.get("MarketingAndPromotionalExpenses").toString();
				String Others = testdata.get("Others").toString();
				String Specify = testdata.get("Specify").toString();

				//TC001
				ExtentTestManager.startTest("TC001 : Verify Navigation to 'Tentative Project Cost Break Up'");
				boolean Login = Tentative_project_cost_Module.Login(EmailAddress, Password);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + Login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + Login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + Login);
				
				//TC002
				ExtentTestManager.startTest(" TC002 - 'Plant & Machinery' Field - Numeric Input");
				boolean EnterPlantAndMachinery = Tentative_project_cost_Module.EnterPlantAndMachinery(PlantMachinery);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Plant & Machinery'." + EnterPlantAndMachinery);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted. :" + EnterPlantAndMachinery);
				
				
				//TC003
				
				ExtentTestManager.startTest("TC003 -  'Land' Field - Numeric Input");
				boolean EnterLand = Tentative_project_cost_Module.EnterLand(Land);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Land'." + EnterLand);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted. :" + EnterLand);
				
				//TC004
				
				ExtentTestManager.startTest("TC004 - 'Land Development' Field - Numeric Input");
				boolean EnterLandAndDevelopment = Tentative_project_cost_Module.EnterLandDevelopmenent(LandDevelopment);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Land Development'." + EnterLandAndDevelopment);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted. :" + EnterLandAndDevelopment);
				
				//TC005
				
				ExtentTestManager.startTest(" TC005 - 'Building & Civil Works' Field - Numeric Input");
				boolean EnterBuildingAndCoWorkers = Tentative_project_cost_Module.EnterBuildingCivilWorks(BuildingCivilWorks);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Building & Civil Works'." + EnterBuildingAndCoWorkers);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted.:" + EnterBuildingAndCoWorkers);
				
				//TC006
				
				ExtentTestManager.startTest(" TC006 - 'Utilities' Field - Numeric Input");
				boolean EnterUtilities = Tentative_project_cost_Module.EnterUtilities(Utilities);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Utilities'." + EnterUtilities);
				ExtentTestManager.getTest().log(Status.PASS , "Numeric value is accepted.'." + EnterUtilities);
				
				//TC007 
				
				ExtentTestManager.startTest(" TC007 - 'Misc Fixed Assets' Field - Numeric Input");
				boolean EnterMiscFixasset = Tentative_project_cost_Module.EnterMiscFixedAssets(MiscFixedAssets);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Misc Fixed Assets'." + EnterMiscFixasset);
				ExtentTestManager.getTest().log(Status.PASS , "Numeric value is accepted.." + EnterMiscFixasset);
				
				//TC008
				
				ExtentTestManager.startTest(" TC008 - 'Deposits' Field - Numeric Input");
				boolean EnterDeposits= Tentative_project_cost_Module.EnterDeposite(Deposits);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Deposits'." + EnterDeposits);
				ExtentTestManager.getTest().log(Status.PASS , "Numeric value is accepted." + EnterDeposits);
				
				//TC009
                
				ExtentTestManager.startTest(" TC009 - 'Preliminary Expenses' Field - Numeric Input");
				boolean EnterPriliminaryExpense = Tentative_project_cost_Module.EnterPriliminaryExpense(PreliminaryExpenses);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Preliminary Expenses'." + EnterPriliminaryExpense);
				ExtentTestManager.getTest().log(Status.PASS , "Numeric value is accepted." + EnterPriliminaryExpense);
				
				//TC010
				ExtentTestManager.startTest("TC010 -Verify 'Preoperative Expenses' Amount is Loaded");
				boolean ValidatePreoperativeExpense  = Tentative_project_cost_Module.ValidatePreoperativeExpenses();
				ExtentTestManager.getTest().log(Status.PASS , "1. Check the 'Preoperative Expenses' field." + ValidatePreoperativeExpense);
				ExtentTestManager.getTest().log(Status.PASS , "The appropriate amount is loaded in the 'Preoperative Expenses' field." + ValidatePreoperativeExpense);
				
				//TC011
				
				ExtentTestManager.startTest(" TC011 - Verify 'Contingencies' Amount is Loaded");
				boolean ValidateContingencies  = Tentative_project_cost_Module.ValidateContingencies();
				ExtentTestManager.getTest().log(Status.PASS , "1. Check the 'Contingencies' field." + ValidateContingencies);
				ExtentTestManager.getTest().log(Status.PASS , "The appropriate amount is loaded in the 'Contingencies' field." + ValidateContingencies);
				
				//TC012
				
				ExtentTestManager.startTest(" TC012 - 'Working Capital Margin' Field - Numeric Input");
				boolean EnterWorkingCapitalMargin  = Tentative_project_cost_Module.WorkingCapitalMargin(WorkingCapitalMargin);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Working Capital Margin'." + EnterWorkingCapitalMargin);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterWorkingCapitalMargin);
				
				//TC013
				
				ExtentTestManager.startTest(" TC013 - 'Working Capital' Field - Numeric Input");
				boolean EnterWorkingCapitalAMt  = Tentative_project_cost_Module.WorkingCapital(WorkingCapitalAmt);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Working Capital'." + EnterWorkingCapitalAMt);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterWorkingCapitalAMt);
				
				
				//TC014
				
				ExtentTestManager.startTest("TC014 - 'Technical Know-How Fees' Field - Numeric Input");
				boolean EnterTechnicalFees  = Tentative_project_cost_Module.TechnicalFees(TechnicalKnowHowFees);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Technical Know-How Fees'." + EnterTechnicalFees);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterTechnicalFees);
				
				//TC015 
				
				ExtentTestManager.startTest("TC015 - 'Vehicles' Field - Numeric Input");
				boolean EnterVehicle  = Tentative_project_cost_Module.Vehicles(Vehicles);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Vehicles'." + EnterVehicle);
				ExtentTestManager.getTest().log(Status.PASS , "Numeric value is accepted." + EnterVehicle);
				
				//TC016 
				
				ExtentTestManager.startTest(" TC016 - 'Technology Optimization & Product Development' Field - Numeric Input");
				boolean EnterTechnologyOptimizationAndProductDevelopment  = Tentative_project_cost_Module.EnterTechnologyOptimizationAndProductDevelopment(TechnologyOptimizationAndProductDevelopment);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Technology Optimization & Product Development'." + EnterTechnologyOptimizationAndProductDevelopment);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterTechnologyOptimizationAndProductDevelopment);
				
				//TC017
				
				ExtentTestManager.startTest(" TC017 - 'Testing & Certification' Field - Numeric Input");
				boolean EnterTestingAndCertification  = Tentative_project_cost_Module.EnterTestingAndCertification(TestingAndCertification);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Testing & Certification'." + EnterTestingAndCertification);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterTestingAndCertification);
				
				//TC018
				ExtentTestManager.startTest(" TC018 - 'Marketing & Promotional Expenses' Field - Numeric Input");
				boolean EnterMarketingExpense  = Tentative_project_cost_Module.EnterMarketingExpense(MarketingAndPromotionalExpenses);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Marketing & Promotional Expenses'." + EnterMarketingExpense);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted." + EnterMarketingExpense);
				
				//TC019
				
				ExtentTestManager.startTest(" TC019 - 'Others' Field - Numeric Input");
				boolean EnterOthers  = Tentative_project_cost_Module.EnterOthers(Others);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter numeric value in 'Others'." + EnterOthers);
				ExtentTestManager.getTest().log(Status.PASS ,"Numeric value is accepted, and other related fields are updated accordingly." + EnterOthers);
				
				//TC020
				
				ExtentTestManager.startTest("TC020 - 'Specify' field- alphanumeric");
				boolean EnterSpecify = Tentative_project_cost_Module.EnterSpecify(Specify);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter alphanumeric data in specify field " + EnterSpecify);
				ExtentTestManager.getTest().log(Status.PASS ,"Alphanumeric data accepted in specify field" + EnterSpecify);
				
				
				//TC021
				
				ExtentTestManager.startTest(" TC021 - Save and Proceed from 'Tentative Project Cost Break Up'");
				boolean SaveandProceed  = Tentative_project_cost_Module.SaveAndProceed();
				ExtentTestManager.getTest().log(Status.PASS , "1. Click on the 'Save and Proceed' button." + SaveandProceed);
				ExtentTestManager.getTest().log(Status.PASS ,"Data is saved successfully, and navigation proceeds to the next step" + SaveandProceed);
				
				
				
				
				
                
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
	


	
	

