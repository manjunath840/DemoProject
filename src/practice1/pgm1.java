package practice1;

	import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	

	public class pgm1
	{
		static
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://www.facebook.com");
			WebElement id1 = driver.findElement(By.xpath("//input[@name='sex']"));
			
			
			id1.click();
			if(id1.isSelected())
			{
				System.out.println("id1 is selected");
			}
			else
			{
				System.out.println("id1 is not selected");
			}
			
			
		}
		
	}



