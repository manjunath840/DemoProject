package count_table_without_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_allcells_table 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
		{
			 ChromeDriver driver = new ChromeDriver();
			 driver.manage().window().maximize(); 
			 driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/two_table.html");

			 WebElement element = driver.findElement(By.id("t2"));
			  
			  //to count number of cells in table 2 
			List<WebElement> allcells = element.findElements(By.tagName("td"));
			int count = allcells.size();
			System.out.println("count");
			
			 
			  
	}

}
