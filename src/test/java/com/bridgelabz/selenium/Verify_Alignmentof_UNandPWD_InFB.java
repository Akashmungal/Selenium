package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Alignmentof_UNandPWD_InFB {
	@Test
	public void alignmentVerificationOfUNandPWD() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement unTB = driver.findElement(By.id("email"));
		Thread.sleep(2000);

//		get the y-coordinate of username field 
		int username_Ycordinate = unTB.getLocation().getY(); 
		System.out.println(username_Ycordinate); 
		Thread.sleep(2000);
		
		WebElement pwdTB = driver.findElement(By.name("pass")); 
		Thread.sleep(2000);
//		get the y-coordinate of password field 
		int password_Ycordinate = pwdTB.getLocation().getY(); 
		System.out.println(password_Ycordinate); 
		Thread.sleep(2000);
		
//	    check whether the Y-coordinate of username and  password field are same 
		if (username_Ycordinate==password_Ycordinate) { 
			System.out.println("Both username and password fields are displayed in the same row"); 
		}else{ 
			System.out.println("username and password fields are NOT aligned in the same row"); 
		} 
			 
	}
}


