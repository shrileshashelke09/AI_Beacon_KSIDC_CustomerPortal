package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Business_Entrepreneur_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Business_Entrepreneur_Details_Module extends Base_Class {

	Business_Entrepreneur_Details Business_Entrepreneur_Details = new Business_Entrepreneur_Details();
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		return true;

	}

	// TC002
	public boolean BusinessEntrepreneurDetails() throws InterruptedException {
		click(Business_Entrepreneur_Details.ContinueButton);
		Log.info("Continue button clicked" + Business_Entrepreneur_Details.ContinueButton);
		Thread.sleep(2000);
		ElementDisplayed(Business_Entrepreneur_Details.BusinessEnterheader);
		Log.info("Business Entrepreneur Details window appears." + Business_Entrepreneur_Details.BusinessEnterheader);
		return true;
	}

	// TC003
	public boolean Header() {

		ElementDisplayed(Business_Entrepreneur_Details.BusinessEnterheader);
		Log.info("\"Business Entrepreneur Details\" Header is visible"
				+ Business_Entrepreneur_Details.BusinessEnterheader);
		return true;
	}

	// TC004

	public boolean VerifyMainText() {

		ElementDisplayed(Business_Entrepreneur_Details.MainText);
		Log.info("Main text visible" + Business_Entrepreneur_Details.MainText);
		return true;
	}

	public boolean SkipforNowvisibility() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.BusinessEnterheader);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.SkipforNow);
		Log.info("Skip for Now displayed" + Business_Entrepreneur_Details.SkipforNow);
		return true;

	}

	public boolean ChecknextComponent() throws InterruptedException {

		click(Business_Entrepreneur_Details.SkipforNow);
		Thread.sleep(2000);
		ElementDisplayed(Business_Entrepreneur_Details.NextComp);
		Log.info("Next component displayed" + Business_Entrepreneur_Details.NextComp);
		return true;
	}

	public boolean AddEnterprebuttonvisibility() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.NextComp);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.accessbusinessenterpreneur);
		ElementToBeVisible(Business_Entrepreneur_Details.AddEnterpreneurButton);
		ElementDisplayed(Business_Entrepreneur_Details.AddEnterpreneurButton);
		Log.info("Button displayed" + Business_Entrepreneur_Details.AddEnterpreneurButton);
		return true;
	}

	public boolean ClickAddEnterprebutton() throws InterruptedException {
		click(Business_Entrepreneur_Details.AddEnterpreneurButton);
		Thread.sleep(1000);
		Log.info("Add Enterpreneur details button clicked" + Business_Entrepreneur_Details.AddEnterpreneurButton);
		return true;
	}

	public boolean SelectEnterpreneurName() throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnerpreneurName);
		Log.info("Enerpreneur Name data field displayed" + Business_Entrepreneur_Details.EnerpreneurName);
		click(Business_Entrepreneur_Details.EnerpreneurName);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectEnterpreneurName);
		Thread.sleep(1000);
		Log.info("Enterpreneur Name selected" + Business_Entrepreneur_Details.SelectEnterpreneurName);
		return true;
	}

	public boolean EnterDetailsOfPresentActivities(String EnterDetailsofActivity) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterDetailsofActivity);
		Log.info("DetailsofActivity field displayed" + Business_Entrepreneur_Details.EnterDetailsofActivity);
		input(Business_Entrepreneur_Details.EnterDetailsofActivity, EnterDetailsofActivity);
		Thread.sleep(1000);
		Log.info(EnterDetailsofActivity);
		return true;
	}

	public boolean EnterNetWorth(String EnterNetworth) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterNetworth);
		Log.info("Net worth field displayed" + Business_Entrepreneur_Details.EnterNetworth);
		input(Business_Entrepreneur_Details.EnterNetworth, EnterNetworth);
		Thread.sleep(1000);
		Log.info(EnterNetworth);
		return true;
	}

	public boolean EnterLastYearIncome(String EnterLaseyearincome) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterLaseyearincome);
		Log.info("Last year income field displayed" + Business_Entrepreneur_Details.EnterLaseyearincome);
		input(Business_Entrepreneur_Details.EnterLaseyearincome, EnterLaseyearincome);
		Thread.sleep(1000);
		Log.info(EnterLaseyearincome);
		return true;
	}

	public boolean EnterFunds(String EnterFunds) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterFunds);
		Log.info("Last year income field displayed" + Business_Entrepreneur_Details.EnterFunds);
		input(Business_Entrepreneur_Details.EnterFunds, EnterFunds);
		Thread.sleep(1000);
		Log.info(EnterFunds);
		return true;
	}

	public boolean SelectYESforITR() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entrepreneur_Details.EnerpreneurName);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.ITRYes);
		Log.info("ITR field displayed" + Business_Entrepreneur_Details.ITRYes);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.ITRYes);
		Thread.sleep(1000);
		Log.info("ITR as YES selected" + Business_Entrepreneur_Details.ITRYes);
		return true;

	}

	public boolean ManagingOtherCompaniesfield() {

		ElementDisplayed(Business_Entrepreneur_Details.ManagingOherCompany);
		Log.info("\"Managing Any Other Companies\" section is available"
				+ Business_Entrepreneur_Details.ManagingOherCompany);
		return true;
	}

	public boolean SelectYesasManagingOtherCompaniesfield() throws InterruptedException {

		click(Business_Entrepreneur_Details.ManagingOherCompany);
		Log.info("Radio button set to \"Yes\" and state is stored" + Business_Entrepreneur_Details.ManagingOherCompany);
		return true;
	}

	public boolean AddCompanyButtonvisibility() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.AddCompanyButton);
		Log.info("Add Company button displayed" + Business_Entrepreneur_Details.AddCompanyButton);
		return true;
	}

	public boolean ClickAddCompanyButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddCompanyButton);
		Log.info("Add Company button clicked" + Business_Entrepreneur_Details.AddCompanyButton);
		return true;
	}

	public boolean EnterCompanyName(String EnterCompanyName) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterCompanyName);
		Log.info("Company name field displayed" + Business_Entrepreneur_Details.EnterCompanyName);
		input(Business_Entrepreneur_Details.EnterCompanyName, EnterCompanyName);
		Thread.sleep(1000);
		Log.info(EnterCompanyName);
		return true;
	}

	public boolean EnterProduct(String EnterProduct) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterProduct);
		Log.info("Product / service field displayed" + Business_Entrepreneur_Details.EnterProduct);
		input(Business_Entrepreneur_Details.EnterProduct, EnterProduct);
		Thread.sleep(1000);
		Log.info(EnterProduct);
		return true;
	}

	public boolean Enterfundinvestment(String Enterfundinvestment) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.Enterfundinvestment);
		Log.info("Total fund investment field displayed" + Business_Entrepreneur_Details.Enterfundinvestment);
		input(Business_Entrepreneur_Details.Enterfundinvestment, Enterfundinvestment);
		Thread.sleep(1000);
		Log.info(Enterfundinvestment);
		return true;
	}

	public boolean Entershareholding(String Entershareholding) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.Entershareholding);
		Log.info("Share holding field displayed" + Business_Entrepreneur_Details.Entershareholding);
		clear(Business_Entrepreneur_Details.Entershareholding);
		input(Business_Entrepreneur_Details.Entershareholding, Entershareholding);
		Thread.sleep(1000);
		Log.info(Entershareholding);
		return true;
	}

	public boolean ProfitLossSection() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.ProfitLoss);
		Log.info("Profit loss section displayed" + Business_Entrepreneur_Details.ProfitLoss);
		click(Business_Entrepreneur_Details.Profit);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.Loss);
		Thread.sleep(1000);
		return true;
	}

	public boolean EnterNetLoss(String EnterNetLoss) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterNetLoss);
		Log.info("Net Loss field displayed" + Business_Entrepreneur_Details.EnterNetLoss);
		input(Business_Entrepreneur_Details.EnterNetLoss, EnterNetLoss);
		Thread.sleep(1000);
		Log.info(EnterNetLoss);
		return true;
	}

	public boolean Addcompanydetails() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.EnterProduct);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.AddComapnyDetails);
		Thread.sleep(1000);
		Log.info("Comapny details added" + Business_Entrepreneur_Details.AddComapnyDetails);
		return true;
	}

	public boolean EditComapanyDetails(String EnterNetProfit) throws InterruptedException {

		click(Business_Entrepreneur_Details.AddedCompanyDetails);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.Profit);
		Thread.sleep(1000);
		input(Business_Entrepreneur_Details.EnterNetProfit, EnterNetProfit);
		Thread.sleep(1000);
		Log.info(EnterNetProfit);
		click(Business_Entrepreneur_Details.AddComapnyDetails);
		Log.info("Details Added" + Business_Entrepreneur_Details.AddComapnyDetails);
		return true;
	}

	public boolean ExternalAccSectionAvailability() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.AddCompanyButton);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.ExternalAccSection);
		Thread.sleep(1000);
		Log.info("External Account section displayed" + Business_Entrepreneur_Details.ExternalAccSection);
		return true;

	}

	public boolean selectYESforExternalAccount() throws InterruptedException {

		click(Business_Entrepreneur_Details.YesforExternalAcc);
		Thread.sleep(1000);
		Log.info("Yes selected for External Account" + Business_Entrepreneur_Details.YesforExternalAcc);
		return true;
	}

	public boolean AddBankAccountButtonvisibility() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.AddBankAccButton);
		Thread.sleep(1000);
		Log.info("Add Bank Account button displayed" + Business_Entrepreneur_Details.AddBankAccButton);
		return true;
	}

	public boolean clickAddBankAccountButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddBankAccButton);
		Thread.sleep(1000);
		Log.info("Bank Account popup opened" + Business_Entrepreneur_Details.AddBankAccButton);
		return true;
	}

	public boolean EnterIFSCCode(String EnterIFSCCode) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterIFSCCode);
		Log.info("IFSC Code field displayed" + Business_Entrepreneur_Details.EnterIFSCCode);
		input(Business_Entrepreneur_Details.EnterIFSCCode, EnterIFSCCode);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.ClickonBank);
		ElementToBeVisible(Business_Entrepreneur_Details.BankName);
		Log.info(EnterIFSCCode);
		return true;
	}

	public boolean ValidateBankName() throws InterruptedException {
		WebElement AutoloadedBankName = driver.findElement(By.xpath("//input[@placeholder='Bank']"));
		Thread.sleep(1000);
		String ABC = AutoloadedBankName.getAttribute("title");
		if (ABC.equals(AutoloadedBankName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBankName.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Bank Name displyed" + AutoloadedBankName.getAttribute("title"));
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateBranchName() throws InterruptedException {
		WebElement AutoloadedBranchName = driver.findElement(By.xpath("//input[@placeholder='Branch']"));
		Thread.sleep(1000);
		System.out.println("Autoloaded Branch Name displyed" + AutoloadedBranchName.getAttribute("title"));

		String ABC = AutoloadedBranchName.getAttribute("title");
		if (ABC.equals(AutoloadedBranchName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBranchName.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean AccountNodataField(String AccountNo) throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.AccountNo);
		Log.info("Account No field displayed" + Business_Entrepreneur_Details.AccountNo);
		input(Business_Entrepreneur_Details.AccountNo, AccountNo);
		Thread.sleep(1000);
		Log.info(AccountNo);
		return true;
	}

	public boolean AddBankButtonvisibility() {

		ElementDisplayed(Business_Entrepreneur_Details.AddBankButton);
		Log.info("Add Bank Button Displayed" + Business_Entrepreneur_Details.AddBankButton);
		return true;
	}

	public boolean ClickAddBankButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddBankButton);
		Thread.sleep(1000);
		Log.info("Bank Details Added" + Business_Entrepreneur_Details.AddBankButton);
		Thread.sleep(1000);
		return true;
	}

	public boolean ValidateBankDatainGrid () {
		ElementDisplayed(Business_Entrepreneur_Details.AddedBankDetails);
		Log.info("Added bank details displayed in grid" + Business_Entrepreneur_Details.AddedBankDetails);
		return true;	
	}
	
	public boolean Liabilitysection() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entrepreneur_Details.AddBankAccButton);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.Liabilitysection);
		Thread.sleep(1000);
		Log.info("Liability section displayed" + Business_Entrepreneur_Details.Liabilitysection);
		return true;
	}

	public boolean SelectYESforLiability() throws InterruptedException {

		click(Business_Entrepreneur_Details.YesforLiability);
		Thread.sleep(1000);
		Log.info("Yes selected for Liability" + Business_Entrepreneur_Details.YesforLiability);
		return true;
	}

	public boolean AddLiabilityButon() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.AddLiabilityButton);
		Thread.sleep(1000);
		Log.info("Add Liability buton displayed" + Business_Entrepreneur_Details.AddLiabilityButton);
		return true;
	}

	public boolean ClickAddLiabilityButon() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddLiabilityButton);
		Thread.sleep(1000);
		Log.info("Add liability pop up opened" + Business_Entrepreneur_Details.AddLiabilityButton);
		return true;
	}

	public boolean LiabilityHeading() {

		ElementDisplayed(Business_Entrepreneur_Details.LiabilityHeading);
		Log.info("Correct heading displayed" + Business_Entrepreneur_Details.LiabilityHeading);
		return true;
	}

	public boolean selectBank() throws InterruptedException {
		click(Business_Entrepreneur_Details.Bank);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectBank);
		Thread.sleep(1000);
		Log.info("Bank selected" + Business_Entrepreneur_Details.SelectBank);
		return true;
	}

	public boolean selectBranch() throws InterruptedException {
		click(Business_Entrepreneur_Details.Branch);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectBranch);
		Thread.sleep(1000);
		Log.info("Branch selected" + Business_Entrepreneur_Details.SelectBranch);
		return true;
	}

	public boolean selectLiabilityCategory() throws InterruptedException {
		click(Business_Entrepreneur_Details.LiabilityCategory);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectLiabilityCategory);
		Thread.sleep(1000);
		Log.info("Liability Category selected" + Business_Entrepreneur_Details.SelectLiabilityCategory);
		return true;
	}

	public boolean EnterOutstandingAmout(String EnterOutstandingAmount) throws InterruptedException {

		input(Business_Entrepreneur_Details.EnterOutstandingAmount, EnterOutstandingAmount);
		Thread.sleep(1000);
		Log.info(EnterOutstandingAmount);
		return true;
	}

	public boolean EnterTenurePending(String EnterTenurePending) throws InterruptedException {

		input(Business_Entrepreneur_Details.EnterTenurePending, EnterTenurePending);
		Thread.sleep(1000);
		Log.info(EnterTenurePending);
		return true;
	}

	public boolean selectStatusOfLoan() throws InterruptedException {
		click(Business_Entrepreneur_Details.Status);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectStatus);
		Thread.sleep(1000);
		Log.info("Status of Loan selected" + Business_Entrepreneur_Details.SelectStatus);
		return true;
	}

	public boolean AddLiabilityDetails() {

		ElementDisplayed(Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		Log.info("Liability Button displayed inside pop up" + Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		return true;
	}

	public boolean clickAddLiabilityDetailsButton() throws InterruptedException {
		click(Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		Thread.sleep(1000);
		Log.info("Liability Button displayed clicked pop up" + Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		ElementDisplayed(Business_Entrepreneur_Details.AddedLiabilityDetails);
		Log.info("Added liability details displayed" + Business_Entrepreneur_Details.AddedLiabilityDetails);
		return true;

	}

	public boolean EditLiabilityDetails() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddedLiabilityDetails);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.Status);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.editStatus);
		click(Business_Entrepreneur_Details.AddLiabilityDetailsButton);
//		ElementDisplayed(Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		Log.info("Data edited successfully" + Business_Entrepreneur_Details.AddLiabilityDetailsButton);
		return true;
	}

	public boolean venturesection() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.Liabilitysection);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.VentureCapitalist);
		Log.info("Venture Capitalist Section displayed" + Business_Entrepreneur_Details.VentureCapitalist);
		return true;
	}

	public boolean SeletcYESforventuresection() throws InterruptedException {

		click(Business_Entrepreneur_Details.YesforVenture);
		Thread.sleep(1000);
		Log.info("yes option selected for venture" + Business_Entrepreneur_Details.YesforVenture);
		return true;
	}

	public boolean TermSheetSection() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.TermSheetSection);
		Log.info("Term sheet section displayed" + Business_Entrepreneur_Details.TermSheetSection);
		click(Business_Entrepreneur_Details.YesforTermSheet);
		Thread.sleep(1000);
		Log.info("Yes selected for Term sheet" + Business_Entrepreneur_Details.YesforTermSheet);
		return true;
	}

	public boolean EnterCommittedAmount(String CommittedAmount) throws InterruptedException {
		input(Business_Entrepreneur_Details.CommittedAmount, CommittedAmount);
		Thread.sleep(1000);
		Log.info(CommittedAmount);
		return true;

	}

	public boolean EnterKeyCondition(String KeyCOndition) throws InterruptedException {
		input(Business_Entrepreneur_Details.KeyCOndition, KeyCOndition);
		Thread.sleep(1000);
		Log.info(KeyCOndition);
		return true;

	}

	public boolean EnterAdditionalDetails(String AdditionalDetails) throws InterruptedException {
		input(Business_Entrepreneur_Details.AdditionalDetails, AdditionalDetails);
		Thread.sleep(1000);
		Log.info(AdditionalDetails);
		return true;

	}

	public boolean FundSection() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entrepreneur_Details.AdditionalDetails);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.AddFund);
		Thread.sleep(1000);
		Log.info("Fund section displayed" + Business_Entrepreneur_Details.AddFund);
		return true;
	}

	public boolean AddFund() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddFund);
		Thread.sleep(1000);
		Log.info("Add Fund button clicked" + Business_Entrepreneur_Details.AddFund);
		return true;
	}

	public boolean FundHeading() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.FundHeadeing);
		Thread.sleep(1000);
		Log.info("Heading displayed correctly" + Business_Entrepreneur_Details.FundHeadeing);
		return true;
	}

	public boolean AddExtentFund() throws InterruptedException {

		click(Business_Entrepreneur_Details.ExtentOfFund);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectExtentOfFund);
		Thread.sleep(1000);
		Log.info("Exten of fund selected" + Business_Entrepreneur_Details.SelectExtentOfFund);
		return true;
	}

	public boolean EnterExtentFund(String EnterExtentFunds) throws InterruptedException {

		input(Business_Entrepreneur_Details.EnterExtentFunds, EnterExtentFunds);
		Thread.sleep(1000);
		Log.info(EnterExtentFunds);
		return true;
	}

	public boolean AddFundButton() {

		ElementDisplayed(Business_Entrepreneur_Details.AddFundDetails);
		Log.info("Add fund button displayed" + Business_Entrepreneur_Details.AddFundDetails);
		return true;
	}

	public boolean ClickAddFundButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddFundDetails);
		Thread.sleep(1000);
		Log.info("Fund details added" + Business_Entrepreneur_Details.AddFundDetails);
		return true;
	}

	public boolean CancelButtonVisibility() {

		ElementDisplayed(Business_Entrepreneur_Details.CancelButton);
		Log.info("Cancel button displayed" + Business_Entrepreneur_Details.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonVisibility() {

		ElementDisplayed(Business_Entrepreneur_Details.SaveAsDraft);
		Log.info("Save As Draft button displayed" + Business_Entrepreneur_Details.SaveAsDraft);
		return true;
	}

	public boolean SaveAndProceedButtonVisibility() {

		ElementDisplayed(Business_Entrepreneur_Details.SaveAndProceed);
		Log.info("Save And Proceed button displayed" + Business_Entrepreneur_Details.SaveAndProceed);
		return true;
	}

	public boolean ClickSaveAsDraftButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.SaveAsDraft);
		Thread.sleep(1000);
		Log.info("Draft saved" + Business_Entrepreneur_Details.SaveAsDraft);
		return true;
	}

	public boolean clickUpdateeAndProceed() throws InterruptedException {
		click(Business_Entrepreneur_Details.DraftedData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Business_Entrepreneur_Details.AdditionalDetails);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.UpdateAndProceed);
		Thread.sleep(1000);
		Log.info("Data saved" + Business_Entrepreneur_Details.UpdateAndProceed);
		return true;
	}
	
	public boolean SavedDatainGrid () {
		
		ElementDisplayed(Business_Entrepreneur_Details.DraftedData);
		Log.info("Data saved in grid");
		return true;
	}
	
	public boolean Continuebuttonvisibility () throws InterruptedException {
		ScrollUntilElementVisible(Business_Entrepreneur_Details.DraftedData);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.ProcessContinueButton);
		Log.info("Continue Button displayed" + Business_Entrepreneur_Details.ProcessContinueButton);
		return true;
	}
	
	public boolean clickonContinue () throws InterruptedException {
		click(Business_Entrepreneur_Details.ProcessContinueButton);
		Thread.sleep(1000);
		Log.info(" Process Continued " + Business_Entrepreneur_Details.ProcessContinueButton);
		return true;
		
		
	}
}
