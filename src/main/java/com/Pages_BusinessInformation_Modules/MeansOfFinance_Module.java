package com.Pages_BusinessInformation_Modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.math.BigDecimal;
import com.BasePackage.Base_Class;
import com.Page_Repositary.MeansOfFinance;
import com.Utility.Log;




public class MeansOfFinance_Module extends Base_Class{
	
	MeansOfFinance Meansoffinance = new MeansOfFinance();
	
	String TotalAmountProjectCost;
	String TotalAmountProjectCostData;
	String TotalAmountProjectCostvaliddata;
	
	// TC001

	public  boolean login() throws InterruptedException, IOException {
		Login();
		return true;



	}

	// TC002
		public boolean Navigatetomeansoffinance() throws InterruptedException {
			click(Meansoffinance.ContinueButton);
			Thread.sleep(5000);
			//ElementToBeVisible(Meansoffinance.ProjectCost);
			
			 return true;
		}
		
	
		public boolean AccessMeansoffinance() throws InterruptedException {
			//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
			
			ScrollUntilElementVisible(Meansoffinance.ScrolltoProjectCost);
			Thread.sleep(1000);
			ScrollUntilElementVisible(Meansoffinance.ScrolltolinePlantAndMachinery);
			Log.info("Navigate to project cost page" + Meansoffinance.ContinueButton);
			String TotalAmountProjectCost = driver.findElement(By.xpath("//span[@class='text-end pl-3']")).getText();
			System.out.println("Project Cost Amount ::"+TotalAmountProjectCost);
			TotalAmountProjectCostData = TotalAmountProjectCost.replace(",", "");
             System.out.println("Comma Removed data  :"+TotalAmountProjectCostData);
             TotalAmountProjectCostvaliddata = TotalAmountProjectCostData.substring(1);
             System.out.println("Valida project cost data  :"+TotalAmountProjectCostvaliddata);
             Thread.sleep(5000);
			click(Meansoffinance.Scrolltostep4);
			Thread.sleep(1000);
			
			return true;
			
	     }
		
		//TC003
		public boolean Entersharecapital(String ShareCapital) throws InterruptedException {

			input(Meansoffinance.ShareCapital, ShareCapital);
			Thread.sleep(1000);
			Log.info(ShareCapital);
			return true;
			
		}
		
		//TC004
				public boolean EnterInternalAccurals(String InternalAccurals) throws InterruptedException {

					input(Meansoffinance.InternalAccurals, InternalAccurals);
					Thread.sleep(1000);
					Log.info(InternalAccurals);
					return true;
					
				}
				
		
		//TC005
				public boolean EnterUnsecuredLoan(String UnsecuredLoan) throws InterruptedException {

					input(Meansoffinance.UnsecuredLoan, UnsecuredLoan);
					Thread.sleep(1000);
					Log.info(UnsecuredLoan);
					return true;
					
				}
				
			//TC006
				public boolean EnterIncentivesAndGrants(String IncentivesAndGrants) throws InterruptedException {

					input(Meansoffinance.IncentivesAndGrants, IncentivesAndGrants);
					Thread.sleep(1000);
					Log.info(IncentivesAndGrants);
					return true;
					
				}
				
			//TC007
				public boolean EnterOthers(String Others) throws InterruptedException {

					input(Meansoffinance.Others, Others);
					Thread.sleep(1000);
					Log.info(Others);
					return true;
					
				}
				
				//TC008
				public boolean EnterSpecify (String Specify ) throws InterruptedException {

					input(Meansoffinance.Specify, Specify );
					Thread.sleep(1000);
					Log.info(Specify);
					return true;
					
				}
				
			//TC008
				public boolean EnterTermLoanFromOtherFI (String TermLoanFromOtherFI ) throws InterruptedException {

					input(Meansoffinance.TermloanFromOtherFI, TermLoanFromOtherFI );
					Thread.sleep(1000);
					Log.info(TermLoanFromOtherFI);
					return true;
					
				}
				
				
				//TC009
			
				public boolean ClickontheSaveasdraft() throws InterruptedException {
					ScrollUntilElementVisible(Meansoffinance.AppliedTermLoan);
					Thread.sleep(1000);
					click(Meansoffinance.SaveAsDraft);
					Log.info("Click on the Save as draft" + Meansoffinance.SaveAsDraft);
					Thread.sleep(2000);
					return true;
				}
				
				//TC010
				
				public boolean ClickontheSaveandproceed() throws InterruptedException {
					click(Meansoffinance.SaveAndProceed);
					Log.info("Click on the Save and proceed" + Meansoffinance.SaveAndProceed);
					Thread.sleep(2000);
					return true;
				}
				
				
				public boolean Calculation() throws InterruptedException, IOException {

		            try {

		            	
		            	  
		                  /*String TotalAmountProjectCost = driver.findElement(By.xpath("//span[@class='text-end pl-3']")).getText();
		                  String TotalAmountProjectCostData = TotalAmountProjectCost.replace(",", "");
		                  System.out.println("Comma Removed data  :"+TotalAmountProjectCostData);
		                  String TotalAmountProjectCostvaliddata = TotalAmountProjectCostData.substring(1);
		                  System.out.println("Valida project cost data  :"+TotalAmountProjectCostvaliddata);*/

		                  //System.out.println("Total Project Cost :" + TotalAmountProjectCost);
		                  //click(Meansoffinance.MeansOfFinance);
		                  WebElement A = driver.findElement(By.xpath("//input[@placeholder='Share Capital (₹)']"));
		                  System.out.println("Share Capital Value is " + A.getAttribute("title"));
		                  String AValue = A.getAttribute("title");
		                  Thread.sleep(1000);
		                  WebElement B = driver.findElement(By.xpath("//input[@placeholder='Internal Accruals (₹)']"));
		                  System.out.println("Internal Accruals Value is " + B.getAttribute("title"));
		                  String BValue = B.getAttribute("title");
		                  Thread.sleep(1000);
		                  ScrollUntilElementVisible(Meansoffinance.scrolltoShare);
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
		                  BigDecimal  a = new BigDecimal(AValue);
		                  BigDecimal b = new BigDecimal(BValue);
		                  BigDecimal c = new BigDecimal(CValue);
		                  BigDecimal d =  new BigDecimal(DValue);
		                  BigDecimal e =  new BigDecimal(EValue);
		                  BigDecimal f = new BigDecimal(AppliedTermLoanwithoutcomma);
		                  BigDecimal sum = a.add(b).add(c).add(d).add(e).add(f);
		                  System.out.println("Total sum is " + sum);
		                  BigDecimal ProjCost = new BigDecimal(TotalAmountProjectCostvaliddata);
		                  System.out.println("Total Project Cost " + ProjCost);
		                  
		                  BigDecimal TermloanFromOtherFI = ProjCost.subtract(sum) ;
		                  System.out.println("Term Loan From Other FI : " + TermloanFromOtherFI);
		                  
		                  String TermloanFromOtherFIStringValue = TermloanFromOtherFI.toString();
		                  System.out.println("String Converted Term Loan Other FI : " + TermloanFromOtherFIStringValue);
		                  
		                  //((WebElement) Meansoffinance.TermloanFromOtherFI).clear();
		                  driver.findElement(By.xpath("//input[@placeholder='Term Loan From Other FI (₹)']")).clear();
		                  Thread.sleep(2000);
		                  input(Meansoffinance.TermloanFromOtherFI, TermloanFromOtherFIStringValue );
							Thread.sleep(1000);
							Log.info(TermloanFromOtherFIStringValue);

		                  Thread.sleep(1000);

		            }

		 

		            catch (NumberFormatException e) {

		                  System.out.println("Error: Invalid number format");

		            }

		 

		            return true;

		 

		      }
			
		
}
		
