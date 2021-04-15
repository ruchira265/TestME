package com.SeleniumDemo25March;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass 
{
	public static WebDriver driver;
	
	
	public void LaunchBrowser(String BrowserName)
	{
		
		switch(BrowserName)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new  ChromeDriver(); 
			  break;
			  
		case "IE":
			System.setProperty("webdriver.ie.driver","C:\\Users\\Administrator\\Desktop\\Stuff\\Java_Prog\\JAR\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		 break;
		 
		 default:
			 System.out.println("No Browser supported");
			 
	}
	
	}	
		
		public void LaunchURL(String BrowserName, String URLName)
		{
			LaunchBrowser(BrowserName);
			driver.get(URLName);	
		}
		
		
		
		public void IsDisplayed (WebElement ele)
		{
			if(ele.isDisplayed())
			{
				System.out.println("Element is displayed ");
			}
			else
			{
				System.out.println("Element is not displayed ");
			}
		}
		
		
		public static WebElement findElemenet(String locatorName , String txt)
		{
			WebElement ele = null;
			switch(locatorName)
			{
			case "ID":
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  
			  ele =	driver.findElement(By.id(txt));
				
				break;
			 case "Name":
				ele = driver.findElement(By.name(txt));
		
				 break;
			 case "Class":
				ele = driver.findElement(By.className(txt));
			
				 break;
			 case "LinkText":
				ele = driver.findElement(By.linkText(txt));
				
				 break;
			 case "xpath":
				ele = driver.findElement(By.xpath(txt));
				
				 break;
			 case "CSS":
				ele = driver.findElement(By.cssSelector(txt));
				
				 break;
			}
			
			return ele;
		}
	

}
