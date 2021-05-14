package com.cigna.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Commons 
{
	
	public void click(WebDriver driver,String xpathvalue,String text) throws Exception
	{
		try
		{
		driver.findElement(By.xpath(xpathvalue)).click();	
		Reporter.log(text + " is clicked");
		System.out.println(text+ " is clicked");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			Reporter.log(text + " is not clicked " + e.getMessage());
		//	Assert.fail(text + " is not clicked");
		}
	}

}
