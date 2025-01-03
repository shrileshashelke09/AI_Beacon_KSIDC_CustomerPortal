package com.test.BusinessInformation_Modules; 

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Business_Entrepreneur_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Business_Entrepreneur_Details_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Business_Entrepreneur_Details_Module Business_Entrepreneur_Details_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Business_Enterpreneur");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Business_Entrepreneur_Details_Module = new Business_Entrepreneur_Details_Module();

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

//				String EmailAddress = testdata.get("EmailAddress").toString();
//				String Password = testdata.get("Password").toString();
				String DetailsOfPresentActivities= testdata.get("DetailsOfPresentActivities").toString();
     			String NetWorth = testdata.get("NetWorth").toString();
				String LastFinYearTotalIncome = testdata.get("LastFinYearTotalIncome").toString();
				String EntrepreneurFund = testdata.get("EntrepreneurFund").toString();
				String CoampanyName = testdata.get("CoampanyName").toString();
				String Product = testdata.get("Product").toString();
				String ExtentOfFundsInvested = testdata.get("ExtentOfFundsInvested").toString();
				String PercentageShareholding = testdata.get("PercentageShareholding").toString();
				String NetLoss = testdata.get("NetLoss").toString();
//				String P_AddressLine2 = testdata.get("P_AddressLine2").toString();
//				String P_AddressLine3 = testdata.get("P_AddressLine3").toString();
//				String LandMark = testdata.get("LandMark").toString();
//				String Place = testdata.get("Place").toString();
//				String Organization = testdata.get("Organization").toString();
//				String CourseName = testdata.get("CourseName").toString();
//				String From = testdata.get("From").toString();
//				String To = testdata.get("To").toString();
//				String Experience = testdata.get("Experience").toString();
//				String Summary = testdata.get("Summary").toString();
//				String AwardName = testdata.get("AwardName").toString();
//				String AwardProvidedby = testdata.get("AwardProvidedby").toString();
//				String PassportNumber = testdata.get("PassportNumber").toString();
//				String VoterId = testdata.get("VoterId").toString();
//				String CKYC = testdata.get("CKYC").toString();
//				String PercentageOfShareHolding = testdata.get("PercentageOfShareHolding").toString();

				
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				

				// TC001
				ExtentTestManager.startTest("TC001 : Login for Business Entrepreneur Details Module");
				boolean Login =Business_Entrepreneur_Details_Module.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Click on Login button" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				// TC002
			
				ExtentTestManager.startTest("TC002 - Navigate to Business Finance Stage");
				boolean EntrepreneurDetails = Business_Entrepreneur_Details_Module.BusinessEntrepreneurDetails();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Business Finance stage" + EntrepreneurDetails);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Business Finance stage successfully" + EntrepreneurDetails);
				
				//TC003
				
				ExtentTestManager.startTest("TC003 - \"Business Entrepreneur Details\" Header Visibility");
				boolean EntrepreneurDetailsHeader = Business_Entrepreneur_Details_Module.Header();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the Business Finance stage interface" + EntrepreneurDetailsHeader);
				ExtentTestManager.getTest().log(Status.PASS,"\"Business Entrepreneur Details\" Header is visible" + EntrepreneurDetailsHeader);
				
				//TC004
				ExtentTestManager.startTest("TC004 - \"Main Window Text Visibility");
				boolean MainTextVisibility = Business_Entrepreneur_Details_Module.VerifyMainText();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the main interface of the window" + MainTextVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"\"Begin your journey! Click 'Add Entrepreneur Details' to add the details of each one\" text is visible" + MainTextVisibility);
				
				//TC005
				
				ExtentTestManager.startTest("TC005 - \"Skip this for Now\" Button Visibility");
				boolean SKipforNowVisibility = Business_Entrepreneur_Details_Module.SkipforNowvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the buttons on the window interface" + SKipforNowVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"\"Skip this for Now\" button is visible" + SKipforNowVisibility);
				
				//TC006
				
				ExtentTestManager.startTest("TC006 - \"Navigate to Next Component with Skip");
				boolean ClickSKipforNowVisibility = Business_Entrepreneur_Details_Module.ChecknextComponent();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on \"Skip this for Now\" button" + ClickSKipforNowVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to the next component" + ClickSKipforNowVisibility);
				
				//TC007
				
				ExtentTestManager.startTest("TC007 - \"Add Entrepreneur Details\" Button Availability");
				boolean CheckAddEnterpreneurVisibility = Business_Entrepreneur_Details_Module.AddEnterprebuttonvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the buttons on the window interface" + CheckAddEnterpreneurVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Entrepreneur Details\" button is available" + CheckAddEnterpreneurVisibility);
				
				
				//TC008
				ExtentTestManager.startTest("TC008 - \"Add Entrepreneur Button Functionality");
				boolean ClickkAddEnterpreneur = Business_Entrepreneur_Details_Module.ClickAddEnterprebutton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on \"Add Entrepreneur\" button" + ClickkAddEnterpreneur);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to the Business Entrepreneur Details window" + ClickkAddEnterpreneur);
				
				
				//TC009
				ExtentTestManager.startTest("TC009 - \"Business Entrepreneur Details\" Header Visibility");
				boolean EntrepreneurDetailsWindowHeader = Business_Entrepreneur_Details_Module.Header();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the header of the window" + EntrepreneurDetailsWindowHeader);
				ExtentTestManager.getTest().log(Status.PASS,"Correct window header is displayed" + EntrepreneurDetailsWindowHeader);
				
				//TC010
				ExtentTestManager.startTest("TC010 - \"Entrepreneur Name\" Field Visibility and Selection");
				boolean SelectEntrepreneurName = Business_Entrepreneur_Details_Module.SelectEnterpreneurName();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + SelectEntrepreneurName);
				ExtentTestManager.getTest().log(Status.PASS,"2. Select data in the \"Entrepreneur Name\" field" + SelectEntrepreneurName);
				ExtentTestManager.getTest().log(Status.PASS,"Entrepreneur Name\" field is visible and data can be selected" + SelectEntrepreneurName);
				
				//TC011
				
				ExtentTestManager.startTest("TC011 - \"Details Of Present Activities\" Field Visibility and Data Entry");
				boolean EnterDetailsOfPresentActivities = Business_Entrepreneur_Details_Module.EnterDetailsOfPresentActivities(DetailsOfPresentActivities);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterDetailsOfPresentActivities);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter alphanumeric characters in the \"Details Of Present Activities\" field" + EnterDetailsOfPresentActivities);
				ExtentTestManager.getTest().log(Status.PASS,"Details Of Present Activities\" field is visible and accepts alphanumeric input" + EnterDetailsOfPresentActivities);
				
				//TC012
				
				ExtentTestManager.startTest("TC012 - \"Net Worth (?)\" Field Visibility and Data Entry");
				boolean EnterNetworth = Business_Entrepreneur_Details_Module.EnterNetWorth(NetWorth);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterNetworth);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter numeric characters in the \"Net Worth (?)\" field" + EnterNetworth);
				ExtentTestManager.getTest().log(Status.PASS,"Net Worth (?)\" field is visible and accepts numeric input" + EnterNetworth);
				
				//TC013
				
				ExtentTestManager.startTest("TC013 - \"Last Fin Year Total Income (?)\" Field Visibility and Data Entry");
				boolean EnterLastYearIncome = Business_Entrepreneur_Details_Module.EnterLastYearIncome(LastFinYearTotalIncome);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterLastYearIncome);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter numeric characters in the \"Last Fin Year Total Income (?)\" field" + EnterLastYearIncome);
				ExtentTestManager.getTest().log(Status.PASS,"Last Fin Year Total Income (?)\" field is visible and accepts numeric input" + EnterLastYearIncome);
				
				
				//TC014
				
				ExtentTestManager.startTest("TC014 - \"Funds\" Field Visibility and Data Entry");
				boolean EnterFunds = Business_Entrepreneur_Details_Module.EnterFunds(EntrepreneurFund);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterFunds);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter numeric characters in the \"Last Fin Year Total Income (?)\" field" + EnterFunds);
				ExtentTestManager.getTest().log(Status.PASS,"Funds\" field is visible and accepts numeric input" + EnterFunds);
				
				//TC015
				
				ExtentTestManager.startTest("TC015 - \"ITR Submitted (yes/no)\" Field Visibility and Option Selection");
				boolean SelectITR = Business_Entrepreneur_Details_Module.SelectYESforITR();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + SelectITR);
				ExtentTestManager.getTest().log(Status.PASS,"2. Select option from the \"ITR Submitted (yes/no)\" radio button" + SelectITR);
				ExtentTestManager.getTest().log(Status.PASS,"\"ITR Submitted (yes/no)\" field is visible and option can be selected" + SelectITR);
				
				
				//TC016
				ExtentTestManager.startTest("TC016 - \"Managing Any Other Companies\" Section Availability");
				boolean ManagingOtherCompanySection = Business_Entrepreneur_Details_Module.ManagingOtherCompaniesfield();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the window sections" + ManagingOtherCompanySection);
				ExtentTestManager.getTest().log(Status.PASS,"\"Managing Any Other Companies\" section is available" + ManagingOtherCompanySection);
				
				//TC017
				
				ExtentTestManager.startTest("TC017 - Select \"Yes\" for Managing Other Companies");
				boolean SelectYEsManagingOtherCompanySection = Business_Entrepreneur_Details_Module.SelectYesasManagingOtherCompaniesfield();
				ExtentTestManager.getTest().log(Status.PASS,"1. Select \"Yes\" from the radio button in the \"Managing Any Other Companies\" section" + SelectYEsManagingOtherCompanySection);
				ExtentTestManager.getTest().log(Status.PASS,"Radio button set to \"Yes\" and state is stored" + SelectYEsManagingOtherCompanySection);
				
				//TC018
				ExtentTestManager.startTest("TC018 - \"Add Company\" Button Visibility After Selecting Yes");
				boolean AddCompanyButtonvisibility = Business_Entrepreneur_Details_Module.AddCompanyButtonvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the buttons after selecting \"Yes\"" + AddCompanyButtonvisibility);
				ExtentTestManager.getTest().log(Status.PASS,"The \"Add Company\" button becomes visible" + AddCompanyButtonvisibility);
				
				//TC019
				ExtentTestManager.startTest("TC019 - \"Add Company\" Button Functionality");
				boolean ClickAddCompanyButton = Business_Entrepreneur_Details_Module.ClickAddCompanyButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on \"Add Company\" button" + ClickAddCompanyButton);
				ExtentTestManager.getTest().log(Status.PASS,"Redirects to \"Add Company Details\" popup window" + ClickAddCompanyButton);
	
				//TC020
				
				ExtentTestManager.startTest("TC020 - \"Funds\" Field Visibility and Data Entry");
				boolean EnterCompanyName = Business_Entrepreneur_Details_Module.EnterCompanyName(CoampanyName);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterFunds);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter numeric characters in the \"Last Fin Year Total Income (?)\" field" + EnterFunds);
				ExtentTestManager.getTest().log(Status.PASS,"Funds\" field is visible and accepts numeric input" + EnterFunds);
				
				

				// App Logout

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