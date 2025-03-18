package com.test.BusinessInformation_Modules;

import java.io.File; 
import java.io.IOException;
import java.util.Map;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Page_Repositary.Bank_Profile;
import com.Pages_BusinessInformation_Modules.Bank_Profile_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Bank_Profile_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Bank_Profile BankProfile;
	
	Bank_Profile_Module bpm = new Bank_Profile_Module();
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC-BankProfile");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		BankProfile = new Bank_Profile();  

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
				
				
    			String IFSCCode = testdata.get("IFSCCode").toString();
				String AccountHolderName = testdata.get("AccountHolderName").toString();
				String AccountNumber = testdata.get("AccountNumber").toString(); 
				String ReTypeAccountNumber = testdata.get("ReTypeAccountNumber").toString();
//			String SurveyNo = testdata.get("SurveyNo").toString();
//				String ResurveyNo = testdata.get("ResurveyNo").toString();
//				String ExtendOfLandWet = testdata.get("ExtentOfLandWet").toString();
//				String ExtendOfLandDRY = testdata.get("ExtentOfLandDRY").toString();
//				String PinCode = testdata.get("PinCode").toString();
//				String Place = testdata.get("Place").toString();
//				String Village = testdata.get("Village").toString();
//				String Taluk = testdata.get("Taluk").toString();
//				String CostOfLandAsPerDocument = testdata.get("CostOfLandAsPerDocument").toString();
//				String BuildingAge = testdata.get("BuildingAge").toString();
//				String BuildingArea = testdata.get("BuildingArea").toString();
//				String CostForTheBuilding = testdata.get("CostForTheBuilding").toString();
//				
				
				
				

				//TC001
				ExtentTestManager.startTest("TC001 : Verify 'Login for Bank Profile'");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean login = Bank_Profile_Module.Login();
				ExtentTestManager.getTest().log(Status.PASS , "Enter Email" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Enter Password" + login);
				ExtentTestManager.getTest().log(Status.PASS , "Click login button" + login);
				//ExtentTestManager.getTest().log(Status.PASS , "Click on continue" + login);
			
				ExtentTestManager.endTest();
				
				
				
				
				//TC002
				    ExtentTestManager.startTest("TC002 : Verify Profile Icon Visibility");
				    boolean ProfileIcon = bpm.isProfileIconVisible();
			        Assert.assertTrue(ProfileIcon, "Profile icon should be visible after login.");
			        ExtentTestManager.getTest().log(Status.PASS , "Profile icon should be visible after login." + ProfileIcon);
			        ExtentTestManager.endTest();
			       
			
				//TC003
			    ExtentTestManager.startTest("TC003 : Click on the Profile button");
				//boolean Login =  MeansOfFinance_Module.login();
				boolean ClickontheProfileButton=bpm.ClickontheProfileButton();
				ExtentTestManager.getTest().log(Status.PASS , "Click on the Profile Button" + ClickontheProfileButton);
				ExtentTestManager.endTest();
				
				
				//TC004
				     ExtentTestManager.startTest("TC004 : Click on the Bank Profile");
					//boolean Login =  MeansOfFinance_Module.login();
					boolean ClickontheBankProfile=bpm.ClickontheBankProfile();
					ExtentTestManager.getTest().log(Status.PASS , "Click on the Profile Button" + ClickontheBankProfile);
					ExtentTestManager.endTest();
					
				//TC005
					ExtentTestManager.startTest("TC005 : Verify Bank Details heading");
					boolean BankingDetails = bpm.BankDetails();
				    Assert.assertTrue(BankingDetails, "Banking Details heading should be visible after login.");
				    ExtentTestManager.getTest().log(Status.PASS , "Banking Details heading should be visible after login." + BankingDetails);
				    ExtentTestManager.endTest();
				       
				    
				 //TC006
				    ExtentTestManager.startTest("TC006 : Verify IFSC Code field");
					boolean IFSCCodeField = bpm.IFSCCode();
				    Assert.assertTrue(IFSCCodeField, "IFSC Code field should be visible after login.");
				    ExtentTestManager.getTest().log(Status.PASS , "IFSC Code field should be visible after login." + IFSCCodeField);
				    ExtentTestManager.endTest();
				    
				    
				  //TC007
				    ExtentTestManager.startTest("TC007 - Enter IFSC Code");
					boolean EnterIFSCCode = bpm.EnterIFSCCode(IFSCCode);
					ExtentTestManager.getTest().log(Status.PASS,"Enter IFSC Code" + EnterIFSCCode);
					ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterIFSCCode );
					ExtentTestManager.endTest();
				       
					
					
					
					//TC008
					
					ExtentTestManager.startTest("TC008 : Validate Bank Name");
					//boolean Login =  MeansOfFinance_Module.login();
					boolean ClickontheBankName=bpm.ClickontheBankName();
					ExtentTestManager.getTest().log(Status.PASS , "Click on the Bank Name title" + ClickontheBankName);
					
					 
						boolean validateBankName = true;
						try {
							validateBankName = Bank_Profile_Module.validateBankName();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Bank Name' field is populated with data for the selected item" + validateBankName);
		                ExtentTestManager.getTest().log(Status.PASS, "'Bank Name' field is filled with relevant data" + validateBankName);
		                ExtentTestManager.endTest();
					    
					    
					//TC009
		                ExtentTestManager.startTest("TC009 : Validate Branch Name");
		                boolean ClickontheBranchName=bpm.ClickontheBranchName();
						ExtentTestManager.getTest().log(Status.PASS , "Click on the Branch Name title" + ClickontheBranchName);
						
						
		                boolean validateBranchName = true;
						try {
							validateBranchName = Bank_Profile_Module.validateBranchName();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                ExtentTestManager.getTest().log(Status.PASS, "1. Ensure 'Branch Name' field is populated with data for the selected item" + validateBranchName);
		                ExtentTestManager.getTest().log(Status.PASS, "'Branch Name' field is filled with relevant data" + validateBranchName);
		                ExtentTestManager.endTest();
		                
		                
		                
		                //TC010
		                ExtentTestManager.startTest("TC010 - Enter Account Holder Name");
						boolean EnterAccountHolderName = bpm.EnterAccountHolderName(AccountHolderName);
						ExtentTestManager.getTest().log(Status.PASS,"Enter Account Holder Name" + EnterAccountHolderName);
						ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterAccountHolderName );
						ExtentTestManager.endTest();
						
						
						//TC011
						ExtentTestManager.startTest("TC011 - Enter Account Number");
						boolean EnterAccountNo = bpm.EnterAccountNo(AccountNumber);
						ExtentTestManager.getTest().log(Status.PASS,"Enter Account Number" + EnterAccountNo);
						ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterAccountNo );
						ExtentTestManager.endTest();
						
						
						
						//TC012
						ExtentTestManager.startTest("TC012 - Enter Re-type Account Number");
						boolean EnterReTypeAccountNo = bpm.EnterReTypeAccountNo(ReTypeAccountNumber);
						ExtentTestManager.getTest().log(Status.PASS,"Enter Re-Type Account Number" + EnterReTypeAccountNo);
						ExtentTestManager.getTest().log(Status.PASS,"Text is entered in the field without any error" +EnterReTypeAccountNo );
						ExtentTestManager.endTest();
					
						
						//TC013
						ExtentTestManager.startTest("TC013 :Upload Bank Passbook");
						//boolean Login =  MeansOfFinance_Module.login();
						boolean UploadPassBook = bpm.UploadPassBook();
						ExtentTestManager.getTest().log(Status.PASS , "Upload Passbook" + UploadPassBook);
						ExtentTestManager.endTest();
						
						
						
						//TC014
						ExtentTestManager.startTest("TC014 : Click on the Save");
						//boolean Login =  MeansOfFinance_Module.login();
						boolean ClickontheSave=bpm.ClickontheSave();
						ExtentTestManager.getTest().log(Status.PASS , "Click on the Save" + ClickontheSave);
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




		
				
				
				
				
				
				
				

				