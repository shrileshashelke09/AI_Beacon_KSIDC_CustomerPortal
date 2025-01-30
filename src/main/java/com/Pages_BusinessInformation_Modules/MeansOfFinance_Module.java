package com.Pages_BusinessInformation_Modules;

import java.io.IOException; 

import com.BasePackage.Base_Class;
import com.Page_Repositary.MeansOfFinance;
import com.Utility.Log;




public class MeansOfFinance_Module extends Base_Class{
	
	MeansOfFinance Meansoffinance = new MeansOfFinance();
	
	
	// TC001

	public  boolean login() throws InterruptedException, IOException {
		Login();
		return true;



	}

	// TC002
		public boolean Navigatetomeansoffinance() throws InterruptedException {
			click(Meansoffinance.ContinueButton);
			Log.info("Navigate to MeansOfFinance" + Meansoffinance.ContinueButton);
			Thread.sleep(2000);
			return true;
		}
		
	
		public boolean AccessMeansoffinance() throws InterruptedException {
			//ScrollUntilElementVisible(Meansoffinanceobj.ScrolltoProjectCost);
			
			ScrollUntilElementVisible(Meansoffinance.ScrolltoProjectCost);
			Thread.sleep(1000);
			ScrollUntilElementVisible(Meansoffinance.ScrolltolinePlantAndMachinery);
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
				
				//TC009
			/*	public boolean EnterAppliedTermLoan (String AppliedTermLoan ) throws InterruptedException {

					input(Meansoffinance.AppliedTermLoan, AppliedTermLoan );
					Thread.sleep(1000);
					Log.info(AppliedTermLoan);
					return true;
					
				}
		*/
		
}
		
