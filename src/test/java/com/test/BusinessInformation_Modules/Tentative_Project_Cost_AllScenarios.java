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
				ExtentTestManager.startTest("TestScenario01 : Login for Business Information Module");
				boolean Login = Tentative_project_cost_Module.Login(EmailAddress, Password);
				ExtentTestManager.getTest().log(Status.PASS , "Login successfully" + Login);
				Log.info("Login successfully :" + Login);
				
				//TC002
				ExtentTestManager.startTest(" Plant And Machinery Entered");
				boolean EnterPlantAndMachinery = Tentative_project_cost_Module.EnterPlantAndMachinery(PlantMachinery);
				ExtentTestManager.getTest().log(Status.PASS , "Plant And Machinery Entered" + EnterPlantAndMachinery);
				Log.info("Plant And Machinery Entered :" + EnterPlantAndMachinery);
				
				
				//TC003
				
				ExtentTestManager.startTest(" Land Entered");
				boolean EnterLand = Tentative_project_cost_Module.EnterLand(Land);
				ExtentTestManager.getTest().log(Status.PASS , "Land Entered" + EnterLand);
				Log.info("Land Entered :" + EnterLand);
				
				//TC004
				
				ExtentTestManager.startTest(" Land and Development Entered");
				boolean EnterLandAndDevelopment = Tentative_project_cost_Module.EnterLandDevelopmenent(LandDevelopment);
				ExtentTestManager.getTest().log(Status.PASS , "Land and Development Entered" + EnterLandAndDevelopment);
				Log.info("Land and Development Entered :" + EnterLandAndDevelopment);
				
				//TC005
				
				ExtentTestManager.startTest(" Building & Civil Works' Entered");
				boolean EnterBuildingAndCoWorkers = Tentative_project_cost_Module.EnterBuildingCivilWorks(BuildingCivilWorks);
				ExtentTestManager.getTest().log(Status.PASS , "Building & Civil Works' Entered" + EnterBuildingAndCoWorkers);
				Log.info("Building & Civil Works' Entered :" + EnterBuildingAndCoWorkers);
				
				//TC006
				
				ExtentTestManager.startTest(" Utilities Entered");
				boolean EnterUtilities = Tentative_project_cost_Module.EnterUtilities(Utilities);
				ExtentTestManager.getTest().log(Status.PASS , "Utilities Entered" + EnterUtilities);
				Log.info("Utilities Entered :" + EnterUtilities);
				
				//TC007 
				
				ExtentTestManager.startTest(" Misc Fixed Assets Entered");
				boolean EnterMiscFixasset = Tentative_project_cost_Module.EnterMiscFixedAssets(MiscFixedAssets);
				ExtentTestManager.getTest().log(Status.PASS , "Misc Fixed Assets Entered" + EnterMiscFixasset);
				Log.info("Misc Fixed Assets Entered :" + EnterMiscFixasset);
				
				//TC008
				
				ExtentTestManager.startTest(" Deposits Entered");
				boolean EnterDeposits= Tentative_project_cost_Module.EnterDeposite(Deposits);
				ExtentTestManager.getTest().log(Status.PASS , "Deposits Entered" + EnterDeposits);
				Log.info("Deposits Entered :" + EnterDeposits);
				
				//TC009
                
				ExtentTestManager.startTest(" Priliminary Expense Entered");
				boolean EnterPriliminaryExpense = Tentative_project_cost_Module.EnterPriliminaryExpense(PreliminaryExpenses);
				ExtentTestManager.getTest().log(Status.PASS , "Priliminary Expense Entered" + EnterPriliminaryExpense);
				Log.info("Priliminary Expense Entered :" + EnterPriliminaryExpense);
				
				//TC010
				ExtentTestManager.startTest(" Validated Preoperative Expense");
				boolean ValidatePreoperativeExpense  = Tentative_project_cost_Module.ValidatePreoperativeExpenses();
				ExtentTestManager.getTest().log(Status.PASS , "Validated Preoperative Expense" + ValidatePreoperativeExpense);
				Log.info("Validated Preoperative Expense :" + ValidatePreoperativeExpense);
				
				//TC011
				
				ExtentTestManager.startTest(" Validated Contingencies");
				boolean ValidateContingencies  = Tentative_project_cost_Module.ValidateContingencies();
				ExtentTestManager.getTest().log(Status.PASS , "Validated Contingencies" + ValidateContingencies);
				Log.info("Validated Contingencies :" + ValidateContingencies);
				
				//TC012
				
				ExtentTestManager.startTest(" Working Capital Margin Entered");
				boolean EnterWorkingCapitalMargin  = Tentative_project_cost_Module.WorkingCapitalMargin(WorkingCapitalMargin);
				ExtentTestManager.getTest().log(Status.PASS , "Working Capital Margin Entered" + EnterWorkingCapitalMargin);
				Log.info("Working Capital Margin Entered :" + EnterWorkingCapitalMargin);
				
				//TC013
				
				ExtentTestManager.startTest(" Working Capital Amt Entered");
				boolean EnterWorkingCapitalAMt  = Tentative_project_cost_Module.WorkingCapital(WorkingCapitalAmt);
				ExtentTestManager.getTest().log(Status.PASS , "Working Capital Amt Entered" + EnterWorkingCapitalAMt);
				Log.info("Working Capital Amt Entered :" + EnterWorkingCapitalAMt);
				
				
				//TC014
				
				ExtentTestManager.startTest(" Technical Amt Entered");
				boolean EnterTechnicalFees  = Tentative_project_cost_Module.TechnicalFees(TechnicalKnowHowFees);
				ExtentTestManager.getTest().log(Status.PASS , "Technical Amt Entered" + EnterTechnicalFees);
				Log.info("Working Capital Amt Entered :" + EnterTechnicalFees);
				
				//TC015 
				
				ExtentTestManager.startTest(" Vehicles Entered");
				boolean EnterVehicle  = Tentative_project_cost_Module.Vehicles(Vehicles);
				ExtentTestManager.getTest().log(Status.PASS , "Vehicles Entered" + EnterVehicle);
				Log.info("Vehicles Entered :" + EnterVehicle);
				
				//TC016 
				
				ExtentTestManager.startTest(" Technology Optimization & Product Development Entered");
				boolean EnterTechnologyOptimizationAndProductDevelopment  = Tentative_project_cost_Module.EnterTechnologyOptimizationAndProductDevelopment(TechnologyOptimizationAndProductDevelopment);
				ExtentTestManager.getTest().log(Status.PASS , "Technology Optimization & Product Development Entered" + EnterTechnologyOptimizationAndProductDevelopment);
				Log.info("Technology Optimization & Product Development Entered :" + EnterTechnologyOptimizationAndProductDevelopment);
				
				//TC017
				
				ExtentTestManager.startTest(" Testing & Certification Entered");
				boolean EnterTestingAndCertification  = Tentative_project_cost_Module.EnterTestingAndCertification(TestingAndCertification);
				ExtentTestManager.getTest().log(Status.PASS , "Testing & Certification Entered" + EnterTestingAndCertification);
				Log.info("Testing & Certification Entered :" + EnterTestingAndCertification);
				
				//TC019
				ExtentTestManager.startTest(" Marketing and Promotional Expense Entered");
				boolean EnterMarketingExpense  = Tentative_project_cost_Module.EnterMarketingExpense(MarketingAndPromotionalExpenses);
				ExtentTestManager.getTest().log(Status.PASS , "Marketing and Promotional Expense Entered" + EnterMarketingExpense);
				Log.info("Marketing and PromotionalExpense Entered :" + EnterMarketingExpense);
				
				//TC020
				
				ExtentTestManager.startTest(" Others Entered");
				boolean EnterOthers  = Tentative_project_cost_Module.EnterOthers(Others);
				ExtentTestManager.getTest().log(Status.PASS , "Others Entered" + EnterOthers);
				Log.info("Others Entered :" + EnterOthers);
				
				//TC021
				
				ExtentTestManager.startTest(" Specify Entered");
				boolean EnterSpecify = Tentative_project_cost_Module.EnterSpecify(Specify);
				ExtentTestManager.getTest().log(Status.PASS , "Specify Entered" + EnterSpecify);
				Log.info("Specify Entered :" + EnterSpecify);
				
				
				//TC022
				
				ExtentTestManager.startTest(" Save and Proceeded");
				boolean SaveandProceed  = Tentative_project_cost_Module.SaveAndProceed();
				ExtentTestManager.getTest().log(Status.PASS , "Successfully Submitted" + SaveandProceed);
				Log.info("Successfully Submitted :" + SaveandProceed);
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
                
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
	


	
	

