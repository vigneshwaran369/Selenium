package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNykaa {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@aria-label='Kebab menu']")).click();
		driver.findElement(By.xpath("(//button[@kind='secondary'])[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
