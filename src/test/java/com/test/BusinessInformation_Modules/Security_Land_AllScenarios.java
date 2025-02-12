package com.test.BusinessInformation_Modules;

import java.io.File; 
import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Land;
import com.Pages_BusinessInformation_Modules.Security_Land_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Land_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Security_Land Securityland;
	
	Security_Land_Module slm = new Security_Land_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_SecurityLand");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Securityland = new Security_Land();  

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
			//	Base_Class.Login();
				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				
			    // String ShareCapital = testdata.get("ShareCapital").toString();
      			// String InternalAccurals = testdata.get("InternalAccurals").toString();
       			// String UnsecuredLoan = testdata.get("UnsecuredLoan").toString();
				// String IncentivesAndGrants = testdata.get("IncentivesAndGrants").toString();
				// String Others = testdata.get("Others").toString();
 			  //  String TermLoanFromOtherFI = testdata.get("TermLoanFromOtherFI").toString();
		//         String AppliedTermLoan = testdata.get("AppliedTermLoan").toString();
				// String Specify = testdata.get("Specify").toString();
				
			//	String Utilities = testdata.get("Utilities").toString();
			//	String Deposits = testdata.get("Deposits").toString();
			//	String WorkingCapitalAmt = testdata.get("WorkingCapitalAmt").toString();
			//	String TechnicalKnowHowFees = testdata.get("TechnicalKnowHowFees").toString();
			//	String PreliminaryExpenses = testdata.get("PreliminaryExpenses").toString();
			//	String WorkingCapitalMargin = testdata.get("WorkingCapitalMargin").toString();
			//	String Vehicles = testdata.get("Vehicles").toString();
			//	String TechnologyOptimizationAndProductDevelopment = testdata.get("TechnologyOptimizationAndProductDevelopment").toString();
			//	String TestingAndCertification = testdata.get("TestingAndCertification").toString();
			//	String MarketingAndPromotionalExpenses = testdata.get("MarketingAndPromotionalExpenses").toString();
			//	String Others = testdata.get("Others").toString();
			//	String Specify = testdata.get("Specify").toString();

				//TC001
				ExtentTestManager.startTest("TC001 : Verify 'Login for Land'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login=Security_Land_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				//TC002
				ExtentTestManager.startTest("TC002 - Navigate to Land page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean securityland = true;
				try {
					securityland = slm.Navigatetosecurityland();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Land" + securityland);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Land page successfully" + securityland);
				//ExtentTestManager.endTest();
				
				
				
				//ExtentTestManager.startTest("TC003 - Navigate to Land page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean AccessSecurityLand = true;
				try {
					securityland = slm.AccessSecurityLand();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Land" + AccessSecurityLand);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Land page" + AccessSecurityLand);
				ExtentTestManager.endTest();
				
				//TC003
				
				ExtentTestManager.startTest("TC003 : Verify 'Click on the test data'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean clickonthetestdata=slm.ClickontheTestData();
				ExtentTestManager.getTest().log(Status.PASS , "Click Test Data" + clickonthetestdata);
				ExtentTestManager.endTest();
				
				//TC004
				ExtentTestManager.startTest("TC004 - Verify 'Title Holder' Field Loaded");
                boolean validateTitleHolder = true;
				try {
					validateTitleHolder = Security_Land_Module.validateTitleHolder();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Title Holder' field is populated with data for the selected item" + validateTitleHolder);
                ExtentTestManager.getTest().log(Status.PASS, "'Title Holder' field is filled with relevant data" + validateTitleHolder);
               
                
               
                boolean isDisabled =true;
				try {
					isDisabled = Security_Land_Module.isTitleHolderfieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled, "Title Holder field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Title Holder field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC005
                ExtentTestManager.startTest("TC005 - Verify 'Doc No' Field Loaded");
                boolean validateDocNo = true;
				try {
					validateDocNo = Security_Land_Module.validateDocNo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Doc No' field is populated with data for the selected item" + validateDocNo);
                ExtentTestManager.getTest().log(Status.PASS, "'Doc No' field is filled with relevant data" + validateDocNo);
               
                
               
                boolean isDisabled1 =true;
				try {
					isDisabled1 = Security_Land_Module.isDocNoFielddDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled1, "Doc No field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Doc No field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC006
                ExtentTestManager.startTest("TC006 - Verify 'Survey No' Field Loaded");
                boolean validateSurveyNo = true;
				try {
					validateDocNo = Security_Land_Module.validateSurveyNo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Survey No' field is populated with data for the selected item" + validateSurveyNo);
                ExtentTestManager.getTest().log(Status.PASS, "'Survey No' field is filled with relevant data" + validateSurveyNo);
               
                
               
                boolean isDisabled12 =true;
				try {
					isDisabled12 = Security_Land_Module.isSurveyNoFielddDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled12, "Survey No field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Survey No field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC007
                ExtentTestManager.startTest("TC007 - Verify 'Resurvey No' Field Loaded");
                boolean validateResurveyNo = true;
				try {
					validateResurveyNo = Security_Land_Module.validateResurveyNo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Resurvey No' field is populated with data for the selected item" + validateResurveyNo);
                ExtentTestManager.getTest().log(Status.PASS, "'Resurvey No' field is filled with relevant data" + validateResurveyNo);
               
                
               
                boolean isDisabled13 =true;
				try {
					isDisabled13 = Security_Land_Module.isResurveyNoFielddDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled13, "Resurvey No field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Resurvey No field is disabled");
                
                
                boolean AccessNature = true;
				try {
					securityland = slm.AccessNature();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Nature" + AccessNature);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Nature" + AccessNature);
                ExtentTestManager.endTest();
                
                
                //TC008
                
                ExtentTestManager.startTest("TC008 - Verify 'Nature' Field Loaded");
                boolean validateNature = true;
				try {
					validateNature = Security_Land_Module.validateNature();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Nature' field is populated with data for the selected item" + validateNature);
                ExtentTestManager.getTest().log(Status.PASS, "'Nature' field is filled with relevant data" + validateNature);
               
                
               
               // boolean isDisabled14 =true;
				//try {
			//		isDisabled14 = Security_Land_Module.isNatureFielddDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled14, "Nature field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Nature field is disabled");
                ExtentTestManager.endTest();
                
                //TC009
                ExtentTestManager.startTest("TC009 - Verify 'Extend of land (DRY)' Field Loaded");
                boolean validateExtendOfLandDry = true;
				try {
					validateExtendOfLandDry = Security_Land_Module.validateExtendOfLandDry();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Extend of land (DRY)' field is populated with data for the selected item" + validateExtendOfLandDry);
                ExtentTestManager.getTest().log(Status.PASS, "'Extend of land (DRY)' field is filled with relevant data" + validateExtendOfLandDry);
               
                
               
                boolean isDisabled15 =true;
				try {
					isDisabled15 = Security_Land_Module.isExtendOfLandDryFielddDisabled1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled15, "Extend of land (DRY) field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Extend of land (DRY) field is disabled");
                ExtentTestManager.endTest();
                
                //TC010
                ExtentTestManager.startTest("TC010 - Verify 'Extend of land (WET)' Field Loaded");
                boolean validateExtendOfLandWet = true;
				try {
					validateExtendOfLandWet = Security_Land_Module.validateExtendOfLandWet();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Extend of land (WET)' field is populated with data for the selected item" + validateExtendOfLandWet);
                ExtentTestManager.getTest().log(Status.PASS, "'Extend of land (DRY)' field is filled with relevant data" + validateExtendOfLandWet);
               
                
               
                boolean isDisabled16 =true;
				try {
					isDisabled16 = Security_Land_Module.isExtendOfLandWetFielddDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled16, "Extend of land (WET) field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Extend of land (WET) field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC011
                ExtentTestManager.startTest("TC011 - Verify 'Unit' Field Loaded");
                boolean validateUnitFiled = true;
				try {
					validateUnitFiled = Security_Land_Module.validateUnitfield();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Unit' field is populated with data for the selected item" + validateUnitFiled);
                ExtentTestManager.getTest().log(Status.PASS, "'Unit' field is filled with relevant data" + validateUnitFiled);
               
                
               
               // boolean isDisabled17 =true;
				//try {
			//		isDisabled17 = Security_Land_Module.isUnitFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled17, "Unit field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Unit field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC012
                ExtentTestManager.startTest("TC012 - Verify 'PinCode' Field Loaded");
                boolean validatePincode = true;
				try {
					validatePincode = Security_Land_Module.validatePincode();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure Pincode' field is populated with data for the selected item" + validatePincode);
                ExtentTestManager.getTest().log(Status.PASS, "'PinCode' field is filled with relevant data" + validatePincode);
               
                
               
                boolean isDisabled18 =true;
				try {
					isDisabled18 = Security_Land_Module.isPincodeFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled18, "PinCode field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "PinCode field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC013
                ExtentTestManager.startTest("TC013 - Verify 'State' Field Loaded");
                boolean validateState = true;
				try {
					validateState = Security_Land_Module.validateState();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'State' field is populated with data for the selected item" + validateState);
                ExtentTestManager.getTest().log(Status.PASS, "'State' field is filled with relevant data" + validateState);
               
                
               
               // boolean isDisabled19 =true;
				//try {
				//	isDisabled19 = Security_Land_Module.isStateFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled19, "State field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "State field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC014
                ExtentTestManager.startTest("TC014 - Verify 'District' Field Loaded");
                boolean validateDistrict = true;
				try {
					validateDistrict = Security_Land_Module.validateDistrict();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'District' field is populated with data for the selected item" + validateDistrict);
                ExtentTestManager.getTest().log(Status.PASS, "'District' field is filled with relevant data" + validateDistrict);
               
                
               
               // boolean isDisabled20 =true;
				//try {
			//		isDisabled20 = Security_Land_Module.isDistrictFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled20, "District field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "District field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC015
                ExtentTestManager.startTest("TC015 - Verify 'Post' Field Loaded");
                boolean validatePost = true;
				try {
					validatePost = Security_Land_Module.validatePost();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Post' field is populated with data for the selected item" + validatePost);
                ExtentTestManager.getTest().log(Status.PASS, "'Post' field is filled with relevant data" + validatePost);
               
                
               
               // boolean isDisabled21 =true;
				//try {
				//isDisabled21 = Security_Land_Module.isPostFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled21, "Post field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Post field is disabled");
                ExtentTestManager.endTest();
                
                //TC016
                ExtentTestManager.startTest("TC016 - Verify 'City' Field Loaded");
                boolean validateCity = true;
				try {
					validateCity = Security_Land_Module.validateCity();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'City' field is populated with data for the selected item" + validateCity);
                ExtentTestManager.getTest().log(Status.PASS, "'City' field is filled with relevant data" + validateCity);
               
                
               
               // boolean isDisabled22 =true;
				//try {
			//	isDisabled22 = Security_Land_Module.isCityFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled22, "Post field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Post field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC017
                ExtentTestManager.startTest("TC017 - Verify 'Place' Field Loaded");
                boolean validatePlace = true;
				try {
					validatePlace = Security_Land_Module.validatePlace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Place' field is populated with data for the selected item" + validatePlace);
                ExtentTestManager.getTest().log(Status.PASS, "'Place' field is filled with relevant data" + validatePlace);
               
                
               
                boolean isDisabled23 =true;
				try {
					isDisabled23 = Security_Land_Module.isPlaceFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled23, "Place field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Place field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC018
                ExtentTestManager.startTest("TC018 - Verify 'Village' Field Loaded");
                boolean validateVillage = true;
				try {
					validateVillage = Security_Land_Module.validateVillage();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Place' field is populated with data for the selected item" + validateVillage);
                ExtentTestManager.getTest().log(Status.PASS, "'Place' field is filled with relevant data" + validateVillage);
               
                
               
                boolean isDisabled24 =true;
				try {
					isDisabled24 = Security_Land_Module.isVillageFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled24, "Village field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Village field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC019
                ExtentTestManager.startTest("TC019 - Verify 'Taluk' Field Loaded");
                boolean validateTaluk = true;
				try {
					validateTaluk = Security_Land_Module.validateTaluk();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Taluk' field is populated with data for the selected item" + validateTaluk);
                ExtentTestManager.getTest().log(Status.PASS, "'Taluk' field is filled with relevant data" + validateTaluk);
               
                
               
                boolean isDisabled25 =true;
				try {
					isDisabled25 = Security_Land_Module.isTalukFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled25, "Taluk field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Taluk field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC020
                ExtentTestManager.startTest("TC020 - Verify 'Panchayat' Field Loaded");
                boolean validatePanchayat = true;
				try {
					validatePanchayat = Security_Land_Module.validatePanchayat();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Panchayat' field is populated with data for the selected item" + validatePanchayat);
                ExtentTestManager.getTest().log(Status.PASS, "'Panchayat' field is filled with relevant data" + validatePanchayat);
               
                
               
                //boolean isDisabled26 =true;
			//	try {
			//	isDisabled26 = Security_Land_Module.isPanchayatFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled26, "Panchayat field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Panchayat field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC021
                ExtentTestManager.startTest("TC021 - Verify 'Constituency' Field Loaded");
                boolean validateConstituency = true;
				try {
					validateConstituency = Security_Land_Module.validateConstituency();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Constituency' field is populated with data for the selected item" + validateConstituency);
                ExtentTestManager.getTest().log(Status.PASS, "'Constituency' field is filled with relevant data" + validateConstituency);
               
                
               
             //   boolean isDisabled27 =true;
			//	try {
			//		isDisabled27 = Security_Land_Module.isConstituencyFieldDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
             //   Assert.assertTrue(isDisabled27, "Constituency field should be disabled");
              //  ExtentTestManager.getTest().log(Status.PASS, "Constituency field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC022
                ExtentTestManager.startTest("TC022 - Verify 'Cost Of Land Excluding Registration' Field Loaded");
                boolean validateCostOfLandExcludingRegistration = true;
				try {
					validateCostOfLandExcludingRegistration = Security_Land_Module.validateCostOfLandExcludingRegistration();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Cost Of Land Excluding Registration' field is populated with data for the selected item" + validateCostOfLandExcludingRegistration);
                ExtentTestManager.getTest().log(Status.PASS, "'Cost Of Land Excluding Registration' field is filled with relevant data" + validateCostOfLandExcludingRegistration);
               
                
               
                boolean isDisabled28 =true;
				try {
					isDisabled28 = Security_Land_Module.isCostOfLandExcludingRegistrationFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled28, "Cost Of Land Excluding Registration field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Cost Of Land Excluding Registration field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC023
                ExtentTestManager.startTest("TC023 - Verify 'Registration Cost' Field Loaded");
                boolean validateRegistrationCost = true;
				try {
					validateRegistrationCost = Security_Land_Module.validateRegistrationCost();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Registration Cost' field is populated with data for the selected item" + validateRegistrationCost);
                ExtentTestManager.getTest().log(Status.PASS, "'Registration Cost' field is filled with relevant data" + validateRegistrationCost);
               
                
               
                boolean isDisabled29 =true;
				try {
					isDisabled29 = Security_Land_Module.isRegistrationCostFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled29, "Registration Cost field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Registration Cost field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC024
                ExtentTestManager.startTest("TC024 - Verify 'Stamp Duty' Field Loaded");
                boolean validateStampDuty = true;
				try {
					validateStampDuty = Security_Land_Module.validateStampDuty();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Registration Cost' field is populated with data for the selected item" + validateStampDuty);
                ExtentTestManager.getTest().log(Status.PASS, "'Registration Cost' field is filled with relevant data" + validateStampDuty);
               
                
               
                boolean isDisabled30 =true;
				try {
					isDisabled30 = Security_Land_Module.isStampDutyFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled30, "Stamp Duty field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Stamp Duty field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC025
                ExtentTestManager.startTest("TC025 - Verify 'GOV Fair Value' Field Loaded");
                boolean validateGOVFairValue = true;
				try {
					validateGOVFairValue = Security_Land_Module.validateGOVFairValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'GOV Fair Value' field is populated with data for the selected item" + validateGOVFairValue);
                ExtentTestManager.getTest().log(Status.PASS, "'GOV Fair Value' field is filled with relevant data" + validateGOVFairValue);
               
                
               
                boolean isDisabled31 =true;
				try {
					isDisabled31 = Security_Land_Module.isGOVFairValueFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled31, "GOV Fair Value field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "GOV Fair Value field is disabled");
                ExtentTestManager.endTest();
                
                
                
                //TC026
                ExtentTestManager.startTest("TC026 - Verify 'Aprox Market Value' Field Loaded");
                boolean validateAproxMarketValue = true;
				try {
					validateAproxMarketValue = Security_Land_Module.validateAproxMarketValue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Aprox Market Value' field is populated with data for the selected item" + validateAproxMarketValue);
                ExtentTestManager.getTest().log(Status.PASS, "'Aprox Market Value' field is filled with relevant data" + validateAproxMarketValue);
               
                
               
                boolean isDisabled32 =true;
				try {
					isDisabled32 = Security_Land_Module.isAproxMarketValueFieldDisabled();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled32, "Aprox Market Value field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Aprox Market Value field is disabled");
                ExtentTestManager.endTest();
                

}
			
			
			
				

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




			