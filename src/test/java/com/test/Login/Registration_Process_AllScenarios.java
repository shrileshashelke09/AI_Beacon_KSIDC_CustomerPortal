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
				// String VerificationCode = testdata.get("VerificationCode").toString();
				String EmailAddress = testdata.get("EmailAddress").toString();
				String CompanyPAN = testdata.get("CompanyPAN").toString();
				String ChiefPromoterFullName = testdata.get("ChiefPromoterFullName").toString();
				String Password = testdata.get("Password").toString();
				String ConfirmPassword = testdata.get("ConfirmPassword").toString();

				// TC001
				ExtentTestManager.startTest("Verify Application Landing Page Opens");
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter the URL in the browser. 2. Press the Enter key.: "
								+ com.BasePackage.Base_Class.Pagetitle);
				ExtentTestManager.getTest().log(Status.PASS,
						"Application landing page should open successfully.: "
								+ com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);
				
				// TC003
				
				ExtentTestManager.startTest("Verify Register Button Visibility");
				Thread.sleep(3000);
				
				boolean registerButton = driver.findElement(By.xpath("(//button[text()='Register'])[2]")).isDisplayed();

				ExtentTestManager.getTest().log(Status.PASS,
						"1. Observe the landing page. : " + registerButton);
				ExtentTestManager.getTest().log(Status.PASS, "2. Check for the presence of the 'Register' button. :" + registerButton);
				ExtentTestManager.getTest().log(Status.PASS, "'Register' button visible on the landing page. :" + registerButton);
				Log.info("Validated Registration button visibility : " + registerButton);

				// TC004
				ExtentTestManager.startTest("Verify Register Button Clickability");

				boolean clickbutton = Register_Page_Module.ClickRegistration();

				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Register' button. : " + clickbutton);
				ExtentTestManager.getTest().log(Status.PASS, "The user should be redirected to the registration page or appropriate action should be initiated.: " + clickbutton);
				Log.info("Registration button clicked : " + clickbutton);

				// TC012
				ExtentTestManager.startTest("Register Button Popup");
				boolean popupheadline = Register_Page_Module.PopupHeadlineMOB();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the register button. : " + popupheadline);
				ExtentTestManager.getTest().log(Status.PASS, "A popup window opens with the correct heading \"Enter Your Mobile Number\". : " + popupheadline);
				Log.info("Headline is Enter Your Mobile Number : " + popupheadline);

				// TC014
				ExtentTestManager.startTest("Mobile Number Field Display");
				boolean Mobilenumfield = Register_Page_Module.MobileMumField();
				ExtentTestManager.getTest().log(Status.PASS, "1. Look for the mobile number input field in the popup. : " + Mobilenumfield);
				ExtentTestManager.getTest().log(Status.PASS, "The mobile number field  displayed. : " + Mobilenumfield);
				Log.info("Mobile number field is displayed : " + Mobilenumfield);
				
				// TC015
				ExtentTestManager.startTest("Mobile Number Field Mandatory Symbol");
				boolean AstriskMark = Register_Page_Module.AsteriskMarkVisibleMOB();
				ExtentTestManager.getTest().log(Status.PASS, "1. Verify the presence of a mandatory symbol next to the mobile number field. : " + AstriskMark);
				ExtentTestManager.getTest().log(Status.PASS, "The mandatory symbol (*) present next to the mobile number field.: " + AstriskMark);
				Log.info("Mobile number field is displayed : " + AstriskMark);

				// TC016
				ExtentTestManager.startTest("Send Verification Code Button");
				boolean SendVerificationCode = Register_Page_Module.SendVerificationCodeMob();
				ExtentTestManager.getTest().log(Status.PASS,"1. Verify the presence of the \"Send Verification Code\" button in the popup.: " + SendVerificationCode);
				ExtentTestManager.getTest().log(Status.PASS,"The \"Send Verification Code\" button present. : " + SendVerificationCode);
				Log.info("SendVerificationCode button is displayed : " + SendVerificationCode);

				// TC017
				ExtentTestManager.startTest("Close Button Presence");
				boolean CloseButton = Register_Page_Module.ClosebuttonvisibilityMob();
				ExtentTestManager.getTest().log(Status.PASS, "1. Verify the presence of the close button in the popup.: " + CloseButton);
				ExtentTestManager.getTest().log(Status.PASS, "The close button present.: " + CloseButton);
				Log.info("close button is displayed : " + CloseButton);
				
				// TC019 & TC025
				
//               ExtentTestManager.startTest("Mobile Number Field - ECP Validations");
//				boolean InvalidMobilenum = Register_Page_Module.InvalidMobNum(MobileNumber);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid Mobile Number" + " is displayed : " + InvalidMobilenum);
//				ExtentTestManager.getTest().log(Status.PASS,
//				"Numeric inputs are allowed. Other inputs prompt error messages." + " is displayed : " + InvalidMobilenum);               
//				Log.info("Invalid Mobile Number error showing : " + InvalidMobilenum);

				// TC020
				
//              ExtentTestManager.startTest("Empty Mobile Number Submission");                
//				boolean EmptyMobNum = Register_Page_Module.EmptymobileNum();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"1. Leave the mobile number field empty." + " is displayed : " + EmptyMobNum);
//				ExtentTestManager.getTest().log(Status.PASS,
//				"2. Click on the "Send Verification Code" button." + " is displayed : " + EmptyMobNum);
//				ExtentTestManager.getTest().log(Status.PASS,
//				"An error message should appear indicating that the field is mandatory "Mobile Number is required"" + " is displayed : " + EmptyMobNum);				
//				Log.info("Mobile Number  required error showing : " + EmptyMobNum);

				// TC023
//              ExtentTestManager.startTest("Close Popup Window");                				
//				boolean Closepopup = Register_Page_Module.ClosethepopupMob();
//				ExtentTestManager.getTest().log(Status.PASS, "1. Click on the close button in the popup window." + " is displayed : " + Closepopup);
//				ExtentTestManager.getTest().log(Status.PASS, "The popup window close." + " is displayed : " + Closepopup);
//				Log.info("Close icon clicked and popup got closed : " + Closepopup);

//TC024
				ExtentTestManager.startTest("Mobile Number Field - Accepts 10 Digits");
				boolean EntervalidMobileNum = Register_Page_Module.ValidMobileNum(MobileNumber);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter a valid 10-digit mobile number in the field.r" + " is displayed : " + EntervalidMobileNum);
				ExtentTestManager.getTest().log(Status.PASS,
						"2. Click the \"Send Verification Code\" button." + " is displayed : " + EntervalidMobileNum);				Log.info("Entered valid Mobile Number showing : " + EntervalidMobileNum);
						ExtentTestManager.getTest().log(Status.PASS,
								"A confirmation message is displayed; code is sent to the mobile number." + " is displayed : " + EntervalidMobileNum);				Log.info("Entered valid Mobile Number showing : " + EntervalidMobileNum);

								
				boolean SendOTPButton = Register_Page_Module.ClicktosendOTPforMob();
				ExtentTestManager.getTest().log(Status.PASS,
						"Send Verification Button clicked" + " is displayed : " + SendOTPButton);
				Log.info("A confirmation message is displayed; code is sent to the mobile number.  : " + SendOTPButton);

				// Get OTP from DB

				MobileNumber = GetMobileNumberOTP(MobileNumber);
				System.out.println("Verification :" + MobileNumber);

				// TC029
				ExtentTestManager.startTest("Verify Entering Valid 4-digit Code");
				boolean EnterOTP = Register_Page_Module.EnterOTPforMob(MobileNumber);
				ExtentTestManager.getTest().log(Status.PASS, "OTP Entered" + " is displayed : " + EnterOTP);
				Log.info("OTP Entered  : " + EnterOTP);

				// TC030
//				ExtentTestManager.startTest("Verify Error Message for Invalid Code");
//				boolean InvalidOTP = Register_Page_Module.InvalidOTPMob(VerificationCode);
//				ExtentTestManager.getTest().log(Status.PASS, "Button clicked" + " is displayed : " + InvalidOTP);
//				Log.info("Button Clicked  : " + InvalidOTP);

				// TC030
//				ExtentTestManager.startTest("Verify Error Message for Invalid Code");
//				boolean InvalidOTPError = Register_Page_Module.InvalidOTPerrorMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid OTP. You have 3 more attempt(s) left." + " is displayed : " + InvalidOTPError);
//				Log.info("Invalid OTP. You have 3 more attempt(s) left. : " + InvalidOTPError);

				// TC031
//				ExtentTestManager.startTest("Verify Expiry of OTP Code");
//				boolean OTPExpitederror = Register_Page_Module.OTPExpiredMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"OTP has expired.Please re-send" + " is displayed : " + OTPExpitederror);
//				Log.info("OTP has expired.Please re-send  : " + OTPExpitederror);

				// TC033
//				ExtentTestManager.startTest("Invalid Code Boundary Value Analysis");
//				boolean WarningforOTP = Register_Page_Module.WarningOTPMob();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid OTP. You have 3 more attempt(s) left" + " is displayed : " + WarningforOTP);
//				Log.info("Invalid OTP. You have 3 more attempt(s) left  : " + WarningforOTP);

				// TC034
//				ExtentTestManager.startTest("Invalid Code Error Guessing");
//				boolean EmptyOTP = Register_Page_Module.EmptyOTPMob(VerificationCode);
//				ExtentTestManager.getTest().log(Status.PASS, "OTP Empty" + " is displayed : " + EmptyOTP);
//				Log.info("OTP Empty  : " + EmptyOTP);

//				ExtentTestManager.startTest("Invalid Code Error Guessing");				
//				boolean OTPRequired = Register_Page_Module.OTPRequiredMob();
//				ExtentTestManager.getTest().log(Status.PASS, "OTP Required" + " is displayed : " + OTPRequired);
//				Log.info("OTP Required  : " + OTPRequired);


				ExtentTestManager.startTest("Verify button clicking");								
				boolean VerifyCode = Register_Page_Module.VerifyOTPButton();
				ExtentTestManager.getTest().log(Status.PASS, "Button clicked" + " is displayed : " + VerifyCode);
				Log.info("Button Clicked  : " + VerifyCode);

				// TC032 & TC035 & TC036
				ExtentTestManager.startTest("Verify Correct Code Navigates to Next Step & Verify 'Enter email' popup heading");
				boolean Emailheadline = Register_Page_Module.Emailpopupheadline();
				ExtentTestManager.getTest().log(Status.PASS, "Email headline" + " is displayed : " + Emailheadline);
				Log.info("Enter Your Email is displayed; code is sent to the mobile number.  : " + Emailheadline);

				// TC037
				
				ExtentTestManager.startTest("Verify email input field presence");
				boolean EmailField = Register_Page_Module.EmailField();
				ExtentTestManager.getTest().log(Status.PASS, "Email Field" + " is displayed : " + EmailField);
				Log.info("Email field is displayed : " + EmailField);

				ExtentTestManager.startTest("Verify email input ");
				boolean ValidEmail = Register_Page_Module.ValidEmail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, " Valid Email " + " is displayed : " + ValidEmail);
				Log.info("Entered Email is displayed : " + ValidEmail);

				// TC039
//				ExtentTestManager.startTest("Enter invalid email and verify validation message");
//				boolean InvalidEmailID = Register_Page_Module.InvalidEmail(EmailAddress);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Invalid Email Entered" + " is displayed : " + InvalidEmailID);
//				Log.info("Provide a valid email address displayed : " + InvalidEmailID);

				// TC040
//				ExtentTestManager.startTest("Leave email field empty and verify validation message");
//				boolean EmptyEmail = Register_Page_Module.EmptyEmailID(EmailAddress);
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Email Address Required" + " is displayed : " + EmptyEmail);
//				Log.info("Email Address required : " + EmptyEmail);

				// TC043
//				ExtentTestManager.startTest("Verify 'Enter email' popup can be closed");
//				boolean closeEmailPopup = Register_Page_Module.closeemailpopup();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"Email pop up closed" + " is displayed : " + closeEmailPopup);
//				Log.info("Email pop up closed : " + closeEmailPopup);

				ExtentTestManager.startTest("Verify popup window opens after sending code to email");
				boolean SendOTPforEmail = Register_Page_Module.ClicktosendOTPforEmail();
				ExtentTestManager.getTest().log(Status.PASS,
						"send OTP button clicked" + " is displayed : " + SendOTPforEmail);
				Log.info("send OTP button clicked : " + SendOTPforEmail);

				// TC044
				ExtentTestManager.startTest("Verify popup window opens after sending code to email");
				boolean VerificationCodeHeadlineEmail = Register_Page_Module.VerificationCodeHeadlineEmail();
				ExtentTestManager.getTest().log(Status.PASS,
						"Popup with heading 'Verification Code' appears " + " is displayed : " + VerificationCodeHeadlineEmail);
				Log.info("Verificaion Code headline is showing : " + VerificationCodeHeadlineEmail);

				// TC045
				ExtentTestManager.startTest("Verify heading 'Enter Your OTP' is correct");
				boolean OTPHeadline = Register_Page_Module.EnterOTPHeadline();
				ExtentTestManager.getTest().log(Status.PASS, "Enter Your OTP" + " is displayed : " + OTPHeadline);
				Log.info("Enter Your OTP is showing : " + OTPHeadline);

				EmailAddress = GetEmailOTP(EmailAddress);
				System.out.println("Verification :" + EmailAddress);

				// TC046
				ExtentTestManager.startTest("Verify user can enter 4-digit code");
				boolean EnterOTPforEmail = Register_Page_Module.EnterOTPforEMail(EmailAddress);
				ExtentTestManager.getTest().log(Status.PASS, "User is able to enter the full 4-digit code" + " is displayed : " + EnterOTPforEmail);
				Log.info("Entered OTP is showing : " + EnterOTPforEmail);

				// TC047
//				ExtentTestManager.startTest("Verify validation message for invalid code");
//				boolean InvalidOTPerrorcheck = Register_Page_Module.InvalidOTPerrorMob();
//				ExtentTestManager.getTest().log(Status.PASS, "Validation message indicating the "Invalid OTP. You have 3 more attempt(s) left"" + " is displayed : " + InvalidOTPerrorcheck);
//				Log.info("Invalid OTP  : " + InvalidOTPerrorcheck);

				// TC048
//				ExtentTestManager.startTest("Verify validation message for expired code");				
//				boolean ExpiredOTPError = Register_Page_Module.ExpiredOTPErrorEmail();
//				ExtentTestManager.getTest().log(Status.PASS,
//						"OTP has expired.Please re-send" + " is displayed : " + ExpiredOTPError);
//				Log.info("OTP has expired.Please re-send : " + ExpiredOTPError);

				// TC049
				ExtentTestManager.startTest("Verify transition to next popup on entering correct code");
				boolean SutmitOTPofEMail = Register_Page_Module.SubmitOTPofEmail();
				ExtentTestManager.getTest().log(Status.PASS, "OTP submitted" + " is displayed : " + SutmitOTPofEMail);
				ExtentTestManager.getTest().log(Status.PASS ,"Transition to the next popup window confirming verification" + SutmitOTPofEMail);
				Log.info("submitted OTP is showing : " + SutmitOTPofEMail);

				// TC050
				ExtentTestManager.startTest("Verify Fields Presence - Chief Promoters Full Name");
				boolean ValidateDataFields = Register_Page_Module.testChiefPromoterFullNameFieldPresence();
				ExtentTestManager.getTest().log(Status.PASS, "Field " + " is displayed : " + ValidateDataFields);
				Log.info("Field is showing : " + ValidateDataFields);
				
				ExtentTestManager.startTest("Verify Fields Presence - Company PAN");
				boolean ValidateDataFieldsPAN = Register_Page_Module.testCompanyPANFieldPresence();
				ExtentTestManager.getTest().log(Status.PASS, "PAN Field " + " is displayed : " + ValidateDataFieldsPAN);
				Log.info("PAN Field is showing : " + ValidateDataFieldsPAN);

				// TC051
				ExtentTestManager.startTest("Verify Successful Entry of Company PAN");
				boolean EnterPANno = Register_Page_Module.EnterPANno(CompanyPAN);
				ExtentTestManager.getTest().log(Status.PASS, "PAN No " + " is displayed : " + EnterPANno);
				Log.info("Entered PAN No is showing : " + EnterPANno);

				boolean ClickOutside = Register_Page_Module.ClickOutside();
				ExtentTestManager.getTest().log(Status.PASS, "Clicked outside " + " is displayed : " + ClickOutside);
				Log.info("Clicked outside : " + ClickOutside);

				ExtentTestManager.startTest("Verify Successful Entry of Chief promoter name");
				boolean EnterChiefname = Register_Page_Module.EnterChiefname(ChiefPromoterFullName);
				ExtentTestManager.getTest().log(Status.PASS, "Chief name " + " is displayed : " + EnterChiefname);
				Log.info("Chief name is showing : " + EnterChiefname);

				// TC052

				ExtentTestManager.startTest("Verify User Can Click Submit");
				boolean ClickonContinue = Register_Page_Module.Clickonsubmit();
				ExtentTestManager.getTest().log(Status.PASS,
						"Click on continue" + " is displayed : " + ClickonContinue);

				// TC053
				ExtentTestManager.startTest("Error Guessing: Empty Fields");
				boolean Errorofpassword = Register_Page_Module.ClickSubmitofpassword();
				ExtentTestManager.getTest().log(Status.PASS,
						"Password and confirm password required " + " is displayed : " + Errorofpassword);
				Log.info("Password and confirm password required : " + Errorofpassword);

				// TC055
	//			ExtentTestManager.startTest("Password Specification Compliance");
//				boolean Passwordnotmeetingcriteria = Register_Page_Module.Passwordcriteriawrong(Password ,ConfirmPassword );
//				ExtentTestManager.getTest().log(Status.PASS, "Password does not meet policy requirements " + " is displayed : " + Passwordnotmeetingcriteria);
//				Log.info("Password does not meet policy requirements : " + Passwordnotmeetingcriteria);
//				
				// TC057
                ExtentTestManager.startTest("Verify Confirm Password Field is Required");
				boolean AccountSuccessfullyCreated = Register_Page_Module.AccountSuccessfullyCreated(Password,
						ConfirmPassword);
				ExtentTestManager.getTest().log(Status.PASS,
						"Congratulations! Your account has been created successfully. " + " is displayed : "
								+ AccountSuccessfullyCreated);
				Log.info("Congratulations! Your account has been created successfully.: " + AccountSuccessfullyCreated);

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
