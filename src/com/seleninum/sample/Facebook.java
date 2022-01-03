package com.seleninum.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(), 'people in your life')]"));
		String t = text.getText();
		System.out.println(t);
		
		WebElement username = driver.findElement(By.id("email"));
		String c = username.getAttribute("placeholder");
		System.out.println(c);
		username.sendKeys("java@gmail.com");
		String d = username.getAttribute("value");
		System.out.println(d);
		boolean a = username.isDisplayed();
		System.out.println(a);
		
		WebElement password = driver.findElement(By.id("pass"));
		String e = password.getAttribute("placeholder");
		System.out.println(e);
		password.sendKeys("Java123");
		String f = password.getAttribute("value");
		System.out.println(f);
		boolean b = password.isEnabled();
		System.out.println(b);
		
		//WebElement lo = driver.findElement(By.name("login"));
		//lo.click();

		Thread.sleep(4000);
		
		WebElement word = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		word.click();
		
		WebElement acc = driver.findElement(By.xpath("//h2[text()='Find Your Account']"));
		String text2 = acc.getText();
		System.out.println(text2);
		
		WebElement tet = driver.findElement(By.xpath("//div[contains(text(),'your account')]"));
		String text3 = tet.getText();
		System.out.println(text3);
		
		WebElement email = driver.findElement(By.id("identify_email"));
		email.sendKeys("9873567991");
		String pnum = email.getAttribute("value");
		System.out.println(pnum);
		
		WebElement sub = driver.findElement(By.id("did_submit"));
		sub.click();
		
		WebElement close = driver.findElement(By.xpath("//button[contains(@class,'textPadding')]"));
		close.click();

		
	}

}
