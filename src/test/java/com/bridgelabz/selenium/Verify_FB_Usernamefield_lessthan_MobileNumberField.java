package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_FB_Usernamefield_lessthan_MobileNumberField {
	@Test
	public void fb() throws InterruptedException { 
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement unTB = driver.findElement(By.id("email")); 
		int username_width = unTB.getSize().getWidth(); 
		System.out.println(username_width); 
		
		//Identify the mobile number text box 
		WebElement mobileNumTB = driver.findElement(By.xpath("//*[@id=\"email\"]")); 
		int mobNumWidth = mobileNumTB.getSize().getWidth(); 
		System.out.println(mobNumWidth);
		
		//Compare the width of both username and mobilenumber text box 
		if (username_width == mobNumWidth) { 
			System.out.println("Size of Both username and password fields are same" +username_width+" = " + mobNumWidth); 
		}else{ 
			System.out.println("Size of username and password fields are NOT same that is : " +username_width+" Not equals to " + mobNumWidth); 
		}
	}

}
