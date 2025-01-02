package com.Page_Repositary;

import org.openqa.selenium.By;

public class Enterpreneur_Document_Upload {
	
	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By Scrolltobasic = By.xpath("//a[normalize-space()='1.1 Basic Information']");

	public By EnterpreneurDetailsModule = By.xpath("//span[text()='Entrepreneurs Info']");
	
	public By ScrolltoEnterpreneurHeader = By.xpath("//h4[text()='Entrepreneur Details']");
	
	public By DocUpload = By.xpath("//a[normalize-space()='2.4 Document Upload']");
	
	public By DocUploadHeader = By.xpath("//h4[text()='Document Upload']");
	
	public By ClicktoPAN = By.xpath("(//a[normalize-space()='PAN Image'])[1]");	
	
	public By UploadDocument = By.xpath("//span[text()='Upload Document']/parent::span");
	
}


