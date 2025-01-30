package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Business_Document_Upload;
import com.Utility.Log;

public class Business_Document_Upload_Module extends Base_Class {

	Business_Document_Upload Entity_Document_Upload = new Business_Document_Upload();

	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();

		return true;

	}

	// TC002

	public boolean NavigatetoBusiness() throws InterruptedException {
		click(Entity_Document_Upload.ContinueButton);
		Thread.sleep(2000);
		return true;
	}

	public boolean DocumentUploadComponentPresence() throws InterruptedException {
		ScrollUntilElementVisible(Entity_Document_Upload.scrolltoStep3);
		Thread.sleep(1000);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Document_Upload.DocUpload);
		Log.info("Document Upload Option displayed" + Entity_Document_Upload.DocUpload);
		return true;

	}

	public boolean AccessDocumentUploadPage() throws InterruptedException {
		click(Entity_Document_Upload.DocUpload);
		Thread.sleep(1000);
		Log.info("Document Upload Option clicked" + Entity_Document_Upload.DocUpload);
		return true;

	}

	public boolean VerifyUploadWindow() throws InterruptedException {
		ElementDisplayed(Entity_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		Log.info("Upload window pop up displayed" + Entity_Document_Upload.DocUploadHeader);
		return true;
	}

	public boolean DocumentEntry() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		ElementDisplayed(Entity_Document_Upload.EnterpreneurDoc);
		Log.info("Enterpreneur doc list displayed" + Entity_Document_Upload.EnterpreneurDoc);
		ElementDisplayed(Entity_Document_Upload.EntityDoc);
		Log.info("Entity doc list displayed" + Entity_Document_Upload.EntityDoc);
		Thread.sleep(1000);
		return true;

	}

	public boolean VerifyHeader() throws InterruptedException {

		ElementDisplayed(Entity_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		Log.info("Header displayed" + Entity_Document_Upload.DocUploadHeader);
		return true;
	}

	public boolean ClickonDoc1() throws InterruptedException {

		ScrollUntilElementVisible(Entity_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		click(Entity_Document_Upload.ClicktoDoc1);
		Thread.sleep(1000);
		ScrollUP();
		Log.info(" document clicked and Document details displayed for upload" + Entity_Document_Upload.ClicktoDoc1);
		return true;
	}

	public boolean DocumentWindowName() {
		ElementDisplayed(Entity_Document_Upload.DocumentwindowName);
		Log.info("Document window displayed" + Entity_Document_Upload.DocumentwindowName);
		return true;
	}

	public boolean DocumentName() {

		ElementDisplayed(Entity_Document_Upload.DocumentName);
		Log.info("Document Name displayed" + Entity_Document_Upload.DocumentName);
		return true;
	}

	public boolean UploadDocOption() throws InterruptedException {
		ElementDisplayed(Entity_Document_Upload.UploadDocument);
		Thread.sleep(1000);
		Log.info("Upload option is present" + Entity_Document_Upload.UploadDocument);
		return true;
	}

	public boolean UploadDocFile(String filepath) throws InterruptedException {
		ScrollUP();
		// Thread.sleep(1000);
		UploadFile(Entity_Document_Upload.UploadDocument, filepath);
		Thread.sleep(3000);
		ScrollUP();
		Thread.sleep(1000);
		ScrollUP();
		click(Entity_Document_Upload.ClicktoDoc2);
		ScrollUP();
		UploadFile(Entity_Document_Upload.UploadDocument, filepath);
		Thread.sleep(3000);
		return true;
	}

	public boolean UploadedDocument() throws InterruptedException {

		ElementDisplayed(Entity_Document_Upload.UploadedDocument);
		Thread.sleep(1000);
		Log.info("Uploaded documnt displayed" + Entity_Document_Upload.UploadedDocument);
		return true;
	}

	public boolean ViewButtonPresence() throws InterruptedException {

		ElementDisplayed(Entity_Document_Upload.ViewDocument);
		Thread.sleep(1000);
		Log.info("View buton displayed" + Entity_Document_Upload.ViewDocument);
		return true;
	}

	public boolean DownloadButtonPresence() throws InterruptedException {

		ElementDisplayed(Entity_Document_Upload.DownloadDocument);
		Thread.sleep(1000);
		Log.info("Download buton displayed" + Entity_Document_Upload.ViewDocument);
		return true;
	}

	public boolean DeleteButtonPresence() throws InterruptedException {

		ElementDisplayed(Entity_Document_Upload.DeleteDocument);
		Thread.sleep(1000);
		Log.info("Delete buton displayed" + Entity_Document_Upload.DeleteDocument);
		return true;
	}
	
	
	public boolean ClickonView () throws InterruptedException {

		click(Entity_Document_Upload.ViewDocument);
		Thread.sleep(1000);
		Log.info("View buton clicked" + Entity_Document_Upload.ViewDocument);
		click(Entity_Document_Upload.Close);
		Thread.sleep(1000);
		return true;
	}
	
public boolean DownloadDocument () throws InterruptedException {
		
		click(Entity_Document_Upload.DownloadDocument);
		Thread.sleep(1000);
		Log.info("Document downloaded" + Entity_Document_Upload.DownloadDocument);
		return true;
	}

	
	public boolean ContinueButtonPresence () throws InterruptedException {
		
		ElementDisplayed(Entity_Document_Upload.ProcessContinue);
		Thread.sleep(1000);
		Log.info(" continue button displayed" + Entity_Document_Upload.ProcessContinue);
		return true;
		
	}
	
	public boolean ClickOnContinue () throws InterruptedException {
		click(Entity_Document_Upload.ProcessContinue);
		Thread.sleep(1000);
		Log.info("Process continued" + Entity_Document_Upload.ProcessContinue);
		return true;
		
		
	}

}
