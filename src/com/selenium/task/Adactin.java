package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Swathy123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Swathy@9894048759");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(4);
		System.out.println(s.getFirstSelectedOption().getText());
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		System.out.println(s1.getFirstSelectedOption().getText());
		
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Deluxe");
		
		WebElement number = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(number);
		s3.selectByValue("3");
		
		WebElement pickup = driver.findElement(By.id("datepick_in"));
		pickup.clear();
		pickup.sendKeys("28/12/2021");
		
		WebElement pickout = driver.findElement(By.id("datepick_out"));
		pickout.clear();
		pickout.sendKeys("05/01/2022");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adult);
		s4.selectByValue("4");
		
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
		
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
		WebElement fname = driver.findElement(By.id("first_name"));
		fname.sendKeys("Swathy");
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("Eswaran");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Coimbatore");
		
		WebElement card = driver.findElement(By.id("cc_num"));
		card.sendKeys("1111111111222222");
		
		WebElement ctype = driver.findElement(By.id("cc_type"));
		Select s5 = new Select(ctype);
		s5.selectByVisibleText("American Express");
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(month);
		s6.selectByIndex(10);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(year);
		s7.selectByValue("2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		
		//WebElement book = driver.findElement(By.id("book_now"));
		//book.click();
		
		Thread.sleep(7000);
		
		
	}

}
