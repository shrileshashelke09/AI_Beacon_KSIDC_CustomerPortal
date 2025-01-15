package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Plant_and_Machinery;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Plant_And_Machinery_Module extends Base_Class {

	Plant_and_Machinery Plant_and_Machinery = new Plant_and_Machinery();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(3000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Plant_and_Machinery.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Plant_and_Machinery.ScrolltoStep4);
		return true;
	}

	// TC003

	public boolean PlantAndMachineryComponent() throws InterruptedException {
		ScrollUntilElementVisible(Plant_and_Machinery.ScrolltoStep4);
		Thread.sleep(1000);
		ElementDisplayed(Plant_and_Machinery.PlantAndMachinery);
		Thread.sleep(1000);
		Log.info("\"Plant and Machinery\" component is visible." + Plant_and_Machinery.PlantAndMachinery);
		return true;
	}

	// TC004

	public boolean AccessPlantPage() throws InterruptedException {

		click(Plant_and_Machinery.PlantAndMachinery);
		Thread.sleep(1000);
		Log.info("\"Plant and Machinery\" component Accessed." + Plant_and_Machinery.PlantAndMachinery);

		return true;
	}

	// TC005
	public boolean WindowHeading() throws InterruptedException {

		ElementDisplayed(Plant_and_Machinery.Heading);
		Thread.sleep(1000);
		Log.info("Header displyed correct" + Plant_and_Machinery.Heading);
		return true;
	}

	// TC006

	public boolean MainText() throws InterruptedException {

		ScrollUntilElementVisible(Plant_and_Machinery.Heading);
		ElementDisplayed(Plant_and_Machinery.MainText);
		Thread.sleep(1000);
		Log.info("Main text displayed" + Plant_and_Machinery.MainText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Plant_and_Machinery.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed");
		ScrollUntilElementVisible(Plant_and_Machinery.ScrolltoStep4);
		Thread.sleep(1000);
		click(Plant_and_Machinery.PlantAndMachinery);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Plant_and_Machinery.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Plant_and_Machinery.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Plant_and_Machinery.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Plant_and_Machinery.AddDetails);
		return true;
	}

	public boolean SelectMachineryNature() throws InterruptedException {
        ElementDisplayed(Plant_and_Machinery.MachineryNature);
        Log.info("Field dislayed" + Plant_and_Machinery.MachineryNature);
		click(Plant_and_Machinery.MachineryNature);
		Thread.sleep(1000);
		click(Plant_and_Machinery.SelectMachineryNature);
		Thread.sleep(1000);
		Log.info("Machinery nature selected" + Plant_and_Machinery.SelectMachineryNature);
		return true;
	}

	public boolean SelectMachinerySource() throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.MachinerySource);
        Log.info("Field dislayed" + Plant_and_Machinery.MachinerySource);
       click(Plant_and_Machinery.MachinerySource);
		Thread.sleep(1000);
		click(Plant_and_Machinery.SelectMachinerySource);
		Thread.sleep(1000);
		Log.info("Machinery Source selected" + Plant_and_Machinery.SelectMachinerySource);
		return true;
	}
	
	public boolean SelectCurrency() throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.Currency);
        Log.info("Field dislayed" + Plant_and_Machinery.Currency);
		click(Plant_and_Machinery.Currency);
		Thread.sleep(1000);
		click(Plant_and_Machinery.SelectCurrency);
		Thread.sleep(1000);
		Log.info("Currency selected" + Plant_and_Machinery.Currency);
		return true;
	}
	
	public boolean EnterExchangeRate (String ExchangeRate) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.ExchangeRate);
		Log.info("Field displayed" + Plant_and_Machinery.ExchangeRate);
		input(Plant_and_Machinery.ExchangeRate ,ExchangeRate);
		Log.info(ExchangeRate);
		return true;
	}
	
	public boolean EnterMachineryName (String EnterMachineryName) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.EnterMachineryName);
		Log.info("Field displayed" + Plant_and_Machinery.EnterMachineryName);
		input(Plant_and_Machinery.EnterMachineryName ,EnterMachineryName);
		Log.info(EnterMachineryName);
		return true;
	}
	
	public boolean EnterMachineryManufactureName (String EnterMachineryManufactureName) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.EnterMachineryManufactureName);
		Log.info("Field displayed" + Plant_and_Machinery.EnterMachineryManufactureName);
		input(Plant_and_Machinery.EnterMachineryManufactureName ,EnterMachineryManufactureName);
		Log.info(EnterMachineryManufactureName);
		return true;
	}
	
	public boolean EnterMachineryBaseCost (String EnterMachineryBaseCost) throws InterruptedException {
		ScrollUntilElementVisible(Plant_and_Machinery.ExchangeRate);
		ElementDisplayed(Plant_and_Machinery.EnterMachineryBaseCost);
		Log.info("Field displayed" + Plant_and_Machinery.EnterMachineryBaseCost);
		input(Plant_and_Machinery.EnterMachineryBaseCost ,EnterMachineryBaseCost);
		Log.info(EnterMachineryBaseCost);
		click(Plant_and_Machinery.clickOutside);
		return true;
	}
	
	public boolean ValidateMachineryBaseCostConversion() throws InterruptedException {
		WebElement AutoloadedMachineryBaseCostConversion = driver.findElement(By.xpath("(//input[@placeholder='Machinery Base Cost'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachineryBaseCostConversion.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryBaseCostConversion.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryBaseCostConversion.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinery Base Cost Conversion displyed" + AutoloadedMachineryBaseCostConversion.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	
	public boolean EnterInstallationCost (String EnterInstallationCost) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.EnterInstallationCost);
		Log.info("Field displayed" + Plant_and_Machinery.EnterInstallationCost);
		input(Plant_and_Machinery.EnterInstallationCost ,EnterInstallationCost);
		Log.info(EnterInstallationCost);
		click(Plant_and_Machinery.clickOutside);
		return true;
	}
	
	public boolean ValidateInstallationCostConversion() throws InterruptedException {
		WebElement AutoloadedInstallationCostConversion = driver.findElement(By.xpath("(//input[@placeholder='Installation Cost'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedInstallationCostConversion.getAttribute("title");
		if (ABC.equals(AutoloadedInstallationCostConversion.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedInstallationCostConversion.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Installation Cost Conversion displyed" + AutoloadedInstallationCostConversion.getAttribute("title"));
			Thread.sleep(1000);
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean EnterTransportationCost (String EnterTransportationCost) throws InterruptedException {
		//ScrollUntilElementVisible(Plant_and_Machinery.EnterMachineryBaseCost);
		ElementDisplayed(Plant_and_Machinery.EnterTransportationCost);
		Log.info("Field displayed" + Plant_and_Machinery.EnterTransportationCost);
		input(Plant_and_Machinery.EnterTransportationCost ,EnterTransportationCost);
		Log.info(EnterTransportationCost);
		click(Plant_and_Machinery.clickOutside);
		return true;
	}
	
	public boolean ValidateTransportationCostConversion() throws InterruptedException {
		WebElement AutoloadedTramsportationnCostConversion = driver.findElement(By.xpath("(//input[@placeholder='Transportation Cost'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedTramsportationnCostConversion.getAttribute("title");
		if (ABC.equals(AutoloadedTramsportationnCostConversion.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTramsportationnCostConversion.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Tramsportationn Cost Conversion displyed" + AutoloadedTramsportationnCostConversion.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean EnterMachineryBCD (String EnterBCD) throws InterruptedException {
		//ScrollUntilElementVisible(Plant_and_Machinery.EnterMachineryBaseCost);
		ElementDisplayed(Plant_and_Machinery.EnterBCD);
		Log.info("Field displayed" + Plant_and_Machinery.EnterBCD);
		input(Plant_and_Machinery.EnterBCD ,EnterBCD);
		Log.info(EnterBCD);
		click(Plant_and_Machinery.clickOutside);
		return true;
	}
	
	public boolean ValidateMachineryBCD() throws InterruptedException {
		WebElement AutoloadedMachineryBCD = driver.findElement(By.xpath("(//input[@placeholder='Machinery  BCD (Basic Customs Duty)'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachineryBCD.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryBCD.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryBCD.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinery BCD Conversion displyed" + AutoloadedMachineryBCD.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean EnterMachinerySWS (String EnterSWS) throws InterruptedException {
		//ScrollUntilElementVisible(Plant_and_Machinery.EnterMachineryBaseCost);
		ElementDisplayed(Plant_and_Machinery.EnterSWS);
		Log.info("Field displayed" + Plant_and_Machinery.EnterSWS);
		input(Plant_and_Machinery.EnterSWS ,EnterSWS);
		Log.info(EnterSWS);
		click(Plant_and_Machinery.clickOutside);
		return true;
	}
	
	public boolean ValidateMachinerySWS() throws InterruptedException {
		WebElement AutoloadedMachinerySWS = driver.findElement(By.xpath("(//input[@placeholder='Machinery SWS (Social Welfare Surcharge)'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachinerySWS.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerySWS.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachinerySWS.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinery SWS Conversion displyed" + AutoloadedMachinerySWS.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean EnterCIFTest (String CIFTest) throws InterruptedException {
		ScrollUntilElementVisible(Plant_and_Machinery.EnterBCD);
		ElementDisplayed(Plant_and_Machinery.CIFTest);
		Log.info("Field displayed" + Plant_and_Machinery.CIFTest);
		input(Plant_and_Machinery.CIFTest ,CIFTest);
		Log.info(CIFTest);
		click(Plant_and_Machinery.CIFTestlabel);
		return true;
	}
	
	public boolean ValidateCIFTest() throws InterruptedException {
		WebElement AutoloadedCIFTest = driver.findElement(By.xpath("(//input[@placeholder='CIF Test'])[2]"));
		Thread.sleep(1000);
		String ABC = AutoloadedCIFTest.getAttribute("title");
		if (ABC.equals(AutoloadedCIFTest.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCIFTest.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded CIF Test Conversion displyed" + AutoloadedCIFTest.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateMachinerysTaxableAmount() throws InterruptedException {
		WebElement AutoloadedMachinerysTaxableAmount = driver.findElement(By.xpath("(//input[@class='rz-textbox rz-state-disabled valid form-control input-main'])[7]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachinerysTaxableAmount.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerysTaxableAmount.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachinerysTaxableAmount.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinerys Taxable Amount displyed" + AutoloadedMachinerysTaxableAmount.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean EnterMachineryCount (String MachineryCount) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.MachineryCount);
		Log.info("Field displayed" + Plant_and_Machinery.MachineryCount);
		input(Plant_and_Machinery.MachineryCount ,MachineryCount);
		Log.info(MachineryCount);
		return true;
	}
	
	public boolean SelectYESintoggle () throws InterruptedException {
		ScrollUntilElementVisible(Plant_and_Machinery.EnterSWS);
		ElementDisplayed(Plant_and_Machinery.ToggleQuestion);
		Thread.sleep(1000);
		Log.info("Field displayed" + Plant_and_Machinery.ToggleQuestion);
		click(Plant_and_Machinery.SelectYES);
		Thread.sleep(1000);
		Log.info("Yes selected" + Plant_and_Machinery.SelectYES);
		return true;
	}
	
	public boolean EnterMachineryTaxrate (String MazhineryTaxRate) throws InterruptedException {
		ElementDisplayed(Plant_and_Machinery.MazhineryTaxRate);
		Log.info("Field displayed" + Plant_and_Machinery.MazhineryTaxRate);
		clear(Plant_and_Machinery.MazhineryTaxRate);
		input(Plant_and_Machinery.MazhineryTaxRate ,MazhineryTaxRate);
		Log.info(MazhineryTaxRate);
		click(Plant_and_Machinery.Machinerycountlabel);
		return true;
	}

	public boolean ValidateMachinerysTaxRateAmount() throws InterruptedException {
		WebElement AutoloadedMachinerysTaxRateAmount = driver.findElement(By.xpath("(//input[@class='rz-textbox rz-state-disabled valid form-control input-main'])[8]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachinerysTaxRateAmount.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerysTaxRateAmount.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachinerysTaxRateAmount.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinerys Taxable Amount displyed" + AutoloadedMachinerysTaxRateAmount.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateMachineryLandedCost() throws InterruptedException {
		WebElement AutoloadedMachineryLandedCost = driver.findElement(By.xpath("(//input[@class='rz-textbox rz-state-disabled valid form-control input-main'])[9]"));
		Thread.sleep(1000);
		String ABC = AutoloadedMachineryLandedCost.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryLandedCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryLandedCost.getAttribute("title") + true);
			Log.info(ABC + true);
			System.out.println("Autoloaded Machinerys Taxable Amount displyed" + AutoloadedMachineryLandedCost.getAttribute("title"));
			return true;

		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean CancelButtonPresence() throws InterruptedException {

		ElementDisplayed(Plant_and_Machinery.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Plant_and_Machinery.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Plant_and_Machinery.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Plant_and_Machinery.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Plant_and_Machinery.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Plant_and_Machinery.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Plant_and_Machinery.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Plant_and_Machinery.Successpopup);
		ElementDisplayed(Plant_and_Machinery.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed."
				+ Plant_and_Machinery.Successpopup);
		return true;
	}
	
	public boolean UpdateAndProceed () throws InterruptedException {
		
		click(Plant_and_Machinery.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Plant_and_Machinery.Machinerycountlabel);
		Thread.sleep(1000);
		click(Plant_and_Machinery.UpdateAndProceed);
		Log.info("Data saved" + Plant_and_Machinery.UpdateAndProceed);
		ElementDisplayed(Plant_and_Machinery.Successpopup);
		Log.info("Data is saved successfully and success message is displayed."+ Plant_and_Machinery.Successpopup);
		return true;		
	}
	
	public boolean DatainGrid () {
		
		ElementDisplayed(Plant_and_Machinery.AddedEnteredData);
		Log.info("Data displayed in grid" + Plant_and_Machinery.AddedEnteredData);
		return true;
	}
	
public boolean ValidateContinuebutton () throws InterruptedException {
		
		ScrollUntilElementVisible(Plant_and_Machinery.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Plant_and_Machinery.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Plant_and_Machinery.ClickContinue);
		return true;
	}

public boolean clicktocontinue () throws InterruptedException {
	
	click(Plant_and_Machinery.ClickContinue);
	Thread.sleep(3000);
	Log.info("Process continued"+ Plant_and_Machinery.ClickContinue);
	return true;
}
	
}
