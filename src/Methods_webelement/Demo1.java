package Methods_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
	static
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		  ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.get("https://demo.actitime.com/login.do");
		 
		WebElement un= driver.findElement(By.id("username"));
		WebElement cb= driver.findElement(By.name("remember"));
		
	
		if(un.isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("not displayed");
		}
		
		
		cb.click();
	
		if (cb.isSelected())
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
		if( un.isEnabled())
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("is disabled");
		}
		
	}

}
