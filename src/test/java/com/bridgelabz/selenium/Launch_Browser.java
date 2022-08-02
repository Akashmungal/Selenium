package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Browser {

	@Test
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		 // System .out.println(driver.getTitle());
		 Thread.sleep(2000);
		 String title = driver.getTitle();
		 System.out.println("The title of the page is :"+title);
		 Thread.sleep(2000);
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("the URL of the page is :"+ currentUrl);
		 Thread.sleep(2000);
		 String pageSource = driver.getPageSource();
		 System.out.println("the source code of the page is :"+ pageSource);
		 Thread.sleep(2000);
		 
		 ////*****Browser Navigations******////
		 driver.navigate().to("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 String fktitle = driver.getTitle();
		 System.out.println("The title of the page is :"+fktitle);
		 Thread.sleep(2000);
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 
		 driver.close();
		
	}

}


