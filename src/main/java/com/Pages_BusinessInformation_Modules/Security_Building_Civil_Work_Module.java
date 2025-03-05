package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Building_Civil_Work;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Building_Civil_Work_Module extends Base_Class {
	Security_Building_Civil_Work Security_Building_Civil_Work = new Security_Building_Civil_Work();

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean VerifyBuildingCivilWorkComponent() throws InterruptedException {
		click(Security_Building_Civil_Work.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Building_Civil_Work.ScrolltoProjectCost);
		ScrollUntilElementVisible(Security_Building_Civil_Work.ScrolltoProjectCost);
		Thread.sleep(1000);
		ElementDisplayed(Security_Building_Civil_Work.BuildingCivilWorkComponent);
		Thread.sleep(1000);
		Log.info("Building and Component is visible." + Security_Building_Civil_Work.BuildingCivilWorkComponent);
		click(Security_Building_Civil_Work.BuildingCivilWorkComponent);
		Thread.sleep(1000);
		Log.info("Building and component is accessable." + Security_Building_Civil_Work.BuildingCivilWorkComponent);
		return true;
	}


	public boolean ClickAddedData() throws InterruptedException {
		click(Security_Building_Civil_Work.AddedData);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Building_Civil_Work.DataField);
		Log.info("Added data Opened " + Security_Building_Civil_Work.AddedData);
		return true;
	}

	public boolean validateBuildingType() throws InterruptedException {
		ScrollUntilElementVisible(Security_Building_Civil_Work.TotalAmount);
		WebElement AutoloadedBuildingType = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]"));
		System.out.println("Autoloaded Building type displyed" + AutoloadedBuildingType.getAttribute("title"));

		String ABC = AutoloadedBuildingType.getAttribute("title");
		if (ABC.equals(AutoloadedBuildingType.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBuildingType.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateExisting() throws InterruptedException {
		WebElement AutoloadedExisting = driver.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[2]"));
		System.out.println("Autoloaded Existing items displyed" + AutoloadedExisting.getAttribute("title"));

		String ABC = AutoloadedExisting.getAttribute("title");
		if (ABC.equals(AutoloadedExisting.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedExisting.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateLandDocNo() throws InterruptedException {
		WebElement AutoloadedLandDocNo = driver.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[3]"));
		System.out.println("Autoloaded Land Doc No displyed" + AutoloadedLandDocNo.getAttribute("title"));

		String ABC = AutoloadedLandDocNo.getAttribute("title");
		if (ABC.equals(AutoloadedLandDocNo.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandDocNo.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean validateBuildingAge() throws InterruptedException {
		WebElement AutoloadedBuildingAge = driver.findElement(By.xpath("//input[@name='BuildingAge']"));
		System.out.println("Autoloaded Building Age displyed" + AutoloadedBuildingAge.getAttribute("title"));

		String ABC = AutoloadedBuildingAge.getAttribute("title");
		if (ABC.equals(AutoloadedBuildingAge.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBuildingAge.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean validateBuildingArea() throws InterruptedException {
		WebElement AutoloadedBuildingArea = driver.findElement(By.xpath("//input[@name='BuildingArea']"));
		System.out.println("Autoloaded Building Area displyed" + AutoloadedBuildingArea.getAttribute("title"));

		String ABC = AutoloadedBuildingArea.getAttribute("title");
		if (ABC.equals(AutoloadedBuildingArea.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedBuildingArea.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean validateCost() throws InterruptedException {
		WebElement AutoloadedCost = driver.findElement(By.xpath("//input[@name='CostForTheBuilding']"));
		System.out.println("Autoloaded Cost displyed" + AutoloadedCost.getAttribute("title"));

		String ABC = AutoloadedCost.getAttribute("title");
		if (ABC.equals(AutoloadedCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean validateName() throws InterruptedException {
		WebElement AutoloadedName = driver.findElement(By.xpath("//input[@name='ArchitectOrEngineersName']"));
		System.out.println("Autoloaded Name displyed" + AutoloadedName.getAttribute("title"));

		String ABC = AutoloadedName.getAttribute("title");
		if (ABC.equals(AutoloadedName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedName.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	
	public boolean CancleButton() throws InterruptedException {
ScrollUntilElementVisible(Security_Building_Civil_Work.BuildingAge);
		click(Security_Building_Civil_Work.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button cliked" + Security_Building_Civil_Work.CancelButton);
		return true;
	}
	
	public boolean ContinueButton() throws InterruptedException {
		ScrollUntilElementVisible(Security_Building_Civil_Work.TotalAmount);
		click(Security_Building_Civil_Work.ContinueButtonLand);
		Thread.sleep(1000);
		Log.info("Process continued" + Security_Building_Civil_Work.ContinueButtonLand);
		return true;
	}
}
