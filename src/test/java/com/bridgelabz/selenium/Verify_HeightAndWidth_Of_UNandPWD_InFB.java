package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_HeightAndWidth_Of_UNandPWD_InFB {
	@Test
	public void alignmentVerificationOfUNandPWD() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		 //find the username field  
		 WebElement unTB = driver.findElement(By.id("username")); 
		 //store the height of username  
		 int username_height = unTB.getSize().getHeight(); 
		 //store the width of username  
		 int username_width = unTB.getSize().getWidth(); 
		 System.out.println(username_height); 
		 System.out.println(username_width); 
		 
		 //find the password field 
		 WebElement pwdTB = driver.findElement(By.name("pwd")); 
		 //store the height of password 
		 int password_height = pwdTB.getSize().getHeight(); 
		 //store the width of password 
		 int password_width = pwdTB.getSize().getWidth(); 
		 System.out.println(password_height); 
		 System.out.println(password_width); 
		 
		 //check the height and width of username and password fields are same  
		 if (username_height==password_height && username_width == password_width) { 
			 System.out.println("Username and password fields are aligned"); 
		 }else{ 
			 System.out.println("Username and password fields are NOT aligned"); 
		 } 
	}
}
