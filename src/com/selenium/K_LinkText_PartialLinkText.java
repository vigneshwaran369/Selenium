package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class K_LinkText_PartialLinkText {

//	NOTE :
//		1.we can pass index only in X-path
//	
//	
	
	static WebDriver driver;

	public static void linkText() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
	}

	public static void partialLinkText() {
		driver.findElement(By.partialLinkText("Forgott")).click();
	}

	public static void main(String[] args) {
		linkText();
		partialLinkText();

	}

}
