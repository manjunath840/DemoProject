package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(1000);
		 
		 WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		 
		 //create a object for actions class
		 Actions a = new Actions(driver);
		 
		 //to perform composite action
		 a.sendKeys(Keys.CONTROL).click(link).build().perform();
		 


	}

}
