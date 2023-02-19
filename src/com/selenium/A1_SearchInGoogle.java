package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class A1_SearchInGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement vic = driver.findElement(By.name("q"));
		vic.sendKeys("trichy" + Keys.ENTER);

		WebElement vick = driver.findElement(By.name("q"));
		vick.clear();
		vick.sendKeys("madurai" + Keys.ENTER);

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.close();

	}

}
