package com.selenium.task;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_Task {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_7b63n4zle7_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294135909733&hvpos=&hvnetw=g&hvrand=17138559543509007115&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-298479560553&hydadcr=5840_1738694&gclid=Cj0KCQiA-K2MBhC-ARIsAMtLKRuKkFfEKFtpAT0Npjtbl9hGI5nLbVJ0FZvqkBg3ivP1htPOveiiDKwaAqLtEALw_wcB");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smart watch for women latest brand");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@class='_bXVsd_image_1pfbQ'])[3]")).click();
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File a = sc.getScreenshotAs(OutputType.FILE);
		File b = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium_October\\Screenshot\\amazon.png");
		FileHandler.copy(a, b);
		
		
		
	}

}
