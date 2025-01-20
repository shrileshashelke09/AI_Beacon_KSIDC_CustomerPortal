package com.Pages_BusinessInformation_Modules;
import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Document_Upload;
import com.Utility.Log;

public class Document_Upload_Module extends Base_Class {
	
	Document_Upload Document_Upload = new Document_Upload();
	
	//TC001
	
	public boolean login() throws InterruptedException, IOException {

		Login();
		click(Document_Upload.ContinueButton);
		Thread.sleep(3000);
		ElementToBeVisible(Document_Upload.ScrolltoDocOption);
		return true;

	}
	
	//TC002
	
	public boolean AccessDocUpload () throws InterruptedException {
		
		ScrollUntilElementVisible(Document_Upload.ScrolltoDocOption);
		Thread.sleep(1000);
		ElementDisplayed(Document_Upload.DocumentUpload);
		Log.info("Document Upload option displayed" + Document_Upload.DocumentUpload);
		click(Document_Upload.DocumentUpload);
		Thread.sleep(3000);
		Log.info("Document Upload Option clicked" + Document_Upload.DocumentUpload);
		return true;
	}
	
	//TC003
	
	public boolean SelectDocname () throws InterruptedException {
		
		//ScrollUntilElementVisible(Document_Upload.Scrolltobasicinfo);
		Thread.sleep(1000);
		ElementDisplayed(Document_Upload.Document1);
		Log.info("Document displayed" + Document_Upload.Document1);
		click(Document_Upload.Document1);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Document_Upload.DocumentInfo);
		ElementDisplayed(Document_Upload.DocumentInfo);
		Log.info("Aadhar details displayed" + Document_Upload.DocumentInfo);
		Thread.sleep(2000);
		return true;
	}
	
	//TC004
	
	public boolean UploadDocFile (String filepath) throws InterruptedException {
		ScrollUP();
		//Thread.sleep(1000);
		UploadFile(Document_Upload.UploadDocument , filepath);	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Document_Upload.successpopup));
		ElementToBeVisible(Document_Upload.successpopup);
		return true;
	}
	
	//TC005
	public boolean clickonContinue () throws InterruptedException {
		
		click(Document_Upload.ProcessContinueButton);
		Thread.sleep(1000);
		Log.info("Process continued" + Document_Upload.ProcessContinueButton);
		return true;
	}

	

}

