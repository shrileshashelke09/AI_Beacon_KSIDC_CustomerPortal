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
import com.Pages_TimesheetModule.Timeheet_WeekView;

import com.Pages_TimesheetModule.Timesheet_CreateModule;
import com.Utility.Log;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentManager;
import com.extentReports.ExtentTestManager;
import com.listeners.TestListener;

public class AllScenarios_TimesheetWeekandMonth extends Base_Class {
	com.Utility.ExcelReader ExcelReader;
	Base_Class Base_Class;
	Log log;
	TestListener TestListener;
	com.Utility.ScreenShot screenShot;
	TimeSheet_ListModule TimeSheet_ListModule;
	Timesheet_CreateModule Timesheet_CreateModule;
	Timeheet_WeekView Timeheet_WeekView;

	private static By userDropDown = By.xpath("//div[@id='userDropdown']/h4");
	private static By L_signout = By.xpath("//button[@class='dropdown-item ' and contains(text(),'Sign out')]");
	private static String filePath = "\\src\\test\\resources\\e-sign.pdf"; 
	
	@BeforeSuite
	public void reference() {
		ExcelReader = new com.Utility.ExcelReader("TimeSheetModule");
		log = new Log();
		TestListener = new TestListener();
		screenShot = new com.Utility.ScreenShot(null);
		Base_Class = new Base_Class();
		
		TimeSheet_ListModule= new TimeSheet_ListModule();
		Timesheet_CreateModule= new Timesheet_CreateModule();
		Timeheet_WeekView= new Timeheet_WeekView();
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
				String Month= testdata.get("Month").toString();
				String MonthWeek = testdata.get("MonthWeek").toString();
				String day1 = testdata.get("Valid Day").toString();
				String projectName = testdata.get("projectName").toString();
				String DayMonth = testdata.get("DayMonth").toString();
				String MonthDay = testdata.get("MonthDay").toString();
				String day2 = testdata.get("VALID DAY IN CAPS").toString();
				String day3 = testdata.get("New Day").toString();
				String ProjectName2 = testdata.get("ProjectName2").toString();
				
				//Navigate to Timesheet Module
				ExtentTestManager.startTest("TestScenario01 : Navigate To My TimeSheet");
				boolean flag1 =TimeSheet_ListModule.clickTimesheetSection();
				ExtentTestManager.getTest().log(Status.PASS, "My timesheet page loaded : " + flag1);
				Log.info("My timesheet page loaded : " + flag1);
				
				ExtentTestManager.startTest("TestScenario02 : Validate Timesheet View, Project and Module Names");
				boolean flag2 = Timeheet_WeekView.ValidateTimeSheetView();
				ExtentTestManager.getTest().log(Status.PASS, "Timesheet view displayed : " + flag2);
				Log.info("Timesheet view displayed : " + flag2);
				
				//Timesheet_TC14, Timesheet_TC15, Timesheet_TC22
				ExtentTestManager.startTest("TestScenario03 : Validate Week Detailed View"); 
				boolean flag3 = Timeheet_WeekView.ValidateWeekDetailedView(project, moduleName, module);
				ExtentTestManager.getTest().log(Status.PASS, "Timesheet - Week View - weekdays displayed, date ranges for weeks displayed, and days of week listed : " + flag3);
				Log.info("Timesheet - Week View - weekdays displayed, date ranges for weeks displayed, and days of week listed : " + flag3);
				
				//Navigate to Timesheet Module Selection for Date
				ExtentTestManager.startTest("TestScenario04 : Select Year and Week from Drop down");
				boolean flag4 = Timeheet_WeekView.clickOnYearWeekSelection(Month, MonthWeek);
				ExtentTestManager.getTest().log(Status.PASS, "Selected Year and Week from Drop down : " + flag4);
				Log.info("Selected Year and Week from Drop down : " + flag4);
				
				ExtentTestManager.startTest("TestScenario05 : Validate TimeSheet Displayed And Week View Entry And Save Without Submit");
				boolean flag5 = Timeheet_WeekView.ValidateTimeSheetDisplayedAndWeekViewEntryAndSaveWithoutSubmit(project, moduleName,module, day1, projectName,DayMonth, MonthDay);
				ExtentTestManager.getTest().log(Status.PASS, "My Timesheet displayed : " + flag5);
				Log.info("My Timesheet displayed : " + flag5);
				ExtentTestManager.getTest().log(Status.PASS, "Description entered successfully!!!");
				Log.info("Description entered successfully!!!");
				ExtentTestManager.getTest().log(Status.PASS, "Timesheet saved successfully!!!");
				Log.info("Timesheet saved successfully!!!");
				
				ExtentTestManager.startTest("TestScenario06 : Validate Error Message On Invalid imesheet Entry Week View");
				Timeheet_WeekView.TearDown();
				boolean flag6 = Timeheet_WeekView.ValidateErrorMessageOnInvalidTimesheetEntryWeekView(project, moduleName,module, day1);
				ExtentTestManager.getTest().log(Status.PASS, "Required Error message displayed : " + flag6);
				Log.info("Required Error message displayed : " + flag6);
				
				//ValidateWeeklyNormalView
				ExtentTestManager.startTest("TestScenario13 : Validating Weekly Normal View"); 
				boolean flag26 = Timeheet_WeekView.ValidateNavigationToWeeklyNormalView(ProjectName2, moduleName, module);
				ExtentTestManager.getTest().log(Status.PASS, "Weekly Normal View validated : " + flag26);
				Log.info("Weekly Normal View validated : " + flag26);
				
				//ValidateInvalidHoursErrorMessageWeeklyNormalView
				ExtentTestManager.startTest("TestScenario14 : Validating Error Message for Invalid Hours In Weekly Normal View"); 
				boolean flag27 = Timeheet_WeekView.ValidateErrorMessageOnGivingInvalidTimeWeeklyNormalView(ProjectName2, moduleName, module, day2);
				ExtentTestManager.getTest().log(Status.PASS, "Error Message On Giving Invalid Time Weekly Normal View validated : " + flag27);
				Log.info("Error Message On Giving Invalid Time Weekly Normal View : " + flag27);
				
				//ValidateValidTimeAndUploadFileWeeklyNormalView
				ExtentTestManager.startTest("TestScenario15 : Validating Valid Time And Upload File In Weekly Normal View"); 
				boolean flag28 = Timeheet_WeekView.ValidateValidTimeAndUploadFileWeeklyNormalView(ProjectName2, moduleName, module, filePath);
				ExtentTestManager.getTest().log(Status.PASS, "Valid Time And Upload File In Weekly Normal View validated : " + flag28);
				Log.info("Valid Time And Upload File In Weekly Normal View validated : " + flag28);
				
				
				//ValidateTimesheetEntryMonthView
				ExtentTestManager.startTest("TestScenario16 : Validating Valid Time And Upload File In Monthly View"); 
				boolean flag29 = Timeheet_WeekView.ValidateTimesheetEntryMonthView(projectName, module, filePath);
				ExtentTestManager.getTest().log(Status.PASS, "Valid Time And Upload File In Monthly View validated : " + flag29);
				Log.info("Valid Time And Upload File In Monthly View validated : " + flag29);

				
		
			
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

