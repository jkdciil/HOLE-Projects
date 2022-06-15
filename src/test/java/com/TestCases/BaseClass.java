package com.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public void LBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\projects\\HoleProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
	}
	
	@AfterTest
	public void after()
	{
		driver.close();
	}
	
}
