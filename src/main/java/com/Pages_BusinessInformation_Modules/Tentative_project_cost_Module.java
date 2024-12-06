package com.Pages_BusinessInformation_Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Tentative_project_cost;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

public class Tentative_project_cost_Module extends Base_Class {
	
	//TC001
	
	Tentative_project_cost Tentative_project_cost = new Tentative_project_cost ();
	
	public boolean Login (String EnterEmailAddress , String EnterPassword) throws InterruptedException {

		click(Tentative_project_cost.LoginButton);
		Log.info("Login button Clicked" + Tentative_project_cost.LoginButton );
		Thread.sleep(2000);
		input(Tentative_project_cost.EnterEmailAddress , EnterEmailAddress);
		Log.info(EnterEmailAddress);
		Thread.sleep(2000);
		input(Tentative_project_cost.EnterPassword ,EnterPassword);
		Log.info(EnterPassword);
		click(Tentative_project_cost.ClicktoLogin);
		Log.info("Login button clickd" + Tentative_project_cost.ClicktoLogin);
		Thread.sleep(2000);
		click(Tentative_project_cost.ContinueButton);
		Thread.sleep(5000);
		click(Tentative_project_cost.TentativeProjectCost);
		Log.info("Tentative project cost opened");
		
			
			return true;
			
		}
	
	//TC002
public boolean EnterPlantAndMachinery(String PlantAndMachinery) throws InterruptedException {
		
	//clear(Tentative_project_cost.PlantAndMachinery);
		input(Tentative_project_cost.PlantAndMachinery , PlantAndMachinery);
		Thread.sleep(1000);
		Log.info(PlantAndMachinery);
		return true;
	}
	
	//TC003
	
	public boolean EnterLand (String Land) throws InterruptedException {
		//clear(Tentative_project_cost.Land);
		input(Tentative_project_cost.Land , Land);
		Thread.sleep(1000);
		Log.info(Land);
		return true;
	}
	
	//TC004
	
public boolean EnterLandDevelopmenent (String LandDevelopment) throws InterruptedException {
		//clear(Tentative_project_cost.LandDevelopment);
		input(Tentative_project_cost.LandDevelopment , LandDevelopment);
		Thread.sleep(1000);
		Log.info(LandDevelopment);
		return true;
	}
	
//TC005

public boolean EnterBuildingCivilWorks (String BuildingCivilWorks) throws InterruptedException {
	//clear(Tentative_project_cost.BuildingCivilWorks);
	input(Tentative_project_cost.BuildingCivilWorks , BuildingCivilWorks);
	Thread.sleep(1000);
	Log.info(BuildingCivilWorks);
	return true;
}

//TC006

	public boolean EnterUtilities(String Utilities) throws InterruptedException {
		//clear(Tentative_project_cost.Utilities);
		input(Tentative_project_cost.Utilities, Utilities);
		Thread.sleep(1000);
		Log.info(Utilities);
		click(Tentative_project_cost.UtilitiesLabel);
		return true;
	}
	
	//TC007
	public boolean EnterMiscFixedAssets(String MiscFixedAssets) throws InterruptedException {
//clear(Tentative_project_cost.MiscFixedAssets);
		input(Tentative_project_cost.MiscFixedAssets, MiscFixedAssets);
		Thread.sleep(1000);
		Log.info(MiscFixedAssets);
		return true;
	}
	//TC008
	public boolean EnterDeposite (String Deposits) throws InterruptedException {
//clear(Tentative_project_cost.Deposits);
		input(Tentative_project_cost.Deposits, Deposits);
		Thread.sleep(1000);
		Log.info(Deposits);
		return true;
	}
	
	//TC009
	
	public boolean EnterPriliminaryExpense(String PriliminaryExpense) throws InterruptedException {
//clear(Tentative_project_cost.PriliminaryExpense);
		input(Tentative_project_cost.PriliminaryExpense, PriliminaryExpense);
		Thread.sleep(1000);
		Log.info(PriliminaryExpense);
		return true;
	}
	
	
	//TC010
	
	public boolean WorkingCapitalMargin (String WorkingCapitalMargin) throws InterruptedException {
//clear(Tentative_project_cost.WorkingCapitalMargin);
		input(Tentative_project_cost.WorkingCapitalMargin, WorkingCapitalMargin);
		Thread.sleep(1000);
		Log.info(WorkingCapitalMargin);
		return true;
	}
	
	//TC011
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean ValidatePreoperativeExpenses () throws InterruptedException {
		ScrollUntilElementVisible(Tentative_project_cost.UtilitiesLabel);
		WebElement AutoloadedPreoperativeExpenses = driver.findElement(By.xpath("//input[@placeholder='Preoperative Expenses ⟨₹⟩']"));
		System.out.println("Preoperative ExpensesAutoloaded amount displayed" + AutoloadedPreoperativeExpenses.getAttribute("title"));
		
		String ABC = AutoloadedPreoperativeExpenses.getAttribute("title");
		if (ABC.equals("12,19,727")) {
			ExtentTestManager.getTest().log(Status.PASS, "12,19,727 : " + true);
			Log.info("12,19,727 : " + true);
			return true;
			
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, "54454: " + false);
			Log.info("54454 : " + false);
			Thread.sleep(1000);
		}
		return true;
	}
	
	//TC012
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean ValidateContingencies  () throws InterruptedException {
		click(Tentative_project_cost.ContingenciesLabel);
		WebElement AutoloadedContingencies  = driver.findElement(By.xpath("//input[@placeholder='Contingencies ⟨₹⟩']"));
		System.out.println("Autoloaded Contingencies amount displayed" + AutoloadedContingencies .getAttribute("title"));
		
		String ABC= AutoloadedContingencies.getAttribute("title");
		if (ABC.equals("20,97,071")) {
			ExtentTestManager.getTest().log(Status.PASS, "20,97,071: " + true);
			Log.info("20,97,071 : " + true);
			return true;
			
		}
		else {
			ExtentTestManager.getTest().log(Status.FAIL, " 54454: " + false);
			Log.info(" 54454 : " + false);
			Thread.sleep(1000);
		}
		return true;
	}
	
	//TC013
	
	public boolean WorkingCapital (String WorkkingCapital) throws InterruptedException {
//clear(Tentative_project_cost.WorkkingCapital);
		input(Tentative_project_cost.WorkkingCapital, WorkkingCapital);
		Thread.sleep(1000);
		Log.info(WorkkingCapital);
		return true;
	}
	
	//TC014 
	
	public boolean TechnicalFees (String TechnicalFees) throws InterruptedException {
//clear(Tentative_project_cost.TechnicalFees);
		input(Tentative_project_cost.TechnicalFees, TechnicalFees);
		Thread.sleep(1000);
		Log.info(TechnicalFees);
		return true;
	}
	
	//Tc015
	
	public boolean Vehicles (String Vehicle) throws InterruptedException {
//clear(Tentative_project_cost.Vehicle);
		input(Tentative_project_cost.Vehicle, Vehicle);
		Thread.sleep(1000);
		Log.info(Vehicle);
		return true;
	}
	
	//TC016
	
	public boolean EnterTechnologyOptimizationAndProductDevelopment (String TechnologyOptimizationAndProductDevelopment) throws InterruptedException {
//clear(Tentative_project_cost.TechnologyOptimizationAndProductDevelopment);
		input(Tentative_project_cost.TechnologyOptimizationAndProductDevelopment, TechnologyOptimizationAndProductDevelopment);
		Thread.sleep(1000);
		Log.info(TechnologyOptimizationAndProductDevelopment);
		return true;
	}
	
	//TC017
	public boolean EnterTestingAndCertification (String TestingAndCertification) throws InterruptedException {
//clear(Tentative_project_cost.TestingAndCertification);
		input(Tentative_project_cost.TestingAndCertification, TestingAndCertification);
		Thread.sleep(1000);
		Log.info(TestingAndCertification);
		return true;
	}
	
	public boolean EnterMarketingExpense (String MarketingExpense) throws InterruptedException {
//clear(Tentative_project_cost.MarketingExpense);
		input(Tentative_project_cost.MarketingExpense, MarketingExpense);
		Thread.sleep(1000);
		Log.info(MarketingExpense);
		return true;
	}
	
	
	
	//TC008
	
	public boolean EnterOthers (String Others) throws InterruptedException {
//clear(Tentative_project_cost.Others);
		input(Tentative_project_cost.Others, Others);
		Thread.sleep(1000);
		Log.info(Others);
		Thread.sleep(1000);
		click(Tentative_project_cost.OthersLabel);
		Thread.sleep(2000);
		return true;
	}
	//TC009
	
	public boolean EnterSpecify (String Specify) throws InterruptedException {
		ScrollUntilElementVisible(Tentative_project_cost.Vehiclelabel);
		//clear(Tentative_project_cost.Specify);
		input(Tentative_project_cost.Specify, Specify);
		Thread.sleep(1000);
		Log.info(Specify);
		return true;
	}
	
	
	//TC022
	
	public boolean SaveAndProceed () throws InterruptedException {
		ScrollUntilElementVisible(Tentative_project_cost.Technologylabel);
		Thread.sleep(1000);
		click(Tentative_project_cost.SaveAndProceedbutton);
    	Thread.sleep(5000);
    	Log.info("Successfully Submitted");
    	return true;
	}
	
	
	

}
