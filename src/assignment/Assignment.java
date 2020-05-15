package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		 driver.get("https://accounts.google.com/signin");
		 driver.manage().window().maximize();
		 
		 
		 //for username
		 driver.findElement(By.id("identifierId")).sendKeys("mrmanjunatha09@gmail.com");
		 Thread.sleep(1000);
		 
		 // to click on next
		 driver.findElement(By.xpath("//content[.='Next']")).click();
		 Thread.sleep(2000);
		
		 
		 //to enter the password
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MR@20295");
		 
		// driver.findElement(By.name("password")).sendKeys("MR@20295");
		 
		 // to click on next
		// driver.findElement(By.tagName("input[type='password']")).sendKeys("MR@20295");
		 
		 //
		 driver.findElement(By.xpath("//content[.='Next']")).click();
		 
		 
		 
	}
	

}
