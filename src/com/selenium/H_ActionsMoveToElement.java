package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_ActionsMoveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement f = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(f).build().perform();
		driver.findElement(By.xpath("//a[text()='Shirts']")).click();
	}

}
