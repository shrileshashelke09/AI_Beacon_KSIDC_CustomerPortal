package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Document_Upload;
import com.Page_Repositary.Misc_Fixed_Asset;
import com.Page_Repositary.Security_Corporate_Guarantee;
import com.Page_Repositary.Security_Document_Upload;
import com.Page_Repositary.Security_Misc_Fixed_Assets;
import com.Page_Repositary.Security_Personal_Guarantee;
import com.Page_Repositary.Security_Summary;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Security_Document_Upload_Module extends Base_Class{

	Security_Summary Sec_Summary = new Security_Summary();
	Security_Document_Upload Sec_Doc_Upload = new Security_Document_Upload();
	
	
	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		click(Sec_Doc_Upload.ContinueButton);
		Log.info("Login successfull");
		return true;

	}

	// TC002

	public boolean VerifySecurityStageAccess() throws InterruptedException {
		
		ScrollUntilElementVisible(Sec_Doc_Upload.SecurtiyStageActive);
		Thread.sleep(1000);
		ScrollUP();
		ElementToBeVisible(Sec_Doc_Upload.SecurtiyStageActive);
		click(Sec_Doc_Upload.SecurtiyStageActive);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Sec_Doc_Upload.SecurtiyStageActive);
		Thread.sleep(1000);
		ElementToBeVisible(Sec_Doc_Upload.SecurtiyStageActive);
		Log.info("User is navigated to the Security stage." + Sec_Doc_Upload.SecurtiyStageActive);
		return true;
	}

	// TC003
	public boolean UploadDocumentComponent() throws InterruptedException {
		
		ElementToBeVisible(Sec_Doc_Upload.SecurityDoumentUploadButton);
		Thread.sleep(1000);
		ElementDisplayed(Sec_Doc_Upload.SecurityDoumentUploadButton);
		Log.info("Document Upload Details button is visible." + Sec_Doc_Upload.SecurityDoumentUploadButton);
		click(Sec_Doc_Upload.SecurityDoumentUploadButton);
		ExtentTestManager.getTest().log(Status.PASS, "Attempt to clicked on 'Upload Document Component'.");
		ElementDisplayed(Sec_Doc_Upload.DocumentUploadHeading);
		return true;
	}
	
	// TC004
		public boolean OpenDocumentunderPlantandMachinery() throws InterruptedException {
			ElementDisplayed(Sec_Doc_Upload.AddMachineryDocumentButton);
			click(Sec_Doc_Upload.AddMachineryDocumentButton);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked on the document add under 'Plant and Machinery'.");
			ScrollUntilElementVisible(Sec_Doc_Upload.COMBUSTION_ENGINE_MACHINERY_DOCUMENT_Heading);
			Thread.sleep(1000);
			ScrollUP();
			return true;
		}
		
		// TC005
		public boolean FileUploadPopUpforPlantandMachinery(String filepath) throws InterruptedException  {
			    String projectPath = System.getProperty("user.dir");
				ScrollUntilElementVisible(Sec_Doc_Upload.UploadDocumentButton);
				Thread.sleep(1000);
	            ScrollUP();
	            UploadFile(Sec_Doc_Upload.UploadDocumentButton , projectPath + filepath);  
	            ExtentTestManager.getTest().log(Status.PASS, "Selected the document add under 'Plant and Machinery'.");
	            return true;
		}
		
		// TC006
		public boolean SelectandOpenPDFDocumentforPlantandMachinery() throws InterruptedException {
			 ElementToBeVisible(Sec_Doc_Upload.successpopup);
			 ElementDisplayed(Sec_Doc_Upload.successpopup);
			 Thread.sleep(1000);
			 ElementDisplayed(Sec_Doc_Upload.UploadedMachineryDocument);
			return true;
		}
		
		// TC007
		public boolean OpenDocumentunderLand() throws InterruptedException {
			ScrollUntilElementVisible(Sec_Doc_Upload.AddLandDocumentButton);
			Thread.sleep(1000);
			ScrollUP();
			click(Sec_Doc_Upload.AddLandDocumentButton);
			ExtentTestManager.getTest().log(Status.PASS, "Clicked on the document add under 'Land'.");
			ScrollUntilElementVisible(Sec_Doc_Upload.TEST_LAND_DATA_DOCUMENT_Heading);
			Thread.sleep(1000);
			ScrollUP();
			return true;
		}
		
		// TC008
		public boolean FileUploadPopUpforLand(String filepath) throws InterruptedException {
			String projectPath = System.getProperty("user.dir");
			ScrollUntilElementVisible(Sec_Doc_Upload.UploadDocumentButton);
			Thread.sleep(1000);
            ScrollUP();
            UploadFile(Sec_Doc_Upload.UploadDocumentButton , projectPath + filepath);  
            ExtentTestManager.getTest().log(Status.PASS, "Selected the document add under 'Land'.");
            return true;
		}
		
		// TC009
		public boolean SelectandOpenPDFDocumentforLand() throws InterruptedException {
			 ElementToBeVisible(Sec_Doc_Upload.successpopup);
			 ElementDisplayed(Sec_Doc_Upload.successpopup);
			 Thread.sleep(1000);
			 ElementDisplayed(Sec_Doc_Upload.UploadedLandDocument);
			return true;
			
		}
		
		// TC010
		public boolean ContinuetoSubmitApplicationandApplicationSummary() throws InterruptedException {
			ElementDisplayed(Sec_Doc_Upload.DocumentUploadContinueButton);
			ScrollUntilElementVisible(Sec_Doc_Upload.DocumentUploadContinueButton);
			Thread.sleep(1000);
			ScrollUP();
			click(Sec_Doc_Upload.DocumentUploadContinueButton);
			ElementToBeVisible(Sec_Doc_Upload.ApplicationSummaryHeading);
			ElementDisplayed(Sec_Doc_Upload.ApplicationSummaryHeading);
			return true;
			
		}

}
