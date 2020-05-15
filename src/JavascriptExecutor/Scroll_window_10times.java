package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_window_10times 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver = new ChromeDriver();	
	driver.get("https://www.seleniumhq.org/download/");
	
	Thread.sleep(2000);
	
	JavascriptExecutor j=(JavascriptExecutor) driver;
	
	//for scroll down
	//code optimisation String scrolldown = "window.scrollBy(0,1000)" 
	//j.executeScript(scrolldown);
	
	for(int i=0;i<=10;i++)
	{
	j.executeScript("window.scrollBy(0,50)"); 
	Thread.sleep(2000);					
	}                                           
	
	
	//for scroll up
	
	for(int k=0;k<=10;k++)   
	{                                               // same as above
	j.executeScript("window.scrollBy(0,-50)");
	Thread.sleep(2000);
	}
	
	driver.close();
	}

}
