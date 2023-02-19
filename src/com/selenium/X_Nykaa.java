package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class X_Nykaa {

	static WebDriver driver;

	static void start() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
//		driver.findElement(By.xpath("//button[@kind='primary']")).click();
//		driver.findElement(By.xpath("(//button[@kind='secondary'])[1]")).click();
//		driver.findElement(By.name("emailMobile")).sendKeys("8825765659"+Keys.ENTER);
//		Thread.sleep(16000); // for OTP
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	static void openBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		WebElement f = driver.findElement(By.xpath("(//a[text()='skin'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(f).build().perform();
		driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[2]/ul/li/div/div[1]/div/ul[2]/li[1]/a")).click();

		Set<String> id = driver.getWindowHandles();
		for (String i : id) {
			System.out.println(driver.switchTo().window(i).getTitle());
			String s = "Face Wash - Buy Face Wash Online at Best Prices in India | Nykaa";
			if (i.equals(s)) {
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"product-list-wrap\"]/div[1]/div/div[1]/a/div[2]/div[1]")).click();
		Set<String> id1 = driver.getWindowHandles();
		for (String j : id1) {
			System.out.println(driver.switchTo().window(j).getTitle());
			String s = "Nykaa Naturals Face Wash: Buy Nykaa Naturals Face Wash Online at Best Price in India | Nykaa";
			if (j.equals(s)) {
				break;
			}

		}

		WebElement select = driver.findElement(By.xpath("//select[@title='SHADE']"));
		select.click();
		Select s = new Select(select);
		s.selectByVisibleText("Sandalwood & Orange Peel");

		driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//p[text()='Quantity : 1']")).click();

		driver.findElement(By.xpath("(//div[@value='5'])[1]")).click();

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();

		driver.findElement(By.xpath("//button[text()='Log In']")).click();

		driver.findElement(By.xpath("//input[@type='email']")).click();

		driver.findElement(By.name("emailMobile")).sendKeys("8825765659" + Keys.ENTER);

		Thread.sleep(16000); // for OTP
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//p[text()='Add New Address']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Pincode']")).sendKeys("625708");

		WebElement f2 = driver.findElement(By.xpath("//input[@placeholder='House/ Flat/ Office No.']"));
		f2.click();
		Thread.sleep(4000);
		f2.sendKeys("No.369A,1st street");

		driver.findElement(By.xpath("//textarea[@placeholder='Road Name/ Area /Colony']"))
				.sendKeys("east street,t.kunnathur,madurai");

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vicky");
		driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("8825765659");
		driver.findElement(By.xpath("//input[@placeholder='Email ID (Optional)']"))
				.sendKeys("nvigneshwaran88@gmail.com");

		driver.findElement(By.xpath("//button[text()='Ship to this address']")).click();
		driver.findElement(By.xpath("//p[text()='Cash on delivery']")).click();
		driver.findElement(By.xpath("//button[text()='Place order']")).click();

		System.out.println("****take order placed screenshot****");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File screen = new File("D:\\Selenium\\Screenshots\\nykaaorder.png");
		FileHandler.copy(screenshotAs, screen);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Vigne...']")).click();

		driver.findElement(By.xpath("(//a[@class='dropdown-action-item'])[1]")).click();

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//span[text()='Order Details'])[1]")).click();

		driver.switchTo().frame(0);

		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();

		driver.findElement(By.xpath("//span[text()='Select reason']")).click();

		driver.findElement(By.xpath("//div[text()='Other']")).click();

		driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("sorry done by mistake");

		driver.findElement(By.xpath("//button[text()='Cancel order']")).click();

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		TakesScreenshot tt = (TakesScreenshot) driver;
		File screenshotAs2 = tt.getScreenshotAs(OutputType.FILE);
		File f1 = new File("D:\\Selenium\\Screenshots\\.ordercancel.png");

		FileHandler.copy(screenshotAs2, f1);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//p[text()='Ok, got it!']")).click();

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		start();
		openBrowser();

	}

}
