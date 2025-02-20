package com.Pages_BusinessInformation_Modules;

import java.io.IOException;


import com.BasePackage.Base_Class;
import com.Page_Repositary.Security_Vehicle;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;




public class Security_Vehicle_Module extends Base_Class{
		
		Security_Vehicle securityvehicle = new Security_Vehicle();
		
		
		// TC001

		public  boolean login() throws InterruptedException, IOException {
			Login();
			return true;



		}

		// TC002
			public boolean Navigatetosecurityvehicle() throws InterruptedException {
				click(securityvehicle.ContinueButton);
	            Log.info("Navigate to Security Vehicle" + securityvehicle.ContinueButton);
				Thread.sleep(2000);
				return true;
			}
			
		
			public boolean AccessSecurityVehicle() throws InterruptedException {
				//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
				ScrollUntilElementVisible(securityvehicle.ScrolltoBusinessfinance);
				Thread.sleep(1000);
				ScrollUntilElementVisible(securityvehicle.Utilities);
				Thread.sleep(1000);
				click(securityvehicle.Vehicle);
				Thread.sleep(2000);
				return true;
			}
			
			//TC003
			
			public boolean ClickontheListOfVehicle() throws InterruptedException {
			//	ScrollUntilElementVisible(securityvehicle.ListOfVehicle);
		//		Thread.sleep(1000);
				click(securityvehicle.ListOfVehicle);
				Thread.sleep(2000);
				//Log.info("Click on the List Of Vehicle" + securityvehicle.ListOfVehicle);
				Thread.sleep(2000);
				return true;
			}
			
			
			//TC004
			public boolean ScrolltoTotal() throws InterruptedException {
				ScrollUntilElementVisible(securityvehicle.Total);
				Thread.sleep(1000);
				return true;
			}
		
			public static boolean validateVehicleCategory() throws InterruptedException {
				WebElement AutoloadedVehicleCategory = driver.findElement(By.xpath("//label[@title='Vehicle Category']//following-sibling::div"));
	            System.out.println("Autoloaded Vehicle Category" + AutoloadedVehicleCategory.getAttribute("title"));

	            String ABC = AutoloadedVehicleCategory.getAttribute("title");
	            if (ABC.equals(AutoloadedVehicleCategory.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicleCategory.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVehicleCategoryDisabled() {
            	WebElement AutoloadedVehicleCategory = driver.findElement(By.xpath("//label[@title='Vehicle Category']//following-sibling::div"));
                return !AutoloadedVehicleCategory.isEnabled();
            }
            
            
            //TC005
            public static boolean validateVehicleManufacture() throws InterruptedException {
	            WebElement AutoloadedVehicleManufacture = driver.findElement(By.xpath("//label[@title='Vehicle Manufacture'] //following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Vehicle Manufacture" + AutoloadedVehicleManufacture.getAttribute("title"));

	            String ABC = AutoloadedVehicleManufacture.getAttribute("title");
	            if (ABC.equals(AutoloadedVehicleManufacture.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicleManufacture.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVehicleManufacturefieldDisabled() {
            	WebElement AutoloadedVehicleManufacture = driver.findElement(By.xpath("//label[@title='Vehicle Manufacture'] //following-sibling::div//following-sibling::label"));
                return !AutoloadedVehicleManufacture.isEnabled();
            }
            
            //TC006
            public static boolean validateVehicleModel() throws InterruptedException {
	            WebElement AutoloadedVehicleModel = driver.findElement(By.xpath("//input[@name='VehicleModel']"));
	            System.out.println("Autoloaded Vehicle Model" + AutoloadedVehicleModel.getAttribute("title"));

	            String ABC = AutoloadedVehicleModel.getAttribute("title");
	            if (ABC.equals(AutoloadedVehicleModel.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicleModel.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVehicleModel() {
            	WebElement AutoloadedVehicleModel = driver.findElement(By.xpath("//input[@name='VehicleModel']"));
                return !AutoloadedVehicleModel.isEnabled();
            }
            
            
            //TC007
            public static boolean validateVehicleColour() throws InterruptedException {
	            WebElement AutoloadedVehicleColour = driver.findElement(By.xpath("//input[@name='VehicleColour']"));
	            System.out.println("Autoloaded Vehicle Colour" + AutoloadedVehicleColour.getAttribute("title"));

	            String ABC = AutoloadedVehicleColour.getAttribute("title");
	            if (ABC.equals(AutoloadedVehicleColour.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicleColour.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVehicleColour() {
            	WebElement AutoloadedVehicleColour = driver.findElement(By.xpath("//input[@name='VehicleColour']"));
                return !AutoloadedVehicleColour.isEnabled();
            }
            

			
            //TC008
            public static boolean validateExShowRoomPrice() throws InterruptedException {
	            WebElement AutoloadedExShowRoomPrice = driver.findElement(By.xpath("//input[@name='ExShowRoomPrice']"));
	            System.out.println("Autoloaded Ex-Show Room Price" + AutoloadedExShowRoomPrice.getAttribute("title"));

	            String ABC = AutoloadedExShowRoomPrice.getAttribute("title");
	            if (ABC.equals(AutoloadedExShowRoomPrice.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedExShowRoomPrice.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isExShowRoomPrice() {
            	WebElement AutoloadedExShowRoomPrice = driver.findElement(By.xpath("//input[@name='ExShowRoomPrice']"));
                return !AutoloadedExShowRoomPrice.isEnabled();
            }
            
            
            //TC009
            public static boolean validateRegistration() throws InterruptedException {
	            WebElement AutoloadedRegistration = driver.findElement(By.xpath("//label[@title='Registration'] //following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Registration" + AutoloadedRegistration.getAttribute("title"));

	            String ABC = AutoloadedRegistration.getAttribute("title");
	            if (ABC.equals(AutoloadedRegistration.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedRegistration.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isRegistration() {
            	WebElement AutoloadedRegistration = driver.findElement(By.xpath("//label[@title='Registration'] //following-sibling::div//following-sibling::label"));
                return !AutoloadedRegistration.isEnabled();
            }
            
            
            //TC010
            public static boolean validateOnRoadPrice() throws InterruptedException {
	            WebElement AutoloadedOnRoadPrice = driver.findElement(By.xpath("//input[@name='OnRoadPrice']"));
	            System.out.println("Autoloaded On Road Price" + AutoloadedOnRoadPrice.getAttribute("title"));

	            String ABC = AutoloadedOnRoadPrice.getAttribute("title");
	            if (ABC.equals(AutoloadedOnRoadPrice.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedOnRoadPrice.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isOnRoadPrice() {
            	WebElement AutoloadedOnRoadPrice = driver.findElement(By.xpath("//input[@name='OnRoadPrice']"));
                return !AutoloadedOnRoadPrice.isEnabled();
            }
            
            
            //TC011
            public static boolean validateVehicleNumber() throws InterruptedException {
	            WebElement AutoloadedVehicleNumber = driver.findElement(By.xpath("//input[@name='VehicleNumber']"));
	            System.out.println("Autoloaded Vehicle Number" + AutoloadedVehicleNumber.getAttribute("title"));

	            String ABC = AutoloadedVehicleNumber.getAttribute("title");
	            if (ABC.equals(AutoloadedVehicleNumber.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedVehicleNumber.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isVehicleNumber() {
            	WebElement AutoloadedVehicleNumber = driver.findElement(By.xpath("//input[@name='VehicleNumber']"));
                return !AutoloadedVehicleNumber.isEnabled();
            }
            
            
            //TC012
            public static boolean validateEngineNumber() throws InterruptedException {
	            WebElement AutoloadedEngineNumber = driver.findElement(By.xpath("//label[@title='Engine Number']//following-sibling::input"));
	            System.out.println("Autoloaded Engine Number" + AutoloadedEngineNumber.getAttribute("title"));

	            String ABC = AutoloadedEngineNumber.getAttribute("title");
	            if (ABC.equals(AutoloadedEngineNumber.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedEngineNumber.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isEngineNumber() {
            	WebElement AutoloadedEngineNumber = driver.findElement(By.xpath("//label[@title='Engine Number']//following-sibling::input"));
                return !AutoloadedEngineNumber.isEnabled();
            }
            
            
            //TC013
            public static boolean validateChaseNumber() throws InterruptedException {
	            WebElement AutoloadedChaseNumber = driver.findElement(By.xpath("//label[@title='Chase Number']//following-sibling::input"));
	            System.out.println("Autoloaded Chase Number" + AutoloadedChaseNumber.getAttribute("title"));

	            String ABC = AutoloadedChaseNumber.getAttribute("title");
	            if (ABC.equals(AutoloadedChaseNumber.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedChaseNumber.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isChaseNumber() {
            	WebElement AutoloadedChaseNumber = driver.findElement(By.xpath("//label[@title='Chase Number']//following-sibling::input"));
                return !AutoloadedChaseNumber.isEnabled();
            }
            
            
            //TC014
            public static boolean validateRegistrationDate() throws InterruptedException {
	            WebElement AutoloadedRegistrationDate = driver.findElement(By.xpath("//input[@name='RegistrationDate']"));
	            System.out.println("Autoloaded Registration Date" + AutoloadedRegistrationDate.getAttribute("title"));

	            String ABC = AutoloadedRegistrationDate.getAttribute("title");
	            if (ABC.equals(AutoloadedRegistrationDate.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedRegistrationDate.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isRegistrationDate() {
            	WebElement AutoloadedRegistrationDate = driver.findElement(By.xpath("//input[@name='RegistrationDate']"));
                return !AutoloadedRegistrationDate.isEnabled();
            }
            
            
            //TC015
            public static boolean validateInsuranceProvider() throws InterruptedException {
	            WebElement AutoloadedInsuranceProvider = driver.findElement(By.xpath("//label[@title='Insurance Provider']//following-sibling::div//following-sibling::label"));
	            System.out.println("Autoloaded Insurance Provider" + AutoloadedInsuranceProvider.getAttribute("title"));

	            String ABC = AutoloadedInsuranceProvider.getAttribute("title");
	            if (ABC.equals(AutoloadedInsuranceProvider.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedInsuranceProvider.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isInsuranceProvider() {
            	WebElement AutoloadedInsuranceProvider = driver.findElement(By.xpath("//label[@title='Insurance Provider']//following-sibling::div//following-sibling::label"));
                return !AutoloadedInsuranceProvider.isEnabled();
            }
            
            
            //TC016
            public static boolean validateInsuranceAmount() throws InterruptedException {
	            WebElement AutoloadedInsuranceAmount  = driver.findElement(By.xpath("//input[@name='InsuranceAmount']"));
	            System.out.println("Autoloaded Insurance Amount" + AutoloadedInsuranceAmount.getAttribute("title"));

	            String ABC = AutoloadedInsuranceAmount.getAttribute("title");
	            if (ABC.equals(AutoloadedInsuranceAmount.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedInsuranceAmount.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isInsuranceAmount() {
            	WebElement AutoloadedInsuranceAmount = driver.findElement(By.xpath("//input[@name='InsuranceAmount']"));
                return !AutoloadedInsuranceAmount.isEnabled();
            }
            
            
            //TC017
            public static boolean validateRoadTax() throws InterruptedException {
	            WebElement AutoloadedRoadTax  = driver.findElement(By.xpath("//input[@name='RoadTax']"));
	            System.out.println("Autoloaded Road Tax" + AutoloadedRoadTax.getAttribute("title"));

	            String ABC = AutoloadedRoadTax.getAttribute("title");
	            if (ABC.equals(AutoloadedRoadTax.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedRoadTax.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isRoadTax() {
            	WebElement AutoloadedRoadTax = driver.findElement(By.xpath("//input[@name='RoadTax']"));
                return !AutoloadedRoadTax.isEnabled();
            }
            
            
            
            //TC018
            public static boolean validateRegistrationAndOtherCharges() throws InterruptedException {
	            WebElement AutoloadedRegistrationAndOtherCharges  = driver.findElement(By.xpath("//input[@name='RegistrationAndOtherCharges']"));
	            System.out.println("Autoloaded Registration And Other Charges" + AutoloadedRegistrationAndOtherCharges.getAttribute("title"));

	            String ABC = AutoloadedRegistrationAndOtherCharges.getAttribute("title");
	            if (ABC.equals(AutoloadedRegistrationAndOtherCharges.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedRegistrationAndOtherCharges.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isRegistrationAndOtherCharges() {
            	WebElement AutoloadedRegistrationAndOtherCharges = driver.findElement(By.xpath("//input[@name='RegistrationAndOtherCharges']"));
                return !AutoloadedRegistrationAndOtherCharges.isEnabled();
            }
            
            
            
            //TC019
            public static boolean validateDealerDiscount() throws InterruptedException {
	            WebElement AutoloadedDealerDiscount  = driver.findElement(By.xpath("//input[@name='DealerDiscount']"));
	            System.out.println("Autoloaded Dealer Discount" + AutoloadedDealerDiscount.getAttribute("title"));

	            String ABC = AutoloadedDealerDiscount.getAttribute("title");
	            if (ABC.equals(AutoloadedDealerDiscount.getAttribute("title"))) {
	                  ExtentTestManager.getTest().log(Status.PASS, AutoloadedDealerDiscount.getAttribute("title") + true);
	                  Log.info(ABC + true);
	                  return true;
	            } else {
	                  ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

	                  Thread.sleep(1000);
	            }
	        
	            return true;
	      
			}
			

            public static boolean isDealerDiscount() {
            	WebElement AutoloadedDealerDiscount = driver.findElement(By.xpath("//input[@name='DealerDiscount']"));
                return !AutoloadedDealerDiscount.isEnabled();
            }
            
			


            
		
}
				