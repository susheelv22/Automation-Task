package com.espire.hybrid.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.espire.hybrid.utility.Log;

public class HomePage {

	private static WebElement element;
	
	public static WebElement My_Account_Link(WebDriver driver)
	{ 
		element=driver.findElement(By.xpath(".//*[@id='account']/a"));
		Log.info("My account link element found");
		return element;
		
	}
}
