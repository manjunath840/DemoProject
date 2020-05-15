package popup;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_hidden_division02 
{
	
	// to select system  current date from the calendar
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
	Date date= new Date();
	SimpleDateFormat s1= new SimpleDateFormat("d");
	String day= s1.format(date);
	
	SimpleDateFormat s2= new SimpleDateFormat("MMMM");
	String month= s2.format(date);
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='"+month+"']/../../..//a[text()='"+day+"']")).click();
	}
	
}
