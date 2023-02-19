package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();

//	WebElement v =	driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]"));
//		v.click();
//	Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		WebElement f = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		f.click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
//	Thread.sleep(3000);
//		WebElement vic =  driver.findElement(By.xpath("//button[@id='promtButton']"));
//	vic.click();
//		driver.switchTo().alert().sendKeys("vigneshwaran369");
//		driver.switchTo().alert().accept();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement f1 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]"));
		f1.click();
		Thread.sleep(2000);
		WebElement f11 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		f11.click();
		driver.switchTo().alert().accept();

		WebElement f2 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		f2.click();
		WebElement f22 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		f22.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement f3 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		f3.click();
		WebElement f33 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		f33.click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().sendKeys("vicky");

		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		//driver.close();

	}

}
