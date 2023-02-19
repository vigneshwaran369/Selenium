package com.selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task {
	//Task===amazon--get title and url of amazon--navigate to fb-- create account -- navigato---instagram-- log in ---- navigate to-- toolsqa---select menu---dropdown 
	
	static void finishTheTask() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.facebook.com/");
		WebElement f1 = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
		f1.sendKeys("vigneshwaran");
		WebElement f2 = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		f2.sendKeys("vicky007");
		WebElement f3 = driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]"));
		f3.click();
		Thread.sleep(4000);
		WebElement f4 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		f4.sendKeys("vignesh");
		WebElement f5 = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
		f5.sendKeys("waran");
		WebElement f6 = driver.findElement(By.xpath("(//input[@aria-required='true'])[3]"));
		f6.sendKeys("8825765");
		WebElement f7 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		f7.sendKeys("vickyvic007");
		WebElement f8 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(f8);
		s.selectByIndex(9);
		WebElement f9 = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
		Select s1 = new Select(f9);
		s1.selectByValue("1");
		WebElement f10 = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
		Select s2 = new Select(f10);
		s2.selectByVisibleText("1998");
		WebElement f11 = driver.findElement(By.xpath("//label[text()='Male']"));
		f11.click();
		WebElement f12 = driver.findElement(By.xpath("//button[@name='websubmit']"));
		f12.click();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(4000);
		WebElement f13 = driver.findElement(By.xpath("//input[@name='username']"));
		f13.sendKeys("vigneshwaran852");
		WebElement f14 = driver.findElement(By.xpath("//input[@name='password']"));
		f14.sendKeys("vickyvic");
		WebElement f15 = driver.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]"));
		f15.click();
		driver.navigate().to("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement f16 = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s4 = new Select(f16);
		s4.selectByVisibleText("Indigo");
		Thread.sleep(2000);
		WebElement f17 = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s5 = new Select(f17);
		s5.selectByValue("3");
		s5.selectByValue("4");
		driver.close();
		
	}
			
			
			
	public static void main(String[] args) throws InterruptedException  {
		finishTheTask();
   	
	}

}
