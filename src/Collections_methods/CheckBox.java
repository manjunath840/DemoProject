package Collections_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/Checkboxes.html");
		List<WebElement> a = driver.findElements(By.tagName("input"));
		
		int count = a.size();
		System.out.println(count);
		
		for(int i=count-1;i>0;i--)
		{
			WebElement fcb = a.get(i);
			fcb.click();
			Thread.sleep(1000);
		}
		
		Thread.sleep(1000);
		driver.close();
	}

}
