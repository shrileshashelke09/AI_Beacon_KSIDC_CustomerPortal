package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Utilities;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Utilities_Module extends Base_Class {
	Security_Utilities Security_Utilities = new Security_Utilities();

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}


	public boolean AccessSecurity () throws InterruptedException {
		
		click(Security_Utilities.ContinueButton);
		Thread.sleep(1000);
		return true;
	}
	
	
	public boolean VerifyUtilitiesComponent() throws InterruptedException {
		
		ElementToBeVisible(Security_Utilities.ScrolltoProjectCost);
		ScrollUntilElementVisible(Security_Utilities.ScrolltoProjectCost);
		Thread.sleep(1000);
		ElementDisplayed(Security_Utilities.UtilitiesComponent);
		Thread.sleep(1000);
		Log.info("Land Development Component is visible." + Security_Utilities.UtilitiesComponent);
		click(Security_Utilities.UtilitiesComponent);
		Thread.sleep(1000);
		Log.info("Land Development  component is accessable." + Security_Utilities.UtilitiesComponent);
		return true;
	}

		public boolean VerifyAddedData() throws InterruptedException {

		ElementDisplayed(Security_Utilities.AddedData);
		Thread.sleep(1000);
		Log.info("Added data displayed correctly " + Security_Utilities.AddedData);
		return true;

	}

	public boolean ClickAddedData() throws InterruptedException {
		click(Security_Utilities.AddedData);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Utilities.DataField);
		Log.info("Added data Opened " + Security_Utilities.AddedData);
		return true;
	}

	public boolean validateUtilityType() throws InterruptedException {
		ScrollUntilElementVisible(Security_Utilities.TotalAmount);
		WebElement AutoloadedUtilityType = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]"));
		System.out.println("Autoloaded Utility Type displyed" + AutoloadedUtilityType.getAttribute("title"));

		String ABC = AutoloadedUtilityType.getAttribute("title");
		if (ABC.equals(AutoloadedUtilityType.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedUtilityType.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateGSTCost() throws InterruptedException {
		WebElement AutoloadedGSTCost = driver.findElement(By.xpath("//input[@name='CostForUtilityIncludingGST']"));
		System.out.println("Autoloaded GST displyed" + AutoloadedGSTCost.getAttribute("title"));

		String ABC = AutoloadedGSTCost.getAttribute("title");
		if (ABC.equals(AutoloadedGSTCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedGSTCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean CancleButton() throws InterruptedException {

		click(Security_Utilities.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button cliked" + Security_Utilities.CancelButton);
		return true;
	}
	
	public boolean ContinueButton() throws InterruptedException {
		ScrollUntilElementVisible(Security_Utilities.TotalAmount);
		click(Security_Utilities.ContinueButtonLand);
		Thread.sleep(1000);
		Log.info("Process continued" + Security_Utilities.ContinueButtonLand);
		return true;
	}
}
