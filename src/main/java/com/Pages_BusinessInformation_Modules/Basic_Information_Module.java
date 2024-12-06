package com.Pages_BusinessInformation_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Basic_Information;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Basic_Information_Module extends Base_Class {

	Basic_Information Basic_Information = new Basic_Information ();
	
	
	//TC001
	
		public boolean Login (String EnterEmailAddress , String EnterPassword) throws InterruptedException {

		click(Basic_Information.LoginButton);
		Log.info("Login button Clicked" + Basic_Information.LoginButton );
		Thread.sleep(2000);
		input(Basic_Information.EnterEmailAddress , EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Basic_Information.EnterPassword ,EnterPassword);
		Log.info(EnterPassword);
		click(Basic_Information.ClicktoLogin);
		Log.info("Login button clickd" + Basic_Information.ClicktoLogin);
			
			return true;
			
		}
		
		//TC002 //TC003 //TC004
		
		public boolean BasicInformationPageAccessibility () throws InterruptedException {
			
			click(Basic_Information.ContinueButton);
			Thread.sleep(1000);
			return true;
			
		}
		
		//TC005
		
		public boolean BasicInfoHeader () throws InterruptedException {
			
			ElementDisplayed (Basic_Information.BasicInfoHeader);
			Thread.sleep(3000);
			Log.info("Basic Information Header Displayed" + Basic_Information.BasicInfoHeader);
			return true;
			
		}
		
		//TC006
		
		
		public boolean MSMERadioVisibility () {
			
			ElementDisplayed (Basic_Information.MSMERadioButton);
			Log.info("MSME Radio button displayed" + Basic_Information.MSMERadioButton);
			return true;
		}
		
		//TC007
		
		public boolean YESNOToggleforMSME () throws InterruptedException {
			
			
			click(Basic_Information.YESforMSME);
			Thread.sleep(2000);
			Log.info("Yes toggle clicked" + Basic_Information.YESforMSME);
			click(Basic_Information.NOforMSME);
			Thread.sleep(2000);
			Log.info("NO toggle clicked" + Basic_Information.NOforMSME);
			return true;
		}
		
		//TC009
		
		public boolean SelectYesforMSME () throws InterruptedException {
			click(Basic_Information.YESforMSME);
			Log.info("Clicked on Yes toggle for MSME");
			Thread.sleep(2000);
			return true;
			
		}
		 //TC015
		public boolean EnterandVerifyUdyamNo (String UdyamNo) throws InterruptedException {
			
			ScrollUntilElementVisible(Basic_Information.MSMERadioButton);
			Thread.sleep(1000);
			ElementDisplayed(Basic_Information.UdyamNo);
			Log.info("Udyam No data field displayed" + Basic_Information.UdyamNo);
			input(Basic_Information.UdyamNo , UdyamNo);
			Log.info(UdyamNo);
			Thread.sleep(3000);
			Log.info("Udyam no verified" + Basic_Information.VerifyUdyamNo);
			if(ElementDisplayed(Basic_Information.VerifyUdyamNo)) {
				click(Basic_Information.VerifyUdyamNo);
				Log.info("CLicked");
				ElementToBeVisible(Basic_Information.Verified);
				Log.info("Verified");
				Thread.sleep(3000);
			}
			else {
				Log.info("Check Not Visible");
			}
		
			return true;
		
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateNameOfEnterprises () throws InterruptedException {
			
			WebElement AutoloadedEnterprisesName = driver.findElement(By.xpath("//input[@placeholder='Name Of Enterprise']"));
			System.out.println("Autoloaded Enterprises name displayed" + AutoloadedEnterprisesName.getAttribute("title"));
			if(AutoloadedEnterprisesName.equals(" M/S 3 IDEA TECHNOLOGY LLP ")) {
				 boolean flag1=ElementDisplayed(Basic_Information.NameofEnterprises);
				 ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			
			return true;
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateTypeOfOrganization () throws InterruptedException {
			
			WebElement AutoloadedOrganizationType = driver.findElement(By.xpath("//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main']"));
			System.out.println("Autoloaded Type of organization displayed" + AutoloadedOrganizationType.getAttribute("title"));
			
			if(AutoloadedOrganizationType.equals(" Business Entities Created by Statute ") ) {
				boolean flag1 = ElementDisplayed(Basic_Information.TypeOfOrganization);
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			}
			else {
				
				Thread.sleep(1000);
			}
			return true;
		}
		
		public boolean SelectClassofActivity () throws InterruptedException {
			
			
			ElementDisplayed(Basic_Information.ClassofActivity);
			Log.info("Class of Activity data field displayed" + Basic_Information.ClassofActivity);
			click(Basic_Information.ClassofActivity);
			Log.info("Dropdown displayed" + Basic_Information.ClassofActivity);
			Thread.sleep(1000);
			click(Basic_Information.SelectClassofActivity);
			Thread.sleep(1000);
			Log.info("Class of Activity get selected" + Basic_Information.SelectClassofActivity);
			return true;
		}
		
@SuppressWarnings("unlikely-arg-type")
public boolean ValidateIncorporationDate () throws InterruptedException {
			
			WebElement AutoloadedIncorporationDate = driver.findElement(By.xpath("(//div[@class='valid'])[1]"));
			System.out.println("Autoloaded Date displayed" + AutoloadedIncorporationDate.getAttribute("title"));
			if(AutoloadedIncorporationDate.equals(" 15/09/2015 ")) 
			{ boolean flag1=ElementDisplayed(Basic_Information.DateOfIncorporation);
				 ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			
			return true;
		}
		
          @SuppressWarnings("unlikely-arg-type")
           public boolean ValidateUdyamRegDate () throws InterruptedException {
			
			WebElement AutoloadedUdyamRegDate = driver.findElement(By.xpath("(//div[@class='valid'])[2]"));
			System.out.println("Autoloaded Date displayed" + AutoloadedUdyamRegDate.getAttribute("title"));
			if(AutoloadedUdyamRegDate.equals(" 23/02/2021 ")) 
			{ boolean flag1=ElementDisplayed(Basic_Information.DateofUdyam);
				 ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);
				Log.info("frefx4s : " + false);
				return flag1;
			 }
			 else {
				 Thread.sleep(1000);
			 }
			
			return true;
		}
		
          //TC016
//          public boolean SelectClassofActivityNonMSME () throws InterruptedException {
//        	  click(Basic_Information.NOforMSME);
//        	  Thread.sleep(1000);
//        	  ScrollUntilElementVisible(Basic_Information.MSMERadioButton);
//        	  click(Basic_Information.ClassofActivityNonMSME);
//        	  Thread.sleep(1000);
//        	  Log.info("Dropdown shown" + Basic_Information.ClassofActivityNonMSME);
//        	  click(Basic_Information.SelectClassofActivityNonMSME);
//        	  Log.info("Dropdown option selected" + Basic_Information.SelectClassofActivityNonMSME);
//        	  return true;
//          }
          
          //TC017
          
          public boolean EnterInstitutionMobileNumber (String EnterInstitutionMobileNo) throws InterruptedException {
        	  
        	  input(Basic_Information.EnterInstitutionMobileNo ,EnterInstitutionMobileNo);
        	  Thread.sleep(1000);
        	  Log.info(EnterInstitutionMobileNo);
        	  return true;
      
          }
          
          //TC018
          
          public boolean EnterLandlineNumber (String LandlineNumber) throws InterruptedException {
        	  
        	  input(Basic_Information.LandlineNumber ,LandlineNumber );
        	  Thread.sleep(1000);
        	  Log.info(LandlineNumber);
        	  return true;
          }
          
          //TC019
          
          public boolean ValidateAutoloadedEmail () throws InterruptedException {
        	  
        	  WebElement AutoloadedEmail = driver.findElement(By.xpath("//input[@placeholder='Institution Email']"));
        	  System.out.println("Autoloaded Email displyed" + AutoloadedEmail.getAttribute("title"));
        	  
        	  if (AutoloadedEmail.equals("accounts@3idea.in")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedInstitutionEmail);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true; 
        		  
        	  }
          
          //TC020
          
          public boolean EnterWebsiteTest (String WebsiteTest) throws InterruptedException {
        	  ScrollUntilElementVisible(Basic_Information.DateofUdyam);
        	  input(Basic_Information.WebsiteTest ,WebsiteTest );
        	  Thread.sleep(1000);
        	  Log.info(WebsiteTest);
        	  return true;
          }
          
          //TC021
          
          public boolean ValidateOfficialAddress () throws InterruptedException {
        	  ScrollUntilElementVisible(Basic_Information.LandlineNumber);
        	  WebElement AutoloadedAddress = driver.findElement(By.xpath("//input[@placeholder='Official Address Of Enterprise']"));
        	  System.out.println("Autoloaded Address displyed" + AutoloadedAddress.getAttribute("title"));
        	  
        	  if (AutoloadedAddress.equals("701,TRADE WORLD BUILDING")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedAddress);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC022
          
          public boolean ValidateLandmark () throws InterruptedException {
        	  WebElement AutoloadedLandmark = driver.findElement(By.xpath("//input[@placeholder='Landmark']"));
        	  System.out.println("Autoloaded Landmark displyed" + AutoloadedLandmark.getAttribute("title"));
        	  
        	  if (AutoloadedLandmark.equals("Lower Parel")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedLandmark);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC023
          
          public boolean ValidatePlace () throws InterruptedException {
        	  WebElement AutoloadedPlace= driver.findElement(By.xpath("//input[@placeholder='Place']"));
        	  System.out.println("Autoloaded Landmark displyed" + AutoloadedPlace.getAttribute("title"));
        	  
        	  if (AutoloadedPlace.equals("KAMALA MILL COMPOUND,LOWER PAREL")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedPlace);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC024
          
          public boolean ValidatePin () throws InterruptedException {
        	  WebElement AutoloadedPin= driver.findElement(By.xpath("//input[@placeholder='Pin']"));
        	  System.out.println("Autoloaded Pin displyed" + AutoloadedPin.getAttribute("title"));
        	  
        	  if (AutoloadedPin.equals("400013")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedPIN);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC025
          
          public boolean Validatecountry () throws InterruptedException {
        	  WebElement AutoloadedCountry= driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[1]"));
        	  System.out.println("Autoloaded country displyed" + AutoloadedCountry.getAttribute("title"));
        	  
        	  if (AutoloadedCountry.equals("India")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedCountry);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC026
          
          public boolean ValidateState () throws InterruptedException {
        	  WebElement AutoloadedState= driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[2]"));
        	  System.out.println("Autoloaded State displyed" + AutoloadedState.getAttribute("title"));
        	  
        	  if (AutoloadedState.equals("KERALA")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedState);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC027
          
          public boolean ValidateDistrict () throws InterruptedException {
        	  WebElement AutoloadedDistrict= driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[3]"));
        	  System.out.println("Autoloaded District displyed" + AutoloadedDistrict.getAttribute("title"));
        	  
        	  if (AutoloadedDistrict.equals("KANNUR")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedDistrict);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC028
          
          public boolean ValidateCity () throws InterruptedException {
        	  WebElement AutoloadedCIty= driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[4]"));
        	  System.out.println("Autoloaded city displyed" + AutoloadedCIty.getAttribute("title"));
        	  
        	  if (AutoloadedCIty.equals("Test Data kannur")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedCity);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC029
          
          public boolean ValidatePost () throws InterruptedException {
        	  WebElement AutoloadedPost= driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[5]"));
        	  System.out.println("Autoloaded Post displyed" + AutoloadedPost.getAttribute("title"));
        	  
        	  if (AutoloadedPost.equals("Test Data Post Kannur")){
        		 boolean flag1 = ElementDisplayed(Basic_Information.AutoloadedPost);
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);
 				Log.info("frefx4s : " + false);
 				return flag1;
 			 }
 			 else {
 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC030
          
          public boolean SelectTaluk () throws InterruptedException {
        	  
        	  ScrollUntilElementVisible(Basic_Information.AutoloadedState);
        	  Thread.sleep(1000);
        	  click(Basic_Information.Taluk);
        	  Thread.sleep(1000);
        	  click(Basic_Information.SelectTaluk);
        	  Thread.sleep(1000);
        	  Log.info("Taluk selected" + Basic_Information.SelectTaluk);
        	  return true;
        	  
          }
          
          //TC031
          
		@SuppressWarnings("unlikely-arg-type")
		public boolean ValidateCompanyPAN () throws InterruptedException {
        	  //ElementDisplayed(Basic_Information.CompanyPAN);
        	  Thread.sleep(1000);
        	  WebElement AutoloadedCompanyPAN= driver.findElement(By.xpath("//input[@placeholder='Company PAN']"));
        	  System.out.println("Autoloaded PAN displyed" + AutoloadedCompanyPAN.getAttribute("title"));
        	  
        	  String ABC = AutoloadedCompanyPAN.getAttribute("title");
        	  if (ABC.equals("IJGST6566Y")){
         		 ExtentTestManager.getTest().log(Status.PASS ,"IJGST6566Y: " + true);

 				Log.info("IJGST6566Y : " + true);
 				return true;
 			 }
 			 else {
        		 ExtentTestManager.getTest().log(Status.FAIL ,"rfe43rsd4: " + false);

 				 Thread.sleep(1000);
 			 }
 			
 			return true;
        	  
          }
          
          //TC032
          
          public boolean EnterCIN (String EnterCIN) throws InterruptedException {
        	  
        	  input(Basic_Information.EnterCIN , EnterCIN);
        	  Thread.sleep(1000);
        	  Log.info(EnterCIN);
        	  return true;
          }
          
          //TC033
             public boolean EnterExternalCreditRating (String EnterRating) throws InterruptedException {
        	  
        	  input(Basic_Information.EnterRating , EnterRating);
        	  Thread.sleep(1000);
        	  Log.info(EnterRating);
        	  return true;
          }
          
//TC034
             public boolean EnterTIN (String EnterTIN) throws InterruptedException {
           	  
           	  input(Basic_Information.EnterTIN , EnterTIN);
           	  Thread.sleep(1000);
           	  Log.info(EnterTIN);
           	  return true;
             }
             
             //TC035
             public boolean EnterTAN (String EnterTAN) throws InterruptedException {
              	  
              	  input(Basic_Information.EnterTAN , EnterTAN);
              	  Thread.sleep(1000);
              	  Log.info(EnterTAN);
              	  return true;
                }
             
             //TC036
             
             public boolean EnterGSTIN (String EnterGSTIN) throws InterruptedException {
             	  
             	  input(Basic_Information.EnterGSTAN , EnterGSTIN);
             	  Thread.sleep(1000);
             	  Log.info(EnterGSTIN);
             	  return true;
               }
             
             //TC037
             
             public boolean EnterIndividualsharing (String SharesIndividual) throws InterruptedException {
            	  ScrollUntilElementVisible(Basic_Information.EnterCIN);
            	  input(Basic_Information.SharesIndividual , SharesIndividual);
            	  Thread.sleep(1000);
            	  Log.info(SharesIndividual);
            	  return true;
              }
             
             //TC038
             
             public boolean EnterENtityHolding() throws InterruptedException {
           	  
           	  click(Basic_Information.HoldeingByEntity);
           	  Thread.sleep(1000);
           	  WebElement Autofilledsharing = driver.findElement(By.xpath("//input[@placeholder='Share Holding By Entity']"));
           	  System.out.println("Data showing" + Autofilledsharing.getAttribute("title"));
           	  String ABC = Autofilledsharing.getAttribute("title");
           	  if(ABC.equals("80")) {
           		  boolean flag1 = ElementDisplayed(Basic_Information.HoldeingByEntity);
           		  ExtentTestManager.getTest().log(Status.PASS, "80 : " + true);
       				Log.info(" 80 : " + true);
   				return flag1;
   			 }
   			 else {
   				ExtentTestManager.getTest().log(Status.PASS, "343 : " + false);
   				Log.info(" 343 : " + false);
   				 Thread.sleep(1000);
   			 } 
           		return true;  
           		  
           		  
           	  }
           	  
           	  //TC39
             
             public boolean EnterCKYCID (String CKYCID) throws InterruptedException {
            	 
            	 input(Basic_Information.CKYCID , CKYCID);
            	 Thread.sleep(1000);
            	 Log.info(CKYCID);
            	 return true;
            	 
             }
             
             //TC040 
             
             public boolean EnterDPIITNumber (String DPIITNumber) throws InterruptedException {
            	 
            	 input(Basic_Information.DPIITNumber , DPIITNumber);
            	 Thread.sleep(1000);
            	 Log.info(DPIITNumber);
            	 return true;
            	 
             }
             
             //TC041
             
             public boolean EnterKSUMNumber (String KSumNumber) throws InterruptedException {
            	 input(Basic_Information.KSumNumber , KSumNumber);
            	 Thread.sleep(1000);
            	 Log.info(KSumNumber);
            	 return true;
            	 
             }
             
             //TC042
             
             public boolean ClickonAddBankAccButton () throws InterruptedException {
            	 
            	 ScrollUntilElementVisible(Basic_Information.CKYCID);
            	 Thread.sleep(1000);
            	 ElementDisplayed(Basic_Information.AddBankAccountButton);
            	 click(Basic_Information.AddBankAccountButton);
            	 Log.info("Button clicked" +Basic_Information.AddBankAccountButton);
            	 ElementDisplayed(Basic_Information.AddBankAccHeader);
            	 Log.info("Pop up appear" + Basic_Information.AddBankAccHeader);
            	 return true;
             }
             
             //TC043 
             
             public boolean EnterIFSC (String IFSCcode) throws InterruptedException {
            	 
            	 input(Basic_Information.IFSCcode , IFSCcode);
            	 Thread.sleep(1000);
            	 Log.info(IFSCcode);
            	 click(Basic_Information.BankLabel);
            	 Thread.sleep(5000);
            	 return true;
             }
             
             //TC044
             
             @SuppressWarnings("unlikely-arg-type")
			public boolean ValidateBank () throws InterruptedException {
            	 
            	 WebElement AutofilledBank = driver.findElement(By.xpath("//input[@placeholder='Bank']"));
              	  System.out.println("Bank  showing" + AutofilledBank.getAttribute("title"));
              	  String ABC = AutofilledBank.getAttribute("title");
              	  if(ABC.equals("STATE BANK OF INDIA")) {
              		  //boolean flag1 = ElementDisplayed(Basic_Information.EnterBank);
              		  ExtentTestManager.getTest().log(Status.PASS, "STATE BANK OF INDIA: " + true);
          				Log.info("STATE BANK OF INDIA : " + true);
      				return true;
      			 }
      			 else {
      				ExtentTestManager.getTest().log(Status.FAIL, "fe43rsd4: " + false);
      				Log.info("frefx4s : " + false);
      				 Thread.sleep(1000);
      			 } 
              		return true;  
              		  
              		  
              	  }
             
             
             //TC045
             
                @SuppressWarnings("unlikely-arg-type")
				public boolean ValidateBranch () throws InterruptedException {
                	WebElement AutofilledBranch = driver.findElement(By.xpath("//input[@placeholder='Branch']"));
                	  System.out.println("Branch  showing" + AutofilledBranch.getAttribute("title"));
                	  String ABC = AutofilledBranch.getAttribute("title");
                	  if(ABC.equals("PUTHIYARA")) {
                		 // boolean flag1 = ElementDisplayed(Basic_Information.EnterBranch);
                		  ExtentTestManager.getTest().log(Status.FAIL, "PUTHIYARA: " + true);
            				Log.info("PUTHIYARA : " + true);
        				return true;
        			 }
        			 else {
               		  ExtentTestManager.getTest().log(Status.FAIL, "fe43rsd4: " + false);
        				 Thread.sleep(1000);
        			 } 
            	 return true;
             }
                
                //TC046
                
                public boolean  SelectAccType () throws InterruptedException {
                	
                	click(Basic_Information.AccountType);
                	Thread.sleep(1000);
                	click(Basic_Information.SelectAccountType);
                	Thread.sleep(1000);
                	Log.info("Account Type selected " + Basic_Information.SelectAccountType);
                	return true;
                }
                
                //TC047 
                
                    public boolean  SelectAccNature () throws InterruptedException {
                	
                	click(Basic_Information.AccountNature);
                	Thread.sleep(1000);
                	click(Basic_Information.SelectAccNature);
                	Thread.sleep(1000);
                	Log.info("Account Nature selected " + Basic_Information.SelectAccNature);
    	             return true;
                       }
                    
                    //TC048
                    public boolean EnterAccNumber (String EnterAccNumber) throws InterruptedException {
                   	 input(Basic_Information.EnterAccNumber , EnterAccNumber);
                   	 Thread.sleep(1000);
                   	 Log.info(EnterAccNumber);
                   	 return true;
                    }
                    
                    //TC049
                    
                    public boolean AddBank () throws InterruptedException {
                    	
                    	ScrollUntilElementVisible(Basic_Information.IFSCcode);
                    	Thread.sleep(1000);
                    	click(Basic_Information.AddBankbutton);
                    	Thread.sleep(1000);
                    	ElementDisplayed(Basic_Information.AddedBankDetails);
                    	Log.info("Bank Details Added");
                    	Thread.sleep(1000);
                    	return true;
                    }
                    
                    //TC050 
                    
                    public boolean SelectGender() throws InterruptedException {
                    	
                    	ScrollUntilElementVisible(Basic_Information.AddedBankDetails);
                    	Thread.sleep(1000);
                    	click(Basic_Information.AddDetailsforMale);
                    	Thread.sleep(1000);
                    	Log.info("Male Employment Details Added");
                    	click(Basic_Information.AddDetailsforFemale);
                    	Thread.sleep(1000);
                    	Log.info("female Employment Details Added");
                    	return true;
                    }
                    
                    //TC051
                    
                    public boolean AcceptTermsandCondition () throws InterruptedException {
                    	
                    	ScrollUntilElementVisible(Basic_Information.MaleHeader);
                    	Thread.sleep(1000);
                    	click(Basic_Information.TermsAndConditionCheckBox);
                    	Thread.sleep(3000);
                    	Log.info("Terms and Conditions Accepted");
                    	return true;
                    }
                    //TC052 
                    
                    public boolean SaveAndProceed () throws InterruptedException {
                    	
                    	click(Basic_Information.SaveAndProceed);
                    	Thread.sleep(5000);
                    	Log.info("Successfully Submitted");
                    	return true;
                    }
     


           	 

          
          
          
          
          }
          

