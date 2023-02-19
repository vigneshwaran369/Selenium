package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class H1_BuyTheMobile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vivo mobile" + Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")).click();
		Set<String> w = driver.getWindowHandles();
		for (String s : w) {
			System.out.println(driver.switchTo().window(s).getTitle());

			String s1 = "Vivo Y01 (Sapphire Blue, 2GB RAM, 32GB ROM) with No Cost EMI/Additional Exchange Offers : Amazon.in: Electronics\r\n"
					+ "";

			if (w.contains(s1)) {
				break;
			}
		}
		driver.findElement(By.name("submit.add-to-cart")).click();

		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();

	}

}
