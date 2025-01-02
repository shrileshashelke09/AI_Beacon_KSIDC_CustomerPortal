package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Entity_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Entity_Details_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Entity_Details_Module Entity_Details_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Entity_Details");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Entity_Details_Module = new Entity_Details_Module();

	}

	@Test(dataProvider = "TestData4")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "LoginButton");
				Base_Class.SetUp();

				String EmailAddress = testdata.get("EmailAddress").toString();
				String Password = testdata.get("Password").toString();
				String CompanyPAN = testdata.get("CompanyPAN").toString();
				String NameOfInstitution = testdata.get("NameOfInstitution").toString();
				String AddressLine1 = testdata.get("AddressLine1").toString();
				String AddressLine2 = testdata.get("AddressLine2").toString();
				String AddressLine3 = testdata.get("AddressLine3").toString();
				String LandMark = testdata.get("LandMark").toString();
				String Place = testdata.get("Place").toString();
				String Pin = testdata.get("Pin").toString();
                String InstitutionMobile = testdata.get("InstitutionMobile").toString();
				String InstitutionEmail = testdata.get("InstitutionEmail").toString();
				String ExternalCreditRatingTest = testdata.get("ExternalCreditRatingTest").toString();
				String TIN = testdata.get("TIN").toString();
				String TAN = testdata.get("TAN").toString();
				String GSTIN = testdata.get("GSTIN").toString();
				String CKYCID = testdata.get("CKYCID").toString();
				String PercentageOfShareHolding = testdata.get("PercentageOfShareHolding").toString();
				String Aadhaar = testdata.get("Aadhaar").toString();
				String CompanyPAN1 = testdata.get("CompanyPAN1").toString();
				String DOB = testdata.get("DOB").toString();
				String Mobile = testdata.get("Mobile").toString();
				String Email = testdata.get("Email").toString();
				String FirstName = testdata.get("FirstName").toString();
				String MiddleName = testdata.get("MiddleName").toString();
				String LastName = testdata.get("LastName").toString();
				String P_AddressLine1 = testdata.get("P_AddressLine1").toString();
				String P_AddressLine2 = testdata.get("P_AddressLine2").toString();
				String P_AddressLine3 = testdata.get("P_AddressLine3").toString();
				String LandMark1 = testdata.get("LandMark1").toString();
				String Place1 = testdata.get("Place1").toString();
				String Organization = testdata.get("Organization").toString();
				String CourseName = testdata.get("CourseName").toString();
				String From = testdata.get("From").toString();
				String To = testdata.get("To").toString();
				String Experience = testdata.get("Experience").toString();
				String Summary = testdata.get("Summary").toString();
				String AwardName = testdata.get("AwardName").toString();
				String AwardProvidedby = testdata.get("AwardProvidedby").toString();
				String PassportNumber = testdata.get("PassportNumber").toString();
				String VoterId = testdata.get("VoterId").toString();
				String CKYC = testdata.get("CKYC").toString();


				
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				

				// TC001
				ExtentTestManager.startTest("TC001 : Login for Entity Details Module");
				boolean Login = Entity_Details_Module.Login(EmailAddress, Password);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Click on Login button" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				// TC002
				
				ExtentTestManager.startTest("TC002 - Access Entity Details");
				boolean AccessEntityPage = Entity_Details_Module.AccessEntityDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on 'Entity Details' component" + AccessEntityPage);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Entity Details page" + AccessEntityPage);
				
				//TC003
				
				
				ExtentTestManager.startTest("TC003 - Add Entity");
				boolean ClickAddEntityButton = Entity_Details_Module.ClickAddEntityButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click 'Add Entity' option" + ClickAddEntityButton);
				ExtentTestManager.getTest().log(Status.PASS,"Add Entity form is displayed" + ClickAddEntityButton);
				
				
				//TC004
				
				ExtentTestManager.startTest("TC004 - COMPANY PAN Field - Valid Entry");
				boolean VerifyCompanyPAN = Entity_Details_Module.verifyCompanyPAN(CompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter a valid COMPANY PAN , eg-AAACG1295F\r\n"+ "2. Click on 'Check Dedupe'" + VerifyCompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS,"COMPANY PAN gets verified and button text changes to \"Dedupe Verified\"" + VerifyCompanyPAN);
				
				//TC005
				
				
				ExtentTestManager.startTest("TC005 - Name Of Institution - Alphanumeric");
				boolean EnterInstituteName = Entity_Details_Module.EnterInstituteName(NameOfInstitution);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'Name Of Institution' with alphanumeric values " + EnterInstituteName);
				ExtentTestManager.getTest().log(Status.PASS,"Input is accepted without error" + EnterInstituteName);
				
				//TC006
				
				ExtentTestManager.startTest("TC006 - Type Of Institution Organization - Dropdown Selection");
				boolean SelectTypeOfOrg = Entity_Details_Module.SelectTypeOfOrg();
				ExtentTestManager.getTest().log(Status.PASS,"1. Open 'Type Of Institution Organization' dropdown\r\n"
						+ "2. Select an option" + SelectTypeOfOrg);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is displayed correctly" + SelectTypeOfOrg);
				
				//TC007
				
				ExtentTestManager.startTest("TC007 - Class Of Activity - Dropdown Selection");
				boolean SelectClassofActivity = Entity_Details_Module.SelectclassofAct();
				ExtentTestManager.getTest().log(Status.PASS,"1. Open 'Class Of Activity' dropdown\r\n"
						+ "2. Select an option" + SelectClassofActivity);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is displayed correctly" + SelectClassofActivity);
				
				//TC008
				
				ExtentTestManager.startTest("TC008 - Date Of Incorporation - Date Entry");
				boolean SelectDateofInc = Entity_Details_Module.SelectDateofInc();
				ExtentTestManager.getTest().log(Status.PASS,"1.select a date from date picker for 'Date Of Incorporation'" + SelectDateofInc);
				ExtentTestManager.getTest().log(Status.PASS,"Date is accepted and displayed correctly" + SelectDateofInc);
				
				//TC009
				
				ExtentTestManager.startTest("TC009 - Address Line1 - Alphanumeric Entry");
				boolean EnterAddress1 = Entity_Details_Module.EnterAddress1(AddressLine1);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'Address Line1' as alphanumeric value in 'Address Line1' " + EnterAddress1);
				ExtentTestManager.getTest().log(Status.PASS,"Input is accepted without error" + EnterAddress1);
				
				//TC010
				
				ExtentTestManager.startTest("TC010 - Address Line2 - Alphanumeric Entry");
				boolean EnterAddress2 = Entity_Details_Module.EnterAddress2(AddressLine2);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'Address Line2' as alphanumeric value in 'Address Line1' " + EnterAddress2);
				ExtentTestManager.getTest().log(Status.PASS,"Input is accepted without error" + EnterAddress2);
				
				//TC011
				
				ExtentTestManager.startTest("TC011 - Address Line3 - Alphanumeric Entry");
				boolean EnterAddress3 = Entity_Details_Module.EnterAddress3(AddressLine3);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter 'Address Line3' as alphanumeric value in 'Address Line1' " + EnterAddress3);
				ExtentTestManager.getTest().log(Status.PASS,"Input is accepted without error" + EnterAddress3);
				
				//TC012
				ExtentTestManager.startTest("TC012 - Landmark field data entry");
				boolean EnterLandmark = Entity_Details_Module.EnterLandmark(LandMark);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Landmark" + EnterLandmark);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterLandmark);
				
				//TC013
				
				ExtentTestManager.startTest("TC013 - Place field data entry");
				boolean EnterPlace = Entity_Details_Module.EnterPlace(Place);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Place" + EnterPlace);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterPlace);
				
				//TC014
				
				ExtentTestManager.startTest("TC014 - PIN Field - Valid 6 Digit Entry");
				boolean EnterPIN = Entity_Details_Module.EnterPin(Pin);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Pin" + EnterPIN);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterPIN);
				
				//TC015
				
				ExtentTestManager.startTest("TC015 - Location Auto-Population - Country");
				boolean ValidateCountry = Entity_Details_Module.validateCountry();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid PIN\r\n"
						+ "2. Verify 'Country'" + ValidateCountry);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +ValidateCountry);
				
				//TC016
				
				ExtentTestManager.startTest("TC015 - Location Auto-Population - State");
				boolean ValidateState = Entity_Details_Module.validateState();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid PIN\r\n"
						+ "2. Verify 'State'" + ValidateState);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +ValidateState);
				
						
				//TC017
				
				ExtentTestManager.startTest("TC017 - Location Auto-Population - District");
				boolean ValidateDistrict = Entity_Details_Module.validateDistrict();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid PIN\r\n"
						+ "2. Verify 'District'" + ValidateDistrict);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +ValidateDistrict);
				
				
				
				//TC018
				
				
				ExtentTestManager.startTest("TC017 - Location selection - City");
				boolean SelectCity = Entity_Details_Module.SelectCity();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select City"+ SelectCity);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +SelectCity);
				
				
				//TC019
				
				ExtentTestManager.startTest("TC019 - Location Auto-Population - Post");
				boolean ValidatePost = Entity_Details_Module.validatePost();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid PIN\r\n"
						+ "2. Verify 'Post'" + ValidatePost);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +ValidatePost);
				
				//TC020
				
				ExtentTestManager.startTest("TC020 - Location selection - Taluk");
				boolean SelectTaluk = Entity_Details_Module.SelectTaluk();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Taluk"+ SelectTaluk);
				ExtentTestManager.getTest().log(Status.PASS,"All fields are correctly auto-populated based on PIN" +SelectTaluk);
				
				
				//TC021
				
				ExtentTestManager.startTest("TC021 - Institution Mobile - Valid 10 Digit Entry");
				boolean EnterInstitutionMobileNo = Entity_Details_Module.EnterInstitutionMobileNumber(InstitutionMobile );
				ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Institution Mobile field" + EnterInstitutionMobileNo);
				ExtentTestManager.getTest().log(Status.PASS , "2. Enter numeric data" + EnterInstitutionMobileNo);
				ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterInstitutionMobileNo);
				
				//TC022
				ExtentTestManager.startTest("TC022 - Institution Email - Valid Format");
				boolean EnterInstitutionEmail = Entity_Details_Module.EnterInstitutionEmail(InstitutionEmail);
				ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Institution Email field" + EnterInstitutionEmail);
				ExtentTestManager.getTest().log(Status.PASS , "2. Enter  data" + EnterInstitutionEmail);
				ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterInstitutionEmail);
				
				//TC023
				ExtentTestManager.startTest("TC023 - External Credit Rating - Numeric Entry");
				boolean EnterExternalCreditRatingTest = Entity_Details_Module.EnterExternalCreditRatingTest(ExternalCreditRatingTest);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter numeric data in 'External Credit Rating'" + EnterExternalCreditRatingTest);
				ExtentTestManager.getTest().log(Status.PASS,"Field is visible and accepts input" + EnterExternalCreditRatingTest);

				//TC024
				ExtentTestManager.startTest("TC024 - TIN Number - 11 Digit Alphanumeric");
				boolean EnterTIN = Entity_Details_Module.EnterTIN(TIN);
				ExtentTestManager.getTest().log(Status.PASS, " 1. Verify visibility of TIN field" + EnterTIN);
				ExtentTestManager.getTest().log(Status.PASS, " 2. Enter alphanumeric data" + EnterTIN);
				ExtentTestManager.getTest().log(Status.PASS, " Field is visible and accepts input" + EnterTIN);
                  
				
				//TC025
                ExtentTestManager.startTest("TC025 -  TAN Number - Valid Format");
			    boolean EnterTAN = Entity_Details_Module.EnterTAN(TAN);
				ExtentTestManager.getTest().log(Status.PASS , " 1.Check if the TAN field is visible." + EnterTAN);
				ExtentTestManager.getTest().log(Status.PASS , " 2.Enter alphanumeric data into the TAN field." + EnterTAN);
				ExtentTestManager.getTest().log(Status.PASS , "TAN field is visible and accepts alphanumeric input." + EnterTAN);
                 
                 
				//TC026
                ExtentTestManager.startTest("TC026 - GSTIN - Valid Format");
				boolean EnterGSTIN = Entity_Details_Module.EnterGSTIN(GSTIN);
				ExtentTestManager.getTest().log(Status.PASS , " 1.Check if the GSTIN field is visible" + EnterGSTIN);
				ExtentTestManager.getTest().log(Status.PASS , " 2.. Enter alphanumeric data into the GSTIN field." + EnterGSTIN);
				ExtentTestManager.getTest().log(Status.PASS , " GSTIN field is visible and accepts alphanumeric input." + EnterGSTIN);
                 
				//TC027
				ExtentTestManager.startTest("TC027 - CKYC-ID - 14 Digit Alphanumeric");
				boolean EnterCKYCID = Entity_Details_Module.EnterCKYCID(CKYCID);
				ExtentTestManager.getTest().log(Status.PASS , "CKYCID  Entered" + EnterCKYCID);
				ExtentTestManager.getTest().log(Status.PASS ,"CKYCID  displayed :" + EnterCKYCID);
                
				//TC028
				ExtentTestManager.startTest("TC028 - Percentage of share holding - ");
				boolean EnterPercentageofholding = Entity_Details_Module.EnterPercentageofholding(PercentageOfShareHolding);
				ExtentTestManager.getTest().log(Status.PASS , "1. Enter a numeric value in Percentage of share holding field" + EnterPercentageofholding);
				ExtentTestManager.getTest().log(Status.PASS ,"Input is accepted without error :" + EnterPercentageofholding);
                
				//TC029
				
				ExtentTestManager.startTest("TC029 - Navigate to Entrepreneur Details window of the Entity - ");
				boolean AddEnterpreneurDetails = Entity_Details_Module.AddEnterpreneurDetails();
				ExtentTestManager.getTest().log(Status.PASS , "1. Click on the Add Details option of Add Entrepreneur details of Entity" + AddEnterpreneurDetails);
				ExtentTestManager.getTest().log(Status.PASS ,"User navigates to the Entrepreneur Details window:" + AddEnterpreneurDetails);
                
				
				//TC030
				
				ExtentTestManager.startTest("TC030 - Verify window header name ");
				boolean EnterpreneurHeader = Entity_Details_Module.ValidateEnterpreneurHeader();
				ExtentTestManager.getTest().log(Status.PASS , "1. Check the window header." + EnterpreneurHeader);
				ExtentTestManager.getTest().log(Status.PASS ,"Header name should be correct as specified" + EnterpreneurHeader);
                
				//TC031
				
				ExtentTestManager.startTest("TC031 - Availability of E-KYC Verification Section");
				boolean CheckKYCSectionAvailability = Entity_Details_Module.CheckKYCSectionAvailability();
				ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to Entrepreneur Info stage. Details window\r\n"+ "2. Check for presence of \"Enter details for E-KYC Verification\" section." + CheckKYCSectionAvailability);
				ExtentTestManager.getTest().log(Status.PASS,"Section is available." + CheckKYCSectionAvailability);
			
				//TC032
				ExtentTestManager.startTest("TC032 - Enter Data in Aadhaar Fields");
				boolean EnterDatainAdhar = Entity_Details_Module.EnterAadhar(Aadhaar);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter valid Aadhaar number.\r\n" + EnterDatainAdhar);
				ExtentTestManager.getTest().log(Status.PASS,"Data is entered successfully." + EnterDatainAdhar);
				
				//TC033
				ExtentTestManager.startTest("TC033 - PAN Field");
				boolean EnterCompanyPAN = Entity_Details_Module.EnterCompanyPAN(CompanyPAN1);
				ExtentTestManager.getTest().log(Status.PASS , "1.Enter company PAN." + EnterCompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS ,"Company PAN Displayed" + EnterCompanyPAN);
                
					
				//TC034
				
				ExtentTestManager.startTest("TC034 - Availability of \"Check Dedupe\" Button");
				boolean CheckDedupebuttonAvailability = Entity_Details_Module.CheckDedupebuttonAvailability();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for \"Check Dedupe\" button in Entrepreneur Details." + CheckDedupebuttonAvailability);
				ExtentTestManager.getTest().log(Status.PASS,"Button is present.." + CheckDedupebuttonAvailability);
				
														
				//TC035
				
				ExtentTestManager.startTest("TC035 - Functionality of \"Check Dedupe\" Button");
				boolean ClickCheckDedupeButton = Entity_Details_Module.ClickCheckDedupeButton();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Check Dedupe\" button." + ClickCheckDedupeButton);
				ExtentTestManager.getTest().log(Status.PASS,"Dedupe process is initiated and completed successfully" + ClickCheckDedupeButton);
				
				//TC036
				
				ExtentTestManager.startTest("TC036 - Success message verification post-dedupe");
				boolean CheckSuccessMessage = Entity_Details_Module.Checksucessmessage();
				ExtentTestManager.getTest().log(Status.PASS, "1. Complete dedupe process.\r\n"
						+ "2. Check for success message." + CheckSuccessMessage);
				ExtentTestManager.getTest().log(Status.PASS,"Success message \"Dedupe Verified Successfully\" is displayed" + CheckSuccessMessage);
				
				
				//TC037
				ExtentTestManager.startTest("TC037 - Dob field data entry");
				boolean EnterDOB = Entity_Details_Module.EnterDOB(DOB);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter date" + EnterDOB);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterDOB);
				
				
				//TC038
				
				ExtentTestManager.startTest("TC038 - Mobile field data entry");
				boolean EnterMobile = Entity_Details_Module.EnterMobile(Mobile);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Mobile" + EnterMobile);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterMobile);
				
				//TC039
				
				ExtentTestManager.startTest("TC039 - Email field data entry");
				boolean EnterEmail = Entity_Details_Module.EnterEmail(Email);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Email" + EnterEmail);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterEmail);
				
				//TC40
				ExtentTestManager.startTest("TC040 - First name field data entry");
				boolean EnterFirstname = Entity_Details_Module.EnterfirstName(FirstName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Firstname" + EnterFirstname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterFirstname);
				
				//TC041
				
				ExtentTestManager.startTest("TC041 - Middle name field data entry");
				boolean EnterMiddlename = Entity_Details_Module.EnterMiddleName(MiddleName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter MiddleName" + EnterMiddlename);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterMiddlename);
				
				//TC042
				
				ExtentTestManager.startTest("TC042 - Last name field data entry");
				boolean EnterLastname = Entity_Details_Module.EnterLastName(LastName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter LastName" + EnterLastname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterLastname);
				
				//TC043
				ExtentTestManager.startTest("TC043 - Full name field data entry");
				boolean ValidateFullname = Entity_Details_Module.ValidateFullName();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check FullName" + ValidateFullname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + ValidateFullname);
				
				//TC044
				
				ExtentTestManager.startTest("TC044 - Age field data entry");
				boolean ValidateAge = Entity_Details_Module.validateAge();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Age" + ValidateAge);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + ValidateAge);
				
				//TC045
				
				ExtentTestManager.startTest("TC045 - Gender field data entry");
				boolean SelectGender = Entity_Details_Module.SelectGender();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Gender" + SelectGender);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectGender);
				
				
				//TC046
				
				ExtentTestManager.startTest("TC046 - Designation field data entry");
				boolean SelectDesignation = Entity_Details_Module.SelectDesignation();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Designation" + SelectDesignation);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectDesignation);
				
				
				//TC047
				
				ExtentTestManager.startTest("TC047 - Verify \"Change Address\" checkbox availability");
				boolean ChangeAddressCheckbox = Entity_Details_Module.ValidateChangeAddressCheckbox();
				ExtentTestManager.getTest().log(Status.PASS, " Check for \"Change Address\" checkbox." + ChangeAddressCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"\"Change Address\" checkbox available." +ChangeAddressCheckbox);
				
				//TC048
				ExtentTestManager.startTest("TC048 - Address1 field data entry");
				boolean EnterAdd1 = Entity_Details_Module.EnterAddress11(P_AddressLine1);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd1);
				
				//TC049
				
				ExtentTestManager.startTest("TC049 - Address2 field data entry");
				boolean EnterAdd2 = Entity_Details_Module.EnterAddress21(P_AddressLine2);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd2);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd2);
				
				//TC050
				
				ExtentTestManager.startTest("TC050 - Address3 field data entry");
				boolean EnterAdd3 = Entity_Details_Module.EnterAddress31(P_AddressLine3);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd3);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd3);
				
				//TC051
				
				ExtentTestManager.startTest("TC051 - Landmark field data entry");
				boolean EnterLandmark1 = Entity_Details_Module.EnterLandmark1(LandMark1);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Landmark" + EnterLandmark1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterLandmark1);
				
				//TC052
				
				ExtentTestManager.startTest("TC052 - Place field data entry");
				boolean EnterPlace1 = Entity_Details_Module.EnterPlace1(Place1);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Place" + EnterPlace1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterPlace1);
				
				//TC053
				ExtentTestManager.startTest("TC053 - Country field data entry");
				boolean SelectCountry = Entity_Details_Module.SelectCountry();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Country" + SelectCountry);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectCountry);
				
				//TC054
				
				ExtentTestManager.startTest("TC054 - State field data entry");
				boolean SelectState = Entity_Details_Module.SelectState();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select State" + SelectState);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectState);
				
				//TC055
				
				ExtentTestManager.startTest("TC055 - District field data entry");
				boolean SelectDistrict = Entity_Details_Module.SelectDistrict();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select State" + SelectDistrict);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectDistrict);
				
				
				//TC056
				
				ExtentTestManager.startTest("TC056 - City field data entry");
				boolean SelectCity1 = Entity_Details_Module.SelectCity1();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select City" + SelectCity1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectCity1);
				
				//TC057
				ExtentTestManager.startTest("TC057 - Post field data entry");
				boolean SelectPost = Entity_Details_Module.SelectPost();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Post" + SelectPost);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectPost);
				
				//TC058
				
				ExtentTestManager.startTest("TC058 - Taluk field data entry");
				boolean SelectTaluk1 = Entity_Details_Module.SelectTaluk1();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Taluk" + SelectTaluk1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectTaluk1);
				
				
				//TC059
				
				ExtentTestManager.startTest("TC059 - Verify functionality of \"Same as Permanent Address\" checkbox");
				boolean CLickCheckbox = Entity_Details_Module.ChecktheBoxforAddress();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check the \"Same as Permanent Address\" checkbox." +CLickCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"2. Verify current address fields auto-populate with permanent address data." +CLickCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"Current Address section auto-populate with permanent address data." +CLickCheckbox);
			
				//TC60
				ExtentTestManager.startTest("TC060 - Address Line1 data autoloaded");
				boolean ValidateAddress1 = Entity_Details_Module.validateAddress1();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress1);

				
				//TC061
				
				ExtentTestManager.startTest("TC061 - Address Line2 data autoloaded");
				boolean ValidateAddress2 = Entity_Details_Module.validateAddress2();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress2);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress2);

				//TC062
				
				ExtentTestManager.startTest("TC062 - Address Line3 data autoloaded");
				boolean ValidateAddress3= Entity_Details_Module.validateAddress3();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress3);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress3);

				//TC063
				
				ExtentTestManager.startTest("TC063 - Landmark data autoloaded");
				boolean ValidateLandmark= Entity_Details_Module.validateLandmark();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateLandmark);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateLandmark);

				//TC064
				
				ExtentTestManager.startTest("TC064 - Place data autoloaded");
				boolean ValidatePlace= Entity_Details_Module.validatePlace();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidatePlace);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidatePlace);

				//TC065
				
				ExtentTestManager.startTest("TC065 - PinCode data autoloaded");
				boolean ValidatePinCode= Entity_Details_Module.validatePinCode();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidatePinCode);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidatePinCode);

				//TC066
				ExtentTestManager.startTest("TC066 - Country data autoloaded");
				boolean ValidateCountry1= Entity_Details_Module.validateCountry();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateCountry1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateCountry);

				//TC067
				
				ExtentTestManager.startTest("TC067 - State data autoloaded");
				boolean ValidateState1= Entity_Details_Module.validateState();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateState1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateState1);

				//TC068
				
				ExtentTestManager.startTest("TC068 - District data autoloaded");
				boolean ValidateDistrict1= Entity_Details_Module.validateDistrict();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateDistrict1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateDistrict1);

				//TC069
				
				ExtentTestManager.startTest("TC069 - City data autoloaded");
				boolean ValidateCity= Entity_Details_Module.validateCity();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateCity);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateCity);

				//TC070
				
				ExtentTestManager.startTest("TC070 - Post data autoloaded");
				boolean ValidatePost1= Entity_Details_Module.validatePost();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidatePost1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidatePost1);

				//TC071
				
				ExtentTestManager.startTest("TC071 - Taluk data autoloaded");
				boolean ValidateTaluk= Entity_Details_Module.validateTaluk();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateTaluk);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateTaluk);

				//TC072
				
				ExtentTestManager.startTest("TC072 -Verify \"Add Details\" button functionality for \"Add Educational Qualifications\" section");
				boolean ValidateEducationalButton= Entity_Details_Module.CheckAddEducationalDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"Education Qualification\" field." +ValidateEducationalButton);
				ExtentTestManager.getTest().log(Status.PASS,"Pop up open for " +ValidateEducationalButton);

				//TC073
				ExtentTestManager.startTest("TC073 -Verify \"Education Qualification\" field Selection");
				boolean SelectEducationaldata= Entity_Details_Module.SelectEducationalQualification();
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to select data from this field." +SelectEducationaldata);
				ExtentTestManager.getTest().log(Status.PASS,"User able to select a qualification from the list. " +SelectEducationaldata);

				//TC074
				
				ExtentTestManager.startTest("TC074 -Verify \"Educational Institutional Name\" field data entry");
				boolean EnterEducationalInstitutional= Entity_Details_Module.EnterEducationalInstitutional(Organization);
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to Enter data from this field." +EnterEducationalInstitutional);
				ExtentTestManager.getTest().log(Status.PASS,"User able to Enter institution name " +EnterEducationalInstitutional);

				
                //TC075
				
				ExtentTestManager.startTest("TC075 -Verify \"Course Name\" field data entry");
				boolean EnterCourseName= Entity_Details_Module.EnterCourseName(CourseName);
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to Enter data from this field." +EnterCourseName);
				ExtentTestManager.getTest().log(Status.PASS,"User able to Enter institution name " +EnterCourseName);

				//TC076
				
				ExtentTestManager.startTest("TC076 -Verify \"From\" field data selection/entry");
				boolean EnterFromDate= Entity_Details_Module.EnterFromDate(From);
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"From\" field.\r\n"
						+ "2. Enter or select a valid date." +EnterFromDate);
				ExtentTestManager.getTest().log(Status.PASS,"Field  accept or allow selection of a valid date. " +EnterFromDate);

				//TC077
				
				ExtentTestManager.startTest("TC077 -Verify \"To\" field data selection/entry");
				boolean EnterToDate= Entity_Details_Module.EnterToDate(To);
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"To\" field.\r\n"
						+ "2. Enter or select a valid date." +EnterToDate);
				ExtentTestManager.getTest().log(Status.PASS,"Field  accept or allow selection of a valid date. " +EnterToDate);

				//TC078
				
				ExtentTestManager.startTest("TC078-Verify \"Add Details\" button availability in popup");
				boolean AddDetailsButton= Entity_Details_Module.CheckAddDetailsButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check availability and clickability of \"Add Details\" button." +AddDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Button available and clickable. " +AddDetailsButton);

				//TC079
				
				ExtentTestManager.startTest("TC079 -Verify educational details display in the grid");
				boolean AddedDetailsofEducation= Entity_Details_Module.CheckAddedDetailsforEducation();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +AddedDetailsofEducation);
				ExtentTestManager.getTest().log(Status.PASS,"Details display in the grid as added. " +AddedDetailsofEducation);

				
				//TC080
				
				ExtentTestManager.startTest("TC080 -Verify \"Add Details\" button functionality for \"Add Experience\" section");
				boolean AddedButtonforExperiance= Entity_Details_Module.AddExperianceButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the \"Add Details\" button in the \"Add Experience\" section." +AddedButtonforExperiance);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Experience\" popup should appear. " +AddedButtonforExperiance);

				//TC081
				
				ExtentTestManager.startTest("TC081 -select data from Industry Field");
				boolean SelectIndustry= Entity_Details_Module.SelectIndustry();
				ExtentTestManager.getTest().log(Status.PASS,"select data from the  \"Industry\" Field" +SelectIndustry);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +SelectIndustry);

				//TC082
				
				ExtentTestManager.startTest("TC082 -select data from \"Professional/Business Sector\" Field");
				boolean SelectProfessioanl= Entity_Details_Module.SelectProfessionalBusiness();
				ExtentTestManager.getTest().log(Status.PASS,"select data from the  \"Professional/Business Sector\" Field" +SelectProfessioanl);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +SelectProfessioanl);

				//TC083
				
				ExtentTestManager.startTest("TC083 -Enter data in\"Experience in years\"  Field");
				boolean EnterExperiance= Entity_Details_Module.EnterExperiance(Experience);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Numeric data in the  \"Experience in years\" Field" +EnterExperiance);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +EnterExperiance);

				//TC084
				
				ExtentTestManager.startTest("TC084 -Enter data in \"Summary\"  Field");
				boolean EnterSummary= Entity_Details_Module.EnterSummary(Summary);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Summary\" Field" +EnterSummary);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +EnterSummary);

				//TC085
						
				ExtentTestManager.startTest("TC085 -Add Details button Functionality");
				boolean AddDetailsforExp= Entity_Details_Module.ClickToAddExpDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on Add Details button" +AddDetailsforExp);
				ExtentTestManager.getTest().log(Status.PASS,"Experience data added sucessfully" +AddDetailsforExp);
				
				//TC086
				
				ExtentTestManager.startTest("TC086 -Verify experience details display in the grid");
				boolean AddedExperianceingrid= Entity_Details_Module.ValidateAddedExperiance();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +AddedExperianceingrid);
				ExtentTestManager.getTest().log(Status.PASS,"Details should display in the grid as added." +AddedExperianceingrid);
				
				//TC087
				ExtentTestManager.startTest("TC087 -Verify \"Add Details\" button functionality for \"Add Awards and Recognitions\" section");
				boolean AddbuttonofAward= Entity_Details_Module.clickAddAwardButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the \"Add Details\" button in the \"Add Awards and Recognitions\" section." +AddbuttonofAward);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Awards and Recognitions\" popup should appear." +AddbuttonofAward);
				
				//TC088
				
				ExtentTestManager.startTest("TC088 -\"Award Name\"  Field check");
				boolean EnterAward= Entity_Details_Module.EnterAwardName(AwardName);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Award Name\" Field" +EnterAward);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully Entered" +EnterAward);
				
				//TC089
				
				ExtentTestManager.startTest("TC089 -\"Award Provided by\"  Field check");
				boolean EnterAwardprovidedby= Entity_Details_Module.EnterAwardProvidedBy(AwardProvidedby);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Award Provided by\" Field" +EnterAwardprovidedby);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully Entered" +EnterAwardprovidedby);
				
				//TC090
				
				ExtentTestManager.startTest("TC090 -\"Award Received Year\"  Field check");
				boolean SelectAwardYear= Entity_Details_Module.selectAwardYear();
				ExtentTestManager.getTest().log(Status.PASS,"select  data in the  \"Award Received Year\" Field" +SelectAwardYear);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully selected" +SelectAwardYear);
				
				//TC091
				
				
				ExtentTestManager.startTest("TC091 -\"Add Details\"  Button check");
				boolean AddAward= Entity_Details_Module.clickAddAwarddetails();
				ExtentTestManager.getTest().log(Status.PASS,"click on the \"Add Details\" button" +AddAward);
				ExtentTestManager.getTest().log(Status.PASS,"Awards and Recognitions data saved succeddfully." +AddAward);
				
				
						
				//TC092

				ExtentTestManager.startTest("TC092-Verify awards and recognition display in the grid");
				boolean validateAddedAward= Entity_Details_Module.AddedAwardinGrid();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +validateAddedAward);
				ExtentTestManager.getTest().log(Status.PASS,"Details should display in the grid as added." +validateAddedAward);
				
				//TC093
				
				ExtentTestManager.startTest("TC093 -Verify user can edit added details");
				boolean Editthedata= Entity_Details_Module.editawarddetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Select any detail from the grid." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"2. Attempt to edit details." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"3. Save changes." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"Changes should be saved and reflected in the grid." +Editthedata);
				
				
				//TC094
				ExtentTestManager.startTest("TC094 -Passport Number field data entry");
				boolean EnterPassportNo= Entity_Details_Module.EnterPassportNo(PassportNumber);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in Passport field" +EnterPassportNo);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterPassportNo);
				
				 
                //TC095
				
				ExtentTestManager.startTest("TC095 -Voter ID field data entry");
				boolean EnterVoterID= Entity_Details_Module.EnterVoterID(VoterId);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in VOter ID field" +EnterVoterID);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterVoterID);
				
				
				//TC096
				
				ExtentTestManager.startTest("TC096 -CKYC field data entry");
				boolean EnterCKYC= Entity_Details_Module.EnterCKYC(CKYC);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in CKYC field" +EnterCKYC);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterCKYC);
				
				//TC097
				ExtentTestManager.startTest("TC097 -Verify functionality of \"Add details\" button");
				boolean validateAddEnterpreneurButton= Entity_Details_Module.AddDetailsofEnterpreneur();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click \"Add Details\"." +validateAddEnterpreneurButton);
				ExtentTestManager.getTest().log(Status.PASS,"Enterpreneur Details should added" +validateAddEnterpreneurButton);
				
				//TC098
				ExtentTestManager.startTest("TC098 -Verify \"Terms and Conditions\" checkbox availability");
				boolean validateCheckfoxforTermsandCondiion= Entity_Details_Module.ValidateTermscheckbox();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate \"Terms and Conditions\" checkbox on the form." +validateCheckfoxforTermsandCondiion);
				ExtentTestManager.getTest().log(Status.PASS,"\"Terms and Conditions\" checkbox should be available." +validateCheckfoxforTermsandCondiion);
				
				
				//TC099
				
				ExtentTestManager.startTest("TC09 -Verify functionality of \"Terms and Conditions\" checkbox");
				boolean ClickCheckfoxforTermsandCondiion= Entity_Details_Module.clickTermscheckbox();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check the \"Terms and Conditions\" checkbox." +ClickCheckfoxforTermsandCondiion);
				ExtentTestManager.getTest().log(Status.PASS,"Submission blocked until accepted." +ClickCheckfoxforTermsandCondiion);
				
				//TC100
				
				ExtentTestManager.startTest("TC100-Verify functionality of \"Save As Draft\" button");
				boolean SaveAsDraft= Entity_Details_Module.SaveAsdraft();
				ExtentTestManager.getTest().log(Status.PASS,"Click \"Save As Draft\"." +SaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS,"Current session data saved for later retrieval." +SaveAsDraft);
				
				
				//TC101
				
				ExtentTestManager.startTest("TC101 -Verify functionality of \"Update and Proceed\" button");
				boolean UpdateAndProceed= Entity_Details_Module.UpdateAndProceed();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click \"Save and Proceed\"." +UpdateAndProceed);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be saved, and user should be redirected to the main window." +UpdateAndProceed);
				
				//TC102
				
				ExtentTestManager.startTest("TC102 -Verify window navigation after saving");
				boolean Validatemainwindow= Entity_Details_Module.checkmainwindoew();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click  \"Update and Proceed\".\r\n"
						+ "2. Check redirect to the main window." +Validatemainwindow);
				ExtentTestManager.getTest().log(Status.PASS,"User should be redirected to the main window, retaining data." +Validatemainwindow);
				
				//TC103
				
				ExtentTestManager.startTest("TC103 -Verify \"Continue\" button availability");
				boolean Validatecontinuebutton= Entity_Details_Module.ValidateContinuebutton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate \"Continue\" button on the form." +Validatecontinuebutton);
				ExtentTestManager.getTest().log(Status.PASS,"\"Continue\" button available." +Validatecontinuebutton);
				
				
				//TC104
				
				ExtentTestManager.startTest("TC104 -Verify functionality of \"Continue\" button");
				boolean clickcontinuebutton= Entity_Details_Module.clicktocontinue();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click \"Continue\"." +clickcontinuebutton);
				ExtentTestManager.getTest().log(Status.PASS,"User should be navigated to the next component." +clickcontinuebutton);
				
		
				// App Logout

				Thread.sleep(2000);
				driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

		} catch (Exception e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			// driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}

	}

	@DataProvider(name = "TestData4")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}

}