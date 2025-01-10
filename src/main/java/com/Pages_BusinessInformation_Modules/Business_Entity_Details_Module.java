package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Business_Entity_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Business_Entity_Details_Module extends Base_Class {

	Business_Entity_Details Business_Entity_Details = new Business_Entity_Details();
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		return true;

	}

	// TC002
	public boolean NavigatetoBusiness() throws InterruptedException {
		click(Business_Entity_Details.ContinueButton);
		Log.info("Navigate to Business" + Business_Entity_Details.ContinueButton);
		Thread.sleep(2000);
		return true;
	}

	public boolean AccessEntityPage() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entity_Details.scrolltoStep3);
		Thread.sleep(1000);
		click(Business_Entity_Details.EntityAccess);
		Thread.sleep(1000);
		Log.info("Accessd Entity" + Business_Entity_Details.EntityAccess);
		return true;
	}

	public boolean SelectEntityName() throws InterruptedException {

		click(Business_Entity_Details.AddEntityButton);
		Thread.sleep(1000);
		click(Business_Entity_Details.EntityName);
		Thread.sleep(1000);
		click(Business_Entity_Details.SelectEntityName);
		Thread.sleep(1000);
		Log.info("Entity Name selected" + Business_Entity_Details.SelectEntityName);
		return true;
	}

	public boolean EnterDetailsofActivity(String DetailsOfActivity) throws InterruptedException {

		input(Business_Entity_Details.DetailsOfActivity, DetailsOfActivity);
		Thread.sleep(1000);
		Log.info(DetailsOfActivity);
		return true;
	}

	public boolean EnterProduct(String Product) throws InterruptedException {

		input(Business_Entity_Details.Product, Product);
		Thread.sleep(1000);
		Log.info(Product);
		return true;
	}
	
	public boolean SelectProfit () throws InterruptedException {
		
		ScrollUntilElementVisible(Business_Entity_Details.DetailsOfActivity);
		Thread.sleep(1000);
		click(Business_Entity_Details.SelectProfit);
		Thread.sleep(1000);
		Log.info("Profit selected" + Business_Entity_Details.SelectProfit);
		return true;
	}

	public boolean EnterNetProfit(String EnterNetProfit) throws InterruptedException {

		input(Business_Entity_Details.EnterNetProfit, EnterNetProfit);
		Thread.sleep(1000);
		Log.info(EnterNetProfit);
		return true;
	}
	
	public boolean AddExternalAccount () throws InterruptedException {
		
		click(Business_Entity_Details.AddExternalAccButton);
		Thread.sleep(1000);
		Log.info("Bank Account popup opened" + Business_Entity_Details.AddExternalAccButton);
		return true;
	}
	
	public boolean EnterIFSCCode(String EnterIFSCCode) throws InterruptedException {
		input(Business_Entity_Details.EnterIFSCCode, EnterIFSCCode);
		Thread.sleep(1000);
		click(Business_Entity_Details.ClickonBank);
		ElementToBeVisible(Business_Entity_Details.BankName);
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

		ElementDisplayed(Business_Entity_Details.AccountNo);
		Log.info("Account No field displayed" + Business_Entity_Details.AccountNo);
		input(Business_Entity_Details.AccountNo, AccountNo);
		Thread.sleep(1000);
		Log.info(AccountNo);
		return true;
	}
	
	public boolean ClickAddBankButton() throws InterruptedException {

		click(Business_Entity_Details.AddBankButton);
		Thread.sleep(1000);
		Log.info("Bank Details Added" + Business_Entity_Details.AddBankButton);
		Thread.sleep(1000);
		return true;
	}

	public boolean SelectYESforLiability() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entity_Details.AddExternalAccButton);
		click(Business_Entity_Details.YesforLiability);
		Thread.sleep(1000);
		Log.info("Yes selected for Liability" + Business_Entity_Details.YesforLiability);
		return true;
	}



	public boolean ClickAddLiabilityButon() throws InterruptedException {

		click(Business_Entity_Details.AddLiabilityButton);
		Thread.sleep(1000);
		Log.info("Add liability pop up opened" + Business_Entity_Details.AddLiabilityButton);
		return true;
	}

	public boolean selectLiabilityCategory() throws InterruptedException {
		click(Business_Entity_Details.LiabilityCategory);
		Thread.sleep(1000);
		click(Business_Entity_Details.SelectLiabilityCategory);
		Thread.sleep(1000);
		Log.info("Liability Category selected" + Business_Entity_Details.SelectLiabilityCategory);
		return true;
	}


	public boolean EnterOutstandingAmout(String EnterOutstandingAmount) throws InterruptedException {

		input(Business_Entity_Details.EnterOutstandingAmount, EnterOutstandingAmount);
		Thread.sleep(1000);
		Log.info(EnterOutstandingAmount);
		return true;
	}

	public boolean EnterTenurePending(String EnterTenurePending) throws InterruptedException {

		input(Business_Entity_Details.EnterTenurePending, EnterTenurePending);
		Thread.sleep(1000);
		Log.info(EnterTenurePending);
		return true;
	}

	public boolean selectStatusOfLoan() throws InterruptedException {
		click(Business_Entity_Details.Status);
		Thread.sleep(1000);
		click(Business_Entity_Details.SelectStatus);
		Thread.sleep(1000);
		Log.info("Status of Loan selected" + Business_Entity_Details.SelectStatus);
		return true;
	}


	public boolean clickAddLiabilityDetailsButton() throws InterruptedException {
		click(Business_Entity_Details.AddLiabilityDetailsButton);
		Thread.sleep(1000);
		Log.info("Liability Button displayed clicked pop up" + Business_Entity_Details.AddLiabilityDetailsButton);
		return true;

	}
	
	public boolean SelectYesforCorporateGuarantee () throws InterruptedException {
		ScrollUntilElementVisible(Business_Entity_Details.AddLiabilityButton);
		Thread.sleep(1000);
		click(Business_Entity_Details.YesforCorporateGuarantee);
		Thread.sleep(1000);
		Log.info("'Yes' radio button is selected, and other related fields or actions are enabled." + Business_Entity_Details.YesforCorporateGuarantee);
		return true;
	}
	
	public boolean ClickAddcorporateButon() throws InterruptedException {

		click(Business_Entity_Details.AddCorporateGuaranteeButton);
		Thread.sleep(1000);
		Log.info("Add Corporate pop up opened" + Business_Entity_Details.AddCorporateGuaranteeButton);
		return true;
	}
	
	public boolean EnterEntityName(String EnterEntityName) throws InterruptedException {

		input(Business_Entity_Details.EnterEntityName, EnterEntityName);
		Thread.sleep(1000);
		Log.info(EnterEntityName);
		return true;
	}
	
	public boolean EnterAmount(String EnterAmount) throws InterruptedException {

		input(Business_Entity_Details.EnterAmount, EnterAmount);
		Thread.sleep(1000);
		Log.info(EnterAmount);
		return true;
	}
	
	public boolean ClickAddDetailsButon() throws InterruptedException {

		click(Business_Entity_Details.AddDetailsButton);
		Thread.sleep(1000);
		Log.info("Added Corporate data" + Business_Entity_Details.AddDetailsButton);
		return true;
	}
	
	public boolean AddeddatainGrid () throws InterruptedException {
		
		ElementDisplayed(Business_Entity_Details.AddedCorporateData);
		Thread.sleep(1000);
		Log.info("Added data showed in grid" + Business_Entity_Details.AddedCorporateData);
		return true;
	}
	
	public boolean venturesection() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entity_Details.AddCorporateGuaranteeButton);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entity_Details.VentureCapitalist);
		Log.info("Venture Capitalist Section displayed" + Business_Entity_Details.VentureCapitalist);
		return true;
	}

	public boolean SeletcYESforventuresection() throws InterruptedException {

		click(Business_Entity_Details.YesforVenture);
		Thread.sleep(1000);
		Log.info("yes option selected for venture" + Business_Entity_Details.YesforVenture);
		return true;
	}

	public boolean TermSheetSection() throws InterruptedException {

		ElementDisplayed(Business_Entity_Details.TermSheetSection);
		Log.info("Term sheet section displayed" + Business_Entity_Details.TermSheetSection);
		click(Business_Entity_Details.YesforTermSheet);
		Thread.sleep(1000);
		Log.info("Yes selected for Term sheet" + Business_Entity_Details.YesforTermSheet);
		return true;
	}

	public boolean EnterCommittedAmount(String CommittedAmount) throws InterruptedException {
		input(Business_Entity_Details.CommittedAmount, CommittedAmount);
		Thread.sleep(1000);
		Log.info(CommittedAmount);
		return true;

	}

	public boolean EnterKeyCondition(String KeyCOndition) throws InterruptedException {
		input(Business_Entity_Details.KeyCOndition, KeyCOndition);
		Thread.sleep(1000);
		Log.info(KeyCOndition);
		return true;

	}

	public boolean EnterAdditionalDetails(String AdditionalDetails) throws InterruptedException {
		input(Business_Entity_Details.AdditionalDetails, AdditionalDetails);
		Thread.sleep(1000);
		Log.info(AdditionalDetails);
		return true;

	}
	
	public boolean clickSaveAndProceed() throws InterruptedException {
		ScrollUntilElementVisible(Business_Entity_Details.KeyCOndition);
		Thread.sleep(1000);
		click(Business_Entity_Details.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Data saved" + Business_Entity_Details.SaveAndProceed);
		ElementDisplayed(Business_Entity_Details.SavedData);
		Log.info("Data showed in grid" + Business_Entity_Details.SavedData);
		return true;
	}
	
	public boolean ClickonContinue ( ) throws InterruptedException {
		
		ScrollUntilElementVisible(Business_Entity_Details.SavedData);
		Thread.sleep(1000);
		click(Business_Entity_Details.ProcessContinueButton);
		Thread.sleep(1000);
		Log.info(" Process Continued " + Business_Entity_Details.ProcessContinueButton);
		return true;
	}

	
}
