package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Misc_Fixed_Assets {
	public By SecurtiyStageActive = By.xpath("//li[@class='step active']//span[text()='Security']");
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	public By SecurityMiscFixedAssetButton = By.xpath("//li[@class='step active']//a[text()='Misc Fixed Assets']");
	public By MiscFixedAssetDetailsHeading = By.xpath("//h4[text()='Misc Fixed Asset Details ']");
	public By ViewMiscFixedAssetDetailsGridHeading = By.xpath("//div[@class='edit-entrepreneur']");
	public By ListOfMiscFixedAssetButton = By.xpath("//a[@class='chip-text-wrapper text-decoration-none']");
	public By MiscFixedAssetText = By.xpath("//input[@name='MiscFixedAsset']");
	public By CostForMiscFixedIncludingGSTText  = By.xpath("//input[@name='CostForUtilityIncludingGST']");
	public By CancelButton = By.xpath("//div[text()='Cancel']");
	public By ViewContentMiscFixedAssets = By.xpath("//span[@class='d-flex justify-content-center']");
	public By MiscFixedAssetsContinueButton = By.xpath("//button[@class='button secondary-green btn-medium d-flex align-items-center justify-content-center  ']");
	public By VehicleDetailsPageHeading = By.xpath("//h4[text()='Vehicle Details']");

	
}
