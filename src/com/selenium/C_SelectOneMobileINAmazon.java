package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_SelectOneMobileINAmazon {

	static WebDriver driver;

	static void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();

	}

	static void myMobiles() throws InterruptedException {
		List<WebElement> vicky = driver
				.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

		for (WebElement jj : vicky) {
			String kk = jj.getText();
			System.out.println(kk);
		}
		Thread.sleep(3000);
		String hh = "OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB";
		for (WebElement gh : vicky) {

			if (gh.getText().contains(hh)) {
				gh.click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		myMobiles();

	}

}
