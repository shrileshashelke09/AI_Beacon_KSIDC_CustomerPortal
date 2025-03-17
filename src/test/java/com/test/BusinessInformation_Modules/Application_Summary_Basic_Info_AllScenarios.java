package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Application_Summary_Basic_Info_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Application_Summary_Basic_Info_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Application_Summary_Basic_Info_Module Application_Summary_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Security_Plant_Machinery");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Application_Summary_Module = new Application_Summary_Basic_Info_Module();

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
					// Log.info("Button visible !");
					Thread.sleep(3000);


	
					// TC001
					ExtentTestManager.startTest("TC001 : Verify login functionality with valid credentials");
					boolean Login = Application_Summary_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					ExtentTestManager.startTest("TC002 : Navigate to 'Submit Application and Application Summary' stage");
					boolean ApplicationSummaryPage = Application_Summary_Module.ApplicationSummaryPage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to 'Submit Application and Application Summary' menu option." + ApplicationSummaryPage);
					ExtentTestManager.getTest().log(Status.PASS, "'Application Summary' page is opened." + ApplicationSummaryPage);
					
					//TC003
					
					ExtentTestManager.startTest("TC003 : Navigate to 'Submit Application and Application Summary' stage");
					boolean BusinessInfoStage = Application_Summary_Module.BusinessInfoStage();
					ExtentTestManager.getTest().log(Status.PASS, "Verify 'Business Information' stage is selected" + BusinessInfoStage);
					ExtentTestManager.getTest().log(Status.PASS, "'Business Information' stage is selected at the top." + BusinessInfoStage);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Basic Information' page is in 'Go To Page' option");
					boolean BasicInfooption = Application_Summary_Module.BasicInfooption();
					ExtentTestManager.getTest().log(Status.PASS, "Verify the 'Basic Information' page name is selected." + BasicInfooption);
					ExtentTestManager.getTest().log(Status.PASS, "'Basic Information' page name is selected in 'Go To Page'." + BasicInfooption);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 : Open 'Basic Information' page");
					boolean BasicInfoPage = Application_Summary_Module.BasicInfoPage();
					ExtentTestManager.getTest().log(Status.PASS, " Navigate to 'Basic Information' page via the navigation link or drop-down." + BasicInfoPage);
					ExtentTestManager.getTest().log(Status.PASS, "'Basic Information' page is opened in the window." + BasicInfoPage);
				
					//TC006
					
					ExtentTestManager.startTest("TC006 : Verify 'Udyam No/Udyog Aadhaar' field is filled and disabled");
					boolean ValidateUdyamNO = Application_Summary_Module.ValidateUdyamNO();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateUdyamNO);
					ExtentTestManager.getTest().log(Status.PASS, "'Udyam No/Udyog Aadhaar' field is filled with data and is disabled." + ValidateUdyamNO);
				
					//TC007
					
					ExtentTestManager.startTest("TC007 : Verify 'Name Of Enterprise' field is filled and disabled");
					boolean ValidateNameofEnterprise = Application_Summary_Module.ValidateNameofEnterprise();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateNameofEnterprise);
					ExtentTestManager.getTest().log(Status.PASS, "'Name Of Enterprise' field is filled with data and is disabled." + ValidateNameofEnterprise);
				
					//TC008
					
					ExtentTestManager.startTest("TC008 : Verify 'Type Of Enterprise Organization' field is filled and disabled");
					boolean ValidateTypeOfInstitutionOrganizations = Application_Summary_Module.ValidateTypeOfInstitutionOrganizations();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateTypeOfInstitutionOrganizations);
					ExtentTestManager.getTest().log(Status.PASS, "'Type Of Enterprise Organization' field is filled with data and is disabled." + ValidateTypeOfInstitutionOrganizations);
				
					//TC009
					
					ExtentTestManager.startTest("TC009 : Verify 'Class Of Activity' field is filled and disabled");
					boolean ValidateClassofActivity = Application_Summary_Module.ValidateClassofActivity();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateClassofActivity);
					ExtentTestManager.getTest().log(Status.PASS, "'Class Of Activity' field is filled with data and is disabled." + ValidateClassofActivity);
				
					//TC010
					ExtentTestManager.startTest("TC010 : Verify 'Date Of Incorporation' field is filled and disabled");
					boolean ValidateDateOfIncorporation = Application_Summary_Module.ValidateDateOfIncorporation();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDateOfIncorporation);
					ExtentTestManager.getTest().log(Status.PASS, "'Date Of Incorporation' field is filled with data and is disabled." + ValidateDateOfIncorporation);
				
					//TC011
					
					ExtentTestManager.startTest("TC011 : Verify 'Date Of Udyam Registration' field is filled and disabled");
					boolean ValidateDateOfUdyamRegistration = Application_Summary_Module.ValidateDateOfUdyamRegistration();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDateOfUdyamRegistration);
					ExtentTestManager.getTest().log(Status.PASS, "'Date Of Udyam Registration' field is filled with data and is disabled." + ValidateDateOfUdyamRegistration);
				
					//TC012
					
					ExtentTestManager.startTest("TC012 : Verify 'Institution Mobile' field is filled and disabled");
					boolean ValidateInstitutionMobile = Application_Summary_Module.ValidateInstitutionMobile();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateInstitutionMobile);
					ExtentTestManager.getTest().log(Status.PASS, "'Institution Mobile' field is filled with data and is disabled." + ValidateInstitutionMobile);
				
					//TC013
					ExtentTestManager.startTest("TC013 : Verify 'Landline Number' field is filled and disabled");
					boolean ValidateLandLineNo = Application_Summary_Module.ValidateLandLineNo();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateLandLineNo);
					ExtentTestManager.getTest().log(Status.PASS, "'Landline Number' field is filled with data and is disabled." + ValidateLandLineNo);
				
					//TC014
					ExtentTestManager.startTest("TC014 : Verify 'Institution Email' field is filled and disabled");
					boolean ValidateEmailID = Application_Summary_Module.ValidateEmailID();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateEmailID);
					ExtentTestManager.getTest().log(Status.PASS, "'Institution Email' field is filled with data and is disabled." + ValidateEmailID);
				
					//TC015
					
					ExtentTestManager.startTest("TC015 : Verify 'Website' field is filled and disabled");
					boolean ValidateWebsite = Application_Summary_Module.ValidateWebsite();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateWebsite);
					ExtentTestManager.getTest().log(Status.PASS, "'Website' field is filled with data and is disabled." + ValidateWebsite);
				
					//TC016
					
					ExtentTestManager.startTest("TC016 : Verify 'Official Address Of Institution' field is filled and disabled");
					boolean ValidateAddress = Application_Summary_Module.ValidateAddress();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateAddress);
					ExtentTestManager.getTest().log(Status.PASS, "'Official Address Of Institution' field is filled with data and is disabled." + ValidateAddress);
				
					//TC017
					
					ExtentTestManager.startTest("TC017 : Verify 'Landmark' field is filled and disabled");
					boolean ValidateLandMark = Application_Summary_Module.ValidateLandMark();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateLandMark);
					ExtentTestManager.getTest().log(Status.PASS, "'Landmark' field is filled with data and is disabled." + ValidateLandMark);
				
					//TC018
					
					ExtentTestManager.startTest("TC018 : Verify 'Place' field is filled and disabled");
					boolean ValidatePlace = Application_Summary_Module.ValidatePlace();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidatePlace);
					ExtentTestManager.getTest().log(Status.PASS, "'Place' field is filled with data and is disabled." + ValidatePlace);
				
					//TC019
					
					ExtentTestManager.startTest("TC019 : Verify 'Pin' field is filled and disabled");
					boolean ValidatePin = Application_Summary_Module.ValidatePin();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidatePin);
					ExtentTestManager.getTest().log(Status.PASS, "'Pin' field is filled with data and is disabled." + ValidatePin);
				
					//TC020
					
					ExtentTestManager.startTest("TC020 : Verify 'Country' field is filled and disabled");
					boolean ValidateCountry = Application_Summary_Module.ValidateCountry();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateCountry);
					ExtentTestManager.getTest().log(Status.PASS, "'Country' field is filled with data and is disabled." + ValidateCountry);
				
					//TC021
					
					ExtentTestManager.startTest("TC021 : Verify 'State' field is filled and disabled");
					boolean ValidateState = Application_Summary_Module.ValidateState();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateState);
					ExtentTestManager.getTest().log(Status.PASS, "'State' field is filled with data and is disabled." + ValidateState);
				
					//TC022
					
					ExtentTestManager.startTest("TC022 : Verify 'District' field is filled and disabled");
					boolean ValidateDistrict = Application_Summary_Module.ValidateDistrict();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDistrict);
					ExtentTestManager.getTest().log(Status.PASS, "'District' field is filled with data and is disabled." + ValidateDistrict);
				
					//TC023
					
					ExtentTestManager.startTest("TC023 : Verify 'City' field is filled and disabled");
					boolean ValidateCity = Application_Summary_Module.ValidateCity();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateCity);
					ExtentTestManager.getTest().log(Status.PASS, "'City' field is filled with data and is disabled." + ValidateCity);
				
					//TC024
					
					ExtentTestManager.startTest("TC024 : Verify 'Post' field is filled and disabled");
					boolean ValidatePost = Application_Summary_Module.ValidatePost();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidatePost);
					ExtentTestManager.getTest().log(Status.PASS, "'Post' field is filled with data and is disabled." + ValidatePost);
				
					//TC025
					
					ExtentTestManager.startTest("TC025 : Verify 'Taluk' field is filled and disabled");
					boolean ValidateTaluk = Application_Summary_Module.ValidateTaluk();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateTaluk);
					ExtentTestManager.getTest().log(Status.PASS, "'Taluk' field is filled with data and is disabled." + ValidateTaluk);
				
					//TC026
					
					ExtentTestManager.startTest("TC026 : Verify 'Company PAN' field is filled and disabled");
					boolean ValidateCompanyPAN = Application_Summary_Module.ValidateCompanyPAN();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateCompanyPAN);
					ExtentTestManager.getTest().log(Status.PASS, "'Company PAN' field is filled with data and is disabled." + ValidateCompanyPAN);
				
					//TC027
					
					ExtentTestManager.startTest("TC027 : Verify 'External Credit Rating' field is filled and disabled");
					boolean ValidateExternalCreditRating = Application_Summary_Module.ValidateExternalCreditRating();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateExternalCreditRating);
					ExtentTestManager.getTest().log(Status.PASS, "'Company PAN' field is filled with data and is disabled." + ValidateExternalCreditRating);
					
					//TC028
					ExtentTestManager.startTest("TC028 : Verify 'TIN' field is filled and disabled");
					boolean ValidateTIN = Application_Summary_Module.ValidateTIN();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateTIN);
					ExtentTestManager.getTest().log(Status.PASS, "'TIN' field is filled with data and is disabled." + ValidateTIN);
					
					//TC029
					
					ExtentTestManager.startTest("TC029 : Verify 'GSTIN' field is filled and disabled");
					boolean ValidateGSTIN = Application_Summary_Module.ValidateGSTIN();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateGSTIN);
					ExtentTestManager.getTest().log(Status.PASS, "'GSTIN' field is filled with data and is disabled." + ValidateGSTIN);
					
					//TC030
					
					ExtentTestManager.startTest("TC030 : Verify 'Share Holding By Individuals' field is filled and disabled");
					boolean ValidateMSMEShareholdingByIndividuals = Application_Summary_Module.ValidateMSMEShareholdingByIndividuals();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateMSMEShareholdingByIndividuals);
					ExtentTestManager.getTest().log(Status.PASS, "'Share Holding By Individuals' field is filled with data and is disabled." + ValidateMSMEShareholdingByIndividuals);
					
				
					//TC031
					
					ExtentTestManager.startTest("TC031 : Verify 'Share Holding By Entity' field is filled and disabled");
					boolean ValidateMSMEShareHoldingByEntity = Application_Summary_Module.ValidateMSMEShareHoldingByEntity();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateMSMEShareHoldingByEntity);
					ExtentTestManager.getTest().log(Status.PASS, "'Share Holding By Individuals' field is filled with data and is disabled." + ValidateMSMEShareHoldingByEntity);
					
					//TC032
					
					ExtentTestManager.startTest("TC032 : Verify 'CKYC-ID' field is filled and disabled");
					boolean ValidateCKYCID = Application_Summary_Module.ValidateCKYCID();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateCKYCID);
					ExtentTestManager.getTest().log(Status.PASS, "'CKYC-ID' field is filled with data and is disabled." + ValidateCKYCID);
					
					//TC033
					
					ExtentTestManager.startTest("TC033 : Verify 'DPIIT Number' field is filled and disabled");
					boolean ValidateDPIITNumber = Application_Summary_Module.ValidateDPIITNumber();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateDPIITNumber);
					ExtentTestManager.getTest().log(Status.PASS, "'DPIIT Number' field is filled with data and is disabled." + ValidateDPIITNumber);
					
					//TC034
					
					ExtentTestManager.startTest("TC034 : Verify 'KSUM Number' field is filled and disabled");
					boolean ValidateKSUMNumber = Application_Summary_Module.ValidateKSUMNumber();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateKSUMNumber);
					ExtentTestManager.getTest().log(Status.PASS, "'KSUM Number' field is filled with data and is disabled." + ValidateKSUMNumber);
					
					//TC035
					
					ExtentTestManager.startTest("TC035 : Open 'View Bank Account Details' pop-up by selecting a bank name");
					boolean clickonBankDetails = Application_Summary_Module.clickonBankDetails();
					ExtentTestManager.getTest().log(Status.PASS, "Click on the Bank name." + clickonBankDetails);
					ExtentTestManager.getTest().log(Status.PASS, "'View Bank Account Details' pop-up window is opened." + clickonBankDetails);
					
					//TC036
					
					ExtentTestManager.startTest("TC036 : Verify 'IFSC CODE' field is filled in pop-up");
					boolean ValidateIFSCCOde = Application_Summary_Module.ValidateIFSCCOde();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateIFSCCOde);
					ExtentTestManager.getTest().log(Status.PASS, "'IFSC CODE' field is filled with data." + ValidateIFSCCOde);
					
					//TC037
					
					ExtentTestManager.startTest("TC037 : Verify 'Bank' field is filled and disabled in pop-up");
					boolean ValidateBank = Application_Summary_Module.ValidateBank();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateBank);
					ExtentTestManager.getTest().log(Status.PASS, "'Bank' field is filled with data." + ValidateBank);
					
					//TC038
					
					ExtentTestManager.startTest("TC038 : Verify 'Branch' field is filled and disabled in pop-up");
					boolean ValidateBranch = Application_Summary_Module.ValidateBranch();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateBranch);
					ExtentTestManager.getTest().log(Status.PASS, "'Branch' field is filled with data." + ValidateBranch);
					
					
					//TC039
					
					ExtentTestManager.startTest("TC039 : Verify 'Account Type' field is filled and disabled in pop-up");
					boolean ValidateAccountType = Application_Summary_Module.ValidateAccountType();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateAccountType);
					ExtentTestManager.getTest().log(Status.PASS, "'Account Type' field is filled with data." + ValidateAccountType);
					
					//TC040
					
					ExtentTestManager.startTest("TC040 : Verify 'Account Nature' field is filled and disabled in pop-up");
					boolean ValidateAccountNature = Application_Summary_Module.ValidateAccountNature();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateAccountNature);
					ExtentTestManager.getTest().log(Status.PASS, "'Account Nature' field is filled with data." + ValidateAccountNature);


					//TC041
					ExtentTestManager.startTest("TC041 : Verify 'Account Number' field is filled and disabled in pop-up");
					boolean ValidateAccountNumber = Application_Summary_Module.ValidateAccountNumber();
					ExtentTestManager.getTest().log(Status.PASS, "Confirm it's filled with data." + ValidateAccountNumber);
					ExtentTestManager.getTest().log(Status.PASS, "'Account Number' field is filled with data." + ValidateAccountNumber);

					//TC042
					
					ExtentTestManager.startTest("TC042 : Close 'View Bank Account Details' pop-up");
					boolean ClosethePopUp = Application_Summary_Module.ClosethePopUp();
					ExtentTestManager.getTest().log(Status.PASS, "Click on the close button in the pop-up window." + ClosethePopUp);
					ExtentTestManager.getTest().log(Status.PASS, "The pop-up window is closed." + ClosethePopUp);

					//TC043
					
					ExtentTestManager.startTest("TC043 : Verify Total count of gender-wise employment");
					boolean TotalGenderCount = Application_Summary_Module.TotalGenderCount();
					ExtentTestManager.getTest().log(Status.PASS, "Locate the section for gender-wise employment details." + TotalGenderCount);
					ExtentTestManager.getTest().log(Status.PASS, "Total count is displayed for additional gender-wise employment details." + TotalGenderCount);

					//TC044
					
					ExtentTestManager.startTest("TC044 :Verify 'Male' count in employment details");
					boolean ValidateMaleCount = Application_Summary_Module.ValidateMaleCount();
					ExtentTestManager.getTest().log(Status.PASS, "Verify if 'Male' count is displayed." + ValidateMaleCount);
					ExtentTestManager.getTest().log(Status.PASS, "'Male' count is displayed in the window." + ValidateMaleCount);

					//TC044
					
					ExtentTestManager.startTest("TC045 :Verify 'FeMale' count in employment details");
					boolean ValidateFeMaleCount = Application_Summary_Module.ValidateFeMaleCount();
					ExtentTestManager.getTest().log(Status.PASS, "Verify if 'FeMale' count is displayed." + ValidateFeMaleCount);
					ExtentTestManager.getTest().log(Status.PASS, "'Male' count is displayed in the window." + ValidateFeMaleCount);

					//TC045
					
					ExtentTestManager.startTest("TC045 :Verify 'Transgender' count in employment details");
					boolean ValidateTransgenderCount = Application_Summary_Module.ValidateTransgenderCount();
					ExtentTestManager.getTest().log(Status.PASS, "Verify if 'Transgender' count is displayed." + ValidateTransgenderCount);
					ExtentTestManager.getTest().log(Status.PASS, "'Male' count is displayed in the window." + ValidateTransgenderCount);

					//TC0046
					
					ExtentTestManager.startTest("TC046 :Verify Terms & Conditions checkbox is ticked");
					boolean TermsAndConditionCheckbox = Application_Summary_Module.TermsAndConditionCheckbox();
					ExtentTestManager.getTest().log(Status.PASS, "Verify if the checkbox is ticked." + TermsAndConditionCheckbox);
					ExtentTestManager.getTest().log(Status.PASS, "Terms & Conditions checkbox is ticked." + TermsAndConditionCheckbox);

					//TC047
					
					ExtentTestManager.startTest("TC047 :Verify 'Continue' button presence");
					boolean PresenseOfContinueButton = Application_Summary_Module.PresenseOfContinueButton();
					ExtentTestManager.getTest().log(Status.PASS, "Verify its presence of 'Continue' button" + PresenseOfContinueButton);
					ExtentTestManager.getTest().log(Status.PASS, "'Continue' button is present in the window." + PresenseOfContinueButton);

					
					
					//App Logout

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



					
					
	



