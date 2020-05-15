package Practice;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshots 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot t= (TakesScreenshot)driver;
		
		// to create source FILE
	     File src = t.getScreenshotAs(OutputType.FILE);
	     
	     // to create destintion FILE
	    File dest = new File("./Screenshots/se.png");
	    
	    // to move from src to dest
	    FileUtils.copyFile(src, dest);
	    
	    Thread.sleep(1000);
		driver.close();
	}
	

}
