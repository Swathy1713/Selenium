package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myntra_Task {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#mountRoot > div > div.application-base > main > div > div:nth-child(10) > div > div > div > div > div:nth-child(5) > div > div > div > div > div > div > div > div > div > div > a > picture > img")).click();
		
		
		
		
	}

}
