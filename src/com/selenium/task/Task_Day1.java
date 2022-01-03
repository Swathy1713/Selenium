package com.selenium.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Day1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.youtube.com/");
		
		String t1= driver.getTitle();
		System.out.println(t1);
		
		String u1 = driver.getCurrentUrl();
		System.out.println(u1);
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().to("https://twitter.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		String t2 = driver.getTitle();
		System.out.println(t2);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
				
		
		
	}

}
