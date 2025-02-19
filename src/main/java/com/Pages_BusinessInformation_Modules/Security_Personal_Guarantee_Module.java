package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Page_Repositary.Security_Corporate_Guarantee;
import com.Page_Repositary.Security_Misc_Fixed_Assets;
import com.Page_Repositary.Security_Personal_Guarantee;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Personal_Guarantee_Module extends Base_Class{

	Security_Personal_Guarantee Sec_per_Guarantee = new Security_Personal_Guarantee();
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		click(Sec_per_Guarantee.ContinueButton);
		Log.info("Login successfull");
		return true;

	}

	// TC002

	public boolean VerifySecurityStageAccess() throws InterruptedException {
		
		ScrollUntilElementVisible(Sec_per_Guarantee.SecurtiyStageActive);
		ElementToBeVisible(Sec_per_Guarantee.SecurtiyStageActive);
		Log.info("User is navigated to the Security stage." + Sec_per_Guarantee.SecurtiyStageActive);
		return true;
	}

	// TC003
	public boolean OpenPersonalGuaranteeComponent() throws InterruptedException {
		
		ElementToBeVisible(Sec_per_Guarantee.SecurityPersonalGuaranteetButton);
		ElementDisplayed(Sec_per_Guarantee.SecurityPersonalGuaranteetButton);
		Log.info("Security Personal Guarantee Details component  component is visible." + Sec_per_Guarantee.SecurityPersonalGuaranteetButton);
		click(Sec_per_Guarantee.SecurityPersonalGuaranteetButton);
		ElementDisplayed(Sec_per_Guarantee.PersonalGuaranteeDetailsHeading);
		Log.info("Personal Guarantee Details page is opened." + Sec_per_Guarantee.PersonalGuaranteeDetailsHeading);
		return true;
	}

	// TC004
	public boolean OpenAddDetailsPage() throws InterruptedException {
//		ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.ListOfMiscFixedAssetButton);
		click(Sec_per_Guarantee.AddDetailsButton);
		ExtentTestManager.getTest().log(Status.PASS, "Clicked on the 'Add Details' option" + Sec_per_Guarantee.AddDetailsButton);
		ElementDisplayed(Sec_per_Guarantee.EntrepreneursNameDropDown);
		ScrollUntilElementVisible(Sec_per_Guarantee.EntrepreneursNameDropDown);
		ScrollUP();
		ElementDisplayed(Sec_per_Guarantee.AgeTxtBox);
		ElementDisplayed(Sec_per_Guarantee.ShareValueTxtBox);
		ElementDisplayed(Sec_per_Guarantee.NetWorthValueTxtBox);
		Log.info("Add Details page is opened and Entrepreneurs Name Drop Down box, Age Text Box, Share Text Box, and Net Worth Text Box is visible.");
		Thread.sleep(2000);
		return true;
	}

	// TC005
	public boolean SelectEntrepreneurfromDropdown () throws InterruptedException {
		Thread.sleep(1000);
		ScrollUP();
		ElementDisplayed(Sec_per_Guarantee.EntrepreneursNameDropDown);
		click(Sec_per_Guarantee.EntrepreneursNameDropDown);
		Log.info("Clicked on 'Entrepreneurs Name' dropdown" + Sec_per_Guarantee.EntrepreneursNameDropDown);
		ElementDisplayed(Sec_per_Guarantee.EntrepreneursNameDropDownValue_HEMLATA_HEGDE);
		String dropdownValue = driver.findElement(Sec_per_Guarantee.EntrepreneursNameDropDownValue_HEMLATA_HEGDE).getText();
		click(Sec_per_Guarantee.EntrepreneursNameDropDownValue_HEMLATA_HEGDE);
		Log.info(" Selected an Entrepreneur from the list " + Sec_per_Guarantee.EntrepreneursNameDropDownValue_HEMLATA_HEGDE);
		String SelectedDropdownValue = driver.findElement(Sec_per_Guarantee.Selected_EntrepreneursNameDropDownValue).getText();
		if(dropdownValue.equals(SelectedDropdownValue))
		{
			Log.info("The selected Entity is displayed in the 'Entity Name' field" );
		}
		else
		{
			Log.info("The selected Entity is not displayed in the 'Entity Name' field" );
			return false;
		}
		
		return true;
	}
	
	// TC006
	public boolean VerifyAgeFieldisDisabled () throws InterruptedException {
			
			ElementDisplayed(Sec_per_Guarantee.AgeTxtBox);
			CheckElementDisable(Sec_per_Guarantee.AgeTxtBox);
			
			String autoFillShareValue = driver.findElement(Sec_per_Guarantee.AgeTxtBox).getAttribute("title").toString();
			System.out.println(autoFillShareValue);
			if(autoFillShareValue.length()>0)
			{
				Log.info("Age field is auto-filled correctly with share percentage");
			}
			else
			{
				Log.info("Age field is not auto-filled");
				return false;
			}
			try
			{
				input(Sec_per_Guarantee.AgeTxtBox, "10");
				Log.info("Age field is editable");
				return false;
			}
			catch(Exception e)
			{
				Log.info("Age field is not editable");
			}
			return true;
	}
	
	// TC007
	public boolean VerifyShareFieldisDisabled () throws InterruptedException {
			
			ElementDisplayed(Sec_per_Guarantee.ShareValueTxtBox);
			CheckElementDisable(Sec_per_Guarantee.ShareValueTxtBox);
			String autoFillShareValue = driver.findElement(Sec_per_Guarantee.ShareValueTxtBox).getAttribute("title").toString();
			System.out.println(autoFillShareValue);
			if(autoFillShareValue.length()>0)
			{
				Log.info("Share field is auto-filled correctly with share percentage");
			}
			else
			{
				Log.info("Share field is not auto-filled");
				return false;
			}
			try
			{
				input(Sec_per_Guarantee.AgeTxtBox, "10");
				Log.info("Share field is editable");
				return false;
			}
			catch(Exception e)
			{
				Log.info("Share field is not editable");
			}
			return true;
	}
	
	//TC008
	public boolean VerifyNetWorthFieldisDisabled () throws InterruptedException {
		
		ElementDisplayed(Sec_per_Guarantee.NetWorthValueTxtBox);
//		ElementDisplayed(Sec_per_Guarantee.NetWorthValueTxtBox);
		CheckElementDisable(Sec_per_Guarantee.NetWorthValueTxtBox);
		String autoFillShareValue = driver.findElement(Sec_per_Guarantee.NetWorthValueTxtBox).getAttribute("title").toString();
		System.out.println(autoFillShareValue);
		if(autoFillShareValue.length()>0)
		{
			Log.info("Net Worth field is auto-filled correctly with share percentage");
		}
		else
		{
			Log.info("Net Worth field is not auto-filled");
			return false;
		}
		try
		{
			input(Sec_per_Guarantee.AgeTxtBox, "10");
			Log.info("Net Worth field is editable");
			return false;
		}
		catch(Exception e)
		{
			Log.info("Net Worth field is not editable");
		}
		return true;
}
	
	// TC009
	public boolean SaveandVerifyEntityinGrid () throws InterruptedException {

				ElementToBeVisible(Sec_per_Guarantee.SaveAndProceedButton);
				ScrollUntilElementVisible(Sec_per_Guarantee.SaveAndProceedButton);
				ScrollUP();
				click(Sec_per_Guarantee.SaveAndProceedButton);
				Log.info("Save And Proceed Button clicked successfully.");
				ElementToBeVisible(Sec_per_Guarantee.TotalShareGridValue);
				ScrollUntilElementVisible(Sec_per_Guarantee.TotalShareGridValue);
				Thread.sleep(1000);
				
				ElementDisplayed(Sec_per_Guarantee.TotalShareGridValue);
				ElementDisplayed(Sec_per_Guarantee.TotalNetWorthGridValue);
				ElementDisplayed(Sec_per_Guarantee.TotalNetWorthGridValue);
				Thread.sleep(1000);
				Log.info("Entity is saved and displayed in the Grid ");
				return true;
	}
	
	// TC010
		public boolean NavigatetoCollateralSecurity () throws InterruptedException {
				
				ElementToBeVisible(Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				ScrollUntilElementVisible(Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				Thread.sleep(1000);
				ScrollUP();
				ElementDisplayed(Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				ScrollUntilElementVisible(Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				ScrollUP();
				Log.info("continue button in 'Personal Guarantee' Page is displayed " + Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				click(Sec_per_Guarantee.PersonalGuaranteeContinueButton);
				Log.info("clicked on continue button in 'Personal Guarantee Details' Page");
				ElementDisplayed(Sec_per_Guarantee.CollateralSecurityDetailssHeading);
				Log.info("Collateral Security Details Heading is displayed.");
				return true;
		}
	
	
}
