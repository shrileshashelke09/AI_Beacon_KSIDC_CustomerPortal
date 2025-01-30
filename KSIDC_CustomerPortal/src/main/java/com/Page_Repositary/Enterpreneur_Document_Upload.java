package com.Page_Repositary;

import org.openqa.selenium.By;

public class Enterpreneur_Document_Upload {
	
	
	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");
	
	public By ScrolltoStep2 = By.xpath("//h4[normalize-space()='Step 2']");

	public By EnterpreneurDetailsModule = By.xpath("//span[text()='Entrepreneurs Info']");
	
	public By ScrolltoEnterpreneurHeader = By.xpath("//h4[text()='Entrepreneur Details']");
	
	public By DocUpload = By.xpath("//a[normalize-space()='2.4 Document Upload']");
	
	public By DocUploadHeader = By.xpath("//h4[text()='Document Upload']");
	
	public By ClicktoDocument = By.xpath("(//a[@class='chip-text-wrapper text-decoration-none'])[1]");	
	
	public By DocCriteria = By.xpath("//span[text()='Maximum File Size Must be 5 MB']");
	
	public By UploadDocument = By.xpath("//span[text()='Upload Document']/preceding-sibling::input");
	
	public By successpopup = By.xpath("//span[@class='rz-growl-image rzi rzi-check']");
	
	public By OtherIcon = By.xpath("(//div[@class='d-flex'])[3]");

	public By UploadedDocument = By.xpath("(//div[@class='d-flex'])[2]");
	
	public By DownloadDocument = By.xpath("//button[normalize-space()='Download Document']");
	
	public By ProcessContinue = By.xpath("//button[normalize-space()='Continue']");
	
	
}


