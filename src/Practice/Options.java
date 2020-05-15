package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Options
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
	    
	    sel.selectByIndex(0);
	    sel.selectByIndex(1);
	    sel.selectByIndex(2);
	    
	    List<WebElement> alloptions = sel.getAllSelectedOptions();	  
	    int count = alloptions.size();
	    System.out.println(count);
	    
	    
	    for(int i=0; i<count; i++)
	    {
	    WebElement option = alloptions.get(i);
	    String text = option.getText();
	    System.out.println(text);
	    }
	    
	    Thread.sleep(1000);
	    driver.close();
	}

}
