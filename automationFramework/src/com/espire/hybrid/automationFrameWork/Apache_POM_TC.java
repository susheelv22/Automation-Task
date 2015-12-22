package com.espire.hybrid.automationFrameWork;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.espire.hybrid.appModule.SignIn_Action;
import com.espire.hybrid.utility.Constants;
import com.espire.hybrid.utility.ExcelUtils;
import com.espire.hybrid.utility.Log;

public class Apache_POM_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {
		
		DOMConfigurator.configure("log4j.xml");
		Log.startTestCase("Login Test 01");
		
		ExcelUtils.setExcelFile(Constants.Path_Test_Data ,"Sheet1");
		Log.info("Excel sheet opened");
		
		driver = new FirefoxDriver ();
		Log.info("Open the firfox instance");
		
		driver.get(Constants.URL);
		Log.info("open application for test");
		
		driver.manage().window().maximize();
		Log.info("Maximize browser window ");
		
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		Log.info("implicit wait for page load");
		
		
		SignIn_Action.Execute(driver);	
		Log.info("Signin on application");
		
		ExcelUtils.setCelldata("Pass",Constants.Path_Test_Data, 1, 3);
		Log.endTestCase("Selenium_Test_001");
		
		System.out.print("Login Sucessfully");

	}

}
