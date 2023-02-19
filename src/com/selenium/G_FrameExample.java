package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_FrameExample {

	static void frameexample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(f1);
		WebElement f2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		f2.sendKeys("vicky");
		driver.switchTo().defaultContent();
		WebElement f3 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		f3.click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement f4 = driver.findElement(By.xpath("//input[@type='text']"));
		f4.sendKeys("vicky369");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		WebElement f5 = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		f5.click();
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		frameexample();

	}

}
