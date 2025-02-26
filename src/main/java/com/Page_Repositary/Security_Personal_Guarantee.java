package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Personal_Guarantee {
	public By SecurtiyStageActive = By.xpath("//span[@class='step-heading' and text()='Security']");
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	public By SecurityPersonalGuaranteetButton = By.xpath("//li//a[text()='Personal Guarantee']");
	public By PersonalGuaranteeDetailsHeading = By.xpath("//h4[text()='Personal Guarantee Details']");
	public By AddDetailsButton = By.xpath("//button[@class='button btn-medium secondary w-auto']");
	public By EntrepreneursNameDropDown = By.xpath("//label[@class='rz-dropdown-label rz-inputtext  rz-placeholder']");
	public By AgeTxtBox = By.xpath("//input[@name='Age']");
	public By ShareValueTxtBox = By.xpath("//input[@name='Share']");
	public By NetWorthValueTxtBox = By.xpath("//input[@name='NetWorth']");
	public By EntrepreneursNameDropDownValue = By.xpath("(//li[@role='option'])[1]");
	public By SaveAndProceedButton = By.xpath("//button[text()='Save and Proceed']");
	public By Selected_EntrepreneursNameDropDownValue= By.xpath("//label[@class='rz-dropdown-label rz-inputtext ']");
	public By ListOfCorporateGuaranteeGridHeading = By.xpath("//span[@class='chip-heading p-0']");
	public By TotalShareGridValue = By.xpath("(//div[@class='col-md-12 col-xxl-12 d-flex align-items-center total_amount'])[1]");
	public By TotalNetWorthGridValue = By.xpath("(//div[@class='col-md-12 col-xxl-12 d-flex align-items-center total_amount'])[2]");
	public By PercentageofNetWorthGridValue = By.xpath("(//div[@class='col-md-12 col-xxl-12 d-flex align-items-center total_amount'])[3]");
	public By PersonalGuaranteeContinueButton = By.xpath("//button[@class='button secondary-green btn-medium d-flex align-items-center justify-content-center  ']");
	public By CollateralSecurityDetailssHeading = By.xpath("//h4[text()='Collateral Security']");

	
}
