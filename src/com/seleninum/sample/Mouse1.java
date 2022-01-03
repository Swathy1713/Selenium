package com.seleninum.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		WebElement mte = driver.findElement(By.className("menulink"));
		a.moveToElement(mte).build().perform();
		//a.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		
		Thread.sleep(3000);
		
		WebElement cli = driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']"));
		cli.click();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		//a.dragAndDrop(drag, drop).perform();
		a.clickAndHold(drag).moveToElement(drop).release().perform();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		
		WebElement click = driver.findElement(By.cssSelector("body > div > section > div > div > div > p > span"));
		a.contextClick(click).build().perform();
		
		
		
		
	}

}
