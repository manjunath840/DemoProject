package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_FileDownload_robotclass
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		
		//click on download button
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
		Robot r = new Robot();
		
		//to press alt+S
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_O);
		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(2000);
		
		//r.keyRelease(KeyEvent.VK_ALT);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
				

	}

}
