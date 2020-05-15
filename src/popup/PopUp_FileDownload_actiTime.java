package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_FileDownload_actiTime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(6000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		//click on reports
		driver.findElement(By.xpath("//div[.='REPORTS']")).click();
		Thread.sleep(2000);
		
		// to click on staff performence
		driver.findElement(By.xpath("//div[.='Staff Performance']")).click();
		Thread.sleep(2000);
		
		//click on export to csv
		driver.findElement(By.xpath("//div[.='Staff Performance Report']/../../..//td[contains(text(),'Export to CSV')]")).click();
		Thread.sleep(2000);
		
		//to download a report
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
