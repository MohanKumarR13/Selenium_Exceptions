package com.selenium_exceptions_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnHandledAlertExceptionExample {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node09ezhcl8gw5o1u1n0oedk8nly266892.node0");
		WebElement alertBox = driver.findElement(By.name("j_idt88:j_idt91"));
		alertBox.click();
		WebElement promptBox = driver.findElement(By.name("j_idt88:j_idt104"));
		promptBox.click();
		

	}

}
