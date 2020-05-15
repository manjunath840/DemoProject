package Practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Print_options_sorted 
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
		
		
		// to create arraylist object
		  ArrayList<String> alltext=new ArrayList<>();
		
		//to get address of all the options; alloptions
		List<WebElement> alloptions = sel.getOptions();
		
		//take the all address and store in alltext
		for(WebElement option :alloptions)
		{
			String text = option.getText();
			alltext.add(text);
		}
		
		// to sort
		Collections.sort(alltext);
		
		// to print 
		for(String text :alltext);
		{
			System.out.println(text);
		}
	}

}
