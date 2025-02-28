package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Collateral_Security;
//import com.Page_Repositary.Collateral_Security;
import com.Utility.Log;
//import com.aventstack.extentreports.Status;
//import com.extentReports.ExtentTestManager;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;




public class Collateral_Security_Module extends Base_Class{
		
		Collateral_Security CollateralSecurity = new Collateral_Security();
		
		
		// TC001

		public  boolean login() throws InterruptedException, IOException {
			Login();
			return true;



		}

		// TC002
			public boolean NavigatetoCollateralSecurity() throws InterruptedException {
				click(CollateralSecurity.ContinueButton);
	            Log.info("Navigate to Collateral Security" + CollateralSecurity.ContinueButton);
				Thread.sleep(2000);
				return true;
			}
			
		
			public boolean AccessCollateralSecurity() throws InterruptedException {
				//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
				ScrollUntilElementVisible(CollateralSecurity.ScrolltoBusinessfinance);
				Thread.sleep(1000);
				click(CollateralSecurity.Security);
				Thread.sleep(1000);
				ScrollUntilElementVisible(CollateralSecurity.Vehicle);
				Thread.sleep(1000);
                click(CollateralSecurity.CollateralSecurity);
				Thread.sleep(2000);
				return true;
			}
			
			
//TC003
			
			public boolean ClickontheAddDetails() throws InterruptedException {
		        click(CollateralSecurity.AddDetails);
				Thread.sleep(2000);
			    return true;
			}
			
			
			//Tc004
			public boolean EnterTitleHolder(String TitleHolder) throws InterruptedException {

				input(CollateralSecurity.TitleHolder, TitleHolder);
				Thread.sleep(1000);
				Log.info(TitleHolder);
				return true;
				
			}
			
			
			//TC005
			public boolean RelationWithApplicant() throws InterruptedException {
				click(CollateralSecurity.RelationWithApplicant);
				Thread.sleep(1000);
				click(CollateralSecurity.Relation);
				Thread.sleep(1000);
				return true;
				
				
				}
			
			//TC006
			public boolean EnterAddress(String Address) throws InterruptedException {

				input(CollateralSecurity.Address, Address);
				Thread.sleep(1000);
				Log.info(Address);
				return true;
				
			}
			
			//TC007
			public boolean EnterAadhaar(String Aadhaar) throws InterruptedException {

				input(CollateralSecurity.Aadhaar, Aadhaar);
				Thread.sleep(1000);
				Log.info(Aadhaar);
				return true;
				
			}
			
			//TC008
			public boolean EnterDocNo(String DocNo) throws InterruptedException {

				input(CollateralSecurity.DocNo, DocNo);
				Thread.sleep(1000);
				Log.info(DocNo);
				return true;
				
			}
			
			
			
			//TC009
			public boolean EnterSurveyNo(String SurveyNo) throws InterruptedException {
                input(CollateralSecurity.SurveyNo, SurveyNo);
				Thread.sleep(1000);
				Log.info(SurveyNo);
				return true;
				
			}
			
			//TC010
			public boolean EnterResurveyNo(String ResurveyNo) throws InterruptedException {
                input(CollateralSecurity.ResurveyNo, ResurveyNo);
				Thread.sleep(1000);
				Log.info(ResurveyNo);
				return true;
				
			}
			
			
			//TC011
			public boolean EnterExtendOfLandWet(String ExtendOfLandWet) throws InterruptedException {
                input(CollateralSecurity.ExtendOfLandWet, ExtendOfLandWet);
				Thread.sleep(1000);
				Log.info(ExtendOfLandWet);
				return true;
				
			}
			
			//TC012
			public boolean EnterExtendOfLandDRY(String ExtendOfLandDRY) throws InterruptedException {
                input(CollateralSecurity.ExtendOfLandDRY, ExtendOfLandDRY);
				Thread.sleep(1000);
				Log.info(ExtendOfLandDRY);
				return true;
				
			}
			
			//TC013
			
			
			
			public boolean Unit() throws InterruptedException {
				click(CollateralSecurity.Unit);
				Thread.sleep(1000);
				click(CollateralSecurity.DropdownofUnit);
				Thread.sleep(1000);
				return true;
				
				
				}
			
			//TC014
			
			public boolean ScrolltoResurveyNo() throws InterruptedException{
				ScrollUntilElementVisible(CollateralSecurity.ResurveyNo);
				Thread.sleep(1000);
				return true;
				
				
				}
			public boolean EnterPinCode(String PinCode) throws InterruptedException {
				input(CollateralSecurity.PinCode, PinCode);
				Thread.sleep(1000);
				Log.info(PinCode);
				return true;
			}
			
				
			
			
			//TC015
			
			public boolean SelectState() throws InterruptedException {
				click(CollateralSecurity.TitleState);
				Thread.sleep(1000);
				click(CollateralSecurity.State);
				Thread.sleep(1000);
			    click(CollateralSecurity.DropdownofState);
       			Thread.sleep(1000);
				return true;
			}
			
			//TC016
			public boolean EnterDistrict() throws InterruptedException {
				click(CollateralSecurity.District);
				Thread.sleep(1000);
				click(CollateralSecurity.DropdownofDistrict);
       			Thread.sleep(1000);
				return true;
			}
			
			
			//TC017
			public boolean EnterCity() throws InterruptedException {
				click(CollateralSecurity.City);
				Thread.sleep(1000);
				click(CollateralSecurity.DropdownofCity);
       			Thread.sleep(1000);
				return true;
			}
			
			//Tc018
			public boolean EnterPost() throws InterruptedException {
				click(CollateralSecurity.Post);
				Thread.sleep(1000);
				click(CollateralSecurity.DropdownofPost);
       			Thread.sleep(1000);
				return true;
			}

			
			//TC019
			public boolean EnterPlace(String Place) throws InterruptedException {
                input(CollateralSecurity.Place, Place);
				Thread.sleep(1000);
				Log.info(Place);
				return true;
				
			}
			
			//TC020
			public boolean EnterPanchayat() throws InterruptedException {
				click(CollateralSecurity.Panchayat);
				Thread.sleep(1000);
				click(CollateralSecurity.DropdownofPanchayat);
       			Thread.sleep(1000);
				return true;
			}
			
			
}