package com.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.Log;
import com.aventstack.extentreports.Status;
import com.extentReports.ExtentTestManager;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static RemoteWebDriver driver = null;
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public static By loginbutn= By.xpath("//*[@id=\"navbarsExample04\"]/div/button[1]");
	private static By L_username = By.xpath("//input[@placeholder='Email Address']");
	private static By L_password = By.xpath("//input[@placeholder='Password']");
	private static  By L_SignIn = By.xpath("//button[@type='submit']");
	//private static By DesktopNot = By.xpath("//button[text()='OK']");
	//private static By L_LogOut= By.xpath("//div[@class='user position ng-tns-c3-15 ng-star-inserted']");
	//private static By L_LogAlert= By.xpath("//button[text()='Sign out']");
	
	public static String Pagetitle;

	public static Properties configloader() throws IOException {
		FileInputStream File = new FileInputStream(".\\src\\test\\resources\\config.properties");
		Properties properties = new Properties();
		properties.load(File);
		return properties;
	}

	public  void SetUp() throws IOException, InterruptedException {
		
		String Browser = configloader().getProperty("Browser");
		String Url = configloader().getProperty("URL");
		ExtentTestManager.startTest("TC:01 - User Access to KSIDC Portal via URL");
		
		switch (Browser.toUpperCase()) {
		
		case "CHROME":

			ChromeOptions options = new ChromeOptions();
			//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
			options.addArguments("--disable-extensions");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\linita.shivalkar\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);	
			ExtentTestManager.getTest().log(Status.PASS, "Step:01 - CHROME BROWSER Opened");
			break;

		case "FIREFOX":

			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
			ExtentTestManager.getTest().log(Status.PASS, "Step:01 - FIREFOX BROWSER Opened");
			break;

		default:
			System.err.println("The Driver is not defined");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Log.info("Driver has initialized successfully for "+Browser+"browser");
		
		
		driver.get(Url);
		ExtentTestManager.getTest().log(Status.PASS, "Step:02 - KSIDC Application URL launched");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"app\\\"]/body/nav/div/div[1]/div/button[1]")));*/
		Pagetitle = driver.getTitle();
		Log.info("Title is displayed : "+Pagetitle);
		//click(LoginBtn);
		//Thread.sleep(5000);
		/*input(L_username, UserName);
		input(L_password, Password);
		click(L_SignIn);
		Thread.sleep(4000);
		click(DesktopNot);
		Thread.sleep(1000);*/


	}
	
	public boolean CP_login() throws InterruptedException, IOException
	{
		Thread.sleep(5000);
		String UserName = configloader().getProperty("UserName");
		String Password = configloader().getProperty("Password");
		System.out.println("Inside Method");
		click(loginbutn);
		input(L_username, UserName);
		//ExtentTestManager.getTest().log(Status.PASS, "User Name Entered");
		Log.info("User Name Entered");
		input(L_password, Password);
		//ExtentTestManager.getTest().log(Status.PASS, "Password Entered");
		Log.info("Password Entered");
		click(L_SignIn);
		return true;
		
	}
	
public static  String  GetMobileNumberOTP(String MobNo) throws ClassNotFoundException {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String UserName = "sqa";
		String Password = "SPQA@sql2019" ;
		String Url = "jdbc:sqlserver://192.168.32.32\\QA;DatabaseName=BeaconLOS;encrypt=true;trustServerCertificate=true";
		String OTP = null;

		
		try(Connection connection = DriverManager.getConnection(Url,UserName,Password)){
		//con = DriverManager.getConnection(Url,UserName,Password);
		System.out.println("Class: Common Method: DatabaseConnector: Connected");
		
		//Execute Query for getting OTP
		CallableStatement callableStatement = connection.prepareCall("{call SpGetMobileOTPregistrationTEST ("+MobNo+")}");
		//callableStatement.setLong(1, 9999999991L);
		//System.out.println("Stored procedure called with parameter: 9999999991");
		
		 // Execute stored procedure
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
             OTP = resultSet.getString("OTP");
            System.out.println("OTP : " + OTP  );

		
        }
		
	}catch(Exception e)
	{
		System.out.println("Class: Common Method: DatabaseConnector: Not Connected");
		e.printStackTrace();
	
	}
		return OTP;
   
}

	public static String GetEmailOTP(String EmaiID) throws ClassNotFoundException {
		
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String UserName = "sqa";
		String Password = "SPQA@sql2019" ;
		String Url = "jdbc:sqlserver://192.168.32.32\\QA;DatabaseName=BeaconLOS;encrypt=true;trustServerCertificate=true";

		String OTP = null;
		String validEmailID= "'" + EmaiID + "'";
		System.out.println("Email ID :"+EmaiID);
		try(Connection connection = DriverManager.getConnection(Url,UserName,Password)){
		//con = DriverManager.getConnection(Url,UserName,Password);
		System.out.println("Class: Common Method: DatabaseConnector: Connected");
		Thread.sleep(10000);
		//Execute Query for getting OTP
		CallableStatement callableStatement = connection.prepareCall("{call SpGetEmailOTPregistrationTEST ("+validEmailID+")}");
		//callableStatement.setLong(1, 9999999991L);
		
		//System.out.println("Stored procedure called with parameter: 9999999991");
		
		 // Execute stored procedure
        ResultSet resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            OTP = resultSet.getString("OTP");
            System.out.println("OTP : " + OTP  );
            
		
        }
		
	}catch(Exception e)
	{
		System.out.println("Class: Common Method: DatabaseConnector: Not Connected");
		e.printStackTrace();
	
	}
		return OTP;
   
}

	public static  void input(By element, String Value) throws InterruptedException {


		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.presenceOfElementLocated(element)).sendKeys(Value);


	}

	public static  void click(By element) throws InterruptedException {

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		Thread.sleep(5000);

	}

	public static void select(String value,By element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		Select selWeekDayDropDown = new Select(driver.findElement(element));
		selWeekDayDropDown.selectByVisibleText(value);
		
	}

	public static void clear(By element)throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
		Thread.sleep(2000);
	}


	public static void AcceptAlert()
	{
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

		
	}

	public static  void INclick(By element) throws InterruptedException {

		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
		//Thread.sleep(2000);

	}
	
	public static  void ElementToBeVisible(By element) throws InterruptedException {

		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
		//Thread.sleep(2000);

	}
	
	
	public static void SwitchToFrame(By frameName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));
	}
	
	public static void ScrollUntilElementVisible(By locator)
	{ 
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static boolean ElementDisplayed(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isDisplayed();
		return flag;
	}
	
	public static boolean ElementEnabled(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();
		return flag;
	}
	
	public static void UploadFile(By locator, String path)
	{
		WebElement uploadElement = driver.findElement(locator);
		String path1=System.getProperty("user.dir");
		Log.info("path is :" + path1);
		uploadElement.sendKeys(path1 + path);
		
	}
	
	
//	public static void UploadFile(By locator)
//	{
//		WebElement uploadElement = driver.findElement(locator);
//		 String path=System.getProperty("user.dir");
//		 Log.info("path is :" + path);
//		//System.out.Directory.GetParent(this.GetType().Assembly.Location).ToString();
//		uploadElement.sendKeys(path);
//		
//		
//	}
	public static boolean ElementEnableOrDisable(By locator)
	{
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();
		return flag;
	}
	
	public static boolean CheckElementDisable(By locator)
	{  
		//disable
		WebElement element = driver.findElement(locator);
		Boolean flag = element.isEnabled();	
		
		if (flag==false) {
			flag=true;
		}else if(flag==true)
			flag=false;
		
		return flag;
	}
	
	
	public static  void Hover(By element) throws InterruptedException {
		WebElement element1 = driver.findElement(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).perform();

		

	}

}
