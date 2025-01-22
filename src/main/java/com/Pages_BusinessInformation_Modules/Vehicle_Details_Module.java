package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Vehicle_Details;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Vehicle_Details_Module extends Base_Class {

	Vehicle_Details Vehicle_Details = new Vehicle_Details();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Vehicle_Details.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Vehicle_Details.ScrolltoBusinessFinance);
		return true;
	}

	public boolean VerifyVehicleDetailsComponent() throws InterruptedException {
		ScrollUntilElementVisible(Vehicle_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		ElementDisplayed(Vehicle_Details.VehiclesComponent);
		Thread.sleep(1000);
		Log.info("Vehicles Component is visible." + Vehicle_Details.VehiclesComponent);
		return true;
	}

	public boolean AccessVehicleDetailsComponent() throws InterruptedException {
		ScrollUntilElementVisible(Vehicle_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Vehicle_Details.VehiclesComponent);
		Thread.sleep(1000);
		Log.info("Vehicles  component is accessable." + Vehicle_Details.VehiclesComponent);
		return true;
	}

	public boolean WindowAccess () throws InterruptedException {

		ElementDisplayed(Vehicle_Details.VehiclesHeader);
		Thread.sleep(1000);
		Log.info("Window  displayed correctly " + Vehicle_Details.VehiclesHeader);
		return true;
	}
	
	
	public boolean VerifyVehiclesComponentHeader() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.VehiclesHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Vehicle_Details.VehiclesHeader);
		return true;
	}

	public boolean VerifyStageHeading() throws InterruptedException {
		ElementDisplayed(Vehicle_Details.StageHeading);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Vehicle_Details.StageHeading);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Vehicle_Details.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Vehicle_Details.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Vehicle_Details.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Vehicle_Details.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Vehicle_Details.SkipForNow);
		ScrollUntilElementVisible(Vehicle_Details.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Vehicle_Details.VehiclesComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Vehicle_Details.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Vehicle_Details.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Vehicle_Details.AddDetails);
		return true;
	}

	public boolean SelectVehicleCategory() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.VehicleCategory);
		Log.info("Field Displayed" + Vehicle_Details.VehicleCategory);
		Thread.sleep(1000);
		click(Vehicle_Details.VehicleCategory);
		Thread.sleep(1000);
		click(Vehicle_Details.SelectVehicleCategory);
		Log.info("Vehicle Category Selected" + Vehicle_Details.SelectVehicleCategory);
		return true;

	}
	
	public boolean SelectVehicleManufacture() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.VehicleManufacture);
		Log.info("Field Displayed" + Vehicle_Details.VehicleManufacture);
		Thread.sleep(1000);
		click(Vehicle_Details.VehicleManufacture);
		Thread.sleep(1000);
		click(Vehicle_Details.SelectVehicleManufacture);
		Log.info("Vehicle Manufacture Selected" + Vehicle_Details.SelectVehicleManufacture);
		return true;

	}

	public boolean EnterVehicleModel(String EnterVehicleModel) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterVehicleModel);
		Log.info("Field Displayed" + Vehicle_Details.EnterVehicleModel);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterVehicleModel, EnterVehicleModel);
		Thread.sleep(1000);
		Log.info(EnterVehicleModel);
		return true;
	}
	
	public boolean EnterVehicleColour(String EnterVehicleColour) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterVehicleColour);
		Log.info("Field Displayed" + Vehicle_Details.EnterVehicleColour);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterVehicleColour, EnterVehicleColour);
		Thread.sleep(1000);
		Log.info(EnterVehicleColour);
		return true;
	}

	public boolean EnterSowroomPrice(String EnterSowroomPrice) throws InterruptedException {
ScrollUntilElementVisible(Vehicle_Details.VehicleCategory);
		ElementDisplayed(Vehicle_Details.EnterSowroomPrice);
		Log.info("Field Displayed" + Vehicle_Details.EnterSowroomPrice);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterSowroomPrice, EnterSowroomPrice);
		Thread.sleep(1000);
		Log.info(EnterSowroomPrice);
		return true;
	}
	
	public boolean SelectRegistration() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.Registration);
		Log.info("Field Displayed" + Vehicle_Details.Registration);
		Thread.sleep(1000);
		click(Vehicle_Details.Registration);
		Thread.sleep(1000);
		click(Vehicle_Details.SelectRegistration);
		Log.info("Vehicle Registration Selected" + Vehicle_Details.SelectRegistration);
		return true;

	}
	
	public boolean EnterOnroadPrice(String EnterOnroadPrice) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterOnroadPrice);
		Log.info("Field Displayed" + Vehicle_Details.EnterOnroadPrice);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterOnroadPrice, EnterOnroadPrice);
		Thread.sleep(1000);
		Log.info(EnterOnroadPrice);
		return true;
	}
	
	public boolean EnterVehicleNumber(String EnterVehicleNumber) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterVehicleNumber);
		Log.info("Field Displayed" + Vehicle_Details.EnterVehicleNumber);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterVehicleNumber, EnterVehicleNumber);
		Thread.sleep(1000);
		Log.info(EnterVehicleNumber);
		return true;
	}
	
	public boolean EnterEngineNumber(String EnterEngineNumber) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterEngineNumber);
		Log.info("Field Displayed" + Vehicle_Details.EnterEngineNumber);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterEngineNumber, EnterEngineNumber);
		Thread.sleep(1000);
		Log.info(EnterEngineNumber);
		return true;
	}
	
	
	public boolean EnterChaseNumber(String EnterChaseNumber) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterChaseNumber);
		Log.info("Field Displayed" + Vehicle_Details.EnterChaseNumber);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterChaseNumber, EnterChaseNumber);
		Thread.sleep(1000);
		Log.info(EnterChaseNumber);
		return true;
	}
	
	
	public boolean EnterRegistrationDate(String EnterRegistrationDate) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterRegistrationDate);
		Log.info("Field Displayed" + Vehicle_Details.EnterRegistrationDate);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterRegistrationDate, EnterRegistrationDate);
		Thread.sleep(1000);
		Log.info(EnterRegistrationDate);
		return true;
	}
	
	
	public boolean SelectInsuranceProvider() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.InsuranceProvider);
		Log.info("Field Displayed" + Vehicle_Details.SelectInsuranceProvider);
		Thread.sleep(1000);
		click(Vehicle_Details.InsuranceProvider);
		Thread.sleep(1000);
		click(Vehicle_Details.SelectInsuranceProvider);
		Log.info("Insurance Provider Selected" + Vehicle_Details.SelectInsuranceProvider);
		return true;

	}
	
	public boolean EnterInsuranceAmount(String EnterInsuranceAmount) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterInsuranceAmount);
		Log.info("Field Displayed" + Vehicle_Details.EnterInsuranceAmount);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterInsuranceAmount, EnterInsuranceAmount);
		Thread.sleep(1000);
		Log.info(EnterInsuranceAmount);
		return true;
	}
	
	public boolean EnterRoadTax(String EnterRoadTax) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterRoadTax);
		Log.info("Field Displayed" + Vehicle_Details.EnterRoadTax);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterRoadTax, EnterRoadTax);
		Thread.sleep(1000);
		Log.info(EnterRoadTax);
		return true;
	}
	
	public boolean EnterRegAndOtherTax(String EnterRegAndOtherTax) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterRegAndOtherTax);
		Log.info("Field Displayed" + Vehicle_Details.EnterRegAndOtherTax);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterRegAndOtherTax, EnterRegAndOtherTax);
		Thread.sleep(1000);
		Log.info(EnterRegAndOtherTax);
		return true;
	}
	
	public boolean EnterDealerDiscount(String EnterDealerDiscount) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterDealerDiscount);
		Log.info("Field Displayed" + Vehicle_Details.EnterDealerDiscount);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterDealerDiscount, EnterDealerDiscount);
		Thread.sleep(1000);
		Log.info(EnterDealerDiscount);
		return true;
	}
	
	public boolean EnterDownPayment(String EnterDownPayment) throws InterruptedException {

		ElementDisplayed(Vehicle_Details.EnterDownPayment);
		Log.info("Field Displayed" + Vehicle_Details.EnterDownPayment);
		Thread.sleep(1000);
		input(Vehicle_Details.EnterDownPayment, EnterDownPayment);
		Thread.sleep(1000);
		Log.info(EnterDownPayment);
		return true;
	}
	
	public boolean CancelButtonPresence() throws InterruptedException {
		ScrollUntilElementVisible(Vehicle_Details.EnterRegAndOtherTax);
		ElementDisplayed(Vehicle_Details.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Vehicle_Details.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Vehicle_Details.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Vehicle_Details.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Vehicle_Details.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Vehicle_Details.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Vehicle_Details.Successpopup);
		ElementDisplayed(Vehicle_Details.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Vehicle_Details.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Vehicle_Details.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Vehicle_Details.InsuranceProvider);
		click(Vehicle_Details.UpdateAndProceed);
		Log.info("Data saved" + Vehicle_Details.UpdateAndProceed);
		ElementDisplayed(Vehicle_Details.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Vehicle_Details.Successpopup);
		return true;
	}

	public boolean DatainGrid() {

		ElementDisplayed(Vehicle_Details.AddedEnteredData);
		Log.info("Data displayed in grid" + Vehicle_Details.AddedEnteredData);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Vehicle_Details.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Vehicle_Details.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Vehicle_Details.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {

		click(Vehicle_Details.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Vehicle_Details.ClickContinue);
		return true;
	}

}
