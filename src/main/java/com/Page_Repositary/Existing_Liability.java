package com.Page_Repositary;

import org.openqa.selenium.By;

public class Existing_Liability {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By ExistingLiabilities = By.xpath("(//a[normalize-space()='1.3 Existing Liabilities'])[1]");
	
	public By Heading = By.xpath("//div[@id='form-main-heading-no-padding']");
	
	public By ExistingLiabilityContent = By.xpath("//div[@class='add-entrepreneur-message d-flex text-center justify-content-center flex-column p-4']");
	
	public By ScrolltoSkipforNow = By.xpath("//span[@class='d-flex justify-content-center']");
	
	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");
	
	public By AddLiabilityButton = By.xpath("//button[normalize-space()='Add Liabilities']");
	
	public By CancelButton = By.xpath("//button[normalize-space()='Cancel']");
	
	public By LiabilityCategory = By.xpath("//label[text()='Liability Category']/parent::div");
	
	public By SelectLiabilityCategory = By.xpath("//span[text()='Guarantees']");
	
	public By GuaranteeCompanyName = By.xpath("//input[@placeholder='Guarantee Company Name Test']");
	
	public By GuaranteeCompanyPanTest = By.xpath("//input[@placeholder='Guarantee Company Pan Test']");
	
	public By IFSCCode = By.xpath("//input[@placeholder='IFSC Code Test']");
	
	public By IFSCLabel = By.xpath("//label[normalize-space()='IFSC Code Test']");
	
	public By LoanPurpose = By.xpath("//label[text()='Loan Purpose']/parent::div");
	
	public By SelectLoanPurpose = By.xpath("//span[text()='Bussiness']");
	
	public By SanctionAmount = By.xpath("//input[@placeholder='Sanction Amount (₹)']");
	
	public By OutstandingBalance = By.xpath("//input[@placeholder='Outstanding Balance (₹)']");
	
	public By StatusofLoan = By.xpath("//label[text()='Status Of Loan']/parent::div");
	
	public By selectStatusofLoan = By.xpath("//span[text()='Standard']");
	
	public By LoanArrears = By.xpath("//input[@placeholder='Loan Arrears (₹)']");
	
	public By Security = By.xpath("//textarea[@placeholder='Security']");
	
	public By SaveAsDraft = By.xpath("//button[normalize-space()='Save as Draft']");
	
	public By clickonDraft = By.xpath("//a[normalize-space()='STATE BANK OF INDIA - 34,567.00']");
	
	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");
	
	public By UdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");
	
	public By ClickContinueButton = By.xpath("//button[normalize-space()='Continue']");
	
	

	
}
