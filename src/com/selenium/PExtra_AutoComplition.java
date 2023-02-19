package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PExtra_AutoComplition {
	static WebDriver driver;

	public static void start() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/auto-complete/");
	}

	public static void categories() {
		

		WebElement ff = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(ff);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("a");

		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']"));

		for (WebElement a : list) {

			System.out.println(a.getText());

			String s = "antal";

			if (a.getText().contains(s)) {
				a.click();
			}
		}
		driver.switchTo().defaultContent();
		System.out.println("came out");
	}

	
	public static void comboBox() {
		driver.findElement(By.xpath("//li[@id='ComboBox']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));

		driver.switchTo().frame(findElement);
		driver.findElement(By.xpath("//input[contains(@class,'custom-combobox-input ui-wid')]")).sendKeys("a");
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@id='ui-id-1']"));

		for (WebElement j : findElements) {
			if (j.getText().contains("Asp")) {
				j.click();
			}
		}

	}

	public static void main(String[] args) {
		start();
		categories();
		comboBox();

	}

}
