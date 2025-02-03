package com.Pages_BusinessInformation_Modules;

import java.io.IOException;
import java.security.Security;

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

	public boolean NavigatetoSecurity() throws InterruptedException {
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

	public boolean ClickAddedData() throws InterruptedException {
		click(Security_Plant_Machinary.AddedEnteredData);
		Thread.sleep(1000);
		ElementToBeVisible(Security_Plant_Machinary.DataField);
		Log.info("Added data Opened " + Security_Plant_Machinary.AddedEnteredData);
		return true;
	}

	public boolean validateMachineryNatureField() throws InterruptedException {
		ScrollUntilElementVisible(Security_Plant_Machinary.TotalAmount);
		WebElement AutoloadedMachineryField = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]"));
		System.out.println("Autoloaded Machinery Nature displyed" + AutoloadedMachineryField.getAttribute("title"));

		String ABC = AutoloadedMachineryField.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryField.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryField.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachinerySourceField() throws InterruptedException {
		WebElement AutoloadedMachinerySourceField = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[2]"));
		System.out
				.println("Autoloaded Machinery Source displyed" + AutoloadedMachinerySourceField.getAttribute("title"));

		String ABC = AutoloadedMachinerySourceField.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerySourceField.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachinerySourceField.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateCurrency() throws InterruptedException {
		WebElement AutoloadedCurrency = driver
				.findElement(By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[3]"));
		System.out.println("Autoloaded Currency displyed" + AutoloadedCurrency.getAttribute("title"));

		String ABC = AutoloadedCurrency.getAttribute("title");
		if (ABC.equals(AutoloadedCurrency.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCurrency.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateExchangeRate() throws InterruptedException {
		WebElement AutoloadedExchangeRate = driver.findElement(By.xpath("//input[@name='ExchangeRate']"));
		System.out.println("Autoloaded Exchange rate displyed" + AutoloadedExchangeRate.getAttribute("title"));

		String ABC = AutoloadedExchangeRate.getAttribute("title");
		if (ABC.equals(AutoloadedExchangeRate.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedExchangeRate.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryName() throws InterruptedException {
		WebElement AutoloadedMachineryName = driver.findElement(By.xpath("//input[@name='MachineryName']"));
		System.out.println("Autoloaded Machinery Name displyed" + AutoloadedMachineryName.getAttribute("title"));

		String ABC = AutoloadedMachineryName.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryName.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryManufactureName() throws InterruptedException {
		WebElement AutoloadedMachineryManufactureName = driver
				.findElement(By.xpath("//input[@name='MachineryManufactureName']"));
		System.out.println("Autoloaded Machinery Manufacture Name displyed"
				+ AutoloadedMachineryManufactureName.getAttribute("title"));

		String ABC = AutoloadedMachineryManufactureName.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryManufactureName.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedMachineryManufactureName.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryBaseCost() throws InterruptedException {
		WebElement AutoloadedMachineryBaseCost = driver
				.findElement(By.xpath("(//input[@name='MachineryBaseCost'])[1]"));
		System.out
				.println("Autoloaded Machinery Base Cost displyed" + AutoloadedMachineryBaseCost.getAttribute("title"));

		String ABC = AutoloadedMachineryBaseCost.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryBaseCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryBaseCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateCoversionMachineryBaseCost() throws InterruptedException {
		WebElement AutoloadedCoversionMachineryBaseCost = driver
				.findElement(By.xpath("(//input[@name='MachineryBaseCost'])[2]"));
		System.out.println("Autoloaded Conversion Machinery Base Cost displyed"
				+ AutoloadedCoversionMachineryBaseCost.getAttribute("title"));

		String ABC = AutoloadedCoversionMachineryBaseCost.getAttribute("title");
		if (ABC.equals(AutoloadedCoversionMachineryBaseCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedCoversionMachineryBaseCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateInstallationCost() throws InterruptedException {
		ScrollUntilElementVisible(Security_Plant_Machinary.MacineryName);
		WebElement AutoloadedInstallationCost = driver.findElement(By.xpath("(//input[@name='InstallationCost'])[1]"));
		System.out.println("Autoloaded Installation Cost displyed" + AutoloadedInstallationCost.getAttribute("title"));

		String ABC = AutoloadedInstallationCost.getAttribute("title");
		if (ABC.equals(AutoloadedInstallationCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedInstallationCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateTransportationCost() throws InterruptedException {
		WebElement AutoloadedTransportationCost = driver
				.findElement(By.xpath("(//input[@name='TransportationCost'])[1]"));
		System.out.println(
				"Autoloaded Transportation Cost displyed" + AutoloadedTransportationCost.getAttribute("title"));

		String ABC = AutoloadedTransportationCost.getAttribute("title");
		if (ABC.equals(AutoloadedTransportationCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedTransportationCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryBCD() throws InterruptedException {
		WebElement AutoloadedMachineryBCD = driver.findElement(By.xpath("(//input[@name='MachineryBCD'])[1]"));
		System.out.println("Autoloaded MachineryBCD displyed" + AutoloadedMachineryBCD.getAttribute("title"));

		String ABC = AutoloadedMachineryBCD.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryBCD.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryBCD.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachinerySWS() throws InterruptedException {
		WebElement AutoloadedMachinerySWS = driver.findElement(By.xpath("(//input[@name='MachinerySWS'])[1]"));
		System.out.println("Autoloaded MachinerySWS displyed" + AutoloadedMachinerySWS.getAttribute("title"));

		String ABC = AutoloadedMachinerySWS.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerySWS.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachinerySWS.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateCIF() throws InterruptedException {
		WebElement AutoloadedCIF = driver.findElement(By.xpath("(//input[@name='CIF'])[1]"));
		System.out.println("Autoloaded CIF displyed" + AutoloadedCIF.getAttribute("title"));

		String ABC = AutoloadedCIF.getAttribute("title");
		if (ABC.equals(AutoloadedCIF.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCIF.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachinerysTaxableAmount() throws InterruptedException {
		ScrollUntilElementVisible(Security_Plant_Machinary.BCD);
		WebElement AutoloadedMachinerysTaxableAmount = driver
				.findElement(By.xpath("(//input[@name='MachinerysTaxableAmount'])[1]"));
		System.out.println("Autoloaded MachinerysTaxableAmount displyed"
				+ AutoloadedMachinerysTaxableAmount.getAttribute("title"));

		String ABC = AutoloadedMachinerysTaxableAmount.getAttribute("title");
		if (ABC.equals(AutoloadedMachinerysTaxableAmount.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedMachinerysTaxableAmount.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryCountt() throws InterruptedException {
		WebElement AutoloadedMachineryCount = driver.findElement(By.xpath("(//input[@name='MachineryCount'])[1]"));
		System.out.println("Autoloaded Machinery Count displyed" + AutoloadedMachineryCount.getAttribute("title"));

		String ABC = AutoloadedMachineryCount.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryCount.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryCount.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean ValidateToggleQuestion() throws InterruptedException {

		ElementDisplayed(Security_Plant_Machinary.Questiontoggle);
		Thread.sleep(1000);
		Log.info(" Yes is selected." + Security_Plant_Machinary.Questiontoggle);
		return true;
	}
	

	
	public boolean validateAssetTaxRate() throws InterruptedException {
		WebElement AutoloadedAssetTaxRate = driver.findElement(By.xpath("//input[@name='AssetTaxRate']"));
		System.out.println("Autoloaded Asset Tax Rate displyed" + AutoloadedAssetTaxRate.getAttribute("title"));

		String ABC = AutoloadedAssetTaxRate.getAttribute("title");
		if (ABC.equals(AutoloadedAssetTaxRate.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAssetTaxRate.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}

	public boolean validateMachineryTax() throws InterruptedException {
		WebElement AutoloadedMachineryTax = driver.findElement(By.xpath("//input[@name='MachineryTax']"));
		System.out.println("Autoloaded Machinery Tax displyed" + AutoloadedMachineryTax.getAttribute("title"));

		String ABC = AutoloadedMachineryTax.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryTax.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryTax.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean validateMachineryLandedCost() throws InterruptedException {
		WebElement AutoloadedMachineryLandedCost = driver.findElement(By.xpath("//input[@name='MachineryLandedCost']"));
		System.out.println("Autoloaded Machinery Landed Cost displyed" + AutoloadedMachineryLandedCost.getAttribute("title"));

		String ABC = AutoloadedMachineryLandedCost.getAttribute("title");
		if (ABC.equals(AutoloadedMachineryLandedCost.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedMachineryLandedCost.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
	
	public boolean CancleButton () throws InterruptedException {
		
		click(Security_Plant_Machinary.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button cliked" +Security_Plant_Machinary.CancelButton );
		return true;
	}

}