package com.selenium.task;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_Fb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		WebElement create = driver
				.findElement(By.xpath("//a[contains(@class, '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]"));
		create.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Swathy");

		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Eswaran");

		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("narmadhaswathy@gmail.com");

		driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"))
				.sendKeys("narmadhaswathy@gmail.com");

		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Swathy@123");

		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByValue("17");

		WebElement mon = driver.findElement(By.id("month"));
		Select s1 = new Select(mon);
		s1.selectByIndex(10);
		List<WebElement> o = s1.getOptions();
		int size = o.size();
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			System.out.println(o.get(i).getText());

		}
		
		System.out.println("********************************************");

		for (WebElement w : o) {
			String a = w.getText();
			if (a.equals("Jan") || a.equals("Dec")) {
			System.out.println(a);
			}

		}
		System.out.println("********************************************");
		
		for (WebElement web : o) {
			String b = web.getText();
			if (b.equals("Nov")) {
				System.out.println("My Birth Month is " +b);
				
			}
			
		}

		WebElement yr = driver.findElement(By.id("year"));
		Select s2 = new Select(yr);
		s2.selectByVisibleText("1998");

		driver.findElement(By.xpath("//label[contains(@class,'_58mt')]")).click();

		// driver.findElement(By.xpath("//button[contains(@class,'_6j mvm _6wk _6wl
		// _58mi _3ma _6o _6v')]")).click();

	}

}
