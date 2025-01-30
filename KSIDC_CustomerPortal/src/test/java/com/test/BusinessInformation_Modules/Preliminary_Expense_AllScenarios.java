package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Preliminary_Expense_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Preliminary_Expense_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Preliminary_Expense_Module Preliminary_Expense_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Preliminary_Expense");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Preliminary_Expense_Module = new Preliminary_Expense_Module();

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

					String ExpenseAmount = testdata.get("ExpenseAmount").toString();
					
	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Preliminary_Expense_Module");
					Log.info("Button visible !");
					boolean Login = Preliminary_Expense_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Navigate to \"Project cost breakup and means of finance finalization\"");
					boolean NavigatetoProjectCost = Preliminary_Expense_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the appropriate section" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to \"Project cost breakup and means of finance finalization\" stage" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify Component 'Preliminary Expenses' Presence");
					boolean VerifyPreliminaryExpensesComponent = Preliminary_Expense_Module.VerifyPreliminaryExpensesComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify if 'Preliminary Expenses' component is visible on the page" + VerifyPreliminaryExpensesComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Preliminary Expenses' component is present" + VerifyPreliminaryExpensesComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify 'Preliminary Expenses' Component Page Opens");
					boolean AccessPreliminaryExpensesComponent = Preliminary_Expense_Module.AccessPreliminaryExpensesComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Preliminary Expenses' component" + AccessPreliminaryExpensesComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Preliminary Expenses' page opens successfully" + AccessPreliminaryExpensesComponent);
					
					//TC005
							
								
					ExtentTestManager.startTest("TC005 : Verify Correct Heading 'Preliminary Expenses'");
					boolean VerifyPreliminaryExpensesComponentHeader = Preliminary_Expense_Module.VerifyPreliminaryExpensesComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Verify the page heading" + VerifyPreliminaryExpensesComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading 'Preliminary Expenses' is present" + VerifyPreliminaryExpensesComponentHeader);
							
					
					//TC006
										
					ExtentTestManager.startTest("TC006 : Text Availability Verification");
					boolean VerifyInformativeMessage = Preliminary_Expense_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Search for the text \"Begin your journey! Click 'Add Details' to add the details of each one\"." + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Text is present." + VerifyInformativeMessage);
					
					//TC007
					ExtentTestManager.startTest("TC007 - Verify 'Skip this for now' Option Availability");
					boolean SkipforNowPresence = Preliminary_Expense_Module.SkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Skip this for Now\" button." + SkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Skip this for Now\" button is visible." + SkipforNowPresence);
	
					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify Navigation to 'Utilities Development' on Skipping");
					boolean ClickSkipforNowPresence = Preliminary_Expense_Module.ClickSkipforNowPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Skip this for Now\" button." + ClickSkipforNowPresence);
					ExtentTestManager.getTest().log(Status.PASS, "Navigation to 'Utilities Development' stage is successful" + ClickSkipforNowPresence);
	

					//TC009
					
					ExtentTestManager.startTest("TC009 - Verify \"Add Details\" Button Availability");
					boolean AddDetailsbuttonPresence = Preliminary_Expense_Module.AddDetailsbuttonPresence();
					ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Add Details\" button." + AddDetailsbuttonPresence);
					ExtentTestManager.getTest().log(Status.PASS, "\"Add Details\" button is visible." + AddDetailsbuttonPresence);
	
					
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify \"Add Details\" Button Functionality");
					boolean ClickAddDetailsbutton = Preliminary_Expense_Module.ClickAddDetailsbutton();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click the \"Add Details\" button." + ClickAddDetailsbutton);
					ExtentTestManager.getTest().log(Status.PASS, "User navigates to the \"Utilities\" window." + ClickAddDetailsbutton);
	
					//TC012
					
					ExtentTestManager.startTest("TC012 - Verify Field Types for Deposit Type");
					boolean SelectDepositType = Preliminary_Expense_Module.SelectDepositType();
					ExtentTestManager.getTest().log(Status.PASS, "1. Select a value from the \"Deposit Typ\" dropdown" + SelectDepositType);
					ExtentTestManager.getTest().log(Status.PASS, "Value is selected successfully" + SelectDepositType);

					//TC013
					
					ExtentTestManager.startTest("TC013 - Expense Amount Field - Numeric Input");
					boolean EnterExpenseAmount = Preliminary_Expense_Module.EnterExpenseAmount(ExpenseAmount);
					ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in \"Expense Amount\" field" + EnterExpenseAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Value is accepted" + EnterExpenseAmount);
				
	
					//TC014
					
					ExtentTestManager.startTest("TC014 :Verify Window Heading'");
    				boolean CancelButtonPresence = Preliminary_Expense_Module.CancelButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
    			
    				//TC015
    				ExtentTestManager.startTest("TC015 :Verify \"Save as Draft\" Button Presence'");
    				boolean SaveAsDraftButtonPresence = Preliminary_Expense_Module.SaveAsDraftButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
    			
    				//TC016
    				
    				ExtentTestManager.startTest("TC016 :Verify \"Save and Proceed \" Button Presence'");
    				boolean SaveAndProceedPresence = Preliminary_Expense_Module.SaveAndProceedButtonPresence();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
    			
    				//TC017
    				ExtentTestManager.startTest("TC017 :Verify Save as Draft Functionality");
    				boolean ClickSaveAsDraft = Preliminary_Expense_Module.ClickonSaveAsDraft();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);


    				//TC018
    				
    				ExtentTestManager.startTest("TC018 :Test \"Update and Proceed\" Button Functionality");
    				boolean UpdateAndProceed = Preliminary_Expense_Module.UpdateAndProceed();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Update and Proceed\" button." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + UpdateAndProceed);
    				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + UpdateAndProceed);

   		    		//TC019
    				ExtentTestManager.startTest("TC019 :Verify Data Display in Main Window");
    				boolean DatainGrid = Preliminary_Expense_Module.DatainGrid();
    				ExtentTestManager.getTest().log(Status.PASS, "Check the grid for entries." + DatainGrid);
    				ExtentTestManager.getTest().log(Status.PASS, "Data is displayed correctly in the grid." + DatainGrid);
    			
    				//Tc020
    				
    				ExtentTestManager.startTest("TC020 :Verify \"Continue\" Button Availability");
    				boolean ValidateContinuebutton = Preliminary_Expense_Module.ValidateContinuebutton();
    				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the \"Continue\" button." + ValidateContinuebutton);
    				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is visible." + ValidateContinuebutton);
    			
    				//TC021
    				
    				ExtentTestManager.startTest("TC021 :Test \"Continue\" Button Functionality");
    				boolean clicktocontinue = Preliminary_Expense_Module.clicktocontinue();
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



					
					
	



