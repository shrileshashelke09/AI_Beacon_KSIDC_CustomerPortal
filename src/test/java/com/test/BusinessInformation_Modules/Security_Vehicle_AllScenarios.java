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
                ExtentTestManager.startTest("TC008 - Verify 'Ex-Showroom Price' Field Loaded");
				boolean validateExShowRoomPrice = true;
				try {
					validateExShowRoomPrice = Security_Vehicle_Module.validateExShowRoomPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Ex-showroom Price' field is populated with data for the selected item" + validateExShowRoomPrice);
                ExtentTestManager.getTest().log(Status.PASS, "'Ex-showroom Price' field is filled with relevant data" + validateExShowRoomPrice);
               
                
               
               boolean isExShowRoomPrice =true;
		        	try {
		        		isExShowRoomPrice = Security_Vehicle_Module.isExShowRoomPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isExShowRoomPrice, "Ex-showroom Price field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Ex-showroom Price field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC009
                ExtentTestManager.startTest("TC009 - Verify 'Registration' Field Loaded");
				boolean validateRegistration = true;
				try {
					validateRegistration = Security_Vehicle_Module.validateRegistration();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Registration' field is populated with data for the selected item" + validateRegistration);
                ExtentTestManager.getTest().log(Status.PASS, "'Registration' field is filled with relevant data" + validateRegistration);
               
                
               
   //            boolean isRegistration =true;
   //		        	try {
//		        		isRegistration = Security_Vehicle_Module.isRegistration();
	//			} catch (Exception e) {
					// TODO Auto-generated catch block
	//				e.printStackTrace();
	//			}
     //           Assert.assertTrue(isRegistration, "Registration field should be disabled");
      //          ExtentTestManager.getTest().log(Status.PASS, "Registration field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC010
                ExtentTestManager.startTest("TC010 - Verify 'On-Road Price' Field Loaded");
				boolean validateOnRoadPrice = true;
				try {
					validateOnRoadPrice = Security_Vehicle_Module.validateOnRoadPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'On-Road  Price' field is populated with data for the selected item" + validateOnRoadPrice);
                ExtentTestManager.getTest().log(Status.PASS, "'On-Road Price' field is filled with relevant data" + validateOnRoadPrice);
               
                
               
               boolean isOnRoadPrice =true;
		        	try {
		        		isOnRoadPrice = Security_Vehicle_Module.isOnRoadPrice();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isOnRoadPrice, "On-Road Price field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "On-Road Price field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC011
                ExtentTestManager.startTest("TC011 - Verify 'Vehicle Number' Field Loaded");
				boolean validateVehicleNumber = true;
				try {
					validateVehicleNumber = Security_Vehicle_Module.validateVehicleNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Vehicle Number' field is populated with data for the selected item" + validateVehicleNumber);
                ExtentTestManager.getTest().log(Status.PASS, "'Vehicle Number' field is filled with relevant data" + validateVehicleNumber);
               
                
               
               boolean isVehicleNumber =true;
		        	try {
		        		isVehicleNumber = Security_Vehicle_Module.isVehicleNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isVehicleNumber, "Vehicle Number field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Vehicle Number field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC012
                ExtentTestManager.startTest("TC012 - Verify 'Engine Number' Field Loaded");
				boolean validateEngineNumber = true;
				try {
					validateEngineNumber = Security_Vehicle_Module.validateEngineNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Engine Number' field is populated with data for the selected item" + validateEngineNumber);
                ExtentTestManager.getTest().log(Status.PASS, "'Engine Number' field is filled with relevant data" + validateEngineNumber);
               
                
               
               boolean isEngineNumber =true;
		        	try {
		        		isEngineNumber = Security_Vehicle_Module.isEngineNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isEngineNumber, "Engine Number field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Engine Number field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC013
                ExtentTestManager.startTest("TC013 - Verify 'Chase Number' Field Loaded");
				boolean validateChaseNumber = true;
				try {
					validateChaseNumber = Security_Vehicle_Module.validateChaseNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Chase Number' field is populated with data for the selected item" + validateChaseNumber);
                ExtentTestManager.getTest().log(Status.PASS, "'Chase Number' field is filled with relevant data" + validateChaseNumber);
               
                
               
               boolean isChaseNumber =true;
		        	try {
		        		isChaseNumber = Security_Vehicle_Module.isChaseNumber();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isChaseNumber, "Chase Number field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Chase Number field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC014
                ExtentTestManager.startTest("TC014 - Verify 'Registration Date' Field Loaded");
				boolean validateRegistrationDate = true;
				try {
					validateRegistrationDate = Security_Vehicle_Module.validateRegistrationDate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Registration Date' field is populated with data for the selected item" + validateRegistrationDate);
                ExtentTestManager.getTest().log(Status.PASS, "'Registration Date' field is filled with relevant data" + validateRegistrationDate);
               
                
               
               boolean isRegistrationDate =true;
		        	try {
		        		isRegistrationDate = Security_Vehicle_Module.isRegistrationDate();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isRegistrationDate, "Registration Date field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Registration Date field is disabled");
                ExtentTestManager.endTest();
                
                //TC015
                ExtentTestManager.startTest("TC015 - Verify 'Insurance Provider' Field Loaded");
				boolean validateInsuranceProvider = true;
				try {
					validateInsuranceProvider = Security_Vehicle_Module.validateInsuranceProvider();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Insurance Provider' field is populated with data for the selected item" + validateInsuranceProvider);
                ExtentTestManager.getTest().log(Status.PASS, "'Insurance Provider' field is filled with relevant data" + validateInsuranceProvider);
               
                
               
      //         boolean isInsuranceProvider =true;
		//        	try {
		 //       		isInsuranceProvider = Security_Vehicle_Module.isInsuranceProvider();
		//		} catch (Exception e) {
					// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
         //       Assert.assertTrue(isInsuranceProvider, "Insurance Provider field should be disabled");
          //      ExtentTestManager.getTest().log(Status.PASS, "Insurance Provider field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC016
                ExtentTestManager.startTest("TC016 - Verify 'Insurance Amount' Field Loaded");
				boolean validateInsuranceAmount = true;
				try {
					validateInsuranceAmount = Security_Vehicle_Module.validateInsuranceAmount();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Insurance Amount' field is populated with data for the selected item" + validateInsuranceAmount);
                ExtentTestManager.getTest().log(Status.PASS, "'Insurance Amount' field is filled with relevant data" + validateInsuranceAmount);
               
                
               
               boolean isInsuranceAmount =true;
		        	try {
		        		isInsuranceAmount = Security_Vehicle_Module.isInsuranceAmount();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isInsuranceAmount, "Insurance Amount field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Insurance Amount field is disabled");
                ExtentTestManager.endTest();
				
                
                
                
                //TC017
                ExtentTestManager.startTest("TC017 - Verify 'Road Tax' Field Loaded");
				boolean validateRoadTax = true;
				try {
					validateRoadTax = Security_Vehicle_Module.validateRoadTax();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Road Tax' field is populated with data for the selected item" + validateRoadTax);
                ExtentTestManager.getTest().log(Status.PASS, "'Road Tax' field is filled with relevant data" + validateRoadTax);
               
                
               
               boolean isRoadTax =true;
		        	try {
		        		isRoadTax = Security_Vehicle_Module.isRoadTax();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isRoadTax, "Road Tax field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Road Tax field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC018
                ExtentTestManager.startTest("TC018 - Verify 'Registration And Other Charges' Field Loaded");
				boolean validateRegistrationAndOtherCharges = true;
				try {
					validateRegistrationAndOtherCharges = Security_Vehicle_Module.validateRegistrationAndOtherCharges();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Registration And Other Charges' field is populated with data for the selected item" + validateRegistrationAndOtherCharges);
                ExtentTestManager.getTest().log(Status.PASS, "'Registration And Other Charges' field is filled with relevant data" + validateRegistrationAndOtherCharges);
               
                
               
               boolean isRegistrationAndOtherCharges =true;
		        	try {
		        		isRegistrationAndOtherCharges = Security_Vehicle_Module.isRegistrationAndOtherCharges();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isRegistrationAndOtherCharges, "Registration And Other Charges field should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Registration And Other Charges field is disabled");
                ExtentTestManager.endTest();
                
                
                //TC019
                ExtentTestManager.startTest("TC019 - Verify 'Dealer Discount' Field Loaded");
				boolean validateDealerDiscount = true;
				try {
					validateDealerDiscount = Security_Vehicle_Module.validateDealerDiscount();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Dealer Discount' field is populated with data for the selected item" + validateDealerDiscount);
                ExtentTestManager.getTest().log(Status.PASS, "'Dealer Discount' field is filled with relevant data" + validateDealerDiscount);
               
                
               
               boolean isDealerDiscount =true;
		        	try {
		        		isDealerDiscount = Security_Vehicle_Module.isDealerDiscount();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                Assert.assertTrue(isDealerDiscount, "Dealer Discount should be disabled");
                ExtentTestManager.getTest().log(Status.PASS, "Dealer Discount field is disabled");
                
                
                
               
				boolean ScrolltoDownPayment = true;
				try {
					ScrolltoDownPayment = svm.ScrolltoDownPayment();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ExtentTestManager.getTest().log(Status.PASS,"Scroll to  Down Payment " + ScrolltoDownPayment);
				ExtentTestManager.getTest().log(Status.PASS,"User is scroll  to Down Payment" + ScrolltoDownPayment);
				ExtentTestManager.endTest();
				
				
				//TC020
				 ExtentTestManager.startTest("TC020 - Verify 'Down Payment' Field Loaded");
					boolean validateDownPayment = true;
					try {
						validateDownPayment = Security_Vehicle_Module.validateDownPayment();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Down Payment' field is populated with data for the selected item" + validateDownPayment);
	                ExtentTestManager.getTest().log(Status.PASS, "'Down Payment' field is filled with relevant data" + validateDownPayment);
	               
	                
	               
	               boolean isDownPayment =true;
			        	try {
			        		isDownPayment = Security_Vehicle_Module.isDownPayment();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                Assert.assertTrue(isDownPayment, "Down Payment field should be disabled");
	                ExtentTestManager.getTest().log(Status.PASS, "Down Payment field is disabled");
	                ExtentTestManager.endTest();
	                
	                
	                //TC021
	                ExtentTestManager.startTest("TC0021 - Click on the Cancel");
					boolean ClickOnTheCancel = true;
					try {
						ClickOnTheCancel = svm.ClickOnTheCancel();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ExtentTestManager.getTest().log(Status.PASS,"Click on the Cancel" + ClickOnTheCancel);
					ExtentTestManager.getTest().log(Status.PASS,"The List of Vehicle should be closed" + ClickOnTheCancel);
					ExtentTestManager.endTest();
				
					
					
					//TC022
					ExtentTestManager.startTest("TC0022 - Click on the Continue");
					
					boolean ScrolltoContinue =true;
		        	try {
		        		ScrolltoContinue = svm.ScrolltoContinue();
				     } catch (Exception e) {
				    	// TODO Auto-generated catch block
					        e.printStackTrace();
				     }
		        	ExtentTestManager.getTest().log(Status.PASS,"Scroll to  Continue " + ScrolltoContinue);
					ExtentTestManager.getTest().log(Status.PASS,"User is scroll  to Continue" + ScrolltoContinue);
					
					
					boolean ClickOnTheContinue = true;
					try {
						ClickOnTheContinue = svm.ClickOnTheContinue();
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




		
				
				
				
				
				
				
				
							