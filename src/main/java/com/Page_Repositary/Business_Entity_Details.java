package com.Page_Repositary;

import org.openqa.selenium.By;

public class Business_Entity_Details {

	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By scrolltoStep3 = By.xpath("//h4[normalize-space()='Step 3']");
	
	public By EntityAccess = By.xpath("//a[normalize-space()='3.2 Business Entity Details']");
	
	public By AddEntityButton = By.xpath("//button[text()='Add Business Entity']");
	
	public By EntityName = By.xpath("//label[@class='rz-dropdown-label rz-inputtext  rz-placeholder']");
	
	public By SelectEntityName  = By.xpath("//span[text()='KERALA INSTITUTE123']");
	
	public By DetailsOfActivity = By.xpath("//textarea[@placeholder='Details Of Present Activities']");
	
	public By Product = By.xpath("//input[@placeholder='Product /Service']");
	
	public By SelectProfit = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[1]");
	
	public By EnterNetProfit = By.xpath("//input[@placeholder='Net Profit(₹)']");
	
	public By AddExternalAccButton = By.xpath("//button[normalize-space()='Add External Account']");

	public By EnterIFSCCode = By.xpath("//input[@placeholder='IFSC Code']");

	public By ClickonBank = By.xpath("//label[text()='Bank']");

	public By BankName = By.xpath("//input[@title='STATE BANK OF INDIA']");

	public By AccountNo = By.xpath("//input[@placeholder='Account Number']");

	public By AddBankButton = By.xpath("//button[text()='Add Bank']");

	public By AddedBankDetails = By.xpath("(//span[@class='p-2'])[2]");

	public By YesforLiability = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[2]");

	public By AddLiabilityButton = By.xpath("//button[normalize-space()='Add Liability']");

	public By LiabilityCategory = By.xpath("(//label[text()='Liability Category']/parent::div)[1]");

	public By SelectLiabilityCategory = By.xpath("//span[text()='Applicant']");
	
	public By EnterOutstandingAmount = By.xpath("//input[@placeholder='Outstanding Balance(₹)']");
	
	public By EnterTenurePending = By.xpath("//input[@placeholder='Tenure pending']");
	
	public By Status = By.xpath("(//label[text()='Status Of Loan']/parent::div)[1]");

	public By SelectStatus = By.xpath("//span[text()='Standard']");
	
	public By AddLiabilityDetailsButton = By.xpath("//button[text()='Add Liabilities']");
	
	public By YesforCorporateGuarantee  = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[3]");
	
	public By AddCorporateGuaranteeButton = By.xpath("//button[normalize-space()='Add Corporate Guarantee']");

    public By EnterEntityName = By.xpath("//input[@placeholder='Entity Name']");
    
    public By EnterAmount = By.xpath("//input[@placeholder='Guarantee Amount(₹)']");
    
	public By AddDetailsButton = By.xpath("//button[text()='Add details']");

    public By AddedCorporateData = By.xpath("(//span[@class='p-2'])[3]");
    
    public By VentureCapitalist = By.xpath("//p[text()='Does The Entity Have Any Corporate Guarantee ?']");

	public By YesforVenture = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[4]");
	
	public By TermSheetSection = By.xpath("//p[text()='Term Sheet Received']/parent::div");
	
	public By YesforTermSheet = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[5]");
	
	public By CommittedAmount = By.xpath("//input[@placeholder='Committed Amount (₹)']");
	
	public By KeyCOndition = By.xpath("//textarea[@placeholder='Key Conditions / Milestones Set By VC']");
	
	public By AdditionalDetails = By.xpath("//textarea[@placeholder='Additional Details']");
	
	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By SavedData = By.xpath("//span[@class='p-2']");
	
	public By ProcessContinueButton = By.xpath("//button[normalize-space()='Continue']");


	
}
