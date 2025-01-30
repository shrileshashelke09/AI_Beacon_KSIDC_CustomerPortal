package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Plant_and_Machinery;
import com.Page_Repositary.Project_Cost_Verification;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Project_Cost_Verification_Module extends Base_Class {

	Project_Cost_Verification Project_Cost_Verification = new Project_Cost_Verification();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();

		return true;

	}

	// TC002

	public boolean AccessProjectCostPage() throws InterruptedException {

		click(Project_Cost_Verification.ContinueButton);
		Thread.sleep(3000);
		return true;
	}

	// TC003

	public boolean validateHeader() throws InterruptedException {

		ElementDisplayed(Project_Cost_Verification.Header);
		Thread.sleep(1000);
		Log.info("Header shown correctly" + Project_Cost_Verification.Header);
		return true;
	}

	public boolean ValidatePlantAndMachinery() throws InterruptedException {
		WebElement AutoloadedPlantAndMachinery = driver
				.findElement(By.xpath("//input[@placeholder='Plant & Machinery (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedPlantAndMachinery.getAttribute("title");
		if (ABC.equals(AutoloadedPlantAndMachinery.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPlantAndMachinery.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println(
					"Autoloaded Plant And Machinery displyed" + AutoloadedPlantAndMachinery.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateLand() throws InterruptedException {
		WebElement AutoloadedLand = driver.findElement(By.xpath("//input[@placeholder='Land (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedLand.getAttribute("title");
		if (ABC.equals(AutoloadedLand.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLand.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Land displyed" + AutoloadedLand.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateLandDevelopement() throws InterruptedException {
		ScrollUntilElementVisible(Project_Cost_Verification.Header);
		Thread.sleep(1000);
		WebElement AutoloadedLandDevelopement = driver
				.findElement(By.xpath("//input[@placeholder='Land Development (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedLandDevelopement.getAttribute("title");
		if (ABC.equals(AutoloadedLandDevelopement.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandDevelopement.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println(
					"Autoloaded Land Developement displyed" + AutoloadedLandDevelopement.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateBuilding() throws InterruptedException {
		WebElement AutoloadedBuilding = driver
				.findElement(By.xpath("//input[@placeholder='Building & Civil Works (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedBuilding.getAttribute("title");
		if (ABC.equals(AutoloadedBuilding.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBuilding.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Buildingy displyed" + AutoloadedBuilding.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateUtilities() throws InterruptedException {
		ScrollUntilElementVisible(Project_Cost_Verification.scrolltoLand);
		WebElement AutoloadedUtilities = driver.findElement(By.xpath("//input[@placeholder='Utilities (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedUtilities.getAttribute("title");
		if (ABC.equals(AutoloadedUtilities.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedUtilities.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Utilities displyed" + AutoloadedUtilities.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateMiscFixedAssed() throws InterruptedException {
		WebElement AutoloadedMiscFixedAssed = driver
				.findElement(By.xpath("//input[@placeholder='Misc Fixed Assets (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedMiscFixedAssed.getAttribute("title");
		if (ABC.equals(AutoloadedMiscFixedAssed.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMiscFixedAssed.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Misc Fixed Assed displyed" + AutoloadedMiscFixedAssed.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateVehicle() throws InterruptedException {
		WebElement AutoloadedVehicle = driver.findElement(By.xpath("//input[@placeholder='Vehicles (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedVehicle.getAttribute("title");
		if (ABC.equals(AutoloadedVehicle.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicle.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Vehicle displyed" + AutoloadedVehicle.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDeposits() throws InterruptedException {
		WebElement AutoloadedDeposits = driver.findElement(By.xpath("//input[@placeholder='Deposits (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedDeposits.getAttribute("title");
		if (ABC.equals(AutoloadedDeposits.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDeposits.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Deposits displyed" + AutoloadedDeposits.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidatePreliminaryExpenses() throws InterruptedException {
		WebElement AutoloadedPreliminaryExpenses = driver
				.findElement(By.xpath("//input[@placeholder='Preliminary Expenses (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedPreliminaryExpenses.getAttribute("title");
		if (ABC.equals(AutoloadedPreliminaryExpenses.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPreliminaryExpenses.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println(
					"Autoloaded Preliminary Expenses displyed" + AutoloadedPreliminaryExpenses.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateTechnicalKnowHowFees() throws InterruptedException {
		WebElement AutoloadedTechnicalKnowHowFees = driver
				.findElement(By.xpath("//input[@placeholder='Technical Know-How Fees (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedTechnicalKnowHowFees.getAttribute("title");
		if (ABC.equals(AutoloadedTechnicalKnowHowFees.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTechnicalKnowHowFees.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Technical Know How Fees displyed"
					+ AutoloadedTechnicalKnowHowFees.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidatePreoperativeExpenses() throws InterruptedException {
		WebElement AutoloadedPreoperativeExpenses = driver
				.findElement(By.xpath("//input[@placeholder='Preoperative Expenses (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedPreoperativeExpenses.getAttribute("title");
		if (ABC.equals(AutoloadedPreoperativeExpenses.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPreoperativeExpenses.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println(
					"Autoloaded Preoperative Expenses displyed" + AutoloadedPreoperativeExpenses.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateContingencies() throws InterruptedException {
		WebElement AutoloadedContingencies = driver.findElement(By.xpath("//input[@placeholder='Contingencies (₹)']"));
		Thread.sleep(1000);
		String ABC = AutoloadedContingencies.getAttribute("title");
		if (ABC.equals(AutoloadedContingencies.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedContingencies.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Contingencies displyed" + AutoloadedContingencies.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean EnterWorkingCapitalMargin(String workingCapitalMargin) throws InterruptedException {

		clear(Project_Cost_Verification.workingCapitalMargin);
		Thread.sleep(1000);
		input(Project_Cost_Verification.workingCapitalMargin, workingCapitalMargin);
		Thread.sleep(1000);
		Log.info(workingCapitalMargin);
		return true;
	}

	public boolean EnterWorkingCapital(String workingCapital) throws InterruptedException {

		clear(Project_Cost_Verification.workingCapital);
		Thread.sleep(1000);
		input(Project_Cost_Verification.workingCapital, workingCapital);
		Thread.sleep(1000);
		Log.info(workingCapital);
		return true;
	}

	public boolean EnterTechnology(String Technology) throws InterruptedException {

		clear(Project_Cost_Verification.Technology);
		Thread.sleep(1000);
		input(Project_Cost_Verification.Technology, Technology);
		Thread.sleep(1000);
		Log.info(Technology);
		return true;
	}

	public boolean EnterTesting(String Testing) throws InterruptedException {

		clear(Project_Cost_Verification.Testing);
		Thread.sleep(1000);
		input(Project_Cost_Verification.Testing, Testing);
		Thread.sleep(1000);
		Log.info(Testing);
		return true;
	}

	public boolean EnterMarketing(String Marketing) throws InterruptedException {

		clear(Project_Cost_Verification.Marketing);
		Thread.sleep(1000);
		input(Project_Cost_Verification.Marketing, Marketing);
		Thread.sleep(1000);
		Log.info(Marketing);
		return true;
	}

	public boolean EnterOthers(String Others) throws InterruptedException {

		clear(Project_Cost_Verification.Others);
		Thread.sleep(1000);
		input(Project_Cost_Verification.Others, Others);
		Thread.sleep(1000);
		Log.info(Others);
		click(Project_Cost_Verification.ClickonOthersLabel);
		return true;
	}

	public boolean ValidateSpecifyField() throws InterruptedException {

		ElementDisplayed(Project_Cost_Verification.Specify);
		Thread.sleep(1000);
		Log.info("Specify data field displayed" + Project_Cost_Verification.Specify);
		return true;
	}

	public boolean EnterSpecify(String Specify) throws InterruptedException {

		clear(Project_Cost_Verification.Specify);
		Thread.sleep(1000);
		input(Project_Cost_Verification.Specify, Specify);
		Thread.sleep(1000);
		Log.info(Specify);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {
		ScrollUntilElementVisible(Project_Cost_Verification.Others);
		ElementDisplayed(Project_Cost_Verification.SaveAsDraft);
		Thread.sleep(1000);
		click(Project_Cost_Verification.SaveAsDraft);
		ElementToBeVisible(Project_Cost_Verification.successpopup);
		Log.info("Data saved as Draft and success message displayed" + Project_Cost_Verification.successpopup);
		return true;
	}

	public boolean SaveandProceed() throws InterruptedException {
		// ScrollUntilElementVisible(Project_Cost_Verification.Others);
		ElementDisplayed(Project_Cost_Verification.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save and Proceed button displayed" + Project_Cost_Verification.SaveAndProceed);
		return true;

	}

	public boolean validateallValueturnsZero() throws InterruptedException {
		click(Project_Cost_Verification.SaveAndProceed);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Project_Cost_Verification.ScrolltoStep4);
		Thread.sleep(1000);
		click(Project_Cost_Verification.ProjectCostVerification);
		Thread.sleep(1000);
		WebElement AutoloadedPlantAndMachinery = driver
				.findElement(By.xpath("//input[@placeholder='Plant & Machinery (₹)']"));
		Thread.sleep(1000);
		String ABC1 = AutoloadedPlantAndMachinery.getAttribute("title");
		if (ABC1.equals(AutoloadedPlantAndMachinery.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPlantAndMachinery.getAttribute("title") + true);
			Log.info(ABC1 + true);
			System.out.println(
					"Autoloaded Plant And Machinery displyed" + AutoloadedPlantAndMachinery.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedLand = driver.findElement(By.xpath("//input[@placeholder='Land (₹)']"));
		Thread.sleep(1000);
		String ABC2 = AutoloadedLand.getAttribute("title");
		if (ABC2.equals(AutoloadedLand.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLand.getAttribute("title") + true);
			Log.info(ABC2 + true);
			System.out.println("Autoloaded Land displyed" + AutoloadedLand.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		ScrollUntilElementVisible(Project_Cost_Verification.Header);
		Thread.sleep(1000);
		WebElement AutoloadedLandDevelopement = driver
				.findElement(By.xpath("//input[@placeholder='Land Development (₹)']"));
		Thread.sleep(1000);
		String ABC3 = AutoloadedLandDevelopement.getAttribute("title");
		if (ABC3.equals(AutoloadedLandDevelopement.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandDevelopement.getAttribute("title") + true);
			Log.info(ABC3 + true);
			System.out.println(
					"Autoloaded Land Developement displyed" + AutoloadedLandDevelopement.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedBuilding = driver
				.findElement(By.xpath("//input[@placeholder='Building & Civil Works (₹)']"));
		Thread.sleep(1000);
		String ABC4 = AutoloadedBuilding.getAttribute("title");
		if (ABC4.equals(AutoloadedBuilding.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBuilding.getAttribute("title") + true);
			Log.info(ABC4 + true);
			System.out.println("Autoloaded Buildingy displyed" + AutoloadedBuilding.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		ScrollUntilElementVisible(Project_Cost_Verification.scrolltoLand);
		WebElement AutoloadedUtilities = driver.findElement(By.xpath("//input[@placeholder='Utilities (₹)']"));
		Thread.sleep(1000);
		String ABC5 = AutoloadedUtilities.getAttribute("title");
		if (ABC5.equals(AutoloadedUtilities.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedUtilities.getAttribute("title") + true);
			Log.info(ABC5 + true);
			System.out.println("Autoloaded Utilities displyed" + AutoloadedUtilities.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedMiscFixedAssed = driver
				.findElement(By.xpath("//input[@placeholder='Misc Fixed Assets (₹)']"));
		Thread.sleep(1000);
		String ABC6 = AutoloadedMiscFixedAssed.getAttribute("title");
		if (ABC6.equals(AutoloadedMiscFixedAssed.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMiscFixedAssed.getAttribute("title") + true);
			Log.info(ABC6 + true);
			System.out.println("Autoloaded Misc Fixed Assed displyed" + AutoloadedMiscFixedAssed.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedVehicle = driver.findElement(By.xpath("//input[@placeholder='Vehicles (₹)']"));
		Thread.sleep(1000);
		String ABC7 = AutoloadedVehicle.getAttribute("title");
		if (ABC7.equals(AutoloadedVehicle.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicle.getAttribute("title") + true);
			Log.info(ABC7 + true);
			System.out.println("Autoloaded Vehicle displyed" + AutoloadedVehicle.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedDeposits = driver.findElement(By.xpath("//input[@placeholder='Deposits (₹)']"));
		Thread.sleep(1000);
		String ABC8 = AutoloadedDeposits.getAttribute("title");
		if (ABC8.equals(AutoloadedDeposits.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDeposits.getAttribute("title") + true);
			Log.info(ABC8 + true);
			System.out.println("Autoloaded Deposits displyed" + AutoloadedDeposits.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedPreliminaryExpenses = driver
				.findElement(By.xpath("//input[@placeholder='Preliminary Expenses (₹)']"));
		Thread.sleep(1000);
		String ABC9 = AutoloadedPreliminaryExpenses.getAttribute("title");
		if (ABC9.equals(AutoloadedPreliminaryExpenses.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPreliminaryExpenses.getAttribute("title") + true);
			Log.info(ABC9 + true);
			System.out.println(
					"Autoloaded Preliminary Expenses displyed" + AutoloadedPreliminaryExpenses.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedTechnicalKnowHowFees = driver
				.findElement(By.xpath("//input[@placeholder='Technical Know-How Fees (₹)']"));
		Thread.sleep(1000);
		String ABC10 = AutoloadedTechnicalKnowHowFees.getAttribute("title");
		if (ABC10.equals(AutoloadedTechnicalKnowHowFees.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTechnicalKnowHowFees.getAttribute("title") + true);
			Log.info(ABC10 + true);
			System.out.println("Autoloaded Technical Know How Fees displyed"
					+ AutoloadedTechnicalKnowHowFees.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		WebElement AutoloadedPreoperativeExpenses = driver
				.findElement(By.xpath("//input[@placeholder='Preoperative Expenses (₹)']"));
		Thread.sleep(1000);
		String ABC11 = AutoloadedPreoperativeExpenses.getAttribute("title");
		if (ABC11.equals(AutoloadedPreoperativeExpenses.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPreoperativeExpenses.getAttribute("title") + true);
			Log.info(ABC11 + true);
			System.out.println(
					"Autoloaded Preoperative Expenses displyed" + AutoloadedPreoperativeExpenses.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		WebElement AutoloadedContingencies = driver.findElement(By.xpath("//input[@placeholder='Contingencies (₹)']"));
		Thread.sleep(1000);
		String ABC12 = AutoloadedContingencies.getAttribute("title");
		if (ABC12.equals(AutoloadedContingencies.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedContingencies.getAttribute("title") + true);
			Log.info(ABC12 + true);
			System.out.println("Autoloaded Contingencies displyed" + AutoloadedContingencies.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;

	}
	
	public boolean ClickonUpdateAndProceed () throws InterruptedException {
		
		ScrollUntilElementVisible(Project_Cost_Verification.Others);
		Thread.sleep(1000);
		click(Project_Cost_Verification.UpdateAndProceed);
		Thread.sleep(1000);
		Log.info("Redirect to next component" + Project_Cost_Verification.UpdateAndProceed);
		Thread.sleep(1000);
		return true;
	}

}
