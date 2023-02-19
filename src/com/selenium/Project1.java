package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Project1 {

	static void bookTheHotel() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		WebElement f1 = driver.findElement(By.xpath("//input[@name='username']"));
		f1.sendKeys("vignesh0077");
		WebElement f2 = driver.findElement(By.xpath("//input[@name='password']"));
		f2.sendKeys("vicky007");
		WebElement f3 = driver.findElement(By.xpath("//input[@name='re_password']"));
		f3.sendKeys("vicky007");
		WebElement f4 = driver.findElement(By.xpath("//input[@name='full_name']"));
		f4.sendKeys("vigneshwaran");
		WebElement f5 = driver.findElement(By.xpath("//input[@name='email_add']"));
		f5.sendKeys("nvigneshwaran99@gmail.com");
		
		WebElement fff = driver.findElement(By.xpath("//input[@name='captcha']"));
		fff.sendKeys("pavakka");
		Thread.sleep(8000);
		WebElement f6 = driver.findElement(By.xpath("//input[@name='tnc_box']"));
		f6.click();
		
		
		
		
		//driver.findElement(By.xpath("//input[@name='Submit']")).click();
		//driver.findElement(By.xpath("//a[text()='Click here to login']")).click();
		
		driver.navigate().back();
		WebElement f7 = driver.findElement(By.xpath("//input[@name='username']"));
		f7.sendKeys("vignesh0077");
		WebElement f8 = driver.findElement(By.xpath("//input[@name='password']"));
		f8.sendKeys("vicky007");
		WebElement f9 = driver.findElement(By.xpath("//input[@name='login']"));
		f9.click();
	
		WebElement f10 = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(f10);
		s.selectByVisibleText("Adelaide");
		
		WebElement f11 = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(f11);
		s1.selectByIndex(2);
		
		WebElement f12 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(f12);
		s2.selectByVisibleText("Double");
		
		
		WebElement f13 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		f13.clear();
		WebElement f14 = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		f14.sendKeys("05/01/2023");
		
		WebElement f15 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		f15.clear();
		WebElement f16 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		f16.sendKeys("10/01/2023");
		
		
		WebElement f17 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s3 = new Select(f17);
		s3.selectByValue("2");
		
		WebElement f18 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s4 = new Select(f18);
		s4.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		
		
		WebElement f19 = driver.findElement(By.xpath("//input[@name='first_name']"));
		f19.sendKeys("vignesh");
		
		WebElement f21 = driver.findElement(By.xpath("//input[@name='last_name']"));
		f21.sendKeys("waran");
		
		WebElement f22 = driver.findElement(By.xpath("//textarea[@name='address']"));
		f22.sendKeys("3/203, dubai main road, dubai narrow street, dubai busstand, dubai");
		
		WebElement f23 = driver.findElement(By.xpath("//input[@name='cc_num']"));
		f23.sendKeys("1243567678983456");
		
		WebElement f24 = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s5 = new Select(f24);
		s5.selectByIndex(2);
		
		WebElement f25 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s6 = new Select(f25);
		s6.selectByValue("4");
		
		WebElement f26 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s7 = new Select(f26);
		s7.selectByVisibleText("2022");
		
		
		WebElement f27 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		f27.sendKeys("369");
		
		
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		
		
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File ff = new File("D:\\Selenium\\Screenshots\\hotel.png");
		FileHandler.copy(scr, ff);
		
		driver.quit();
		
			
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
bookTheHotel();
	}

}
