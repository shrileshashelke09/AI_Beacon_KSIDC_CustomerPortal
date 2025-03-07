package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Plant_Machinary {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoProjectCost = By.xpath("//span[text()='Project Cost and Means of finance Finalization']");

	public By PlantAndMachineryComponent = By.xpath("//a[normalize-space()='5.1 Plant And Machinery']");

	public By PlantAndMachineryHeader = By.xpath("//h4[text()='Plant & Machinery Details ']");

	public By StageHeading = By.xpath("(//span[text()='Security'])[2]");
	
	public By SubHeading = By.xpath("//span[normalize-space()='LIST OF PLANT & MACHINERY']");

	public By InformativeText = By.xpath("//span[@class='d-flex justify-content-center']");
	
	public By AddedData = By.xpath("//span[@class='p-2']");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By TotalAmount = By.xpath("//span[@class='text-end pl-3']");
	
	public By DataField = By.xpath("(//label[@class='rz-dropdown-label rz-inputtext ']/parent::div)[1]");
	
	public By MacineryName = By.xpath("//input[@name='MachineryName']");
	
	public By Questiontoggle = By.xpath("//p[@title='Do You Want To Edit The Tax Rate?']/parent::div");
	
	public By BCD = By.xpath("(//input[@name='MachineryBCD'])[1]");
	
	public By CancelButton = By.xpath("//div[text()='Cancel']");
}
