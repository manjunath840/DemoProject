package gsp.automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
	public static void main(String[] args) throws InterruptedException  
	{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
     FirefoxDriver f= new FirefoxDriver();
  
	
     ChromeDriver c = new ChromeDriver();
     
     Thread.sleep(1000);
     c.close();
     f.close();
    
	}

}
