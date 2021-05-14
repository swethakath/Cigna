package com.cigna.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.cigna.commons.OpenBrowser;

public class TC001
{
	OpenBrowser openBrowser = new OpenBrowser();
	WebDriver driver;
	
	@Test
	public void tc001()
	{
		driver = openBrowser.browserOpen(driver, "chrome");
		driver.get("http://www.cigna.com");
	}

}
