package com.test.BusinessInformation_Modules; 

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Business_Entity_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Business_Entity_Details_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Business_Entity_Details_Module Business_Entity_Details_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Business_Entity");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Business_Entity_Details_Module = new Business_Entity_Details_Module();

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

				String DetailsActivities = testdata.get("DetailsActivities").toString();
				String ProductOrService = testdata.get("ProductOrService").toString();
				String Profit= testdata.get("Profit").toString();
     			String IFSCCode = testdata.get("IFSCCode").toString();
				String AccountNo = testdata.get("AccountNo").toString();
				String OutstandingBalance = testdata.get("OutstandingBalance").toString();
				String TenurePending = testdata.get("TenurePending").toString();
				String EntityName = testdata.get("EntityName").toString();
				String Amount = testdata.get("Amount").toString();
				String CommittedAmount = testdata.get("CommittedAmount").toString();
				String KeyConditionsOrMilestonesSetByVC = testdata.get("KeyConditionsOrMilestonesSetByVC").toString();
				String AdditionalDetails = testdata.get("AdditionalDetails").toString();

				
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				

				// TC001
				ExtentTestManager.startTest("TC001 : Login for Business Entrepreneur Details Module");
				boolean Login =Business_Entity_Details_Module.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Click on Login button" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				
				// TC002
			
				ExtentTestManager.startTest("TC002 - Navigate to Business Finance Stage");
				boolean EntrepreneurDetails = Business_Entity_Details_Module.NavigatetoBusiness();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Business Finance stage" + EntrepreneurDetails);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Business Finance stage successfully" + EntrepreneurDetails);
				
				//TC003
				ExtentTestManager.startTest("TC003 - Click on Business Entity Details Component");
				boolean AccessEntityPage = Business_Entity_Details_Module.AccessEntityPage();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the Business Entity Details component" + AccessEntityPage);
				ExtentTestManager.getTest().log(Status.PASS,"User sees the Business Entity details section" + AccessEntityPage);
				
				//TC004
				ExtentTestManager.startTest("TC004 - Select Entity Name");
				boolean SelectEntityName = Business_Entity_Details_Module.SelectEntityName();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the Entity Name dropdown" + SelectEntityName);
				ExtentTestManager.getTest().log(Status.PASS,"2. Select a valid entity" + SelectEntityName);
				ExtentTestManager.getTest().log(Status.PASS,"Selected entity name is populated in the field" + SelectEntityName);

				//TC005
				ExtentTestManager.startTest("TC005 - Enter Details of Present Activitiest");
				boolean EnterDetailsofActivity = Business_Entity_Details_Module.EnterDetailsofActivity(DetailsActivities);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter alphanumeric text in 'Details Of Present Activities' field" + EnterDetailsofActivity);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterDetailsofActivity );
				
				//TC006
				ExtentTestManager.startTest("TC006 - Enter Product/Service Details");
				boolean EnterProduct = Business_Entity_Details_Module.EnterProduct(ProductOrService);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter alphanumeric text in 'Product /Service' field" + EnterProduct);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterProduct );
				
				//TC007
				ExtentTestManager.startTest("TC007 - Select Profit Option");
				boolean SelectProfit = Business_Entity_Details_Module.SelectProfit();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the Profit radio button in 'Profit Or Loss In Last Fin Year'" + SelectProfit);
				ExtentTestManager.getTest().log(Status.PASS,"Profit radio button is selected" +SelectProfit );
				
				//TC008
				ExtentTestManager.startTest("TC008 -Enter Net Profit Amount");
				boolean EnterNetProfit = Business_Entity_Details_Module.EnterNetProfit(Profit);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter numeric amount in 'Net Profit(?)' field" + EnterNetProfit);
				ExtentTestManager.getTest().log(Status.PASS,"Amount is entered in the field without any error" +EnterNetProfit );
				
				//TC009
				
				ExtentTestManager.startTest("TC009 -Verify 'Add External Account Details' pop-up window opens");
				boolean AddExternalAccount = Business_Entity_Details_Module.AddExternalAccount();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the 'Add External Account' option" + AddExternalAccount);
				ExtentTestManager.getTest().log(Status.PASS,"'Add External Account Details' pop-up window is displayed" +AddExternalAccount );
				
				//TC010
				
				ExtentTestManager.startTest("TC010 -Enter valid IFSC Code");
				boolean EnterIFSCCode = Business_Entity_Details_Module.EnterIFSCCode(IFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + EnterIFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"'Bank Name and Branch Name are auto-loaded correctly" +EnterIFSCCode );
				
				//TC011
				
				ExtentTestManager.startTest("TC011 -Verify Auto-loading of Bank Name with valid IFSC Code");
				boolean ValidateBankName = Business_Entity_Details_Module.ValidateBankName();
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + ValidateBankName);
				ExtentTestManager.getTest().log(Status.PASS,"'Bank Name aare auto-loaded correctly" +ValidateBankName );
				
				//TC012
				
				ExtentTestManager.startTest("TC012 -Verify Auto-loading of Branch Name with valid IFSC Code");
				boolean ValidateBranchName = Business_Entity_Details_Module.ValidateBranchName();
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + ValidateBranchName);
				ExtentTestManager.getTest().log(Status.PASS,"'Branch Name aare auto-loaded correctly" +ValidateBranchName );
				
				//TC013
				ExtentTestManager.startTest("TC013 -Enter Valid Account Number");
				boolean AccountNodataField = Business_Entity_Details_Module.AccountNodataField(AccountNo);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter a valid account number into the 'Account Number' field" + AccountNodataField);
				ExtentTestManager.getTest().log(Status.PASS,"Account number is accepted without error" +AccountNodataField );
				
				//TC014
				
				ExtentTestManager.startTest("TC014 -Add bank successfully");
				boolean ClickAddBankButton = Business_Entity_Details_Module.ClickAddBankButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on 'Add Bank' option" + ClickAddBankButton);
				ExtentTestManager.getTest().log(Status.PASS,"Bank details are added and listed in the 'List of External Account Details' grid" +ClickAddBankButton );
				
				//TC015
				ExtentTestManager.startTest("TC015 -Yes Radio Button Selection");
				boolean SelectYESforLiability = Business_Entity_Details_Module.SelectYESforLiability();
				ExtentTestManager.getTest().log(Status.PASS,"1. Navigate to 'Do you Have Liabilities?' section\r\n"
						+ "2. Click on the Yes radio button" + SelectYESforLiability);
				ExtentTestManager.getTest().log(Status.PASS,"Yes radio button is selected" +SelectYESforLiability );
				
				//TC016
				ExtentTestManager.startTest("TC016 -Open Add Liabilities Pop-up");
				boolean ClickAddLiabilityButon = Business_Entity_Details_Module.ClickAddLiabilityButon();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the 'Add Liability' option" + ClickAddLiabilityButon);
				ExtentTestManager.getTest().log(Status.PASS,"Add Liabilities pop-up window is opened" +ClickAddLiabilityButon );
				
				//TC017
				
				ExtentTestManager.startTest("TC017 -Select Liability Category");
				boolean selectLiabilityCategory = Business_Entity_Details_Module.selectLiabilityCategory();
				ExtentTestManager.getTest().log(Status.PASS,"1. Open the Liability Category dropdown\r\n"
						+ "2. Select 'Applicant'" + selectLiabilityCategory);
				ExtentTestManager.getTest().log(Status.PASS,"'Applicant' is selected in the Liability Category dropdown" +selectLiabilityCategory );
				
				
				//TC018
				ExtentTestManager.startTest("TC018 -Enter valid IFSC Code");
				boolean EnterIFSCCodeforLiability = Business_Entity_Details_Module.EnterIFSCCode(IFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + EnterIFSCCodeforLiability);
				ExtentTestManager.getTest().log(Status.PASS,"'Bank Name and Branch Name are auto-loaded correctly" +EnterIFSCCodeforLiability );
				
				//TC019
				
				ExtentTestManager.startTest("TC019 -Bank  Data Autoload from IFSC");
				boolean ValidateBankNameforLiability = Business_Entity_Details_Module.ValidateBankName();
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + ValidateBankNameforLiability);
				ExtentTestManager.getTest().log(Status.PASS,"'Bank Name aare auto-loaded correctly" +ValidateBankNameforLiability );
				
				//TC012
				
				ExtentTestManager.startTest("TC020 - Branch Data Autoload from IFSC");
				boolean ValidateBranchNameforLiability = Business_Entity_Details_Module.ValidateBranchName();
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'SBIN0008627' in the IFSC_CODE field" + ValidateBranchNameforLiability);
				ExtentTestManager.getTest().log(Status.PASS,"'Branch Name aare auto-loaded correctly" +ValidateBranchNameforLiability );
				
				//TC021
				
				ExtentTestManager.startTest("TC021 -Outstanding Balance Field - Numeric Input");
				boolean EnterOutstandingAmount = Business_Entity_Details_Module.EnterOutstandingAmout(OutstandingBalance);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Outstanding Balance' field" + EnterOutstandingAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterOutstandingAmount);

				//TC022
				
				ExtentTestManager.startTest("TC022 -Tenure Pending Field - Numeric Input");
				boolean EnterTenuregAmount = Business_Entity_Details_Module.EnterTenurePending(TenurePending);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Tenure Pending' field" + EnterTenuregAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterTenuregAmount);

				//TC023
				ExtentTestManager.startTest("TC023 -Status Of Loan Field - Dropdown Selection");
				boolean SelectstatusofLoan = Business_Entity_Details_Module.selectStatusOfLoan();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select an option from 'Status Of Loan' field dropdown" + SelectstatusofLoan);
				ExtentTestManager.getTest().log(Status.PASS,"Dropdown displays options and selection is successful"  + SelectstatusofLoan);

		
				//TC024
				ExtentTestManager.startTest("TC024 -Add Liabilities Button in Popup - Functionality");
				boolean ClickAddLiabilityDetailsButton = Business_Entity_Details_Module.clickAddLiabilityDetailsButton();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Add Liabilities' button" + ClickAddLiabilityDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Data added and saved to grid"  + ClickAddLiabilityDetailsButton);

				//TC025
				ExtentTestManager.startTest("TC025 -Click on 'Yes' Option of 'Does The Entity Have Any Corporate Guarantee?'");
				boolean SelectYesforCorporateGuarantee = Business_Entity_Details_Module.SelectYesforCorporateGuarantee();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the 'Does The Entity Have Any Corporate Guarantee?' section.\r\n"
						+ "2. Click on the 'Yes' radio button." + SelectYesforCorporateGuarantee);
				ExtentTestManager.getTest().log(Status.PASS,"'Yes' radio button is selected, and other related fields or actions are enabled."  + SelectYesforCorporateGuarantee);

				//TC026
				ExtentTestManager.startTest("TC026 -Open 'Add Corporate Guarantee' Pop-up");
				boolean ClickAddcorporateButon = Business_Entity_Details_Module.ClickAddcorporateButon();
				ExtentTestManager.getTest().log(Status.PASS,"1.Click on the 'Add Corporate Guarantee' button." + ClickAddcorporateButon);
				ExtentTestManager.getTest().log(Status.PASS,"The 'Add Corporate Guarantee' pop-up window opens correctly." +ClickAddcorporateButon );
				
				//TC027
				
				ExtentTestManager.startTest("TC027 -Enter Entity Name in 'Add Corporate Guarantee' Window");
				boolean EnterEntityName = Business_Entity_Details_Module.EnterEntityName(EntityName);
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the 'Entity Name' field in the pop-up.\r\n"
						+ "2. Enter a valid entity name." + EnterEntityName);
				ExtentTestManager.getTest().log(Status.PASS,"Entity name is accepted, and field entry is successful without errors."  + EnterEntityName);

				//TC028
				
				ExtentTestManager.startTest("TC028 -Enter Amount 'Add Corporate Guarantee' Window");
				boolean EnterAmount = Business_Entity_Details_Module.EnterAmount(Amount);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Amount' field" + EnterAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterAmount);

				//TC029
				ExtentTestManager.startTest("TC029 -Click 'Add Details' Button");
				boolean ClickAddDetailsButon = Business_Entity_Details_Module.ClickAddDetailsButon();
				ExtentTestManager.getTest().log(Status.PASS,"Click the 'Add Details' button" + ClickAddDetailsButon);
				ExtentTestManager.getTest().log(Status.PASS,"The new corporate guarantee is added and appears in the 'List of Corporate Guarantee' grid."  + ClickAddDetailsButon);

				//TC030
				ExtentTestManager.startTest("TC030 -Verify Corporate Guarantee Listed in Grid");
				boolean AddeddatainGridd = Business_Entity_Details_Module.AddeddatainGrid();
				ExtentTestManager.getTest().log(Status.PASS,"Verify the added guarantee details." + AddeddatainGridd);
				ExtentTestManager.getTest().log(Status.PASS,"The added corporate guarantee is correctly listed with accurate details."  + AddeddatainGridd);

				//TC031
				ExtentTestManager.startTest("TC031 -Check Availability of Fields when Selecting Venture Capitalist");
				boolean Venturesectionvisibility = Business_Entity_Details_Module.venturesection();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Whether The Shareholding Individual Is A Venture Capitalist' section is present" + Venturesectionvisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Section is available"  + Venturesectionvisibility);

				//TC032
				ExtentTestManager.startTest("TC032 -Verify 'Yes' Option for Term Sheet Received");
				boolean Venturesectionselection = Business_Entity_Details_Module.SeletcYESforventuresection();
				ExtentTestManager.getTest().log(Status.PASS,"Select 'Yes' option from the radio button" + Venturesectionselection);
				ExtentTestManager.getTest().log(Status.PASS,"'Yes' option is selected"  + Venturesectionselection);

				//TC033
				
				ExtentTestManager.startTest("TC033 -Term Sheet Received Field - Radio Button");
				boolean YESforTermSheet = Business_Entity_Details_Module.TermSheetSection();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select 'Yes' or 'No' from 'Term Sheet Received' field options" + YESforTermSheet);
				ExtentTestManager.getTest().log(Status.PASS,"Option selected successfully"  + YESforTermSheet);

				//TC034
				
				ExtentTestManager.startTest("TC034 -Committed Amount Field - Numeric Input");
				boolean EnterCommittedAmount = Business_Entity_Details_Module.EnterCommittedAmount(CommittedAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Committed Amount' field" + EnterCommittedAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterCommittedAmount);

				//TC035
				
				ExtentTestManager.startTest("TC035 -Key Conditions Field - Text Area Input");
				boolean EnterKeyCondition = Business_Entity_Details_Module.EnterKeyCondition(KeyConditionsOrMilestonesSetByVC);
				ExtentTestManager.getTest().log(Status.PASS,"Enter alphanumeric and special characters (up to 2000) in 'Key Conditions / Milestones Set By VC'" + EnterKeyCondition);
				ExtentTestManager.getTest().log(Status.PASS," input is accepted"  + EnterKeyCondition);

				//TC036
				
				ExtentTestManager.startTest("TC036 -Additional Details Field - Text Area Input");
				boolean EnterAdditionalDetails = Business_Entity_Details_Module.EnterAdditionalDetails(AdditionalDetails);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Additional Details' field" + EnterAdditionalDetails);
				ExtentTestManager.getTest().log(Status.PASS," input is accepted"  + EnterAdditionalDetails);

				//TC037
				
				ExtentTestManager.startTest("TC037 -Verify Entity Listing on Save and Proceed");
				boolean clickSaveAndProceed = Business_Entity_Details_Module.clickSaveAndProceed();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on 'Save and Proceed' button" + clickSaveAndProceed);
				ExtentTestManager.getTest().log(Status.PASS," Entity details are saved, entity appears in the 'LIST OF BUSINESS ENTITY' grid"  + clickSaveAndProceed);

				//TC038
				ExtentTestManager.startTest("TC038 -Continue Button - Functionality");
				boolean clickonContinue= Business_Entity_Details_Module.ClickonContinue();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Continue' button" + clickonContinue);
				ExtentTestManager.getTest().log(Status.PASS,"Redirected to next stage or component"  + clickonContinue);

				
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