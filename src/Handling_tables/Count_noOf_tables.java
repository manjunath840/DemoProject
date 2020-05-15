package Handling_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_noOf_tables
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/two_table.html");		
		
		//To get the address of all the tables
		List<WebElement> address = driver.findElements(By.xpath("//table"));
       int count= address.size();
       System.out.println(count);
       
       
      
	}

}
