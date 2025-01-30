package com.Page_Repositary;

import org.openqa.selenium.By;

public class Land {
	
	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By ScrolltoStep4 = By.xpath("//h4[normalize-space()='Step 4']");

	public By LandComponent = By.xpath("//a[normalize-space()='4.3 Land']");

	public By LandHeader = By.xpath("//h4[text()='Land Details']");
	
	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddDetails = By.xpath("//button[normalize-space()='Add Details']");

	public By EnterTitleHolder = By.xpath("//input[@placeholder='Title Holder']");
	
	public By EnterDocNo = By.xpath("//input[@placeholder='Doc No']");
	
	public By EnterSurveyNo = By.xpath("//input[@placeholder='Survey No']");
	
	public By EnterResurveyNo = By.xpath("//input[@placeholder='Resurvey No']");
	
	public By EnterExtendOfLandDRY = By.xpath("//input[@placeholder='Extent Of Land (DRY)']");
	
	public By EnterExtendOfLand = By.xpath("//input[@placeholder='Extent Of Land (Wet)']");
	
	public By Unit = By.xpath("//label[text()='Unit']/parent::div");
	
	public By SelectUnit = By.xpath("//span[text()='Acre']");
	
	public By EnterPinCode = By.xpath("//input[@placeholder='Pin Code']");
	
	public By PinLabel = By.xpath("//label[text()='Pin Code']");
	
	public By City = By.xpath("//label[text()='City']/parent::div");
	
	public By SelectCity = By.xpath("//span[text()='payyanur']");
	
	public By EnterPlace = By.xpath("//input[@placeholder='Place']");
	
	public By EnterVillage = By.xpath("//input[@placeholder='Village']");
	
	public By EnterTaluk = By.xpath("//input[@placeholder='Taluk']");

	public By Panchayat = By.xpath("//label[text()='Panchayat']/parent::div");
	
	public By SelectPanchayat = By.xpath("//span[text()='kannur panchayath']");
	
	public By Constituency = By.xpath("//label[text()='Constituency']/parent::div");
	
	public By SelectConstituency = By.xpath("//span[text()='Azhikode']");
	
	public By EnterCostOfLandIncludingRegistration = By.xpath("//input[@placeholder='Cost Of Land Excluding Registration (₹)']");

	public By EnterRegistrationAmount = By.xpath("//input[@placeholder='Registration And Stamp Duty (₹)']");
	
	public By CancelButton = By.xpath("//div[text()='Cancel']");

	public By SaveAsDraftButton = By.xpath("//button[normalize-space()='Save As Draft']");

	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");

	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

	public By Continue = By.xpath("//a[normalize-space()='Continue']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By ScrolltoContinue = By.xpath("//h4[normalize-space()='Land Details']");
	
	public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");


}


