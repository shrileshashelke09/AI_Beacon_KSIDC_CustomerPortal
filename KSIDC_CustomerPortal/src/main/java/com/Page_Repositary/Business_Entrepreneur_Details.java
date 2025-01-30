package com.Page_Repositary;

import org.openqa.selenium.By;

public class Business_Entrepreneur_Details {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By BusinessEnterheader = By.xpath("//h4[text()='Business Entrepreneur Details']");

	public By MainText = By.xpath("//span[@class='d-flex justify-content-center flex-wrap']");

	public By SkipforNow = By.xpath("//span[text()='Skip this for now']");

	public By NextComp = By.xpath("//h4[text()='Business Entity Details']");

	public By accessbusinessenterpreneur = By.xpath("//a[normalize-space()='3.1 Business Entrepreneurs Details']");

	public By AddEnterpreneurButton = By.xpath("//button[normalize-space()='Add Entrepreneur Details']");

	public By EnerpreneurName = By.xpath("//label[text()='Entrepreneur Name']/parent::div");

	public By SelectEnterpreneurName = By.xpath("//span[text()='KIA ABC DERF']");

	public By EnterDetailsofActivity = By.xpath("//textarea[@placeholder='Details Of Present Activities']");

	public By EnterNetworth = By.xpath("//input[@placeholder='Net Worth (₹)']");

	public By EnterLaseyearincome = By.xpath("//input[@placeholder='Last Fin Year Total Income (₹)']");

	public By EnterFunds = By.xpath("//input[@placeholder='Funds']");

	public By ITRYes = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[1]");

	public By ManagingOherCompany = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[2]");

	public By AddCompanyButton = By.xpath("//a[normalize-space()='Add Company']");

	public By EnterCompanyName = By.xpath("//input[@placeholder='Company Name']");

	public By EnterProduct = By.xpath("//input[@placeholder='Product /Service']");

	public By Enterfundinvestment = By.xpath("//input[@placeholder='Extent of Funds Invested(₹)']");

	public By Entershareholding = By.xpath("//input[@placeholder='Percentage of Share Holding']");

	public By EnterNetLoss = By.xpath("//input[@placeholder='Net Loss(₹)']");

	public By AddComapnyDetails = By.xpath("//button[text()='Add Company']");

	public By ProfitLoss = By.xpath("//p[text()='Profit/Loss ?']/parent::div");

	public By Profit = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[1]");

	public By Loss = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[1]");

	public By AddedCompanyDetails = By.xpath("(//span[@class='p-2'])[1]");

	public By EnterNetProfit = By.xpath("//input[@placeholder='Net Profit(₹)']");

	public By ExternalAccSection = By.xpath("//p[text()='External Account Details']");

	public By YesforExternalAcc = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[3]");

	public By AddBankAccButton = By.xpath("//a[normalize-space()='Add Bank Account']");

	public By EnterIFSCCode = By.xpath("//input[@placeholder='IFSC Code']");

	public By ClickonBank = By.xpath("//label[text()='Bank']");

	public By BankName = By.xpath("//input[@title='STATE BANK OF INDIA']");

	public By AccountNo = By.xpath("//input[@placeholder='Account Number']");

	public By AddBankButton = By.xpath("//button[text()='Add Bank']");

	public By AddedBankDetails = By.xpath("(//span[@class='p-2'])[2]");

	public By Liabilitysection = By.xpath("//p[text()='Liabilities Details']");

	public By YesforLiability = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[4]");

	public By AddLiabilityButton = By.xpath("//a[normalize-space()='Add Liabilities']");

	public By LiabilityHeading = By.xpath("//div[text()='Add Liabilities Details']");

	public By Bank = By.xpath("(//label[text()='Bank']/parent::div)[1]");

	public By SelectBank = By.xpath("//span[text()='SHRI CHHATRAPATI RAJASHRI SHAHU URBAN COOPERATIVE BANK LIMITED']");

	public By Branch = By.xpath("(//label[text()='Branch']/parent::div)[1]");

	public By SelectBranch = By.xpath("//span[text()='AMRAVATI']");
	
	public By LiabilityCategory = By.xpath("(//label[text()='Liability Category']/parent::div)[1]");

	public By SelectLiabilityCategory = By.xpath("//span[text()='Co-applicant']");
	
	public By EnterOutstandingAmount = By.xpath("//input[@placeholder='Outstanding Balance(₹)']");
	
	public By EnterTenurePending = By.xpath("//input[@placeholder='Tenure pending']");
	
	public By Status = By.xpath("(//label[text()='Status Of Loan']/parent::div)[1]");

	public By SelectStatus = By.xpath("//span[text()='Standard']");
	
	public By AddLiabilityDetailsButton = By.xpath("//button[text()='Add Liabilities']");
	
	public By AddedLiabilityDetails = By.xpath("(//span[@class='p-2'])[3]");

	public By editStatus = By.xpath("//span[text()='SMA']");

	public By VentureCapitalist = By.xpath("//p[text()='Whether The Shareholding Individual Is A Venture Capitalist']");

	public By YesforVenture = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[5]");
	
	public By TermSheetSection = By.xpath("//p[text()='Term Sheet Received']/parent::div");
	
	public By YesforTermSheet = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[6]");
	
	public By CommittedAmount = By.xpath("//input[@placeholder='Committed Amount (₹)']");
	
	public By KeyCOndition = By.xpath("//textarea[@placeholder='Key Conditions / Milestones Set By VC']");
	
	public By AdditionalDetails = By.xpath("//textarea[@placeholder='Additional Details']");
	
	public By AddFund = By.xpath("//a[normalize-space()='Add Funds']");
	
	public By FundHeadeing = By.xpath("//div[text()='Add Extended Funds']");
	
	public By ExtentOfFund = By.xpath("(//label[@class='rz-dropdown-label rz-inputtext  rz-placeholder'])[1]");
	
	public By SelectExtentOfFund = By.xpath("//span[text()='Associates']");
	
	public By EnterExtentFunds = By.xpath("//input[@placeholder='Funds(₹)']");
	
	public By AddFundDetails = By.xpath("//button[text()='Add Funds']");
	
	public By CancelButton = By.xpath("//a[text()='Cancel']");

	public By SaveAsDraft = By.xpath("//a[text()='Save as Draft']");

	public By SaveAndProceed = By.xpath("//button[text()='Save and Proceed']");
	
	public By DraftedData = By.xpath("//span[@class='p-2']");

	public By UpdateAndProceed = By.xpath("//button[text()='Update and Proceed']");
	
	public By ProcessContinueButton = By.xpath("//button[normalize-space()='Continue']");


}
