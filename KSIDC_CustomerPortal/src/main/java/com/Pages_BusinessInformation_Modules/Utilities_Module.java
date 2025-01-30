package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Utilities;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Utilities_Module extends Base_Class {

	Utilities Utilities = new Utilities();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Utilities.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Utilities.ScrolltoBusinessInfo);
		return true;
	}

	public boolean VerifyUtilitiesComponent() throws InterruptedException {
		ScrollUntilElementVisible(Utilities.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		ElementDisplayed(Utilities.UtilitiesComponent);
		Thread.sleep(1000);
		Log.info("Utilities  component is visible." + Utilities.UtilitiesComponent);
		return true;
	}

	public boolean AccessUtilitiesComponent() throws InterruptedException {
		ScrollUntilElementVisible(Utilities.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Utilities.UtilitiesComponent);
		Thread.sleep(1000);
		Log.info("Utilities  component is accessable." + Utilities.UtilitiesComponent);
		return true;
	}

	public boolean VerifyUtilitiesHeader() throws InterruptedException {

		ElementDisplayed(Utilities.UtilitiesHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Utilities.UtilitiesHeader);
		return true;
	}

	public boolean VerifyStageHeading() throws InterruptedException {
		ElementDisplayed(Utilities.StageHeading);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Utilities.StageHeading);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Utilities.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Utilities.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Utilities.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Utilities.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Utilities.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Utilities.SkipForNow);
		ScrollUntilElementVisible(Utilities.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Utilities.UtilitiesComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Utilities.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Utilities.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Utilities.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Utilities.AddDetails);
		return true;
	}

	public boolean SelectUtilityType() throws InterruptedException {

		ElementDisplayed(Utilities.UtilityType);
		Log.info("Field Displayed" + Utilities.UtilityType);
		Thread.sleep(1000);
		click(Utilities.UtilityType);
		Thread.sleep(1000);
		click(Utilities.SelectUtilityType);
		Log.info("Utility Type Selected" + Utilities.SelectUtilityType);
		return true;

	}

	public boolean EnterCost(String EnterCost) throws InterruptedException {

		ElementDisplayed(Utilities.EnterCost);
		Log.info("Field Displayed" + Utilities.EnterCost);
		Thread.sleep(1000);
		input(Utilities.EnterCost, EnterCost);
		Thread.sleep(1000);
		Log.info(EnterCost);
		click(Utilities.CostLabel);
		return true;
	}

	public boolean CancelButtonPresence() throws InterruptedException {
		ElementDisplayed(Utilities.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Utilities.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Utilities.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Utilities.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Utilities.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Utilities.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Utilities.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Utilities.Successpopup);
		ElementDisplayed(Utilities.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Utilities.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Utilities.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Utilities.EnterCost);
		click(Utilities.UpdateAndProceed);
		Log.info("Data saved" + Utilities.UpdateAndProceed);
		ElementDisplayed(Utilities.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Utilities.Successpopup);
		return true;
	}

	public boolean DatainGrid() {

		ElementDisplayed(Utilities.AddedEnteredData);
		Log.info("Data displayed in grid" + Utilities.AddedEnteredData);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Utilities.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Utilities.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Utilities.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {

		click(Utilities.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Utilities.ClickContinue);
		return true;
	}

}
