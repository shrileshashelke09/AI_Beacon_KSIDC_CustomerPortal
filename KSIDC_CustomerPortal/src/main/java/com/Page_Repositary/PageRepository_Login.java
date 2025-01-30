package com.Page_Repositary;

import org.openqa.selenium.By;

public class PageRepository_Login {
	
	
	//public By LeaveSection= By.xpath("//span[text()='Leave']/parent::div");
	//public By loginbutn= By.xpath("//*[@id=\"app\"]/body/nav/div/div[1]/div/button[1]");
	public By loginButton = By.xpath("//*[@id='navbarsExample04']/div/button[1]");
	//public By Email= By.xpath("//input[@placeholder='Email Address']");
	//public By Password= By.xpath("//input[@placeholder='Password']");
	public By Login= By.xpath("//button[@type='submit']");
	
	 
	 public By Popup= By.xpath("//*[@id=\"login-Modal\"]/div/div");
	 public By Closebutton=By.xpath("//*[@id=\"login-Modal\"]/div/div/div/button");
	 public By emailaddress=By.name("Email");
	 public By password=By.name("Password");
	 public By insidelogin=By.id("authentication-btn");
	 public By invalidmessage=By.xpath("//*[@id=\"login-Modal\"]/div/div/form/div/div[4]/span[1]/div");
	 public By eyeicon=By.xpath("//*[@id=\"login-Modal\"]/div/div/form/div/div[2]/div/a/span/i");
	 //Email and password validation message
	 public By emailrequired=By.xpath("//*[@id=\"login-Modal\"]/div/div/form/div/div[1]/div");
	 public By passwordrequired=By.xpath("//*[@id=\"login-Modal\"]/div/div/form/div/div[2]/div[2]");
	 public By Rememberme=By.id("flexCheckChecked");
	 //public By loginButton=By.xpath("//*[@id='navbarsExample04']/div/button[1]");
	 public By LoginWithOTPButton= By.xpath("(//button[@type='button'])[8]");
	 //public By emailaddressOTP=By.name("Email");
	 public By UserIconSignout= By.xpath("(//a[@id='LoggedInUser'])[2]");
	 public By UserSignOut= By.xpath("(//a[@class='dropdown-item'][text()='Log out'])[2]");
	 public By SendVerificationCodeButton= By.xpath("//*[@id=\"login-otp-Modal\"]/div/div/form/div/div[2]/button");
	 public By UserEmailAddress=By.xpath("(//input[@placeholder='Email Address'])[3]");
	 public By EmailOTP=By.xpath("(//input[@name='EmailOTP'])[2]");
	 public By VerifyCode=By.xpath("(//button[@type='submit'])[9]");
	 

	 
	 
}

//span