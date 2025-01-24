package com.Page_Repositary;

import org.openqa.selenium.By;

public class Plant_and_Machinery {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoStep4 = By.xpath("//h4[normalize-space()='Step 4']");

	public By PlantAndMachinery = By.xpath("//a[normalize-space()='4.2 Plant And Machinery']");

	public By Heading = By.xpath("//h4[text()='Plant & Machinery Details ']");

	public By MainText = By.xpath("//span[@class='d-flex justify-content-center flex-wrap']");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddDetails = By.xpath("//button[normalize-space()='Add Details']");

	public By MachineryNature = By.xpath("(//label[text()='Machinery Nature']/parent::div)[2]");

	public By SelectMachineryNature = By.xpath("//span[text()='Auxiliary']");

	public By MachinerySource = By.xpath("(//label[text()='Machinery Source']/parent::div)[2]");

	public By SelectMachinerySource = By.xpath("//span[text()='Imported']");

	public By Currency = By.xpath("(//label[text()='Currency']/parent::div)[2]");

	public By SelectCurrency = By.xpath("//span[text()=' EUR']");

	public By ExchangeRate = By.xpath("//input[@placeholder='Exchange Rate (₹)']");

	public By EnterMachineryName = By.xpath("//input[@placeholder='Machinery Name']");

	public By EnterMachineryManufactureName = By.xpath("//input[@placeholder='Machinery Manufacture Name']");

	public By EnterInstallationCost = By.xpath("//input[@placeholder='Installation Cost']");

	public By clickOutside = By.xpath("//label[text()='Machinery Base Cost']");

	public By EnterMachineryBaseCost = By.xpath("//input[@placeholder='Machinery Base Cost']");

	public By EnterTransportationCost = By.xpath("(//input[@placeholder='Transportation Cost'])[1]");

	public By EnterMachinerysTaxableAmount = By.xpath("//input[@placeholder='Machinery's Taxable Amount (₹)']");

	public By EnterMachineryCount = By.xpath("//input[@placeholder='Machinery Count']");

	public By EnterBCD = By.xpath("(//input[@placeholder='Machinery  BCD (Basic Customs Duty)'])[1]");

	public By EnterSWS = By.xpath("(//input[@placeholder='Machinery SWS (Social Welfare Surcharge)'])[1]");

	public By CIFTest = By.xpath("(//input[@placeholder='CIF Test'])[1]");

	public By CIFTestlabel = By.xpath("//label[text()='CIF Test']");

	public By MachineryCount = By.xpath("//input[@placeholder='Machinery Count']");

	public By Machinerycountlabel = By.xpath("//label[text()='Machinery Tax Rate']");

	public By ToggleQuestion = By.xpath("//p[text()='Do You Want To Edit The Tax Rate?']/parent::div");

	public By SelectYES = By.xpath("//span[@class='rz-radiobutton-icon']/parent::div");

	public By MazhineryTaxRate = By.xpath("//input[@placeholder='Machinery Tax Rate']");

	public By CancelButton = By.xpath("//div[text()='Cancel']");

	public By SaveAsDraftButton = By.xpath("//*[normalize-space()='Save as Draft']");

	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");

	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

	public By Continue = By.xpath("//a[normalize-space()='Continue']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By ScrolltoContinue = By.xpath("//h4[normalize-space()='Plant & Machinery Details']");

	public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");

}
