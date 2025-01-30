package com.Page_Login;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.BasePackage.Base_Class;
import com.Page_Repositary.PageRepository_Login;
import com.extentReports.ExtentTestManager;

public class PageLoginpage extends Base_Class{
	
	PageRepository_Login LoginPageRepositary = new PageRepository_Login();
	public WebDriver drive;;
	

		
	/*public boolean NavigateToLoginScreen() throws InterruptedException, IOException
	{
		
		
		System.out.println("Inside Method");
		click(LoginPageRepositary.loginbutn);
		//click(loginbutn);
		return true;
		
	}
	
	public boolean EnterUserName () {
		
		
		
		return true;
		
	}*/
	
	public boolean isLoginButtonVisible() {
		ExtentTestManager.startTest("TC:02 - Verify Login Button Present");
		ElementDisplayed(LoginPageRepositary.loginButton);
		return true;
	}
	public boolean Clickloginbutton() throws InterruptedException{
		ExtentTestManager.startTest("TC:03 - Click login button");
		click(LoginPageRepositary.loginButton);
		Thread.sleep(1000);
		return true;
	}
	public boolean isLoginpopupdisplayed() {
		ExtentTestManager.startTest("TC:04 - Login popup Display checking");
		ElementDisplayed(LoginPageRepositary.Popup);
		return true;
	}
	public boolean isclosebuttonvisible() {
		ExtentTestManager.startTest("TC:05 -Login popup Close button vivibility Checking");
		ElementDisplayed(LoginPageRepositary.Closebutton);
		return true;
	}
	public boolean clickclosebutton() throws InterruptedException {
		ExtentTestManager.startTest("TC:06 -Close button Functionality checking");
		click(LoginPageRepositary.Closebutton);
		Thread.sleep(1000);
		return true;
	}
	public boolean isFieldsvisible() {
		ExtentTestManager.startTest("TC:07 -Email Address and Password field visibility Checking");
		ElementDisplayed(LoginPageRepositary.emailaddress);
		ElementDisplayed(LoginPageRepositary.password);
		return true;
	}
    //password and email id invalid entry message validation   
	public boolean invalidemail() throws InterruptedException {
		ExtentTestManager.startTest("TC:08 -Email Address Validation");
		input(LoginPageRepositary.emailaddress, "abcf");
    	input(LoginPageRepositary.password,"ssss");
    	 return true;		 
      
         }
    public boolean insideloginclick() throws InterruptedException {
        	 click(LoginPageRepositary.insidelogin);
        	 return true;
         }
    public boolean invalidmessage() {
        	ElementDisplayed(LoginPageRepositary.invalidmessage);
        	return true;
         }
         
         //password masking
    public boolean passwordmasking() {
    	
    	ExtentTestManager.startTest("TC:09 -Password Masking Checking");
    	WebElement masking=driver.findElement(LoginPageRepositary.password);
   	 	String typeAttribute = masking.getAttribute("type");
        return "password".equals(typeAttribute);
        	 
         }
         //eyeview button
         
    public boolean eyeviewclick() throws InterruptedException {
    	ExtentTestManager.startTest("TC:10 -Eye Icon Functionality Checking");
    	click(LoginPageRepositary.eyeicon);
   	    return true;
    	
        	 
         }
         //login without email and pass
    public boolean nocredentiallogin() throws InterruptedException {
        	 click(LoginPageRepositary.insidelogin);
        	 return true;
        	 
         }
    public boolean validationmessage() {
        	 ElementDisplayed(LoginPageRepositary.emailrequired);
        	 ElementDisplayed(LoginPageRepositary.passwordrequired);
        	 return true;
        	 
         }
     public boolean rememberme() {
        	 ElementDisplayed(LoginPageRepositary.Rememberme);
        	 return true;
        	 
         }
	
     public boolean isLoginBtnVisible() {
 		ElementDisplayed(LoginPageRepositary.Login);
 		return true;
 	}
     
   //Login with Valid Email and Password   
 	public boolean LoginwithvalidEmailandPwrod() throws InterruptedException, IOException {
 		
 		
 		 String UserName = configloader().getProperty("UserName");
		 String Password = configloader().getProperty("Password");
 		 input(LoginPageRepositary.emailaddress,UserName);
     	 input(LoginPageRepositary.password,Password);
     	 click(LoginPageRepositary.Login);
     	 return true;	 
 		
 		 }
 	
 
 	//Login with Valid Email and Password   
 	 	public boolean UserSignOut() throws InterruptedException, IOException {
 	 		
 	 		Thread.sleep(5000);
 	 		click(LoginPageRepositary.UserIconSignout);
 	 		System.out.println("User icon Clicked");
 	 		Thread.sleep(5000);
 			//driver.findElement(By.xpath("(//a[@class='dropdown-item'])[3]")).click();
 	 		

 	 		click(LoginPageRepositary.UserSignOut);
	     	
	     	 return true;	 
 	 		
 	 		 }
 	
 	public boolean isLoginwithOTPButtonVisible() throws InterruptedException {
 		
 		click(LoginPageRepositary.loginButton);
 		Thread.sleep(3000);
		ElementDisplayed(LoginPageRepositary.LoginWithOTPButton);
		return true;
 	}
 	
 	public boolean LoginwithOTPButtonClick() throws InterruptedException {
		click(LoginPageRepositary.LoginWithOTPButton);
		return true;
 	}
	
 	public boolean EnterEmailAddress() throws InterruptedException, IOException {
 		Thread.sleep(3000);
 		String EmailUserName = configloader().getProperty("UserName");
 		input(LoginPageRepositary.UserEmailAddress,EmailUserName);
		return true;
 	}
     
 	public boolean ClickSendVerifcationCode() throws InterruptedException, IOException {
 		click(LoginPageRepositary.SendVerificationCodeButton);
		return true;
 	}
 	
 	public boolean EnterEmailOTPForLogin() throws InterruptedException, IOException, ClassNotFoundException {
 		
 		String UserName = configloader().getProperty("UserName");
 		System.out.println("User name :"+UserName);
 		String OTP = GetEmailOTP(UserName);
 		System.out.println("Email OTP :"+OTP);
 		input(LoginPageRepositary.EmailOTP,OTP);
		return true;
 	}
 	
 	public boolean ClickOnVerificationBtn() throws InterruptedException, IOException {
 		click(LoginPageRepositary.VerifyCode);
		return true;
 	}
	
	
	
	
	
	
	

}
