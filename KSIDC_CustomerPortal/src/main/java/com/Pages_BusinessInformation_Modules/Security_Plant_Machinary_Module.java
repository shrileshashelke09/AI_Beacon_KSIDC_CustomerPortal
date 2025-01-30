package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Plant_Machinary;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Security_Plant_Machinary_Module extends Base_Class {

	Security_Plant_Machinary Security_Plant_Machinary = new Security_Plant_Machinary();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Security_Plant_Machinary.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Plant_Machinary.ScrolltoProjectCost);
		return true;
	}

	public boolean VerifyPlantAndMachineryComponent() throws InterruptedException {
		ScrollUntilElementVisible(Security_Plant_Machinary.ScrolltoProjectCost);
		Thread.sleep(1000);
		ElementDisplayed(Security_Plant_Machinary.PlantAndMachineryComponent);
		Thread.sleep(1000);
		Log.info("Vehicles Component is visible." + Security_Plant_Machinary.PlantAndMachineryComponent);
		click(Security_Plant_Machinary.PlantAndMachineryComponent);
		Thread.sleep(1000);
		Log.info("Vehicles  component is accessable." + Security_Plant_Machinary.PlantAndMachineryComponent);
		return true;
	}

	public boolean AccessPlantAndMachineryComponent() throws InterruptedException {
		ElementDisplayed(Security_Plant_Machinary.PlantAndMachineryHeader);
		Log.info("Window Accessed" + Security_Plant_Machinary.PlantAndMachineryHeader);
		Thread.sleep(1000);
		return true;
	}

	public boolean VerifyPlantAndMachineryComponentHeader() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.PlantAndMachineryHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Security_Plant_Machinary.PlantAndMachineryHeader);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Security_Plant_Machinary.InformativeText);
		return true;
	}

	public boolean VerifyStageName() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.StageHeading);
		Thread.sleep(1000);
		Log.info("Stage Name displayed correctly " + Security_Plant_Machinary.InformativeText);
		return true;
	}

	public boolean VerifySubHeading() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.SubHeading);
		Thread.sleep(1000);
		Log.info("Sub Heading displayed correctly " + Security_Plant_Machinary.SubHeading);
		return true;
	}

	public boolean VerifyAddedData() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.AddedEnteredData);
		Thread.sleep(1000);
		Log.info("Added data displayed correctly " + Security_Plant_Machinary.AddedEnteredData);
		return true;

	}

	public boolean VerifyTotalAmount() throws InterruptedException {
		ElementDisplayed(Security_Plant_Machinary.TotalAmount);
		Thread.sleep(1000);
		Log.info("Total Amount displayed correctly " + Security_Plant_Machinary.TotalAmount);
		return true;
	}
}
