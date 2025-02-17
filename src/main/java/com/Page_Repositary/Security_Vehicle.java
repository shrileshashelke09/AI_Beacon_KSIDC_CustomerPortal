package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Vehicle {
	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoBusinessfinance = By.xpath("//span[text()='Business Finance']");

	public By ScrolltoSecurity = By.xpath("(//span[text()='Security'])[1]");
	
	public By Utilities = By.xpath("//a[normalize-space()='5.5 Utilities']");
	
	public By Vehicle = By.xpath("//a[normalize-space()='5.7 Vehicles']");
	
	public By ListOfVehicle = By.xpath("//a[@class='chip-text-wrapper text-decoration-none']");
	
	public By VehicleCategory = By.xpath("//label[@title='Vehicle Category']//following-sibling::div");
	
	public By Total = By.xpath("//span[normalize-space()='Total']");

}
