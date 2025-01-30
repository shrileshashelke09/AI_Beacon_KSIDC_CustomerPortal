package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Land;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Land_Module extends Base_Class {

	Land Land = new Land();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Land.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Land.ScrolltoStep4);
		return true;
	}

	public boolean VerifyLandComponen() throws InterruptedException {
		ScrollUntilElementVisible(Land.ScrolltoStep4);
		Thread.sleep(1000);
		ElementDisplayed(Land.LandComponent);
		Thread.sleep(1000);
		Log.info("Land  component is visible." + Land.LandComponent);
		return true;
	}

	public boolean AccessLandComponent() throws InterruptedException {
		ScrollUntilElementVisible(Land.ScrolltoStep4);
		Thread.sleep(1000);
		click(Land.LandComponent);
		Thread.sleep(1000);
		Log.info("Land  component is accessable." + Land.LandComponent);
		return true;
	}

	public boolean VerifyLandHeader() throws InterruptedException {

		ElementDisplayed(Land.LandHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Land.LandHeader);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Land.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Land.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		ScrollUntilElementVisible(Land.ScrolltoStep4);
		Thread.sleep(1000);
		click(Land.LandComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Land.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Land.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Land.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Land.AddDetails);
		return true;
	}

	public boolean EnterTitleHolder(String EnterTitleHolder) throws InterruptedException {

		input(Land.EnterTitleHolder, EnterTitleHolder);
		Thread.sleep(1000);
		Log.info(EnterTitleHolder);
		return true;
	}

	public boolean EnterEnterDocNo(String EnterDocNo) throws InterruptedException {

		input(Land.EnterDocNo, EnterDocNo);
		Thread.sleep(1000);
		Log.info(EnterDocNo);
		return true;
	}

	public boolean EnterSurveyNo(String EnterSurveyNo) throws InterruptedException {

		input(Land.EnterSurveyNo, EnterSurveyNo);
		Thread.sleep(1000);
		Log.info(EnterSurveyNo);
		return true;
	}

	public boolean EnterResurveyNo(String EnterResurveyNo) throws InterruptedException {

		input(Land.EnterResurveyNo, EnterResurveyNo);
		Thread.sleep(1000);
		Log.info(EnterResurveyNo);
		return true;
	}

	public boolean EnterExtendOfLandDRY(String EnterExtendOfLandDRY) throws InterruptedException {

		input(Land.EnterExtendOfLandDRY, EnterExtendOfLandDRY);
		Thread.sleep(1000);
		Log.info(EnterExtendOfLandDRY);
		return true;
	}

	public boolean EnterExtendOfLand(String EnterExtendOfLand) throws InterruptedException {

		input(Land.EnterExtendOfLand, EnterExtendOfLand);
		Thread.sleep(1000);
		Log.info(EnterExtendOfLand);
		return true;
	}

	public boolean SelectUnit() throws InterruptedException {

		ScrollUntilElementVisible(Land.EnterDocNo);
		Thread.sleep(1000);
		click(Land.Unit);
		Thread.sleep(1000);
		click(Land.SelectUnit);
		Log.info("Unit selected" + Land.SelectUnit);
		return true;
	}

	public boolean EnterPincode(String EnterPinCode) throws InterruptedException {

		input(Land.EnterPinCode, EnterPinCode);
		Thread.sleep(1000);
		Log.info(EnterPinCode);
		click(Land.PinLabel);
		Thread.sleep(1000);
		return true;
	}

	public boolean ValidateState() throws InterruptedException {
		WebElement AutoloadedState = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[1]"));
		Thread.sleep(1000);
		String ABC = AutoloadedState.getAttribute("title");
		if (ABC.equals(AutoloadedState.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedState.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded State displyed" + AutoloadedState.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDistrict() throws InterruptedException {
		WebElement AutoloadedDistrict = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedDistrict.getAttribute("title");
		if (ABC.equals(AutoloadedDistrict.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDistrict.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded District displyed" + AutoloadedDistrict.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidatePost() throws InterruptedException {
		WebElement AutoloadedPost = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[3]"));
		Thread.sleep(1000);
		String ABC = AutoloadedPost.getAttribute("title");
		if (ABC.equals(AutoloadedPost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPost.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Post displyed" + AutoloadedPost.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean SelectCity() throws InterruptedException {
		click(Land.City);
		Thread.sleep(1000);
		click(Land.SelectCity);
		Log.info("City selected" + Land.SelectCity);
		return true;
	}

	public boolean EnterPlace(String EnterPlace) throws InterruptedException {

		input(Land.EnterPlace, EnterPlace);
		Thread.sleep(1000);
		Log.info(EnterPlace);
		Thread.sleep(1000);
		return true;
	}
	
	public boolean EnterVillage(String EnterVillage) throws InterruptedException {

		input(Land.EnterVillage, EnterVillage);
		Thread.sleep(1000);
		Log.info(EnterVillage);
		Thread.sleep(1000);
		return true;
	}
	
	public boolean EnterTaluk(String EnterTaluk) throws InterruptedException {

		input(Land.EnterTaluk, EnterTaluk);
		Thread.sleep(1000);
		Log.info(EnterTaluk);
		Thread.sleep(1000);
		return true;
	}
	
	public boolean SelectPanchayat() throws InterruptedException {

		ScrollUntilElementVisible(Land.City);
		Thread.sleep(1000);
		click(Land.Panchayat);
		Thread.sleep(1000);
		click(Land.SelectPanchayat);
		Log.info("Panchayat selected" + Land.SelectPanchayat);
		return true;
	}
	
	public boolean SelectConstituency() throws InterruptedException {

		click(Land.Constituency);
		Thread.sleep(1000);
		click(Land.SelectConstituency);
		Log.info("Constituency selected" + Land.SelectConstituency);
		return true;
	}
	
	public boolean EnterCostOfLandIncludingRegistration(String EnterCostOfLandIncludingRegistration) throws InterruptedException {

		input(Land.EnterCostOfLandIncludingRegistration, EnterCostOfLandIncludingRegistration);
		Thread.sleep(1000);
		Log.info(EnterCostOfLandIncludingRegistration);
		Thread.sleep(1000);
		return true;
	}
	
	public boolean EnterRegistrationAmount(String EnterRegistrationAmount) throws InterruptedException {

		input(Land.EnterRegistrationAmount, EnterRegistrationAmount);
		Thread.sleep(1000);
		Log.info(EnterRegistrationAmount);
		Thread.sleep(1000);
		return true;
	}
	
	public boolean CancelButtonPresence() throws InterruptedException {

		ElementDisplayed(Land.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Land.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Land.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Land.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Land.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Land.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Land.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Land.Successpopup);
		ElementDisplayed(Land.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed."
				+ Land.Successpopup);
		return true;
	}
	
public boolean UpdateAndProceed () throws InterruptedException {
		
		click(Land.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Land.City);
		Thread.sleep(1000);
		click(Land.UpdateAndProceed);
		Log.info("Data saved" + Land.UpdateAndProceed);
		ElementDisplayed(Land.Successpopup);
		Log.info("Data is saved successfully and success message is displayed."+ Land.Successpopup);
		return true;		
	}
	
	public boolean DatainGrid () {
		
		ElementDisplayed(Land.AddedEnteredData);
		Log.info("Data displayed in grid" + Land.AddedEnteredData);
		return true;
	}
	
public boolean ValidateContinuebutton () throws InterruptedException {
		
		ScrollUntilElementVisible(Land.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Land.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Land.ClickContinue);
		return true;
	}

public boolean clicktocontinue () throws InterruptedException {
	
	click(Land.ClickContinue);
	Thread.sleep(3000);
	Log.info("Process continued"+ Land.ClickContinue);
	return true;
}

	
}
