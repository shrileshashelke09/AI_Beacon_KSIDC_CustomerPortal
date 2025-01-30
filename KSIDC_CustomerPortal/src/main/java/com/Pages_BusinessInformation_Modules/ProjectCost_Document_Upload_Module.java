package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import com.BasePackage.Base_Class;
import com.Page_Repositary.ProjectCost_Document_Upload;
import com.Utility.Log;

public class ProjectCost_Document_Upload_Module extends Base_Class {

	ProjectCost_Document_Upload ProjectCost_Document_Upload = new ProjectCost_Document_Upload();

	// TC001

	public boolean login() throws InterruptedException, IOException {
		Login();

		return true;

	}

	// TC002

	public boolean NavigatetoBusiness() throws InterruptedException {
		click(ProjectCost_Document_Upload.ContinueButton);
		Thread.sleep(2000);
		ScrollUntilElementVisible(ProjectCost_Document_Upload.scrolltoplant);
		Thread.sleep(1000);
		ElementDisplayed(ProjectCost_Document_Upload.DocUpload);
		Log.info("Document Upload Option displayed" + ProjectCost_Document_Upload.DocUpload);
		click(ProjectCost_Document_Upload.DocUpload);
		Thread.sleep(1000);
		Log.info("Document Upload Option clicked" + ProjectCost_Document_Upload.DocUpload);
		return true;
	}

	
	
	public boolean VerifyStageHeading() throws InterruptedException {
		ElementDisplayed(ProjectCost_Document_Upload.StageHeading);
		Thread.sleep(1000);
		Log.info("Stage Heading displayed" + ProjectCost_Document_Upload.StageHeading);
		return true;
	}




	public boolean VerifyHeader() throws InterruptedException {

		ElementDisplayed(ProjectCost_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		Log.info("Header displayed" + ProjectCost_Document_Upload.DocUploadHeader);
		return true;
	}

	public boolean ClickonDoc1() throws InterruptedException {

		ScrollUntilElementVisible(ProjectCost_Document_Upload.DocUploadHeader);
		Thread.sleep(1000);
		click(ProjectCost_Document_Upload.ClicktoDoc1);
		Thread.sleep(1000);
		ScrollUP();
		Log.info(" document clicked and Document details displayed for upload" + ProjectCost_Document_Upload.ClicktoDoc1);
		return true;
	}

	public boolean DocumentInfo () {
		ScrollUntilElementVisible(ProjectCost_Document_Upload.DocumentwindowName);
		ElementDisplayed(ProjectCost_Document_Upload.DocumentName);
		Log.info("Document Info displayed" + ProjectCost_Document_Upload.DocumentName);
		return true;
	}

	public boolean UploadDocOption() throws InterruptedException {
		ElementDisplayed(ProjectCost_Document_Upload.UploadDocument);
		Thread.sleep(1000);
		Log.info("Upload option is present" + ProjectCost_Document_Upload.UploadDocument);
		return true;
	}

	public boolean UploadDocFile(String filepath) throws InterruptedException {
		ScrollUP();
		// Thread.sleep(1000);
		UploadFile(ProjectCost_Document_Upload.UploadDocument, filepath);
		Thread.sleep(3000);
		return true;
	}


		public boolean ClickOnContinue () throws InterruptedException {
			ScrollUntilElementVisible(ProjectCost_Document_Upload.UploadDocument);
		click(ProjectCost_Document_Upload.ProcessContinue);
		Thread.sleep(1000);
		Log.info("Process continued" + ProjectCost_Document_Upload.ProcessContinue);
		return true;
		
		
	}

}
