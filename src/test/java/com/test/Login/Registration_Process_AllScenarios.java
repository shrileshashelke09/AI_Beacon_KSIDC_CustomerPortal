package com.test.Login;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Page_Login.Register_Page_Module;
import com.Utility.Log;
import com.aventstack.extentreports.ExtentTestInterruptedException;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Registration_Process_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Register_Page_Module Register_Page_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Registration");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Register_Page_Module = new Register_Page_Module();

	}

	@Test(dataProvider = "TestData4")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "RegistrationButton");
				Base_Class.SetUp();

				String MobileNumber = testdata.get("MobileNumber").toString();
				String MobileOTP = testdata.get("MobileOTP").toString();
				String EmailAddress = testdata.get("EmailAddress").toString();
				String EmailOTP = testdata.get("EmailOTP").toString();
				String CompanyPAN = testdata.get("CompanyPAN").toString();
				String ChiefPromoterFullName = testdata.get("ChiefPromoterFullName").toString();
				String Password = testdata.get("Password").toString();
				String ConfirmPassword = testdata.get("ConfirmPassword").toString();

				// TC001
				ExtentTestManager.startTest("TC001 - Verify Application Landing Page Opens");
				ExtentTestManager.getTest().log(Status.PASS,"1. Enter the URL in the browser. 2. Press the Enter key.: "+ com.BasePackage.Base_Class.Pagetitle);
				ExtentTestManager.getTest().log(Status.PASS,"Application landing page should open successfully.: "+ com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				// TC002
				
				ExtentTestManager.startTest("TC002-Verify Register Button Visibility");
				Thread.sleep(3000);
				
				boolean registerButton = driver.findElement(By.xpath("(//button[text()='Register'])[2]")).isDisplayed();

				ExtentTestManager.getTest().log(Status.PASS,
						"1. Observe the landing page. : " + registerButton);
				ExtentTestManager.getTest().log(Status.PASS, "2. Check for the presence of the 'Register' button. :" + registerButton);
				ExtentTestManager.getTest().log(Status.PASS, "'Register' button visible on the landing page. :" + registerButton);
				Log.info("Validated Registration button visibility : " + registerButton);

				// TC003
				ExtentTestManager.startTest("TC003 - Verify Register Button Clickability");

				boolean clickbutton = Register_Page_Module.ClickRegistration();

				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Register' button. : " + clickbutton);
				ExtentTestManager.getTest().log(Status.PASS, "The user should be redirected to the registration page or appropriate action should be initiated.: " + clickbutton);
				Log.info("Registration button clicked : " + clickbutton);

				// TC004
				ExtentTestManager.startTest("TC004 - Register Button Popup");
				boolean popupheadline = Register_Page_Module.PopupHeadlineMOB();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the register button. : " + popupheadline);
				ExtentTestManager.getTest().log(Status.PASS, "A popup window opens with the correct heading \"Enter Your Mobile Number\". : " + popupheadline);
				Log.info("Headline is Enter Your Mobile Number : " + popupheadline);

				// TC005
				ExtentTestManager.startTest("TC005 - Mobile Number Field Display");
				boolean Mobilenumfield = Register_Page_Module.MobileMumField();
				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the mobile number input field in the popup. : " + Mobilenumfield);
				ExtentTestManager.getTest().log(Status.PASS, "The mobile number field  displayed. : " + Mobilenumfield);
				Log.info("Mobile number field is displayed : " + Mobilenumfield);
				
				// TC006
				ExtentTestManager.startTest("TC006 - Mobile Number Field Mandatory Symbol");
				boolean AstriskMark = Register_Page_Module.AsteriskMarkVisibleMOB();
				ExtentTestManager.getTest().log(Status.PASS, "1. Verify the presence of a mandatory symbol next to the mobile number field. : " + AstriskMark);
				ExtentTestManager.getTest().log(Status.PASS, "The mandatory symbol (*) present next to the mobile number field.: " + AstriskMark);
				Log.info("Mobile number field is displayed : " + AstriskMark);

				// TC007
				ExtentTestManager.startTest("TC007 - Send Verification Code Button");
				boolean SendVerificationCode = Register_Page_Module.SendVerificationCodeMob();
				ExtentTestManager.getTest().log(Status.PASS,"1. Verify the presence of the \"Send Verification Code\" button in the popup.: " + SendVerificationCode);
				ExtentTestManager.getTest().log(Status.PASS,"The \"Send Verification Code\" button present. : " + SendVerificationCode);
				Log.info("SendVerificationCode button is displayed : " + SendVerificationCode);

				// TC008
				ExtentTestManager.startTest("TC008 - Close Button Presence");
				boolean CloseButton = Register_Page_Module.ClosebuttonvisibilityMob();
				ExtentTestManager.getTest().log(Status.PASS, "1. Verify the presence of the close button in the popup.: " + CloseButton);
				ExtentTestManager.getTest().log(Status.PASS, "The close button present.: " + CloseButton);
				Log.info("close button is displayed : " + CloseButton);
				
				// TC009
				
              ExtentTestManager.startTest(" TC009 - Empty Mobile Number Submission");                
				boolean EmptyMobNum = Register_Page_Module.EmptymobileNum();
				ExtentTestManager.getTest().log(Status.PASS,"1. Leave the mobile number field empty." + " is displayed : " + EmptyMobNum);
				ExtentTestManager.getTest().log(Status.PASS,"2. Click on the Send Verification Code button." + " is displayed : " + EmptyMobNum);
				ExtentTestManager.getTest().log(Status.PASS,"An error message should appear indicating that the field is mandatory "+" Mobile Number is required" + " is displayed : " + EmptyMobNum);				
				Log.info("Mobile Number  required error showing : " + EmptyMobNum);

				// TC010
              ExtentTestManager.startTest("TC010 - Close Popup Window");                				
				boolean Closepopup = Register_Page_Module.ClosethepopupMob();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the close button in the popup window." + " is displayed : " + Closepopup);
				ExtentTestManager.getTest().log(Status.PASS, "The popup window close." + " is displayed : " + Closepopup);
				Log.info("Close icon clicked and popup got closed : " + Closepopup);

                //TC011
				ExtentTestManager.startTest("TC011 - Mobile Number Field - Accepts 10 Digits");
				boolean EntervalidMobileNum = Register_Page_Module.ValidMobileNum(MobileNumber);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter a valid 10-digit mobile number in the field.r" + " is displayed : " + EntervalidMobileNum);
				ExtentTestManager.getTest().log(Status.PASS,
						"2. Click the \"Send Verification Code\" button." + " is displayed : " + EntervalidMobileNum);				Log.info("Entered valid Mobile Number showing : " + EntervalidMobileNum);
						ExtentTestManager.getTest().log(Status.PASS,
								"A confirmation message is displayed; code is sent to the mobile number." + " is displayed : " + EntervalidMobileNum);				Log.info("Entered valid Mobile Number showing : " + EntervalidMobileNum);

						//TC012	
								
								
				ExtentTestManager.startTest("TC012 - Invalid Code Error Guessing");
				boolean EmptyOTP = Register_Page_Module.OTPRequiredMob();
				ExtentTestManager.getTest().log(Status.PASS, "1. Leave the OTP field empty.\r\n"
						+ " 2. Click 'Verify'. : " + EmptyOTP);
				ExtentTestManager.getTest().log(Status.PASS ,"An error message is displayed \"OTP is required\".  : " + EmptyOTP);
				
								
						//TC013		
				ExtentTestManager.startTest("TC013 - Verify Error Message for Invalid Code");
				boolean InvalidOTP = Register_Page_Module.InvalidOTPMob(MobileOTP);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter an invalid 4-digit OTP code.\r\n"
						+ " 2. Click 'Verify'. : " + InvalidOTP);
				ExtentTestManager.getTest().log(Status.PASS ,"A validation error message is displayed \"Invalid OTP. You have 3 more attempt(s) left.\" : " + InvalidOTP);

							
				// Get OTP from DB

				MobileNumber = GetMobileNumberOTP(MobileNumber);
				System.out.println("Verification :" + MobileNumber);

				// TC014
				ExtentTestManager.startTest("TC014 - Verify Entering Valid 4-digit Code");
				boolean EnterOTP = Register_Page_Module.EnterOTPforMob(MobileNumber);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a valid 4-digit OTP code.\r\n"
						+ " 2. Click 'Verify'. : " + EnterOTP);
				ExtentTestManager.getTest().log(Status.PASS ,"The system accepts the 4-digit code and proceeds to the next step/popup.: " + EnterOTP);

				//TC015
				ExtentTestManager.startTest("TC015 - Verify Correct Code Navigates to Next Step");
				boolean Nextpopup = Register_Page_Module.Nextpopup();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter the correct 4-digit OTP code before expiry.\r\n"
						+ " 2. Click 'Verify'. : " + Nextpopup);
				ExtentTestManager.getTest().log(Status.PASS ,"The system navigates to the next popup.: " +Nextpopup );
				
				//TC016	
				ExtentTestManager.startTest("TC016 - Verify 'Enter email' popup heading");
				boolean Emailheadline = Register_Page_Module.Emailpopupheadline();
				ExtentTestManager.getTest().log(Status.PASS, "1. Trigger the action that opens the 'Enter email' popup.\r\n"
						+ "2. Observe the popup heading. : " + Emailheadline);
				ExtentTestManager.getTest().log(Status.PASS ,"Popup heading displays as 'Enter your email'. : " + Emailheadline);

				// TC017
				
				ExtentTestManager.startTest("TC017 - Verify email input field presence");
				boolean EmailField = Register_Page_Module.EmailField();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for the presence of an email input field in the popup. : " + EmailField);
				ExtentTestManager.getTest().log(Status.PASS,"Email input field is present. : " + EmailField);

				
				//TC018
				
				ExtentTestManager.startTest("TC018 - Leave email field empty and verify validation message");
				boolean EmptyEmail = Register_Page_Module.EmptyEmailID(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Leave the email input field empty.\r\n"
						+ "2. Click on 'Send Code'. : " + EmptyEmail);
				ExtentTestManager.getTest().log(Status.PASS,"Validation message displays: \"Email Address is required\". : " + EmptyEmail);

				//TC019
								
				ExtentTestManager.startTest("TC019 - Enter valid email and verify navigation to next popup");
				boolean ValidEmail = Register_Page_Module.ValidEmail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, " 1. Enter a valid email address (e.g., test@example.com) in the input field.\r\n"
						+ "2. Click on 'Send Code'.: " + ValidEmail);
				Log.info("Next popup opens successfully. : " + ValidEmail);

				
				
				//TC020
			
				ExtentTestManager.startTest("Verify popup window opens after sending code to email");
				boolean VerificationCodeHeadlineEmail = Register_Page_Module.VerificationCodeHeadlineEmail();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Click on \"Send Code to Email\" button\r\n"
						+ "2. Wait for popup : " + VerificationCodeHeadlineEmail);
				ExtentTestManager.getTest().log(Status.PASS,"Popup with heading 'Verification Code' appears: " + VerificationCodeHeadlineEmail);

				// TC021
				ExtentTestManager.startTest("TC021 - Verify heading 'Enter Your OTP' is correct");
				boolean OTPHeadline = Register_Page_Module.EnterOTPHeadline();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check the heading text of the popup : " + OTPHeadline);
				ExtentTestManager.getTest().log(Status.PASS,"The heading is 'Enter Your OTP': " + OTPHeadline);

				
				// TC022
				ExtentTestManager.startTest("TC022 - Verify validation message for invalid code");
				boolean InvalidOTPerrorcheck = Register_Page_Module.InvaliOTPErrorEmail(EmailOTP);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter a 4-digit invalid code\r\n"
						+ "2. Click \"Verify Code\" : " + InvalidOTPerrorcheck);
				ExtentTestManager.getTest().log(Status.PASS,"Validation message indicating the \"Invalid OTP. You have 3 more attempt(s) left\" : " + InvalidOTPerrorcheck);

				EmailAddress = GetEmailOTP(EmailAddress);
				System.out.println("Verification :" + EmailAddress);

				// TC023
				ExtentTestManager.startTest("TC023 - Verify user can enter 4-digit code");
				boolean EnterOTPforEmail = Register_Page_Module.EnterOTPforEMail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, "1. Focus on OTP input\r\n"
						+ "2. Enter 4 digits " + EnterOTPforEmail);
				ExtentTestManager.getTest().log(Status.PASS,"User is able to enter the full 4-digit code : " + EnterOTPforEmail);

			
				// TC024
				ExtentTestManager.startTest("TC024 - Verify transition to next popup on entering correct code");
				boolean SutmitOTPofEMail = Register_Page_Module.SubmitOTPofEmail();
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter valid and correct 4-digit code\r\n"
						+ "2. Click \"Verify Code\" : " + SutmitOTPofEMail);
				ExtentTestManager.getTest().log(Status.PASS ,"Transition to the next popup window confirming verification" + SutmitOTPofEMail);

				// TC025
				ExtentTestManager.startTest("TC025 - Verify Fields Presence - Chief Promoters Full Name, Company PAN");
				boolean ValidateDataFields = Register_Page_Module.testChiefPromoterFullNameFieldAndComapnyPANField();
				ExtentTestManager.getTest().log(Status.PASS, "1. Check for 'Chief Promoters Full Name' field\r\n"
						+ "2. Check for 'Company PAN' field : " + ValidateDataFields);
				ExtentTestManager.getTest().log(Status.PASS,"Both fields are present: " + ValidateDataFields);
				
			
				// TC026
				ExtentTestManager.startTest("TC026 - 'Basic Details' popup is open and fields are present");
				boolean EnterPANnoAndChiefName = Register_Page_Module.EnterPANnoAndChiefName(CompanyPAN, ChiefPromoterFullName);
				ExtentTestManager.getTest().log(Status.PASS, "Enter Valid PAN No And Chief Name :" + EnterPANnoAndChiefName);
				ExtentTestManager.getTest().log(Status.PASS,"Data Accepted without error : " + EnterPANnoAndChiefName);

			
				// TC027

				ExtentTestManager.startTest("TC027 - Verify User Can Click Submit");
				boolean ClickonContinue = Register_Page_Module.Clickonsubmit();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter all required information\r\n"
						+ "2. Click the 'Submit' button : " + ClickonContinue);
				ExtentTestManager.getTest().log(Status.PASS,"The information should be processed, and the next popup should open: " + ClickonContinue);


				// TC028
				ExtentTestManager.startTest("TC028 - Error Guessing: Empty Fields");
				boolean Errorofpassword = Register_Page_Module.ClickSubmitofpassword();
				ExtentTestManager.getTest().log(Status.PASS,
						"1.From Create password  popup screen ,Leave all fields empty\r\n"
						+ "2. Click 'Submit': " + Errorofpassword);
				ExtentTestManager.getTest().log(Status.PASS,"Password and confirm password required : " + Errorofpassword);
				
				// TC029
                ExtentTestManager.startTest("TC029 - Verify Confirm Password Field is Required");
				boolean AccountSuccessfullyCreated = Register_Page_Module.AccountSuccessfullyCreated(Password,
						ConfirmPassword);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter valid input in Password field.\r\n"
						+ "2. Enter Valid confirm password\r\n"
						+ "3. Click Continue. : "
								+ AccountSuccessfullyCreated);
				ExtentTestManager.getTest().log(Status.PASS,"Congratulations! Your account has been created successfully.: " + AccountSuccessfullyCreated);

				// App Logout

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
