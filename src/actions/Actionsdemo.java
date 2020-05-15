package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo 
{
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 ChromeDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://demo.actitime.com/login.do");
			 Thread.sleep(1000);
			 
			 WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
			 
			 //create a object for actions class
			 Actions a = new Actions(driver);
			 
			 //to right click
			 a.contextClick(link).perform();
			 
			 //to select the context options
			 Robot r = new Robot();
			 
			 r.keyPress(KeyEvent.VK_W);
			 r.keyRelease(KeyEvent.VK_W);
			 			 
		
	}

}
