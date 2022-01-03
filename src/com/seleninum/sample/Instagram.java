package com.seleninum.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instagram {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("username")).sendKeys("Swathy@gmail.com");
		
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		
		File d = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_October\\Screenshot\\insta.png");
		
		//FileUtils.copyFile(s, d);
		
		FileHandler.copy(s, d);
		
		WebElement sign = driver.findElement(By.xpath("//a[contains(text(), 'se6yk')]"));
		sign.click();
		
		
		
		
		
		
	}

}
