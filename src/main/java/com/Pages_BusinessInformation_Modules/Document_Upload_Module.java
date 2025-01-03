package com.Pages_BusinessInformation_Modules;
import java.io.IOException;

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
		
		ScrollUntilElementVisible(Document_Upload.Scrolltobasicinfo);
		Thread.sleep(1000);
		ElementDisplayed(Document_Upload.ClicktoAadhar);
		Log.info("Aadhar option displayed" + Document_Upload.ClicktoAadhar);
		click(Document_Upload.ClicktoAadhar);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Document_Upload.Aadharinfo);
		ElementDisplayed(Document_Upload.Aadharinfo);
		Log.info("Aadhar details displayed" + Document_Upload.Aadharinfo);
		Thread.sleep(2000);
		return true;
	}
	
	//TC004
	
	public boolean UploadFile (String filepath) throws InterruptedException {
		ScrollUP();
		//Thread.sleep(1000);
		UploadFile(Document_Upload.UploadDocument , filepath);		
		Thread.sleep(3000);
		ElementToBeVisible(Document_Upload.AdharUpload);
		return true;
	}

}

