package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_JavaScript
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf");
		 Thread.sleep(1000);
		 
		 //address of login button
		 driver.findElement(By.id("loginbutton")).click();
		 Thread.sleep(2000);
		 
		 //statement
		 Alert a = driver.switchTo().alert();
		 
		 //to get text
		 String text = a.getText();
		 System.out.println(text);
		 
		 // to click on OK
		 a.accept();
		 
		 Thread.sleep(1000);
		 driver.close();
			
	}

}
