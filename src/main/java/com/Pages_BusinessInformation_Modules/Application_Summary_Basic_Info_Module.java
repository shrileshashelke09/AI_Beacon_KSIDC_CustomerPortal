package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Application_Summary_Basic_Info;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class Application_Summary_Basic_Info_Module extends Base_Class {

	Application_Summary_Basic_Info Application_Summary = new Application_Summary_Basic_Info();

	public boolean login() throws InterruptedException, IOException {
		Login();
		ElementToBeVisible(Application_Summary.ContinueButton);
		Log.info("Logged in successfully" + Application_Summary.ContinueButton);
		return true;
	}

	public boolean ApplicationSummaryPage() throws InterruptedException {

		click(Application_Summary.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Application_Summary.BusinessInfo);
		Log.info("Application summary page landed" + Application_Summary.ContinueButton);
		return true;

	}

	public boolean BusinessInfoStage() throws InterruptedException {

		ElementDisplayed(Application_Summary.BusinessInfo);
		Thread.sleep(1000);
		Log.info("'Business Information' stage is selected at the top." + Application_Summary.BusinessInfo);
		return true;
	}

	public boolean BasicInfooption() throws InterruptedException {

		ElementDisplayed(Application_Summary.BasicInfo);
		Thread.sleep(1000);
		Log.info("'Basic Information' page name is selected in 'Go To Page'." + Application_Summary.BasicInfo);
		return true;
	}

	public boolean BasicInfoPage() throws InterruptedException {

		ElementDisplayed(Application_Summary.BasicInfoPageTitle);
		Thread.sleep(1000);
		Log.info("'Basic Information' page is opened in the window." + Application_Summary.BasicInfoPageTitle);
		return true;
	}

	// Udyam No

	public boolean ValidateUdyamNO() throws InterruptedException {
		ScrollUntilElementVisible(Application_Summary.BusinessInfo);
		Thread.sleep(1000);
		WebElement AutoloadedUdyamNO = driver.findElement(By.xpath("//input[@name='MSMEUdyamNoOrUdyogAadhaar']"));
		System.out.println("Autoloaded Udyam No displyed" + AutoloadedUdyamNO.getAttribute("title"));

		String ABC = AutoloadedUdyamNO.getAttribute("title");
		if (ABC.equals(AutoloadedUdyamNO.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedUdyamNO.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	// Name Of Enterprise

	public boolean ValidateNameofEnterprise() throws InterruptedException {

		WebElement AutoloadedNameofEnterprise = driver.findElement(By.xpath("//input[@name='EnterpriseName']"));
		System.out.println("Autoloaded Name of Enterprise displyed" + AutoloadedNameofEnterprise.getAttribute("title"));

		String ABC = AutoloadedNameofEnterprise.getAttribute("title");
		if (ABC.equals(AutoloadedNameofEnterprise.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedNameofEnterprise.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateTypeOfInstitutionOrganizations() throws InterruptedException {

		WebElement AutoloadedTypeOfInstitutionOrganizations = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[1]"));
		System.out.println("Autoloaded Type Of Institution Organizations displyed"
				+ AutoloadedTypeOfInstitutionOrganizations.getAttribute("title"));

		String ABC = AutoloadedTypeOfInstitutionOrganizations.getAttribute("title");
		if (ABC.equals(AutoloadedTypeOfInstitutionOrganizations.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedTypeOfInstitutionOrganizations.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateClassofActivity() throws InterruptedException {

		WebElement AutoloadedClassofActivity = driver.findElement(
				By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[2]"));
		System.out.println("Autoloaded Class of Activity displyed" + AutoloadedClassofActivity.getAttribute("title"));

		String ABC = AutoloadedClassofActivity.getAttribute("title");
		if (ABC.equals(AutoloadedClassofActivity.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedClassofActivity.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDateOfIncorporation() throws InterruptedException {

		WebElement AutoloadedDateOfIncorporation = driver.findElement(By.xpath("(//div[@class='valid'])[1]"));
		System.out.println(
				"Autoloaded Date Of Incorporation displyed" + AutoloadedDateOfIncorporation.getAttribute("title"));

		String ABC = AutoloadedDateOfIncorporation.getAttribute("title");
		if (ABC.equals(AutoloadedDateOfIncorporation.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedDateOfIncorporation.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateDateOfUdyamRegistration() throws InterruptedException {

		WebElement AutoloadedDateOfUdyamRegistration = driver.findElement(By.xpath("(//div[@class='valid'])[2]"));
		System.out.println("Autoloaded Date Of Udyam Registration displyed"
				+ AutoloadedDateOfUdyamRegistration.getAttribute("title"));

		String ABC = AutoloadedDateOfUdyamRegistration.getAttribute("title");
		if (ABC.equals(AutoloadedDateOfUdyamRegistration.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS,
					AutoloadedDateOfUdyamRegistration.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateInstitutionMobile() throws InterruptedException {

		WebElement AutoloadedInstitutionMobile = driver.findElement(By.xpath("//input[@name='Mobile']"));
		System.out
				.println("Autoloaded Institution Mobile displyed" + AutoloadedInstitutionMobile.getAttribute("title"));

		String ABC = AutoloadedInstitutionMobile.getAttribute("title");
		if (ABC.equals(AutoloadedInstitutionMobile.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedInstitutionMobile.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	public boolean ValidateLandLineNo() throws InterruptedException {
		ScrollUntilElementVisible(Application_Summary.scrolltoDate);
		Thread.sleep(1000);
		WebElement AutoloadedLandLineNo = driver.findElement(By.xpath("//input[@name='LandLineNo']"));
		System.out
				.println("Autoloaded LandLine No displyed" + AutoloadedLandLineNo.getAttribute("title"));

		String ABC = AutoloadedLandLineNo.getAttribute("title");
		if (ABC.equals(AutoloadedLandLineNo.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandLineNo.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateEmailID() throws InterruptedException {
		WebElement AutoloadedEmailID = driver.findElement(By.xpath("//input[@name='EmailID']"));
		System.out.println("Autoloaded LandLine No displyed" + AutoloadedEmailID.getAttribute("title"));

		String ABC = AutoloadedEmailID.getAttribute("title");
		if (ABC.equals(AutoloadedEmailID.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedEmailID.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateWebsite() throws InterruptedException {
		WebElement AutoloadedWebsite = driver.findElement(By.xpath("//input[@name='Website']"));
		System.out.println("Autoloaded Website displyed" + AutoloadedWebsite.getAttribute("title"));

		String ABC = AutoloadedWebsite.getAttribute("title");
		if (ABC.equals(AutoloadedWebsite.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedWebsite.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateAddress() throws InterruptedException {
		WebElement AutoloadedAddress = driver.findElement(By.xpath("//input[@name='Address']"));
		System.out.println("Autoloaded Address displyed" + AutoloadedAddress.getAttribute("title"));

		String ABC = AutoloadedAddress.getAttribute("title");
		if (ABC.equals(AutoloadedAddress.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedAddress.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateLandMark() throws InterruptedException {
		WebElement AutoloadedLandMark = driver.findElement(By.xpath("//input[@name='LandMark']"));
		System.out.println("Autoloaded LandMark displyed" + AutoloadedLandMark.getAttribute("title"));

		String ABC = AutoloadedLandMark.getAttribute("title");
		if (ABC.equals(AutoloadedLandMark.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedLandMark.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidatePlace() throws InterruptedException {
		WebElement AutoloadedPlace = driver.findElement(By.xpath("//input[@name='Place']"));
		System.out.println("Autoloaded Place displyed" + AutoloadedPlace.getAttribute("title"));

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
	
	public boolean ValidatePin() throws InterruptedException {
		WebElement AutoloadedPin = driver.findElement(By.xpath("//input[@name='Pin']"));
		System.out.println("Autoloaded Pin displyed" + AutoloadedPin.getAttribute("title"));

		String ABC = AutoloadedPin.getAttribute("title");
		if (ABC.equals(AutoloadedPin.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedPin.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}

	
	public boolean ValidateCountry() throws InterruptedException {

		WebElement AutoloadedCountry = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[3]"));
		System.out.println("Autoloaded Class of Activity displyed" + AutoloadedCountry.getAttribute("title"));

		String ABC = AutoloadedCountry.getAttribute("title");
		if (ABC.equals(AutoloadedCountry.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCountry.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}

		return true;
	}
	
	public boolean ValidateState() throws InterruptedException {

		WebElement AutoloadedState = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[4]"));
		System.out.println("Autoloaded State of Activity displyed" + AutoloadedState.getAttribute("title"));

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
	
	public boolean ValidateDistrict() throws InterruptedException {

		ScrollUntilElementVisible(Application_Summary.ScrolltoLandmark);
		Thread.sleep(1000);
		WebElement AutoloadedDistrict = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[5]"));
		System.out.println("Autoloaded District of Activity displyed" + AutoloadedDistrict.getAttribute("title"));

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
	
	
	public boolean ValidateCity() throws InterruptedException {

		WebElement AutoloadedCity = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[6]"));
		System.out.println("Autoloaded City of Activity displyed" + AutoloadedCity.getAttribute("title"));

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
	
	
	public boolean ValidatePost() throws InterruptedException {

		WebElement AutoloadedPost = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[6]"));
		System.out.println("Autoloaded Post of Activity displyed" + AutoloadedPost.getAttribute("title"));

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
	
	public boolean ValidateTaluk() throws InterruptedException {

		WebElement AutoloadedTaluk = driver.findElement(By.xpath("(//div[@class='rz-dropdown rz-state-disabled valid rz-clear form-select select-main'])[7]"));
		System.out.println("Autoloaded Taluk of Activity displyed" + AutoloadedTaluk.getAttribute("title"));

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
	
	public boolean ValidateCompanyPAN() throws InterruptedException {

		ScrollUntilElementVisible(Application_Summary.ScrolltoCity);
		Thread.sleep(1000);
		WebElement AutoloadedCompanyPAN = driver.findElement(By.xpath("//input[@name='MSMECompanyPAN']"));
		System.out.println("Autoloaded CompanyPAN of Activity displyed" + AutoloadedCompanyPAN.getAttribute("title"));

		String ABC = AutoloadedCompanyPAN.getAttribute("title");
		if (ABC.equals(AutoloadedCompanyPAN.getAttribute("title"))) {
			ExtentTestManager.getTest().log(Status.PASS, AutoloadedCompanyPAN.getAttribute("title") + true);
			Log.info(ABC + true);
			return true;
		} else {
			ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

			Thread.sleep(1000);
		}
		return true;
	}
		
		public boolean ValidateExternalCreditRating() throws InterruptedException {
        	WebElement AutoloadedExternalCreditRating = driver.findElement(By.xpath("//input[@name='MSMEBBBRating']"));
			System.out.println("Autoloaded External Credit Rating of Activity displyed" + AutoloadedExternalCreditRating.getAttribute("title"));

			String ABC = AutoloadedExternalCreditRating.getAttribute("title");
			if (ABC.equals(AutoloadedExternalCreditRating.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedExternalCreditRating.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateTIN() throws InterruptedException {
        	WebElement AutoloadedTIN = driver.findElement(By.xpath("//input[@name='MSMETIN']"));
			System.out.println("Autoloaded TIN of Activity displyed" + AutoloadedTIN.getAttribute("title"));

			String ABC = AutoloadedTIN.getAttribute("title");
			if (ABC.equals(AutoloadedTIN.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedTIN.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		
		public boolean ValidateGSTIN() throws InterruptedException {
        	WebElement AutoloadedGSTIN = driver.findElement(By.xpath("//input[@name='MSMEGSTIN']"));
			System.out.println("Autoloaded GSTIN of Activity displyed" + AutoloadedGSTIN.getAttribute("title"));

			String ABC = AutoloadedGSTIN.getAttribute("title");
			if (ABC.equals(AutoloadedGSTIN.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedGSTIN.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateMSMEShareholdingByIndividuals() throws InterruptedException {
        	WebElement AutoloadedMSMEShareholdingByIndividuals = driver.findElement(By.xpath("//input[@name='MSMEShareholdingByIndividuals']"));
			System.out.println("Autoloaded MSME Share holding By Individuals of Activity displyed" + AutoloadedMSMEShareholdingByIndividuals.getAttribute("title"));

			String ABC = AutoloadedMSMEShareholdingByIndividuals.getAttribute("title");
			if (ABC.equals(AutoloadedMSMEShareholdingByIndividuals.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedMSMEShareholdingByIndividuals.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateMSMEShareHoldingByEntity() throws InterruptedException {
        	WebElement AutoloadedMSMEShareHoldingByEntity = driver.findElement(By.xpath("//input[@name='MSMEShareHoldingByEntity']"));
			System.out.println("Autoloaded Share Holding By Entity of Activity displyed" + AutoloadedMSMEShareHoldingByEntity.getAttribute("title"));

			String ABC = AutoloadedMSMEShareHoldingByEntity.getAttribute("title");
			if (ABC.equals(AutoloadedMSMEShareHoldingByEntity.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedMSMEShareHoldingByEntity.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateCKYCID() throws InterruptedException {
			ScrollUntilElementVisible(Application_Summary.ScrolltoTAN);
			Thread.sleep(1000);
        	WebElement AutoloadedCKYCID = driver.findElement(By.xpath("//input[@name='MSMECKYCID']"));
			System.out.println("Autoloaded CKYCID of Activity displyed" + AutoloadedCKYCID.getAttribute("title"));

			String ABC = AutoloadedCKYCID.getAttribute("title");
			if (ABC.equals(AutoloadedCKYCID.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedCKYCID.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateDPIITNumber() throws InterruptedException {
			ScrollUntilElementVisible(Application_Summary.ScrolltoTAN);
			Thread.sleep(1000);
        	WebElement AutoloadedDPIITNumber = driver.findElement(By.xpath("//input[@name='MSMEDPIITNumber']"));
			System.out.println("Autoloaded DPIIT Number of Activity displyed" + AutoloadedDPIITNumber.getAttribute("title"));

			String ABC = AutoloadedDPIITNumber.getAttribute("title");
			if (ABC.equals(AutoloadedDPIITNumber.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedDPIITNumber.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateKSUMNumber() throws InterruptedException {
        	WebElement AutoloadedKSUMNumber = driver.findElement(By.xpath("//input[@name='MSMEKSUMNumber']"));
			System.out.println("Autoloaded KSUM Number of Activity displyed" + AutoloadedKSUMNumber.getAttribute("title"));

			String ABC = AutoloadedKSUMNumber.getAttribute("title");
			if (ABC.equals(AutoloadedKSUMNumber.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedKSUMNumber.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean clickonBankDetails () throws InterruptedException {
			
			click(Application_Summary.BankDetails);
			Thread.sleep(1000);
			ElementDisplayed(Application_Summary.BankDetailsHader);
			Log.info("Pop up displayed" + Application_Summary.BankDetailsHader);
			return true;
			
		}
		
		public boolean ValidateIFSCCOde() throws InterruptedException {
        	WebElement AutoloadedIFSCCoder = driver.findElement(By.xpath("//input[@name='IFSCCode']"));
			System.out.println("Autoloaded IFSC Code of Activity displyed" + AutoloadedIFSCCoder.getAttribute("title"));

			String ABC = AutoloadedIFSCCoder.getAttribute("title");
			if (ABC.equals(AutoloadedIFSCCoder.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedIFSCCoder.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}

		public boolean ValidateBank() throws InterruptedException {
        	WebElement AutoloadedBank = driver.findElement(By.xpath("//input[@name='Bank']"));
			System.out.println("Autoloaded Bank of Activity displyed" + AutoloadedBank.getAttribute("title"));

			String ABC = AutoloadedBank.getAttribute("title");
			if (ABC.equals(AutoloadedBank.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedBank.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		
		public boolean ValidateBranch() throws InterruptedException {
        	WebElement AutoloadedBranch = driver.findElement(By.xpath("//input[@name='Branch']"));
			System.out.println("Autoloaded Branch of Activity displyed" + AutoloadedBranch.getAttribute("title"));

			String ABC = AutoloadedBranch.getAttribute("title");
			if (ABC.equals(AutoloadedBranch.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedBranch.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateAccountType() throws InterruptedException {
        	WebElement AutoloadedAccountType = driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[1]"));
			System.out.println("Autoloaded Account Type of Activity displyed" + AutoloadedAccountType.getAttribute("title"));

			String ABC = AutoloadedAccountType.getAttribute("title");
			if (ABC.equals(AutoloadedAccountType.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedAccountType.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateAccountNature() throws InterruptedException {
        	WebElement AutoloadedAccountNature = driver.findElement(By.xpath("(//div[@class='rz-dropdown valid rz-clear form-select select-main'])[2]"));
			System.out.println("Autoloaded Account Nature of Activity displyed" + AutoloadedAccountNature.getAttribute("title"));

			String ABC = AutoloadedAccountNature.getAttribute("title");
			if (ABC.equals(AutoloadedAccountNature.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedAccountNature.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}

		public boolean ValidateAccountNumber() throws InterruptedException {
        	WebElement AutoloadedAccountNumber = driver.findElement(By.xpath("//input[@name='AccountNumber']"));
			System.out.println("Autoloaded Account Number of Activity displyed" + AutoloadedAccountNumber.getAttribute("title"));

			String ABC = AutoloadedAccountNumber.getAttribute("title");
			if (ABC.equals(AutoloadedAccountNumber.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedAccountNumber.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ClosethePopUp () throws InterruptedException {
			
			click(Application_Summary.CloseIcon);
			Thread.sleep(1000);
			Log.info("Popup Closed" + Application_Summary.CloseIcon);
			return true;
		}

		public boolean TotalGenderCount () throws InterruptedException {
			
			ScrollUntilElementVisible(Application_Summary.BankDetails);
			Thread.sleep(1000);
			ElementDisplayed(Application_Summary.TotalGenderCount);
			Log.info("Total Gendder count displayed" + Application_Summary.TotalGenderCount);
			return true;
		}
		
		public boolean ValidateMaleCount() throws InterruptedException {
        	WebElement AutoloadedMaleCount = driver.findElement(By.xpath("(//input[@class='count-box disabled'])[1]"));
			System.out.println("Autoloaded Male Count of Activity displyed" + AutoloadedMaleCount.getAttribute("title"));

			String ABC = AutoloadedMaleCount.getAttribute("title");
			if (ABC.equals(AutoloadedMaleCount.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedMaleCount.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateFeMaleCount() throws InterruptedException {
        	WebElement AutoloadedFeMaleCount = driver.findElement(By.xpath("(//input[@class='count-box disabled'])[2]"));
			System.out.println("Autoloaded FeMale Count of Activity displyed" + AutoloadedFeMaleCount.getAttribute("title"));

			String ABC = AutoloadedFeMaleCount.getAttribute("title");
			if (ABC.equals(AutoloadedFeMaleCount.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedFeMaleCount.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean ValidateTransgenderCount() throws InterruptedException {
        	WebElement AutoloadedTransgenderCount = driver.findElement(By.xpath("(//input[@class='count-box disabled'])[3]"));
			System.out.println("Autoloaded Transgender Count of Activity displyed" + AutoloadedTransgenderCount.getAttribute("title"));

			String ABC = AutoloadedTransgenderCount.getAttribute("title");
			if (ABC.equals(AutoloadedTransgenderCount.getAttribute("title"))) {
				ExtentTestManager.getTest().log(Status.PASS, AutoloadedTransgenderCount.getAttribute("title") + true);
				Log.info(ABC + true);
				return true;
			} else {
				ExtentTestManager.getTest().log(Status.FAIL, "rfe43rsd4: " + false);

				Thread.sleep(1000);
			}

		return true;
	}
		
		public boolean TermsAndConditionCheckbox () throws InterruptedException {
			
			ElementDisplayed(Application_Summary.Checkbox);
			Thread.sleep(1000);
			Log.info("Terms and Condition checkbox checked" + Application_Summary.Checkbox);
			return true;
		}
		 
		public boolean PresenseOfContinueButton () throws InterruptedException {
			
			ScrollUntilElementVisible(Application_Summary.Checkbox);
			Thread.sleep(1000);
			ElementDisplayed(Application_Summary.VisibiliyofContinueButton);
			Thread.sleep(1000);
			Log.info("Continue Button visible" + Application_Summary.VisibiliyofContinueButton);
			return true;
		}
}
