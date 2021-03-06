package com.erp.test;

import org.testng.annotations.Test;

import com.erp.generic.BaseTest;
import com.erp.generic.Excel;
import com.erp.page.EnterPage;
import com.erp.page.LoginPage;

public class ValidLogin extends BaseTest {
	@Test(priority=1,groups= {"login","smoke"})
	public void testValidLogin() {
		String un=Excel.getValue(XL_PATH,"ValidLogin",1,0);
		String pw=Excel.getValue(XL_PATH, "ValidLogin",1,1);
		String eTitle=Excel.getValue(XL_PATH,"ValidLogin",1,2);
		LoginPage l=new LoginPage(driver);
		//Enter Valid UN
		l.setUserName(un);
		//Enter Valid pw
		l.setPassword(pw);
		//Click login
		l.clickLogin();
		//verify home page....
		//EnterPage e=new EnterPage(driver);
		//e.verifyHomePageIsDisplayed(driver, eTitle);
	}

}
