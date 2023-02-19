package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_FindTheBook {
	static WebDriver driver;

	static void findMyBook() {
		System.setProperty("webdriver.driver.chromedriver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in/");
		WebElement v = driver.findElement(By.id("input"));
		v.sendKeys("amazon" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("books" + Keys.ENTER);
	}

	static void tt() {
		List<WebElement> vic = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement i : vic) {
			System.out.println(i.getText());
		}
	}

	public static void main(String[] args) {
		findMyBook();
		tt();
	}

}
