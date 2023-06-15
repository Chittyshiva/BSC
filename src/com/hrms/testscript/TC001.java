package com.hrms.testscript;

import org.testng.annotations.Test;

import com.hrms.page.LoginPage;
import com.hrms.page.LogoutPage;
import com.hrms.page.VerifyPage;
import com.hrms.utility.BaseClass;

public class TC001 {
@Test
public static void tc001() {
 BaseClass. openApplication();
 VerifyPage.verifyTitle("HRMS");
 LoginPage.login( "nareshit","nareshit");
 VerifyPage.verifyTitle("OrangeHRM");
 LogoutPage.logout();
	 
 }
}

