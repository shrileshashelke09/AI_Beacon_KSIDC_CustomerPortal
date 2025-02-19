package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Page_Repositary.Security_Misc_Fixed_Assets;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_MISC_Fixed_Assets_Module extends Base_Class{

	Security_Misc_Fixed_Assets Sec_Misc_Fixed_Asset = new Security_Misc_Fixed_Assets();
	Misc_Fixed_Asset Misc_Fixed_Asset = new Misc_Fixed_Asset();

	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		click(Sec_Misc_Fixed_Asset.ContinueButton);
		Log.info("Login successfull");
		return true;
	}

	// TC002

	public boolean VerifySecurityStageAccess() throws InterruptedException {
		
		ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.SecurtiyStageActive);
		ElementToBeVisible(Sec_Misc_Fixed_Asset.SecurtiyStageActive);
		Log.info("Security Misc_Fixed_Asset  component is visible." + Sec_Misc_Fixed_Asset.SecurtiyStageActive);
		return true;
	}

	// TC003
	public boolean OpenMiscFixedAssetDetails() throws InterruptedException {
		
		ElementToBeVisible(Sec_Misc_Fixed_Asset.SecurityMiscFixedAssetButton);
		ElementDisplayed(Sec_Misc_Fixed_Asset.SecurityMiscFixedAssetButton);
		Log.info("Misc Fixed Assets Details component  component is visible." + Sec_Misc_Fixed_Asset.SecurityMiscFixedAssetButton);
		click(Sec_Misc_Fixed_Asset.SecurityMiscFixedAssetButton);
		ElementDisplayed(Sec_Misc_Fixed_Asset.MiscFixedAssetDetailsHeading);
		Log.info("Misc Fixed Assets Details Heading is visible." + Sec_Misc_Fixed_Asset.MiscFixedAssetDetailsHeading);
		return true;
	}

	// TC004
	public boolean ClickOnMiscFixedAssetsGrid() throws InterruptedException {
//		ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.ListOfMiscFixedAssetButton);
		click(Sec_Misc_Fixed_Asset.ListOfMiscFixedAssetButton);
		ExtentTestManager.getTest().log(Status.PASS, "Clicked On Misc Fixed Assets Grid" + Sec_Misc_Fixed_Asset.ListOfMiscFixedAssetButton);
		ElementDisplayed(Sec_Misc_Fixed_Asset.ViewMiscFixedAssetDetailsGridHeading);
		Log.info("View Misc Fixed Asset Details Grid Heading is visible." + Sec_Misc_Fixed_Asset.ViewMiscFixedAssetDetailsGridHeading);
		Thread.sleep(2000);
		return true;
	}

	// TC005
	public boolean VerifyMiscFixedAssetField () throws InterruptedException {
		ElementToBeVisible(Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		Thread.sleep(1000);
		ScrollUP();
		ElementDisplayed(Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		Log.info(" Misc Fixed Asset field is displayed " + Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		ElementToBeVisible(Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		CheckElementDisable(Sec_Misc_Fixed_Asset.MiscFixedAssetText);
		Log.info("Misc Fixed Asset Text is Disabled" +Sec_Misc_Fixed_Asset.MiscFixedAssetText );
		return true;
	}
	
	// TC006
	public boolean VerifyCostForMiscFixedIncludingGSTField () throws InterruptedException {

			ElementDisplayed(Sec_Misc_Fixed_Asset.CostForMiscFixedIncludingGSTText);
			Log.info("Cost For Misc Fixed Including GST Text field is displayed " + Sec_Misc_Fixed_Asset.MiscFixedAssetText);
			ElementToBeVisible(Sec_Misc_Fixed_Asset.CostForMiscFixedIncludingGSTText);
			Log.info("Cost For Misc Fixed Including GST Text is Disabled" +CheckElementDisable(Sec_Misc_Fixed_Asset.CostForMiscFixedIncludingGSTText) );
			return true;
	}
	
	// TC007
	public boolean CancelandCloseViewMiscFixedAssetDetailsPage () throws InterruptedException {

				ElementToBeVisible(Sec_Misc_Fixed_Asset.ViewMiscFixedAssetDetailsGridHeading);
				Log.info("View Misc Fixed Asset Details Grid Heading is displayed");
				ElementToBeVisible(Sec_Misc_Fixed_Asset.CancelButton);
				ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.CancelButton);
				Thread.sleep(1000);
				Log.info("Cancel button in View Misc Fixed Asset Details Page is displayed " + Sec_Misc_Fixed_Asset.CancelButton);
//				ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.CancelButton);
				ScrollUP();
				click(Sec_Misc_Fixed_Asset.CancelButton);
				Log.info("View Misc Fixed Asset Details Page is closed " + Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				return true;
	}
	
	// TC008
		public boolean ContinuetoNextComponentVehicles () throws InterruptedException {
				
				ElementToBeVisible(Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				Thread.sleep(1000);
				ScrollUP();
				ElementDisplayed(Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				Log.info("continue button in 'View Misc Fixed Asset Details' Page is displayed " + Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				click(Sec_Misc_Fixed_Asset.MiscFixedAssetsContinueButton);
				
				Log.info("clicked on continue button in 'View Misc Fixed Asset Details' Page");
				ElementDisplayed(Sec_Misc_Fixed_Asset.VehicleDetailsPageHeading);
				Log.info("Page navigates to the next component 'Vehicles'.");
				return true;
		}
	
	
}
