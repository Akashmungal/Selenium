package com.bridgelabz.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUps {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\chromedriver.exe");
	 driver = new ChromeDriver();
	}	
		 @Test
		 public void simpleAlertPopUp() throws InterruptedException {
			 driver.get("https://demoqa.com/alerts");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.id("alertButton")).click();
			 Thread.sleep(2000);
			 Alert alert = driver.switchTo().alert();
			 alert.accept();
			 
			 
		 }
		 @Test
		 public void conformationPopUp() throws InterruptedException {
			 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.name("confirmalertbox")).click();
			 Thread.sleep(2000);
			 Alert conformationAlert = driver.switchTo().alert();
			 String alertText = conformationAlert.getText();
			 System.out.print("The alert test is: " +alertText);
			 conformationAlert.accept();
			 
			 
		 }
		 @Test
		 public void promptPopUP() throws InterruptedException {
			 driver.get("https://demoqa.com/alerts");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.id("promtButton")).click();
			 Thread.sleep(2000);
			 Alert promptAlert = driver.switchTo().alert();
			 Thread.sleep(2000);
			 promptAlert.sendKeys("Aftab");
			 Thread.sleep(2000);
			 promptAlert.accept();
			 
		 }

}

