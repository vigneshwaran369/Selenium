package com.selenium;

import java.util.Iterator;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_SelectOneBookInAmazon {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("books" + Keys.ENTER);
		Thread.sleep(4000);
		List<WebElement> c = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement book : c) {
			String vv = book.getText();
			System.out.println(vv);
		}
		Thread.sleep(3000);
		String j = "AgniBaan: Guardians of the Fire Chamber";
		for (WebElement i : c) {
			if (i.getText().contains(j))

			{
				i.click();
			}

		}

	}
}
