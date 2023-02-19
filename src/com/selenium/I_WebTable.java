package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("*****get all row and column values*****");
		List<WebElement> data = driver.findElements(By.xpath("(//table)[1]//tbody/tr/td"));
		for (WebElement i : data) {
			System.out.println(i.getText());
		}

		System.out.println("*****get particular row values*****");
		List<WebElement> data1 = driver.findElements(By.xpath("(//table)[1]//tbody/tr[5]/td"));
		Iterator<WebElement> iterator = data1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getText());
		}

		System.out.println("*****get a particular value*****");
		WebElement data2 = driver.findElement(By.xpath("(//table)[1]//tbody//tr[5]//td[3]"));
		System.out.println(data2.getText());
		
		System.out.println("*****get a particular value again*****");
		WebElement data22 = driver.findElement(By.xpath("(//table)[1]//tbody//tr[2]//td[3]"));
		System.out.println(data22.getText());


		System.out.println("*****get the header values*****");
		List<WebElement> data3 = driver.findElements(By.xpath("(//table)[1]//tbody//tr//th"));
		Iterator<WebElement> iterator2 = data3.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().getText());
		}
		
		System.out.println("*****get the particular header values*****");
		WebElement data4 = driver.findElement(By.xpath("(//table)[1]//tbody//tr//th[3]"));
		System.out.println(data4.getText());
	}

}
