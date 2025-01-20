package com.Page_Repositary;

import org.openqa.selenium.By;

public class Building_Civil_Work {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoBusinessInfo = By.xpath("//span[text()='Business Information']");

	public By BuildingWorkComponent = By.xpath("//a[normalize-space()='4.5 Building And Civil Works']");

	public By BuildingWorkHeader = By.xpath("//h4[text()='Building & Civil Work Details']");

	public By MainText = By.xpath("//div[@class='add-entrepreneur-message d-flex text-center justify-content-center flex-column p-4']");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddDetails = By.xpath("//button[normalize-space()='Add Details']");

	public By ExistingProposed = By.xpath("//label[text()='Existing/Proposed']/parent::div");

	public By SelectExistingProposed = By.xpath("//span[text()='Existing']");

	public By BuildingType = By.xpath("//label[text()='Building Type']/parent::div");

	public By SelectBuildingType = By.xpath("//span[text()='Commercial']");

	public By LandDocNo = By.xpath("//label[text()='Land Doc No']/parent::div");

	public By SelectLandDocNo = By.xpath("//span[text()='D4343']");
	
	public By BuildingAge = By.xpath("//input[@placeholder='Building Age']");
	
	public By EnterBuildingArea = By.xpath("//input[@placeholder='Building Area (In Sq ft)']");
	
	public By EnterCostForTheBuilding = By.xpath("//input[@placeholder='Cost Of Building Including GST (₹)']");
	
	public By EnterArchitectOrEngineersName = By.xpath("//input[@placeholder='Architect/Engineers Name']");

	public By CancelButton = By.xpath("//div[text()='Cancel']");

	public By SaveAsDraftButton = By.xpath("//div[normalize-space()='Save as Draft']");

	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");

	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

	public By Continue = By.xpath("//a[normalize-space()='Continue']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By ScrolltoContinue = By.xpath("//h4[normalize-space()='Land Details']");

	public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");

}
