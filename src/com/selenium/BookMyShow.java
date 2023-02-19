package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/madurai");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		WebElement f = driver.findElement(By.xpath("(//div[@class='sc-7o7nez-0 fNzwUg'])[1]"));
			f.click();	
			Thread.sleep(2000);

	WebElement book = driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]"));
	
	book.click();
	
	WebElement d = driver.findElement(By.xpath("(//span[text()='3D'])[1]"));
	d.click();
	Thread.sleep(5000);

	//driver.switchTo().alert().accept();
	WebElement b = driver.findElement(By.xpath("(//div[@class='__text'])[3]"));
	
	b.click();
	

	WebElement r = driver.findElement(By.id("btnPopupAccept"));
	r.click();
	WebElement r1 = driver.findElement(By.id("proceed-Qty"));

	r1.click();
	
	
	
	
	
	}

}
