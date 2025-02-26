package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Document_Upload {
	public By SecurtiyStageActive = By.xpath("//li//span[text()='Security']");
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	public By SecurityDoumentUploadButton = By.xpath("//li//a[text()='5.12' and text()='Document Upload']");
	public By DocumentUploadHeading = By.xpath("//h4[text()='Document Upload']");
	public By AddMachineryDocumentButton = By.xpath("//a[text()='Machinery Document']");
	public By AddLandDocumentButton = By.xpath("//a[text()='Proceedings']");
	public By COMBUSTION_ENGINE_MACHINERY_DOCUMENT_Heading = By.xpath("//div[text()='MACHINERY DOCUMENT']");
	public By TEST_LAND_DATA_DOCUMENT_Heading = By.xpath("//div[text()='TEST LAND DATA']");
	public By UploadDocumentButton = By.xpath("//input[@name='DocFile']");
	public By DocumentUploadContinueButton = By.xpath("//button[@class='button secondary-green btn-medium']");
	public By UploadedMachineryDocument = By.xpath("//span[text()='Machinery Document']");
	public By UploadedLandDocument = By.xpath("//span[text()='Proceedings']");
	public By successpopup = By.xpath("//span[@class='rz-growl-title']");
	public By ApplicationSummaryHeading = By.xpath("//h4[text()='Application Summary']");

}
