package com.bridgelabz.selenium;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expected_Page_Displayed {
	
	@Test
	public void pageDisplayed() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			String expectedTitle = "Facebook";
			String actualTitle = driver.getTitle();
			System.out.println("Actual title Is:" +actualTitle);
			Thread.sleep(2000);
			
			if(actualTitle.contains(expectedTitle)) {
				System.out.println("expected page is displayed");
			}
			else
			{
				System.out.println("expected page is not displayed");
			}
	}

}
