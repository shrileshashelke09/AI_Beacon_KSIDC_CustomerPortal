package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Business_Information_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Business_Information_AllScenarios extends Base_Class {

	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	Business_Information_Module Business_Information_Module;

	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("KSIDC_Business_Information");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		Business_Information_Module = new Business_Information_Module();

	}

	@Test(dataProvider = "TestData4")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "LoginButton");
				Base_Class.SetUp();

				String EmailAddress = testdata.get("EmailAddress").toString();
				String Password = testdata.get("Password").toString();
				String DisplayName = testdata.get("DisplayName").toString();
				String DocketAmount = testdata.get("DocketAmount").toString();
				String LoanAmountRequired = testdata.get("LoanAmountRequired").toString();
				String ProductServiceName = testdata.get("ProductServiceName").toString();
				String BreakEvenPeriod = testdata.get("BreakEvenPeriod").toString();
				String ProjectImplementationPeriodInMonths = testdata.get("ProjectImplementationPeriodInMonths")
						.toString();
				String ApproxTotalLabourCount = testdata.get("ApproxTotalLabourCount").toString();
				String DocketNumber = testdata.get("DocketNumber").toString();
				String TreasuryReleaseDate = testdata.get("TreasuryReleaseDate").toString();
				String ProductionCapacityQuantityPerAnnumTest = testdata.get("ProductionCapacityQuantityPerAnnumTest")
						.toString();

				ExtentTestManager.getTest().log(Status.PASS,
						"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Button visible !");
				Thread.sleep(3000);

				// TC001
				ExtentTestManager.startTest("TestScenario01 : Login for Business Information Module");
				boolean Login = Business_Information_Module.Login(EmailAddress, Password);
//				
				// ExtentTestManager.startTest("Login successfully" + Login);
				ExtentTestManager.getTest().log(Status.PASS, "Login successfully" + Login);
				Log.info("Login successfully :" + Login);

				// Logout KSIDC

//				boolean LogoutKSIDC = Business_Information_Module.Logout();
//				ExtentTestManager.getTest().log(Status.PASS,"Logout Successfully" + LogoutKSIDC);
//				Log.info("Logged out !" + LogoutKSIDC);

				// TC003

				boolean EnquiryNowTermLoanKSIDC = Business_Information_Module.EnquiryNowTermLoanKSIDC();
				ExtentTestManager.startTest("Verify User Can Select Product on Home Page " + EnquiryNowTermLoanKSIDC);
				ExtentTestManager.getTest().log(Status.PASS, "1. Navigate to the home page." + EnquiryNowTermLoanKSIDC);
				ExtentTestManager.getTest().log(Status.PASS,
						"2. Click on 'Enquire Now' button for any listed product." + EnquiryNowTermLoanKSIDC);
				ExtentTestManager.getTest().log(Status.PASS,
						"Product inquiry page is displayed with product details.." + EnquiryNowTermLoanKSIDC);
				Log.info("Enquiry now button clicked and Redirected to Business Information page :"
						+ EnquiryNowTermLoanKSIDC);

				// TC004
				ExtentTestManager.startTest("Business information header is displyed");
				boolean BusinessinfoHeader = Business_Information_Module.BusinessinfoHeader();
				ExtentTestManager.getTest().log(Status.PASS, "Heading is 'Business Information'." + BusinessinfoHeader);
				Log.info("Business information header is displyed :" + BusinessinfoHeader);

				// TC005
				ExtentTestManager.startTest("Display Name Field - Alphanumeric Input");
				boolean Displayname = Business_Information_Module.Displaynamevisibility(DisplayName);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter alphanumeric characters in the Display Name field." + Displayname);
				ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric input is accepted." + Displayname);
				Log.info("Display name is displyed :" + Displayname);

//TC018
				ExtentTestManager.startTest("Selected Institution type displyed");
				boolean SelectInstitutionType = Business_Information_Module.SelectInstitutionTypes();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Click on 'Institution Types' dropdown." + SelectInstitutionType);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select an option." + SelectInstitutionType);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectInstitutionType);
				Log.info("Selected Institution type displyed :" + SelectInstitutionType);

				ExtentTestManager.startTest("Selected Scheme displyed");
				boolean SelectScheme = Business_Information_Module.selectScheme();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Scheme' dropdown." + SelectScheme);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select an option." + SelectScheme);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectScheme);
				Log.info("Selected Scheme displyed :" + SelectScheme);

				// TC020
				ExtentTestManager.startTest("Docket Amount Field - Range Validation");
				boolean EnterDocketAmount = Business_Information_Module.EnterDocketAmount(DocketAmount);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter a numeric value within acceptable range. 100 to 500 Lakhs" + EnterDocketAmount);
				ExtentTestManager.getTest().log(Status.PASS, "Input is accepted." + EnterDocketAmount);

				// TC21

				ExtentTestManager.startTest("Loan Amount Less Than Docket Amount Validation");
				boolean EnterLoanAmount = Business_Information_Module.EnterLoanAmount(LoanAmountRequired);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter Loan Amount Required less than Docket Amount." + EnterLoanAmount);
				ExtentTestManager.getTest().log(Status.PASS,
						"Inputs are accepted and no validation error is shown." + EnterLoanAmount);

				// TC022
				ExtentTestManager.startTest("Promoter Contribution Autoload");
				boolean ValidatePromoterContributionAmount = Business_Information_Module
						.ValidatePromoterContribution(DocketAmount, LoanAmountRequired);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Calculate difference of Docket Amount and Loan Amount Required."
								+ ValidatePromoterContributionAmount);
				ExtentTestManager.getTest().log(Status.PASS,
						"2. Check if Promoter Contribution field is autoloaded with the calculated value."
								+ ValidatePromoterContributionAmount);
				ExtentTestManager.getTest().log(Status.PASS,
						"Promoter Contribution is autoloaded correctly." + ValidatePromoterContributionAmount);
				Log.info("Entered Amount displyed :" + ValidatePromoterContributionAmount);

				// TC023
				ExtentTestManager.startTest("Chief Promoter Full Name Autoload");
				boolean ValidateAItoloadedchiefname = Business_Information_Module.ChiefPromoterFullNameAutoload();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Verify that Chief Promoter Full Name is prefilled." + ValidateAItoloadedchiefname);
				ExtentTestManager.getTest().log(Status.PASS,
						"Field is auto-filled with registered Chief Promoter's name." + ValidateAItoloadedchiefname);
				Log.info("Chief name displayed :" + ValidateAItoloadedchiefname);

				// TC024
				ExtentTestManager.startTest("Mobile No Autoloaded from Registration");
				boolean ValidateAItoloadedMobileNumber = Business_Information_Module.MobileNumberAutolad();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Verify that Mobile No is correctly prefilled." + ValidateAItoloadedchiefname);
				ExtentTestManager.getTest().log(Status.PASS,
						"Field is auto-filled with registered mobile number." + ValidateAItoloadedchiefname);
				Log.info("Mobile Number displayed :" + ValidateAItoloadedMobileNumber);

				// TC025
				ExtentTestManager.startTest("Email ID Autoloaded from Registration");
				boolean ValidateAutoloadedEmail = Business_Information_Module.ValidateEmailID();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Verify that Email ID is prefilled from registration info." + ValidateAutoloadedEmail);
				ExtentTestManager.getTest().log(Status.PASS,
						"Field is auto-filled with registered email ID." + ValidateAutoloadedEmail);
				Log.info("Email displayed :" + ValidateAutoloadedEmail);

				// TC026
				ExtentTestManager.startTest("Gender Selection from Dropdown");
				boolean SelectGenderMale = Business_Information_Module.SelectGender();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Gender' dropdown." + SelectGenderMale);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select 'Male'." + SelectGenderMale);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectGenderMale);
				Log.info("selected Gender displayed :" + SelectGenderMale);

				// TC027

				ExtentTestManager.startTest("Loan Purpose Selection from Dropdown");
				boolean SelectLoanPurpose = Business_Information_Module.SelectLoanPurpose();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Click on 'Loan Purpose' dropdown." + SelectLoanPurpose);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select prefred option.." + SelectLoanPurpose);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectLoanPurpose);
				Log.info("Loan purpose displayed :" + SelectLoanPurpose);

//TC028
				ExtentTestManager.startTest("Select Sector  from Dropdown");
				boolean SelectSector = Business_Information_Module.SelectSector();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Sector' dropdown." + SelectSector);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select 'prefered option." + SelectSector);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectSector);
				Log.info("Selected sector displayed :" + SelectSector);

				// TC029
				ExtentTestManager.startTest("Selecte Subsector from dropdown");
				boolean SelectSubSector = Business_Information_Module.SelectSubSector();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'SubSector' dropdown." + SelectSubSector);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select 'prefered option." + SelectSubSector);
				ExtentTestManager.getTest().log(Status.PASS,
						"Selected option is reflected in the field." + SelectSubSector);
				Log.info("Selected Subsector displayed :" + SelectSubSector);

				// TC030
				ExtentTestManager.startTest("Product/Service Name Field as Alphanumeric");
				boolean EnterProductServiceName = Business_Information_Module
						.EnterProductServiceName(ProductServiceName);
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Enter 'PRODUCT1' in Product/Service Name field." + EnterProductServiceName);
				ExtentTestManager.getTest().log(Status.PASS,
						"Alphanumeric input is accepted." + EnterProductServiceName);
				Log.info("Entered Product Service name displayed :" + EnterProductServiceName);

				// TC031
				ExtentTestManager.startTest("State Autoloaded as Kerala");
				boolean ValidateAutoloadedState = Business_Information_Module.ValidateAutoloadedState();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Check if the state field is prefilled with 'Kerala'." + ValidateAutoloadedState);
				ExtentTestManager.getTest().log(Status.PASS,
						"Field is auto-filled with 'Kerala'." + ValidateAutoloadedState);
				Log.info("Autoloaded state is :" + ValidateAutoloadedState);

				// TC032
				ExtentTestManager.startTest("Project Location as KANNUR from Dropdown");
				boolean SelectProjectLocation = Business_Information_Module.SelectProjectLocation();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on 'Project Location' dropdown." + SelectProjectLocation);
				ExtentTestManager.getTest().log(Status.PASS, "2. Select 'KANNUR'." + SelectProjectLocation);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is reflected in the field." + SelectProjectLocation);
				Log.info("Selected Project location is :" + SelectProjectLocation);

				// TC033
				ExtentTestManager.startTest("Project Type as Expansion from Dropdown");
				boolean SelectProjectType = Business_Information_Module.SelectProjectType();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Project Type' dropdown." + SelectProjectType);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is reflected in the field." + SelectProjectType);
				Log.info("Selected Project tyoe is displyed :" + SelectProjectType);

				// TC034
				ExtentTestManager.startTest("Break Even Period Entry");
				boolean EnterBreakEvenPeriod = Business_Information_Module.EnterBreakEvenPeriod(BreakEvenPeriod);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter '24' in Break Even Period field." + EnterBreakEvenPeriod);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted." + EnterBreakEvenPeriod);
				Log.info("Period is displyed :" + EnterBreakEvenPeriod);

				// TC035

				ExtentTestManager.startTest("Tentative Project Start Date Entry");
				boolean SelectTentativeDate = Business_Information_Module.SelectTentativeprojectDate();
				ExtentTestManager.getTest().log(Status.PASS, "1. Use date picker or manually enter a date in Tentative Project Start Date field." + SelectTentativeDate);
				ExtentTestManager.getTest().log(Status.PASS,"Accepted date is displayed in the field." + SelectTentativeDate);
				Log.info("Selected Date displyed :" + SelectTentativeDate);

				// TC036
				
				ExtentTestManager.startTest("Project Implementation Period Entry");
				boolean EnterProjectImplemenationPeriod = Business_Information_Module.EnterProjectImplementaionPeriod(ProjectImplementationPeriodInMonths);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter '24' months in the Project Implementation Period field." + EnterProjectImplemenationPeriod);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted." + EnterProjectImplemenationPeriod);
				Log.info("Entered period displyed :" + EnterProjectImplemenationPeriod);

				// TC037
				
				ExtentTestManager.startTest("Approx Total Labour Count Entry");
				boolean EnterApproxLabourCount = Business_Information_Module.EnterLabourCount(ApproxTotalLabourCount);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter '1000' in Approx Total Labour Count field." + EnterApproxLabourCount);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted." + EnterApproxLabourCount);
				Log.info("Entered Labour count displyed :" + EnterApproxLabourCount);

				// TC038

				ExtentTestManager.startTest("Contractor Department Dropdown Selection");
				boolean SelectContractorDepartment = Business_Information_Module.SelectContractorDepartment();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Contractor Department' dropdown. 2. Select an option." + SelectContractorDepartment);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is reflected in the field." + SelectContractorDepartment);
				Log.info("Selected Department displyed :" + SelectContractorDepartment);

				// TC039
				
				ExtentTestManager.startTest("Contractor Classification Dropdown Selection");
				boolean SelectContractorClassification = Business_Information_Module.SelectContractorClassification();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Contractor Classification' dropdown.\r\n"
						+ "2. Select an option." + SelectContractorClassification);
				ExtentTestManager.getTest().log(Status.PASS,"Selected option is reflected in the field." + SelectContractorClassification);
				Log.info("Selected classification displyed :" + SelectContractorClassification);

				// TC040
				
				ExtentTestManager.startTest("Docket Number Numeric Entry");
				boolean EnterDocketNumber = Business_Information_Module.EnterDocketNumber(DocketNumber);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter numeric value in Docket Number field." + EnterDocketNumber);
				ExtentTestManager.getTest().log(Status.PASS,"Numeric input is accepted." + EnterDocketNumber);
				Log.info("Docket Number  displyed :" + EnterDocketNumber);

				// TC041
				
				ExtentTestManager.startTest("Treasury Release Date Entry");
				boolean EntertreasuryReleaseDate = Business_Information_Module.EnterTreasuryReleaseDate(TreasuryReleaseDate);
				ExtentTestManager.getTest().log(Status.PASS, "1. Use date picker or manually enter a date in Treasury Release Date field." + EntertreasuryReleaseDate);
				ExtentTestManager.getTest().log(Status.PASS,"Accepted date is displayed in the field." + EntertreasuryReleaseDate);
				Log.info("Date  displyed :" + EntertreasuryReleaseDate);

				// TC042
				ExtentTestManager.startTest("Project Land Selection from Dropdown");
				boolean SelectProjectLand = Business_Information_Module.SelectProjectLand();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Project Land' dropdown.\r\n"
						+ "2. Select 'Owned'." + SelectProjectLand);
				ExtentTestManager.getTest().log(Status.PASS, "Selected option is reflected in the field." + SelectProjectLand);
                Log.info("Selected Project Land  displyed :" + SelectProjectLand);

				// TC043

				ExtentTestManager.startTest("Production Capacity Alphanumeric Entry");
				boolean ProductionCapacity = Business_Information_Module
						.EnterProductionCapacity(ProductionCapacityQuantityPerAnnumTest);
				ExtentTestManager.getTest().log(Status.PASS, "1. Enter alphanumeric value in Production Capacity field." + ProductionCapacity);
				ExtentTestManager.getTest().log(Status.PASS, "Alphanumeric input is accepted." + ProductionCapacity);
                Log.info("Entered Capacity displayed :" + ProductionCapacity);

				// TC044
                
				ExtentTestManager.startTest("Pollution Category Selection from Dropdown");
				boolean SelectPollutionCategory = Business_Information_Module.SelectPollutionCategory();
				ExtentTestManager.getTest().log(Status.PASS,"1. Click on 'Pollution Category' dropdown.\r\n"
						+ "2. Select 'Green'." + SelectPollutionCategory);
				ExtentTestManager.getTest().log(Status.PASS,"Selected pollution category displayed" + SelectPollutionCategory);
                Log.info("Selected pollution category displayed :" + SelectPollutionCategory);

				// TC045
                
				ExtentTestManager.startTest("Project Nature Selection from Dropdown");
				boolean SelectrojectNature = Business_Information_Module.SelectProjectNature();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click on 'Project Nature' dropdown.\r\n"
						+ "2. Select 'Project Nature'." + SelectrojectNature);
				ExtentTestManager.getTest().log(Status.PASS, "Selected Project Nature displayed" + SelectrojectNature);
Log.info("Selected Project Nature displayed :" + SelectrojectNature);

				// TC046
ExtentTestManager.startTest("First Charge For The Collateral Security - Radio Button Selection");
				boolean SelectYESforfirstcharge = Business_Information_Module.SelectYESforFirstcharge();
				ExtentTestManager.getTest().log(Status.PASS, "1. Select 'Yes' for First Charge For The Collateral Security." + SelectYESforfirstcharge);
				ExtentTestManager.getTest().log(Status.PASS, "Radio button selection is reflected correctly." + SelectYESforfirstcharge);
Log.info("Selected YES displayed :" + SelectYESforfirstcharge);

				// TC047

ExtentTestManager.startTest("Exclusive First Charge on Company Assets - Radio Button Selection");
				boolean SelectYESforExclusivefirstcharge = Business_Information_Module
						.SelectYESforExclusiveFirstcharge();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Select 'Yes' for Can An Exclusive First Charge On The Company Assets." + SelectYESforExclusivefirstcharge);
				ExtentTestManager.getTest().log(Status.PASS,
						"Radio button selection is reflected correctly." + SelectYESforExclusivefirstcharge);
			Log.info("Selected YES displayed :" + SelectYESforExclusivefirstcharge);

				// TC048
				boolean SelectYesforExistingAsset = Business_Information_Module.ExistingAsset();
				ExtentTestManager.startTest("Selected YES displayed" + SelectYesforExistingAsset);
				ExtentTestManager.getTest().log(Status.PASS, "Selected YES displayed" + SelectYesforExistingAsset);
				Log.info("Selected YES displayed :" + SelectYesforExistingAsset);

				// TC049

				ExtentTestManager.startTest("Terms and Conditions Checkbox Tick");
				boolean SelectCheckboxforTermsandCondition = Business_Information_Module.CheckboxofTermsandCondition();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Tick the terms and conditions checkbox." + SelectCheckboxforTermsandCondition);
				ExtentTestManager.getTest().log(Status.PASS,
						"Checkbox is checked." + SelectCheckboxforTermsandCondition);
				Log.info("Checked checkbox displayed :" + SelectCheckboxforTermsandCondition);

				// TC050

				ExtentTestManager.startTest("Submit Button Click");
				boolean submit = Business_Information_Module.Submit();
				ExtentTestManager.getTest().log(Status.PASS, "1. Click the 'Submit' button." + submit);
				ExtentTestManager.getTest().log(Status.PASS, "Form is successfully submitted, and a confirmation message is displayed." + submit);
                Log.info("Business information submitted :" + submit);

				// TC051

				ExtentTestManager.startTest("Successful Submission Message");
				boolean successcheck = Business_Information_Module.Submit();
				ExtentTestManager.getTest().log(Status.PASS,
						"1. Verify the success message after submission." + successcheck);
				ExtentTestManager.getTest().log(Status.PASS,
						"Success message is displayed confirming submission." + successcheck);
				Log.info("Business information Sucessfully submitted :" + successcheck);

				// App Logout

				Thread.sleep(2000);
				driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

		} catch (Exception e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		} catch (AssertionError e) {
			System.out.println("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("*** Test execution " + testdata.get("TestScenario").toString() + " failed...");
			Log.error("" + e.getMessage());
			String fileName = (String) context.getAttribute("fileName");

			try {
				File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName,
						testdata.get("TestScenario").toString());
				ExtentTestManager.getTest().fail(e.getMessage(),
						MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
			} catch (Exception e1) {
				System.out.println("File not found " + e1);
			}
			ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

			// Logout
			context.setAttribute("fileName", "Logout");
			// driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}

	}

	@DataProvider(name = "TestData4")
	public static Object[][] gettestdate() throws IOException {

		Object[][] objectarry = null;
		java.util.List<Map<String, String>> completedata = com.Utility.ExcelReader.getdata();

		objectarry = new Object[completedata.size()][1];

		for (int i = 0; i < completedata.size(); i++) {
			objectarry[i][0] = completedata.get(i);
		}
		return objectarry;
	}

}