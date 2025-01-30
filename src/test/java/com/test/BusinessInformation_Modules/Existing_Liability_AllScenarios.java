package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Existing_Liability_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Existing_Liability_AllScenarios extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Existing_Liability_Module Existing_Liability_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Existing_Liability");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Existing_Liability_Module = new Existing_Liability_Module();

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

//				String EmailAddress = testdata.get("EmailAddress").toString();
//				String Password = testdata.get("Password").toString();
				String GuaranteeCompanyNameTest = testdata.get("GuaranteeCompanyNameTest").toString();
				String GuaranteeCompanyPanTest = testdata.get("GuaranteeCompanyPanTest").toString();
				String IFSCCodeTest = testdata.get("IFSCCodeTest").toString();
				String SanctionAmount = testdata.get("SanctionAmount").toString();
				String OutstandingBalance = testdata.get("OutstandingBalance").toString();
				String LoanArrears = testdata.get("LoanArrears").toString();
				String Security = testdata.get("Security").toString();


				// TC001
				ExtentTestManager.startTest("TC001 : Login with Valid Credentials");
				Log.info("Button visible !");
				boolean Login = Existing_Liability_Module.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
				Log.info("Login successfully :" + Login);

				// TC002

				ExtentTestManager.startTest("TC002 - Navigate to Existing Liability Page");
				boolean NavigatetoExistingLiabilityPage = Existing_Liability_Module.ClickExistingLiability();
				ExtentTestManager.getTest().log(Status.PASS,
						"  Navigate through the menu to 'Business Information'." + NavigatetoExistingLiabilityPage);
				ExtentTestManager.getTest().log(Status.PASS,
						" Click on 'Existing Liability'" + NavigatetoExistingLiabilityPage);
				Log.info(" User navigates to the 'Existing Liability' component window. :"
						+ NavigatetoExistingLiabilityPage);

				// TC003

				ExtentTestManager.startTest(" TC003 - Verify Heading of 'Existing Liability' Window");
				boolean ValidateHeader = Existing_Liability_Module.Heading();
				ExtentTestManager.getTest().log(Status.PASS, "  Check the window heading.'." + ValidateHeader);
				ExtentTestManager.getTest().log(Status.PASS,
						" The heading matches the expected text :" + ValidateHeader);

				// TC004

				ExtentTestManager.startTest(" TC004 -Verify Text in 'Existing Liability' Window");
				boolean ValidateContentforpage = Existing_Liability_Module.DisplayContent();
				ExtentTestManager.getTest().log(Status.PASS,
						"  Located the text \"Begin your journey! Click 'Add Liabilities' to add the details of each one\" in the grid..'."
								+ ValidateContentforpage);
				ExtentTestManager.getTest().log(Status.PASS,
						" The text is visible in the grid section. :" + ValidateContentforpage);

				// TC005

				ExtentTestManager.startTest(" TC005 - Check 'Skip this For Now' Button Availability");
				boolean ValidateSkipforNowLink = Existing_Liability_Module.ValidateSkipForNow();
				ExtentTestManager.getTest().log(Status.PASS , "1. Locate the 'Skip this For Now' button in the grid.\r\n"
						+ "2. Click the button." +  ValidateSkipforNowLink );
				ExtentTestManager.getTest().log(Status.PASS ," The button is available and clickable, allowing navigation to the next component.:" + ValidateSkipforNowLink);

				// TC006

				ExtentTestManager.startTest(" TC006 - Verify 'Add Liabilities' Button Availability");
				boolean ClickOnAddLiablityButton = Existing_Liability_Module.ClickonAddLiabilityButton();
				ExtentTestManager.getTest().log(Status.PASS, " 1. Locate the 'Add Liabilities' button." + ClickOnAddLiablityButton);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Click the button.:" + ClickOnAddLiablityButton);
				ExtentTestManager.getTest().log(Status.PASS, " The button is visible and clickable, redirecting to the 'Add Liabilities' section." + ClickOnAddLiablityButton);

				//TC007
				ExtentTestManager.startTest(" TC007 - Test 'Cancel' Button Functionality");
				boolean ClickCancelButton = Existing_Liability_Module.ClickonCancelButton();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click the 'Cancel' button." + ClickCancelButton);
				ExtentTestManager.getTest().log(Status.PASS,
						" The window redirects to the main window without saving changes.:" + ClickCancelButton);

				// TC008

				ExtentTestManager.startTest(" TC008 - Verify 'Liability Category' Field");
				boolean SelectLiabilityCategory = Existing_Liability_Module.SelectLiabilityCategory();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Locate 'Liability Category' field." + SelectLiabilityCategory);
				ExtentTestManager.getTest().log(Status.PASS,
						" 2. Attempt to select an option.:" + SelectLiabilityCategory);
				ExtentTestManager.getTest().log(Status.PASS,
						" The field is available, and a selection can be made.:" + SelectLiabilityCategory);

				// TC009

				ExtentTestManager.startTest(" TC009 - Verify 'Guarantee Company Name' Field");
				boolean EnterCompanyName = Existing_Liability_Module
						.ENterGuaranteeCompanyName(GuaranteeCompanyNameTest);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Locate 'Guarantee Company Name' field." + EnterCompanyName);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter alphanumeric data.:" + EnterCompanyName);
				ExtentTestManager.getTest().log(Status.PASS,
						" The field accepts alphanumeric data.:" + EnterCompanyName);

				// TC010

				ExtentTestManager.startTest(" TC010 - Verify 'Guarantee Company Pan' Field");
				boolean EnterCompanyPAN = Existing_Liability_Module
						.ENterGuaranteeCompanyNamePANTest(GuaranteeCompanyPanTest);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Locate 'Guarantee Company Pan' field." + EnterCompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter alphanumeric data.:" + EnterCompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS,
						" The field accepts alphanumeric data.:" + EnterCompanyPAN);

				// TC011

				ExtentTestManager.startTest(" TC011 - Verify 'IFSC Code' Field");
				boolean EnterIFSCCode = Existing_Liability_Module.ENterIFSCCode(IFSCCodeTest);
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate 'IFSC Code' field." + EnterIFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,
						" 2. Enter alphanumeric data (SBIN0070939):" + EnterIFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,
						" The field accepts alphanumeric input and updates 'Bank' and 'Branch' fields..:"
								+ EnterIFSCCode);

				// TC012

				ExtentTestManager.startTest(" TC012 - Verify 'Loan Purpose' Field");
				boolean SelectLoanPurpose = Existing_Liability_Module.selectLoanPurpose();
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate 'Loan Purpose' field." + SelectLoanPurpose);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Make a selection.(Business):" + SelectLoanPurpose);
				ExtentTestManager.getTest().log(Status.PASS,
						" The field is available, and a selection can be made.:" + SelectLoanPurpose);
				
				//TC013
				
				ExtentTestManager.startTest(" TC013 - Verify 'Sanction Amount' Field");
				boolean EnterSanctionAmount = Existing_Liability_Module.EntersanctionAmount(SanctionAmount);
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate 'Sanction Amount' field." + EnterSanctionAmount);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter numeric data.:" + EnterSanctionAmount);
				ExtentTestManager.getTest().log(Status.PASS," The field accepts numeric data.:" + EnterSanctionAmount);
				
				//TC014
				
				ExtentTestManager.startTest(" TC014 -Verify 'Outstanding Balance' Field");
				boolean EnterOutstandingAmount = Existing_Liability_Module.EnterOutstandingAmount(OutstandingBalance);
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate 'Outstanding Balance' field." + EnterOutstandingAmount);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter numeric data.:" + EnterOutstandingAmount);
				ExtentTestManager.getTest().log(Status.PASS," The field accepts numeric data.:" + EnterOutstandingAmount);
				
				//TC015
				

				ExtentTestManager.startTest(" TC015 - Verify 'Status Of Loan' Field");
				boolean SelectStatusOfLoan = Existing_Liability_Module.SelectStatusOfLoan();
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate 'Status Of Loan' field." + SelectStatusOfLoan);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Make a selection.(Standard):" + SelectStatusOfLoan);
				ExtentTestManager.getTest().log(Status.PASS," The field is available, and a selection can be made.:" + SelectStatusOfLoan);
				
				//TC016
				
				
				ExtentTestManager.startTest(" TC016 - Verify 'Loan Arrears' Field");
				boolean EnerLoanArrears = Existing_Liability_Module.EnterLoanArrears(LoanArrears);
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate Loan Arrears field" + EnerLoanArrears);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter Numeric data:" + EnerLoanArrears);
				ExtentTestManager.getTest().log(Status.PASS," Accept numeric data:" + EnerLoanArrears);
				
				
				//TC017
				
				ExtentTestManager.startTest(" TC017 -Verify 'Security' Field");
				boolean EnerSecurityDetails = Existing_Liability_Module.EnterSecurity(Security);
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate Security field" + EnerSecurityDetails);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter AlphaNumeric data:" + EnerSecurityDetails);
				ExtentTestManager.getTest().log(Status.PASS," Accept AlphaNumeric data:" + EnerSecurityDetails);
				
				//TC018
				
				ExtentTestManager.startTest(" TC018 - Test 'Save as Draft' Button Functionality");
				boolean ClickSaveAsDraft = Existing_Liability_Module.ClickSaveAsDraft();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter several fields." + ClickSaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Click the 'Save as Draft' button.:" + ClickSaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS," Information is saved as draft, allowing return to main window.:" + ClickSaveAsDraft);
				
				//TC019
				
      			ExtentTestManager.startTest(" TC019 - Test 'Update and Proceed' Button Functionality");
				boolean ClickUpdateeAndProceeded = Existing_Liability_Module.ClicktoSaveAndProceed();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter several fields." + ClickUpdateeAndProceeded);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Click 'Save and Proceed'.:" + ClickUpdateeAndProceeded);
				ExtentTestManager.getTest().log(Status.PASS," Data submitted, and window redirects to the main window.:" + ClickUpdateeAndProceeded);
				
				//TC020
				
				ExtentTestManager.startTest(" TC020 -Verify 'Continue' Button Availability");
				boolean Clicktocontinue = Existing_Liability_Module.ClicktoContinue();
				ExtentTestManager.getTest().log(Status.PASS, "1. Locate the 'Continue' button." + Clicktocontinue);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Click the button.:" + Clicktocontinue);
				ExtentTestManager.getTest().log(Status.PASS," The button is visible and clickable, navigating to the next component.:" + Clicktocontinue);
				

				
				
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
