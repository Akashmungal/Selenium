package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Frames {
	@Test
	public void frames_usingIndex() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akash/Desktop/Frame/Page2.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.id("t2")).sendKeys("Patil");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Akash");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(6000);
	}
	@Test
	public void frames_usingId () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akash/Desktop/Frame/Page2.html");
		//using id attribute of the frame -string
		driver.switchTo().frame("f1");
		
		driver.findElement(By.id("t1")).sendKeys("Akash");
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Patil");
		Thread.sleep(5000);
	}
	@Test
	public void frames_usingName () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akash/Desktop/Frame/Page2.html");
		//using name attribute of the frame -string
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("Akash");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Patil");
	}
	@Test
	public void frames_usingAddressFrame () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akash/Desktop/Frame/Page2.html");
		//using address of the frame -webelement
		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("Akash");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Patil");
		//driver.close();
	}
	
}
