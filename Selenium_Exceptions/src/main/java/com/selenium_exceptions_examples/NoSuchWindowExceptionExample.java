package com.selenium_exceptions_examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchWindowExceptionExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		String oldWindow = driver.getWindowHandle();
		WebElement browser = driver.findElement(By.id("menuform:j_idt38"));
		browser.click();
		WebElement window = driver.findElement(By.id("menuform:m_windows"));
		window.click();

	}

}
