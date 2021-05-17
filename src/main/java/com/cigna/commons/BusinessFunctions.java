package com.cigna.commons;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BusinessFunctions extends Commons
{
	
	public void headerValidation(WebDriver driver,Properties prop)
	{
		try
		{
			//driver.findElement(By.xpath(headerCignaInternational)).getText();
			System.out.println(prop.getProperty("Cigna_Links_CignaInternational"));
			verifyText(driver, headerCignaInternational, prop.getProperty("Cigna_Links_CignaInternational"));
			verifyText(driver, headerContactUs, prop.getProperty("Cigna_Links_ContactUs"));
			verifyText(driver, headerEspanol, prop.getProperty("Cigna_Links_Espanol"));

		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
