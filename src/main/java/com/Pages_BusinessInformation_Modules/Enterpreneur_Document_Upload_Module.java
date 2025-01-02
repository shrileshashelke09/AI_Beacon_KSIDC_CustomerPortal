package com.Pages_BusinessInformation_Modules;
import com.BasePackage.Base_Class;
import com.Page_Repositary.Enterpreneur_Document_Upload;
import com.Utility.Log;

public class Enterpreneur_Document_Upload_Module extends Base_Class {
	
	Enterpreneur_Document_Upload Enterpreneur_Document_Upload = new Enterpreneur_Document_Upload();
	
	//TC001
	
	public boolean Login(String EnterEmailAddress, String EnterPassword) throws InterruptedException {

		click(Enterpreneur_Document_Upload.LoginButton);
		Log.info("Login button Clicked" + Enterpreneur_Document_Upload.LoginButton);
		Thread.sleep(2000);
		input(Enterpreneur_Document_Upload.EnterEmailAddress, EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Enterpreneur_Document_Upload.EnterPassword, EnterPassword);
		Log.info(EnterPassword);
		click(Enterpreneur_Document_Upload.ClicktoLogin);
		Log.info("Login button clickd" + Enterpreneur_Document_Upload.ClicktoLogin);
		Thread.sleep(5000);
		click(Enterpreneur_Document_Upload.ContinueButton);
		Thread.sleep(3000);
		return true;

	}
	
	//TC002
	
	public boolean AccessDocUpload () throws InterruptedException {
		
		ScrollUntilElementVisible(Enterpreneur_Document_Upload.Scrolltobasic);
		Thread.sleep(1000);
		click(Enterpreneur_Document_Upload.EnterpreneurDetailsModule);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Enterpreneur_Document_Upload.ScrolltoEnterpreneurHeader);
		Thread.sleep(1000);
		click(Enterpreneur_Document_Upload.DocUpload);
		Log.info("Document Upload Option clicked" + Enterpreneur_Document_Upload.DocUpload);
		return true;
	}
	
	public boolean VerifyHeader () throws InterruptedException {
		
		ElementDisplayed(Enterpreneur_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		Log.info("Header displayed" + Enterpreneur_Document_Upload.DocUploadHeader);
		return true;
	}
	
	public boolean ClickonPAN ( ) throws InterruptedException {
		
		ScrollUntilElementVisible(Enterpreneur_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		click(Enterpreneur_Document_Upload.ClicktoPAN);
		Thread.sleep(1000);
		ScrollUP();
		Log.info("PAN Image document clicked and Document details displayed for upload" + Enterpreneur_Document_Upload.ClicktoPAN);
		return true;
	}
	
	public boolean UploadDocOption () throws InterruptedException {
		ElementDisplayed(Enterpreneur_Document_Upload.UploadDocument);
		Thread.sleep(1000);
		Log.info("Upload option is present" +Enterpreneur_Document_Upload.UploadDocument );
		return true;
	}
	
	
	public boolean UploadFile (String filepath) throws InterruptedException {
		ScrollUP();
		//Thread.sleep(1000);
		UploadFile(Enterpreneur_Document_Upload.UploadDocument , filepath);		
		Thread.sleep(3000);
		return true;
	}
	
}

