package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxe 
{
static
{
	System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
}


	public static void main(String[] args) 
	{
		 WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/Checkboxes.html");
		
		List<WebElement> alladd = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//to get address of all check
		 int s = alladd.size();
		 System.out.println(s);

	}

}
