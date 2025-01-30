package com.Page_Repositary; 

import org.openqa.selenium.By;

public class Project_Details {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By ScrolltoProjectdetails = By.xpath("//h4[normalize-space()='Term Loan KSIDC']");
	
	public By ProjectDetails = By.xpath("//a[normalize-space()='1.4 Project Details']");
	
	public By ProjectDetailsHeader = By.xpath("//h4[normalize-space()='Project Details']/parent::div");
	
	public By EnterProjectDescription = By.xpath("//textarea[@placeholder='Project Description']");
	
	public By EnterInnovationOrIdeaForProduct = By.xpath("//textarea[@placeholder='Innovation Or Idea For The Product Or Service Offered']");
	
	public By EnterTechnologyOrProvenConcept = By.xpath("//textarea[@placeholder='Technology Involved Or Proven Concept']");
	
	public By EnterAddressableOrserviceableMarket = By.xpath("//textarea[@placeholder='Addressable Or Serviceable Market']");
	
	public By EnterReachOutStrategies = By.xpath("//textarea[@placeholder='Reach Out Strategies']");
	
	public By EnterProposedRevenueModelPricing = By.xpath("//textarea[@placeholder='Proposed Revenue Model And Pricing']");
	
	public By EnterCurrentStatusOfProject = By.xpath("//textarea[@placeholder='Current Status of Project ']");
	
	public By EnterMarketAndFutureProfitability = By.xpath("//textarea[@placeholder='Market and Future Profitability']");
	
	public By EnterExitOptionsForLender = By.xpath("//textarea[@placeholder='Exit Options For Lender']");
	
	public By EnterProductOrServicesOrRawmeterialsOfTheProject = By.xpath("//textarea[@placeholder='Product/Services/Raw materials Of The Project']");
	
	public By Scrolltooption = By.xpath("//label[text()='Exit Options For Lender']");
	
	public By IsneededadditionalUnits = By.xpath("//p[normalize-space()='Is Needed Additional Units']/parent::div");
	
	public By RadioButtonCheck = By.xpath("//div[@class='rz-radio-button-list-horizontal valid rz-state-empty']");
	
	public By YESRadioButton = By.xpath("(//div[@class='rz-radio-btn'])[1]");
	
	public By AddProjectDetailsButton = By.xpath("//button[normalize-space()='Add Project Unit Details']");
	
	public By AssProjectUnitDetailesHeader = By.xpath("//div[normalize-space()='Add Project Units Details']");
	
	public By EnterUnitName = By.xpath("//input[@placeholder='Unit Name']");
	
	public By EnterUnitType = By.xpath("//input[@placeholder='Unit Type']");
	
	public By EnterUnitAge = By.xpath("//input[@placeholder='Unit Age']");
	
	public By Address1 = By.xpath("//input[@placeholder='Address Line1']");
	
	public By Address2 = By.xpath("//input[@placeholder='Address Line2']");

	public By Address3 = By.xpath("//input[@placeholder='Address Line3']");
	
	public By PinCode = By.xpath("//input[@placeholder='PinCode']");
	
	public By State = By.xpath("//label[text()='State']/parent::div");
	
	public By SelectState = By.xpath("//span[text()='KERALA']");
	
	public By District = By.xpath("//label[text()='District']/parent::div");
	
	public By SelectDistrict = By.xpath("//span[text()='KANNUR']");
	
	public By City = By.xpath("//label[text()='City']/parent::div");
	
	public By SelectCity = By.xpath("//span[text()='payyanur']");
	
	public By Post = By.xpath("//label[text()='Post']/parent::div");
	
	public By SelectPost = By.xpath("//span[text()='test post']");
	
	public By EnterVillage = By.xpath("//input[@placeholder='Village']");
	
	public By Panchayat = By.xpath("//label[text()='Panchayat']/parent::div");
	
	public By selectpanchayat = By.xpath("//span[text()='kannur panchayath']");
	
	public By AddUnitButton = By.xpath("//button[normalize-space()='Add Units']");
	
	public By ListOfUnits = By.xpath("//h6[normalize-space() = 'List of Project Unit Details']/parent::div");
	
	public By AddedListOfUnits = By.xpath("//div[@class='chip active']");
	
	public By DeleteMark = By.xpath("//a[@class='close-btn-wrapper']");
	
	public By DeleteYES = By.xpath("(//input[@value='Yes'])[1]");
	
	public By SaveAsDraft = By.xpath("//a[normalize-space ()='Save as Draft']");
	
	public By UpdateAndProcees = By.xpath("//button[normalize-space ()='Update and Proceed']");
	
	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");
}
