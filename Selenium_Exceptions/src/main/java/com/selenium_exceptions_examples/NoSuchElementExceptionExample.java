package com.selenium_exceptions_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementExceptionExample {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		//Using Invalid name it shows No Such Element Exception
		driver.findElement(By.name("qb")).sendKeys("Java \n");

	}

}
