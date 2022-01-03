package com.seleninum.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		driver.get("https://letcode.in/radio");
		
		WebElement radio = driver.findElement(By.xpath("(//label[@class ='radio'])[2]"));
		radio.click();
		boolean displayed = radio.isDisplayed();
		System.out.println(displayed);
		boolean enabled = radio.isEnabled();
		System.out.println(enabled);
		boolean selected = radio.isSelected();
		System.out.println(selected);
		
		Thread.sleep(3000);
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		check.click();
		boolean enabled2 = check.isEnabled();
		System.out.println(enabled2);
		boolean displayed2 = check.isDisplayed();
		System.out.println(displayed2);
		boolean selected2 = check.isSelected();
		System.out.println(selected2);
	}
	

	

}
