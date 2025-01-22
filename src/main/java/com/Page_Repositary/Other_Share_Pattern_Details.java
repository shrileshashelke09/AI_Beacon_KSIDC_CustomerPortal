package com.Page_Repositary; 

import org.openqa.selenium.By;

public class Other_Share_Pattern_Details {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By Scrolltobasic = By.xpath("//a[normalize-space()='1.1 Basic Information']");

	public By EnterpreneurDetailsModule = By.xpath("//span[text()='Entrepreneurs Info']");
	
	public By ScrolltoStep2 = By.xpath("//h4[normalize-space()='Step 2']");
	
	public By OtherPattern = By.xpath("//a[normalize-space()='2.3 Other Share Pattern Details']");
	
	public By OtherPatternHeading = By.xpath("//h4[text()='Other Share Pattern Details']");
	
	public By NoOnNonMajorShareHolders = By.xpath("//input[@placeholder='Number Of Non-Major Share Holders']");
	
	public By PercentageOfShareHolded = By.xpath("//input[@placeholder='Percentage Of Share Holding']");
	
	public By CancelButton = By.xpath("//a[text()='Cancel']");
	
	public By SaveAsDraftButton = By.xpath("//button[text()='Save as Draft']");
	
	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");
	
	public By Continue = By.xpath("//a[normalize-space()='Continue']");
	
	public By ClickOK = By.xpath("//input[@value='Okay']");
	
	public By Successpopup = By.xpath("//div[@class='rz-growl-item']");
	
	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");

		
}
