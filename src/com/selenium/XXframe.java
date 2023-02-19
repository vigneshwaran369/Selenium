package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XXframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	driver.get("https://www.nykaa.com/sales/order/history/v2?ptype=myOrder");
	
	//driver.findElement(By.xpath("//span[text()='Vigne...']")).click();
	
	//driver.findElement(By.xpath("(//a[@class='dropdown-action-item'])[1]")).click();
	
	driver.findElement(By.xpath("//p[text()='Preparing to pack 1 items']")).click();
	
	
	
	
	
	
	
	
	}

}
