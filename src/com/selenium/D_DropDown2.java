package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D_DropDown2 {

	
	
	static void dropdown2(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement f =driver.findElement(By.xpath("//select[@multiple]"));
		Select s = new Select(f);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		List<WebElement> options = s.getOptions();
		
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());     ------- try these all
//		}
//		String s1 ="Saab";
//		boolean contains = options.contains(s1); ------- try this 
//		System.out.println(contains);

		for(WebElement opt:options) {
			
			System.out.println(opt.getText());
		}
		
		
		List<WebElement> alo = s.getAllSelectedOptions();
		for(WebElement al :alo) {
			System.out.println(al.getText());
		}
		
		WebElement fso = s.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
		s.deselectAll();		

		driver.close();	
	}
	
	public static void main(String[] args) {

		dropdown2();
		
	}

}
