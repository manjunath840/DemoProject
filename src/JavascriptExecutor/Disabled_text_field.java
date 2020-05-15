package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_text_field 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver = new ChromeDriver();	
	driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/Disabled_TextField.html");
	
	Thread.sleep(2000);
	
	JavascriptExecutor p=(JavascriptExecutor) driver;
	
	// to enter the text
	String enterText = "document.getElementById('n').value='Manjunath'";
	p.executeScript(enterText);
	
	Thread.sleep(2000);
	
	// to clear the text
	String clearText = "document.getElementById('n').value=''";
	p.executeScript(clearText);
	
	Thread.sleep(2000);
	
	// to click on link
	String click = "document.getElementById('fb').click()";
	p.executeScript(click);
	Thread.sleep(1000);
	driver.close();
	

	}

}
