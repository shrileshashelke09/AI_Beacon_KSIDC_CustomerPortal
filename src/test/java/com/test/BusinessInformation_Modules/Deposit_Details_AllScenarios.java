package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Deposit_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Deposit_Details_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Deposit_Details_Module Deposit_Details_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Deposit");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Deposit_Details_Module = new Deposit_Details_Module();

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

					String DepositAmount = testdata.get("DepositAmount").toString();
					
	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Deposit_Details_Module");
					Log.info("Button visible !");
					boolean Login = Deposit_Details_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Deposit_Details_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Deposit' Presence");
					boolean VerifyDepositDetailsComponent = Deposit_Details_Module.VerifyDepositDetailsComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Deposit' component is visible on the page" + VerifyDepositDetailsComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Deposit' component is present" + VerifyDepositDetailsComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Deposit' Component Page Opens");
					boolean AccessDepositDetailsComponent = Deposit_Details_Module.AccessDepositDetailsComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Deposit' component" + AccessDepositDetailsComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Deposit' page opens successfully" + AccessDepositDetailsComponent);
					
					//TC005
							
								
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Deposit Details'");
					boolean VerifyDepositComponentHeader = Deposit_Details_Module.VerifyDepositComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyDepositComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Deposit' is present" + VerifyDepositComponentHeader);
							
					
					//TC006
					
					ExtentTestManager.startTest("TC006 : Verify specific text availability");
					boolean VerifyStageHeading = Deposit_Details_Module.VerifyStageHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyStageHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyStageHeading);
					
					//TC007
					
					ExtentTestManager.startTest("TC007 : Informative Message on Utilities Page");
					boolean VerifyInformativeMessage = Deposit_Details_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyInformativeMessage);
					
					//TC008
					ExtentTestManager.startTest("TC008 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Deposit_Details_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify Navigation to 'Utilities Development' on Skipping");
					boolean ClickSkipforNowPresence = Deposit_Details_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Utilities Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Deposit_Details_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC011
					
					ExtentTestManager.startTest("TC011 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Deposit_Details_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Utilities\" window." + ClickAddDetailsbutton);
	
					//TC012
					
					ExtentTestManager.startTest("TC012 - Verify Field Types for Deposit Type");
					boolean SelectDepositType = Deposit_Details_Module.SelectDepositType();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Deposit Typ\" dropdown" + SelectDepositType);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectDepositType);

					//TC013
					
					ExtentTestManager.startTest("TC013 - Diposit Amount Field - Numeric Input");
					boolean EnterDepositAmount = Deposit_Details_Module.EnterDepositAmount(DepositAmount);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Deposit Amount\" field" + EnterDepositAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterDepositAmount);
				
	
					//TC014
    				
    				ExtentTestManager.startTest("TC014 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Deposit_Details_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC015
    				
    				ExtentTestManager.startTest("TC015 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Deposit_Details_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

   		    			
    				//TC016
    				
    				ExtentTestManager.startTest("TC016 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Deposit_Details_Module.clicktocontinue();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + clicktocontinue);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + clicktocontinue);
    			
    				
    				
    				
					
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



					
					
	



