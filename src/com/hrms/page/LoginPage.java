package com.hrms.page;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass{
	//objects
static By txt_loginname =
By.name("txt_loginname");
static By txt_password =
By.name("txt_password");
static By btn_login = By.name("Submit");
//fun
public static void login(String un,String pw) {
driver.findElement(txt_loginname).sendKeys(un);
driver.findElement(txt_password).sendKeys(pw);
driver.findElement(btn_login).click();
Reporter.log("Login completed");

}
}


