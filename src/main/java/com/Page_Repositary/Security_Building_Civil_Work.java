package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Building_Civil_Work {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoProjectCost = By.xpath("//span[text()='Project Cost and Means of finance Finalization']");

	public By BuildingCivilWorkComponent = By.xpath("//a[normalize-space()='5.4 Building And Civil Works']");
	
	public By LandDevelopmentHeading = By.xpath("//h4[text()='Land Development Details']");
	
	public By StageHeading = By.xpath("(//span[text()='Security'])[2]");

	public By AddedData = By.xpath("//span[@class='p-2']");
	
	public By TotalAmount = By.xpath("//span[@class='text-end pl-3']");

	public By DataField = By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]");
	
	public By BuildingAge = By.xpath("//input[@name='BuildingAge']");

	public By CancelButton = By.xpath("//div[text()='Cancel']");
	
	public By ContinueButtonLand = By.xpath("//button[normalize-space()='Continue']");

	
}
