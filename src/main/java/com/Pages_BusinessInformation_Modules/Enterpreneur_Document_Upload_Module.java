package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Enterpreneur_Document_Upload;
import com.Utility.Log;

public class Enterpreneur_Document_Upload_Module extends Base_Class {

	Enterpreneur_Document_Upload Enterpreneur_Document_Upload = new Enterpreneur_Document_Upload();

	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();
		return true;

	}

	// TC002

	public boolean AccessDocUpload() throws InterruptedException {

		click(Enterpreneur_Document_Upload.ContinueButton);
		Thread.sleep(3000);
		Log.info("Document Upload Option clicked" + Enterpreneur_Document_Upload.DocUpload);
		return true;
	}

	public boolean VerifyHeader() throws InterruptedException {

		ElementDisplayed(Enterpreneur_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		Log.info("Header displayed" + Enterpreneur_Document_Upload.DocUploadHeader);
		return true;
	}

	public boolean ClickonDocument() throws InterruptedException {

		ScrollUntilElementVisible(Enterpreneur_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		click(Enterpreneur_Document_Upload.ClicktoDocument);
		Thread.sleep(1000);
		ScrollUP();
		Log.info("PAN Image document clicked and Document details displayed for upload"
				+ Enterpreneur_Document_Upload.ClicktoDocument);
		return true;
	}

	public boolean UploadDocOption() throws InterruptedException {
		ElementDisplayed(Enterpreneur_Document_Upload.UploadDocument);
		Thread.sleep(1000);
		Log.info("Upload option is present" + Enterpreneur_Document_Upload.UploadDocument);
		return true;
	}

	public boolean ValidateDocCriteria() throws InterruptedException {

		ElementDisplayed(Enterpreneur_Document_Upload.DocCriteria);
		Thread.sleep(1000);
		Log.info("Criteria displayed" + Enterpreneur_Document_Upload.DocCriteria);
		return true;
	}

	public boolean UploadFile(String filepath) throws InterruptedException {
		ScrollUP();
		// Thread.sleep(1000);
		UploadFile(Enterpreneur_Document_Upload.UploadDocument, filepath);
		Log.info("Document Uploaded" + Enterpreneur_Document_Upload.UploadDocument);
		Thread.sleep(2000);
		ElementToBeVisible(Enterpreneur_Document_Upload.successpopup);
		Log.info("Success pop up displayed" + Enterpreneur_Document_Upload.successpopup);
		return true;
	}

	public boolean validateOtherIcon() throws InterruptedException {

		ElementDisplayed(Enterpreneur_Document_Upload.OtherIcon);
		Thread.sleep(1000);
		Log.info("Other icon displayed" + Enterpreneur_Document_Upload.OtherIcon);
		return true;
	}
	
	public boolean ValidateUploadedDocument ( ) throws InterruptedException {
		
		ElementDisplayed(Enterpreneur_Document_Upload.UploadedDocument);
		Thread.sleep(1000);
		Log.info("Uploaded documnt displayed" + Enterpreneur_Document_Upload.UploadedDocument);
		return true;
	}
	
	public boolean DownloadDocument () throws InterruptedException {
		
		click(Enterpreneur_Document_Upload.DownloadDocument);
		Thread.sleep(1000);
		Log.info("Document downloaded" + Enterpreneur_Document_Upload.DownloadDocument);
		return true;
	}
	
	public boolean ContinueButtonPresence () throws InterruptedException {
		
		ElementDisplayed(Enterpreneur_Document_Upload.ProcessContinue);
		Thread.sleep(1000);
		Log.info(" continue button displayed" + Enterpreneur_Document_Upload.ProcessContinue);
		return true;
		
	}
	
	public boolean ClickOnContinue () throws InterruptedException {
		click(Enterpreneur_Document_Upload.ProcessContinue);
		Thread.sleep(1000);
		Log.info("Process continued" + Enterpreneur_Document_Upload.ProcessContinue);
		return true;
		
		
	}

}
