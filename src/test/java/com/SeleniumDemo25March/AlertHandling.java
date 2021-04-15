package com.SeleniumDemo25March;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandling extends BaseClass
{
	@Test
	public void alertsDemo() throws InterruptedException
	{
		
		
		LaunchURL("chrome","http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement alertWithOk = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertWithOk.click();
		Thread.sleep(5000);
		
		// Alert = Switch to = jump to your alert 
		Alert a =  driver.switchTo().alert();
		a.accept();
		
		
		WebElement alertwithOKCancel = driver.findElement(By.linkText("Alert with OK & Cancel"));
		alertwithOKCancel.click();
		WebElement alertWithOkc = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		alertWithOkc.click();
		Alert okc =  driver.switchTo().alert();
		okc.dismiss();
		
		
		
		WebElement alertwithtxt = driver.findElement(By.linkText("Alert with Textbox"));
		alertwithtxt.click();
		WebElement alertWithtxtbx = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		alertWithtxtbx.click();
		Alert txtalert =  driver.switchTo().alert();
		txtalert.sendKeys("Welcome to Automation");
		System.out.println(txtalert.getText());
		okc.accept();
		
	}

}
