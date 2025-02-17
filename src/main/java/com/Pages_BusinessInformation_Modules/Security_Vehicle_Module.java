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
            

			
			


		
}
				