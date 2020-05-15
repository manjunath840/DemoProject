import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Print 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");	
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		//to count number of links
		int count= alllinks.size();
		System.out.println(count);
 
		//to print all links
		for(int i=0; i<count; i++)
		{
	          WebElement link = alllinks.get(i);
		String text= link.getText();
		System.out.println(text);
		}
    	Thread.sleep(2000);
	    driver.close();
	
}
}
