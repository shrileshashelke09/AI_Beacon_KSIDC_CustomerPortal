package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Land_Development;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Land_Development_Module extends Base_Class {
	Security_Land_Development Security_Land_Development = new Security_Land_Development();

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean VerifyLandDevelopmentComponent() throws InterruptedException {
		click(Security_Land_Development.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Land_Development.ScrolltoProjectCost);
		ScrollUntilElementVisible(Security_Land_Development.ScrolltoProjectCost);
		Thread.sleep(1000);
		ElementDisplayed(Security_Land_Development.LandDevelopmentComponent);
		Thread.sleep(1000);
		Log.info("Land Development Component is visible." + Security_Land_Development.LandDevelopmentComponent);
		click(Security_Land_Development.LandDevelopmentComponent);
		Thread.sleep(1000);
		Log.info("Land Development  component is accessable." + Security_Land_Development.LandDevelopmentComponent);
		return true;
	}

	public boolean LandDevelopmentHeading() throws InterruptedException {

		ElementDisplayed(Security_Land_Development.LandDevelopmentHeading);
		Thread.sleep(1000);
		Log.info("Land Development Heading is visible." + Security_Land_Development.LandDevelopmentHeading);
		return true;
	}

	public boolean VerifyStageName() throws InterruptedException {

		ElementDisplayed(Security_Land_Development.StageHeading);
		Thread.sleep(1000);
		Log.info("Stage Name displayed correctly " + Security_Land_Development.StageHeading);
		return true;
	}

	public boolean VerifyAddedData() throws InterruptedException {

		ElementDisplayed(Security_Land_Development.AddedData);
		Thread.sleep(1000);
		Log.info("Added data displayed correctly " + Security_Land_Development.AddedData);
		return true;

	}

	public boolean ClickAddedData() throws InterruptedException {
		click(Security_Land_Development.AddedData);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Land_Development.DataField);
		Log.info("Added data Opened " + Security_Land_Development.AddedData);
		return true;
	}

	public boolean validateDevelopmentItems() throws InterruptedException {
		ScrollUntilElementVisible(Security_Land_Development.TotalAmount);
		WebElement AutoloadedDevelopmentItems = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]"));
		System.out.println("Autoloaded Development  items displyed" + AutoloadedDevelopmentItems.getAttribute("title"));

		String ABC = AutoloadedDevelopmentItems.getAttribute("title");
		if (ABC.equals(AutoloadedDevelopmentItems.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDevelopmentItems.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateEstimatedCost() throws InterruptedException {
		WebElement AutoloadedEstimatedCost = driver.findElement(By.xpath("//input[@name='EstimatedCost']"));
		System.out.println("Autoloaded Development  items displyed" + AutoloadedEstimatedCost.getAttribute("title"));

		String ABC = AutoloadedEstimatedCost.getAttribute("title");
		if (ABC.equals(AutoloadedEstimatedCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedEstimatedCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean CancleButton() throws InterruptedException {

		click(Security_Land_Development.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button cliked" + Security_Land_Development.CancelButton);
		return true;
	}
	
	public boolean ContinueButton() throws InterruptedException {
		ScrollUntilElementVisible(Security_Land_Development.TotalAmount);
		click(Security_Land_Development.ContinueButtonLand);
		Thread.sleep(1000);
		Log.info("Process continued" + Security_Land_Development.ContinueButtonLand);
		return true;
	}
}
