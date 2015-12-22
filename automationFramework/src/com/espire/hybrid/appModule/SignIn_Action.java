package com.espire.hybrid.appModule;

import org.openqa.selenium.WebDriver;

import com.espire.hybrid.pageObjects.HomePage;
import com.espire.hybrid.pageObjects.LoginPage;
import com.espire.hybrid.utility.ExcelUtils;
import com.espire.hybrid.utility.Log;

public class SignIn_Action {
	
	public static void Execute(WebDriver driver)
	{
		
		String sUsername=ExcelUtils.getCelldata(1,1);
		Log.info("Read the username from excelsheet"+sUsername);
		
		String sPassword=ExcelUtils.getCelldata(1,2);
		Log.info("Read the password from excel sheet"+sPassword);
		
		HomePage.My_Account_Link(driver).click();
		Log.info("Click on my account link");
		
		LoginPage.txt_username(driver).sendKeys(sUsername);
		Log.info("Enter user name");
		
		LoginPage.txt_password(driver).sendKeys(sPassword);
		Log.info("Enter password");
		
		LoginPage.btn_login_click(driver).click();
		Log.info("click on login button");
	}

}
