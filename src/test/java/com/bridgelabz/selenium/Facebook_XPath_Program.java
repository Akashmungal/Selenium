package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_XPath_Program {

	@Test
	public void login () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mungalakash92@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akashpatil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='send_email']")).click();
		Thread.sleep(2000);
				
		
		
}
	
	@Test
	public void facebook_signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("mungalakash92@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("mungalakash92@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akash@123");
		Thread.sleep(2000);
		WebElement dayElement= driver1.findElement(By.xpath("//*[@id='day']"));
		Thread.sleep(2000);
		WebElement monthElement = driver1.findElement(By.xpath("//*[@id='month']"));
		Thread.sleep(2000);
		WebElement yearElement = driver1.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(2000);
		
		
		Select dayDropdown = new Select(dayElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dayDropdown.selectByVisibleText("29");
		monthDropdown.selectByVisibleText("Oct");
		yearDropdown.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		
	}
	

}

