package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class options_select_deselect_reverse
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/DROP%20DOWN%20OPTIONS.html");
		
		WebElement hotel = driver.findElement(By.id("empire"));
		
		Select sel = new Select(hotel);
		
		ArrayList<String>  alltext = new ArrayList<>();
		
		
		// to get address of all options
		List<WebElement> alloptions = sel.getOptions();
		
		// to get all options and store it in alltext
		for(WebElement option: alloptions)
		{
			String text = option.getText();
			alltext.add(text);
		}
		
		//to sort
		Collections.reverse(alltext);
		
		//to print
		for(String text:alltext)
		{
			System.out.println(text);
		}
		
	}

}
