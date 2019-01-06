package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_01 {
	
	@Test
	public static void test()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
	}


}
