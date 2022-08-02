package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods {
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String expectedError = "The email address or mobile number you entered is not connect"
								+ "to an account.Find your account and log in";
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("ajasgf");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("ghgsd");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("pass"));
		element.clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("ghgsd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(2000);
		WebElement errorMsg = driver.findElement(By.linkText("Find your account and log in"));
		String actualError = errorMsg.getText();
		System.out.println("Error msg is:" +actualError);
		driver.close();
		}

}
