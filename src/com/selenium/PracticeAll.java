package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PracticeAll {
	static WebDriver driver;

	static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
//	driver.get("https://demoqa.com/select-menu");
	}

	static void selectOneMobile() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles" + Keys.ENTER);
		List<WebElement> allMobiles = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement mobiles : allMobiles) {
			System.out.println(mobiles.getText());
		}
		String oneMobile = "Tecno Spark 8T (Atlantic Blue, 4GB RAM,64GB Storage)| 50MP AI Camera | 7GB Expandable RAM\r\n"
				+ "";
		{
			for (WebElement mobiles : allMobiles) {
				if (mobiles.getText().contains(oneMobile)) {
					mobiles.click();
				}
			}
		}

	}

	static void singleDropDown() {
		WebElement f = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(f);
		s.selectByIndex(4);
	}

	static void multiDD() {

		WebElement f1 = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s1 = new Select(f1);
		if (s1.isMultiple()) {
			s1.selectByIndex(3);
			s1.selectByVisibleText("Volvo");
			s1.selectByValue("saab");
		} else {
			System.out.println("do not print");
		}
	}

	static void extraDD() {

		WebElement f1 = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s1 = new Select(f1);

		System.out.println("get all the text which is available in multi");
		List<WebElement> options = s1.getOptions();
		for (WebElement j : options) {
			System.out.println(j.getText());
		}

		System.out.println("get the first selected option");
		WebElement f2 = s1.getFirstSelectedOption();
		System.out.println(f2.getText());

		System.out.println("get the selected options which is selected in multi");
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for (WebElement i : allSelectedOptions) {
			System.out.println(i.getText());
		}

		System.out.println("deselect the option in multi");

		s1.deselectAll();

	}

	static void takesScreenShot() throws IOException {

		TakesScreenshot t = (TakesScreenshot) driver;
		File screenshotAs = t.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\Selenium\\Screenshots\\allScreenshotimage.png");
		FileHandler.copy(screenshotAs, f);
	}

	static void alert() {
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("java");
		driver.switchTo().alert().accept();

	}
	
	static void frame() {
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vicky");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(frame);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vignesh");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
	}

	static void actionsMouse() {
		
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0oed0acgqg6dic8rbquncl03f22835.node0");
		
		System.out.println("using move to element");
		
		WebElement f = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Actions a = new Actions(driver);
		a.clickAndHold(f).build().perform();
		a.moveToElement(f, 400, 0).build().perform();

		System.out.println("drag and drop");
		
		WebElement f1 = driver.findElement(By.xpath("//div[@id='form:drag']"));
		WebElement f2 = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		a.clickAndHold(f1).build().perform();
		a.dragAndDrop(f1, f2).build().perform();
		
		System.out.println("Do left click, right click , double click");
		
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement f3 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		a.doubleClick(f3).build().perform();
		WebElement f4 = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		a.contextClick(f4).build().perform();
		WebElement f5 = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		a.click(f5).build().perform();
		
	}
	
	static void actionsKeyboard() throws AWTException {
		
		driver.get("https://www.amazon.in/");
		WebElement f = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		Actions a = new Actions(driver);
		a.contextClick(f).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement f1 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		a.contextClick(f1).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

		
	}
	
	
	public static void webTable() {
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println("*****get all row and column values*****");
		List<WebElement> data = driver.findElements(By.xpath("(//table)[1]//tbody/tr/td"));
		for (WebElement i : data) {
			System.out.println(i.getText());
		}

		System.out.println("*****get particular row values*****");
		List<WebElement> data1 = driver.findElements(By.xpath("(//table)[1]//tbody/tr[5]/td"));
		Iterator<WebElement> iterator = data1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getText());
		}

		System.out.println("*****get a particular value*****");
		WebElement data2 = driver.findElement(By.xpath("(//table)[1]//tbody//tr[5]//td[3]"));
		System.out.println(data2.getText());

		System.out.println("*****get the header values*****");
		List<WebElement> data3 = driver.findElements(By.xpath("(//table)[1]//tbody//tr//th"));
		Iterator<WebElement> iterator2 = data3.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next().getText());
		}

	}
	
	public static void findMobile() {

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles" + Keys.ENTER);
		List<WebElement> mobiles = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (WebElement i : mobiles) {
			System.out.println(i.getText());
		}

		String s = "Oppo F21s Pro 5G (Starlight Black, 8GB RAM, 128 Storage) with No Cost EMI/Additional Exchange Offers";
		for (WebElement i : mobiles) {
			if (i.getText().contains(s)) {
				i.click();
			}
		}

	}
	public static void main(String[] args) throws IOException , AWTException{
		openBrowser();
		// selectOneMobile();
		// singleDropDown();
		// multiDD();
		// extraDD();
		// takesScreenShot();
		// alert();
		// frame();
		// actionsMouse();
		// actionsKeyboard();
		// webTable();
		// findMobile();
		
	}

}
