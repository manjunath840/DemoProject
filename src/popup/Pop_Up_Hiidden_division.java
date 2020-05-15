package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_Up_Hiidden_division 

// to select the  calendar date in clear trip
{
static
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='March']/../../..//a[text()='12']")).click();
}

}
