package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class To_Select_all_options
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
	Select sel=new Select(hotel);
	
	
	//to get address of all the options
	List<WebElement> alloptions = sel.getOptions();
	
	//to count options
	int count = alloptions.size();
	System.out.println(count);
	
	
	//to print the all options
	for(int i=0; i<count; i++)
	{
	       sel.selectByIndex(i);
	      Thread.sleep(1000);
	}

}
}