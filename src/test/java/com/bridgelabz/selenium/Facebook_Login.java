
package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Login {
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("mungalakash");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("8390308871");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}
}
