package com.Pages_BusinessInformation_Modules;

import java.io.IOException;
import java.util.Map;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Submit_Application;
import com.Utility.Log;
//import com.aventstack.extentreports.Status;
//import com.extentReports.ExtentTestManager;
//import com.aventstack.extentreports.Status;
//import com.extentReports.ExtentTestManager;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;




public class Submit_Application_Module extends Base_Class{
		
		Submit_Application SubmitApplication = new Submit_Application();
		
		
		// TC001

		public  boolean login() throws InterruptedException, IOException {
			Login();
			return true;



		}

		// TC002
			public boolean NavigatetoSubmitApplication() throws InterruptedException {
				click(SubmitApplication.ContinueButton);
	            Log.info("Navigate to Collateral Security" + SubmitApplication.ContinueButton);
				Thread.sleep(2000);
				return true;
			}
			
			
			public boolean AccessSubmitApplication() throws InterruptedException {
				//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
				ScrollUntilElementVisible(SubmitApplication.SubmitApllicationSection);
				Thread.sleep(1000);
				click(SubmitApplication.SubmitApplication);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			//TC003
			public boolean SubmitApplicationHeading() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.SubmitApplicationHeading));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			
			//TC004
			public  boolean UploadSignature() throws InterruptedException, IOException {
			    UploadFile(SubmitApplication.UploadSignature,".\\src\\test\\resources\\Screenshot1.png");
				Thread.sleep(7000);
				System.out.println("Uploaded");
//				{
//					WebElement uploadElement = driver.findElementByXPath("src/test/resources/Screenshot1.png");
//					Thread.sleep(1000);
//					String path1=System.getProperty("user.dir");
//					Thread.sleep(1000);
//					Log.info("path is :" + path1);
//					Thread.sleep(1000);
//			        uploadElement.sendKeys(path);
//			        
//				}
				return true;
				
				
			}
			
			
			//TC005
			public boolean ViewButton() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.View));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
	
			
			
			//TC006
			public boolean TermsAndConditions() throws InterruptedException {
				ScrollUntilElementVisible(SubmitApplication.SubmitApplicationHeading);
				Thread.sleep(1000);
				click(SubmitApplication.TermsAndConditions);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			
			//TC007
			public boolean ClickOntheCheckbox() throws InterruptedException {
				ScrollUntilElementVisible(SubmitApplication.ScrolltoCheckBox);
				Thread.sleep(1000);
				click(SubmitApplication.CheckBox);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			//TC008
			public boolean VisibilityOfAgreeButton() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.AgreeButton));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			//TC009
			public boolean ClickOntheAgreeButton() throws InterruptedException {
				click(SubmitApplication.AgreeButton);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			
			//TC010
			public boolean VisibilityOfCancelButton() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.Cancel));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			
			//TC011
			public boolean VisibilityOfSubmitButton() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.Submit));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			//TC012
			public boolean ClickOntheSubmit() throws InterruptedException {
				click(SubmitApplication.Submit);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			
			//TC013
			public boolean VisibilityOfVerificatioCode() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.VerificationCodeField));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			
			
			
			public boolean EnterOTPforMob(Map<Object, Object> testdata, ITestContext context) throws InterruptedException, ClassNotFoundException {
	            // Thread.sleep(10000);
				 // Get OTP from DB
				String MobileNumber = testdata.get("MobileNumber").toString();
				System.out.println("MobileNumber: "+MobileNumber);
				
                String otp = GetMobileNumberOTP(MobileNumber);
                System.out.println("otp :" + otp);
                
	            input(SubmitApplication.VerificationCodeField, otp);
	            Log.info("OTP ENtered" + SubmitApplication.VerificationCodeField);
	            return true;
	      }


			
			
			
			
			
			
			
			
			
			//TC014
			public boolean VisibilityOfVerifyCodeButton() {
			    try {
			        WebDriverWait wait = new WebDriverWait(driver, 30); // Wait up to 10 seconds
			        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(SubmitApplication.VerifyCodeButton));
			        return icon.isDisplayed();
			    } catch (Exception e) {
			        return false;
			    }
			}
			
			
			//TC015
			public boolean ClickOntheVerifyCode() throws InterruptedException {
				click(SubmitApplication.VerifyCodeButton);
				Thread.sleep(1000);
				return false;
				
			}
			
			
			
			
}			
			
		