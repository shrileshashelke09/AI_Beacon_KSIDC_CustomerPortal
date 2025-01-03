package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Business_Entrepreneur_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Business_Entrepreneur_Details_Module extends Base_Class {

	Business_Entrepreneur_Details Business_Entrepreneur_Details = new Business_Entrepreneur_Details();
	// TC001

	public boolean login() throws InterruptedException, IOException {
            Login();
		return true;

	}

	// TC002
	public boolean BusinessEntrepreneurDetails() throws InterruptedException {
		click(Business_Entrepreneur_Details.ContinueButton);
		Log.info("Continue button clicked" + Business_Entrepreneur_Details.ContinueButton);
		Thread.sleep(2000);
		ElementDisplayed(Business_Entrepreneur_Details.BusinessEnterheader);
		Log.info("Business Entrepreneur Details window appears." + Business_Entrepreneur_Details.BusinessEnterheader);
		return true;
	}

	// TC003
	public boolean Header() {

		ElementDisplayed(Business_Entrepreneur_Details.BusinessEnterheader);
		Log.info("\"Business Entrepreneur Details\" Header is visible"
				+ Business_Entrepreneur_Details.BusinessEnterheader);
		return true;
	}

	// TC004

	public boolean VerifyMainText() {

		ElementDisplayed(Business_Entrepreneur_Details.MainText);
		Log.info("Main text visible" + Business_Entrepreneur_Details.MainText);
		return true;
	}

	public boolean SkipforNowvisibility() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.BusinessEnterheader);
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.SkipforNow);
		Log.info("Skip for Now displayed" + Business_Entrepreneur_Details.SkipforNow);
		return true;

	}

	public boolean ChecknextComponent() throws InterruptedException {

		click(Business_Entrepreneur_Details.SkipforNow);
		Thread.sleep(2000);
		ElementDisplayed(Business_Entrepreneur_Details.NextComp);
		Log.info("Next component displayed" + Business_Entrepreneur_Details.NextComp);
		return true;
	}

	public boolean AddEnterprebuttonvisibility() throws InterruptedException {

		ScrollUntilElementVisible(Business_Entrepreneur_Details.NextComp);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.accessbusinessenterpreneur);
		ElementToBeVisible(Business_Entrepreneur_Details.AddEnterpreneurButton);
		ElementDisplayed(Business_Entrepreneur_Details.AddEnterpreneurButton);
		Log.info("Button displayed" + Business_Entrepreneur_Details.AddEnterpreneurButton);
		return true;
	}

	public boolean ClickAddEnterprebutton() throws InterruptedException {
		click(Business_Entrepreneur_Details.AddEnterpreneurButton);
		Thread.sleep(1000);
		Log.info("Add Enterpreneur details button clicked" + Business_Entrepreneur_Details.AddEnterpreneurButton);
		return true;
	}

	public boolean SelectEnterpreneurName() throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnerpreneurName);
		Log.info("Enerpreneur Name data field displayed" + Business_Entrepreneur_Details.EnerpreneurName);
		click(Business_Entrepreneur_Details.EnerpreneurName);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.SelectEnterpreneurName);
		Thread.sleep(1000);
		Log.info("Enterpreneur Name selected" + Business_Entrepreneur_Details.SelectEnterpreneurName);
		return true;
	}

	public boolean EnterDetailsOfPresentActivities (String EnterDetailsofActivity) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterDetailsofActivity );
		Log.info("DetailsofActivity field displayed" + Business_Entrepreneur_Details.EnterDetailsofActivity );
		input(Business_Entrepreneur_Details.EnterDetailsofActivity , EnterDetailsofActivity);
		Thread.sleep(1000);
		Log.info(EnterDetailsofActivity);
		return true;
	}
	
	public boolean EnterNetWorth (String EnterNetworth) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterNetworth );
		Log.info("Net worth field displayed" + Business_Entrepreneur_Details.EnterNetworth );
		input(Business_Entrepreneur_Details.EnterNetworth , EnterNetworth);
		Thread.sleep(1000);
		Log.info(EnterNetworth);
		return true;
	}
	
	public boolean EnterLastYearIncome (String EnterLaseyearincome) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterLaseyearincome );
		Log.info("Last year income field displayed" + Business_Entrepreneur_Details.EnterLaseyearincome );
		input(Business_Entrepreneur_Details.EnterLaseyearincome , EnterLaseyearincome);
		Thread.sleep(1000);
		Log.info(EnterLaseyearincome);
		return true;
	}
	
	public boolean EnterFunds (String EnterFunds) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterFunds );
		Log.info("Last year income field displayed" + Business_Entrepreneur_Details.EnterFunds );
		input(Business_Entrepreneur_Details.EnterFunds , EnterFunds);
		Thread.sleep(1000);
		Log.info(EnterFunds);
		return true;
	}
	
	public boolean SelectYESforITR () throws InterruptedException {
		ScrollUntilElementVisible(Business_Entrepreneur_Details.EnerpreneurName );
		Thread.sleep(1000);
		ElementDisplayed(Business_Entrepreneur_Details.ITRYes);
		Log.info("ITR field displayed" + Business_Entrepreneur_Details.ITRYes);
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.ITRYes);
		Thread.sleep(1000);
		Log.info("ITR as YES selected" +Business_Entrepreneur_Details.ITRYes);
		return true;
		
	}
	public boolean ManagingOtherCompaniesfield() {

		ElementDisplayed(Business_Entrepreneur_Details.ManagingOherCompany);
		Log.info("\"Managing Any Other Companies\" section is available" + Business_Entrepreneur_Details.ManagingOherCompany);
		return true;
	}
	
	public boolean SelectYesasManagingOtherCompaniesfield() throws InterruptedException {

		click(Business_Entrepreneur_Details.ManagingOherCompany);
		Log.info("Radio button set to \"Yes\" and state is stored" + Business_Entrepreneur_Details.ManagingOherCompany);
		return true;
	}
	
	public boolean AddCompanyButtonvisibility() throws InterruptedException {

		ElementDisplayed(Business_Entrepreneur_Details.AddCompanyButton);
		Log.info("Add Company button displayed" + Business_Entrepreneur_Details.AddCompanyButton);
		return true;
	}
	
	public boolean ClickAddCompanyButton() throws InterruptedException {

		click(Business_Entrepreneur_Details.AddCompanyButton);
		Log.info("Add Company button clicked" + Business_Entrepreneur_Details.AddCompanyButton);
		return true;
	}
	
	public boolean EnterCompanyName (String EnterCompanyName) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterCompanyName );
		Log.info("Company name field displayed" + Business_Entrepreneur_Details.EnterCompanyName );
		input(Business_Entrepreneur_Details.EnterCompanyName , EnterCompanyName);
		Thread.sleep(1000);
		Log.info(EnterCompanyName);
		return true;
	}
	
	public boolean EnterProduct (String EnterProduct) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterProduct );
		Log.info("Product / service field displayed" + Business_Entrepreneur_Details.EnterProduct );
		input(Business_Entrepreneur_Details.EnterProduct , EnterProduct);
		Thread.sleep(1000);
		Log.info(EnterProduct);
		return true;
	}
	
	public boolean Enterfundinvestment (String Enterfundinvestment) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.Enterfundinvestment );
		Log.info("Total fund investment field displayed" + Business_Entrepreneur_Details.Enterfundinvestment );
		input(Business_Entrepreneur_Details.Enterfundinvestment , Enterfundinvestment);
		Thread.sleep(1000);
		Log.info(Enterfundinvestment);
		return true;
	}
	
	
	public boolean Entershareholding (String Entershareholding) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.Entershareholding );
		Log.info("Share holding field displayed" + Business_Entrepreneur_Details.Entershareholding );
		input(Business_Entrepreneur_Details.Entershareholding , Entershareholding);
		Thread.sleep(1000);
		Log.info(Entershareholding);
		return true;
	}
	
	public boolean EnterNetLoss (String EnterNetLoss) throws InterruptedException {
		ElementDisplayed(Business_Entrepreneur_Details.EnterNetLoss );
		Log.info("Net Loss field displayed" + Business_Entrepreneur_Details.EnterNetLoss );
		input(Business_Entrepreneur_Details.EnterNetLoss , EnterNetLoss);
		Thread.sleep(1000);
		Log.info(EnterNetLoss);
		return true;
	}
	
	public boolean Addcompanydetails () throws InterruptedException {
		
		ScrollUntilElementVisible(Business_Entrepreneur_Details.EnterProduct );
		Thread.sleep(1000);
		click(Business_Entrepreneur_Details.AddComapnyDetails );
		Thread.sleep(1000);
		Log.info("Comapny details added" + Business_Entrepreneur_Details.AddComapnyDetails );
		return true;
	}
	
	
}
