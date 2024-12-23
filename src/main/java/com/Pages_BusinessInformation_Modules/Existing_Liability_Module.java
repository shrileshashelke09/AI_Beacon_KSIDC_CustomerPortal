package com.Pages_BusinessInformation_Modules;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Existing_Liability;
import com.Utility.Log;

public class Existing_Liability_Module extends Base_Class {

	Existing_Liability Existing_Liability = new Existing_Liability();

	// TC001

	public boolean Login(String EnterEmailAddress, String EnterPassword) throws InterruptedException {

		click(Existing_Liability.LoginButton);
		Log.info("Login button Clicked" + Existing_Liability.LoginButton);
		Thread.sleep(2000);
		input(Existing_Liability.EnterEmailAddress, EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Existing_Liability.EnterPassword, EnterPassword);
		Log.info(EnterPassword);
		click(Existing_Liability.ClicktoLogin);
		Log.info("Login button clickd" + Existing_Liability.ClicktoLogin);
		Thread.sleep(5000);
		click(Existing_Liability.ContinueButton);
		Thread.sleep(5000);
		return true;

	}

	// TC002

	public boolean ClickExistingLiability() throws InterruptedException {

		click(Existing_Liability.ExistingLiabilities);
		Log.info("Existing Liabilities option clicked" + Existing_Liability.ExistingLiabilities);
		return true;
	}

	// TC003

	public boolean Heading() {

		ElementDisplayed(Existing_Liability.Heading);
		Log.info("Header Displayed");
		return true;
	}

	// TC004

	public boolean DisplayContent() {

		ElementDisplayed(Existing_Liability.ExistingLiabilityContent);
		Log.info("Content shown" + Existing_Liability.ExistingLiabilityContent);
		return true;

	}

	// TC005

	public boolean ValidateSkipForNow() throws InterruptedException {
       ScrollUntilElementVisible(Existing_Liability.Heading);
		ElementDisplayed(Existing_Liability.SkipForNow);
		Log.info("Skip for now displayed" + Existing_Liability.SkipForNow);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Existing_Liability.ScrolltoSkipforNow);
		Thread.sleep(1000);
		click(Existing_Liability.SkipForNow);
		Log.info("Skip for Now Clicked" + Existing_Liability.SkipForNow);
		return true;
	}

	// TC006
	
	

		public boolean ClickonAddLiabilityButton() throws InterruptedException {
			click(Existing_Liability.ExistingLiabilities);
			ElementDisplayed(Existing_Liability.AddLiabilityButton);
			Log.info("Add Liability button displayed" + Existing_Liability.AddLiabilityButton);
			Thread.sleep(1000);
			click(Existing_Liability.AddLiabilityButton);
			Log.info("The button is visible and clickable, redirecting to the 'Add Liabilities' section.");
			return true;
		}
		//TC007
	public boolean ClickonCancelButton() throws InterruptedException {
		//click(Existing_Liability.AddLiabilityButton);
        ScrollUntilElementVisible(Existing_Liability.LoanPurpose);
		ElementDisplayed(Existing_Liability.CancelButton);
		Log.info("Cancel button displayed" + Existing_Liability.CancelButton);
		Thread.sleep(1000);
		click(Existing_Liability.CancelButton);
		Log.info("The window redirects to the main window without saving changes.");
		return true;
	}
	
	

	// TC008

	public boolean SelectLiabilityCategory() throws InterruptedException {
		click(Existing_Liability.AddLiabilityButton);
		Thread.sleep(1000);
		ElementDisplayed(Existing_Liability.LiabilityCategory);
		Log.info("Liability Category displayed" + Existing_Liability.LiabilityCategory);
		click(Existing_Liability.LiabilityCategory);
		Log.info("Liability dropdown open" + Existing_Liability.LiabilityCategory);
		Thread.sleep(1000);
		click(Existing_Liability.SelectLiabilityCategory);
		Log.info("Option selected for Liability Category");
		return true;
	}

	// TC009

	public boolean ENterGuaranteeCompanyName(String GuaranteeCompanyName) throws InterruptedException {

		ElementDisplayed(Existing_Liability.GuaranteeCompanyName);
		Log.info("guarantee company name field displayed" + Existing_Liability.GuaranteeCompanyName);
		input(Existing_Liability.GuaranteeCompanyName, GuaranteeCompanyName);
		Thread.sleep(2000);
		Log.info(GuaranteeCompanyName);
		return true;
	}

	// TC010

	public boolean ENterGuaranteeCompanyNamePANTest(String GuaranteeCompanyPanTest) throws InterruptedException {
		ElementDisplayed(Existing_Liability.GuaranteeCompanyPanTest);
		Log.info("guarantee company PAN field displayed" + Existing_Liability.GuaranteeCompanyPanTest);
		input(Existing_Liability.GuaranteeCompanyPanTest, GuaranteeCompanyPanTest);
		Thread.sleep(1000);
		Log.info(GuaranteeCompanyPanTest);
		return true;
	}

	// TC011

	public boolean ENterIFSCCode(String IFSCCode) throws InterruptedException {
		ElementDisplayed(Existing_Liability.IFSCCode);
		Log.info("IFSC field displayed" + Existing_Liability.IFSCCode);
		input(Existing_Liability.IFSCCode, IFSCCode);
		Thread.sleep(1000);
		Log.info(IFSCCode);
		click(Existing_Liability.IFSCLabel);
		Thread.sleep(10000);
		ScrollUntilElementVisible(Existing_Liability.IFSCLabel);
		return true;
	}
	
	//TC012
	
	public boolean selectLoanPurpose () throws InterruptedException {
		
		ElementDisplayed(Existing_Liability.LoanPurpose);
		Thread.sleep(1000);
		click(Existing_Liability.LoanPurpose);
		Thread.sleep(1000);
		click(Existing_Liability.SelectLoanPurpose);
		Thread.sleep(1000);
		Log.info("Loan purpose selected" + Existing_Liability.SelectLoanPurpose);
		return true;
	}
	
	//TC013
	
	public boolean EntersanctionAmount (String SanctionAmount) throws InterruptedException {
		
		ElementDisplayed(Existing_Liability.SanctionAmount);
		Log.info("Sanction Amount field displayed" + Existing_Liability.SanctionAmount);
		input (Existing_Liability.SanctionAmount , SanctionAmount);
		Thread.sleep(1000);
		Log.info(SanctionAmount);
		return true;
		
	}
	
	//TC014
	
	public boolean EnterOutstandingAmount(String OutstandingBalance) throws InterruptedException {

		ElementDisplayed(Existing_Liability.OutstandingBalance);
		Log.info("Outstanding Balance Amount field displayed" + Existing_Liability.OutstandingBalance);
		input(Existing_Liability.OutstandingBalance, OutstandingBalance);
		Thread.sleep(1000);
		Log.info(OutstandingBalance);
		return true;

	}
	
	//TC015
	public boolean SelectStatusOfLoan() throws InterruptedException {

		ElementDisplayed(Existing_Liability.StatusofLoan);
		Log.info("Outstanding Balance Amount field displayed" + Existing_Liability.StatusofLoan);
		click(Existing_Liability.StatusofLoan);
		Thread.sleep(1000);
		click(Existing_Liability.selectStatusofLoan);
		Thread.sleep(1000);
		Log.info("Status of Loan selected" + Existing_Liability.StatusofLoan);
		return true;

	}
	
	//TC016
	
	public boolean EnterLoanArrears(String LoanArrears) throws InterruptedException {

		ElementDisplayed(Existing_Liability.LoanArrears);
		Log.info("Loan Arrears field displayed" + Existing_Liability.LoanArrears);
		input(Existing_Liability.LoanArrears, LoanArrears);
		Thread.sleep(1000);
		Log.info(LoanArrears);
		return true;

	}
	
	//TC017
	
	public boolean EnterSecurity(String Security) throws InterruptedException {

		ElementDisplayed(Existing_Liability.Security);
		Log.info("Loan Arrears field displayed" + Existing_Liability.Security);
		input(Existing_Liability.Security, Security);
		Thread.sleep(1000);
		Log.info(Security);
		return true;

	} 
	
	//TC018
	
	public boolean ClickSaveAsDraft () throws InterruptedException {
		
		click(Existing_Liability.SaveAsDraft);
		Log.info("Information is saved as draft, allowing return to main window.");
		return true;
	}
	
	//TC019
	
	public boolean ClicktoSaveAndProceed () throws InterruptedException {
		click(Existing_Liability.clickonDraft);
		ScrollUntilElementVisible(Existing_Liability.IFSCLabel);
		Thread.sleep(1000);
		//click(Existing_Liability.SaveAndProceed);
		click(Existing_Liability.UdateAndProceed);
		Log.info("Save and Proceeded" + Existing_Liability.SaveAndProceed);
		return true;
	}
	//TC020
	
	public boolean ClicktoContinue () throws InterruptedException {
		ScrollUntilElementVisible(Existing_Liability.clickonDraft);
		Thread.sleep(1000);
		ElementDisplayed(Existing_Liability.ClickContinueButton);
		click(Existing_Liability.ClickContinueButton);
		Log.info("Continue button clicked" + Existing_Liability.ClickContinueButton);
		return true;
	}
}
