package handling_AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions_google 
{	
	static 
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
}
	public static void main(String[] args)

	
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("qspiders");
	
	
	List<WebElement> allsuggestions= driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
	
	int count = allsuggestions.size();
	System.out.println(count);
	
	for (int i = 0; i < count ; i++)
	{
		WebElement suggestion = allsuggestions.get(i);
		String text = suggestion.getText();
		
		System.out.println(text);
		
		
		
	}
	allsuggestions.get(count-1).click();
	
	
	}

}
