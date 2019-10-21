package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationFramework {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Manoj\\Project\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.quit();

	}

}
