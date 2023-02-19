package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSLocators {

	static WebDriver driver;
	static void intro() {
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
}
	static void usingId(){
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		//using id //driver.findElement(By.cssSelector("#skiplink")).click();
	
	}
	static void usingClassName() {
		driver.findElement(By.cssSelector("a.nav-a"));
	}
	
	
	
	public static void main(String[] args) {
		intro();
		usingId();
	}

}
