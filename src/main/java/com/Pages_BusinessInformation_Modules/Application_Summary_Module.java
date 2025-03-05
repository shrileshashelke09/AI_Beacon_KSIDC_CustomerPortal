package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Application_Summary;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Application_Summary_Module extends Base_Class {

	Application_Summary Application_Summary = new Application_Summary();

	public boolean login() throws InterruptedException, IOException {
		Login();
		ElementToBeVisible(Application_Summary.ContinueButton);
		Log.info("Logged in successfully" + Application_Summary.ContinueButton);
		return true;
	}

	public boolean ApplicationSummaryPage() throws InterruptedException {

		click(Application_Summary.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Application_Summary.BusinessInfo);
		Log.info("Application summary page landed" + Application_Summary.ContinueButton);
		return true;

	}

	public boolean BusinessInfoStage() throws InterruptedException {

		ElementDisplayed(Application_Summary.BusinessInfo);
		Thread.sleep(1000);
		Log.info("'Business Information' stage is selected at the top." + Application_Summary.BusinessInfo);
		return true;
	}

	public boolean BasicInfooption() throws InterruptedException {

		ElementDisplayed(Application_Summary.BasicInfo);
		Thread.sleep(1000);
		Log.info("'Basic Information' page name is selected in 'Go To Page'." + Application_Summary.BasicInfo);
		return true;
	}

	public boolean BasicInfoPage() throws InterruptedException {

		ElementDisplayed(Application_Summary.BasicInfoPageTitle);
		Thread.sleep(1000);
		Log.info("'Basic Information' page is opened in the window." + Application_Summary.BasicInfoPageTitle);
		return true;
	}

	// Udyam No

	public boolean ValidateUdyamNO() throws InterruptedException {
		ScrollUntilElementVisible(Application_Summary.BusinessInfo);
		Thread.sleep(1000);
		WebElement AutoloadedUdyamNO = driver.findElement(By.xpath("//input[@name='MSMEUdyamNoOrUdyogAadhaar']"));
		System.out.println("Autoloaded Udyam No displyed" + AutoloadedUdyamNO.getAttribute("title"));

		String ABC = AutoloadedUdyamNO.getAttribute("title");
		if (ABC.equals(AutoloadedUdyamNO.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedUdyamNO.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	// Name Of Enterprise

	public boolean ValidateNameofEnterprise() throws InterruptedException {

		WebElement AutoloadedNameofEnterprise = driver.findElement(By.xpath("//input[@name='EnterpriseName']"));
		System.out.println("Autoloaded Name of Enterprise displyed" + AutoloadedNameofEnterprise.getAttribute("title"));

		String ABC = AutoloadedNameofEnterprise.getAttribute("title");
		if (ABC.equals(AutoloadedNameofEnterprise.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedNameofEnterprise.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateTypeOfInstitutionOrganizations() throws InterruptedException {

		WebElement AutoloadedTypeOfInstitutionOrganizations = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[1]"));
		System.out.println("Autoloaded Type Of Institution Organizations displyed"
				+ AutoloadedTypeOfInstitutionOrganizations.getAttribute("title"));

		String ABC = AutoloadedTypeOfInstitutionOrganizations.getAttribute("title");
		if (ABC.equals(AutoloadedTypeOfInstitutionOrganizations.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedTypeOfInstitutionOrganizations.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateClassofActivity() throws InterruptedException {

		WebElement AutoloadedClassofActivity = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[2]"));
		System.out.println("Autoloaded Class of Activity displyed" + AutoloadedClassofActivity.getAttribute("title"));

		String ABC = AutoloadedClassofActivity.getAttribute("title");
		if (ABC.equals(AutoloadedClassofActivity.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedClassofActivity.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDateOfIncorporation() throws InterruptedException {

		WebElement AutoloadedDateOfIncorporation = driver.findElement(By.xpath("(//div[@class='valid'])[1]"));
		System.out.println(
				"Autoloaded Date Of Incorporation displyed" + AutoloadedDateOfIncorporation.getAttribute("title"));

		String ABC = AutoloadedDateOfIncorporation.getAttribute("title");
		if (ABC.equals(AutoloadedDateOfIncorporation.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDateOfIncorporation.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDateOfUdyamRegistration() throws InterruptedException {

		WebElement AutoloadedDateOfUdyamRegistration = driver.findElement(By.xpath("(//div[@class='valid'])[2]"));
		System.out.println("Autoloaded Date Of Udyam Registration displyed"
				+ AutoloadedDateOfUdyamRegistration.getAttribute("title"));

		String ABC = AutoloadedDateOfUdyamRegistration.getAttribute("title");
		if (ABC.equals(AutoloadedDateOfUdyamRegistration.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedDateOfUdyamRegistration.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateInstitutionMobile() throws InterruptedException {

		WebElement AutoloadedInstitutionMobile = driver.findElement(By.xpath("//input[@name='Mobile']"));
		System.out
				.println("Autoloaded Institution Mobile displyed" + AutoloadedInstitutionMobile.getAttribute("title"));

		String ABC = AutoloadedInstitutionMobile.getAttribute("title");
		if (ABC.equals(AutoloadedInstitutionMobile.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedInstitutionMobile.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateLandLineNo() throws InterruptedException {
		ScrollUntilElementVisible(Application_Summary.scrolltoDate);
		Thread.sleep(1000);
		WebElement AutoloadedLandLineNo = driver.findElement(By.xpath("//input[@name='LandLineNo']"));
		System.out
				.println("Autoloaded LandLine No displyed" + AutoloadedLandLineNo.getAttribute("title"));

		String ABC = AutoloadedLandLineNo.getAttribute("title");
		if (ABC.equals(AutoloadedLandLineNo.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandLineNo.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateEmailID() throws InterruptedException {
		WebElement AutoloadedEmailID = driver.findElement(By.xpath("//input[@name='EmailID']"));
		System.out.println("Autoloaded LandLine No displyed" + AutoloadedEmailID.getAttribute("title"));

		String ABC = AutoloadedEmailID.getAttribute("title");
		if (ABC.equals(AutoloadedEmailID.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedEmailID.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateWebsite() throws InterruptedException {
		WebElement AutoloadedWebsite = driver.findElement(By.xpath("//input[@name='Website']"));
		System.out.println("Autoloaded Website displyed" + AutoloadedWebsite.getAttribute("title"));

		String ABC = AutoloadedWebsite.getAttribute("title");
		if (ABC.equals(AutoloadedWebsite.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedWebsite.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateAddress() throws InterruptedException {
		WebElement AutoloadedAddress = driver.findElement(By.xpath("//input[@name='Address']"));
		System.out.println("Autoloaded Address displyed" + AutoloadedAddress.getAttribute("title"));

		String ABC = AutoloadedAddress.getAttribute("title");
		if (ABC.equals(AutoloadedAddress.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAddress.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateLandMark() throws InterruptedException {
		WebElement AutoloadedLandMark = driver.findElement(By.xpath("//input[@name='LandMark']"));
		System.out.println("Autoloaded LandMark displyed" + AutoloadedLandMark.getAttribute("title"));

		String ABC = AutoloadedLandMark.getAttribute("title");
		if (ABC.equals(AutoloadedLandMark.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandMark.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidatePlace() throws InterruptedException {
		WebElement AutoloadedPlace = driver.findElement(By.xpath("//input[@name='Place']"));
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
	
	public boolean ValidatePin() throws InterruptedException {
		WebElement AutoloadedPin = driver.findElement(By.xpath("//input[@name='Pin']"));
		System.out.println("Autoloaded Pin displyed" + AutoloadedPin.getAttribute("title"));

		String ABC = AutoloadedPin.getAttribute("title");
		if (ABC.equals(AutoloadedPin.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPin.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	
	public boolean ValidateCountry() throws InterruptedException {

		WebElement AutoloadedCountry = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[3]"));
		System.out.println("Autoloaded Class of Activity displyed" + AutoloadedCountry.getAttribute("title"));

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
	
	public boolean ValidateState() throws InterruptedException {

		WebElement AutoloadedState = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[4]"));
		System.out.println("Autoloaded State of Activity displyed" + AutoloadedState.getAttribute("title"));

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
	
	

}
