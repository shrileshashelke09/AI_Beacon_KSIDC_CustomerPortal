package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Page_Repositary.Security_Corporate_Guarantee;
import com.Page_Repositary.Security_Misc_Fixed_Assets;
import com.Page_Repositary.Security_Personal_Guarantee;
import com.Page_Repositary.Security_Summary;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Summary_Module extends Base_Class{

	Security_Personal_Guarantee Sec_per_Guarantee = new Security_Personal_Guarantee();
	Security_Summary Sec_Summary = new Security_Summary();
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		click(Sec_Summary.ContinueButton);
		Log.info("Login successfull");
		return true;

	}

	// TC002

	public boolean VerifySecurityStageAccess() throws InterruptedException {
		
		ScrollUntilElementVisible(Sec_Summary.SecurtiyStageActive);
		ElementToBeVisible(Sec_Summary.SecurtiyStageActive);
		Log.info("User is navigated to the Security stage.");
		ExtentTestManager.getTest().log(Status.PASS, "User is navigated to the Security stage.");
		return true;
	}

	// TC003
	public boolean AccessSecuritySummary() throws InterruptedException {
		
		ElementToBeVisible(Sec_Summary.SecuritySummaryButton);
		ElementDisplayed(Sec_Summary.SecuritySummaryButton);
		Log.info("Security Summary Details is visible." + Sec_Summary.SecuritySummaryButton);
		click(Sec_Summary.SecuritySummaryButton);
		ExtentTestManager.getTest().log(Status.PASS, "Attempt to clicked on 'Security Summary'.");
		ElementDisplayed(Sec_Summary.SecuritySummaryDetailsHeading);
		return true;
	}

	// TC004
	public boolean VerifyDatainPlantMachineryField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.Plant_MachineryTxtBox);
		CheckElementDisable(Sec_Summary.Plant_MachineryTxtBox);
		String text = driver.findElement(Sec_Summary.Plant_MachineryTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Plant & Machinery' field.");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// TC005
	public boolean VerifyDatainLandField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.LandTxtBox);
		CheckElementDisable(Sec_Summary.Plant_MachineryTxtBox);
		String text = driver.findElement(Sec_Summary.LandTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Land' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC006
	public boolean VerifyDatainLandDevelopmentField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.LandDevelopmentTxtBox);
		CheckElementDisable(Sec_Summary.LandDevelopmentTxtBox);
		String text = driver.findElement(Sec_Summary.LandDevelopmentTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Land Development' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC007
	public boolean VerifyDatainUtilitiesField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.UtilitiesTxtBox);
		CheckElementDisable(Sec_Summary.UtilitiesTxtBox);
		String text = driver.findElement(Sec_Summary.UtilitiesTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Utilities' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC008
	public boolean VerifyDatainMiscFixedAssetsField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.MiscFixedAssetsTxtBox);
		CheckElementDisable(Sec_Summary.MiscFixedAssetsTxtBox);
		String text = driver.findElement(Sec_Summary.MiscFixedAssetsTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Misc Fixed Assets' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC009
	public boolean VerifyDatainVehiclesField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.VehiclesTxtBox);
		CheckElementDisable(Sec_Summary.VehiclesTxtBox);
		String text = driver.findElement(Sec_Summary.VehiclesTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Vehicles' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC010
	public boolean VerifyDatainCollateralSecurityField() throws InterruptedException {
		ElementDisplayed(Sec_Summary.CollateralSecurityTxtBox);
		CheckElementDisable(Sec_Summary.CollateralSecurityTxtBox);
		ScrollUntilElementVisible(Sec_Summary.CollateralSecurityTxtBox);
		Thread.sleep(1000);
		ScrollUP();
		String text = driver.findElement(Sec_Summary.CollateralSecurityTxtBox).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked the 'Collateral Security' field.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC011
	public boolean VerifyTotalAmountDisplay() throws InterruptedException {
		ElementDisplayed(Sec_Summary.TotalAmountText);
		CheckElementDisable(Sec_Summary.TotalAmountText);
		String text = driver.findElement(Sec_Summary.TotalAmountText).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked if Total Amount is displayed.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC012
	public boolean VerifyPersonalGuaranteePercentageDisplay() throws InterruptedException {
		ElementDisplayed(Sec_Summary.PersonalGuaranteePercentageText);
		CheckElementDisable(Sec_Summary.PersonalGuaranteePercentageText);
		String text = driver.findElement(Sec_Summary.PersonalGuaranteePercentageText).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked if Personal Guarantee percentage is displayed.");
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	// TC013
	public boolean VerifyCorporateGuaranteePercentageDisplay() throws InterruptedException {
		ElementDisplayed(Sec_Summary.CorporateGuaranteePercentageText);
		CheckElementDisable(Sec_Summary.CorporateGuaranteePercentageText);
		String text = driver.findElement(Sec_Summary.CorporateGuaranteePercentageText).getAttribute("title").toString();
		if(text!= null && text.length()>0)
		{
			ExtentTestManager.getTest().log(Status.PASS, "Checked if Corporate Guarantee percentage is displayed.");
			return true;
		}
		else
		{
			return false;
		}
		
	}

	// TC014
	public boolean ContinuetoDocumentUpload() throws InterruptedException {
		ElementDisplayed(Sec_Summary.SecuritySummaryContinueButton);
		ScrollUntilElementVisible(Sec_Summary.SecuritySummaryContinueButton);
		Thread.sleep(1000);
		ScrollUP();
		click(Sec_Summary.SecuritySummaryContinueButton);
		ExtentTestManager.getTest().log(Status.PASS, "Clicked on 'Continue'button.");
		ElementToBeVisible(Sec_Summary.DocumentUploadDetailssHeading);
		ElementDisplayed(Sec_Summary.DocumentUploadDetailssHeading);
		Log.info("Document Upload window is opened.");
		return true;
	}
	
}
