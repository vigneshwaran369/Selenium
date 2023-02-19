package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_CreateAccountInFB {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.co.in/");
		WebElement n = driver.findElement(By.name("q"));
		n.sendKeys("facebook" + Keys.ENTER);
		driver.navigate().refresh();
		WebElement c = driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']"));
		c.click();
		WebElement k = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		k.click();
		Thread.sleep(3000);
		WebElement i = driver.findElement(By.xpath("//input[@placeholder='First name']"));
		i.sendKeys("vignesh");
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
		l.sendKeys("waran");
		Thread.sleep(3000);
		WebElement p = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		p.sendKeys("nvigneshwaran@gmail.com");
		WebElement o = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		o.sendKeys("123456789");
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		d.click();
		driver.quit();
	}

}
