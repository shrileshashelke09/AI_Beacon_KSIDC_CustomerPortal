package com.test.user.TimesheetModule;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BasePackage.Base_Class;
import com.Pages_TimesheetModule.TimeSheet_ListModule;
import com.Pages_TimesheetModule.Timesheet_CreateModule;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios_TimesheetCreateModule extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	TimeSheet_ListModule TimeSheet_ListModule;
	Timesheet_CreateModule Timesheet_CreateModule;

	private static By userDropDown = By.xpath("//div[@id='userDropdown']/h4");
	private static By L_signout = By.xpath("//button[@class='dropdown-item ' and contains(text(),'Sign out')]");
	
	private static By L_username = By.xpath("//input[@id='Username']");
	private static By L_password = By.xpath("//input[@id='Password']");
	private static By L_SignIn = By.xpath("//span[contains(text(),'Sign In')]");
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("TimeSheetModule");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		
		TimeSheet_ListModule= new TimeSheet_ListModule();
		Timesheet_CreateModule= new Timesheet_CreateModule();
	}

	@Test(dataProvider = "TestData")
	public void RUNALL(Map<Object, Object> testdata, ITestContext context) throws IOException, InterruptedException {

		try {

			if (testdata.get("Run").toString().equalsIgnoreCase("Yes")) {
				// TC_BAC_Login_Positive case
				ExtentTestManager.startTest(testdata.get("TestScenario").toString());
				Log.info("*** Running test method " + testdata.get("TestScenario").toString() + "...");
				context.setAttribute("fileName", "Login");
				Base_Class.SetUp();
				ExtentTestManager.getTest().log(Status.PASS,
						"Application Login" + com.BasePackage.Base_Class.Pagetitle);
				Log.info("Login successful !");
				Thread.sleep(3000);
				
				String project = testdata.get("project").toString();
				String moduleName = testdata.get("moduleName").toString();
				String module = testdata.get("module").toString();
				String workDescription = testdata.get("workDescription").toString();
				String hours = testdata.get("hours").toString();
				String minutes = testdata.get("minutes").toString();
				String date = testdata.get("date").toString();
				String date1 = testdata.get("date1").toString();
				String DayWeek = testdata.get("DayWeek").toString();
				String DayMonth = testdata.get("DayMonth").toString();
				String MonthDay = testdata.get("MonthDay").toString();
				String project1 = testdata.get("projectName1").toString();


			// Pick up the First Step
			ExtentTestManager.startTest("TestScenario01 : Validate Basic Functionality");
			TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(8000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.selectProject(project);
			Thread.sleep(1000);
			Timesheet_CreateModule.selectModule(moduleName,module);
			Thread.sleep(1000);
			Timesheet_CreateModule.enterWorkDescription(workDescription);
			Thread.sleep(1000);
			Timesheet_CreateModule.enterHours(hours);
			Thread.sleep(1000);
			Timesheet_CreateModule.enterMinutes(minutes);
			Thread.sleep(1000);
			//Timesheet_CreateModule.uploadFile("\\src\\test\\resources\\e-sign.pdf");
			//Thread.sleep(1000);
			Timesheet_CreateModule.selectDateWithinCurrentWeek(date);
			Thread.sleep(1000);
			boolean flag1 =Timesheet_CreateModule.clickSave();
			Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.PASS, "Validate Basic Functionality : " + flag1);
			Log.info("Validate Basic Functionality : " + flag1);
	
			// Test Mandatory field Validation
			ExtentTestManager.startTest("TestScenario02 : Test Mandatory field Validation");
			//TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(1000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.clickSave();
			Thread.sleep(1000);
			boolean flag2 = Timesheet_CreateModule.clickClose();
			Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.PASS, "Test Mandatory field Validation : " + flag2);
			Log.info("Test Mandatory field Validation : " + flag2);
			
			//Test Module Display and Selection
			ExtentTestManager.startTest("TestScenario03 : Test Module Display and Selection");
			//TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(1000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.selectProject(project);
			Thread.sleep(1000);
			Timesheet_CreateModule.selectModule(moduleName,module);
			Thread.sleep(1000);
			Timesheet_CreateModule.isModuleSelected(module);
			boolean flag3 = Timesheet_CreateModule.clickClose();
			ExtentTestManager.getTest().log(Status.PASS, "Test Module Display and Selection : " + flag3);
			Log.info("Test Module Display and Selection : " + flag3);
			
			//PDF Restriction Error Displayed
			ExtentTestManager.startTest("TestScenario04 : PDF Restriction Error Displayed");
			//TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(6000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.uploadFile("\\src\\test\\resources\\Screenshot 2024-09-06 151619.png");
	   	 	Thread.sleep(1000);
	   	 	Timesheet_CreateModule.isPDFRestrictionErrorDisplayed();
			boolean flag4 = Timesheet_CreateModule.clickClose();
			ExtentTestManager.getTest().log(Status.PASS, "PDF Restriction Error Displayed : " + flag4);
			Log.info("PDF Restriction Error Displayed : " + flag4);
			
			//Test Close Button Functionality
			ExtentTestManager.startTest("TestScenario05 : Test Close Button Functionality");
			//TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(1000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.selectProject(project);
			Thread.sleep(1000);
			Timesheet_CreateModule.selectModule(moduleName,module);
			Thread.sleep(1000);
			Timesheet_CreateModule.enterWorkDescription(workDescription);
			Thread.sleep(1000);
			boolean flag5 =Timesheet_CreateModule.clickClose();
			Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.PASS, "Test Close Button Functionality : " + flag5);
			Log.info("Test Close Button Functionality : " + flag5);
			
			//Test BVA
			ExtentTestManager.startTest("TestScenario06 : Test BVA");
			//TimeSheet_ListModule.clickTimesheetSection();
			Thread.sleep(1000);
			Timesheet_CreateModule.clicOnNewButton();
			Thread.sleep(1000);
			Timesheet_CreateModule.selectProject(project);
			Thread.sleep(1000);
			Timesheet_CreateModule.selectModule(moduleName,module);
			Thread.sleep(1000);
			Timesheet_CreateModule.enterWorkDescription(workDescription);
			Thread.sleep(1000);
			int[] testValues = {-1};
		    for (int hours1 : testValues) {
		    Timesheet_CreateModule.enterHours(String.valueOf(hours1));
		    Thread.sleep(1000);
		    //Timesheet_CreateModule.clickSave();
		    boolean flag6 = Timesheet_CreateModule.clickClose();
		    Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Test BVA : " + flag6);
			Log.info("Test BVA : " + flag6);
		    }
		    
			
			//Submit Timesheet Functionality for Full Week
			ExtentTestManager.startTest("TestScenario07 : Submit Timesheet Functionality for Full Week");
			//TimeSheet_ListModule.clickTimesheetSection();
		    Timesheet_CreateModule.clickOnDayWeekSelection(DayMonth, MonthDay);
		    Thread.sleep(2000);
		    Timesheet_CreateModule.TearDown(project, moduleName, module, workDescription, hours, minutes);
		    Timesheet_CreateModule.finalSubmission();
		    boolean flag7 = Timesheet_CreateModule.selectFaceFinalSubmission();
		    Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Submitted Timesheet Functionality for Full Week : " + flag7);
			Log.info("Submitted Timesheet Functionality for Full Week : " + flag7);
		    
		    ExtentTestManager.getTest().log(Status.PASS, "Logging out and logging in as Approver.");
			Log.info("Logging out and logging in as Approver.");
			context.setAttribute("fileName", "Logout"); 
			click(userDropDown);
			click(L_signout);
			String UserName = configloader().getProperty("ContractUserName");
			String Password = configloader().getProperty("ContractPassword");
			input(L_username, UserName);
			input(L_password, Password);
			click(L_SignIn);
			
			//Contract Employee
			ExtentTestManager.startTest("TestScenario07 : Contract Employees");
			TimeSheet_ListModule.clickTimesheetSection();
		    boolean flag8 = Timesheet_CreateModule.contractEmployees( project1,  moduleName,  module,  workDescription,  hours,  minutes);
		    Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Contract Employee Timesheet Submitted : " + flag8);
			Log.info("Contract Employee Timesheet Submitted : " + flag8);
		    

			
			
			// Logout
			ExtentTestManager.startTest("Application Logout Initiated.");
			context.setAttribute("fileName", "Logout");
			click(userDropDown);
			click(L_signout);
			Thread.sleep(2000);
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done!");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");

			}

			}
			catch (Exception e) {
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
			driver.quit();
			ExtentTestManager.getTest().log(Status.PASS, "Application Logout");
			Log.info("Logout is done");

			// EndTest
			System.out.println(("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***"));
			ExtentTestManager.endTest();
			ExtentManager.getInstance().flush();
			Log.info("*** Test Suite " + testdata.get("TestScenario").toString() + " ending ***");
		}

	}

	@DataProvider(name = "TestData")
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

