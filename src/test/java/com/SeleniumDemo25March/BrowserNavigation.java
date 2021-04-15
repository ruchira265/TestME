package com.SeleniumDemo25March;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigation
{
	@Test
	public void BrowsetNaviCommand()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver(); 
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().to("https://touch.facebook.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
	}
	
	

}
