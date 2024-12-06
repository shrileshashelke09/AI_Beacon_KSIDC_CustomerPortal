package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Basic_Information_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Basic_Information_AllScenarios extends Base_Class{
	
		
		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Basic_Information_Module Basic_Information_Module;
		
		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Basic_Information");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Basic_Information_Module = new Basic_Information_Module();

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

					ExtentTestManager.getTest().log(Status.PASS,
							"Login button visibility" + com.BasePackage.Base_Class.Pagetitle);
					Log.info("Button visible !");
					Thread.sleep(3000);
					
					
					String EmailAddress = testdata.get("EmailAddress").toString();
					String Password = testdata.get("Password").toString();
					String UdyamNoUdyogAadhaar = testdata.get("UdyamNoUdyogAadhaar").toString();
					String InstitutionMobile = testdata.get("InstitutionMobile").toString();
					String LandlineNumberTest = testdata.get("LandlineNumberTest").toString();
					String WebsiteTest = testdata.get("WebsiteTest").toString();
					String CIN = testdata.get("CIN").toString();
					String ExternalCreditRating = testdata.get("ExternalCreditRating").toString();
					String TIN = testdata.get("TIN").toString();
					String TAN = testdata.get("TAN").toString();
					String GSTIN = testdata.get("GSTIN").toString();
					String ShareHoldingByIndividuals = testdata.get("ShareHoldingByIndividuals").toString();
					String CKYCID = testdata.get("CKYCID").toString();
					String DPIITNumber = testdata.get("DPIITNumber").toString();
					String KSUMNumber = testdata.get("KSUMNumber").toString();
					String IFSCCODE = testdata.get("IFSCCODE").toString();
					String AccountNumber = testdata.get("AccountNumber").toString();

					
					//TC001
					ExtentTestManager.startTest("TestScenario01 : Login for Business Information Module");
					boolean Login = Basic_Information_Module.Login(EmailAddress, Password);
					ExtentTestManager.getTest().log(Status.PASS , "Login successfully" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002 //TC003 //TC004
					
					ExtentTestManager.startTest("Continue botton clicked and redirected to Basic Information Page");
					boolean BasicInfo = Basic_Information_Module.BasicInformationPageAccessibility();
					ExtentTestManager.getTest().log(Status.PASS , "Basic Information page redirected successfully" + BasicInfo);
					Log.info("Basic Information page redirected successfully :" + BasicInfo);
					
					//TC005
					
					ExtentTestManager.startTest("Header displayed Basic Information Page");
					boolean BasicInfoHeader = Basic_Information_Module.BasicInfoHeader();
					ExtentTestManager.getTest().log(Status.PASS , "Basic Information Header displayed successfully" + BasicInfoHeader);
					Log.info("Basic Information Header displayed successfully :" + BasicInfoHeader);
					
					//TC006 
					
					ExtentTestManager.startTest("MSME Radio displayed successfully");
					boolean MSMERadioButtonVisibility = Basic_Information_Module.MSMERadioVisibility();
					ExtentTestManager.getTest().log(Status.PASS , "MSME Radio displayed successfully" + MSMERadioButtonVisibility);
					Log.info("MSME Radio displayed successfully :" + MSMERadioButtonVisibility);
					
					//TC007
					
					ExtentTestManager.startTest("YES and NO toggle clicked");
					boolean YESNOToggle = Basic_Information_Module.YESNOToggleforMSME();
					ExtentTestManager.getTest().log(Status.PASS , "Only one toggle selected at a time" + YESNOToggle);
                    Log.info("Only one toggle selected at a time successfully :" + YESNOToggle);
					
					//TC009
                    
                    ExtentTestManager.startTest("YES  clicked");
					boolean SelectYesforMSME = Basic_Information_Module.SelectYesforMSME();
					ExtentTestManager.getTest().log(Status.PASS , "MSME Yes Selected" + SelectYesforMSME);
                    Log.info("MSME Yes Selected :" + SelectYesforMSME);
					
					//TC015
                    
                    ExtentTestManager.startTest("Udyam No verified");
					boolean EnterandVerifyUdyamNo = Basic_Information_Module.EnterandVerifyUdyamNo(UdyamNoUdyogAadhaar);
					ExtentTestManager.getTest().log(Status.PASS , "Udyam No verified" + EnterandVerifyUdyamNo);
                    Log.info("Udyam No verified :" + EnterandVerifyUdyamNo);
                    
                    ExtentTestManager.startTest("Name of Enterprises validated");
					boolean ValidateEnterprisesName = Basic_Information_Module.ValidateNameOfEnterprises();
					ExtentTestManager.getTest().log(Status.PASS , "Name of Enterprises validated" + ValidateEnterprisesName);
                    Log.info("Name of Enterprises validated :" + ValidateEnterprisesName);
					
                    ExtentTestManager.startTest("Type of Enterprises validated");
					boolean ValidateTypeofEnterprises = Basic_Information_Module.ValidateTypeOfOrganization();
					ExtentTestManager.getTest().log(Status.PASS , "Type of Enterprises validated" + ValidateTypeofEnterprises);
                    Log.info("Type of Enterprises validated :" + ValidateTypeofEnterprises);
					
                    ExtentTestManager.startTest("Class of Activity selected");
					boolean SelectClassofActivity = Basic_Information_Module.SelectClassofActivity();
					ExtentTestManager.getTest().log(Status.PASS , "Class of Activity selected" + SelectClassofActivity);
                    Log.info("Class of Activity selected :" + SelectClassofActivity);
					
                    ExtentTestManager.startTest("Date of Incorporation displayed");
					boolean ValidaeDateofInc = Basic_Information_Module.ValidateIncorporationDate();
					ExtentTestManager.getTest().log(Status.PASS , "Date of Incorporation displayed" + ValidaeDateofInc);
                    Log.info("Date of Incorporation displayed :" + ValidaeDateofInc);
					
                    
                    ExtentTestManager.startTest("Date of Udyam Registration displayed");
					boolean ValidateDateofUdyamReg = Basic_Information_Module.ValidateUdyamRegDate();
					ExtentTestManager.getTest().log(Status.PASS , "Date of Udyam Registration displayed" + ValidateDateofUdyamReg);
                    Log.info("Date of Udyam Registration displayed :" + ValidateDateofUdyamReg);
                    
                    //TC016 
                    
//                    ExtentTestManager.startTest("Class of Activity for Non MSME displayed");
//					boolean SelectclassofactivityforNonMSME = Basic_Information_Module.SelectClassofActivityNonMSME();
//					ExtentTestManager.getTest().log(Status.PASS , "Class of Activity for Non MSME displayed" + SelectclassofactivityforNonMSME);
//                    Log.info("Class of Activity for Non MSME displayed :" + SelectclassofactivityforNonMSME);
					
					
                    //TC017
                    
                    ExtentTestManager.startTest("Entered Mobile Number displayed");
					boolean EnterInstitutionMobileNo = Basic_Information_Module.EnterInstitutionMobileNumber(InstitutionMobile );
					ExtentTestManager.getTest().log(Status.PASS , "Entered Mobile Number" + EnterInstitutionMobileNo);
                    Log.info("Entered Mobile Number :" + EnterInstitutionMobileNo);
					
					 //TC018
                    
                    ExtentTestManager.startTest("Entered Landline Number displayed");
					boolean EnterLandlineNo = Basic_Information_Module.EnterLandlineNumber(LandlineNumberTest);
					ExtentTestManager.getTest().log(Status.PASS , "Entered Landline Number" + EnterLandlineNo);
                    Log.info("Entered Landline Number :" + EnterLandlineNo); 
                    
                    //TC019
                    
                    ExtentTestManager.startTest("Autoloaded Email ID displayed");
					boolean ValidateEmailID = Basic_Information_Module.ValidateAutoloadedEmail();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Email ID displayed" + ValidateEmailID);
                    Log.info("Autoloaded Email ID displayed :" + ValidateEmailID); 
                    
                    //TC020
                    
                    ExtentTestManager.startTest("Enterted Website Test displayed");
					boolean EnterWebsiteTest = Basic_Information_Module.EnterWebsiteTest(WebsiteTest);
					ExtentTestManager.getTest().log(Status.PASS , "Enterted Website Test displayed" + EnterWebsiteTest);
                    Log.info("Enterted Website Test displayed :" + EnterWebsiteTest); 
                    
                    //TC021
                    
                    ExtentTestManager.startTest("Autoloaded Address displayed");
					boolean ValidateAdress = Basic_Information_Module.ValidateOfficialAddress();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Address displayed" + ValidateAdress);
                    Log.info("Autoloaded Address displayed :" + ValidateAdress); 
                    
                    //TC022
                    
                    ExtentTestManager.startTest("Autoloaded Landmark displayed");
					boolean ValidateLandmark = Basic_Information_Module.ValidateLandmark();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded Landmark displayed" + ValidateLandmark);
                    Log.info("Autoloaded Landmark displayed :" + ValidateLandmark); 
                    
                    //TC023
                    
                    ExtentTestManager.startTest("Autoloaded Place displayed");
					boolean ValidatePlace = Basic_Information_Module.ValidatePlace();
					ExtentTestManager.getTest().log(Status.PASS , "Autoloaded place displayed" + ValidatePlace);
                    Log.info("Autoloaded place displayed :" + ValidatePlace); 
                    
                    //TC24 
                    
                    ExtentTestManager.startTest(" Pin displayed");
					boolean ValidatePin = Basic_Information_Module.ValidatePin();
					ExtentTestManager.getTest().log(Status.PASS , " Pin displayed" + ValidatePin);
                    Log.info(" Pin displayed :" + ValidatePin); 
                    
                    //TC025
                    
                    ExtentTestManager.startTest(" Country displayed");
					boolean validateCountry = Basic_Information_Module.Validatecountry();
					ExtentTestManager.getTest().log(Status.PASS , " Country displayed" + validateCountry);
                    Log.info(" Country displayed :" + validateCountry); 
                    
                    //TC026
                    
                    ExtentTestManager.startTest(" State displayed");
					boolean ValidateState = Basic_Information_Module.ValidateState();
					ExtentTestManager.getTest().log(Status.PASS , " state displayed" + ValidateState);
                    Log.info(" state displayed :" + ValidateState); 
                    
                    //TC027
                    
                    ExtentTestManager.startTest(" District displayed");
					boolean ValidateDistrict = Basic_Information_Module.ValidateDistrict();
					ExtentTestManager.getTest().log(Status.PASS , " District displayed" + ValidateDistrict);
                    Log.info(" District displayed :" + ValidateDistrict);
                    
                    //TC028
                    ExtentTestManager.startTest(" CIty displayed");
					boolean ValidateCIty = Basic_Information_Module.ValidateCity();
					ExtentTestManager.getTest().log(Status.PASS , " City displayed" + ValidateCIty);
                    Log.info(" City displayed :" + ValidateCIty);
                    
                    //TC029
                    
                    ExtentTestManager.startTest(" Post displayed");
					boolean ValidatePost = Basic_Information_Module.ValidatePost();
					ExtentTestManager.getTest().log(Status.PASS , " Post displayed" + ValidatePost);
                    Log.info(" Post displayed :" + ValidatePost);
                    
                    //TC030
                    
                    ExtentTestManager.startTest(" Selected Taluk displayed");
					boolean SelectTaluk = Basic_Information_Module.SelectTaluk();
					ExtentTestManager.getTest().log(Status.PASS , " Selected Taluk displayed" + SelectTaluk);
                    Log.info(" Selected Taluk displayed :" + SelectTaluk);
                    
                    //TC031
                    
                    ExtentTestManager.startTest(" Company PAN displayed");
					boolean ValidateCompanyPAN = Basic_Information_Module.ValidateCompanyPAN();
					ExtentTestManager.getTest().log(Status.PASS , " Company PAN  displayed" + ValidateCompanyPAN);
                    Log.info(" Company PAN  displayed :" + ValidateCompanyPAN);
                    
                    //TC032
                    
                    ExtentTestManager.startTest(" CIN displayed");
					boolean EnterCIN = Basic_Information_Module.EnterCIN(CIN);
					ExtentTestManager.getTest().log(Status.PASS , " CIN  displayed" + EnterCIN);
                    Log.info(" CIN  displayed :" + EnterCIN);
                    
                    //TC033
                    ExtentTestManager.startTest(" Rating  displayed");
					boolean EnterRating = Basic_Information_Module.EnterExternalCreditRating(ExternalCreditRating);
					ExtentTestManager.getTest().log(Status.PASS , " Rating  displayed" + EnterRating);
                    Log.info(" Rating  displayed :" + EnterRating);
                    
                    //TC034
                    
                    ExtentTestManager.startTest(" TIN  displayed");
					boolean EnterTIN = Basic_Information_Module.EnterTIN(TIN);
					ExtentTestManager.getTest().log(Status.PASS , " TIN  displayed" + EnterTIN);
                    Log.info(" TIN  displayed :" + EnterTIN);
                    
                    //TC035
                    
                    ExtentTestManager.startTest(" TAN  displayed");
					boolean EnterTAN = Basic_Information_Module.EnterTAN(TAN);
					ExtentTestManager.getTest().log(Status.PASS , " TAN  displayed" + EnterTAN);
                    Log.info(" TAN  displayed :" + EnterTAN);
                    
                    //TC036
                    
                    ExtentTestManager.startTest(" GSTIN  displayed");
					boolean EnterGSTIN = Basic_Information_Module.EnterGSTIN(GSTIN);
					ExtentTestManager.getTest().log(Status.PASS , " GSTIN  displayed" + EnterGSTIN);
                    Log.info(" GSTIN  displayed :" + EnterGSTIN);
                    
                    //TC037
                    
                    ExtentTestManager.startTest(" Individual Sharing  displayed");
					boolean Entersharingindividual = Basic_Information_Module.EnterIndividualsharing(ShareHoldingByIndividuals);
					ExtentTestManager.getTest().log(Status.PASS , "  Individual Sharing  displayed" + Entersharingindividual);
                    Log.info("  Individual Sharing  displayed :" + Entersharingindividual);
                    
                    //TC038
                    
                    ExtentTestManager.startTest(" ENtityHolding  displayed");
					boolean EnterEntityshare = Basic_Information_Module.EnterENtityHolding();
					ExtentTestManager.getTest().log(Status.PASS , "  ENtityHolding  displayed" + EnterEntityshare);
                    Log.info("  ENtityHolding  displayed :" + EnterEntityshare);
                    
                    //TC039
                    
                    ExtentTestManager.startTest(" CKYCID  displayed");
					boolean EnterCKYCID = Basic_Information_Module.EnterCKYCID(CKYCID);
					ExtentTestManager.getTest().log(Status.PASS , "  ICKYCID  displayed" + EnterCKYCID);
                    Log.info("  CKYCID  displayed :" + EnterCKYCID);
                    
                    //TC040
                    
                    ExtentTestManager.startTest(" DPIITNumber  displayed");
					boolean EnterDPIITNumber = Basic_Information_Module.EnterDPIITNumber(DPIITNumber);
					ExtentTestManager.getTest().log(Status.PASS , "  DPIITNumber  displayed" + EnterDPIITNumber);
                    Log.info("  DPIITNumber  displayed :" + EnterDPIITNumber);
                    
                    //TC041
                    
                    
                    ExtentTestManager.startTest(" KSUMNumber  displayed");
					boolean EnterKSUMNumber = Basic_Information_Module.EnterKSUMNumber(KSUMNumber);
					ExtentTestManager.getTest().log(Status.PASS , "  KSUMNumber  displayed" + EnterKSUMNumber);
                    Log.info("  KSUMNumber  displayed :" + EnterKSUMNumber);
                    
                    //TC042
                    
                    ExtentTestManager.startTest(" PopUp  displayed");
					boolean CheckAddBankAccButton = Basic_Information_Module.ClickonAddBankAccButton();
					ExtentTestManager.getTest().log(Status.PASS , "  PopUp  displayed" + CheckAddBankAccButton);
                    Log.info("  PopUp  displayed :" + CheckAddBankAccButton);
                    
                    //TC043
                    
                    ExtentTestManager.startTest(" IFSC code  displayed");
					boolean EnterIFSC = Basic_Information_Module.EnterIFSC(IFSCCODE);
					ExtentTestManager.getTest().log(Status.PASS , "  IFSC  displayed" + EnterIFSC);
                    Log.info("  IFSC  displayed :" + EnterIFSC);
                    
                    //TC044
                    
                    ExtentTestManager.startTest(" Bank displayed");
					boolean ValidateBank = Basic_Information_Module.ValidateBank();
					ExtentTestManager.getTest().log(Status.PASS , "  Bank  displayed" + ValidateBank);
                    Log.info("  Bank  displayed :" + ValidateBank);
                    
                    //TC045
                    
                    ExtentTestManager.startTest(" Branch displayed");
					boolean ValidateBranch = Basic_Information_Module.ValidateBranch();
					ExtentTestManager.getTest().log(Status.PASS , "  Branch  displayed" + ValidateBranch);
                    Log.info("  Branch  displayed :" + ValidateBranch);
                    
                    //TC046
                    
                    ExtentTestManager.startTest(" Account type displayed");
					boolean SelectAccType = Basic_Information_Module.SelectAccType();
					ExtentTestManager.getTest().log(Status.PASS , "  Account type  displayed" + SelectAccType);
                    Log.info("  Account type  displayed :" + SelectAccType);
                    
                    //TC047
                    
                    ExtentTestManager.startTest(" Account Nature displayed");
					boolean SelectAccNature = Basic_Information_Module.SelectAccNature();
					ExtentTestManager.getTest().log(Status.PASS , "  Account nature  displayed" + SelectAccNature);
                    Log.info("  Account nature  displayed :" + SelectAccNature);
                    
                    //TC048
                    
                    ExtentTestManager.startTest(" Account Number displayed");
					boolean EnterAccnumber = Basic_Information_Module.EnterAccNumber(AccountNumber);
					ExtentTestManager.getTest().log(Status.PASS , "  Account Number  displayed" + EnterAccnumber);
                    Log.info("  Account Number  displayed :" + EnterAccnumber);
                    
                    //TC049
                    ExtentTestManager.startTest(" Bank Added ");
					boolean AddBank = Basic_Information_Module.AddBank();
					ExtentTestManager.getTest().log(Status.PASS , "  Bank Added" + AddBank);
                    Log.info("  Bank Added :" + AddBank);
                    
                    //TC050
                    
                    ExtentTestManager.startTest(" Gender Employment Details Added ");
					boolean AddGenderEmpDetails = Basic_Information_Module.SelectGender();
					ExtentTestManager.getTest().log(Status.PASS , "  Gender Employment Details Added" + AddGenderEmpDetails);
                    Log.info("  Gender Employment Details Added :" + AddGenderEmpDetails);
                    
                    //TC051
                    
                    ExtentTestManager.startTest(" Terms and Conditions Accepted ");
					boolean TermsAndCondition = Basic_Information_Module.AcceptTermsandCondition();
					ExtentTestManager.getTest().log(Status.PASS , "  Terms and Conditions Accepted" + TermsAndCondition);
                    Log.info(" Terms and Conditions Accepted :" + TermsAndCondition);
                    
                    //TC052
                    
                    ExtentTestManager.startTest(" Successfully Submitted ");
					boolean SubmitBasicInfo = Basic_Information_Module.SaveAndProceed();
					ExtentTestManager.getTest().log(Status.PASS , "  Successfully Submitted" + SubmitBasicInfo);
                    Log.info(" Successfully Submitted :" + SubmitBasicInfo);
                    
                    
					//App Logout
					
					Thread.sleep(2000);
					driver.quit();
					ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
					Log.info("Logout is done");

					// EndTest
					System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString()+ " ending ***"));
					ExtentTestManager.endTest();
					ExtentManager.getInstance().flush();
					Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

				}

			}
			catch (Exception e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
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
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
			}
			catch (AssertionError e) {
				System.out.println("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("*** Test execution " +  testdata.get("TestScenario").toString() + " failed...");
				Log.error("" + e.getMessage());
				String fileName = (String) context.getAttribute("fileName");

				try {
					File file = new com.Utility.ScreenShot(driver).takeScreenShot(fileName, testdata.get("TestScenario").toString());
					ExtentTestManager.getTest().fail(e.getMessage(),
							MediaEntityBuilder.createScreenCaptureFromPath(file.toString()).build());
				} catch (Exception e1) {
					System.out.println("File not found " + e1);
				}
				ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");

				// Logout
				context.setAttribute("fileName", "Logout");
				//driver.quit();
				ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
				Log.info("Logout is done");

				// EndTest
				System.out.println(("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***"));
				ExtentTestManager.endTest();
				ExtentManager.getInstance().flush();
				Log.info("*** Test Suite " +  testdata.get("TestScenario").toString() + " ending ***");
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
		

