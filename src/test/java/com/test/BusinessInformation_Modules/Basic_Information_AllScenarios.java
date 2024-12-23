package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Basic_Information_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Basic_Information_AllScenarios extends Base_Class{
	
		
		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Basic_Information_Module Basic_Information_Module;
		
		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Basic_Information");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Basic_Information_Module = new Basic_Information_Module();

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

					ExtentTestManager.getTest().log(Status.PASS,
							"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
					Log.info("Button visible !");
					Thread.sleep(3000);
					
					
					String EmailAddress = testdata.get("EmailAddress").toString();
					String Password = testdata.get("Password").toString();
					String UdyamNoUdyogAadhaar = testdata.get("UdyamNoUdyogAadhaar").toString();
					String InstitutionMobile = testdata.get("InstitutionMobile").toString();
					String LandlineNumberTest = testdata.get("LandlineNumberTest").toString();
					String WebsiteTest = testdata.get("WebsiteTest").toString();
					String CIN = testdata.get("CIN").toString();
					String ExternalCreditRating = testdata.get("ExternalCreditRating").toString();
					String TIN = testdata.get("TIN").toString();
					String TAN = testdata.get("TAN").toString();
					String GSTIN = testdata.get("GSTIN").toString();
					String ShareHoldingByIndividuals = testdata.get("ShareHoldingByIndividuals").toString();
					String CKYCID = testdata.get("CKYCID").toString();
					String DPIITNumber = testdata.get("DPIITNumber").toString();
					String KSUMNumber = testdata.get("KSUMNumber").toString();
					String IFSCCODE = testdata.get("IFSCCODE").toString();
					String AccountNumber = testdata.get("AccountNumber").toString();

					
					//TC001
					ExtentTestManager.startTest("TC001 : Login for Business Information Module");
					boolean Login = Basic_Information_Module.Login(EmailAddress, Password);
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the login page." + Login);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter valid username and password." + Login);
					ExtentTestManager.getTest().log(Status.PASS, "3. Click on the 'Login' button." + Login);
					ExtentTestManager.getTest().log(Status.PASS,"User lands on Basic Information window with correct heading:" + Login);
	
					
					//TC002 
					
					ExtentTestManager.startTest("TC002 - MSME Radio displayed successfully");
					boolean MSMERadioButtonVisibility = Basic_Information_Module.MSMERadioVisibility();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of 'Is your business registered as MSME?' radio button" + MSMERadioButtonVisibility);
					ExtentTestManager.getTest().log(Status.PASS ,"MSME Radio displayed successfully :" + MSMERadioButtonVisibility);
					
					//TC003
					
					ExtentTestManager.startTest("TC003 - Select MSME Option");
					boolean MSME = Basic_Information_Module.SelectMSME();
					ExtentTestManager.getTest().log(Status.PASS , "1. Select 'Yes' for MSME\r\n"
							+ "2. Observe changes" + MSME);
					ExtentTestManager.getTest().log(Status.PASS ,"MSME-specific fields become visible and are selectable/enterable:" + MSME);
					
					//TC004
					ExtentTestManager.startTest("TC003 - Select MSME Option");
					boolean NonMSME = Basic_Information_Module.SelectNonMSME();
					ExtentTestManager.getTest().log(Status.PASS , "1. Select 'No' for MSME\r\n"
							+ "2. Observe changes" + NonMSME);
					ExtentTestManager.getTest().log(Status.PASS ,"NonMSME-specific fields become visible and are selectable/enterable:" + NonMSME);
					
					
					//TC005
                    
                    ExtentTestManager.startTest("TC05 - MSME Radio Button Selection Constraint");
					boolean SelectYesforMSME = Basic_Information_Module.SelectYesforMSME();
					ExtentTestManager.getTest().log(Status.PASS , "1. Select 'Yes'" + SelectYesforMSME);
					ExtentTestManager.getTest().log(Status.PASS , "2. Try selecting 'No' without deselecting 'Yes'" + SelectYesforMSME);
					ExtentTestManager.getTest().log(Status.PASS , "System only allow the selection of one radio button at a time" + SelectYesforMSME);

					
					//TC006
                    
                    ExtentTestManager.startTest("TC006 - Udyam No Field - Visibility and Input");
					boolean EnterUdyamNo = Basic_Information_Module.EnterUdyamNo(UdyamNoUdyogAadhaar);
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify Udyam No field is visible" + EnterUdyamNo);
					ExtentTestManager.getTest().log(Status.PASS , "2. Enter alphanumeric data" + EnterUdyamNo);
					ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterUdyamNo);
                    
					
					//TC007
					
					ExtentTestManager.startTest("TC007 - Verify \"Verify\" Button Near UDHYAM No");
					boolean VerifyUdyamNoButton = Basic_Information_Module.verifybutton();
					ExtentTestManager.getTest().log(Status.PASS , "1. Navigate to the page." + VerifyUdyamNoButton);
					ExtentTestManager.getTest().log(Status.PASS , "2. Check if the Verify button is displayed next to the UDHYAM No field." + VerifyUdyamNoButton);
					ExtentTestManager.getTest().log(Status.PASS , "Verify button is visible next to the UDHYAM No field." + VerifyUdyamNoButton);
                    
					//TC008 
					
					ExtentTestManager.startTest("TC008 - Verify \"Verify\" Button Near UDHYAM No");
					boolean VerifyUdyamNo = Basic_Information_Module.verifyUdyamNo();
					ExtentTestManager.getTest().log(Status.PASS , "1. Ensure UDHYAM No is entered." + VerifyUdyamNo);
					ExtentTestManager.getTest().log(Status.PASS , "2. Click on the Verify button." + VerifyUdyamNo);
					ExtentTestManager.getTest().log(Status.PASS , "Verification process initiates and result displayed." + VerifyUdyamNo);
                    
					
					//TC009
                    ExtentTestManager.startTest("TC009 - Name Of Enterprise Field - Visibility");
					boolean ValidateEnterprisesName = Basic_Information_Module.ValidateNameOfEnterprises();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Name Of Enterprise field" + ValidateEnterprisesName);
					ExtentTestManager.getTest().log(Status.PASS ,"Field is visible with correct data:" + ValidateEnterprisesName);
					
					//TC010
				
                    ExtentTestManager.startTest("TC010 - Type Of Enterprise Organization Field - Visibility");
					boolean ValidateTypeofEnterprises = Basic_Information_Module.ValidateTypeOfOrganization();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Type Of Enterprise Organization field" + ValidateTypeofEnterprises);
					ExtentTestManager.getTest().log(Status.PASS ,"Field is visible with correct data :" + ValidateTypeofEnterprises);
					
					//TC011
                    ExtentTestManager.startTest("TC011 - Class Of Activity Field - Visibility and Selection");
					boolean SelectClassofActivity = Basic_Information_Module.SelectClassofActivity();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify Class Of Activity field is visible" + SelectClassofActivity);
					ExtentTestManager.getTest().log(Status.PASS , "2. Select a value" + SelectClassofActivity);
					ExtentTestManager.getTest().log(Status.PASS , "Field is visible and value can be selected" + SelectClassofActivity);
					
					//TC012
                    ExtentTestManager.startTest("TC012 -Date Of Incorporation Field - Visibility");
					boolean ValidaeDateofInc = Basic_Information_Module.ValidateIncorporationDate();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify Date Of Incorporation field is visible" + ValidaeDateofInc);
					ExtentTestManager.getTest().log(Status.PASS ,"Field is visible with correct data:" + ValidaeDateofInc);
					
                    //TC013
                    ExtentTestManager.startTest("TC013 - Date Of Udyam Registration Field - Visibility");
					boolean ValidateDateofUdyamReg = Basic_Information_Module.ValidateUdyamRegDate();
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify Date Of Udyam Registration field is visible" + ValidateDateofUdyamReg);
					ExtentTestManager.getTest().log(Status.PASS ,"Field is visible with correct data:" + ValidateDateofUdyamReg);
                    				
					
                    //TC014
                    
                    ExtentTestManager.startTest("TC014 - Institution Mobile Field - Visibility and Input");
					boolean EnterInstitutionMobileNo = Basic_Information_Module.EnterInstitutionMobileNumber(InstitutionMobile );
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Institution Mobile field" + EnterInstitutionMobileNo);
					ExtentTestManager.getTest().log(Status.PASS , "2. Enter numeric data" + EnterInstitutionMobileNo);
					ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterInstitutionMobileNo);
					
					 //TC015
                    
                    ExtentTestManager.startTest("TC015 - Landline Number Field - Visibility and Input");
					boolean EnterLandlineNo = Basic_Information_Module.EnterLandlineNumber(LandlineNumberTest);
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Landline Number field" + EnterLandlineNo);
					ExtentTestManager.getTest().log(Status.PASS , "2. Enter numeric data" + EnterLandlineNo);
					ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterLandlineNo);
                    
                    //TC016
                    
                    ExtentTestManager.startTest("TC016 - Institution Email Field - Visibility and Input");
					boolean ValidateEmailID = Basic_Information_Module.ValidateAutoloadedEmail();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Email ID displayed" + ValidateEmailID);
                    Log.info("Autoloaded Email ID displayed :" + ValidateEmailID); 
                    
                    //TC017
                    
                    ExtentTestManager.startTest("TC017 - Website Field - Visibility and Input");
					boolean EnterWebsiteTest = Basic_Information_Module.EnterWebsiteTest(WebsiteTest);
					ExtentTestManager.getTest().log(Status.PASS , "1. Verify visibility of Website field" + EnterWebsiteTest);
					ExtentTestManager.getTest().log(Status.PASS , "2. Enter alphanumeric data" + EnterWebsiteTest);
					ExtentTestManager.getTest().log(Status.PASS , "Field is visible and accepts input" + EnterWebsiteTest);
                    
                    //TC018
                    
                    ExtentTestManager.startTest("TC018 - Official Address Of Enterprise Field - Visibility and Input");
					boolean ValidateAdress = Basic_Information_Module.ValidateOfficialAddress();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Address displayed" + ValidateAdress);
                    Log.info("Autoloaded Address displayed :" + ValidateAdress); 
                    
                    //TC019
                    
                    ExtentTestManager.startTest("TC019 - Autoloaded Landmark displayed");
					boolean ValidateLandmark = Basic_Information_Module.ValidateLandmark();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Landmark displayed" + ValidateLandmark);
                    Log.info("Autoloaded Landmark displayed :" + ValidateLandmark); 
                    
                    //TC020
                    
                    ExtentTestManager.startTest("TC020 - Autoloaded Place displayed");
					boolean ValidatePlace = Basic_Information_Module.ValidatePlace();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded place displayed" + ValidatePlace);
                    Log.info("Autoloaded place displayed :" + ValidatePlace); 
                    
                    //TC21 
                    
                    ExtentTestManager.startTest(" TC021 - Pin displayed");
					boolean ValidatePin = Basic_Information_Module.ValidatePin();
					ExtentTestManager.getTest().log(Status.PASS , " Pin displayed" + ValidatePin);
                    Log.info(" Pin displayed :" + ValidatePin); 
                    
                    //TC022
                    
                    ExtentTestManager.startTest(" TC022 - Country displayed");
					boolean validateCountry = Basic_Information_Module.Validatecountry();
					ExtentTestManager.getTest().log(Status.PASS , " Country displayed" + validateCountry);
                    Log.info(" Country displayed :" + validateCountry); 
                    
                    //TC023
                    
                    ExtentTestManager.startTest(" TC023 - State displayed");
					boolean ValidateState = Basic_Information_Module.ValidateState();
					ExtentTestManager.getTest().log(Status.PASS , " state displayed" + ValidateState);
                    Log.info(" state displayed :" + ValidateState); 
                    
                    //TC024
                    
                    ExtentTestManager.startTest(" TC024 - District displayed");
					boolean ValidateDistrict = Basic_Information_Module.ValidateDistrict();
					ExtentTestManager.getTest().log(Status.PASS , " District displayed" + ValidateDistrict);
                    Log.info(" District displayed :" + ValidateDistrict);
                    
                    //TC025
                    ExtentTestManager.startTest(" TC025 - CIty displayed");
					boolean ValidateCIty = Basic_Information_Module.ValidateCity();
					ExtentTestManager.getTest().log(Status.PASS , " City displayed" + ValidateCIty);
                    Log.info(" City displayed :" + ValidateCIty);
                    
                    //TC026
                    
                    ExtentTestManager.startTest("TC026 - Post displayed");
					boolean ValidatePost = Basic_Information_Module.ValidatePost();
					ExtentTestManager.getTest().log(Status.PASS , " Post displayed" + ValidatePost);
                    Log.info(" Post displayed :" + ValidatePost);
                    
                    //TC027
                    
                    ExtentTestManager.startTest("TC027 - Taluk Field - Visibility and Selection");
					boolean SelectTaluk = Basic_Information_Module.SelectTaluk();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Verify visibility of Taluk field\r\n"
							+ "2. Select a value" + SelectTaluk);
					ExtentTestManager.getTest().log(Status.PASS ," Selected Taluk displayed :" + SelectTaluk);
                    
                    //TC028
                    
                    ExtentTestManager.startTest("TC028 - Company PAN displayed");
					boolean ValidateCompanyPAN = Basic_Information_Module.ValidateCompanyPAN();
					ExtentTestManager.getTest().log(Status.PASS , " Company PAN  displayed" + ValidateCompanyPAN);
                    Log.info(" Company PAN  displayed :" + ValidateCompanyPAN);
                     
                    
                    //TC029
                    
                    ExtentTestManager.startTest(" TC029 - CIN Field - Visibility and Input");
					boolean EnterCIN = Basic_Information_Module.EnterCIN(CIN);
					ExtentTestManager.getTest().log(Status.PASS , " 1. Verify visibility of CIN field\r\n"
							+ "2. Enter numeric data" + EnterCIN);
					ExtentTestManager.getTest().log(Status.PASS ," Field is visible and accepts input :" + EnterCIN);
                    
                    //TC030
                    ExtentTestManager.startTest(" TC030- External Credit Rating Field - Visibility and Input");
					boolean EnterRating = Basic_Information_Module.EnterExternalCreditRating(ExternalCreditRating);
					ExtentTestManager.getTest().log(Status.PASS , " 1. Verify visibility of External Credit Rating field\r\n"
							+ "2. Enter numeric data" + EnterRating);
					ExtentTestManager.getTest().log(Status.PASS , " Rating  displayed :" + EnterRating);
                    
                    //TC031
                    
                    ExtentTestManager.startTest("TC031 - TIN Field - Visibility and Input");
					boolean EnterTIN = Basic_Information_Module.EnterTIN(TIN);
					ExtentTestManager.getTest().log(Status.PASS , " 1. Verify visibility of TIN field" + EnterTIN);
					ExtentTestManager.getTest().log(Status.PASS , " 2. Enter alphanumeric data" + EnterTIN);
					ExtentTestManager.getTest().log(Status.PASS , " Field is visible and accepts input" + EnterTIN);
                    
                    //TC032
                    
                    ExtentTestManager.startTest(" TC032 - Verify TAN Field Visibility and Input");
					boolean EnterTAN = Basic_Information_Module.EnterTAN(TAN);
					ExtentTestManager.getTest().log(Status.PASS , " 1.Check if the TAN field is visible." + EnterTAN);
					ExtentTestManager.getTest().log(Status.PASS , " 2.Enter alphanumeric data into the TAN field." + EnterTAN);
					ExtentTestManager.getTest().log(Status.PASS , "TAN field is visible and accepts alphanumeric input." + EnterTAN);
                    
                    //TC033
                    
                    ExtentTestManager.startTest(" TC033 - Verify GSTIN Field Visibility and Input");
					boolean EnterGSTIN = Basic_Information_Module.EnterGSTIN(GSTIN);
					ExtentTestManager.getTest().log(Status.PASS , " 1.Check if the GSTIN field is visible" + EnterGSTIN);
					ExtentTestManager.getTest().log(Status.PASS , " 2.. Enter alphanumeric data into the GSTIN field." + EnterGSTIN);
					ExtentTestManager.getTest().log(Status.PASS , " GSTIN field is visible and accepts alphanumeric input." + EnterGSTIN);
                    
                    //TC034
                    
                    ExtentTestManager.startTest(" TC034 - Verify Share Holding By Individuals Field Visibility and Input");
					boolean Entersharingindividual = Basic_Information_Module.EnterIndividualsharing(ShareHoldingByIndividuals);
					ExtentTestManager.getTest().log(Status.PASS , "  1 Check if the Share Holding By Individuals field is visible." + Entersharingindividual);
					ExtentTestManager.getTest().log(Status.PASS , "  2.Enter Numeric data" + Entersharingindividual);
					ExtentTestManager.getTest().log(Status.PASS , "  Input accepted" + Entersharingindividual);
                    
                    //TC035
                    
                    ExtentTestManager.startTest(" TC035 - ENtityHolding  displayed");
					boolean Entityshare = Basic_Information_Module.AutoloadedENtityHolding();
					ExtentTestManager.getTest().log(Status.PASS , "  ENtityHolding  displayed" + Entityshare);
                    Log.info("  ENtityHolding  displayed :" + Entityshare);
                    
                    //TC036
                    
                    ExtentTestManager.startTest(" TC036 - CKYCID  displayed");
					boolean EnterCKYCID = Basic_Information_Module.EnterCKYCID(CKYCID);
					ExtentTestManager.getTest().log(Status.PASS , "CKYCID  Entered" + EnterCKYCID);
					ExtentTestManager.getTest().log(Status.PASS ,"CKYCID  displayed :" + EnterCKYCID);
                    
                    //TC037
                    
                    ExtentTestManager.startTest(" TC037 - DPIITNumber  displayed");
					boolean EnterDPIITNumber = Basic_Information_Module.EnterDPIITNumber(DPIITNumber);
					ExtentTestManager.getTest().log(Status.PASS , "DPIITNumber  Entered" + EnterDPIITNumber);
					ExtentTestManager.getTest().log(Status.PASS ,"DPIITNumber  displayed :" + EnterDPIITNumber);
                    
                    //TC038
                    
                    
                    ExtentTestManager.startTest("TC038 - KSUMNumber  displayed");
					boolean EnterKSUMNumber = Basic_Information_Module.EnterKSUMNumber(KSUMNumber);
					ExtentTestManager.getTest().log(Status.PASS , "  KSUMNumber  Entered" + EnterKSUMNumber);
					ExtentTestManager.getTest().log(Status.PASS ," KSUMNumber  displayed :" + EnterKSUMNumber);
                    
					
                    //TC039
					
					ExtentTestManager.startTest("TC039 - Verify Bank Account Details Section");
					boolean BankAccountSection = Basic_Information_Module.BankAccSection();
					ExtentTestManager.getTest().log(Status.PASS , "   Verify the presence of the Bank Account Details section" + BankAccountSection);
					ExtentTestManager.getTest().log(Status.PASS ," Bank Account Details section is visible  :" + BankAccountSection);
                    
                    //TC040
					ExtentTestManager.startTest("TC040 - Verify Add Bank Account Button");
					boolean AddBankAccountButton = Basic_Information_Module.AddBankButton();
					ExtentTestManager.getTest().log(Status.PASS , " Check for the presence of the Add Bank Account button." + AddBankAccountButton);
					ExtentTestManager.getTest().log(Status.PASS ," Add Bank Account button is visible. :" + AddBankAccountButton);
                    
					
					//TC041
                    ExtentTestManager.startTest(" TC041 - Redirect to Add External Account Details");
					boolean CheckAddBankAccButton = Basic_Information_Module.ClickonAddBankAccButton();
					ExtentTestManager.getTest().log(Status.PASS , "  1. Click on Add Bank Account button." + CheckAddBankAccButton);
					ExtentTestManager.getTest().log(Status.PASS ," User is redirected to the Add External Account Details window. :" + CheckAddBankAccButton);
                    
                    //TC042
                    
                    ExtentTestManager.startTest(" TC042 - Verify IFSC Code Field");
					boolean EnterIFSC = Basic_Information_Module.EnterIFSC(IFSCCODE);
					ExtentTestManager.getTest().log(Status.PASS , "  IFSC  Entered" + EnterIFSC);
					ExtentTestManager.getTest().log(Status.PASS ,"  IFSC  displayed :" + EnterIFSC);
                    
                    //TC043
                    
                    ExtentTestManager.startTest(" TC043 - Verify Bank Display After IFSC Input");
					boolean ValidateBank = Basic_Information_Module.ValidateBank();
					ExtentTestManager.getTest().log(Status.PASS , "  Check if Bank  details are displayed." + ValidateBank);
                    Log.info("  Bank  displayed :" + ValidateBank);
                    
                    //TC044
                    
                    ExtentTestManager.startTest(" TC044 - Verify Branch Display After IFSC Input");
					boolean ValidateBranch = Basic_Information_Module.ValidateBranch();
					ExtentTestManager.getTest().log(Status.PASS , "  Check if Branch details are displayed." + ValidateBranch);
					ExtentTestManager.getTest().log(Status.PASS ,"  Branch  displayed :" + ValidateBranch);
                    
                    //TC045
                    
                    ExtentTestManager.startTest("TC045 - Verify Account Type Field");
					boolean SelectAccType = Basic_Information_Module.SelectAccType();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Navigate to Add External Account Details." + SelectAccType);
					ExtentTestManager.getTest().log(Status.PASS , " 2. Check visibility of Account Type field." + SelectAccType);
					ExtentTestManager.getTest().log(Status.PASS , " 3. Select an option.." + SelectAccType);
					ExtentTestManager.getTest().log(Status.PASS , " Account Type field is visible and can be selected." + SelectAccType);

                    //TC046
                    
                    ExtentTestManager.startTest(" TC046 - Verify Account Nature Field");
					boolean SelectAccNature = Basic_Information_Module.SelectAccNature();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Navigate to Add External Account Details." + SelectAccNature);
					ExtentTestManager.getTest().log(Status.PASS , " 2. Check visibility of Account Type field." + SelectAccNature);
					ExtentTestManager.getTest().log(Status.PASS , " 3. Select an option.." + SelectAccNature);
					ExtentTestManager.getTest().log(Status.PASS , " Account Nature field is visible and can be selected." + SelectAccNature);
  
                    //TC047
                    
                    ExtentTestManager.startTest(" TC047 - Verify Account Number Field");
					boolean EnterAccnumber = Basic_Information_Module.EnterAccNumber(AccountNumber);
					ExtentTestManager.getTest().log(Status.PASS , " 1. Navigate to Add External Account Details." + EnterAccnumber);
					ExtentTestManager.getTest().log(Status.PASS , "  2. Check visibility of Account Type field." + EnterAccnumber);
					ExtentTestManager.getTest().log(Status.PASS , "  3. Select an option.." + EnterAccnumber);
					ExtentTestManager.getTest().log(Status.PASS , "  Account Number  displayed" + EnterAccnumber);
                    
                    //TC048
                    ExtentTestManager.startTest(" TC048 -Verify Add Bank Button Functionality ");
					boolean AddBank = Basic_Information_Module.AddBank();
					ExtentTestManager.getTest().log(Status.PASS , "  1. Check for presence of Add Bank button." + AddBank);
					ExtentTestManager.getTest().log(Status.PASS , " 2. Click on Add Bank button." + AddBank);
					ExtentTestManager.getTest().log(Status.PASS , "  Add Bank button functions as expected." + AddBank);
                    
                    //TC049
                    
					ExtentTestManager.startTest(" TC049 -Verify Bank Details Saved to Grid");
					boolean verifyAddedBankdetails = Basic_Information_Module.CheckAddedBankDetails();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Add bank details." + verifyAddedBankdetails);
					ExtentTestManager.getTest().log(Status.PASS , " 2. Click Add Bank button." + verifyAddedBankdetails);
					ExtentTestManager.getTest().log(Status.PASS , "  3. Check if details appear in the grid." + verifyAddedBankdetails);
					ExtentTestManager.getTest().log(Status.PASS , "  Bank details are saved and displayed in the grid." + verifyAddedBankdetails);

					//TC050
					ExtentTestManager.startTest(" TC050 - Verify Additional Gender Wise Employment Details ");
					boolean Checkgendersection = Basic_Information_Module.genderSection();
					ExtentTestManager.getTest().log(Status.PASS , " Verify presence of Additional Gender Wise Employment Details. " + Checkgendersection);
					ExtentTestManager.getTest().log(Status.PASS , " The section is present in both windows. :" + Checkgendersection);
                    
					//TC051
					
                    ExtentTestManager.startTest(" TC051 - Verify Count Increment and Decrement");
					boolean AddGenderEmpDetails = Basic_Information_Module.SelectGender();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Locate count increment and decrement controls.\r\n"
							+ "2. Test increment and decrement functionality. " + AddGenderEmpDetails);
					ExtentTestManager.getTest().log(Status.PASS ,"  Counts are incremented and decremented accurately. :" + AddGenderEmpDetails);
                    
                    //TC052
					ExtentTestManager.startTest(" TC052 - Verify Total Count Update");
					boolean Verifytotalcount = Basic_Information_Module.checktotalcount();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Adjust counts using controls.\r\n"
							+ "2. Verify Total Count updates accordingly. " + Verifytotalcount);
					ExtentTestManager.getTest().log(Status.PASS ,"  Total Count is updated correctly. :" + Verifytotalcount);
                   
                    //TC053
					
					ExtentTestManager.startTest(" TC053 - Verify Terms and Conditions Checkbox ");
					boolean TermsAndConditionSection = Basic_Information_Module.Termsandconditionsection();
					ExtentTestManager.getTest().log(Status.PASS , "  Check if checkbox is present" + TermsAndConditionSection);
					ExtentTestManager.getTest().log(Status.PASS , " Checkbox is available . :" + TermsAndConditionSection);
                   
                    //TC054
                    
                    ExtentTestManager.startTest(" TC054 - Test Clickability of Terms and Conditions Checkbox");
					boolean TermsAndCondition = Basic_Information_Module.AcceptTermsandCondition();
					ExtentTestManager.getTest().log(Status.PASS , " 1. Locate Terms and Conditions checkbox.\r\n"
							+ "2. Click the checkbox." + TermsAndCondition);
					ExtentTestManager.getTest().log(Status.PASS , " Checkbox is clickable and toggles as expected. :" + TermsAndCondition);
                    
                    //TC055
					ExtentTestManager.startTest(" TC055 - Verify Cancel, Save as Draft, Save and Proceed Buttons");
					boolean CheckAllButtons = Basic_Information_Module.ValidateAllbuttons();
					ExtentTestManager.getTest().log(Status.PASS , "  Verify presence of buttons." + CheckAllButtons);
					ExtentTestManager.getTest().log(Status.PASS , " Buttons are visible. :" + CheckAllButtons);
                    
					//TC056
					ExtentTestManager.startTest(" TC056 - Test Functionality of Save as Draft Button");
					boolean ClickSaveAsDraft = Basic_Information_Module.SaveAsDraft();
					ExtentTestManager.getTest().log(Status.PASS , "   1.Click Save as Draft.\r\n"
							+ "2. Verify if data is saved to draft.." + ClickSaveAsDraft);
					ExtentTestManager.getTest().log(Status.PASS , " Data is saved as draft and can be retrieved later.. :" + ClickSaveAsDraft);
                    
                   
					//TC057
                   
                    ExtentTestManager.startTest(" TC057 - Test Functionality of Save and Proceed Button ");
					boolean SubmitBasicInfo = Basic_Information_Module.SaveAndProceed();
					ExtentTestManager.getTest().log(Status.PASS , "  1. Click Save and Proceed.\r\n"
							+ "2. Verify if data is saved and next component loads." + SubmitBasicInfo);
					ExtentTestManager.getTest().log(Status.PASS ," Data is saved and user is redirected to next component.:" + SubmitBasicInfo);
                    
                    
					//App Logout
					
					Thread.sleep(2000);
					driver.quit();
					ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
					Log.info("Logout is done");

					// EndTest
					System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString()+ " ending ***"));
					ExtentTestManager.endTest();
					ExtentManager.getInstance().flush();
					Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

				}

			}
			catch (Exception e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
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
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
			}
			catch (AssertionError e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
					ExtentTestManager.getTest().fail(e.getMessage(),
							MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				} catch (Exception e1) {
					System.out.println("File not found " + e1);
				}
				ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

				// Logout
				context.setAttribute("fileName", "Logout");
				//driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
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
		

