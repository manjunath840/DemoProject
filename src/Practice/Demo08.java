package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo08 
{
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
}


	public static void main(String[] args) throws InterruptedException 
	{
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.lumosity.com/login");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("user_login")).sendKeys("mr.manjunath840@gmail.com");
	 Thread.sleep(1000);
	 
	 driver.findElement(By.id("user_password")).sendKeys("manjunath402");
	 Thread.sleep(1000);
	 			 
	 driver.findElement(By.name("commit")).click();
	}

}
