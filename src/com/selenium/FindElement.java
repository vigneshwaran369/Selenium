package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books"+Keys.ENTER);
		List<WebElement> f = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		String b ="Brain Activity Book for Kids - 200+ Activities for Age ";
		for(WebElement s:f) {
			if(s.getText().contains(b)) {
				s.click();
			}
		}
		
		
	}

}
