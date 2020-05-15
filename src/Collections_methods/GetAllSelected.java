package Collections_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/DROP%20DOWN%20OPTIONS.html");
		
		WebElement hotel = driver.findElement(By.id("empire"));
		Select sel = new Select(hotel);
		
		// to select the options
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		
		
		// to get the address of all selected options
		List<WebElement> allOptions = sel.getAllSelectedOptions();		
		
		// to count number of selected options
		int count = allOptions.size();
		System.out.println(count);
		
		
		//to print all options 
		for(int i=0; i<count; i++)
		{
			allOptions
		}
		
		

	}

}
