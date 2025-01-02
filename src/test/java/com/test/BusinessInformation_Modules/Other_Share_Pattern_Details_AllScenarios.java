package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Other_Share_Pattern_Details_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Other_Share_Pattern_Details_AllScenarios extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Other_Share_Pattern_Details_Module Other_Share_Pattern_Details_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Other_Share_Pattern");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Other_Share_Pattern_Details_Module = new Other_Share_Pattern_Details_Module();

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
				String NoOnNonMajorShareHolders = testdata.get("NoOnNonMajorShareHolders").toString();
				String PercentageOfShareHolded = testdata.get("PercentageOfShareHolded").toString();


				// TC001
				ExtentTestManager.startTest("TC001 : Login with Valid Credentials");
				Log.info("Button visible !");
				boolean Login = Other_Share_Pattern_Details_Module.Login(EmailAddress, Password);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
				Log.info("Login successfully :" + Login);

				// TC002

				ExtentTestManager.startTest("TC002 :Navigation to 'Other Share Pattern Details'");
				boolean AccessOtherSharePatternPage = Other_Share_Pattern_Details_Module.AccessOtherSharePatternPage();
				ExtentTestManager.getTest().log(Status.PASS, "1. Complete Business Information stage.\r\n"
						+ "2. Click on the 'Other Share Pattern Details' component button." + AccessOtherSharePatternPage);
				ExtentTestManager.getTest().log(Status.PASS, "User is navigated to \"Other Share Pattern Details\" window." + AccessOtherSharePatternPage);
			
				//TC003
				
				ExtentTestManager.startTest("TC003 :Verify Window Heading'");
				boolean OtherSharePatternPageHeader = Other_Share_Pattern_Details_Module.OtheraPatternHeading();
				ExtentTestManager.getTest().log(Status.PASS, "1. Observe the heading of the window." + OtherSharePatternPageHeader);
				ExtentTestManager.getTest().log(Status.PASS, "The heading of the window is correct as per specifications." + OtherSharePatternPageHeader);
			
				//TC004
				ExtentTestManager.startTest("TC004 :Verify \"Number Of Non-Major Share Holders\" Field Presence and Input'");
				boolean EnterNoOnNonMajorShareHolders = Other_Share_Pattern_Details_Module.EnterNoOnNonMajorShareHolders(NoOnNonMajorShareHolders);
				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Number Of Non-Major Share Holders\" field is available.\r\n"
						+ "2. Enter numeric characters into the field." + EnterNoOnNonMajorShareHolders);
				ExtentTestManager.getTest().log(Status.PASS, "Field is available and accepts numeric input." + EnterNoOnNonMajorShareHolders);
			
				//TC005
				ExtentTestManager.startTest("TC005 :Verify \"Percentage Of Share Holding\" Field Presence and Input");
				boolean EnterPercentageOfShareHolded = Other_Share_Pattern_Details_Module.EnterPercentageOfShareHolded(PercentageOfShareHolded);
				ExtentTestManager.getTest().log(Status.PASS, "1. 1. Check if the \"Percentage Of Share Holding\" field is available.\r\n"
						+ "2. Enter numeric characters into the field." + EnterPercentageOfShareHolded);
				ExtentTestManager.getTest().log(Status.PASS, "Field is available and accepts numeric input." + EnterPercentageOfShareHolded);
			
				//TC006
				ExtentTestManager.startTest("TC006 :Verify Window Heading'");
				boolean CancelButtonPresence = Other_Share_Pattern_Details_Module.CancelButtonPresence();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Cancel\" button is available." + CancelButtonPresence);
				ExtentTestManager.getTest().log(Status.PASS, "\"Cancel\" button is present." + CancelButtonPresence);
			
				//TC007
				ExtentTestManager.startTest("TC007 :Verify \"Save as Draft\" Button Presence'");
				boolean SaveAsDraftButtonPresence = Other_Share_Pattern_Details_Module.SaveAsDraftButtonPresence();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save as Draft\" button is available." + SaveAsDraftButtonPresence);
				ExtentTestManager.getTest().log(Status.PASS, "\"Save as Draft\" button is present." + SaveAsDraftButtonPresence);
			
				//TC008
				
				ExtentTestManager.startTest("TC008 :Verify \"Save and Proceed \" Button Presence'");
				boolean SaveAndProceedPresence = Other_Share_Pattern_Details_Module.SaveAndProceedButtonPresence();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Save and Proceed \" button is available." + SaveAndProceedPresence);
				ExtentTestManager.getTest().log(Status.PASS, "\"Save and Proceed\" button is present." + SaveAndProceedPresence);
			
				//TC009
				
				ExtentTestManager.startTest("TC009 :Verify \"Continue \" Button Presence'");
				boolean ContinuePresence = Other_Share_Pattern_Details_Module.ContinueButtonPresence();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check if the \"Continue \" button is available." + ContinuePresence);
				ExtentTestManager.getTest().log(Status.PASS, "\"Continue\" button is present." + ContinuePresence);
			
				//TC010
				
				ExtentTestManager.startTest("TC010:Verify Save as Draft Functionality");
				boolean ClickSaveAsDraft = Other_Share_Pattern_Details_Module.ClickonSaveAsDraft();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on \"Save as Draft\" button." + ClickSaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS, "2. Observe the success message." + ClickSaveAsDraft);
				ExtentTestManager.getTest().log(Status.PASS, "Draft is saved successfully and success message is displayed." + ClickSaveAsDraft);

				//TC011
				
				ExtentTestManager.startTest("TC011:Verify Save as Draft Functionality");
				boolean ClickSaveAndProceed = Other_Share_Pattern_Details_Module.ClickonSaveAndProceed();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Save and Proceed' after saving once." + ClickSaveAndProceed);
				ExtentTestManager.getTest().log(Status.PASS, "2. Check button text." + ClickSaveAndProceed);
				ExtentTestManager.getTest().log(Status.PASS, "Button text changes to \"Update and Proceed\"." + ClickSaveAndProceed);

				//TC012
				
				ExtentTestManager.startTest("TC012:Verify Continue Button Functionality");
				boolean ClickonContinue = Other_Share_Pattern_Details_Module.ClicknonContinue();
				ExtentTestManager.getTest().log(Status.PASS, "1. Ensure data is saved." + ClickonContinue);
				ExtentTestManager.getTest().log(Status.PASS, "2. Click on the \"Continue\" button." + ClickonContinue);
				ExtentTestManager.getTest().log(Status.PASS, "User is redirected to the next component." + ClickonContinue);

				
				
				
				
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
