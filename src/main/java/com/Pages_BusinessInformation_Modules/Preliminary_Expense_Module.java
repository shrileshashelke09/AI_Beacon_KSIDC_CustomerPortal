package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Preliminary_Expense;
import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;

import bsh.util.Util;

public class Preliminary_Expense_Module extends Base_Class {

	Preliminary_Expense Preliminary_Expense = new Preliminary_Expense();

	// TC001

	public boolean login() throws InterruptedException, IOException {

		Login();
		Thread.sleep(1000);
		return true;

	}

	// TC002

	public boolean NavigatetoProjectCost() throws InterruptedException {
		click(Preliminary_Expense.ContinueButton);
		Thread.sleep(1000);
		ElementToBeVisible(Preliminary_Expense.ScrolltoBusinessFinance);
		return true;
	}

	public boolean VerifyPreliminaryExpensesComponent() throws InterruptedException {
		ScrollUntilElementVisible(Preliminary_Expense.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		ElementDisplayed(Preliminary_Expense.PreliminaryExpensesComponent);
		Thread.sleep(1000);
		Log.info("Vehicles Component is visible." + Preliminary_Expense.PreliminaryExpensesComponent);
		return true;
	}

	public boolean AccessPreliminaryExpensesComponent() throws InterruptedException {
		ScrollUntilElementVisible(Preliminary_Expense.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Preliminary_Expense.PreliminaryExpensesComponent);
		Thread.sleep(1000);
		Log.info("Vehicles  component is accessable." + Preliminary_Expense.PreliminaryExpensesComponent);
		return true;
	}

	public boolean VerifyPreliminaryExpensesComponentHeader() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.PreliminaryExpensestHeader);
		Thread.sleep(1000);
		Log.info("Header displayed correctly " + Preliminary_Expense.PreliminaryExpensestHeader);
		return true;
	}

	public boolean VerifyInformativeMessage() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.InformativeText);
		Thread.sleep(1000);
		Log.info("Informative Message displayed correctly " + Preliminary_Expense.InformativeText);
		return true;
	}

	public boolean SkipforNowPresence() throws InterruptedException {
		ElementDisplayed(Preliminary_Expense.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Preliminary_Expense.SkipForNow);
		return true;
	}

	public boolean ClickSkipforNowPresence() throws InterruptedException {
		click(Preliminary_Expense.SkipForNow);
		Thread.sleep(1000);
		Log.info("Skip for now displayed" + Preliminary_Expense.SkipForNow);
		ScrollUntilElementVisible(Preliminary_Expense.ScrolltoBusinessFinance);
		Thread.sleep(1000);
		click(Preliminary_Expense.PreliminaryExpensesComponent);
		return true;
	}

	public boolean AddDetailsbuttonPresence() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.AddDetails);
		Thread.sleep(1000);
		Log.info("Add details button displayed" + Preliminary_Expense.AddDetails);
		return true;
	}

	public boolean ClickAddDetailsbutton() throws InterruptedException {

		click(Preliminary_Expense.AddDetails);
		Thread.sleep(2000);
		Log.info("Add details button clicked" + Preliminary_Expense.AddDetails);
		return true;
	}

	public boolean SelectDepositType() throws InterruptedException {

		click(Preliminary_Expense.DepositType);
		Thread.sleep(1000);
		click(Preliminary_Expense.SelectDepositType);
		Thread.sleep(1000);
		Log.info("Deposit Type selected" + Preliminary_Expense.SelectDepositType);
		return true;
	}
	
	public boolean EnterExpenseAmount (String EnterExpenseAmount) throws InterruptedException {
		ElementDisplayed(Preliminary_Expense.EnterExpenseAmount);
		Log.info("Field displayed" +Preliminary_Expense.EnterExpenseAmount);
		input(Preliminary_Expense.EnterExpenseAmount , EnterExpenseAmount);
		Thread.sleep(1000);
		Log.info(EnterExpenseAmount);
		click(Preliminary_Expense.ExpenseAmountLabel);
		Thread.sleep(1000);
		return true;
		
	}

	public boolean CancelButtonPresence() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.CancelButton);
		Thread.sleep(1000);
		Log.info("Cancel button present" + Preliminary_Expense.CancelButton);
		return true;
	}

	public boolean SaveAsDraftButtonPresence() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.SaveAsDraftButton);
		Thread.sleep(1000);
		Log.info("Save As Draft Button button present" + Preliminary_Expense.SaveAsDraftButton);
		return true;
	}

	public boolean SaveAndProceedButtonPresence() throws InterruptedException {

		ElementDisplayed(Preliminary_Expense.SaveAndProceed);
		Thread.sleep(1000);
		Log.info("Save And Proceed Button present" + Preliminary_Expense.SaveAndProceed);
		return true;
	}

	public boolean ClickonSaveAsDraft() throws InterruptedException {

		click(Preliminary_Expense.SaveAsDraftButton);
		Thread.sleep(1000);
		ElementToBeVisible(Preliminary_Expense.Successpopup);
		ElementDisplayed(Preliminary_Expense.Successpopup);
		Thread.sleep(1000);
		Log.info("Draft is saved successfully and success message is displayed." + Preliminary_Expense.Successpopup);
		return true;
	}

	public boolean UpdateAndProceed() throws InterruptedException {

		click(Preliminary_Expense.AddedEnteredData);
		Thread.sleep(1000);
		ScrollUntilElementVisible(Preliminary_Expense.ExpenseAmountLabel);
		click(Preliminary_Expense.UpdateAndProceed);
		Log.info("Data saved" + Preliminary_Expense.UpdateAndProceed);
		ElementDisplayed(Preliminary_Expense.Successpopup);
		Log.info("Data is saved successfully and success message is displayed." + Preliminary_Expense.Successpopup);
		return true;
	}
	
	public boolean DatainGrid() {

		ElementDisplayed(Preliminary_Expense.AddedEnteredData);
		Log.info("Data displayed in grid" + Preliminary_Expense.AddedEnteredData);
		return true;
	}

	public boolean ValidateContinuebutton() throws InterruptedException {

		ScrollUntilElementVisible(Preliminary_Expense.AddedEnteredData);
		Thread.sleep(1000);
		ElementDisplayed(Preliminary_Expense.ClickContinue);
		Thread.sleep(1000);
		Log.info("Continue button displayed" + Preliminary_Expense.ClickContinue);
		return true;
	}

	public boolean clicktocontinue() throws InterruptedException {
		ScrollUntilElementVisible(Preliminary_Expense.AddedEnteredData);
		click(Preliminary_Expense.ClickContinue);
		Thread.sleep(3000);
		Log.info("Process continued" + Preliminary_Expense.ClickContinue);
		return true;
	}

}
