package com.Page_Repositary;

import org.openqa.selenium.By;

public class Deposit_Details {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoBusinessFinance = By.xpath("//span[text()='Business Finance']");

	public By DepositComponent = By.xpath("//a[normalize-space()='4.9 Deposits']");

	public By DepositHeader = By.xpath("//h4[text()='Deposit Details ']");

	public By StageHeading = By.xpath("//span[text()='Project Cost and Means of finance Finalization']");

	public By InformativeText = By.xpath("//span[normalize-space()='Begin your journey!']");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By AddDetails = By.xpath("//button[normalize-space()='Add Details']");

	public By DepositType = By.xpath("//label[text()='Deposit Type']/parent::div");
	
	public By SelectDepositType = By.xpath("//span[text()='Test 123']");
	
	public By EnterDepositAmount = By.xpath("//input[@placeholder='Deposit Amount (₹)']");
	
	public By DepositLabel = By.xpath("//label[text()='Deposit Amount (₹)']");
	
	public By CancelButton = By.xpath("//div[text()='Cancel']");

	public By SaveAsDraftButton = By.xpath("//button[normalize-space()='Save as Draft']");

	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");

	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");

	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

	public By Continue = By.xpath("//a[normalize-space()='Continue']");

	public By AddedEnteredData = By.xpath("//span[@class='p-2']");

	public By ScrolltoContinue = By.xpath("//h4[normalize-space()='Land Details']");

	public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");

}
