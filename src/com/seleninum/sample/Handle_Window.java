package com.seleninum.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Window {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mob).perform();
		
		//String s = driver.getWindowHandle();
		//System.out.println(a);
		
		
		
	}

}
