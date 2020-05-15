package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_prompt_popUp 
{
 public static void main(String[] args) throws InterruptedException 
 {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/sample_popup_Javascript.html");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("c")).click();
		 Thread.sleep(1000);
		 
		 Alert a = driver.switchTo().alert();
		 
		 // to get the text
		 String text = a.getText();
		 System.out.println(text);
		 Thread.sleep(1000);
		 
		 //to click on cancel button
		 a.dismiss();
		 Thread.sleep(1000);
		 
		 
		// prompt popup
		 driver.findElement(By.id("p")).click();
		 Thread.sleep(1000);
		 
		 //to enter the text
		 a.sendKeys("Manjunath");
		 Thread.sleep(1000);
		 
		 //to click on ok
		// a.accept();
		 Thread.sleep(1000);
		 
		// driver.close();
		 
	
}
}
