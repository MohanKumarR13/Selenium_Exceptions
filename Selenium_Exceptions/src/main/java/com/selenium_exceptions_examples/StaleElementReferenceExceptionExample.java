package com.selenium_exceptions_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceExceptionExample {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Java \n");
		WebElement searchBox1 = driver.findElement(By.name("q"));
		searchBox1.clear();

	}
}
