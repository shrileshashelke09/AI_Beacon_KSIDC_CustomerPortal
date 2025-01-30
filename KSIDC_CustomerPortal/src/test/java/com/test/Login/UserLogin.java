package com.test.Login;


import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.BasePackage.Base_Class;
import com.Page_Login.PageLoginpage;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;


public class UserLogin extends Base_Class {
	

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	PageLoginpage PageLoginpage;
	
	/*private static By userDropDown = By.xpath("//div[@id='userDropdown']/h4");
	private static By L_signout = By.xpath("//button[@class='dropdown-item ' and contains(text(),'Sign out')]");
	private static By L_username = By.xpath("//input[@id='Username']");
	private static By L_password = By.xpath("//input[@id='Password']");
	private static By L_SignIn = By.xpath("//span[contains(text(),'Sign In')]");*/
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_CP_Login");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		PageLoginpage = new PageLoginpage();
		
		

	}
	
	
	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException, ClassNotFoundException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				
				
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "Login");
				/*ExtentTestManager.getTest().log(Status.PASS,
						"Application Login " + com.BasePackage.Base_Class.Pagetitle);*/
				Log.info("Login successful !");
				Thread.sleep(3000);		
				
				//String EWCType = testdata.get("EWCType").toString();
		


				//EWC Leave Selection
				ExtentTestManager.startTest("KSIDC Login page Module");
				Base_Class.SetUp();
				Thread.sleep(3000);
			
				//boolean flag1 = PageLoginpage.clickRegisterButton(null);
				//ExtentTestManager.getTest().log(Status.PASS, "Validated Leave Request Form : " + flag1);
				//Log.info("Validated Leave Request Form : " + flag1);
				//TC02
				boolean Loginvisible=PageLoginpage.isLoginButtonVisible();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01-validate login button visible:"+Loginvisible);
				Log.info("validate login button is visible:"+Loginvisible);
			
				//TC03
				boolean flag1=PageLoginpage.Clickloginbutton();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01-Login Button Click :"+flag1);
				Log.info("validate login button click:"+flag1);
			
				//TC04
				boolean popup=PageLoginpage.isLoginpopupdisplayed();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01 :Login Popup is visible "+popup);
				Log.info("pop is visible: "+ popup);
			
				//TC05
				boolean closebutton=PageLoginpage.isclosebuttonvisible();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01-Close button Visible: "+closebutton);
				Log.info("Close button visible or not: "+closebutton);
			
				//TC06
				boolean closebuttonclick=PageLoginpage.clickclosebutton();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01-close button is clicked "+closebuttonclick);
				Log.info("close button is clicked "+closebuttonclick);
			
				//TC07
				boolean feildsvisible=PageLoginpage.isFieldsvisible();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01-Email and password Fields are visible "+feildsvisible);
				Log.info("email and password are visible "+feildsvisible);
			
				
				//clicking login button again to initiate login 
				boolean loginagain=PageLoginpage.Clickloginbutton();
				ExtentTestManager.getTest().log(Status.PASS,"validate button click:"+loginagain);
				Log.info("validate login button click:"+loginagain);
			
				//TC08
				//For the invalid email and password message validation
				boolean invalidemail=PageLoginpage.invalidemail();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01:Enter invalid email and password"+invalidemail);
				Log.info("enter invalid email and password "+invalidemail);
			
				
				boolean insidelogin=PageLoginpage.insideloginclick();
				ExtentTestManager.getTest().log(Status.PASS,"Step:02:click on the insidelogin"+insidelogin);
				Log.info("inside login click "+insidelogin);
			
				boolean invalidmessage=PageLoginpage.invalidmessage();
				ExtentTestManager.getTest().log(Status.PASS,"Step:03: validate the error message"+invalidmessage);
				Log.info("validate error message "+invalidmessage);
			
				//TC09
				//Password Masking
				boolean masking=PageLoginpage.passwordmasking();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01:password masked "+masking);
				Log.info("password masked "+masking);
			
				//TC10
				boolean eyeview=PageLoginpage.eyeviewclick();
				ExtentTestManager.getTest().log(Status.PASS,"Step:01:eye view clicked "+eyeview);
				Log.info("eyeview clicked "+eyeview);
			
				//Blank email and password validation
				boolean closebuttonclick2=PageLoginpage.clickclosebutton();
				ExtentTestManager.getTest().log(Status.PASS,"close button is clicked"+closebuttonclick2);
				Log.info("close button is clicked "+closebuttonclick2);
			
				boolean flag2=PageLoginpage.Clickloginbutton();
				ExtentTestManager.getTest().log(Status.PASS,"validate button click:"+flag2);
				Log.info("validate login button click:"+flag2);
			
				boolean insidelogin2=PageLoginpage.insideloginclick();
				ExtentTestManager.getTest().log(Status.PASS,"click on the insidelogin"+insidelogin2);
				Log.info("inside login click "+insidelogin2);
				
				boolean validation=PageLoginpage.validationmessage();
				ExtentTestManager.getTest().log(Status.PASS,"validation message displayed"+validation);
				Log.info("validation messages displayed "+validation);
				
				//Remember me checkbox
				boolean rememberme=PageLoginpage.rememberme();
				ExtentTestManager.getTest().log(Status.PASS,"Remember me displayed"+rememberme);
				Log.info("Remember me displayed "+rememberme);
				
				//Check login button visible
				boolean LoginBtnvisible=PageLoginpage.isLoginButtonVisible();
				ExtentTestManager.getTest().log(Status.PASS,"validate login button visible:"+LoginBtnvisible);
				Log.info("validate login button is visible:"+LoginBtnvisible); 
				
				//Login with valid Emailid and Password
				boolean login=PageLoginpage.LoginwithvalidEmailandPwrod();
				ExtentTestManager.getTest().log(Status.PASS,"Login successfully with valid Email and Password:"+login);
				Log.info("Login Successfully with valid Email and Password :"+login);
				
				//Logout User
				boolean LogoutUser=PageLoginpage.UserSignOut();
				ExtentTestManager.getTest().log(Status.PASS,"Logout User :"+LogoutUser);
				Log.info("Logout User "+LogoutUser);
				
								
				//Check LOGIN WITH OTP button present
				boolean isLoginwithOTPButtonVisible=PageLoginpage.isLoginwithOTPButtonVisible();
				ExtentTestManager.getTest().log(Status.PASS," login With OTP button visible:"+isLoginwithOTPButtonVisible);
				Log.info("validate login with OTP button is visible:"+isLoginwithOTPButtonVisible);
				
				//Click LOGIN WITH OTP button
				
				boolean LoginwithOTPButtonClick=PageLoginpage.LoginwithOTPButtonClick();
				ExtentTestManager.getTest().log(Status.PASS," login With OTP button Clicked:"+LoginwithOTPButtonClick);
				Log.info("login With OTP button Clicked:"+LoginwithOTPButtonClick);
				
				//Enter Email Address
				boolean EnterEmailAddress=PageLoginpage.EnterEmailAddress();
				ExtentTestManager.getTest().log(Status.PASS," Email Address Entered:"+EnterEmailAddress);
				Log.info("Email Address Entered:"+EnterEmailAddress);
				
				//Click on Send Verification Code
				//Enter Email Address
				boolean ClickSendVerifcationCodeBtn=PageLoginpage.ClickSendVerifcationCode();
				ExtentTestManager.getTest().log(Status.PASS," Email Address Entered:"+ClickSendVerifcationCodeBtn);
				Log.info("Email Address Entered:"+ClickSendVerifcationCodeBtn);
				
				//Enter OTP
				boolean EnterEmailOTP=PageLoginpage.EnterEmailOTPForLogin();
				ExtentTestManager.getTest().log(Status.PASS," Email Address Entered:"+EnterEmailOTP);
				Log.info("Email Address Entered:"+EnterEmailOTP);
				
				//Click on Verify Button
				boolean VerifyCode=PageLoginpage.ClickOnVerificationBtn();
				ExtentTestManager.getTest().log(Status.PASS," Email Address Entered:"+VerifyCode);
				Log.info("Email Address Entered:"+VerifyCode);
				
				
				
				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
				
			
			}
			
			}catch (AssertionError e) {
				System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
	
	}
	
	
		}
	
	@DataProvider(name = "TestData")
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

