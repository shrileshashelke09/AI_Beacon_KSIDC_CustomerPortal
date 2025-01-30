package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Deposit_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Deposit_Details_Module extends Base_Class {

	Deposit_Details Deposit_Details = new Deposit_Details();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Deposit_Details.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Deposit_Details.ScrolltoBusinessFinance);
		return true;
	}

	public boolean VerifyDepositDetailsComponent() throws InterruptedException {
		ScrollUntilElementVisible(Deposit_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		ElementDisplayed(Deposit_Details.DepositComponent);
		Thread.sleep(1000);
		Log.info("Vehicles Component is visible." + Deposit_Details.DepositComponent);
		return true;
	}

	public boolean AccessDepositDetailsComponent() throws InterruptedException {
		ScrollUntilElementVisible(Deposit_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Deposit_Details.DepositComponent);
		Thread.sleep(1000);
		Log.info("Vehicles  component is accessable." + Deposit_Details.DepositComponent);
		return true;
	}

//	public boolean WindowAccess () throws InterruptedException {
//
//		ElementDisplayed(Deposit_Details.DepositComponent);
//		Thread.sleep(1000);
//		Log.info("Window  displayed correctly " + Deposit_Details.DepositComponent);
//		return true;
//	}
	
	
	public boolean VerifyDepositComponentHeader() throws InterruptedException {

		ElementDisplayed(Deposit_Details.DepositComponent);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Deposit_Details.DepositComponent);
		return true;
	}

	public boolean VerifyStageHeading() throws InterruptedException {
		ElementDisplayed(Deposit_Details.StageHeading);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Deposit_Details.StageHeading);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Deposit_Details.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Deposit_Details.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Deposit_Details.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Deposit_Details.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Deposit_Details.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Deposit_Details.SkipForNow);
		ScrollUntilElementVisible(Deposit_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Deposit_Details.DepositComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Deposit_Details.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Deposit_Details.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Deposit_Details.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Deposit_Details.AddDetails);
		return true;
	}

	public boolean SelectDepositType() throws InterruptedException {

		ElementDisplayed(Deposit_Details.DepositType);
		Log.info("Field Displayed" + Deposit_Details.DepositType);
		Thread.sleep(1000);
		click(Deposit_Details.DepositType);
		Thread.sleep(1000);
		click(Deposit_Details.SelectDepositType);
		Log.info("Deposit Type Selected" + Deposit_Details.SelectDepositType);
		return true;

	}
	
	
	
	public boolean EnterDepositAmount(String EnterDepositAmount) throws InterruptedException {

		ElementDisplayed(Deposit_Details.EnterDepositAmount);
		Log.info("Field Displayed" + Deposit_Details.EnterDepositAmount);
		Thread.sleep(1000);
		input(Deposit_Details.EnterDepositAmount, EnterDepositAmount);
		Thread.sleep(1000);
		Log.info(EnterDepositAmount);
		click(Deposit_Details.DepositLabel);
		return true;
	}
	
	
	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Deposit_Details.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Deposit_Details.Successpopup);
		ElementDisplayed(Deposit_Details.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Deposit_Details.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Deposit_Details.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Deposit_Details.EnterDepositAmount);
		click(Deposit_Details.UpdateAndProceed);
		Log.info("Data saved" + Deposit_Details.UpdateAndProceed);
		ElementDisplayed(Deposit_Details.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Deposit_Details.Successpopup);
		return true;
	}

	
	public boolean clicktocontinue() throws InterruptedException {
ScrollUntilElementVisible(Deposit_Details.AddedEnteredData);
		click(Deposit_Details.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Deposit_Details.ClickContinue);
		return true;
	}

}
