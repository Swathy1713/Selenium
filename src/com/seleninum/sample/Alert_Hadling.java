package com.seleninum.sample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Hadling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		WebElement accept = driver.findElement(By.id("accept"));
		accept.click();
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		
		WebElement confirm = driver.findElement(By.id("confirm"));
		confirm.click();
		Alert a = driver.switchTo().alert();
		String s = a.getText();
		System.out.println(s);
		a.dismiss();
		
		driver.findElement(By.id("prompt")).click();
		driver.switchTo().alert();
		a.sendKeys("Swathy");
		a.accept();
		String text = driver.findElement(By.id("myName")).getText();
		System.out.println(text);
		
		
		
		
		

	}
}
