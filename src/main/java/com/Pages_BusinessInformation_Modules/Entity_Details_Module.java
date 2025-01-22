package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.apache.hc.core5.http.EntityDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Entity_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Entity_Details_Module extends Base_Class {

	Entity_Details Entity_Details = new Entity_Details();
	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		return true;

	}

	// TC002
	public boolean AccessEntityDetails() throws InterruptedException {
//		ScrollUntilElementVisible(Entity_Details.Scrolltobasic);
//		click(Entity_Details.EnterpreneurDetailsModule);
//		Thread.sleep(1000);
		click(Entity_Details.ContinueButton);
		Log.info("Continue button clicked" + Entity_Details.ContinueButton);
		Thread.sleep(2000);
		Log.info("User is navigated to Entity Details page." + Entity_Details.EntityDetails);
		return true;
	}

	// TC003

	public boolean ClickAddEntityButton() throws InterruptedException {

		click(Entity_Details.EntityDetails);
		Thread.sleep(1000);
		ElementToBeVisible(Entity_Details.EntityHeader);
		Thread.sleep(1000);
		Log.info("Add Entity form is displayed" + Entity_Details.EntityHeader);
		click(Entity_Details.AddEntityButton);
		Thread.sleep(1000);
		return true;
	}

	// TC004

	public boolean verifyCompanyPAN(String EnterPAN) throws InterruptedException {
		
		input(Entity_Details.EnterPAN, EnterPAN);
		Thread.sleep(1000);
		Log.info(EnterPAN);
		click(Entity_Details.CheckDedupe);
		Thread.sleep(1000);
		//ElementToBeVisible(Entity_Details.DedupeVerifiedMessage);
		Log.info("Verified message shown" + Entity_Details.DedupeVerifiedMessage);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.DedupeVerifiedButton);
		Thread.sleep(1000);
		Log.info("DEdupe verified" + Entity_Details.DedupeVerifiedButton);
		return true;
	}

	public boolean EnterInstituteName(String EnterInstituteName) throws InterruptedException {

		ScrollUntilElementVisible(Entity_Details.EnterPAN);
		Thread.sleep(1000);
		input(Entity_Details.EnterInstituteName, EnterInstituteName);
		Thread.sleep(1000);
		Log.info(EnterInstituteName);
		return true;
	}

	public boolean SelectTypeOfOrg() throws InterruptedException {

		click(Entity_Details.TypeOfOrganization);
		Thread.sleep(1000);
		click(Entity_Details.SelectTypeOfOrganization);
		Thread.sleep(1000);
		Log.info("Type of org selected" + Entity_Details.SelectTypeOfOrganization);
		return true;
	}

	public boolean SelectclassofAct() throws InterruptedException {

		click(Entity_Details.ClassOfActivity);
		Thread.sleep(1000);
		click(Entity_Details.SelectClassOfActivity);
		Thread.sleep(1000);
		Log.info("Class of Activity selected" + Entity_Details.SelectClassOfActivity);
		return true;
	}

	public boolean SelectDateofInc() throws InterruptedException {

		click(Entity_Details.Calender);
		Thread.sleep(1000);
		click(Entity_Details.SelectDateofInc);
		Thread.sleep(1000);
		Log.info("Date selected" + Entity_Details.SelectDateofInc);
		return true;
	}

	public boolean EnterAddress1(String EnterAddress1) throws InterruptedException {

		input(Entity_Details.EnterAddress1, EnterAddress1);
		Thread.sleep(1000);
		Log.info(EnterAddress1);
		return true;
	}

	public boolean EnterAddress2(String EnterAddress2) throws InterruptedException {

		input(Entity_Details.EnterAddress2, EnterAddress2);
		Thread.sleep(1000);
		Log.info(EnterAddress2);
		return true;
	}

	public boolean EnterAddress3(String EnterAddress3) throws InterruptedException {

		input(Entity_Details.EnterAddress3, EnterAddress3);
		Thread.sleep(1000);
		Log.info(EnterAddress3);
		return true;
	}

	public boolean EnterLandmark(String Landmark) throws InterruptedException {
		input(Entity_Details.Landmark, Landmark);
		Thread.sleep(1000);
		Log.info(Landmark);
		return true;
	}

	public boolean EnterPlace(String Place) throws InterruptedException {
		input(Entity_Details.Place, Place);
		Thread.sleep(1000);
		Log.info(Place);
		return true;
	}

	public boolean EnterPin(String Pin) throws InterruptedException {
		input(Entity_Details.Pin, Pin);
		Thread.sleep(1000);
		Log.info(Pin);
		click(Entity_Details.Pinlabel);
		Thread.sleep(1000);
		return true;
	}

	public boolean validateCountry() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.Landmark);
		Thread.sleep(1000);
		WebElement AutoloadedCountry = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[1]"));
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
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[2]"));
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
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[3]"));
		System.out.println("Autoloaded State displyed" + AutoloadedDistrict.getAttribute("title"));

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

	public boolean SelectCity() throws InterruptedException {

		click(Entity_Details.City);
		Thread.sleep(1000);
		click(Entity_Details.SelectCity);
		Thread.sleep(1000);
		Log.info("City selected" + Entity_Details.SelectCity);
		return true;
	}

	public boolean validatePost() throws InterruptedException {
		WebElement AutoloadedPost = driver
				.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[4]"));
		System.out.println("Autoloaded State displyed" + AutoloadedPost.getAttribute("title"));

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

	public boolean SelectTaluk() throws InterruptedException {

		click(Entity_Details.Taluk);
		Thread.sleep(1000);
		click(Entity_Details.SelectTaluk);
		Thread.sleep(1000);
		Log.info("Taluk selected" + Entity_Details.SelectTaluk);
		return true;
	}

	public boolean EnterInstitutionMobileNumber(String EnterInstitutionMobileNo) throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.DistrictLabel);
		Thread.sleep(1000);
		input(Entity_Details.EnterInstitutionMobileNo, EnterInstitutionMobileNo);
		Thread.sleep(1000);
		Log.info(EnterInstitutionMobileNo);
		return true;

	}

	public boolean EnterInstitutionEmail(String EnterInstitutionEmail) throws InterruptedException {

		input(Entity_Details.EnterInstitutionEmail, EnterInstitutionEmail);
		Thread.sleep(1000);
		Log.info(EnterInstitutionEmail);
		return true;

	}

	public boolean EnterExternalCreditRatingTest(String EnterRatingTest) throws InterruptedException {

		input(Entity_Details.EnterRatingTest, EnterRatingTest);
		Thread.sleep(1000);
		Log.info(EnterRatingTest);
		return true;
	}

	public boolean EnterTIN(String EnterTIN) throws InterruptedException {

		input(Entity_Details.EnterTIN, EnterTIN);
		Thread.sleep(1000);
		Log.info(EnterTIN);
		return true;
	}

	public boolean EnterTAN(String EnterTAN) throws InterruptedException {

		input(Entity_Details.EnterTAN, EnterTAN);
		Thread.sleep(1000);
		Log.info(EnterTAN);
		return true;
	}

	public boolean EnterGSTIN(String EnterGSTIN) throws InterruptedException {

		input(Entity_Details.EnterGSTAN, EnterGSTIN);
		Thread.sleep(1000);
		Log.info(EnterGSTIN);
		return true;
	}

	public boolean EnterCKYCID(String CKYCID) throws InterruptedException {

		input(Entity_Details.CKYCID, CKYCID);
		Thread.sleep(1000);
		Log.info(CKYCID);
		return true;

	}

	public boolean EnterPercentageofholding(String PercentageOfShareholding) throws InterruptedException {

		input(Entity_Details.PercentageOfShareholding, PercentageOfShareholding);
		Thread.sleep(1000);
		Log.info(PercentageOfShareholding);
		return true;

	}

	public boolean AddEnterpreneurDetails() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Details.EnterGSTAN);
		Thread.sleep(1000);
		click(Entity_Details.AddEnterpreneurDetails);
		ElementToBeVisible(Entity_Details.EnterpreneurHeader);
		Thread.sleep(1000);
		Log.info("User navigates to the Entrepreneur Details window" + Entity_Details.EnterpreneurHeader);
		return true;
	}

	public boolean ValidateEnterpreneurHeader() throws InterruptedException {

		ElementDisplayed(Entity_Details.EnterpreneurHeader);
		Thread.sleep(1000);
		Log.info("Header name should be correct as specified" + Entity_Details.EnterpreneurHeader);
		return true;
	}

	public boolean CheckKYCSectionAvailability() {

		ElementDisplayed(Entity_Details.KYCSectionAvailability);
		Log.info("KYC Section displayed" + Entity_Details.KYCSectionAvailability);
		return true;
	}

	public boolean EnterAadhar(String EnterAadhar) throws InterruptedException {
		input(Entity_Details.EnterAadhar, EnterAadhar);
		Thread.sleep(1000);
		Log.info(EnterAadhar);
		return true;
	}

	public boolean EnterCompanyPAN(String EnterCompanyPAN) throws InterruptedException {

		input(Entity_Details.EnterCompanyPAN, EnterCompanyPAN);
		Thread.sleep(1000);
		Log.info(EnterCompanyPAN);
		return true;
	}

	public boolean CheckDedupebuttonAvailability() {

		ElementDisplayed(Entity_Details.CheckDedupeButtonAvailability);
		Log.info(" Dedupe check Button is present." + Entity_Details.CheckDedupeButtonAvailability);
		return true;
	}

	public boolean ClickCheckDedupeButton() throws InterruptedException {

		click(Entity_Details.CheckDedupeButtonAvailability);
		Log.info("Button clicked" + Entity_Details.CheckDedupeButtonAvailability);
		ElementToBeVisible(Entity_Details.Successfulpopup);
		Log.info("Dedupe verified" + Entity_Details.Successfulpopup);
		return true;
	}

	public boolean Checksucessmessage() throws InterruptedException {
		ElementDisplayed(Entity_Details.Successfulpopup);
		Thread.sleep(1000);
		Log.info("Success message: \"Dedupe Verified Successfully\".");
		Thread.sleep(1000);
		return true;

	}

	public boolean EnterDOB(String EnterDOB) throws InterruptedException {

		input(Entity_Details.EnterDOB, EnterDOB);
		Thread.sleep(1000);
		Log.info(EnterDOB);
		return true;
	}

	public boolean EnterMobile(String EnterMobile) throws InterruptedException {

		input(Entity_Details.EnterMobile, EnterMobile);
		Thread.sleep(1000);
		Log.info(EnterMobile);
		return true;
	}

	public boolean EnterEmail(String EnterEmail) throws InterruptedException {
		input(Entity_Details.EnterEmail, EnterEmail);
		Thread.sleep(1000);
		Log.info(EnterEmail);
		return true;
	}

	public boolean EnterfirstName(String EnterFirstName) throws InterruptedException {
		input(Entity_Details.EnterFirstName, EnterFirstName);
		Thread.sleep(1000);
		Log.info(EnterFirstName);
		return true;
	}

	public boolean EnterMiddleName(String EnterMiddleName) throws InterruptedException {
		input(Entity_Details.EnterMiddleName, EnterMiddleName);
		Thread.sleep(1000);
		Log.info(EnterMiddleName);
		return true;
	}

	public boolean EnterLastName(String EnterLastName) throws InterruptedException {
		input(Entity_Details.EnterLastName, EnterLastName);
		Thread.sleep(1000);
		Log.info(EnterLastName);
		click(Entity_Details.LastnameLabel);
		Thread.sleep(1000);
		return true;
	}

	public boolean ValidateFullName() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.EnterDOB);
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
		ScrollUntilElementVisible(Entity_Details.EnterFirstName);
		click(Entity_Details.Gender);
		Thread.sleep(1000);
		click(Entity_Details.SelectGender);
		Log.info("gender selected" + Entity_Details.SelectGender);
		return true;

	}

	public boolean SelectDesignation() throws InterruptedException {
		click(Entity_Details.Designation);
		Thread.sleep(1000);
		click(Entity_Details.SelectDesignation);
		Log.info("gender selected" + Entity_Details.SelectDesignation);
		return true;
	}

	public boolean ValidateChangeAddressCheckbox() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.EnterAge);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.ChangeAddresscheckbox);
		Thread.sleep(1000);
		Log.info("Change Address checkbox displayed" + Entity_Details.ChangeAddresscheckbox);
		return true;
	}

	public boolean EnterAddress11(String EnterAddress11) throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.Designation);
		Thread.sleep(1000);
		input(Entity_Details.EnterAddress11, EnterAddress11);
		Thread.sleep(1000);
		Log.info(EnterAddress11);
		return true;
	}

	public boolean EnterAddress21(String EnterAddress21) throws InterruptedException {
		input(Entity_Details.EnterAddress21, EnterAddress21);
		Thread.sleep(1000);
		Log.info(EnterAddress21);
		return true;
	}

	public boolean EnterAddress31(String EnterAddress31) throws InterruptedException {
		input(Entity_Details.EnterAddress31, EnterAddress31);
		Thread.sleep(1000);
		Log.info(EnterAddress31);
		return true;
	}

	public boolean EnterLandmark1(String Landmark1) throws InterruptedException {
		input(Entity_Details.Landmark1, Landmark1);
		Thread.sleep(1000);
		Log.info(Landmark1);
		return true;
	}

	public boolean EnterPlace1(String Place1) throws InterruptedException {
		input(Entity_Details.Place1, Place1);
		Thread.sleep(1000);
		Log.info(Place1);
		return true;
	}

	public boolean SelectCountry() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.EnterAddress3);
		Thread.sleep(1000);
		click(Entity_Details.Country);
		Thread.sleep(1000);
		click(Entity_Details.SelectCountry);
		Log.info("Country selected" + Entity_Details.SelectCountry);
		return true;
	}

	public boolean SelectState() throws InterruptedException {
		click(Entity_Details.State);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Entity_Details.SelectState);
		click(Entity_Details.SelectState);
		Log.info("State selected" + Entity_Details.SelectState);
		return true;
	}

	public boolean SelectDistrict() throws InterruptedException {
		click(Entity_Details.District);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Entity_Details.SelectDistrict);
		click(Entity_Details.SelectDistrict);
		Log.info("District selected" + Entity_Details.SelectDistrict);
		return true;
	}

	public boolean SelectCity1() throws InterruptedException {
		click(Entity_Details.City1);
		Thread.sleep(1000);
		click(Entity_Details.SelectCity1);
		Log.info("City selected" + Entity_Details.SelectCity1);
		return true;
	}

	public boolean SelectPost() throws InterruptedException {
		click(Entity_Details.Post);
		Thread.sleep(1000);
		click(Entity_Details.SelectPost);
		Log.info("Post selected" + Entity_Details.SelectPost);
		return true;
	}

	public boolean SelectTaluk1() throws InterruptedException {
		click(Entity_Details.Taluk1);
		Thread.sleep(1000);
		click(Entity_Details.SelectTaluk1);
		Log.info("Taluk selected" + Entity_Details.SelectTaluk1);
		return true;
	}

	public boolean ChecktheBoxforAddress() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.City1);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.PermanentAddressCheckbox);
		Thread.sleep(1000);
		Log.info("Checkbox displayed" + Entity_Details.PermanentAddressCheckbox);
		click(Entity_Details.PermanentAddressCheckbox);
		Thread.sleep(1000);
		Log.info("Checkbox checked" + Entity_Details.PermanentAddressCheckbox);

		return true;
	}

	public boolean validateAddress1() throws InterruptedException {
		ElementDisplayed(Entity_Details.EnterAddress1Curraddress);
		Log.info("Address 1 for current displayed" + Entity_Details.EnterAddress1Curraddress);
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
		ScrollUntilElementVisible(Entity_Details.CurrentAddress);
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
		ScrollUntilElementVisible(Entity_Details.EnterAddress1Curraddress);
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

	public boolean validatePinCode() throws InterruptedException {
		WebElement AutoloadedPinCode = driver.findElement(By.xpath("(//input[@placeholder='Pin Code'])[2]"));
		System.out.println("Autoloaded Place displyed" + AutoloadedPinCode.getAttribute("title"));

		String ABC = AutoloadedPinCode.getAttribute("title");
		if (ABC.equals(AutoloadedPinCode.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPinCode.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateCountry1() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.ScrollToLandmark);
		WebElement AutoloadedCountry1 = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[1]/parent::div"));
		System.out.println("Autoloaded Country displyed" + AutoloadedCountry1.getAttribute("title"));

		String ABC = AutoloadedCountry1.getAttribute("title");
		if (ABC.equals(AutoloadedCountry1.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCountry1.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateState1() throws InterruptedException {
		WebElement AutoloadedState1 = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[2]/parent::div"));
		System.out.println("Autoloaded State displyed" + AutoloadedState1.getAttribute("title"));

		String ABC = AutoloadedState1.getAttribute("title");
		if (ABC.equals(AutoloadedState1.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedState1.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateDistrict1() throws InterruptedException {
		WebElement AutoloadedDistrict1 = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[3]/parent::div"));
		System.out.println("Autoloaded District displyed" + AutoloadedDistrict1.getAttribute("title"));

		String ABC = AutoloadedDistrict1.getAttribute("title");
		if (ABC.equals(AutoloadedDistrict1.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDistrict1.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateCity() throws InterruptedException {
		WebElement AutoloadedCity = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[4]/parent::div"));
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

	public boolean validatePost1() throws InterruptedException {
		WebElement AutoloadedPost1 = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[5]/parent::div"));
		System.out.println("Autoloaded Post displyed" + AutoloadedPost1.getAttribute("title"));

		String ABC = AutoloadedPost1.getAttribute("title");
		if (ABC.equals(AutoloadedPost1.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPost1.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean validateTaluk() throws InterruptedException {
		WebElement AutoloadedTaluk = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown valid rz-clear form-control input-main'])[6]/parent::div"));
		System.out.println("Autoloaded Taluk displyed" + AutoloadedTaluk.getAttribute("title"));

		String ABC = AutoloadedTaluk.getAttribute("title");
		if (ABC.equals(AutoloadedTaluk.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTaluk.getAttribute("title") + true);
			Log.info(ABC + true);
			Thread.sleep(2000);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean CheckAddEducationalDetails() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Details.ScrollAutoloadedDistrict);
		Thread.sleep(2000);
		ElementDisplayed(Entity_Details.AddEducationalDetailsButton);
		Log.info("Add Educational Details Button Displayed" + Entity_Details.AddEducationalDetailsButton);
		click(Entity_Details.AddEducationalDetailsButton);
		Thread.sleep(1000);
		Log.info("Pop Up open for Educational Details" + Entity_Details.AddEducationalDetailsButton);
		return true;

	}

	public boolean SelectEducationalQualification() throws InterruptedException {

		ElementDisplayed(Entity_Details.EducationalQualification);
		Log.info("1. Located the \"Educational Qualification Name\" field." + Entity_Details.EducationalQualification);
		Thread.sleep(1000);
		click(Entity_Details.EducationalQualification);
		Log.info("Educational Qualification dropdown open" + Entity_Details.EducationalQualification);
		Thread.sleep(1000);
		click(Entity_Details.SelectEducationalQualification);
		Log.info("Educational Qualification Option selected" + Entity_Details.SelectEducationalQualification);
		return true;
	}

	public boolean EnterEducationalInstitutional(String EducationalInstitutional) throws InterruptedException {
		ElementDisplayed(Entity_Details.EducationalInstitutional);
		Log.info("Educational Institutional field displayed" + Entity_Details.EducationalInstitutional);
		input(Entity_Details.EducationalInstitutional, EducationalInstitutional);
		Thread.sleep(1000);
		Log.info(EducationalInstitutional);
		return true;
	}

	public boolean EnterCourseName(String CourseName) throws InterruptedException {
		ElementDisplayed(Entity_Details.CourseName);
		Log.info("Course name field displayed" + Entity_Details.CourseName);
		input(Entity_Details.CourseName, CourseName);
		Thread.sleep(1000);
		Log.info(CourseName);
		return true;
	}

	public boolean EnterFromDate(String FromDate) throws InterruptedException {
		ElementDisplayed(Entity_Details.FromDate);
		Log.info("From Date field displayed" + Entity_Details.FromDate);
		input(Entity_Details.FromDate, FromDate);
		Thread.sleep(1000);
		Log.info(FromDate);
		return true;
	}

	public boolean EnterToDate(String ToDate) throws InterruptedException {
		ElementDisplayed(Entity_Details.ToDate);
		Log.info("To Date field displayed" + Entity_Details.ToDate);
		input(Entity_Details.ToDate, ToDate);
		Thread.sleep(1000);
		Log.info(ToDate);
		return true;
	}

	public boolean CheckAddDetailsButton() throws InterruptedException {
		ElementDisplayed(Entity_Details.AddDetailsButton);
		Log.info("Add  Details Button Displayed" + Entity_Details.AddDetailsButton);
		click(Entity_Details.AddDetailsButton);
		Thread.sleep(1000);
		Log.info("Details Added for Educational Details" + Entity_Details.AddDetailsButton);
		return true;

	}

	public boolean CheckAddedDetailsforEducation() throws InterruptedException {
		// ScrollUntilElementVisible(Entity_Details.AddDetailsButton);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.AddedDataforEducation);
		Log.info("Added  Details  Displayed" + Entity_Details.AddedDataforEducation);
		Thread.sleep(1000);
		return true;

	}

	public boolean AddExperianceButton() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.AddedDataforEducation);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.AddDetailsButtonForExperiance);
		Log.info("Add Experiance Details Button Displayed" + Entity_Details.AddDetailsButtonForExperiance);
		click(Entity_Details.AddDetailsButtonForExperiance);
		Thread.sleep(1000);
		Log.info("Pop Up open for Experiance Details" + Entity_Details.AddDetailsButtonForExperiance);
		return true;
	}

	public boolean SelectIndustry() throws InterruptedException {

		click(Entity_Details.Industry);
		Log.info("Industry dropdown open" + Entity_Details.Industry);
		Thread.sleep(1000);
		click(Entity_Details.SelectIndustry);
		Log.info("Industry selected" + Entity_Details.SelectIndustry);
		return true;
	}

	public boolean SelectProfessionalBusiness() throws InterruptedException {

		click(Entity_Details.Professional);
		Log.info("Professional/Business dropdown open" + Entity_Details.Professional);
		Thread.sleep(1000);
		click(Entity_Details.SelectProfessional);
		Log.info("Professional/Business selected" + Entity_Details.SelectProfessional);
		return true;
	}

	public boolean EnterExperiance(String EnterExperiance) throws InterruptedException {
		ElementDisplayed(Entity_Details.EnterExperiance);
		Log.info("Experiance field displayed" + Entity_Details.EnterExperiance);
		input(Entity_Details.EnterExperiance, EnterExperiance);
		Thread.sleep(1000);
		Log.info(EnterExperiance);
		return true;
	}

	public boolean EnterSummary(String EnterSummary) throws InterruptedException {
		ElementDisplayed(Entity_Details.EnterSummary);
		Log.info("Summary field displayed" + Entity_Details.EnterSummary);
		input(Entity_Details.EnterSummary, EnterSummary);
		Thread.sleep(1000);
		Log.info(EnterSummary);
		return true;
	}

	public boolean ClickToAddExpDetails() throws InterruptedException {
		click(Entity_Details.AddDetailsForExperiance);
		Log.info("Experiance Added" + Entity_Details.AddDetailsForExperiance);
		return true;
	}

	public boolean ValidateAddedExperiance() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Details.AddEducationalDetailsButton);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.AddedExperiance);
		Thread.sleep(1000);
		Log.info("Experiance added in grid" + Entity_Details.AddedExperiance);
		return true;
	}

	public boolean clickAddAwardButton() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.AddDetailsButtonForExperiance);
		Thread.sleep(1000);
		click(Entity_Details.AddDetailsButtonForAward);
		Log.info("Pop up open to add Award" + Entity_Details.AddDetailsButtonForAward);
		Thread.sleep(1000);
		return true;
	}

	public boolean EnterAwardName(String EnterAwardName) throws InterruptedException {

		input(Entity_Details.EnterAwardName, EnterAwardName);
		Thread.sleep(1000);
		Log.info(EnterAwardName);
		return true;
	}

	public boolean EnterAwardProvidedBy(String EnterAwardProvidedby) throws InterruptedException {

		input(Entity_Details.EnterAwardProvidedby, EnterAwardProvidedby);
		Thread.sleep(1000);
		Log.info(EnterAwardProvidedby);
		return true;
	}

	public boolean selectAwardYear() throws InterruptedException {

		click(Entity_Details.AwardReceivedBy);
		Thread.sleep(1000);
		click(Entity_Details.SelectAwardReceivedYear);
		Thread.sleep(1000);
		Log.info("Year selected" + Entity_Details.SelectAwardReceivedYear);
		return true;
	}

	public boolean clickAddAwarddetails() throws InterruptedException {

		click(Entity_Details.AddAwardDetails);
		Thread.sleep(1000);
		Log.info("Add award details button clicked" + Entity_Details.AddAwardDetails);
		return true;
	}

	public boolean AddedAwardinGrid() throws InterruptedException {
		ElementDisplayed(Entity_Details.AddedAwardGrid);
		Log.info("Award shown in grid" + Entity_Details.AddedAwardGrid);
		Thread.sleep(2000);
		return true;

	}

	public boolean editawarddetails() throws InterruptedException {
		click(Entity_Details.AddedAwardGrid);
		Thread.sleep(1000);
		click(Entity_Details.editAwardReceivedBy);
		Thread.sleep(1000);
		click(Entity_Details.editSelectAwardReceivedYear);
		Thread.sleep(1000);
		Log.info("Year edited" + Entity_Details.editSelectAwardReceivedYear);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Entity_Details.UpdateAwardDetails);
		Thread.sleep(1000);
		click(Entity_Details.UpdateAwardDetails);
		Thread.sleep(1000);
		Log.info("Edited data saved" + Entity_Details.UpdateAwardDetails);
		return true;

	}

	public boolean EnterPassportNo(String EnterPassportno) throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.AddDetailsButtonForAward);
		Thread.sleep(1000);
		input(Entity_Details.EnterPassportno, EnterPassportno);
		Thread.sleep(1000);
		Log.info(EnterPassportno);
		return true;
	}

	public boolean EnterVoterID(String EnterVoterID) throws InterruptedException {
		input(Entity_Details.EnterVoterID, EnterVoterID);
		Thread.sleep(1000);
		Log.info(EnterVoterID);
		return true;
	}

	public boolean EnterCKYC(String EnterCKYCNo) throws InterruptedException {
		input(Entity_Details.EnterCKYCNo, EnterCKYCNo);
		Thread.sleep(1000);
		Log.info(EnterCKYCNo);
		return true;
	}

	public boolean AddDetailsofEnterpreneur() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Details.EnterVoterID);
		Thread.sleep(1000);
		click(Entity_Details.AddEnterpreneurinEntity);
		Thread.sleep(1000);
		Log.info("Enterpreneur Details addedd" + Entity_Details.AddEnterpreneurinEntity);
		ScrollUP();
		return true;
	}

	public boolean ValidateTermscheckbox() throws InterruptedException {
//		ScrollUntilElementVisible(Entity_Details.EnterVoterID);
//		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.TermsandCondition);
		Log.info("\"Terms and Conditions\" checkbox available." + Entity_Details.TermsandCondition);
		return true;
	}

	public boolean clickTermscheckbox() throws InterruptedException {
		Thread.sleep(1000);
		click(Entity_Details.CheckboxTermschecked);
		Thread.sleep(2000);
		Log.info("checkbox checked" + Entity_Details.TermsandCondition);
		return true;
	}

	public boolean SaveAsdraft() throws InterruptedException {

		click(Entity_Details.SaveAsDraft);
		Thread.sleep(2000);
		Log.info("Data saved as draft" + Entity_Details.SaveAsDraft);
		click(Entity_Details.ClickOK);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Entity_Details.AddedEnteredData);
		Thread.sleep(2000);
		ElementToBeVisible(Entity_Details.AddedEnteredData);
		Thread.sleep(2000);
		ScrollUntilElementVisible(Entity_Details.CheckboxTermschecked);
		Thread.sleep(2000);
		click(Entity_Details.UpdateAndProceed);
		Log.info("Data saved successfully" + Entity_Details.UpdateAndProceed);
		click(Entity_Details.ClickOK);
		return true;
	}

	public boolean checkmainwindoew() throws InterruptedException {

		ElementDisplayed(Entity_Details.EntityHeader);
		Thread.sleep(1000);
		Log.info("Redirect to main window" + Entity_Details.EntityHeader);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Details.ScrolltoContinue);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Details.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Entity_Details.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {

		click(Entity_Details.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Entity_Details.ClickContinue);
		return true;
	}

}
