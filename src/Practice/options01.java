package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class options01 
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
	    
	    sel.selectByIndex(3);
	    Thread.sleep(1000);
	   
	    sel.selectByIndex(2);
	    Thread.sleep(1000);
	    
	    sel.selectByIndex(1);
	    Thread.sleep(1000);
	    
	    
	     WebElement firstoptions = sel.getFirstSelectedOption();
	    String text = firstoptions.getText();
		System.out.println(text);
		

		Thread.sleep(1000);
		driver.close();
	}
	

}
