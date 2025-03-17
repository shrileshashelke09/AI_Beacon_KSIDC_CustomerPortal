package com.Page_Repositary;

import org.openqa.selenium.By;

public class Application_Summary_Basic_Info {

    public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By BusinessInfo = By.xpath("//button[@class='nav-link active']");
	
	public By BasicInfo = By.xpath("//label[text()='Basic Information']");
	
	public By BasicInfoPageTitle = By.xpath("//h5[text()='Basic Information']");
	
	public By scrolltoDate = By.xpath("//label[text()='Date Of Incorporation']");
	
	public By ScrolltoLandmark = By.xpath("//label[@title='Landmark']");
	
	public By ScrolltoCity = By.xpath("//label[@title='City']");
	
	public By ScrolltoTAN = By.xpath("//label[@title='TAN']");
	
	public By BankDetails = By.xpath("//div[@class='chip active']");
	
	public By BankDetailsHader = By.xpath("//div[normalize-space()='View Bank Account Details']");
	
	public By CloseIcon = By.xpath("//span[@class='rzi rzi-times']");
	
	public By TotalGenderCount = By.xpath("//h6[@class='ms-auto']");
	
	public By Checkbox = By.xpath("//span[@class='rz-chkbox-icon rzi rzi-check']");
	
	public By VisibiliyofContinueButton = By.xpath("//button[normalize-space()='Continue']");


	
	
}
