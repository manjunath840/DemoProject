package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_all_options
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/DROP%20DOWN%20OPTIONS.html");
		
		WebElement hotel = driver.findElement(By.id("empire"));
		
	    Select sel= new Select(hotel);
	    
	  List<WebElement> options = sel.getOptions();
	 int count = options.size();
	 System.out.println(count);
	 
	 for(WebElement option :options)
	 {
		 String text = option.getText();
		 System.out.println(text);
	 }
	 Thread.sleep(1000);
     driver.close();
	}

}
