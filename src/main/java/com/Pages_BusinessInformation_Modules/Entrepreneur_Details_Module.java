package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Entrepreneur_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Entrepreneur_Details_Module extends Base_Class {

	Entrepreneur_Details Entrepreneur_Details = new Entrepreneur_Details();
	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		click(Entrepreneur_Details.ContinueButton);
		Log.info("Continue button clicked" + Entrepreneur_Details.ContinueButton);
		Thread.sleep(2000);
		return true;

	}

	// TC002
	public boolean EntrepreneurDetails() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.Scrolltobasic);
		click(Entrepreneur_Details.EnterpreneurDetailsModule);
		Thread.sleep(1000);
		// click(Entrepreneur_Details.EnterpreneurDetails);
		Log.info("Entrepreneur Details window appears." + Entrepreneur_Details.EnterpreneurDetailsModule);
		return true;
	}

	public boolean EntrepreneurDetailsHeader() {

		ElementDisplayed(Entrepreneur_Details.EntrepreneurDetailsHeader);
		Log.info("Entrepreneur Details Header displayed" + Entrepreneur_Details.EntrepreneurDetailsHeader);
		return true;
	}

	// TC005
	public boolean TextInMainWinow() {

		ElementDisplayed(Entrepreneur_Details.TextinMainWindow);
		Log.info("Text from main window displayed" + Entrepreneur_Details.TextinMainWindow);
		return true;
	}

	// TC006

	public boolean CheckSkipForNow() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.TextinMainWindow);
		ElementDisplayed(Entrepreneur_Details.SkipForNow);
		Log.info("Skip for Now located" + Entrepreneur_Details.SkipForNow);
		click(Entrepreneur_Details.SkipForNow);
		Log.info("Skip for Now clicked" + Entrepreneur_Details.SkipForNow);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.SkippedElement);
		Thread.sleep(1000);
		click(Entrepreneur_Details.EnterpreneurDetailsModule);
		Thread.sleep(1000);
		return true;

	}

	// TC008

	public boolean CheckAddEnterpreneurButton() {

		ElementDisplayed(Entrepreneur_Details.AddEntrepreneur);
		Log.info("Add Entrepreneur button displayed" + Entrepreneur_Details.AddEntrepreneur);
		return true;
	}

	// TC009

	public boolean ClickAddEnterpreneurButton() throws InterruptedException {

		click(Entrepreneur_Details.AddEntrepreneur);
		Thread.sleep(3000);
		Log.info("Add Entrepreneur button clicked" + Entrepreneur_Details.AddEntrepreneur);
		return true;
	}

	// TC010

	public boolean CheckKYCSectionAvailability() {

		ElementDisplayed(Entrepreneur_Details.KYCSectionAvailability);
		Log.info("KYC Section displayed" + Entrepreneur_Details.KYCSectionAvailability);
		return true;
	}

	// TC012

	public boolean EnterAadhar(String EnterAadhar) throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EntrepreneurDetailsHeader);
		input(Entrepreneur_Details.EnterAadhar, EnterAadhar);
		Thread.sleep(1000);
		Log.info(EnterAadhar);
		return true;
	}

	public boolean EnterPAN(String EnterPAN) throws InterruptedException {
		input(Entrepreneur_Details.EnterPAN, EnterPAN);
		Thread.sleep(1000);
		Log.info(EnterPAN);
		return true;
	}

	// TC013
	public boolean CheckDedupebuttonAvailability() {

		ElementDisplayed(Entrepreneur_Details.CheckDedupeButtonAvailability);
		Log.info("Button is present." + Entrepreneur_Details.CheckDedupeButtonAvailability);
		return true;
	}

	// TC015

	public boolean ClickCheckDedupeButton() throws InterruptedException {

		click(Entrepreneur_Details.CheckDedupeButtonAvailability);
		Log.info("Button clicked" + Entrepreneur_Details.CheckDedupeButtonAvailability);
		ElementToBeVisible(Entrepreneur_Details.Successfulpopup);
		return true;
	}

	public boolean Checksucessmessage() throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.Successfulpopup);
		Thread.sleep(1000);
		Log.info("Success message: \"Dedupe Verified Successfully\".");
		Thread.sleep(1000);
		return true;

	}
	// TC016

	public boolean EnterDOB(String EnterDOB) throws InterruptedException {

		input(Entrepreneur_Details.EnterDOB, EnterDOB);
		Thread.sleep(1000);
		Log.info(EnterDOB);
		return true;
	}

	// TC017

	public boolean EnterMobile(String EnterMobile) throws InterruptedException {

		input(Entrepreneur_Details.EnterMobile, EnterMobile);
		Thread.sleep(1000);
		Log.info(EnterMobile);
		return true;
	}

	// TC018

	public boolean EnterEmail(String EnterEmail) throws InterruptedException {
		input(Entrepreneur_Details.EnterEmail, EnterEmail);
		Thread.sleep(1000);
		Log.info(EnterEmail);
		return true;
	}

	// TC019

	public boolean EnterfirstName(String EnterFirstName) throws InterruptedException {
		input(Entrepreneur_Details.EnterFirstName, EnterFirstName);
		Thread.sleep(1000);
		Log.info(EnterFirstName);
		return true;
	}

	public boolean EnterMiddleName(String EnterMiddleName) throws InterruptedException {
		input(Entrepreneur_Details.EnterMiddleName, EnterMiddleName);
		Thread.sleep(1000);
		Log.info(EnterMiddleName);
		return true;
	}

	public boolean EnterLastName(String EnterLastName) throws InterruptedException {
		input(Entrepreneur_Details.EnterLastName, EnterLastName);
		Thread.sleep(1000);
		Log.info(EnterLastName);
		click(Entrepreneur_Details.LastnameLabel);
		Thread.sleep(1000);
		return true;
	}

	public boolean ValidateFullName() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EnterDOB);
		Thread.sleep(1000);
		WebElement AutoloadedFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		System.out.println("Autoloaded Full Name displyed" + AutoloadedFullName.getAttribute("title"));

		String ABC = AutoloadedFullName.getAttribute("title");
		if (ABC.equals(AutoloadedFullName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedFullName.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateAge() throws InterruptedException {
		WebElement AutoloadedAge = driver.findElement(
				By.xpath("//span[@class='rz-spinner rz-state-disabled valid rz-text-align-left form-control ']"));
		System.out.println("Autoloaded Age displyed" + AutoloadedAge.getAttribute("title"));

		String ABC = AutoloadedAge.getAttribute("title");
		if (ABC.equals(AutoloadedAge.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAge.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean SelectGender() throws InterruptedException {

		click(Entrepreneur_Details.Gender);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectGender);
		Log.info("gender selected" + Entrepreneur_Details.SelectGender);
		return true;

	}

	public boolean SelectDesignation() throws InterruptedException {
		click(Entrepreneur_Details.Designation);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectDesignation);
		Log.info("gender selected" + Entrepreneur_Details.SelectDesignation);
		return true;
	}

	public boolean ValidateChangeAddressCheckbox() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EnterAge);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.ChangeAddresscheckbox);
		Thread.sleep(1000);
		Log.info("Change Address checkbox displayed" + Entrepreneur_Details.ChangeAddresscheckbox);
		return true;
	}

	public boolean EnterAddress1(String EnterAddress1) throws InterruptedException {

		input(Entrepreneur_Details.EnterAddress1, EnterAddress1);
		Thread.sleep(1000);
		Log.info(EnterAddress1);
		return true;
	}

	public boolean EnterAddress2(String EnterAddress2) throws InterruptedException {
		input(Entrepreneur_Details.EnterAddress2, EnterAddress2);
		Thread.sleep(1000);
		Log.info(EnterAddress2);
		return true;
	}

	public boolean EnterAddress3(String EnterAddress3) throws InterruptedException {
		input(Entrepreneur_Details.EnterAddress3, EnterAddress3);
		Thread.sleep(1000);
		Log.info(EnterAddress3);
		return true;
	}

	public boolean EnterLandmark(String Landmark) throws InterruptedException {
		input(Entrepreneur_Details.Landmark, Landmark);
		Thread.sleep(1000);
		Log.info(Landmark);
		return true;
	}

	public boolean EnterPlace(String Place) throws InterruptedException {
		input(Entrepreneur_Details.Place, Place);
		Thread.sleep(1000);
		Log.info(Place);
		return true;
	}

	public boolean SelectCountry() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EnterAddress3);
		Thread.sleep(1000);
		click(Entrepreneur_Details.Country);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectCountry);
		Log.info("Country selected" + Entrepreneur_Details.SelectCountry);
		return true;
	}

	public boolean SelectState() throws InterruptedException {
		click(Entrepreneur_Details.State);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectState);
		Log.info("State selected" + Entrepreneur_Details.SelectState);
		return true;
	}

	public boolean SelectDistrict() throws InterruptedException {
		click(Entrepreneur_Details.District);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectDistrict);
		Log.info("District selected" + Entrepreneur_Details.SelectDistrict);
		return true;
	}

	public boolean SelectCity() throws InterruptedException {
		click(Entrepreneur_Details.City);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectCity);
		Log.info("City selected" + Entrepreneur_Details.SelectCity);
		return true;
	}

	public boolean SelectPost() throws InterruptedException {
		click(Entrepreneur_Details.Post);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectPost);
		Log.info("Post selected" + Entrepreneur_Details.SelectPost);
		return true;
	}

	public boolean SelectTaluk() throws InterruptedException {
		click(Entrepreneur_Details.Taluk);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectTaluk);
		Log.info("Taluk selected" + Entrepreneur_Details.SelectTaluk);
		return true;
	}

	public boolean ChecktheBoxforAddress() throws InterruptedException {
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.PermanentAddressCheckbox);
		Thread.sleep(1000);
		Log.info("Checkbox displayed" + Entrepreneur_Details.PermanentAddressCheckbox);
		return true;
	}

	public boolean ClickCheckbox() throws InterruptedException {

		click(Entrepreneur_Details.PermanentAddressCheckbox);
		Thread.sleep(1000);
		Log.info("Checkbox checked" + Entrepreneur_Details.PermanentAddressCheckbox);
		return true;
	}

	public boolean validateAddress1() throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.EnterAddress1Curraddress);
		Log.info("Address 1 for current displayed" + Entrepreneur_Details.EnterAddress1Curraddress);
		WebElement AutoloadedAddress1 = driver.findElement(By.xpath("(//input[@placeholder='Address Line1'])[2]"));
		System.out.println("Autoloaded Address1 displyed" + AutoloadedAddress1.getAttribute("title"));
		String ABC = AutoloadedAddress1.getAttribute("title");
		if (ABC.equals(AutoloadedAddress1.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAddress1.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateAddress2() throws InterruptedException {
		WebElement AutoloadedAddress2 = driver.findElement(By.xpath("(//input[@placeholder='Address Line2'])[2]"));
		System.out.println("Autoloaded Address2 displyed" + AutoloadedAddress2.getAttribute("title"));

		String ABC = AutoloadedAddress2.getAttribute("title");
		if (ABC.equals(AutoloadedAddress2.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAddress2.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateAddress3() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.CurrentAddress);
		Thread.sleep(2000);
		WebElement AutoloadedAddress3 = driver.findElement(By.xpath("(//input[@placeholder='Address Line3'])[2]"));
		System.out.println("Autoloaded Address3 displyed" + AutoloadedAddress3.getAttribute("title"));

		String ABC = AutoloadedAddress3.getAttribute("title");
		if (ABC.equals(AutoloadedAddress3.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAddress3.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateLandmark() throws InterruptedException {
		WebElement AutoloadedLandmark = driver.findElement(By.xpath("(//input[@placeholder='LandMark'])[2]"));
		System.out.println("Autoloaded Landmark displyed" + AutoloadedLandmark.getAttribute("title"));

		String ABC = AutoloadedLandmark.getAttribute("title");
		if (ABC.equals(AutoloadedLandmark.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandmark.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validatePlace() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EnterAddress1Curraddress);
		WebElement AutoloadedPlace = driver.findElement(By.xpath("(//input[@placeholder='Place'])[2]"));
		System.out.println("Autoloaded Place displyed" + AutoloadedPlace.getAttribute("title"));

		String ABC = AutoloadedPlace.getAttribute("title");
		if (ABC.equals(AutoloadedPlace.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPlace.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	

	public boolean validateCountry() throws InterruptedException {
		WebElement AutoloadedCountry = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[1]"));
		System.out.println("Autoloaded Country displyed" + AutoloadedCountry.getAttribute("title"));

		String ABC = AutoloadedCountry.getAttribute("title");
		if (ABC.equals(AutoloadedCountry.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCountry.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateState() throws InterruptedException {
		WebElement AutoloadedState = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[2]"));
		System.out.println("Autoloaded State displyed" + AutoloadedState.getAttribute("title"));

		String ABC = AutoloadedState.getAttribute("title");
		if (ABC.equals(AutoloadedState.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedState.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateDistrict() throws InterruptedException {
		WebElement AutoloadedDistrict = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[3]"));
		System.out.println("Autoloaded District displyed" + AutoloadedDistrict.getAttribute("title"));

		String ABC = AutoloadedDistrict.getAttribute("title");
		if (ABC.equals(AutoloadedDistrict.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDistrict.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateCity() throws InterruptedException {
		WebElement AutoloadedCity = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[4]"));
		System.out.println("Autoloaded City displyed" + AutoloadedCity.getAttribute("title"));

		String ABC = AutoloadedCity.getAttribute("title");
		if (ABC.equals(AutoloadedCity.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCity.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validatePost() throws InterruptedException {
		WebElement AutoloadedPost = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[5]"));
		System.out.println("Autoloaded Post displyed" + AutoloadedPost.getAttribute("title"));

		String ABC = AutoloadedPost.getAttribute("title");
		if (ABC.equals(AutoloadedPost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateTaluk() throws InterruptedException {
		WebElement AutoloadedTaluk = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[6]"));
		System.out.println("Autoloaded Taluk displyed" + AutoloadedTaluk.getAttribute("title"));

		String ABC = AutoloadedTaluk.getAttribute("title");
		if (ABC.equals(AutoloadedTaluk.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTaluk.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	// TC018

	public boolean CheckAddEducationalDetails() throws InterruptedException {

		// ScrollUntilElementVisible(Entrepreneur_Details.ScrollDistrict);
		// Thread.sleep(2000);
		ElementDisplayed(Entrepreneur_Details.AddEducationalDetailsButton);
		Log.info("Add Educational Details Button Displayed" + Entrepreneur_Details.AddEducationalDetailsButton);
		click(Entrepreneur_Details.AddEducationalDetailsButton);
		Thread.sleep(1000);
		Log.info("Pop Up open for Educational Details" + Entrepreneur_Details.AddEducationalDetailsButton);
		return true;

	}

	public boolean SelectEducationalQualification() throws InterruptedException {

		ElementDisplayed(Entrepreneur_Details.EducationalQualification);
		Log.info("1. Located the \"Educational Qualification Name\" field."
				+ Entrepreneur_Details.EducationalQualification);
		Thread.sleep(1000);
		click(Entrepreneur_Details.EducationalQualification);
		Log.info("Educational Qualification dropdown open" + Entrepreneur_Details.EducationalQualification);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectEducationalQualification);
		Log.info("Educational Qualification Option selected" + Entrepreneur_Details.SelectEducationalQualification);
		return true;
	}

	public boolean EnterEducationalInstitutional(String EducationalInstitutional) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.EducationalInstitutional);
		Log.info("Educational Institutional field displayed" + Entrepreneur_Details.EducationalInstitutional);
		input(Entrepreneur_Details.EducationalInstitutional, EducationalInstitutional);
		Thread.sleep(1000);
		Log.info(EducationalInstitutional);
		return true;
	}

	public boolean EnterCourseName(String CourseName) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.CourseName);
		Log.info("Course name field displayed" + Entrepreneur_Details.CourseName);
		input(Entrepreneur_Details.CourseName, CourseName);
		Thread.sleep(1000);
		Log.info(CourseName);
		return true;
	}

	public boolean EnterFromDate(String FromDate) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.FromDate);
		Log.info("From Date field displayed" + Entrepreneur_Details.FromDate);
		input(Entrepreneur_Details.FromDate, FromDate);
		Thread.sleep(1000);
		Log.info(FromDate);
		return true;
	}

	public boolean EnterToDate(String ToDate) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.ToDate);
		Log.info("To Date field displayed" + Entrepreneur_Details.ToDate);
		input(Entrepreneur_Details.ToDate, ToDate);
		Thread.sleep(1000);
		Log.info(ToDate);
		return true;
	}

	public boolean CheckAddDetailsButton() throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.AddDetailsButton);
		Log.info("Add  Details Button Displayed" + Entrepreneur_Details.AddDetailsButton);
		click(Entrepreneur_Details.AddDetailsButton);
		Thread.sleep(1000);
		Log.info("Details Added for Educational Details" + Entrepreneur_Details.AddDetailsButton);
		return true;

	}

	public boolean CheckAddedDetailsforEducation() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.AddDetailsButton);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.AddedDataforEducation);
		Log.info("Added  Details  Displayed" + Entrepreneur_Details.AddedDataforEducation);
		Thread.sleep(1000);
		return true;

	}

	public boolean AddExperianceButton() throws InterruptedException {

		ElementDisplayed(Entrepreneur_Details.AddDetailsButtonForExperiance);
		Log.info("Add Experiance Details Button Displayed" + Entrepreneur_Details.AddDetailsButtonForExperiance);
		click(Entrepreneur_Details.AddDetailsButtonForExperiance);
		Thread.sleep(1000);
		Log.info("Pop Up open for Experiance Details" + Entrepreneur_Details.AddDetailsButtonForExperiance);
		return true;
	}

	public boolean SelectIndustry() throws InterruptedException {

		click(Entrepreneur_Details.Industry);
		Log.info("Industry dropdown open" + Entrepreneur_Details.Industry);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectIndustry);
		Log.info("Industry selected" + Entrepreneur_Details.SelectIndustry);
		return true;
	}

	public boolean SelectProfessionalBusiness() throws InterruptedException {

		click(Entrepreneur_Details.Professional);
		Log.info("Professional/Business dropdown open" + Entrepreneur_Details.Professional);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectProfessional);
		Log.info("Professional/Business selected" + Entrepreneur_Details.SelectProfessional);
		return true;
	}

	public boolean EnterExperiance(String EnterExperiance) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.EnterExperiance);
		Log.info("Experiance field displayed" + Entrepreneur_Details.EnterExperiance);
		input(Entrepreneur_Details.EnterExperiance, EnterExperiance);
		Thread.sleep(1000);
		Log.info(EnterExperiance);
		return true;
	}

	public boolean EnterSummary(String EnterSummary) throws InterruptedException {
		ElementDisplayed(Entrepreneur_Details.EnterSummary);
		Log.info("Summary field displayed" + Entrepreneur_Details.EnterSummary);
		input(Entrepreneur_Details.EnterSummary, EnterSummary);
		Thread.sleep(1000);
		Log.info(EnterSummary);
		return true;
	}

	public boolean ClickToAddExpDetails() throws InterruptedException {
		click(Entrepreneur_Details.AddDetailsForExperiance);
		Log.info("Experiance Added" + Entrepreneur_Details.AddDetailsForExperiance);
		return true;
	}

	public boolean ValidateAddedExperiance() throws InterruptedException {

		ScrollUntilElementVisible(Entrepreneur_Details.AddEducationalDetailsButton);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.AddedExperiance);
		Thread.sleep(1000);
		Log.info("Experiance added in grid" + Entrepreneur_Details.AddedExperiance);
		return true;
	}

	public boolean clickAddAwardButton() throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.AddDetailsButtonForExperiance);
		Thread.sleep(1000);
		click(Entrepreneur_Details.AddDetailsButtonForAward);
		Log.info("Pop up open to add Award" + Entrepreneur_Details.AddDetailsButtonForAward);
		Thread.sleep(1000);
		return true;
	}

	public boolean EnterAwardName(String EnterAwardName) throws InterruptedException {

		input(Entrepreneur_Details.EnterAwardName, EnterAwardName);
		Thread.sleep(1000);
		Log.info(EnterAwardName);
		return true;
	}

	public boolean EnterAwardProvidedBy(String EnterAwardProvidedby) throws InterruptedException {

		input(Entrepreneur_Details.EnterAwardProvidedby, EnterAwardProvidedby);
		Thread.sleep(1000);
		Log.info(EnterAwardProvidedby);
		return true;
	}
	
	public boolean selectAwardYear () throws InterruptedException {
		
		click(Entrepreneur_Details.AwardReceivedBy);
		Thread.sleep(1000);
		click(Entrepreneur_Details.SelectAwardReceivedYear);
		Thread.sleep(1000);
		Log.info("Year selected" + Entrepreneur_Details.SelectAwardReceivedYear);
		return true;
	}
	
	public boolean clickAddAwarddetails () throws InterruptedException {
		
		click(Entrepreneur_Details.AddAwardDetails);
		Thread.sleep(1000);
		Log.info("Add award details button clicked" + Entrepreneur_Details.AddAwardDetails);		
		return true;
	}
	
	
	
	public boolean AddedAwardinGrid () throws InterruptedException {
	
		ElementDisplayed(Entrepreneur_Details.AddedAwardGrid);
		Log.info("Award shown in grid" + Entrepreneur_Details.AddedAwardGrid);
		Thread.sleep(2000);
		return true;
		
	}

	public boolean editawarddetails () throws InterruptedException {
		click(Entrepreneur_Details.AddedAwardGrid);
		Thread.sleep(1000);
		click(Entrepreneur_Details.editAwardReceivedBy);
		Thread.sleep(1000);
		click(Entrepreneur_Details.editSelectAwardReceivedYear);
		Thread.sleep(1000);
		Log.info("Year edited" + Entrepreneur_Details.editSelectAwardReceivedYear);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Entrepreneur_Details.UpdateAwardDetails);
		Thread.sleep(1000);
		click(Entrepreneur_Details.UpdateAwardDetails);
		Thread.sleep(1000);
		Log.info("Edited data saved" + Entrepreneur_Details.UpdateAwardDetails);				
		return true;
		
	}
	
	public boolean EnterPassportNo (String EnterPassportno) throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.AddDetailsButtonForAward);
		Thread.sleep(1000);
		input(Entrepreneur_Details.EnterPassportno, EnterPassportno);
		Thread.sleep(1000);
		Log.info(EnterPassportno);
		return true;
	}
	
	public boolean EnterVoterID (String EnterVoterID) throws InterruptedException {
		input(Entrepreneur_Details.EnterVoterID, EnterVoterID);
		Thread.sleep(1000);
		Log.info(EnterVoterID);
		return true;
	}
	
	public boolean EnterCKYC (String EnterCKYCNo) throws InterruptedException {
		input(Entrepreneur_Details.EnterCKYCNo, EnterCKYCNo);
		Thread.sleep(1000);
		Log.info(EnterCKYCNo);
		return true;
	}
	
	public boolean Enterpercentage (String EnterPercentage) throws InterruptedException {
		input(Entrepreneur_Details.EnterPercentage, EnterPercentage);
		Thread.sleep(1000);
		Log.info(EnterPercentage);
		return true;
	}
	
	public boolean ValidateTermscheckbox () throws InterruptedException {
		ScrollUntilElementVisible(Entrepreneur_Details.EnterVoterID);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.TermsandCondition);
		Log.info("\"Terms and Conditions\" checkbox available." + Entrepreneur_Details.TermsandCondition);
		return true;
	}
	
	public boolean clickTermscheckbox () throws InterruptedException {
		Thread.sleep(1000);
		click(Entrepreneur_Details.CheckboxTermschecked);
	Thread.sleep(2000);
		Log.info("checkbox checked" + Entrepreneur_Details.TermsandCondition);
		return true;
	} 
	
	public boolean SaveAsdraft () throws InterruptedException {
		
		click(Entrepreneur_Details.SaveAsDraft);
		Thread.sleep(2000);
		Log.info("Data saved as draft" + Entrepreneur_Details.SaveAsDraft);
		click(Entrepreneur_Details.ClickOK);
		return true;
	}
	
	public boolean UpdateAndProceed ()throws InterruptedException {
		
		click(Entrepreneur_Details.AddedEnteredData);
		Thread.sleep(2000);
		ElementToBeVisible(Entrepreneur_Details.AddedEnteredData);
		Thread.sleep(2000);
		ScrollUntilElementVisible(Entrepreneur_Details.CheckboxTermschecked);
		Thread.sleep(2000);
		click(Entrepreneur_Details.UpdateAndProceed);
		Log.info("Data saved successfully" + Entrepreneur_Details.UpdateAndProceed);
		click(Entrepreneur_Details.ClickOK);
		return true;
}
	
	public boolean checkmainwindoew () throws InterruptedException {
		
		ElementDisplayed(Entrepreneur_Details.EntrepreneurDetailsHeader);
		Thread.sleep(1000);
		Log.info("Redirect to main window" + Entrepreneur_Details.EntrepreneurDetailsHeader);
		return true;
	}
	public boolean ValidateContinuebutton () throws InterruptedException {
		
		ScrollUntilElementVisible(Entrepreneur_Details.ScrolltoContinue);
		Thread.sleep(1000);
		ElementDisplayed(Entrepreneur_Details.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Entrepreneur_Details.ClickContinue);
		return true;
	}
	
	public boolean clicktocontinue () throws InterruptedException {
		
		click(Entrepreneur_Details.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued"+ Entrepreneur_Details.ClickContinue);
		return true;
	}
}
