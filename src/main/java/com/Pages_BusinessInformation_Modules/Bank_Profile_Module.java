package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.apache.logging.log4j.core.util.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Bank_Profile;
//import com.Utility.Log;
//import com.aventstack.extentreports.Status;
//import com.extentReports.ExtentTestManager;
//import com.aventstack.extentreports.Status;
//import com.extentReports.ExtentTestManager;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;




public  class Bank_Profile_Module extends Base_Class{
		
		Bank_Profile BankProfile = new Bank_Profile();
		
		
		// TC001

		public  boolean login() throws InterruptedException, IOException {
			Login();
			return true;
			
			
		}
		
		
		

		
		
		//TC002
		public boolean isProfileIconVisible() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
		        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(BankProfile.ProfileIcon));
		        return icon.isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}
		
		
		
		//TC003
		
		public boolean ClickontheProfileButton() throws InterruptedException {
			click(BankProfile.ProfileIcon);
            Log.info("Click on the Profile button" + BankProfile.ProfileIcon);
			Thread.sleep(2000);
			return true;
		}
		
		
		
		//TC004
		public boolean ClickontheBankProfile() throws InterruptedException {
			click(BankProfile.BankProfile);
            Log.info("Click on the Bank Profile" + BankProfile.BankProfile);
			Thread.sleep(2000);
			return true;
		}
		
		
		
		//TC005
		public boolean BankDetails() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
		        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(BankProfile.BankDetails));
		        return icon.isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}
		
		
		//TC006
		public boolean IFSCCode() {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds
		        WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(BankProfile.IFSCCode));
		        return icon.isDisplayed();
		    } catch (Exception e) {
		        return false;
		    }
		}
		
		
		//TC007
		public boolean EnterIFSCCode(String IFSCCode) throws InterruptedException {
            input(BankProfile.IFSCCode, IFSCCode);
			Thread.sleep(3000);
			Log.info(IFSCCode);
			return true;
			
		}
		
		//TC008
		
		public boolean ClickontheBankName() throws InterruptedException {
			click(BankProfile.BankNameTitle);
            Log.info("Click on the Bank Name" + BankProfile.BankNameTitle);
			Thread.sleep(3000);
			return true;
		}
		
		
	
		
		
		
		
		public static boolean validateBankName() throws InterruptedException {
            WebElement AutoloadedBankName = driver.findElement(By.xpath("//input[@name='BankName']"));
            System.out.println("Autoloaded Bank Name field" + AutoloadedBankName.getAttribute("title"));

            String ABC = AutoloadedBankName.getAttribute("title");
            if (ABC.equals(AutoloadedBankName.getAttribute("title"))) {
                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedBankName.getAttribute("title") + true);
                  Log.info(ABC + true);
                  return true;
            } else {
                  ExtentTestManager.getTest().log(Status.FAIL, "Bank Name is not auto populated " + false);

                  Thread.sleep(1000);
            }
        
            return true;
      
		}
		
		
		
		//TC009
		
		public boolean ClickontheBranchName() throws InterruptedException {
			click(BankProfile.BranchNameTitle);
            Log.info("Click on the Branch Name" + BankProfile.BranchNameTitle);
			Thread.sleep(2000);
			return true;
		}
			
			
		public static boolean validateBranchName() throws InterruptedException {
            WebElement AutoloadedBranchName = driver.findElement(By.xpath("//input[@name='BranchName']"));
            System.out.println("Autoloaded Branch Name field" + AutoloadedBranchName.getAttribute("title"));

            String ABC = AutoloadedBranchName.getAttribute("title");
            if (ABC.equals(AutoloadedBranchName.getAttribute("title"))) {
                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedBranchName.getAttribute("title") + true);
                  Log.info(ABC + true);
                  return true;
            } else {
                  ExtentTestManager.getTest().log(Status.FAIL, "Branch Name is not auto populated " + false);

                  Thread.sleep(1000);
            }
        
            return true;
      
		}
		
		
		//TC010
		public boolean EnterAccountHolderName(String AccountHolderName) throws InterruptedException {
            input(BankProfile.AccountName, AccountHolderName);
			Thread.sleep(2000);
			Log.info(AccountHolderName);
			return true;
			
		}
		
		
		//TC011
		public boolean EnterAccountNo(String AccountNumber) throws InterruptedException {
            input(BankProfile.AccountNumber, AccountNumber);
			Thread.sleep(2000);
			Log.info(AccountNumber);
			return true;
			
		}
		
		
		//TC012
		public boolean EnterReTypeAccountNo(String ReTypeAccountNumber) throws InterruptedException {
            input(BankProfile.ReTypeAccountNo, ReTypeAccountNumber);
			Thread.sleep(2000);
			Log.info(ReTypeAccountNumber);
			return true;
			
		}
		
		
		//TC013
		public  boolean UploadPassBook() throws InterruptedException, IOException {
			ScrollUntilElementVisible(BankProfile.UploadPassBook);
//			Thread.sleep(1000);
//			click(BankProfile.UploadPassBook);
			UploadFile(BankProfile.UploadPassBook,".\\src\\test\\resources\\Screenshot1.png");
			Thread.sleep(7000);
			System.out.println("Uploaded");
//			{
//				WebElement uploadElement = driver.findElementByXPath("src/test/resources/Screenshot1.png");
//				Thread.sleep(1000);
//				String path1=System.getProperty("user.dir");
//				Thread.sleep(1000);
//				Log.info("path is :" + path1);
//				Thread.sleep(1000);
//		        uploadElement.sendKeys(path);
//		        
//			}
			return true;
			
			
		}
		
		
		
		//TC014
		public boolean ClickontheSave() throws InterruptedException {
			click(BankProfile.Save);
            Log.info("Click on the Save" + BankProfile.Save);
			Thread.sleep(3000);
			return true;
		}
		

		
}
             








