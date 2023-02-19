package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class C3_FindTheBook {
	static WebDriver driver;

	static void findMyBook() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("amazon" + Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("books" + Keys.ENTER);

	}

	static void findBook() throws InterruptedException {
		List<WebElement> vicky = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement vv : vicky) {
			System.out.println(vv.getText());
		}

		Thread.sleep(4000);
		String f = "My First Mythology Tale (Illustrated) (Set of 5 Books) - Mahabharata";
		for (WebElement book : vicky) {
			if (book.getText().contains(f));
				
			{
				book.click();
			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		findMyBook();
		findBook();

	}
}
