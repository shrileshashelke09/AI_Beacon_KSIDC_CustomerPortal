package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Page_Repositary.Security_Corporate_Guarantee;
import com.Page_Repositary.Security_Misc_Fixed_Assets;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Corporate_Guarantee_Module extends Base_Class{

	Security_Corporate_Guarantee Sec_Corp_Gaurantee = new Security_Corporate_Guarantee();
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		click(Sec_Corp_Gaurantee.ContinueButton);
		Log.info("Login successfull");
		return true;

	}

	// TC002

	public boolean VerifySecurityStageAccess() throws InterruptedException {
		
		ScrollUntilElementVisible(Sec_Corp_Gaurantee.SecurtiyStageActive);
		ElementToBeVisible(Sec_Corp_Gaurantee.SecurtiyStageActive);
		Log.info("User is navigated to the Security stage." + Sec_Corp_Gaurantee.SecurtiyStageActive);
		return true;
	}

	// TC003
	public boolean OpenCorporateGuaranteeComponent() throws InterruptedException {
		
		ElementToBeVisible(Sec_Corp_Gaurantee.SecurityCorporateGuaranteetButton);
		ElementDisplayed(Sec_Corp_Gaurantee.SecurityCorporateGuaranteetButton);
		Log.info("Security Corporate Gaurantee Details component  component is visible." + Sec_Corp_Gaurantee.SecurityCorporateGuaranteetButton);
		click(Sec_Corp_Gaurantee.SecurityCorporateGuaranteetButton);
		ElementDisplayed(Sec_Corp_Gaurantee.CorporateGuaranteeDetailssHeading);
		Log.info("Corporate Guarantee Details page is opened." + Sec_Corp_Gaurantee.CorporateGuaranteeDetailssHeading);
		return true;
	}

	// TC004
	public boolean OpenAddDetailsPage() throws InterruptedException {
//		ScrollUntilElementVisible(Sec_Misc_Fixed_Asset.ListOfMiscFixedAssetButton);
		click(Sec_Corp_Gaurantee.AddDetailsButton);
		ExtentTestManager.getTest().log(Status.PASS, "Clicked on the 'Add Details' option" + Sec_Corp_Gaurantee.AddDetailsButton);
		ElementDisplayed(Sec_Corp_Gaurantee.EntityNameDropDown);
		ElementDisplayed(Sec_Corp_Gaurantee.ShareValueTxtBox);
		ElementDisplayed(Sec_Corp_Gaurantee.ShareValueTxtBox);
		Log.info("Add Details page is opened and Entity Name Drop Down box and Share text box is visible and disable.");
		Thread.sleep(2000);
		return true;
	}

	// TC005
	public boolean SelectEntityfromDropdown () throws InterruptedException {
		Thread.sleep(1000);
		ScrollUP();
		ElementDisplayed(Sec_Corp_Gaurantee.EntityNameDropDown);
		click(Sec_Corp_Gaurantee.EntityNameDropDown);
		Log.info("Clicked on 'Entity Name' dropdown" + Sec_Corp_Gaurantee.EntityNameDropDown);
		ElementDisplayed(Sec_Corp_Gaurantee.EntityNameDropDownValue_KERALA_INSTITUTE123);
		String dropdownValue = driver.findElement(Sec_Corp_Gaurantee.EntityNameDropDownValue_KERALA_INSTITUTE123).getText();
		click(Sec_Corp_Gaurantee.EntityNameDropDownValue_KERALA_INSTITUTE123);
		Log.info(" Selected an Entity from the list " + Sec_Corp_Gaurantee.EntityNameDropDownValue_KERALA_INSTITUTE123);
		String SelectedDropdownValue = driver.findElement(Sec_Corp_Gaurantee.EntityNameDropDownValueSelected).getText();
		if(dropdownValue.equals(SelectedDropdownValue))
		{
			Log.info("The selected Entity is displayed in the 'Entity Name' field" );
		}
		else
		{
			Log.info("The selected Entity is not displayed in the 'Entity Name' field" );
		}
		
		return true;
	}
	
	// TC006
	public boolean VerifyAutoFilledShareField () throws InterruptedException {
			
			ElementDisplayed(Sec_Corp_Gaurantee.ShareValueTxtBox);
			CheckElementDisable(Sec_Corp_Gaurantee.ShareValueTxtBox);
			String autoFillShareValue = driver.findElement(Sec_Corp_Gaurantee.ShareValueTxtBox).getText();
			if(autoFillShareValue.length()>0)
			{
				Log.info("Share field is auto-filled correctly with share percentage");
			}
			else
			{
				Log.info("Share field is not auto-filled");
			}
			return true;
	}
	
	// TC007
	public boolean SaveandVerifyEntityinGrid () throws InterruptedException {

				ElementToBeVisible(Sec_Corp_Gaurantee.SaveAndProceedButton);
				click(Sec_Corp_Gaurantee.SaveAndProceedButton);
				Log.info("SaveAndProceedButton clicked successfully.");
				ElementToBeVisible(Sec_Corp_Gaurantee.TotalShareGridValue);
				ElementDisplayed(Sec_Corp_Gaurantee.TotalShareGridValue);
				Thread.sleep(1000);
				Log.info("Newly added entity in grid is displayed " + Sec_Corp_Gaurantee.TotalShareGridValue);
				return true;
	}
	
	// TC008
		public boolean NavigatetoPersonalGuarantee () throws InterruptedException {
				
				ElementToBeVisible(Sec_Corp_Gaurantee.CorporateGauranteeContinueButton);
				ScrollUntilElementVisible(Sec_Corp_Gaurantee.CorporateGauranteeContinueButton);
				Thread.sleep(1000);
				ScrollUP();
				ElementDisplayed(Sec_Corp_Gaurantee.CorporateGauranteeContinueButton);
				Log.info("continue button in 'Corporate Gaurantee' Page is displayed " + Sec_Corp_Gaurantee.CorporateGauranteeContinueButton);
				click(Sec_Corp_Gaurantee.CorporateGauranteeContinueButton);
				Log.info("clicked on continue button in 'Corporate Gaurantee Details' Page");
				ElementDisplayed(Sec_Corp_Gaurantee.PersonalGuaranteeDetailssHeading);
				Log.info("Personal Guarantee Detailss Heading is displayed.");
				return true;
		}
	
	
}
