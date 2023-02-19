package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_DropDown {

	static void dropdown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement f = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(f);
		//Thread.sleep(2000);
		//s.selectByIndex(3);
		//s.selectByValue("3");
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		if(multiple==true) {
			s.selectByVisibleText("Yellow");
		}else {
			System.out.println("it is multiple we can't print this");
		}
		WebElement f1 = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s1 = new Select(f1);
		boolean multiple2 = s1.isMultiple();
		if(multiple2 == true) {
			s1.selectByIndex(1);
			s1.selectByValue("volvo");
			s1.selectByVisibleText("Audi");
		}else {
			System.out.println("its not multiple");
		}
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		String ss = "Audi";
		for(WebElement v:allSelectedOptions) {
			if(v==allSelectedOptions) {
			System.out.println(ss);
			}else {
				System.out.println(v.getText());
			}
		}
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(4000);
		s1.deselectAll();
		driver.close();
		
		//boolean selected = f1.isSelected();
		//System.out.println(selected);	
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		dropdown();

	}

}
