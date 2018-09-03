package com.ty;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public static void testA() {
		
		System.setProperty("webdriver.chrome.driver" , "E:/Bhavana/workspace/Automation/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Reporter.log(driver.getTitle(),true);
		driver.close();

	}
}
