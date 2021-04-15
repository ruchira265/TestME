package com.SeleniumDemo25March;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionCommands extends BaseClass
{
	Actions act ;
	
	@Test
	public void rightClick()
	{
	
			LaunchURL("chrome","http://demo.guru99.com/test/simple_context_menu.html");
			
			
			act = new Actions(driver);
			
			WebElement rightbtn = driver.findElement(By.xpath("//span[text()='right click me']"));
			
			
			act.contextClick(rightbtn).perform();
			
			WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
			
			act.click(edit);
			
			System.out.println("Right click is performed ");
			
		//	act.contextClick(rightbtn).build().perform();
			
	}

	@Test
	public void doubleClick()
	{
		
		LaunchURL("chrome","http://demo.guru99.com/test/simple_context_menu.html");
		act= new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(btn).perform();
		
		driver.switchTo().alert().accept();
	}
	
	
	@Test
	public void dragAndrop()
	{
		
		LaunchURL("chrome","http://demo.guru99.com/test/drag_drop.html");
		act= new Actions(driver);
		
		WebElement btn5000 = driver.findElement(By.xpath("//a[text()=' BANK ']")); // from 
		
		WebElement drop = driver.findElement(By.xpath("//ol[@id='bank']/li")); // to 
		
		act.dragAndDrop(btn5000, drop).perform();
		
	}
	

	@Test
	public void mouseHover()
	{
		LaunchURL("chrome","https://demoqa.com/menu/");
		driver.manage().window().maximize();
		act= new Actions(driver);
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		act.moveToElement(menu).perform();
		
		WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		
		act.moveToElement(subMenu).perform();
		
		
	}
	
	@Test
	public void toolTip()
	{
		LaunchURL("chrome","https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		act= new Actions(driver);
		
		
		WebElement age = driver.findElement(By.cssSelector("#age"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(0,1000)");
		
		//act.moveToElement(age).perform();
		//Note
		String toolText = age.getAttribute("title");
		
		System.out.println(toolText);
		
	}
	
	
	@Test
	public void keyboard() throws AWTException
	{

		LaunchURL("chrome","https://demoqa.com/text-box");
		driver.manage().window().maximize();
		act= new Actions(driver);
		Robot r = new Robot();
		
		WebElement currentAdd=driver.findElement(By.id("currentAddress"));
		
		currentAdd.sendKeys("Pune new home location address ");
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		
		//WebElement permAdd=driver.findElement(By.id("permanentAddress"));
		
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
	}
	
	
	@Test
	public void robotKey() throws AWTException, InterruptedException
	{
		LaunchURL("chrome","https://demoqa.com/upload-download");
		Robot robot = new Robot();
		
		
		WebElement upload = driver.findElement(By.id("uploadFile"));
		upload.click();
		 //Code to Enter D1.txt 
		 //Press Shify key 
		 robot.keyPress(KeyEvent.VK_SHIFT);
		 //Press d , it gets typed as upper case D as Shift key is pressed
		 robot.keyPress(KeyEvent.VK_D);
		 //Release SHIFT key to release upper case effect
		 robot.keyRelease(KeyEvent.VK_SHIFT);
		 robot.keyPress(KeyEvent.VK_1);
		 robot.keyPress(KeyEvent.VK_PERIOD);
		 robot.keyPress(KeyEvent.VK_T);
		 robot.keyPress(KeyEvent.VK_X);
		 robot.keyPress(KeyEvent.VK_T);
		 
		 //Press ENTER to close the popup
		        robot.keyPress(KeyEvent.VK_ENTER);  
		 
		        //Wait for 1 sec
		        Thread.sleep(1000);
		 
		 //This is just a verification part, accept alert
		   //     WebElement w = driver.findElement(By.id("uploadButton"));
		 
		// w.click();
		
		
	}
}
