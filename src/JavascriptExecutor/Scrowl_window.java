package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrowl_window
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
	String scrolldown = "window.scrollBy(0,1000)";
	j.executeScript(scrolldown);
	
	Thread.sleep(2000);
	
	//for scroll up
	String scrollup = "window.scrollBy(0,-1000)";
	j.executeScript(scrollup);
	
	Thread.sleep(2000);
	driver.close();
	}

}
