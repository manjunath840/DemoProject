package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_verify_PopUp 
{
static
{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
{
	
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/sample_popup_Javascript.html");
	 Thread.sleep(1000);
	 
	 driver.findElement(By.id("p")).click();
	 
	 
	 

}
}
