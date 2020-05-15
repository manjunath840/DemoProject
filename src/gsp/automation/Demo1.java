package gsp.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo1 
{
	static
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
}

	public static void main(String[] args) 
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username"));

	}

}
