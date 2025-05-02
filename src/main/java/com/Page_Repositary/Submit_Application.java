package com.Page_Repositary;

import org.openqa.selenium.By;

public class Submit_Application {
	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By SubmitApllicationSection = By.xpath("//span[text()='Submit Application and Application Summary']");
	
	public By SubmitApplication = By.xpath("//a[normalize-space()='6.2 Submit Application']");
	
	public By SubmitApplicationHeading = By.xpath("//div[@class='form-main-heading p-0 m-0']//h4");
	
	public By UploadSignature = By.xpath("//span[@class='rz-fileupload-choose rz-button rz-secondary']//following-sibling::input");
	
	public By View = By.xpath("//div[@class='d-flex flex-column ms-3']//a");
	
	public By TermsAndConditions = By.xpath("//span[contains(text(),'I hereby authorize KSIDC')]/a[contains(text(),'Terms & Conditions')]");
	
	public By ScrolltoCheckBox = By.xpath("//li[3]/strong");
	
	public By CheckBox = By.xpath("//div[@class='rz-chkbox-box']");
	
	public By AgreeButton = By.xpath("//button[@class='button primary btn-medium']");
	
	public By Cancel = By.xpath("//a[@class='button tertiary btn-medium d-flex align-items-center justify-content-center']");
	
	public By Submit = By.xpath("//input[@class='button primary btn-medium']");
	
	public By VerificationCodeField = By.xpath("//input[@id='hLrl3kZmGU']");
	
	public By VerifyCodeButton = By.xpath("//button[@class=' w-100 button primary btn-medium']");
	
	 //test
}