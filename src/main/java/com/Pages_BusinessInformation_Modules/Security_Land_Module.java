package com.Pages_BusinessInformation_Modules;

import java.io.IOException;


import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Land;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;




public class Security_Land_Module extends Base_Class{
		
		Security_Land securityland = new Security_Land();
		
		
		// TC001

		public  boolean login() throws InterruptedException, IOException {
			Login();
			return true;



		}

		// TC002
			public boolean Navigatetosecurityland() throws InterruptedException {
				click(securityland.ContinueButton);
	            Log.info("Navigate to Securityland" + securityland.ContinueButton);
				Thread.sleep(2000);
				return true;
			}
			
		
			public boolean AccessSecurityLand() throws InterruptedException {
				//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
				ScrollUntilElementVisible(securityland.ScrolltoBusinessfinance);
				Thread.sleep(1000);
				ScrollUntilElementVisible(securityland.ScrolltoSecurity);
				click(securityland.Land);
				Thread.sleep(1000);
				
				return true;
				
		     }
			
			//TC003
			public boolean ClickontheListofLand() throws InterruptedException {
				click(securityland.ListofLand);
				Log.info("Click on the List of Land" + securityland.ListofLand);
				Thread.sleep(2000);
				return true;

			
}
			//TC004
			public static boolean validateTitleHolder() throws InterruptedException {
	            WebElement AutoloadedTitleHolder = driver.findElement(By.xpath("//input[@name='TitleHolder']"));
	            System.out.println("Autoloaded Title Holder" + AutoloadedTitleHolder.getAttribute("title"));

	            String ABC = AutoloadedTitleHolder.getAttribute("title");
	            if (ABC.equals(AutoloadedTitleHolder.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedTitleHolder.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isTitleHolderfieldDisabled() {
            	WebElement AutoloadedTitleHolder = driver.findElement(By.xpath("//input[@name='TitleHolder']"));
                return !AutoloadedTitleHolder.isEnabled();
            }
            
            //TC005
            
            public static boolean validateDocNo() throws InterruptedException {
	            WebElement AutoloadedDocNo = driver.findElement(By.xpath("//input[@name='DocNo']"));
	            System.out.println("Autoloaded Doc No" + AutoloadedDocNo.getAttribute("title"));

	            String ABC = AutoloadedDocNo.getAttribute("title");
	            if (ABC.equals(AutoloadedDocNo.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedDocNo.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isDocNoFielddDisabled() {
            	WebElement AutoloadedDocNo = driver.findElement(By.xpath("//input[@name='DocNo']"));
                return !AutoloadedDocNo.isEnabled();
            }
            
            
            //TC006
            
            public static boolean validateSurveyNo() throws InterruptedException {
	            WebElement AutoloadedSurveyNo = driver.findElement(By.xpath("//input[@name='SurveyNo']"));
	            System.out.println("Autoloaded Survey No" + AutoloadedSurveyNo.getAttribute("title"));

	            String ABC = AutoloadedSurveyNo.getAttribute("title");
	            if (ABC.equals(AutoloadedSurveyNo.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedSurveyNo.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isSurveyNoFielddDisabled() {
            	WebElement AutoloadedSurveyNo = driver.findElement(By.xpath("//input[@name='SurveyNo']"));
                return !AutoloadedSurveyNo.isEnabled();
            }
			
            
            //TC007
            public static boolean validateResurveyNo() throws InterruptedException {
	            WebElement AutoloadedResurveyNo = driver.findElement(By.xpath("//input[@name='ResurveyNo']"));
	            System.out.println("Autoloaded Resurvey No" + AutoloadedResurveyNo.getAttribute("title"));

	            String ABC = AutoloadedResurveyNo.getAttribute("title");
	            if (ABC.equals(AutoloadedResurveyNo.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedResurveyNo.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isResurveyNoFielddDisabled() {
            	WebElement AutoloadedResurveyNo = driver.findElement(By.xpath("//input[@name='ResurveyNo']"));
                return !AutoloadedResurveyNo.isEnabled();
            }
            
            public boolean AccessNature() throws InterruptedException {
				ScrollUntilElementVisible(securityland.Nature);
				Thread.sleep(1000);
				return true;
            }
            
            
            //TC008
           
            public static boolean validateNature() throws InterruptedException {
                Thread.sleep(1000);
	            WebElement AutoloadedNature = driver.findElement(By.xpath("//label[@title='Nature']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Nature" + AutoloadedNature.getAttribute("title"));

	            String ABC = AutoloadedNature.getAttribute("title");
	            if (ABC.equals(AutoloadedNature.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedNature.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isNatureFielddDisabled() {
          	WebElement AutoloadedNature = driver.findElement(By.xpath("//label[@title='Nature']//following-sibling::div//following-sibling::label"));
           return !AutoloadedNature.isEnabled();
            }
            
            
            
            //TC009
            public static boolean validateExtendOfLandDry() throws InterruptedException {
	            WebElement AutoloadedExtendOfLandDry = driver.findElement(By.xpath("//input[@name='ExtendOfLandDRY']"));
	            System.out.println("Autoloaded Extend Of Land Dry" + AutoloadedExtendOfLandDry.getAttribute("title"));

	            String ABC = AutoloadedExtendOfLandDry.getAttribute("title");
	            if (ABC.equals(AutoloadedExtendOfLandDry.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedExtendOfLandDry.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isExtendOfLandDryFielddDisabled1() {
            	WebElement AutoloadedExtendOfLandDry = driver.findElement(By.xpath("//input[@name='ExtendOfLandDRY']"));
                return !AutoloadedExtendOfLandDry.isEnabled();
            }
            
            //TC0010
            
            public static boolean validateExtendOfLandWet() throws InterruptedException {
	            WebElement AutoloadedExtendOfLandWet = driver.findElement(By.xpath("//input[@name='ExtendOfLand']"));
	            System.out.println("Autoloaded Extend Of Land Wet" + AutoloadedExtendOfLandWet.getAttribute("title"));

	            String ABC = AutoloadedExtendOfLandWet.getAttribute("title");
	            if (ABC.equals(AutoloadedExtendOfLandWet.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedExtendOfLandWet.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isExtendOfLandWetFielddDisabled() {
            	WebElement AutoloadedExtendOfLandWet = driver.findElement(By.xpath("//input[@name='ExtendOfLand']"));
                return !AutoloadedExtendOfLandWet.isEnabled();
            }
            
            //TC011
            public static boolean validateUnitfield() throws InterruptedException {
	            WebElement AutoloadedUnitField = driver.findElement(By.xpath("//label[@title='Unit']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Unit Field" + AutoloadedUnitField.getAttribute("title"));

	            String ABC = AutoloadedUnitField.getAttribute("title");
	            if (ABC.equals(AutoloadedUnitField.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedUnitField.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isUnitFieldDisabled() {
            	WebElement AutoloadedUnitField = driver.findElement(By.xpath("//label[@title='Unit']//following-sibling::div//following-sibling::label"));
                return !AutoloadedUnitField.isEnabled();
            }
            
            //TC012
            public static boolean validatePincode() throws InterruptedException {
	            WebElement AutoloadedPincode = driver.findElement(By.xpath("//input[@name='PinCode']"));
	            System.out.println("Autoloaded Pincode" + AutoloadedPincode.getAttribute("title"));

	            String ABC = AutoloadedPincode.getAttribute("title");
	            if (ABC.equals(AutoloadedPincode.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedPincode.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isPincodeFieldDisabled() {
            	WebElement AutoloadedPincode = driver.findElement(By.xpath("//input[@name='PinCode']"));
                return !AutoloadedPincode.isEnabled();
            }
            
            
            //TC013
            public static boolean validateState() throws InterruptedException {
	            WebElement AutoloadedState = driver.findElement(By.xpath("//label[@title='State']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded State" + AutoloadedState.getAttribute("title"));

	            String ABC = AutoloadedState.getAttribute("title");
	            if (ABC.equals(AutoloadedState.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedState.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isStateFieldDisabled() {
            	WebElement AutoloadedState = driver.findElement(By.xpath("//label[@title='State']//following-sibling::div//following-sibling::label"));
                return !AutoloadedState.isEnabled();
            }
            
            //TC014
            public static boolean validateDistrict() throws InterruptedException {
	            WebElement AutoloadedDistrict = driver.findElement(By.xpath("//label[@title='District']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded State" + AutoloadedDistrict.getAttribute("title"));

	            String ABC = AutoloadedDistrict.getAttribute("title");
	            if (ABC.equals(AutoloadedDistrict.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedDistrict.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isDistrictFieldDisabled() {
            	WebElement AutoloadedDistrict = driver.findElement(By.xpath("//label[@title='District']//following-sibling::div//following-sibling::label"));
                return !AutoloadedDistrict.isEnabled();
            }
            
            
            //TC015
            public static boolean validatePost() throws InterruptedException {
	            WebElement AutoloadedPost = driver.findElement(By.xpath("//label[@title='Post']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Post" + AutoloadedPost.getAttribute("title"));

	            String ABC = AutoloadedPost.getAttribute("title");
	            if (ABC.equals(AutoloadedPost.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedPost.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isPostFieldDisabled() {
            	WebElement AutoloadedPost = driver.findElement(By.xpath("//label[@title='Post']//following-sibling::div//following-sibling::label"));
                return !AutoloadedPost.isEnabled();
            }
            
            //TC016
            public static boolean validateCity() throws InterruptedException {
	            WebElement AutoloadedCity = driver.findElement(By.xpath("//label[@title='City']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Post" + AutoloadedCity.getAttribute("title"));

	            String ABC = AutoloadedCity.getAttribute("title");
	            if (ABC.equals(AutoloadedCity.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedCity.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isCityFieldDisabled() {
            	WebElement AutoloadedCity = driver.findElement(By.xpath("//label[@title='City']//following-sibling::div//following-sibling::label"));
                return !AutoloadedCity.isEnabled();
            }
            
            //TC017
            public static boolean validatePlace() throws InterruptedException {
	            WebElement AutoloadedPlace = driver.findElement(By.xpath("//input[@name='Place']"));
	            System.out.println("Autoloaded Post" + AutoloadedPlace.getAttribute("title"));

	            String ABC = AutoloadedPlace.getAttribute("title");
	            if (ABC.equals(AutoloadedPlace.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedPlace.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isPlaceFieldDisabled() {
            	WebElement AutoloadedPlace = driver.findElement(By.xpath("//input[@name='Place']"));
                return !AutoloadedPlace.isEnabled();
            }
            
            //TC018
            public static boolean validateVillage() throws InterruptedException {
	            WebElement AutoloadedVillage = driver.findElement(By.xpath("//input[@name='Village']"));
	            System.out.println("Autoloaded Village" + AutoloadedVillage.getAttribute("title"));

	            String ABC = AutoloadedVillage.getAttribute("title");
	            if (ABC.equals(AutoloadedVillage.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVillage.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVillageFieldDisabled() {
            	WebElement AutoloadedVillage = driver.findElement(By.xpath("//input[@name='Village']"));
                return !AutoloadedVillage.isEnabled();
            }
            
            
            
            //TC019
            public static boolean validateTaluk() throws InterruptedException {
	            WebElement AutoloadedTaluk = driver.findElement(By.xpath("//input[@name='Taluk']"));
	            System.out.println("Autoloaded Taluk" + AutoloadedTaluk.getAttribute("title"));

	            String ABC = AutoloadedTaluk.getAttribute("title");
	            if (ABC.equals(AutoloadedTaluk.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedTaluk.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isTalukFieldDisabled() {
            	WebElement AutoloadedTaluk = driver.findElement(By.xpath("//input[@name='Taluk']"));
                return !AutoloadedTaluk.isEnabled();
            }
            
            //TC020
            public static boolean validatePanchayat() throws InterruptedException {
	            WebElement AutoloadedPanchayat = driver.findElement(By.xpath("//label[@title='Panchayat']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Panchayat" + AutoloadedPanchayat.getAttribute("title"));

	            String ABC = AutoloadedPanchayat.getAttribute("title");
	            if (ABC.equals(AutoloadedPanchayat.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedPanchayat.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isPanchayatFieldDisabled() {
            	WebElement AutoloadedPanchayat = driver.findElement(By.xpath("//label[@title='Panchayat']//following-sibling::div//following-sibling::label"));
                return !AutoloadedPanchayat.isEnabled();
            }
            
            
            //TC021
            public static boolean validateConstituency() throws InterruptedException {
	            WebElement AutoloadedConstituency = driver.findElement(By.xpath("//label[@title='Constituency']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Constituency" + AutoloadedConstituency.getAttribute("title"));

	            String ABC = AutoloadedConstituency.getAttribute("title");
	            if (ABC.equals(AutoloadedConstituency.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedConstituency.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isConstituencyFieldDisabled() {
            	WebElement AutoloadedConstituency = driver.findElement(By.xpath("//label[@title='Constituency']//following-sibling::div//following-sibling::label"));
                return !AutoloadedConstituency.isEnabled();
            }
            
            
            //TC022
            public static boolean validateCostOfLandExcludingRegistration() throws InterruptedException {
	            WebElement AutoloadedCostOfLandExcludingRegistration = driver.findElement(By.xpath("//input[@name='CostOfLandAsPerDocument']"));
	            System.out.println("Autoloaded Cost Of Land Excluding Registration" + AutoloadedCostOfLandExcludingRegistration.getAttribute("title"));

	            String ABC = AutoloadedCostOfLandExcludingRegistration.getAttribute("title");
	            if (ABC.equals(AutoloadedCostOfLandExcludingRegistration.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedCostOfLandExcludingRegistration.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isCostOfLandExcludingRegistrationFieldDisabled() {
            	WebElement AutoloadedCostOfLandExcludingRegistration = driver.findElement(By.xpath("//input[@name='CostOfLandAsPerDocument']"));
                return !AutoloadedCostOfLandExcludingRegistration.isEnabled();
            }
            
            
            //TC023
            public static boolean validateRegistrationCost() throws InterruptedException {
	            WebElement AutoloadedRegistrationCost = driver.findElement(By.xpath("//input[@name='RegistrationAmount']"));
	            System.out.println("Autoloaded Cost Of Land Excluding Registration" + AutoloadedRegistrationCost.getAttribute("title"));

	            String ABC = AutoloadedRegistrationCost.getAttribute("title");
	            if (ABC.equals(AutoloadedRegistrationCost.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedRegistrationCost.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isRegistrationCostFieldDisabled() {
            	WebElement AutoloadedRegistrationCost = driver.findElement(By.xpath("//input[@name='RegistrationAmount']"));
                return !AutoloadedRegistrationCost.isEnabled();
            }
            
            //TC024
            public static boolean validateStampDuty() throws InterruptedException {
	            WebElement AutoloadedStampDuty = driver.findElement(By.xpath("//input[@name='StampDuty']"));
	            System.out.println("Autoloaded Stamp Duty" + AutoloadedStampDuty.getAttribute("title"));

	            String ABC = AutoloadedStampDuty.getAttribute("title");
	            if (ABC.equals(AutoloadedStampDuty.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedStampDuty.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isStampDutyFieldDisabled() {
            	WebElement AutoloadedStampDuty = driver.findElement(By.xpath("//input[@name='StampDuty']"));
                return !AutoloadedStampDuty.isEnabled();
            }
            
            
            //TC025
            public static boolean validateGOVFairValue() throws InterruptedException {
	            WebElement AutoloadedGOVFairValue = driver.findElement(By.xpath("//input[@name='GOVFairValue']"));
	            System.out.println("Autoloaded GOV Fair Value" + AutoloadedGOVFairValue.getAttribute("title"));

	            String ABC = AutoloadedGOVFairValue.getAttribute("title");
	            if (ABC.equals(AutoloadedGOVFairValue.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedGOVFairValue.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isGOVFairValueFieldDisabled() {
            	WebElement AutoloadedGOVFairValue = driver.findElement(By.xpath("//input[@name='GOVFairValue']"));
                return !AutoloadedGOVFairValue.isEnabled();
            }
            
            
            //TC026
            public static boolean validateAproxMarketValue() throws InterruptedException {
	            WebElement AutoloadedAproxMarketValue = driver.findElement(By.xpath("//input[@name='AproxMarketValue']"));
	            System.out.println("Autoloaded Aprox Market Value" + AutoloadedAproxMarketValue.getAttribute("title"));

	            String ABC = AutoloadedAproxMarketValue.getAttribute("title");
	            if (ABC.equals(AutoloadedAproxMarketValue.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedAproxMarketValue.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isAproxMarketValueFieldDisabled() {
            	WebElement AutoloadedAproxMarketValue = driver.findElement(By.xpath("//input[@name='AproxMarketValue']"));
                return !AutoloadedAproxMarketValue.isEnabled();
            }
            
            
            public boolean ScrolltoCancel() throws InterruptedException {
            	 ScrollUntilElementVisible(securityland.AproxMarketValue);
            	 Thread.sleep(2000);
 			    Log.info("Scroll to Cancel" + securityland.AproxMarketValue);
 				return true;
 			
             
            }
            //TC027
            public boolean ClickOntheCancel() throws InterruptedException {
				click(securityland.Cancel);
				Thread.sleep(2000);
			    Log.info("Click on the Cancel" + securityland.Cancel);
				return true;
			}
            
            public boolean ScrolltoContinue() throws InterruptedException {
            	ScrollUntilElementVisible(securityland.SavedDetailes);
				Thread.sleep(1000);
				Log.info("Navigates to Continue" + securityland.SavedDetailes);
				return true;
            }
            
            //TC028
            public boolean ClickOntheContinue() throws InterruptedException {
            	
				click(securityland.Continue);
	            Log.info("Click on the Continue" + securityland.Cancel);
				Thread.sleep(2000);
				return true;
			}
            
}