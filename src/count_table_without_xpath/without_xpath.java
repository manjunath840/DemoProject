package count_table_without_xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_xpath
{
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize(); 
		 driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/two_table.html");
		 
		 
		 WebElement element = driver.findElement(By.id("t2"));
		 
		 // to get number of rows present in table1
		 List<WebElement> allrows = element.findElements(By.tagName("td"));
		 int count= allrows.size();
		 System.out.println(count);
		 
		 Thread.sleep(2000);
		 driver.close();
	}

}
