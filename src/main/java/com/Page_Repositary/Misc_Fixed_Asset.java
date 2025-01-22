package com.Page_Repositary;

import org.openqa.selenium.By;

public class Misc_Fixed_Asset {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoBusinessInfo = By.xpath("//span[text()='Business Information']");

	public By MiscFixedAssetComponent = By.xpath("//a[normalize-space()='4.7 Misc Fixed Assets']");

	public By MiscFixedAssetHeader = By.xpath("//h4[text()='Misc Fixed Asset Details ']");

	public By StageHeading = By.xpath("//span[text()='Project Cost and Means of finance Finalization']");
	
	public By InformativeText = By.xpath("//span[normalize-space()='Begin your journey!']");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddDetails = By.xpath("//button[normalize-space()='Add Details']");

	public By MiscFixedAsset = By.xpath("//label[text()='Misc Fixed Asset']/parent::div");
	
	public By SelectMiscFixedAsset = By.xpath("//span[text()='Computers']");
	
	public By EnterCost = By.xpath("//input[@placeholder='Cost For Misc Fixed Including GST (₹)']");
	
	public By CostLabel = By.xpath("//label[contains(text(),'Cost For Misc Fixed Including GST (₹)')]");
	
	public By CancelButton = By.xpath("//div[text()='Cancel']");

	public By SaveAsDraftButton = By.xpath("//button[normalize-space()='Save as Draft']");

	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");

	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

	public By Continue = By.xpath("//a[normalize-space()='Continue']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By ScrolltoContinue = By.xpath("//h4[normalize-space()='Land Details']");

	public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");

}
