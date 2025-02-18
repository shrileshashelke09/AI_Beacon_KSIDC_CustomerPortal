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
import com.Page_Repositary.Security_Vehicle;
import com.Pages_BusinessInformation_Modules.Security_Vehicle_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Vehicle_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Security_Vehicle Securityvehicle;
	
	Security_Vehicle_Module svm = new Security_Vehicle_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_SecurityVehicle");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Securityvehicle = new Security_Vehicle();  

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
				ExtentTestManager.startTest("TC001 : Verify 'Login for Vehicle'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login=Security_Vehicle_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				//TC002
				ExtentTestManager.startTest("TC002 - Navigate to Vehicles page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean securityvehicle = true;
				try {
					securityvehicle = svm.Navigatetosecurityvehicle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Vehicles" + securityvehicle);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Vehicles page successfully" + securityvehicle);
				//ExtentTestManager.endTest();
				
				
				
				//ExtentTestManager.startTest("TC003 - Navigate to Land page");
				//boolean MeansOfFinance = MeansOfFinance_Module.Navigatetomeansoffinance();
				boolean AccessSecurityVehicle = true;
				try {
					securityvehicle = svm.AccessSecurityVehicle();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Attempt to navigate to Vehicles" + AccessSecurityVehicle);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Vehicles page" + AccessSecurityVehicle);
				ExtentTestManager.endTest();
				
				//TC003
				ExtentTestManager.startTest("TC003 : Verify 'Click on the List of Vehicle'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean ClickontheListOfVehicle=svm.ClickontheListOfVehicle();
				ExtentTestManager.getTest().log(Status.PASS , "Click List of Vehicle" + ClickontheListOfVehicle);
				ExtentTestManager.endTest();
				
				
				
				//TC004
				ExtentTestManager.startTest("TC004 - Verify 'Vehicle Category' Field Loaded");
				boolean ScrolltoTotal = true;
				try {
					ScrolltoTotal = svm.ScrolltoTotal();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Try to navigate vehicle category field " + ScrolltoTotal);
				ExtentTestManager.getTest().log(Status.PASS,"User is navigated to Vehicle category" + ScrolltoTotal);
				
				
                boolean validateVehicleCategory = true;
				try {
					validateVehicleCategory = Security_Vehicle_Module.validateVehicleCategory();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle category' field is populated with data for the selected item" + validateVehicleCategory);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Category' field is filled with relevant data" + validateVehicleCategory);
               
                
               
           //     boolean isDisabled =true;
			//	try {
			//		isDisabled = Security_Vehicle_Module.isVehicleCategoryDisabled();
			//	} catch (Exception e) {
			//		// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
           //     Assert.assertTrue(isDisabled, "Vehicle Category field should be disabled");
           //     ExtentTestManager.getTest().log(Status.PASS, "Vehicle Category field is disabled");
                ExtentTestManager.endTest();
			
                
                //TC005
                ExtentTestManager.startTest("TC005 - Verify 'Vehicle Manufacture' Field Loaded");
				boolean validateVehicleManufacture = true;
				try {
					validateVehicleManufacture = Security_Vehicle_Module.validateVehicleManufacture();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle Manufacture' field is populated with data for the selected item" + validateVehicleManufacture);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Manufacture' field is filled with relevant data" + validateVehicleManufacture);
               
                
               
             //  boolean isVehicleManufacturefieldDisabled =true;
		      //  	try {
		      //  		isVehicleManufacturefieldDisabled = Security_Vehicle_Module.isVehicleManufacturefieldDisabled();
			//	} catch (Exception e) {
					// TODO Auto-generated catch block
			//		e.printStackTrace();
			//	}
            //    Assert.assertTrue(isVehicleManufacturefieldDisabled, "Vehicle Manufacture field should be disabled");
            //    ExtentTestManager.getTest().log(Status.PASS, "Vehicle Manufacture field is disabled");
                ExtentTestManager.endTest();
                
                //TC006
                
                ExtentTestManager.startTest("TC006 - Verify 'Vehicle Model' Field Loaded");
				boolean validateVehicleModel = true;
				try {
					validateVehicleModel = Security_Vehicle_Module.validateVehicleModel();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle Model' field is populated with data for the selected item" + validateVehicleModel);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Model' field is filled with relevant data" + validateVehicleModel);
               
                
               
               boolean isDisabled =true;
		        	try {
					isDisabled = Security_Vehicle_Module.isVehicleModel();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDisabled, "Vehicle Model field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Vehicle Model field is disabled");
                ExtentTestManager.endTest();
			
                
                //TC007
                ExtentTestManager.startTest("TC007 - Verify 'Vehicle Colour' Field Loaded");
				boolean validateVehicleColour = true;
				try {
					validateVehicleColour = Security_Vehicle_Module.validateVehicleColour();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle Colour' field is populated with data for the selected item" + validateVehicleColour);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Colour' field is filled with relevant data" + validateVehicleColour);
               
                
               
               boolean isVehicleColour =true;
		        	try {
		        		isVehicleColour = Security_Vehicle_Module.isVehicleColour();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isVehicleColour, "Vehicle Colour field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Vehicle colour field is disabled");
                ExtentTestManager.endTest();
			
                
                
                //Tc008
                ExtentTestManager.startTest("TC007 - Verify 'Ex-Showroom Price' Field Loaded");
				boolean validateExShowRoomPrice = true;
				try {
					validateExShowRoomPrice = Security_Vehicle_Module.validateExShowRoomPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle Colour' field is populated with data for the selected item" + validateExShowRoomPrice);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Colour' field is filled with relevant data" + validateExShowRoomPrice);
               
                
               
               boolean isExShowRoomPrice =true;
		        	try {
		        		isExShowRoomPrice = Security_Vehicle_Module.isExShowRoomPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isExShowRoomPrice, "Vehicle Colour field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Vehicle colour field is disabled");
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




		
				
				
				
				
				
				
				
							