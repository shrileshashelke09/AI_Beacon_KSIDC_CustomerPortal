package com.Pages_BusinessInformation_Modules;

import java.io.IOException;
import java.math.BigDecimal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BasePackage.Base_Class;
import com.Page_Repositary.Means_Of_Finance_Calculation;
import com.Utility.Log;

public class Means_Of_Finance_Calculation_Module extends Base_Class {

	Means_Of_Finance_Calculation Means_Of_Finance_Calculation = new Means_Of_Finance_Calculation();

	// TC001

	
	public boolean Calculation() throws InterruptedException, IOException {
		Login();
		click(Means_Of_Finance_Calculation.ContinueButton);
		Thread.sleep(2000);
		ScrollUntilElementVisible(Means_Of_Finance_Calculation.ScrolltoTchnology);
		Thread.sleep(1000);
		try {
			String TotalAmountProjectCost = driver.findElement(By.xpath("//span[@class='text-end pl-3']")).getText();
			System.out.println("Total Project Cost" + TotalAmountProjectCost);
			click(Means_Of_Finance_Calculation.MeansOfFinance);
			WebElement A = driver.findElement(By.xpath("//input[@placeholder='Share Capital (₹)']"));
			System.out.println("Share Capital Value is " + A.getAttribute("title"));
			String AValue = A.getAttribute("title");
			Thread.sleep(1000);
			WebElement B = driver.findElement(By.xpath("//input[@placeholder='Internal Accruals (₹)']"));
			System.out.println("Internal Accruals Value is " + B.getAttribute("title"));
			String BValue = B.getAttribute("title");
			Thread.sleep(1000);
			ScrollUntilElementVisible(Means_Of_Finance_Calculation.scrolltoShare);
			WebElement C = driver.findElement(By.xpath("//input[@placeholder='Unsecured Loan (₹)']"));
			System.out.println("Unsecured Loan Value is " + C.getAttribute("title"));
			String CValue = C.getAttribute("title");
			Thread.sleep(1000);
			WebElement D = driver.findElement(By.xpath("//input[@placeholder='Incentives And Grants (₹)']"));
			System.out.println("Incentives And Grants Value is " + D.getAttribute("title"));
			String DValue = D.getAttribute("title");
			Thread.sleep(1000);
			WebElement E = driver.findElement(By.xpath("//input[@placeholder='Others (₹)']"));
			System.out.println("Other Investments Value is " + E.getAttribute("title"));
			String EValue = E.getAttribute("title");
			Thread.sleep(1000);
			WebElement AppliedTermLoan = driver.findElement(
					By.xpath("//input[@class='rz-textbox rz-state-disabled valid form-control input-main']"));
			System.out.println("Applied Term Loan Value is " + AppliedTermLoan.getAttribute("title"));
			String AppliedTermLoanValue = AppliedTermLoan.getAttribute("title");
			String AppliedTermLoanwithoutcomma = AppliedTermLoanValue.replace(",", "");
			System.out.println(AppliedTermLoanwithoutcomma);
			Thread.sleep(1000);
			double a = Double.parseDouble(AValue);
			double b = Double.parseDouble(BValue);
			double c = Double.parseDouble(CValue);
			double d = Double.parseDouble(DValue);
			double e = Double.parseDouble(EValue);
			double f = Double.parseDouble(AppliedTermLoanwithoutcomma);
			double sum = a + b + c + d + e + f;
			System.out.println("Total sum is " + sum);
			Thread.sleep(1000);
		}

		catch (NumberFormatException e) {
			System.out.println("Error: Invalid number format");
		}

		return true;

	}
}
