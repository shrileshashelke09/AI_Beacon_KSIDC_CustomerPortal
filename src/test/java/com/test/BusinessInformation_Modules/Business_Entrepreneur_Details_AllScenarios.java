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
				String NetProfit = testdata.get("NetProfit").toString();
				String IFSCCode = testdata.get("IFSCCode").toString();
				String AccountNo = testdata.get("AccountNo").toString();
				String OutstandingBalance = testdata.get("OutstandingBalance").toString();
				String TenurePending = testdata.get("TenurePending").toString();
				String CommittedAmount = testdata.get("CommittedAmount").toString();
				String KeyConditionsOrMilestonesSetByVC = testdata.get("KeyConditionsOrMilestonesSetByVC").toString();
				String AdditionalDetails = testdata.get("AdditionalDetails").toString();
				String Funds = testdata.get("Funds").toString();
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
				
				ExtentTestManager.startTest("TC020 - Company Name\" Field Visibility and Data Entry");
				boolean EnterCompanyName = Business_Entrepreneur_Details_Module.EnterCompanyName(CoampanyName);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterCompanyName);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Alpha Numeric characters in \"Company Name\" field"  + EnterCompanyName);
				ExtentTestManager.getTest().log(Status.PASS,"\"Company Name\" field is visible and accepts Alpha Numeric characters" + EnterCompanyName);
				
				//TC021
				
				ExtentTestManager.startTest("TC021 - \"Product/Service\" Field Visibility and Data Entry");
				boolean EnterProduct = Business_Entrepreneur_Details_Module.EnterProduct(Product);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterProduct);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Alpha Numeric characters in \"Product\" field"  + EnterProduct);
				ExtentTestManager.getTest().log(Status.PASS,"\"Product/Service\" field is visible and accepts Alpha Numeric characters" + EnterProduct);
				
				//TC022
				ExtentTestManager.startTest("TC022 - \"Extent of Funds Invested (?)\" Field Visibility and Data Entry");
				boolean Enterfundinvestment = Business_Entrepreneur_Details_Module.Enterfundinvestment(ExtentOfFundsInvested);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + Enterfundinvestment);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Numeric characters in \"Extent of Funds Invested\" field"  + Enterfundinvestment);
				ExtentTestManager.getTest().log(Status.PASS,"\"Extent of Funds Invested\" field is visible and accepts Numeric characters" + Enterfundinvestment);
				
				//TC023
				ExtentTestManager.startTest("TC023 - \"Percentage of Share Holding\" Field Visibility and Data Entry");
				boolean Entershareholding = Business_Entrepreneur_Details_Module.Entershareholding(PercentageShareholding);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + Entershareholding);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Numeric characters up to 100 in \"Percentage of Share Holding\" field"  + Entershareholding);
				ExtentTestManager.getTest().log(Status.PASS,"\"Percentage of Share Holding\" field is visible and accepts up to 100 Numeric characters" + Entershareholding);
				
				//TC024
				ExtentTestManager.startTest("TC024 - \"Profit/Loss ?\" Field Visibility and Option Selection");
				boolean profitlosssection = Business_Entrepreneur_Details_Module.ProfitLossSection();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + profitlosssection);
				ExtentTestManager.getTest().log(Status.PASS,"2. Select option from the \"Profit/Loss?\" radio button"  + profitlosssection);
				ExtentTestManager.getTest().log(Status.PASS,"\"Profit/Loss?\" field is visible and option can be selected" + profitlosssection);
				
				//TC025
				ExtentTestManager.startTest("TC025 - \"Net Loss(?)\" Field Visibility and Data Entry");
				boolean EnterNetLoss = Business_Entrepreneur_Details_Module.EnterNetLoss(NetLoss);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterNetLoss);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Numeric characters in \"Net Loss\" field"  + EnterNetLoss);
				ExtentTestManager.getTest().log(Status.PASS,"\"Net Loss\" field is visible and accepts Numeric characters" + EnterNetLoss);
				
				//TC026
				ExtentTestManager.startTest("TC026 - \"Add Company\" Button Functionality and Data Save");
				boolean AddCompanydetails = Business_Entrepreneur_Details_Module.Addcompanydetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Complete fields" + AddCompanydetails);
				ExtentTestManager.getTest().log(Status.PASS,"2. Click on \"Add Company\" button"  + AddCompanydetails);
				ExtentTestManager.getTest().log(Status.PASS,"Data is saved to the Company Details grid" + AddCompanydetails);
				
				//TC027
				
				ExtentTestManager.startTest("TC027 -Edit Company Details");
				boolean EditCompanydetails = Business_Entrepreneur_Details_Module.EditComapanyDetails(NetProfit);
				ExtentTestManager.getTest().log(Status.PASS,"1. Select a company" + EditCompanydetails);
				ExtentTestManager.getTest().log(Status.PASS,"2. Edit details"  + EditCompanydetails);
				ExtentTestManager.getTest().log(Status.PASS,"3. Save changes" + EditCompanydetails);
				ExtentTestManager.getTest().log(Status.PASS,"Company details can be edited and saved successfully" + EditCompanydetails);

				
				//TC028
				ExtentTestManager.startTest("TC028 -\"External Account Details\" Section Availability");
				boolean ExternalAccountSection = Business_Entrepreneur_Details_Module.ExternalAccSectionAvailability();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the window sections" + ExternalAccountSection);
				ExtentTestManager.getTest().log(Status.PASS,"\"External Account Details\" section is visible"  + ExternalAccountSection);
				
				//TC029
				ExtentTestManager.startTest("TC029 -Select \"Yes\" for External Account Details");
				boolean YesForExternalAccount = Business_Entrepreneur_Details_Module.selectYESforExternalAccount();
				ExtentTestManager.getTest().log(Status.PASS,"1. Select \"Yes\" option from the radio button" + YesForExternalAccount);
				ExtentTestManager.getTest().log(Status.PASS,"Radio button set to \"Yes\" and state is stored"  + YesForExternalAccount);
				
				//TC030
				
				ExtentTestManager.startTest("TC030 -Select \"Yes\" for External Account Details");
				boolean CheckAddBankAccButton = Business_Entrepreneur_Details_Module.AddBankAccountButtonvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the buttons after selecting \"Yes\"" + CheckAddBankAccButton);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Bank Account\" button is visible"  + CheckAddBankAccButton);
				
				//TC031
				
				ExtentTestManager.startTest("TC031 -\"Add Bank Account\" Button Functionality");
				boolean ClickAddBankAccButton = Business_Entrepreneur_Details_Module.clickAddBankAccountButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on \"Add Bank Account\" button" + ClickAddBankAccButton);
				ExtentTestManager.getTest().log(Status.PASS,"Redirects to \"Add External Account Details\" popup window"  + ClickAddBankAccButton);
				
				//TC032
				
				ExtentTestManager.startTest("TC032 -\"IFSC CODE\" Field Availability and Data Entry");
				boolean EnterIFSCCode = Business_Entrepreneur_Details_Module.EnterIFSCCode(IFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterIFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Alpha Numeric characters in \"IFSC CODE\" field"  + EnterIFSCCode);
				ExtentTestManager.getTest().log(Status.PASS,"\"IFSC CODE\" field is visible and accepts Alpha Numeric characters" + EnterIFSCCode);

				//TC033
				
				ExtentTestManager.startTest("TC033 -Bank  Data Autoload from IFSC");
				boolean ValidateBankName = Business_Entrepreneur_Details_Module.ValidateBankName();
				ExtentTestManager.getTest().log(Status.PASS,"1. View autoloaded data in \"Bank\"  fields after entering IFSC" + ValidateBankName);
				ExtentTestManager.getTest().log(Status.PASS,"\"Bank\" fields are auto-populated based on IFSC"  + ValidateBankName);

				//TC034
				
				ExtentTestManager.startTest("TC034 -Branch  Data Autoload from IFSC");
				boolean ValidateBranchName = Business_Entrepreneur_Details_Module.ValidateBranchName();
				ExtentTestManager.getTest().log(Status.PASS,"1. View autoloaded data in \"Branch\"  fields after entering IFSC" + ValidateBranchName);
				ExtentTestManager.getTest().log(Status.PASS,"\"Bank\" fields are auto-populated based on IFSC"  + ValidateBranchName);

				//TC035
				
				ExtentTestManager.startTest("TC035 -\"Account Number\" Field Availability and Data Entry");
				boolean EnterAccountNo = Business_Entrepreneur_Details_Module.AccountNodataField(AccountNo);
				ExtentTestManager.getTest().log(Status.PASS,"1. View the fields" + EnterAccountNo);
				ExtentTestManager.getTest().log(Status.PASS,"2. Enter Numeric characters in \"Account Number\" field"  + EnterAccountNo);
				ExtentTestManager.getTest().log(Status.PASS,"\"Account Number\" field is visible and accepts Numeric characters" + EnterAccountNo);

				//TC036
				ExtentTestManager.startTest("TC036 -\"Add Bank\" Button Visibility");
				boolean AddBankButtonVisibility = Business_Entrepreneur_Details_Module.AddBankAccountButtonvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"1. View the buttons on the window interface" + AddBankButtonVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Bank\" button is visible"  + AddBankButtonVisibility);

				//TC037
				ExtentTestManager.startTest("TC037 -Add Bank Details - Basic Functionality");
				boolean ClickAddBankButton = Business_Entrepreneur_Details_Module.ClickAddBankButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click Add Bank button" + ClickAddBankButton);
				ExtentTestManager.getTest().log(Status.PASS,"Bank details saved to grid"  + ClickAddBankButton);

				//TC038
				ExtentTestManager.startTest("TC038 -Added  Bank Details in grid");
				boolean ValidateBankDatainGrid = Business_Entrepreneur_Details_Module.ValidateBankDatainGrid();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check Added Bank Data" + ValidateBankDatainGrid);
				ExtentTestManager.getTest().log(Status.PASS,"Bank details saved to grid"  + ValidateBankDatainGrid);

				//TC039
				ExtentTestManager.startTest("TC039 -Liabilities Details Section Availability");
				boolean LiabilitySection = Business_Entrepreneur_Details_Module.Liabilitysection();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Liabilities Details' section is present" + LiabilitySection);
				ExtentTestManager.getTest().log(Status.PASS,"Section is available"  + LiabilitySection);

				//TC040
				
				ExtentTestManager.startTest("TC040 -Radio Button Selection - Yes Option");
				boolean SelectYesforLiabilitySection = Business_Entrepreneur_Details_Module.SelectYESforLiability();
				ExtentTestManager.getTest().log(Status.PASS,"Select 'Yes' option from the radio button" + SelectYesforLiabilitySection);
				ExtentTestManager.getTest().log(Status.PASS,"'Yes' option is selected"  + SelectYesforLiabilitySection);

				//TC041
				
				ExtentTestManager.startTest("TC041 -Add Liabilities Button - Visibility");
				boolean AddLiabilityButton = Business_Entrepreneur_Details_Module.AddLiabilityButon();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Add Liabilities' button is visible" + AddLiabilityButton);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + AddLiabilityButton);

				//TC042
				
				ExtentTestManager.startTest("TC042 -Add Liabilities Button - Functionality");
				boolean ClickAddLiabilityButton = Business_Entrepreneur_Details_Module.ClickAddLiabilityButon();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Add Liabilities' button" + ClickAddLiabilityButton);
				ExtentTestManager.getTest().log(Status.PASS,"Redirected to 'Add Liabilities Details' popup window"  + ClickAddLiabilityButton);

				//TC043
				ExtentTestManager.startTest("TC043 -Add Liabilities Details - Window Heading");
				boolean LiabilityHeading = Business_Entrepreneur_Details_Module.LiabilityHeading();
				ExtentTestManager.getTest().log(Status.PASS,"Check window heading" + LiabilityHeading);
				ExtentTestManager.getTest().log(Status.PASS,"Heading is correct"  + LiabilityHeading);

				//TC044
				ExtentTestManager.startTest("TC044 -Bank Field - Dropdown Selection");
				boolean SelectBank = Business_Entrepreneur_Details_Module.selectBank();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select an option from 'Bank' field dropdown" + SelectBank);
				ExtentTestManager.getTest().log(Status.PASS,"Dropdown displays options and selection is successful"  + SelectBank);

				//TC045
				ExtentTestManager.startTest("TC045 -Branch Field - Dropdown Selection");
				boolean SelectBranch = Business_Entrepreneur_Details_Module.selectBranch();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select an option from 'Branch' field dropdown" + SelectBranch);
				ExtentTestManager.getTest().log(Status.PASS,"Dropdown displays options and selection is successful"  + SelectBranch);

				//TC046
				ExtentTestManager.startTest("TC046 -Branch Field - Dropdown Selection");
				boolean SelectLiabilityCategory = Business_Entrepreneur_Details_Module.selectLiabilityCategory();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select an option from 'Liability Category' field dropdown" + SelectLiabilityCategory);
				ExtentTestManager.getTest().log(Status.PASS,"Dropdown displays options and selection is successful"  + SelectLiabilityCategory);

				//TC047
				ExtentTestManager.startTest("TC047 -Outstanding Balance Field - Numeric Input");
				boolean EnterOutstandingAmount = Business_Entrepreneur_Details_Module.EnterOutstandingAmout(OutstandingBalance);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Outstanding Balance' field" + EnterOutstandingAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterOutstandingAmount);

				//TC048
				
				ExtentTestManager.startTest("TC048 -Tenure Pending Field - Numeric Input");
				boolean EnterTenuregAmount = Business_Entrepreneur_Details_Module.EnterTenurePending(TenurePending);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Tenure Pending' field" + EnterTenuregAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterTenuregAmount);

				//TC049
				ExtentTestManager.startTest("TC049 -Status Of Loan Field - Dropdown Selection");
				boolean SelectstatusofLoan = Business_Entrepreneur_Details_Module.selectStatusOfLoan();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select an option from 'Status Of Loan' field dropdown" + SelectstatusofLoan);
				ExtentTestManager.getTest().log(Status.PASS,"Dropdown displays options and selection is successful"  + SelectstatusofLoan);

				//TC050
				ExtentTestManager.startTest("TC050-Add Liabilities Button in Popup - Visibility");
				boolean AddLiabilityDetailsButton = Business_Entrepreneur_Details_Module.AddLiabilityDetails();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Add Liabilities' button is visible" + AddLiabilityDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + AddLiabilityDetailsButton);

				//TC051
				ExtentTestManager.startTest("TC051 -Add Liabilities Button in Popup - Functionality");
				boolean ClickAddLiabilityDetailsButton = Business_Entrepreneur_Details_Module.clickAddLiabilityDetailsButton();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Add Liabilities' button" + ClickAddLiabilityDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Data added and saved to grid"  + ClickAddLiabilityDetailsButton);

				//TC052
				
				ExtentTestManager.startTest("TC052 -Edit Liabilities Details");
				boolean EditAddLiabilityDetails = Business_Entrepreneur_Details_Module.EditLiabilityDetails();
				ExtentTestManager.getTest().log(Status.PASS,"Edit Liability deyails" + EditAddLiabilityDetails);
				ExtentTestManager.getTest().log(Status.PASS,"Edited liabilities details saved"  + EditAddLiabilityDetails);

				//TC053
				ExtentTestManager.startTest("TC053 -Venture Capitalist Section Availability");
				boolean Venturesectionvisibility = Business_Entrepreneur_Details_Module.venturesection();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Whether The Shareholding Individual Is A Venture Capitalist' section is present" + Venturesectionvisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Section is available"  + Venturesectionvisibility);

				//TC054
				ExtentTestManager.startTest("TC054 -Radio Button Selection - Venture Capitalist Yes Option");
				boolean Venturesectionselection = Business_Entrepreneur_Details_Module.SeletcYESforventuresection();
				ExtentTestManager.getTest().log(Status.PASS,"Select 'Yes' option from the radio button" + Venturesectionselection);
				ExtentTestManager.getTest().log(Status.PASS,"'Yes' option is selected"  + Venturesectionselection);

				//TC055
				
				ExtentTestManager.startTest("TC055 -Term Sheet Received Field - Radio Button");
				boolean YESforTermSheet = Business_Entrepreneur_Details_Module.TermSheetSection();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select 'Yes' or 'No' from 'Term Sheet Received' field options" + YESforTermSheet);
				ExtentTestManager.getTest().log(Status.PASS,"Option selected successfully"  + YESforTermSheet);

				//TC056
				
				ExtentTestManager.startTest("TC056 -Committed Amount Field - Numeric Input");
				boolean EnterCommittedAmount = Business_Entrepreneur_Details_Module.EnterCommittedAmount(CommittedAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Committed Amount' field" + EnterCommittedAmount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted"  + EnterCommittedAmount);

				//TC057
				
				ExtentTestManager.startTest("TC057 -Key Conditions Field - Text Area Input");
				boolean EnterKeyCondition = Business_Entrepreneur_Details_Module.EnterKeyCondition(KeyConditionsOrMilestonesSetByVC);
				ExtentTestManager.getTest().log(Status.PASS,"Enter alphanumeric and special characters (up to 2000) in 'Key Conditions / Milestones Set By VC'" + EnterKeyCondition);
				ExtentTestManager.getTest().log(Status.PASS," input is accepted"  + EnterKeyCondition);

				//TC058
				
				ExtentTestManager.startTest("TC058 -Additional Details Field - Text Area Input");
				boolean EnterAdditionalDetails = Business_Entrepreneur_Details_Module.EnterAdditionalDetails(AdditionalDetails);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric data in 'Additional Details' field" + EnterAdditionalDetails);
				ExtentTestManager.getTest().log(Status.PASS," input is accepted"  + EnterAdditionalDetails);

				//TC059
				ExtentTestManager.startTest("TC059 -Fund Section Visibility");
				boolean FundSection = Business_Entrepreneur_Details_Module.FundSection();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Fund' section is visible" + FundSection);
				ExtentTestManager.getTest().log(Status.PASS," Section is visible"  + FundSection);

				//TC060
				
				ExtentTestManager.startTest("TC060 -Add Fund Button - Functionality");
				boolean AddFundButton = Business_Entrepreneur_Details_Module.AddFund();
				ExtentTestManager.getTest().log(Status.PASS,"Click on 'Add Fund' button" + AddFundButton);
				ExtentTestManager.getTest().log(Status.PASS,"Redirected to 'Add Extended Funds' popup window"  + AddFundButton);

				//TC061
				ExtentTestManager.startTest("TC061 -Add Extended Funds - Window Heading");
				boolean ExtentFundHeading = Business_Entrepreneur_Details_Module.FundHeading();
				ExtentTestManager.getTest().log(Status.PASS,"Verify window heading" + ExtentFundHeading);
				ExtentTestManager.getTest().log(Status.PASS,"Heading is correct"  + ExtentFundHeading);

				//TC062
				ExtentTestManager.startTest("TC062 -Extent of Funds Field - Selection");
				boolean ExtentFundselection= Business_Entrepreneur_Details_Module.AddExtentFund();
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to select data from 'Extent of Funds the Entrepreneur can Generate for a New Project'" + ExtentFundselection);
				ExtentTestManager.getTest().log(Status.PASS,"Selection selected successful"  + ExtentFundselection);

				//TC063
				ExtentTestManager.startTest("TC063 -Funds Field - Numeric Input");
				boolean EnterFund= Business_Entrepreneur_Details_Module.EnterExtentFund(Funds);
				ExtentTestManager.getTest().log(Status.PASS,"Enter numeric characters in 'Funds' field" + EnterFund);
				ExtentTestManager.getTest().log(Status.PASS,"Input is accepted"  + EnterFund);

				//TC064
				
				ExtentTestManager.startTest("TC064 -Add Funds Button - Visibility");
				boolean AddFundDetailsButton= Business_Entrepreneur_Details_Module.AddFundButton();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Add Funds' button is visible" + AddFundDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + AddFundDetailsButton);

				//TC065
				ExtentTestManager.startTest("TC065 -Add Funds Button - Functionality");
				boolean CLickAddFundDetailsButton= Business_Entrepreneur_Details_Module.ClickAddFundButton();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Add Funds' button" + CLickAddFundDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Funds are added successfully"  + CLickAddFundDetailsButton);

				//TC066
				
				ExtentTestManager.startTest("TC066 -Cancel Button - Visibility");
				boolean CancelButtonVisibility= Business_Entrepreneur_Details_Module.CancelButtonVisibility();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Cancel' button is visible" + CancelButtonVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + CancelButtonVisibility);

				//TC067
				
				ExtentTestManager.startTest("TC067 -Save As Draft Button - Visibility");
				boolean SaveAsDraftButtonVisibility= Business_Entrepreneur_Details_Module.SaveAsDraftButtonVisibility();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Save As Draft' button is visible" + SaveAsDraftButtonVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + SaveAsDraftButtonVisibility);

				//TC068
				
				ExtentTestManager.startTest("TC068 -Save And Proceed Button - Visibility");
				boolean SaveAndProceedButtonVisibility= Business_Entrepreneur_Details_Module.SaveAndProceedButtonVisibility();
				ExtentTestManager.getTest().log(Status.PASS,"Check if 'Save And proceed' button is visible" + SaveAndProceedButtonVisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + SaveAndProceedButtonVisibility);

				//TC069
				
				ExtentTestManager.startTest("TC069 -Save As Draft Button - Functionality");
				boolean ClickSaveAsDraftButton= Business_Entrepreneur_Details_Module.ClickSaveAsDraftButton();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Save as Draft' button" + ClickSaveAsDraftButton);
				ExtentTestManager.getTest().log(Status.PASS,"Data is saved as draft"  + ClickSaveAsDraftButton);

				//TC070
				
				ExtentTestManager.startTest("TC070 -Update and Proceed Button - Functionality");
				boolean ClickUpdateANdProceedButton= Business_Entrepreneur_Details_Module.clickUpdateeAndProceed();
				ExtentTestManager.getTest().log(Status.PASS,"Click 'Update and Proceed' button" + ClickUpdateANdProceedButton);
				ExtentTestManager.getTest().log(Status.PASS,"Data is saved, and process is finalized"  + ClickUpdateANdProceedButton);

				//TC071
				
				ExtentTestManager.startTest("TC071 -Draft and Final Save Verification");
				boolean Saveddata= Business_Entrepreneur_Details_Module.SavedDatainGrid();
				ExtentTestManager.getTest().log(Status.PASS,"Check data in grid after 'Save as Draft' and 'Save and Proceed'" + Saveddata);
				ExtentTestManager.getTest().log(Status.PASS,"Data appears correctly in grid"  + Saveddata);

				//TC072
				
				ExtentTestManager.startTest("TC072 -Continue Button - Visibility");
				boolean Continuebuttonvisibility= Business_Entrepreneur_Details_Module.Continuebuttonvisibility();
				ExtentTestManager.getTest().log(Status.PASS,"Check visibility of 'Continue' button" + Continuebuttonvisibility);
				ExtentTestManager.getTest().log(Status.PASS,"Button is visible"  + Continuebuttonvisibility);

				//TC073
				
				ExtentTestManager.startTest("TC073 -Continue Button - Functionality");
				boolean clickonContinue= Business_Entrepreneur_Details_Module.clickonContinue();
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