package com.Page_Repositary;

import org.openqa.selenium.By;

public class Business_Entrepreneur_Details {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By BusinessEnterheader = By.xpath("//h4[text()='Business Entrepreneur Details']");
	
	public By MainText = By.xpath("//span[@class='d-flex justify-content-center flex-wrap']");
	
	public By SkipforNow = By.xpath("//span[text()='Skip this for now']");
	
	public By NextComp = By.xpath("//h4[text()='Business Entity Details']");
	
	public By accessbusinessenterpreneur = By.xpath("//a[normalize-space()='3.1 Business Entrepreneurs Details']");
	
	public By AddEnterpreneurButton = By.xpath("//button[normalize-space()='Add Entrepreneur Details']");
	
	public By EnerpreneurName = By.xpath("//label[text()='Entrepreneur Name']/parent::div");
	
	public By SelectEnterpreneurName = By.xpath("//span[text()='KIA ABC DERF']");
	
	public By EnterDetailsofActivity = By.xpath("//textarea[@placeholder='Details Of Present Activities']");
	
	public By EnterNetworth = By.xpath("//input[@placeholder='Net Worth (₹)']");
	
	public By EnterLaseyearincome = By.xpath("//input[@placeholder='Last Fin Year Total Income (₹)']");
	
	public By EnterFunds = By.xpath("//input[@placeholder='Funds']");
	
	public By ITRYes = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[1]");
	
	public By ManagingOherCompany = By.xpath("(//span[@class='rz-radiobutton-icon']/parent::div)[2]");
	
	public By AddCompanyButton = By.xpath("//a[normalize-space()='Add Company']");
	
	public By EnterCompanyName = By.xpath("//input[@placeholder='Company Name']");
	
	public By EnterProduct = By.xpath("//input[@placeholder='Product /Service']");
	
	public By Enterfundinvestment =By.xpath("//input[@placeholder='Extent of Funds Invested(₹)']");
	
	public By Entershareholding = By.xpath("//input[@placeholder='Percentage of Share Holding']");
	
	public By EnterNetLoss = By.xpath("//input[@placeholder='Net Loss(₹)']");
	
	public By AddComapnyDetails = By.xpath("//button[text()='Add Company']");
}
