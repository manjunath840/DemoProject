package Collections_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chequeboxes 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/Checkboxes.html");
		
		 List<WebElement> alladd = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//to get count of check
		 int count= alladd.size();
		 System.out.println(count);
		 		 
	
		//to select the box
		 for(int i=0; i<count; i++)
		 {
		WebElement p = alladd.get(i);
		 p.click();
		 Thread.sleep(500);
		 
		 }
		 
		 

	}

}
