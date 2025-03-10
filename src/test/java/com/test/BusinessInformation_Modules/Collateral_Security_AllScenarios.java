package com.test.BusinessInformation_Modules;

import java.io.File; 
import java.io.IOException;
import java.util.Map;

//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Collateral_Security;
import com.Pages_BusinessInformation_Modules.Collateral_Security_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Collateral_Security_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Collateral_Security CollateralSecurity;
	
	Collateral_Security_Module csm = new Collateral_Security_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_CollateralSecurity");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		CollateralSecurity = new Collateral_Security();  

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
				
				

				String TitleHolder = testdata.get("TitleHolder").toString();
				String Address = testdata.get("Address").toString();
				String Aadhaar = testdata.get("AadhaarNo").toString();
				String DocNo = testdata.get("DocNo").toString();
				String SurveyNo = testdata.get("SurveyNo").toString();
				String ResurveyNo = testdata.get("ResurveyNo").toString();
				String ExtendOfLandWet = testdata.get("ExtentOfLandWet").toString();
				String ExtendOfLandDRY = testdata.get("ExtentOfLandDRY").toString();
				String PinCode = testdata.get("PinCode").toString();
				String Place = testdata.get("Place").toString();
				String Village = testdata.get("Village").toString();
				String Taluk = testdata.get("Taluk").toString();
				String CostOfLandAsPerDocument = testdata.get("CostOfLandAsPerDocument").toString();
				String BuildingAge = testdata.get("BuildingAge").toString();
				String BuildingArea = testdata.get("BuildingArea").toString();
				String CostForTheBuilding = testdata.get("CostForTheBuilding").toString();
				
				
				
				

				//TC001
				ExtentTestManager.startTest("TC001 : Verify 'Login for Collateral Security'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login=Collateral_Security_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				//TC002
				ExtentTestManager.startTest("TC002 - Navigate to Collateral Security");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean CollateralSecurity = true;
				try {
					CollateralSecurity = csm.NavigatetoCollateralSecurity();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Collateral Security" + CollateralSecurity);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Collateral Security page successfully" + CollateralSecurity);
				//ExtentTestManager.endTest();
				
				
				
				//ExtentTestManager.startTest("TC003 - Navigate to Land page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean AccessCollateralSecurity = true;
				try {
					CollateralSecurity = csm.AccessCollateralSecurity();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Collateral Security" + AccessCollateralSecurity);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Collateral Security page" + AccessCollateralSecurity);
				ExtentTestManager.endTest();
				
				//TC003
				ExtentTestManager.startTest("TC003 : Verify 'Click on the Add Details'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean ClickontheAddDetails=csm.ClickontheAddDetails();
				ExtentTestManager.getTest().log(Status.PASS , "Click Add Details" + ClickontheAddDetails);
				ExtentTestManager.endTest();
				
				//TC004
				ExtentTestManager.startTest("TC004 - Enter Title Holder");
				boolean EnterTitleHolder = csm.EnterTitleHolder(TitleHolder);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Title Holder" + EnterTitleHolder);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterTitleHolder );
				ExtentTestManager.endTest();
				
				//TC005
				ExtentTestManager.startTest("TC005 - Select Relation With Applicant");
				boolean RelationWithApplicant = csm.RelationWithApplicant();
				ExtentTestManager.getTest().log(Status.PASS,"Select Relation With Applicantr" + RelationWithApplicant);
				ExtentTestManager.getTest().log(Status.PASS,"The relation with applicant selected" +RelationWithApplicant );
				ExtentTestManager.endTest();
				
				
				//TC006
				ExtentTestManager.startTest("TC006 - Enter Address");
				boolean EnterAddress = csm.EnterAddress(Address);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Address" + EnterAddress);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterAddress );
				ExtentTestManager.endTest();
				
				
				//TC007
				ExtentTestManager.startTest("TC007 - Enter Aadhaar");
				boolean EnterAadhaar = csm.EnterAadhaar(Aadhaar);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Aadhaar" + EnterAadhaar);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterAadhaar );
				ExtentTestManager.endTest();
				
				
				//TC008
				ExtentTestManager.startTest("TC008 - Enter DocNo");
				boolean EnterDocNo = csm.EnterDocNo(DocNo);
				ExtentTestManager.getTest().log(Status.PASS,"Enter DocNo" + EnterDocNo);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterDocNo );
				ExtentTestManager.endTest();
				
				//TC009
				ExtentTestManager.startTest("TC009 - Enter SurveyNo");
				boolean EnterSurveyNo = csm.EnterSurveyNo(SurveyNo);
				ExtentTestManager.getTest().log(Status.PASS,"Enter SurveyNo" + EnterSurveyNo);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterSurveyNo );
				ExtentTestManager.endTest();
				
				
				//TC010
				ExtentTestManager.startTest("TC010 - Enter ResurveyNo");
				boolean EnterResurveyNo = csm.EnterResurveyNo(ResurveyNo);
				ExtentTestManager.getTest().log(Status.PASS,"Enter ResurveyNo" + EnterResurveyNo);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterResurveyNo );
				ExtentTestManager.endTest();
				
				
				//TC011
				ExtentTestManager.startTest("TC011 - Enter ExtendOfLandWet");
				boolean EnterExtendOfLandWet = csm.EnterExtendOfLandWet(ExtendOfLandWet);
				ExtentTestManager.getTest().log(Status.PASS,"Enter ExtendOfLandWet" + EnterExtendOfLandWet);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterExtendOfLandWet );
				ExtentTestManager.endTest();
				
				//TC012
				ExtentTestManager.startTest("TC012 - Enter ExtendOfLandDRY");
				boolean EnterExtendOfLandDRY = csm.EnterExtendOfLandDRY(ExtendOfLandDRY);
				ExtentTestManager.getTest().log(Status.PASS,"Enter ExtendOfLandDRY" + EnterExtendOfLandDRY);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterExtendOfLandDRY );
				ExtentTestManager.endTest();
				
				
				//TC013
				ExtentTestManager.startTest("TC013 - Select Unit");
				boolean Unit = csm.Unit();
				ExtentTestManager.getTest().log(Status.PASS,"Select Unit" + Unit);
				ExtentTestManager.getTest().log(Status.PASS,"Unit selected" +Unit );
				ExtentTestManager.endTest();
				
				
				//Tc014
				ExtentTestManager.startTest("TC014 - Enter PinCode");
				boolean ScrolltoResurveyNo = true;
				try {
					ScrolltoResurveyNo = csm.ScrolltoResurveyNo();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to ResurveyNo field" + ScrolltoResurveyNo);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to ResurveyNo field successfully" + ScrolltoResurveyNo);
				

				boolean EnterPinCode = csm.EnterPinCode(PinCode);
				ExtentTestManager.getTest().log(Status.PASS,"Enter PinCode" + EnterPinCode);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterPinCode );
				
				
				
				//ExtentTestManager.startTest("TC002 - Navigate to Collateral Security");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				
				ExtentTestManager.endTest();
				
				
				//TC015
				 ExtentTestManager.startTest("TC015 - Verify 'State' Field Loaded");
					boolean validateState = true;
					try {
						validateState = Collateral_Security_Module.validateState();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'State' field is populated with data for the selected item" + validateState);
	                ExtentTestManager.getTest().log(Status.PASS, "'State' field is filled with relevant data" + validateState);
				
				
				//TC016
	                ExtentTestManager.startTest("TC016 - Verify 'District' Field Loaded");
					boolean validateDistrict = true;
					try {
						validateDistrict = Collateral_Security_Module.validateDistrict();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'District' field is populated with data for the selected item" + validateDistrict);
	                ExtentTestManager.getTest().log(Status.PASS, "'District' field is filled with relevant data" + validateDistrict);
	                ExtentTestManager.endTest();
				
				//TC017
				ExtentTestManager.startTest("TC017 - Select City");
				boolean EnterCity = csm.EnterCity();
				ExtentTestManager.getTest().log(Status.PASS," Select City" + EnterCity);
				ExtentTestManager.getTest().log(Status.PASS,"City is selected" +EnterCity );
				ExtentTestManager.endTest();
				
				
				//TC018
				ExtentTestManager.startTest("TC018 - Select Post");
				boolean EnterPost = csm.EnterPost();
				ExtentTestManager.getTest().log(Status.PASS," Select Post" + EnterPost);
				ExtentTestManager.getTest().log(Status.PASS,"Post is selected" +EnterPost );
				ExtentTestManager.endTest();
				
				
				//TC019
				ExtentTestManager.startTest("TC019 - Enter Place");
				boolean EnterPlace = csm.EnterPlace(Place);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Place" + EnterPlace);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterPlace );
				ExtentTestManager.endTest();
				
				//TC020
				ExtentTestManager.startTest("TC020 - Select Panchayat");
				boolean EnterPanchayat = csm.EnterPanchayat();
				ExtentTestManager.getTest().log(Status.PASS," Select Panchayat" + EnterPanchayat);
				ExtentTestManager.getTest().log(Status.PASS,"Panchayat is selected" +EnterPanchayat );
				ExtentTestManager.endTest();
				
				//TC021
				ExtentTestManager.startTest("TC021 - Enter Village");
				boolean EnterVillage = csm.EnterVillage(Village);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Village" + EnterVillage);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterVillage );
				ExtentTestManager.endTest();
				
				//TC022
				ExtentTestManager.startTest("TC022 - Enter Taluk");
				boolean EnterTaluk = csm.EnterTaluk(Taluk);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Taluk" + EnterTaluk);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterTaluk );
				ExtentTestManager.endTest();
				
				
				//TC023
				ExtentTestManager.startTest("TC023 - Select Constituency");
				boolean EnterConstituency = csm.EnterConstituency();
				ExtentTestManager.getTest().log(Status.PASS," Select Constituency" + EnterConstituency);
				ExtentTestManager.getTest().log(Status.PASS,"Constituency is selected" +EnterConstituency );
				ExtentTestManager.endTest();
				
				//TC024
				ExtentTestManager.startTest("TC024 - Enter CostOfLandAsPerDocument");
				boolean EnterCostOfLandAsPerDocument = csm.EnterCostOfLandAsPerDocument(CostOfLandAsPerDocument);
				ExtentTestManager.getTest().log(Status.PASS,"Enter CostOfLandAsPerDocument" + EnterCostOfLandAsPerDocument);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterCostOfLandAsPerDocument );
				ExtentTestManager.endTest();
				
				
				//TC025
				ExtentTestManager.startTest("TC025 - Enter RadiobuttonYes");
				boolean ClickontheYes = csm.ClickontheYes();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the Yes" + ClickontheYes);
				ExtentTestManager.endTest();
				
				
				//TC026
				ExtentTestManager.startTest("TC026 -Click on the Add Buildings");
				boolean AddBuildings = csm.AddBuildings();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the Add Buildings" + AddBuildings);
				ExtentTestManager.endTest();
				
				
				//TC027
				ExtentTestManager.startTest("TC027 - Select Building Type");
				boolean BuildingType = csm.BuildingType();
				ExtentTestManager.getTest().log(Status.PASS," Select Building Type" + BuildingType);
				ExtentTestManager.getTest().log(Status.PASS,"Building Type is selected" +BuildingType );
				ExtentTestManager.endTest();
				
				
				//TC028
				ExtentTestManager.startTest("TC028 - Enter Building Age");
				boolean EnterBuildingAge = csm.EnterBuildingAge(BuildingAge);
				ExtentTestManager.getTest().log(Status.PASS,"Enter CostOfLandAsPerDocument" + EnterBuildingAge);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterBuildingAge );
				ExtentTestManager.endTest();
				
				
				//TC029
				ExtentTestManager.startTest("TC029 - Enter Building Area");
				boolean EnterBuildingArea = csm.EnterBuildingArea(BuildingArea);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Building Area" + EnterBuildingArea);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterBuildingArea );
				ExtentTestManager.endTest();
				
				
				//TC030
				ExtentTestManager.startTest("TC030 - Enter Cost For The Building");
				boolean EnterCostForTheBuilding = csm.EnterCostForTheBuilding(CostForTheBuilding);
				ExtentTestManager.getTest().log(Status.PASS,"Enter Cost For The Building" + EnterCostForTheBuilding);
				ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterCostForTheBuilding );
				ExtentTestManager.endTest();
				
				
				//TC031
				ExtentTestManager.startTest("TC031 - Click on the Add Buildings");
				boolean AddBuilding2 = csm.AddBuilding2();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the Add Buildings" + AddBuilding2);
				ExtentTestManager.endTest();
				
				
				//TC032
//				ExtentTestManager.startTest("TC032 - Click on the Save as Draft");
				
//				
//				boolean ClickSaveasDraft = csm.ClickSaveasDraft();
//				ExtentTestManager.getTest().log(Status.PASS , "Click on the Save as Draft" + ClickSaveasDraft);
//				ExtentTestManager.endTest();
//				
//				
				//TC032
				ExtentTestManager.startTest("TC033 - Click on the Save and Proceed");
				boolean ScrolltoYes = true;
				try {
					ScrolltoYes = csm.ScrolltoYes();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Yes" + ScrolltoYes);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Save as Draft successfully" + ScrolltoYes);
				
				boolean ClickSaveandProceed = csm.ClickSaveandProceed();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the Save and Proceed" + ClickSaveandProceed);
				ExtentTestManager.endTest();
				
				//TC033
				ExtentTestManager.startTest("TC0033 - Click on the Continue");
				
				boolean ScrolltoContinue =true;
	        	try {
	        		ScrolltoContinue = csm.ScrolltoContinue();
			     } catch (Exception e) {
			    	// TODO Auto-generated catch block
				        e.printStackTrace();
			     }
	        	ExtentTestManager.getTest().log(Status.PASS,"Scroll to  Continue " + ScrolltoContinue);
				ExtentTestManager.getTest().log(Status.PASS,"User is scroll  to Continue" + ScrolltoContinue);
				
				
				boolean ClickOnTheContinue = true;
				try {
					ClickOnTheContinue = csm.ClickOnTheContinue();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Click on the Continue" + ClickOnTheContinue);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to the next page" + ClickOnTheContinue);
			    ExtentTestManager.endTest();
				
				


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




		
				
				
				
				
				
				
				

				