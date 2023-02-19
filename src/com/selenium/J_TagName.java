package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_TagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		System.out.println("*****get the all table header values which is available in that webpage****");
		List<WebElement> th = driver.findElements(By.tagName("th"));
		for(WebElement header: th) {
			System.out.println(header.getText());
		}
		
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		for(WebElement row:tr) {
			System.out.println(row.getText());
		}
		
		
		List<WebElement> td = driver.findElements(By.tagName("td"));
		for(WebElement allData:td) {
			System.out.println(allData.getText());
		}
		
	}
	
	

}
