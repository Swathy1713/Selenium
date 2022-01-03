package com.seleninum.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.get("https://letcode.in/dropdowns");

		WebElement fruit = driver.findElement(By.id("fruits"));
		Select s = new Select(fruit);
		s.selectByVisibleText("Orange");
		List<WebElement> options = s.getOptions();
		for (WebElement ab : options) {
			System.out.println(ab.getText());
		}
		
		WebElement country = driver.findElement(By.id("country"));
		Select s1 = new Select(country);
		s1.selectByValue("India");
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		WebElement hero = driver.findElement(By.id("superheros"));
		Select s2 = new Select(hero);
		boolean multiple = s2.isMultiple();
		System.out.println(multiple);
		s2.selectByIndex(0);
		s2.selectByIndex(3);
		s2.selectByIndex(5);
		s2.selectByIndex(7);
		s2.selectByIndex(10);
		List<WebElement> all = s2.getAllSelectedOptions();
		for (WebElement al : all) {
			System.out.println(al.getText());		}
	}

}
