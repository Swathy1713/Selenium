package com.seleninum.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		
		//WebElement f1 = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		//driver.switchTo().frame(f1)
		//driver.switchTo().frame(0);
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Swathy");
		driver.findElement(By.name("lname")).sendKeys("Eswaran");
		WebElement f2 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(f2);
		driver.findElement(By.name("email")).sendKeys("Swa@gmail.com");
		
		
		
		
	}

}
