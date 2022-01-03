package com.seleninum.sample;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	
	public static void main(String[] args) throws Throwable {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://letcode.in/frame");
			
			WebElement a = driver.findElement(By.name("firstFr"));
			driver.switchTo().frame(a);
			driver.findElement(By.name("fname")).sendKeys("Swa");
			
			
			
			
		}

	}
