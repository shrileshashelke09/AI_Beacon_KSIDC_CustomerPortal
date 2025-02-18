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
	            System.out.println("Autoloaded Title Holder" + AutoloadedVehicleManufacture.getAttribute("title"));

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
	            System.out.println("Autoloaded Title Holder" + AutoloadedVehicleModel.getAttribute("title"));

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
	            System.out.println("Autoloaded Title Holder" + AutoloadedVehicleColour.getAttribute("title"));

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
	            System.out.println("Autoloaded Title Holder" + AutoloadedExShowRoomPrice.getAttribute("title"));

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
	            System.out.println("Autoloaded Title Holder" + AutoloadedRegistration.getAttribute("title"));

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
	            System.out.println("Autoloaded Title Holder" + AutoloadedOnRoadPrice.getAttribute("title"));

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
            
			


            
		
}
				