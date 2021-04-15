package com.SeleniumDemo25March;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo extends BaseClass
{

	

	String myURL = "https://www.google.com/";
	
	@Test
	public void currentURL()
		{
		      LaunchURL("chrome","https://www.google.com/");

		      String title = "Google";
		      
		     Assert.assertEquals(title, driver.getTitle(),"Title not match");
		    
		     System.out.println("Titile is matched ");
		      
			
		
		}

	@Test 
	public void TestCase2()
	{
	    LaunchURL("chrome","https://www.google.com/");
	    
	    SoftAssert st = new SoftAssert();
	    String title = "Google";
	      
	     st.assertEquals(title, driver.getTitle(),"Title not match");
	     System.out.println("Title is not for soft assert matched ");
	     st.assertAll();
	    
	}
	
}
