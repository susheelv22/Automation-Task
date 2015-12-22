package com.espire.hybrid.automationFrameWork;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.espire.hybrid.appModule.SignIn_Action;
import com.espire.hybrid.utility.Constants;

public class POM_TC {


	public static void main(String[] args) {
		
		WebDriver driver;
		try{
		driver = new FirefoxDriver ();
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		SignIn_Action.Execute(driver);
		System.out.print("Login Sucessfully");	
		
		}
		
		catch(Exception e)
		{}
	
		

	}

}
