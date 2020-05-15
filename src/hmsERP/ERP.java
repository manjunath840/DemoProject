package hmsERP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ERP
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://unicarestageerp.lifetrenz.com/#/dashboard");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("stageerp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Login']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@style='color: #ffffff;']")).click();
        Thread.sleep(2000);

driver.close();

	}

}
