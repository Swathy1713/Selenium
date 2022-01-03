package com.seleninum.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Web {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//to get entire table
		WebElement t = driver.findElement(By.tagName("tbody"));
		System.out.println(t.getText());
		System.out.println("************");
		
		//get the table heading alone
		WebElement t1 = driver.findElement(By.tagName("tr"));
		System.out.println(t1.getText());
		System.out.println("************");
		
		//get the entire table using for loop
		List<WebElement> tele = driver.findElements(By.tagName("tr"));
		int s = tele.size();
		System.out.println(s);
		for (int i = 0; i < s; i++) {
			System.out.println(tele.get(i).getText());
			}
		System.out.println("************");
		
		//to print only the table count with even number
		List<WebElement> tel = driver.findElements(By.tagName("tr"));
		int s1 = tel.size();
		System.out.println(s1);
		for (int i = 0; i <s1; i++) {
			if (i%2==0) {
				System.out.println(tel.get(i).getText());	
			}		
		}	
		System.out.println("************");
		
		List<WebElement> te = driver.findElements(By.tagName("tr"));
		int b = te.size();
		System.out.println(b);
		for (int i = 0; i < b; i++) {
			if(i==1) {
				List<WebElement> tee = driver.findElements(By.tagName("td"));
			    int a = tee.size();
			    for (int j = 0; j < 16; j++) {
					System.out.println(tee.get(j).getText());
				}
			}
			
		}
		
		System.out.println("************");
		List<WebElement> find = driver.findElements(By.tagName("tr"));
		int si = find.size();
		System.out.println(si);
		//System.out.println("************");
		for (int i = 0; i < si; i++) {
			if (find.get(i).getText().contains("JAVA")) {
				System.out.println(find.get(i).getText());
			}
		}			
	}

}
