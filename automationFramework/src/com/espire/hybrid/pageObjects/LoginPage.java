package com.espire.hybrid.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.espire.hybrid.utility.Log;

public class LoginPage {
	
	private static WebElement element =null;
	
	public static WebElement txt_username(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='log']"));
		Log.info("User name text box identified");
		return element;
	}
	
	
	public static WebElement txt_password(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='pwd']"));
		Log.info("Password text box identified");
		return element;
	}
	
	
	public static WebElement btn_login_click(WebDriver driver)
	{
		element=driver.findElement(By.xpath(".//*[@id='login']"));
		Log.info("Login button identified ");
		return element;
	}
	
	
}
