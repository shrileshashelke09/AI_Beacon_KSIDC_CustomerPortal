package com.Page_Repositary;

import org.openqa.selenium.By;

public class Document_Upload {
	
	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By ScrolltoDocOption = By.xpath("//p[normalize-space()='Enter your Business Information.']");
	
	public By DocumentUpload = By.xpath("//a[normalize-space()='1.5 Document Upload']");
	
	public By Scrolltobasicinfo = By.xpath("//h5[normalize-space()='BASIC INFORMATION']");
	
	public By ClicktoAadhar = By.xpath("//a[normalize-space()='Aadhaar']");
	
	public By scrolltouploaddoc = By.xpath("//h5[text()='EXISTING LIABILITIES']");
	
	public By Aadharinfo = By.xpath("//div[normalize-space()='STATE BANK OF INDIA - AADHAAR']");
	
	public By UploadDocument = By.xpath("//span[text()='Upload Document']/parent::span");
	
	public By AdharUpload = By.xpath("//div[@class='d-flex align-items-center justify-content-between']");
}

