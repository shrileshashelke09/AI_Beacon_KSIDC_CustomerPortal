package com.Pages_BusinessInformation_Modules;

import com.BasePackage.Base_Class;
import com.Utility.Log;
import com.Page_Repositary.Project_Details;

public class Project_Details_Module extends Base_Class {

	Project_Details Project_Details = new Project_Details();

	public boolean Login(String EnterEmailAddress, String EnterPassword) throws InterruptedException {

		click(Project_Details.LoginButton);
		Log.info("Login button Clicked" + Project_Details.LoginButton);
		Thread.sleep(2000);
		input(Project_Details.EnterEmailAddress, EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Project_Details.EnterPassword, EnterPassword);
		Log.info(EnterPassword);
		click(Project_Details.ClicktoLogin);
		Log.info("Login button clickd" + Project_Details.ClicktoLogin);
		Thread.sleep(5000);
		click(Project_Details.ContinueButton);
		Thread.sleep(3000);
		return true;

	}
	// TC002

	public boolean ProjectDetailsPage() throws InterruptedException {
		ScrollUntilElementVisible(Project_Details.ScrolltoProjectdetails);
		Thread.sleep(1000);
		ElementDisplayed(Project_Details.ProjectDetails);
		click(Project_Details.ProjectDetails);
		Thread.sleep(3000);
		ElementDisplayed(Project_Details.ProjectDetailsHeader);
		Log.info("Project details header displayed" + Project_Details.ProjectDetailsHeader);
		return true;
	}

	// TC003

	public boolean EnterProjectDescription(String EnterProjectDescription) throws InterruptedException {
		clear(Project_Details.EnterProjectDescription);
		Thread.sleep(1000);
		input(Project_Details.EnterProjectDescription, EnterProjectDescription);
		Thread.sleep(1000);
		Log.info(EnterProjectDescription);
		return true;
	}

	// TC004

	public boolean EnterInnovationOrIdeaForProduct(String EnterInnovationOrIdeaForProduct) throws InterruptedException {
        clear(Project_Details.EnterInnovationOrIdeaForProduct);
		input(Project_Details.EnterInnovationOrIdeaForProduct, EnterInnovationOrIdeaForProduct);
		Thread.sleep(1000);
		Log.info(EnterInnovationOrIdeaForProduct);
		return true;
	}

	// TC005

	public boolean EnterTechnologyOrProvenConcept(String EnterTechnologyOrProvenConcept) throws InterruptedException {
        clear(Project_Details.EnterTechnologyOrProvenConcept);
		input(Project_Details.EnterTechnologyOrProvenConcept, EnterTechnologyOrProvenConcept);
		Thread.sleep(1000);
		Log.info(EnterTechnologyOrProvenConcept);
		return true;
	}

	// TC006

	public boolean EnterAddressableOrserviceableMarket(String EnterAddressableOrserviceableMarket)
			throws InterruptedException {
clear(Project_Details.EnterAddressableOrserviceableMarket);
		input(Project_Details.EnterAddressableOrserviceableMarket, EnterAddressableOrserviceableMarket);
		Thread.sleep(1000);
		Log.info(EnterAddressableOrserviceableMarket);
		return true;
	}

	// TC007

	public boolean EnterReachOutStrategies(String EnterReachOutStrategies) throws InterruptedException {
clear(Project_Details.EnterReachOutStrategies);
		input(Project_Details.EnterReachOutStrategies, EnterReachOutStrategies);
		Thread.sleep(1000);
		Log.info(EnterReachOutStrategies);
		return true;
	}

	// TC008
	public boolean EnterProposedRevenueModelPricing(String EnterProposedRevenueModelPricing)
			throws InterruptedException {
clear(Project_Details.EnterProposedRevenueModelPricing);
		input(Project_Details.EnterProposedRevenueModelPricing, EnterProposedRevenueModelPricing);
		Thread.sleep(1000);
		Log.info(EnterProposedRevenueModelPricing);
		return true;
	}

	// TC009

	public boolean EnterCurrentStatusOfProject(String EnterCurrentStatusOfProject) throws InterruptedException {
clear(Project_Details.EnterCurrentStatusOfProject);
		input(Project_Details.EnterCurrentStatusOfProject, EnterCurrentStatusOfProject);
		Thread.sleep(1000);
		Log.info(EnterCurrentStatusOfProject);
		return true;
	}

	// TC010

	public boolean EnterMarketAndFutureProfitability(String EnterMarketAndFutureProfitability)
			throws InterruptedException {
clear(Project_Details.EnterMarketAndFutureProfitability);
		input(Project_Details.EnterMarketAndFutureProfitability, EnterMarketAndFutureProfitability);
		Thread.sleep(1000);
		Log.info(EnterMarketAndFutureProfitability);
		return true;
	}

	// TC011

	public boolean EnterExitOptionsForLender(String EnterExitOptionsForLender) throws InterruptedException {
clear(Project_Details.EnterExitOptionsForLender);
		input(Project_Details.EnterExitOptionsForLender, EnterExitOptionsForLender);
		Thread.sleep(1000);
		Log.info(EnterExitOptionsForLender);
		return true;
	}

	// TC012

	public boolean EnterProductOrServicesOrRawmeterialsOfTheProject(
			String EnterProductOrServicesOrRawmeterialsOfTheProject) throws InterruptedException {
clear(Project_Details.EnterProductOrServicesOrRawmeterialsOfTheProject);
		input(Project_Details.EnterProductOrServicesOrRawmeterialsOfTheProject,
				EnterProductOrServicesOrRawmeterialsOfTheProject);
		Thread.sleep(1000);
		Log.info(EnterProductOrServicesOrRawmeterialsOfTheProject);
		return true;
	}

	// TC013

	public boolean IsNeededAdditionalUnits() throws InterruptedException {

		ScrollUntilElementVisible(Project_Details.Scrolltooption);
		Thread.sleep(1000);
		ElementDisplayed(Project_Details.IsneededadditionalUnits);
		Log.info("Section displayed" + Project_Details.IsneededadditionalUnits);
		return true;
	}

	// TC014

	public boolean RadioButtonCheck() throws InterruptedException {
		ElementDisplayed(Project_Details.RadioButtonCheck);
		Thread.sleep(1000);
		Log.info("Radio butn displayed" + Project_Details.RadioButtonCheck);
		return true;
	}

	// TC015

	public boolean YESRadioButtonselection() throws InterruptedException {
		ElementDisplayed(Project_Details.YESRadioButton);
		Thread.sleep(1000);
		Log.info("Radio butn displayed" + Project_Details.YESRadioButton);
		click(Project_Details.YESRadioButton);
		Log.info("Yes button clicked" + Project_Details.YESRadioButton);
		Thread.sleep(2000);
		ElementDisplayed(Project_Details.AddProjectDetailsButton);
		Log.info("Button is visible after selection");
		Thread.sleep(1000);
		return true;
	}

	// TC016

	public boolean ClickonAddProjectUnitDetails() throws InterruptedException {

		click(Project_Details.AddProjectDetailsButton);
		Thread.sleep(2000);
		Log.info("Add project Unit Details button clicked" + Project_Details.AddProjectDetailsButton);
		return true;
	}

	// TC017

	public boolean ValidaeAddProjectPopUp() throws InterruptedException {

		ElementDisplayed(Project_Details.AssProjectUnitDetailesHeader);
		Thread.sleep(1000);
		Log.info("The pop-up window \"Add Project Units Details\" appears.");
		return true;
	}

	// TC018

	public boolean EnterUnitName(String EnterUnitName) throws InterruptedException {

		input(Project_Details.EnterUnitName, EnterUnitName);
		Thread.sleep(1000);
		Log.info(EnterUnitName);
		return true;

	}

	// TC019

	public boolean EnterUnitype(String EnterUnitType) throws InterruptedException {

		input(Project_Details.EnterUnitType, EnterUnitType);
		Thread.sleep(1000);
		Log.info(EnterUnitType);
		return true;

	}

//TC020

	public boolean EnterUnitAge(String EnterUnitAge) throws InterruptedException {

		input(Project_Details.EnterUnitAge, EnterUnitAge);
		Thread.sleep(1000);
		Log.info(EnterUnitAge);
		return true;

	}

	// TC021

	public boolean EnterAddress1(String Address1) throws InterruptedException {

		input(Project_Details.Address1, Address1);
		Thread.sleep(1000);
		Log.info(Address1);
		return true;

	}

	// TC022

	public boolean EnterAddress2(String Address2) throws InterruptedException {

		input(Project_Details.Address2, Address2);
		Thread.sleep(1000);
		Log.info(Address2);
		return true;

	}

	// TC023

	public boolean EnterAddress3(String Address3) throws InterruptedException {

		input(Project_Details.Address3, Address3);
		Thread.sleep(1000);
		Log.info(Address3);
		return true;

	}

	// TC024

	public boolean EnterPinCode(String PinCode) throws InterruptedException {

		input(Project_Details.PinCode, PinCode);
		Thread.sleep(1000);
		Log.info(PinCode);
		return true;

	}

	// TC025

	public boolean SelectState() throws InterruptedException {

		click(Project_Details.State);
		// Thread.sleep(10000);
		ScrollUntilElementVisible(Project_Details.SelectState);
		Thread.sleep(1000);
		click(Project_Details.SelectState);
		Log.info("State selected" + Project_Details.SelectState);
		return true;
	}

	// TC026

	public boolean SelectDistrict() throws InterruptedException {
		click(Project_Details.District);
		// Thread.sleep(10000);
		click(Project_Details.SelectDistrict);
		// Thread.sleep(1000);
		Log.info("District selected" + Project_Details.SelectDistrict);
		return true;
	}

	// TC027

	public boolean SelectCity() throws InterruptedException {

		click(Project_Details.City);
		// Thread.sleep(10000);
		click(Project_Details.SelectCity);
		// Thread.sleep(1000);
		Log.info("City selected" + Project_Details.SelectCity);
		return true;
	}

	// TC028

	public boolean SelectPost() throws InterruptedException {
		ScrollUntilElementVisible(Project_Details.SelectDistrict);
		click(Project_Details.Post);
		// Thread.sleep(10000);
		click(Project_Details.SelectPost);
		// Thread.sleep(1000);
		Log.info("Post selected" + Project_Details.SelectPost);
		return true;
	}

	// TC029

	public boolean EnterVillage(String EnterVillage) throws InterruptedException {

		input(Project_Details.EnterVillage, EnterVillage);
		Thread.sleep(1000);
		Log.info(EnterVillage);
		return true;

	}

	// TC030

	public boolean SelectPanchayat() throws InterruptedException {

		click(Project_Details.Panchayat);
		// Thread.sleep(10000);
		click(Project_Details.selectpanchayat);
		// Thread.sleep(1000);
		Log.info("Panchayat selected" + Project_Details.selectpanchayat);
		return true;
	}

	// TC031

	public boolean AddUnitsButton() throws InterruptedException {
		ScrollUntilElementVisible(Project_Details.Post);
		ElementDisplayed(Project_Details.AddUnitButton);
		//Thread.sleep(3000);
		Log.info("Add Unit Button displayed" + Project_Details.AddUnitButton);
		return true;
	}

	// TC032

	public boolean CLickAddUnitsButton() throws InterruptedException {
		click(Project_Details.AddUnitButton);
		Thread.sleep(5000);
		Log.info("Add Unit Button clicked" + Project_Details.AddUnitButton);
		ScrollUntilElementVisible(Project_Details.EnterProductOrServicesOrRawmeterialsOfTheProject);
		Thread.sleep(20000);
		ElementDisplayed(Project_Details.ListOfUnits);
		Log.info("Added Units displayed" + Project_Details.ListOfUnits);
		return true;
	}
	
	//TC033
	
	public boolean ValidateAddedUnits () {
		
		ElementDisplayed(Project_Details.AddedListOfUnits);
		Log.info("Added Units displayed" + Project_Details.AddedListOfUnits);
		return true;
	}
	
	//TC034
	
	public boolean DeleteTheAddedUnits() throws InterruptedException {
		ElementDisplayed(Project_Details.DeleteMark);
		Thread.sleep(1000);
		click(Project_Details.DeleteMark);
		Thread.sleep(1000);
		click(Project_Details.DeleteYES);
		Thread.sleep(2000);
		Log.info("Added Units deleted" + Project_Details.DeleteMark);
		return true;
	}
	//TC035
	
	public boolean SaveAsDraft ( ) throws InterruptedException {
		
		click(Project_Details.SaveAsDraft);
		Log.info("Data saved as Draft" + Project_Details.SaveAsDraft);
		return true;		
	}
	
	//TC036
	
	public boolean SaveAndProceed () throws InterruptedException {
		
		ScrollUntilElementVisible(Project_Details.IsneededadditionalUnits);
		Thread.sleep(1000);
		click(Project_Details.SaveAndProceed);
		Log.info("Saved and proceeded" + Project_Details.SaveAndProceed);
		return true;
	}
}
