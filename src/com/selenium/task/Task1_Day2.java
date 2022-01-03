package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Day2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		String a = fname.getAttribute("placeholder");
		System.out.println(a);
		fname.sendKeys("Swathy");
		String b = fname.getAttribute("value");
		System.out.println(b);
		boolean enabled = fname.isEnabled();
		System.out.println(enabled);
		
		WebElement lname = driver.findElement(By.id("lastName"));
		String c = lname.getAttribute("placeholder");
		System.out.println(c);
		lname.sendKeys("Eswaran");
		String d = lname.getAttribute("value");
		System.out.println(d);
		boolean displayed = lname.isDisplayed();
		System.out.println(displayed);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		String e = email.getAttribute("placeholder");
		System.out.println(e);
		email.sendKeys("Swathy@gmail.com");
		String f = email.getAttribute("value");
		System.out.println(f);
		
		
		
		
		
		
		//driver.close();
		
		
		
	}

}
