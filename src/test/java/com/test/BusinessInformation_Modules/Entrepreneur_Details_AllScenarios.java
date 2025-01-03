package com.test.BusinessInformation_Modules; 

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Entrepreneur_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Entrepreneur_Details_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Entrepreneur_Details_Module Entrepreneur_Details_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Entrepreneur_Details");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Entrepreneur_Details_Module = new Entrepreneur_Details_Module();

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

//				String EmailAddress = testdata.get("EmailAddress").toString();
//				String Password = testdata.get("Password").toString();
				String Aadhaar= testdata.get("Aadhaar").toString();
				String PAN = testdata.get("PAN").toString();
				String DOB = testdata.get("DOB").toString();
				String Mobile = testdata.get("Mobile").toString();
				String Email = testdata.get("Email").toString();
				String FirstName = testdata.get("FirstName").toString();
				String MiddleName = testdata.get("MiddleName").toString();
				String LastName = testdata.get("LastName").toString();
				String P_AddressLine1 = testdata.get("P_AddressLine1").toString();
				String P_AddressLine2 = testdata.get("P_AddressLine2").toString();
				String P_AddressLine3 = testdata.get("P_AddressLine3").toString();
				String LandMark = testdata.get("LandMark").toString();
				String Place = testdata.get("Place").toString();
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
				String PercentageOfShareHolding = testdata.get("PercentageOfShareHolding").toString();

				
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				

				// TC001
				ExtentTestManager.startTest("TC001 : Login for Entrepreneur Details Module");
				boolean Login = Entrepreneur_Details_Module.login();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Click on Login button" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				// TC002
				
				ExtentTestManager.startTest("TC002 - Navigate to Entrepreneur Details window");
				boolean EntrepreneurDetails = Entrepreneur_Details_Module.EntrepreneurDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the Entrepreneur Details button." + EntrepreneurDetails);
				ExtentTestManager.getTest().log(Status.PASS,"User navigates to the Entrepreneur Details window" + EntrepreneurDetails);
				
				
				// TC003
				
				ExtentTestManager.startTest("TC003 - Verify window header name");
				boolean EntrepreneurDetailsHeader = Entrepreneur_Details_Module.EntrepreneurDetailsHeader();
				ExtentTestManager.getTest().log(Status.PASS,"1. 1. Check the window header." + EntrepreneurDetailsHeader);
				ExtentTestManager.getTest().log(Status.PASS,"Header displays the correct name.." + EntrepreneurDetailsHeader);

				// TC004

				ExtentTestManager.startTest("TC004 - Text display verification in main window");
				boolean TextfromMainWindow = Entrepreneur_Details_Module.TextInMainWinow();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for specified text in the grid." + TextfromMainWindow);
				ExtentTestManager.getTest().log(Status.PASS,"Text \"Entrepreneur Details (Enter Details of major Share Holders...)\" is displayed" + TextfromMainWindow);
				
				//TC005
				
				ExtentTestManager.startTest("TC005 - Redirect to next component after \"Skip this for Now\"");
				boolean CheckSkipForNowButton = Entrepreneur_Details_Module.CheckSkipForNow();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Skip this for Now\" button." + CheckSkipForNowButton);
				ExtentTestManager.getTest().log(Status.PASS,
						"User is redirected to the next component" + CheckSkipForNowButton);
				
			
				//TC006 
				
				ExtentTestManager.startTest("TC006 - Verify \"Add Entrepreneur\" button presence");
				boolean CheckAddEntrepreneuButton = Entrepreneur_Details_Module.CheckAddEnterpreneurButton();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for \"Add Entrepreneur\" button on the page." + CheckAddEntrepreneuButton);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Entrepreneur\" button is displayed on the page" + CheckAddEntrepreneuButton);
				
				//TC007
				
				ExtentTestManager.startTest("TC007 - Add Entrepreneur button functionality");
				boolean ClickAddEntrepreneuButton = Entrepreneur_Details_Module.ClickAddEnterpreneurButton();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Add Entrepreneur\" button." + ClickAddEntrepreneuButton);
				ExtentTestManager.getTest().log(Status.PASS,"Redirected to Entrepreneur Details window." + ClickAddEntrepreneuButton);
				
				
				//TC008
				
				ExtentTestManager.startTest("TC008 - Availability of E-KYC Verification Section");
				boolean CheckKYCSectionAvailability = Entrepreneur_Details_Module.CheckKYCSectionAvailability();
				ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to Entrepreneur Info stage. Details window\r\n"+ "2. Check for presence of \"Enter details for E-KYC Verification\" section." + CheckKYCSectionAvailability);
				ExtentTestManager.getTest().log(Status.PASS,"Section is available." + CheckKYCSectionAvailability);
				
				//TC009
				
				
				ExtentTestManager.startTest("TC009 - Enter Data in Aadhaar Fields");
				boolean EnterDatainAdhar = Entrepreneur_Details_Module.EnterAadhar(Aadhaar);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter valid Aadhaar number.\r\n" + EnterDatainAdhar);
				ExtentTestManager.getTest().log(Status.PASS,"Data is entered successfully." + EnterDatainAdhar);
				
				//TC010
				
				ExtentTestManager.startTest("TC010 - Enter Data in PAN Fields");
				boolean EnterDatainPAN = Entrepreneur_Details_Module.EnterPAN(PAN);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter valid Aadhaar number.\r\n" + EnterDatainPAN);
				ExtentTestManager.getTest().log(Status.PASS,"Data is entered successfully." + EnterDatainPAN);
				
				//TC011
				
				ExtentTestManager.startTest("TC011 - Availability of \"Check Dedupe\" Button");
				boolean CheckDedupebuttonAvailability = Entrepreneur_Details_Module.CheckDedupebuttonAvailability();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for \"Check Dedupe\" button in Entrepreneur Details." + CheckDedupebuttonAvailability);
				ExtentTestManager.getTest().log(Status.PASS,"Button is present.." + CheckDedupebuttonAvailability);
				
														
				//TC012
				
				ExtentTestManager.startTest("TC012 - Functionality of \"Check Dedupe\" Button");
				boolean ClickCheckDedupeButton = Entrepreneur_Details_Module.ClickCheckDedupeButton();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Aadhaar and PAN.\r\n"+ "2. Click on \"Check Dedupe\" button." + ClickCheckDedupeButton);
				ExtentTestManager.getTest().log(Status.PASS,"Dedupe process is initiated and completed successfully" + ClickCheckDedupeButton);
				
				
				//TC013
				
				ExtentTestManager.startTest("TC013 - Success message verification post-dedupe");
				boolean CheckSuccessMessage = Entrepreneur_Details_Module.Checksucessmessage();
				ExtentTestManager.getTest().log(Status.PASS, "1. Complete dedupe process.\r\n"
						+ "2. Check for success message." + CheckSuccessMessage);
				ExtentTestManager.getTest().log(Status.PASS,"Success message \"Dedupe Verified Successfully\" is displayed" + CheckSuccessMessage);
				
				//TC014
				ExtentTestManager.startTest("TC014 - Dob field data entry");
				boolean EnterDOB = Entrepreneur_Details_Module.EnterDOB(DOB);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter date" + EnterDOB);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterDOB);
				
				
				//TC015
				
				ExtentTestManager.startTest("TC015 - Mobile field data entry");
				boolean EnterMobile = Entrepreneur_Details_Module.EnterMobile(Mobile);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Mobile" + EnterMobile);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterMobile);
				
				//TC016
				
				ExtentTestManager.startTest("TC016 - Email field data entry");
				boolean EnterEmail = Entrepreneur_Details_Module.EnterEmail(Email);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Email" + EnterEmail);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterEmail);
				
				//TC017
								
				
				ExtentTestManager.startTest("TC017 - First name field data entry");
				boolean EnterFirstname = Entrepreneur_Details_Module.EnterfirstName(FirstName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Firstname" + EnterFirstname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterFirstname);
				
				//TC018
				
				ExtentTestManager.startTest("TC018 - Middle name field data entry");
				boolean EnterMiddlename = Entrepreneur_Details_Module.EnterMiddleName(MiddleName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter MiddleName" + EnterMiddlename);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterMiddlename);
				
				//TC019
				
				ExtentTestManager.startTest("TC019 - Last name field data entry");
				boolean EnterLastname = Entrepreneur_Details_Module.EnterLastName(LastName);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter LastName" + EnterLastname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + EnterLastname);
				
				//TC020
				ExtentTestManager.startTest("TC020 - Full name field data entry");
				boolean ValidateFullname = Entrepreneur_Details_Module.ValidateFullName();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check FullName" + ValidateFullname);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + ValidateFullname);
				
				//TC021
				
				ExtentTestManager.startTest("TC021 - Age field data entry");
				boolean ValidateAge = Entrepreneur_Details_Module.validateAge();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Age" + ValidateAge);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" + ValidateAge);
				
				//TC022
				
				ExtentTestManager.startTest("TC022 - Gender field data entry");
				boolean SelectGender = Entrepreneur_Details_Module.SelectGender();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Gender" + SelectGender);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectGender);
				
				
				//TC023
				
				ExtentTestManager.startTest("TC023 - Designation field data entry");
				boolean SelectDesignation = Entrepreneur_Details_Module.SelectDesignation();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Designation" + SelectDesignation);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectDesignation);
				
				//TC024
				
				ExtentTestManager.startTest("TC024 - Verify \"Change Address\" checkbox availability");
				boolean ChangeAddressCheckbox = Entrepreneur_Details_Module.ValidateChangeAddressCheckbox();
				ExtentTestManager.getTest().log(Status.PASS, " Check for \"Change Address\" checkbox." + ChangeAddressCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"\"Change Address\" checkbox available." +ChangeAddressCheckbox);
				
				//TC025
				ExtentTestManager.startTest("TC025 - Address1 field data entry");
				boolean EnterAdd1 = Entrepreneur_Details_Module.EnterAddress1(P_AddressLine1);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd1);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd1);
				
				//TC026 
				
				ExtentTestManager.startTest("TC026 - Address2 field data entry");
				boolean EnterAdd2 = Entrepreneur_Details_Module.EnterAddress2(P_AddressLine2);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd2);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd2);
				
				//TC027
				
				ExtentTestManager.startTest("TC027 - Address3 field data entry");
				boolean EnterAdd3 = Entrepreneur_Details_Module.EnterAddress3(P_AddressLine3);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Address" + EnterAdd3);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterAdd3);
				
				//TC028
				
				ExtentTestManager.startTest("TC028 - Landmark field data entry");
				boolean EnterLandmark = Entrepreneur_Details_Module.EnterLandmark(LandMark);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Landmark" + EnterLandmark);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterLandmark);
				
				//TC029
				
				ExtentTestManager.startTest("TC029 - Place field data entry");
				boolean EnterPlace = Entrepreneur_Details_Module.EnterPlace(Place);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter Place" + EnterPlace);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +EnterPlace);
				
				//TC030
				
				ExtentTestManager.startTest("TC030 - Country field data entry");
				boolean SelectCountry = Entrepreneur_Details_Module.SelectCountry();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Country" + SelectCountry);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectCountry);
				
				//TC031
				
				ExtentTestManager.startTest("TC031 - State field data entry");
				boolean SelectState = Entrepreneur_Details_Module.SelectState();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select State" + SelectState);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectState);
				
				//TC032
				
				ExtentTestManager.startTest("TC032 - District field data entry");
				boolean SelectDistrict = Entrepreneur_Details_Module.SelectDistrict();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select State" + SelectDistrict);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectDistrict);
				
				
				//TC033
				
				ExtentTestManager.startTest("TC033 - City field data entry");
				boolean SelectCity = Entrepreneur_Details_Module.SelectCity();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select City" + SelectCity);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectCity);
				
				//TC034
				ExtentTestManager.startTest("TC034 - Post field data entry");
				boolean SelectPost = Entrepreneur_Details_Module.SelectPost();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Post" + SelectPost);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectPost);
				
				//TC035
				
				ExtentTestManager.startTest("TC035 - Taluk field data entry");
				boolean SelectTaluk = Entrepreneur_Details_Module.SelectTaluk();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select Taluk" + SelectTaluk);
				ExtentTestManager.getTest().log(Status.PASS,"Data entry should be successful" +SelectTaluk);
				
			//TC036
				
				ExtentTestManager.startTest("TC036 - Verify \"Same as Permanent Address\" checkbox availability");
				boolean Checkbox = Entrepreneur_Details_Module.ChecktheBoxforAddress();
				ExtentTestManager.getTest().log(Status.PASS,"1. Navigate to the Permanent Address section." +Checkbox);
				ExtentTestManager.getTest().log(Status.PASS,"2. Check for \"Same as Permanent Address\" checkbox." +Checkbox);
				ExtentTestManager.getTest().log(Status.PASS,"\"Same as Permanent Address\" checkbox  available." +Checkbox);

		//TC037				
				ExtentTestManager.startTest("TC037 - Verify functionality of \"Same as Permanent Address\" checkbox");
				boolean CLickCheckbox = Entrepreneur_Details_Module.ClickCheckbox();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check the \"Same as Permanent Address\" checkbox." +CLickCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"2. Verify current address fields auto-populate with permanent address data." +CLickCheckbox);
				ExtentTestManager.getTest().log(Status.PASS,"Current Address section auto-populate with permanent address data." +CLickCheckbox);
			
				//TC038
				
				ExtentTestManager.startTest("TC038 - Address Line1 data autoloaded");
				boolean ValidateAddress1 = Entrepreneur_Details_Module.validateAddress1();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress1);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress1);

				
				//TC039
				
				ExtentTestManager.startTest("TC039 - Address Line2 data autoloaded");
				boolean ValidateAddress2 = Entrepreneur_Details_Module.validateAddress2();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress2);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress2);

				//TC040
				
				ExtentTestManager.startTest("TC040 - Address Line3 data autoloaded");
				boolean ValidateAddress3= Entrepreneur_Details_Module.validateAddress3();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateAddress3);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateAddress3);

				//TC041
				
				ExtentTestManager.startTest("TC041 - Landmark data autoloaded");
				boolean ValidateLandmark= Entrepreneur_Details_Module.validateLandmark();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateLandmark);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateLandmark);

				//TC042
				
				ExtentTestManager.startTest("TC042 - Place data autoloaded");
				boolean ValidatePlace= Entrepreneur_Details_Module.validatePlace();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidatePlace);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidatePlace);

				//TC043
				
				ExtentTestManager.startTest("TC043 - Country data autoloaded");
				boolean ValidateCountry= Entrepreneur_Details_Module.validateCountry();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateCountry);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateCountry);

				//TC044
				
				ExtentTestManager.startTest("TC044 - State data autoloaded");
				boolean ValidateState= Entrepreneur_Details_Module.validateState();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateState);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateState);

				//TC045
				
				ExtentTestManager.startTest("TC045 - District data autoloaded");
				boolean ValidateDistrict= Entrepreneur_Details_Module.validateDistrict();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateDistrict);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateDistrict);

				//TC046
				
				ExtentTestManager.startTest("TC046 - City data autoloaded");
				boolean ValidateCity= Entrepreneur_Details_Module.validateCity();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateCity);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateCity);

				//TC047
				
				ExtentTestManager.startTest("TC047 - Post data autoloaded");
				boolean ValidatePost= Entrepreneur_Details_Module.validatePost();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidatePost);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidatePost);

				//TC048
				
				ExtentTestManager.startTest("TC048 - Taluk data autoloaded");
				boolean ValidateTaluk= Entrepreneur_Details_Module.validateTaluk();
				ExtentTestManager.getTest().log(Status.PASS,"1. verify autoloaded data" +ValidateTaluk);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be autolaoded" +ValidateTaluk);

				//TC049
				
				ExtentTestManager.startTest("TC049 -Verify \"Add Details\" button functionality for \"Add Educational Qualifications\" section");
				boolean ValidateEducationalButton= Entrepreneur_Details_Module.CheckAddEducationalDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"Education Qualification\" field." +ValidateEducationalButton);
				ExtentTestManager.getTest().log(Status.PASS,"Pop up open for " +ValidateEducationalButton);

				//TC50
				
				ExtentTestManager.startTest("TC050 -Verify \"Education Qualification\" field Selection");
				boolean SelectEducationaldata= Entrepreneur_Details_Module.SelectEducationalQualification();
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to select data from this field." +SelectEducationaldata);
				ExtentTestManager.getTest().log(Status.PASS,"User able to select a qualification from the list. " +SelectEducationaldata);

				//TC051
				
				ExtentTestManager.startTest("TC051 -Verify \"Educational Institutional Name\" field data entry");
				boolean EnterEducationalInstitutional= Entrepreneur_Details_Module.EnterEducationalInstitutional(Organization);
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to Enter data from this field." +EnterEducationalInstitutional);
				ExtentTestManager.getTest().log(Status.PASS,"User able to Enter institution name " +EnterEducationalInstitutional);

				
                //TC052
				
				ExtentTestManager.startTest("TC052 -Verify \"Course Name\" field data entry");
				boolean EnterCourseName= Entrepreneur_Details_Module.EnterCourseName(CourseName);
				ExtentTestManager.getTest().log(Status.PASS,"1. Attempt to Enter data from this field." +EnterCourseName);
				ExtentTestManager.getTest().log(Status.PASS,"User able to Enter institution name " +EnterCourseName);

				//TC053
				
				ExtentTestManager.startTest("TC053 -Verify \"From\" field data selection/entry");
				boolean EnterFromDate= Entrepreneur_Details_Module.EnterFromDate(From);
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"From\" field.\r\n"
						+ "2. Enter or select a valid date." +EnterFromDate);
				ExtentTestManager.getTest().log(Status.PASS,"Field  accept or allow selection of a valid date. " +EnterFromDate);

				//TC054
				
				ExtentTestManager.startTest("TC054 -Verify \"To\" field data selection/entry");
				boolean EnterToDate= Entrepreneur_Details_Module.EnterToDate(To);
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate the \"To\" field.\r\n"
						+ "2. Enter or select a valid date." +EnterToDate);
				ExtentTestManager.getTest().log(Status.PASS,"Field  accept or allow selection of a valid date. " +EnterToDate);

				//TC055
				
				ExtentTestManager.startTest("TC055 -Verify \"Add Details\" button availability in popup");
				boolean AddDetailsButton= Entrepreneur_Details_Module.CheckAddDetailsButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check availability and clickability of \"Add Details\" button." +AddDetailsButton);
				ExtentTestManager.getTest().log(Status.PASS,"Button available and clickable. " +AddDetailsButton);

				//TC056
				
				ExtentTestManager.startTest("TC056 -Verify educational details display in the grid");
				boolean AddedDetailsofEducation= Entrepreneur_Details_Module.CheckAddedDetailsforEducation();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +AddedDetailsofEducation);
				ExtentTestManager.getTest().log(Status.PASS,"Details display in the grid as added. " +AddedDetailsofEducation);

				//TC057
								
				ExtentTestManager.startTest("TC057 -Verify \"Add Details\" button functionality for \"Add Experience\" section");
				boolean AddedButtonforExperiance= Entrepreneur_Details_Module.AddExperianceButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the \"Add Details\" button in the \"Add Experience\" section." +AddedButtonforExperiance);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Experience\" popup should appear. " +AddedButtonforExperiance);

				//TC058
				
				ExtentTestManager.startTest("TC058 -select data from Industry Field");
				boolean SelectIndustry= Entrepreneur_Details_Module.SelectIndustry();
				ExtentTestManager.getTest().log(Status.PASS,"select data from the  \"Industry\" Field" +SelectIndustry);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +SelectIndustry);

				//TC059
				
				ExtentTestManager.startTest("TC059 -select data from \"Professional/Business Sector\" Field");
				boolean SelectProfessioanl= Entrepreneur_Details_Module.SelectProfessionalBusiness();
				ExtentTestManager.getTest().log(Status.PASS,"select data from the  \"Professional/Business Sector\" Field" +SelectProfessioanl);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +SelectProfessioanl);

				//TC060
				
				ExtentTestManager.startTest("TC060 -Enter data in\"Experience in years\"  Field");
				boolean EnterExperiance= Entrepreneur_Details_Module.EnterExperiance(Experience);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Numeric data in the  \"Experience in years\" Field" +EnterExperiance);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +EnterExperiance);

				//TC061
				
				ExtentTestManager.startTest("TC061 -Enter data in \"Summary\"  Field");
				boolean EnterSummary= Entrepreneur_Details_Module.EnterSummary(Summary);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Summary\" Field" +EnterSummary);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully select " +EnterSummary);

				//TC062
						
				ExtentTestManager.startTest("TC062 -Add Details button Functionality");
				boolean AddDetailsforExp= Entrepreneur_Details_Module.ClickToAddExpDetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on Add Details button" +AddDetailsforExp);
				ExtentTestManager.getTest().log(Status.PASS,"Experience data added sucessfully" +AddDetailsforExp);
				
				//TC063
				
				ExtentTestManager.startTest("TC063 -Verify experience details display in the grid");
				boolean AddedExperianceingrid= Entrepreneur_Details_Module.ValidateAddedExperiance();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +AddedExperianceingrid);
				ExtentTestManager.getTest().log(Status.PASS,"Details should display in the grid as added." +AddedExperianceingrid);
				
				//TC064
				
				ExtentTestManager.startTest("TC064 -Verify \"Add Details\" button functionality for \"Add Awards and Recognitions\" section");
				boolean AddbuttonofAward= Entrepreneur_Details_Module.clickAddAwardButton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on the \"Add Details\" button in the \"Add Awards and Recognitions\" section." +AddbuttonofAward);
				ExtentTestManager.getTest().log(Status.PASS,"\"Add Awards and Recognitions\" popup should appear." +AddbuttonofAward);
				
				//TC065
				
				ExtentTestManager.startTest("TC065 -\"Award Name\"  Field check");
				boolean EnterAward= Entrepreneur_Details_Module.EnterAwardName(AwardName);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Award Name\" Field" +EnterAward);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully Entered" +EnterAward);
				
				//TC066
				
				ExtentTestManager.startTest("TC066 -\"Award Provided by\"  Field check");
				boolean EnterAwardprovidedby= Entrepreneur_Details_Module.EnterAwardProvidedBy(AwardProvidedby);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Alpha Numeric data in the  \"Award Provided by\" Field" +EnterAwardprovidedby);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully Entered" +EnterAwardprovidedby);
				
				//TC067
				
				ExtentTestManager.startTest("TC067 -\"Award Received Year\"  Field check");
				boolean SelectAwardYear= Entrepreneur_Details_Module.selectAwardYear();
				ExtentTestManager.getTest().log(Status.PASS,"select  data in the  \"Award Received Year\" Field" +SelectAwardYear);
				ExtentTestManager.getTest().log(Status.PASS,"data successfully selected" +SelectAwardYear);
				
				//TC068
				
				
				ExtentTestManager.startTest("TC068 -\"Add Details\"  Button check");
				boolean AddAward= Entrepreneur_Details_Module.clickAddAwarddetails();
				ExtentTestManager.getTest().log(Status.PASS,"click on the \"Add Details\" button" +AddAward);
				ExtentTestManager.getTest().log(Status.PASS,"Awards and Recognitions data saved succeddfully." +AddAward);
				
				
						
				//TC069

				ExtentTestManager.startTest("TC069 -Verify awards and recognition display in the grid");
				boolean validateAddedAward= Entrepreneur_Details_Module.AddedAwardinGrid();
				ExtentTestManager.getTest().log(Status.PASS,"Check if details are displayed in the grid." +validateAddedAward);
				ExtentTestManager.getTest().log(Status.PASS,"Details should display in the grid as added." +validateAddedAward);
				
				//TC070
				
				ExtentTestManager.startTest("TC070 -Verify user can edit added details");
				boolean Editthedata= Entrepreneur_Details_Module.editawarddetails();
				ExtentTestManager.getTest().log(Status.PASS,"1. Select any detail from the grid." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"2. Attempt to edit details." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"3. Save changes." +Editthedata);
				ExtentTestManager.getTest().log(Status.PASS,"Changes should be saved and reflected in the grid." +Editthedata);
				
				//TC071
				
				ExtentTestManager.startTest("TC071 -Passport Number field data entry");
				boolean EnterPassportNo= Entrepreneur_Details_Module.EnterPassportNo(PassportNumber);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in Passport field" +EnterPassportNo);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterPassportNo);
				
				 
                //TC072
				
				ExtentTestManager.startTest("TC072 -Voter ID field data entry");
				boolean EnterVoterID= Entrepreneur_Details_Module.EnterVoterID(VoterId);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in VOter ID field" +EnterVoterID);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterVoterID);
				
				
				//TC073
				
				ExtentTestManager.startTest("TC073 -CKYC field data entry");
				boolean EnterCKYC= Entrepreneur_Details_Module.EnterCKYC(CKYC);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in CKYC field" +EnterCKYC);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterCKYC);
				
				
				//TC074
				
				
				ExtentTestManager.startTest("TC074 -Percentage field data entry");
				boolean EnterPercentage= Entrepreneur_Details_Module.Enterpercentage(PercentageOfShareHolding);
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter data in Percentage field" +EnterPercentage);
				ExtentTestManager.getTest().log(Status.PASS,"2. Data entry should be successful" +EnterPercentage);
				
				
				//TC75
				
				
				ExtentTestManager.startTest("TC075 -Verify \"Terms and Conditions\" checkbox availability");
				boolean validateCheckfoxforTermsandCondiion= Entrepreneur_Details_Module.ValidateTermscheckbox();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate \"Terms and Conditions\" checkbox on the form." +validateCheckfoxforTermsandCondiion);
				ExtentTestManager.getTest().log(Status.PASS,"\"Terms and Conditions\" checkbox should be available." +validateCheckfoxforTermsandCondiion);
				
				
				//TC076
				
				ExtentTestManager.startTest("TC076 -Verify functionality of \"Terms and Conditions\" checkbox");
				boolean ClickCheckfoxforTermsandCondiion= Entrepreneur_Details_Module.clickTermscheckbox();
				ExtentTestManager.getTest().log(Status.PASS,"1. Check the \"Terms and Conditions\" checkbox." +ClickCheckfoxforTermsandCondiion);
				ExtentTestManager.getTest().log(Status.PASS,"Submission blocked until accepted." +ClickCheckfoxforTermsandCondiion);
				
				//TC077
				
				ExtentTestManager.startTest("TC077 -Verify functionality of \"Save As Draft\" button");
				boolean SaveAsDraft= Entrepreneur_Details_Module.SaveAsdraft();
				ExtentTestManager.getTest().log(Status.PASS,"Click \"Save As Draft\"." +SaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS,"Current session data saved for later retrieval." +SaveAsDraft);
				
				
				//TC078
				
				ExtentTestManager.startTest("TC078 -Verify functionality of \"Update and Proceed\" button");
				boolean SaveAndProceed= Entrepreneur_Details_Module.UpdateAndProceed();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click \"Save and Proceed\"." +SaveAndProceed);
				ExtentTestManager.getTest().log(Status.PASS,"Data should be saved, and user should be redirected to the main window." +SaveAndProceed);
				
				//TC079
				
				ExtentTestManager.startTest("TC079 -Verify window navigation after saving");
				boolean Validatemainwindow= Entrepreneur_Details_Module.checkmainwindoew();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click  \"Update and Proceed\".\r\n"
						+ "2. Check redirect to the main window." +Validatemainwindow);
				ExtentTestManager.getTest().log(Status.PASS,"User should be redirected to the main window, retaining data." +Validatemainwindow);
				
				//TC080
				
				ExtentTestManager.startTest("TC080 -Verify \"Continue\" button availability");
				boolean Validatecontinuebutton= Entrepreneur_Details_Module.ValidateContinuebutton();
				ExtentTestManager.getTest().log(Status.PASS,"1. Locate \"Continue\" button on the form." +Validatecontinuebutton);
				ExtentTestManager.getTest().log(Status.PASS,"\"Continue\" button available." +Validatecontinuebutton);
				
				
				//TC081
				
				ExtentTestManager.startTest("TC081 -Verify functionality of \"Continue\" button");
				boolean clickcontinuebutton= Entrepreneur_Details_Module.clicktocontinue();
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