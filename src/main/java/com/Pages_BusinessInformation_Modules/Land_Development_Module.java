package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Land_Development;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Land_Development_Module extends Base_Class {

	Land_Development Land_Development = new Land_Development();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Land_Development.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Land_Development.ScrolltoStep4);
		return true;
	}

	public boolean VerifyLand_DevelopmentComponen() throws InterruptedException {
		ScrollUntilElementVisible(Land_Development.ScrolltoStep4);
		Thread.sleep(1000);
		ElementDisplayed(Land_Development.LandDevelopmentComponent);
		Thread.sleep(1000);
		Log.info("Land_Development  component is visible." + Land_Development.LandDevelopmentComponent);
		return true;
	}

	public boolean AccessLand_DevelopmentComponent() throws InterruptedException {
		ScrollUntilElementVisible(Land_Development.ScrolltoStep4);
		Thread.sleep(1000);
		click(Land_Development.LandDevelopmentComponent);
		Thread.sleep(1000);
		Log.info("Land_Development  component is accessable." + Land_Development.LandDevelopmentComponent);
		return true;
	}

	public boolean VerifyLand_DevelopmentHeader() throws InterruptedException {

		ElementDisplayed(Land_Development.LandDevelopmentHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Land_Development.LandDevelopmentHeader);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Land_Development.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Land_Development.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		ScrollUntilElementVisible(Land_Development.ScrolltoStep4);
		Thread.sleep(1000);
		click(Land_Development.LandDevelopmentComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Land_Development.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Land_Development.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Land_Development.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Land_Development.AddDetails);
		return true;
	}

	public boolean SelectDocumentItems () throws InterruptedException {
		
		click(Land_Development.DocumentItems);
		Thread.sleep(1000);
		click(Land_Development.SelectDocumentItems);
		Thread.sleep(1000);
		Log.info("Document item selected" +Land_Development.SelectDocumentItems );
		return true;
	}
	
	public boolean EnterGST (String EnterEstimatedCost) throws InterruptedException {
		ElementDisplayed(Land_Development.EnterEstimatedCost);
		Log.info("Field displayed" +Land_Development.EnterEstimatedCost);
		input(Land_Development.EnterEstimatedCost , EnterEstimatedCost);
		Thread.sleep(1000);
		Log.info(EnterEstimatedCost);
		click(Land_Development.EstimateCostLabel);
		Thread.sleep(1000);
		return true;
		
	}
	
	
	public boolean CancelButtonPresence() throws InterruptedException {

		ElementDisplayed(Land_Development.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Land_Development.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Land_Development.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Land_Development.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Land_Development.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Land_Development.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Land_Development.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Land_Development.Successpopup);
		ElementDisplayed(Land_Development.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed."
				+ Land_Development.Successpopup);
		return true;
	}
	
public boolean UpdateAndProceed () throws InterruptedException {
		
		click(Land_Development.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Land_Development.EstimateCostLabel);
		click(Land_Development.UpdateAndProceed);
		Log.info("Data saved" + Land_Development.UpdateAndProceed);
		ElementDisplayed(Land_Development.Successpopup);
		Log.info("Data is saved successfully and success message is displayed."+ Land_Development.Successpopup);
		return true;		
	}
	
	public boolean DatainGrid () {
		
		ElementDisplayed(Land_Development.AddedEnteredData);
		Log.info("Data displayed in grid" + Land_Development.AddedEnteredData);
		return true;
	}
	
public boolean ValidateContinuebutton () throws InterruptedException {
		
		ScrollUntilElementVisible(Land_Development.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Land_Development.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Land_Development.ClickContinue);
		return true;
	}

public boolean clicktocontinue () throws InterruptedException {
	
	click(Land_Development.ClickContinue);
	Thread.sleep(3000);
	Log.info("Process continued"+ Land_Development.ClickContinue);
	return true;
}

}
