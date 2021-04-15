package com.SeleniumDemo25March;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class XpathDemo extends BaseClass
{
	@Test
	public void xpathCreation()
	{
		
		 LaunchURL("chrome","https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 
		 
		 WebElement uname = driver.findElement(By.xpath("//input[@name='identifier'][@id='identifierId']"));
		 
		 uname.sendKeys("Abc@gmail.com");
		 
		 driver.findElement(By.xpath("//span[starts-with(@class,'NlWrkb snByac')]")).click();
		 
		driver.findElement(By.xpath("//button[contains(@class,'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b')]")).click();
	
	}

}
