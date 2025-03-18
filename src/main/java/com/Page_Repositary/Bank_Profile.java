package com.Page_Repositary;

import org.openqa.selenium.By;

public class Bank_Profile {
	
	public By ProfileIcon = By.xpath("//div[@class='gap-2 d-lg-flex d-none']//a[@class='d-block button round-button bg-secondary-green-80 link-dark text-decoration-none dropdown-toggle']");

	public By BankProfile = By.xpath("//ul[@class='dropdown-menu text-small user-dropdown mt-4 show']//a[text()='Bank Profile']");
	
	public By BankDetails = By.xpath("//div[@class='form-main-heading']/h4");
	
	public By IFSCCode = By.xpath("//input[@name='IFSCCode']");
	
	public By BankNameTitle = By.xpath("//label[@title='Bank Name']");
	
	public By BankName = By.xpath("//input[@name='BankName']");
	
	public By BranchNameTitle = By.xpath("//label[@title='Branch Name']");
	
	public By BranchName = By.xpath("//input[@name='BranchName']");
	
	public By AccountName = By.xpath("//input[@name='AccountName']");
	
	public By AccountNumber = By.xpath("//input[@name='AccountNo']");
	
	public By ReTypeAccountNo = By.xpath("//input[@name='ReTypeAccountNo']");
	
	public By UploadPassBook = By.xpath("//input[@type=\"file\" and @name=\"DocFile\"]");
	
	public By Save = By.xpath("//button[@type='submit']");
	
	
	
	
	
	
	
	
	
	
	
	
	
}
