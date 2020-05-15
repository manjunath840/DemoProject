package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChecK_sorted_not 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/DROP%20DOWN%20OPTIONS.html");
		
		WebElement hotel = driver.findElement(By.id("empire"));
		
	    Select sel= new Select(hotel);
	    
	    ArrayList<String> alltext = new ArrayList<>();
	    
	    //to get address of all options
	    List<WebElement> alloptions = sel.getOptions();
	    for(WebElement option:alloptions)
	    {
	    	String text = option.getText();
	    	alltext.add(text);
	    }
		
	    ArrayList <String> alltextcopy = new ArrayList<>(alltext);
	    
	    //sort alltextcopy
	    Collections.sort(alltextcopy);
	    
	    //comapre alltext and alltextcopy
	    if(alltext.equals(alltextcopy))
	    {
	    	System.out.println("sorted");
	    }
	    else
	    {
	    	System.out.println("not sorted");
	    }
	}

}
