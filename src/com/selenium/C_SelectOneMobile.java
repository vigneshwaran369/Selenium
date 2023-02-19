package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_SelectOneMobile {
	static WebDriver driver;

	static void selectMobile() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("//input[@type='text']"));
		f1.sendKeys("mobiles" + Keys.ENTER);
		
		String s11 = "Apple iPhone 13 (128GB) - Blue";
		List<WebElement> f3 = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement we : f3) {
			if (we.getText().contains(s11)) {
				we.click();
			}
		}
	}
	public static void main(String[] args) {
		selectMobile();
		
	

}
}