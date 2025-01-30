package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Building_Civil_Work;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Building_Civil_Work_Module extends Base_Class {

	Building_Civil_Work Building_Civil_Work = new Building_Civil_Work();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Building_Civil_Work.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Building_Civil_Work.ScrolltoBusinessInfo);
		return true;
	}

	public boolean VerifyBuilding_Civil_WorkComponen() throws InterruptedException {
		ScrollUntilElementVisible(Building_Civil_Work.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		ElementDisplayed(Building_Civil_Work.BuildingWorkComponent);
		Thread.sleep(1000);
		Log.info("Building_Civil_Work  component is visible." + Building_Civil_Work.BuildingWorkComponent);
		return true;
	}

	public boolean AccessBuilding_Civil_WorkComponent() throws InterruptedException {
		ScrollUntilElementVisible(Building_Civil_Work.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Building_Civil_Work.BuildingWorkComponent);
		Thread.sleep(1000);
		Log.info("Building_Civil_Work  component is accessable." + Building_Civil_Work.BuildingWorkComponent);
		return true;
	}

	public boolean VerifyBuilding_Civil_WorkHeader() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.BuildingWorkHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Building_Civil_Work.BuildingWorkHeader);
		return true;
	}

	public boolean VerifyMainText() throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.MainText);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Building_Civil_Work.MainText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Building_Civil_Work.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Building_Civil_Work.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Building_Civil_Work.SkipForNow);
		ScrollUntilElementVisible(Building_Civil_Work.ScrolltoBusinessInfo);
		Thread.sleep(1000);
		click(Building_Civil_Work.BuildingWorkComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Building_Civil_Work.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Building_Civil_Work.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Building_Civil_Work.AddDetails);
		return true;
	}

	public boolean SelectBuildingType() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.BuildingType);
		Log.info("Field visible" + Building_Civil_Work.BuildingType);
		Thread.sleep(1000);
		click(Building_Civil_Work.BuildingType);
		Thread.sleep(1000);
		click(Building_Civil_Work.SelectBuildingType);
		Thread.sleep(1000);
		Log.info("Building Type selected" + Building_Civil_Work.SelectBuildingType);
		return true;
	}

	public boolean SelectExistingProposed() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.ExistingProposed);
		Log.info("Field visible" + Building_Civil_Work.ExistingProposed);
		Thread.sleep(1000);
		click(Building_Civil_Work.ExistingProposed);
		Thread.sleep(1000);
		click(Building_Civil_Work.SelectExistingProposed);
		Thread.sleep(1000);
		Log.info("Existing Proposed Type selected" + Building_Civil_Work.SelectExistingProposed);
		return true;
	}
	
	public boolean SelectLandDocNo() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.LandDocNo);
		Log.info("Field visible" + Building_Civil_Work.LandDocNo);
		Thread.sleep(1000);
		click(Building_Civil_Work.LandDocNo);
		Thread.sleep(1000);
		click(Building_Civil_Work.SelectLandDocNo);
		Thread.sleep(1000);
		Log.info("Land Doc No selected" + Building_Civil_Work.SelectLandDocNo);
		return true;
	}
	
	public boolean BuildingAge (String BuildingAge) throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.BuildingAge);
		Log.info("Field visible" + Building_Civil_Work.BuildingAge);
		Thread.sleep(1000);
		input(Building_Civil_Work.BuildingAge ,BuildingAge);
		Thread.sleep(1000);
		Log.info(BuildingAge);
		return true;
		
	}
	
	public boolean EnterBuildingArea (String EnterBuildingArea) throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.EnterBuildingArea);
		Log.info("Field visible" + Building_Civil_Work.EnterBuildingArea);
		Thread.sleep(1000);
		input(Building_Civil_Work.EnterBuildingArea ,EnterBuildingArea);
		Thread.sleep(1000);
		Log.info(EnterBuildingArea);
		return true;
		
	}
	
	public boolean EnterCostForTheBuilding (String EnterCostForTheBuilding) throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.EnterCostForTheBuilding);
		Log.info("Field visible" + Building_Civil_Work.EnterCostForTheBuilding);
		Thread.sleep(1000);
		input(Building_Civil_Work.EnterCostForTheBuilding ,EnterCostForTheBuilding);
		Thread.sleep(1000);
		Log.info(EnterCostForTheBuilding);
		return true;
		
	}
	
	public boolean EnterArchitectOrEngineersName (String EnterArchitectOrEngineersName) throws InterruptedException {
		ElementDisplayed(Building_Civil_Work.EnterArchitectOrEngineersName);
		Log.info("Field visible" + Building_Civil_Work.EnterArchitectOrEngineersName);
		Thread.sleep(1000);
		input(Building_Civil_Work.EnterArchitectOrEngineersName ,EnterArchitectOrEngineersName);
		Thread.sleep(1000);
		Log.info(EnterArchitectOrEngineersName);
		return true;
		
	}
	
	public boolean CancelButtonPresence() throws InterruptedException {
ScrollUntilElementVisible(Building_Civil_Work.EnterBuildingArea);
		ElementDisplayed(Building_Civil_Work.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Building_Civil_Work.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Building_Civil_Work.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Building_Civil_Work.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Building_Civil_Work.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Building_Civil_Work.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Building_Civil_Work.Successpopup);
		ElementDisplayed(Building_Civil_Work.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed."
				+ Building_Civil_Work.Successpopup);
		return true;
	}
	
public boolean UpdateAndProceed () throws InterruptedException {
		
		click(Building_Civil_Work.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Building_Civil_Work.EnterBuildingArea);
		click(Building_Civil_Work.UpdateAndProceed);
		Log.info("Data saved" + Building_Civil_Work.UpdateAndProceed);
		ElementDisplayed(Building_Civil_Work.Successpopup);
		Log.info("Data is saved successfully and success message is displayed."+ Building_Civil_Work.Successpopup);
		return true;		
	}
	
	public boolean DatainGrid () {
		
		ElementDisplayed(Building_Civil_Work.AddedEnteredData);
		Log.info("Data displayed in grid" + Building_Civil_Work.AddedEnteredData);
		return true;
	}
	
public boolean ValidateContinuebutton () throws InterruptedException {
		
		ScrollUntilElementVisible(Building_Civil_Work.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Building_Civil_Work.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Building_Civil_Work.ClickContinue);
		return true;
	}

public boolean clicktocontinue () throws InterruptedException {
	
	click(Building_Civil_Work.ClickContinue);
	Thread.sleep(3000);
	Log.info("Process continued"+ Building_Civil_Work.ClickContinue);
	return true;
}


}
