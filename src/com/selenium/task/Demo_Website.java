package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Website {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Swathy");
		driver.findElement(By.id("lastName")).sendKeys("Eswaran");
		driver.findElement(By.id("userEmail")).sendKeys("Swa@123");
		//driver.findElement(By.xpath("//*[@id=\"gender-radio-2\"]")).getText();
		driver.findElement(By.id("userNumber")).sendKeys("9894048759");
		WebElement dob = driver.findElement(By.id("dateOfBirthInput"));
		dob.clear();
		dob.sendKeys("17 Nov 1998");
		driver.findElement(By.cssSelector("#subjectsContainer > div > div.subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3"))
		.sendKeys("English");
	
	}

}
