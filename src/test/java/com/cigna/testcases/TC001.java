package com.cigna.testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cigna.commons.Commons;
import com.cigna.commons.OpenBrowser;

public class TC001 extends Commons
{
	OpenBrowser openBrowser = new OpenBrowser();
	WebDriver driver;
	
	@BeforeSuite
	public void configuration()
	{
		prop=propertiesRead(System.getProperty("user.dir") + "/src/test/resources/properties/config.properties");
	}
	
	
	@Parameters("browsername")
	@Test
	public void tc001(String browsername) throws Exception
	{
		driver = openBrowser.browserOpen(driver, browsername);
		System.out.println(prop.getProperty("Cigna_Prod_URL"));
		navigateUrl(driver, prop.getProperty("Cigna_Prod_URL"));
		currentURLValidation(driver, prop.getProperty("Cigna_Prod_URL"));
		verifyTitle(driver, prop.getProperty("Cigna_Prod_Title"));
		
		//driver.get(prop.getProperty("Cigna_Prod_URL"));
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}

}
