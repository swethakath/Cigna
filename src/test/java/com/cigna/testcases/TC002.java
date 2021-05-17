package com.cigna.testcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cigna.commons.BusinessFunctions;
import com.cigna.commons.Commons;
import com.cigna.commons.OpenBrowser;

public class TC002 extends Commons
{
	OpenBrowser openBrowser = new OpenBrowser();
	BusinessFunctions businessFunction = new BusinessFunctions();
	WebDriver driver;
	
	@BeforeSuite
	public void configuration()
	{
		prop=propertiesRead(System.getProperty("user.dir") + "/src/test/resources/properties/config.properties");
	}
	
	
	@Parameters("browsername")
	@Test
	public void tc002(String browsername) throws Exception
	{
		driver = openBrowser.browserOpen(driver, browsername);
		System.out.println(prop.getProperty("Cigna_Prod_URL"));
		navigateUrl(driver, prop.getProperty("Cigna_Prod_URL"));
		businessFunction.headerValidation(driver,prop);		
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}

}
