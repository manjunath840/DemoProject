package gsp.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException
		{		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MANJUNATH%20M%20R/Desktop/Demo%20pages/Demo03.html");
		
		WebElement fname= driver.findElement(By.id("fn"));
		WebElement Lname=driver.findElement(By.id("ln"));
		WebElement submit=driver.findElement(By.id("s"));
		
		fname.sendKeys("Manjunath");
		Thread.sleep(1000);
		
		Lname.sendKeys("Manjunath");
		Thread.sleep(1000);
		
		submit.click();
		
			
}
		
	
		

	

}
