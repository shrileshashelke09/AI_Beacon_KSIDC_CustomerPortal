package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Technical_Know;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Technical_Know_Module extends Base_Class {

	Technical_Know Technical_Know = new Technical_Know();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Technical_Know.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Technical_Know.ScrolltoProjectCost);
		return true;
	}

	public boolean VerifyTechnicalKnowComponent() throws InterruptedException {
		ScrollUntilElementVisible(Technical_Know.ScrolltoProjectCost);
		Thread.sleep(1000);
		ElementDisplayed(Technical_Know.TechnicalKnowComponent);
		Thread.sleep(1000);
		Log.info("Vehicles Component is visible." + Technical_Know.TechnicalKnowComponent);
		return true;
	}

	public boolean AccessTechnicalKnowComponent() throws InterruptedException {
		ScrollUntilElementVisible(Technical_Know.ScrolltoProjectCost);
		Thread.sleep(1000);
		click(Technical_Know.TechnicalKnowComponent);
		Thread.sleep(1000);
		Log.info("Vehicles  component is accessable." + Technical_Know.TechnicalKnowComponent);
		return true;
	}

	public boolean VerifyTechnicalKnowComponentHeader() throws InterruptedException {

		ElementDisplayed(Technical_Know.TechnicalKnowHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Technical_Know.TechnicalKnowHeader);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Technical_Know.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Technical_Know.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Technical_Know.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Technical_Know.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Technical_Know.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Technical_Know.SkipForNow);
		ScrollUntilElementVisible(Technical_Know.ScrolltoProjectCost);
		Thread.sleep(1000);
		click(Technical_Know.TechnicalKnowComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Technical_Know.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Technical_Know.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Technical_Know.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Technical_Know.AddDetails);
		return true;
	}

	public boolean EnterServicetype(String EnterServicetype) throws InterruptedException {

		ElementDisplayed(Technical_Know.EnterServicetype);
		Log.info("Field displayed" + Technical_Know.EnterServicetype);
		input(Technical_Know.EnterServicetype, EnterServicetype);
		Thread.sleep(1000);
		Log.info(EnterServicetype);
		Thread.sleep(1000);
		return true;
	}

	public boolean EnterServiceProvider(String EnterServiceProvider) throws InterruptedException {
		ElementDisplayed(Technical_Know.EnterServiceProvider);
		Log.info("Field displayed" + Technical_Know.EnterServiceProvider);
		input(Technical_Know.EnterServiceProvider, EnterServiceProvider);
		Thread.sleep(1000);
		Log.info(EnterServiceProvider);
		Thread.sleep(1000);
		return true;

	}

	public boolean EnterFeeAmount(String EnterFeeAmount) throws InterruptedException {
		ElementDisplayed(Technical_Know.EnterFeeAmount);
		Log.info("Field displayed" + Technical_Know.EnterFeeAmount);
		input(Technical_Know.EnterFeeAmount, EnterFeeAmount);
		Thread.sleep(1000);
		Log.info(EnterFeeAmount);
		click(Technical_Know.FeeAmountLabel);
		Thread.sleep(1000);
		return true;

	}

	public boolean CancelButtonPresence() throws InterruptedException {
		ScrollUntilElementVisible(Technical_Know.TechnicalKnowHeader);
		ElementDisplayed(Technical_Know.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Technical_Know.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Technical_Know.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Technical_Know.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Technical_Know.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Technical_Know.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Technical_Know.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Technical_Know.Successpopup);
		ElementDisplayed(Technical_Know.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Technical_Know.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Technical_Know.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Technical_Know.EnterServicetype);
		click(Technical_Know.UpdateAndProceed);
		Log.info("Data saved" + Technical_Know.UpdateAndProceed);
		ElementDisplayed(Technical_Know.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Technical_Know.Successpopup);
		return true;
	}

	public boolean DatainGrid() {

		ElementDisplayed(Technical_Know.AddedEnteredData);
		Log.info("Data displayed in grid" + Technical_Know.AddedEnteredData);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Technical_Know.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Technical_Know.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Technical_Know.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {
		ScrollUntilElementVisible(Technical_Know.AddedEnteredData);
		click(Technical_Know.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Technical_Know.ClickContinue);
		return true;
	}

}
