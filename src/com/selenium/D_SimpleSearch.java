package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_SimpleSearch {
	static WebDriver driver;

	public static void method1() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void callGoogle() {
		driver.get("https://www.google.com/?gws_rd=ssl");
	}

	public static void callYahoo() {
		driver.get("https://in.search.yahoo.com/");
	}

	public static void callFB() {
		driver.get("https://www.facebook.com/");
	}

	public static void callInstagram() {
		driver.get("https://www.instagram.com/");
	}

	public static void callGoogleMeet() {
		driver.get("https://meet.google.com/");
		driver.close();
	}

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		System.out.println(a);
		method1();
		callGoogle();
		callYahoo();
		callFB();
		callInstagram();
		callGoogleMeet();
		long b = System.currentTimeMillis();
		long c = b - a;
		System.out.println(b);
		System.out.println(c);

	}

}
