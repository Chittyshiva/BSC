package com.hrms.page;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LogoutPage extends BaseClass {
	//object
	
static By link_logout=By.linkText("Logouit");
//fun
public static void logout() {
driver.findElement(link_logout).click();
Reporter.log("Logout completed");

	
	
}


}
