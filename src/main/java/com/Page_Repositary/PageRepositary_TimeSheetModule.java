package com.Page_Repositary;

import org.openqa.selenium.By;


public class PageRepositary_TimeSheetModule
{
	
	//TimeSheet List Module
	public By timesheetSection= By.xpath("//span[text()='Self Service']");
	public By myTimeSheetSection=By.xpath("//span[text()='My Timesheet ']");
	public By dayViewOption= By.xpath("//span[text()='Day View']");
	public By weekViewOption= By.xpath("//span[text()=' Week View']");
	public By monthViewOption= By.xpath("//span[text()='Month View']");
	public By createNewEntryButton= By.xpath("//i[@class='fas fa-plus']");
	public By bulkUploadButton= By.xpath("//span[text()='Bulk Upload']");
	public By downloadTimesheetButton= By.xpath("//i[@title='Download Timesheet']");
	public By applyLeaveButton= By.xpath("//button[text()='Apply Leave']");
	public By clickOk= By.xpath("//button[text()='Ok']");
	
	
	//TimeSheet Create/Edit/Delete Module
	public By projectDropdown = By.id("Project");
    public By moduleSelect = By.xpath("//input[@aria-label='EmployeeFullName']");
    public By clickOnNewEntry = By.xpath("(//button[@class='btn btn-outline-info m-1 btn-small this_week'])[2]");
    public By workDescriptionInput = By.id("Comments");
    public By hoursInput = By.id("TimespentHours");
    public By minutesInput = By.id("TimespentMinutes");
    public By fileUpload = By.id("chooseFile");
    public By clickOnDate= By.xpath("//button[@aria-label='Open calendar']");
    public By dateInput = By.id("date");
    public By saveButton = By.xpath("//button[text()='Save']");
    public By closeButton = By.xpath("//button[text()='Close']");
    public By mandatoryFieldError = By.xpath("//div[text()=' Module is required. ']");
    public By invalidDateError = By.cssSelector(".error.date");
    public By pdfRestrictionError = By.xpath("//span[text()='Attachment should be of type pdf ']");
    public By hoursError = By.xpath("//div[text()=' Invalid Time. ']");
    public By myTimesheetEntry = By.xpath("//div[@class='header-title']");
    public By editButton= By.xpath("//i[@class='fas fa-edit']/parent::a");
    public By moduleError= By.xpath("//div[text()=' Module is required. ']");
    public By deleteButton= By.xpath("//i[@class='fas fa-trash-alt']/parent::a");
    public By confirmYes= By.xpath("//button[text()='Yes']");
    public By confirmNo= By.xpath("//button[text()='No']");
    public By TimesheetSection= By.xpath("//span[text()='Timesheet']/parent::div");
    
    public By CancelRequest= By.xpath("//span[text()='Cancel Request ']");
    
    public By clickOnWeekSelection= By.xpath("//div[@class='date-range']");
  //span[text()=' 6 ']
    public By clickOnCancelReuest= By.xpath("//button[text()='Cancel Request']/parent::div");
    public By enterReasonforCancellation= By.xpath("//textarea[@class='ng-pristine ng-valid ng-touched']");
    public By requestButton= By.xpath("//button[text()='Request']");
    public By closeButtonforCancel= By.xpath("(//button[text()='Request'])[2]");
    public By searchButton= By.xpath("//button[@id='dLabel']");
    public By searchCriteria= By.xpath("//select[@id='SearchType']");
    public By searchCriteriaSelection= By.xpath("//option[text()='Contains']");
    public By searchButton2= By.xpath("(//button[@id='dLabel'])[2]");
    public By approveButton= By.xpath("//i[@title='Approve']");
    public By rejectButton= By.xpath("//i[@title='Reject']");
    public By reasonYes= By.xpath("//buttona[text()='Yes']");
    public By reasonNo= By.xpath("//buttona[text()='No']");
    public By rejectionComments= By.xpath("//textarea[@class='ng-untouched ng-pristine ng-valid']");
    public By RejectButton= By.xpath("//button[text()='Reject']");
    public By CloseButton= By.xpath("//button[text()='Close']");

    public By ApprovalModule= By.xpath("//span[text()='Approvals ']/parent::a");
    public By TimesheetOnBehalfModule= By.xpath("//span[text()='Timesheet On Behalf ']/parent::a");
    public By ClickOnDateRange= By.xpath("//div[@class='popup-layer ng-star-inserted']");
    //Approval
    public By selectDateRange= By.xpath("//div[@class='date-range']");
  //span[text()=' 13 ']
  //button[text()=' Submit']
  //button[text()='Yes']
    
  //button[text()=' Save and Submit']
    
    public By selectMonth= By.xpath("//select[@title='Select month']");
    public By selectMonthPeriod= By.xpath("//option[text()='Jun']");
    public By clickOnProject= By.xpath("//span[text()='All Projects']");
    public By clickOnEmployee= By.xpath("//span[text()='All Employees']");
    public By approveButton1= By.xpath("//i[@title='Approve']");
    public By rejectButton1= By.xpath("//i[@title='Reject']");
    public By sendForReview= By.xpath("//i[@title='Send for review']");
    public By projectAllocation= By.xpath("//i[@title='Project Allocation']");
    public By viewOtherTimesheets= By.xpath("//i[@title='View other Timesheets']");
    public By clickOnNormalView= By.xpath("//span[text()='Normal View']");
    public By yearSelect= By.xpath("//select[@class='yr-select']");
    public By viewComments= By.xpath("//i[@title='View Comments']");
    
	public By timeSheetIcon = By.xpath("//span[contains(text(),'Self Service')]/parent::div");
	public By myTimesheet = By.xpath("//span[contains(text(),'My Timesheet')]");
	public By pageLoad = By.xpath("//li[contains(text(),'Day View')]");
	public By timeSheetProjectName = By.xpath("//span[contains(text(),'Test')]");
	public By timeSheetStatus = By.xpath("//span[contains(text(),'LOGGED')]");
	public By timeSheetHours = By.xpath("//span[contains(text(),'LOGGED')]/b");
	public By timeSheetDayView = By.xpath("//span[contains(text(),'Day View')]");
	public By timeSheetWeekView = By.xpath("//span[contains(text(),' Week View')]");
	public By timeSheetMonthView = By.xpath("//span[contains(text(),'Month View')]");
	public By newEntry= By.xpath("//button[contains(text(),'New Entry')]");
	public By projectDropDown1 = By.xpath("//select[@id='Project']");
	//public By projectName1 = By.xpath("//option[contains(text(),'Test')]");
	public By modalClose1 = By.xpath("(//button[text()='Close'])[1]");
	public By weeklyViewDropDown = By.xpath("//select[@class='yr-select ng-untouched ng-pristine ng-valid']");
	public By weeklyDetailViewOption = By.xpath("//option[text()='Weekly Detail View']");
	public By weeklyNormalViewOption = By.xpath("//option[text()='Weekly Normal View']");
	public By projectDropDown2 = By.xpath("//select[@class='prjct-select pr_34']");
	public By projectDropDown3 = By.xpath("//select[@class='prjct-select ng-untouched ng-pristine ng-valid']");
	public By firstWeekday = By.xpath("(//li[@class='ng-star-inserted']/div)[1]");
	public By modalClose2 = By.xpath("//button[@class='close']");
	public By moduleDropdown = By.xpath("//select[@id='Phase']");
	public By workDescriptionTextbox = By.xpath("//textarea[@name='Comments']");
	public By chooseFileElement = By.xpath("//div[@class='custom-file']/label");
	public By chooseFile = By.xpath("//input[@id='chooseFile']");
	public By hoursField = By.xpath("//input[@id='TimespentHours']");
	public By minuteField = By.xpath("//input[@id='TimespentMinutes']");
	public By moduleOptions1 = By.xpath("//select[@id='Phase']/option");
	public By moduleDropdown2 = By.xpath("(//input[@placeholder='module'])[1]");
	public By moduleOptions2 = By.xpath("(//select[@class='mdl-select'])[1]/option");
	//public By moduleSelectOption = By.xpath("//option[text()=' Design/Development ']");
	public By selectDayDropDown = By.xpath("//span[@class='dropdown-down']");
	public By selectWeek = By.xpath("//div[text()=' 2024-Oct-13 - 2024-Oct-19 ']");
	public By selctionOfWeek = By.xpath("//span[text()=' 6 ']");
	//public By selectDay = By.xpath("//div[text()='Monday']");
	public By addButton = By.xpath("//button[@type='button' and text()=' ADD ']");
	public By enterHours1 = By.xpath("(//input[@name='hours'])[1]");
	//public By enterHours2 = By.xpath("(//input[@name='hours'])[2]");
	public By enterDescription1 = By.xpath("(//textarea[@class='ng-untouched ng-pristine ng-valid ng-star-inserted'])[1]");
	//public By enterDescription2 = By.xpath("(//textarea[@class='ng-untouched ng-pristine ng-valid ng-star-inserted'])[2]");
	public By invalidHoursErrorMessage1 = By.xpath("(//div[@class='modal-body']/div/span)[6]");
	public By okayButton = By.xpath("//button[text()='Ok']");
	public By saveWithoutSubmit = By.xpath("//button[text()='Save Without Submit']");
	//public By hideContentButton = By.xpath("//span[@class='calendar' and contains(text(),'Monday')]/parent::div");
	public By timesheetRemoveButton = By.xpath("//span[@title='Remove']");
	public By confirmYes1 = By.xpath("//button[text()='Yes']");
	public By moduleDD = By.xpath("//input[@aria-label='EmployeeFullName']");
	public By modalElement = By.xpath("(//div[@class='modal-content'])[1]");
	public By uploadedFile = By.xpath("//div[@class='custom-file']//following-sibling::span[contains(@class,'badge')]");
	public By saveEntryButton = By.xpath("//button[text()='Save']");
	public By daysOfWeek = By.xpath("//div[@class='header ng-star-inserted']//span[contains(text(),'day')]");
	public By weekDateSelect = By.xpath("(//select[@class='yr-select'])[2]");
	public By weekDateOptions = By.xpath("(//select[@class='yr-select'])[2]/option");
	public By weekdayList = By.xpath("//ul[@class='item2']/li[@class='multiselect-item-checkbox ng-star-inserted']");
	public By invalidHoursErrorMessage2 = By.xpath("//div[@class='eform-validation ng-star-inserted']");
	public By copyToDropdown = By.xpath("(//select[@class='mdl-select'])[3]");
	public By timesheetDeleteButtonDayView = By.xpath("//a[@title='Delete']");
	public By confirmDeleteTimesheetButton = By.xpath("//button[@type='button' and text()='Yes']");
	public By botttomSlidingPopupIcon = By.xpath("//span[@class='mat-button-wrapper']/mat-icon");
	public By bspProjectDetails = By.xpath("//div[@class='t_row']/div[text()='Project details']");
	public By bspAllocationPercentage = By.xpath("//div[@class='t_row']/div[text()='Allocation %']");
	public By bspStartDate = By.xpath("//div[@class='t_row']/div[text()='Start Date']");
	public By bspEndDate = By.xpath("//div[@class='t_row']/div[text()='End Date']");
	public By currentWeek = By.xpath("//div[@class='t_head']/span[text()='Current Week']");
	public By currentWeekPlanned = By.xpath("//div[@class='t_head']/span[text()='Current Week']/following-sibling::div/div[text()=' Planned']");
	public By currentWeekActual = By.xpath("//div[@class='t_head']/span[text()='Current Week']/following-sibling::div/div[text()='Actual ']");
	public By currentMonth = By.xpath("//div[@class='t_head']/span[text()='Current Month']");
	public By currentMonthPlanned = By.xpath("//div[@class='t_head']/span[text()='Current Month']/following-sibling::div/div[text()='Planned']");
	public By currentMonthActual = By.xpath("//div[@class='t_head']/span[text()='Current Month']/following-sibling::div/div[text()='Actual ']");
	public By project = By.xpath("//div[@class='t_head']/span[text()='Project ']");
	public By projectPlanned = By.xpath("//div[@class='t_head']/span[text()='Project ']/following-sibling::div/div[text()=' Planned']");
	public By projectActual = By.xpath("//div[@class='t_head']/span[text()='Project ']/following-sibling::div/div[text()='Actual ']");
	public By weeklyNormViewId = By.xpath("//table[@id='wk-view']");
	public By copyConfirmButton = By.xpath("//button[text()='Yes']");
	public By weeklyNormalViewElement = By.xpath("//li[contains(text(),'Weekly Normal View')]");
	public By weekNormViewWeekDaySel = By.xpath("(//select[@class='yr-select'])[2]");
	public By weekNormViewPrevWeekSelector = By.xpath("(//button[@class='btn-outline-primary next-prev'])[1]");
	public By weekNormViewNextWeekSelector = By.xpath("(//button[@class='btn-outline-primary next-prev'])[2]");
	public By weekNormViewThisWeekSelector = By.xpath("//button[text()='THIS WEEK']");
	public By weekNormViewProjectSelDropDown = By.xpath("//select[contains(@class,'prjct-select')]");
	public By weekNormViewModuleSelDropdown = By.xpath("//input[@aria-label='EmployeeFullName']");
	public By invalidHoursErrorMessage3 = By.xpath("((//div[@class='modal-body'])[3]//span)[6]");
	public By uploadedFileRemove = By.xpath("//i[@class='i-Close clos_bt ng-star-inserted']");
	public By pendingDayMonthView = By.xpath("//span[text()='Pending ']/ancestor::li/div");
	public By timesheetDescriptionMonthlyView = By.xpath("//textarea[@id='Comments']");
	public By saveButton1 =  By.xpath("//button[@type='button' and text()='Save']");
	public By savedRowMonthlyView = By.xpath("//div[@class='timesheet-data ng-star-inserted']//tr[@class='ng-star-inserted']");
	public By yearSelection = By.xpath("(//select[@class='yr-select'])[1]");
	public By yearWeekSelection = By.xpath("(//select[@class='yr-select'])[2]");
	public By monthSelection = By.xpath("//option[text()=' September ']");
	public By monthWeekSelection = By.xpath("//option[text()=' SEP 01 - SEP 07 ']");
	
	//Final Submission
	public By clickOnSubmittButton = By.xpath("//button[text()=' Submit']");
	public By clickOnYesSubmitButton = By.xpath("//button[text()='Yes']");
	public By clickOnNoSubmitButton = By.xpath("//button[text()='No']");
	public By selectTheFace = By.xpath("(//div[@class='radio-tile'])[1]"); //sad, not happy
	public By finalSubmissionOfTimesheet = By.xpath("//button[text()='Submit']");

	
  
  //select[@title='Select month']
  //option[text()='Jun']
  //span[text()='All Projects']
  //span[text()='All Employees']
  //i[@title='Approve']
  //i[@title='Reject']
  //i[@title='Send for review']
  //i[@title='Project Allocation']
  //i[@title='View other Timesheets']
  //span[text()='Normal View']
  //a[text()='MAY ']
  //select[@class='yr-select']
  //option[text()=' JUL 28 - AUG 03 ']
  //span[text()='All Projects']
  //span[text()='All Employees']
  //i[@title='View Comments']
    
  

    



}
