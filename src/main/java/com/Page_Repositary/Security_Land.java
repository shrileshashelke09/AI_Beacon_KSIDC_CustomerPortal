package com.Page_Repositary;

import org.openqa.selenium.By;

public class Security_Land {

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By ScrolltoBusinessfinance = By.xpath("//span[text()='Business Finance']");

	public By ScrolltoSecurity = By.xpath("(//span[text()='Security'])[1]");
  
	public By Land = By.xpath("//a[normalize-space()='5.2 Land']");
	
	public By ListofLand = By.xpath("//a[@class='chip-text-wrapper text-decoration-none']");
	
	public By TitleHolder = By.xpath("//input[@name='TitleHolder' and @title='TEST DATA' and @class='rz-textbox rz-state-disabled valid form-control input-main']\r\n"+ "");
	
	public By Nature = By.xpath("//label[@title='Nature']//following-sibling::div//following-sibling::label");
	
	public By AproxMarketValue =By.xpath("//input[@name='AproxMarketValue']");
	
	public By Cancel = By.xpath("//div[@class='button tertiary btn-medium d-flex align-items-center justify-content-center  ' ]");
	
	public By SavedDetailes = By.xpath("//div[@style='font-size:10px;margin-top:20px']");
	
	public By Continue = By.xpath("//button[@class='button secondary-green btn-medium d-flex align-items-center justify-content-center  ']");
			
	
	 

	
}
