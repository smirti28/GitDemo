package com.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	public int mathOperation() {
		int a = 2;
		int b = 6;
		int c = a * b;
		return c;
	}

	public String getString() {
		String temp = "Value of a*b is: " + mathOperation();
		return temp;
	}

	@Test
	public void lunchDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(getString());

		Thread.sleep(5000);
		driver.quit();
	}

}
