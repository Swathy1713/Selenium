package com.seleninum.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		String dr = driver.getTitle();
		System.out.println(dr);
		
		String d = driver.getCurrentUrl();
		System.out.println(d);
		
		
		
		//driver.close();
		
		
		
		
		
		
			}

}
