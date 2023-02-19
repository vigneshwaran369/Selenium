package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	
	
	static void practice() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//input[@type='text']"));
		f.sendKeys("vigneshwaran");
		WebElement f1 = driver.findElement(By.xpath("//input[@type='password']"));
		f1.sendKeys("vicky");
		WebElement f2 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		f2.click();
		Thread.sleep(4000);
		WebElement f3 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		f3.sendKeys("vignesh");
		
		WebElement f4 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		f4.sendKeys("vicky");

		
		WebElement f5 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		f5.sendKeys("8825765659");
		
		WebElement f6 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		f6.sendKeys("vicky007");
		
		
		WebElement f7 = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select s = new Select(f7);
		s.selectByIndex(9);
		WebElement f8 = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		
		Select s1 = new Select(f8);
		s1.selectByValue("1");
		
		WebElement f9 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s2 = new Select(f9);
		s2.selectByVisibleText("1998");
		
		WebElement f10 = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		f10.click();
		WebElement f11 = driver.findElement(By.xpath("//button[contains(@class,'_6j mvm _6wk _6wl _58mi')]"));
		f11.click();
		driver.close();
	
	}
	
	public static void main(String[] args) throws InterruptedException{
practice();

	}

}
