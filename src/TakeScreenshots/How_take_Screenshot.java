package TakeScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_take_Screenshot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://demo.actitime.com/login.do");
	 
	 
		
	 // To create reference for take screenshot interface
	 TakesScreenshot t= (TakesScreenshot)driver;
	 
	 // to take  a screenshot
	 File src = t.getScreenshotAs(OutputType.FILE);
	 System.out.println(src);
	 
	//to create destination
	File dest = new File ("./Screenshots/s1.png");
	
	Thread.sleep(2000);
	
	//to copy files from source to destination
	FileUtils.copyFile(src, dest);
	
	Thread.sleep(1000);
	driver.close();
	
	}

}
