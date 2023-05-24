package com.selenium_exceptions_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionNotCreatedExceptionExample {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.close();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
	}
}
