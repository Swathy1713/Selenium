package com.selenium.task;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Project1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("Title : " +title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().window().maximize();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("Swa1713@gmail.com");
		String email1 = email.getAttribute("value");
		System.out.println("Email Id : " +email1);
		
		driver.findElement(By.name("SubmitCreate")).click();
		
		Thread.sleep(4000);
		
		WebElement text1 = driver.findElement(By.xpath("//h1[text()='Create an account']"));
		String t1 = text1.getText();
		System.out.println(t1);
		
		WebElement text2 = driver.findElement(By.xpath("//h3[contains(text(),'Your personal information')]"));
		String t2 = text2.getText();
		System.out.println(t2);
		
		
		WebElement gender = driver.findElement(By.id("id_gender2"));
		gender.click();
		boolean selected = gender.isSelected();
		System.out.println("Is Gender Selected : " +selected);
		String gen = gender.getAttribute("value");
		System.out.println("Title : " +gen);
		
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		fname.sendKeys("Swathy");
		String finame = fname.getAttribute("value");
		System.out.println("First Name : " +finame);
		
		WebElement lname = driver.findElement(By.xpath("//input[@name='customer_lastname']"));
		lname.sendKeys("Eswaran");
		String laname = lname.getAttribute("value");
		System.out.println("Last Name : " +laname);
		
		WebElement pass = driver.findElement(By.xpath("(//input[@class= 'is_required validate form-control'])[4]"));
		pass.sendKeys("Swa123");
		String passwrd = pass.getAttribute("value");
		System.out.println("Password : " +passwrd );
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("17");
		String date = day.getAttribute("value");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByIndex(11);
		String mon = month.getAttribute("value");
		
		WebElement year = driver.findElement(By.id("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1998");
		String yr = year.getAttribute("value");
		System.out.println("Date of Bith: " +date+ " " +mon+ " " +yr);
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Cognizant");
		String com = company.getAttribute("value");
		System.out.println(com);
		
		WebElement add1 = driver.findElement(By.name("address1"));
		add1.sendKeys("24 Jyothi Nagar");
		String addr1 = add1.getAttribute("value");
		System.out.println("Address " +addr1);
		
		WebElement add2 = driver.findElement(By.name("address2"));
		add2.sendKeys("2nd Street Podhanur");
		String addr2 = add2.getAttribute("value");
		System.out.println("Address 2 " +addr2);
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Coimbatore");
		String ci = city.getAttribute("value");
		System.out.println("City  " +ci);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByVisibleText("Alabama");
		String st = state.getAttribute("value");
		System.out.println("State " +st);
		
		WebElement code = driver.findElement(By.xpath("//input[contains(@class, 'form-control uniform-input text')]"));
		code.sendKeys("12345");
		String zip = code.getAttribute("value");
		System.out.println("Zip/Postal Code " +zip);
		
        WebElement ph = driver.findElement(By.name("phone_mobile"));
        ph.sendKeys("9894048759");
        String num = ph.getAttribute("value");
        System.out.println("Phone Number " +num);
        
        WebElement ab = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input"));
        ab.sendKeys("Coimbatore");
		
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		
		Thread.sleep(4000);
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		File a = sc.getScreenshotAs(OutputType.FILE);
		File b = new File ("C:\\Users\\admin\\eclipse-workspace\\Selenium_October\\Screenshot\\demo1.png");
		FileUtils.copyFile(a, b);
		
		
		
		
		
	}

}
