package com.Pages_BusinessInformation_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Other_Share_Pattern_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Other_Share_Pattern_Details_Module extends Base_Class {

	// TC001

	Other_Share_Pattern_Details Other_Share_Pattern_Details = new Other_Share_Pattern_Details();

	public boolean Login(String EnterEmailAddress, String EnterPassword) throws InterruptedException {

		click(Other_Share_Pattern_Details.LoginButton);
		Log.info("Login button Clicked" + Other_Share_Pattern_Details.LoginButton);
		Thread.sleep(2000);
		input(Other_Share_Pattern_Details.EnterEmailAddress, EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Other_Share_Pattern_Details.EnterPassword, EnterPassword);
		Log.info(EnterPassword);
		click(Other_Share_Pattern_Details.ClicktoLogin);
		Log.info("Login button clickd" + Other_Share_Pattern_Details.ClicktoLogin);
		Thread.sleep(2000);
		click(Other_Share_Pattern_Details.ContinueButton);
		Log.info("Successfully Logged in" + Other_Share_Pattern_Details.ContinueButton);
		return true;

	}

	public boolean AccessOtherSharePatternPage() throws InterruptedException {

		ScrollUntilElementVisible(Other_Share_Pattern_Details.Scrolltobasic);
		Thread.sleep(1000);
		click(Other_Share_Pattern_Details.EnterpreneurDetailsModule);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Other_Share_Pattern_Details.ScrolltoEnterpreneurHeader);
		Thread.sleep(1000);
		click(Other_Share_Pattern_Details.OtherPattern);
		Log.info("Navigated to 'Other Share Pattern Details'" + Other_Share_Pattern_Details.OtherPattern);
		return true;
	}

	public boolean OtheraPatternHeading() throws InterruptedException {

		ElementDisplayed(Other_Share_Pattern_Details.OtherPatternHeading);
		Thread.sleep(1000);
		Log.info("Header displayed" + Other_Share_Pattern_Details.OtherPatternHeading);
		return true;
	}

	public boolean EnterNoOnNonMajorShareHolders(String NoOnNonMajorShareHolders) throws InterruptedException {
		ElementDisplayed(Other_Share_Pattern_Details.NoOnNonMajorShareHolders);
		Log.info("Field is available" + Other_Share_Pattern_Details.NoOnNonMajorShareHolders);
		input(Other_Share_Pattern_Details.NoOnNonMajorShareHolders, NoOnNonMajorShareHolders);
		Thread.sleep(1000);
		Log.info(NoOnNonMajorShareHolders);
		return true;
	}

	public boolean EnterPercentageOfShareHolded(String PercentageOfShareHolded) throws InterruptedException {
		ElementDisplayed(Other_Share_Pattern_Details.PercentageOfShareHolded);
		Log.info("Field is available" + Other_Share_Pattern_Details.PercentageOfShareHolded);
		input(Other_Share_Pattern_Details.PercentageOfShareHolded, PercentageOfShareHolded);
		Thread.sleep(1000);
		Log.info(PercentageOfShareHolded);
		return true;
	}

	public boolean CancelButtonPresence() throws InterruptedException {

		ElementDisplayed(Other_Share_Pattern_Details.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Other_Share_Pattern_Details.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Other_Share_Pattern_Details.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Other_Share_Pattern_Details.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Other_Share_Pattern_Details.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Other_Share_Pattern_Details.SaveAndProceed);
		return true;
	}

	public boolean ContinueButtonPresence() throws InterruptedException {

		ElementDisplayed(Other_Share_Pattern_Details.Continue);
		Thread.sleep(1000);
		Log.info("Continue Button present" + Other_Share_Pattern_Details.Continue);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Other_Share_Pattern_Details.SaveAsDraftButton);
		Thread.sleep(1000);
		click(Other_Share_Pattern_Details.ClickOK);
		Thread.sleep(1000);
		ElementDisplayed(Other_Share_Pattern_Details.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed."
				+ Other_Share_Pattern_Details.Successpopup);
		return true;
	}

	public boolean ClickonSaveAndProceed() throws InterruptedException {

		click(Other_Share_Pattern_Details.SaveAndProceed);
		Thread.sleep(1000);
		click(Other_Share_Pattern_Details.ClickOK);
		Thread.sleep(1000);
		ElementDisplayed(Other_Share_Pattern_Details.Successpopup);
		Thread.sleep(1000);
		Log.info("saved successfully and success message is displayed." + Other_Share_Pattern_Details.Successpopup);
		ElementDisplayed(Other_Share_Pattern_Details.UpdateAndProceed);
		Thread.sleep(1000);
		Log.info("Button text changes to \"Update and Proceed\"." + Other_Share_Pattern_Details.UpdateAndProceed);
		return true;
	}
	
	public boolean ClicknonContinue () throws InterruptedException {
		
		click(Other_Share_Pattern_Details.Continue);
		Thread.sleep(1000);
		Log.info("User is redirected to the next component."+ Other_Share_Pattern_Details.Continue);
		return true;
	}

}
