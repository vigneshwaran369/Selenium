package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_OpenFB {

	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement vicky = driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
	vicky.click();
	Thread.sleep(4000);
	WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
	fname.sendKeys("vicky");
	}

}
