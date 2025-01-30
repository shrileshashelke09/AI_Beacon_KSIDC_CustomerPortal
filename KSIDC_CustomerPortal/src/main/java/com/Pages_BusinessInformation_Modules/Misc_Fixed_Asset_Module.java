package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Misc_Fixed_Asset_Module extends Base_Class {

	Misc_Fixed_Asset Misc_Fixed_Asset = new Misc_Fixed_Asset();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Misc_Fixed_Asset.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Misc_Fixed_Asset.ScrolltoBusinessInfo);
		return true;
	}

	public boolean VerifyMiscFixedAssetComponent() throws InterruptedException {
		ScrollUntilElementVisible(Misc_Fixed_Asset.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		ElementDisplayed(Misc_Fixed_Asset.MiscFixedAssetComponent);
		Thread.sleep(1000);
		Log.info("Misc_Fixed_Asset  component is visible." + Misc_Fixed_Asset.MiscFixedAssetComponent);
		return true;
	}

	public boolean AccessMiscFixedAssetComponent() throws InterruptedException {
		ScrollUntilElementVisible(Misc_Fixed_Asset.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Misc_Fixed_Asset.MiscFixedAssetComponent);
		Thread.sleep(1000);
		Log.info("Misc_Fixed_Asset  component is accessable." + Misc_Fixed_Asset.MiscFixedAssetComponent);
		return true;
	}

	public boolean WindowAccess () throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.MiscFixedAssetHeader);
		Thread.sleep(1000);
		Log.info("Window  displayed correctly " + Misc_Fixed_Asset.MiscFixedAssetHeader);
		return true;
	}
	
	
	public boolean VerifyMiscFixedAssetComponentHeader() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.MiscFixedAssetHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Misc_Fixed_Asset.MiscFixedAssetHeader);
		return true;
	}

	public boolean VerifyStageHeading() throws InterruptedException {
		ElementDisplayed(Misc_Fixed_Asset.StageHeading);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Misc_Fixed_Asset.StageHeading);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Misc_Fixed_Asset.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Misc_Fixed_Asset.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Misc_Fixed_Asset.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Misc_Fixed_Asset.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Misc_Fixed_Asset.SkipForNow);
		ScrollUntilElementVisible(Misc_Fixed_Asset.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Misc_Fixed_Asset.MiscFixedAssetComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Misc_Fixed_Asset.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Misc_Fixed_Asset.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Misc_Fixed_Asset.AddDetails);
		return true;
	}

	public boolean SelectMiscFixedAsset() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.MiscFixedAsset);
		Log.info("Field Displayed" + Misc_Fixed_Asset.MiscFixedAsset);
		Thread.sleep(1000);
		click(Misc_Fixed_Asset.MiscFixedAsset);
		Thread.sleep(1000);
		click(Misc_Fixed_Asset.SelectMiscFixedAsset);
		Log.info("Utility Type Selected" + Misc_Fixed_Asset.SelectMiscFixedAsset);
		return true;

	}

	public boolean EnterCost(String EnterCost) throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.EnterCost);
		Log.info("Field Displayed" + Misc_Fixed_Asset.EnterCost);
		Thread.sleep(1000);
		input(Misc_Fixed_Asset.EnterCost, EnterCost);
		Thread.sleep(1000);
		Log.info(EnterCost);
		click(Misc_Fixed_Asset.CostLabel);
		return true;
	}

	public boolean CancelButtonPresence() throws InterruptedException {
		ElementDisplayed(Misc_Fixed_Asset.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Misc_Fixed_Asset.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Misc_Fixed_Asset.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Misc_Fixed_Asset.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Misc_Fixed_Asset.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Misc_Fixed_Asset.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Misc_Fixed_Asset.Successpopup);
		ElementDisplayed(Misc_Fixed_Asset.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Misc_Fixed_Asset.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Misc_Fixed_Asset.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Misc_Fixed_Asset.EnterCost);
		click(Misc_Fixed_Asset.UpdateAndProceed);
		Log.info("Data saved" + Misc_Fixed_Asset.UpdateAndProceed);
		ElementDisplayed(Misc_Fixed_Asset.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Misc_Fixed_Asset.Successpopup);
		return true;
	}

	public boolean DatainGrid() {

		ElementDisplayed(Misc_Fixed_Asset.AddedEnteredData);
		Log.info("Data displayed in grid" + Misc_Fixed_Asset.AddedEnteredData);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Misc_Fixed_Asset.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Misc_Fixed_Asset.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Misc_Fixed_Asset.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {

		click(Misc_Fixed_Asset.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Misc_Fixed_Asset.ClickContinue);
		return true;
	}

}
