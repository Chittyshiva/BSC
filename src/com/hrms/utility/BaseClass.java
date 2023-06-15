package com.hrms.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class BaseClass {
	//driver
	public static WebDriver driver;
	//openApplication
	public static void openApplication() {
	driver = new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Open Application "); //htmlReport
	}
	//closeApplication
	public static void closeAppliation() {
	driver.close();
	Reporter.log("Application closed ");
	}
	}

