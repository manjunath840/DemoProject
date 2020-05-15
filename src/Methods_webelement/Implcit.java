package Methods_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implcit {

	public static void main(String[] args)
	{
		static
		{
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] arg
		{
			  ChromeDriver driver = new ChromeDriver();
			 driver.manage().window().maximize(); 
			 driver.get("https://demo.actitime.com/login.do");
			 
			WebElement un= driver.findElement(By.id("username"));
			WebElement cb= driver.findElement(By.name("remember"));
	

	}

}
