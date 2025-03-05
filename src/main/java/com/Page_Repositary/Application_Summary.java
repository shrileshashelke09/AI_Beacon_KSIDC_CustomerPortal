package com.Page_Repositary;

import org.openqa.selenium.By;

public class Application_Summary {

    public By LoginButton = By.xpath("(//button[@class='button secondary btn-medium'])[2]");

	public By ContinueButton = By.xpath("//button[@class='button primary btn-medium ms-auto']");

	public By BusinessInfo = By.xpath("//button[@class='nav-link active']");
	
	public By BasicInfo = By.xpath("//label[text()='Basic Information']");
	
	public By BasicInfoPageTitle = By.xpath("//h5[text()='Basic Information']");
	
	public By scrolltoDate = By.xpath("//label[text()='Date Of Incorporation']");
	
	
}
