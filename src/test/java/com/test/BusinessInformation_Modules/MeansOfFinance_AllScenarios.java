package com.test.BusinessInformation_Modules;

import java.io.File; 
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Page_Repositary.MeansOfFinance;
import com.Pages_BusinessInformation_Modules.MeansOfFinance_Module;
// import com.Pages_BusinessInformation_Modules.Tentative_project_cost_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class MeansOfFinance_AllScenarios extends Base_Class {
	
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	MeansOfFinance Meansoffinance;
	
	MeansOfFinance_Module mfm = new MeansOfFinance_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_MeansOfFinance");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Meansoffinance = new  MeansOfFinance();  

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
			//	Base_Class.Login();
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				
			     String ShareCapital = testdata.get("ShareCapital").toString();
      			 String InternalAccurals = testdata.get("InternalAccurals").toString();
       			 String UnsecuredLoan = testdata.get("UnsecuredLoan").toString();
				 String IncentivesAndGrants = testdata.get("IncentivesAndGrants").toString();
				 String Others = testdata.get("Others").toString();
 			     String TermLoanFromOtherFI = testdata.get("TermLoanFromOtherFI").toString();
		//		 String AppliedTermLoan = testdata.get("AppliedTermLoan").toString();
				 String Specify = testdata.get("Specify").toString();
				
			//	String Utilities = testdata.get("Utilities").toString();
			//	String Deposits = testdata.get("Deposits").toString();
			//	String WorkingCapitalAmt = testdata.get("WorkingCapitalAmt").toString();
			//	String TechnicalKnowHowFees = testdata.get("TechnicalKnowHowFees").toString();
			//	String PreliminaryExpenses = testdata.get("PreliminaryExpenses").toString();
			//	String WorkingCapitalMargin = testdata.get("WorkingCapitalMargin").toString();
			//	String Vehicles = testdata.get("Vehicles").toString();
			//	String TechnologyOptimizationAndProductDevelopment = testdata.get("TechnologyOptimizationAndProductDevelopment").toString();
			//	String TestingAndCertification = testdata.get("TestingAndCertification").toString();
			//	String MarketingAndPromotionalExpenses = testdata.get("MarketingAndPromotionalExpenses").toString();
			//	String Others = testdata.get("Others").toString();
			//	String Specify = testdata.get("Specify").toString();

				//TC001
				ExtentTestManager.startTest("TC001 : Verify 'Login for Meansoffinance'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login=MeansOfFinance_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				//TC002
				ExtentTestManager.startTest("TC002 - Navigate to MeansOfFinance Page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean Meansoffinance = true;
				try {
					Meansoffinance = mfm.Navigatetomeansoffinance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Meansof finance" + Meansoffinance);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Means of finance successfully" + Meansoffinance);
				ExtentTestManager.endTest();
				
				
				ExtentTestManager.startTest("TC002 - Navigate to MeansOfFinance Page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean AccessMeansoffinance = true;
				try {
					Meansoffinance = mfm.AccessMeansoffinance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Meansof finance" + AccessMeansoffinance);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Means of finance successfully" + AccessMeansoffinance);
				ExtentTestManager.endTest();
				//TC003
				ExtentTestManager.startTest("TC003 - Enter Share capital");
				boolean Entersharecapital = mfm.Entersharecapital(ShareCapital);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Share Capital" + Entersharecapital);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Entersharecapital );
				ExtentTestManager.endTest();
				
				//TC004
				ExtentTestManager.startTest("TC004 - Enter Internal Accurals");
				boolean Enterinternalaccurals = mfm.EnterInternalAccurals(InternalAccurals);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Internal Accurals" + Enterinternalaccurals );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterinternalaccurals );
				ExtentTestManager.endTest();
				
				//TC005
				ExtentTestManager.startTest("TC005 - Enter Unsecured Loan");
				boolean Enterunsecuredloan = mfm.EnterUnsecuredLoan(UnsecuredLoan);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Unsecured Loan" + Enterunsecuredloan );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterunsecuredloan );
				ExtentTestManager.endTest();
				
				//TC006
				ExtentTestManager.startTest("TC006 - Enter Incentives And Grants");
				boolean Enterincentivesandgrants = mfm.EnterIncentivesAndGrants(IncentivesAndGrants );
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Incentives And Grants" +Enterincentivesandgrants  );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterincentivesandgrants );
				ExtentTestManager.endTest();
				
				//TC007
				ExtentTestManager.startTest("TC007 - Enter Others");
				boolean Enterothers = mfm.EnterOthers(Others );
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Others" +Enterothers  );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterothers );
				ExtentTestManager.endTest();
				
				//TC008
				ExtentTestManager.startTest("TC008 - Enter Specify");
				boolean Enterspecify = mfm.EnterSpecify(Specify );
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Specify" +Enterspecify  );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterspecify );
				ExtentTestManager.endTest();
				
				
				//TC012
				ExtentTestManager.startTest("TC009 : Enter Term Loan From Other FI");
                Log.info("Button visible !");
                boolean Calculation = mfm.Calculation();
                ExtentTestManager.getTest().log(Status.PASS, "Project cost amount captured" + Calculation);
				
				
				//TC010
				ExtentTestManager.startTest("TC010 : Click on the save as draft");
				boolean Clickonthesaveasdraft = mfm.ClickontheSaveasdraft();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the save as draft" + Clickonthesaveasdraft );
				ExtentTestManager.endTest();
				
				//TC011
				ExtentTestManager.startTest("TC011 : Click on the save and proceed");
				boolean Clickonthesaveandproceed = mfm.ClickontheSaveandproceed();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the save and proceed" + Clickonthesaveandproceed );
				ExtentTestManager.endTest();
				
				
			/*	//TC009
				ExtentTestManager.startTest("TC009 - Enter Applied Term Loan");
				boolean Enterterappliedtermloan = mfm.EnterAppliedTermLoan(AppliedTermLoan );
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter Applied Term Loan" +Enterterappliedtermloan  );
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +Enterterappliedtermloan );
				ExtentTestManager.endTest();
		*/		
//				String value = testdata.get("InternalAccurals").toString();
//				input(InternalAccurals,value);
				
				
				
                
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
	



