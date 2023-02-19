 package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class H_ActionsExample1{

	
	
	static void mouseBasedActions() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0oed0acgqg6dic8rbquncl03f22835.node0");
		driver.manage().window().maximize();
		WebElement f1 = driver.findElement(By.xpath("//div[@data-widget='widget_form_conpnl']"));
		Actions a = new Actions (driver);
		
		//movetoelement x,y 
		a.clickAndHold(f1).build().perform();
		a.moveToElement(f1, 300, 0).build().perform();
		WebElement f2 = driver.findElement(By.xpath("//div[@data-widget='widget_form_conpnl']"));
		
		//move to element x,y
		a.clickAndHold(f2).build().perform();
		a.moveToElement(f2,100,0).build().perform();
		
		//move to element normal
		driver.navigate().to("https://www.myntra.com/");
		WebElement f3 = driver.findElement(By.xpath("//a[@data-group='kids']"));
		a.moveToElement(f3).build().perform();
		
		//double click
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement f4 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		a.doubleClick(f4).build().perform();
		
		//right click
		WebElement f5 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		a.contextClick(f5).build().perform();
		
		//normal left click
		WebElement f6 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		a.click(f6).build().perform();
		
		//drag and drop
		driver.navigate().to("https://www.leafground.com/drag.xhtml;jsessionid=node0oed0acgqg6dic8rbquncl03f22835.node0");
		WebElement f7 = driver.findElement(By.xpath("//div[@data-widget='widget_form_drag']"));
		a.clickAndHold(f7).build().perform();
		WebElement f8 = driver.findElement(By.xpath("//div[@data-widget='widget_form_drop']"));
		a.dragAndDrop(f7, f8).build().perform();
		
		
		
		driver.close();
	
	}
	
	
	
	public static void main(String[] args) {
		mouseBasedActions();


		
	}

}
