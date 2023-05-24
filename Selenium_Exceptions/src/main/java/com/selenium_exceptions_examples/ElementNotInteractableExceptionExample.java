package com.selenium_exceptions_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementNotInteractableExceptionExample {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\Java Questions\\Selenium_Exceptions\\MyFile1.html");
		WebElement buttonID = driver.findElement(By.id("buttonID"));
		buttonID.click();
	}

}
