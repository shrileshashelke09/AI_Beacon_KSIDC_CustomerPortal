package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Summary {
	public By SecurtiyStageActive = By.xpath("//li[@class='step active']//span[text()='Security']");
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	public By SecuritySummaryButton = By.xpath("//li[@class='step active']//a[text()='Security Summary']");
	public By SecuritySummaryDetailsHeading = By.xpath("//h4[text()='Security Summary Details']");
	public By AddDetailsButton = By.xpath("//button[@class='button btn-medium secondary w-auto']");
	public By Plant_MachineryTxtBox = By.xpath("//input[@name='PlantAndMachinery']");
	public By TxtBox = By.xpath("//input[@name='PlantAndMachinery']");
	public By LandTxtBox = By.xpath("//input[@name='Land']");
	public By LandDevelopmentTxtBox = By.xpath("//input[@name='LandDevelopment']");
	public By UtilitiesTxtBox = By.xpath("//input[@name='Utilities']");
	public By MiscFixedAssetsTxtBox = By.xpath("//input[@name='MiscFixedAssets']");
	public By VehiclesTxtBox = By.xpath("//input[@name='Vehicles']");
	public By CollateralSecurityTxtBox = By.xpath("//input[@name='TechnicalKnowHowFees']");
	public By TotalAmountText = By.xpath("//span[@class='text-end pl-3']");
	public By PersonalGuaranteePercentageText = By.xpath("//label[@title='Personal Guarantee']//span");
	public By CorporateGuaranteePercentageText = By.xpath("//label[@title='Corporate Guarantee ']//span");
	public By SecuritySummaryContinueButton = By.xpath("//button[@class=' button secondary-green btn-medium d-flex align-items-center justify-content-center  ']");
	public By DocumentUploadDetailssHeading = By.xpath("//h4[text()='Document Upload']");

	
}
