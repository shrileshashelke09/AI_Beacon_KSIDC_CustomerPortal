package com.Page_Repositary;

import org.openqa.selenium.By;

public class Entrepreneur_Details {

	public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By EnterEmailAddress = By.xpath("(//input[@placeholder='Email Address'])[1]");

	public By EnterPassword = By.xpath("(//input[@placeholder='Password'])[1]");

	public By ClicktoLogin = By.xpath("(//button[@class=' w-100 button primary btn-medium'])[1]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By Scrolltobasic = By.xpath("//a[normalize-space()='1.1 Basic Information']");

	public By EnterpreneurDetailsModule = By.xpath("//span[text()='Entrepreneurs Info']");

	// public By EnterpreneurDetails = By.xpath("//a[normalize-space()='2.1
	// Entrepreneurs Details']");

	public By EntrepreneurDetailsHeader = By.xpath("//h4[text()='Entrepreneur Details']");

	public By TextinMainWindow = By
			.xpath("//span[contains(text(),'Entrepreneur Details (Enter Details of major Share')]");

	public By SkipForNow = By.xpath("//span[text()='Skip this for now']");

	public By SkippedElement = By.xpath("//h4[text()='Entity Details']");

	public By AddEntrepreneur = By.xpath("//button[@class='button btn-medium secondary w-auto']/parent::div");

	public By KYCSectionAvailability = By.xpath("//h5[text()='Enter details for E-KYC Verification']");

	public By EnterAadhar = By.xpath("//input[@placeholder='XXXX-XXXX-XXXX']");

	public By EnterPAN = By.xpath("//input[@placeholder='PAN']");

	public By EnterDOB = By.xpath("//input[@placeholder='DOB']");

	public By EnterMobile = By.xpath("//input[@placeholder='Mobile']");

	public By EnterEmail = By.xpath("//input[@placeholder='E-Mail']");

	public By CheckDedupeButtonAvailability = By.xpath("//button[text()='Check Dedupe']");

	public By Error = By.xpath("//div[@class='rz-growl-item']");

	public By Successfulpopup = By.xpath("//p[normalize-space()='Dedupe Verified Successfully']");

	public By DedupeVerified = By.xpath("//button[normalize-space()='Dedupe Verified']");

	public By EnterFirstName = By.xpath("//input[@placeholder='First Name']");

	public By EnterMiddleName = By.xpath("//input[@placeholder='Middle Name']");

	public By EnterLastName = By.xpath("//input[@placeholder='Last Name']");

	public By LastnameLabel = By.xpath("//label[text()='Last Name']");

	public By EnterFullName = By.xpath("//input[@placeholder='Full Name']");

	public By EnterAge = By.xpath("//label[text()='Age']/parent::div");

	public By Gender = By.xpath("//label[text()='Gender']/parent::div");

	public By SelectGender = By.xpath("//span[text()='Female']");

	public By Designation = By.xpath("//label[text()='Designation']/parent::div");

	public By SelectDesignation = By.xpath("//span[text()='Executive']");
	
	public By ChangeAddresscheckbox = By.xpath("(//div[@class='d-flex flex-md-row flex-column justify-content-between align-items-md-center gap-2'])[1]");

	public By EnterAddress1 = By.xpath("//input[@placeholder='Address Line1']");
	
	public By EnterAddress1Curraddress = By.xpath("(//input[@placeholder='Address Line1'])[2]");

	public By EnterAddress2 = By.xpath("//input[@placeholder='Address Line2']");

	public By EnterAddress3 = By.xpath("//input[@placeholder='Address Line3']");

	public By Landmark = By.xpath("//input[@placeholder='LandMark']");

	public By Place = By.xpath("//input[@placeholder='Place']");

	public By Country = By.xpath("//label[text()='Country']/parent::div");

	public By SelectCountry = By.xpath("(//span[text()='India'])[2]");

	public By State = By.xpath("//label[text()='State']/parent::div");

	public By SelectState = By.xpath("//span[text()='KERALA']");

	public By District = By.xpath("//label[text()='District']/parent::div");
	
	public By ScrollDistrict = By.xpath("(//label[text()='District'])[4]/parent::div");

	public By SelectDistrict = By.xpath("//span[text()='KANNUR']");
	
	public By City = By.xpath("//label[text()='City']/parent::div");
	
	public By Cityscroll = By.xpath("(//label[text()='Post'])[1]/parent::div");

	public By SelectCity = By.xpath("//span[text()='Test Data kannur']");
	
	public By Post = By.xpath("//label[text()='Post']/parent::div");

	public By SelectPost = By.xpath("//span[text()='kannur post']");
	
	public By Taluk = By.xpath("//label[text()='Taluk']/parent::div");

	public By SelectTaluk = By.xpath("(//span[text()='Taliparamba'])[2]");
	
	public By SameAsPerAddress = By.xpath("(//span[@class='rz-chkbox-icon'])[2]");
	
	public By PermanentAddress = By.xpath("//h5[text()='Permanent Address']");

	public By DistrictperAdd = By.xpath("(//label[text()='District'])[1]");

	public By CurrentAddress = By.xpath("//h5[text()='Current Address']");

	public By ChangeAddress = By.xpath("(//span[@class='rz-chkbox-icon'])[1]");

	public By PermanentAddressCheckbox = By.xpath("(//span[@class='rz-chkbox-icon'])[2]/parent::div");

	public By EducationalSection = By.xpath("//p[text()='Add Educational Qualifications']");

	public By DistrictCurAdd = By.xpath("(//label[text()='District'])[2]");

	public By ExperianceSection = By.xpath("//p[text()='Add Experience']");

	public By AwardSection = By.xpath("//p[text()='Add Awards and recognitions']");

	public By AddEducationalDetailsButton = By.xpath("(//button[@class='button btn-medium secondary w-auto'])[1]");

	public By EducationalQualification = By.xpath("//label[text()='Education Qualification']/parent::div");
	
	public By SelectEducationalQualification = By.xpath("//span[text()='B TECH']");
	
	public By EducationalInstitutional = By.xpath("//input[@placeholder='Educational Institutional Name']");
	
	public By CourseName = By.xpath("//input[@placeholder='Course Name']");
	
	public By FromDate = By.xpath("//input[@placeholder='From']");
	
	public By ToDate = By.xpath("//input[@placeholder='To']");
	
	public By AddDetailsButton = By.xpath("(//button[text()='Add Details'])[1]");
	
	public By AddedDataforEducation = By.xpath("//a[@class='chip-text-wrapper text-decoration-none']");
	
	public By AddDetailsButtonForExperiance = By.xpath("(//button[text()='Add Details'])[2]");
	
	public By Industry = By.xpath("//label[text()='Industry']/parent::div");
	
	public By SelectIndustry = By.xpath("//span[text()='Auto and Ancillary']");
	
	public By Professional = By.xpath("//label[text()='Professional / Business Sector']/parent::div");
	
	public By SelectProfessional = By.xpath("//span[text()='Auto Services']");
	
	public By EnterExperiance = By.xpath("//input[@placeholder='Experince in years']");
	
	public By EnterSummary = By.xpath("//textarea[@class='rz-textarea valid rz-state-empty form-control input-main']");
	
	public By AddDetailsForExperiance = By.xpath("(//button[text()='Add Details'])[1]");
	
	public By AddedExperiance = By.xpath("(//a[@class='chip-text-wrapper text-decoration-none'])[2]");

	public By AddDetailsButtonForAward = By.xpath("(//button[text()='Add Details'])[3]");
	
	public By EnterAwardName = By.xpath("//input[@placeholder='Award Name']");
	
	public By EnterAwardProvidedby = By.xpath("//input[@placeholder='Award Provided by']");
	
	public By AwardReceivedBy = By.xpath("//label[text()='Award Received Year']/parent::div");
	
	public By SelectAwardReceivedYear = By.xpath("(//span[text()='2022'])[2]");
	
	public By AddAwardDetails = By.xpath("(//button[text()='Add Details'])[1]");
	
	//public By AddedAwardDetails = By.xpath("(//a[@class='chip-text-wrapper text-decoration-none'])[3]");

//	public By AddAward = By.xpath("(//button[text()='Add Details'])[1]");
//	
	public By AddedAwardGrid = By.xpath("(//a[@class='chip-text-wrapper text-decoration-none'])[3]");
//	
    public By editAwardReceivedBy = By.xpath("//label[text()='Award Received Year']/parent::div");
	
	public By editSelectAwardReceivedYear = By.xpath("(//span[text()='2023'])[2]");
	
	public By UpdateAwardDetails = By.xpath("//button[text()='Update Details']");
	
	public By EnterPassportno = By.xpath("//input[@placeholder='Passport Number']");
	
	public By EnterVoterID = By.xpath("//input[@placeholder='Voters ID']");
	
	public By EnterCKYCNo = By.xpath("//input[@placeholder='CKYC Number']");
	
	public By EnterPercentage = By.xpath("//input[@placeholder='Percentage Of Share Holding']");
	
	public By TermsandCondition = By.xpath("//div[@class='form-check']/child::div");
	
	public By CheckboxTermschecked = By.xpath("//div[@class='form-check']/child::div");
	
	public By SaveAsDraft = By.xpath("//button[text()='Save as Draft']");
	
	public By ClickOK = By.xpath("//input[@value='Okay']");
	
	public By SaveAndProceed = By.xpath("//button[normalize-space()='Save and Proceed']");
	
	public By AddedEnteredData = By.xpath("//span[@class='p-2']");
	
	public By UpdateAndProceed = By.xpath("//button[normalize-space()='Update and Proceed']");
	
	public By ScrolltoContinue = By.xpath("//span[contains(text(),'Entrepreneur Details (Enter Details of major Share')]");

    public By ClickContinue = By.xpath("//button[normalize-space()='Continue']");


}
