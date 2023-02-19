package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class E_TakingScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement nn = driver.findElement(By.name("q"));
		nn.sendKeys("amazon"+Keys.ENTER);
		WebElement hh = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
		hh.click();
		driver.manage().window().maximize();
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File vicky = new File("D:\\Selenium\\Screenshots\\image.png");
        org.openqa.selenium.io.FileHandler.copy(source, vicky);
		
		
	}

}
