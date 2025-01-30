package com.test.BusinessInformation_Modules;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_BusinessInformation_Modules.Security_Plant_Machinary_Module;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class Security_Plant_Machinary_AllScenarios extends Base_Class {

		com.Utility.ExcelReader ExcelReader;
		Base_Class Base_Class;
		Log log;
		TestListener TestListener;
		com.Utility.ScreenShot screenShot;
		Security_Plant_Machinary_Module Security_Plant_Machinary_Module;


		@BeforeSuite
		public void reference() {
			ExcelReader = new com.Utility.ExcelReader("KSIDC_Technical_Know");
			log = new Log();
			TestListener = new TestListener();
			screenShot = new com.Utility.ScreenShot(null);
			Base_Class = new Base_Class();
			Security_Plant_Machinary_Module = new Security_Plant_Machinary_Module();

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
					// Log.info("Button visible !");
					Thread.sleep(3000);

					String ServiceType = testdata.get("ServiceType").toString();
					String ServiceProvider = testdata.get("ServiceProvider").toString();
					String FeeAmount = testdata.get("FeeAmount").toString();

	
					// TC001
					ExtentTestManager.startTest("TC001 : Login for Security_Plant_Machinary_Module");
					Log.info("Button visible !");
					boolean Login = Security_Plant_Machinary_Module.login();
					ExtentTestManager.getTest().log(Status.PASS, "Enter Username" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Enter Password" + Login);
					ExtentTestManager.getTest().log(Status.PASS, "Clicked on Login Button" + Login);
					Log.info("Login successfully :" + Login);
					
					//TC002
					
					ExtentTestManager.startTest("TC002 : Verify navigation to Security stage");
					boolean NavigatetoProjectCost = Security_Plant_Machinary_Module.NavigatetoProjectCost();
					ExtentTestManager.getTest().log(Status.PASS, "1. Complete document upload in Project Cost stage\r\n"
							+ "2. Click 'Continue'" + NavigatetoProjectCost);
					ExtentTestManager.getTest().log(Status.PASS, "Security stage opens automatically" + NavigatetoProjectCost);
					
					//TC003
					ExtentTestManager.startTest("TC003 : Verify ability to click on 'Plant & Machinery'");
					boolean VerifyPlantAndMachineryComponent = Security_Plant_Machinary_Module.VerifyPlantAndMachineryComponent();
					ExtentTestManager.getTest().log(Status.PASS, "Locate 'Plant & Machinery'" + VerifyPlantAndMachineryComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Plant & Machinery Details' page opens" + VerifyPlantAndMachineryComponent);
					
					//TC004
					
					ExtentTestManager.startTest("TC004 : Verify opening of 'Plant & Machinery Details' page");
					boolean AccessPlantAndMachineryComponent = Security_Plant_Machinary_Module.AccessPlantAndMachineryComponent();
					ExtentTestManager.getTest().log(Status.PASS, "1. Click on the 'Technical Know' component" + AccessPlantAndMachineryComponent);
					ExtentTestManager.getTest().log(Status.PASS, "'Technical Know' page opens successfully" + AccessPlantAndMachineryComponent);
					
					//TC005
											
					ExtentTestManager.startTest("TC005 : Verify page heading 'Plant & Machinery Details'");
					boolean VerifyPlantAndMachineryComponentHeader = Security_Plant_Machinary_Module.VerifyPlantAndMachineryComponentHeader();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the page heading" + VerifyPlantAndMachineryComponentHeader);
					ExtentTestManager.getTest().log(Status.PASS, "Heading is correctly displayed" + VerifyPlantAndMachineryComponentHeader);
							
					
					//TC006
										
					ExtentTestManager.startTest("TC006 : Verify display of informative message on 'Plant & Machinery Details' page");
					boolean VerifyInformativeMessage = Security_Plant_Machinary_Module.VerifyInformativeMessage();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the page for any instructional message" + VerifyInformativeMessage);
					ExtentTestManager.getTest().log(Status.PASS, "Message is correctly displayed\r\n"
							+ "'To View a previous entry, click on the Plant & Machinery. '" + VerifyInformativeMessage);
					
					//TC007
				
					ExtentTestManager.startTest("TC007 - Verify display of stage name 'security'");
					boolean VerifyStageName = Security_Plant_Machinary_Module.VerifyStageName();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the stage name label" + VerifyStageName);
					ExtentTestManager.getTest().log(Status.PASS, "Stage name is accurate and visible -'security'" + VerifyStageName);
	
					
					//TC008
					
					ExtentTestManager.startTest("TC008 - Verify sub heading 'LIST OF PLANT & MACHINERY'");
					boolean VerifySubHeading = Security_Plant_Machinary_Module.VerifySubHeading();
					ExtentTestManager.getTest().log(Status.PASS, "1. Identify the subheading in the grid" + VerifySubHeading);
					ExtentTestManager.getTest().log(Status.PASS, "Subheading is correctly shown -  'LIST OF PLANT & MACHINERY'" + VerifySubHeading);
	

					//TC009
					ExtentTestManager.startTest("TC009 - Verify display of stage name 'security'");
					boolean VerifyAddedData = Security_Plant_Machinary_Module.VerifyAddedData();
					ExtentTestManager.getTest().log(Status.PASS, "1. Check for the stage name label" + VerifyAddedData);
					ExtentTestManager.getTest().log(Status.PASS, "Stage name is accurate and visible -'security'" + VerifyAddedData);
	
					//TC010
					
					ExtentTestManager.startTest("TC010 - Verify Total amount ");
					boolean VerifyTotalAmount = Security_Plant_Machinary_Module.VerifyTotalAmount();
					ExtentTestManager.getTest().log(Status.PASS, "1. Observe the total amount displayed" + VerifyTotalAmount);
					ExtentTestManager.getTest().log(Status.PASS, "Total is correct based on entered details" + VerifyTotalAmount);
	
    				
					
					//App Logout

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



					
					
	



