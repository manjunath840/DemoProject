package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		
		//to count number of links
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		int count = alllinks.size();
		System.out.println(count);
		
	
		int t;
		//to print the links
		for(t=0; t<count; t++);
		{
		 WebElement links = alllinks.get(t);
			String text = links.getText();
			System.out.println(text);
			
			driver.close();
		}
		
	}

}
