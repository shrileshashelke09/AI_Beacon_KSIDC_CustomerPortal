package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Project_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;


public class Project_Details_AllScenarios extends Base_Class{
		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Project_Details_Module Project_Details_Module;

		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Project_Details");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Project_Details_Module = new Project_Details_Module();

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

					String EmailAddress = testdata.get("EmailAddress").toString();
					String Password = testdata.get("Password").toString();
					String ProjectDescription = testdata.get("ProjectDescription").toString();
					String InnovationOrIdeaForProduct = testdata.get("InnovationOrIdeaForProduct").toString();
					String TechnologyOrProvenConcept = testdata.get("TechnologyOrProvenConcept").toString();
					String AddressableOrserviceableMarket = testdata.get("AddressableOrserviceableMarket").toString();
					String ReachOutStrategies = testdata.get("ReachOutStrategies").toString();
					String ProposedRevenueModelPricing = testdata.get("ProposedRevenueModelPricing").toString();
					String CurrentStatusOfProject = testdata.get("CurrentStatusOfProject").toString();
					String ProjectDescriptionMarketAndFutureProfitability = testdata.get("MarketAndFutureProfitability").toString();
					String ExitOptionsForLender = testdata.get("ExitOptionsForLender").toString();
					String ProductOrServicesOrRawmeterialsOfTheProject = testdata.get("ProductOrServicesOrRawmeterialsOfTheProject").toString();
					String UnitName = testdata.get("UnitName").toString();
					String UnitType = testdata.get("UnitType").toString();
					String UnitAge = testdata.get("UnitAge").toString();
					String Address1 = testdata.get("Address1").toString();
					String Address2 = testdata.get("Address2").toString();
					String Address3 = testdata.get("Address3").toString();
					String PinCode = testdata.get("PinCode").toString();
					String Village = testdata.get("Village").toString();


					
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Project_Details Module");
					Log.info("Button visible !");
					boolean Login = Project_Details_Module.Login(EmailAddress, Password);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 - Project Details Page Load");
					boolean ProjectDetailsPageLoad = Project_Details_Module.ProjectDetailsPage();
					ExtentTestManager.getTest().log(Status.PASS, "User Logged In" + ProjectDetailsPageLoad);
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the heading of the page" + ProjectDetailsPageLoad);
					ExtentTestManager.getTest().log(Status.PASS, "Heading confirms the user is on the Project details page" + ProjectDetailsPageLoad);
					Log.info("Heading confirms the user is on the Project details page :" + ProjectDetailsPageLoad);
					
					//TC003
					
					ExtentTestManager.startTest("TC003 - Project Description Field Validations");
					boolean EnterDescription = Project_Details_Module.EnterProjectDescription(ProjectDescription);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Project Description\"" + EnterDescription);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterDescription);
					ExtentTestManager.getTest().log(Status.PASS, "Project Description Entered successfully" + EnterDescription);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 - Innovation Or Idea For The Product\" Field Validations");
					boolean EnterInnovationOrIdeaForProduct = Project_Details_Module.EnterInnovationOrIdeaForProduct(InnovationOrIdeaForProduct);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Innovation Or Idea For Product\"" + EnterInnovationOrIdeaForProduct);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterInnovationOrIdeaForProduct);
					ExtentTestManager.getTest().log(Status.PASS, "Innovation Or Idea For Product Entered successfully" + EnterInnovationOrIdeaForProduct);
					
					//TC005
					
					ExtentTestManager.startTest("TC005 - Technology Involved Field Validations");
					boolean EnterTechnologyOrProvenConcept = Project_Details_Module.EnterTechnologyOrProvenConcept(TechnologyOrProvenConcept);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Technology Or Proven Concept\"" + EnterTechnologyOrProvenConcept);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterTechnologyOrProvenConcept);
					ExtentTestManager.getTest().log(Status.PASS, "Technology Or Proven Concept Entered successfully" + EnterTechnologyOrProvenConcept);
					
					//TC006
					
					ExtentTestManager.startTest("TC006 -Addressable Market Field  Validations");
					boolean EnterAddressableOrserviceableMarket = Project_Details_Module.EnterAddressableOrserviceableMarket(AddressableOrserviceableMarket);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Addressable Or serviceable Market Field\"" + EnterAddressableOrserviceableMarket);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterAddressableOrserviceableMarket);
					ExtentTestManager.getTest().log(Status.PASS, "Addressable Or serviceable Market Field Entered successfully" + EnterAddressableOrserviceableMarket);
					
					//TC007
					
					ExtentTestManager.startTest("TC007 - Reach Out Strategies Field Validations");
					boolean EnterReachOutStrategies = Project_Details_Module.EnterReachOutStrategies(ReachOutStrategies);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Reach Out Strategies\"" + EnterReachOutStrategies);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterReachOutStrategies);
					ExtentTestManager.getTest().log(Status.PASS, "Reach Out Strategies Field Entered successfully" + EnterReachOutStrategies);
					
					//TC008
					
					ExtentTestManager.startTest("TC008 - Proposed Revenue Model Pricing Field Validations");
					boolean EnterProposedRevenueModelPricing = Project_Details_Module.EnterProposedRevenueModelPricing(ProposedRevenueModelPricing);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Proposed Revenue Model Pricing\"" + EnterProposedRevenueModelPricing);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterProposedRevenueModelPricing);
					ExtentTestManager.getTest().log(Status.PASS, "Proposed Revenue Model Pricing Field Entered successfully" + EnterProposedRevenueModelPricing);
					
					//TC009
					
					ExtentTestManager.startTest("TC009 - Current Status Of Project Field Validations");
					boolean EnterCurrentStatusOfProject = Project_Details_Module.EnterCurrentStatusOfProject(CurrentStatusOfProject);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Current Status Of Project\"" + EnterCurrentStatusOfProject);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterCurrentStatusOfProject);
					ExtentTestManager.getTest().log(Status.PASS, "Current Status Of Project Field Entered successfully" + EnterCurrentStatusOfProject);
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Project Description Market And Future Profitability Field Validations");
					boolean EnterMarketAndFutureProfitability = Project_Details_Module.EnterMarketAndFutureProfitability(ProjectDescriptionMarketAndFutureProfitability);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Project Description Market And Future Profitability\"" + EnterMarketAndFutureProfitability);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterMarketAndFutureProfitability);
					ExtentTestManager.getTest().log(Status.PASS, "Project Description Market And Future Profitability Field Entered successfully" + EnterMarketAndFutureProfitability);
					
					//TC011
					
					ExtentTestManager.startTest("TC011 - Exit Options For Lender Field Validations");
					boolean EnterExitOptionsForLender = Project_Details_Module.EnterExitOptionsForLender(ExitOptionsForLender);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Exit Options For Lender\"" + EnterExitOptionsForLender);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterExitOptionsForLender);
					ExtentTestManager.getTest().log(Status.PASS, "Exit Options For Lender Field Entered successfully" + EnterExitOptionsForLender);
					
					//TC012
					
					ExtentTestManager.startTest("TC012 - Product Or Services Or Raw meterials Of The Project Field Validations");
					boolean EnterProductOrServicesOrRawmeterialsOfTheProject = Project_Details_Module.EnterProductOrServicesOrRawmeterialsOfTheProject(ProductOrServicesOrRawmeterialsOfTheProject);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Alphabetic, Numeric, and Alphanumeric in \"Product Or Services Or Raw meterials Of The Project\"" + EnterProductOrServicesOrRawmeterialsOfTheProject);
					ExtentTestManager.getTest().log(Status.PASS, "All inputs allowed." + EnterProductOrServicesOrRawmeterialsOfTheProject);
					ExtentTestManager.getTest().log(Status.PASS, "Product Or Services Or Raw meterials Of The Project Field Entered successfully" + EnterProductOrServicesOrRawmeterialsOfTheProject);
					
					//TC013
					
					ExtentTestManager.startTest("TC013 - \"Is Needed Additional Units\" Visibility");
					boolean ValidateIssNeededsection = Project_Details_Module.IsNeededAdditionalUnits();
					ExtentTestManager.getTest().log(Status.PASS, "User Logged In" + ValidateIssNeededsection);
					ExtentTestManager.getTest().log(Status.PASS, "1. Locate the \"Is Needed Additional Units\" section" + ValidateIssNeededsection);
					ExtentTestManager.getTest().log(Status.PASS, "Section is visible" + ValidateIssNeededsection);
					Log.info("Section is visible :" + ValidateIssNeededsection);
					
					//TC014
					
					
					ExtentTestManager.startTest("TC014 - \"Is Needed Additional Units\" Radio Button Check");
					boolean ValidateRadiobutton = Project_Details_Module.RadioButtonCheck();
					ExtentTestManager.getTest().log(Status.PASS, "1. Confirm \"Is Needed Additional Units\" is a radio button" + ValidateRadiobutton);
					ExtentTestManager.getTest().log(Status.PASS, "Confirmed as radio button" + ValidateRadiobutton);
					Log.info("Confirmed as radio button :" + ValidateRadiobutton);
					
					//TC015
					
					ExtentTestManager.startTest("TC015 - \"Add Project Unit Details\" Button Visibility");
					boolean YESRadiobutton = Project_Details_Module.YESRadioButtonselection();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select \"Yes\" on \"Is Needed Additional Units\" radio button" + YESRadiobutton);
					ExtentTestManager.getTest().log(Status.PASS, "2. Locate \"Add Project Unit Details\" button" + YESRadiobutton);
					Log.info("Button is visible after selection :" + YESRadiobutton);
					
					
					//TC016
					
					ExtentTestManager.startTest("TC016 -\"Add Project Unit Details\" Button Functionality");
					boolean AddProjectDetailsButton = Project_Details_Module.ClickonAddProjectUnitDetails();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Add Project Unit Details\" button" + AddProjectDetailsButton);
					ExtentTestManager.getTest().log(Status.PASS, "Navigate to Add Project Unit Details page" + AddProjectDetailsButton);
					Log.info("Navigate to Add Project Unit Details page :" + AddProjectDetailsButton);
					
					
					//TC017
					
					ExtentTestManager.startTest("TC017 - Verify Redirection to Pop-up");
					boolean validatepopupWindowLoad = Project_Details_Module.ValidaeAddProjectPopUp();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Add Project Units Details\" button." + validatepopupWindowLoad);
					ExtentTestManager.getTest().log(Status.PASS, "The pop-up window \\\"Add Project Units Details\\\" appears. " + validatepopupWindowLoad);
					Log.info("The pop-up window \"Add Project Units Details\" appears. :" + validatepopupWindowLoad);
					
					//Tc018
					
					ExtentTestManager.startTest("TC018 - Verify \"Unit Name\" Field - Alphabets");
					boolean EnterUnitName = Project_Details_Module.EnterUnitName(UnitName);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter 'Unit123' in \"Unit Name\" field." + EnterUnitName);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterUnitName);		
					ExtentTestManager.getTest().log(Status.PASS, "Alpha-numeric data is accepted in \"Unit Name\"..x " + EnterUnitName);		

					//TC019
					
					ExtentTestManager.startTest("TC019 - Verify \"Unit Type\" Field Selection");
					boolean EnterUnitType = Project_Details_Module.EnterUnitype(UnitType);
					ExtentTestManager.getTest().log(Status.PASS, "1.Click on the \"Unit Type\" " + EnterUnitType);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterUnitType);		
					ExtentTestManager.getTest().log(Status.PASS, "Alpha-numeric data is accepted in \"Unit Type\".. " + EnterUnitType);		

					//TC020
					
					ExtentTestManager.startTest("TC020 - Verify \"Unit Age\" Field - Numeric");
					boolean EnterUnitAge= Project_Details_Module.EnterUnitAge(UnitAge);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter '5' in \"Unit Age\" field. " + EnterUnitAge);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterUnitAge);		
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted in \"Unit Age\"." + EnterUnitAge);	
					
					//TC021
					
					ExtentTestManager.startTest(" TC021 - Verify \"Address Line1\" Field - Alphanumeric");
					boolean EnterAddress1= Project_Details_Module.EnterAddress1(Address1);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter 'Street 12B' in \"Address Line1\" field." + EnterAddress1);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterAddress1);		
					ExtentTestManager.getTest().log(Status.PASS, "Alpha-numeric data is accepted in \"Address Line1\"." + EnterAddress1);	
					
					//TC022
					
					ExtentTestManager.startTest("TC022 - Verify \"Address Line2\" Field - Alphanumeric");
					boolean EnterAddress2= Project_Details_Module.EnterAddress2(Address2);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter 'Apt 34C' in \"Address Line2\" field." + EnterAddress2);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterAddress2);		
					ExtentTestManager.getTest().log(Status.PASS, "Alpha-numeric data is accepted in \"Address Line2\"." + EnterAddress2);	
					
					//TC023
					
					ExtentTestManager.startTest("TC023 - Verify \"Address Line3\" Field - Alphanumeric");
					boolean EnterAddress3= Project_Details_Module.EnterAddress3(Address3);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter 'Near Park' in \"Address Line3\" field." + EnterAddress3);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterAddress3);		
					ExtentTestManager.getTest().log(Status.PASS, "Alpha-numeric data is accepted in \"Address Line3\"." + EnterAddress3);	
					
					//TC024
					
					ExtentTestManager.startTest("TC024 - Verify \"PinCode\" Field - Numeric");
					boolean EnterPinCode= Project_Details_Module.EnterPinCode(PinCode);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter '123456' in \"PinCode\" field." + EnterPinCode);
					ExtentTestManager.getTest().log(Status.PASS, "2. Observe the input field. " + EnterPinCode);		
					ExtentTestManager.getTest().log(Status.PASS, "Numeric data is accepted in \"PinCode\"." + EnterPinCode);	

					//TC025
					
					ExtentTestManager.startTest("TC025 - Verify \"State\" Field Selection");
					boolean SelectState= Project_Details_Module.SelectState();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"State\" dropdown." + SelectState);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select an option. " + SelectState);		
					ExtentTestManager.getTest().log(Status.PASS, "Selected option appears in \"State\" field." + SelectState);	

					//TC026
					
					ExtentTestManager.startTest("TC026 - Verify \"District\" Field Selection");
					boolean SelectDistrict= Project_Details_Module.SelectDistrict();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"District\" dropdown." + SelectDistrict);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select an option. " + SelectDistrict);		
					ExtentTestManager.getTest().log(Status.PASS, "Selected option appears in \"District\" field." + SelectDistrict);
					
					//TC027
					
					ExtentTestManager.startTest("TC027 - Verify \"City\" Field Selection");
					boolean SelectCity= Project_Details_Module.SelectCity();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"City\" dropdown." + SelectCity);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select an option. " + SelectCity);		
					ExtentTestManager.getTest().log(Status.PASS, "Selected option appears in \"City\" field." + SelectCity);
					
					//TC028

					ExtentTestManager.startTest("TC028 - Verify \"Post\" Field Selection");
					boolean SelectPost= Project_Details_Module.SelectPost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"Post\" dropdown." + SelectPost);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select an option. " + SelectPost);		
					ExtentTestManager.getTest().log(Status.PASS, "Selected option appears in \"Post\" field." + SelectPost);
					
					
					//TC029
					
					ExtentTestManager.startTest("TC029 - Verify \"Village\" Field ");
					boolean EnterVillage= Project_Details_Module.EnterVillage(Village);
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"Post\" Field." + EnterVillage);
					ExtentTestManager.getTest().log(Status.PASS, "2. Enter data. " + EnterVillage);		
					ExtentTestManager.getTest().log(Status.PASS, "Entered village name appeared in \"Village\" field." + EnterVillage);
					
					
					//TC030
					
					ExtentTestManager.startTest("TC030 - Verify \"Panchayat\" Field Selection");
					boolean SelectPanchayat= Project_Details_Module.SelectPanchayat();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"Panchayat\" dropdown." + SelectPanchayat);
					ExtentTestManager.getTest().log(Status.PASS, "2. Select an option. " + SelectPanchayat);		
					ExtentTestManager.getTest().log(Status.PASS, "Selected option appears in \"Panchayat\" field." + SelectPanchayat);
					
					//TC031
					
					ExtentTestManager.startTest("TC031 - Verify \"Add Unit\" Button Availability");
					boolean ValidateAddUnitButton= Project_Details_Module.AddUnitsButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the pop-up for \"Add Unit\" button presence." + ValidateAddUnitButton);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Unit\" button is available and enabled. " + ValidateAddUnitButton);		
					
					
					//TC032
					
					ExtentTestManager.startTest("TC032 - Verify \"Add Unit\" Button Availability");
					boolean clickAddUnitButton= Project_Details_Module.CLickAddUnitsButton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the \"Add Unit\" button." + clickAddUnitButton);
					ExtentTestManager.getTest().log(Status.PASS, "Unit is added and details are reflected in the \"List of Project Unit Details\"." + clickAddUnitButton);		
					
					//TC033
					
					ExtentTestManager.startTest("TC033 - Verify Added Unit Data Display");
					boolean ValidateAddedUnits= Project_Details_Module.ValidateAddedUnits();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to \"List of Project Unit Details\"." + ValidateAddedUnits);
					ExtentTestManager.getTest().log(Status.PASS, "2. Verify entry." + ValidateAddedUnits);		
					ExtentTestManager.getTest().log(Status.PASS, "Added unit displays in the list with correct details." + ValidateAddedUnits);		

					//TC034
					
					ExtentTestManager.startTest("TC034 - Verify \"Save as Draft\" Button Functionality");
					boolean SaveAsDraft= Project_Details_Module.SaveAsDraft();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + SaveAsDraft);
					ExtentTestManager.getTest().log(Status.PASS, "Data is saved as draft for future access." + SaveAsDraft);		

					
//					//TC035
					
					ExtentTestManager.startTest("TC035 - Verify \"Save and Proceed\" Button Functionality");
					boolean SaveAndproceed= Project_Details_Module.SaveAndProceed();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save and Proceed\" button." + SaveAndproceed);
					ExtentTestManager.getTest().log(Status.PASS, "Data is saved and user is redirected to the next step." + SaveAndproceed);		

					
					
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


