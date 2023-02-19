package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_WindowHandle {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1st tab
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		// 2nd tab
		WebElement f1 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a = new Actions(driver);
		a.contextClick(f1).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// 3rd tab
		WebElement f2 = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		a.contextClick(f2).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> w1 = driver.getWindowHandles();
		for (String s1 : w1) {
			System.out.println(driver.switchTo().window(s1).getTitle());
		}
		String s2 = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

		for (String s3 : w1) {
			if (s2.equals(driver.switchTo().window(s3).getTitle())) {
				break;
			}
		}

		driver.quit();
	}

}
